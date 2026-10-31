package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class t461 implements iaa {
    public static final s461 Companion = new s461();
    public final String a;

    public /* synthetic */ t461(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, r461.a.getDescriptor());
            throw null;
        }
    }

    public final String a(nfa0 nfa0Var) {
        return nfa0Var.b(Companion.serializer(), this);
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t461) && u890.j(this.a, ((t461) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
