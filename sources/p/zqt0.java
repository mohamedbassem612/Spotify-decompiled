package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zqt0 extends p1p1 {
    public final int c;

    public zqt0(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqt0) && this.c == ((zqt0) obj).c;
    }

    public final int hashCode() {
        return l1d.C(this.c);
    }
}
