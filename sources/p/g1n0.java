package p;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g1n0 implements lzn0 {
    public final Activity a;
    public final bi0 b;
    public final fwn0 c;
    public final mwn0 d;
    public final String e;
    public final syn0 f;

    public g1n0(Activity activity, bi0 bi0Var, fwn0 fwn0Var, mwn0 mwn0Var, String str, syn0 syn0Var) {
        this.a = activity;
        this.b = bi0Var;
        this.c = fwn0Var;
        this.d = mwn0Var;
        this.e = str;
        this.f = syn0Var;
    }

    @Override // p.lzn0
    public final void a(String str, tv80 tv80Var, Bundle bundle) {
        p1f0 p1f0VarW = rrn1.w(str);
        p1f0VarW.B(tv80Var);
        k(p1f0VarW.h(), bundle);
    }

    @Override // p.lzn0
    public final void b(b3i1 b3i1Var) {
        this.d.e(mqn1.h());
        Intent flags = new Intent("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS_FOR_URI_TYPE").setClassName(this.a, this.e).setFlags(67108864);
        flags.putExtra("uri_type", b3i1Var.getKey());
        this.b.a(flags);
    }

    @Override // p.lzn0
    public final void c() {
        this.d.e(mqn1.h());
        this.b.a(new Intent("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS").setClassName(this.a, this.e).setFlags(67108864));
    }

    @Override // p.lzn0
    public final void d(blc0 blc0Var) {
        this.d.e(mqn1.h());
        Intent flags = new Intent("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS_FOR_LINK").setClassName(this.a, this.e).setFlags(67108864);
        flags.putExtra("link_type", blc0Var);
        this.b.a(flags);
    }

    @Override // p.lzn0
    public final void e() {
        this.d.e(mqn1.h());
        this.b.a(new Intent("com.spotify.mobile.android.ui.action.view.SPOTIFY_URI").setClassName(this.a, this.e).setFlags(67108864));
    }

    @Override // p.lzn0
    public final void g(Bundle bundle, String str) {
        k(rrn1.w(str).h(), bundle);
    }

    @Override // p.lzn0
    public final void h(String str) {
        k(rrn1.w(str).h(), null);
    }

    @Override // p.lzn0
    public final void i(dwn0 dwn0Var, Bundle bundle) {
        k(dwn0Var, bundle);
    }

    @Override // p.lzn0
    public final boolean j(Activity activity) {
        return u890.j(activity.getClass().getCanonicalName(), this.e);
    }

    public final void k(dwn0 dwn0Var, Bundle bundle) {
        Intent intentA = this.c.a(dwn0Var);
        if (bundle != null) {
            intentA.putExtras(bundle);
        }
        intentA.putExtra("is_internal_navigation", true);
        c8o.w(intentA, this.f.c(new wyn0(dwn0Var.b())));
        this.d.e(gg.d(intentA));
        this.b.a(intentA);
    }
}
