package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k481 extends zf30 implements ug30, jik1, bbr0 {
    public final jf11 F1;
    public s8v0 G1;
    public m481 H1;
    public a1r0 I1;
    public mae0 J1;
    public r961 K1;
    public v8v0 L1;
    public final o5t M1 = new o5t();

    public k481(jf11 jf11Var) {
        this.F1 = jf11Var;
    }

    @Override // p.ug30
    public final String A(Context context) {
        return "";
    }

    public final void F0(Bundle bundle) {
        Y0().r(bundle, f0());
    }

    public final void G0() {
        ((zf30) this).h1 = true;
        Y0().w(this);
    }

    public final void H0() {
        ((zf30) this).h1 = true;
        Y0().x();
    }

    public final void I0(View view, Bundle bundle) {
        Y0().y(this, view, bundle);
        if (bundle == null) {
            f881.b(((zf30) this).f, new q961(this, (byte) 28));
        }
    }

    @Override // p.fn10
    public final gn10 Q() {
        return mno1.g0;
    }

    public final r961 Y0() {
        r961 r961Var = this.K1;
        if (r961Var != null) {
            return r961Var;
        }
        u890.C("showUbiLogger");
        throw null;
    }

    @Override // p.bbr0
    public final war0 b0(Class cls) {
        return this.M1.b0(cls);
    }

    @Override // p.lir0
    public final mir0 c() {
        return Y0().i();
    }

    @Override // p.jik1
    public final lik1 getViewUri() {
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        return oap1.i(O0().getString("uri", ""));
    }

    @Override // p.ug30
    public final String s() {
        return "show";
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
        th30 th30VarG0 = g0();
        m481 m481Var = this.H1;
        if (m481Var == null) {
            u890.C("fragmentFactory");
            throw null;
        }
        th30VarG0.B = m481Var;
        s8v0 s8v0Var = this.G1;
        if (s8v0Var == null) {
            u890.C("mPodcastShowPageLoaderWrapperProvider");
            throw null;
        }
        mae0 mae0Var = this.J1;
        if (mae0Var == null) {
            u890.C("loadingPageIdentifierProvider");
            throw null;
        }
        v8v0 v8v0VarA = s8v0Var.a(this, mae0Var);
        this.L1 = v8v0VarA;
        this.M1.b(v8v0VarA);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, p.ges] */
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = ((zf30) this).f;
        if (bundle2 != null) {
            bundle2.putBoolean("isNewFragmentInstance", bundle == null);
        }
        v8v0 v8v0Var = this.L1;
        if (v8v0Var == null) {
            u890.C("mPodcastShowPageLoaderWrapper");
            throw null;
        }
        Context contextP0 = P0();
        iac0 iac0VarN0 = n0();
        k241 k241Var = v8v0Var.a.get();
        k241Var.b.f(iac0VarN0, new qpj0(v8v0Var, (byte) 7));
        ?? A = v8v0Var.b.a(contextP0);
        A.E(iac0VarN0, k241Var);
        return A;
    }

    public final void y0() {
        ((zf30) this).h1 = true;
        mae0 mae0Var = this.J1;
        if (mae0Var != null) {
            mae0Var.b();
        } else {
            u890.C("loadingPageIdentifierProvider");
            throw null;
        }
    }
}
