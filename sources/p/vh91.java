package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vh91 implements mqw {
    public final /* synthetic */ iu30 a;

    public vh91(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        ArrayList arrayListY = ((sh91) obj).a;
        h141 h141Var = (h141) ipb1Var;
        th91 th91Var = (th91) h141Var.getState();
        boolean z = th91Var.d;
        ArrayList arrayListS = z ? tx9.s(tx9.j(th91Var), arrayListY) : tx9.x(arrayListY, tx9.j(th91Var));
        if (z) {
            arrayListY = tx9.y(arrayListY, arrayListS);
        }
        h141Var.e(tx9.k(arrayListY, arrayListS, z ? 0 : th91Var.c, false, (List) null));
        return new n381(h141Var, this.a, (byte) 15);
    }

    public final mc41 c() {
        return new hfb((byte) 25);
    }

    public final Object d(Object obj) {
        ArrayList arrayList = ((sh91) obj).a;
        return tx9.k(arrayList, tx9.x(arrayList, z6x.a), 0, false, (List) null);
    }
}
