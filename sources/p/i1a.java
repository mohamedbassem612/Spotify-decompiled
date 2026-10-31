package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i1a {
    public final String a;
    public final wxn b;

    public i1a(String str, wxn wxnVar) {
        this.a = str;
        this.b = wxnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1a)) {
            return false;
        }
        i1a i1aVar = (i1a) obj;
        return u890.j(this.a, i1aVar.a) && this.b == i1aVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
