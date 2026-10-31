package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nif0 implements yif0 {
    public final String a;

    public nif0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nif0) && u890.j(this.a, ((nif0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
