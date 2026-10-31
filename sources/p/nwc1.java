package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nwc1 implements owc1 {
    public final String a;

    public nwc1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nwc1) && u890.j(this.a, ((nwc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
