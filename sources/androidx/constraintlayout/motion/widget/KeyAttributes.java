package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p.cfk1;
import p.inz0;
import p.l1d;
import p.mhl;
import p.ooa0;
import p.uoa0;
import p.zek1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class KeyAttributes extends ooa0 {
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
    public float f0p = Float.NaN;
    public float q = Float.NaN;
    public float r = Float.NaN;
    public float s = Float.NaN;
    public float t = Float.NaN;

    public KeyAttributes() {
        this.d = (byte) 1;
        this.e = new HashMap();
    }

    @Override // p.ooa0
    public final void a(HashMap map) {
        for (String str : map.keySet()) {
            cfk1 cfk1Var = (cfk1) map.get(str);
            if (cfk1Var != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                cfk1Var.b(this.j, this.a);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.k)) {
                                break;
                            } else {
                                cfk1Var.b(this.k, this.a);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.q)) {
                                break;
                            } else {
                                cfk1Var.b(this.q, this.a);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.r)) {
                                break;
                            } else {
                                cfk1Var.b(this.r, this.a);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.s)) {
                                break;
                            } else {
                                cfk1Var.b(this.s, this.a);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.t)) {
                                break;
                            } else {
                                cfk1Var.b(this.t, this.a);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.o)) {
                                break;
                            } else {
                                cfk1Var.b(this.o, this.a);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f0p)) {
                                break;
                            } else {
                                cfk1Var.b(this.f0p, this.a);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                cfk1Var.b(this.l, this.a);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.k)) {
                                break;
                            } else {
                                cfk1Var.b(this.m, this.a);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.i)) {
                                break;
                            } else {
                                cfk1Var.b(this.i, this.a);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.h)) {
                                break;
                            } else {
                                cfk1Var.b(this.h, this.a);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.n)) {
                                break;
                            } else {
                                cfk1Var.b(this.n, this.a);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.g)) {
                                break;
                            } else {
                                cfk1Var.b(this.g, this.a);
                                break;
                            }
                            break;
                    }
                } else {
                    mhl mhlVar = (mhl) this.e.get(str.substring(7));
                    if (mhlVar != null) {
                        ((zek1) cfk1Var).f.append(this.a, mhlVar);
                    }
                }
            }
        }
    }

    @Override // p.ooa0
    /* JADX INFO: renamed from: b */
    public final ooa0 clone() {
        KeyAttributes keyAttributes = new KeyAttributes();
        super.c(this);
        keyAttributes.f = this.f;
        keyAttributes.g = this.g;
        keyAttributes.h = this.h;
        keyAttributes.i = this.i;
        keyAttributes.j = this.j;
        keyAttributes.k = this.k;
        keyAttributes.l = this.l;
        keyAttributes.m = this.m;
        keyAttributes.n = this.n;
        keyAttributes.o = this.o;
        keyAttributes.f0p = this.f0p;
        keyAttributes.q = this.q;
        keyAttributes.r = this.r;
        keyAttributes.s = this.s;
        keyAttributes.t = this.t;
        return keyAttributes;
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
        if (!Float.isNaN(this.l)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f0p)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.t)) {
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, inz0.e);
        SparseIntArray sparseIntArray = uoa0.a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = uoa0.a;
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
                    this.o = typedArrayObtainStyledAttributes.getFloat(index, this.o);
                    break;
                case 8:
                    this.n = typedArrayObtainStyledAttributes.getFloat(index, this.n);
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
                    this.f0p = typedArrayObtainStyledAttributes.getFloat(index, this.f0p);
                    break;
                case 15:
                    this.q = typedArrayObtainStyledAttributes.getDimension(index, this.q);
                    break;
                case 16:
                    this.r = typedArrayObtainStyledAttributes.getDimension(index, this.r);
                    break;
                case 17:
                    this.s = typedArrayObtainStyledAttributes.getDimension(index, this.s);
                    break;
                case 18:
                    this.t = typedArrayObtainStyledAttributes.getFloat(index, this.t);
                    break;
                case 19:
                    this.l = typedArrayObtainStyledAttributes.getDimension(index, this.l);
                    break;
                case 20:
                    this.m = typedArrayObtainStyledAttributes.getDimension(index, this.m);
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
        if (!Float.isNaN(this.l)) {
            map.put("transformPivotX", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.m)) {
            map.put("transformPivotY", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.q)) {
            map.put("translationX", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.r)) {
            map.put("translationY", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.s)) {
            map.put("translationZ", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.n)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.o)) {
            map.put("scaleX", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.f0p)) {
            map.put("scaleY", Integer.valueOf(this.f));
        }
        if (!Float.isNaN(this.t)) {
            map.put("progress", Integer.valueOf(this.f));
        }
        if (this.e.size() > 0) {
            Iterator it = this.e.keySet().iterator();
            while (it.hasNext()) {
                map.put(l1d.m("CUSTOM,", (String) it.next()), Integer.valueOf(this.f));
            }
        }
    }
}
