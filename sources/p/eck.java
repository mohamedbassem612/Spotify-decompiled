package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eck extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hdk b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ qim0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eck(hdk hdkVar, iu30 iu30Var, boolean z, float f, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = hdkVar;
        this.c = iu30Var;
        this.d = z;
        this.e = f;
        this.f = function0;
        this.g = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.g;
                int iP = czo1.p(1);
                rck.e(this.b, this.c, this.d, this.e, this.f, qim0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.g;
                int iP2 = czo1.p(1);
                vyo1.q(this.b, this.c, this.d, this.e, this.f, qim0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
