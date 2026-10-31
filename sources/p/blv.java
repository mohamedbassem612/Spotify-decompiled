package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class blv extends clv {
    public final double N0;
    public final double X;
    public final double Y;
    public final double Z;

    public blv(String str) {
        this.b = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.X = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        int iIndexOf3 = str.indexOf(44, i);
        this.Y = Double.parseDouble(str.substring(i, iIndexOf3).trim());
        int i2 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf(44, i2);
        this.Z = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
        int i3 = iIndexOf4 + 1;
        this.N0 = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
    }

    @Override // p.clv
    public final double b(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 0.01d) {
            d2 *= 0.5d;
            d3 = e(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double dE = e(d4);
        double d5 = d3 + d2;
        double dE2 = e(d5);
        double dF = f(d4);
        return (((d - dE) * (f(d5) - dF)) / (dE2 - dE)) + dF;
    }

    @Override // p.clv
    public final double c(double d) {
        double d2 = 0.5d;
        double d3 = 0.5d;
        while (d2 > 1.0E-4d) {
            d2 *= 0.5d;
            d3 = e(d3) < d ? d3 + d2 : d3 - d2;
        }
        double d4 = d3 - d2;
        double d5 = d3 + d2;
        return (f(d5) - f(d4)) / (e(d5) - e(d4));
    }

    public final double e(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.Z * d5) + (this.X * d4) + (d * d * d);
    }

    public final double f(double d) {
        double d2 = 1.0d - d;
        double d3 = 3.0d * d2;
        double d4 = d2 * d3 * d;
        double d5 = d3 * d * d;
        return (this.N0 * d5) + (this.Y * d4) + (d * d * d);
    }
}
