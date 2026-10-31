package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rfq {
    public final /* synthetic */ thq a;

    public rfq(thq thqVar) {
        this.a = thqVar;
    }

    public static zqh a(rfq rfqVar, String str, String str2, p68 p68Var, Function0 function0, c0v0 c0v0Var, hws0 hws0Var, kpw0 kpw0Var, c0v0 c0v0Var2, int i) {
        c0v0 c0v0Var3 = (i & 16) != 0 ? null : c0v0Var;
        hws0 hws0Var2 = (i & 32) != 0 ? null : hws0Var;
        kpw0 kpw0Var2 = (i & 64) != 0 ? null : kpw0Var;
        c0v0 c0v0Var4 = (i & 128) != 0 ? null : c0v0Var2;
        teq teqVar = rfqVar.a.c;
        lan1 lan1Var = new lan1((i8h1) teqVar.a.a.A5.get(), (byte) 25);
        ziq ziqVar = teqVar.a;
        zsu0 zsu0Var = new zsu0((i8h1) ziqVar.a.A5.get(), (byte) 0);
        teq teqVar2 = ziqVar.b;
        teq teqVar3 = ziqVar.b;
        return new zqh(lan1Var, zsu0Var, new yfx(((xfx) teqVar2.q1.get()).e, (byte) 1), new t4d1((Object) new zfx(((xfx) teqVar3.q1.get()).c, (byte) 9), (byte) 18), new jkp0(new zfx(((xfx) teqVar3.q1.get()).c, (byte) 11), (byte) 17), new ofx(((xfx) teqVar3.q1.get()).a, (byte) 6), new ofx(((xfx) teqVar3.q1.get()).a, (byte) 1), str, str2, p68Var, function0, c0v0Var3, hws0Var2, kpw0Var2, c0v0Var4);
    }
}
