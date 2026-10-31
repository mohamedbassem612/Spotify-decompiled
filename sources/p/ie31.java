package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class ie31 implements zqu {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zeg1 b;

    public /* synthetic */ ie31(zeg1 zeg1Var, byte b) {
        this.a = b;
        this.b = zeg1Var;
    }

    public final double c(double d) {
        byte b = this.a;
        zeg1 zeg1Var = this.b;
        switch (b) {
            case 0:
                float[] fArr = kah.a;
                return kah.a(zeg1Var, d);
            case 1:
                float[] fArr2 = kah.a;
                return kah.c(zeg1Var, d);
            case 2:
                double d2 = zeg1Var.b;
                return d >= zeg1Var.e ? Math.pow((d2 * d) + zeg1Var.c, zeg1Var.a) : zeg1Var.d * d;
            case 3:
                double d3 = zeg1Var.b;
                double d4 = zeg1Var.c;
                double d5 = zeg1Var.d;
                return d >= zeg1Var.e ? Math.pow((d3 * d) + d4, zeg1Var.a) + zeg1Var.f : (d5 * d) + zeg1Var.g;
            case 4:
                float[] fArr3 = kah.a;
                return kah.b(zeg1Var, d);
            case 5:
                float[] fArr4 = kah.a;
                return kah.d(zeg1Var, d);
            case 6:
                double d6 = zeg1Var.b;
                double d7 = zeg1Var.c;
                double d8 = zeg1Var.d;
                return d >= zeg1Var.e * d8 ? (Math.pow(d, 1.0d / zeg1Var.a) - d7) / d6 : d / d8;
            default:
                double d9 = zeg1Var.b;
                double d10 = zeg1Var.c;
                double d11 = zeg1Var.d;
                return d >= zeg1Var.e * d11 ? (Math.pow(d - zeg1Var.f, 1.0d / zeg1Var.a) - d10) / d9 : (d - zeg1Var.g) / d11;
        }
    }
}
