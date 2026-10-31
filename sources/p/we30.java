package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class we30 extends i520 {
    public final i520 c;

    public we30(i520 i520Var) {
        this.c = i520Var;
    }

    @Override // p.i520
    public final c291 a(s8s0 s8s0Var) {
        return this.c.a(s8s0Var);
    }

    @Override // p.i520
    public final void c(s8s0 s8s0Var, s8s0 s8s0Var2) throws IOException {
        this.c.c(s8s0Var, s8s0Var2);
    }

    @Override // p.i520, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // p.i520
    public final void d(s8s0 s8s0Var) throws IOException {
        this.c.d(s8s0Var);
    }

    @Override // p.i520
    public final void e(s8s0 s8s0Var) {
        this.c.e(s8s0Var);
    }

    @Override // p.i520
    public final List f(s8s0 s8s0Var) {
        List listF = this.c.f(s8s0Var);
        ArrayList arrayList = new ArrayList();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add((s8s0) it.next());
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // p.i520
    public final q420 g(s8s0 s8s0Var) {
        q420 q420VarG = this.c.g(s8s0Var);
        if (q420VarG == null) {
            return null;
        }
        s8s0 s8s0Var2 = (s8s0) q420VarG.d;
        return s8s0Var2 == null ? q420VarG : new q420(q420VarG.b, q420VarG.c, s8s0Var2, (Long) q420VarG.e, (Long) q420VarG.f, (Long) q420VarG.g, (Long) q420VarG.h, (Map) q420VarG.i);
    }

    @Override // p.i520
    public final wia0 h(s8s0 s8s0Var) {
        return this.c.h(s8s0Var);
    }

    @Override // p.i520
    public final fka1 j(s8s0 s8s0Var) {
        return this.c.j(s8s0Var);
    }

    public final String toString() {
        return rc11.a.b(getClass()).r() + '(' + this.c + ')';
    }
}
