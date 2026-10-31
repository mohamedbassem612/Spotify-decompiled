package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jxy implements kxy {
    public final int a;

    public jxy(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxy) && this.a == ((jxy) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
