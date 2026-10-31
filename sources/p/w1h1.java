package p;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class w1h1 extends t1h1 {
    public final Method N0;
    public final Method X;
    public final Method Y;
    public final Method Z;
    public final Class h;
    public final Constructor i;
    public final Method t;

    public w1h1() throws NoSuchMethodException {
        Method methodB1;
        Constructor<?> constructor;
        Method methodA1;
        Method method;
        Method method2;
        Method method3;
        super((byte) 19);
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodA1 = A1(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodB1 = B1(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            methodB1 = null;
            constructor = null;
            methodA1 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.h = cls;
        this.i = constructor;
        this.t = methodA1;
        this.X = method;
        this.Y = method2;
        this.Z = method3;
        this.N0 = methodB1;
    }

    public static Method A1(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public Method B1(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p.t1h1, p.k9
    public final Typeface D0(Context context, w930 w930Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        if (this.t == null) {
            return super.D0(context, w930Var, resources, i);
        }
        try {
            objNewInstance = this.i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            x930[] x930VarArr = w930Var.a;
            int length = x930VarArr.length;
            int i2 = 0;
            while (i2 < length) {
                x930 x930Var = x930VarArr[i2];
                String str = x930Var.a;
                int i3 = x930Var.e;
                int i4 = x930Var.b;
                boolean z = x930Var.c;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(x930Var.d);
                w1h1 w1h1Var = this;
                Context context2 = context;
                if (w1h1Var.x1(context2, objNewInstance, str, i3, i4, z ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    i2++;
                    this = w1h1Var;
                    context = context2;
                } else {
                    try {
                        w1h1Var.Z.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            w1h1 w1h1Var2 = this;
            if (w1h1Var2.z1(objNewInstance)) {
                return w1h1Var2.y1(objNewInstance);
            }
        }
        return null;
    }

    @Override // p.t1h1, p.k9
    public final Typeface E0(Context context, oa30[] oa30VarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceY1;
        boolean zBooleanValue;
        if (oa30VarArr.length >= 1) {
            try {
                if (this.t != null) {
                    HashMap map = new HashMap();
                    for (oa30 oa30Var : oa30VarArr) {
                        if (oa30Var.f == 0) {
                            Uri uri = oa30Var.a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, jhc1.B(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.i.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = oa30VarArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method = this.Z;
                            if (i2 >= length) {
                                if (!z) {
                                    method.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!z1(objNewInstance) || (typefaceY1 = y1(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceY1, i);
                            }
                            oa30 oa30Var2 = oa30VarArr[i2];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(oa30Var2.a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.X.invoke(objNewInstance, byteBuffer, Integer.valueOf(oa30Var2.b), null, Integer.valueOf(oa30Var2.c), Integer.valueOf(oa30Var2.d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method.invoke(objNewInstance, null);
                                    break;
                                }
                                z = true;
                            }
                            i2++;
                            z = z;
                        }
                    }
                } else {
                    oa30 oa30VarK0 = k9.K0(oa30VarArr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(oa30VarK0.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(oa30VarK0.c).setItalic(oa30VarK0.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // p.k9
    public final Typeface G0(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        if (this.t == null) {
            return super.G0(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!x1(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.Z.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (z1(objNewInstance)) {
                return y1(objNewInstance);
            }
        }
        return null;
    }

    @Override // p.t1h1, p.k9
    public Typeface I0(Context context, Typeface typeface, int i, boolean z) {
        Typeface typefaceA;
        try {
            typefaceA = fml1.a(typeface, i, z);
        } catch (RuntimeException unused) {
            typefaceA = null;
        }
        return typefaceA == null ? super.I0(context, typeface, i, z) : typefaceA;
    }

    public final boolean x1(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.t.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface y1(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.N0.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean z1(Object obj) {
        try {
            return ((Boolean) this.Y.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
