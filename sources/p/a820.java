package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a820 {
    public static final List d = k4p1.x(new b5c0((List) null, 1));
    public mmr0 a;
    public mmr0 b;
    public boolean c;

    public final List a(String str) {
        mmr0 mmr0Var = this.a;
        z6x z6xVar = z6x.a;
        List list = (mmr0Var == null || !u890.j(mmr0Var.a, str)) ? z6xVar : (List) mmr0Var.b;
        boolean z = this.c;
        List list2 = d;
        if (z && list.isEmpty()) {
            return list2;
        }
        return (this.c || !u890.j(list, list2)) ? list : z6xVar;
    }
}
