package com.spotify.checkout.pageactivityproxy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import io.reactivex.rxjava3.core.Observable;
import kotlin.Metadata;
import p.a1r0;
import p.amy0;
import p.cj8;
import p.e1r0;
import p.ila0;
import p.l0r0;
import p.lir0;
import p.mir0;
import p.mzo;
import p.qh0;
import p.tv80;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/spotify/checkout/pageactivityproxy/PageActivityProxy;", "Lp/mzo;", "Lp/lir0;", "Lp/l0r0;", "<init>", "()V", "p/pn40", "p/e1r0", "src_main_java_com_spotify_checkout_pageactivityproxy-pageactivityproxy"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PageActivityProxy extends mzo implements lir0, l0r0 {
    public static final /* synthetic */ int f1 = 0;
    public a1r0 b1;
    public amy0 c1;
    public Parcelable d1;
    public final qh0 e1 = a0(new cj8(this, (byte) 7), e1r0.d);

    public final mir0 c() {
        return new mir0(Observable.empty());
    }

    public final void g(Intent intent) {
        this.e1.a(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        String stringExtra = getIntent().getStringExtra("EXTRA_PAGE_URI");
        String stringExtra2 = getIntent().getStringExtra("EXTRA_INPUT_CLASS_NAME");
        Class<?> cls = stringExtra2 != null ? Class.forName(stringExtra2) : null;
        Parcelable parcelable = cls != null ? (Parcelable) ila0.s(getIntent(), "EXTRA_INPUT", cls) : null;
        if (stringExtra == null || parcelable == null) {
            finish();
            return;
        }
        this.d1 = parcelable;
        a1r0 a1r0Var = this.b1;
        if (a1r0Var == null) {
            u890.C("pageActivityNavigator");
            throw null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("EXTRA_INPUT", parcelable);
        a1r0.m(a1r0Var, stringExtra, (tv80) null, bundle2, 8);
    }
}
