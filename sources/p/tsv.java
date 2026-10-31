package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tsv implements usv {
    public final int a;

    public tsv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tsv) && this.a == ((tsv) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
