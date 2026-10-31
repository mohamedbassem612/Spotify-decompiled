package p;

import com.spotify.core.http.CronetRuntime;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uap0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c42 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uap0(c42 c42Var, byte b) {
        super(0);
        this.a = b;
        this.b = c42Var;
    }

    public final Object invoke() {
        byte b = this.a;
        c42 c42Var = this.b;
        switch (b) {
            case 0:
                return (di8) c42Var.q;
            case 1:
                return (di8) c42Var.q;
            case 2:
                return (CronetRuntime) c42Var.r;
            default:
                return c42Var.p;
        }
    }
}
