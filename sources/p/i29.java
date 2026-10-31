package p;

import android.util.Range;
import android.util.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i29 {
    public static final Range f = new Range(0, 0);
    public final Size a;
    public final liv b;
    public final Range c;
    public final qsk d;
    public final boolean e;

    public i29(Size size, liv livVar, Range range, qsk qskVar, boolean z) {
        this.a = size;
        this.b = livVar;
        this.c = range;
        this.d = qskVar;
        this.e = z;
    }

    public final zwg a() {
        zwg zwgVar = new zwg();
        zwgVar.a = this.a;
        zwgVar.b = this.b;
        zwgVar.c = this.c;
        zwgVar.d = this.d;
        zwgVar.e = Boolean.valueOf(this.e);
        return zwgVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i29) {
            i29 i29Var = (i29) obj;
            if (this.a.equals(i29Var.a) && this.b.equals(i29Var.b) && this.c.equals(i29Var.c)) {
                qsk qskVar = i29Var.d;
                qsk qskVar2 = this.d;
                if (qskVar2 != null ? qskVar2.equals(qskVar) : qskVar == null) {
                    if (this.e == i29Var.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        qsk qskVar = this.d;
        return (this.e ? 1231 : 1237) ^ ((iHashCode ^ (qskVar == null ? 0 : qskVar.hashCode())) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.a);
        sb.append(", dynamicRange=");
        sb.append(this.b);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.c);
        sb.append(", implementationOptions=");
        sb.append(this.d);
        sb.append(", zslDisabled=");
        return l1d.r(sb, this.e, "}");
    }
}
