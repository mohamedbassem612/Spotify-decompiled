package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fcd implements jcd {
    public final String a;

    public fcd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fcd) && u890.j(this.a, ((fcd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
