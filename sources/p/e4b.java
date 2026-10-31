package p;

import j$.time.ZonedDateTime;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e4b extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4b(Object obj, Serializable serializable, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = serializable;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return new e4b((g4b) this.c, (String) obj, lnmVar, (byte) 0);
            case 1:
                return new e4b((mq90) this.c, (tv80) obj, lnmVar, (byte) 1);
            case 2:
                return new e4b((ghk0) obj, lnmVar, (byte) 2);
            case 3:
                return new e4b((oa31) obj, lnmVar, (byte) 3);
            default:
                return new e4b((vsg1) obj, lnmVar, (byte) 4);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
    public final Object invokeSuspend(Object obj) {
        wsc0 wsc0Var;
        hj31 hj31Var;
        Object objB;
        rrg1 rrg1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.d;
        Object obj3 = null;
        switch (b) {
            case 0:
                String str = (String) obj2;
                g4b g4bVar = (g4b) this.c;
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    g4bVar.h.m((Object) null, sob1.c);
                    this.b = (byte) 1;
                    if (g4bVar.a(str, this) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = (byte) 2;
                if (g4bVar.b(str, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 1:
                mq90 mq90Var = (mq90) this.c;
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    mq90Var.b.e();
                    this.b = (byte) 1;
                    mq90Var.c.a(hr90.g, true);
                    Object objJ = b5p1.j(mq90Var.a.b.current(), new y160(mq90Var, (lnm) null, (byte) 15), this);
                    if (objJ != d9nVar) {
                        objJ = rih1Var;
                    }
                    if (objJ != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = (byte) 2;
                if (mq90Var.b((tv80) obj2, false, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 2:
                ghk0 ghk0Var = (ghk0) obj2;
                byte b4 = this.b;
                if (b4 != 0) {
                    if (b4 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b4 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        wsc0Var = (wsc0) this.c;
                        hm5.M(obj);
                    }
                    return new dhk0(wsc0Var, ((Boolean) obj).booleanValue());
                }
                hm5.M(obj);
                ve01 ve01Var = ghk0Var.a.a;
                this.b = (byte) 1;
                obj = b5p1.i(ve01Var, this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                wsc0 wsc0Var2 = (wsc0) ((wek0) obj).a.d();
                mr20 mr20VarA = ghk0Var.f.a(s6n.a);
                this.c = wsc0Var2;
                this.b = (byte) 2;
                Object objI = b5p1.i(mr20VarA, this);
                if (objI == d9nVar) {
                    return d9nVar;
                }
                obj = objI;
                wsc0Var = wsc0Var2;
                return new dhk0(wsc0Var, ((Boolean) obj).booleanValue());
            case 3:
                oa31 oa31Var = (oa31) obj2;
                byte b5 = this.b;
                if (b5 != 0) {
                    if (b5 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b5 == 2) {
                            Object obj4 = this.c;
                            hm5.M(obj);
                            return obj4;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                o931 o931Var = oa31Var.c;
                this.b = (byte) 1;
                obj = o931Var.a(this);
                if (obj == d9nVar) {
                    return d9nVar;
                }
                ka31 ka31Var = (ka31) obj;
                if (ka31Var instanceof ja31) {
                    for (Object obj5 : ((ja31) ka31Var).a) {
                        z5c1 z5c1Var = (z5c1) obj5;
                        if ((z5c1Var.e instanceof n5c1) || (z5c1Var.f instanceof n5c1)) {
                            obj3 = obj5;
                            if (((z5c1) obj3) != null) {
                                hj31Var = oa31Var.d;
                                this.c = obj;
                                this.b = (byte) 2;
                                if (hj31Var.a(false, this) == d9nVar) {
                                    return d9nVar;
                                }
                            }
                        }
                    }
                    if (((z5c1) obj3) != null) {
                        hj31Var = oa31Var.d;
                        this.c = obj;
                        this.b = (byte) 2;
                        if (hj31Var.a(false, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else if (!(ka31Var instanceof ia31)) {
                    eg.o();
                    return null;
                }
                return obj;
            default:
                vsg1 vsg1Var = (vsg1) obj2;
                byte b6 = this.b;
                if (b6 != 0) {
                    if (b6 == 1) {
                        hm5.M(obj);
                        objB = ((e331) obj).a;
                    } else {
                        if (b6 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rrg1Var = (rrg1) this.c;
                        hm5.M(obj);
                    }
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    ZonedDateTime zonedDateTime = rrg1Var.a;
                    return new sqg1(zonedDateTime != null ? vsg1Var.f.d.format(Long.valueOf(zonedDateTime.toEpochSecond() * 1000)) : null, rrg1Var.b, vsg1Var.e.a.g(), zBooleanValue);
                }
                hm5.M(obj);
                k4q0 k4q0Var = vsg1Var.c;
                this.b = (byte) 1;
                objB = k4q0Var.b(this);
                if (objB == d9nVar) {
                    return d9nVar;
                }
                rrg1 rrg1Var2 = new rrg1(null, true, null);
                if (objB instanceof m231) {
                    objB = rrg1Var2;
                }
                rrg1 rrg1Var3 = (rrg1) objB;
                mr20 mr20VarA2 = vsg1Var.d.a();
                this.c = rrg1Var3;
                this.b = (byte) 2;
                Object objI2 = b5p1.i(mr20VarA2, this);
                if (objI2 == d9nVar) {
                    return d9nVar;
                }
                obj = objI2;
                rrg1Var = rrg1Var3;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ZonedDateTime zonedDateTime2 = rrg1Var.a;
                if (zonedDateTime2 != null) {
                }
                return new sqg1(zonedDateTime2 != null ? vsg1Var.f.d.format(Long.valueOf(zonedDateTime2.toEpochSecond() * 1000)) : null, rrg1Var.b, vsg1Var.e.a.g(), zBooleanValue2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4b(h0r0 h0r0Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.d = h0r0Var;
    }
}
