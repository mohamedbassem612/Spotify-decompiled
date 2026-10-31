package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nl30 extends c8o {
    public final int h;

    public nl30(int i) {
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nl30) && this.h == ((nl30) obj).h;
    }

    public final int hashCode() {
        return l1d.C(this.h);
    }
}
