package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class znm {
    public final Context a;
    public final yqg b;
    public final v1k c;
    public final Flowable d;
    public final Scheduler e;
    public final String f;
    public boolean h;
    public x1c i;
    public final rku g = new rku();
    public String j = "";
    public final xnm k = new xnm(this);
    public final ynm l = new ynm(this);

    public znm(Context context, yqg yqgVar, v1k v1kVar, Flowable flowable, Scheduler scheduler) {
        this.a = context;
        this.b = yqgVar;
        this.c = v1kVar;
        this.d = flowable;
        this.e = scheduler;
        this.f = context.getPackageName() + "." + UUID.randomUUID();
    }

    public final void a() {
        this.i = null;
        if (this.h) {
            try {
                sl5.a.deleteAppContext(this.a.getApplicationContext(), this.f, this.l);
            } catch (Exception e) {
                this.c.F("DeleteResume error", e);
            }
        }
    }

    public final void b(long j) {
        boolean z = this.h;
        yqg yqgVar = this.b;
        if (!z) {
            this.i = new x1c(j, yqgVar.b());
            return;
        }
        nl5 nl5Var = new nl5();
        nl5Var.setType(4);
        Context context = this.a;
        nl5Var.setAppId(context.getPackageName());
        nl5Var.setContextId(this.f);
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        String strK = xfo1.k(bArr);
        nl5Var.setIntentUri("spotify:internal:connect:pull?" + gvg.h("user_hash=", xfo1.k(MessageDigest.getInstance("SHA-256").digest(this.j.concat(strK).getBytes(nne.a))), "&user_salt=", strK) + "&utm_medium=android_crossdevice_sdk");
        nl5Var.setCreateTime(yqgVar.b());
        nl5Var.setLastUpdatedTime(yqgVar.b());
        nl5Var.setLifeTime(j + 10000);
        try {
            sl5.a.sendAppContext(context.getApplicationContext(), nl5Var, this.l);
        } catch (Exception e) {
            this.c.F("SendResume error", e);
        }
    }
}
