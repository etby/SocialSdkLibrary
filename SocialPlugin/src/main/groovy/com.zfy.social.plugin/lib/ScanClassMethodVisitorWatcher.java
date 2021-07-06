package com.zfy.social.plugin.lib;

import org.objectweb.asm.MethodVisitor;

/**
 * CreateAt : 2020-01-21
 * Describe : 处理方法
 *
 * @author chendong
 */
public interface ScanClassMethodVisitorWatcher {
    MethodVisitor watch(MethodVisitor visitor, AbstractClassVisitor.ClassInfo classInfo, AbstractClassVisitor.MethodInfo methodInfo);
}
