package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class jdm0 {
    public static final idm0 Companion = new idm0();
    public final String a;
    public final String b;

    public /* synthetic */ jdm0(int i, String str, String str2) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, hdm0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdm0)) {
            return false;
        }
        jdm0 jdm0Var = (jdm0) obj;
        return u890.j(this.a, jdm0Var.a) && u890.j(this.b, jdm0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public jdm0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
