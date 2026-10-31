package p;

import com.google.crypto.tink.shaded.protobuf.e;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ltc0 extends ntc0 {
    @Override // p.ntc0
    public final void a(long j, Object obj) {
        ((h9) ((g290) clh1.j(j, obj))).a = false;
    }

    @Override // p.ntc0
    public final void b(e eVar, Object obj, long j) {
        g290 g290VarH = (g290) clh1.j(j, eVar);
        g290 g290Var = (g290) clh1.j(j, obj);
        int size = g290VarH.size();
        int size2 = g290Var.size();
        if (size > 0 && size2 > 0) {
            if (!((h9) g290VarH).a) {
                g290VarH = g290VarH.h(size2 + size);
            }
            g290VarH.addAll(g290Var);
        }
        if (size > 0) {
            g290Var = g290VarH;
        }
        clh1.p(eVar, j, g290Var);
    }

    @Override // p.ntc0
    public final List c(long j, Object obj) {
        g290 g290Var = (g290) clh1.j(j, obj);
        if (((h9) g290Var).a) {
            return g290Var;
        }
        int size = g290Var.size();
        g290 g290VarH = g290Var.h(size == 0 ? 10 : size * 2);
        clh1.p(obj, j, g290VarH);
        return g290VarH;
    }
}
