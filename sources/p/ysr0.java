package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ysr0 extends j2h1 {
    public final int d;

    public ysr0(int i) {
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ysr0) && this.d == ((ysr0) obj).d;
    }

    public final int hashCode() {
        return l1d.C(this.d);
    }
}
