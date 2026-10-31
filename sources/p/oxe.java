package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oxe implements nye {
    public final String a;

    public oxe(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxe) && u890.j(this.a, ((oxe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
