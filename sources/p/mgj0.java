package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mgj0 extends pgj0 {
    public final String a;

    public mgj0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mgj0) && this.a.equals(((mgj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
