package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e8x {
    public final String a;
    public final String b;

    public e8x(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8x)) {
            return false;
        }
        e8x e8xVar = (e8x) obj;
        return this.a.equals(e8xVar.a) && this.b.equals(e8xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 961);
    }
}
