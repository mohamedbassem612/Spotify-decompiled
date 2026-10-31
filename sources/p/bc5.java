package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bc5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ec5 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ bc5(ec5 ec5Var, float f, float f2, float f3, float f4, byte b) {
        this.a = b;
        this.b = ec5Var;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        float f = this.f;
        float f2 = this.e;
        float f3 = this.d;
        float f4 = this.c;
        ec5 ec5Var = this.b;
        switch (b) {
            case 0:
                zb5 zb5Var = ec5Var.a;
                zb5Var.getClass();
                zb5Var.C = yoi1.o(f4, 0.0f, 1.0f);
                zb5Var.D = yoi1.o(f3, 0.0f, 1.0f);
                zb5Var.E = yoi1.o(f2, 0.0f, 1.0f);
                zb5Var.F = yoi1.o(f, 0.0f, 1.0f);
                ec5Var.a();
                break;
            default:
                zb5 zb5Var2 = ec5Var.a;
                zb5Var2.getClass();
                zb5Var2.G = yoi1.o(f4, 0.0f, 1.0f);
                zb5Var2.H = yoi1.o(f3, 0.0f, 1.0f);
                zb5Var2.I = yoi1.o(f2, 0.0f, 1.0f);
                zb5Var2.A = yoi1.o(f, 0.0f, 1.0f);
                ec5Var.a();
                break;
        }
    }
}
