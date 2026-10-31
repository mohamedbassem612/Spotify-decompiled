package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.SpotifyMainActivity;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class eyn0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f25p;

    public eyn0(SpotifyMainActivity spotifyMainActivity, SpotifyMainActivity spotifyMainActivity2, ggs0 ggs0Var, b5b1 b5b1Var, iac0 iac0Var, st60 st60Var, o0g1 o0g1Var, jvn0 jvn0Var, lzn0 lzn0Var, rsn0 rsn0Var, hds hdsVar, io60 io60Var, d520 d520Var, a44 a44Var, bnj0 bnj0Var, g8h1 g8h1Var, mwn0 mwn0Var) {
        this.a = spotifyMainActivity2;
        this.b = ggs0Var;
        this.c = st60Var;
        this.d = o0g1Var;
        this.e = jvn0Var;
        this.f = lzn0Var;
        this.g = rsn0Var;
        this.h = hdsVar;
        this.i = io60Var;
        this.j = d520Var;
        this.k = a44Var;
        this.l = bnj0Var;
        this.m = g8h1Var;
        this.n = mwn0Var;
        this.o = new du9(new u6j0(this, (byte) 6), b5b1Var, new ivn0(this, (byte) 2));
        this.f25p = new xkm0(this, (byte) 25);
        ((g0i) spotifyMainActivity).Y.add(new ayn0(this));
        jvn0Var.e.add(new byn0(this));
        iac0Var.getLifecycle().a(new cyn0(this));
    }

    public void a(Intent intent) {
        String stringExtra;
        if (intent.getBooleanExtra("extra_deeplink_navigation_logged", false) || (stringExtra = intent.getStringExtra("extra_deeplink_navigation_reference")) == null) {
            return;
        }
        ((mwn0) this.n).e(mqn1.m(stringExtra));
        intent.putExtra("extra_deeplink_navigation_logged", true);
    }

    public eyn0(gw70 gw70Var, Scheduler scheduler, Scheduler scheduler2, q8n q8nVar, be91 be91Var, np61 np61Var, luk lukVar, zwz0 zwz0Var, jo0 jo0Var, crd crdVar, emc emcVar, Context context, xug0 xug0Var, t2j0 t2j0Var, krh krhVar, ov20 ov20Var) {
        this.a = gw70Var;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = q8nVar;
        this.e = be91Var;
        this.f = np61Var;
        this.g = lukVar;
        this.h = zwz0Var;
        this.i = jo0Var;
        this.j = crdVar;
        this.k = emcVar;
        this.l = context;
        this.m = xug0Var;
        this.n = t2j0Var;
        this.o = krhVar;
        this.f25p = ov20Var;
    }
}
