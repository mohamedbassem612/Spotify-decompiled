package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pna extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ p811 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pna(long j, long j2, p811 p811Var, byte b) {
        super(1);
        this.a = b;
        this.b = j;
        this.c = j2;
        this.d = p811Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        long jLongValue = this.b;
        p811 p811Var = this.d;
        switch (b) {
            case 0:
                z590 z590Var = (z590) obj;
                Long l = (Long) p811Var.a;
                if (l != null) {
                    jLongValue = l.longValue();
                }
                return z590.a(z590Var, null, false, j091.a, false, jLongValue, 0L, 0.0f, this.c, null, 361);
            case 1:
                z590 z590Var2 = (z590) obj;
                Long l2 = (Long) p811Var.a;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                }
                return z590.a(z590Var2, null, false, m091.a, false, jLongValue, 0L, 0.0f, this.c, null, 363);
            case 2:
                z590 z590Var3 = (z590) obj;
                Long l3 = (Long) p811Var.a;
                if (l3 != null) {
                    jLongValue = l3.longValue();
                }
                return z590.a(z590Var3, null, false, n091.a, false, jLongValue, 0L, 0.0f, this.c, null, 363);
            case 3:
                z590 z590Var4 = (z590) obj;
                Long l4 = (Long) p811Var.a;
                if (l4 != null) {
                    jLongValue = l4.longValue();
                }
                return z590.a(z590Var4, null, true, n091.a, false, jLongValue, 0L, 0.0f, this.c, null, 361);
            case 4:
                z590 z590Var5 = (z590) obj;
                Long l5 = (Long) p811Var.a;
                if (l5 != null) {
                    jLongValue = l5.longValue();
                }
                return z590.a(z590Var5, null, true, m091.a, false, jLongValue, 0L, 0.0f, this.c, null, 361);
            default:
                z590 z590Var6 = (z590) obj;
                Long l6 = (Long) p811Var.a;
                if (l6 != null) {
                    jLongValue = l6.longValue();
                }
                return z590.a(z590Var6, null, false, z590Var6.b ? n091.a : z590Var6.c, false, jLongValue, 0L, 0.0f, this.c, null, 363);
        }
    }
}
