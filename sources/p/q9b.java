package p;

import com.spotify.support.assertion.Assertion;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q9b implements enn {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ q9b(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object a(qmn qmnVar, lnm lnmVar) {
        p9b p9bVar;
        iiu0 iiu0Var;
        grx grxVar;
        Integer num;
        Integer num2;
        qmn qmnVar2;
        byte b = this.a;
        byte b2 = 26;
        Object obj = d9n.a;
        lnm lnmVar2 = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof p9b) {
                    p9bVar = (p9b) lnmVar;
                    int i = p9bVar.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        p9bVar.c = i - Integer.MIN_VALUE;
                    } else {
                        p9bVar = new p9b(this, (onm) lnmVar);
                    }
                } else {
                    p9bVar = new p9b(this, (onm) lnmVar);
                }
                Object objH = p9bVar.a;
                int i2 = p9bVar.c;
                if (i2 == 0) {
                    hm5.M(objH);
                    try {
                        if (((v9b) this.b).b()) {
                            zwa zwaVar = (zwa) this.d;
                            p9bVar.c = 1;
                            objH = zwaVar.h(p9bVar);
                            if (objH == obj) {
                                return obj;
                            }
                            if (!((Boolean) objH).booleanValue()) {
                                return new mmn(ftx.c, new Integer(2131952819), new Integer(2131952820), new Integer(2131952818), (String) null, new tm81(0, 8, "bluejay", new sg0(1, (lnm) null, (byte) 4), true), (nmn) null, 2, new jmn(c7b.f, new ry5(this, lnmVar2, b2)), 340);
                            }
                        }
                    } catch (Assertion.RecoverableAssertionError e) {
                        n57.t("Create Menu gating failed", e);
                    }
                } else if (i2 == 1) {
                    hm5.M(objH);
                    if (!((Boolean) objH).booleanValue()) {
                        return new mmn(ftx.c, new Integer(2131952819), new Integer(2131952820), new Integer(2131952818), (String) null, new tm81(0, 8, "bluejay", new sg0(1, (lnm) null, (byte) 4), true), (nmn) null, 2, new jmn(c7b.f, new ry5(this, lnmVar2, b2)), 340);
                    }
                } else {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                if (lnmVar instanceof iiu0) {
                    iiu0Var = (iiu0) lnmVar;
                    int i3 = iiu0Var.g;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        iiu0Var.g = i3 - Integer.MIN_VALUE;
                    } else {
                        iiu0Var = new iiu0(this, (onm) lnmVar);
                    }
                } else {
                    iiu0Var = new iiu0(this, (onm) lnmVar);
                }
                Object obj2 = iiu0Var.e;
                int i4 = iiu0Var.g;
                if (i4 == 0) {
                    hm5.M(obj2);
                    grxVar = grx.c;
                    Integer num3 = new Integer(2131954654);
                    num = new Integer(2131954655);
                    iiu0Var.a = qmnVar;
                    iiu0Var.b = grxVar;
                    iiu0Var.c = num3;
                    iiu0Var.d = num;
                    iiu0Var.g = 1;
                    Object objB = b(iiu0Var);
                    if (objB == obj) {
                        return obj;
                    }
                    num2 = num3;
                    obj2 = objB;
                    qmnVar2 = qmnVar;
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    num = iiu0Var.d;
                    Integer num4 = iiu0Var.c;
                    grxVar = iiu0Var.b;
                    qmnVar2 = iiu0Var.a;
                    hm5.M(obj2);
                    num2 = num4;
                }
                return new mmn(grxVar, num2, num, new Integer(((Boolean) obj2).booleanValue() ? 2131954652 : 2131954653), (String) null, (tm81) null, (nmn) null, 10, new jmn(fiu0.e, new dvq0(this, qmnVar2, (lnm) null, (byte) 26)), 468);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(onm onmVar) {
        jiu0 jiu0Var;
        if (onmVar instanceof jiu0) {
            jiu0Var = (jiu0) onmVar;
            int i = jiu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jiu0Var.c = i - Integer.MIN_VALUE;
            } else {
                jiu0Var = new jiu0(this, onmVar);
            }
        } else {
            jiu0Var = new jiu0(this, onmVar);
        }
        Object objL = jiu0Var.a;
        int i2 = jiu0Var.c;
        if (i2 == 0) {
            hm5.M(objL);
            Observable map = ((o241) this.b).a.map(xj20.a1);
            jiu0Var.c = 1;
            objL = fc11.l(map, 2, (Object) null, jiu0Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
        }
        return Boolean.valueOf(u890.j(objL, Boolean.TRUE));
    }
}
