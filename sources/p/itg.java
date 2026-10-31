package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class itg {
    public List a;
    public htg b;
    public long c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itg)) {
            return false;
        }
        itg itgVar = (itg) obj;
        return this.a.equals(itgVar.a) && u890.j(this.b, itgVar.b) && this.c == itgVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        htg htgVar = this.b;
        return Long.hashCode(this.c) + ((iHashCode + (htgVar == null ? 0 : htgVar.hashCode())) * 31);
    }
}
