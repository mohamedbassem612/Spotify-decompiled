package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dgf0 extends t890 {
    public final String d;
    public final long e;
    public final String f;
    public final ArrayList g;

    public dgf0(long j, String str, String str2, ArrayList arrayList) {
        this.d = str;
        this.e = j;
        this.f = str2;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgf0)) {
            return false;
        }
        dgf0 dgf0Var = (dgf0) obj;
        return u890.j(this.d, dgf0Var.d) && this.e == dgf0Var.e && u890.j(this.f, dgf0Var.f) && this.g.equals(dgf0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.f(this.d.hashCode() * 31, this.e, 31), 31, this.f);
    }
}
