package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mhl {
    public boolean a = false;
    public String b;
    public int c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    public mhl(mhl mhlVar, Object obj) {
        this.b = mhlVar.b;
        this.c = mhlVar.c;
        g(obj);
    }

    public static HashMap a(View view, HashMap map) {
        HashMap map2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            mhl mhlVar = (mhl) map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new mhl(mhlVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new mhl(mhlVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return map2;
    }

    public static void e(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), inz0.d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i = 0;
        boolean z = false;
        Object objValueOf = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i4 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i4 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i4 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i3 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i3;
                            }
                        }
                        i = 7;
                    }
                }
                i = i4;
            }
        }
        if (string != null && objValueOf != null) {
            mhl mhlVar = new mhl();
            mhlVar.b = string;
            mhlVar.c = i;
            mhlVar.a = z;
            mhlVar.g(objValueOf);
            map.put(string, mhlVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void f(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String strM : map.keySet()) {
            mhl mhlVar = (mhl) map.get(strM);
            if (!mhlVar.a) {
                strM = l1d.m("set", strM);
            }
            try {
                int iC = l1d.C(mhlVar.c);
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iC) {
                    case 0:
                        cls.getMethod(strM, cls3).invoke(view, Integer.valueOf(mhlVar.d));
                        break;
                    case 1:
                        cls.getMethod(strM, cls2).invoke(view, Float.valueOf(mhlVar.e));
                        break;
                    case 2:
                        cls.getMethod(strM, cls3).invoke(view, Integer.valueOf(mhlVar.h));
                        break;
                    case 3:
                        Method method = cls.getMethod(strM, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(mhlVar.h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(strM, CharSequence.class).invoke(view, mhlVar.f);
                        break;
                    case 5:
                        cls.getMethod(strM, Boolean.TYPE).invoke(view, Boolean.valueOf(mhlVar.g));
                        break;
                    case 6:
                        cls.getMethod(strM, cls2).invoke(view, Float.valueOf(mhlVar.e));
                        break;
                    case 7:
                        cls.getMethod(strM, cls3).invoke(view, Integer.valueOf(mhlVar.d));
                        break;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }

    public final float b() {
        switch (l1d.C(this.c)) {
            case 0:
                return this.d;
            case 1:
            case 6:
                return this.e;
            case 2:
            case 3:
                jah.g("Color does not have a single color to interpolate");
                return 0.0f;
            case 4:
                jah.g("Cannot interpolate String");
                return 0.0f;
            case 5:
                return this.g ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    public final void c(float[] fArr) {
        switch (l1d.C(this.c)) {
            case 0:
                fArr[0] = this.d;
                break;
            case 1:
                fArr[0] = this.e;
                break;
            case 2:
            case 3:
                int i = this.h;
                int i2 = (i >> 24) & 255;
                float fPow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                break;
            case 4:
                jah.g("Color does not have a single color to interpolate");
                break;
            case 5:
                fArr[0] = this.g ? 1.0f : 0.0f;
                break;
            case 6:
                fArr[0] = this.e;
                break;
        }
    }

    public final int d() {
        int iC = l1d.C(this.c);
        return (iC == 2 || iC == 3) ? 4 : 1;
    }

    public final void g(Object obj) {
        switch (l1d.C(this.c)) {
            case 0:
            case 7:
                this.d = ((Integer) obj).intValue();
                break;
            case 1:
                this.e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f = (String) obj;
                break;
            case 5:
                this.g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.e = ((Float) obj).floatValue();
                break;
        }
    }
}
