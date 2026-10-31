package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yk11 implements al11 {
    public final String a;

    public yk11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yk11) && this.a.equals(((yk11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
