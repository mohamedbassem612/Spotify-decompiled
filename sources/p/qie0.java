package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qie0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ et9 b;
    public final /* synthetic */ aoe0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qie0(et9 et9Var, aoe0 aoe0Var, byte b) {
        super(0);
        this.a = b;
        this.b = et9Var;
        this.c = aoe0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        aoe0 aoe0Var = this.c;
        et9 et9Var = this.b;
        switch (b) {
            case 0:
                ((oie0) et9Var.e).m(aoe0Var, false);
                break;
            default:
                oie0 oie0Var = (oie0) et9Var.e;
                fn31.T(oie0Var.h, (o8n) null, 0, new nie0(oie0Var, aoe0Var, null, (byte) 0), 3);
                break;
        }
        return rih1Var;
    }
}
