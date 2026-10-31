package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class ozk1 extends c0l1 {
    public static final nzk1 Companion = new nzk1();
    public final jdm0 b;

    public /* synthetic */ ozk1(int i, jdm0 jdm0Var) {
        if (1 == (i & 1)) {
            this.b = jdm0Var;
        } else {
            o6p1.t(i, 1, mzk1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ozk1) && u890.j(this.b, ((ozk1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public ozk1(jdm0 jdm0Var) {
        this.b = jdm0Var;
    }
}
