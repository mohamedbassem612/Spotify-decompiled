package p;

import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r6r {
    public final LocalDate a;
    public final long b;
    public final long c;

    public r6r(LocalDate localDate, long j, long j2) {
        this.a = localDate;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6r)) {
            return false;
        }
        r6r r6rVar = (r6r) obj;
        return this.a.equals(r6rVar.a) && this.b == r6rVar.b && this.c == r6rVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
