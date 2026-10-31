package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mg11 extends hab0 implements iu30 {
    public final /* synthetic */ ecd1 N0;
    public final /* synthetic */ o921 O0;
    public final /* synthetic */ fx X;
    public final /* synthetic */ gw3 Y;
    public final /* synthetic */ br0 Z;
    public final /* synthetic */ hh11 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;
    public final /* synthetic */ lb9 f;
    public final /* synthetic */ ti51 g;
    public final /* synthetic */ tr00 h;
    public final /* synthetic */ sve i;
    public final /* synthetic */ kjn0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg11(hh11 hh11Var, boolean z, boolean z2, boolean z3, long j, lb9 lb9Var, ti51 ti51Var, tr00 tr00Var, sve sveVar, kjn0 kjn0Var, fx fxVar, gw3 gw3Var, br0 br0Var, ecd1 ecd1Var, o921 o921Var) {
        super(1);
        this.a = hh11Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = j;
        this.f = lb9Var;
        this.g = ti51Var;
        this.h = tr00Var;
        this.i = sveVar;
        this.t = kjn0Var;
        this.X = fxVar;
        this.Y = gw3Var;
        this.Z = br0Var;
        this.N0 = ecd1Var;
        this.O0 = o921Var;
    }

    public final Object invoke(Object obj) {
        rtb0 rtb0Var = (rtb0) obj;
        long j = this.e;
        lb9 lb9Var = this.f;
        hh11 hh11Var = this.a;
        rtb0.c(rtb0Var, "avatarRowElement", new j2i(1907863891, new no9(j, lb9Var, hh11Var, (byte) 6), true), 2);
        boolean z = hh11Var.f;
        ti51 ti51Var = this.g;
        if (z) {
            rtb0.c(rtb0Var, "playbackSectionHeader", new j2i(1103325336, new w9g0(ti51Var, (byte) 7), true), 2);
            rtb0.c(rtb0Var, "explicitContentToggleRowElement", new j2i(319233857, new hov0(this.h, hh11Var, (byte) 20), true), 2);
            if (hh11Var.l && this.b) {
                rtb0.c(rtb0Var, "videoSettingsRowElement", new j2i(1568312733, new hov0(this.i, hh11Var, (byte) 21), true), 2);
            }
            rtb0.c(rtb0Var, "playbackSectionDivider", rcj.b, 2);
        }
        rtb0.c(rtb0Var, "accountSectionHeader", new j2i(-1452869828, new w9g0(ti51Var, (byte) 8), true), 2);
        rtb0.c(rtb0Var, "nameRowElement", new j2i(110227227, new hov0(this.t, hh11Var, (byte) 22), true), 2);
        rtb0.c(rtb0Var, "accountTypeRowElement", new j2i(1673324282, new hov0(this.X, hh11Var, (byte) 23), true), 2);
        if (this.c && !hh11Var.k.isEmpty()) {
            rtb0.c(rtb0Var, "allocationsRowElement", new j2i(-1520307903, new hov0(this.Y, hh11Var, (byte) 24), true), 2);
        }
        if (this.d && hh11Var.i && hh11Var.j.length() > 0) {
            rtb0.c(rtb0Var, "audiobooksTopUpRowElement", new j2i(42789152, new hov0(this.Z, hh11Var, (byte) 25), true), 2);
        }
        if (hh11Var.h) {
            rtb0.c(rtb0Var, "transitionRowElement", new j2i(1605886207, new hov0(this.N0, hh11Var, (byte) 18), true), 2);
        }
        rtb0.c(rtb0Var, "accountSectionDivider", rcj.c, 2);
        rtb0.c(rtb0Var, "removeAccountRowElement", new j2i(504551096, new hov0(this.O0, hh11Var, (byte) 19), true), 2);
        return rih1.a;
    }
}
