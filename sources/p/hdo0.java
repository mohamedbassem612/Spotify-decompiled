package p;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.music.SpotifyMainActivity;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hdo0 implements ap31 {
    public final lmw N0;
    public final LinkedHashSet O0;
    public final xiq P0;
    public final bp31 Q0;
    public boolean S0;
    public final tif1 X;
    public final cp31 Y;
    public final ynb0 Z;
    public final gj5 a;
    public final SpotifyMainActivity b;
    public final xm41 c;
    public final kge d;
    public final mr20 e;
    public final vxf0 f;
    public final xm41 g;
    public final jxa h;
    public final lxg i;
    public final wc30 t;
    public final idd1 R0 = new idd1(new gdo0(this, (byte) 3));
    public final hrr0 T0 = v8r.q(Boolean.FALSE);
    public final y1s U0 = new y1s(this, (byte) 2);

    public hdo0(gj5 gj5Var, SpotifyMainActivity spotifyMainActivity, xm41 xm41Var, kge kgeVar, mr20 mr20Var, vxf0 vxf0Var, xm41 xm41Var2, jxa jxaVar, lxg lxgVar, wc30 wc30Var, tif1 tif1Var, cp31 cp31Var, ynb0 ynb0Var, lmw lmwVar, LinkedHashSet linkedHashSet, xiq xiqVar) {
        this.a = gj5Var;
        this.b = spotifyMainActivity;
        this.c = xm41Var;
        this.d = kgeVar;
        this.e = mr20Var;
        this.f = vxf0Var;
        this.g = xm41Var2;
        this.h = jxaVar;
        this.i = lxgVar;
        this.t = wc30Var;
        this.X = tif1Var;
        this.Y = cp31Var;
        this.Z = ynb0Var;
        this.N0 = lmwVar;
        this.O0 = linkedHashSet;
        this.P0 = xiqVar;
        this.Q0 = (bp31) cp31Var.f;
    }

    public final void E(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        l1g0 l1g0Var = (l1g0) this.Z.get();
        l1g0Var.a(layoutInflater, frameLayout);
        x9p1.p(l1g0Var.b(), (iac0) this.R0.getValue());
        ViewGroup viewGroupB = l1g0Var.b();
        ComposeView composeView = new ComposeView(this.a, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setViewCompositionStrategy(p5x0.W0);
        composeView.setContent(new j2i(518513355, new loi0(this, viewGroupB, (byte) 29), true));
        frameLayout.addView(composeView);
    }

    public final bp31 M() {
        return this.Q0;
    }

    public final void P() {
        ((f0i) this.a).a.a(this.U0);
    }

    public final war0 b0(Class cls) {
        return this.Y.C(cls);
    }

    public final void i() {
        this.i.e("logged_in_session");
    }

    public final boolean v() {
        return this.S0;
    }

    public final void z() {
        this.T0.setValue(Boolean.TRUE);
        this.S0 = false;
        this.Y.t();
    }
}
