package p;

import android.content.Context;
import android.provider.Telephony;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fq91 extends h471 {
    public final c9 g;
    public final f471 h;

    /* JADX WARN: Illegal instructions before constructor call */
    public fq91(Context context, zg0 zg0Var) {
        c9 c9VarS;
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context.getApplicationContext());
        super(zg0Var, (defaultSmsPackage == null || (c9VarS = mqo1.s(new String[]{defaultSmsPackage})) == null) ? fg91.b : c9VarS, "android.intent.action.SENDTO", null, "smsto:", 40);
        this.g = mqo1.s(new yy61[]{yy61.MESSAGE, yy61.LINK});
        e571 e571Var = e571.d;
        this.h = new f471(tsx.c);
    }

    public final c9 b() {
        return this.g;
    }

    public final hyo1 d() {
        return this.h;
    }
}
