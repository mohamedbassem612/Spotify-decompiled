package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aky {
    public final pjy a;
    public final ob51 b;
    public final njy c;
    public final yjy d;
    public final sjy e;

    /* JADX WARN: Illegal instructions before constructor call */
    public aky(String str, ujy ujyVar, njy njyVar, sjy sjyVar, int i) {
        str = (i & 1) != 0 ? null : str;
        this(str != null ? new pjy(str) : null, (i & 2) != 0 ? new ujy(2) : ujyVar, (i & 4) != 0 ? null : njyVar, (yjy) null, (i & 16) != 0 ? qjy.a : sjyVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aky)) {
            return false;
        }
        aky akyVar = (aky) obj;
        return u890.j(this.a, akyVar.a) && u890.j(this.b, akyVar.b) && u890.j(this.c, akyVar.c) && u890.j(this.d, akyVar.d) && u890.j(this.e, akyVar.e);
    }

    public final int hashCode() {
        pjy pjyVar = this.a;
        int iHashCode = (this.b.hashCode() + ((pjyVar == null ? 0 : pjyVar.hashCode()) * 31)) * 31;
        njy njyVar = this.c;
        int iHashCode2 = (iHashCode + (njyVar == null ? 0 : njyVar.hashCode())) * 31;
        yjy yjyVar = this.d;
        return this.e.hashCode() + ((iHashCode2 + (yjyVar != null ? yjyVar.hashCode() : 0)) * 31);
    }

    public /* synthetic */ aky(pjy pjyVar, ujy ujyVar, njy njyVar, yjy yjyVar, rjy rjyVar, int i) {
        this(pjyVar, (ob51) ((i & 2) != 0 ? new ujy(2) : ujyVar), (i & 4) != 0 ? null : njyVar, (i & 8) != 0 ? null : yjyVar, (sjy) ((i & 16) != 0 ? qjy.a : rjyVar));
    }

    public aky(pjy pjyVar, ob51 ob51Var, njy njyVar, yjy yjyVar, sjy sjyVar) {
        this.a = pjyVar;
        this.b = ob51Var;
        this.c = njyVar;
        this.d = yjyVar;
        this.e = sjyVar;
    }
}
