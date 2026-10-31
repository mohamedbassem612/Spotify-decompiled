package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ant extends t0c {
    public final int e;
    public final int f;

    public ant(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ant)) {
            return false;
        }
        ant antVar = (ant) obj;
        return this.e == antVar.e && this.f == antVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + (Integer.hashCode(this.e) * 31);
    }
}
