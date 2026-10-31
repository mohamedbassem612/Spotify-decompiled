package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bkm0 extends i471 {
    public final Context a;
    public final vnr b;
    public final c9 c = mqo1.s(new yy61[]{yy61.LINK, yy61.MESSAGE});
    public final f471 d;

    public bkm0(Context context, vnr vnrVar, q8n q8nVar) {
        this.a = context;
        this.b = vnrVar;
        z471 z471Var = z471.d;
        this.d = new f471(fpx.c);
    }

    public final o571 a() {
        return z471.d;
    }

    public final c9 b() {
        return this.c;
    }

    public final int c() {
        return 2131962274;
    }

    public final hyo1 d() {
        return this.d;
    }

    public final int e() {
        return 2131962273;
    }

    @Override // p.i471
    public final Object f(r571 r571Var, lnm lnmVar) {
        Intent intentB = vnr.b(r571Var.b, r571Var.a);
        yn71 yn71Var = r571Var.b;
        p371 p371Var = r571Var.a;
        String str = r571Var.c;
        String str2 = r571Var.d;
        String str3 = r571Var.e;
        z771 z771Var = r571Var.f;
        PendingIntent pendingIntentA = this.b.a(str, str2, str3, r571Var.g, p371Var, z771Var, r571Var.h, yn71Var);
        Context context = this.a;
        Intent intentCreateChooser = Intent.createChooser(intentB, context.getString(2131962269), pendingIntentA.getIntentSender());
        intentCreateChooser.addFlags(268435456);
        context.startActivity(intentCreateChooser);
        return rih1.a;
    }
}
