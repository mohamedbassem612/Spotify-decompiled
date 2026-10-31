package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e7u {
    public final hux a;
    public final String b;

    public e7u(String str, hux huxVar) {
        this.a = huxVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7u)) {
            return false;
        }
        e7u e7uVar = (e7u) obj;
        return u890.j(this.a, e7uVar.a) && u890.j(this.b, e7uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
