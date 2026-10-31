package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nzt {
    public final bxt a;
    public final iwc1 b;
    public final long c;

    public nzt(bxt bxtVar, iwc1 iwc1Var, long j) {
        this.a = bxtVar;
        this.b = iwc1Var;
        this.c = j;
    }

    public final iwc1 a() {
        return this.b;
    }

    public final long b() {
        return this.c;
    }

    public final bxt c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzt)) {
            return false;
        }
        nzt nztVar = (nzt) obj;
        return u890.j(this.a, nztVar.a) && this.b == nztVar.b && this.c == nztVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
