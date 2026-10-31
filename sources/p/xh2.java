package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xh2 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yh2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ xh2(yh2 yh2Var, String str, byte b) {
        this.a = b;
        this.b = yh2Var;
        this.c = str;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        String str = this.c;
        yh2 yh2Var = this.b;
        switch (b) {
            case 0:
                String str2 = (String) obj;
                yh2Var.c(str, str2.length() > 0 ? str2 : null);
                break;
            default:
                Throwable th = (Throwable) obj;
                Logger.e(th, th.getMessage(), new Object[0]);
                yh2Var.c(str, (String) null);
                break;
        }
    }
}
