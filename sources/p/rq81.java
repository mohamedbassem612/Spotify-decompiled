package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rq81 {
    public final boolean a;
    public final String b;

    public rq81(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq81)) {
            return false;
        }
        rq81 rq81Var = (rq81) obj;
        return this.a == rq81Var.a && this.b.equals(rq81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
