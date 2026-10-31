package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cyn {
    public final int a;
    public final int b;
    public final ayn c;

    public cyn(int i, int i2, ayn aynVar) {
        this.a = i;
        this.b = i2;
        this.c = aynVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyn)) {
            return false;
        }
        cyn cynVar = (cyn) obj;
        return this.a == cynVar.a && this.b == cynVar.b && this.c.equals(cynVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, l1d.C(this.a) * 31, 31);
    }
}
