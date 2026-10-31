package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class vy1 implements iaa {
    public static final uy1 Companion = new uy1();
    public final String a;

    public /* synthetic */ vy1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, ty1.a.getDescriptor());
            throw null;
        }
    }

    public final String a(nfa0 nfa0Var) {
        return nfa0Var.b(Companion.serializer(), this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vy1) && u890.j(this.a, ((vy1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
