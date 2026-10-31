package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tju implements vju {
    public final String a;

    public tju(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tju) && u890.j(this.a, ((tju) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
