package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qgx0 implements sgx0 {
    public final String a;

    public qgx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qgx0) && u890.j(this.a, ((qgx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
