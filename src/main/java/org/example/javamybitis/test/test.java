package org.example.javamybitis.test;

import org.example.javamybitis.mapper.goodTextMapper;
import org.example.javamybitis.mapper.textMapper;
import org.example.javamybitis.mapper.userMapper;
import org.example.javamybitis.pojo.goodText;
import org.example.javamybitis.pojo.text;
import org.example.javamybitis.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

@CrossOrigin
@RestController
public class test {
    @Autowired
    private userMapper userMapper;

    @Autowired
    private goodTextMapper goodTextMapper;

    @Autowired
    private textMapper textMapper;

    //查询用户列表
    @RequestMapping("/users")
    public user testListUsers(@RequestBody user user) {
        List<user> userList = userMapper.selectAll();
        for (user users : userList) {
            if (users.getUsername().equals(user.getUsername())) {
                if (users.getPassword().equals(user.getPassword())) {
                    return users;
                }
            }
        }
        return null;
    }

    private text soltText[];
    @RequestMapping("/soltText")
    public text[] soltText() {
        List<text> textList = textMapper.selectAll();
        soltText = textList.toArray(new text[textList.size()]);
        Arrays.sort(soltText,new Comparator<text>() {
                    public int compare(text p1, text p2) {
                        int a = p1.getCount();
                        int b = p2.getCount();
                        return a < b ? -1 : a == b ? 0 : 1; //当a<b返回-1，a==b返回0，a>b返回1
                    }});
        return soltText;
    }

    //查询文章
    private text texts[];
    @RequestMapping("/selectText")
    public text[] testListUsers() {
        List<text> textList = textMapper.selectAll();
        texts = textList.toArray(new text[textList.size()]);
        return texts;
    }

    @RequestMapping("/selectIdText")
    public text selectIdText(@RequestBody text text) {
        List<text> textList = textMapper.selectAll();
        for (text t : textList) {
            if (t.getId() == text.getId()) {
                return t;
            }
        }
        return null;
    }

    public boolean contains(int[] arr,int num){
        for (int i : arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

    private text randomTexts[] = new text[5]; // 确保类名正确

    @RequestMapping("/randomTexts")
    public text[] randomTexts() {
        List<text> textList = textMapper.selectAll();
        int[] arr = new int[5];
        int j1 = 0; // 用于填充 arr
        boolean flag;
        Random numList = new Random();

        for (int i = 0; i < 5; i++) {
            flag = true;
            while (flag) {
                int num = numList.nextInt(textList.size()); // 生成有效的随机索引

                // 检查是否重复
                boolean exists = false;
                for (int j = 0; j < j1; j++) { // 只检查已填充的部分
                    if (arr[j] == num) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    arr[j1] = num; // 将随机索引添加到 arr
                    j1++; // 更新填充的数量
                    flag = false; // 退出循环
                }
            }
        }

        // 填充 randomTexts 数组
        for (int i = 0; i < j1; i++) {
            randomTexts[i] = textList.get(arr[i]);
        }

        return randomTexts;
    }


    @RequestMapping("/text")
    public void insetText(@RequestBody text text) {
        textMapper.insert(text);
    }

    @RequestMapping("/updateText")
    public void updateText(@RequestBody text text) {
        textMapper.update(text);
    }

    @RequestMapping("/enroll")
    public user enroll(@RequestBody user user) {
        List<user> userList = userMapper.selectAll();
        if (userList.size() < 1 && userList != null) {
            userMapper.insert(user);
            return user;
        }else{
            for (user users : userList) {
                if (users.getUsername().equals(user.getUsername())) {
                    return null;
                }
            }
            userMapper.insert(user);
            return user;
        }
    }

    @RequestMapping("/goodText")
    public int goodText(@RequestBody goodText goodtext) {
        List<goodText> goodTexts = goodTextMapper.selectAll();
        for (goodText goodtexts : goodTexts) {
            if(goodtexts.getId()==(goodtexts.getId())){
                if(goodtexts.getTextId() ==(goodtexts.getTextId())){
                    return 1;
                }
            };
        }
        return 0;
    }

    @RequestMapping("/clickGoodText")
    public int clickGoodText(@RequestBody goodText goodtext) {
        System.out.println(goodtext);
        List<goodText> goodTexts = goodTextMapper.selectAll();
        System.out.println(goodTexts);
            if(goodTexts.size() == 0){
                System.out.println("运行空数组");
                goodTextMapper.insertGoodText(goodtext);
                return 1;
            }else{
                for (goodText goodtexts : goodTexts){
                    if (goodtexts.getId() == (goodtext.getId())){
                        if(goodtexts.getTextId() == (goodtext.getTextId())){
                            System.out.printf("文章已找到");
                            goodTextMapper.deleteGoodText(goodtexts);
                            return 0;
                        }
                    }
                }
                System.out.println("运行未找到点赞文章");
                goodTextMapper.insertGoodText(goodtext);
                return 1;
            }
    }
}
