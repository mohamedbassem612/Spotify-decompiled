package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class s0i1 {
    public static final r0i1 Companion = new r0i1();
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    public s0i1(int i, String str, String str2) {
        int i2;
        String str3;
        String str4;
        if (3 != (i & 3)) {
            o6p1.t(i, 3, q0i1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        int[] iArrH = l1d.H(3);
        int length = iArrH.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i2 = 0;
                break;
            }
            i2 = iArrH[i4];
            if (i2 == 1) {
                str4 = "UNKNOWN";
            } else if (i2 == 2) {
                str4 = "SNACK_BAR";
            } else {
                if (i2 != 3) {
                    throw null;
                }
                str4 = "BOTTOM_SHEET";
            }
            if (str4.equalsIgnoreCase(str)) {
                break;
            } else {
                i4++;
            }
        }
        this.c = i2 == 0 ? 1 : i2;
        String str5 = this.b;
        for (int i5 : l1d.H(8)) {
            switch (i5) {
                case 1:
                    str3 = "UNKNOWN";
                    break;
                case 2:
                    str3 = "QUEUE";
                    break;
                case 3:
                    str3 = "PLAY";
                    break;
                case 4:
                    str3 = "SKIP";
                    break;
                case 5:
                    str3 = "SHUFFLE";
                    break;
                case 6:
                    str3 = "REORDER";
                    break;
                case 7:
                    str3 = "SEEK";
                    break;
                case 8:
                    str3 = "JAM_CAPPED";
                    break;
                default:
                    throw null;
            }
            if (str3.equalsIgnoreCase(str5)) {
                i3 = i5;
                this.d = i3 != 0 ? i3 : 1;
            }
        }
        this.d = i3 != 0 ? i3 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0i1)) {
            return false;
        }
        s0i1 s0i1Var = (s0i1) obj;
        return u890.j(this.a, s0i1Var.a) && u890.j(this.b, s0i1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
