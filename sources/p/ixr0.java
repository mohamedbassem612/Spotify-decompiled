package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ixr0 {
    public final String a;

    public ixr0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ixr0) && this.a.equals(((ixr0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
