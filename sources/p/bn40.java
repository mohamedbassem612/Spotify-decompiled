package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bn40 {
    public final String a;

    public bn40(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bn40) && u890.j(this.a, ((bn40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
