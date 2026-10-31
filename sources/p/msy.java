package p;

import com.spotify.collection2.itemdata.proto.CollectionItemdata$ItemData;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class msy implements h0r0 {
    public final lik1 a;
    public final lzn0 b;
    public final ruy c;
    public final hvj d;
    public final buy e;
    public final ynb0 f;
    public final cbr0 g;

    /* JADX WARN: Multi-variable type inference failed */
    public msy(hvj hvjVar, buy buyVar, ruy ruyVar, e5b0 e5b0Var, ynb0 ynb0Var, lzn0 lzn0Var, lik1 lik1Var) {
        this.a = lik1Var;
        this.b = lzn0Var;
        this.c = ruyVar;
        this.d = hvjVar;
        this.e = buyVar;
        this.f = ynb0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{new bn70(yon1.u1(), lik1Var, (nar0) null), new s9h1(14, true, false, false), e5b0Var}, false);
    }

    public final cbr0 a() {
        return this.g;
    }

    public final p2r0 b() {
        return this.d.a(f4p1.g(this.e), apo.j(753325810, new o8x(this, (byte) 10), true), mth1.v(u291.z(nim0.a, null, 3)));
    }

    public final void c(int i, String str, b0k b0kVar, boolean z) {
        int i2;
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1564462257);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            w460 w460Var = new w460(this.b, false, false, false, (a1r0) null, 56);
            String str2 = str == null ? "" : str;
            if (z) {
                strK = x0d.k(x340Var, -209664251, 2131955568, x340Var, false);
            } else {
                x340Var.i0(2090412686);
                x340Var.r(false);
                strK = null;
            }
            otw.c(w460Var, new s460(4, 748, str2, strK, (String) null, (String) null, false), uyn1.z(16.0f, 0.0f, 2, u291.z(u291.f(nim0.a, 1.0f), null, 3)), null, x340Var, 8, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(this, str, z, i, (byte) 13);
        }
    }

    public final void d(int i, String str, String str2, b0k b0kVar, c380 c380Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-700015078);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(c380Var) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.i(this) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarQ = voo1.q(u291.z(nim0Var, null, 3));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            c(((i2 >> 6) & 126) | ((i2 >> 9) & 896), str2, x340Var, z);
            ((wty) this.f.get()).a(this.a, str, c380Var, anm1.N("entitySegmentsOnBottomSheet", nim0Var), new rty(new pty(), 3), (vzq0) null, (iu30) null, x340Var, ((i2 << 3) & CollectionItemdata$ItemData.HIDDEN_FROM_HOME_ITEM_DATA_FIELD_NUMBER) | 16777216, 96);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ey(this, str, c380Var, str2, z, i);
        }
    }
}
