package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sdy implements ez00 {
    public final int a;

    public sdy(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdy) && this.a == ((sdy) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
