package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ka7 implements za7 {
    public final int a;
    public final boolean b;

    public ka7(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka7)) {
            return false;
        }
        ka7 ka7Var = (ka7) obj;
        return this.a == ka7Var.a && this.b == ka7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
