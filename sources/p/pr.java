package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class pr implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cs b;
    public final /* synthetic */ lw c;

    public /* synthetic */ pr(byte b, cs csVar, lw lwVar) {
        this.a = b;
        this.b = csVar;
        this.c = lwVar;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        j5 j5Var = j5.a;
        lw lwVar = this.c;
        cs csVar = this.b;
        switch (b) {
            case 0:
                if (((th61) obj).b) {
                    return csVar.p(lwVar);
                }
                Single singleJust = Single.just(spq0.d(lwVar));
                singleJust.getClass();
                return singleJust;
            case 1:
                ii8 ii8Var = (ji8) obj;
                if (ii8Var.equals(ei8.a)) {
                    csVar.j.f(lwVar.a.a);
                    return j5Var;
                }
                if (ii8Var instanceof fi8) {
                    return spq0.d(lwVar.a);
                }
                if (ii8Var instanceof gi8) {
                    return spq0.d(lwVar.a);
                }
                if (ii8Var instanceof ii8) {
                    return spq0.d(ii8Var.a);
                }
                eg.o();
                return null;
            default:
                spq0 spq0Var = (spq0) obj;
                spq0Var.getClass();
                Long l = lwVar.f;
                boolean z = l == null || csVar.c.b() - l.longValue() > 28800000;
                if (!spq0Var.c()) {
                    Single singleJust2 = Single.just(j5Var);
                    singleJust2.getClass();
                    return singleJust2;
                }
                di8 di8Var = (di8) spq0Var.b();
                if (!z) {
                    Single singleJust3 = Single.just(new i5w0(lw.a(lwVar, di8Var, null, 126)));
                    singleJust3.getClass();
                    return singleJust3;
                }
                fo70 fo70Var = csVar.b;
                wd wdVar = di8Var.b;
                Single singleOnErrorReturn = fo70Var.a((wdVar != null ? wdVar.a : null) + " " + (wdVar != null ? wdVar.b : null), di8Var.a).map(new or(csVar, lwVar, di8Var, (byte) 1)).onErrorReturn(new tr(lwVar, (byte) 1));
                singleOnErrorReturn.getClass();
                return singleOnErrorReturn;
        }
    }
}
