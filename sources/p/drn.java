package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class drn implements crn {
    public final int a;
    public final String b;

    public drn(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drn)) {
            return false;
        }
        drn drnVar = (drn) obj;
        return this.a == drnVar.a && u890.j(this.b, drnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
