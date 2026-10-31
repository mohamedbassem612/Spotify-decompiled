package p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rfm extends auj {
    public final lpd Y1;
    public i8h1 Z1;
    public gw70 a2;
    public q811 b2;
    public kt91 c2;
    public mwn0 d2;
    public l6h1 e2;
    public q8n f2;
    public tdm g2;
    public ynb0 h2;
    public ynb0 i2;
    public Observable j2;
    public final hrr0 k2 = xto.t(r6x.a);
    public final hrr0 l2 = xto.t((Object) null);
    public final idd1 m2 = new idd1(new j3m(this, (byte) 2));

    public rfm(lpd lpdVar) {
        this.Y1 = lpdVar;
    }

    @Override // p.t2u, p.zf30
    public final void A0() {
        super.A0();
        ofm ofmVarP1 = p1();
        if (ofmVarP1 != null) {
            vkg vkgVarN0 = N0();
            vkg vkgVar = vkgVarN0 instanceof vkg ? vkgVarN0 : null;
            if (vkgVar == null) {
                l1d.z("Activity ", N0().getClass().getSimpleName(), " must implement ClientOverlayLogger");
            } else {
                vkgVar.h(ofmVarP1.b(), ofmVarP1.c().a());
            }
        }
    }

    @Override // p.zf30
    public final void D0() {
        this.h1 = true;
        dismiss();
    }

    @Override // p.haa, p.zf30
    public final void I0(View view, Bundle bundle) {
        View viewFindViewById;
        BottomSheetBehavior bottomSheetBehaviorG;
        super.I0(view, bundle);
        mp80 jp80Var = new jp80(view);
        l6h1 l6h1Var = this.e2;
        if (l6h1Var == null) {
            u890.C("ubiDwellTimeLogger");
            throw null;
        }
        xhk1.c(view, j6p1.k(jp80Var, new eq80(new e3h1(l6h1Var, null, r1()))));
        int dimensionPixelSize = P0().getResources().getDimensionPixelSize(2131165549);
        boolean z = k0().getBoolean(2131034114);
        cwb cwbVar = (cwb) this.Q1;
        if (cwbVar != null && (bottomSheetBehaviorG = cwbVar.g()) != null) {
            bottomSheetBehaviorG.K(z);
        }
        rwq0.s(view, new pfm(this, z, dimensionPixelSize));
        cwb cwbVar2 = (cwb) this.Q1;
        if (cwbVar2 == null || (viewFindViewById = cwbVar2.findViewById(2131431463)) == null) {
            return;
        }
        viewFindViewById.setOnClickListener(new c20(this, (byte) 22));
    }

    @Override // p.haa
    /* JADX INFO: renamed from: j1 */
    public final boolean getW1() {
        return false;
    }

    @Override // p.haa
    public final void k1(t4n t4nVar) {
        WindowManager.LayoutParams attributes;
        Window window = t4nVar.getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.windowAnimations = 2132017484;
        }
        aq8.v(t4nVar.c, (iac0) null, new kjk(this, t4nVar, (byte) 16), 3);
        t4nVar.g().t(new jph(this, (byte) 1));
        t4nVar.setOnKeyListener(new qfm(this, (byte) 0));
    }

    @Override // p.auj
    public final void n1(xtj xtjVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-562777756);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            kiv kivVar = oi7.a;
            gw70 gw70Var = this.a2;
            if (gw70Var == null) {
                u890.C("imageLoader");
                throw null;
            }
            ely0 ely0VarA = kivVar.a(gw70Var);
            kiv kivVarB = vvx.b();
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mod.c(new ely0[]{ely0VarA, kivVarB.a(new uvx(0, (pgx) null, 0, (vzq0) null, uyn1.h(2, 4.0f, 0.0f), (tvx) null, (hw61) null, 0, (p3v) null, 495))}, apo.r(1553810980, new jjk(view, this, (byte) 21), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jjk(this, xtjVar, i, (byte) 22);
        }
    }

    public final ofm p1() {
        return (ofm) this.l2.getValue();
    }

    public final mwn0 q1() {
        mwn0 mwn0Var = this.d2;
        if (mwn0Var != null) {
            return mwn0Var;
        }
        u890.C("navigationLogger");
        throw null;
    }

    public final i8h1 r1() {
        i8h1 i8h1Var = this.Z1;
        if (i8h1Var != null) {
            return i8h1Var;
        }
        u890.C("ubiLogger");
        throw null;
    }

    @Override // p.t2u, p.zf30
    public final void v0(Context context) {
        lsn0 lsn0VarM;
        tv80 tv80VarA;
        this.Y1.f(this);
        q811 q811Var = this.b2;
        if (q811Var == null) {
            u890.C("viewUriRef");
            throw null;
        }
        ofm ofmVarP1 = p1();
        q811Var.a = ofmVarP1 != null ? ofmVarP1.c() : null;
        super.v0(context);
        ofm ofmVarP2 = p1();
        if (ofmVarP2 == null || (tv80VarA = ofmVarP2.a()) == null) {
            lsn0VarM = jsn0.a;
        } else {
            ofm ofmVarP3 = p1();
            lsn0VarM = mqn1.M(String.valueOf(ofmVarP3 != null ? ofmVarP3.c() : null), tv80VarA);
        }
        q1().e(lsn0VarM);
        q1().f(lsn0VarM);
        ofm ofmVarP4 = p1();
        if (ofmVarP4 != null) {
            dg30 dg30VarN0 = N0();
            vkg vkgVar = dg30VarN0 instanceof vkg ? (vkg) dg30VarN0 : null;
            if (vkgVar == null) {
                l1d.z("Activity ", N0().getClass().getSimpleName(), " must implement ClientOverlayLogger");
            } else {
                vkgVar.U(ofmVarP4.b(), ofmVarP4.c().a());
            }
        }
    }
}
