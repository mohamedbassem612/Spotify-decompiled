package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mss0 implements v5b1 {
    public static final x6c0 d = new x6c0((byte) 17);
    public final Map a;
    public final String b;
    public final String c;

    public mss0(String str, String str2, Map map) {
        this.a = map;
        this.b = str;
        this.c = str2;
    }

    public final int a() {
        return 2;
    }

    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mss0)) {
            return false;
        }
        mss0 mss0Var = (mss0) obj;
        return u890.j(this.a, mss0Var.a) && u890.j(this.b, mss0Var.b) && u890.j(this.c, mss0Var.c);
    }

    public final b3i1 getType() {
        return d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public /* synthetic */ mss0() {
        this(null, "spotify:internal:personal-podcast:onboarding", b7x.a);
    }
}
