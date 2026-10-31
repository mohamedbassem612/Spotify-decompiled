package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uiy extends viy {
    public final int a;

    public uiy(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uiy) && this.a == ((uiy) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
