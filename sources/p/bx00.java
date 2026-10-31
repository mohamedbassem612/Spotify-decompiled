package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bx00 implements dx00 {
    public final String a;

    public bx00(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bx00) && u890.j(this.a, ((bx00) obj).a);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
