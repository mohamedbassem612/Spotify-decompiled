package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ujy extends ob51 {
    public final int c;

    public ujy(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ujy) && this.c == ((ujy) obj).c;
    }

    public final int hashCode() {
        return l1d.C(this.c);
    }

    public final int k() {
        return this.c;
    }
}
