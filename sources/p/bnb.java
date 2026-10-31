package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bnb {
    public final String a;

    public bnb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bnb) && u890.j(this.a, ((bnb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
