package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lfv {
    public final String a;
    public final Long b;

    public lfv(Long l, String str) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfv)) {
            return false;
        }
        lfv lfvVar = (lfv) obj;
        return u890.j(this.a, lfvVar.a) && u890.j(this.b, lfvVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }
}
