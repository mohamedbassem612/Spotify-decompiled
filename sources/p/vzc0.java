package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vzc0 implements wzc0 {
    public final String a;
    public final tzc0 b;

    public vzc0(String str) {
        tzc0 tzc0Var = new tzc0();
        this.a = str;
        this.b = tzc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzc0)) {
            return false;
        }
        vzc0 vzc0Var = (vzc0) obj;
        return u890.j(this.a, vzc0Var.a) && this.b.equals(vzc0Var.b);
    }

    @Override // p.wzc0
    public final tzc0 getMetadata() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
