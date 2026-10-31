package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z5a {
    public final int a;
    public final String b;

    public z5a(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5a)) {
            return false;
        }
        z5a z5aVar = (z5a) obj;
        return this.a == z5aVar.a && u890.j(this.b, z5aVar.b);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        String str = this.b;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
