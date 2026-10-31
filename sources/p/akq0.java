package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class akq0 extends klq0 {
    public static final akq0 c = new akq0(0, 2, 1);

    public final void a(a9a a9aVar, j06 j06Var, hf91 hf91Var, h72 h72Var, llq0 llq0Var) {
        int i = ((vr80) a9aVar.m(0)).a;
        List list = (List) a9aVar.m(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            j06Var.g(i3, obj);
            j06Var.e(i3, obj);
        }
    }
}
