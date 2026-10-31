package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oe51 {
    public final String a;

    public oe51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oe51) && u890.j(this.a, ((oe51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
