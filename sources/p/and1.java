package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class and1 extends dnd1 {
    public final int a;

    public and1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof and1) && this.a == ((and1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
