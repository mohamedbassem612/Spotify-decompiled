package p;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.spotify.music.SpotifyMainActivity;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cks implements ap31 {
    public final bp31 N0;
    public v6s O0;
    public boolean P0;
    public nxr Q0;
    public Parcelable R0;
    public boolean S0;
    public ip31 T0;
    public final idd1 U0 = new idd1(new dor(this, (byte) 26));
    public final y1s V0 = new y1s(this, (byte) 1);
    public final wc30 X;
    public final lmw Y;
    public final tif1 Z;
    public final Set a;
    public final gj5 b;
    public final SpotifyMainActivity c;
    public final miq d;
    public final niq e;
    public final vxf0 f;
    public final ynb0 g;
    public final cp31 h;
    public final lxg i;
    public final e4t t;

    public cks(t380 t380Var, gj5 gj5Var, SpotifyMainActivity spotifyMainActivity, miq miqVar, niq niqVar, vxf0 vxf0Var, ynb0 ynb0Var, cp31 cp31Var, lxg lxgVar, e4t e4tVar, wc30 wc30Var, lmw lmwVar, tif1 tif1Var) {
        this.a = t380Var;
        this.b = gj5Var;
        this.c = spotifyMainActivity;
        this.d = miqVar;
        this.e = niqVar;
        this.f = vxf0Var;
        this.g = ynb0Var;
        this.h = cp31Var;
        this.i = lxgVar;
        this.t = e4tVar;
        this.X = wc30Var;
        this.Y = lmwVar;
        this.Z = tif1Var;
        this.N0 = cp31Var.A();
    }

    @Override // p.ap31
    public final void E(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        l1g0 l1g0Var = (l1g0) this.g.get();
        l1g0Var.a(layoutInflater, frameLayout);
        x9p1.p(l1g0Var.b(), (iac0) this.U0.getValue());
        frameLayout.addView(l1g0Var.b());
        this.P0 = true;
        nxr nxrVar = this.Q0;
        if (nxrVar != null) {
            this.Q0 = null;
            nxrVar.invoke();
        }
    }

    @Override // p.ap31
    public final bp31 M() {
        return this.N0;
    }

    @Override // p.ap31
    public final void P() {
        ((f0i) this.b).a.a(this.V0);
    }

    public final void a() {
        v6s v6sVar = this.O0;
        if (v6sVar != null) {
            ((f0i) v6sVar.b).a.d(v6sVar.i);
            tac0 tac0Var = v6sVar.h;
            tac0Var.g(k8c0.ON_DESTROY);
            tac0Var.d(v6sVar.t);
        }
        this.O0 = null;
    }

    @Override // p.bbr0
    public final war0 b0(Class cls) {
        return this.h.C(cls);
    }

    @Override // p.ap31
    public final void i() {
        ((i94) this.i).e("logged_in_session");
    }

    @Override // p.ap31
    public final boolean v() {
        v6s v6sVar = this.O0;
        if (v6sVar != null) {
            return v6sVar.f;
        }
        return false;
    }

    @Override // p.ap31
    public final void z() {
        this.S0 = true;
        this.Q0 = null;
        this.R0 = null;
        a();
        this.h.t();
    }
}
