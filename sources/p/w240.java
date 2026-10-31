package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w240 implements x240 {
    public final int a;

    public w240(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w240) && this.a == ((w240) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
