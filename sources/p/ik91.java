package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ik91 extends yk91 {
    public final int a;

    public ik91(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ik91) && this.a == ((ik91) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
