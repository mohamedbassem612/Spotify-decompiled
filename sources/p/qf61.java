package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qf61 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final twq e;
    public final String f;
    public final String g;

    public qf61(String str, String str2, int i, long j, twq twqVar, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = twqVar;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf61)) {
            return false;
        }
        qf61 qf61Var = (qf61) obj;
        return u890.j(this.a, qf61Var.a) && u890.j(this.b, qf61Var.b) && this.c == qf61Var.c && this.d == qf61Var.d && this.e.equals(qf61Var.e) && this.f.equals(qf61Var.f) && u890.j(this.g, qf61Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d((this.e.hashCode() + cy30.f(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), this.d, 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return gvg.k(sb, this.g, ')');
    }
}
