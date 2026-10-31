package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\t\b\u0010¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lp/nnf1;", "Lp/fac0;", "Lp/ug30;", "Lp/jik1;", "Lp/o6r0;", "<init>", "()V", "p/yah0", "src_main_java_com_spotify_track_freetiertrack-freetiertrack"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class nnf1 extends fac0 implements ug30, jik1, o6r0 {
    public final yg30 G1;
    public tm30 H1;
    public sp00 I1;
    public k241 J1;
    public ees K1;
    public mir0 L1;
    public wnh1 M1;
    public sg30 N1;
    public hs71 O1;
    public ges P1;
    public final rku Q1;

    public nnf1(yg30 yg30Var) {
        this.G1 = yg30Var;
        this.Q1 = new rku();
    }

    @Override // p.ug30
    public final String A(Context context) {
        return context.getString(2131963339);
    }

    public final void D0() {
        sp00 sp00Var = this.I1;
        if (sp00Var == null) {
            u890.C("freeTierUpgrader");
            throw null;
        }
        sp00Var.v();
        super.D0();
    }

    public final void E0() {
        super.E0();
        sp00 sp00Var = this.I1;
        if (sp00Var != null) {
            sp00Var.w();
        } else {
            u890.C("freeTierUpgrader");
            throw null;
        }
    }

    public final void F0(Bundle bundle) {
        Bundle bundleI;
        super.F0(bundle);
        tm30 tm30Var = this.H1;
        if (tm30Var == null) {
            u890.C("viewBinder");
            throw null;
        }
        tm30Var.b(bundle);
        dg30 dg30VarF0 = f0();
        if (dg30VarF0 == null || !dg30VarF0.isChangingConfigurations() || (bundleI = Y0().I()) == null) {
            return;
        }
        bundle.putAll(bundleI);
    }

    public final void G0() {
        super.G0();
        k241 k241Var = this.J1;
        if (k241Var == null) {
            u890.C("pageLoader");
            throw null;
        }
        k241Var.a();
        ges gesVar = this.P1;
        if (gesVar != null) {
            iac0 iac0VarN0 = n0();
            k241 k241Var2 = this.J1;
            if (k241Var2 == null) {
                u890.C("pageLoader");
                throw null;
            }
            gesVar.E(iac0VarN0, k241Var2);
        }
        Y0().G();
        sg30 sg30Var = this.N1;
        if (sg30Var == null) {
            u890.C("fragmentFocused");
            throw null;
        }
        this.Q1.b(sg30Var.l(this).map(xi20.c).distinctUntilChanged().subscribe((Consumer) new z2a1(this, (byte) 19)));
    }

    public final void H0() {
        super.H0();
        this.Q1.a();
        k241 k241Var = this.J1;
        if (k241Var != null) {
            k241Var.b();
        } else {
            u890.C("pageLoader");
            throw null;
        }
    }

    public final void J0(Bundle bundle) {
        ((zf30) this).h1 = true;
        tm30 tm30Var = this.H1;
        if (tm30Var == null) {
            u890.C("viewBinder");
            throw null;
        }
        tm30Var.c(bundle);
        if (bundle != null) {
            Y0().y(bundle);
        }
    }

    @Override // p.fn10
    public final gn10 Q() {
        return mno1.A;
    }

    public final wnh1 Y0() {
        wnh1 wnh1Var = this.M1;
        if (wnh1Var != null) {
            return wnh1Var;
        }
        u890.C("pageBoundUbiLogger");
        throw null;
    }

    @Override // p.lir0
    /* JADX INFO: renamed from: c */
    public final mir0 getU1() {
        mir0 mir0Var = this.L1;
        if (mir0Var != null) {
            return mir0Var;
        }
        u890.C("pageObservable");
        throw null;
    }

    @Override // p.o6r0
    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.F1();
    }

    @Override // p.jik1
    public final lik1 getViewUri() {
        kik1 kik1Var = nik1.f60p;
        String string = O0().getString("track_uri");
        if (string == null) {
            string = "";
        }
        return kik1Var.b(string);
    }

    @Override // p.ug30
    public final String s() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.F1().a;
    }

    public final void v0(Context context) {
        this.G1.f(this);
        super/*p.zf30*/.v0(context);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View, p.ges] */
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ees eesVar = this.K1;
        if (eesVar == null) {
            u890.C("pageLoaderViewBuilder");
            throw null;
        }
        ?? A = eesVar.a(P0());
        this.P1 = A;
        hs71 hs71Var = this.O1;
        if (hs71Var == null) {
            u890.C("sharedByChipElementProvider");
            throw null;
        }
        String string = O0().getString("track_uri");
        if (string == null) {
            string = "";
        }
        gs71 gs71VarT = zqo1.t(hs71Var, string);
        return gs71VarT != null ? gs71VarT.e((View) A, new tr71(fr71.a)) : A;
    }

    public nnf1() {
        this(u3x0.T0);
    }
}
