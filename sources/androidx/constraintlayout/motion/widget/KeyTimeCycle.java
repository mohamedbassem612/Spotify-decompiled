package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p.inz0;
import p.l1d;
import p.mhk1;
import p.mhl;
import p.ooa0;
import p.phk1;
import p.vpa0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class KeyTimeCycle extends ooa0 {
    public int f = -1;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f3p = Float.NaN;
    public float q = Float.NaN;
    public float r = Float.NaN;
    public int s = 0;
    public float t = Float.NaN;
    public float u = 0.0f;

    public KeyTimeCycle() {
        this.d = (byte) 3;
        this.e = new HashMap();
    }

    @Override // p.ooa0
    public final void a(HashMap map) {
        throw null;
    }

    @Override // p.ooa0
    /* JADX INFO: renamed from: b */
    public final ooa0 clone() {
        KeyTimeCycle keyTimeCycle = new KeyTimeCycle();
        super.c(this);
        keyTimeCycle.f = this.f;
        keyTimeCycle.s = this.s;
        keyTimeCycle.t = this.t;
        keyTimeCycle.u = this.u;
        keyTimeCycle.r = this.r;
        keyTimeCycle.g = this.g;
        keyTimeCycle.h = this.h;
        keyTimeCycle.i = this.i;
        keyTimeCycle.l = this.l;
        keyTimeCycle.j = this.j;
        keyTimeCycle.k = this.k;
        keyTimeCycle.m = this.m;
        keyTimeCycle.n = this.n;
        keyTimeCycle.o = this.o;
        keyTimeCycle.f3p = this.f3p;
        keyTimeCycle.q = this.q;
        return keyTimeCycle;
    }

    @Override // p.ooa0
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.g)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.h)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.i)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f3p)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("progress");
        }
        if (this.e.size() > 0) {
            Iterator it = this.e.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // p.ooa0
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, inz0.h);
        SparseIntArray sparseIntArray = vpa0.a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = vpa0.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                    break;
                case 2:
                    this.h = typedArrayObtainStyledAttributes.getDimension(index, this.h);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 5:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 6:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 7:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 8:
                    this.l = typedArrayObtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.a = typedArrayObtainStyledAttributes.getInt(index, this.a);
                    break;
                case 13:
                    this.f = typedArrayObtainStyledAttributes.getInteger(index, this.f);
                    break;
                case 14:
                    this.n = typedArrayObtainStyledAttributes.getFloat(index, this.n);
                    break;
                case 15:
                    this.o = typedArrayObtainStyledAttributes.getDimension(index, this.o);
                    break;
                case 16:
                    this.f3p = typedArrayObtainStyledAttributes.getDimension(index, this.f3p);
                    break;
                case 17:
                    this.q = typedArrayObtainStyledAttributes.getDimension(index, this.q);
                    break;
                case 18:
                    this.r = typedArrayObtainStyledAttributes.getFloat(index, this.r);
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        this.s = 7;
                    } else {
                        this.s = typedArrayObtainStyledAttributes.getInt(index, this.s);
                    }
                    break;
                case 20:
                    this.t = typedArrayObtainStyledAttributes.getFloat(index, this.t);
                    break;
                case 21:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    float f = this.u;
                    if (i2 == 5) {
                        this.u = typedArrayObtainStyledAttributes.getDimension(index, f);
                    } else {
                        this.u = typedArrayObtainStyledAttributes.getFloat(index, f);
                    }
                    break;
            }
        }
    }

    @Override // p.ooa0
    public final void f(HashMap map) {
        if (this.f == -1) {
            return;
        }
        if (!Float.isNaN(this.g)) {
            map.put("alpha", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.h)) {
            map.put("elevation", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.i)) {
            map.put("rotation", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.j)) {
            map.put("rotationX", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.k)) {
            map.put("rotationY", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.o)) {
            map.put("translationX", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.f3p)) {
            map.put("translationY", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.q)) {
            map.put("translationZ", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.l)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.m)) {
            map.put("scaleX", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.m)) {
            map.put("scaleY", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.r)) {
            map.put("progress", Integer.valueOf(this.f));
        }
        if (this.e.size() > 0) {
            Iterator it = this.e.keySet().iterator();
            while (it.hasNext()) {
                map.put(l1d.m("CUSTOM,", (String) it.next()), Integer.valueOf(this.f));
            }
        }
    }

    public final void g(HashMap map) {
        for (String str : map.keySet()) {
            phk1 phk1Var = (phk1) map.get(str);
            if (phk1Var != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                phk1Var.c(this.j, this.t, this.u, this.a, this.s);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.k)) {
                                break;
                            } else {
                                phk1Var.c(this.k, this.t, this.u, this.a, this.s);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.o)) {
                                break;
                            } else {
                                phk1Var.c(this.o, this.t, this.u, this.a, this.s);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f3p)) {
                                break;
                            } else {
                                phk1Var.c(this.f3p, this.t, this.u, this.a, this.s);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.q)) {
                                break;
                            } else {
                                phk1Var.c(this.q, this.t, this.u, this.a, this.s);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.r)) {
                                break;
                            } else {
                                phk1Var.c(this.r, this.t, this.u, this.a, this.s);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.m)) {
                                break;
                            } else {
                                phk1Var.c(this.m, this.t, this.u, this.a, this.s);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.n)) {
                                break;
                            } else {
                                phk1Var.c(this.n, this.t, this.u, this.a, this.s);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.i)) {
                                break;
                            } else {
                                phk1Var.c(this.i, this.t, this.u, this.a, this.s);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.h)) {
                                break;
                            } else {
                                phk1Var.c(this.h, this.t, this.u, this.a, this.s);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.l)) {
                                break;
                            } else {
                                phk1Var.c(this.l, this.t, this.u, this.a, this.s);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.g)) {
                                break;
                            } else {
                                phk1Var.c(this.g, this.t, this.u, this.a, this.s);
                                break;
                            }
                            break;
                    }
                } else {
                    mhl mhlVar = (mhl) this.e.get(str.substring(7));
                    if (mhlVar != null) {
                        mhk1 mhk1Var = (mhk1) phk1Var;
                        int i = this.a;
                        float f = this.t;
                        int i2 = this.s;
                        float f2 = this.u;
                        mhk1Var.l.append(i, mhlVar);
                        mhk1Var.m.append(i, new float[]{f, f2});
                        mhk1Var.b = Math.max(mhk1Var.b, i2);
                    }
                }
            }
        }
    }
}
