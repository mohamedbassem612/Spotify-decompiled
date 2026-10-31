package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xnw implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ynw b;

    public /* synthetic */ xnw(ynw ynwVar, byte b) {
        this.a = b;
        this.b = ynwVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ynw ynwVar = this.b;
        switch (b) {
            case 0:
                ynwVar.getClass();
                Logger.e((Throwable) obj, "Failed to fetch Samsung Token", new Object[0]);
                ynwVar.e.m(new m19("Failed to fetch Samsung Token", "", 3, ""));
                break;
            case 1:
                ynwVar.getClass();
                j741 j741Var = (j741) ((k741) obj);
                ynwVar.e.m(new m19("", j741Var.b, 1, j741Var.c));
                break;
            default:
                Throwable th = (Throwable) obj;
                m19 m19Var = (m19) ynwVar.e.e();
                if ((m19Var != null ? m19Var.a : 0) != 3) {
                    Logger.e(th, "Failed to do effortless login", new Object[0]);
                    ynwVar.e.m(new m19("Failed to do effortless login", "", 3, ""));
                    break;
                }
                break;
        }
    }
}
