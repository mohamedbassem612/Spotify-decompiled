package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sdb0 {
    public final List a;
    public final String b;

    public sdb0(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdb0)) {
            return false;
        }
        sdb0 sdb0Var = (sdb0) obj;
        return this.a.equals(sdb0Var.a) && u890.j(this.b, sdb0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
