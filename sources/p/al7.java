package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class al7 extends bro1 {
    public final String b;

    public al7(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof al7) && this.b.equals(((al7) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String m() {
        return this.b;
    }
}
