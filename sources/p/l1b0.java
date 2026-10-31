package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class l1b0 implements jly0 {
    public static ees A(i1n0 i1n0Var, jik1 jik1Var, o6r0 o6r0Var, nlp nlpVar, String str) {
        int i;
        Set set = s4b1.f;
        blc0 blc0Var = uic.x(str).c;
        int iOrdinal = blc0Var.ordinal();
        if (iOrdinal == 844) {
            i = 2131960171;
        } else if (iOrdinal == 860) {
            i = 2131960172;
        } else {
            if (iOrdinal != 926) {
                n9v.f(blc0Var, " is not handled");
                return null;
            }
            i = 2131960173;
        }
        ees eesVarA = i1n0Var.a(o6r0Var, jik1Var);
        u5b u5bVar = new u5b(nlpVar, (byte) 2);
        a680 a680Var = eesVarA.a;
        a680Var.b = u5bVar;
        a680Var.a = s28.h;
        a680Var.d = new dzb0(i);
        return eesVarA;
    }

    public static bf70 B(d0q d0qVar) {
        return new bf70(d0qVar, (byte) 10);
    }

    public static d3d1 C(zf30 zf30Var) {
        return (d3d1) zf30Var.O0().getSerializable("see_all_surface_key");
    }

    public static i01 D(i01 i01Var, i01 i01Var2, i44 i44Var) {
        return i44Var.h() ? i01Var : i01Var2;
    }

    public static w7w a(ynb0 ynb0Var, ynb0 ynb0Var2) {
        w7w w7wVar = new w7w((byte) 16);
        w7wVar.b = ynb0Var;
        w7wVar.c = ynb0Var2;
        return w7wVar;
    }

    public static t700 b(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 8);
    }

    public static eh50 c(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 24);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static vbb0 d(r7q r7qVar, caq caqVar) {
        vbb0 vbb0Var = new vbb0();
        vbb0Var.a = r7qVar;
        vbb0Var.b = caqVar;
        return vbb0Var;
    }

    public static rcb0 e(r7q r7qVar, r7q r7qVar2, caq caqVar, caq caqVar2, caq caqVar3, kly0 kly0Var, caq caqVar4, caq caqVar5, caq caqVar6) {
        rcb0 rcb0Var = new rcb0();
        rcb0Var.a = r7qVar;
        rcb0Var.b = r7qVar2;
        rcb0Var.c = caqVar;
        rcb0Var.d = caqVar2;
        rcb0Var.e = caqVar3;
        rcb0Var.f = kly0Var;
        rcb0Var.g = caqVar4;
        rcb0Var.h = caqVar5;
        rcb0Var.i = caqVar6;
        return rcb0Var;
    }

    public static tdb0 f(jo80 jo80Var, caq caqVar, caq caqVar2, r7q r7qVar, gbp gbpVar, kly0 kly0Var, caq caqVar3, caq caqVar4) {
        tdb0 tdb0Var = new tdb0();
        tdb0Var.a = jo80Var;
        tdb0Var.b = caqVar;
        tdb0Var.c = caqVar2;
        tdb0Var.d = r7qVar;
        tdb0Var.e = gbpVar;
        tdb0Var.f = kly0Var;
        tdb0Var.g = caqVar3;
        tdb0Var.h = caqVar4;
        return tdb0Var;
    }

    public static vyb0 g(gbp gbpVar, gbp gbpVar2, jo80 jo80Var, gbp gbpVar3, caq caqVar, jly0 jly0Var, caq caqVar2, gbp gbpVar4, gbp gbpVar5, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, jly0 jly0Var5, caq caqVar3, g5t g5tVar, caq caqVar4) {
        vyb0 vyb0Var = new vyb0();
        vyb0Var.a = gbpVar;
        vyb0Var.b = gbpVar2;
        vyb0Var.c = jo80Var;
        vyb0Var.d = gbpVar3;
        vyb0Var.e = caqVar;
        vyb0Var.f = jly0Var;
        vyb0Var.g = caqVar2;
        vyb0Var.h = gbpVar4;
        vyb0Var.i = gbpVar5;
        vyb0Var.j = jly0Var2;
        vyb0Var.k = jly0Var3;
        vyb0Var.l = jly0Var4;
        vyb0Var.m = jly0Var5;
        vyb0Var.n = caqVar3;
        vyb0Var.o = g5tVar;
        vyb0Var.p = caqVar4;
        return vyb0Var;
    }

    public static xyb0 h(gbp gbpVar, gbp gbpVar2, jo80 jo80Var, gbp gbpVar3, caq caqVar, r7q r7qVar, caq caqVar2, gbp gbpVar4, gbp gbpVar5, r7q r7qVar2, r7q r7qVar3, r7q r7qVar4, r7q r7qVar5, caq caqVar3, g5t g5tVar, caq caqVar4) {
        xyb0 xyb0Var = new xyb0();
        xyb0Var.a = gbpVar;
        xyb0Var.b = gbpVar2;
        xyb0Var.c = jo80Var;
        xyb0Var.d = gbpVar3;
        xyb0Var.e = caqVar;
        xyb0Var.f = r7qVar;
        xyb0Var.g = caqVar2;
        xyb0Var.h = gbpVar4;
        xyb0Var.i = gbpVar5;
        xyb0Var.j = r7qVar2;
        xyb0Var.k = r7qVar3;
        xyb0Var.l = r7qVar4;
        xyb0Var.m = r7qVar5;
        xyb0Var.n = caqVar3;
        xyb0Var.o = g5tVar;
        xyb0Var.p = caqVar4;
        return xyb0Var;
    }

    public static a2c0 i(r7q r7qVar, r7q r7qVar2, caq caqVar, caq caqVar2, kly0 kly0Var, kly0 kly0Var2) {
        a2c0 a2c0Var = new a2c0();
        a2c0Var.a = caqVar;
        a2c0Var.b = caqVar2;
        a2c0Var.c = r7qVar;
        a2c0Var.d = kly0Var;
        a2c0Var.e = kly0Var2;
        a2c0Var.f = r7qVar2;
        return a2c0Var;
    }

    public static t700 j(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 9);
    }

    public static eh50 k(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 26);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static t700 l(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 11);
    }

    public static eh50 m(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 27);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static eh50 n(ynb0 ynb0Var) {
        eh50 eh50Var = new eh50((byte) 29);
        eh50Var.b = ynb0Var;
        return eh50Var;
    }

    public static l270 o(w5b1 w5b1Var) {
        yyp0 yyp0Var = w5b1Var.d;
        c8o.m(yyp0Var);
        return yyp0Var;
    }

    public static glg p(ynb0 ynb0Var, i5w0 i5w0Var) {
        return new glg(ynb0Var, i5w0Var);
    }

    public static hlg q(dma1 dma1Var) {
        return new hlg(dma1Var);
    }

    public static uy81 r(caq caqVar, jlg jlgVar, yqg yqgVar, tif1 tif1Var, q8n q8nVar) {
        uy81 uy81Var = new uy81(new s4c0(tif1Var, jlgVar), yqgVar, caqVar, q8nVar);
        jlgVar.f.set(new an90(uy81Var, (byte) 2));
        return uy81Var;
    }

    public static r2r s(dxy dxyVar, gnq0 gnq0Var) {
        return new r2r(new gs90(dxyVar, (byte) 17), new gs90(gnq0Var, (byte) 18));
    }

    public static tlu t(slu sluVar) {
        return sluVar.create();
    }

    public static String u(zf30 zf30Var) {
        String string = zf30Var.O0().getString("entity_uri_argument_key");
        if (string != null) {
            return string;
        }
        hhg1.n("Required value was null.");
        return null;
    }

    public static iv00 v(s8q s8qVar) {
        return s8qVar.a("android-kodiak-extendedmetadataimpl", false);
    }

    public static mga0 w() {
        return w0h1.d(t5b0.P0);
    }

    public static zx60 x(xm41 xm41Var) {
        return new zx60(eth.V(xm41Var), (byte) 12);
    }

    public static mga0 y() {
        return w0h1.d(k8b0.b);
    }

    public static i8b0 z(nfa0 nfa0Var) {
        return new i8b0(nfa0Var);
    }
}
