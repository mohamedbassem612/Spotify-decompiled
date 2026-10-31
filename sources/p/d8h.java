package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d8h extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8h(long j, boolean z, qim0 qim0Var, Function0 function0, int i) {
        super(2);
        this.c = j;
        this.b = z;
        this.e = qim0Var;
        this.d = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                Function0 function0 = this.d;
                l4p1.b(czo1.p(1), this.c, function0, (b0k) obj, this.e, this.b);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.e;
                mqn1.b(czo1.p(1), this.c, this.d, (b0k) obj, qim0Var, this.b);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8h(boolean z, long j, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.b = z;
        this.c = j;
        this.d = function0;
        this.e = qim0Var;
    }
}
