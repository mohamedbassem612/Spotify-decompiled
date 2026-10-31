package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qes0 {
    public final boolean a;
    public final float b;
    public final boolean c;
    public final int d;

    public qes0(float f, int i, boolean z, boolean z2) {
        this.a = z;
        this.b = f;
        this.c = z2;
        this.d = i;
    }

    public static qes0 a(qes0 qes0Var, int i) {
        float f = qes0Var.b;
        boolean z = (i & 4) != 0 ? qes0Var.c : true;
        int i2 = qes0Var.d;
        qes0Var.getClass();
        return new qes0(f, i2, true, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qes0)) {
            return false;
        }
        qes0 qes0Var = (qes0) obj;
        return this.a == qes0Var.a && Float.compare(this.b, qes0Var.b) == 0 && this.c == qes0Var.c && this.d == qes0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xcg1.g(x0d.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
