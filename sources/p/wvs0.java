package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wvs0 {
    public final List a;
    public final Integer b;

    public wvs0(Integer num, List list) {
        this.a = list;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvs0)) {
            return false;
        }
        wvs0 wvs0Var = (wvs0) obj;
        return u890.j(this.a, wvs0Var.a) && u890.j(this.b, wvs0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
