package p;

import android.app.Application;
import android.content.SharedPreferences;
import com.ravelin.core.repository.db.AppDatabase;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fnc implements jly0 {
    public final /* synthetic */ byte a;
    public final jly0 b;
    public final jly0 c;
    public final jly0 d;
    public final jly0 e;

    public /* synthetic */ fnc(Object obj, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, byte b) {
        this.a = b;
        this.b = jly0Var;
        this.c = jly0Var2;
        this.d = jly0Var3;
        this.e = jly0Var4;
    }

    @Override // p.kly0
    public final Object get() {
        byte b = this.a;
        jly0 jly0Var = this.e;
        jly0 jly0Var2 = this.d;
        jly0 jly0Var3 = this.c;
        jly0 jly0Var4 = this.b;
        switch (b) {
            case 0:
                String str = (String) ((jo80) jly0Var4).a;
                Application application = (Application) ((jo80) jly0Var3).a;
                ((j6n1) jly0Var2).get();
                return new r7n1(str, application, (j7n1) ((j6n1) jly0Var).get());
            case 1:
                qpc qpcVar = (qpc) jly0Var3.get();
                p090 p090Var = (p090) jly0Var2.get();
                p090 p090Var2 = (p090) jly0Var.get();
                zyp0 zyp0Var = new zyp0();
                if (p090Var != null) {
                    zyp0Var.a(p090Var);
                }
                if (p090Var2 != null) {
                    zyp0Var.a(p090Var2);
                }
                zyp0Var.l = qpcVar;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                zyp0Var.z = z4n1.b("timeout", 10L, timeUnit);
                zyp0Var.y = z4n1.b("timeout", 10L, timeUnit);
                return new azp0(zyp0Var);
            default:
                return new lvg((AppDatabase) ((d7n1) jly0Var4).get(), (o9b0) jly0Var3.get(), (bep0) jly0Var2.get(), (SharedPreferences) jly0Var.get());
        }
    }
}
