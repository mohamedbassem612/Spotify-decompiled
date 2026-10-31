package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pvu0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tvu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pvu0(tvu0 tvu0Var, byte b) {
        super(1);
        this.a = b;
        this.b = tvu0Var;
    }

    public final Object invoke(Object obj) {
        o3r o3rVar;
        byte b = this.a;
        tvu0 tvu0Var = this.b;
        switch (b) {
            case 0:
                dvu0 dvu0Var = (dvu0) obj;
                cvu0 cvu0Var = dvu0Var.a;
                if ((cvu0Var instanceof zuu0) || (cvu0Var instanceof bvu0)) {
                    o3rVar = tvu0Var.e;
                } else {
                    if (!(cvu0Var instanceof avu0)) {
                        eg.o();
                        return null;
                    }
                    o3rVar = tvu0Var.f;
                }
                return hu20.e(d3p1.F(tvu0Var.d, o3rVar, dvu0Var), new c6e0((lnm) null, dvu0Var, tvu0Var, (byte) 11));
            default:
                return i6p1.s((dvu0) obj, (String) null, (hvu0) null, tvu0Var.a);
        }
    }
}
