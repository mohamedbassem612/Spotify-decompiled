package p;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pv70 {
    public final List a;
    public final Set b;
    public final String c;
    public final byte[] d;

    public pv70(List list, Set set, String str, byte[] bArr) {
        this.a = list;
        this.b = set;
        this.c = str;
        this.d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv70)) {
            return false;
        }
        pv70 pv70Var = (pv70) obj;
        return u890.j(this.a, pv70Var.a) && u890.j(this.b, pv70Var.b) && u890.j(this.c, pv70Var.c) && u890.j(this.d, pv70Var.d);
    }

    public final int hashCode() {
        int iC = gvg.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        byte[] bArr = this.d;
        return iHashCode + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }
}
