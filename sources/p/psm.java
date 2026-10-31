package p;

import android.net.Uri;
import android.os.Bundle;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class psm extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ maa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ psm(maa maaVar, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.d = maaVar;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yxb0 yxb0Var = this.d;
        switch (b) {
            case 0:
                psm psmVar = new psm((ldo) yxb0Var, (lnm) obj5, (byte) 0);
                psmVar.c = (lsm) obj3;
                return psmVar.invokeSuspend(rih1Var);
            case 1:
                psm psmVar2 = new psm((umf0) yxb0Var, (lnm) obj5, (byte) 1);
                psmVar2.c = (d7c0) obj3;
                return psmVar2.invokeSuspend(rih1Var);
            case 2:
                psm psmVar3 = new psm((el9) yxb0Var, (lnm) obj5, (byte) 2);
                psmVar3.c = (qck0) obj3;
                return psmVar3.invokeSuspend(rih1Var);
            case 3:
                psm psmVar4 = new psm((ngs0) yxb0Var, (lnm) obj5, (byte) 3);
                psmVar4.c = (p2t0) obj3;
                return psmVar4.invokeSuspend(rih1Var);
            case 4:
                psm psmVar5 = new psm((yp51) yxb0Var, (lnm) obj5, (byte) 4);
                psmVar5.c = (up51) obj2;
                return psmVar5.invokeSuspend(rih1Var);
            case 5:
                psm psmVar6 = new psm((ngs0) yxb0Var, (lnm) obj5, (byte) 5);
                psmVar6.c = (ut51) obj3;
                return psmVar6.invokeSuspend(rih1Var);
            case 6:
                psm psmVar7 = new psm((pt) yxb0Var, (lnm) obj5, (byte) 6);
                psmVar7.c = (xqh1) obj3;
                return psmVar7.invokeSuspend(rih1Var);
            default:
                psm psmVar8 = new psm(yxb0Var, (lnm) obj5, (byte) 7);
                psmVar8.c = (thj1) obj3;
                return psmVar8.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0225  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yxb0 yxb0Var = this.d;
        d9n d9nVar = d9n.a;
        h3k0 b2k0Var = null;
        switch (b) {
            case 0:
                lsm lsmVar = (lsm) this.c;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    if (u890.j(lsmVar, lsm.a)) {
                        ldo ldoVar = (ldo) yxb0Var;
                        hum humVar = (hum) ldoVar.d;
                        String str = (String) ldoVar.c;
                        this.c = null;
                        this.b = true;
                        return humVar.b(str, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                d7c0 d7c0Var = (d7c0) this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (d7c0Var != null) {
                        j7c0 j7c0Var = (j7c0) ((umf0) yxb0Var).d;
                        b7c0 b7c0Var = d7c0Var.a;
                        this.c = null;
                        this.b = true;
                        m7c0 m7c0Var = (m7c0) j7c0Var;
                        Object objY = fn31.Y(m7c0Var.c, new ss90(m7c0Var, b7c0Var, b2k0Var, (byte) 17), this);
                        if (objY != d9nVar) {
                            objY = rih1Var;
                        }
                        return objY == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 2:
                el9 el9Var = (el9) yxb0Var;
                jck0 jck0Var = (qck0) this.c;
                boolean z3 = this.b;
                if (z3) {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    if (b2k0Var != null) {
                        return rih1Var;
                    }
                    ((r7j0) el9Var.g).invoke(b2k0Var);
                    return rih1Var;
                }
                hm5.M(obj);
                if (jck0Var instanceof jck0) {
                    b2k0Var = new w2k0(jck0Var.a);
                } else if (jck0Var instanceof eck0) {
                    b2k0Var = y1k0.a;
                } else if (jck0Var instanceof dck0) {
                    b2k0Var = new x1k0(((dck0) jck0Var).a);
                } else if (jck0Var instanceof nck0) {
                    b2k0Var = h3k0.a;
                } else if (jck0Var instanceof gck0) {
                    b2k0Var = m2k0.a;
                } else if (jck0Var instanceof pck0) {
                    b2k0Var = new s3k0(zyb.a);
                } else if (jck0Var instanceof hck0) {
                    b2k0Var = new s3k0(syb.a);
                } else if (jck0Var instanceof ick0) {
                    b2k0Var = new s3k0(tyb.a);
                } else if (jck0Var instanceof kck0) {
                    b2k0Var = new s3k0(uyb.a);
                } else if (jck0Var instanceof mck0) {
                    b2k0Var = new s3k0(wyb.a);
                } else if (jck0Var instanceof lck0) {
                    b2k0Var = new s3k0(vyb.a);
                } else if (jck0Var instanceof fck0) {
                    b2k0Var = new b2k0(((fck0) jck0Var).a);
                } else {
                    if (!(jck0Var instanceof ock0)) {
                        eg.o();
                        return null;
                    }
                    bbk0 bbk0Var = (bbk0) el9Var.t;
                    this.c = null;
                    this.b = true;
                    if (bbk0Var.a(true, this) == d9nVar) {
                        return d9nVar;
                    }
                }
                if (b2k0Var != null) {
                    return rih1Var;
                }
                ((r7j0) el9Var.g).invoke(b2k0Var);
                return rih1Var;
            case 3:
                p2t0 p2t0Var = (p2t0) this.c;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    if (p2t0Var != null) {
                        g3t0 g3t0Var = (g3t0) ((ngs0) yxb0Var).d;
                        a3t0 a3t0Var = p2t0Var.a;
                        this.c = null;
                        this.b = true;
                        g3t0Var.getClass();
                        fns fnsVar = igu.a;
                        Object objY2 = fn31.Y(b3s.c, new f3t0(g3t0Var, a3t0Var, (lnm) null, (byte) 0), this);
                        if (objY2 != d9nVar) {
                            objY2 = rih1Var;
                        }
                        return objY2 == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 4:
                up51 up51Var = (up51) this.c;
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                f1n0 f1n0Var = ((yp51) yxb0Var).c;
                dwn0 dwn0Var = new dwn0(up51Var.a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null);
                this.c = null;
                this.b = true;
                return f1n0.d(f1n0Var, dwn0Var, this) == d9nVar ? d9nVar : rih1Var;
            case 5:
                ut51 ut51Var = (ut51) this.c;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    int iOrdinal = ut51Var.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        d0r d0rVar = (d0r) ((ngs0) yxb0Var).d;
                        pwc0 pwc0Var = pwc0.D;
                        this.c = null;
                        this.b = true;
                        return d0r.d(d0rVar, pwc0Var, rih1Var, ez51.a, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 6:
                pt ptVar = (pt) yxb0Var;
                xqh1 xqh1Var = (xqh1) this.c;
                boolean z7 = this.b;
                if (z7) {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objJ = obj;
                    Uri uri = (Uri) objJ;
                    z710 z710Var = (z710) ptVar.h;
                    uri.getClass();
                    z710.c(z710Var, uri, false, 6);
                    return rih1Var;
                }
                hm5.M(obj);
                if (!(xqh1Var instanceof wqh1)) {
                    if (xqh1Var instanceof vqh1) {
                        ((i9i1) ptVar.i).b(((vqh1) xqh1Var).a);
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                Single singleC = ((g341) ptVar.d).c(Uri.parse("https://www.spotify.com/account/profile-mobile"));
                this.c = null;
                this.b = true;
                objJ = fc11.j(singleC, this);
                if (objJ == d9nVar) {
                    return d9nVar;
                }
                Uri uri2 = (Uri) objJ;
                z710 z710Var2 = (z710) ptVar.h;
                uri2.getClass();
                z710.c(z710Var2, uri2, false, 6);
                return rih1Var;
            default:
                thj1 thj1Var = (thj1) this.c;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                yxb0 yxb0Var2 = yxb0Var;
                if (yhj1.a[thj1Var.ordinal()] == 1) {
                    ((ptf1) yxb0Var2.e).w();
                    return rih1Var;
                }
                d0r d0rVar2 = (d0r) yxb0Var2.c;
                v061 v061Var = v061.d;
                hnj1 hnj1Var = new hnj1((String) yxb0Var2.d);
                this.c = null;
                this.b = true;
                return d0r.d(d0rVar2, v061Var, hnj1Var, fnj1.a, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
