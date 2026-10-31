package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hn50 implements xpw {
    public final idd1 X;
    public final u7h1 Y;
    public final psw Z;
    public final ic9 a;
    public final List b;
    public final String c;
    public final String d;
    public final add e;
    public final String f;
    public final q8n g;
    public final jn50 h;
    public final q8n i;
    public final e7m0 t;

    public hn50(ic9 ic9Var, List list, String str, String str2, wq9 wq9Var, add addVar, chq chqVar, String str3, q8n q8nVar, jn50 jn50Var, q8n q8nVar2, gp0 gp0Var) {
        this.a = ic9Var;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = addVar;
        this.f = str3;
        this.g = q8nVar;
        this.h = jn50Var;
        this.i = q8nVar2;
        cn50 cn50Var = new cn50(dn50.a, 0, 0, false);
        dq7 dq7Var = new dq7(this, (byte) 10);
        thq thqVar = chqVar.a;
        teq teqVar = thqVar.c;
        bfd bfdVar = (bfd) teqVar.O1.get();
        ynb0 ynb0VarA = xqu.a(teqVar.i);
        daq daqVar = thqVar.b;
        this.t = sbl.B(cn50Var, dq7Var, new pm50(bfdVar, ynb0VarA, (add) daqVar.Ge.get(), wq9Var, (q8n) daqVar.V2.get(), teqVar.c, (q8n) daqVar.r2.get(), gp0Var), bp30.c1, new zi50(this, (byte) 1));
        this.X = new idd1(new en50(this, (byte) 2));
        this.Y = new u7h1(new jb50(this, (byte) 4), new gn50(this, (byte) 0));
        j2i j2iVar = new j2i(174694886, new zq30(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.Z = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.Y;
    }

    public final jsw c() {
        return this.Z;
    }

    public final uvk0 e() {
        return (uvk0) this.X.getValue();
    }

    public final mqw getBehavior() {
        return this.t;
    }
}
