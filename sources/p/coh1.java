package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@o661
public final class coh1 {
    public static final boh1 Companion = new boh1();
    public final al0 a;

    public /* synthetic */ coh1(int i, al0 al0Var) {
        if (1 == (i & 1)) {
            this.a = al0Var;
        } else {
            o6p1.t(i, 1, aoh1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof coh1) && u890.j(this.a, ((coh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public coh1(al0 al0Var) {
        this.a = al0Var;
    }
}
