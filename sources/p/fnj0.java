package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fnj0 extends snj0 {
    public final String b;

    public fnj0(String str) {
        super(true);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fnj0) && u890.j(this.b, ((fnj0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
