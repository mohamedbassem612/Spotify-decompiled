package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uir0 implements vir0 {
    public final int a;

    public uir0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uir0) && this.a == ((uir0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
