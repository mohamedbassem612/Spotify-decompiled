package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yc60 {
    public final String a;
    public final boolean b;

    public yc60(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc60)) {
            return false;
        }
        yc60 yc60Var = (yc60) obj;
        return this.a.equals(yc60Var.a) && this.b == yc60Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
