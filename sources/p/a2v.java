package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a2v {
    public final String a;
    public final int b;

    public a2v(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.b == 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2v)) {
            return false;
        }
        a2v a2vVar = (a2v) obj;
        return u890.j(this.a, a2vVar.a) && this.b == a2vVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }

    public /* synthetic */ a2v(String str) {
        this(str, 1);
    }
}
