package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kuf implements puf {
    public final String a;

    public kuf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kuf) && u890.j(this.a, ((kuf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
