package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hd11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hd11(int i, String str, Function0 function0, qim0 qim0Var, int i2) {
        super(2);
        this.b = str;
        this.c = qim0Var;
        this.d = function0;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                f2p1.m(czo1.p(this.e | 1), this.b, this.d, (b0k) obj, this.c);
                break;
            default:
                ((Number) obj2).intValue();
                rqt0.l(czo1.p(1), this.e, this.b, this.d, (b0k) obj, this.c);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hd11(String str, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.b = str;
        this.d = function0;
        this.c = qim0Var;
        this.e = i;
    }
}
