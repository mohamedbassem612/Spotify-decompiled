package p;

import com.spotify.base.java.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pam0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sam0 b;
    public final /* synthetic */ xbm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pam0(sam0 sam0Var, xbm xbmVar, byte b) {
        super(0);
        this.a = b;
        this.b = sam0Var;
        this.c = xbmVar;
    }

    public final Object invoke() {
        byte b = this.a;
        sam0 sam0Var = this.b;
        m231 m231Var = rih1.a;
        xbm xbmVar = this.c;
        switch (b) {
            case 0:
                String str = sam0Var.a;
                Logger.b("Initializing ".concat(str), new Object[0]);
                sam0Var.g.b(str, new z8i0(xbmVar, (byte) 28));
                return m231Var;
            default:
                try {
                    jo31.u(new uug0(xbmVar, (lnm) null, (byte) 9));
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    n57.t("[" + sam0Var.a + "] shutdown failed", thA);
                }
                return jam0.a;
        }
    }
}
