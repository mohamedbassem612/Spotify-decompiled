package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m3w {
    public final String a;
    public final String b;
    public final job1 c;
    public final ke81 d;
    public final lrz0 e;

    public m3w(String str, String str2, job1 job1Var, ke81 ke81Var, lrz0 lrz0Var) {
        this.a = str;
        this.b = str2;
        this.c = job1Var;
        this.d = ke81Var;
        this.e = lrz0Var;
    }

    public static m3w a(m3w m3wVar, job1 job1Var, ke81 ke81Var, int i) {
        String str = m3wVar.a;
        String str2 = m3wVar.b;
        if ((i & 4) != 0) {
            job1Var = m3wVar.c;
        }
        job1 job1Var2 = job1Var;
        if ((i & 8) != 0) {
            ke81Var = m3wVar.d;
        }
        return new m3w(str, str2, job1Var2, ke81Var, m3wVar.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3w)) {
            return false;
        }
        m3w m3wVar = (m3w) obj;
        return this.a.equals(m3wVar.a) && u890.j(this.b, m3wVar.b) && this.c.equals(m3wVar.c) && this.d == m3wVar.d && this.e.equals(m3wVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }
}
