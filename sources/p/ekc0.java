package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ekc0 {
    public final String a;
    public final String b;

    public ekc0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekc0)) {
            return false;
        }
        ekc0 ekc0Var = (ekc0) obj;
        return this.a.equals(ekc0Var.a) && u890.j(this.b, ekc0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
