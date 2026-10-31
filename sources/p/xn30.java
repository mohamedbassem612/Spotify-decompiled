package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xn30 implements zn30 {
    public final String a;

    public xn30(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xn30) && u890.j(this.a, ((xn30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
