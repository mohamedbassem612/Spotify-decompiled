package p;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t5k1 extends hab0 implements iu30 {
    public final /* synthetic */ o0g1 N0;
    public final /* synthetic */ vr51 O0;
    public final /* synthetic */ Context P0;
    public final /* synthetic */ xid X;
    public final /* synthetic */ ol71 Y;
    public final /* synthetic */ gqg Z;
    public final /* synthetic */ zog a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ q8n d;
    public final /* synthetic */ zrj1 e;
    public final /* synthetic */ Set f;
    public final /* synthetic */ wh71 g;
    public final /* synthetic */ ptf1 h;
    public final /* synthetic */ vi11 i;
    public final /* synthetic */ dc31 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5k1(zog zogVar, long j, boolean z, q8n q8nVar, zrj1 zrj1Var, Set set, wh71 wh71Var, ptf1 ptf1Var, vi11 vi11Var, dc31 dc31Var, xid xidVar, ol71 ol71Var, gqg gqgVar, o0g1 o0g1Var, vr51 vr51Var, Context context) {
        super(1);
        this.a = zogVar;
        this.b = j;
        this.c = z;
        this.d = q8nVar;
        this.e = zrj1Var;
        this.f = set;
        this.g = wh71Var;
        this.h = ptf1Var;
        this.i = vi11Var;
        this.t = dc31Var;
        this.X = xidVar;
        this.Y = ol71Var;
        this.Z = gqgVar;
        this.N0 = o0g1Var;
        this.O0 = vr51Var;
        this.P0 = context;
    }

    public final Object invoke(Object obj) {
        oud oudVar = (oud) obj;
        boolean z = this.c;
        zog zogVar = this.a;
        long j = this.b;
        v5k1 v5k1Var = new v5k1(zogVar, j, z);
        d18 d18Var = new d18(this.e, j, this.f);
        wh71 wh71Var = this.g;
        fey feyVar = new fey(wh71Var, (byte) 10);
        dxy dxyVar = new dxy(this.h, this.i, oudVar, this.t, this.X, this.Y, (byte) 8);
        ezb1 ezb1Var = new ezb1(oudVar, (byte) 16);
        g3x g3xVar = new g3x(oudVar);
        aru0 aru0Var = new aru0(wh71Var, this.Z, this.N0, (byte) 28);
        n4b n4bVar = new n4b(wh71Var, (byte) 5);
        q8n q8nVar = this.d;
        return new u7p0(v5k1Var, new uq7(oudVar, q8nVar, new s4k1(d18Var, feyVar, dxyVar, ezb1Var, g3xVar, oudVar, aru0Var, n4bVar, q8nVar), this.O0, this.P0));
    }
}
