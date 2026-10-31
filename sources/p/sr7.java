package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sr7 {
    public final String a;
    public final Long b;

    public sr7(Long l, String str) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr7)) {
            return false;
        }
        sr7 sr7Var = (sr7) obj;
        return this.a.equals(sr7Var.a) && u890.j(this.b, sr7Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }
}
