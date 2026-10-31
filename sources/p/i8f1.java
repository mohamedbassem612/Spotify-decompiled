package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i8f1 implements l8f1 {
    public final int a;
    public final String b;

    public i8f1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8f1)) {
            return false;
        }
        i8f1 i8f1Var = (i8f1) obj;
        return this.a == i8f1Var.a && this.b.equals(i8f1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
