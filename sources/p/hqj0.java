package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hqj0 implements kqj0 {
    public final String a;
    public final String b;

    public hqj0(String str) {
        this.a = str;
        this.b = f4i1.f("{", str, "}");
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hqj0) && u890.j(this.a, ((hqj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
