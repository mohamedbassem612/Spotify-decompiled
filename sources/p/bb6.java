package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bb6 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ km0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb6(km0 km0Var, byte b) {
        super(0);
        this.a = b;
        this.b = km0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        km0 km0Var = this.b;
        switch (b) {
            case 0:
                itz itzVar = (itz) km0Var.c;
                if (itzVar.b.isEnabled()) {
                    c9n c9nVarV = qmo1.v(itzVar.f, new pdy(itzVar, (byte) 19));
                    itzVar.f = c9nVarV;
                    fn31.T(c9nVarV, (o8n) null, 0, new ett(itzVar, (lnm) null, (byte) 23), 3);
                }
                break;
            default:
                itz itzVar2 = (itz) km0Var.c;
                smo1.p(itzVar2.f, (CancellationException) null);
                itzVar2.d.l((Object) null);
                break;
        }
        return rih1Var;
    }
}
