package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ol30 extends c8o {
    public final int h;

    public ol30(int i) {
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ol30) && this.h == ((ol30) obj).h;
    }

    public final int hashCode() {
        return l1d.C(this.h);
    }
}
