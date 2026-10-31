package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h5e extends j5e {
    public final String a;
    public final String b;

    public h5e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5e)) {
            return false;
        }
        h5e h5eVar = (h5e) obj;
        return this.a.equals(h5eVar.a) && u890.j(this.b, h5eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
