package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pqz0 implements omv0, Serializable {
    public static final pqz0 c = new pqz0(xso.b, vso.b);
    public final zso a;
    public final zso b;

    public pqz0(zso zsoVar, zso zsoVar2) {
        this.a = zsoVar;
        this.b = zsoVar2;
        if (zsoVar.compareTo(zsoVar2) > 0 || zsoVar == vso.b || zsoVar2 == xso.b) {
            StringBuilder sb = new StringBuilder(16);
            zsoVar.b(sb);
            sb.append("..");
            zsoVar2.c(sb);
            hhg1.n("Invalid range: ".concat(sb.toString()));
            throw null;
        }
    }

    public static pqz0 a(Long l, Long l2) {
        return new pqz0(new yso(l), new wso(l2));
    }

    public final boolean apply(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return this.a.e(comparable) && !this.b.e(comparable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pqz0)) {
            return false;
        }
        pqz0 pqz0Var = (pqz0) obj;
        return this.a.equals(pqz0Var.a) && this.b.equals(pqz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public Object readResolve() {
        pqz0 pqz0Var = c;
        return equals(pqz0Var) ? pqz0Var : this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.a.b(sb);
        sb.append("..");
        this.b.c(sb);
        return sb.toString();
    }
}
