package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.share.resultactivity.api.ShareResultActivity;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yje1 extends h471 {
    public final r7n0 g;
    public final r2a1 h;
    public final Context i;
    public final c9 j;
    public final d471 k;

    public yje1(zg0 zg0Var, boolean z, r7n0 r7n0Var, r2a1 r2a1Var, Context context) {
        super(zg0Var, vje1.a, "com.tiktok.opensdk.share.MUSIC_FEED", "image/png", null, 16);
        this.g = r7n0Var;
        this.h = r2a1Var;
        this.i = context;
        smc0 smc0VarN = k4p1.n();
        if (z) {
            smc0VarN.add(yy61.VIDEO_STORY);
        }
        smc0VarN.add(yy61.IMAGE_STORY);
        smc0VarN.add(yy61.GRADIENT_STORY);
        this.j = mqo1.F(k4p1.k(smc0VarN));
        i571 i571Var = i571.d;
        this.k = new d471(2131233918, false);
    }

    public final o571 a() {
        return i571.d;
    }

    public final c9 b() {
        return this.j;
    }

    public final int c() {
        return 2131962234;
    }

    public final hyo1 d() {
        return this.k;
    }

    public final int e() {
        return 2131962233;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // p.h471
    public final Object g(Intent intent, x871 x871Var, lnm lnmVar) {
        xje1 xje1Var;
        p371 p371Var;
        Object objM;
        Intent intent2;
        x871 x871Var2;
        int i;
        Intent intent3 = intent;
        if (lnmVar instanceof xje1) {
            xje1Var = (xje1) lnmVar;
            int i2 = xje1Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xje1Var.h = i2 - Integer.MIN_VALUE;
            } else {
                xje1Var = new xje1(this, (onm) lnmVar);
            }
        } else {
            xje1Var = new xje1(this, (onm) lnmVar);
        }
        Object obj = xje1Var.f;
        int i3 = xje1Var.h;
        Object obj2 = d9n.a;
        if (i3 == 0) {
            hm5.M(obj);
            p371Var = x871Var.a;
            if (!(p371Var instanceof i9c1)) {
                eg.m("TiktokFeed requires share data to be StoryShareData");
                return null;
            }
            i9c1 i9c1Var = (i9c1) p371Var;
            bnt bntVarH = i9c1Var.h();
            xje1Var.a = x871Var;
            xje1Var.b = intent3;
            xje1Var.c = intent3;
            xje1Var.d = i9c1Var;
            xje1Var.e = 0;
            xje1Var.h = 1;
            objM = this.h.m(intent3, bntVarH, xje1Var);
            if (objM != obj2) {
                intent2 = intent3;
                x871Var2 = x871Var;
                i = 0;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Intent intent4 = xje1Var.b;
            hm5.M(obj);
            return intent4;
        }
        int i4 = xje1Var.e;
        i9c1 i9c1Var2 = xje1Var.d;
        Intent intent5 = xje1Var.c;
        intent2 = xje1Var.b;
        x871Var2 = xje1Var.a;
        hm5.M(obj);
        i = i4;
        intent3 = intent5;
        objM = obj;
        p371Var = i9c1Var2;
        Uri uri = (Uri) objM;
        String str = x871Var2.b.c;
        Map mapE = p371Var.e();
        intent3.addCategory("android.intent.category.DEFAULT");
        mmr0 mmr0Var = new mmr0("com.tiktok.opensdk.share.extra.CLIENT_KEY", this.g.a.getApplicationContext().getString(2131962345));
        mmr0 mmr0Var2 = new mmr0("com.tiktok.opensdk.share.extra.LINK", Uri.parse(x871Var2.b.a).buildUpon().appendQueryParameter("noInput", "1").build().toString());
        if (u890.j(mapE.get("feature"), "wrapped")) {
            str = "spotify:wrapped:share";
        }
        dzo1.k(intent3, new mmr0[]{mmr0Var, mmr0Var2, new mmr0("com.tiktok.opensdk.share.extra.ENTITY_URI", str), new mmr0("com.tiktok.opensdk.share.extra.CALLER_PACKAGE_NAME", this.i.getPackageName()), new mmr0("com.tiktok.opensdk.share.extra.CALLER_RETURNED_LOCAL_ENTRY", String.valueOf(rc11.a.b(ShareResultActivity.class).o()))});
        intent3.setFlags(335544320);
        dzo1.k(intent3, new mmr0[]{new mmr0("com.tiktok.opensdk.share.extra.MEDIA", p7h.H(new String[]{String.valueOf(uri)})), new mmr0("com.tiktok.opensdk.share.extra.COVER_IMAGE_SIZE", 0)});
        intent3.putExtra("com.tiktok.opensdk.share.extra.COVER_IMAGE_SIZE", uri == null ? 1 : 0);
        i9c1 i9c1Var3 = (i9c1) p371Var;
        boolean z = uri != null;
        xje1Var.a = null;
        xje1Var.b = intent2;
        xje1Var.c = null;
        xje1Var.d = null;
        xje1Var.e = i;
        xje1Var.h = 2;
        return i(intent3, i9c1Var3, z, xje1Var) == obj2 ? obj2 : intent2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(Intent intent, i9c1 i9c1Var, boolean z, onm onmVar) {
        wje1 wje1Var;
        int i;
        if (onmVar instanceof wje1) {
            wje1Var = (wje1) onmVar;
            int i2 = wje1Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wje1Var.f = i2 - Integer.MIN_VALUE;
            } else {
                wje1Var = new wje1(this, onmVar);
            }
        } else {
            wje1Var = new wje1(this, onmVar);
        }
        Object objH = wje1Var.d;
        int i3 = wje1Var.f;
        if (i3 == 0) {
            hm5.M(objH);
            t0c t0cVarG = i9c1Var.g();
            boolean z2 = t0cVarG instanceof cnt;
            if (t0cVarG instanceof ant) {
                ant antVar = (ant) t0cVarG;
                dzo1.k(intent, new mmr0[]{new mmr0("com.tiktok.opensdk.share.extra.BACKGROUND_TOP_COLOR_HEX", bmq0.k(antVar.e)), new mmr0("com.tiktok.opensdk.share.extra.BACKGROUND_BOTTOM_COLOR_HEX", bmq0.k(antVar.f))});
            } else {
                t0c t0cVarG2 = i9c1Var.g();
                wje1Var.a = intent;
                wje1Var.b = z;
                wje1Var.c = z2 ? 1 : 0;
                wje1Var.f = 1;
                objH = this.h.h(intent, t0cVarG2, wje1Var);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
                i = z2 ? 1 : 0;
            }
            return rih1.a;
        }
        if (i3 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = wje1Var.c;
        z = wje1Var.b;
        intent = wje1Var.a;
        hm5.M(objH);
        Uri uri = (Uri) objH;
        intent.setType(i != 0 ? "video/*" : "image/*");
        intent.putExtra(z ? "com.tiktok.opensdk.share.extra.BACKGROUND_IMAGE" : "com.tiktok.opensdk.share.extra.MEDIA", p7h.H(new String[]{uri.toString()})).getClass();
        return rih1.a;
    }
}
