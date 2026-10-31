package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s1i1 implements h0r0 {
    public final hvj a;
    public final r1i1 b;
    public final vbe1 c;
    public final cbr0 d;

    public s1i1(hvj hvjVar, r1i1 r1i1Var, vbe1 vbe1Var) {
        this.a = hvjVar;
        this.b = r1i1Var;
        this.c = vbe1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{new bn70(yon1.G1("UPSELLS_SHEET", "upsells/sheet", 2071, "upsells"), nik1.V2, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, false, true, (nsm0) null, 3837), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return this.a.a(f4p1.g(this.b), new j2i(916073448, new e9f1(this, (byte) 23), true), new xvj(jpj.b, (j2i) null, (j2i) null, true, 54));
    }

    public final void c(czb czbVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1322358253);
        int i2 = i | (x340Var.i(czbVar) ? 4 : 2) | 48 | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String str = czbVar.a;
            String str2 = czbVar.b;
            azh1 azh1Var = czbVar.c;
            zyh1 zyh1Var = czbVar.f;
            bzb bzbVar = czbVar.d;
            o1i1 o1i1Var = new o1i1(bzbVar.a, bzbVar.b);
            bzb bzbVar2 = czbVar.e;
            p1i1 p1i1Var = new p1i1(str, str2, azh1Var, o1i1Var, bzbVar2 != null ? new o1i1(bzbVar2.a, bzbVar2.b) : null, zyh1Var);
            vbe1 vbe1Var = this.c;
            qim0 qim0Var3 = nim0.a;
            otw.c(vbe1Var, p1i1Var, qim0Var3, (ipb1) null, x340Var, 384, 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wpg1(this, czbVar, qim0Var2, i, (byte) 11);
        }
    }
}
