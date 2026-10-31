package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pk91 extends yk91 {
    public final int a;

    public pk91(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pk91) && this.a == ((pk91) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
