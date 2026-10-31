package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class jw21 {
    public static final hw21 Companion = new hw21();
    public final String a;
    public final String b;
    public final iw21 c;

    public jw21(int i, String str, String str2) {
        Object obj = null;
        if (3 != (i & 3)) {
            o6p1.t(i, 3, gw21.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        d7 d7Var = new d7(iw21.d, (byte) 0);
        while (d7Var.hasNext()) {
            Object next = d7Var.next();
            if (((iw21) next).a.equalsIgnoreCase(str)) {
                obj = next;
                break;
            }
        }
        iw21 iw21Var = (iw21) obj;
        this.c = iw21Var == null ? iw21.UNKNOWN_DISCOVERY_METHOD : iw21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw21)) {
            return false;
        }
        jw21 jw21Var = (jw21) obj;
        return u890.j(this.a, jw21Var.a) && u890.j(this.b, jw21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
