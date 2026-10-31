package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nxe implements nye {
    public final String a;

    public nxe(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nxe) && u890.j(this.a, ((nxe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
