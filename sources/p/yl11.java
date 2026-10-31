package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yl11 {
    public final String a;

    public yl11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yl11) && u890.j(this.a, ((yl11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
