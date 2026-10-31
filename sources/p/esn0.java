package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class esn0 extends nsn0 {
    public final String a;

    public esn0(String str) {
        this.a = str;
    }

    @Override // p.nsn0
    public final boolean a() {
        return false;
    }

    @Override // p.nsn0
    public final String b() {
        return f4i1.f("deep_link(", this.a, ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof esn0) && this.a.equals(((esn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p.nsn0
    public final String toString() {
        return super.toString();
    }
}
