package com.example.arithmatic_learning.data_structure.tree;

import lombok.Data;

@Data
public class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    public TreeNode(int value) {
        this.value = value;
    }
}
