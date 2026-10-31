package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ulm0 implements l120 {
    public final j2i1 a;
    public final int b;
    public final int c;
    public final amm0 d;
    public final nq80 e;
    public final String f;

    public ulm0(j2i1 j2i1Var, int i, int i2, amm0 amm0Var, nq80 nq80Var, String str) {
        this.a = j2i1Var;
        this.b = i;
        this.c = i2;
        this.d = amm0Var;
        this.e = nq80Var;
        this.f = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(lnm lnmVar) {
        tlm0 tlm0Var;
        if (lnmVar instanceof tlm0) {
            tlm0Var = (tlm0) lnmVar;
            int i = tlm0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tlm0Var.c = i - Integer.MIN_VALUE;
            } else {
                tlm0Var = new tlm0(this, (onm) lnmVar);
            }
        } else {
            tlm0Var = new tlm0(this, (onm) lnmVar);
        }
        Object objA = tlm0Var.a;
        int i2 = tlm0Var.c;
        j2i1 j2i1Var = this.a;
        if (i2 == 0) {
            hm5.M(objA);
            String str = j2i1Var.a;
            tlm0Var.c = 1;
            objA = this.d.a(str, this.b, this.c, tlm0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        iq80 iq80Var = (iq80) objA;
        if (iq80Var == null) {
            bhn0.g(j2i1Var, "Unable to create a mosaic bitmap for ");
            return null;
        }
        g5n g5nVar = iq80Var.b;
        int iOrdinal = g5nVar.ordinal();
        int i3 = 3;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal != 2 && iOrdinal != 3) {
                eg.o();
                return null;
            }
            i3 = 4;
        }
        nq80 nq80Var = this.e;
        if (nq80Var != null) {
            nq80Var.h(this.f, g5nVar, iq80Var.c);
        }
        return new ss70(new kxa(iq80Var.a), true, i3);
    }
}
