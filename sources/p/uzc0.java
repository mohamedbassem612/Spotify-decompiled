package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uzc0 implements wzc0 {
    public final String a;
    public final tzc0 b;

    public uzc0(String str) {
        tzc0 tzc0Var = new tzc0();
        this.a = str;
        this.b = tzc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzc0)) {
            return false;
        }
        uzc0 uzc0Var = (uzc0) obj;
        return u890.j(this.a, uzc0Var.a) && this.b.equals(uzc0Var.b);
    }

    @Override // p.wzc0
    public final tzc0 getMetadata() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
