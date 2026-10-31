package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fiu implements eiu {
    public final op0 a;
    public final aiu b;
    public final gw70 c;
    public final i01 d;
    public final i44 e;
    public final tiu f;
    public final e7m0 g;
    public final ia00 h;
    public final psw i;

    public fiu(f5q f5qVar, g5q g5qVar, op0 op0Var, aiu aiuVar, gw70 gw70Var, ao0 ao0Var, i01 i01Var, i44 i44Var) {
        tiu tiuVar;
        shu shuVar;
        this.a = op0Var;
        this.b = aiuVar;
        this.c = gw70Var;
        this.d = i01Var;
        this.e = i44Var;
        int i = aiuVar.c;
        boolean z = aiuVar.d;
        switch (f5qVar.a) {
            case 0:
                tiuVar = new tiu(i, z, (i44) f5qVar.b.c.h5.get());
                break;
            default:
                tiuVar = new tiu(i, z, (i44) f5qVar.b.d.v7.get());
                break;
        }
        tiu tiuVar2 = tiuVar;
        this.f = tiuVar2;
        zlt zltVar = zlt.d1;
        dq7 dq7Var = new dq7(tiuVar2, (byte) 7);
        zhu zhuVar = aiuVar.a;
        switch (g5qVar.a) {
            case 0:
                thq thqVar = g5qVar.b;
                daq daqVar = thqVar.b;
                q8n q8nVar = (q8n) daqVar.V2.get();
                v5q v5qVar = thqVar.c;
                shuVar = new shu(zhuVar, i01Var, q8nVar, (pxc) v5qVar.f5.get(), (ao0) daqVar.Hk.get(), daqVar.a.a(), (t2j0) daqVar.f2.get(), (i44) v5qVar.h5.get(), new bju((zle1) v5qVar.b.a3.get(), false));
                break;
            default:
                r7q r7qVar = g5qVar.b;
                daq daqVar2 = r7qVar.b;
                q8n q8nVar2 = (q8n) daqVar2.V2.get();
                teq teqVar = r7qVar.d;
                shuVar = new shu(zhuVar, i01Var, q8nVar2, (pxc) teqVar.t7.get(), (ao0) daqVar2.Hk.get(), daqVar2.a.a(), (t2j0) daqVar2.f2.get(), (i44) teqVar.v7.get(), new bju((zle1) teqVar.d.a3.get(), false));
                break;
        }
        this.g = sbl.A(zltVar, dq7Var, shuVar, new z6n(2, tiuVar2, tiu.class, "onProps", "onProps(Lcom/spotify/adsdisplay/element/display/DisplayAdElement$Props;Lcom/spotify/adsdisplay/elementimpl/display/mobius/domain/DisplayAdState;)Lcom/spotify/mobius/Next;", 0, (byte) 21), new wrs(this, ao0Var, (byte) 15));
        xr6 xr6Var = siu.a;
        int iC = l1d.C(i);
        this.h = iC != 1 ? iC != 2 ? xr6Var.a(v0t.e1, riu.b) : xr6Var.a(riu.e, riu.f) : xr6Var.a(riu.c, riu.d);
        j2i j2iVar = new j2i(252326179, new ent(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
