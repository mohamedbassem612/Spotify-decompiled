package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ob extends pb {
    public final int a;

    public ob(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ob) && this.a == ((ob) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
