package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nik0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ es41 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ c9n e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nik0(es41 es41Var, int i, int i2, c9n c9nVar, byte b) {
        super(0);
        this.a = b;
        this.b = es41Var;
        this.c = i;
        this.d = i2;
        this.e = c9nVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = this.e;
        int i = this.d;
        int i2 = this.c;
        es41 es41Var = this.b;
        switch (b) {
            case 0:
                if (es41Var.a.s() < i2) {
                    i = i2;
                }
                fn31.T(c9nVar, (o8n) null, 0, new mik0(es41Var, i, null, (byte) 0), 3);
                break;
            default:
                if (es41Var.a.s() < i2) {
                    i = i2;
                }
                fn31.T(c9nVar, (o8n) null, 0, new mik0(es41Var, i, null, (byte) 1), 3);
                break;
        }
        return rih1Var;
    }
}
