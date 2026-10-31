package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i9x {
    public final String a;
    public final int b;

    public i9x(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9x)) {
            return false;
        }
        i9x i9xVar = (i9x) obj;
        return u890.j(this.a, i9xVar.a) && this.b == i9xVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
