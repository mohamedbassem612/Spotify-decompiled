package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vnr0 {
    public final String a;
    public final lee1 b;
    public final kor0 c;
    public final long d;
    public final a0e1 e;

    public vnr0(String str, lee1 lee1Var, kor0 kor0Var, long j, a0e1 a0e1Var) {
        this.a = str;
        this.b = lee1Var;
        this.c = kor0Var;
        this.d = j;
        this.e = a0e1Var;
    }

    public static vnr0 a(vnr0 vnr0Var, String str, lee1 lee1Var, kor0 kor0Var, long j, int i) {
        if ((i & 1) != 0) {
            str = vnr0Var.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            lee1Var = vnr0Var.b;
        }
        lee1 lee1Var2 = lee1Var;
        if ((i & 4) != 0) {
            kor0Var = vnr0Var.c;
        }
        kor0 kor0Var2 = kor0Var;
        if ((i & 8) != 0) {
            j = vnr0Var.d;
        }
        a0e1 a0e1Var = vnr0Var.e;
        vnr0Var.getClass();
        return new vnr0(str2, lee1Var2, kor0Var2, j, a0e1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnr0)) {
            return false;
        }
        vnr0 vnr0Var = (vnr0) obj;
        if (!u890.j(this.a, vnr0Var.a) || !u890.j(this.b, vnr0Var.b) || !u890.j(this.c, vnr0Var.c)) {
            return false;
        }
        long j = vnr0Var.d;
        int i = u7h.l;
        return z4h1.b(this.d, j) && u890.j(this.e, vnr0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + p3d1.h(this.b, this.a.hashCode() * 31, 31)) * 31;
        int i = u7h.l;
        int iF = cy30.f(iHashCode, this.d, 31);
        a0e1 a0e1Var = this.e;
        return iF + (a0e1Var == null ? 0 : Integer.hashCode(a0e1Var.a));
    }
}
