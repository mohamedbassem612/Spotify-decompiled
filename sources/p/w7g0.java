package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w7g0 extends hon1 {
    public final String e;
    public final String f;
    public final List g;

    public w7g0(String str, List list, String str2) {
        this.e = str;
        this.f = str2;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7g0)) {
            return false;
        }
        w7g0 w7g0Var = (w7g0) obj;
        return u890.j(this.e, w7g0Var.e) && this.f.equals(w7g0Var.f) && this.g.equals(w7g0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(this.e.hashCode() * 31, 31, this.f);
    }
}
