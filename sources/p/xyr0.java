package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xyr0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ ryx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xyr0(c9n c9nVar, ryx ryxVar, byte b) {
        super(0);
        this.a = b;
        this.b = c9nVar;
        this.c = ryxVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ryx ryxVar = this.c;
        c9n c9nVar = this.b;
        switch (b) {
            case 0:
                fn31.T(c9nVar, (o8n) null, 0, new x3f(ryxVar, (lnm) null, (byte) 3), 3);
                break;
            default:
                fn31.T(c9nVar, (o8n) null, 0, new x3f(ryxVar, (lnm) null, (byte) 4), 3);
                break;
        }
        return rih1Var;
    }
}
