package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l0m {
    public final String a;

    public l0m(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0m) && u890.j(this.a, ((l0m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
