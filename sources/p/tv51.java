package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tv51 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv51(long j, long j2, String str, int i) {
        super(2);
        this.a = (byte) 2;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        long jR = this.d;
        long j = this.c;
        g8y0 g8y0Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) g8y0Var.invoke()).booleanValue()) {
                    jR = j;
                }
                return new u7h(jR);
            case 1:
                vux vuxVar = (vux) obj2;
                if (((Boolean) g8y0Var.invoke()).booleanValue()) {
                    jR = j;
                }
                int iOrdinal = vuxVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        jR = who1.r(jR);
                    } else if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                }
                return new u7h(jR);
            default:
                ((Number) obj2).intValue();
                long j2 = this.d;
                int iP = czo1.p(1);
                ukv.b((String) g8y0Var, this.c, j2, (b0k) obj, iP);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tv51(g8y0 g8y0Var, long j, long j2, byte b) {
        super(2);
        this.a = b;
        this.b = g8y0Var;
        this.c = j;
        this.d = j2;
    }
}
