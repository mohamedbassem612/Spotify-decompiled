package p;

import com.spotify.base.java.logging.Logger;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vml1 implements BiConsumer {
    public static final vml1 a = new vml1();

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        tml1 tml1Var = (tml1) obj;
        Exception exc = (Exception) obj2;
        String message = exc != null ? exc.getMessage() : null;
        if (message == null) {
            message = "";
        }
        Logger.d("WhatsappOtpReceiver", new Object[]{"WhatsApp OTP error: " + tml1Var + " " + message});
        dt71 dt71Var = wml1.a;
        String message2 = exc != null ? exc.getMessage() : null;
        wml1.c.a(tml1Var + " " + (message2 != null ? message2 : ""));
    }
}
