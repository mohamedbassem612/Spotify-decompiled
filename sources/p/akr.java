package p;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class akr extends ovb {
    public static final List A = p7h.M(3, 4, 5);
    public final dg30 a;
    public final bbr0 b;
    public final q3b1 c;
    public final mwn0 d;
    public final zf11 e;
    public final lnn0 f;
    public final th30 g;
    public ujr i;
    public s4n j;
    public BottomSheetBehavior l;
    public ajq0 m;
    public Function0 n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6p;
    public boolean q;
    public Float r;
    public final idd1 s;
    public final bpb1 t;
    public final ConcurrentLinkedQueue u;
    public final ydb v;
    public final kdn0 w;
    public hxb x;
    public los y;
    public final LinkedHashSet z;
    public final idd1 h = new idd1(new yjr(this, (byte) 3));
    public boolean k = true;
    public Function0 o = n0r.h;

    public akr(dg30 dg30Var, bbr0 bbr0Var, q3b1 q3b1Var, mwn0 mwn0Var, zf11 zf11Var, lnn0 lnn0Var) {
        this.a = dg30Var;
        this.b = bbr0Var;
        this.c = q3b1Var;
        this.d = mwn0Var;
        this.e = zf11Var;
        this.f = lnn0Var;
        this.g = dg30Var.e0();
        new xjr(this, (byte) 0);
        this.s = new idd1(new yjr(this, (byte) 0));
        this.t = gio1.b(Boolean.FALSE);
        this.u = new ConcurrentLinkedQueue();
        ydb ydbVar = new ydb(this, false, (byte) 5);
        this.v = ydbVar;
        dg30Var.J().a(dg30Var, ydbVar);
        ((g0i) dg30Var).d.j().c("DefaultBottomSheetLayoutManager", new uk(this, (byte) 4));
        c921.y(cto1.q(dg30Var), (o8n) null, 0, new vjr(this, (lnm) null, (byte) 1), 3);
        this.w = new kdn0((Object) null);
        this.x = fxb.a;
        this.z = new LinkedHashSet();
    }

    public static void k(ujr ujrVar, int i) {
        int iD;
        int iC = l1d.C(i);
        if (iC == 0) {
            iD = x74.D(ujrVar.getContext(), 2131100307);
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            iD = x74.D(ujrVar.getContext(), R.color.transparent);
        }
        ujrVar.z(iD);
    }

    public final void a(View view, float f) {
        s4n s4nVar;
        BottomSheetBehavior bottomSheetBehavior;
        nxb nxbVarA;
        View view2 = this.i;
        if (view2 != null) {
            if (!view2.getShadowEnabled$src_main_java_com_spotify_musicappplatform_bottomsheet_bottomsheet()) {
                view2 = null;
            }
            if (view2 != null) {
                view2.invalidate();
            }
        }
        ujr ujrVar = this.i;
        if (ujrVar != null) {
            ujrVar.setPinnedBottomTranslation(f > 0.0f ? 0.0f : Math.abs(f) * view.getHeight());
        }
        Float f2 = this.r;
        if (f2 != null && f < f2.floatValue() && f < 0.0f && this.f6p && (bottomSheetBehavior = this.l) != null && bottomSheetBehavior.C() == 2) {
            if (u890.j(this.x, fxb.a)) {
                this.x = new gxb(1);
            }
            ujr ujrVar2 = this.i;
            if (ujrVar2 != null) {
                ujrVar2.setAllowHostingSnackbar$src_main_java_com_spotify_musicappplatform_bottomsheet_bottomsheet(false);
            }
            nxb nxbVarA2 = f().a();
            if (nxbVarA2 != null && nxbVarA2.d() && (nxbVarA = f().a()) != null) {
                boolean zB = nxbVarA.b();
                los losVarE = e();
                if (losVarE != null) {
                    Iterator it = losVarE.b.iterator();
                    while (it.hasNext()) {
                        ((iu30) it.next()).invoke(Boolean.valueOf(zB));
                    }
                }
            }
            ujr ujrVar3 = this.i;
            if (ujrVar3 != null) {
                k(ujrVar3, 2);
            }
        }
        this.r = Float.valueOf(f);
        if (!this.k || (s4nVar = this.j) == null) {
            return;
        }
        s4nVar.setVisibility(0);
    }

    public final void b(View view, int i) {
        los losVarE;
        ixb ixbVar;
        if (A.contains(Integer.valueOf(i)) && (losVarE = e()) != null) {
            if (i != 3) {
                ixbVar = i != 4 ? ixb.c : ixb.a;
            } else {
                ixbVar = ixb.b;
            }
            Iterator it = losVarE.d.iterator();
            while (it.hasNext()) {
                ((iu30) it.next()).invoke(ixbVar);
            }
        }
        kdn0 kdn0Var = this.w;
        if (i == 3 || i == 4) {
            this.f6p = true;
            this.v.f(true);
            view.setVisibility(0);
            ujr ujrVar = this.i;
            kdn0Var.m(ujrVar != null ? ujrVar.getBottomSheetContainer() : null);
            ujr ujrVar2 = this.i;
            if (ujrVar2 != null) {
                ujrVar2.setPinnedBottomTranslation(0.0f);
            }
            view.requestLayout();
            return;
        }
        if (i != 5) {
            return;
        }
        this.d.f(mqn1.h());
        this.o.invoke();
        this.o = df.O0;
        i();
        Boolean bool = Boolean.FALSE;
        bpb1 bpb1Var = this.t;
        bpb1Var.getClass();
        bpb1Var.m(null, bool);
        kdn0Var.m((Object) null);
        this.x = fxb.a;
    }

    public final boolean c() {
        Boolean boolValueOf;
        nxb nxbVarA = f().a();
        if (nxbVarA != null) {
            boolean zB = nxbVarA.b();
            boolValueOf = Boolean.valueOf(zB);
            los losVarE = e();
            if (losVarE != null) {
                Iterator it = losVarE.b.iterator();
                while (it.hasNext()) {
                    ((iu30) it.next()).invoke(Boolean.valueOf(zB));
                }
            }
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return true;
    }

    public final void d() {
        this.n = null;
        this.x = exb.a;
        this.z.add(this.e.b());
        l(5);
    }

    public final los e() {
        los losVarC;
        los losVar = this.y;
        if (losVar != null) {
            return losVar;
        }
        nxb nxbVarA = f().a();
        if (nxbVarA == null || (losVarC = nxbVarA.c()) == null) {
            return null;
        }
        return losVarC;
    }

    public final war0 f() {
        return this.b.b0(nxb.class);
    }

    public final int g() {
        return ((Number) this.s.getValue()).intValue();
    }

    public final void h(zf30 zf30Var, String str, Function0 function0, Function0 function1) {
        wjr wjrVar = new wjr(zf30Var, str, function0, function1);
        if (((Boolean) this.t.getValue()).booleanValue()) {
            this.u.add(wjrVar);
        } else {
            j(wjrVar);
        }
    }

    public final void i() {
        this.v.f(false);
        this.r = null;
        ajq0 ajq0Var = this.m;
        if (ajq0Var != null) {
            ajq0Var.V();
        }
        this.m = null;
        los losVarE = e();
        if (losVarE != null) {
            hxb hxbVar = this.x;
            Iterator it = losVarE.c.iterator();
            while (it.hasNext()) {
                ((iu30) it.next()).invoke(hxbVar);
            }
        }
        ujr ujrVar = this.i;
        if (ujrVar != null) {
            ujrVar.A();
        }
        idd1 idd1Var = this.h;
        ((ViewGroup) idd1Var.getValue()).removeView(this.i);
        ((ViewGroup) idd1Var.getValue()).requestLayout();
        this.i = null;
        BottomSheetBehavior bottomSheetBehavior = this.l;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.D(this);
        }
        this.l = null;
        Function0 function0 = this.n;
        if (function0 != null) {
            function0.invoke();
        }
        this.n = null;
        this.y = null;
        Iterator it2 = this.z.iterator();
        while (it2.hasNext()) {
            ((xf11) it2.next()).a();
        }
        this.j = null;
        this.k = true;
    }

    public final void j(wjr wjrVar) {
        ujr ujrVar = this.i;
        Integer backgroundColor = ujrVar != null ? ujrVar.getBackgroundColor() : null;
        if (this.i != null) {
            i();
        }
        dg30 dg30Var = this.a;
        ujr ujrVar2 = new ujr(dg30Var);
        ujrVar2.C(this.f);
        zf30 zf30VarA = wjrVar.a();
        String strB = wjrVar.b();
        th30 th30Var = this.g;
        ujrVar2.B(th30Var, zf30VarA, strB);
        BottomSheetBehavior bottomSheetBehaviorZ = BottomSheetBehavior.z(ujrVar2.getBottomSheetContainer());
        bottomSheetBehaviorZ.L(5);
        bottomSheetBehaviorZ.I(g());
        this.f6p = false;
        this.q = false;
        bottomSheetBehaviorZ.t(this);
        Bundle bundleA = ((g0i) dg30Var).d.j().a("DefaultBottomSheetLayoutManager");
        if (bundleA != null) {
            bottomSheetBehaviorZ.J(bundleA.getInt("peekHeight", -1));
            bottomSheetBehaviorZ.I(bundleA.getInt("maxWidth", g()));
            bottomSheetBehaviorZ.E(bundleA.getBoolean("isDraggable", true));
            bottomSheetBehaviorZ.K(bundleA.getBoolean("skipCollapsed", false));
        }
        this.l = bottomSheetBehaviorZ;
        s4n s4nVar = new s4n(bottomSheetBehaviorZ, ujrVar2.getBottomSheetContainer());
        this.j = s4nVar;
        s4nVar.setVisibility(8);
        ujrVar2.addView(this.j);
        if (backgroundColor != null) {
            ujrVar2.setBackgroundColor(backgroundColor.intValue());
        }
        k(ujrVar2, 1);
        ((ViewGroup) this.h.getValue()).addView(ujrVar2);
        th30Var.D();
        this.o = new sqm(ujrVar2, this, wjrVar);
        zf30 zf30VarA2 = wjrVar.a();
        BottomSheetBehavior bottomSheetBehavior = this.l;
        bottomSheetBehavior.getClass();
        c921.y(cto1.q(zf30VarA2), (o8n) null, 0, new swn(this, zf30VarA2, bottomSheetBehavior, ujrVar2, (lnm) null, (byte) 5), 3);
        zf30 zf30VarA3 = wjrVar.a();
        if (zf30VarA3 instanceof hcr0) {
            hcr0 hcr0Var = (hcr0) zf30VarA3;
            ((zf30) hcr0Var).v1.f(zf30VarA3, new zjr(hcr0Var, ujrVar2, this, (byte) 0));
        } else {
            ujrVar2.A();
        }
        ujrVar2.setOnBackgroundClickListener(new s20(this, (byte) 13));
        ujrVar2.setOnGrappleClickListener(new yjr(this, (byte) 1));
        ujrVar2.setOnEscKeyPressedListener(new yjr(this, (byte) 2));
        ViewGroup bottomSheetContainer = ujrVar2.getBottomSheetContainer();
        aiq0.a(bottomSheetContainer, new hw9(bottomSheetContainer, wjrVar, this, ujrVar2, (byte) 5));
        this.i = ujrVar2;
    }

    public final void l(int i) {
        if (i == 5) {
            Boolean bool = Boolean.TRUE;
            bpb1 bpb1Var = this.t;
            bpb1Var.getClass();
            bpb1Var.m(null, bool);
            ujr ujrVar = this.i;
            if (ujrVar != null) {
                k(ujrVar, 2);
            }
            ujr ujrVar2 = this.i;
            if (ujrVar2 != null) {
                ujrVar2.setAllowHostingSnackbar$src_main_java_com_spotify_musicappplatform_bottomsheet_bottomsheet(false);
            }
        }
        BottomSheetBehavior bottomSheetBehavior = this.l;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.L(i);
        }
    }

    public final int m(ixb ixbVar) {
        int iOrdinal = ixbVar.ordinal();
        if (iOrdinal == 0) {
            return 4;
        }
        if (iOrdinal == 1) {
            return 3;
        }
        if (iOrdinal == 2) {
            this.x = new gxb(2);
            return 5;
        }
        eg.o();
        return 0;
    }
}
