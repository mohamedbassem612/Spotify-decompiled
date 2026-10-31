package p;

import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class j7a0 {
    public static final boolean a;
    public static final Method b;
    public static final Method c;
    public static final Object d;
    public static final Object e;

    static {
        boolean z = false;
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            Class<?> clsLoadClass = contextClassLoader.loadClass("java.nio.file.Files");
            Class<?> clsLoadClass2 = contextClassLoader.loadClass("java.nio.file.Path");
            Class<?> clsLoadClass3 = contextClassLoader.loadClass("java.nio.file.attribute.FileAttribute");
            Class<?> clsLoadClass4 = contextClassLoader.loadClass("java.nio.file.LinkOption");
            b = clsLoadClass.getMethod("isSymbolicLink", clsLoadClass2);
            clsLoadClass.getMethod("delete", clsLoadClass2);
            clsLoadClass.getMethod("readSymbolicLink", clsLoadClass2);
            Object objNewInstance = Array.newInstance(clsLoadClass3, 0);
            e = objNewInstance;
            clsLoadClass.getMethod("createSymbolicLink", clsLoadClass2, clsLoadClass2, objNewInstance.getClass());
            Object objNewInstance2 = Array.newInstance(clsLoadClass4, 0);
            d = objNewInstance2;
            clsLoadClass.getMethod("exists", clsLoadClass2, objNewInstance2.getClass());
            c = File.class.getMethod("toPath", null);
            clsLoadClass2.getMethod("toFile", null);
            z = true;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
        a = z;
    }
}
