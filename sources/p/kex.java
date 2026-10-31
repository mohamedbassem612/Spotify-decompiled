package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kex {
    public final ArrayList a = new ArrayList();

    public final void a(Object obj, j2i j2iVar) {
        this.a.add(new n3g(obj, j2iVar));
    }

    public final void b(int i, j2i j2iVar, iu30 iu30Var) {
        for (int i2 = 0; i2 < i; i2++) {
            this.a.add(new n3g(iu30Var.invoke(Integer.valueOf(i2)), new j2i(-1863941724, new bf6((byte) 4, i2, j2iVar, false), true)));
        }
    }
}
