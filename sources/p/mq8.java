package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mq8 implements oq8 {
    public final wq8 a;
    public final int b;
    public final spq0 c;
    public final boolean d;
    public final boolean e;

    public mq8(wq8 wq8Var, int i, spq0 spq0Var, boolean z, boolean z2) {
        this.a = wq8Var;
        this.b = i;
        this.c = spq0Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq8)) {
            return false;
        }
        mq8 mq8Var = (mq8) obj;
        return this.a.equals(mq8Var.a) && this.b == mq8Var.b && this.c.equals(mq8Var.c) && this.d == mq8Var.d && this.e == mq8Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g((this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d);
    }
}
