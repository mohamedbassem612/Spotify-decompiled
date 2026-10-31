package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hn80 extends h471 {
    public final /* synthetic */ byte g = 0;
    public final Context h;
    public final int i;
    public final c9 j;
    public final d471 k;
    public final Object l;

    public hn80(zg0 zg0Var, Context context, efr efrVar, int i) {
        super(zg0Var, mqo1.s(new String[]{"com.instagram.barcelona"}), "android.intent.action.SEND", "text/plain", null, 48);
        this.h = context;
        this.l = efrVar;
        this.i = i;
        this.j = mqo1.s(new yy61[]{yy61.LINK, yy61.MESSAGE});
        h571 h571Var = h571.d;
        this.k = new d471(2131233917, false);
    }

    public final o571 a() {
        switch (this.g) {
            case 0:
                return v471.d;
            default:
                return h571.d;
        }
    }

    public final c9 b() {
        switch (this.g) {
            case 0:
                break;
        }
        return this.j;
    }

    public final int c() {
        switch (this.g) {
            case 0:
                return 2131962218;
            default:
                return 2131962232;
        }
    }

    public final hyo1 d() {
        byte b = this.g;
        return this.k;
    }

    public final int e() {
        switch (this.g) {
            case 0:
                return 2131962217;
            default:
                return 2131962231;
        }
    }

    @Override // p.h471
    public final boolean f() {
        byte b = this.g;
        c380 c380Var = this.b;
        Context context = this.h;
        int i = this.i;
        switch (b) {
            case 0:
                long j = i;
                if (j < 379603601) {
                    return false;
                }
                long jE = ph5.E(context, c380Var);
                return jE >= j || jE == 1;
            default:
                return i > 0 && ph5.E(context, c380Var) >= ((long) i);
        }
    }

    @Override // p.h471
    public final Object g(Intent intent, x871 x871Var, lnm lnmVar) {
        byte b = this.g;
        Object obj = this.l;
        switch (b) {
            case 0:
                p371 p371Var = x871Var.a;
                yn71 yn71Var = x871Var.b;
                Bundle bundle = (Bundle) ((kf10) ((r7n0) ((bm00) obj).b).b.getValue()).b.getValue();
                String string = bundle != null ? bundle.getString("com.facebook.sdk.ApplicationId") : null;
                if (string == null) {
                    string = "";
                }
                intent.putExtra("source_application", string);
                intent.putExtra("entity_uri", p371Var.d());
                intent.putExtra("content_url", yn71Var.a);
                intent.setAction("com.instagram.share.ADD_TO_MUSIC_NOTE");
                break;
            default:
                ((efr) obj).f(intent, x871Var);
                break;
        }
        return intent;
    }

    public hn80(zg0 zg0Var, Context context, int i, bm00 bm00Var) {
        super(zg0Var, mqo1.s(new String[]{"com.instagram.android"}), "com.instagram.share.ADD_TO_MUSIC_NOTE", null, null, 56);
        this.h = context;
        this.i = i;
        this.l = bm00Var;
        this.j = mqo1.s(new yy61[]{yy61.LINK});
        v471 v471Var = v471.d;
        this.k = new d471(2131233910, false);
    }
}
