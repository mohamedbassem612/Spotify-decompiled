package p;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mpv0 extends a8d1 implements vu30 {
    public Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 1;
    public String b;
    public boolean c;
    public byte d;
    public Object e;
    public final /* synthetic */ String f;
    public Object g;
    public Object h;
    public Object i;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpv0(yy1 yy1Var, qxc0 qxc0Var, String str, d0r d0rVar, lnm lnmVar) {
        super(2, lnmVar);
        this.t = yy1Var;
        this.X = qxc0Var;
        this.f = str;
        this.Y = d0rVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                mpv0 mpv0Var = new mpv0(this.c, (opv0) obj2, (w6e0) this.i, this.f, lnmVar);
                mpv0Var.g = obj;
                return mpv0Var;
            default:
                mpv0 mpv0Var2 = new mpv0((yy1) this.t, (qxc0) this.X, this.f, (d0r) obj2, lnmVar);
                mpv0Var2.e = obj;
                return mpv0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0115 A[PHI: r12
      0x0115: PHI (r12v2 p.vr20) = (r12v1 p.vr20), (r12v3 p.vr20) binds: [B:32:0x0113, B:40:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x018c  */
    /* JADX WARN: Code duplicated, block: B:60:0x019b  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        hpe0 hpe0VarA;
        lql lqlVar;
        lql lqlVar2;
        lql lqlVar3;
        hoj0 hoj0VarC;
        ez00 ez00Var;
        goj0 goj0VarA;
        hoj0 hoj0VarC2;
        ez00 ez00Var2;
        goj0 goj0VarA2;
        s2t s2tVarQ;
        yy1 yy1Var;
        qxc0 qxc0Var;
        Object objQ;
        boolean z;
        Object objE;
        qxc0 qxc0Var2;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        String str = this.f;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                w6e0 w6e0Var = (w6e0) this.i;
                xe01 xe01Var = (xe01) w6e0Var.c;
                opv0 opv0Var = (opv0) obj2;
                vr20 vr20Var = (vr20) this.g;
                byte b2 = this.d;
                if (b2 == 0) {
                    hm5.M(obj);
                    if (this.c) {
                        this.g = null;
                        this.e = vr20Var;
                        this.d = (byte) 1;
                        objA = opv0Var.a(w6e0Var, str, this);
                        if (objA == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        hpe0VarA = null;
                    }
                    this.g = null;
                    this.e = null;
                    this.h = null;
                    this.b = null;
                    this.t = null;
                    this.X = null;
                    this.d = (byte) 4;
                    if (vr20Var.emit(hpe0VarA, this) == d9nVar) {
                        return d9nVar;
                    }
                    return rih1.a;
                }
                if (b2 == 1) {
                    vr20Var = (vr20) this.e;
                    hm5.M(obj);
                    objA = obj;
                } else if (b2 == 2) {
                    opv0Var = (opv0) this.X;
                    vr20 vr20Var2 = (vr20) this.t;
                    str = this.b;
                    w6e0 w6e0Var2 = (w6e0) this.h;
                    lqlVar2 = (lql) this.e;
                    hm5.M(obj);
                    vr20Var = vr20Var2;
                    w6e0Var = w6e0Var2;
                    lqlVar = lqlVar2;
                    hoj0VarC = ((ioj0) ((xe01) w6e0Var.c).a.getValue()).c(gh3.class, str);
                    if (hoj0VarC != null || (goj0VarA = hoj0VarC.a()) == null) {
                        ez00Var = null;
                    } else {
                        ez00Var = (ez00) goj0VarA.a;
                    }
                    gh3 gh3Var = (gh3) ez00Var;
                    opv0Var.getClass();
                    hpe0VarA = ok10.a(gh3Var == null && gh3Var.h, lqlVar);
                    this.g = null;
                    this.e = null;
                    this.h = null;
                    this.b = null;
                    this.t = null;
                    this.X = null;
                    this.d = (byte) 4;
                    if (vr20Var.emit(hpe0VarA, this) == d9nVar) {
                        return d9nVar;
                    }
                } else if (b2 == 3) {
                    opv0Var = (opv0) this.X;
                    vr20 vr20Var3 = (vr20) this.t;
                    str = this.b;
                    w6e0 w6e0Var3 = (w6e0) this.h;
                    lqlVar3 = (lql) this.e;
                    hm5.M(obj);
                    vr20Var = vr20Var3;
                    w6e0Var = w6e0Var3;
                    lqlVar = lqlVar3;
                    hoj0VarC2 = ((ioj0) ((xe01) w6e0Var.c).a.getValue()).c(z1g1.class, str);
                    if (hoj0VarC2 != null || (goj0VarA2 = hoj0VarC2.a()) == null) {
                        ez00Var2 = null;
                    } else {
                        ez00Var2 = (ez00) goj0VarA2.a;
                    }
                    z1g1 z1g1Var = (z1g1) ez00Var2;
                    opv0Var.getClass();
                    hpe0VarA = ok10.b(z1g1Var == null && poz0.D(z1g1Var), lqlVar);
                    this.g = null;
                    this.e = null;
                    this.h = null;
                    this.b = null;
                    this.t = null;
                    this.X = null;
                    this.d = (byte) 4;
                    if (vr20Var.emit(hpe0VarA, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (b2 != 4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
                lqlVar = (lql) objA;
                int iOrdinal = new y6b1(str, false).c.ordinal();
                if (iOrdinal == 6) {
                    if (((ioj0) xe01Var.a.getValue()).c(gh3.class, str) == null) {
                        Map mapSingletonMap = Collections.singletonMap(str, Collections.singleton(new zp21(gh3.class)));
                        this.g = null;
                        this.e = lqlVar;
                        this.h = w6e0Var;
                        this.b = str;
                        this.t = vr20Var;
                        this.X = opv0Var;
                        this.d = (byte) 2;
                        if (w6e0Var.d(mapSingletonMap, this) == d9nVar) {
                            return d9nVar;
                        }
                        lqlVar2 = lqlVar;
                        lqlVar = lqlVar2;
                    }
                    hoj0VarC = ((ioj0) ((xe01) w6e0Var.c).a.getValue()).c(gh3.class, str);
                    if (hoj0VarC != null) {
                        ez00Var = null;
                    } else {
                        ez00Var = null;
                    }
                    gh3 gh3Var2 = (gh3) ez00Var;
                    opv0Var.getClass();
                    hpe0VarA = ok10.a(gh3Var2 == null && gh3Var2.h, lqlVar);
                    this.g = null;
                    this.e = null;
                    this.h = null;
                    this.b = null;
                    this.t = null;
                    this.X = null;
                    this.d = (byte) 4;
                    if (vr20Var.emit(hpe0VarA, this) == d9nVar) {
                        return d9nVar;
                    }
                    return rih1.a;
                }
                if (iOrdinal != 8) {
                    hpe0VarA = null;
                } else {
                    if (((ioj0) xe01Var.a.getValue()).c(z1g1.class, str) == null) {
                        Map mapSingletonMap2 = Collections.singletonMap(str, Collections.singleton(new zp21(z1g1.class)));
                        this.g = null;
                        this.e = lqlVar;
                        this.h = w6e0Var;
                        this.b = str;
                        this.t = vr20Var;
                        this.X = opv0Var;
                        this.d = (byte) 3;
                        if (w6e0Var.d(mapSingletonMap2, this) == d9nVar) {
                            return d9nVar;
                        }
                        lqlVar3 = lqlVar;
                        lqlVar = lqlVar3;
                    }
                    hoj0VarC2 = ((ioj0) ((xe01) w6e0Var.c).a.getValue()).c(z1g1.class, str);
                    if (hoj0VarC2 != null) {
                        ez00Var2 = null;
                    } else {
                        ez00Var2 = null;
                    }
                    z1g1 z1g1Var2 = (z1g1) ez00Var2;
                    opv0Var.getClass();
                    hpe0VarA = ok10.b(z1g1Var2 == null && poz0.D(z1g1Var2), lqlVar);
                }
                this.g = null;
                this.e = null;
                this.h = null;
                this.b = null;
                this.t = null;
                this.X = null;
                this.d = (byte) 4;
                if (vr20Var.emit(hpe0VarA, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1.a;
            default:
                d0r d0rVar = (d0r) obj2;
                c9n c9nVar = (c9n) this.e;
                byte b3 = this.d;
                if (b3 != 0) {
                    if (b3 == 1) {
                        str = this.b;
                        qxc0 qxc0Var3 = (qxc0) this.i;
                        yy1 yy1Var2 = (yy1) this.h;
                        s2tVarQ = (s2t) this.g;
                        hm5.M(obj);
                        qxc0Var = qxc0Var3;
                        yy1Var = yy1Var2;
                        objQ = obj;
                    } else {
                        if (b3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z2 = this.c;
                        String str2 = this.b;
                        qxc0Var2 = (qxc0) this.i;
                        yy1 yy1Var3 = (yy1) this.h;
                        hm5.M(obj);
                        str = str2;
                        z = z2;
                        yy1Var = yy1Var3;
                        objE = obj;
                    }
                    return yy1Var.g(qxc0Var2, str, z, ((qp31) objE).a);
                }
                hm5.M(obj);
                s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new hex0(d0rVar, str, (lnm) null, (byte) 0), 3);
                s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new hex0(d0rVar, str, (lnm) null, (byte) 1), 3);
                yy1Var = (yy1) this.t;
                qxc0Var = (qxc0) this.X;
                this.e = null;
                this.g = s2tVarQ;
                this.h = yy1Var;
                this.i = qxc0Var;
                this.b = str;
                this.d = (byte) 1;
                objQ = s2tVarQ2.Q(this);
                if (objQ == d9nVar) {
                    return d9nVar;
                }
                z = ((vnb1) objQ).a;
                this.e = null;
                this.g = null;
                this.h = yy1Var;
                this.i = qxc0Var;
                this.b = str;
                this.c = z;
                this.d = (byte) 2;
                objE = s2tVarQ.E(this);
                if (objE == d9nVar) {
                    return d9nVar;
                }
                qxc0Var2 = qxc0Var;
                return yy1Var.g(qxc0Var2, str, z, ((qp31) objE).a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpv0(boolean z, opv0 opv0Var, w6e0 w6e0Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.c = z;
        this.Y = opv0Var;
        this.i = w6e0Var;
        this.f = str;
    }
}
