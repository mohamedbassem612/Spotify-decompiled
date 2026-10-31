package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q5m extends e6m {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public q5m(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5m)) {
            return false;
        }
        q5m q5mVar = (q5m) obj;
        return this.a.equals(q5mVar.a) && this.b.equals(q5mVar.b) && this.c.equals(q5mVar.c) && this.d.equals(q5mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
