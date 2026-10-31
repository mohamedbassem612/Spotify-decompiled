package p;

import kotlinx.serialization.MissingFieldException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@o661
public final class ns0 {
    public static final ms0 Companion = new ms0();
    public final ks0 a;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.MissingFieldException */
    public /* synthetic */ ns0(int i, ks0 ks0Var) throws MissingFieldException {
        if (1 == (i & 1)) {
            this.a = ks0Var;
        } else {
            o6p1.t(i, 1, ls0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ns0) && u890.j(this.a, ((ns0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
