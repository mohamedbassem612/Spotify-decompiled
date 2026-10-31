package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class igb {
    public final String a;

    public igb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof igb) && u890.j(this.a, ((igb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
