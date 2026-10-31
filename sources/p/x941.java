package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x941 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nm1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x941(nm1 nm1Var, byte b) {
        super(1);
        this.a = b;
        this.b = nm1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        nm1 nm1Var = this.b;
        switch (b) {
            case 0:
                return d3p1.F((d0r) nm1Var.b, (o3r) nm1Var.c, (s941) obj);
            default:
                dk3 dk3Var = ((s941) obj).a;
                return dk3Var instanceof bk3 ? new t941(((zwm1) nm1Var.f).i(), (Integer) null, (String) null, dk3Var) : u941.a;
        }
    }
}
