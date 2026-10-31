package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class voh implements iph {
    public final String a;

    public voh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof voh) && this.a.equals(((voh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
