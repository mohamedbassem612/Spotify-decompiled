package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uef1 implements tyq {
    public final js20 N0;
    public final ia00 O0;
    public final psw P0;
    public final idd1 X = new idd1(new tef1(this, (byte) 1));
    public final idd1 Y = new idd1(new tef1(this, (byte) 0));
    public final f4r Z;
    public final gw70 a;
    public final lo60 b;
    public final myq0 c;
    public final lwp d;
    public final mr20 e;
    public final yqg f;
    public final d0r g;
    public final wh1 h;
    public final idd1 i;
    public final boolean t;

    public uef1(gw70 gw70Var, lo60 lo60Var, myq0 myq0Var, lwp lwpVar, mr20 mr20Var, yqg yqgVar, d0r d0rVar, wh1 wh1Var, idd1 idd1Var, boolean z) {
        this.a = gw70Var;
        this.b = lo60Var;
        this.c = myq0Var;
        this.d = lwpVar;
        this.e = mr20Var;
        this.f = yqgVar;
        this.g = d0rVar;
        this.h = wh1Var;
        this.i = idd1Var;
        this.t = z;
        byte b = 1;
        byte b2 = 0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h4r(udf1.e, vdf1.a));
        this.Z = arrayList.isEmpty() ? i13.j : arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        this.N0 = x3p1.n(new sef1(this, b2), new sef1(this, b), new wcf1(this, (byte) 4), (o8n) null, new sef1(this, (byte) 2), 8);
        this.O0 = n3o1.q(this).a(kle1.P0, kle1.Q0);
        j2i j2iVar = new j2i(1026656446, new y2f1(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.P0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.O0;
    }

    public final jsw c() {
        return this.P0;
    }

    public final d0r e() {
        return this.g;
    }

    public final mqw getBehavior() {
        return this.N0;
    }

    public final f4r getData() {
        return this.Z;
    }
}
