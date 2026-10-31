package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eyr0 implements tyq {
    public final d0r a;
    public final ynb0 b;
    public final mr20 c;
    public final o3r d;
    public final js20 e;
    public final ia00 f;
    public final psw g;

    public eyr0(d0r d0rVar, mr20 mr20Var, ynb0 ynb0Var, j2i j2iVar) {
        this.a = d0rVar;
        this.b = ynb0Var;
        this.c = rqt0.u(new m9r0(mr20Var, this, (byte) 3));
        jd11 jd11Var = rc11.a;
        this.d = w3p1.k(new l4r(new xv00(jd11Var.b(jo70.class)), 1, wvr0.Q0, new j4r(wvr0.i), wvr0.R0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, wvr0.O0, new j4r(wvr0.t), wvr0.P0), new l4r(new xv00(jd11Var.b(hll.class)), 3, wvr0.S0, new j4r(wvr0.X), wvr0.T0), new l4r(pwc0.r, 3, wvr0.U0, new j4r(wvr0.Y), wvr0.V0), new l4r(hvm.d, 3, wvr0.W0, new j4r(wvr0.Z), wvr0.X0), qsj.R0);
        this.e = x3p1.n(new cyr0(this, (byte) 0), new ewq0(this, (byte) 3), new xgr0(this, (byte) 1), (o8n) null, new cyr0(this, (byte) 1), 8);
        this.f = n3o1.q(this).a(jgq0.X0, jgq0.Y0);
        uvx uvxVar = hyr0.a;
        j2i j2iVar2 = new j2i(1951188623, new t9r0(j2iVar, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar2, (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x014f  */
    public static xxr0 f(wxr0 wxr0Var, k1r k1rVar, ayr0 ayr0Var) {
        String str;
        int i;
        int i2;
        int i3;
        xkk1 xkk1Var;
        mq70 mq70Var;
        up70 up70VarA;
        List list;
        ho70 ho70Var;
        List list2;
        qfd qfdVar;
        List list3;
        List list4;
        ayr0 ayr0Var2 = ayr0Var;
        boolean z = k1rVar instanceof i1r;
        i1r i1rVar = z ? (i1r) k1rVar : null;
        zxr0 zxr0Var = i1rVar != null ? (zxr0) i1rVar.a : null;
        hll hllVar = zxr0Var != null ? zxr0Var.c : null;
        boolean z2 = (hllVar == null || (list4 = hllVar.b) == null || !list4.contains(ell.b)) ? false : true;
        boolean z3 = (hllVar == null || (list3 = hllVar.d) == null || !list3.contains(fll.c)) ? false : true;
        boolean z4 = (zxr0Var == null || (qfdVar = zxr0Var.d) == null || qfdVar.b || !qfdVar.e.contains(l131.b)) ? false : true;
        boolean z5 = zxr0Var != null && (zxr0Var.f || (z2 && z4 && zxr0Var.e));
        String uri = wxr0Var.getUri();
        boolean z6 = wxr0Var instanceof vxr0;
        int i4 = 3;
        if (z6) {
            i4 = 1;
        } else if (wxr0Var instanceof txr0) {
            i4 = 2;
        } else if (!(wxr0Var instanceof uxr0)) {
            eg.o();
            return null;
        }
        String str2 = zxr0Var != null ? zxr0Var.a.a : null;
        if (str2 == null) {
            str2 = "";
        }
        String strY0 = (zxr0Var == null || (list2 = zxr0Var.a.d) == null) ? null : o7h.y0(list2, (CharSequence) null, (String) null, (String) null, wvr0.N0, 31);
        String str3 = strY0 != null ? strY0 : "";
        String str4 = (zxr0Var == null || (list = zxr0Var.a.d) == null || (ho70Var = (ho70) o7h.s0(list)) == null) ? null : ho70Var.b;
        if (zxr0Var == null || (xkk1Var = zxr0Var.b) == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null || (str = up70VarA.a.a) == null || z5) {
            str = null;
        }
        boolean zB = wxr0Var.b();
        boolean zA = wxr0Var.a();
        vxr0 vxr0Var = z6 ? (vxr0) wxr0Var : null;
        boolean z7 = vxr0Var != null && vxr0Var.d;
        vxr0 vxr0Var2 = z6 ? (vxr0) wxr0Var : null;
        String str5 = vxr0Var2 != null ? vxr0Var2.e : null;
        if (k1rVar.equals(j1r.a)) {
            i = 1;
        } else if (z) {
            i = 2;
        } else {
            if (!(k1rVar instanceof h1r)) {
                eg.o();
                return null;
            }
            i = i4;
        }
        if (ayr0Var2 == null) {
            i2 = 3;
        } else {
            if (!wxr0Var.a() || !ayr0Var2.a.equals(wxr0Var.getUri())) {
                ayr0Var2 = null;
            }
            if (ayr0Var2 == null || (i3 = ayr0Var2.b) == 0) {
                i2 = 3;
            } else {
                i2 = i3;
            }
        }
        return new xxr0(uri, i4, str2, str3, str4, str, z2, z3, zB, zA, z4, i, z7, str5, i2);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.e;
    }

    public final f4r getData() {
        return this.d;
    }
}
