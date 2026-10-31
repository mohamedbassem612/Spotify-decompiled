package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bqy extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqy(String str, iu30 iu30Var, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.d = str;
        this.e = iu30Var;
        this.b = function0;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.c;
                cqy.c(czo1.p(1), this.d, this.b, (b0k) obj, this.e, qim0Var);
                break;
            default:
                ((Number) obj2).intValue();
                iu30 iu30Var = this.e;
                hw10.a(czo1.p(1), this.d, this.b, (b0k) obj, iu30Var, this.c);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqy(Function0 function0, qim0 qim0Var, String str, iu30 iu30Var, int i) {
        super(2);
        this.b = function0;
        this.c = qim0Var;
        this.d = str;
        this.e = iu30Var;
    }
}
