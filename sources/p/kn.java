package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kn implements nn {
    public final String a;

    public kn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kn) && u890.j(this.a, ((kn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
