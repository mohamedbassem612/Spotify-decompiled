package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class nea0 {
    public static final mea0 Companion = new mea0();
    public final String a;
    public final np21 b;
    public final int c;

    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    public nea0(int i, String str, np21 np21Var) {
        String str2;
        if (1 != (i & 1)) {
            o6p1.t(i, 1, lea0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = np21Var;
        }
        int i2 = 0;
        for (int i3 : l1d.H(8)) {
            switch (i3) {
                case 1:
                    str2 = "UNKNOWN";
                    break;
                case 2:
                    str2 = "NEW_JOIN_REQUEST";
                    break;
                case 3:
                    str2 = "NEW_UPGRADE_REQUEST";
                    break;
                case 4:
                    str2 = "REQUEST_DECLINED_BY_HOST";
                    break;
                case 5:
                    str2 = "REQUEST_DECLINED_JAM_ENDED";
                    break;
                case 6:
                    str2 = "REQUEST_CANCELLED_BY_REQUESTER";
                    break;
                case 7:
                    str2 = "REQUEST_ACCEPTED_BY_HOST";
                    break;
                case 8:
                    str2 = "REQUEST_CANCELLED_AUTOMATICALLY";
                    break;
                default:
                    throw null;
            }
            if (str2.equalsIgnoreCase(str)) {
                i2 = i3;
                this.c = i2 != 0 ? i2 : 1;
            }
        }
        this.c = i2 != 0 ? i2 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nea0)) {
            return false;
        }
        nea0 nea0Var = (nea0) obj;
        return u890.j(this.a, nea0Var.a) && u890.j(this.b, nea0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        np21 np21Var = this.b;
        return iHashCode + (np21Var == null ? 0 : np21Var.hashCode());
    }
}
