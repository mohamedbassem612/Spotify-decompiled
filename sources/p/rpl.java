package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rpl {
    public final long a;
    public final long b;
    public final long c;
    public final List d;

    public rpl(long j, long j2, long j3, List list) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpl)) {
            return false;
        }
        rpl rplVar = (rpl) obj;
        return this.a == rplVar.a && this.b == rplVar.b && this.c == rplVar.c && this.d.equals(rplVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
