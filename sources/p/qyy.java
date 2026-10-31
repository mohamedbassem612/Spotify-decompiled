package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qyy extends dem1 {
    public final h290 b;
    public final int c;

    public qyy(int i, h290 h290Var) {
        this.b = h290Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyy)) {
            return false;
        }
        qyy qyyVar = (qyy) obj;
        return this.b.equals(qyyVar.b) && this.c == qyyVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + (this.b.hashCode() * 31);
    }
}
