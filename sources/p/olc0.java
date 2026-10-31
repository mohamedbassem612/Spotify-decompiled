package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Base64;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class olc0 extends h471 {
    public final /* synthetic */ byte g;
    public final Object h;
    public final c9 i;
    public final hyo1 j;
    public final Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olc0(zg0 zg0Var, efr efrVar, p410 p410Var, byte b) {
        super(zg0Var, mqo1.s(new String[]{"com.whatsapp"}), "android.intent.action.SEND", "text/plain", null, 48);
        this.g = b;
        yy61 yy61Var = yy61.LINK;
        yy61 yy61Var2 = yy61.IMAGE;
        yy61 yy61Var3 = yy61.MESSAGE;
        switch (b) {
            case 3:
                super(zg0Var, mqo1.s(new String[]{"com.twitter.android"}), "android.intent.action.SEND", "text/plain", null, 48);
                this.h = efrVar;
                this.k = p410Var;
                this.i = mqo1.s(new yy61[]{yy61Var3, yy61Var2, yy61Var});
                n571 n571Var = n571.d;
                this.j = new d471(2131233920, false);
                break;
            default:
                this.h = efrVar;
                this.k = p410Var;
                this.i = mqo1.s(new yy61[]{yy61Var3, yy61Var2, yy61Var});
                l571 l571Var = l571.d;
                this.j = new e471(dux.c);
                break;
        }
    }

    public final o571 a() {
        switch (this.g) {
            case 0:
                return y471.d;
            case 1:
                return g571.d;
            case 2:
                return l571.d;
            default:
                return n571.d;
        }
    }

    public final c9 b() {
        switch (this.g) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.i;
    }

    public final int c() {
        switch (this.g) {
            case 0:
                return 2131962224;
            case 1:
                return 2131962230;
            case 2:
                return 2131962238;
            default:
                return 2131962242;
        }
    }

    public final hyo1 d() {
        byte b = this.g;
        hyo1 hyo1Var = this.j;
        switch (b) {
            case 0:
                return (d471) hyo1Var;
            case 1:
                return (d471) hyo1Var;
            case 2:
                return (e471) hyo1Var;
            default:
                return (d471) hyo1Var;
        }
    }

    public final int e() {
        switch (this.g) {
            case 0:
                return 2131962223;
            case 1:
                return 2131962229;
            case 2:
                return 2131962237;
            default:
                return 2131962241;
        }
    }

    @Override // p.h471
    public boolean f() {
        switch (this.g) {
            case 0:
                return ph5.E((Context) this.h, this.b) >= 211100;
            default:
                return super.f();
        }
    }

    @Override // p.h471
    public final Object g(Intent intent, x871 x871Var, lnm lnmVar) {
        byte b = this.g;
        Object obj = this.h;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                ye90 ye90Var = (ye90) obj2;
                ((dr41) ye90Var.c).j(intent, x871Var.a, x871Var.b);
                intent.putExtra("com.linkedin.platform.extra.APPLICATION_ID", ((r7n0) ye90Var.b).a.getApplicationContext().getString(2131962304));
                intent.putExtra("com.linkedin.platform.extra.LINK_ORIGIN", "DEEPLINK_APP");
                return intent;
            case 1:
                intent.setFlags(335544320);
                String str = x871Var.b.a;
                intent.putExtra("CLIENT_ID", ((r7n0) obj2).a.getApplicationContext().getString(2131962344));
                intent.putExtra("RESULT_INTENT", PendingIntent.getActivity((Context) obj, 20221013, new Intent(), Build.VERSION.SDK_INT >= 31 ? 67108864 : 1073741824));
                intent.putExtra("attachmentUrl", str);
                intent.putExtra("lensUUID", "8de5a95d582641b7b91eccdc4edd3ed4");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                intent.putExtra("lensLaunchData", Base64.encodeToString(new uga0(linkedHashMap).toString().getBytes(nne.a), 2));
                return intent;
            case 2:
                if (x871Var.a instanceof pz70) {
                    return ((p410) obj2).z(this, intent, x871Var, (onm) lnmVar);
                }
                ((efr) obj).f(intent, x871Var);
                return intent;
            default:
                if (x871Var.a instanceof pz70) {
                    return ((p410) obj2).z(this, intent, x871Var, (onm) lnmVar);
                }
                ((efr) obj).f(intent, x871Var);
                return intent;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olc0(zg0 zg0Var, Context context, ye90 ye90Var) {
        super(zg0Var, mqo1.s(new String[]{"com.linkedin.android"}), "android.intent.action.SEND", "text/plain", null, 48);
        this.g = (byte) 0;
        this.h = context;
        this.k = ye90Var;
        this.i = mqo1.s(new yy61[]{yy61.MESSAGE, yy61.LINK});
        y471 y471Var = y471.d;
        this.j = new d471(2131233912, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olc0(zg0 zg0Var, r7n0 r7n0Var, Context context) {
        super(zg0Var, mqo1.s(new String[]{"com.snapchat.android"}), "android.intent.action.SEND", "*/*", "snapchat://creativekit/camera", 32);
        this.g = (byte) 1;
        this.k = r7n0Var;
        this.h = context;
        this.i = mqo1.s(new yy61[]{yy61.LINK});
        g571 g571Var = g571.d;
        this.j = new d471(2131233916, false);
    }
}
