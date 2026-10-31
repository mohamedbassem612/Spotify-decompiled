package p;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import com.spotify.music.SpotifyMainActivity;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yh0 {
    public final ap31 a;
    public final SpotifyMainActivity b;
    public final sg61 c;
    public final akr d;
    public final hds e;
    public final gj5 f;
    public final pbk1 g;
    public final tqs0 h;
    public boolean i;
    public Long j;

    public yh0(ap31 ap31Var, SpotifyMainActivity spotifyMainActivity, sg61 sg61Var, akr akrVar, hds hdsVar, gj5 gj5Var, pbk1 pbk1Var, tqs0 tqs0Var) {
        this.a = ap31Var;
        this.b = spotifyMainActivity;
        this.c = sg61Var;
        this.d = akrVar;
        this.e = hdsVar;
        this.f = gj5Var;
        this.g = pbk1Var;
        this.h = tqs0Var;
    }

    public final Bundle a(Bundle bundle) {
        tqs0 tqs0Var = this.h;
        dma1 dma1Var = tqs0Var.a;
        bma1 bma1Var = tqs0.b;
        this.j = Long.valueOf(dma1Var.g(bma1Var, 0L));
        if (bundle == null || bundle.getLong("com.spotify.musicappplatform.rootimpl.session_ui_generation", 0L) == tqs0Var.a.g(bma1Var, 0L)) {
            return bundle;
        }
        pbk1 pbk1Var = this.g;
        gj5 gj5Var = this.f;
        gj5Var.setIntent((Intent) pbk1Var.a(gj5Var, "spotify:home").b);
        return null;
    }

    public final void b(Bundle bundle) {
        Long l = this.j;
        bundle.putLong("com.spotify.musicappplatform.rootimpl.session_ui_generation", l != null ? l.longValue() : this.h.a.g(tqs0.b, 0L));
    }

    public final boolean c() {
        if (this.i) {
            gj5 gj5Var = this.f;
            if (!gj5Var.isDestroyed() && !gj5Var.isFinishing()) {
                this.i = false;
                gj5Var.recreate();
                return true;
            }
        }
        return false;
    }

    public final void d() {
        gj5 gj5Var = this.f;
        if (gj5Var.isDestroyed() || gj5Var.isFinishing()) {
            return;
        }
        tqs0 tqs0Var = this.h;
        hma1 hma1VarEdit = tqs0Var.a.edit();
        bma1 bma1Var = tqs0.b;
        hma1VarEdit.c(bma1Var, tqs0Var.a.g(bma1Var, 0L) + 1);
        hma1VarEdit.h();
        this.b.p0().a = Bundle.EMPTY;
        gj5Var.setIntent((Intent) this.g.a(gj5Var, "spotify:home").b);
        if (((f0i) gj5Var).a.i.a(w8c0.d)) {
            gj5Var.recreate();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) gj5Var.findViewById(R.id.content);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.i = true;
    }

    public final pi61 e() {
        this.a.z();
        this.d.d();
        sg61 sg61Var = this.c;
        yun0 yun0Var = sg61Var.a;
        yun0Var.n();
        sg61Var.b.b.m((Object) null);
        xxn0 xxn0VarC = yun0Var.c();
        xun0 xun0Var = xxn0VarC.a;
        ArrayDeque arrayDeque = xxn0VarC.d;
        ArrayDeque arrayDeque2 = xxn0VarC.c;
        xun0 xun0Var2 = xxn0VarC.b;
        boolean z = true;
        boolean z2 = xun0Var == null && xun0Var2 == null && arrayDeque2.isEmpty() && arrayDeque.isEmpty();
        boolean z3 = xun0Var != null;
        boolean z4 = xun0Var2 != null;
        String str = "currentEntry=" + z3 + ", previousEntry=" + z4 + ", normalBackStack=" + arrayDeque2.size() + ", overlayBackStack=" + arrayDeque.size();
        this.e.a();
        t4t t4tVarP0 = this.b.p0();
        t4tVarP0.a = null;
        zh30 zh30Var = t4tVarP0.b;
        if (zh30Var.Z) {
            vr51 vr51Var = zh30Var.Q0;
            if (vr51Var != null) {
                vr51Var.c();
            }
            zh30Var.Q0 = null;
            f8l f8lVar = zh30Var.e;
            if (f8lVar.a) {
                f8lVar.c.removeCallbacksAndMessages(null);
                x8c0 x8c0Var = f8lVar.b;
                if (x8c0Var != null) {
                    x8c0Var.d(f8lVar.e);
                }
                f8lVar.b = null;
                f8lVar.a = false;
            }
            tac0 tac0Var = f8lVar.d;
            if (tac0Var.i.a(w8c0.c)) {
                tac0Var.i(w8c0.a);
            }
            zh30Var.a();
            z = ((th30) ((tg30) zh30Var.i.b).g).L;
        }
        if (z && z2) {
            d();
            return r5x0.X;
        }
        return new oi61("fragmentTeardown=" + z + ", navigation=[" + str + "]");
    }
}
