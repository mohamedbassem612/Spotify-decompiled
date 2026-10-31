package p;

import j$.time.YearMonth;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x6r {
    public final s6r a;
    public final s6r b;
    public final YearMonth c;

    public x6r(s6r s6rVar, s6r s6rVar2, YearMonth yearMonth) {
        this.a = s6rVar;
        this.b = s6rVar2;
        this.c = yearMonth;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6r)) {
            return false;
        }
        x6r x6rVar = (x6r) obj;
        return u890.j(this.a, x6rVar.a) && u890.j(this.b, x6rVar.b) && u890.j(this.c, x6rVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
