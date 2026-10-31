package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jx9 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jx9(long j, qim0 qim0Var, byte b) {
        super(3);
        this.a = b;
        this.b = j;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                t1c.a(anm1.N("full_overlay", dug.e(qim0Var, v9c.s(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(j)}), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6)), (b0k) obj2, 0);
                break;
            default:
                ((Number) obj3).intValue();
                long j2 = u7h.j;
                t1c.a(anm1.N("half_overlay", dug.e(qim0Var, v9c.s(p7h.M(new u7h[]{new u7h(j2), new u7h(j2), new u7h(j)}), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6)), (b0k) obj2, 0);
                break;
        }
        return rih1Var;
    }
}
