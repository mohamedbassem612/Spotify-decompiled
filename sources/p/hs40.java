package p;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class hs40 extends aqi0 {
    public static final /* synthetic */ mma0[] d = {new cey0(hs40.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0)};
    public final y5 b;
    public final toe0 c;

    public hs40(s1c1 s1c1Var, y5 y5Var) {
        this.b = y5Var;
        this.c = new toe0((voe0) s1c1Var, new x5u(this, (byte) 8));
    }

    @Override // p.aqi0, p.zpi0
    public final Collection a(ajn0 ajn0Var, int i) {
        z6x z6xVar;
        mma0 mma0Var = d[0];
        List list = (List) this.c.invoke();
        if (list.isEmpty()) {
            z6xVar = z6x.a;
        } else {
            z6x zh91Var = new zh91();
            for (Object obj : list) {
                if ((obj instanceof tdy0) && u890.j(((tdy0) obj).getName(), ajn0Var)) {
                    zh91Var.add(obj);
                }
            }
            z6xVar = zh91Var;
        }
        return (Collection) z6xVar;
    }

    @Override // p.aqi0, p.zpi0
    public final Collection c(ajn0 ajn0Var, int i) {
        z6x z6xVar;
        mma0 mma0Var = d[0];
        List list = (List) this.c.invoke();
        if (list.isEmpty()) {
            z6xVar = z6x.a;
        } else {
            z6x zh91Var = new zh91();
            for (Object obj : list) {
                if ((obj instanceof xw81) && u890.j(((xw81) obj).getName(), ajn0Var)) {
                    zh91Var.add(obj);
                }
            }
            z6xVar = zh91Var;
        }
        return (Collection) z6xVar;
    }

    @Override // p.aqi0, p.zpi0
    public final Collection d(wgt wgtVar, iu30 iu30Var) {
        if (!wgtVar.a(wgt.n.b)) {
            return z6x.a;
        }
        mma0 mma0Var = d[0];
        return (List) this.c.invoke();
    }

    public List h() {
        ajn0 ajn0Var = crg.e;
        c9c c9cVar = mka1.m0;
        y5 y5Var = this.b;
        xw81 xw81VarH1 = xw81.H1(y5Var, ajn0Var, 1, c9cVar);
        rob0 rob0VarQ0 = y5Var.q0();
        qx81 qx81VarF = kht.e(y5Var).f();
        lht lhtVar = mht.c;
        z6x z6xVar = z6x.a;
        xw81VarH1.B1(null, rob0VarQ0, z6xVar, z6xVar, z6xVar, qx81VarF, 3, lhtVar);
        return Collections.singletonList(xw81VarH1);
    }
}
