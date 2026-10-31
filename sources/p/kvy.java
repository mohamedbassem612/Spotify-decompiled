package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kvy implements zqw {
    public final yzc0 a;
    public final String b;
    public final pux0 c;
    public final eb8 d;
    public final tu11 e;
    public final gvy f;
    public final ejb g;
    public final mcn1 h;
    public final ssm j;
    public final xwr i = new xwr();
    public final o3r k = w3p1.o(new l4r(pwc0.b, 2, auy.V0, new j4r(auy.Q0), auy.W0), auy.R0);

    public kvy(d0r d0rVar, yzc0 yzc0Var, String str, ogr ogrVar, pux0 pux0Var, eb8 eb8Var, tu11 tu11Var, gvy gvyVar, ejb ejbVar, mcn1 mcn1Var) {
        this.a = yzc0Var;
        this.b = str;
        this.c = pux0Var;
        this.d = eb8Var;
        this.e = tu11Var;
        this.f = gvyVar;
        this.g = ejbVar;
        this.h = mcn1Var;
        this.j = new ssm((Object) ogrVar, (Object) this, (Object) d0rVar, (byte) 29);
    }

    public final m381 c() {
        return this.i;
    }

    public final boolean d(hwq hwqVar) {
        j7e0 j7e0Var = hwqVar.g;
        if (!(j7e0Var instanceof j7e0)) {
            if (j7e0Var instanceof k7e0) {
                return false;
            }
            eg.o();
            return false;
        }
        j7e0 j7e0Var2 = j7e0Var;
        String str = j7e0Var2.b;
        mtl mtlVarA = j7e0Var2.a.q.a(mtl.class);
        Set set = s4b1.f;
        return (uic.g(str, blc0.ed) || uic.g(str, blc0.M3)) && !ob51.m(str, mtlVarA);
    }

    public final Function0 e() {
        return this.j;
    }
}
