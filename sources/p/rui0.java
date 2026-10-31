package p;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rui0 implements wpw {
    public static final Set g = l1d.u(xti0.class);
    public final zob1 a;
    public final rt01 c;
    public final kdn0 b = new kdn0();
    public final js20 d = w0o1.i(new qui0(this, (byte) 0), new t590(2, this, rui0.class, "stateMapper", "stateMapper(Lcom/spotify/creator/elements/merchgrid/MerchGridElement$Props;Lcom/spotify/listcontentruntime/metadataapi/MetadataValues;)Lcom/spotify/creator/elements/merchgrid/MerchGridElement$State;", 0, (byte) 2), (ju70) null, 12);
    public final ia00 e = n3o1.q(this).a(fri0.h, fri0.i);
    public final nsw f = jch0.j(new pah0(this, (byte) 7));

    public rui0(lzn0 lzn0Var, xfx xfxVar, zob1 zob1Var) {
        this.a = zob1Var;
        this.c = new rt01(lzn0Var, xfxVar, (byte) 16);
    }

    public static final pui0 e(rui0 rui0Var, oui0 oui0Var, ioj0 ioj0Var) {
        rui0Var.getClass();
        hoj0 hoj0VarC = ioj0Var.c(xti0.class, oui0Var.a);
        if (hoj0VarC == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        goj0 goj0VarA = hoj0VarC.a();
        goj0VarA.getClass();
        ArrayList<vui0> arrayList = ((ez00) goj0VarA.a).a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (vui0 vui0Var : arrayList) {
            arrayList2.add(new aui0(vui0Var.b, vui0Var.d, vui0Var.e, vui0Var.c));
        }
        return new pui0(arrayList2);
    }

    public final rqw a() {
        return this.e;
    }

    public final rsw c() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
