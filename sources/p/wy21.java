package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wy21 implements rz21 {
    public final String a;

    public wy21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy21) && this.a.equals(((wy21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
