package p;

import com.spotify.localfiles.settings.localfiles.api.LocalFilesLibrarySettingsItemFactory;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x16 implements yr61 {
    public final dg8 a;
    public final rzo0 b;
    public final lag c;
    public final fna d;
    public final t7o0 e;

    public x16(dg8 dg8Var, rzo0 rzo0Var, lag lagVar, fna fnaVar, t7o0 t7o0Var) {
        this.a = dg8Var;
        this.b = rzo0Var;
        this.c = lagVar;
        this.d = fnaVar;
        this.e = t7o0Var;
    }

    @Override // p.yr61
    public final xr61 create() {
        pmx pmxVar = pmx.c;
        jx21 jx21Var = new jx21(2131962095);
        pnx pnxVar = pnx.c;
        r0s0 r0s0Var = (r0s0) this.d.b;
        uqo uqoVar = new uqo(2131962144, null, null, null, 30);
        jf4 jf4Var = ((u9b) r0s0Var.d).a;
        huz huzVar = new huz(Boolean.valueOf(jf4Var.v() && jf4Var.o()), (byte) 10);
        c0g.x.getClass();
        cxo1 cxo1Var = cxo1.P0;
        xt61 xt61Var = new xt61(pnxVar, 2131962144, 2131962143, null, mqo1.s(new sq61[]{new vqo("personalApps", uqoVar, huzVar, cxo1Var, (kly0) r0s0Var.b, new qqo(egs0.Z, new i2p0(r0s0Var, (lnm) null, (byte) 19)))}), 233);
        lag lagVar = this.c;
        g23 g23Var = (g23) lagVar.c;
        xgb xgbVar = (xgb) g23Var.d;
        g23 g23Var2 = (g23) g23Var.b;
        vqo vqoVarC = xgb.c(xgbVar, g23Var2, "alexa", 2, 2131961730, 2131961729, 2131233492, g23Var2.k(), 64);
        vqo vqoVarA = xgbVar.a((u961) g23Var.c, "alexaDefaultService", 1, 2131961728, 2131961726, 2131233492, new h2s0(2131961865, 5), g23Var2.k());
        vx40 vx40Var = (vx40) lagVar.e;
        vqo vqoVarC2 = xgb.c((xgb) vx40Var.c, (y250) vx40Var.b, "googleMaps", 3, 2131961860, 2131961859, 2131233493, null, 192);
        qpj1 qpj1Var = (qpj1) lagVar.b;
        vqo vqoVarC3 = xgb.c((xgb) qpj1Var.c, (y250) qpj1Var.b, "waze", 5, 2131962076, 2131962075, 2131233495, null, 192);
        m021 m021Var = (m021) lagVar.d;
        t1s0 t1s0Var = (p68) m021Var.b;
        xt61 xt61Var2 = new xt61(pnxVar, 2131962146, 2131962145, null, mqo1.s(new sq61[]{vqoVarC, vqoVarA, vqoVarC2, vqoVarC3, ((xgb) m021Var.c).a(t1s0Var, "samsung", 4, 2131961991, 2131961990, 2131233494, new h2s0(2131961988, 1), t1s0Var.k()), new jgb1("manageApps", 2131961882, null, null, null, null, null, null, cxo1Var, null, new qxn0(new jxn0(40, false), new oxn0("https://www.spotify.com/account/apps/", true)), null, 90106)}), 233);
        dox doxVar = dox.c;
        v6a0 v6a0Var = (v6a0) this.e.b;
        xt61 xt61Var3 = new xt61(doxVar, 2131962142, null, null, mqo1.s(new sq61[]{new jgb1("library_import", 2131961874, null, 2131961873, null, null, null, new huz(Boolean.valueOf(((ql4) v6a0Var.b).a()), (byte) 10), cxo1Var, null, new qxn0(new jxn0(34, false), new mxn0(false, new sg0(1, (lnm) null, (byte) 15), new td1(v6a0Var, (lnm) null, (byte) 5))), null, 85946)}), 249);
        jmx jmxVar = jmx.c;
        rzo0 rzo0Var = this.b;
        vun vunVar = (vun) rzo0Var.d;
        pbo1 pbo1Var = pbo1.N0;
        jgb1 jgb1Var = new jgb1("connectInBackground", 2131962025, null, 2131962024, null, null, null, null, pbo1Var, null, new ibd1(new xad1(13, false), new fbd1(new dor(vunVar, (byte) 0), new mgl(vunVar, (byte) 25))), null, 90042);
        ogr ogrVar = (ogr) rzo0Var.b;
        xt61 xt61Var4 = new xt61(jmxVar, 2131962163, null, null, mqo1.s(new sq61[]{jgb1Var, new jgb1("showLocalDevicesOnly", 2131962003, null, 2131962002, null, null, null, null, pbo1Var, null, new ibd1(new xad1(45, false), new fbd1(new dor(ogrVar, (byte) 14), new b1s(ogrVar, (byte) 2))), null, 90042), ((LocalFilesLibrarySettingsItemFactory) rzo0Var.c).create()}), 249);
        fmx fmxVar = fmx.c;
        yeu0 yeu0Var = (yeu0) this.a.b;
        return new xr61((hux) pmxVar, jx21Var, p7h.M(new xt61[]{xt61Var, xt61Var2, xt61Var3, xt61Var4, new xt61(fmxVar, 2131962157, 2131962156, null, mqo1.s(new sq61[]{new jgb1("preventScreenLockInCar", 2131961944, null, 2131961943, null, null, null, new huz(Boolean.valueOf(((w84) ((erd) yeu0Var.b).a.get()).a()), (byte) 10), pbo1Var, null, new ibd1(new xad1(38, false), new gbd1(yoi1.g(((zgz0) yeu0Var.c).f()), new dvt0(yeu0Var, (byte) 14))), null, 85946)}), 233)}), (List) null, 20);
    }
}
