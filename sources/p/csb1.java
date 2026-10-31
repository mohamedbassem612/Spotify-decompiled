package p;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class csb1 extends aqi0 {
    public static final /* synthetic */ mma0[] f = {new cey0(csb1.class, "functions", "getFunctions()Ljava/util/List;", 0), new cey0(csb1.class, "properties", "getProperties()Ljava/util/List;", 0)};
    public final wht b;
    public final boolean c;
    public final toe0 d;
    public final toe0 e;

    public csb1(s1c1 s1c1Var, wht whtVar, boolean z) {
        this.b = whtVar;
        this.c = z;
        voe0 voe0Var = (voe0) s1c1Var;
        this.d = new toe0(voe0Var, new bsb1(this, (byte) 0));
        this.e = new toe0(voe0Var, new bsb1(this, (byte) 1));
    }

    @Override // p.aqi0, p.zpi0
    public final Collection a(ajn0 ajn0Var, int i) {
        mma0 mma0Var = f[1];
        List list = (List) this.e.invoke();
        zh91 zh91Var = new zh91();
        for (Object obj : list) {
            if (u890.j(((tdy0) obj).getName(), ajn0Var)) {
                zh91Var.add(obj);
            }
        }
        return zh91Var;
    }

    @Override // p.aqi0, p.zpi0
    public final Collection c(ajn0 ajn0Var, int i) {
        mma0 mma0Var = f[0];
        List list = (List) this.d.invoke();
        zh91 zh91Var = new zh91();
        for (Object obj : list) {
            if (u890.j(((xw81) obj).getName(), ajn0Var)) {
                zh91Var.add(obj);
            }
        }
        return zh91Var;
    }

    @Override // p.aqi0, p.zpi0
    public final Collection d(wgt wgtVar, iu30 iu30Var) {
        mma0[] mma0VarArr = f;
        mma0 mma0Var = mma0VarArr[0];
        List list = (List) this.d.invoke();
        mma0 mma0Var2 = mma0VarArr[1];
        return o7h.N0((List) this.e.invoke(), list);
    }

    @Override // p.aqi0, p.zpi0
    public final /* bridge */ /* synthetic */ jfg g(ajn0 ajn0Var, int i) {
        return null;
    }
}
