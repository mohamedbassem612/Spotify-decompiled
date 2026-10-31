package p;

import android.util.LruCache;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Reply;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ymh implements zu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public ymh(List list, String str, qpj1 qpj1Var, iu30 iu30Var, boolean z, iu30 iu30Var2) {
        this.b = list;
        this.f = str;
        this.c = qpj1Var;
        this.e = iu30Var;
        this.d = z;
        this.g = iu30Var2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        int i;
        x340 x340Var;
        boolean z;
        boolean z2;
        vhh whhVar;
        vhh whhVar2;
        vhh whhVar3;
        vhh whhVar4;
        int i2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        hqk1 hqk1Var;
        boolean z4;
        Function0 function0;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z5 = this.d;
        iu30 iu30Var = this.e;
        Object obj5 = this.f;
        List list = this.b;
        Object obj6 = this.c;
        Object obj7 = this.g;
        switch (b) {
            case 0:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                gra graVar = een.h;
                String str = (String) obj5;
                m4c m4cVar = fkj0.X;
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (x340Var2.g(aqb0Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var2.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var3 = x340Var2;
                boolean zY = x340Var3.Y(i & 1, (i & 147) != 146);
                j06 j06Var = x340Var3.a;
                if (zY) {
                    pkh pkhVar = (pkh) list.get(iIntValue);
                    x340Var3.i0(-1017969999);
                    boolean z6 = pkhVar instanceof ekh;
                    nim0 nim0Var = nim0.a;
                    if (z6) {
                        x340Var3.i0(-1018074718);
                        if (iIntValue <= 0 || (((List) obj6).get(iIntValue - 1) instanceof lkh)) {
                            x340Var3.i0(-1017742646);
                            x340Var3.r(false);
                        } else {
                            x340Var3.i0(-1017993467);
                            uwr uwrVar = cbx.a;
                            cvx cvxVar = cbx.b(x340Var3).b;
                            cvx cvxVar2 = cbx.b(x340Var3).b;
                            rqo1.g(0, 0, x340Var3, uyn1.y(nim0Var, 16.0f, 8.0f));
                            x340Var3.r(false);
                        }
                        ekh ekhVar = (ekh) pkhVar;
                        Comment comment = ekhVar.b;
                        int iP = comment.p();
                        int i6 = iP == 0 ? -1 : anh.a[l1d.C(iP)];
                        if (i6 == -1) {
                            n57.e("Author metadata not set for comment " + comment.r());
                            whhVar3 = new whh();
                            whhVar4 = whhVar3;
                        } else if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    eg.o();
                                    return null;
                                }
                                n57.e("Author metadata not set for comment " + comment.r());
                                whhVar3 = new whh();
                            } else {
                                whhVar3 = new vhh(comment.B().p(), comment.B().o());
                            }
                            whhVar4 = whhVar3;
                        } else {
                            whhVar4 = new whh(comment.E().q(), comment.E().p(), comment.E().getUsername(), z5 && comment.E().o());
                        }
                        fih fihVar = new fih(whhVar4, comment.q(), comment.r(), (String) o7h.s0(comment.s()), comment.w(), comment.x(), comment.t(), str, ekhVar.c, comment.A(), ekhVar.d, w6p1.h(ekhVar.e, comment.C()));
                        oih oihVar = (oih) obj7;
                        boolean zI = x340Var3.i(pkhVar) | x340Var3.g(iu30Var);
                        Object objT = x340Var3.T();
                        if (zI || objT == m4cVar) {
                            objT = new w9f(ekhVar, iu30Var, (byte) 26);
                            x340Var3.s0(objT);
                        }
                        oihVar.d(fihVar, (iu30) objT, (qim0) null, x340Var3, 4104, 4);
                        x340Var = x340Var3;
                        z2 = false;
                        x340Var.r(false);
                        z = z2;
                    } else {
                        x340Var = x340Var3;
                        if (pkhVar instanceof hkh) {
                            x340Var.i0(-1017436707);
                            hkh hkhVar = (hkh) pkhVar;
                            Reply reply = hkhVar.b;
                            int iN = reply.n();
                            int i7 = iN == 0 ? -1 : anh.b[l1d.C(iN)];
                            if (i7 == -1) {
                                n57.e("Author metadata not set for reply " + reply.o());
                                whhVar = new whh();
                                whhVar2 = whhVar;
                            } else if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        eg.o();
                                        return null;
                                    }
                                    n57.e("Author metadata not set for reply " + reply.o());
                                    whhVar = new whh();
                                } else {
                                    whhVar = new vhh(reply.v().p(), reply.v().o());
                                }
                                whhVar2 = whhVar;
                            } else {
                                whhVar2 = new whh(reply.x().q(), reply.x().p(), reply.x().getUsername(), z5 && reply.x().o());
                            }
                            fih fihVar2 = new fih(whhVar2, reply.u(), reply.o(), (String) null, reply.r(), false, reply.p(), str, hkhVar.c, reply.t(), false, w6p1.h(hkhVar.d, reply.w()));
                            oih oihVar2 = (oih) obj7;
                            boolean zI2 = x340Var.i(pkhVar) | x340Var.g(iu30Var);
                            Object objT2 = x340Var.T();
                            if (zI2 || objT2 == m4cVar) {
                                objT2 = new w9f(hkhVar, iu30Var, (byte) 27);
                                x340Var.s0(objT2);
                            }
                            uwr uwrVar2 = cbx.a;
                            oihVar2.d(fihVar2, (iu30) objT2, uyn1.B(nim0Var, cbx.b(x340Var).b.d, 0.0f, 0.0f, 0.0f, 14), x340Var, 4104, 0);
                            z2 = false;
                            x340Var.r(false);
                        } else if (pkhVar instanceof ikh) {
                            x340Var.i0(-1017059902);
                            ikh ikhVar = (ikh) pkhVar;
                            gg21 gg21Var = new gg21(ikhVar.c, ikhVar.d);
                            boolean zG = x340Var.g(iu30Var) | x340Var.i(pkhVar);
                            Object objT3 = x340Var.T();
                            if (zG || objT3 == m4cVar) {
                                objT3 = new w9f(iu30Var, ikhVar, (byte) 28);
                                x340Var.s0(objT3);
                            }
                            uwr uwrVar3 = cbx.a;
                            sj1.c(gg21Var, (iu30) objT3, uyn1.B(nim0Var, cbx.b(x340Var).b.d, 0.0f, 0.0f, 0.0f, 14), x340Var, 8, 0);
                            z2 = false;
                            x340Var.r(false);
                        } else if (pkhVar instanceof okh) {
                            x340Var.i0(-1016545705);
                            okh okhVar = (okh) pkhVar;
                            zih zihVar = new zih(okhVar.c, okhVar.d);
                            boolean zG2 = x340Var.g(iu30Var) | x340Var.i(pkhVar);
                            Object objT4 = x340Var.T();
                            if (zG2 || objT4 == m4cVar) {
                                objT4 = new w9f(iu30Var, okhVar, (byte) 29);
                                x340Var.s0(objT4);
                            }
                            uwr uwrVar4 = cbx.a;
                            t6p1.b(zihVar, (iu30) objT4, uyn1.B(nim0Var, cbx.b(x340Var).b.d, 0.0f, 0.0f, 0.0f, 14), x340Var, 0, 0);
                            z2 = false;
                            x340Var.r(false);
                        } else {
                            boolean z7 = pkhVar instanceof gkh;
                            n4k n4kVar = hmb0.t1;
                            if (z7) {
                                x340Var.i0(-1015460643);
                                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                                uwr uwrVar5 = cbx.a;
                                cvx cvxVar3 = cbx.b(x340Var).b;
                                qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
                                gfh0 gfh0VarC = t1c.c(graVar, false);
                                int iHashCode = Long.hashCode(x340Var.T);
                                xos0 xos0VarM = x340Var.m();
                                qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
                                hzj.A.getClass();
                                if (j06Var == null) {
                                    tgp1.p();
                                    throw null;
                                }
                                x340Var.m0();
                                if (x340Var.S) {
                                    x340Var.l(n4kVar);
                                } else {
                                    x340Var.v0();
                                }
                                nko1.H(gfh0VarC, x340Var, lljVar4);
                                nko1.H(xos0VarM, x340Var, lljVar3);
                                x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                                nko1.H(qim0VarE, x340Var, lljVar);
                                xto1.e((qim0) null, 0, cbx.a(x340Var).b.a, 0L, x340Var, 0, 11);
                                x340Var.r(true);
                                z2 = false;
                                x340Var.r(false);
                            } else {
                                if (pkhVar instanceof jkh) {
                                    x340Var.i0(-1015136600);
                                    String strO0 = cwl1.o0(x340Var, 2131961625);
                                    String strO1 = cwl1.o0(x340Var, 2131961624);
                                    boolean zG3 = x340Var.g(iu30Var);
                                    Object objT5 = x340Var.T();
                                    if (zG3 || objT5 == m4cVar) {
                                        objT5 = new thh(iu30Var, (byte) 14);
                                        x340Var.s0(objT5);
                                    }
                                    p8p1.f(0, 8, strO0, strO1, (Function0) objT5, x340Var, (qim0) null);
                                    z2 = false;
                                    x340Var.r(false);
                                } else if (pkhVar instanceof kkh) {
                                    x340Var.i0(-1014710815);
                                    kkh kkhVar = (kkh) pkhVar;
                                    boolean z8 = kkhVar.b.size() == 1;
                                    String strO2 = cwl1.o0(x340Var, z8 ? 2131961628 : 2131961625);
                                    String strO3 = cwl1.o0(x340Var, z8 ? 2131961627 : 2131961622);
                                    boolean zI3 = x340Var.i(pkhVar) | x340Var.g(iu30Var);
                                    Object objT6 = x340Var.T();
                                    if (zI3 || objT6 == m4cVar) {
                                        objT6 = new ame(iu30Var, kkhVar, (byte) 24);
                                        x340Var.s0(objT6);
                                    }
                                    uwr uwrVar6 = cbx.a;
                                    p8p1.f(0, 0, strO2, strO3, (Function0) objT6, x340Var, uyn1.B(nim0Var, cbx.b(x340Var).b.d, 0.0f, 0.0f, 0.0f, 14));
                                    z = false;
                                    x340Var.r(false);
                                } else {
                                    z = false;
                                    if (pkhVar instanceof lkh) {
                                        x340Var.i0(-1013658923);
                                        p8p1.d(0, 2, cwl1.o0(x340Var, 2131961623), x340Var, (qim0) null);
                                        x340Var.r(false);
                                    } else if (pkhVar instanceof nkh) {
                                        x340Var.i0(-1013441892);
                                        String strO4 = cwl1.o0(x340Var, ((nkh) pkhVar).b == 1 ? 2131961626 : 2131961621);
                                        uwr uwrVar7 = cbx.a;
                                        qim0 qim0VarB = uyn1.B(nim0Var, cbx.b(x340Var).b.d, 0.0f, 0.0f, 0.0f, 14);
                                        z = false;
                                        p8p1.d(0, 0, strO4, x340Var, qim0VarB);
                                        x340Var.r(false);
                                    } else {
                                        if (!(pkhVar instanceof mkh)) {
                                            throw p3d1.k(x340Var, -32837742, false);
                                        }
                                        x340Var.i0(-1012925959);
                                        qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                                        uwr uwrVar8 = cbx.a;
                                        qim0 qim0VarH = u291.h(uyn1.B(qim0VarF2, cbx.b(x340Var).b.d, 0.0f, 0.0f, 0.0f, 14), 32.0f);
                                        gfh0 gfh0VarC2 = t1c.c(een.d, false);
                                        int iHashCode2 = Long.hashCode(x340Var.T);
                                        xos0 xos0VarM2 = x340Var.m();
                                        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
                                        hzj.A.getClass();
                                        if (j06Var == null) {
                                            tgp1.p();
                                            throw null;
                                        }
                                        x340Var.m0();
                                        if (x340Var.S) {
                                            x340Var.l(n4kVar);
                                        } else {
                                            x340Var.v0();
                                        }
                                        nko1.H(gfh0VarC2, x340Var, lljVar4);
                                        nko1.H(xos0VarM2, x340Var, lljVar3);
                                        x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                                        nko1.H(qim0VarE2, x340Var, lljVar);
                                        cvx cvxVar4 = cbx.b(x340Var).b;
                                        qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                                        z = false;
                                        rqo1.g(0, 0, x340Var, h2c.a.a(qim0VarZ, graVar));
                                        x340Var.r(true);
                                        x340Var.r(false);
                                    }
                                }
                            }
                        }
                        z = z2;
                    }
                    x340Var.r(z);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 1:
                gpb0 gpb0Var = (gpb0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var4 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (x340Var4.g(gpb0Var) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= x340Var4.e(iIntValue3) ? 32 : 16;
                }
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(i2 & 1, (i2 & 147) != 146)) {
                    xoh0 xoh0Var = (xoh0) list.get(iIntValue3);
                    x340Var5.i0(1801664564);
                    Iterator it = ((List) obj6).iterator();
                    int i8 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                        } else if (((xoh0) it.next()).a == xoh0Var.a) {
                            i3 = i8;
                        } else {
                            i8++;
                        }
                    }
                    boolean z9 = i3 >= 0;
                    LruCache lruCache = (LruCache) obj5;
                    q8n q8nVar = (q8n) obj7;
                    Integer numValueOf = z9 ? Integer.valueOf(i3) : null;
                    boolean z10 = z5 && !z9;
                    boolean zG4 = x340Var5.g(iu30Var) | x340Var5.g(xoh0Var);
                    Object objT7 = x340Var5.T();
                    if (zG4 || objT7 == fkj0.X) {
                        objT7 = new dvg0(iu30Var, xoh0Var, (byte) 3);
                        x340Var5.s0(objT7);
                    }
                    jch0.e(xoh0Var, lruCache, q8nVar, (qim0) null, z9, numValueOf, z10, (Function0) objT7, x340Var5, 0);
                    x340Var5.r(false);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            default:
                aqb0 aqb0Var2 = (aqb0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var6 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                iu30 iu30Var2 = (iu30) obj7;
                m4c m4cVar2 = fkj0.X;
                qpj1 qpj1Var = (qpj1) obj6;
                if ((iIntValue6 & 6) == 0) {
                    i4 = iIntValue6 | (x340Var6.g(aqb0Var2) ? 4 : 2);
                } else {
                    i4 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i4 |= x340Var6.e(iIntValue5) ? 32 : 16;
                }
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(i4 & 1, (i4 & 147) != 146)) {
                    hqk1 hqk1Var2 = (hqk1) list.get(iIntValue5);
                    x340Var7.i0(1170492904);
                    boolean zJ = u890.j(hqk1Var2.a, (String) obj5);
                    int i9 = (i4 & 112) ^ 48;
                    boolean zG5 = x340Var7.g(iu30Var) | x340Var7.h(zJ) | x340Var7.i(qpj1Var) | ((i9 > 32 && x340Var7.e(iIntValue5)) || (i4 & 48) == 32) | x340Var7.g(hqk1Var2);
                    Object objT8 = x340Var7.T();
                    if (zG5 || objT8 == m4cVar2) {
                        objT8 = new ow6(zJ, qpj1Var, iIntValue5, hqk1Var2, this.e);
                        z3 = zJ;
                        i5 = iIntValue5;
                        x340Var7.s0(objT8);
                    } else {
                        i5 = iIntValue5;
                        z3 = zJ;
                    }
                    Function0 function1 = (Function0) objT8;
                    if (z5) {
                        x340Var7.i0(1170882851);
                        z4 = false;
                        x340Var7.r(false);
                        hqk1Var = hqk1Var2;
                        function0 = null;
                    } else {
                        x340Var7.i0(1170908675);
                        boolean zI4 = x340Var7.i(qpj1Var) | ((i9 > 32 && x340Var7.e(i5)) || (i4 & 48) == 32) | x340Var7.g(iu30Var2) | x340Var7.g(hqk1Var2);
                        Object objT9 = x340Var7.T();
                        if (zI4 || objT9 == m4cVar2) {
                            hqk1Var = hqk1Var2;
                            objT9 = new ka0(qpj1Var, i5, iu30Var2, hqk1Var, (byte) 16);
                            x340Var7.s0(objT9);
                        } else {
                            hqk1Var = hqk1Var2;
                        }
                        z4 = false;
                        x340Var7.r(false);
                        function0 = (Function0) objT9;
                    }
                    zod.f(hqk1Var, z3, function1, function0, (qim0) null, x340Var7, 0);
                    x340Var7.r(z4);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
        }
    }

    public ymh(List list, List list2, LruCache lruCache, q8n q8nVar, boolean z, iu30 iu30Var) {
        this.b = list;
        this.c = list2;
        this.f = lruCache;
        this.g = q8nVar;
        this.d = z;
        this.e = iu30Var;
    }

    public ymh(List list, List list2, String str, boolean z, oih oihVar, iu30 iu30Var) {
        this.b = list;
        this.c = list2;
        this.f = str;
        this.d = z;
        this.g = oihVar;
        this.e = iu30Var;
    }
}
