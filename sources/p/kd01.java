package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kd01 {
    public final String a;

    public kd01(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kd01) && u890.j(this.a, ((kd01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
