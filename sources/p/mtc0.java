package p;

import androidx.datastore.preferences.protobuf.e;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mtc0 extends ptc0 {
    @Override // p.ptc0
    public final void a(long j, Object obj) {
        ((i290) elh1.j(j, obj)).d();
    }

    @Override // p.ptc0
    public final void b(e eVar, Object obj, long j) {
        i290 i290VarH = (i290) elh1.j(j, eVar);
        i290 i290Var = (i290) elh1.j(j, obj);
        int size = i290VarH.size();
        int size2 = i290Var.size();
        if (size > 0 && size2 > 0) {
            if (!((j9) i290VarH).c()) {
                i290VarH = i290VarH.h(size2 + size);
            }
            i290VarH.addAll(i290Var);
        }
        if (size > 0) {
            i290Var = i290VarH;
        }
        elh1.p(eVar, j, i290Var);
    }

    @Override // p.ptc0
    public final List c(long j, Object obj) {
        j9 j9Var = (i290) elh1.j(j, obj);
        if (j9Var.c()) {
            return j9Var;
        }
        int size = j9Var.size();
        i290 i290VarH = j9Var.h(size == 0 ? 10 : size * 2);
        elh1.p(obj, j, i290VarH);
        return i290VarH;
    }
}
