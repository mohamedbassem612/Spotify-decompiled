package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vrw0 implements wrw0 {
    public final UUID a;
    public final String b;
    public final String c;
    public final b3e0 d;

    public vrw0(UUID uuid, String str, String str2, b3e0 b3e0Var) {
        this.a = uuid;
        this.b = str;
        this.c = str2;
        this.d = b3e0Var;
    }

    public final UUID a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final b3e0 c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrw0)) {
            return false;
        }
        vrw0 vrw0Var = (vrw0) obj;
        return this.a.equals(vrw0Var.a) && u890.j(this.b, vrw0Var.b) && u890.j(this.c, vrw0Var.c) && u890.j(this.d, vrw0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        b3e0 b3e0Var = this.d;
        return iHashCode3 + (b3e0Var != null ? b3e0Var.hashCode() : 0);
    }
}
