package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dku {
    public final cku a;

    static {
        new dku("", 0, 0);
    }

    public dku(String str, int i, int i2) {
        this.a = new cku(str, i, i2);
    }

    public static dku a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        String string;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            StringBuilder sbQ = cy30.q(i8, i7, "M0,", " A", ",");
            ktd.p(i8, i, " 0 1,1 ", ",", sbQ);
            ktd.p(i8, i7, " A", ",", sbQ);
            sbQ.append(i8);
            sbQ.append(" 0 1,1 0,");
            sbQ.append(i8);
            sbQ.append(" Z");
            string = sbQ.toString();
        } else {
            StringBuilder sb = new StringBuilder("M ");
            int iMin = Math.min(i / 2, i2 / 2);
            int iMin2 = Math.min(iMin, i3);
            int iMin3 = Math.min(iMin, i4);
            int iMin4 = Math.min(iMin, i5);
            int iMin5 = Math.min(iMin, i6);
            sb.append(iMin2);
            sb.append(",0 L ");
            sb.append(i - iMin3);
            sb.append(",0");
            if (iMin3 > 0) {
                c13.n(iMin3, iMin3, " A ", ",", sb);
                c13.n(i, iMin3, " 0 0,1 ", ",", sb);
            }
            sb.append(" L ");
            sb.append(i);
            sb.append(",");
            sb.append(i2 - iMin4);
            if (iMin4 > 0) {
                c13.n(iMin4, iMin4, " A ", ",", sb);
                sb.append(" 0 0,1 ");
                sb.append(i - iMin4);
                sb.append(",");
                sb.append(i2);
            }
            c13.n(iMin5, i2, " L ", ",", sb);
            if (iMin5 > 0) {
                c13.n(iMin5, iMin5, " A ", ",", sb);
                sb.append(" 0 0,1 0,");
                sb.append(i2 - iMin5);
            }
            if (iMin2 > 0) {
                c13.n(iMin2, iMin2, " L 0,", " A ", sb);
                c13.n(iMin2, iMin2, ",", " 0 0,1 ", sb);
                sb.append(",0");
            }
            sb.append(" Z");
            string = sb.toString();
        }
        return new dku(string, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dku) {
            return this.a.equals(((dku) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
