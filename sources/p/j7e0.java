package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j7e0 implements l7e0 {
    public final zuc0 a;
    public final String b;
    public final String c;

    public j7e0(zuc0 zuc0Var) {
        this.a = zuc0Var;
        this.b = zuc0Var.c;
        this.c = zuc0Var.a;
    }

    @Override // p.l7e0
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7e0) && u890.j(this.a, ((j7e0) obj).a);
    }

    @Override // p.l7e0
    public final String getUri() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
