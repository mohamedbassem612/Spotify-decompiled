package p;

import android.content.Context;
import com.spotify.localfiles.settings.localfiles.impl.LocalFilesSettingsValueAccessor;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class hh61 implements jly0 {
    public static x1n0 a(xm41 xm41Var, oo70 oo70Var) {
        return new x1n0(((sam0) xm41Var).a, oo70Var, new ao41(xm41Var));
    }

    public static ku61 b(jo80 jo80Var, kly0 kly0Var, kly0 kly0Var2, jly0 jly0Var, caq caqVar, jo80 jo80Var2, kly0 kly0Var3, caq caqVar2, jly0 jly0Var2, jly0 jly0Var3, caq caqVar3, caq caqVar4, g5t g5tVar, jly0 jly0Var4, caq caqVar5, caq caqVar6, kly0 kly0Var4, jly0 jly0Var5, caq caqVar7) {
        ku61 ku61Var = new ku61();
        ku61Var.a = jo80Var;
        ku61Var.b = kly0Var;
        ku61Var.c = kly0Var2;
        ku61Var.d = jly0Var;
        ku61Var.e = caqVar;
        ku61Var.f = jo80Var2;
        ku61Var.g = kly0Var3;
        ku61Var.h = caqVar2;
        ku61Var.i = jly0Var2;
        ku61Var.j = jly0Var3;
        ku61Var.k = caqVar3;
        ku61Var.l = caqVar4;
        ku61Var.m = g5tVar;
        ku61Var.n = jly0Var4;
        ku61Var.o = caqVar5;
        ku61Var.f36p = caqVar6;
        ku61Var.q = kly0Var4;
        ku61Var.r = jly0Var5;
        ku61Var.s = caqVar7;
        return ku61Var;
    }

    public static g561 c(ynb0 ynb0Var) {
        g561 g561Var = new g561((byte) 4);
        g561Var.b = ynb0Var;
        return g561Var;
    }

    public static zg0 d(wpq wpqVar) {
        return new zg0((Context) wpqVar.b.get());
    }

    public static zxa e(wpq wpqVar) {
        return wpqVar.b();
    }

    public static bhf f(wpq wpqVar) {
        bhf bhfVar = (bhf) wpqVar.f.get();
        c8o.m(bhfVar);
        return bhfVar;
    }

    public static j810 g(wpq wpqVar) {
        j810 j810Var = (j810) wpqVar.h.get();
        c8o.m(j810Var);
        return j810Var;
    }

    public static j810 h(wpq wpqVar) {
        j810 j810Var = (j810) wpqVar.i.get();
        c8o.m(j810Var);
        return j810Var;
    }

    public static y241 i(mpq mpqVar) {
        y241 y241Var = (y241) mpqVar.b.get();
        c8o.m(y241Var);
        return y241Var;
    }

    public static i7d j(LocalFilesSettingsValueAccessor localFilesSettingsValueAccessor, ol0 ol0Var, dao daoVar, grt grtVar, b6u b6uVar, u5x u5xVar, j440 j440Var, uce0 uce0Var, tfo0 tfo0Var, yfo0 yfo0Var, bup0 bup0Var, ivw0 ivw0Var, uy11 uy11Var, h581 h581Var, g981 g981Var, r1c1 r1c1Var, qmk1 qmk1Var) {
        return new i7d(daoVar, j440Var, uce0Var, localFilesSettingsValueAccessor, yfo0Var, bup0Var, r1c1Var, u5xVar, qmk1Var, tfo0Var, grtVar, h581Var, g981Var, uy11Var, b6uVar, ivw0Var, ol0Var);
    }

    public static jf11 k(mzp mzpVar) {
        return new jf11(mzpVar, (byte) 20);
    }

    public static jf11 l(w7q w7qVar) {
        return new jf11(w7qVar, (byte) 21);
    }

    public static fo71 m(wpq wpqVar) {
        return t4c0.z(wpqVar.c());
    }

    public static s6z0 n(wpq wpqVar) {
        return new s6z0(uge0.w(wpqVar.d()), (byte) 12);
    }

    public static sam0 o(xm41 xm41Var, caq caqVar, caq caqVar2, dn41 dn41Var, tif1 tif1Var, jo20 jo20Var) {
        ym41 ym41Var = new ym41("Session");
        ym41Var.a = dn41Var;
        jge jgeVarE = hu20.e(eqr0.m(xm41Var), new ms4((lnm) null, new hf31(new gh61(tif1Var, caqVar2, caqVar, jo20Var, (byte) 0), ym41Var, (byte) 17), (byte) 9));
        AtomicInteger atomicInteger = ym41.c;
        return hwb.u("Session", jgeVarE, Collections.singleton(xm41Var), ym41Var.b, ym41Var.a);
    }

    public static kge p(mpq mpqVar) {
        Flowable flowable = ((y241) mpqVar.b.get()).a;
        vbm[] vbmVarArr = q601.a;
        return new kge(flowable);
    }

    public static Flowable q(mpq mpqVar) {
        return ((y241) mpqVar.b.get()).a;
    }

    public static nu61 r(t380 t380Var) {
        return new nu61(t380Var);
    }

    public static m771 s(wpq wpqVar) {
        return uge0.v(wpqVar.d());
    }

    public static g971 t(wpq wpqVar) {
        wpqVar.c();
        return new g971(new l7c((byte) 24), new twb((byte) 21));
    }

    public static fo71 u(wpq wpqVar) {
        zwa zwaVarC = wpqVar.c();
        wp20 wp20Var = (wp20) zwaVarC.b;
        return new fo71((zwz0) wp20Var.c, new ao71(new g971(new l7c((byte) 24), new twb((byte) 21)), (byte) 1), new ao71(zwaVarC.q(), (byte) 0), (o3q0) wp20Var.d, (g871) wp20Var.b, (u690) wp20Var.e);
    }

    public static lo71 v(wpq wpqVar) {
        hce1 hce1Var = ((ouq) wpqVar.k.get()).a;
        return new lo71(new ps7((kma) ((kly0) hce1Var.d).get(), (byte) 13), new p771((Context) ((nxo) hce1Var.b).get(), new a1g1((g420) ((nxo) hce1Var.e).get(), (byte) 0)), (q8n) ((nxo) hce1Var.c).get());
    }

    public static r35 w(wpq wpqVar) {
        fo71 fo71VarZ = t4c0.z(wpqVar.c());
        Context context = (Context) wpqVar.b.get();
        c42 c42Var = wpqVar.a;
        wpqVar.a().n();
        wpqVar.a().s();
        wpqVar.a().r();
        wpqVar.a().p();
        wpqVar.a().o();
        wpqVar.a().q();
        wpqVar.a().i();
        wpqVar.a().f();
        wpqVar.a().g();
        yx61.v((xpq) wpqVar.e.get());
        yx61.u((xpq) wpqVar.e.get());
        yx61.k((xpq) wpqVar.e.get());
        yx61.h((xpq) wpqVar.e.get());
        yx61.g((xpq) wpqVar.e.get());
        wpqVar.b();
        kly0 kly0Var = c42Var.c;
        return new r35(fo71VarZ, new vnr(context), (q8n) kly0Var.get());
    }

    public static mpq x(x03 x03Var) {
        return new mpq(x03Var);
    }
}
