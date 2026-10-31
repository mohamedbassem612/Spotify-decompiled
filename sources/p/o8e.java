package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o8e {
    public final String a;
    public final String b;
    public final int c;

    public o8e(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8e)) {
            return false;
        }
        o8e o8eVar = (o8e) obj;
        return u890.j(this.a, o8eVar.a) && this.b.equals(o8eVar.b) && this.c == o8eVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
