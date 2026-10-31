package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zy9 {
    public final String a;
    public final boolean b;

    public zy9(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy9)) {
            return false;
        }
        zy9 zy9Var = (zy9) obj;
        return this.a.equals(zy9Var.a) && this.b == zy9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
