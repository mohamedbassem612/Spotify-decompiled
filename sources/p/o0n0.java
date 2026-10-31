package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o0n0 implements iu30 {
    public final zf30 a;

    public o0n0(zf30 zf30Var) {
        this.a = zf30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0n0) && u890.j(this.a, ((o0n0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        boolean zB;
        tv80 tv80Var = (tv80) obj;
        zf30 zf30Var = this.a;
        t1n0 t1n0Var = zf30Var instanceof t1n0 ? (t1n0) zf30Var : null;
        if (t1n0Var != null) {
            ehr0 qy3Var = new qy3(tv80Var);
            air0 air0Var = t1n0Var.P1;
            if (air0Var == null) {
                u890.C("uiRuntime");
                throw null;
            }
            zB = air0Var.t.b(qy3Var);
        } else {
            zB = false;
        }
        return Boolean.valueOf(zB);
    }
}
