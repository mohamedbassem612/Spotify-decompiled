package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p.hdk1;
import p.inz0;
import p.mhl;
import p.ooa0;
import p.xoa0;
import p.yoa0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class KeyCycle extends ooa0 {
    public int f = 0;
    public int g = -1;
    public String h = null;
    public float i = Float.NaN;
    public float j = 0.0f;
    public float k = 0.0f;
    public float l = Float.NaN;
    public int m = -1;
    public float n = Float.NaN;
    public float o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f1p = Float.NaN;
    public float q = Float.NaN;
    public float r = Float.NaN;
    public float s = Float.NaN;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public float v = Float.NaN;
    public float w = Float.NaN;
    public float x = Float.NaN;

    public KeyCycle() {
        this.d = (byte) 4;
        this.e = new HashMap();
    }

    @Override // p.ooa0
    public final void a(HashMap map) {
        throw null;
    }

    @Override // p.ooa0
    /* JADX INFO: renamed from: b */
    public final ooa0 clone() {
        KeyCycle keyCycle = new KeyCycle();
        super.c(this);
        keyCycle.f = this.f;
        keyCycle.g = this.g;
        keyCycle.h = this.h;
        keyCycle.i = this.i;
        keyCycle.j = this.j;
        keyCycle.k = this.k;
        keyCycle.l = this.l;
        keyCycle.m = this.m;
        keyCycle.n = this.n;
        keyCycle.o = this.o;
        keyCycle.f1p = this.f1p;
        keyCycle.q = this.q;
        keyCycle.r = this.r;
        keyCycle.s = this.s;
        keyCycle.t = this.t;
        keyCycle.u = this.u;
        keyCycle.v = this.v;
        keyCycle.w = this.w;
        keyCycle.x = this.x;
        return keyCycle;
    }

    @Override // p.ooa0
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.n)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f1p)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.w)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.x)) {
            hashSet.add("translationZ");
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, inz0.f);
        SparseIntArray sparseIntArray = xoa0.a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = xoa0.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
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
                case 2:
                    this.a = typedArrayObtainStyledAttributes.getInt(index, this.a);
                    break;
                case 3:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f = typedArrayObtainStyledAttributes.getInteger(index, this.f);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.h = typedArrayObtainStyledAttributes.getString(index);
                        this.g = 7;
                    } else {
                        this.g = typedArrayObtainStyledAttributes.getInt(index, this.g);
                    }
                    break;
                case 6:
                    this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 7:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    float f = this.j;
                    if (i2 == 5) {
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, f);
                    } else {
                        this.j = typedArrayObtainStyledAttributes.getFloat(index, f);
                    }
                    break;
                case 8:
                    this.m = typedArrayObtainStyledAttributes.getInt(index, this.m);
                    break;
                case 9:
                    this.n = typedArrayObtainStyledAttributes.getFloat(index, this.n);
                    break;
                case 10:
                    this.o = typedArrayObtainStyledAttributes.getDimension(index, this.o);
                    break;
                case 11:
                    this.f1p = typedArrayObtainStyledAttributes.getFloat(index, this.f1p);
                    break;
                case 12:
                    this.r = typedArrayObtainStyledAttributes.getFloat(index, this.r);
                    break;
                case 13:
                    this.s = typedArrayObtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 14:
                    this.q = typedArrayObtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 15:
                    this.t = typedArrayObtainStyledAttributes.getFloat(index, this.t);
                    break;
                case 16:
                    this.u = typedArrayObtainStyledAttributes.getFloat(index, this.u);
                    break;
                case 17:
                    this.v = typedArrayObtainStyledAttributes.getDimension(index, this.v);
                    break;
                case 18:
                    this.w = typedArrayObtainStyledAttributes.getDimension(index, this.w);
                    break;
                case 19:
                    this.x = typedArrayObtainStyledAttributes.getDimension(index, this.x);
                    break;
                case 20:
                    this.l = typedArrayObtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 21:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k) / 360.0f;
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
            }
        }
    }

    public final void g(HashMap map) {
        hdk1 hdk1Var;
        float f;
        hdk1 hdk1Var2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                mhl mhlVar = (mhl) this.e.get(str.substring(7));
                if (mhlVar != null && mhlVar.c == 2 && (hdk1Var = (hdk1) map.get(str)) != null) {
                    int i = this.a;
                    int i2 = this.g;
                    String str2 = this.h;
                    int i3 = this.m;
                    hdk1Var.f.add(new yoa0(i, this.i, this.j, this.k, mhlVar.b()));
                    if (i3 != -1) {
                        hdk1Var.e = i3;
                    }
                    hdk1Var.c = i2;
                    hdk1Var.c(mhlVar);
                    hdk1Var.d = str2;
                }
            } else {
                switch (str) {
                    case "rotationX":
                        f = this.r;
                        break;
                    case "rotationY":
                        f = this.s;
                        break;
                    case "translationX":
                        f = this.v;
                        break;
                    case "translationY":
                        f = this.w;
                        break;
                    case "translationZ":
                        f = this.x;
                        break;
                    case "progress":
                        f = this.l;
                        break;
                    case "scaleX":
                        f = this.t;
                        break;
                    case "scaleY":
                        f = this.u;
                        break;
                    case "rotation":
                        f = this.f1p;
                        break;
                    case "elevation":
                        f = this.o;
                        break;
                    case "transitionPathRotate":
                        f = this.q;
                        break;
                    case "alpha":
                        f = this.n;
                        break;
                    case "waveOffset":
                        f = this.j;
                        break;
                    case "wavePhase":
                        f = this.k;
                        break;
                    default:
                        str.startsWith("CUSTOM");
                        f = Float.NaN;
                        break;
                }
                float f2 = f;
                if (!Float.isNaN(f2) && (hdk1Var2 = (hdk1) map.get(str)) != null) {
                    int i4 = this.a;
                    int i5 = this.g;
                    String str3 = this.h;
                    int i6 = this.m;
                    hdk1Var2.f.add(new yoa0(i4, this.i, this.j, this.k, f2));
                    if (i6 != -1) {
                        hdk1Var2.e = i6;
                    }
                    hdk1Var2.c = i5;
                    hdk1Var2.d = str3;
                }
            }
        }
    }
}
