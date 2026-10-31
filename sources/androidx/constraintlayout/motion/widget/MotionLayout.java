package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p.ai;
import p.an90;
import p.anm0;
import p.av7;
import p.bmq0;
import p.bnm0;
import p.cfk1;
import p.cjl;
import p.clv;
import p.cnm0;
import p.djl;
import p.dxo1;
import p.e821;
import p.eif1;
import p.gil;
import p.gnm0;
import p.hdk1;
import p.hnm0;
import p.inm0;
import p.inz0;
import p.kgh;
import p.kil;
import p.l1d;
import p.le;
import p.mit;
import p.nhc;
import p.nqb1;
import p.o26;
import p.o8b1;
import p.omm0;
import p.oqb1;
import p.p321;
import p.qhk1;
import p.qub1;
import p.rhk1;
import p.s6o0;
import p.up20;
import p.vmm0;
import p.wmm0;
import p.xmm0;
import p.xzb1;
import p.yhl;
import p.ymm0;
import p.zhl;
import p.zmm0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class MotionLayout extends ConstraintLayout implements s6o0 {
    public static boolean X1;
    public int A1;
    public long B1;
    public float C1;
    public boolean D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public int I1;
    public int J1;
    public float K1;
    public final p321 L1;
    public boolean M1;
    public zmm0 N1;
    public qub1 O1;
    public final Rect P1;
    public boolean Q1;
    public bnm0 R1;
    public final av7 S1;
    public inm0 T0;
    public boolean T1;
    public vmm0 U0;
    public final RectF U1;
    public Interpolator V0;
    public View V1;
    public float W0;
    public Matrix W1;
    public int X0;
    public int Y0;
    public int Z0;
    public int a1;
    public int b1;
    public boolean c1;
    public final HashMap d1;
    public long e1;
    public float f1;
    public float g1;
    public float h1;
    public long i1;
    public float j1;
    public boolean k1;
    public boolean l1;
    public int m1;
    public xmm0 n1;
    public boolean o1;
    public final xzb1 p1;
    public final wmm0 q1;
    public mit r1;
    public int s1;
    public int t1;
    public boolean u1;
    public float v1;
    public float w1;
    public long x1;
    public float y1;
    public boolean z1;

    public MotionLayout(Context context) {
        super(context);
        this.V0 = null;
        this.W0 = 0.0f;
        this.X0 = -1;
        this.Y0 = -1;
        this.Z0 = -1;
        this.a1 = 0;
        this.b1 = 0;
        this.c1 = true;
        this.d1 = new HashMap();
        this.e1 = 0L;
        this.f1 = 1.0f;
        this.g1 = 0.0f;
        this.h1 = 0.0f;
        this.j1 = 0.0f;
        this.l1 = false;
        this.m1 = 0;
        this.o1 = false;
        this.p1 = new xzb1();
        this.q1 = new wmm0(this);
        this.u1 = false;
        this.z1 = false;
        this.A1 = 0;
        this.B1 = -1L;
        this.C1 = 0.0f;
        this.D1 = false;
        this.L1 = new p321((byte) 2);
        this.M1 = false;
        this.O1 = null;
        new HashMap();
        this.P1 = new Rect();
        this.Q1 = false;
        this.R1 = bnm0.a;
        this.S1 = new av7(this);
        this.T1 = false;
        this.U1 = new RectF();
        this.V1 = null;
        this.W1 = null;
        new ArrayList();
        E(null);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0156  */
    /* JADX WARN: Code duplicated, block: B:105:0x016d  */
    /* JADX WARN: Code duplicated, block: B:107:0x017c  */
    /* JADX WARN: Code duplicated, block: B:108:0x018e  */
    /* JADX WARN: Code duplicated, block: B:128:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:154:0x0218  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069 A[PHI: r14
      0x0069: PHI (r14v7 float) = (r14v2 float), (r14v9 float) binds: [B:35:0x0073, B:29:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e2 A[PHI: r3
      0x00e2: PHI (r3v13 float) = (r3v12 float), (r3v14 float), (r3v14 float) binds: [B:52:0x00b0, B:63:0x00d6, B:65:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x010d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0118  */
    /* JADX WARN: Code duplicated, block: B:84:0x011f A[PHI: r8
      0x011f: PHI (r8v11 float) = (r8v8 float), (r8v12 float) binds: [B:88:0x0129, B:82:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0121  */
    /* JADX WARN: Code duplicated, block: B:87:0x0125  */
    /* JADX WARN: Code duplicated, block: B:95:0x0136  */
    /* JADX WARN: Code duplicated, block: B:98:0x014b  */
    /* JADX WARN: Code duplicated, block: B:99:0x014d  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A(boolean z) {
        boolean z2;
        float f;
        char c;
        bnm0 bnm0Var;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i;
        float f2;
        int i2;
        int i3;
        int i4;
        View childAt;
        a aVar;
        float f3;
        boolean z3;
        if (this.i1 == -1) {
            this.i1 = getNanoTime();
        }
        float f4 = this.h1;
        float f5 = 0.0f;
        if (f4 > 0.0f && f4 < 1.0f) {
            this.Y0 = -1;
        }
        boolean z4 = false;
        if (this.z1 || (this.l1 && (z || this.j1 != f4))) {
            float fSignum = Math.signum(this.j1 - f4);
            long nanoTime2 = getNanoTime();
            vmm0 vmm0Var = this.U0;
            float f6 = vmm0Var == null ? (((nanoTime2 - this.i1) * fSignum) * 1.0E-9f) / this.f1 : 0.0f;
            float f7 = this.h1 + f6;
            if (this.k1) {
                f7 = this.j1;
            }
            if (fSignum > 0.0f) {
                f = this.j1;
                if (f7 < f) {
                    if (fSignum <= 0.0f) {
                        f = this.j1;
                        if (f7 <= f) {
                            f7 = f;
                            this.l1 = false;
                            z2 = true;
                        }
                    }
                    z2 = false;
                } else {
                    f7 = f;
                    this.l1 = false;
                    z2 = true;
                }
            } else {
                if (fSignum <= 0.0f) {
                    f = this.j1;
                    if (f7 <= f) {
                        f7 = f;
                        this.l1 = false;
                        z2 = true;
                    }
                }
                z2 = false;
            }
            this.h1 = f7;
            this.g1 = f7;
            this.i1 = nanoTime2;
            if (vmm0Var == null || z2) {
                this.W0 = f6;
            } else {
                if (this.o1) {
                    float interpolation2 = vmm0Var.getInterpolation((nanoTime2 - this.e1) * 1.0E-9f);
                    vmm0 vmm0Var2 = this.U0;
                    xzb1 xzb1Var = this.p1;
                    if (vmm0Var2 == xzb1Var) {
                        c = xzb1Var.c.b() ? (char) 2 : (char) 1;
                    } else {
                        c = 0;
                    }
                    this.h1 = interpolation2;
                    this.i1 = nanoTime2;
                    vmm0 vmm0Var3 = this.U0;
                    if (vmm0Var3 != null) {
                        float fA = vmm0Var3.a();
                        this.W0 = fA;
                        if (Math.abs(fA) * this.f1 <= 1.0E-5f && c == 2) {
                            this.l1 = false;
                        }
                        if (fA > 0.0f && interpolation2 >= 1.0f) {
                            this.h1 = 1.0f;
                            this.l1 = false;
                            interpolation2 = 1.0f;
                        }
                        if (fA >= 0.0f || interpolation2 > 0.0f) {
                            f7 = interpolation2;
                        } else {
                            this.h1 = 0.0f;
                            this.l1 = false;
                            f7 = 0.0f;
                        }
                    } else {
                        f7 = interpolation2;
                    }
                } else {
                    float interpolation3 = vmm0Var.getInterpolation(f7);
                    vmm0 vmm0Var4 = this.U0;
                    if (vmm0Var4 != null) {
                        this.W0 = vmm0Var4.a();
                    } else {
                        this.W0 = ((vmm0Var4.getInterpolation(f7 + f6) - interpolation3) * fSignum) / f6;
                    }
                    f7 = interpolation3;
                }
                if (Math.abs(this.W0) > 1.0E-5f) {
                    setState(bnm0.c);
                }
                bnm0Var = bnm0.d;
                if (c != 1) {
                    if (fSignum > 0.0f) {
                        f3 = this.j1;
                        if (f7 < f3) {
                            f7 = f3;
                            this.l1 = false;
                        } else if (fSignum <= 0.0f) {
                            f3 = this.j1;
                            if (f7 <= f3) {
                                f7 = f3;
                                this.l1 = false;
                            }
                        }
                    } else if (fSignum <= 0.0f) {
                        f3 = this.j1;
                        if (f7 <= f3) {
                            f7 = f3;
                            this.l1 = false;
                        }
                    }
                    if (f7 < 1.0f || f7 <= 0.0f) {
                        this.l1 = false;
                        setState(bnm0Var);
                    }
                }
                childCount = getChildCount();
                this.z1 = false;
                nanoTime = getNanoTime();
                this.K1 = f7;
                interpolator = this.V0;
                if (interpolator == null) {
                    interpolation = f7;
                } else {
                    interpolation = interpolator.getInterpolation(f7);
                }
                interpolator2 = this.V0;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.f1) + f7);
                    this.W0 = interpolation4;
                    this.W0 = interpolation4 - this.V0.getInterpolation(f7);
                }
                i = 0;
                while (i < childCount) {
                    childAt = getChildAt(i);
                    aVar = (a) this.d1.get(childAt);
                    if (aVar != null) {
                        this.z1 = aVar.d(interpolation, nanoTime, childAt, this.L1) | this.z1;
                    }
                    i++;
                    f5 = f5;
                }
                f2 = f5;
                boolean z5 = (fSignum <= 0.0f && f7 >= this.j1) || (fSignum <= f2 && f7 <= this.j1);
                if (!this.z1 && !this.l1 && z5) {
                    setState(bnm0Var);
                }
                if (this.D1) {
                    requestLayout();
                }
                this.z1 = (!z5) | this.z1;
                if (f7 <= f2 && (i4 = this.X0) != -1 && this.Y0 != i4) {
                    this.Y0 = i4;
                    this.T0.b(i4).a(this);
                    setState(bnm0Var);
                    z4 = true;
                }
                if (f7 >= 1.0d) {
                    i2 = this.Y0;
                    i3 = this.Z0;
                    if (i2 != i3) {
                        this.Y0 = i3;
                        this.T0.b(i3).a(this);
                        setState(bnm0Var);
                        z4 = true;
                    }
                }
                if (!this.z1 || this.l1) {
                    invalidate();
                } else if ((fSignum > 0.0f && f7 == 1.0f) || (fSignum < f2 && f7 == f2)) {
                    setState(bnm0Var);
                }
                if (!this.z1 && !this.l1 && ((fSignum > 0.0f && f7 == 1.0f) || (fSignum < f2 && f7 == f2))) {
                    F();
                }
            }
            c = 0;
            if (Math.abs(this.W0) > 1.0E-5f) {
                setState(bnm0.c);
            }
            bnm0Var = bnm0.d;
            if (c != 1) {
                if (fSignum > 0.0f) {
                    f3 = this.j1;
                    if (f7 < f3) {
                        f7 = f3;
                        this.l1 = false;
                    } else if (fSignum <= 0.0f) {
                        f3 = this.j1;
                        if (f7 <= f3) {
                            f7 = f3;
                            this.l1 = false;
                        }
                    }
                } else if (fSignum <= 0.0f) {
                    f3 = this.j1;
                    if (f7 <= f3) {
                        f7 = f3;
                        this.l1 = false;
                    }
                }
                if (f7 < 1.0f) {
                    this.l1 = false;
                    setState(bnm0Var);
                } else {
                    this.l1 = false;
                    setState(bnm0Var);
                }
            }
            childCount = getChildCount();
            this.z1 = false;
            nanoTime = getNanoTime();
            this.K1 = f7;
            interpolator = this.V0;
            if (interpolator == null) {
                interpolation = f7;
            } else {
                interpolation = interpolator.getInterpolation(f7);
            }
            interpolator2 = this.V0;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.f1) + f7);
                this.W0 = interpolation5;
                this.W0 = interpolation5 - this.V0.getInterpolation(f7);
            }
            i = 0;
            while (i < childCount) {
                childAt = getChildAt(i);
                aVar = (a) this.d1.get(childAt);
                if (aVar != null) {
                    this.z1 = aVar.d(interpolation, nanoTime, childAt, this.L1) | this.z1;
                }
                i++;
                f5 = f5;
            }
            f2 = f5;
            if (fSignum <= 0.0f) {
            }
            if (!this.z1) {
                setState(bnm0Var);
            }
            if (this.D1) {
                requestLayout();
            }
            this.z1 = (!z5) | this.z1;
            if (f7 <= f2) {
                this.Y0 = i4;
                this.T0.b(i4).a(this);
                setState(bnm0Var);
                z4 = true;
            }
            if (f7 >= 1.0d) {
                i2 = this.Y0;
                i3 = this.Z0;
                if (i2 != i3) {
                    this.Y0 = i3;
                    this.T0.b(i3).a(this);
                    setState(bnm0Var);
                    z4 = true;
                }
            }
            if (this.z1) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.z1) {
                F();
            }
        } else {
            f2 = 0.0f;
        }
        float f8 = this.h1;
        if (f8 < 1.0f) {
            if (f8 <= f2) {
                int i5 = this.Y0;
                int i6 = this.X0;
                z3 = i5 == i6 ? z4 : true;
                this.Y0 = i6;
            }
            this.T1 |= z4;
            if (z4 && !this.M1) {
                requestLayout();
            }
            this.g1 = this.h1;
        }
        int i7 = this.Y0;
        int i8 = this.Z0;
        z3 = i7 == i8 ? z4 : true;
        this.Y0 = i8;
        z4 = z3;
        this.T1 |= z4;
        if (z4) {
            requestLayout();
        }
        this.g1 = this.h1;
    }

    public final void B(int i, float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        View view = (View) ((ConstraintLayout) this).a.get(i);
        a aVar = (a) this.d1.get(view);
        if (aVar == null) {
            if (view == null) {
                return;
            }
            view.getContext().getResources().getResourceName(i);
            return;
        }
        float[] fArr2 = aVar.v;
        float fA = aVar.a(f, fArr2);
        dxo1[] dxo1VarArr = aVar.j;
        int i2 = 0;
        if (dxo1VarArr != null) {
            double d = fA;
            dxo1VarArr[0].p(d, aVar.q);
            aVar.j[0].n(d, aVar.f5p);
            float f4 = fArr2[0];
            while (true) {
                dArr = aVar.q;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArr[i2] * ((double) f4);
                i2++;
            }
            o26 o26Var = aVar.k;
            if (o26Var != null) {
                double[] dArr2 = aVar.f5p;
                if (dArr2.length > 0) {
                    o26Var.n(d, dArr2);
                    aVar.k.p(d, aVar.q);
                    cnm0.e(f2, f3, fArr, aVar.o, aVar.q, aVar.f5p);
                }
            } else {
                cnm0.e(f2, f3, fArr, aVar.o, dArr, aVar.f5p);
            }
        } else {
            cnm0 cnm0Var = aVar.g;
            float f5 = cnm0Var.e;
            cnm0 cnm0Var2 = aVar.f;
            float f6 = f5 - cnm0Var2.e;
            float f7 = cnm0Var.f - cnm0Var2.f;
            float f8 = cnm0Var.g - cnm0Var2.g;
            float f9 = (cnm0Var.h - cnm0Var2.h) + f7;
            fArr[0] = ((f8 + f6) * f2) + ((1.0f - f2) * f6);
            fArr[1] = (f9 * f3) + ((1.0f - f3) * f7);
        }
        view.getY();
    }

    public final kil C(int i) {
        inm0 inm0Var = this.T0;
        if (inm0Var == null) {
            return null;
        }
        return inm0Var.b(i);
    }

    public final boolean D(float f, float f2, View view, MotionEvent motionEvent) {
        boolean z;
        boolean zOnTouchEvent;
        if (!(view instanceof ViewGroup)) {
            z = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (D((childAt.getLeft() + f) - view.getScrollX(), (childAt.getTop() + f2) - view.getScrollY(), childAt, motionEvent)) {
                z = true;
                break;
            }
            childCount--;
        }
        if (!z) {
            float right = (view.getRight() + f) - view.getLeft();
            float bottom = (view.getBottom() + f2) - view.getTop();
            RectF rectF = this.U1;
            rectF.set(f, f2, right, bottom);
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f3 = -f;
                float f4 = -f2;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f3, f4);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f3, -f4);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f3, f4);
                    Matrix matrix2 = this.W1;
                    if (matrix2 == null) {
                        matrix2 = new Matrix();
                        this.W1 = matrix2;
                    }
                    matrix.invert(matrix2);
                    motionEventObtain.transform(this.W1);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(AttributeSet attributeSet) {
        inm0 inm0Var;
        inm0 inm0Var2;
        X1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, inz0.l);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 2) {
                    this.T0 = new inm0(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.Y0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.j1 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.l1 = true;
                } else if (index == 0) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.m1 == 0) {
                        this.m1 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.m1 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (!z) {
                this.T0 = null;
            }
        }
        if (this.m1 != 0 && (inm0Var2 = this.T0) != null) {
            int iG = inm0Var2.g();
            inm0 inm0Var3 = this.T0;
            kil kilVarB = inm0Var3.b(inm0Var3.g());
            bmq0.y(getContext(), iG);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (kilVarB.m(childAt.getId()) == null) {
                    bmq0.z(childAt);
                }
            }
            Integer[] numArr = (Integer[]) kilVarB.g.keySet().toArray(new Integer[0]);
            int length = numArr.length;
            int[] iArr = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = numArr[i3].intValue();
            }
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = iArr[i4];
                bmq0.y(getContext(), i5);
                findViewById(iArr[i4]);
                gil gilVar = kilVarB.l(i5).e;
                gil gilVar2 = kilVarB.l(i5).e;
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            for (hnm0 hnm0Var : this.T0.d) {
                hnm0 hnm0Var2 = this.T0.c;
                int i6 = hnm0Var.d;
                int i7 = hnm0Var.c;
                bmq0.y(getContext(), i6);
                bmq0.y(getContext(), i7);
                sparseIntArray.get(i6);
                sparseIntArray2.get(i7);
                sparseIntArray.put(i6, i7);
                sparseIntArray2.put(i7, i6);
                this.T0.b(i6);
                this.T0.b(i7);
            }
        }
        if (this.Y0 != -1 || (inm0Var = this.T0) == null) {
            return;
        }
        this.Y0 = inm0Var.g();
        this.X0 = this.T0.g();
        hnm0 hnm0Var3 = this.T0.c;
        this.Z0 = hnm0Var3 != null ? hnm0Var3.c : -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void F() {
        hnm0 hnm0Var;
        eif1 eif1Var;
        View viewFindViewById;
        View viewFindViewById2;
        inm0 inm0Var = this.T0;
        if (inm0Var == null) {
            return;
        }
        if (inm0Var.a(this.Y0, this)) {
            requestLayout();
            return;
        }
        int i = this.Y0;
        View viewFindViewById3 = null;
        if (i != -1) {
            inm0 inm0Var2 = this.T0;
            ArrayList<hnm0> arrayList = inm0Var2.f;
            ArrayList<hnm0> arrayList2 = inm0Var2.d;
            for (hnm0 hnm0Var2 : arrayList2) {
                if (hnm0Var2.m.size() > 0) {
                    Iterator it = hnm0Var2.m.iterator();
                    while (it.hasNext()) {
                        int i2 = ((gnm0) it.next()).b;
                        if (i2 != -1 && (viewFindViewById2 = findViewById(i2)) != null) {
                            viewFindViewById2.setOnClickListener(null);
                        }
                    }
                }
            }
            for (hnm0 hnm0Var3 : arrayList) {
                if (hnm0Var3.m.size() > 0) {
                    Iterator it2 = hnm0Var3.m.iterator();
                    while (it2.hasNext()) {
                        int i3 = ((gnm0) it2.next()).b;
                        if (i3 != -1 && (viewFindViewById = findViewById(i3)) != null) {
                            viewFindViewById.setOnClickListener(null);
                        }
                    }
                }
            }
            for (hnm0 hnm0Var4 : arrayList2) {
                if (hnm0Var4.m.size() > 0) {
                    Iterator it3 = hnm0Var4.m.iterator();
                    while (it3.hasNext()) {
                        ((gnm0) it3.next()).a(this, i, hnm0Var4);
                    }
                }
            }
            for (hnm0 hnm0Var5 : arrayList) {
                if (hnm0Var5.m.size() > 0) {
                    Iterator it4 = hnm0Var5.m.iterator();
                    while (it4.hasNext()) {
                        ((gnm0) it4.next()).a(this, i, hnm0Var5);
                    }
                }
            }
        }
        if (!this.T0.n() || (hnm0Var = this.T0.c) == null || (eif1Var = hnm0Var.l) == null) {
            return;
        }
        ConstraintLayout constraintLayout = eif1Var.r;
        int i4 = eif1Var.d;
        if (i4 != -1 && (viewFindViewById3 = constraintLayout.findViewById(i4)) == null) {
            bmq0.y(constraintLayout.getContext(), eif1Var.d);
        }
        if (viewFindViewById3 instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById3;
            nestedScrollView.setOnTouchListener(new kgh((byte) 5));
            nestedScrollView.setOnScrollChangeListener(new nhc((byte) 27));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G() {
        this.S1.j();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(float f, float f2) {
        if (!super/*android.view.View*/.isAttachedToWindow()) {
            zmm0 zmm0Var = this.N1;
            if (zmm0Var == null) {
                zmm0Var = new zmm0(this);
                this.N1 = zmm0Var;
            }
            zmm0Var.a = f;
            zmm0Var.b = f2;
            return;
        }
        setProgress(f);
        setState(bnm0.c);
        this.W0 = f2;
        if (f2 != 0.0f) {
            y(f2 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f == 0.0f || f == 1.0f) {
                return;
            }
            y(f > 0.5f ? 1.0f : 0.0f);
        }
    }

    public final void I(int i) {
        setState(bnm0.b);
        this.Y0 = i;
        this.X0 = -1;
        this.Z0 = -1;
        le leVar = ((ConstraintLayout) this).N0;
        if (leVar == null) {
            inm0 inm0Var = this.T0;
            if (inm0Var != null) {
                inm0Var.b(i).b(this);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) leVar.c;
        SparseArray sparseArray = (SparseArray) leVar.d;
        int i2 = leVar.b;
        int i3 = 0;
        if (i2 != i) {
            leVar.b = i;
            yhl yhlVar = (yhl) sparseArray.get(i);
            ArrayList arrayList = yhlVar.b;
            while (true) {
                if (i3 >= arrayList.size()) {
                    i3 = -1;
                    break;
                } else if (((zhl) arrayList.get(i3)).a(-1.0f, -1.0f)) {
                    break;
                } else {
                    i3++;
                }
            }
            ArrayList arrayList2 = yhlVar.b;
            kil kilVar = i3 == -1 ? yhlVar.d : ((zhl) arrayList2.get(i3)).f;
            if (i3 != -1) {
                int i4 = ((zhl) arrayList2.get(i3)).e;
            }
            if (kilVar == null) {
                return;
            }
            leVar.e = i3;
            kilVar.b(constraintLayout);
            return;
        }
        yhl yhlVar2 = i == -1 ? (yhl) sparseArray.valueAt(0) : (yhl) sparseArray.get(i2);
        int i5 = leVar.e;
        if (i5 == -1 || !((zhl) yhlVar2.b.get(i5)).a(-1.0f, -1.0f)) {
            ArrayList arrayList3 = yhlVar2.b;
            while (true) {
                if (i3 >= arrayList3.size()) {
                    i3 = -1;
                    break;
                } else if (((zhl) arrayList3.get(i3)).a(-1.0f, -1.0f)) {
                    break;
                } else {
                    i3++;
                }
            }
            ArrayList arrayList4 = yhlVar2.b;
            if (leVar.e == i3) {
                return;
            }
            kil kilVar2 = i3 == -1 ? null : ((zhl) arrayList4.get(i3)).f;
            if (i3 != -1) {
                int i6 = ((zhl) arrayList4.get(i3)).e;
            }
            if (kilVar2 == null) {
                return;
            }
            leVar.e = i3;
            kilVar2.b(constraintLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J(int i, int i2) {
        if (!super/*android.view.View*/.isAttachedToWindow()) {
            zmm0 zmm0Var = this.N1;
            if (zmm0Var == null) {
                zmm0Var = new zmm0(this);
                this.N1 = zmm0Var;
            }
            zmm0Var.c = i;
            zmm0Var.d = i2;
            return;
        }
        inm0 inm0Var = this.T0;
        if (inm0Var != null) {
            this.X0 = i;
            this.Z0 = i2;
            inm0Var.m(i, i2);
            this.S1.g(this.T0.b(i), this.T0.b(i2));
            G();
            this.h1 = 0.0f;
            y(0.0f);
        }
    }

    public final Rect K(cjl cjlVar) {
        int iU = cjlVar.u();
        Rect rect = this.P1;
        rect.top = iU;
        rect.left = cjlVar.t();
        rect.right = cjlVar.s() + rect.left;
        rect.bottom = cjlVar.m() + rect.top;
        return rect;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void L(int i, float f, float f2) {
        float f3;
        eif1 eif1Var;
        eif1 eif1Var2;
        eif1 eif1Var3;
        eif1 eif1Var4;
        eif1 eif1Var5;
        eif1 eif1Var6;
        eif1 eif1Var7;
        hnm0 hnm0Var;
        float f4;
        eif1 eif1Var8;
        float f5 = f;
        if (this.T0 == null || this.h1 == f5) {
            return;
        }
        this.o1 = true;
        this.e1 = getNanoTime();
        inm0 inm0Var = this.T0;
        hnm0 hnm0Var2 = inm0Var.c;
        float f6 = (hnm0Var2 != null ? hnm0Var2.h : inm0Var.j) / 1000.0f;
        this.f1 = f6;
        this.j1 = f5;
        this.l1 = true;
        xzb1 xzb1Var = this.p1;
        float f7 = 0.0f;
        if (i != 0 && i != 1 && i != 2) {
            f3 = 1.0f;
            wmm0 wmm0Var = this.q1;
            if (i == 4) {
                float f8 = this.h1;
                float f9 = inm0Var.f();
                wmm0Var.a = f2;
                wmm0Var.b = f8;
                wmm0Var.c = f9;
                this.U0 = wmm0Var;
            } else if (i == 5) {
                float f10 = this.h1;
                float f11 = inm0Var.f();
                if (f2 > 0.0f) {
                    float f12 = f2 / f11;
                    if (((f2 * f12) - (((f11 * f12) * f12) / 2.0f)) + f10 > 1.0f) {
                        float f13 = this.h1;
                        float f14 = this.T0.f();
                        wmm0Var.a = f2;
                        wmm0Var.b = f13;
                        wmm0Var.c = f14;
                        this.U0 = wmm0Var;
                    } else {
                        float f15 = this.h1;
                        float f16 = this.f1;
                        float f17 = this.T0.f();
                        hnm0Var = this.T0.c;
                        if (hnm0Var != null || (eif1Var8 = hnm0Var.l) == null) {
                            f4 = 0.0f;
                        } else {
                            f4 = eif1Var8.s;
                        }
                        this.p1.b(f15, f5, f2, f16, f17, f4);
                        this.W0 = 0.0f;
                        int i2 = this.Y0;
                        this.j1 = f5;
                        this.Y0 = i2;
                        this.U0 = xzb1Var;
                    }
                } else {
                    float f18 = (-f2) / f11;
                    if ((((f11 * f18) * f18) / 2.0f) + (f2 * f18) + f10 < 0.0f) {
                        float f19 = this.h1;
                        float f110 = this.T0.f();
                        wmm0Var.a = f2;
                        wmm0Var.b = f19;
                        wmm0Var.c = f110;
                        this.U0 = wmm0Var;
                    } else {
                        float f111 = this.h1;
                        float f112 = this.f1;
                        float f113 = this.T0.f();
                        hnm0Var = this.T0.c;
                        if (hnm0Var != null) {
                            f4 = 0.0f;
                        } else {
                            f4 = 0.0f;
                        }
                        this.p1.b(f111, f5, f2, f112, f113, f4);
                        this.W0 = 0.0f;
                        int i3 = this.Y0;
                        this.j1 = f5;
                        this.Y0 = i3;
                        this.U0 = xzb1Var;
                    }
                }
            } else if (i == 6 || i == 7) {
            }
            this.k1 = false;
            this.e1 = getNanoTime();
            invalidate();
        }
        f3 = 1.0f;
        if (i == 1 || i == 7) {
            f5 = 0.0f;
        } else if (i == 2 || i == 6) {
            f5 = f3;
        }
        int i4 = (hnm0Var2 == null || (eif1Var7 = hnm0Var2.l) == null) ? 0 : eif1Var7.D;
        float f20 = this.h1;
        int i5 = i4;
        xzb1 xzb1Var2 = this.p1;
        if (i5 == 0) {
            float f21 = inm0Var.f();
            hnm0 hnm0Var3 = this.T0.c;
            if (hnm0Var3 != null && (eif1Var6 = hnm0Var3.l) != null) {
                f7 = eif1Var6.s;
            }
            xzb1Var2.b(f20, f5, f2, f6, f21, f7);
        } else {
            float f22 = (hnm0Var2 == null || (eif1Var5 = hnm0Var2.l) == null) ? 0.0f : eif1Var5.z;
            float f23 = (hnm0Var2 == null || (eif1Var4 = hnm0Var2.l) == null) ? 0.0f : eif1Var4.A;
            float f24 = (hnm0Var2 == null || (eif1Var3 = hnm0Var2.l) == null) ? 0.0f : eif1Var3.y;
            float f25 = (hnm0Var2 == null || (eif1Var2 = hnm0Var2.l) == null) ? 0.0f : eif1Var2.B;
            int i6 = (hnm0Var2 == null || (eif1Var = hnm0Var2.l) == null) ? 0 : eif1Var.C;
            o8b1 o8b1Var = xzb1Var2.b;
            if (o8b1Var == null) {
                o8b1Var = new o8b1();
                o8b1Var.a = 0.5d;
                o8b1Var.i = 0;
                xzb1Var2.b = o8b1Var;
            }
            xzb1Var2.c = o8b1Var;
            o8b1Var.c = f5;
            o8b1Var.a = f24;
            o8b1Var.e = f20;
            o8b1Var.b = f23;
            o8b1Var.g = f22;
            o8b1Var.h = f25;
            o8b1Var.i = i6;
            o8b1Var.d = 0.0f;
        }
        int i7 = this.Y0;
        this.j1 = f5;
        this.Y0 = i7;
        this.U0 = xzb1Var;
        this.k1 = false;
        this.e1 = getNanoTime();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(int i) {
        up20 up20Var;
        if (!super/*android.view.View*/.isAttachedToWindow()) {
            zmm0 zmm0Var = this.N1;
            if (zmm0Var == null) {
                zmm0Var = new zmm0(this);
                this.N1 = zmm0Var;
            }
            zmm0Var.d = i;
            return;
        }
        inm0 inm0Var = this.T0;
        if (inm0Var != null && (up20Var = inm0Var.b) != null) {
            int i2 = this.Y0;
            nqb1 nqb1Var = (nqb1) ((SparseArray) up20Var.b).get(i);
            if (nqb1Var != null) {
                ArrayList arrayList = nqb1Var.b;
                int i3 = nqb1Var.c;
                if (i3 != i2) {
                    Iterator it = arrayList.iterator();
                    do {
                        if (!it.hasNext()) {
                            i2 = i3;
                            break;
                        }
                    } while (i2 != ((oqb1) it.next()).e);
                }
            } else {
                i2 = i;
            }
            if (i2 != -1) {
                i = i2;
            }
        }
        int i4 = this.Y0;
        if (i4 == i) {
            return;
        }
        if (this.X0 == i) {
            y(0.0f);
            return;
        }
        if (this.Z0 == i) {
            y(1.0f);
            return;
        }
        this.Z0 = i;
        if (i4 != -1) {
            J(i4, i);
            y(1.0f);
            this.h1 = 0.0f;
            y(1.0f);
            this.O1 = null;
            return;
        }
        this.o1 = false;
        this.j1 = 1.0f;
        this.g1 = 0.0f;
        this.h1 = 0.0f;
        this.i1 = getNanoTime();
        this.e1 = getNanoTime();
        this.k1 = false;
        this.U0 = null;
        inm0 inm0Var2 = this.T0;
        hnm0 hnm0Var = inm0Var2.c;
        this.f1 = (hnm0Var != null ? hnm0Var.h : inm0Var2.j) / 1000.0f;
        this.X0 = -1;
        inm0Var2.m(-1, this.Z0);
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        HashMap map = this.d1;
        map.clear();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            map.put(childAt, new a(childAt));
            sparseArray.put(childAt.getId(), (a) map.get(childAt));
        }
        this.l1 = true;
        kil kilVarB = this.T0.b(i);
        av7 av7Var = this.S1;
        av7Var.g(null, kilVarB);
        G();
        av7Var.a();
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt2 = getChildAt(i6);
            a aVar = (a) map.get(childAt2);
            if (aVar != null) {
                cnm0 cnm0Var = aVar.f;
                cnm0Var.c = 0.0f;
                cnm0Var.d = 0.0f;
                cnm0Var.d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                omm0 omm0Var = aVar.h;
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                omm0Var.c = childAt2.getVisibility();
                omm0Var.e = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                omm0Var.f = childAt2.getElevation();
                omm0Var.g = childAt2.getRotation();
                omm0Var.h = childAt2.getRotationX();
                omm0Var.a = childAt2.getRotationY();
                omm0Var.i = childAt2.getScaleX();
                omm0Var.t = childAt2.getScaleY();
                omm0Var.X = childAt2.getPivotX();
                omm0Var.Y = childAt2.getPivotY();
                omm0Var.Z = childAt2.getTranslationX();
                omm0Var.N0 = childAt2.getTranslationY();
                omm0Var.O0 = childAt2.getTranslationZ();
            }
        }
        int width = getWidth();
        int height = getHeight();
        for (int i7 = 0; i7 < childCount; i7++) {
            a aVar2 = (a) map.get(getChildAt(i7));
            if (aVar2 != null) {
                this.T0.e(aVar2);
                aVar2.g(width, getNanoTime(), height);
            }
        }
        hnm0 hnm0Var2 = this.T0.c;
        float f = hnm0Var2 != null ? hnm0Var2.i : 0.0f;
        if (f != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i8 = 0; i8 < childCount; i8++) {
                cnm0 cnm0Var2 = ((a) map.get(getChildAt(i8))).g;
                float f2 = cnm0Var2.f + cnm0Var2.e;
                fMin = Math.min(fMin, f2);
                fMax = Math.max(fMax, f2);
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                a aVar3 = (a) map.get(getChildAt(i9));
                cnm0 cnm0Var3 = aVar3.g;
                float f3 = cnm0Var3.e;
                float f4 = cnm0Var3.f;
                aVar3.n = 1.0f / (1.0f - f);
                aVar3.m = f - ((((f3 + f4) - fMin) * f) / (fMax - fMin));
            }
        }
        this.g1 = 0.0f;
        this.h1 = 0.0f;
        this.l1 = true;
        invalidate();
    }

    public final void N(int i, kil kilVar) {
        inm0 inm0Var = this.T0;
        if (inm0Var != null) {
            inm0Var.g.put(i, kilVar);
        }
        this.S1.g(this.T0.b(this.X0), this.T0.b(this.Z0));
        G();
        if (this.Y0 == i) {
            kilVar.b(this);
        }
    }

    public final void O(int i, View... viewArr) {
        inm0 inm0Var = this.T0;
        if (inm0Var != null) {
            e821 e821Var = inm0Var.q;
            e821Var.getClass();
            MotionLayout motionLayout = (MotionLayout) e821Var.b;
            ArrayList arrayList = new ArrayList();
            for (rhk1 rhk1Var : (ArrayList) e821Var.a) {
                if (rhk1Var.a == i) {
                    for (View view : viewArr) {
                        if (rhk1Var.b(view)) {
                            arrayList.add(view);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                        int currentState = motionLayout.getCurrentState();
                        if (rhk1Var.e == 2) {
                            rhk1Var.a(e821Var, motionLayout, currentState, null, viewArr2);
                        } else if (currentState == -1) {
                            motionLayout.toString();
                        } else {
                            kil kilVarC = motionLayout.C(currentState);
                            if (kilVarC != null) {
                                rhk1Var.a(e821Var, motionLayout, currentState, kilVarC, viewArr2);
                            }
                        }
                        arrayList.clear();
                    }
                }
            }
        }
    }

    public final void d(View view, View view2, int i, int i2) {
        this.x1 = getNanoTime();
        this.y1 = 0.0f;
        this.v1 = 0.0f;
        this.w1 = 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.view.View, androidx.constraintlayout.motion.widget.MotionLayout] */
    /* JADX WARN: Type inference failed for: r6v6, types: [float[], java.io.Serializable] */
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        int i;
        int i2;
        Paint paint;
        int i3;
        Paint paint2;
        float fMin;
        double dB;
        cnm0 cnm0Var;
        String resourceEntryName;
        e821 e821Var;
        Canvas canvas2 = canvas;
        A(false);
        inm0 inm0Var = this.T0;
        if (inm0Var != null && (e821Var = inm0Var.q) != null) {
            ArrayList arrayList = (ArrayList) e821Var.e;
            ArrayList arrayList2 = (ArrayList) e821Var.d;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((qhk1) it.next()).a();
                }
                ((ArrayList) e821Var.d).removeAll(arrayList);
                arrayList.clear();
                if (((ArrayList) e821Var.d).isEmpty()) {
                    e821Var.d = null;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.T0 == null) {
            return;
        }
        if ((this.m1 & 1) == 1 && !isInEditMode()) {
            this.A1++;
            long nanoTime = getNanoTime();
            long j = this.B1;
            if (j != -1) {
                long j2 = nanoTime - j;
                if (j2 > 200000000) {
                    this.C1 = ((int) ((this.A1 / (j2 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.A1 = 0;
                    this.B1 = nanoTime;
                }
            } else {
                this.B1 = nanoTime;
            }
            Paint paint3 = new Paint();
            paint3.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.C1);
            sb.append(" fps ");
            int i4 = this.X0;
            StringBuilder sb2 = new StringBuilder(l1d.n(i4 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i4), " -> ", sb));
            int i5 = this.Z0;
            sb2.append(i5 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i5));
            sb2.append(" (progress: ");
            sb2.append(progress);
            sb2.append(" ) state=");
            int i6 = this.Y0;
            if (i6 == -1) {
                resourceEntryName = "undefined";
            } else {
                resourceEntryName = i6 != -1 ? getContext().getResources().getResourceEntryName(i6) : "UNDEFINED";
            }
            sb2.append(resourceEntryName);
            String string = sb2.toString();
            paint3.setColor(-16777216);
            canvas2.drawText(string, 11.0f, getHeight() - 29, paint3);
            paint3.setColor(-7864184);
            canvas2.drawText(string, 10.0f, getHeight() - 30, paint3);
        }
        if (this.m1 > 1) {
            xmm0 xmm0Var = this.n1;
            if (xmm0Var == null) {
                xmm0Var = new xmm0(this);
                this.n1 = xmm0Var;
            }
            inm0 inm0Var2 = this.T0;
            hnm0 hnm0Var = inm0Var2.c;
            int i7 = hnm0Var != null ? hnm0Var.h : inm0Var2.j;
            int i8 = this.m1;
            Paint paint4 = (Paint) xmm0Var.i;
            Paint paint5 = (Paint) xmm0Var.h;
            Paint paint6 = (Paint) xmm0Var.k;
            Paint paint7 = (Paint) xmm0Var.g;
            ?? r14 = (MotionLayout) xmm0Var.m;
            HashMap map = this.d1;
            if (map == null || map.size() == 0) {
                return;
            }
            canvas2.save();
            if (!r14.isInEditMode() && (i8 & 1) == 2) {
                String str = r14.getContext().getResources().getResourceName(r14.Z0) + ":" + r14.getProgress();
                canvas2.drawText(str, 10.0f, r14.getHeight() - 30, (Paint) xmm0Var.j);
                canvas2.drawText(str, 11.0f, r14.getHeight() - 29, paint7);
            }
            Iterator it2 = map.values().iterator();
            while (it2.hasNext()) {
                a aVar = (a) it2.next();
                cnm0 cnm0Var2 = aVar.f;
                cnm0 cnm0Var3 = aVar.f;
                ArrayList arrayList3 = aVar.u;
                int iMax = cnm0Var2.b;
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    iMax = Math.max(iMax, ((cnm0) it3.next()).b);
                }
                int iMax2 = Math.max(iMax, aVar.g.b);
                if (i8 > 0 && iMax2 == 0) {
                    iMax2 = 1;
                }
                if (iMax2 != 0) {
                    float[] fArr = (float[]) xmm0Var.d;
                    int[] iArr = xmm0Var.a;
                    double[] dArrQ = aVar.j[0].q();
                    Iterator it4 = arrayList3.iterator();
                    int i9 = 0;
                    while (it4.hasNext()) {
                        iArr[i9] = ((cnm0) it4.next()).O0;
                        i9++;
                        it2 = it2;
                    }
                    Iterator it5 = it2;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < dArrQ.length) {
                        cnm0 cnm0Var4 = cnm0Var3;
                        int i12 = i10;
                        aVar.j[0].n(dArrQ[i10], aVar.f5p);
                        cnm0Var4.c(dArrQ[i12], aVar.o, aVar.f5p, fArr, i11);
                        i11 += 2;
                        i10 = i12 + 1;
                        cnm0Var3 = cnm0Var4;
                        arrayList3 = arrayList3;
                    }
                    cnm0 cnm0Var5 = cnm0Var3;
                    ArrayList arrayList4 = arrayList3;
                    xmm0Var.b = i11 / 2;
                    if (iMax2 >= 1) {
                        int i13 = i7 / 16;
                        float[] fArr2 = (float[]) xmm0Var.c;
                        if (fArr2 == null || fArr2.length != i13 * 2) {
                            xmm0Var.c = new float[i13 * 2];
                            xmm0Var.f = new Path();
                        }
                        canvas2.translate(1.0f, 1.0f);
                        paint7.setColor(1996488704);
                        paint6.setColor(1996488704);
                        paint5.setColor(1996488704);
                        paint4.setColor(1996488704);
                        float[] fArr3 = (float[]) xmm0Var.c;
                        float f = 1.0f / (i13 - 1);
                        HashMap map2 = aVar.y;
                        cfk1 cfk1Var = map2 == null ? null : (cfk1) map2.get("translationX");
                        float f2 = 1.0f;
                        HashMap map3 = aVar.y;
                        cfk1 cfk1Var2 = map3 == null ? null : (cfk1) map3.get("translationY");
                        i = i7;
                        HashMap map4 = aVar.z;
                        hdk1 hdk1Var = map4 == null ? null : (hdk1) map4.get("translationX");
                        HashMap map5 = aVar.z;
                        hdk1 hdk1Var2 = map5 == null ? null : (hdk1) map5.get("translationY");
                        int i14 = 0;
                        while (true) {
                            float f3 = Float.NaN;
                            float f4 = 0.0f;
                            if (i14 >= i13) {
                                break;
                            }
                            int i15 = i13;
                            float f5 = i14 * f;
                            float f6 = aVar.n;
                            if (f6 != f2) {
                                float f7 = aVar.m;
                                fMin = f5 < f7 ? 0.0f : f5;
                                i3 = i8;
                                paint2 = paint4;
                                if (fMin > f7 && fMin < 1.0d) {
                                    fMin = Math.min((fMin - f7) * f6, f2);
                                }
                            } else {
                                i3 = i8;
                                paint2 = paint4;
                                fMin = f5;
                            }
                            double d = fMin;
                            clv clvVar = cnm0Var2.a;
                            Iterator it6 = arrayList4.iterator();
                            while (it6.hasNext()) {
                                Iterator it7 = it6;
                                cnm0 cnm0Var6 = (cnm0) it6.next();
                                int i16 = i14;
                                clv clvVar2 = cnm0Var6.a;
                                if (clvVar2 != null) {
                                    float f8 = cnm0Var6.c;
                                    if (f8 < fMin) {
                                        f4 = f8;
                                        clvVar = clvVar2;
                                    } else if (Float.isNaN(f3)) {
                                        f3 = cnm0Var6.c;
                                    }
                                }
                                it6 = it7;
                                i14 = i16;
                            }
                            int i17 = i14;
                            if (clvVar != null) {
                                if (Float.isNaN(f3)) {
                                    f3 = 1.0f;
                                }
                                float f9 = f3 - f4;
                                dB = (((float) clvVar.b((fMin - f4) / f9)) * f9) + f4;
                            } else {
                                dB = d;
                            }
                            Paint paint8 = paint5;
                            aVar.j[0].n(dB, aVar.f5p);
                            o26 o26Var = aVar.k;
                            if (o26Var != null) {
                                double[] dArr = aVar.f5p;
                                cnm0Var = cnm0Var2;
                                if (dArr.length > 0) {
                                    o26Var.n(dB, dArr);
                                }
                            } else {
                                cnm0Var = cnm0Var2;
                            }
                            int i18 = i17 * 2;
                            cnm0Var5.c(dB, aVar.o, aVar.f5p, fArr3, i18);
                            if (hdk1Var != null) {
                                fArr3[i18] = hdk1Var.a(fMin) + fArr3[i18];
                            } else if (cfk1Var != null) {
                                fArr3[i18] = cfk1Var.a(fMin) + fArr3[i18];
                            }
                            if (hdk1Var2 != null) {
                                int i19 = i18 + 1;
                                fArr3[i19] = hdk1Var2.a(fMin) + fArr3[i19];
                            } else if (cfk1Var2 != null) {
                                int i20 = i18 + 1;
                                fArr3[i20] = cfk1Var2.a(fMin) + fArr3[i20];
                            }
                            i14 = i17 + 1;
                            i13 = i15;
                            i8 = i3;
                            paint4 = paint2;
                            paint5 = paint8;
                            cnm0Var2 = cnm0Var;
                            f2 = 1.0f;
                        }
                        cnm0 cnm0Var7 = cnm0Var2;
                        i2 = i8;
                        xmm0Var.d(canvas2, iMax2, xmm0Var.b, aVar);
                        paint7.setColor(-21965);
                        paint = paint5;
                        paint.setColor(-2067046);
                        paint6.setColor(-2067046);
                        paint4.setColor(-13391360);
                        canvas2.translate(-1.0f, -1.0f);
                        xmm0Var.d(canvas2, iMax2, xmm0Var.b, aVar);
                        char c = 5;
                        if (iMax2 == 5) {
                            float[] fArr4 = (float[]) xmm0Var.e;
                            ((Path) xmm0Var.f).reset();
                            int i21 = 0;
                            while (i21 <= 50) {
                                char c2 = c;
                                aVar.j[0].n(aVar.a(i21 / 50.0f, null), aVar.f5p);
                                int[] iArr2 = aVar.o;
                                double[] dArr2 = aVar.f5p;
                                cnm0 cnm0Var8 = cnm0Var7;
                                float fSin = cnm0Var8.e;
                                float fCos = cnm0Var8.f;
                                float f10 = cnm0Var8.g;
                                float f11 = cnm0Var8.h;
                                int i22 = 0;
                                while (true) {
                                    int[] iArr3 = iArr2;
                                    if (i22 >= iArr2.length) {
                                        break;
                                    }
                                    float f12 = (float) dArr2[i22];
                                    int i23 = iArr3[i22];
                                    if (i23 == 1) {
                                        fSin = f12;
                                    } else if (i23 == 2) {
                                        fCos = f12;
                                    } else if (i23 == 3) {
                                        f10 = f12;
                                    } else if (i23 == 4) {
                                        f11 = f12;
                                    }
                                    i22++;
                                    iArr2 = iArr3;
                                }
                                if (cnm0Var8.Z != null) {
                                    double d2 = fSin;
                                    double d3 = fCos;
                                    fSin = (float) (((Math.sin(d3) * d2) + 0.0d) - ((double) (f10 / 2.0f)));
                                    fCos = (float) ((0.0d - (Math.cos(d3) * d2)) - ((double) (f11 / 2.0f)));
                                }
                                float f13 = f10 + fSin;
                                float f14 = f11 + fCos;
                                Float.isNaN(Float.NaN);
                                Float.isNaN(Float.NaN);
                                float f15 = fSin + 0.0f;
                                float f16 = fCos + 0.0f;
                                float f17 = f13 + 0.0f;
                                float f18 = f14 + 0.0f;
                                fArr4[0] = f15;
                                fArr4[1] = f16;
                                fArr4[2] = f17;
                                fArr4[3] = f16;
                                fArr4[4] = f17;
                                fArr4[c2] = f18;
                                fArr4[6] = f15;
                                fArr4[7] = f18;
                                ((Path) xmm0Var.f).moveTo(f15, f16);
                                ((Path) xmm0Var.f).lineTo(fArr4[2], fArr4[3]);
                                ((Path) xmm0Var.f).lineTo(fArr4[4], fArr4[c2]);
                                ((Path) xmm0Var.f).lineTo(fArr4[6], fArr4[7]);
                                ((Path) xmm0Var.f).close();
                                i21++;
                                cnm0Var7 = cnm0Var8;
                                c = c2;
                            }
                            z = true;
                            paint7.setColor(1140850688);
                            canvas2 = canvas;
                            canvas2.translate(2.0f, 2.0f);
                            canvas2.drawPath((Path) xmm0Var.f, paint7);
                            canvas2.translate(-2.0f, -2.0f);
                            paint7.setColor(-65536);
                            canvas2.drawPath((Path) xmm0Var.f, paint7);
                        } else {
                            z = true;
                        }
                    } else {
                        z = true;
                        i = i7;
                        i2 = i8;
                        paint = paint5;
                    }
                    paint5 = paint;
                    it2 = it5;
                    i7 = i;
                    i8 = i2;
                }
            }
            canvas2.restore();
        }
    }

    public final void e(View view, int i) {
        eif1 eif1Var;
        int i2;
        inm0 inm0Var = this.T0;
        if (inm0Var != null) {
            float f = this.y1;
            if (f == 0.0f) {
                return;
            }
            float f2 = this.v1 / f;
            float f3 = this.w1 / f;
            hnm0 hnm0Var = inm0Var.c;
            if (hnm0Var == null || (eif1Var = hnm0Var.l) == null) {
                return;
            }
            float[] fArr = eif1Var.n;
            eif1Var.m = false;
            MotionLayout motionLayout = eif1Var.r;
            float progress = motionLayout.getProgress();
            eif1Var.r.B(eif1Var.d, progress, eif1Var.h, eif1Var.g, fArr);
            float f4 = eif1Var.k;
            float f5 = f4 != 0.0f ? (f2 * f4) / fArr[0] : (f3 * eif1Var.l) / fArr[1];
            if (!Float.isNaN(f5)) {
                progress += f5 / 3.0f;
            }
            if (progress == 0.0f || progress == 1.0f || (i2 = eif1Var.c) == 3) {
                return;
            }
            motionLayout.L(i2, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f5);
        }
    }

    public final void g(View view, int i, int i2, int[] iArr, int i3) {
        hnm0 hnm0Var;
        boolean z;
        float f;
        eif1 eif1Var;
        float f2;
        eif1 eif1Var2;
        eif1 eif1Var3;
        eif1 eif1Var4;
        int i4;
        inm0 inm0Var = this.T0;
        if (inm0Var == null || (hnm0Var = inm0Var.c) == null || (z = hnm0Var.o)) {
            return;
        }
        int i5 = -1;
        if (z || (eif1Var4 = hnm0Var.l) == null || (i4 = eif1Var4.e) == -1 || view.getId() == i4) {
            hnm0 hnm0Var2 = inm0Var.c;
            if ((hnm0Var2 == null || (eif1Var3 = hnm0Var2.l) == null) ? false : eif1Var3.u) {
                eif1 eif1Var5 = hnm0Var.l;
                if (eif1Var5 != null && (eif1Var5.w & 4) != 0) {
                    i5 = i2;
                }
                float f3 = this.g1;
                if ((f3 == 1.0f || f3 == 0.0f) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            eif1 eif1Var6 = hnm0Var.l;
            if (eif1Var6 == null || (eif1Var6.w & 1) == 0) {
                f = 0.0f;
            } else {
                float f4 = i;
                float f5 = i2;
                hnm0 hnm0Var3 = inm0Var.c;
                if (hnm0Var3 == null || (eif1Var2 = hnm0Var3.l) == null) {
                    f = 0.0f;
                    f2 = 0.0f;
                } else {
                    float[] fArr = eif1Var2.n;
                    f = 0.0f;
                    eif1Var2.r.B(eif1Var2.d, eif1Var2.r.getProgress(), eif1Var2.h, eif1Var2.g, fArr);
                    float f6 = eif1Var2.k;
                    if (f6 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f2 = (f4 * f6) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f2 = (f5 * eif1Var2.l) / fArr[1];
                    }
                }
                float f7 = this.h1;
                if ((f7 <= f && f2 < f) || (f7 >= 1.0f && f2 > f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new ai(view, (byte) 3));
                    return;
                }
            }
            float f8 = this.g1;
            long nanoTime = getNanoTime();
            float f9 = i;
            this.v1 = f9;
            float f10 = i2;
            this.w1 = f10;
            this.y1 = (float) ((nanoTime - this.x1) * 1.0E-9d);
            this.x1 = nanoTime;
            hnm0 hnm0Var4 = inm0Var.c;
            if (hnm0Var4 != null && (eif1Var = hnm0Var4.l) != null) {
                float[] fArr2 = eif1Var.n;
                MotionLayout motionLayout = eif1Var.r;
                float progress = motionLayout.getProgress();
                if (!eif1Var.m) {
                    eif1Var.m = true;
                    motionLayout.setProgress(progress);
                }
                eif1Var.r.B(eif1Var.d, progress, eif1Var.h, eif1Var.g, fArr2);
                if (Math.abs((eif1Var.l * fArr2[1]) + (eif1Var.k * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f11 = eif1Var.k;
                float fMax = Math.max(Math.min(progress + (f11 != f ? (f9 * f11) / fArr2[0] : (f10 * eif1Var.l) / fArr2[1]), 1.0f), f);
                if (fMax != motionLayout.getProgress()) {
                    motionLayout.setProgress(fMax);
                }
            }
            if (f8 != this.g1) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            A(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.u1 = true;
        }
    }

    public int[] getConstraintSetIds() {
        inm0 inm0Var = this.T0;
        if (inm0Var == null) {
            return null;
        }
        SparseArray sparseArray = inm0Var.g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.Y0;
    }

    public ArrayList<hnm0> getDefinedTransitions() {
        inm0 inm0Var = this.T0;
        if (inm0Var == null) {
            return null;
        }
        return inm0Var.d;
    }

    public mit getDesignTool() {
        mit mitVar = this.r1;
        if (mitVar != null) {
            return mitVar;
        }
        mit mitVar2 = new mit();
        this.r1 = mitVar2;
        return mitVar2;
    }

    public int getEndState() {
        return this.Z0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.h1;
    }

    public inm0 getScene() {
        return this.T0;
    }

    public int getStartState() {
        return this.X0;
    }

    public float getTargetPosition() {
        return this.j1;
    }

    public Bundle getTransitionState() {
        zmm0 zmm0Var = this.N1;
        if (zmm0Var == null) {
            zmm0Var = new zmm0(this);
            this.N1 = zmm0Var;
        }
        MotionLayout motionLayout = zmm0Var.e;
        zmm0Var.d = motionLayout.Z0;
        zmm0Var.c = motionLayout.X0;
        zmm0Var.b = motionLayout.getVelocity();
        zmm0Var.a = motionLayout.getProgress();
        zmm0 zmm0Var2 = this.N1;
        zmm0Var2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", zmm0Var2.a);
        bundle.putFloat("motion.velocity", zmm0Var2.b);
        bundle.putInt("motion.StartState", zmm0Var2.c);
        bundle.putInt("motion.EndState", zmm0Var2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        inm0 inm0Var = this.T0;
        if (inm0Var != null) {
            hnm0 hnm0Var = inm0Var.c;
            this.f1 = (hnm0Var != null ? hnm0Var.h : inm0Var.j) / 1000.0f;
        }
        return (long) (this.f1 * 1000.0f);
    }

    public float getVelocity() {
        return this.W0;
    }

    public final void j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.u1 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.u1 = false;
    }

    public final void k(View view, int i, int i2, int i3, int i4, int i5) {
    }

    public final boolean l(View view, View view2, int i, int i2) {
        hnm0 hnm0Var;
        eif1 eif1Var;
        inm0 inm0Var = this.T0;
        return (inm0Var == null || (hnm0Var = inm0Var.c) == null || (eif1Var = hnm0Var.l) == null || (eif1Var.w & 2) != 0) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        hnm0 hnm0Var;
        int i;
        super/*android.view.View*/.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        inm0 inm0Var = this.T0;
        if (inm0Var != null && (i = this.Y0) != -1) {
            kil kilVarB = inm0Var.b(i);
            inm0 inm0Var2 = this.T0;
            SparseArray sparseArray = inm0Var2.g;
            loop0: for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                SparseIntArray sparseIntArray = inm0Var2.i;
                int i3 = sparseIntArray.get(iKeyAt);
                int size = sparseIntArray.size();
                while (i3 > 0) {
                    if (i3 == iKeyAt) {
                        break loop0;
                    }
                    int i4 = size - 1;
                    if (size < 0) {
                        break loop0;
                    }
                    i3 = sparseIntArray.get(i3);
                    size = i4;
                }
                inm0Var2.l(iKeyAt, this);
            }
            if (kilVarB != null) {
                kilVarB.b(this);
            }
            this.X0 = this.Y0;
        }
        F();
        zmm0 zmm0Var = this.N1;
        if (zmm0Var != null) {
            if (this.Q1) {
                post(new an90(this, (byte) 11));
                return;
            } else {
                zmm0Var.a();
                return;
            }
        }
        inm0 inm0Var3 = this.T0;
        if (inm0Var3 == null || (hnm0Var = inm0Var3.c) == null || hnm0Var.n != 4) {
            return;
        }
        y(1.0f);
        this.O1 = null;
        setState(bnm0.b);
        setState(bnm0.c);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.ViewGroup, androidx.constraintlayout.motion.widget.MotionLayout] */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        eif1 eif1Var;
        int i;
        RectF rectFB;
        inm0 inm0Var = this.T0;
        if (inm0Var == null || !this.c1) {
            return false;
        }
        e821 e821Var = inm0Var.q;
        if (e821Var != null) {
            ?? r6 = (MotionLayout) e821Var.b;
            ArrayList<rhk1> arrayList = (ArrayList) e821Var.a;
            int currentState = r6.getCurrentState();
            if (currentState == -1) {
                z = false;
            } else {
                if (((HashSet) e821Var.c) == null) {
                    e821Var.c = new HashSet();
                    for (rhk1 rhk1Var : arrayList) {
                        int childCount = r6.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = r6.getChildAt(i2);
                            if (rhk1Var.c(childAt)) {
                                childAt.getId();
                                ((HashSet) e821Var.c).add(childAt);
                            }
                        }
                    }
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList arrayList2 = (ArrayList) e821Var.d;
                int i3 = 2;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    for (qhk1 qhk1Var : (ArrayList) e821Var.d) {
                        Rect rect2 = qhk1Var.l;
                        if (action != 1) {
                            if (action == 2) {
                                qhk1Var.c.b.getHitRect(rect2);
                                if (!rect2.contains((int) x, (int) y) && !qhk1Var.h) {
                                    qhk1Var.b();
                                }
                            }
                        } else if (!qhk1Var.h) {
                            qhk1Var.b();
                        }
                    }
                }
                z = false;
                if (action == 0 || action == 1) {
                    kil kilVarC = r6.C(currentState);
                    for (rhk1 rhk1Var2 : arrayList) {
                        int i4 = rhk1Var2.b;
                        if (i4 == 1) {
                            if (action == 0) {
                                for (View view : (HashSet) e821Var.c) {
                                    if (rhk1Var2.c(view)) {
                                        view.getHitRect(rect);
                                        if (rect.contains((int) x, (int) y)) {
                                            rhk1Var2.a(e821Var, r6, currentState, kilVarC, view);
                                        }
                                    }
                                }
                            }
                        } else if (i4 == i3) {
                            if (action == 1) {
                                while (r2.hasNext()) {
                                    if (rhk1Var2.c(view)) {
                                        view.getHitRect(rect);
                                        if (rect.contains((int) x, (int) y)) {
                                            rhk1Var2.a(e821Var, r6, currentState, kilVarC, view);
                                        }
                                    }
                                }
                            }
                        } else if (i4 == 3 && action == 0) {
                            while (r2.hasNext()) {
                                if (rhk1Var2.c(view)) {
                                    view.getHitRect(rect);
                                    if (rect.contains((int) x, (int) y)) {
                                        rhk1Var2.a(e821Var, r6, currentState, kilVarC, view);
                                    }
                                }
                            }
                        }
                        i3 = 2;
                    }
                }
            }
        } else {
            z = false;
        }
        hnm0 hnm0Var = this.T0.c;
        if (hnm0Var == null || hnm0Var.o || (eif1Var = hnm0Var.l) == null) {
            return z;
        }
        if ((motionEvent.getAction() == 0 && (rectFB = eif1Var.b(this, new RectF())) != null && !rectFB.contains(motionEvent.getX(), motionEvent.getY())) || (i = eif1Var.e) == -1) {
            return z;
        }
        View view2 = this.V1;
        if (view2 == null || view2.getId() != i) {
            this.V1 = findViewById(i);
        }
        View view3 = this.V1;
        if (view3 == null) {
            return z;
        }
        float left = view3.getLeft();
        float top = this.V1.getTop();
        float right = this.V1.getRight();
        float bottom = this.V1.getBottom();
        RectF rectF = this.U1;
        rectF.set(left, top, right, bottom);
        return (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || D((float) this.V1.getLeft(), (float) this.V1.getTop(), this.V1, motionEvent)) ? z : onTouchEvent(motionEvent);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.M1 = true;
        try {
            if (this.T0 == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.s1 != i5 || this.t1 != i6) {
                G();
                A(true);
            }
            this.s1 = i5;
            this.t1 = i6;
        } finally {
            this.M1 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00fb A[PHI: r11
      0x00fb: PHI (r11v4 float) = (r11v1 float), (r11v5 float) binds: [B:63:0x0105, B:57:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:77:0x012a  */
    /* JADX WARN: Code duplicated, block: B:79:0x012e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0134  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        boolean z;
        float f;
        float f2;
        if (this.T0 == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.a1 == i && this.b1 == i2) ? false : true;
        if (this.T1) {
            this.T1 = false;
            F();
            z3 = true;
        }
        if (((ConstraintLayout) this).h) {
            z3 = true;
        }
        this.a1 = i;
        this.b1 = i2;
        int iG = this.T0.g();
        hnm0 hnm0Var = this.T0.c;
        int i3 = hnm0Var == null ? -1 : hnm0Var.c;
        av7 av7Var = this.S1;
        if ((!z3 && iG == av7Var.a && i3 == av7Var.b) || this.X0 == -1) {
            if (z3) {
                super.onMeasure(i, i2);
            }
            z = true;
        } else {
            super.onMeasure(i, i2);
            av7Var.g(this.T0.b(iG), this.T0.b(i3));
            av7Var.j();
            av7Var.a = iG;
            av7Var.b = i3;
            z = false;
        }
        if (this.D1 || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            djl djlVar = ((ConstraintLayout) this).c;
            int iS = djlVar.s() + paddingRight;
            int iM = djlVar.m() + paddingBottom;
            int i4 = this.I1;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                int i5 = this.E1;
                iS = (int) ((this.K1 * (this.G1 - i5)) + i5);
                requestLayout();
            }
            int i6 = this.J1;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                int i7 = this.F1;
                iM = (int) ((this.K1 * (this.H1 - i7)) + i7);
                requestLayout();
            }
            setMeasuredDimension(iS, iM);
        }
        float fSignum = Math.signum(this.j1 - this.h1);
        long nanoTime = getNanoTime();
        vmm0 vmm0Var = this.U0;
        float interpolation = this.h1 + (!(vmm0Var instanceof xzb1) ? (((nanoTime - this.i1) * fSignum) * 1.0E-9f) / this.f1 : 0.0f);
        if (this.k1) {
            interpolation = this.j1;
        }
        if (fSignum > 0.0f) {
            f = this.j1;
            if (interpolation < f) {
                if (fSignum <= 0.0f) {
                    f = this.j1;
                    if (interpolation <= f) {
                        interpolation = f;
                    }
                }
                z2 = false;
            } else {
                interpolation = f;
            }
        } else {
            if (fSignum <= 0.0f) {
                f = this.j1;
                if (interpolation <= f) {
                    interpolation = f;
                }
            }
            z2 = false;
        }
        if (vmm0Var != null && !z2) {
            interpolation = this.o1 ? vmm0Var.getInterpolation((nanoTime - this.e1) * 1.0E-9f) : vmm0Var.getInterpolation(interpolation);
        }
        if (fSignum > 0.0f) {
            float f3 = this.j1;
            if (interpolation >= f3) {
                interpolation = f3;
            } else if (fSignum <= 0.0f) {
                f2 = this.j1;
                if (interpolation <= f2) {
                    interpolation = f2;
                }
            }
        } else if (fSignum <= 0.0f) {
            f2 = this.j1;
            if (interpolation <= f2) {
                interpolation = f2;
            }
        }
        this.K1 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.V0;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        float f4 = interpolation;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            a aVar = (a) this.d1.get(childAt);
            if (aVar != null) {
                aVar.d(f4, nanoTime2, childAt, this.L1);
            }
        }
        if (this.D1) {
            requestLayout();
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public final void onRtlPropertiesChanged(int i) {
        eif1 eif1Var;
        inm0 inm0Var = this.T0;
        if (inm0Var != null) {
            boolean zT = t();
            inm0Var.f68p = zT;
            hnm0 hnm0Var = inm0Var.c;
            if (hnm0Var == null || (eif1Var = hnm0Var.l) == null) {
                return;
            }
            eif1Var.c(zT);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x021e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0224  */
    /* JADX WARN: Code duplicated, block: B:115:0x0228  */
    /* JADX WARN: Code duplicated, block: B:119:0x0232  */
    /* JADX WARN: Code duplicated, block: B:121:0x0245  */
    /* JADX WARN: Code duplicated, block: B:123:0x024d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0256  */
    /* JADX WARN: Code duplicated, block: B:128:0x025d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0262  */
    /* JADX WARN: Code duplicated, block: B:133:0x027b  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:142:0x032a  */
    /* JADX WARN: Code duplicated, block: B:144:0x032f  */
    /* JADX WARN: Code duplicated, block: B:146:0x0335  */
    /* JADX WARN: Code duplicated, block: B:149:0x0341  */
    /* JADX WARN: Code duplicated, block: B:151:0x0345  */
    /* JADX WARN: Code duplicated, block: B:153:0x034d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0354  */
    /* JADX WARN: Code duplicated, block: B:157:0x035a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0374  */
    /* JADX WARN: Code duplicated, block: B:161:0x0399  */
    /* JADX WARN: Code duplicated, block: B:163:0x039d  */
    /* JADX WARN: Code duplicated, block: B:165:0x03a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:167:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:171:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:174:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:175:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:178:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:179:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:181:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:185:0x0408  */
    /* JADX WARN: Code duplicated, block: B:188:0x0413  */
    /* JADX WARN: Code duplicated, block: B:189:0x0419  */
    /* JADX WARN: Code duplicated, block: B:192:0x0420  */
    /* JADX WARN: Code duplicated, block: B:194:0x0427  */
    /* JADX WARN: Code duplicated, block: B:197:0x0442  */
    /* JADX WARN: Code duplicated, block: B:199:0x046f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0474  */
    /* JADX WARN: Code duplicated, block: B:202:0x04ab A[PHI: r7 r13
      0x04ab: PHI (r7v20 float) = (r7v15 float), (r7v26 float) binds: [B:200:0x0472, B:198:0x0468] A[DONT_GENERATE, DONT_INLINE]
      0x04ab: PHI (r13v12 float) = (r13v7 float), (r13v17 float) binds: [B:200:0x0472, B:198:0x0468] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:204:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:205:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:208:0x0508  */
    /* JADX WARN: Code duplicated, block: B:210:0x0517  */
    /* JADX WARN: Code duplicated, block: B:213:0x051e  */
    /* JADX WARN: Code duplicated, block: B:237:0x0576  */
    /* JADX WARN: Code duplicated, block: B:239:0x057e  */
    /* JADX WARN: Code duplicated, block: B:241:0x0584  */
    /* JADX WARN: Code duplicated, block: B:242:0x0589  */
    /* JADX WARN: Code duplicated, block: B:243:0x059a  */
    /* JADX WARN: Code duplicated, block: B:245:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:248:0x05af  */
    /* JADX WARN: Code duplicated, block: B:250:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:253:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:255:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:257:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:259:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:262:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:263:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:266:0x0634  */
    /* JADX WARN: Code duplicated, block: B:269:0x063f  */
    /* JADX WARN: Code duplicated, block: B:270:0x0643  */
    /* JADX WARN: Code duplicated, block: B:273:0x0656  */
    /* JADX WARN: Code duplicated, block: B:276:0x065f  */
    /* JADX WARN: Code duplicated, block: B:279:0x066e  */
    /* JADX WARN: Code duplicated, block: B:281:0x0674  */
    /* JADX WARN: Code duplicated, block: B:283:0x067a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:284:0x067c  */
    /* JADX WARN: Code duplicated, block: B:285:0x067e  */
    /* JADX WARN: Code duplicated, block: B:289:0x068b  */
    /* JADX WARN: Code duplicated, block: B:292:0x0694  */
    /* JADX WARN: Code duplicated, block: B:293:0x0699  */
    /* JADX WARN: Code duplicated, block: B:296:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:297:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:300:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:301:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:303:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:305:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:307:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:310:0x06df  */
    /* JADX WARN: Code duplicated, block: B:311:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:314:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:315:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:318:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:319:0x070a  */
    /* JADX WARN: Code duplicated, block: B:322:0x0731  */
    /* JADX WARN: Code duplicated, block: B:323:0x0733  */
    /* JADX WARN: Code duplicated, block: B:326:0x073b  */
    /* JADX WARN: Code duplicated, block: B:328:0x0741  */
    /* JADX WARN: Code duplicated, block: B:331:0x0747  */
    /* JADX WARN: Code duplicated, block: B:355:0x0792  */
    /* JADX WARN: Code duplicated, block: B:357:0x0798  */
    /* JADX WARN: Code duplicated, block: B:359:0x079e  */
    /* JADX WARN: Code duplicated, block: B:360:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:363:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:367:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:368:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:371:0x07dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, androidx.constraintlayout.motion.widget.MotionLayout] */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r30v0, types: [android.view.View, androidx.constraintlayout.motion.widget.MotionLayout] */
    /* JADX WARN: Type inference failed for: r4v14, types: [android.view.View, androidx.constraintlayout.motion.widget.MotionLayout] */
    /* JADX WARN: Type inference failed for: r4v48, types: [android.view.View, androidx.constraintlayout.motion.widget.MotionLayout] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hnm0 hnm0Var;
        ymm0 ymm0Var;
        VelocityTracker velocityTracker;
        ymm0 ymm0Var2;
        int i;
        eif1 eif1Var;
        float[] fArr;
        ymm0 ymm0Var3;
        ?? r11;
        boolean z;
        bnm0 bnm0Var;
        VelocityTracker velocityTracker2;
        int action;
        VelocityTracker velocityTracker3;
        VelocityTracker velocityTracker4;
        float xVelocity;
        VelocityTracker velocityTracker5;
        float yVelocity;
        float progress;
        int i2;
        ?? r4;
        char c;
        char c2;
        float f;
        float f2;
        float f3;
        float fAbs;
        float f4;
        int i3;
        float rawY;
        float rawX;
        float progress2;
        int i4;
        ?? r5;
        char c3;
        char c4;
        float f5;
        float fMax;
        float progress3;
        boolean z2;
        VelocityTracker velocityTracker6;
        VelocityTracker velocityTracker7;
        float xVelocity2;
        VelocityTracker velocityTracker8;
        float yVelocity2;
        float f6;
        int[] iArr;
        VelocityTracker velocityTracker9;
        int action2;
        VelocityTracker velocityTracker10;
        VelocityTracker velocityTracker11;
        float xVelocity3;
        VelocityTracker velocityTracker12;
        float yVelocity3;
        float progress4;
        float width;
        int i5;
        int i6;
        float f7;
        int top;
        int bottom;
        int i7;
        bnm0 bnm0Var2;
        int i8;
        float degrees;
        float f8;
        bnm0 bnm0Var3;
        int i9;
        float width2;
        float height;
        int i10;
        int i11;
        View viewFindViewById;
        float rawX2;
        float rawY2;
        double dAtan2;
        float fAtan2;
        float f9;
        float progress5;
        boolean z3;
        int i12;
        int i13;
        ?? r18;
        float fMax2;
        float progress6;
        boolean z4;
        VelocityTracker velocityTracker13;
        VelocityTracker velocityTracker14;
        float xVelocity4;
        VelocityTracker velocityTracker15;
        float yVelocity4;
        MotionEvent motionEvent2;
        hnm0 hnm0Var2;
        int iL;
        Iterator it;
        inm0 inm0Var = this.T0;
        if (inm0Var == null || !this.c1 || !inm0Var.n()) {
            return super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        inm0 inm0Var2 = this.T0;
        hnm0 hnm0Var3 = inm0Var2.c;
        if (hnm0Var3 != null && hnm0Var3.o) {
            return super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        ConstraintLayout constraintLayout = inm0Var2.a;
        RectF rectF = new RectF();
        ymm0 ymm0Var4 = inm0Var2.o;
        if (ymm0Var4 == null) {
            constraintLayout.getClass();
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            ymm0 ymm0Var5 = ymm0.c;
            ymm0Var5.b = velocityTrackerObtain;
            inm0Var2.o = ymm0Var5;
            ymm0Var4 = ymm0Var5;
        }
        VelocityTracker velocityTracker16 = (VelocityTracker) ymm0Var4.b;
        if (velocityTracker16 != null) {
            velocityTracker16.addMovement(motionEvent);
        }
        if (currentState != -1) {
            int action3 = motionEvent.getAction();
            if (action3 == 0) {
                inm0Var2.r = motionEvent.getRawX();
                inm0Var2.s = motionEvent.getRawY();
                inm0Var2.l = motionEvent;
                inm0Var2.m = false;
                eif1 eif1Var2 = inm0Var2.c.l;
                if (eif1Var2 != null) {
                    RectF rectFA = eif1Var2.a(constraintLayout, rectF);
                    if (rectFA == null || rectFA.contains(inm0Var2.l.getX(), inm0Var2.l.getY())) {
                        RectF rectFB = inm0Var2.c.l.b(constraintLayout, rectF);
                        if (rectFB == null || rectFB.contains(inm0Var2.l.getX(), inm0Var2.l.getY())) {
                            inm0Var2.n = false;
                        } else {
                            inm0Var2.n = true;
                        }
                        eif1 eif1Var3 = inm0Var2.c.l;
                        float f10 = inm0Var2.r;
                        float f11 = inm0Var2.s;
                        eif1Var3.f45p = f10;
                        eif1Var3.q = f11;
                    } else {
                        inm0Var2.l = null;
                        inm0Var2.m = true;
                    }
                }
            } else if (action3 == 2 && !inm0Var2.m) {
                float rawY3 = motionEvent.getRawY() - inm0Var2.s;
                float rawX3 = motionEvent.getRawX() - inm0Var2.r;
                if ((rawX3 != 0.0d || rawY3 != 0.0d) && (motionEvent2 = inm0Var2.l) != null) {
                    if (currentState != -1) {
                        up20 up20Var = inm0Var2.b;
                        if (up20Var == null || (iL = up20Var.l(currentState)) == -1) {
                            iL = currentState;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (hnm0 hnm0Var4 : inm0Var2.d) {
                            if (hnm0Var4.d == iL || hnm0Var4.c == iL) {
                                arrayList.add(hnm0Var4);
                            }
                        }
                        RectF rectF2 = new RectF();
                        Iterator it2 = arrayList.iterator();
                        float f12 = 0.0f;
                        hnm0Var2 = null;
                        while (it2.hasNext()) {
                            hnm0 hnm0Var5 = (hnm0) it2.next();
                            if (hnm0Var5.o) {
                                it = it2;
                            } else {
                                eif1 eif1Var4 = hnm0Var5.l;
                                if (eif1Var4 != null) {
                                    eif1Var4.c(inm0Var2.f68p);
                                    RectF rectFB2 = hnm0Var5.l.b(constraintLayout, rectF2);
                                    if (rectFB2 != null) {
                                        it = it2;
                                        if (!rectFB2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        }
                                    } else {
                                        it = it2;
                                    }
                                    RectF rectFA2 = hnm0Var5.l.a(constraintLayout, rectF2);
                                    if (rectFA2 == null || rectFA2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        eif1 eif1Var5 = hnm0Var5.l;
                                        float fAtan3 = (eif1Var5.l * rawY3) + (eif1Var5.k * rawX3);
                                        if (eif1Var5.j) {
                                            float x = motionEvent2.getX();
                                            hnm0Var5.l.getClass();
                                            float f13 = x - 0.5f;
                                            float y = motionEvent2.getY();
                                            hnm0Var5.l.getClass();
                                            float f14 = y - 0.5f;
                                            fAtan3 = ((float) (Math.atan2(rawY3 + f14, rawX3 + f13) - Math.atan2(f13, f14))) * 10.0f;
                                        }
                                        float f15 = fAtan3 * (hnm0Var5.c == currentState ? -1.0f : 1.1f);
                                        if (f15 > f12) {
                                            f12 = f15;
                                            hnm0Var2 = hnm0Var5;
                                        }
                                        it2 = it;
                                        rectF2 = rectF2;
                                    }
                                } else {
                                    it = it2;
                                    rectF2 = rectF2;
                                    f12 = f12;
                                    hnm0Var2 = hnm0Var2;
                                }
                                f12 = f12;
                                hnm0Var2 = hnm0Var2;
                                it2 = it;
                                rectF2 = rectF2;
                            }
                            it2 = it;
                        }
                    } else {
                        hnm0Var2 = inm0Var2.c;
                    }
                    if (hnm0Var2 != null) {
                        setTransition(hnm0Var2);
                        RectF rectFB3 = inm0Var2.c.l.b(constraintLayout, rectF);
                        inm0Var2.n = (rectFB3 == null || rectFB3.contains(inm0Var2.l.getX(), inm0Var2.l.getY())) ? false : true;
                        eif1 eif1Var6 = inm0Var2.c.l;
                        float f16 = inm0Var2.r;
                        float f17 = inm0Var2.s;
                        eif1Var6.f45p = f16;
                        eif1Var6.q = f17;
                        eif1Var6.m = false;
                    }
                    if (!inm0Var2.m) {
                        hnm0Var = inm0Var2.c;
                        if (hnm0Var != null) {
                            fArr = eif1Var.n;
                            if (!inm0Var2.n) {
                                ymm0Var3 = inm0Var2.o;
                                r11 = eif1Var.r;
                                z = eif1Var.j;
                                bnm0Var = bnm0.d;
                                if (z) {
                                    iArr = eif1Var.o;
                                    velocityTracker9 = (VelocityTracker) ymm0Var3.b;
                                    if (velocityTracker9 != null) {
                                        velocityTracker9.addMovement(motionEvent);
                                    }
                                    action2 = motionEvent.getAction();
                                    if (action2 == 0) {
                                        eif1Var.f45p = motionEvent.getRawX();
                                        eif1Var.q = motionEvent.getRawY();
                                        eif1Var.m = false;
                                    } else if (action2 == 1) {
                                        eif1Var.m = false;
                                        velocityTracker10 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker10 != null) {
                                            velocityTracker10.computeCurrentVelocity(16);
                                        }
                                        velocityTracker11 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker11 != null) {
                                            xVelocity3 = velocityTracker11.getXVelocity();
                                        } else {
                                            xVelocity3 = 0.0f;
                                        }
                                        velocityTracker12 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker12 != null) {
                                            yVelocity3 = velocityTracker12.getYVelocity();
                                        } else {
                                            yVelocity3 = 0.0f;
                                        }
                                        progress4 = r11.getProgress();
                                        width = r11.getWidth() / 2.0f;
                                        float height2 = r11.getHeight() / 2.0f;
                                        i5 = eif1Var.i;
                                        if (i5 != -1) {
                                            View viewFindViewById2 = r11.findViewById(i5);
                                            r11.getLocationOnScreen(iArr);
                                            width = iArr[0] + ((viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f);
                                            f7 = iArr[1];
                                            top = viewFindViewById2.getTop();
                                            bottom = viewFindViewById2.getBottom();
                                        } else {
                                            i6 = eif1Var.d;
                                            if (i6 != -1) {
                                                View viewFindViewById3 = r11.findViewById(((a) r11.d1.get(r11.findViewById(i6))).f.X);
                                                r11.getLocationOnScreen(iArr);
                                                width = iArr[0] + ((viewFindViewById3.getRight() + viewFindViewById3.getLeft()) / 2.0f);
                                                f7 = iArr[1];
                                                top = viewFindViewById3.getTop();
                                                bottom = viewFindViewById3.getBottom();
                                            } else {
                                                float rawX4 = motionEvent.getRawX() - width;
                                                float rawY4 = motionEvent.getRawY() - height2;
                                                double degrees2 = Math.toDegrees(Math.atan2(rawY4, rawX4));
                                                i7 = eif1Var.d;
                                                if (i7 != -1) {
                                                    bnm0Var2 = bnm0Var;
                                                    i8 = 6;
                                                    eif1Var.r.B(i7, progress4, eif1Var.h, eif1Var.g, fArr);
                                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                                } else {
                                                    bnm0Var2 = bnm0Var;
                                                    i8 = 6;
                                                    fArr[1] = 360.0f;
                                                }
                                                degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY4, xVelocity3 + rawX4)) - degrees2)) * 62.5f;
                                                if (Float.isNaN(degrees)) {
                                                    f8 = progress4;
                                                } else {
                                                    f8 = (((degrees * 3.0f) * eif1Var.v) / fArr[1]) + progress4;
                                                }
                                                if (f8 != 0.0f) {
                                                    bnm0Var3 = bnm0Var2;
                                                    if (0.0f < f8) {
                                                        r11.setState(bnm0Var3);
                                                    } else {
                                                        r11.setState(bnm0Var3);
                                                    }
                                                } else {
                                                    bnm0Var3 = bnm0Var2;
                                                    if (0.0f < f8) {
                                                        r11.setState(bnm0Var3);
                                                    } else {
                                                        r11.setState(bnm0Var3);
                                                    }
                                                }
                                            }
                                        }
                                        height2 = ((bottom + top) / 2.0f) + f7;
                                        float rawX5 = motionEvent.getRawX() - width;
                                        float rawY5 = motionEvent.getRawY() - height2;
                                        double degrees3 = Math.toDegrees(Math.atan2(rawY5, rawX5));
                                        i7 = eif1Var.d;
                                        if (i7 != -1) {
                                            bnm0Var2 = bnm0Var;
                                            i8 = 6;
                                            eif1Var.r.B(i7, progress4, eif1Var.h, eif1Var.g, fArr);
                                            fArr[1] = (float) Math.toDegrees(fArr[1]);
                                        } else {
                                            bnm0Var2 = bnm0Var;
                                            i8 = 6;
                                            fArr[1] = 360.0f;
                                        }
                                        degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY5, xVelocity3 + rawX5)) - degrees3)) * 62.5f;
                                        if (Float.isNaN(degrees)) {
                                            f8 = (((degrees * 3.0f) * eif1Var.v) / fArr[1]) + progress4;
                                        } else {
                                            f8 = progress4;
                                        }
                                        if (f8 != 0.0f) {
                                            bnm0Var3 = bnm0Var2;
                                            if (0.0f < f8) {
                                                r11.setState(bnm0Var3);
                                            } else {
                                                r11.setState(bnm0Var3);
                                            }
                                        } else {
                                            bnm0Var3 = bnm0Var2;
                                            if (0.0f < f8) {
                                                r11.setState(bnm0Var3);
                                            } else {
                                                r11.setState(bnm0Var3);
                                            }
                                        }
                                    } else if (action2 == 2) {
                                        motionEvent.getRawY();
                                        motionEvent.getRawX();
                                        width2 = r11.getWidth() / 2.0f;
                                        height = r11.getHeight() / 2.0f;
                                        i10 = eif1Var.i;
                                        if (i10 != -1) {
                                            View viewFindViewById4 = r11.findViewById(i10);
                                            r11.getLocationOnScreen(iArr);
                                            float right = iArr[0] + ((viewFindViewById4.getRight() + viewFindViewById4.getLeft()) / 2.0f);
                                            float bottom2 = iArr[1] + ((viewFindViewById4.getBottom() + viewFindViewById4.getTop()) / 2.0f);
                                            width2 = right;
                                            height = bottom2;
                                        } else {
                                            i11 = eif1Var.d;
                                            if (i11 != -1) {
                                                r11.getLocationOnScreen(iArr);
                                                width2 = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                                height = ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f) + iArr[1];
                                            }
                                        }
                                        rawX2 = motionEvent.getRawX() - width2;
                                        rawY2 = motionEvent.getRawY() - height;
                                        dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width2);
                                        fAtan2 = (float) (((dAtan2 - Math.atan2(eif1Var.q - height, eif1Var.f45p - width2)) * 180.0d) / 3.141592653589793d);
                                        if (fAtan2 > 330.0f) {
                                            fAtan2 -= 360.0f;
                                        } else if (fAtan2 < -330.0f) {
                                            fAtan2 += 360.0f;
                                        }
                                        f9 = fAtan2;
                                        if (Math.abs(f9) <= 0.01d) {
                                            progress5 = r11.getProgress();
                                            if (eif1Var.m) {
                                                z3 = true;
                                            } else {
                                                z3 = true;
                                                eif1Var.m = true;
                                                r11.setProgress(progress5);
                                            }
                                            i12 = eif1Var.d;
                                            if (i12 != -1) {
                                                boolean z5 = z3;
                                                i13 = 1000;
                                                eif1Var.r.B(i12, progress5, eif1Var.h, eif1Var.g, fArr);
                                                fArr[z5 ? 1 : 0] = (float) Math.toDegrees(fArr[z5 ? 1 : 0]);
                                                r18 = z5;
                                            } else {
                                                boolean z6 = z3;
                                                i13 = 1000;
                                                fArr[z6 ? 1 : 0] = 360.0f;
                                                r18 = z6;
                                            }
                                            fMax2 = Math.max(Math.min(((f9 * eif1Var.v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                            progress6 = r11.getProgress();
                                            if (fMax2 != progress6) {
                                                if (progress6 != 0.0f) {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    r11.z(z4);
                                                } else {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    r11.z(z4);
                                                }
                                                r11.setProgress(fMax2);
                                                velocityTracker13 = (VelocityTracker) ymm0Var3.b;
                                                if (velocityTracker13 != null) {
                                                    velocityTracker13.computeCurrentVelocity(i13);
                                                }
                                                velocityTracker14 = (VelocityTracker) ymm0Var3.b;
                                                if (velocityTracker14 != null) {
                                                    xVelocity4 = velocityTracker14.getXVelocity();
                                                } else {
                                                    xVelocity4 = 0.0f;
                                                }
                                                velocityTracker15 = (VelocityTracker) ymm0Var3.b;
                                                if (velocityTracker15 != null) {
                                                    yVelocity4 = velocityTracker15.getYVelocity();
                                                } else {
                                                    yVelocity4 = 0.0f;
                                                }
                                                double d = yVelocity4;
                                                double d2 = xVelocity4;
                                                r11.W0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d, d2) - dAtan2) * Math.hypot(d, d2)) / Math.hypot(rawX2, rawY2)));
                                            } else {
                                                r11.W0 = 0.0f;
                                            }
                                            eif1Var.f45p = motionEvent.getRawX();
                                            eif1Var.q = motionEvent.getRawY();
                                        } else {
                                            progress5 = r11.getProgress();
                                            if (eif1Var.m) {
                                                z3 = true;
                                                eif1Var.m = true;
                                                r11.setProgress(progress5);
                                            } else {
                                                z3 = true;
                                            }
                                            i12 = eif1Var.d;
                                            if (i12 != -1) {
                                                boolean z7 = z3;
                                                i13 = 1000;
                                                eif1Var.r.B(i12, progress5, eif1Var.h, eif1Var.g, fArr);
                                                fArr[z7 ? 1 : 0] = (float) Math.toDegrees(fArr[z7 ? 1 : 0]);
                                                r18 = z7;
                                            } else {
                                                boolean z8 = z3;
                                                i13 = 1000;
                                                fArr[z8 ? 1 : 0] = 360.0f;
                                                r18 = z8;
                                            }
                                            fMax2 = Math.max(Math.min(((f9 * eif1Var.v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                            progress6 = r11.getProgress();
                                            if (fMax2 != progress6) {
                                                if (progress6 != 0.0f) {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    r11.z(z4);
                                                } else {
                                                    if (progress6 == 0.0f) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    r11.z(z4);
                                                }
                                                r11.setProgress(fMax2);
                                                velocityTracker13 = (VelocityTracker) ymm0Var3.b;
                                                if (velocityTracker13 != null) {
                                                    velocityTracker13.computeCurrentVelocity(i13);
                                                }
                                                velocityTracker14 = (VelocityTracker) ymm0Var3.b;
                                                if (velocityTracker14 != null) {
                                                    xVelocity4 = velocityTracker14.getXVelocity();
                                                } else {
                                                    xVelocity4 = 0.0f;
                                                }
                                                velocityTracker15 = (VelocityTracker) ymm0Var3.b;
                                                if (velocityTracker15 != null) {
                                                    yVelocity4 = velocityTracker15.getYVelocity();
                                                } else {
                                                    yVelocity4 = 0.0f;
                                                }
                                                double d3 = yVelocity4;
                                                double d4 = xVelocity4;
                                                r11.W0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d3, d4) - dAtan2) * Math.hypot(d3, d4)) / Math.hypot(rawX2, rawY2)));
                                            } else {
                                                r11.W0 = 0.0f;
                                            }
                                            eif1Var.f45p = motionEvent.getRawX();
                                            eif1Var.q = motionEvent.getRawY();
                                        }
                                    }
                                } else {
                                    velocityTracker2 = (VelocityTracker) ymm0Var3.b;
                                    if (velocityTracker2 != null) {
                                        velocityTracker2.addMovement(motionEvent);
                                    }
                                    action = motionEvent.getAction();
                                    if (action == 0) {
                                        eif1Var.f45p = motionEvent.getRawX();
                                        eif1Var.q = motionEvent.getRawY();
                                        eif1Var.m = false;
                                    } else if (action == 1) {
                                        eif1Var.m = false;
                                        velocityTracker3 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker3 != null) {
                                            velocityTracker3.computeCurrentVelocity(1000);
                                        }
                                        velocityTracker4 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker4 != null) {
                                            xVelocity = velocityTracker4.getXVelocity();
                                        } else {
                                            xVelocity = 0.0f;
                                        }
                                        velocityTracker5 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker5 != null) {
                                            yVelocity = velocityTracker5.getYVelocity();
                                        } else {
                                            yVelocity = 0.0f;
                                        }
                                        progress = r11.getProgress();
                                        i2 = eif1Var.d;
                                        r4 = eif1Var.r;
                                        if (i2 != -1) {
                                            r4.B(i2, progress, eif1Var.h, eif1Var.g, fArr);
                                            c = 1;
                                            c2 = 0;
                                        } else {
                                            float fMin = Math.min(r4.getWidth(), r11.getHeight());
                                            c = 1;
                                            fArr[1] = eif1Var.l * fMin;
                                            c2 = 0;
                                            fArr[0] = fMin * eif1Var.k;
                                        }
                                        f = eif1Var.k;
                                        f2 = fArr[c2];
                                        f3 = fArr[c];
                                        if (f != 0.0f) {
                                            fAbs = xVelocity / f2;
                                        } else {
                                            fAbs = yVelocity / f3;
                                        }
                                        if (Float.isNaN(fAbs)) {
                                            f4 = progress;
                                        } else {
                                            f4 = (fAbs / 3.0f) + progress;
                                        }
                                        if (f4 == 0.0f) {
                                            if (0.0f < f4) {
                                                r11.setState(bnm0Var);
                                            } else {
                                                r11.setState(bnm0Var);
                                            }
                                        } else if (0.0f < f4) {
                                            r11.setState(bnm0Var);
                                        } else {
                                            r11.setState(bnm0Var);
                                        }
                                    } else if (action == 2) {
                                        rawY = motionEvent.getRawY() - eif1Var.q;
                                        rawX = motionEvent.getRawX() - eif1Var.f45p;
                                        if (Math.abs((eif1Var.l * rawY) + (eif1Var.k * rawX)) <= eif1Var.x) {
                                            progress2 = r11.getProgress();
                                            if (!eif1Var.m) {
                                                eif1Var.m = true;
                                                r11.setProgress(progress2);
                                            }
                                            i4 = eif1Var.d;
                                            r5 = eif1Var.r;
                                            if (i4 != -1) {
                                                r5.B(i4, progress2, eif1Var.h, eif1Var.g, fArr);
                                                c3 = 1;
                                                c4 = 0;
                                            } else {
                                                float fMin2 = Math.min(r5.getWidth(), r11.getHeight());
                                                c3 = 1;
                                                fArr[1] = eif1Var.l * fMin2;
                                                c4 = 0;
                                                fArr[0] = fMin2 * eif1Var.k;
                                            }
                                            if (Math.abs(((eif1Var.l * fArr[c3]) + (eif1Var.k * fArr[c4])) * eif1Var.v) < 0.01d) {
                                                fArr[0] = 0.01f;
                                                fArr[c3] = 0.01f;
                                            }
                                            if (eif1Var.k != 0.0f) {
                                                f5 = rawX / fArr[0];
                                            } else {
                                                f5 = rawY / fArr[c3];
                                            }
                                            fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
                                            if (eif1Var.c == 6) {
                                                fMax = Math.max(fMax, 0.01f);
                                            }
                                            if (eif1Var.c == 7) {
                                                fMax = Math.min(fMax, 0.99f);
                                            }
                                            progress3 = r11.getProgress();
                                            if (fMax != progress3) {
                                                if (progress3 != 0.0f) {
                                                    if (progress3 == 0.0f) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    r11.z(z2);
                                                } else {
                                                    if (progress3 == 0.0f) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    r11.z(z2);
                                                }
                                                r11.setProgress(fMax);
                                                velocityTracker6 = (VelocityTracker) ymm0Var3.b;
                                                if (velocityTracker6 != null) {
                                                    velocityTracker6.computeCurrentVelocity(1000);
                                                }
                                                velocityTracker7 = (VelocityTracker) ymm0Var3.b;
                                                if (velocityTracker7 != null) {
                                                    xVelocity2 = velocityTracker7.getXVelocity();
                                                } else {
                                                    xVelocity2 = 0.0f;
                                                }
                                                velocityTracker8 = (VelocityTracker) ymm0Var3.b;
                                                if (velocityTracker8 != null) {
                                                    yVelocity2 = velocityTracker8.getYVelocity();
                                                } else {
                                                    yVelocity2 = 0.0f;
                                                }
                                                if (eif1Var.k != 0.0f) {
                                                    f6 = xVelocity2 / fArr[0];
                                                } else {
                                                    f6 = yVelocity2 / fArr[1];
                                                }
                                                r11.W0 = f6;
                                            } else {
                                                r11.W0 = 0.0f;
                                            }
                                            eif1Var.f45p = motionEvent.getRawX();
                                            eif1Var.q = motionEvent.getRawY();
                                        } else {
                                            progress2 = r11.getProgress();
                                            if (!eif1Var.m) {
                                                eif1Var.m = true;
                                                r11.setProgress(progress2);
                                            }
                                            i4 = eif1Var.d;
                                            r5 = eif1Var.r;
                                            if (i4 != -1) {
                                                r5.B(i4, progress2, eif1Var.h, eif1Var.g, fArr);
                                                c3 = 1;
                                                c4 = 0;
                                            } else {
                                                float fMin3 = Math.min(r5.getWidth(), r11.getHeight());
                                                c3 = 1;
                                                fArr[1] = eif1Var.l * fMin3;
                                                c4 = 0;
                                                fArr[0] = fMin3 * eif1Var.k;
                                            }
                                            if (Math.abs(((eif1Var.l * fArr[c3]) + (eif1Var.k * fArr[c4])) * eif1Var.v) < 0.01d) {
                                                fArr[0] = 0.01f;
                                                fArr[c3] = 0.01f;
                                            }
                                            if (eif1Var.k != 0.0f) {
                                                f5 = rawX / fArr[0];
                                            } else {
                                                f5 = rawY / fArr[c3];
                                            }
                                            fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
                                            if (eif1Var.c == 6) {
                                                fMax = Math.max(fMax, 0.01f);
                                            }
                                            if (eif1Var.c == 7) {
                                                fMax = Math.min(fMax, 0.99f);
                                            }
                                            progress3 = r11.getProgress();
                                            if (fMax != progress3) {
                                                if (progress3 != 0.0f) {
                                                    if (progress3 == 0.0f) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    r11.z(z2);
                                                } else {
                                                    if (progress3 == 0.0f) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    r11.z(z2);
                                                }
                                                r11.setProgress(fMax);
                                                velocityTracker6 = (VelocityTracker) ymm0Var3.b;
                                                if (velocityTracker6 != null) {
                                                    velocityTracker6.computeCurrentVelocity(1000);
                                                }
                                                velocityTracker7 = (VelocityTracker) ymm0Var3.b;
                                                if (velocityTracker7 != null) {
                                                    xVelocity2 = velocityTracker7.getXVelocity();
                                                } else {
                                                    xVelocity2 = 0.0f;
                                                }
                                                velocityTracker8 = (VelocityTracker) ymm0Var3.b;
                                                if (velocityTracker8 != null) {
                                                    yVelocity2 = velocityTracker8.getYVelocity();
                                                } else {
                                                    yVelocity2 = 0.0f;
                                                }
                                                if (eif1Var.k != 0.0f) {
                                                    f6 = xVelocity2 / fArr[0];
                                                } else {
                                                    f6 = yVelocity2 / fArr[1];
                                                }
                                                r11.W0 = f6;
                                            } else {
                                                r11.W0 = 0.0f;
                                            }
                                            eif1Var.f45p = motionEvent.getRawX();
                                            eif1Var.q = motionEvent.getRawY();
                                        }
                                    }
                                }
                            }
                        }
                        inm0Var2.r = motionEvent.getRawX();
                        inm0Var2.s = motionEvent.getRawY();
                        if (motionEvent.getAction() == 1) {
                            velocityTracker = (VelocityTracker) ymm0Var.b;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                ymm0Var2 = null;
                                ymm0Var.b = null;
                            } else {
                                ymm0Var2 = null;
                            }
                            inm0Var2.o = ymm0Var2;
                            i = this.Y0;
                            if (i != -1) {
                                inm0Var2.a(i, this);
                            }
                        }
                    }
                }
            } else if (!inm0Var2.m) {
                hnm0Var = inm0Var2.c;
                if (hnm0Var != null) {
                    fArr = eif1Var.n;
                    if (!inm0Var2.n) {
                        ymm0Var3 = inm0Var2.o;
                        r11 = eif1Var.r;
                        z = eif1Var.j;
                        bnm0Var = bnm0.d;
                        if (z) {
                            iArr = eif1Var.o;
                            velocityTracker9 = (VelocityTracker) ymm0Var3.b;
                            if (velocityTracker9 != null) {
                                velocityTracker9.addMovement(motionEvent);
                            }
                            action2 = motionEvent.getAction();
                            if (action2 == 0) {
                                eif1Var.f45p = motionEvent.getRawX();
                                eif1Var.q = motionEvent.getRawY();
                                eif1Var.m = false;
                            } else if (action2 == 1) {
                                eif1Var.m = false;
                                velocityTracker10 = (VelocityTracker) ymm0Var3.b;
                                if (velocityTracker10 != null) {
                                    velocityTracker10.computeCurrentVelocity(16);
                                }
                                velocityTracker11 = (VelocityTracker) ymm0Var3.b;
                                if (velocityTracker11 != null) {
                                    xVelocity3 = velocityTracker11.getXVelocity();
                                } else {
                                    xVelocity3 = 0.0f;
                                }
                                velocityTracker12 = (VelocityTracker) ymm0Var3.b;
                                if (velocityTracker12 != null) {
                                    yVelocity3 = velocityTracker12.getYVelocity();
                                } else {
                                    yVelocity3 = 0.0f;
                                }
                                progress4 = r11.getProgress();
                                width = r11.getWidth() / 2.0f;
                                float height3 = r11.getHeight() / 2.0f;
                                i5 = eif1Var.i;
                                if (i5 != -1) {
                                    View viewFindViewById5 = r11.findViewById(i5);
                                    r11.getLocationOnScreen(iArr);
                                    width = iArr[0] + ((viewFindViewById5.getRight() + viewFindViewById5.getLeft()) / 2.0f);
                                    f7 = iArr[1];
                                    top = viewFindViewById5.getTop();
                                    bottom = viewFindViewById5.getBottom();
                                } else {
                                    i6 = eif1Var.d;
                                    if (i6 != -1) {
                                        View viewFindViewById6 = r11.findViewById(((a) r11.d1.get(r11.findViewById(i6))).f.X);
                                        r11.getLocationOnScreen(iArr);
                                        width = iArr[0] + ((viewFindViewById6.getRight() + viewFindViewById6.getLeft()) / 2.0f);
                                        f7 = iArr[1];
                                        top = viewFindViewById6.getTop();
                                        bottom = viewFindViewById6.getBottom();
                                    } else {
                                        float rawX6 = motionEvent.getRawX() - width;
                                        float rawY6 = motionEvent.getRawY() - height3;
                                        double degrees4 = Math.toDegrees(Math.atan2(rawY6, rawX6));
                                        i7 = eif1Var.d;
                                        if (i7 != -1) {
                                            bnm0Var2 = bnm0Var;
                                            i8 = 6;
                                            eif1Var.r.B(i7, progress4, eif1Var.h, eif1Var.g, fArr);
                                            fArr[1] = (float) Math.toDegrees(fArr[1]);
                                        } else {
                                            bnm0Var2 = bnm0Var;
                                            i8 = 6;
                                            fArr[1] = 360.0f;
                                        }
                                        degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY6, xVelocity3 + rawX6)) - degrees4)) * 62.5f;
                                        if (Float.isNaN(degrees)) {
                                            f8 = (((degrees * 3.0f) * eif1Var.v) / fArr[1]) + progress4;
                                        } else {
                                            f8 = progress4;
                                        }
                                        if (f8 != 0.0f) {
                                            bnm0Var3 = bnm0Var2;
                                            if (0.0f < f8) {
                                                r11.setState(bnm0Var3);
                                            } else {
                                                r11.setState(bnm0Var3);
                                            }
                                        } else {
                                            bnm0Var3 = bnm0Var2;
                                            if (0.0f < f8) {
                                                r11.setState(bnm0Var3);
                                            } else {
                                                r11.setState(bnm0Var3);
                                            }
                                        }
                                    }
                                }
                                height3 = ((bottom + top) / 2.0f) + f7;
                                float rawX7 = motionEvent.getRawX() - width;
                                float rawY7 = motionEvent.getRawY() - height3;
                                double degrees5 = Math.toDegrees(Math.atan2(rawY7, rawX7));
                                i7 = eif1Var.d;
                                if (i7 != -1) {
                                    bnm0Var2 = bnm0Var;
                                    i8 = 6;
                                    eif1Var.r.B(i7, progress4, eif1Var.h, eif1Var.g, fArr);
                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                } else {
                                    bnm0Var2 = bnm0Var;
                                    i8 = 6;
                                    fArr[1] = 360.0f;
                                }
                                degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY7, xVelocity3 + rawX7)) - degrees5)) * 62.5f;
                                if (Float.isNaN(degrees)) {
                                    f8 = (((degrees * 3.0f) * eif1Var.v) / fArr[1]) + progress4;
                                } else {
                                    f8 = progress4;
                                }
                                if (f8 != 0.0f) {
                                    bnm0Var3 = bnm0Var2;
                                    if (0.0f < f8) {
                                        r11.setState(bnm0Var3);
                                    } else {
                                        r11.setState(bnm0Var3);
                                    }
                                } else {
                                    bnm0Var3 = bnm0Var2;
                                    if (0.0f < f8) {
                                        r11.setState(bnm0Var3);
                                    } else {
                                        r11.setState(bnm0Var3);
                                    }
                                }
                            } else if (action2 == 2) {
                                motionEvent.getRawY();
                                motionEvent.getRawX();
                                width2 = r11.getWidth() / 2.0f;
                                height = r11.getHeight() / 2.0f;
                                i10 = eif1Var.i;
                                if (i10 != -1) {
                                    View viewFindViewById7 = r11.findViewById(i10);
                                    r11.getLocationOnScreen(iArr);
                                    float right2 = iArr[0] + ((viewFindViewById7.getRight() + viewFindViewById7.getLeft()) / 2.0f);
                                    float bottom3 = iArr[1] + ((viewFindViewById7.getBottom() + viewFindViewById7.getTop()) / 2.0f);
                                    width2 = right2;
                                    height = bottom3;
                                } else {
                                    i11 = eif1Var.d;
                                    if (i11 != -1) {
                                        r11.getLocationOnScreen(iArr);
                                        width2 = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                        height = ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f) + iArr[1];
                                    }
                                }
                                rawX2 = motionEvent.getRawX() - width2;
                                rawY2 = motionEvent.getRawY() - height;
                                dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width2);
                                fAtan2 = (float) (((dAtan2 - Math.atan2(eif1Var.q - height, eif1Var.f45p - width2)) * 180.0d) / 3.141592653589793d);
                                if (fAtan2 > 330.0f) {
                                    fAtan2 -= 360.0f;
                                } else if (fAtan2 < -330.0f) {
                                    fAtan2 += 360.0f;
                                }
                                f9 = fAtan2;
                                if (Math.abs(f9) <= 0.01d) {
                                    progress5 = r11.getProgress();
                                    if (eif1Var.m) {
                                        z3 = true;
                                        eif1Var.m = true;
                                        r11.setProgress(progress5);
                                    } else {
                                        z3 = true;
                                    }
                                    i12 = eif1Var.d;
                                    if (i12 != -1) {
                                        boolean z9 = z3;
                                        i13 = 1000;
                                        eif1Var.r.B(i12, progress5, eif1Var.h, eif1Var.g, fArr);
                                        fArr[z9 ? 1 : 0] = (float) Math.toDegrees(fArr[z9 ? 1 : 0]);
                                        r18 = z9;
                                    } else {
                                        boolean z10 = z3;
                                        i13 = 1000;
                                        fArr[z10 ? 1 : 0] = 360.0f;
                                        r18 = z10;
                                    }
                                    fMax2 = Math.max(Math.min(((f9 * eif1Var.v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                    progress6 = r11.getProgress();
                                    if (fMax2 != progress6) {
                                        if (progress6 != 0.0f) {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            r11.z(z4);
                                        } else {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            r11.z(z4);
                                        }
                                        r11.setProgress(fMax2);
                                        velocityTracker13 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker13 != null) {
                                            velocityTracker13.computeCurrentVelocity(i13);
                                        }
                                        velocityTracker14 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker14 != null) {
                                            xVelocity4 = velocityTracker14.getXVelocity();
                                        } else {
                                            xVelocity4 = 0.0f;
                                        }
                                        velocityTracker15 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker15 != null) {
                                            yVelocity4 = velocityTracker15.getYVelocity();
                                        } else {
                                            yVelocity4 = 0.0f;
                                        }
                                        double d5 = yVelocity4;
                                        double d6 = xVelocity4;
                                        r11.W0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d5, d6) - dAtan2) * Math.hypot(d5, d6)) / Math.hypot(rawX2, rawY2)));
                                    } else {
                                        r11.W0 = 0.0f;
                                    }
                                    eif1Var.f45p = motionEvent.getRawX();
                                    eif1Var.q = motionEvent.getRawY();
                                } else {
                                    progress5 = r11.getProgress();
                                    if (eif1Var.m) {
                                        z3 = true;
                                        eif1Var.m = true;
                                        r11.setProgress(progress5);
                                    } else {
                                        z3 = true;
                                    }
                                    i12 = eif1Var.d;
                                    if (i12 != -1) {
                                        boolean z11 = z3;
                                        i13 = 1000;
                                        eif1Var.r.B(i12, progress5, eif1Var.h, eif1Var.g, fArr);
                                        fArr[z11 ? 1 : 0] = (float) Math.toDegrees(fArr[z11 ? 1 : 0]);
                                        r18 = z11;
                                    } else {
                                        boolean z12 = z3;
                                        i13 = 1000;
                                        fArr[z12 ? 1 : 0] = 360.0f;
                                        r18 = z12;
                                    }
                                    fMax2 = Math.max(Math.min(((f9 * eif1Var.v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                    progress6 = r11.getProgress();
                                    if (fMax2 != progress6) {
                                        if (progress6 != 0.0f) {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            r11.z(z4);
                                        } else {
                                            if (progress6 == 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            r11.z(z4);
                                        }
                                        r11.setProgress(fMax2);
                                        velocityTracker13 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker13 != null) {
                                            velocityTracker13.computeCurrentVelocity(i13);
                                        }
                                        velocityTracker14 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker14 != null) {
                                            xVelocity4 = velocityTracker14.getXVelocity();
                                        } else {
                                            xVelocity4 = 0.0f;
                                        }
                                        velocityTracker15 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker15 != null) {
                                            yVelocity4 = velocityTracker15.getYVelocity();
                                        } else {
                                            yVelocity4 = 0.0f;
                                        }
                                        double d7 = yVelocity4;
                                        double d8 = xVelocity4;
                                        r11.W0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d7, d8) - dAtan2) * Math.hypot(d7, d8)) / Math.hypot(rawX2, rawY2)));
                                    } else {
                                        r11.W0 = 0.0f;
                                    }
                                    eif1Var.f45p = motionEvent.getRawX();
                                    eif1Var.q = motionEvent.getRawY();
                                }
                            }
                        } else {
                            velocityTracker2 = (VelocityTracker) ymm0Var3.b;
                            if (velocityTracker2 != null) {
                                velocityTracker2.addMovement(motionEvent);
                            }
                            action = motionEvent.getAction();
                            if (action == 0) {
                                eif1Var.f45p = motionEvent.getRawX();
                                eif1Var.q = motionEvent.getRawY();
                                eif1Var.m = false;
                            } else if (action == 1) {
                                eif1Var.m = false;
                                velocityTracker3 = (VelocityTracker) ymm0Var3.b;
                                if (velocityTracker3 != null) {
                                    velocityTracker3.computeCurrentVelocity(1000);
                                }
                                velocityTracker4 = (VelocityTracker) ymm0Var3.b;
                                if (velocityTracker4 != null) {
                                    xVelocity = velocityTracker4.getXVelocity();
                                } else {
                                    xVelocity = 0.0f;
                                }
                                velocityTracker5 = (VelocityTracker) ymm0Var3.b;
                                if (velocityTracker5 != null) {
                                    yVelocity = velocityTracker5.getYVelocity();
                                } else {
                                    yVelocity = 0.0f;
                                }
                                progress = r11.getProgress();
                                i2 = eif1Var.d;
                                r4 = eif1Var.r;
                                if (i2 != -1) {
                                    r4.B(i2, progress, eif1Var.h, eif1Var.g, fArr);
                                    c = 1;
                                    c2 = 0;
                                } else {
                                    float fMin4 = Math.min(r4.getWidth(), r11.getHeight());
                                    c = 1;
                                    fArr[1] = eif1Var.l * fMin4;
                                    c2 = 0;
                                    fArr[0] = fMin4 * eif1Var.k;
                                }
                                f = eif1Var.k;
                                f2 = fArr[c2];
                                f3 = fArr[c];
                                if (f != 0.0f) {
                                    fAbs = xVelocity / f2;
                                } else {
                                    fAbs = yVelocity / f3;
                                }
                                if (Float.isNaN(fAbs)) {
                                    f4 = (fAbs / 3.0f) + progress;
                                } else {
                                    f4 = progress;
                                }
                                if (f4 == 0.0f) {
                                    if (0.0f < f4) {
                                        r11.setState(bnm0Var);
                                    } else {
                                        r11.setState(bnm0Var);
                                    }
                                } else if (0.0f < f4) {
                                    r11.setState(bnm0Var);
                                } else {
                                    r11.setState(bnm0Var);
                                }
                            } else if (action == 2) {
                                rawY = motionEvent.getRawY() - eif1Var.q;
                                rawX = motionEvent.getRawX() - eif1Var.f45p;
                                if (Math.abs((eif1Var.l * rawY) + (eif1Var.k * rawX)) <= eif1Var.x) {
                                    progress2 = r11.getProgress();
                                    if (!eif1Var.m) {
                                        eif1Var.m = true;
                                        r11.setProgress(progress2);
                                    }
                                    i4 = eif1Var.d;
                                    r5 = eif1Var.r;
                                    if (i4 != -1) {
                                        r5.B(i4, progress2, eif1Var.h, eif1Var.g, fArr);
                                        c3 = 1;
                                        c4 = 0;
                                    } else {
                                        float fMin5 = Math.min(r5.getWidth(), r11.getHeight());
                                        c3 = 1;
                                        fArr[1] = eif1Var.l * fMin5;
                                        c4 = 0;
                                        fArr[0] = fMin5 * eif1Var.k;
                                    }
                                    if (Math.abs(((eif1Var.l * fArr[c3]) + (eif1Var.k * fArr[c4])) * eif1Var.v) < 0.01d) {
                                        fArr[0] = 0.01f;
                                        fArr[c3] = 0.01f;
                                    }
                                    if (eif1Var.k != 0.0f) {
                                        f5 = rawX / fArr[0];
                                    } else {
                                        f5 = rawY / fArr[c3];
                                    }
                                    fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
                                    if (eif1Var.c == 6) {
                                        fMax = Math.max(fMax, 0.01f);
                                    }
                                    if (eif1Var.c == 7) {
                                        fMax = Math.min(fMax, 0.99f);
                                    }
                                    progress3 = r11.getProgress();
                                    if (fMax != progress3) {
                                        if (progress3 != 0.0f) {
                                            if (progress3 == 0.0f) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            r11.z(z2);
                                        } else {
                                            if (progress3 == 0.0f) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            r11.z(z2);
                                        }
                                        r11.setProgress(fMax);
                                        velocityTracker6 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker6 != null) {
                                            velocityTracker6.computeCurrentVelocity(1000);
                                        }
                                        velocityTracker7 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker7 != null) {
                                            xVelocity2 = velocityTracker7.getXVelocity();
                                        } else {
                                            xVelocity2 = 0.0f;
                                        }
                                        velocityTracker8 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker8 != null) {
                                            yVelocity2 = velocityTracker8.getYVelocity();
                                        } else {
                                            yVelocity2 = 0.0f;
                                        }
                                        if (eif1Var.k != 0.0f) {
                                            f6 = xVelocity2 / fArr[0];
                                        } else {
                                            f6 = yVelocity2 / fArr[1];
                                        }
                                        r11.W0 = f6;
                                    } else {
                                        r11.W0 = 0.0f;
                                    }
                                    eif1Var.f45p = motionEvent.getRawX();
                                    eif1Var.q = motionEvent.getRawY();
                                } else {
                                    progress2 = r11.getProgress();
                                    if (!eif1Var.m) {
                                        eif1Var.m = true;
                                        r11.setProgress(progress2);
                                    }
                                    i4 = eif1Var.d;
                                    r5 = eif1Var.r;
                                    if (i4 != -1) {
                                        r5.B(i4, progress2, eif1Var.h, eif1Var.g, fArr);
                                        c3 = 1;
                                        c4 = 0;
                                    } else {
                                        float fMin6 = Math.min(r5.getWidth(), r11.getHeight());
                                        c3 = 1;
                                        fArr[1] = eif1Var.l * fMin6;
                                        c4 = 0;
                                        fArr[0] = fMin6 * eif1Var.k;
                                    }
                                    if (Math.abs(((eif1Var.l * fArr[c3]) + (eif1Var.k * fArr[c4])) * eif1Var.v) < 0.01d) {
                                        fArr[0] = 0.01f;
                                        fArr[c3] = 0.01f;
                                    }
                                    if (eif1Var.k != 0.0f) {
                                        f5 = rawX / fArr[0];
                                    } else {
                                        f5 = rawY / fArr[c3];
                                    }
                                    fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
                                    if (eif1Var.c == 6) {
                                        fMax = Math.max(fMax, 0.01f);
                                    }
                                    if (eif1Var.c == 7) {
                                        fMax = Math.min(fMax, 0.99f);
                                    }
                                    progress3 = r11.getProgress();
                                    if (fMax != progress3) {
                                        if (progress3 != 0.0f) {
                                            if (progress3 == 0.0f) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            r11.z(z2);
                                        } else {
                                            if (progress3 == 0.0f) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            r11.z(z2);
                                        }
                                        r11.setProgress(fMax);
                                        velocityTracker6 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker6 != null) {
                                            velocityTracker6.computeCurrentVelocity(1000);
                                        }
                                        velocityTracker7 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker7 != null) {
                                            xVelocity2 = velocityTracker7.getXVelocity();
                                        } else {
                                            xVelocity2 = 0.0f;
                                        }
                                        velocityTracker8 = (VelocityTracker) ymm0Var3.b;
                                        if (velocityTracker8 != null) {
                                            yVelocity2 = velocityTracker8.getYVelocity();
                                        } else {
                                            yVelocity2 = 0.0f;
                                        }
                                        if (eif1Var.k != 0.0f) {
                                            f6 = xVelocity2 / fArr[0];
                                        } else {
                                            f6 = yVelocity2 / fArr[1];
                                        }
                                        r11.W0 = f6;
                                    } else {
                                        r11.W0 = 0.0f;
                                    }
                                    eif1Var.f45p = motionEvent.getRawX();
                                    eif1Var.q = motionEvent.getRawY();
                                }
                            }
                        }
                    }
                }
                inm0Var2.r = motionEvent.getRawX();
                inm0Var2.s = motionEvent.getRawY();
                if (motionEvent.getAction() == 1) {
                    velocityTracker = (VelocityTracker) ymm0Var.b;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        ymm0Var2 = null;
                        ymm0Var.b = null;
                    } else {
                        ymm0Var2 = null;
                    }
                    inm0Var2.o = ymm0Var2;
                    i = this.Y0;
                    if (i != -1) {
                        inm0Var2.a(i, this);
                    }
                }
            }
        } else if (!inm0Var2.m) {
            hnm0Var = inm0Var2.c;
            if (hnm0Var != null && (eif1Var = hnm0Var.l) != null) {
                fArr = eif1Var.n;
                if (!inm0Var2.n) {
                    ymm0Var3 = inm0Var2.o;
                    r11 = eif1Var.r;
                    z = eif1Var.j;
                    bnm0Var = bnm0.d;
                    if (z) {
                        iArr = eif1Var.o;
                        velocityTracker9 = (VelocityTracker) ymm0Var3.b;
                        if (velocityTracker9 != null) {
                            velocityTracker9.addMovement(motionEvent);
                        }
                        action2 = motionEvent.getAction();
                        if (action2 == 0) {
                            eif1Var.f45p = motionEvent.getRawX();
                            eif1Var.q = motionEvent.getRawY();
                            eif1Var.m = false;
                        } else if (action2 == 1) {
                            eif1Var.m = false;
                            velocityTracker10 = (VelocityTracker) ymm0Var3.b;
                            if (velocityTracker10 != null) {
                                velocityTracker10.computeCurrentVelocity(16);
                            }
                            velocityTracker11 = (VelocityTracker) ymm0Var3.b;
                            if (velocityTracker11 != null) {
                                xVelocity3 = velocityTracker11.getXVelocity();
                            } else {
                                xVelocity3 = 0.0f;
                            }
                            velocityTracker12 = (VelocityTracker) ymm0Var3.b;
                            if (velocityTracker12 != null) {
                                yVelocity3 = velocityTracker12.getYVelocity();
                            } else {
                                yVelocity3 = 0.0f;
                            }
                            progress4 = r11.getProgress();
                            width = r11.getWidth() / 2.0f;
                            float height4 = r11.getHeight() / 2.0f;
                            i5 = eif1Var.i;
                            if (i5 != -1) {
                                View viewFindViewById8 = r11.findViewById(i5);
                                r11.getLocationOnScreen(iArr);
                                width = iArr[0] + ((viewFindViewById8.getRight() + viewFindViewById8.getLeft()) / 2.0f);
                                f7 = iArr[1];
                                top = viewFindViewById8.getTop();
                                bottom = viewFindViewById8.getBottom();
                            } else {
                                i6 = eif1Var.d;
                                if (i6 != -1) {
                                    View viewFindViewById9 = r11.findViewById(((a) r11.d1.get(r11.findViewById(i6))).f.X);
                                    r11.getLocationOnScreen(iArr);
                                    width = iArr[0] + ((viewFindViewById9.getRight() + viewFindViewById9.getLeft()) / 2.0f);
                                    f7 = iArr[1];
                                    top = viewFindViewById9.getTop();
                                    bottom = viewFindViewById9.getBottom();
                                } else {
                                    float rawX8 = motionEvent.getRawX() - width;
                                    float rawY8 = motionEvent.getRawY() - height4;
                                    double degrees6 = Math.toDegrees(Math.atan2(rawY8, rawX8));
                                    i7 = eif1Var.d;
                                    if (i7 != -1) {
                                        bnm0Var2 = bnm0Var;
                                        i8 = 6;
                                        eif1Var.r.B(i7, progress4, eif1Var.h, eif1Var.g, fArr);
                                        fArr[1] = (float) Math.toDegrees(fArr[1]);
                                    } else {
                                        bnm0Var2 = bnm0Var;
                                        i8 = 6;
                                        fArr[1] = 360.0f;
                                    }
                                    degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY8, xVelocity3 + rawX8)) - degrees6)) * 62.5f;
                                    if (Float.isNaN(degrees)) {
                                        f8 = (((degrees * 3.0f) * eif1Var.v) / fArr[1]) + progress4;
                                    } else {
                                        f8 = progress4;
                                    }
                                    if (f8 != 0.0f || f8 == 1.0f || (i9 = eif1Var.c) == 3) {
                                        bnm0Var3 = bnm0Var2;
                                        if (0.0f < f8 || 1.0f <= f8) {
                                            r11.setState(bnm0Var3);
                                        }
                                    } else {
                                        float fAbs2 = (degrees * eif1Var.v) / fArr[1];
                                        float f18 = ((double) f8) < 0.5d ? 0.0f : 1.0f;
                                        if (i9 == i8) {
                                            if (progress4 + fAbs2 < 0.0f) {
                                                fAbs2 = Math.abs(fAbs2);
                                            }
                                            f18 = 1.0f;
                                        }
                                        if (eif1Var.c == 7) {
                                            if (progress4 + fAbs2 > 1.0f) {
                                                fAbs2 = -Math.abs(fAbs2);
                                            }
                                            f18 = 0.0f;
                                        }
                                        r11.L(eif1Var.c, f18, fAbs2 * 3.0f);
                                        if (0.0f >= progress4 || 1.0f <= progress4) {
                                            r11.setState(bnm0Var2);
                                        }
                                    }
                                }
                            }
                            height4 = ((bottom + top) / 2.0f) + f7;
                            float rawX9 = motionEvent.getRawX() - width;
                            float rawY9 = motionEvent.getRawY() - height4;
                            double degrees7 = Math.toDegrees(Math.atan2(rawY9, rawX9));
                            i7 = eif1Var.d;
                            if (i7 != -1) {
                                bnm0Var2 = bnm0Var;
                                i8 = 6;
                                eif1Var.r.B(i7, progress4, eif1Var.h, eif1Var.g, fArr);
                                fArr[1] = (float) Math.toDegrees(fArr[1]);
                            } else {
                                bnm0Var2 = bnm0Var;
                                i8 = 6;
                                fArr[1] = 360.0f;
                            }
                            degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity3 + rawY9, xVelocity3 + rawX9)) - degrees7)) * 62.5f;
                            if (Float.isNaN(degrees)) {
                                f8 = (((degrees * 3.0f) * eif1Var.v) / fArr[1]) + progress4;
                            } else {
                                f8 = progress4;
                            }
                            if (f8 != 0.0f) {
                                bnm0Var3 = bnm0Var2;
                                if (0.0f < f8) {
                                    r11.setState(bnm0Var3);
                                } else {
                                    r11.setState(bnm0Var3);
                                }
                            } else {
                                bnm0Var3 = bnm0Var2;
                                if (0.0f < f8) {
                                    r11.setState(bnm0Var3);
                                } else {
                                    r11.setState(bnm0Var3);
                                }
                            }
                        } else if (action2 == 2) {
                            motionEvent.getRawY();
                            motionEvent.getRawX();
                            width2 = r11.getWidth() / 2.0f;
                            height = r11.getHeight() / 2.0f;
                            i10 = eif1Var.i;
                            if (i10 != -1) {
                                View viewFindViewById10 = r11.findViewById(i10);
                                r11.getLocationOnScreen(iArr);
                                float right3 = iArr[0] + ((viewFindViewById10.getRight() + viewFindViewById10.getLeft()) / 2.0f);
                                float bottom4 = iArr[1] + ((viewFindViewById10.getBottom() + viewFindViewById10.getTop()) / 2.0f);
                                width2 = right3;
                                height = bottom4;
                            } else {
                                i11 = eif1Var.d;
                                if (i11 != -1 && (viewFindViewById = r11.findViewById(((a) r11.d1.get(r11.findViewById(i11))).f.X)) != null) {
                                    r11.getLocationOnScreen(iArr);
                                    width2 = iArr[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                    height = ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f) + iArr[1];
                                }
                            }
                            rawX2 = motionEvent.getRawX() - width2;
                            rawY2 = motionEvent.getRawY() - height;
                            dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width2);
                            fAtan2 = (float) (((dAtan2 - Math.atan2(eif1Var.q - height, eif1Var.f45p - width2)) * 180.0d) / 3.141592653589793d);
                            if (fAtan2 > 330.0f) {
                                fAtan2 -= 360.0f;
                            } else if (fAtan2 < -330.0f) {
                                fAtan2 += 360.0f;
                            }
                            f9 = fAtan2;
                            if (Math.abs(f9) <= 0.01d || eif1Var.m) {
                                progress5 = r11.getProgress();
                                if (eif1Var.m) {
                                    z3 = true;
                                    eif1Var.m = true;
                                    r11.setProgress(progress5);
                                } else {
                                    z3 = true;
                                }
                                i12 = eif1Var.d;
                                if (i12 != -1) {
                                    boolean z13 = z3;
                                    i13 = 1000;
                                    eif1Var.r.B(i12, progress5, eif1Var.h, eif1Var.g, fArr);
                                    fArr[z13 ? 1 : 0] = (float) Math.toDegrees(fArr[z13 ? 1 : 0]);
                                    r18 = z13;
                                } else {
                                    boolean z14 = z3;
                                    i13 = 1000;
                                    fArr[z14 ? 1 : 0] = 360.0f;
                                    r18 = z14;
                                }
                                fMax2 = Math.max(Math.min(((f9 * eif1Var.v) / fArr[r18]) + progress5, 1.0f), 0.0f);
                                progress6 = r11.getProgress();
                                if (fMax2 != progress6) {
                                    if (progress6 != 0.0f || progress6 == 1.0f) {
                                        if (progress6 == 0.0f) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        r11.z(z4);
                                    }
                                    r11.setProgress(fMax2);
                                    velocityTracker13 = (VelocityTracker) ymm0Var3.b;
                                    if (velocityTracker13 != null) {
                                        velocityTracker13.computeCurrentVelocity(i13);
                                    }
                                    velocityTracker14 = (VelocityTracker) ymm0Var3.b;
                                    if (velocityTracker14 != null) {
                                        xVelocity4 = velocityTracker14.getXVelocity();
                                    } else {
                                        xVelocity4 = 0.0f;
                                    }
                                    velocityTracker15 = (VelocityTracker) ymm0Var3.b;
                                    if (velocityTracker15 != null) {
                                        yVelocity4 = velocityTracker15.getYVelocity();
                                    } else {
                                        yVelocity4 = 0.0f;
                                    }
                                    double d9 = yVelocity4;
                                    double d10 = xVelocity4;
                                    r11.W0 = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(d9, d10) - dAtan2) * Math.hypot(d9, d10)) / Math.hypot(rawX2, rawY2)));
                                } else {
                                    r11.W0 = 0.0f;
                                }
                                eif1Var.f45p = motionEvent.getRawX();
                                eif1Var.q = motionEvent.getRawY();
                            }
                        }
                    } else {
                        velocityTracker2 = (VelocityTracker) ymm0Var3.b;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        action = motionEvent.getAction();
                        if (action == 0) {
                            eif1Var.f45p = motionEvent.getRawX();
                            eif1Var.q = motionEvent.getRawY();
                            eif1Var.m = false;
                        } else if (action == 1) {
                            eif1Var.m = false;
                            velocityTracker3 = (VelocityTracker) ymm0Var3.b;
                            if (velocityTracker3 != null) {
                                velocityTracker3.computeCurrentVelocity(1000);
                            }
                            velocityTracker4 = (VelocityTracker) ymm0Var3.b;
                            if (velocityTracker4 != null) {
                                xVelocity = velocityTracker4.getXVelocity();
                            } else {
                                xVelocity = 0.0f;
                            }
                            velocityTracker5 = (VelocityTracker) ymm0Var3.b;
                            if (velocityTracker5 != null) {
                                yVelocity = velocityTracker5.getYVelocity();
                            } else {
                                yVelocity = 0.0f;
                            }
                            progress = r11.getProgress();
                            i2 = eif1Var.d;
                            r4 = eif1Var.r;
                            if (i2 != -1) {
                                r4.B(i2, progress, eif1Var.h, eif1Var.g, fArr);
                                c = 1;
                                c2 = 0;
                            } else {
                                float fMin7 = Math.min(r4.getWidth(), r11.getHeight());
                                c = 1;
                                fArr[1] = eif1Var.l * fMin7;
                                c2 = 0;
                                fArr[0] = fMin7 * eif1Var.k;
                            }
                            f = eif1Var.k;
                            f2 = fArr[c2];
                            f3 = fArr[c];
                            if (f != 0.0f) {
                                fAbs = xVelocity / f2;
                            } else {
                                fAbs = yVelocity / f3;
                            }
                            if (Float.isNaN(fAbs)) {
                                f4 = (fAbs / 3.0f) + progress;
                            } else {
                                f4 = progress;
                            }
                            if (f4 == 0.0f && f4 != 1.0f && (i3 = eif1Var.c) != 3) {
                                float f19 = ((double) f4) < 0.5d ? 0.0f : 1.0f;
                                if (i3 == 6) {
                                    if (progress + fAbs < 0.0f) {
                                        fAbs = Math.abs(fAbs);
                                    }
                                    f19 = 1.0f;
                                }
                                if (eif1Var.c == 7) {
                                    if (progress + fAbs > 1.0f) {
                                        fAbs = -Math.abs(fAbs);
                                    }
                                    f19 = 0.0f;
                                }
                                r11.L(eif1Var.c, f19, fAbs);
                                if (0.0f >= progress || 1.0f <= progress) {
                                    r11.setState(bnm0Var);
                                }
                            } else if (0.0f < f4 || 1.0f <= f4) {
                                r11.setState(bnm0Var);
                            }
                        } else if (action == 2) {
                            rawY = motionEvent.getRawY() - eif1Var.q;
                            rawX = motionEvent.getRawX() - eif1Var.f45p;
                            if (Math.abs((eif1Var.l * rawY) + (eif1Var.k * rawX)) <= eif1Var.x || eif1Var.m) {
                                progress2 = r11.getProgress();
                                if (!eif1Var.m) {
                                    eif1Var.m = true;
                                    r11.setProgress(progress2);
                                }
                                i4 = eif1Var.d;
                                r5 = eif1Var.r;
                                if (i4 != -1) {
                                    r5.B(i4, progress2, eif1Var.h, eif1Var.g, fArr);
                                    c3 = 1;
                                    c4 = 0;
                                } else {
                                    float fMin8 = Math.min(r5.getWidth(), r11.getHeight());
                                    c3 = 1;
                                    fArr[1] = eif1Var.l * fMin8;
                                    c4 = 0;
                                    fArr[0] = fMin8 * eif1Var.k;
                                }
                                if (Math.abs(((eif1Var.l * fArr[c3]) + (eif1Var.k * fArr[c4])) * eif1Var.v) < 0.01d) {
                                    fArr[0] = 0.01f;
                                    fArr[c3] = 0.01f;
                                }
                                if (eif1Var.k != 0.0f) {
                                    f5 = rawX / fArr[0];
                                } else {
                                    f5 = rawY / fArr[c3];
                                }
                                fMax = Math.max(Math.min(progress2 + f5, 1.0f), 0.0f);
                                if (eif1Var.c == 6) {
                                    fMax = Math.max(fMax, 0.01f);
                                }
                                if (eif1Var.c == 7) {
                                    fMax = Math.min(fMax, 0.99f);
                                }
                                progress3 = r11.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 != 0.0f || progress3 == 1.0f) {
                                        if (progress3 == 0.0f) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        r11.z(z2);
                                    }
                                    r11.setProgress(fMax);
                                    velocityTracker6 = (VelocityTracker) ymm0Var3.b;
                                    if (velocityTracker6 != null) {
                                        velocityTracker6.computeCurrentVelocity(1000);
                                    }
                                    velocityTracker7 = (VelocityTracker) ymm0Var3.b;
                                    if (velocityTracker7 != null) {
                                        xVelocity2 = velocityTracker7.getXVelocity();
                                    } else {
                                        xVelocity2 = 0.0f;
                                    }
                                    velocityTracker8 = (VelocityTracker) ymm0Var3.b;
                                    if (velocityTracker8 != null) {
                                        yVelocity2 = velocityTracker8.getYVelocity();
                                    } else {
                                        yVelocity2 = 0.0f;
                                    }
                                    if (eif1Var.k != 0.0f) {
                                        f6 = xVelocity2 / fArr[0];
                                    } else {
                                        f6 = yVelocity2 / fArr[1];
                                    }
                                    r11.W0 = f6;
                                } else {
                                    r11.W0 = 0.0f;
                                }
                                eif1Var.f45p = motionEvent.getRawX();
                                eif1Var.q = motionEvent.getRawY();
                            }
                        }
                    }
                }
            }
            inm0Var2.r = motionEvent.getRawX();
            inm0Var2.s = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (ymm0Var = inm0Var2.o) != null) {
                velocityTracker = (VelocityTracker) ymm0Var.b;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    ymm0Var2 = null;
                    ymm0Var.b = null;
                } else {
                    ymm0Var2 = null;
                }
                inm0Var2.o = ymm0Var2;
                i = this.Y0;
                if (i != -1) {
                    inm0Var2.a(i, this);
                }
            }
        }
        hnm0 hnm0Var6 = this.T0.c;
        if ((hnm0Var6.r & 4) != 0) {
            return hnm0Var6.l.m;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void requestLayout() {
        inm0 inm0Var;
        hnm0 hnm0Var;
        if (!this.D1 && this.Y0 == -1 && (inm0Var = this.T0) != null && (hnm0Var = inm0Var.c) != null) {
            int i = hnm0Var.q;
            if (i == 0) {
                return;
            }
            if (i == 2) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ((a) this.d1.get(getChildAt(i2))).d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setDebugMode(int i) {
        this.m1 = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.Q1 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.c1 = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.T0 != null) {
            setState(bnm0.c);
            Interpolator interpolatorD = this.T0.d();
            if (interpolatorD != null) {
                setProgress(interpolatorD.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
    }

    public void setOnShow(float f) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setProgress(float f) {
        if (f >= 0.0f) {
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        }
        if (!super/*android.view.View*/.isAttachedToWindow()) {
            zmm0 zmm0Var = this.N1;
            if (zmm0Var == null) {
                zmm0Var = new zmm0(this);
                this.N1 = zmm0Var;
            }
            zmm0Var.a = f;
            return;
        }
        bnm0 bnm0Var = bnm0.d;
        bnm0 bnm0Var2 = bnm0.c;
        if (f <= 0.0f) {
            if (this.h1 == 1.0f && this.Y0 == this.Z0) {
                setState(bnm0Var2);
            }
            this.Y0 = this.X0;
            if (this.h1 == 0.0f) {
                setState(bnm0Var);
            }
        } else if (f >= 1.0f) {
            if (this.h1 == 0.0f && this.Y0 == this.X0) {
                setState(bnm0Var2);
            }
            this.Y0 = this.Z0;
            if (this.h1 == 1.0f) {
                setState(bnm0Var);
            }
        } else {
            this.Y0 = -1;
            setState(bnm0Var2);
        }
        if (this.T0 == null) {
            return;
        }
        this.k1 = true;
        this.j1 = f;
        this.g1 = f;
        this.i1 = -1L;
        this.e1 = -1L;
        this.U0 = null;
        this.l1 = true;
        invalidate();
    }

    public void setScene(inm0 inm0Var) {
        eif1 eif1Var;
        this.T0 = inm0Var;
        boolean zT = t();
        inm0Var.f68p = zT;
        hnm0 hnm0Var = inm0Var.c;
        if (hnm0Var != null && (eif1Var = hnm0Var.l) != null) {
            eif1Var.c(zT);
        }
        G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStartState(int i) {
        if (super/*android.view.View*/.isAttachedToWindow()) {
            this.Y0 = i;
            return;
        }
        zmm0 zmm0Var = this.N1;
        if (zmm0Var == null) {
            zmm0Var = new zmm0(this);
            this.N1 = zmm0Var;
        }
        zmm0Var.c = i;
        zmm0Var.d = i;
    }

    public void setState(bnm0 bnm0Var) {
        qub1 qub1Var;
        qub1 qub1Var2;
        bnm0 bnm0Var2 = bnm0.d;
        if (bnm0Var == bnm0Var2 && this.Y0 == -1) {
            return;
        }
        bnm0 bnm0Var3 = this.R1;
        this.R1 = bnm0Var;
        int iOrdinal = bnm0Var3.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (bnm0Var != bnm0Var2 || (qub1Var = this.O1) == null) {
                return;
            }
            qub1Var.run();
            this.O1 = null;
            return;
        }
        if (iOrdinal == 2 && bnm0Var == bnm0Var2 && (qub1Var2 = this.O1) != null) {
            qub1Var2.run();
            this.O1 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTransition(int i) {
        hnm0 hnm0Var;
        float f;
        inm0 inm0Var = this.T0;
        if (inm0Var != null) {
            Iterator it = inm0Var.d.iterator();
            do {
                if (!it.hasNext()) {
                    hnm0Var = null;
                    break;
                }
                hnm0Var = (hnm0) it.next();
            } while (hnm0Var.a != i);
            this.X0 = hnm0Var.d;
            this.Z0 = hnm0Var.c;
            if (!super/*android.view.View*/.isAttachedToWindow()) {
                zmm0 zmm0Var = this.N1;
                if (zmm0Var == null) {
                    zmm0Var = new zmm0(this);
                    this.N1 = zmm0Var;
                }
                zmm0Var.c = this.X0;
                zmm0Var.d = this.Z0;
                return;
            }
            int i2 = this.Y0;
            if (i2 == this.X0) {
                f = 0.0f;
            } else {
                f = i2 == this.Z0 ? 1.0f : Float.NaN;
            }
            inm0 inm0Var2 = this.T0;
            inm0Var2.c = hnm0Var;
            eif1 eif1Var = hnm0Var.l;
            if (eif1Var != null) {
                eif1Var.c(inm0Var2.f68p);
            }
            this.S1.g(this.T0.b(this.X0), this.T0.b(this.Z0));
            G();
            if (this.h1 != f) {
                if (f == 0.0f) {
                    z(true);
                    this.T0.b(this.X0).b(this);
                } else if (f == 1.0f) {
                    z(false);
                    this.T0.b(this.Z0).b(this);
                }
            }
            this.h1 = Float.isNaN(f) ? 0.0f : f;
            if (!Float.isNaN(f)) {
                setProgress(f);
            } else {
                bmq0.x();
                y(0.0f);
            }
        }
    }

    public void setTransitionDuration(int i) {
        inm0 inm0Var = this.T0;
        if (inm0Var == null) {
            return;
        }
        hnm0 hnm0Var = inm0Var.c;
        if (hnm0Var != null) {
            hnm0Var.h = Math.max(i, 8);
        } else {
            inm0Var.j = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTransitionState(Bundle bundle) {
        zmm0 zmm0Var = this.N1;
        if (zmm0Var == null) {
            zmm0Var = new zmm0(this);
            this.N1 = zmm0Var;
        }
        zmm0Var.getClass();
        zmm0Var.a = bundle.getFloat("motion.progress");
        zmm0Var.b = bundle.getFloat("motion.velocity");
        zmm0Var.c = bundle.getInt("motion.StartState");
        zmm0Var.d = bundle.getInt("motion.EndState");
        if (super/*android.view.View*/.isAttachedToWindow()) {
            this.N1.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        Context context = getContext();
        return bmq0.y(context, this.X0) + "->" + bmq0.y(context, this.Z0) + " (pos:" + this.h1 + " Dpos/Dt:" + this.W0;
    }

    public final void u(int i) {
        ((ConstraintLayout) this).N0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(float f) {
        inm0 inm0Var = this.T0;
        if (inm0Var == null) {
            return;
        }
        float f2 = this.h1;
        float f3 = this.g1;
        if (f2 != f3 && this.k1) {
            this.h1 = f3;
            f2 = f3;
        }
        if (f2 == f) {
            return;
        }
        this.o1 = false;
        this.j1 = f;
        hnm0 hnm0Var = inm0Var.c;
        this.f1 = (hnm0Var != null ? hnm0Var.h : inm0Var.j) / 1000.0f;
        setProgress(f);
        this.U0 = null;
        this.V0 = this.T0.d();
        this.k1 = false;
        this.e1 = getNanoTime();
        this.l1 = true;
        this.g1 = f2;
        this.h1 = f2;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            a aVar = (a) this.d1.get(getChildAt(i));
            if (aVar != null && "button".equals(bmq0.z(aVar.b)) && aVar.A != null) {
                int i2 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = aVar.A;
                    if (i2 < keyTriggerArr.length) {
                        keyTriggerArr[i2].g(aVar.b, z ? -100.0f : 100.0f);
                        i2++;
                    }
                }
            }
        }
    }

    public void setTransitionListener(anm0 anm0Var) {
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V0 = null;
        this.W0 = 0.0f;
        this.X0 = -1;
        this.Y0 = -1;
        this.Z0 = -1;
        this.a1 = 0;
        this.b1 = 0;
        this.c1 = true;
        this.d1 = new HashMap();
        this.e1 = 0L;
        this.f1 = 1.0f;
        this.g1 = 0.0f;
        this.h1 = 0.0f;
        this.j1 = 0.0f;
        this.l1 = false;
        this.m1 = 0;
        this.o1 = false;
        this.p1 = new xzb1();
        this.q1 = new wmm0(this);
        this.u1 = false;
        this.z1 = false;
        this.A1 = 0;
        this.B1 = -1L;
        this.C1 = 0.0f;
        this.D1 = false;
        this.L1 = new p321((byte) 2);
        this.M1 = false;
        this.O1 = null;
        new HashMap();
        this.P1 = new Rect();
        this.Q1 = false;
        this.R1 = bnm0.a;
        this.S1 = new av7(this);
        this.T1 = false;
        this.U1 = new RectF();
        this.V1 = null;
        this.W1 = null;
        new ArrayList();
        E(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.V0 = null;
        this.W0 = 0.0f;
        this.X0 = -1;
        this.Y0 = -1;
        this.Z0 = -1;
        this.a1 = 0;
        this.b1 = 0;
        this.c1 = true;
        this.d1 = new HashMap();
        this.e1 = 0L;
        this.f1 = 1.0f;
        this.g1 = 0.0f;
        this.h1 = 0.0f;
        this.j1 = 0.0f;
        this.l1 = false;
        this.m1 = 0;
        this.o1 = false;
        this.p1 = new xzb1();
        this.q1 = new wmm0(this);
        this.u1 = false;
        this.z1 = false;
        this.A1 = 0;
        this.B1 = -1L;
        this.C1 = 0.0f;
        this.D1 = false;
        this.L1 = new p321((byte) 2);
        this.M1 = false;
        this.O1 = null;
        new HashMap();
        this.P1 = new Rect();
        this.Q1 = false;
        this.R1 = bnm0.a;
        this.S1 = new av7(this);
        this.T1 = false;
        this.U1 = new RectF();
        this.V1 = null;
        this.W1 = null;
        new ArrayList();
        E(attributeSet);
    }

    public void setTransition(hnm0 hnm0Var) {
        eif1 eif1Var;
        inm0 inm0Var = this.T0;
        inm0Var.c = hnm0Var;
        if (hnm0Var != null && (eif1Var = hnm0Var.l) != null) {
            eif1Var.c(inm0Var.f68p);
        }
        setState(bnm0.b);
        int i = this.Y0;
        hnm0 hnm0Var2 = this.T0.c;
        if (i == (hnm0Var2 == null ? -1 : hnm0Var2.c)) {
            this.h1 = 1.0f;
            this.g1 = 1.0f;
            this.j1 = 1.0f;
        } else {
            this.h1 = 0.0f;
            this.g1 = 0.0f;
            this.j1 = 0.0f;
        }
        this.i1 = (hnm0Var.r & 1) != 0 ? -1L : getNanoTime();
        int iG = this.T0.g();
        inm0 inm0Var2 = this.T0;
        hnm0 hnm0Var3 = inm0Var2.c;
        int i2 = hnm0Var3 != null ? hnm0Var3.c : -1;
        if (iG == this.X0 && i2 == this.Z0) {
            return;
        }
        this.X0 = iG;
        this.Z0 = i2;
        inm0Var2.m(iG, i2);
        kil kilVarB = this.T0.b(this.X0);
        kil kilVarB2 = this.T0.b(this.Z0);
        av7 av7Var = this.S1;
        av7Var.g(kilVarB, kilVarB2);
        int i3 = this.X0;
        int i4 = this.Z0;
        av7Var.a = i3;
        av7Var.b = i4;
        av7Var.j();
        G();
    }
}
