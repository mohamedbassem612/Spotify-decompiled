package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kfk {
    public final String a;

    public kfk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kfk) && u890.j(this.a, ((kfk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
