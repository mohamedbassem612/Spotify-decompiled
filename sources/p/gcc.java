package p;

import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gcc implements we5 {
    public static final long d = fc11.Y(1.0f, 8589934592L);
    public static final gcc e;
    public final long a;
    public final long b;
    public final long c;

    static {
        long jD = fc11.D(0.25d);
        e = new gcc(jD, jD, fc11.D(0.25d));
    }

    public gcc(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gcc)) {
            return false;
        }
        gcc gccVar = (gcc) obj;
        if (!TextUnit.a(this.a, gccVar.a) || !TextUnit.a(this.b, gccVar.b)) {
            return false;
        }
        TextUnit.a(this.c, gccVar.c);
        return false;
    }

    public final int hashCode() {
        int iHashCode = gcg.b.hashCode() * 31;
        wee1[] wee1VarArr = TextUnit.b;
        return z520.a.hashCode() + x0d.f(cy30.f(cy30.f(cy30.f(iHashCode, this.a, 31), this.b, 31), this.c, 961), 31, Float.NaN);
    }

    public final String toString() {
        gcg gcgVar = gcg.b;
        String strF = TextUnit.f(this.a);
        String strF2 = TextUnit.f(this.b);
        String strF3 = TextUnit.f(this.c);
        StringBuilder sb = new StringBuilder("Bullet(shape=");
        sb.append(gcgVar);
        sb.append(", size=(");
        sb.append(strF);
        sb.append(", ");
        bb00.j(sb, strF2, "), padding=", strF3, ", brush=null, alpha=NaN, drawStyle=");
        sb.append(z520.a);
        sb.append(")");
        return sb.toString();
    }
}
