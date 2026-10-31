package p;

import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h5r {
    public final ldl0 a;
    public final String b;
    public final LocalDate c;
    public final LocalDate d;

    public h5r(ldl0 ldl0Var, String str, LocalDate localDate, LocalDate localDate2) {
        this.a = ldl0Var;
        this.b = str;
        this.c = localDate;
        this.d = localDate2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5r)) {
            return false;
        }
        h5r h5rVar = (h5r) obj;
        return this.a == h5rVar.a && u890.j(this.b, h5rVar.b) && this.c.equals(h5rVar.c) && this.d.equals(h5rVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
