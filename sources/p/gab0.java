package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gab0 {
    public final String a;
    public final String b;

    public gab0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gab0)) {
            return false;
        }
        gab0 gab0Var = (gab0) obj;
        return this.a.equals(gab0Var.a) && this.b.equals(gab0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
