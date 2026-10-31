package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y2y {
    public final int a;
    public final String b;

    public y2y(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2y)) {
            return false;
        }
        y2y y2yVar = (y2y) obj;
        return this.a == y2yVar.a && u890.j(this.b, y2yVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
