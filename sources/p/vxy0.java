package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vxy0 {
    public final String a;

    public vxy0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vxy0) && u890.j(this.a, ((vxy0) obj).a);
    }

    public final int hashCode() {
        return l1d.C(2) + (this.a.hashCode() * 31);
    }
}
