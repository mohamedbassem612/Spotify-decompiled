package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rvf1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uvf1 b;
    public final /* synthetic */ ymd0 c;
    public final /* synthetic */ btt0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rvf1(uvf1 uvf1Var, ymd0 ymd0Var, btt0 btt0Var, byte b) {
        super(1);
        this.a = b;
        this.b = uvf1Var;
        this.c = ymd0Var;
        this.d = btt0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        btt0 btt0Var = this.d;
        ymd0 ymd0Var = this.c;
        uvf1 uvf1Var = this.b;
        switch (b) {
            case 0:
                fai0 fai0VarQ = w6d1.q(uvf1Var.d.a(), bpf1.c1);
                fai0 fai0VarQ2 = w6d1.q(uvf1.a(ymd0Var, new x0e1((String) obj, btt0Var, (byte) 24)), bpf1.d1);
                fai0 fai0Var = new fai0();
                rwq0.p(fai0Var, fai0VarQ, fai0VarQ2);
                fai0Var.n(fai0VarQ, new vvf1(fai0Var, fai0VarQ, fai0VarQ2, (byte) 0));
                fai0Var.n(fai0VarQ2, new vvf1(fai0Var, fai0VarQ, fai0VarQ2, (byte) 1));
                return fai0Var;
            default:
                String str = (String) obj;
                y8n y8nVarJ = t5p1.j(new mpy0(uvf1Var.f.e(), uvf1Var, str, (byte) 25), 3);
                fai0 fai0VarQ3 = w6d1.q(uvf1.a(ymd0Var, new x0e1(str, btt0Var, (byte) 24)), bpf1.e1);
                fai0 fai0Var2 = new fai0();
                rwq0.p(fai0Var2, y8nVarJ, fai0VarQ3);
                fai0Var2.n(y8nVarJ, new vvf1(fai0Var2, y8nVarJ, fai0VarQ3, (byte) 0));
                fai0Var2.n(fai0VarQ3, new vvf1(fai0Var2, y8nVarJ, fai0VarQ3, (byte) 1));
                return fai0Var2;
        }
    }
}
