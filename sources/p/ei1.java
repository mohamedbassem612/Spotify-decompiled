package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ei1 implements tyq {
    public final d0r a;
    public final e37 b;
    public final ugx0 c;
    public final jle d;
    public final zh1 e;
    public final zh1 f;
    public final f4r g;
    public final rey0 h;
    public final ia00 i;
    public final psw t;

    public ei1(axo axoVar, bxo bxoVar, cxo cxoVar, d0r d0rVar, q7r0 q7r0Var) {
        this.a = d0rVar;
        e37 e37VarA = axoVar.a(d0rVar, u291.r(nim0.a, 88.0f));
        this.b = e37VarA;
        ugx0 ugx0VarA = bxoVar.a(d0rVar, true);
        this.c = ugx0VarA;
        jle jleVarA = cxoVar.a(d0rVar);
        this.d = jleVarA;
        this.e = new zh1(q7r0Var, (byte) 0);
        this.f = new zh1(q7r0Var, (byte) 2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i4r(uh1.d, e37VarA.b));
        arrayList.add(new i4r(new tsm1(this, (byte) 17), ugx0VarA.c));
        arrayList.add(new i4r(uh1.e, jleVarA.b));
        this.g = arrayList.isEmpty() ? i13.j : arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        this.h = k1o1.p();
        this.i = n3o1.q(this).a(fp0.Z0, fp0.a1);
        j2i j2iVar = new j2i(-2027842363, new r1(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.t;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.h;
    }

    public final f4r getData() {
        return this.g;
    }
}
