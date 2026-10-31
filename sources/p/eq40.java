package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class eq40 {
    public static final dq40 Companion = new dq40();
    public final f291 a;

    public /* synthetic */ eq40(int i, f291 f291Var) {
        if (1 == (i & 1)) {
            this.a = f291Var;
        } else {
            o6p1.t(i, 1, cq40.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eq40) && u890.j(this.a, ((eq40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
