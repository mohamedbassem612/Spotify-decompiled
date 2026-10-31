package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nnb {
    public final String a;

    public nnb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nnb) && u890.j(this.a, ((nnb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
