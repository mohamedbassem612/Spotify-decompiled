package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y4e {
    public final String a;
    public final int b;

    public y4e(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4e)) {
            return false;
        }
        y4e y4eVar = (y4e) obj;
        return u890.j(this.a, y4eVar.a) && this.b == y4eVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
