package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n041 {
    public static final n041 d;
    public final long a;
    public final boolean b;
    public final vex c;

    static {
        uwr uwrVar = cbx.a;
        d = new n041(((yex) zex.a.d).e);
    }

    public n041(long j) {
        this.a = j;
        int iG = z4p1.G(j);
        this.b = uah.e(-1, iG) > uah.e(-16777216, iG);
        uwr uwrVar = cbx.a;
        this.c = (vex) zex.a.e;
    }

    public final long a() {
        boolean z = this.b;
        vex vexVar = this.c;
        return z ? vexVar.n : vexVar.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n041)) {
            return false;
        }
        long j = ((n041) obj).a;
        int i = u7h.l;
        return z4h1.b(this.a, j);
    }

    public final int hashCode() {
        int i = u7h.l;
        return Long.hashCode(this.a);
    }
}
