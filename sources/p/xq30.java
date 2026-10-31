package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xq30 {
    public final String a;

    public xq30(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xq30) && u890.j(this.a, ((xq30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
