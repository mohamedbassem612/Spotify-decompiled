package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eio extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ asn b;
    public final /* synthetic */ String c;
    public final /* synthetic */ cio d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ Function0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eio(asn asnVar, String str, cio cioVar, iu30 iu30Var, iu30 iu30Var2, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = asnVar;
        this.c = str;
        this.d = cioVar;
        this.e = iu30Var;
        this.f = iu30Var2;
        this.g = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                Function0 function0 = this.g;
                int iP = czo1.p(1);
                this.b.b(this.c, this.d, this.e, this.f, function0, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                Function0 function1 = this.g;
                int iP2 = czo1.p(1);
                this.b.c(this.c, this.d, this.e, this.f, function1, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
