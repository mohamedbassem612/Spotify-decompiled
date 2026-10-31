package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bq21 {
    public final String a;
    public final dio1 b;

    public bq21(String str, dio1 dio1Var) {
        this.a = str;
        this.b = dio1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq21)) {
            return false;
        }
        bq21 bq21Var = (bq21) obj;
        return this.a.equals(bq21Var.a) && this.b.equals(bq21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
