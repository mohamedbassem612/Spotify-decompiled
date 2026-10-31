package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nou0 implements syq {
    public final y0q0 a;
    public final d0r b;
    public final String c;
    public final o3r d;
    public final f4r e;
    public final js20 f;
    public final eih1 g;
    public final nsw h;

    public nou0(y0q0 y0q0Var, d0r d0rVar, String str) {
        this.a = y0q0Var;
        this.b = d0rVar;
        this.c = str;
        o3r o3rVarO = w3p1.o(new l4r(hvm.c, 1, rku0.c1, new j4r(new mou0(this, (byte) 1)), rku0.d1), rku0.b1);
        this.d = o3rVarO;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i4r(rku0.a1, o3rVarO));
        this.e = arrayList.isEmpty() ? i13.j : arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        this.f = w3p1.q(new mou0(this, (byte) 0), rku0.Y0, fnt0.V0, (o8n) null, rku0.Z0, 8);
        this.g = new eih1();
        this.h = jch0.j(new ixt0(this, (byte) 1));
    }

    public final rqw a() {
        return this.g;
    }

    public final rsw c() {
        return this.h;
    }

    public final d0r e() {
        return this.b;
    }

    public final mqw getBehavior() {
        return this.f;
    }

    public final f4r getData() {
        return this.e;
    }
}
