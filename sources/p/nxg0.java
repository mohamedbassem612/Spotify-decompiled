package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nxg0 extends qxg0 {
    public final String a;

    public nxg0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nxg0) && u890.j(this.a, ((nxg0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        return 1487980699 + (str == null ? 0 : str.hashCode());
    }
}
