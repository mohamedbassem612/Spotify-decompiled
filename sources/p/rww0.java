package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.mobius.MobiusLoop;
import com.spotify.profileconfig.proto.v1.DismissProfileCompletionRequest;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rww0 extends v4n implements j2u {
    public static final /* synthetic */ int n2 = 0;
    public final pjq0 b2;
    public wjq c2;
    public qis d2;
    public lzw0 e2;
    public xjq f2;
    public yww0 g2;
    public i8h1 h2;
    public l6h1 i2;
    public final idd1 j2 = new idd1(new qww0(this, 0));
    public final idd1 k2 = new idd1(new qww0(this, 3));
    public boolean l2;
    public mwv0 m2;

    public rww0(pjq0 pjq0Var) {
        this.b2 = pjq0Var;
    }

    @Override // p.j2u
    public final void C() {
        this.l2 = true;
        cwb cwbVar = ((t2u) this).Q1;
        if (cwbVar != null) {
            cwbVar.cancel();
        }
        mwv0 mwv0Var = this.m2;
        if (mwv0Var != null) {
            mwv0Var.invoke(wzw0.c);
        }
    }

    @Override // p.j2u
    public final void G() {
        cwb cwbVar = ((t2u) this).Q1;
        if (cwbVar == null || cwbVar.g().G != 5) {
            return;
        }
        cwbVar.g().L(3);
    }

    @Override // p.j2u
    public final void Y(wzw0 wzw0Var) {
        dismiss();
        mwv0 mwv0Var = this.m2;
        if (mwv0Var != null) {
            mwv0Var.invoke(wzw0Var);
        }
    }

    public final boolean i1() {
        if (this.l2) {
            return true;
        }
        lzw0 lzw0Var = this.e2;
        if (lzw0Var != null) {
            lzw0Var.b(myw0.a);
            return false;
        }
        u890.C("eventSource");
        throw null;
    }

    public final void k1(t4n t4nVar) {
        BottomSheetBehavior bottomSheetBehaviorG = t4nVar.g();
        bottomSheetBehaviorG.E = true;
        bottomSheetBehaviorG.L(3);
    }

    public final void l1() {
        boolean z = this.l2;
        tfu tfuVar = tfu.SWIPED_AWAY;
        tfu tfuVar2 = z ? tfuVar : tfu.ACTION_TAPPED;
        int i = ((iis) this.k2.getValue()).l;
        int i2 = i == 0 ? -1 : oww0.a[l1d.C(i)];
        if (i2 != -1) {
            idd1 idd1Var = this.j2;
            b7x b7xVar = b7x.a;
            if (i2 == 1) {
                p1(d0x0.INTRO, tfuVar2);
                lis lisVar = (lis) idd1Var.getValue();
                i8h1 i8h1Var = lisVar.a;
                tdl0 tdl0Var = lisVar.c;
                String str = lisVar.b;
                x6h1 x6h1VarC = tdl0Var.b.c();
                x6h1VarC.i.add(new a7h1("onboarding_step", (String) null, (Integer) null, (String) null, str));
                x6h1VarC.j = true;
                String str2 = i8h1Var.m(new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                return;
            }
            if (i2 == 2) {
                p1(d0x0.DISPLAY_NAME, tfuVar2);
                lis lisVar2 = (lis) idd1Var.getValue();
                i8h1 i8h1Var2 = lisVar2.a;
                x6h1 x6h1VarC2 = lisVar2.c.b.c();
                x6h1VarC2.i.add(new a7h1("display_name_step", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                String str3 = i8h1Var2.m(new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                return;
            }
            if (i2 == 3) {
                p1(d0x0.PROFILE_PICTURE, tfuVar2);
                lis lisVar3 = (lis) idd1Var.getValue();
                i8h1 i8h1Var3 = lisVar3.a;
                x6h1 x6h1VarC3 = lisVar3.c.b.c();
                x6h1VarC3.i.add(new a7h1("profile_picture_step", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                String str4 = i8h1Var3.m(new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                return;
            }
            if (i2 != 4) {
                eg.o();
                return;
            }
            if (tfuVar2 == tfuVar) {
                p1(d0x0.CONFIRM, tfuVar2);
                lis lisVar4 = (lis) idd1Var.getValue();
                i8h1 i8h1Var4 = lisVar4.a;
                x6h1 x6h1VarC4 = lisVar4.c.b.c();
                x6h1VarC4.i.add(new a7h1("result_step", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                String str5 = i8h1Var4.m(new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
            }
        }
    }

    public final View n1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qis qisVar = this.d2;
        if (qisVar == null) {
            u890.C("mobiusControllerProvider");
            throw null;
        }
        xjq xjqVar = this.f2;
        if (xjqVar == null) {
            u890.C("loggerFactory");
            throw null;
        }
        i8h1 i8h1Var = this.h2;
        if (i8h1Var == null) {
            u890.C("ubiLogger");
            throw null;
        }
        MobiusLoop.Controller controllerA = qisVar.a(xjqVar.a(i8h1Var));
        ((zf30) this).s1.a(new pww0(controllerA));
        idd1 idd1Var = this.k2;
        controllerA.c(new ku1((iis) idd1Var.getValue(), (byte) 29));
        FrameLayout frameLayoutA = ((iis) idd1Var.getValue()).a();
        op80 jp80Var = new jp80(frameLayoutA);
        i8h1 i8h1Var2 = this.h2;
        if (i8h1Var2 == null) {
            u890.C("ubiLogger");
            throw null;
        }
        l6h1 l6h1Var = this.i2;
        if (l6h1Var == null) {
            u890.C("ubiDwellTimeLogger");
            throw null;
        }
        op80 eq80Var = new eq80(new e3h1(l6h1Var, (n7h1) null, i8h1Var2));
        op80 wchVar = q6x.b;
        if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
            jp80Var = wchVar;
        } else if (jp80Var.equals(wchVar)) {
            jp80Var = eq80Var;
        } else if (!eq80Var.equals(wchVar)) {
            wchVar = new wch(jp80Var, eq80Var);
            jp80Var = wchVar;
        }
        xhk1.c(frameLayoutA, jp80Var);
        return frameLayoutA;
    }

    public final void p1(d0x0 d0x0Var, tfu tfuVar) {
        yww0 yww0Var = this.g2;
        if (yww0Var == null) {
            u890.C("profileCompletionDataSource");
            throw null;
        }
        w0x0 w0x0Var = yww0Var.a;
        bfu bfuVarO = DismissProfileCompletionRequest.o();
        bfuVarO.n(d0x0Var);
        bfuVarO.q(tfuVar);
        w0x0Var.a(bfuVarO.build()).flatMapCompletable(dj20.c1).o(Functions.h).subscribe();
    }

    public final void v0(Context context) {
        super/*p.t2u*/.v0(context);
        this.b2.f(this);
    }
}
