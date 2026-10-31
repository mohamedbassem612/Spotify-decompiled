package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i0a {
    public final String a;
    public final o0a b;

    public i0a(String str, o0a o0aVar) {
        this.a = str;
        this.b = o0aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0a)) {
            return false;
        }
        i0a i0aVar = (i0a) obj;
        return u890.j(this.a, i0aVar.a) && this.b == i0aVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
