package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zso implements Comparable, Serializable {
    public final Comparable a;

    public zso(Comparable comparable) {
        this.a = comparable;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(zso zsoVar) {
        if (zsoVar == xso.b) {
            return 1;
        }
        if (zsoVar == vso.b) {
            return -1;
        }
        Comparable comparable = zsoVar.a;
        pqz0 pqz0Var = pqz0.c;
        int iCompareTo = this.a.compareTo(comparable);
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof wso, zsoVar instanceof wso);
    }

    public void b(StringBuilder sb) {
        throw new AssertionError();
    }

    public void c(StringBuilder sb) {
        sb.append("+∞)");
    }

    public Comparable d() {
        return this.a;
    }

    public boolean e(Comparable comparable) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zso) {
            try {
                if (compareTo((zso) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }
}
