package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n7e {
    public final String a;
    public final String b;
    public final int c;

    public n7e(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7e)) {
            return false;
        }
        n7e n7eVar = (n7e) obj;
        return this.a.equals(n7eVar.a) && this.b.equals(n7eVar.b) && this.c == n7eVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
