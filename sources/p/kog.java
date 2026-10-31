package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kog extends x1p1 {
    public final boolean c;
    public final jog d;

    public kog(boolean z, jog jogVar) {
        this.c = z;
        this.d = jogVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kog)) {
            return false;
        }
        kog kogVar = (kog) obj;
        return this.c == kogVar.c && u890.j(this.d, kogVar.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.c) * 31;
        jog jogVar = this.d;
        return iHashCode + (jogVar == null ? 0 : jogVar.hashCode());
    }
}
