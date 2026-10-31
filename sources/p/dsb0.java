package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dsb0 {
    public final kd41 a;
    public final e45 b;
    public final nen0 c;

    public dsb0(kd41 kd41Var, e45 e45Var) {
        this.a = kd41Var;
        this.b = e45Var;
        long[] jArr = hj41.a;
        this.c = new nen0();
    }

    public final vu30 a(int i, Object obj, Object obj2) {
        nen0 nen0Var = this.c;
        csb0 csb0Var = (csb0) nen0Var.g(obj);
        if (csb0Var != null && csb0Var.c == i && u890.j(csb0Var.b, obj2)) {
            j2i j2iVar = csb0Var.d;
            if (j2iVar != null) {
                return j2iVar;
            }
            j2i j2iVarJ = apo.j(818252804, new f14(csb0Var.e, csb0Var, (byte) 17), true);
            csb0Var.d = j2iVarJ;
            return j2iVarJ;
        }
        csb0 csb0Var2 = new csb0(this, i, obj, obj2);
        nen0Var.m(obj, csb0Var2);
        j2i j2iVar2 = csb0Var2.d;
        if (j2iVar2 != null) {
            return j2iVar2;
        }
        j2i j2iVarJ2 = apo.j(818252804, new f14(this, csb0Var2, (byte) 17), true);
        csb0Var2.d = j2iVarJ2;
        return j2iVarJ2;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        csb0 csb0Var = (csb0) this.c.g(obj);
        if (csb0Var != null) {
            return csb0Var.b;
        }
        esb0 esb0Var = (esb0) this.b.invoke();
        int iC = esb0Var.c(obj);
        if (iC != -1) {
            return esb0Var.b(iC);
        }
        return null;
    }
}
