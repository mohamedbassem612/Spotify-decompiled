package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hpb extends sgl {
    public final /* synthetic */ byte b = 1;

    public hpb(double d) {
        super(Double.valueOf(d));
    }

    @Override // p.sgl
    public final a8b0 a(zim0 zim0Var) {
        switch (this.b) {
            case 0:
                g6b0 g6b0VarE = zim0Var.e();
                g6b0VarE.getClass();
                return g6b0VarE.t(tnw0.f);
            case 1:
                g6b0 g6b0VarE2 = zim0Var.e();
                g6b0VarE2.getClass();
                return g6b0VarE2.t(tnw0.Z);
            default:
                g6b0 g6b0VarE3 = zim0Var.e();
                g6b0VarE3.getClass();
                return g6b0VarE3.t(tnw0.X);
        }
    }

    @Override // p.sgl
    public String toString() {
        byte b = this.b;
        Object obj = this.a;
        switch (b) {
            case 1:
                return ((Number) obj).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) obj).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ hpb(Object obj) {
        super(obj);
    }

    public hpb(float f) {
        super(Float.valueOf(f));
    }
}
