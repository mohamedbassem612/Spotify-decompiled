package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rtc0 implements otc0 {
    @Override // p.otc0
    public final void a(Object obj, long j, Object obj2) {
        h290 h290VarH = (h290) dlh1.j(j, obj);
        h290 h290Var = (h290) dlh1.j(j, obj2);
        int size = h290VarH.size();
        int size2 = h290Var.size();
        if (size > 0 && size2 > 0) {
            if (!((i9) h290VarH).a) {
                h290VarH = h290VarH.h(size2 + size);
            }
            h290VarH.addAll(h290Var);
        }
        if (size > 0) {
            h290Var = h290VarH;
        }
        dlh1.q(obj, j, h290Var);
    }

    @Override // p.otc0
    public final List b(long j, Object obj) {
        h290 h290Var = (h290) dlh1.j(j, obj);
        if (((i9) h290Var).a) {
            return h290Var;
        }
        int size = h290Var.size();
        h290 h290VarH = h290Var.h(size == 0 ? 10 : size * 2);
        dlh1.q(obj, j, h290VarH);
        return h290VarH;
    }

    @Override // p.otc0
    public final void c(long j, Object obj) {
        i9 i9Var = (i9) ((h290) dlh1.j(j, obj));
        if (i9Var.a) {
            i9Var.a = false;
        }
    }
}
