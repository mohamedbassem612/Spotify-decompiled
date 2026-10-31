package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n340 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n340(String str, boolean z, Function0 function0, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = z;
        this.d = function0;
        this.e = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                iu30 iu30Var = this.e;
                int iP = czo1.p(1);
                sbl.j(this.b, this.c, this.d, iu30Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                iu30 iu30Var2 = this.e;
                int iP2 = czo1.p(1);
                sbl.j(this.b, this.c, this.d, iu30Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
