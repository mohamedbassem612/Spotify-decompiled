package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eud extends cud {
    public final rn71 a;

    public eud(rn71 rn71Var) {
        this.a = rn71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eud) && this.a.equals(((eud) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
