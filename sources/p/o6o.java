package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o6o {
    public final String a;

    public o6o(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6o) && this.a.equals(((o6o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
