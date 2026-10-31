package p;

import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xv61 {
    public final ren0 a;
    public final q8n b;
    public final kly0 c;
    public final ConcurrentMap d;
    public llm e;

    public xv61(mr20 mr20Var, ren0 ren0Var, q8n q8nVar, caq caqVar) {
        this.a = ren0Var;
        this.b = q8nVar;
        this.c = caqVar;
        zf50 zf50Var = new zf50();
        rog0 rog0Var = (rog0) zf50Var.f;
        dm5.A(rog0Var == null, "Value strength was already set to %s", rog0Var);
        zf50Var.f = rog0.b;
        zf50Var.b = true;
        this.d = zf50Var.d();
        this.e = us71.h(q8nVar);
        l4p1.u(smo1.e(flo1.l(guo1.B(), q8nVar)), new fu20(z4p1.v(rqt0.u(new tu41(mr20Var, (byte) 11)), 1), new kdt0(this, (lnm) null, (byte) 21), (byte) 1));
    }

    public final uv61 a(tka0 tka0Var, Object obj) {
        vv61 vv61Var = new vv61(tka0Var, obj);
        ConcurrentMap concurrentMap = this.d;
        Object obj2 = concurrentMap.get(vv61Var);
        if (obj2 == null) {
            Object obj3 = this.a.get(tka0Var);
            if (obj3 == null) {
                bhn0.k("Could not retrieve accessor ", tka0Var, ". Please register it in SettingsValueAccessorsModule.");
                return null;
            }
            Function0 function0 = (Function0) obj3;
            w0h1.o(0, function0);
            uv61 uv61Var = new uv61(((nv61) function0.invoke()).a(obj), this.c, new qv61(this.e, (byte) 2));
            Object objPutIfAbsent = concurrentMap.putIfAbsent(vv61Var, uv61Var);
            obj2 = objPutIfAbsent == null ? uv61Var : objPutIfAbsent;
        }
        return (uv61) obj2;
    }
}
