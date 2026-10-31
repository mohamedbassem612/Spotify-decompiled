package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class ao51 implements iaa {
    public static final zn51 Companion = new zn51();
    public final Long a;

    public /* synthetic */ ao51(int i, Long l) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = l;
        }
    }

    public final String a(nfa0 nfa0Var) {
        return nfa0Var.b(Companion.serializer(), this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ao51) && u890.j(this.a, ((ao51) obj).a);
    }

    public final int hashCode() {
        Long l = this.a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }
}
