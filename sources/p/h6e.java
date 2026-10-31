package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h6e {
    public final String a;
    public final String b;

    public h6e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6e)) {
            return false;
        }
        h6e h6eVar = (h6e) obj;
        return this.a.equals(h6eVar.a) && u890.j(this.b, h6eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
