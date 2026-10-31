package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k2i {
    public final y6a a;
    public z7a b;
    public haa0 c;

    public k2i(y6a y6aVar) {
        this.a = y6aVar;
    }

    public static void a(k2i k2iVar, int i) {
        k2iVar.c(new c8a(i), null, null, null);
    }

    public static void b(k2i k2iVar, h5a h5aVar, Integer num, o350 o350Var) {
        k2iVar.c(new b8a(h5aVar), num, o350Var, null);
    }

    public final void c(d8a d8aVar, Integer num, Function0 function0, Function0 function1) {
        x4a x4aVar = (num == null || function0 == null) ? null : new x4a(num.intValue(), function0);
        haa0 haa0Var = this.c;
        if (haa0Var == null) {
            haa0Var = new haa0(d8aVar, x4aVar, function1);
            this.c = haa0Var;
        }
        haa0Var.y(d8aVar, x4aVar, function1);
        if (this.b == null) {
            haa0 haa0Var2 = this.c;
            if (haa0Var2 != null) {
                this.b = y6a.d(this.a, new f5a(haa0Var2), true, 4);
            } else {
                u890.C("composer");
                throw null;
            }
        }
    }
}
