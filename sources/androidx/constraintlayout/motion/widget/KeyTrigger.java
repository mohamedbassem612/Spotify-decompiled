package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import p.bmq0;
import p.inz0;
import p.l1d;
import p.mhl;
import p.ooa0;
import p.wpa0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class KeyTrigger extends ooa0 {
    public float x;
    public float f = 0.1f;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public RectF j = new RectF();
    public RectF k = new RectF();
    public HashMap l = new HashMap();
    public String m = null;
    public int n = -1;
    public String o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f4p = null;
    public int q = -1;
    public int r = -1;
    public View s = null;
    public boolean t = true;
    public boolean u = true;
    public boolean v = true;
    public float w = Float.NaN;
    public boolean y = false;

    public KeyTrigger() {
        this.d = (byte) 5;
        this.e = new HashMap();
    }

    public static void i(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // p.ooa0
    public final void a(HashMap map) {
        throw null;
    }

    @Override // p.ooa0
    /* JADX INFO: renamed from: b */
    public final ooa0 clone() {
        KeyTrigger keyTrigger = new KeyTrigger();
        super.c(this);
        keyTrigger.m = this.m;
        keyTrigger.n = this.n;
        keyTrigger.o = this.o;
        keyTrigger.f4p = this.f4p;
        keyTrigger.q = this.q;
        keyTrigger.r = this.r;
        keyTrigger.s = this.s;
        keyTrigger.f = this.f;
        keyTrigger.t = this.t;
        keyTrigger.u = this.u;
        keyTrigger.v = this.v;
        keyTrigger.w = this.w;
        keyTrigger.x = this.x;
        keyTrigger.y = this.y;
        keyTrigger.j = this.j;
        keyTrigger.k = this.k;
        keyTrigger.l = this.l;
        return keyTrigger;
    }

    @Override // p.ooa0
    public final void d(HashSet hashSet) {
    }

    @Override // p.ooa0
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, inz0.i);
        SparseIntArray sparseIntArray = wpa0.a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = wpa0.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.o = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f4p = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.m = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 6:
                    this.q = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
                    break;
                case 7:
                    if (MotionLayout.X1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                    }
                    break;
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.a);
                    this.a = integer;
                    this.w = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.r = typedArrayObtainStyledAttributes.getResourceId(index, this.r);
                    break;
                case 10:
                    this.y = typedArrayObtainStyledAttributes.getBoolean(index, this.y);
                    break;
                case 11:
                    this.n = typedArrayObtainStyledAttributes.getResourceId(index, this.n);
                    break;
                case 12:
                    this.i = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                    break;
                case 13:
                    this.g = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                    break;
                case 14:
                    this.h = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cd  */
    public final void g(View view, float f) {
        boolean z;
        boolean z2;
        float f2;
        boolean z3;
        boolean z4;
        float f3;
        float f4;
        float f5;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        boolean z8 = false;
        if (this.r != -1) {
            View viewFindViewById = this.s;
            if (viewFindViewById == null) {
                viewFindViewById = ((ViewGroup) view.getParent()).findViewById(this.r);
                this.s = viewFindViewById;
            }
            i(this.j, viewFindViewById, this.y);
            i(this.k, view, this.y);
            boolean zIntersect = this.j.intersect(this.k);
            boolean z9 = this.t;
            if (zIntersect) {
                if (z9) {
                    this.t = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.v) {
                    this.v = false;
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.u = true;
            } else {
                if (z9) {
                    z = false;
                } else {
                    this.t = true;
                    z = true;
                }
                if (this.u) {
                    this.u = false;
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.v = true;
                boolean z10 = z5;
                z6 = false;
                z8 = z10;
            }
            z7 = z6;
        } else {
            boolean z11 = this.t;
            float f6 = this.w;
            if (z11) {
                if ((this.x - f6) * (f - f6) < 0.0f) {
                    this.t = false;
                    z = true;
                }
                z2 = this.u;
                f2 = this.w;
                if (z2) {
                    f5 = f - f2;
                    if ((this.x - f2) * f5 >= 0.0f && f5 < 0.0f) {
                        this.u = false;
                        z3 = true;
                    }
                    z4 = this.v;
                    f3 = this.w;
                    if (z4) {
                        f4 = f - f3;
                        if ((this.x - f3) * f4 >= 0.0f && f4 > 0.0f) {
                            this.v = false;
                        }
                        z8 = z3;
                    } else if (Math.abs(f - f3) > this.f) {
                        this.v = true;
                    }
                    z7 = false;
                    z8 = z3;
                } else if (Math.abs(f - f2) > this.f) {
                    this.u = true;
                }
                z3 = false;
                z4 = this.v;
                f3 = this.w;
                if (z4) {
                    f4 = f - f3;
                    if ((this.x - f3) * f4 >= 0.0f) {
                    }
                    z8 = z3;
                } else if (Math.abs(f - f3) > this.f) {
                    this.v = true;
                }
                z7 = false;
                z8 = z3;
            } else if (Math.abs(f - f6) > this.f) {
                this.t = true;
            }
            z = false;
            z2 = this.u;
            f2 = this.w;
            if (z2) {
                f5 = f - f2;
                if ((this.x - f2) * f5 >= 0.0f) {
                }
                z4 = this.v;
                f3 = this.w;
                if (z4) {
                    f4 = f - f3;
                    if ((this.x - f3) * f4 >= 0.0f) {
                    }
                    z8 = z3;
                } else if (Math.abs(f - f3) > this.f) {
                    this.v = true;
                }
                z7 = false;
                z8 = z3;
            } else if (Math.abs(f - f2) > this.f) {
                this.u = true;
            }
            z3 = false;
            z4 = this.v;
            f3 = this.w;
            if (z4) {
                f4 = f - f3;
                if ((this.x - f3) * f4 >= 0.0f) {
                }
                z8 = z3;
            } else if (Math.abs(f - f3) > this.f) {
                this.v = true;
            }
            z7 = false;
            z8 = z3;
        }
        this.x = f;
        if (z8 || z || z7) {
            ((MotionLayout) view.getParent()).getClass();
        }
        View viewFindViewById2 = this.n == -1 ? view : ((MotionLayout) view.getParent()).findViewById(this.n);
        if (z8) {
            String str = this.o;
            if (str != null) {
                h(viewFindViewById2, str);
            }
            if (this.g != -1) {
                ((MotionLayout) view.getParent()).O(this.g, viewFindViewById2);
            }
        }
        if (z7) {
            String str2 = this.f4p;
            if (str2 != null) {
                h(viewFindViewById2, str2);
            }
            if (this.h != -1) {
                ((MotionLayout) view.getParent()).O(this.h, viewFindViewById2);
            }
        }
        if (z) {
            String str3 = this.m;
            if (str3 != null) {
                h(viewFindViewById2, str3);
            }
            if (this.i != -1) {
                ((MotionLayout) view.getParent()).O(this.i, viewFindViewById2);
            }
        }
    }

    public final void h(View view, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.l.containsKey(str)) {
                method = (Method) this.l.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, null);
                    this.l.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.l.put(str, null);
                    view.getClass();
                    bmq0.z(view);
                    return;
                }
            }
            try {
                method.invoke(view, null);
                return;
            } catch (Exception unused2) {
                view.getClass();
                bmq0.z(view);
                return;
            }
        }
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                mhl mhlVar = (mhl) this.e.get(str2);
                if (mhlVar != null) {
                    Class<?> cls = view.getClass();
                    String strM = mhlVar.b;
                    if (!mhlVar.a) {
                        strM = l1d.m("set", strM);
                    }
                    try {
                        int iC = l1d.C(mhlVar.c);
                        Class cls2 = Integer.TYPE;
                        Class cls3 = Float.TYPE;
                        switch (iC) {
                            case 0:
                            case 7:
                                cls.getMethod(strM, cls2).invoke(view, Integer.valueOf(mhlVar.d));
                                break;
                            case 1:
                                cls.getMethod(strM, cls3).invoke(view, Float.valueOf(mhlVar.e));
                                break;
                            case 2:
                                cls.getMethod(strM, cls2).invoke(view, Integer.valueOf(mhlVar.h));
                                break;
                            case 3:
                                Method method2 = cls.getMethod(strM, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(mhlVar.h);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 4:
                                cls.getMethod(strM, CharSequence.class).invoke(view, mhlVar.f);
                                break;
                            case 5:
                                cls.getMethod(strM, Boolean.TYPE).invoke(view, Boolean.valueOf(mhlVar.g));
                                break;
                            case 6:
                                cls.getMethod(strM, cls3).invoke(view, Float.valueOf(mhlVar.e));
                                break;
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused3) {
                    }
                }
            }
        }
    }
}
