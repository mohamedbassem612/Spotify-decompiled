package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u16 implements tyq {
    public final d0r a;
    public final Function0 b;
    public final Function0 c;
    public final o3r d;
    public final js20 e;
    public final i7h1 f;
    public final psw g;

    public u16(d0r d0rVar, Function0 function0, Function0 function1) {
        this.a = d0rVar;
        this.b = function0;
        this.c = function1;
        jd11 jd11Var = rc11.a;
        this.d = w3p1.n(new l4r(new wlu(jd11Var.b(jo70.class)), 2, k74.e1, new j4r(k74.c1), t16.b), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, t16.c, new j4r(k74.d1), t16.d), ad5.f);
        this.e = x3p1.n(new s16(this, (byte) 0), new tsm1(this, (byte) 22), new bom1(this, (byte) 20), (o8n) null, new s16(this, (byte) 1), 8);
        this.f = new i7h1(oy5.g, oy5.h);
        j2i j2iVar = q6i.a;
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
    }

    public static q16 f(k1r k1rVar) {
        xkk1 xkk1Var;
        mq70 mq70Var;
        up70 up70VarA;
        jo70 jo70Var;
        String str = null;
        i1r i1rVar = k1rVar instanceof i1r ? (i1r) k1rVar : null;
        r16 r16Var = i1rVar != null ? (r16) i1rVar.a : null;
        String str2 = (r16Var == null || (jo70Var = r16Var.a) == null) ? null : jo70Var.a;
        if (str2 == null) {
            str2 = "";
        }
        if (r16Var != null && (xkk1Var = r16Var.b) != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70.c)) != null) {
            str = up70VarA.a.a;
        }
        return new q16(str2, str);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.e;
    }

    public final f4r getData() {
        return this.d;
    }
}
