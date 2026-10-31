package p;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class df10 extends h471 {
    public final /* synthetic */ byte g = 1;
    public final c9 h;
    public final d471 i;
    public final Object j;

    public df10(zg0 zg0Var, lls0 lls0Var) {
        super(zg0Var, mqo1.s(new String[]{"com.facebook.katana"}), "android.intent.action.SEND", "text/plain", null, 48);
        this.j = lls0Var;
        this.h = mqo1.s(new yy61[]{yy61.LINK});
        q471 q471Var = q471.d;
        this.i = new d471(2131233908, false);
    }

    public final o571 a() {
        switch (this.g) {
            case 0:
                return q471.d;
            default:
                return j571.d;
        }
    }

    public final c9 b() {
        switch (this.g) {
            case 0:
                break;
        }
        return this.h;
    }

    public final int c() {
        switch (this.g) {
            case 0:
                return 2131962208;
            default:
                return 2131962236;
        }
    }

    public final hyo1 d() {
        byte b = this.g;
        return this.i;
    }

    public final int e() {
        switch (this.g) {
            case 0:
                return 2131962207;
            default:
                return 2131962235;
        }
    }

    @Override // p.h471
    public final Object g(Intent intent, x871 x871Var, lnm lnmVar) {
        byte b = this.g;
        Object obj = this.j;
        switch (b) {
            case 0:
                lls0 lls0Var = (lls0) obj;
                p371 p371Var = x871Var.a;
                yn71 yn71Var = x871Var.b;
                if ((p371Var instanceof vkc0) || (p371Var instanceof a6j0)) {
                    o371 o371VarC = p371Var.c();
                    ((dr41) lls0Var.c).j(intent, p371Var, yn71Var);
                    t2p1.v(intent, o371VarC.a, "com.facebook.platform.extra.ENTITY_URI");
                    t2p1.x(intent, lls0Var.b, "com.facebook.platform.extra.ENTITY_URI", p371Var.d(), x871Var.c);
                    t2p1.g(intent, !o371VarC.b, p371Var.e(), o371VarC.c, "com.facebook.platform.extra.ALLOW_MUSIC_ATTACHMENTS");
                } else {
                    eg.m("FacebookFeed requires share data to be LinkShareData or MessageShareData");
                }
                break;
            default:
                esa1 esa1Var = (esa1) obj;
                p371 p371Var2 = x871Var.a;
                yn71 yn71Var2 = x871Var.b;
                intent.setType("text/*");
                intent.putExtra("com.tiktok.opensdk.share.extra.CLIENT_KEY", ((r7n0) esa1Var.c).a.getApplicationContext().getString(2131962345));
                intent.putExtra("com.tiktok.opensdk.share.extra.ENTITY_URI", p371Var2.d());
                intent.putExtra("com.tiktok.opensdk.share.extra.LINK", Uri.parse(yn71Var2.a).buildUpon().appendQueryParameter("noInput", "1").build().toString());
                intent.putExtra("com.tiktok.opensdk.share.extra.CALLER_PACKAGE_NAME", (String) esa1Var.b);
                intent.setFlags(335544320);
                intent.setAction("com.tiktok.opensdk.share.MUSIC_MESSAGE");
                break;
        }
        return intent;
    }

    public df10(zg0 zg0Var, esa1 esa1Var) {
        super(zg0Var, vje1.a, "com.tiktok.opensdk.share.MUSIC_MESSAGE", "text/*", null, 48);
        this.j = esa1Var;
        this.h = mqo1.s(new yy61[]{yy61.LINK});
        j571 j571Var = j571.d;
        this.i = new d471(2131233918, false);
    }
}
