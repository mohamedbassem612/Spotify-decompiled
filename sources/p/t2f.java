package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t2f implements q3f {
    public final apl a;
    public final String b;

    public t2f(apl aplVar, String str) {
        this.a = aplVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2f)) {
            return false;
        }
        t2f t2fVar = (t2f) obj;
        return u890.j(this.a, t2fVar.a) && this.b.equals(t2fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
