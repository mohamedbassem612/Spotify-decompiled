package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eve0 implements ieh {
    @Override // p.ieh
    public final void b(qs31 qs31Var, qy8 qy8Var) {
        qy8Var.a.description();
    }

    @Override // p.ieh
    public final void c(qs31 qs31Var, List list) {
        StringBuilder sb = new StringBuilder(200);
        sb.append("Too many routes found in intent-router for input: ");
        sb.append(qs31Var);
        sb.append('\n');
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qy8 qy8Var = (qy8) it.next();
            sb.append("    Matched by: ");
            sb.append(qy8Var.a.description());
            sb.append(", Command: ");
            sb.append((String) qy8Var.b.d);
            sb.append('\n');
        }
        n57.e(sb.toString());
    }

    @Override // p.ieh
    public final void a(qs31 qs31Var) {
    }
}
