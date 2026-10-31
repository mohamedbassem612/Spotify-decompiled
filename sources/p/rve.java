package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rve {
    public final String a;

    public rve(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rve) && u890.j(this.a, ((rve) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
