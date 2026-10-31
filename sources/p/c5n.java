package p;

import com.spotify.base.java.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c5n extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d5n b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5n(d5n d5nVar, byte b) {
        super(0);
        this.a = b;
        this.b = d5nVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d5n d5nVar = this.b;
        switch (b) {
            case 0:
                d5nVar.c();
                break;
            default:
                Logger.b("CoreFullSessionService shutdown timeout (4 seconds)!", new Object[0]);
                Logger.b("CoreFullSessionService killing core thread!", new Object[0]);
                d5nVar.a.c.kill(6);
                break;
        }
        return rih1Var;
    }
}
