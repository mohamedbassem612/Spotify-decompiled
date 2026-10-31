package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hha {
    public final List a;
    public final List b;
    public final long c;
    public final List d;

    public hha(long j, List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = j;
        this.d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hha)) {
            return false;
        }
        hha hhaVar = (hha) obj;
        return u890.j(this.a, hhaVar.a) && u890.j(this.b, hhaVar.b) && this.c == hhaVar.c && u890.j(this.d, hhaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(f4i1.b(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hha(long j) {
        z6x z6xVar = z6x.a;
        this(j, z6xVar, z6xVar, z6xVar);
    }
}
