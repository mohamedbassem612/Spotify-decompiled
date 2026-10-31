package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class f8u0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g8u0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f8u0(g8u0 g8u0Var, String str, String str2, byte b) {
        super(0);
        this.a = b;
        this.b = g8u0Var;
        this.c = str;
        this.d = str2;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                g8u0 g8u0Var = this.b;
                fn31.T(g8u0Var.f, (o8n) null, 0, new kv1(g8u0Var, this.c, this.d, (lnm) null, (byte) 16), 3);
                break;
            default:
                g8u0 g8u0Var2 = this.b;
                fn31.T(g8u0Var2.f, (o8n) null, 0, new kv1(g8u0Var2, this.c, this.d, (lnm) null, (byte) 16), 3);
                break;
        }
        return rih1Var;
    }
}
