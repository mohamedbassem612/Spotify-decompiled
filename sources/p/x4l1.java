package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.interapp.service.IapException;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class x4l1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lxh1 b;
    public final /* synthetic */ ifl1 c;

    public /* synthetic */ x4l1(lxh1 lxh1Var, ifl1 ifl1Var, byte b) {
        this.a = b;
        this.b = lxh1Var;
        this.c = ifl1Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ifl1 ifl1Var = this.c;
        lxh1 lxh1Var = this.b;
        switch (b) {
            case 0:
                m8b0 m8b0Var = (m8b0) ifl1Var.b;
                m8b0Var.b(1);
                m8b0Var.d(3);
                ((s24) lxh1Var.b).a0(new Object[]{50, Integer.valueOf(m8b0Var.b(1)), cv5.a, obj});
                break;
            default:
                IapException iapException = (Throwable) obj;
                s24 s24Var = (s24) lxh1Var.b;
                boolean z = iapException instanceof TimeoutException;
                m8b0 m8b0Var2 = (m8b0) ifl1Var.b;
                if (!z) {
                    Logger.k("WAMP failed request with id: %d, proc: %s, error: %s", new Object[]{Integer.valueOf(m8b0Var2.b(1)), m8b0Var2.d(3), iapException});
                    s24Var.Z(48, m8b0Var2.b(1), iapException instanceof IapException ? iapException.a : iapException.getClass().getName(), iapException.getMessage());
                } else {
                    int iB = m8b0Var2.b(1);
                    Locale locale = Locale.ENGLISH;
                    s24Var.Z(48, iB, l1d.m("Timeout running ", m8b0Var2.d(3)), (String) null);
                }
                break;
        }
    }
}
