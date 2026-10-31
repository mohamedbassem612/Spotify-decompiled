package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class inf implements xpw {
    public final String a;
    public final String b;
    public final elf c;
    public final vmf d;
    public final yjq e;
    public final js20 f;
    public final u7h1 g = eth.a0((vu30) null, new gnf(this, 0), 1);
    public final psw h;

    public inf(zwz0 zwz0Var, String str, String str2, elf elfVar, vmf vmfVar, yjq yjqVar) {
        this.a = str;
        this.b = str2;
        this.c = elfVar;
        this.d = vmfVar;
        this.e = yjqVar;
        this.f = x3p1.m(hu20.e(zwz0Var.c(), new b7c((lnm) null, this, (byte) 4)), rmf.c, eqe.X, null, new m4d(this, (byte) 25), 8);
        j2i j2iVar = new j2i(1492830814, new gtd(this, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.h;
    }

    public final void e(vmf vmfVar, Function0 function0, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1454503616);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(vmfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String str = vmfVar.a;
            String str2 = vmfVar.b;
            String str3 = vmfVar.c;
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z = (i3 == 256) | (i4 == 32);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new wmf(iu30Var, function0, (byte) 0);
                x340Var.s0(objT);
            }
            z50 z50Var = z50.c;
            zgx zgxVar = new zgx(str3, new gbx(z50Var, (Function0) objT));
            String str4 = vmfVar.e;
            boolean z2 = (i3 == 256) | (i4 == 32);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new wmf(iu30Var, function0, (byte) 1);
                x340Var.s0(objT2);
            }
            mqo1.d(function0, null, null, str, str2, zgxVar, new zgx(str4, new gbx(z50Var, (Function0) objT2)), x340Var, ((i2 >> 3) & 14) | 2359296, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(this, vmfVar, function0, iu30Var, i);
        }
    }

    public final void f(int i, Function0 function0, b0k b0kVar, iu30 iu30Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1034214139);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            int i3 = i2 & 14;
            boolean z2 = z | (i3 == 4);
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new wmf(iu30Var, function0, (byte) 2);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            mqo1.d(function0, null, null, cwl1.o0(x340Var, 2131953734), cwl1.o0(x340Var, 2131953732), new zgx(cwl1.o0(x340Var, 2131953733), gbxVar), new zgx(cwl1.o0(x340Var, 2131953731), gbxVar), x340Var, i3 | 2359296, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(this, function0, iu30Var, i, (byte) 19);
        }
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
