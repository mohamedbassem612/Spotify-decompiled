package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ddu implements idu {
    public final String a;
    public final Long b;

    public ddu(Long l, String str) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddu)) {
            return false;
        }
        ddu dduVar = (ddu) obj;
        return this.a.equals(dduVar.a) && u890.j(this.b, dduVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }
}
