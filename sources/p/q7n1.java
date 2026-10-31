package p;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q7n1 implements jly0 {
    public final /* synthetic */ byte a;
    public final jly0 b;
    public final jly0 c;

    public /* synthetic */ q7n1(Object obj, jly0 jly0Var, jly0 jly0Var2, byte b) {
        this.a = b;
        this.b = jly0Var;
        this.c = jly0Var2;
    }

    @Override // p.kly0
    public final Object get() {
        byte b = this.a;
        jly0 jly0Var = this.c;
        jly0 jly0Var2 = this.b;
        switch (b) {
            case 0:
                return new p7n1((mvg) jly0Var2.get(), (SharedPreferences) jly0Var.get());
            default:
                p090 p090Var = (p090) jly0Var2.get();
                p090 p090Var2 = (p090) jly0Var.get();
                zyp0 zyp0Var = new zyp0();
                if (p090Var != null) {
                    zyp0Var.a(p090Var);
                }
                if (p090Var2 != null) {
                    zyp0Var.a(p090Var2);
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                zyp0Var.z = z4n1.b("timeout", 10L, timeUnit);
                zyp0Var.y = z4n1.b("timeout", 10L, timeUnit);
                return new azp0(zyp0Var);
        }
    }
}
