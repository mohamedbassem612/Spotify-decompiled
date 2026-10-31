package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w7h implements y7h {
    public final int a;

    public w7h(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7h) && this.a == ((w7h) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
