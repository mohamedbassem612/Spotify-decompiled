package p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mnt0 implements x8c {
    public final u9c a;
    public final kf4 b;
    public final Map c;

    public mnt0(u9c u9cVar, kf4 kf4Var) {
        this.a = u9cVar;
        this.b = kf4Var;
        this.c = Collections.singletonMap(1, (Set) u9cVar.f);
    }

    public final ji50 a(ajq0 ajq0Var, ji50 ji50Var) {
        r3r vw21Var;
        LinkedHashMap linkedHashMap = ji50Var.b;
        boolean zE = this.b.e();
        ent0 ent0Var = ent0.h;
        u9c u9cVar = this.a;
        if (zE) {
            vw21Var = new r3r(u9cVar.i(ji50Var.a), fnt0.d, (vu30) null);
        } else {
            fc3 fc3Var = new fc3(u9cVar, (byte) 18);
            fnt0 fnt0Var = fnt0.e;
            vw21Var = new vw21(ent0Var, this.c, new fc3(fc3Var, (byte) 5), fnt0Var, (vu30) null);
        }
        linkedHashMap.put(emt0.class, vw21Var);
        return ji50Var;
    }
}
