package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kgh0 extends igh0 {
    public final rp91 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public kgh0(rp91 rp91Var) {
        int i;
        String str;
        int iOrdinal = rp91Var.ordinal();
        if (iOrdinal == 0) {
            i = 2131233637;
        } else if (iOrdinal == 1) {
            i = 2131233638;
        } else {
            if (iOrdinal != 2) {
                eg.o();
                throw null;
            }
            i = 2131233643;
        }
        int iOrdinal2 = rp91Var.ordinal();
        if (iOrdinal2 == 0) {
            str = "TURN_SHUFFLE_ON";
        } else if (iOrdinal2 == 1) {
            str = "TURN_SHUFFLE_OFF";
        } else {
            if (iOrdinal2 != 2) {
                eg.o();
                throw null;
            }
            str = "TURN_SMART_SHUFFLE_OFF";
        }
        super(i, 2131963294, str);
        this.d = rp91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kgh0) && this.d == ((kgh0) obj).d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
