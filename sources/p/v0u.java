package p;

import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class v0u {
    public static final u0u Companion = new u0u();
    public static final znb0[] m = {null, dm5.S(2, u6t.Q0), null, null, null, null, null, null, null, null, null};
    public final File a;
    public final String b;
    public final n1u c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public /* synthetic */ v0u(int i, String str, n1u n1uVar, String str2, long j, long j2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (127 != (i & 127)) {
            o6p1.t(i, 127, t0u.a.getDescriptor());
            throw null;
        }
        this.a = new File("");
        this.b = str;
        this.c = n1uVar;
        this.d = str2;
        this.e = j;
        this.f = j2;
        this.g = str3;
        this.h = str4;
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
        if ((i & 256) == 0) {
            this.j = null;
        } else {
            this.j = str6;
        }
        if ((i & 512) == 0) {
            this.k = null;
        } else {
            this.k = str7;
        }
        if ((i & 1024) == 0) {
            this.l = null;
        } else {
            this.l = str8;
        }
    }

    public static v0u a(File file, v0u v0uVar) {
        String str = v0uVar.b;
        n1u n1uVar = v0uVar.c;
        String str2 = v0uVar.d;
        long j = v0uVar.e;
        long j2 = v0uVar.f;
        String str3 = v0uVar.g;
        String str4 = v0uVar.h;
        String str5 = v0uVar.i;
        String str6 = v0uVar.j;
        String str7 = v0uVar.k;
        String str8 = v0uVar.l;
        v0uVar.getClass();
        return new v0u(file, str, n1uVar, str2, j, j2, str3, str4, str5, str6, str7, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0u)) {
            return false;
        }
        v0u v0uVar = (v0u) obj;
        return this.a.equals(v0uVar.a) && u890.j(this.b, v0uVar.b) && this.c == v0uVar.c && u890.j(this.d, v0uVar.d) && this.e == v0uVar.e && this.f == v0uVar.f && u890.j(this.g, v0uVar.g) && u890.j(this.h, v0uVar.h) && u890.j(this.i, v0uVar.i) && u890.j(this.j, v0uVar.j) && u890.j(this.k, v0uVar.k) && u890.j(this.l, v0uVar.l);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        int iD = cy30.d(cy30.d(cy30.f(cy30.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.e, 31), this.f, 31), 31, this.g), 31, this.h);
        String str2 = this.i;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public v0u(File file, String str, n1u n1uVar, String str2, long j, long j2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = file;
        this.b = str;
        this.c = n1uVar;
        this.d = str2;
        this.e = j;
        this.f = j2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
    }
}
