package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class arb implements crb {
    public final String a;
    public final boolean b;
    public final String c;
    public final hux d;

    public arb(String str, String str2, hux huxVar, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arb)) {
            return false;
        }
        arb arbVar = (arb) obj;
        return u890.j(this.a, arbVar.a) && this.b == arbVar.b && this.c.equals(arbVar.c) && this.d.equals(arbVar.d);
    }

    @Override // p.crb
    public final String getId() {
        return this.a;
    }

    @Override // p.crb
    public final String getLabel() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(2131961644) + eqq.k(cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
