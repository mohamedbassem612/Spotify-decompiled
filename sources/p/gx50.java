package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gx50 implements ix50 {
    public final int a;

    public gx50(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx50) && this.a == ((gx50) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
