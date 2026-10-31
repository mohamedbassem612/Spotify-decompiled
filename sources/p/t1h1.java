package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class t1h1 extends k9 {
    public static Class c = null;
    public static Constructor d = null;
    public static Method e = null;
    public static Method f = null;
    public static boolean g = false;

    public t1h1() {
        super((byte) 19);
    }

    public static boolean v1(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        w1();
        try {
            return ((Boolean) e.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            eg.j(e2);
            return false;
        }
    }

    public static void w1() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (g) {
            return;
        }
        g = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        d = constructor;
        c = cls;
        e = method2;
        f = method;
    }

    @Override // p.k9
    public Typeface D0(Context context, w930 w930Var, Resources resources, int i) throws NoSuchMethodException {
        w1();
        try {
            Object objNewInstance = d.newInstance(null);
            for (x930 x930Var : w930Var.a) {
                File fileW = jhc1.w(context);
                if (fileW == null) {
                    return null;
                }
                try {
                    if (!jhc1.n(fileW, resources, x930Var.f)) {
                        return null;
                    }
                    if (!v1(objNewInstance, fileW.getPath(), x930Var.b, x930Var.c)) {
                        return null;
                    }
                    fileW.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileW.delete();
                }
            }
            w1();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) c, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                eg.j(e2);
                return null;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            eg.j(e3);
            return null;
        }
    }

    @Override // p.k9
    public Typeface E0(Context context, oa30[] oa30VarArr, int i) {
        File file;
        Typeface typefaceCreateFromFile;
        if (oa30VarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(k9.K0(oa30VarArr, i).a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile2;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        File fileW = jhc1.w(context);
                        if (fileW == null) {
                            typefaceCreateFromFile = null;
                        } else {
                            try {
                                if (jhc1.o(fileW, fileInputStream)) {
                                    typefaceCreateFromFile = Typeface.createFromFile(fileW.getPath());
                                    fileW.delete();
                                } else {
                                    fileW.delete();
                                    typefaceCreateFromFile = null;
                                }
                            } catch (RuntimeException unused2) {
                            } catch (Throwable th3) {
                                fileW.delete();
                                throw th3;
                            }
                        }
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    } catch (Throwable th4) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }

    @Override // p.k9
    public Typeface I0(Context context, Typeface typeface, int i, boolean z) {
        Typeface typefaceB;
        Typeface typefaceA = null;
        try {
            typefaceB = eml1.b(typeface, i, z);
        } catch (RuntimeException unused) {
            typefaceB = null;
        }
        if (typefaceB != null) {
            return typefaceB;
        }
        try {
            typefaceA = dml1.a(this, context, typeface, i, z);
        } catch (RuntimeException unused2) {
        }
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        return typeface;
    }
}
