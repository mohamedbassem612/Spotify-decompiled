package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mgu implements l9c {
    public final String a;
    public final k3h1 b;
    public final ji0 c;

    public mgu(String str, k3h1 k3h1Var, ji0 ji0Var) {
        this.a = str;
        this.b = k3h1Var;
        this.c = ji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgu)) {
            return false;
        }
        mgu mguVar = (mgu) obj;
        return this.a.equals(mguVar.a) && this.b.equals(mguVar.b) && this.c.equals(mguVar.c);
    }

    @Override // p.l9c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b.b, this.a.hashCode() * 31, 31);
    }
}
