package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bb5 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cb5 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bb5(cb5 cb5Var, long j, byte b) {
        super(1);
        this.a = b;
        this.b = cb5Var;
        this.c = j;
    }

    public final Object invoke(Object obj) {
        ni20 ni20Var;
        byte b = this.a;
        long j = 0;
        long j2 = this.c;
        cb5 cb5Var = this.b;
        switch (b) {
            case 0:
                dhg1 dhg1Var = (dhg1) obj;
                if (!u890.j(dhg1Var.e(), cb5Var.Q0.e())) {
                    tob1 tob1Var = (tob1) cb5Var.Q0.e.g(dhg1Var.e());
                    j2 = tob1Var != null ? ((yr80) tob1Var.getValue()).a : 0L;
                } else if (!yr80.b(cb5Var.X0, -9223372034707292160L)) {
                    j2 = cb5Var.X0;
                }
                tob1 tob1Var2 = (tob1) cb5Var.Q0.e.g(dhg1Var.b());
                j = tob1Var2 != null ? ((yr80) tob1Var2.getValue()).a : 0L;
                c391 c391Var = (c391) cb5Var.P0.getValue();
                return (c391Var == null || (ni20Var = (ni20) c391Var.b.invoke(new yr80(j2), new yr80(j))) == null) ? irn1.l0(0.0f, 400.0f, (Object) null, 5) : ni20Var;
            default:
                if (u890.j(obj, cb5Var.Q0.e())) {
                    j = yr80.b(cb5Var.X0, -9223372034707292160L) ? j2 : cb5Var.X0;
                } else {
                    tob1 tob1Var3 = (tob1) cb5Var.Q0.e.g(obj);
                    if (tob1Var3 != null) {
                        j = ((yr80) tob1Var3.getValue()).a;
                    }
                }
                return new yr80(j);
        }
    }
}
