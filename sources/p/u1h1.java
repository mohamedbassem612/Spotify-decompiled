package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u1h1 extends k9 {
    public static final Class c;
    public static final Constructor d;
    public static final Method e;
    public static final Method f;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        d = constructor;
        c = cls;
        e = method2;
        f = method;
    }

    public u1h1() {
        super((byte) 19);
    }

    public static boolean v1(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) e.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface w1(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) c, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean x1() {
        return e != null;
    }

    @Override // p.k9
    public final Typeface D0(Context context, w930 w930Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (x930 x930Var : w930Var.a) {
                int i2 = x930Var.f;
                File fileW = jhc1.w(context);
                if (fileW != null) {
                    try {
                        if (jhc1.n(fileW, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileW);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileW.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileW.delete();
                        }
                        if (map != null && v1(objNewInstance, map, x930Var.e, x930Var.b, x930Var.c)) {
                        }
                    } catch (Throwable th3) {
                        fileW.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return w1(objNewInstance);
        }
        return null;
    }

    @Override // p.k9
    public final Typeface E0(Context context, oa30[] oa30VarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            jv81 jv81Var = new jv81(0);
            for (oa30 oa30Var : oa30VarArr) {
                Uri uri = oa30Var.a;
                ByteBuffer byteBufferB = (ByteBuffer) jv81Var.get(uri);
                if (byteBufferB == null) {
                    byteBufferB = jhc1.B(context, uri);
                    jv81Var.put(uri, byteBufferB);
                }
                if (byteBufferB != null && v1(objNewInstance, byteBufferB, oa30Var.b, oa30Var.c, oa30Var.d)) {
                }
            }
            Typeface typefaceW1 = w1(objNewInstance);
            if (typefaceW1 != null) {
                return Typeface.create(typefaceW1, i);
            }
        }
        return null;
    }

    @Override // p.k9
    public final Typeface I0(Context context, Typeface typeface, int i, boolean z) {
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
