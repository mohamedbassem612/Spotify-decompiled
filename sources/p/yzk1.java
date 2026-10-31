package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class yzk1 extends c0l1 {
    public static final xzk1 Companion = new xzk1();
    public final int b;
    public final boolean c;

    public /* synthetic */ yzk1(int i, int i2, boolean z) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, wzk1.a.getDescriptor());
            throw null;
        }
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzk1)) {
            return false;
        }
        yzk1 yzk1Var = (yzk1) obj;
        return this.b == yzk1Var.b && this.c == yzk1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public yzk1(int i, boolean z) {
        this.b = i;
        this.c = z;
    }
}
