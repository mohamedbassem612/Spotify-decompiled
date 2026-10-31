package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class epb0 extends mmo1 {
    public static final n75 g = new n75(26);
    public final rpb0 c = new rpb0(this);
    public final mgc d = new mgc((byte) 22);
    public boolean e;
    public edn0 f;

    public epb0(iu30 iu30Var) {
        iu30Var.invoke(this);
    }

    public static /* synthetic */ void Q(epb0 epb0Var, Object obj, Object obj2, j2i j2iVar, int i) {
        iu30 iu30Var = hh60.V0;
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            iu30Var = null;
        }
        if ((i & 4) != 0) {
            obj2 = null;
        }
        epb0Var.P(obj, iu30Var, obj2, j2iVar);
    }

    public final mgc B() {
        return this.d;
    }

    public final void P(Object obj, final iu30 iu30Var, Object obj2, j2i j2iVar) {
        vu30 vu30Var;
        byte b = 15;
        gv20 gv20Var = obj != null ? new gv20(obj, b) : null;
        if (iu30Var != null) {
            final byte b2 = 0;
            vu30Var = new vu30() { // from class: p.dpb0
                public final Object invoke(Object obj3, Object obj4) {
                    byte b3 = b2;
                    iu30 iu30Var2 = iu30Var;
                    switch (b3) {
                        case 0:
                            ((Integer) obj4).intValue();
                            return (bg50) iu30Var2.invoke((qpb0) obj3);
                        default:
                            iu30Var2.invoke(obj3);
                            return rih1.a;
                    }
                }
            };
        } else {
            vu30Var = g;
        }
        this.d.e(1, new bpb0(gv20Var, vu30Var, new gv20(obj2, b), new j2i(-291643851, new qw4(j2iVar, (byte) 1), true)));
        if (iu30Var != null) {
            this.e = true;
        }
    }

    public final void R(int i, iu30 iu30Var, vu30 vu30Var, iu30 iu30Var2, j2i j2iVar) {
        this.d.e(i, new bpb0(iu30Var, vu30Var == null ? g : vu30Var, iu30Var2, j2iVar));
        if (vu30Var != null) {
            this.e = true;
        }
    }
}
