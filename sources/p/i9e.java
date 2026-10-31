package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i9e extends j9e {
    public final String a;
    public final k3h1 b;
    public final String c;
    public final k9e d;

    public i9e(String str, k3h1 k3h1Var, String str2, k9e k9eVar) {
        this.a = str;
        this.b = k3h1Var;
        this.c = str2;
        this.d = k9eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9e)) {
            return false;
        }
        i9e i9eVar = (i9e) obj;
        return this.a.equals(i9eVar.a) && this.b.equals(i9eVar.b) && this.c.equals(i9eVar.c) && this.d.equals(i9eVar.d);
    }

    @Override // p.l9c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(kaa0.f(this.b.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
