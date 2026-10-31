package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vhb implements xhb {
    public final String a;

    public vhb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vhb) && this.a.equals(((vhb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
