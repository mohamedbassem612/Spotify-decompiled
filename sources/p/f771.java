package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f771 {
    public final vhc a;
    public final dv00 b;
    public final o3r c = w3p1.o(new l4r(new xv00(rc11.a.b(vn71.class)), 1, s571.i, new j4r(fft0.b1), s571.t), s571.h);

    public f771(vhc vhcVar, dv00 dv00Var) {
        this.a = vhcVar;
        this.b = dv00Var;
    }

    public static boolean b(yyq yyqVar) {
        if (yyqVar instanceof wyq) {
            return ((wyq) yyqVar).b instanceof c3r;
        }
        if (!(yyqVar instanceof uyq)) {
            return false;
        }
        List list = ((uyq) yyqVar).a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (b((yyq) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        e771 e771Var;
        if (onmVar instanceof e771) {
            e771Var = (e771) onmVar;
            int i = e771Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e771Var.c = i - Integer.MIN_VALUE;
            } else {
                e771Var = new e771(this, onmVar);
            }
        } else {
            e771Var = new e771(this, onmVar);
        }
        Object objJ = e771Var.a;
        int i2 = e771Var.c;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objJ);
            Set set = s4b1.f;
            int iOrdinal = uic.x(str).c.ordinal();
            if (iOrdinal != 844 && iOrdinal != 860) {
                return yah0.m(true);
            }
            j3r j3rVar = rzq.y;
            ay8 ay8VarF = d3p1.F(l2p1.f(this.b), this.c, str);
            ck01 ck01Var = new ck01((byte) 16);
            e771Var.c = 1;
            objJ = b5p1.j(ay8VarF, ck01Var, e771Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        k1r k1rVar = (k1r) objJ;
        if (!(k1rVar instanceof i1r) && (k1rVar instanceof h1r) && b(((h1r) k1rVar).a)) {
            z = false;
        }
        return yah0.m(z);
    }
}
