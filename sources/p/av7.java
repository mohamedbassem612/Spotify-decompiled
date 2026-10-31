package p;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Handler;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class av7 {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public av7(MotionLayout motionLayout) {
        this.g = motionLayout;
        this.c = new djl();
        this.d = new djl();
        this.e = null;
        this.f = null;
    }

    public static void c(djl djlVar, djl djlVar2) {
        c9a l660Var;
        ArrayList<cjl> arrayList = djlVar.u0;
        HashMap map = new HashMap();
        map.put(djlVar, djlVar2);
        djlVar2.u0.clear();
        djlVar2.h(djlVar, map);
        for (cjl cjlVar : arrayList) {
            if (cjlVar instanceof c9a) {
                l660Var = new c9a();
            } else if (cjlVar instanceof tq50) {
                l660Var = new tq50();
            } else if (cjlVar instanceof nr20) {
                l660Var = new nr20();
            } else if (cjlVar instanceof b6t0) {
                l660Var = new b6t0();
            } else {
                l660Var = cjlVar instanceof l660 ? new l660() : new cjl();
            }
            djlVar2.W(l660Var);
            map.put(cjlVar, l660Var);
        }
        for (cjl cjlVar2 : arrayList) {
            ((cjl) map.get(cjlVar2)).h(cjlVar2, map);
        }
    }

    public static cjl f(djl djlVar, View view) {
        if (((cjl) djlVar).h0 == view) {
            return djlVar;
        }
        ArrayList arrayList = djlVar.u0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cjl cjlVar = (cjl) arrayList.get(i);
            if (cjlVar.h0 == view) {
                return cjlVar;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, android.view.ViewGroup, androidx.constraintlayout.motion.widget.MotionLayout] */
    public void a() {
        HashMap map;
        int[] iArr;
        Interpolator interpolatorLoadInterpolator;
        ?? r1 = (MotionLayout) this.g;
        int childCount = r1.getChildCount();
        HashMap map2 = r1.d1;
        map2.clear();
        SparseArray sparseArray = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i = 0; i < childCount; i++) {
            View childAt = r1.getChildAt(i);
            a aVar = new a(childAt);
            int id = childAt.getId();
            iArr2[i] = id;
            sparseArray.put(id, aVar);
            map2.put(childAt, aVar);
        }
        int i2 = 0;
        while (i2 < childCount) {
            View childAt2 = r1.getChildAt(i2);
            a aVar2 = (a) map2.get(childAt2);
            if (aVar2 == null) {
                map = map2;
                iArr = iArr2;
            } else {
                Rect rect = aVar2.a;
                cnm0 cnm0Var = aVar2.f;
                if (((kil) this.e) != null) {
                    cjl cjlVarF = f((djl) this.c, childAt2);
                    if (cjlVarF != null) {
                        Rect rectK = r1.K(cjlVarF);
                        kil kilVar = (kil) this.e;
                        int width = r1.getWidth();
                        int height = r1.getHeight();
                        int i3 = kilVar.d;
                        if (i3 != 0) {
                            a.f(rectK, rect, i3, width, height);
                        }
                        cnm0Var.c = 0.0f;
                        cnm0Var.d = 0.0f;
                        aVar2.e(cnm0Var);
                        map = map2;
                        iArr = iArr2;
                        cnm0Var.d(rectK.left, rectK.top, rectK.width(), rectK.height());
                        fil filVarL = kilVar.l(aVar2.c);
                        cnm0Var.a(filVarL);
                        hil hilVar = filVarL.d;
                        aVar2.l = hilVar.g;
                        aVar2.h.c(rectK, kilVar, i3, aVar2.c);
                        aVar2.C = filVarL.f.i;
                        aVar2.E = hilVar.j;
                        aVar2.F = hilVar.i;
                        Context context = aVar2.b.getContext();
                        int i4 = hilVar.l;
                        String str = hilVar.k;
                        int i5 = hilVar.m;
                        if (i4 == -2) {
                            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i5);
                        } else if (i4 == -1) {
                            interpolatorLoadInterpolator = new pmm0(clv.d(str), (byte) 0);
                        } else if (i4 == 0) {
                            interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                        } else if (i4 == 1) {
                            interpolatorLoadInterpolator = new AccelerateInterpolator();
                        } else if (i4 == 2) {
                            interpolatorLoadInterpolator = new DecelerateInterpolator();
                        } else if (i4 != 4) {
                            interpolatorLoadInterpolator = i4 != 5 ? null : new OvershootInterpolator();
                        } else {
                            interpolatorLoadInterpolator = new BounceInterpolator();
                        }
                        aVar2.G = interpolatorLoadInterpolator;
                    } else {
                        map = map2;
                        iArr = iArr2;
                        if (r1.m1 != 0) {
                            bmq0.x();
                            bmq0.z(childAt2);
                            childAt2.getClass();
                        }
                    }
                } else {
                    map = map2;
                    iArr = iArr2;
                }
                if (((kil) this.f) != null) {
                    cjl cjlVarF2 = f((djl) this.d, childAt2);
                    if (cjlVarF2 != null) {
                        Rect rectK2 = r1.K(cjlVarF2);
                        kil kilVar2 = (kil) this.f;
                        int width2 = r1.getWidth();
                        int height2 = r1.getHeight();
                        cnm0 cnm0Var2 = aVar2.g;
                        int i6 = kilVar2.d;
                        if (i6 != 0) {
                            a.f(rectK2, rect, i6, width2, height2);
                        } else {
                            rect = rectK2;
                        }
                        cnm0Var2.c = 1.0f;
                        cnm0Var2.d = 1.0f;
                        aVar2.e(cnm0Var2);
                        cnm0Var2.d(rect.left, rect.top, rect.width(), rect.height());
                        cnm0Var2.a(kilVar2.l(aVar2.c));
                        aVar2.i.c(rect, kilVar2, i6, aVar2.c);
                    } else if (r1.m1 != 0) {
                        bmq0.x();
                        bmq0.z(childAt2);
                        childAt2.getClass();
                    }
                }
            }
            i2++;
            map2 = map;
            iArr2 = iArr;
        }
        int[] iArr3 = iArr2;
        for (int i7 = 0; i7 < childCount; i7++) {
            a aVar3 = (a) sparseArray.get(iArr3[i7]);
            int i8 = aVar3.f.X;
            if (i8 != -1) {
                a aVar4 = (a) sparseArray.get(i8);
                aVar3.f.f(aVar4, aVar4.f);
                aVar3.g.f(aVar4, aVar4.g);
            }
        }
    }

    public void b(int i, int i2) {
        MotionLayout motionLayout = (MotionLayout) this.g;
        int optimizationLevel = motionLayout.getOptimizationLevel();
        if (motionLayout.Y0 == motionLayout.getStartState()) {
            djl djlVar = (djl) this.d;
            kil kilVar = (kil) this.f;
            motionLayout.w(djlVar, optimizationLevel, (kilVar == null || kilVar.d == 0) ? i : i2, (kilVar == null || kilVar.d == 0) ? i2 : i);
            kil kilVar2 = (kil) this.e;
            if (kilVar2 != null) {
                djl djlVar2 = (djl) this.c;
                int i3 = kilVar2.d;
                int i4 = i3 == 0 ? i : i2;
                if (i3 == 0) {
                    i = i2;
                }
                motionLayout.w(djlVar2, optimizationLevel, i4, i);
                return;
            }
            return;
        }
        kil kilVar3 = (kil) this.e;
        if (kilVar3 != null) {
            djl djlVar3 = (djl) this.c;
            int i5 = kilVar3.d;
            motionLayout.w(djlVar3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
        }
        djl djlVar4 = (djl) this.d;
        kil kilVar4 = (kil) this.f;
        int i6 = (kilVar4 == null || kilVar4.d == 0) ? i : i2;
        if (kilVar4 == null || kilVar4.d == 0) {
            i = i2;
        }
        motionLayout.w(djlVar4, optimizationLevel, i6, i);
    }

    public AudioManager.OnAudioFocusChangeListener d() {
        return (AudioManager.OnAudioFocusChangeListener) this.f;
    }

    public ysk1 e() {
        return (ysk1) this.d;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, androidx.constraintlayout.motion.widget.MotionLayout, androidx.constraintlayout.widget.ConstraintLayout] */
    public void g(kil kilVar, kil kilVar2) {
        this.e = kilVar;
        this.f = kilVar2;
        this.c = new djl();
        this.d = new djl();
        djl djlVar = (djl) this.c;
        ?? r1 = (MotionLayout) this.g;
        boolean z = MotionLayout.X1;
        djl djlVar2 = ((ConstraintLayout) r1).c;
        vda vdaVar = djlVar2.y0;
        djlVar.y0 = vdaVar;
        djlVar.w0.C(vdaVar);
        djl djlVar3 = (djl) this.d;
        vda vdaVar2 = djlVar2.y0;
        djlVar3.y0 = vdaVar2;
        djlVar3.w0.C(vdaVar2);
        ((djl) this.c).u0.clear();
        ((djl) this.d).u0.clear();
        c(djlVar2, (djl) this.c);
        c(djlVar2, (djl) this.d);
        if (r1.h1 > 0.5d) {
            if (kilVar != null) {
                n((djl) this.c, kilVar);
            }
            n((djl) this.d, kilVar2);
        } else {
            n((djl) this.d, kilVar2);
            if (kilVar != null) {
                n((djl) this.c, kilVar);
            }
        }
        ((djl) this.c).z0 = r1.t();
        djl djlVar4 = (djl) this.c;
        djlVar4.v0.E(djlVar4);
        ((djl) this.d).z0 = r1.t();
        djl djlVar5 = (djl) this.d;
        djlVar5.v0.E(djlVar5);
        ViewGroup.LayoutParams layoutParams = r1.getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.width;
            bjl bjlVar = bjl.b;
            if (i == -2) {
                ((djl) this.c).P(bjlVar);
                ((djl) this.d).P(bjlVar);
            }
            if (layoutParams.height == -2) {
                ((djl) this.c).R(bjlVar);
                ((djl) this.d).R(bjlVar);
            }
        }
    }

    public void h(int i) {
        String str = (String) this.g;
        bih1 bih1Var = (bih1) ((ssk1) this.f).a;
        w7l w7lVar = (w7l) this.e;
        double dC = w7lVar.c();
        int i2 = this.a;
        int iS = jch0.S(dC * ((double) i2));
        int iC = l1d.C(i);
        if (iC == 0) {
            ark1.f(w7lVar, "volume_up_hardware_button", bih1Var.o(str, o(iS)), 4);
            int i3 = iS + 1;
            if (i3 <= i2) {
                i2 = i3;
            }
            l(i2);
            return;
        }
        if (iC != 1) {
            if (iC == 2) {
                return;
            }
            eg.o();
        } else {
            ark1.d(w7lVar, "volume_down_hardware_button", bih1Var.n(str, o(iS)), 4);
            int i4 = iS - 1;
            if (i4 < 0) {
                i4 = 0;
            }
            l(i4);
        }
    }

    public void i(int i) {
        double dO = o(i);
        bih1 bih1Var = (bih1) ((ssk1) this.f).a;
        py9 py9VarM = ((qpj1) bih1Var.c).m((String) this.g);
        String str = null;
        if (py9VarM != null) {
            x6h1 x6h1VarC = py9VarM.c.c();
            x6h1VarC.i.add(new a7h1("system_volume_slider", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            int iS = jch0.S(100.0d * dO);
            z7h1 z7h1Var = new z7h1("drag", 1, b7x.a);
            String strValueOf = String.valueOf(iS);
            if (strValueOf == null) {
                strValueOf = "";
            }
            str = ((i8h1) bih1Var.b).m(new w7h1("", "", z7h1Var, new x7h1("set_volume", 1, Collections.singletonMap("new_volume_percentage", strValueOf)), y6h1VarA, py9VarM.b, System.currentTimeMillis()), (xj61) null).a.a;
        }
        w7l w7lVar = (w7l) this.e;
        w7lVar.b.accept(new isk1(new xl61(dO, "volume_system_slider", str, new v7l(new gf6(this, i, (byte) 3), (byte) 0))));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, android.view.ViewGroup, androidx.constraintlayout.motion.widget.MotionLayout, androidx.constraintlayout.widget.ConstraintLayout] */
    public void j() {
        ?? r1 = (MotionLayout) this.g;
        int i = r1.a1;
        int i2 = r1.b1;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        r1.I1 = mode;
        r1.J1 = mode2;
        b(i, i2);
        int i3 = 0;
        if (!(r1.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
            b(i, i2);
            r1.E1 = ((djl) this.c).s();
            r1.F1 = ((djl) this.c).m();
            r1.G1 = ((djl) this.d).s();
            int iM = ((djl) this.d).m();
            r1.H1 = iM;
            r1.D1 = (r1.E1 == r1.G1 && r1.F1 == iM) ? false : true;
        }
        int i4 = r1.E1;
        int i5 = r1.F1;
        int i6 = r1.I1;
        if (i6 == Integer.MIN_VALUE || i6 == 0) {
            i4 = (int) ((r1.K1 * (r1.G1 - i4)) + i4);
        }
        int i7 = r1.J1;
        if (i7 == Integer.MIN_VALUE || i7 == 0) {
            i5 = (int) ((r1.K1 * (r1.H1 - i5)) + i5);
        }
        int i8 = i5;
        djl djlVar = (djl) this.c;
        r1.v(i, i2, i4, i8, djlVar.I0 || ((djl) this.d).I0, djlVar.J0 || ((djl) this.d).J0);
        HashMap map = r1.d1;
        int childCount = r1.getChildCount();
        r1.S1.a();
        r1.l1 = true;
        SparseArray sparseArray = new SparseArray();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = r1.getChildAt(i9);
            sparseArray.put(childAt.getId(), (a) map.get(childAt));
        }
        int width = r1.getWidth();
        int height = r1.getHeight();
        hnm0 hnm0Var = r1.T0.c;
        int i10 = hnm0Var != null ? hnm0Var.f64p : -1;
        if (i10 != -1) {
            for (int i11 = 0; i11 < childCount; i11++) {
                a aVar = (a) map.get(r1.getChildAt(i11));
                if (aVar != null) {
                    aVar.B = i10;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[map.size()];
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            a aVar2 = (a) map.get(r1.getChildAt(i13));
            int i14 = aVar2.f.X;
            if (i14 != -1) {
                sparseBooleanArray.put(i14, true);
                iArr[i12] = aVar2.f.X;
                i12++;
            }
        }
        for (int i15 = 0; i15 < i12; i15++) {
            a aVar3 = (a) map.get(r1.findViewById(iArr[i15]));
            if (aVar3 != null) {
                r1.T0.e(aVar3);
                aVar3.g(width, r1.getNanoTime(), height);
            }
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = r1.getChildAt(i16);
            a aVar4 = (a) map.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && aVar4 != null) {
                r1.T0.e(aVar4);
                aVar4.g(width, r1.getNanoTime(), height);
            }
        }
        hnm0 hnm0Var2 = r1.T0.c;
        float f = hnm0Var2 != null ? hnm0Var2.i : 0.0f;
        if (f != 0.0f) {
            boolean z = ((double) f) < 0.0d;
            float fAbs = Math.abs(f);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i17 = 0; i17 < childCount; i17++) {
                a aVar5 = (a) map.get(r1.getChildAt(i17));
                if (!Float.isNaN(aVar5.l)) {
                    for (int i18 = 0; i18 < childCount; i18++) {
                        a aVar6 = (a) map.get(r1.getChildAt(i18));
                        if (!Float.isNaN(aVar6.l)) {
                            fMin = Math.min(fMin, aVar6.l);
                            fMax = Math.max(fMax, aVar6.l);
                        }
                    }
                    while (i3 < childCount) {
                        a aVar7 = (a) map.get(r1.getChildAt(i3));
                        if (!Float.isNaN(aVar7.l)) {
                            aVar7.n = 1.0f / (1.0f - fAbs);
                            float f2 = aVar7.l;
                            if (z) {
                                aVar7.m = fAbs - (((fMax - f2) / (fMax - fMin)) * fAbs);
                            } else {
                                aVar7.m = fAbs - (((f2 - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i3++;
                    }
                    return;
                }
                cnm0 cnm0Var = aVar5.g;
                float f3 = cnm0Var.e;
                float f4 = cnm0Var.f;
                float f5 = z ? f4 - f3 : f4 + f3;
                fMin2 = Math.min(fMin2, f5);
                fMax2 = Math.max(fMax2, f5);
            }
            while (i3 < childCount) {
                a aVar8 = (a) map.get(r1.getChildAt(i3));
                cnm0 cnm0Var2 = aVar8.g;
                float f6 = cnm0Var2.e;
                float f7 = cnm0Var2.f;
                float f8 = z ? f7 - f6 : f7 + f6;
                aVar8.n = 1.0f / (1.0f - fAbs);
                aVar8.m = fAbs - (((f8 - fMin2) * fAbs) / (fMax2 - fMin2));
                i3++;
            }
        }
    }

    public void k(yfc0 yfc0Var) {
        this.c = yfc0Var;
    }

    public void l(int i) {
        ysk1 ysk1Var = (ysk1) this.d;
        this.d = new ysk1(ysk1Var.a, ysk1Var.b, i, ysk1Var.c);
        yfc0 yfc0Var = (yfc0) this.c;
        if (yfc0Var != null) {
            ev40 ev40Var = (ev40) yfc0Var.b;
            ev40Var.d = i;
            ctk1.a(ev40Var.a(), i);
        }
    }

    public void m(double d) {
        l(jch0.S(((double) this.a) * d));
    }

    public void n(djl djlVar, kil kilVar) {
        fil filVar;
        fil filVar2;
        SparseArray sparseArray = new SparseArray();
        fjl fjlVar = new fjl(-2, -2);
        sparseArray.clear();
        sparseArray.put(0, djlVar);
        ConstraintLayout constraintLayout = (MotionLayout) this.g;
        sparseArray.put(constraintLayout.getId(), djlVar);
        if (kilVar != null && kilVar.d != 0) {
            djl djlVar2 = (djl) this.d;
            int optimizationLevel = constraintLayout.getOptimizationLevel();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintLayout.getHeight(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintLayout.getWidth(), 1073741824);
            boolean z = MotionLayout.X1;
            constraintLayout.w(djlVar2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        for (cjl cjlVar : djlVar.u0) {
            cjlVar.j0 = true;
            sparseArray.put(((View) cjlVar.h0).getId(), cjlVar);
        }
        for (l660 l660Var : djlVar.u0) {
            Barrier barrier = (View) ((cjl) l660Var).h0;
            int id = barrier.getId();
            HashMap map = kilVar.g;
            if (map.containsKey(Integer.valueOf(id)) && (filVar2 = (fil) map.get(Integer.valueOf(id))) != null) {
                filVar2.b(fjlVar);
            }
            l660Var.T(kilVar.l(barrier.getId()).e.c);
            l660Var.O(kilVar.l(barrier.getId()).e.d);
            if (barrier instanceof ohl) {
                ohl ohlVar = (ohl) barrier;
                int id2 = ohlVar.getId();
                HashMap map2 = kilVar.g;
                if (map2.containsKey(Integer.valueOf(id2)) && (filVar = (fil) map2.get(Integer.valueOf(id2))) != null && (l660Var instanceof l660)) {
                    ohlVar.j(filVar, l660Var, fjlVar, sparseArray);
                }
                if (barrier instanceof Barrier) {
                    barrier.m();
                }
            }
            fjlVar.resolveLayoutDirection(constraintLayout.getLayoutDirection());
            boolean z2 = MotionLayout.X1;
            constraintLayout.a(false, barrier, l660Var, fjlVar, sparseArray);
            if (kilVar.l(barrier.getId()).c.c == 1) {
                ((cjl) l660Var).i0 = barrier.getVisibility();
            } else {
                ((cjl) l660Var).i0 = kilVar.l(barrier.getId()).c.b;
            }
        }
        for (ljk1 ljk1Var : djlVar.u0) {
            if (ljk1Var instanceof ljk1) {
                ohl ohlVar2 = (ohl) ((cjl) ljk1Var).h0;
                ljk1 ljk1Var2 = (l660) ljk1Var;
                ohlVar2.getClass();
                ((l660) ljk1Var2).v0 = 0;
                Arrays.fill(((l660) ljk1Var2).u0, (Object) null);
                for (int i = 0; i < ohlVar2.b; i++) {
                    ljk1Var2.W((cjl) sparseArray.get(ohlVar2.a[i]));
                }
                ljk1 ljk1Var3 = ljk1Var2;
                for (int i2 = 0; i2 < ((l660) ljk1Var3).v0; i2++) {
                    cjl cjlVar2 = ((l660) ljk1Var3).u0[i2];
                    if (cjlVar2 != null) {
                        cjlVar2.G = true;
                    }
                }
            }
        }
    }

    public double o(int i) {
        String str;
        int i2 = this.a;
        if (i2 != 0) {
            return ((double) i) / ((double) i2);
        }
        int i3 = this.b;
        StringBuilder sb = new StringBuilder("ConnectVolumeProvider.transformVolume: maxVolume is 0 (controlType=");
        if (i3 == 1) {
            str = "FIXED";
        } else if (i3 != 2) {
            str = i3 != 3 ? "null" : "ABSOLUTE";
        } else {
            str = "RELATIVE";
        }
        sb.append(str);
        sb.append(")");
        n57.e(sb.toString());
        return 0.0d;
    }

    public av7(mmo mmoVar, int i, int i2, dg30 dg30Var, iac0 iac0Var, akr akrVar, yun0 yun0Var) {
        this.c = mmoVar;
        this.a = i;
        this.b = i2;
        this.d = dg30Var;
        this.e = iac0Var;
        this.f = akrVar;
        this.g = yun0Var;
    }

    public av7(int i, Boolean bool, ow3 ow3Var, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, Boolean bool2, int i2) {
        this.a = i;
        this.c = bool;
        this.e = ow3Var;
        this.f = onAudioFocusChangeListener;
        this.g = handler;
        this.d = bool2;
        this.b = i2;
    }
}
