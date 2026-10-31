package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.SpotifyMainActivity;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp/brm1;", "Lp/hip;", "Lp/ug30;", "Lp/o6r0;", "<init>", "()V", "src_main_java_com_spotify_yourepisodes_settings-settings"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class brm1 extends hip implements ug30, o6r0 {
    public s880 G1;
    public SpotifyMainActivity H1;
    public wnh1 I1;
    public t8h1 J1;
    public final gn10 K1 = lqm1.c;

    public final String A(Context context) {
        return context.getString(2131963992);
    }

    public final void D0() {
        ((zf30) this).h1 = true;
        s880 s880Var = this.G1;
        if (s880Var == null) {
            u890.C("pageManager");
            throw null;
        }
        k241 k241Var = (k241) s880Var.g;
        if (k241Var == null) {
            u890.C("pageLoader");
            throw null;
        }
        k241Var.b();
        wnh1 wnh1Var = this.I1;
        if (wnh1Var != null) {
            wnh1.H(wnh1Var);
        } else {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        s880 s880Var = this.G1;
        if (s880Var == null) {
            u890.C("pageManager");
            throw null;
        }
        ges gesVar = (ges) s880Var.a;
        if (gesVar == null) {
            u890.C("pageLoaderView");
            throw null;
        }
        k241 k241Var = (k241) s880Var.g;
        if (k241Var == null) {
            u890.C("pageLoader");
            throw null;
        }
        gesVar.E(this, k241Var);
        k241 k241Var2 = (k241) s880Var.g;
        if (k241Var2 == null) {
            u890.C("pageLoader");
            throw null;
        }
        k241Var2.a();
        t8h1 t8h1Var = this.J1;
        if (t8h1Var == null) {
            u890.C("pageLocationChangeListener");
            throw null;
        }
        t8h1.n(t8h1Var, lqm1.d);
        wnh1 wnh1Var = this.I1;
        if (wnh1Var != null) {
            wnh1Var.F();
        } else {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
    }

    public final void G0() {
        ((zf30) this).h1 = true;
        wnh1 wnh1Var = this.I1;
        if (wnh1Var != null) {
            wnh1Var.G();
        } else {
            u890.C("pageBoundUbiLogger");
            throw null;
        }
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final gn10 getK1() {
        return this.K1;
    }

    public final mir0 c() {
        uba ubaVar = this.I1;
        if (ubaVar != null) {
            return new mir0(ubaVar.a());
        }
        u890.C("pageBoundUbiLogger");
        throw null;
    }

    public final n6r0 e() {
        blc0 blc0Var = lqm1.a;
        return lqm1.d;
    }

    public final String s() {
        return lqm1.c.getName();
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SpotifyMainActivity spotifyMainActivity = this.H1;
        if (spotifyMainActivity == null) {
            u890.C("spotifyFragmentContainer");
            throw null;
        }
        String string = P0().getString(2131963992);
        mmo mmoVar = spotifyMainActivity.j1;
        if (mmoVar == null) {
            u890.C("currentFragmentAccessor");
            throw null;
        }
        mmoVar.b(string, this);
        int i = kgr0.T0;
        s880 s880Var = this.G1;
        if (s880Var == null) {
            u890.C("pageManager");
            throw null;
        }
        Context contextP0 = P0();
        ges gesVarA = (ges) s880Var.a;
        if (gesVarA == null) {
            s880Var.g = ((q1n0) s880Var.c).a(bbp1.h((Single) s880Var.b));
            i1n0 i1n0Var = (i1n0) s880Var.d;
            lik1 lik1Var = lqm1.e;
            n6r0 n6r0Var = (n6r0) s880Var.e;
            i1n0Var.getClass();
            ees eesVarA = i1n0Var.a(new x7r0(n6r0Var), pap1.C(lik1Var));
            eesVarA.a.b = new u5b(s880Var, (byte) 8);
            gesVarA = eesVarA.a(contextP0);
            s880Var.a = gesVarA;
        }
        return xyn1.z(gesVarA);
    }

    public final void z0() {
        ((zf30) this).h1 = true;
        s880 s880Var = this.G1;
        if (s880Var == null) {
            u890.C("pageManager");
            throw null;
        }
        nrm1 nrm1Var = (nrm1) s880Var.h;
        if (nrm1Var == null) {
            u890.C("pageElement");
            throw null;
        }
        MobiusLoop.Controller controller = nrm1Var.f;
        if (controller != null) {
            controller.disconnect();
        }
    }
}
