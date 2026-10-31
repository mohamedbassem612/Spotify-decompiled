package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class uos0 {
    public static final tos0 Companion = new tos0();
    public final String a;
    public final String b;
    public final Integer c;

    public /* synthetic */ uos0(int i, String str, Integer num, String str2) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, sos0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uos0)) {
            return false;
        }
        uos0 uos0Var = (uos0) obj;
        return u890.j(this.a, uos0Var.a) && u890.j(this.b, uos0Var.b) && u890.j(this.c, uos0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public uos0(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }
}
