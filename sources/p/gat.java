package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gat extends iat {
    public final String a;

    public gat(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gat) && this.a.equals(((gat) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
