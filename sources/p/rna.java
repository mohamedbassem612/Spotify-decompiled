package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rna extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rna(long j, long j2, y1k1 y1k1Var, p811 p811Var) {
        super(1);
        this.a = (byte) 0;
        this.b = j;
        this.c = j2;
        this.d = y1k1Var;
        this.e = p811Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        long j = this.c;
        Object obj2 = this.e;
        long jLongValue = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                z590 z590Var = (z590) obj;
                Long l = (Long) ((p811) obj2).a;
                if (l != null) {
                    jLongValue = l.longValue();
                }
                return z590.a(z590Var, null, false, null, false, jLongValue, 0L, 0.0f, this.c, (y1k1) obj3, 111);
            case 1:
                gxc gxcVar = (gxc) obj;
                yon1.K5(gxcVar.b, new ps(jLongValue, (vzp0) obj2, (byte) 19));
                ry21 ry21Var = (ry21) obj3;
                return new p4g1(gxcVar.a, jLongValue, new xz21(ry21Var.d, ry21Var.f.b() + j));
            default:
                ((Number) obj).longValue();
                p3u0 p3u0Var = (p3u0) obj3;
                m0u0 m0u0Var = p3u0Var.i;
                lgy lgyVar = p3u0Var.h;
                if (jLongValue > 0) {
                    lgyVar.r(m0u0Var, jLongValue);
                }
                if (j > 0) {
                    lgyVar.q(m0u0Var, j);
                }
                m0u0 m0u0Var2 = (m0u0) obj2;
                if (m0u0Var2 != null) {
                    lgyVar.w(m0u0Var, m0u0Var2);
                }
                lgyVar.y(m0u0Var, p3u0Var.c.F());
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rna(long j, Object obj, long j2, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = j;
        this.d = obj;
        this.c = j2;
        this.e = obj2;
    }
}
