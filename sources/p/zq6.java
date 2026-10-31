package p;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zq6 implements h0r0 {
    public final qyj a;
    public final br6 b;
    public final zzo c;
    public final ow3 d;
    public final cbr0 e;

    public zq6(qyj qyjVar, br6 br6Var, zzo zzoVar, ow3 ow3Var) {
        this.a = qyjVar;
        this.b = br6Var;
        this.c = zzoVar;
        this.d = ow3Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{new bn70(yon1.G1("ARTIST_ARTIST_LIST", "artist/artist-list", 160, "artist"), nik1.h5, (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-589071965, new yq6(this), true));
    }

    public final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2140836012);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        byte b = 1;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(z6x.a);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            List list = this.b.b;
            boolean zI = x340Var.i(this) | x340Var.i(ven0Var) | x340Var.i(ven0Var2);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new oo6(this, ven0Var, ven0Var2, b);
                x340Var.s0(objT3);
            }
            cso1.m(list, (iac0) null, (iu30) objT3, x340Var, 0);
            nyx.a(2, (wux) null, apo.r(1636652199, new oj2(this, ven0Var2, ven0Var, (byte) 28), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yq6(this, i);
        }
    }
}
