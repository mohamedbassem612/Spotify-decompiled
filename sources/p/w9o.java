package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w9o implements x9o {
    public final int a;

    public w9o(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w9o) && this.a == ((w9o) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
