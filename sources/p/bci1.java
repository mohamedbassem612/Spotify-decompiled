package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bci1 {
    public final int a;

    public bci1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bci1) && this.a == ((bci1) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
