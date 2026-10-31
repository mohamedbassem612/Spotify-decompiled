package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class rr implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cs b;

    public /* synthetic */ rr(cs csVar, byte b) {
        this.a = b;
        this.b = csVar;
    }

    public final Object apply(Object obj) {
        lw lwVar;
        byte b = this.a;
        cs csVar = this.b;
        switch (b) {
            case 0:
                zv zvVar = (bw) obj;
                if (zvVar instanceof zv) {
                    if (zvVar.b.a.a()) {
                        return Single.just(Boolean.FALSE);
                    }
                    csVar.l();
                    return Single.just(Boolean.TRUE);
                }
                if (zvVar instanceof aw) {
                    return Single.just(Boolean.TRUE);
                }
                eg.o();
                return null;
            case 1:
                li8 li8Var = (mi8) obj;
                if (!(li8Var instanceof li8)) {
                    Single singleJust = Single.just(k941.a);
                    singleJust.getClass();
                    return singleJust;
                }
                di8 di8Var = li8Var.a;
                String str = di8Var.a;
                lw lwVarO = csVar.o(str);
                byte b2 = 2;
                if ((lwVarO != null ? lwVarO.c : null) == null) {
                    if (lwVarO == null) {
                        lwVarO = new lw(di8Var, null, null, null, null, 126);
                    }
                    Single map = csVar.p(lwVarO).map(new tr((byte) 2, csVar, lwVarO));
                    map.getClass();
                    return map;
                }
                lw lwVarO2 = csVar.o(str);
                long jB = csVar.c.b();
                if (lwVarO2 != null) {
                    wd wdVar = di8Var.b;
                    if (wdVar == null) {
                        wdVar = lwVarO2.a.b;
                    }
                    lwVar = lw.a(lwVarO2, di8.a(di8Var, wdVar), Long.valueOf(jB), 62);
                } else {
                    lwVar = new lw(di8Var, null, null, null, Long.valueOf(jB), 56);
                }
                Single singleFlatMap = Single.just(csVar.q(lwVar)).flatMap(new mr(csVar, li8Var, b2));
                singleFlatMap.getClass();
                return singleFlatMap;
            default:
                return csVar.e.firstOrError().flatMap(new sr(yg8.t));
        }
    }
}
