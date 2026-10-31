package p;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hg31 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hg31(Object obj, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        te51 te51Var = (te51) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        ve51 ve51Var = (ve51) this.b;
        if ((iIntValue & 48) == 0) {
            iIntValue |= x340Var.g(te51Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (!x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
            x340Var2.b0();
        } else if (te51Var instanceof se51) {
            x340Var2.i0(1153516383);
            se51 se51Var = (se51) te51Var;
            otw.c((na9) ve51Var.g, new aob(se51Var.a, se51Var.b, se51Var.c, se51Var.d, se51Var.e), (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else if (te51Var instanceof qe51) {
            x340Var2.i0(1153884229);
            qe51 qe51Var = (qe51) te51Var;
            otw.c((hz5) ve51Var.f, new slb(qe51Var.a, qe51Var.b), (qim0) null, (ipb1) null, x340Var2, 64, 12);
            x340Var2.r(false);
        } else if (te51Var instanceof re51) {
            x340Var2.i0(1154099896);
            se80 se80Var = (se80) ve51Var.h;
            re51 re51Var = (re51) te51Var;
            String str = re51Var.a;
            otw.b(se80Var, new ne80("spotify:audiobook:inlinecard", str, new DynamicTagsMetadata(re51Var.a, (String) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null)), new joa0(str), (qim0) null, x340Var2, 0, 8);
            x340Var2.r(false);
        } else {
            if (!(te51Var instanceof pe51)) {
                throw p3d1.k(x340Var2, 1284135367, false);
            }
            x340Var2.i0(1154522643);
            x340Var2.r(false);
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        List listT0;
        x340 x340Var;
        boolean z;
        qim0 qim0Var;
        yxb0 yxb0Var;
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        lj51 lj51Var = (nj51) obj2;
        x340 x340Var2 = (b0k) obj4;
        ((Number) obj5).intValue();
        nl3 nl3Var = een.P0;
        if (lj51Var instanceof lj51) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            yxb0 yxb0Var2 = (yxb0) this.b;
            mbh mbhVarA = jbh.a(d36Var, nl3Var, x340Var2, 0);
            x340 x340Var3 = x340Var2;
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var2);
            hzj.A.getClass();
            x340 x340Var4 = x340Var2;
            if (x340Var4.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var4.m0();
            boolean z2 = x340Var4.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var4.l(n4kVar);
            } else {
                x340Var4.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar3);
            nko1.H(xos0VarM, x340Var2, lljVar2);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, lljVar);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, vu30Var);
            x340Var4.i0(1563970129);
            lj51 lj51Var2 = lj51Var;
            ArrayList arrayList = lj51Var2.b;
            int iC = l1d.C(lj51Var2.c);
            if (iC == 0) {
                listT0 = arrayList;
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                listT0 = o7h.T0(arrayList);
            }
            int i = 0;
            for (Object obj6 : listT0) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                jj51 jj51Var = (jj51) obj6;
                mbh mbhVarA2 = jbh.a(h36.c, nl3Var, x340Var2, 0);
                nl3 nl3Var2 = nl3Var;
                int i3 = i;
                int iHashCode2 = Long.hashCode(x340Var4.T);
                xos0 xos0VarM2 = x340Var4.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0Var2);
                hzj.A.getClass();
                x340Var4.m0();
                yxb0 yxb0Var3 = yxb0Var2;
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar3);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                nko1.H(Integer.valueOf(iHashCode2), x340Var2, lljVar);
                nko1.F(x340Var2);
                nko1.H(qim0VarE2, x340Var2, vu30Var);
                Integer num = jj51Var.a;
                if (num == null) {
                    x340Var4.i0(-2103890888);
                    x340Var4.r(false);
                    qim0Var = qim0Var2;
                    yxb0Var = yxb0Var3;
                } else {
                    x340Var4.i0(-2103890887);
                    int iIntValue = num.intValue();
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    qim0 qim0Var3 = qim0Var2;
                    qim0Var = qim0Var3;
                    yxb0Var3.e(i3, iIntValue, 0, x340Var2, uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7));
                    yxb0Var = yxb0Var3;
                    x340Var4.r(false);
                }
                boolean z3 = jj51Var.a != null;
                ArrayList arrayList2 = jj51Var.b;
                int i4 = lj51Var2.c;
                uwr uwrVar3 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var2).b;
                yxb0Var.f(z3, arrayList2, i4, uyn1.z(16.0f, 0.0f, 2, qim0Var), x340Var2, 0);
                x340Var4.r(true);
                qim0Var2 = qim0Var;
                yxb0Var2 = yxb0Var;
                i = i2;
                vu30Var = vu30Var;
                nl3Var = nl3Var2;
            }
            qim0 qim0Var4 = qim0Var2;
            x340Var4.r(false);
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r7h.W(((jj51) it.next()).b, arrayList3);
            }
            if (arrayList3.isEmpty()) {
                x340Var = x340Var4;
                z = true;
                x340Var.i0(1239440935);
                x340Var.r(false);
            } else {
                Iterator it2 = arrayList3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        vrv0 vrv0Var = ((ij51) it2.next()).c;
                        ArrayList arrayList4 = vrv0Var != null ? (ArrayList) vrv0Var.e : null;
                        if (arrayList4 == null || !arrayList4.contains(k4d1.a)) {
                            x340Var4 = x340Var4;
                        } else {
                            x340Var4.i0(1239163206);
                            String strO0 = cwl1.o0(x340Var2, 2131954628);
                            uwr uwrVar4 = cbx.a;
                            cvx cvxVar4 = cbx.b(x340Var2).b;
                            x340Var = x340Var4;
                            z = true;
                            uwo1.e(strO0, uyn1.z(16.0f, 0.0f, 2, qim0Var4), cbx.d(x340Var2).m, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
                            x340Var.r(false);
                        }
                    } else {
                        x340Var = x340Var4;
                        z = true;
                        x340Var.i0(1239440935);
                        x340Var.r(false);
                    }
                }
            }
            x340Var.r(z);
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        pp51 pp51Var = (pp51) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        ar30 ar30Var = (ar30) this.b;
        if (pp51Var.a.length() <= 0 || pp51Var.b.isEmpty()) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-772266696);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-773184451);
            mod.b(oi7.a.a(ar30Var.d), apo.r(1153134959, new jt41(pp51Var, ar30Var, (byte) 7), x340Var3), x340Var3, 56);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        up51 up51Var = (up51) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        String str = up51Var.c;
        String str2 = (str == null || ihc1.y0(str)) ? null : str;
        x340 x340Var2 = x340Var;
        if (str2 == null) {
            x340Var2.i0(1240646321);
            x340Var2.r(false);
        } else {
            x340Var2.i0(1240646322);
            yp51 yp51Var = (yp51) this.b;
            mod.b(oi7.a.a(yp51Var.d), apo.r(762507976, new pby0(up51Var, str2, iu30Var, yp51Var, (byte) 28), x340Var2), x340Var2, 56);
            x340Var2.r(false);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0075  */
    /* JADX WARN: Code duplicated, block: B:22:0x008f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0095 A[PHI: r31
      0x0095: PHI (r31v4 p.iu30) = (r31v2 p.iu30), (r31v5 p.iu30) binds: [B:23:0x0093, B:21:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2 A[PHI: r32
      0x00c2: PHI (r32v3 kotlin.jvm.functions.Function0) = (r32v1 kotlin.jvm.functions.Function0), (r32v4 kotlin.jvm.functions.Function0) binds: [B:37:0x00c0, B:35:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3  */
    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        long j;
        boolean z;
        x340 x340Var;
        Object objT;
        iu30 iu30Var;
        iu30 iu30Var2;
        boolean z2;
        Object objT2;
        Function0 function0;
        Function0 function1;
        boolean z3;
        Object objT3;
        boolean z4;
        Object objT4;
        qs51 qs51Var = (qs51) obj2;
        iu30 iu30Var3 = (iu30) obj3;
        x340 x340Var2 = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        long j2 = qs51Var.b;
        long j3 = qs51Var.d;
        long j4 = qs51Var.k;
        long j5 = qs51Var.l;
        c380 c380VarA = mqo1.A(qs51Var.j);
        boolean z5 = qs51Var.h;
        boolean z6 = qs51Var.i;
        boolean z7 = qs51Var.e;
        agv agvVar = qs51Var.n;
        boolean z8 = ((qhm) this.b).b;
        int i = (iIntValue & 896) ^ 384;
        if (i <= 256 || !x340Var2.g(iu30Var3)) {
            j = j2;
            if ((iIntValue & 384) != 256) {
                z = false;
            }
            x340Var = x340Var2;
            objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new n601(iu30Var3, (byte) 23);
                x340Var.s0(objT);
            }
            iu30Var = (iu30) objT;
            if (i > 256 || !x340Var.g(iu30Var3)) {
                iu30Var2 = iu30Var;
                if ((iIntValue & 384) != 256) {
                    z2 = false;
                }
                objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new wg31(iu30Var3, (byte) 24);
                    x340Var.s0(objT2);
                }
                function0 = (Function0) objT2;
                if (i > 256 || !x340Var.g(iu30Var3)) {
                    function1 = function0;
                    if ((iIntValue & 384) != 256) {
                        z3 = false;
                    }
                    objT3 = x340Var.T();
                    if (z3 || objT3 == m4cVar) {
                        objT3 = new wg31(iu30Var3, (byte) 25);
                        x340Var.s0(objT3);
                    }
                    Function0 function2 = (Function0) objT3;
                    z4 = (i <= 256 && x340Var.g(iu30Var3)) || (iIntValue & 384) == 256;
                    objT4 = x340Var.T();
                    if (z4 || objT4 == m4cVar) {
                        objT4 = new wg31(iu30Var3, (byte) 26);
                        x340Var.s0(objT4);
                    }
                    ft51.i(j, j3, j4, j5, iu30Var2, c380VarA, z5, z6, z7, agvVar, function1, (qim0) null, z8, function2, (Function0) objT4, x340Var, 0, 0, 2048);
                    return rih1.a;
                }
                function1 = function0;
                z3 = true;
                objT3 = x340Var.T();
                if (z3) {
                    objT3 = new wg31(iu30Var3, (byte) 25);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new wg31(iu30Var3, (byte) 25);
                    x340Var.s0(objT3);
                }
                Function0 function3 = (Function0) objT3;
                if (i <= 256) {
                }
                objT4 = x340Var.T();
                if (z4) {
                    objT4 = new wg31(iu30Var3, (byte) 26);
                    x340Var.s0(objT4);
                } else {
                    objT4 = new wg31(iu30Var3, (byte) 26);
                    x340Var.s0(objT4);
                }
                ft51.i(j, j3, j4, j5, iu30Var2, c380VarA, z5, z6, z7, agvVar, function1, (qim0) null, z8, function3, (Function0) objT4, x340Var, 0, 0, 2048);
                return rih1.a;
            }
            iu30Var2 = iu30Var;
            z2 = true;
            objT2 = x340Var.T();
            if (z2) {
                objT2 = new wg31(iu30Var3, (byte) 24);
                x340Var.s0(objT2);
            } else {
                objT2 = new wg31(iu30Var3, (byte) 24);
                x340Var.s0(objT2);
            }
            function0 = (Function0) objT2;
            if (i > 256) {
                function1 = function0;
                if ((iIntValue & 384) != 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                function1 = function0;
                if ((iIntValue & 384) != 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            objT3 = x340Var.T();
            if (z3) {
                objT3 = new wg31(iu30Var3, (byte) 25);
                x340Var.s0(objT3);
            } else {
                objT3 = new wg31(iu30Var3, (byte) 25);
                x340Var.s0(objT3);
            }
            Function0 function4 = (Function0) objT3;
            if (i <= 256) {
            }
            objT4 = x340Var.T();
            if (z4) {
                objT4 = new wg31(iu30Var3, (byte) 26);
                x340Var.s0(objT4);
            } else {
                objT4 = new wg31(iu30Var3, (byte) 26);
                x340Var.s0(objT4);
            }
            ft51.i(j, j3, j4, j5, iu30Var2, c380VarA, z5, z6, z7, agvVar, function1, (qim0) null, z8, function4, (Function0) objT4, x340Var, 0, 0, 2048);
            return rih1.a;
        }
        j = j2;
        z = true;
        x340Var = x340Var2;
        objT = x340Var.T();
        if (z) {
            objT = new n601(iu30Var3, (byte) 23);
            x340Var.s0(objT);
        } else {
            objT = new n601(iu30Var3, (byte) 23);
            x340Var.s0(objT);
        }
        iu30Var = (iu30) objT;
        if (i > 256) {
            iu30Var2 = iu30Var;
            if ((iIntValue & 384) != 256) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            iu30Var2 = iu30Var;
            if ((iIntValue & 384) != 256) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        objT2 = x340Var.T();
        if (z2) {
            objT2 = new wg31(iu30Var3, (byte) 24);
            x340Var.s0(objT2);
        } else {
            objT2 = new wg31(iu30Var3, (byte) 24);
            x340Var.s0(objT2);
        }
        function0 = (Function0) objT2;
        if (i > 256) {
            function1 = function0;
            if ((iIntValue & 384) != 256) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            function1 = function0;
            if ((iIntValue & 384) != 256) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        objT3 = x340Var.T();
        if (z3) {
            objT3 = new wg31(iu30Var3, (byte) 25);
            x340Var.s0(objT3);
        } else {
            objT3 = new wg31(iu30Var3, (byte) 25);
            x340Var.s0(objT3);
        }
        Function0 function5 = (Function0) objT3;
        if (i <= 256) {
        }
        objT4 = x340Var.T();
        if (z4) {
            objT4 = new wg31(iu30Var3, (byte) 26);
            x340Var.s0(objT4);
        } else {
            objT4 = new wg31(iu30Var3, (byte) 26);
            x340Var.s0(objT4);
        }
        ft51.i(j, j3, j4, j5, iu30Var2, c380VarA, z5, z6, z7, agvVar, function1, (qim0) null, z8, function5, (Function0) objT4, x340Var, 0, 0, 2048);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        rt51 rt51Var = (rt51) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        tt51 tt51Var = (tt51) this.b;
        crb crbVar = rt51Var.b;
        boolean z = rt51Var.a;
        x340 x340Var2 = x340Var;
        boolean zI = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var2.i(tt51Var);
        Object objT = x340Var2.T();
        if (zI || objT == fkj0.X) {
            objT = new rl21(iu30Var, tt51Var, (byte) 26);
            x340Var2.s0(objT);
        }
        vqb.a(crbVar, (qim0) null, z, (Function0) null, (Function0) objT, x340Var2, 0, 5);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        ev51 ev51Var = (fv51) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        gv51 gv51Var = (gv51) this.b;
        if (ev51Var instanceof ev51) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-1400451596);
            dxo1.e(ev51Var, iu30Var, gv51Var.a, (qim0) null, x340Var2, (iIntValue >> 3) & 126);
            x340Var2.r(false);
        } else {
            if (!(ev51Var instanceof dv51)) {
                throw p3d1.k(x340Var, -1400452684, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(-1400449094);
            zro1.n((dv51) ev51Var, iu30Var, gv51Var.a, (qim0) null, x340Var3, (iIntValue >> 3) & 126);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        String quantityString;
        String strF;
        int i;
        String str;
        Object obj6;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        wcv wcvVar = ((lv51) obj2).a;
        x340 x340Var = (b0k) obj4;
        boolean zG = x340Var.g(wcvVar);
        mv51 mv51Var = (mv51) this.b;
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            obj6 = objT;
            aru0 aru0Var = mv51Var.b;
            quc0 quc0Var = (quc0) aru0Var.c;
            Context context = (Context) aru0Var.b;
            if (wcvVar instanceof xcv) {
                xcv xcvVar = (xcv) wcvVar;
                int i2 = xcvVar.m;
                agc0 agc0Var = (agc0) aru0Var.d;
                String str2 = xcvVar.a;
                agc0Var.getClass();
                if (!str2.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") && !str2.equals("spotify:collection:tracks") && !str2.equals("spotify:internal:collection:tracks") && (!nhc1.Y(str2, "spotify:user:", false) || !nhc1.R(str2, ":collection", false))) {
                    int i3 = 2;
                    if (i2 != 2) {
                        String str3 = ebv.a;
                        Set set = s4b1.f;
                        blc0 blc0Var = uic.x(str2).c;
                        if (blc0Var == blc0.C4 || blc0Var == blc0.D4 || i2 == 1) {
                            strF = context.getString(2131955162);
                        } else if (!ebv.a(str2)) {
                            StringBuilder sb = new StringBuilder();
                            boolean z = xcvVar.j;
                            Map map = xcvVar.l;
                            if (!z) {
                                if (!xcvVar.i && (str = xcvVar.h) != null) {
                                    sb.append(context.getString(2131955140, str));
                                }
                                if (sb.length() > 0) {
                                    sb.append(" • ");
                                }
                                if (map.isEmpty()) {
                                    sb.append(context.getString(2131955160));
                                    break;
                                }
                                Iterator it = map.entrySet().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        sb.append(context.getString(2131955160));
                                        break;
                                    }
                                    if (((Number) ((Map.Entry) it.next()).getValue()).intValue() != 0) {
                                        Integer num = (Integer) map.get(yhu0.f);
                                        if ((num != null ? num.intValue() : 0) <= 0) {
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            for (Map.Entry entry : map.entrySet()) {
                                                if (((Number) entry.getValue()).intValue() > 0) {
                                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                                }
                                            }
                                            ArrayList arrayList = new ArrayList(linkedHashMap.size());
                                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                                Resources resources = context.getResources();
                                                int iOrdinal = ((yhu0) entry2.getKey()).ordinal();
                                                if (iOrdinal == 0) {
                                                    i = 2131820666;
                                                } else if (iOrdinal == 1) {
                                                    i = 2131820665;
                                                } else if (iOrdinal != i3) {
                                                    i = iOrdinal != 3 ? 2131820667 : 2131820664;
                                                } else {
                                                    i = 2131820663;
                                                }
                                                arrayList.add(resources.getQuantityString(i, ((Number) entry2.getValue()).intValue(), entry2.getValue()));
                                                i3 = 2;
                                            }
                                            List listT0 = arrayList;
                                            if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                                                listT0 = o7h.T0(arrayList);
                                            }
                                            sb.append(o7h.y0(listT0, quc0Var.b(), (String) null, (String) null, (iu30) null, 62));
                                            break;
                                        }
                                        int iC1 = o7h.c1(map.values());
                                        sb.append(context.getResources().getQuantityString(2131820667, iC1, Integer.valueOf(iC1)));
                                        break;
                                    }
                                }
                            }
                            strF = sb.toString();
                        }
                        quantityString = strF;
                    }
                }
                quantityString = "";
            } else {
                if (!(wcvVar instanceof wcv)) {
                    eg.o();
                    return null;
                }
                wcv wcvVar2 = wcvVar;
                Resources resources2 = context.getResources();
                int i4 = wcvVar2.g;
                String quantityString2 = resources2.getQuantityString(2131820662, i4, Integer.valueOf(i4));
                Resources resources3 = context.getResources();
                int i5 = wcvVar2.f;
                quantityString = resources3.getQuantityString(2131820661, i5, Integer.valueOf(i5));
                if (i5 > 0 && i4 > 0) {
                    strF = f4i1.f(quantityString2, quc0Var.b(), quantityString);
                    quantityString = strF;
                } else if (i4 > 0) {
                    quantityString = quantityString2;
                } else if (i5 <= 0) {
                    quantityString = "";
                }
            }
            x340Var.s0(quantityString);
            obj6 = quantityString;
        }
        obj6 = objT;
        String str4 = (String) obj6;
        if (wcvVar instanceof xcv) {
            x340Var.i0(-1729036696);
            oho1.p((xcv) wcvVar, str4, iu30Var, x340Var, iIntValue & 896);
            x340Var.r(false);
        } else {
            if (!(wcvVar instanceof wcv)) {
                throw p3d1.k(x340Var, -1729038748, false);
            }
            x340Var.i0(-1729034042);
            oho1.f(wcvVar, str4, iu30Var, x340Var, iIntValue & 896);
            x340Var.r(false);
        }
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        otw.c((nxz0) ((i161) this.b).f.getValue(), (jxz0) obj2, (qim0) null, (ipb1) null, (b0k) obj4, iIntValue & 112, 12);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        mod.b(oi7.a.a(((qe31) this.b).c), apo.r(1766425444, new jt41((qob1) obj2, (iu30) obj3, (byte) 10), b0kVar), b0kVar, 56);
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        mod.b(oi7.a.a((gw70) ((ve51) this.b).f), apo.r(860366635, new jt41((rob1) obj2, (iu30) obj3, (byte) 11), b0kVar), b0kVar, 56);
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        q861 q861Var = (q861) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if (q861Var instanceof p861) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-1973029920);
            ((smp0) this.b).e((p861) q861Var, (qim0) null, x340Var2, (iIntValue >> 3) & 14);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-1972992441);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        kby kbyVar;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        c380 c380VarA = mqo1.A(((wb61) obj2).a.values());
        dc61 dc61Var = (dc61) this.b;
        ven0 ven0VarG = rwq.g(dc61Var.e.d(), (Object) null, (o8n) null, x340Var, 48, 2);
        x340 x340Var2 = x340Var;
        boolean zG = x340Var2.g((cxc0) ven0VarG.getValue());
        Object objT = x340Var2.T();
        if (zG || objT == fkj0.X) {
            cxc0 cxc0Var = (cxc0) ven0VarG.getValue();
            boolean z = false;
            if (cxc0Var != null && (kbyVar = cxc0Var.f) != null && dc61Var.h.c()) {
                Map map = kbyVar.q;
                List list = kbyVar.z;
                Set set = gc61.a;
                if (u890.j(map.get("is_promptable"), "true")) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (u890.j(((ll81) it.next()).a, "UPDATE_PROMPT")) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
            }
            objT = Boolean.valueOf(z);
            x340Var2.s0(objT);
        }
        dc61Var.e(8 | ((iIntValue >> 3) & 112), x340Var2, iu30Var, c380VarA, anm1.N("session_control_chips_section", nim0.a), ((Boolean) objT).booleanValue());
        return rih1.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        String strJ;
        Object obj6;
        k171 k171Var = (k171) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        r171 r171Var = (r171) this.b;
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(k171Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            j171 j171Var = k171Var.a;
            tom tomVar = j171Var.j;
            String str = tomVar.a;
            lpl lplVar = tomVar.f;
            String str2 = lplVar.a;
            zb71 zb71VarL = wro1.L(lplVar.b);
            String strH = zb71VarL != null ? zb71VarL.h() : null;
            String str3 = strH == null ? "" : strH;
            List listP0 = ihc1.P0(str3, new char[]{':'}, 6);
            if (2 < listP0.size()) {
                obj6 = listP0.get(2);
            } else {
                if (nzy.j(str2)) {
                    Set set = s4b1.f;
                    strJ = uic.x(str2).j();
                } else {
                    strJ = null;
                }
                if (strJ == null || !nzy.p.e(strJ)) {
                    strJ = null;
                }
                obj6 = strJ != null ? strJ : "";
            }
            String str4 = (String) obj6;
            boolean zG = x340Var2.g(str) | x340Var2.g(str2) | x340Var2.g(str3);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                dc31 dc31Var = r171Var.U0;
                uvk0 uvk0Var = (uvk0) r171Var.s1.getValue();
                uvk0Var.getClass();
                x6h1 x6h1VarC = uvk0Var.a.c();
                x6h1VarC.i.add(new a7h1("shareable_card", str, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                r6h1 r6h1Var = r6h1.c;
                l4m0 l4m0Var = new l4m0(new r6h1(kk0.l(y6h1VarA), (u8h1) null));
                gk31 gk31Var = new gk31(new tjf0(dc31Var, l4m0Var, str4, str3, str2, (byte) 18), new fk31(dc31Var, l4m0Var, str4, (byte) 0), new fk31(dc31Var, l4m0Var, str4, (byte) 1));
                x340Var2.s0(gk31Var);
                objT = gk31Var;
            }
            gk31 gk31Var2 = (gk31) objT;
            if (j171Var.h.equals(a171.a)) {
                x340Var2.i0(-1729119328);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1729115805);
                mod.b(hk31.a.a(gk31Var2), apo.r(-130595685, new gh61(r171Var, k171Var, j171Var, iu30Var, (byte) 3), x340Var2), x340Var2, 56);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:168:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:174:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:177:0x051c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0568  */
    /* JADX WARN: Code duplicated, block: B:181:0x056f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0575  */
    /* JADX WARN: Code duplicated, block: B:185:0x05af  */
    /* JADX WARN: Code duplicated, block: B:187:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:189:0x060f  */
    /* JADX WARN: Code duplicated, block: B:191:0x0616  */
    /* JADX WARN: Code duplicated, block: B:192:0x061a  */
    /* JADX WARN: Code duplicated, block: B:195:0x0637  */
    /* JADX WARN: Code duplicated, block: B:198:0x0642  */
    /* JADX WARN: Code duplicated, block: B:201:0x0649 A[PHI: r2
      0x0649: PHI (r2v60 p.iu30) = (r2v62 p.iu30), (r2v63 p.iu30) binds: [B:200:0x0647, B:196:0x063d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:202:0x064b  */
    /* JADX WARN: Code duplicated, block: B:205:0x0653  */
    /* JADX WARN: Code duplicated, block: B:208:0x0658  */
    /* JADX WARN: Code duplicated, block: B:214:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:217:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:293:0x085e  */
    /* JADX WARN: Code duplicated, block: B:294:0x086a  */
    /* JADX WARN: Code duplicated, block: B:296:0x0876  */
    /* JADX WARN: Code duplicated, block: B:297:0x087a  */
    /* JADX WARN: Code duplicated, block: B:319:0x08c7  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i;
        vu30 vu30Var;
        Function0 function0;
        int i2;
        boolean z;
        boolean z2;
        Integer num;
        int i3;
        String strU;
        boolean z3;
        Object objT;
        int i4;
        long j;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objT2;
        iu30 iu30Var;
        Function0 function1;
        boolean zG;
        Object objT3;
        boolean zBooleanValue;
        u5j1 u5j1Var;
        n4k n4kVar;
        iu30 iu30Var2;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        iu30 iu30Var3;
        boolean z7;
        boolean z8;
        Object objT4;
        m4c m4cVar;
        ven0 ven0VarS;
        boolean zI;
        Object objT5;
        jw31 jw31VarA2;
        int iHashCode2;
        xos0 xos0VarM2;
        qim0 qim0VarE2;
        gbx gbxVar;
        int i5;
        gbx gbxVar2;
        if5 if5VarO;
        gbx gbxVar3;
        boolean zI2;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        byte b2 = 4;
        byte b3 = 6;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                gg31 gg31Var = (gg31) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                Object obj7 = fkj0.X;
                ig31 ig31Var = (ig31) obj6;
                String str = gg31Var.c;
                if (gg31Var.w.equals(xf31.a)) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-1208579990);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(1188792967);
                    String strD = pcf.d(6, gg31Var.b, (String) null);
                    boolean zG2 = x340Var3.g(strD) | x340Var3.g(str);
                    Object objT6 = x340Var3.T();
                    if (zG2 || objT6 == obj7) {
                        objT6 = ig31Var.f.a(strD, str);
                        x340Var3.s0(objT6);
                    }
                    c101 c101Var = (c101) objT6;
                    boolean zG3 = x340Var3.g(strD);
                    Object objT7 = x340Var3.T();
                    if (zG3 || objT7 == obj7) {
                        ig31Var.h.getClass();
                        objT7 = new fqm(strD);
                        x340Var3.s0(objT7);
                    }
                    fqm fqmVar = (fqm) objT7;
                    String str2 = gg31Var.b;
                    boolean z9 = gg31Var.d;
                    String str3 = gg31Var.c;
                    apl aplVar = gg31Var.a;
                    z201 z201Var = ig31Var.c;
                    add addVar = ig31Var.t;
                    cxm.k(gg31Var, str2, str3, z9, z201Var, c101Var, fqmVar, ig31Var.d, ig31Var.e, ig31Var.g, ig31Var.X, aplVar, ig31Var.i, addVar.k(), gg31Var.i && addVar.m(), iu30Var4, (qim0) null, gg31Var.e, gg31Var.f, gg31Var.h, x340Var3, ((iIntValue >> 3) & 14) | 16777216, (iIntValue << 9) & 458752);
                    x340Var3.r(false);
                }
                return rih1Var;
            case 1:
                zk31 zk31Var = (zk31) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var4 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                vnr0 vnr0Var = zk31Var.b;
                yk31 yk31Var = zk31Var.c;
                boolean z10 = zk31Var.d;
                String str4 = zk31Var.e;
                String str5 = zk31Var.f;
                dzo1 dzo1Var = zk31Var.g;
                kj31 kj31Var = ((bl31) obj6).b;
                boolean z11 = (((iIntValue2 & 896) ^ 384) > 256 && x340Var4.g(iu30Var5)) || (iIntValue2 & 384) == 256;
                x340 x340Var5 = x340Var4;
                Object objT8 = x340Var5.T();
                if (z11 || objT8 == fkj0.X) {
                    objT8 = new wg31(iu30Var5, (byte) 1);
                    x340Var5.s0(objT8);
                }
                a8o.q(vnr0Var, yk31Var, z10, str4, str5, dzo1Var, kj31Var, (qim0) null, (Function0) objT8, x340Var5, 8);
                return rih1Var;
            case 2:
                ml31 ml31Var = (ml31) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var6 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                vnr0 vnr0Var2 = ml31Var.a;
                boolean z12 = ml31Var.b;
                vnr0 vnr0Var3 = ml31Var.c;
                int i6 = ml31Var.d;
                ll31 ll31Var = ml31Var.e;
                float f = ml31Var.f;
                boolean z13 = ml31Var.g;
                String str6 = ml31Var.h;
                dzo1 dzo1Var2 = ml31Var.i;
                kj31 kj31Var2 = ((ol31) obj6).b;
                boolean z14 = (((iIntValue3 & 896) ^ 384) > 256 && x340Var6.g(iu30Var6)) || (iIntValue3 & 384) == 256;
                x340 x340Var7 = x340Var6;
                Object objT9 = x340Var7.T();
                if (z14 || objT9 == fkj0.X) {
                    objT9 = new wg31(iu30Var6, (byte) 2);
                    x340Var7.s0(objT9);
                }
                apo.f(vnr0Var2, z12, vnr0Var3, i6, ll31Var, f, z13, str6, dzo1Var2, kj31Var2, (qim0) null, (Function0) objT9, x340Var7, 520);
                return rih1Var;
            case 3:
                gu31 gu31Var = (gu31) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var8 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                ki90 ki90Var = gu31Var.a;
                if ((iIntValue4 & 48) == 0) {
                    i = iIntValue4 | (x340Var8.g(gu31Var) ? 32 : 16);
                } else {
                    i = iIntValue4;
                }
                if ((iIntValue4 & 384) == 0) {
                    i |= x340Var8.i(iu30Var7) ? 256 : 128;
                }
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(i & 1, (i & 1169) != 1168)) {
                    smp0 smp0Var = (smp0) obj6;
                    if (ki90Var.c) {
                        x340Var9.i0(2066923194);
                        vu30 vu30VarR = apo.r(-20456943, new tc11(smp0Var, gu31Var, (byte) 23), x340Var9);
                        x340Var9.r(false);
                        vu30Var = vu30VarR;
                    } else {
                        x340Var9.i0(2067380413);
                        x340Var9.r(false);
                        vu30Var = null;
                    }
                    if (ki90Var.c) {
                        x340Var9.i0(-693013911);
                        boolean z15 = (i & 896) == 256;
                        Object objT10 = x340Var9.T();
                        if (z15 || objT10 == m4cVar2) {
                            objT10 = new wg31(iu30Var7, b3);
                            x340Var9.s0(objT10);
                        }
                        x340Var9.r(false);
                        function0 = (Function0) objT10;
                    } else {
                        x340Var9.i0(-692950578);
                        x340Var9.r(false);
                        function0 = null;
                    }
                    zv31 zv31Var = ki90Var.a;
                    boolean z16 = (i & 896) == 256;
                    Object objT11 = x340Var9.T();
                    if (z16 || objT11 == m4cVar2) {
                        objT11 = new wg31(iu30Var7, (byte) 5);
                        x340Var9.s0(objT11);
                    }
                    tm80.m(zv31Var, (Function0) objT11, function0, vu30Var, (qim0) null, x340Var9, 0);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 4:
                hu31 hu31Var = (hu31) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                if ((iIntValue5 & 48) == 0) {
                    i2 = iIntValue5 | (x340Var10.g(hu31Var) ? 32 : 16);
                } else {
                    i2 = iIntValue5;
                }
                if ((iIntValue5 & 384) == 0) {
                    i2 |= x340Var10.i(iu30Var8) ? 256 : 128;
                }
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    ((ru31) obj6).i(hu31Var, iu30Var8, x340Var11, (i2 >> 3) & 126);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 5:
                nz31 nz31Var = (nz31) obj2;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                et90 et90Var = (et90) obj6;
                jz31 jz31Var = nz31Var.b;
                String str7 = nz31Var.a;
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= x340Var12.g(nz31Var) ? 32 : 16;
                }
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue6 & 1, (iIntValue6 & 1041) != 1040)) {
                    xwa xwaVarF = fae1.F(x340Var13);
                    int i7 = iIntValue6 >> 3;
                    Object[] objArr = {str7};
                    Object objT12 = x340Var13.T();
                    Object obj8 = fkj0.X;
                    if (objT12 == obj8) {
                        objT12 = n521.b1;
                        x340Var13.s0(objT12);
                    }
                    long jLongValue = ((Number) k5p1.s(objArr, (Function0) objT12, x340Var13, 48)).longValue();
                    boolean zE = x340Var13.e(jz31Var.ordinal()) | x340Var13.g(str7);
                    Object objT13 = x340Var13.T();
                    if (zE || objT13 == obj8) {
                        objT13 = v8r.q((Object) null);
                        x340Var13.s0(objT13);
                    }
                    ven0 ven0Var = (ven0) objT13;
                    boolean zG4 = x340Var13.g(ven0Var);
                    Object objT14 = x340Var13.T();
                    if (zG4 || objT14 == obj8) {
                        objT14 = new mz31(ven0Var);
                        x340Var13.s0(objT14);
                    }
                    mz31 mz31Var = (mz31) objT14;
                    Long lValueOf = Long.valueOf(jLongValue);
                    int i8 = iIntValue6;
                    boolean zG5 = ((((i7 & 14) ^ 6) > 4 && x340Var13.g(nz31Var)) || (i7 & 6) == 4) | x340Var13.g(mz31Var) | x340Var13.i(et90Var) | x340Var13.f(jLongValue);
                    Object objT15 = x340Var13.T();
                    if (zG5 || objT15 == obj8) {
                        objT15 = new p18(mz31Var, et90Var, nz31Var, jLongValue, (lnm) null, (byte) 5);
                        x340Var13.s0(objT15);
                    }
                    qxd0.r(str7, jz31Var, lValueOf, (vu30) objT15, x340Var13);
                    und.a(xwaVarF, u291.d(nim0Var, 1.0f), 0.0f, apo.r(-1586688180, new tc11(mz31Var, nz31Var, (byte) 24), x340Var13), x340Var13, 3120, 4);
                    boolean zI3 = x340Var13.i(et90Var) | x340Var13.g(mz31Var) | x340Var13.g(xwaVarF) | ((i8 & 112) == 32);
                    Object objT16 = x340Var13.T();
                    if (zI3 || objT16 == obj8) {
                        objT16 = new elu0(et90Var, mz31Var, xwaVarF, nz31Var, (lnm) null, (byte) 27);
                        x340Var13.s0(objT16);
                    }
                    qxd0.r(str7, jz31Var, mz31Var, (vu30) objT16, x340Var13);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 6:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(1208851324, new hl11((t541) obj2, (n0o) obj6, (iu30) obj3, (byte) 16), b0kVar), b0kVar, 3078, 6);
                return rih1Var;
            case 7:
                v941 v941Var = (v941) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                if (v941Var instanceof u941) {
                    x340 x340Var15 = x340Var14;
                    x340Var15.i0(-1521894891);
                    bs51.g(x340Var15, 0);
                    x340Var15.r(false);
                } else {
                    if (!(v941Var instanceof t941)) {
                        throw p3d1.k(x340Var14, -1521895186, false);
                    }
                    x340 x340Var16 = x340Var14;
                    x340Var16.i0(65964264);
                    nm1 nm1Var = (nm1) obj6;
                    t941 t941Var = (t941) v941Var;
                    dk3 dk3Var = t941Var.d;
                    ck3 ck3Var = dk3Var instanceof ck3 ? (ck3) dk3Var : null;
                    if (ck3Var == null) {
                        z2 = false;
                    } else {
                        agc0 agc0Var = (agc0) nm1Var.g;
                        String str8 = ck3Var.a;
                        agc0Var.getClass();
                        if (str8.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str8.equals("spotify:collection:tracks") || str8.equals("spotify:internal:collection:tracks")) {
                            z2 = true;
                        } else {
                            z = false;
                            z2 = nhc1.Y(str8, "spotify:user:", false) && nhc1.R(str8, ":collection", false);
                        }
                        num = t941Var.b;
                        if (num == null) {
                            x340Var16.i0(66197383);
                            x340Var16.r(z);
                            strU = null;
                        } else {
                            x340Var16.i0(66197384);
                            int iIntValue8 = num.intValue();
                            if (z2) {
                                i3 = 2131820891;
                            } else {
                                i3 = 2131820890;
                            }
                            strU = cwl1.U(i3, iIntValue8, new Object[]{Integer.valueOf(iIntValue8)}, x340Var16);
                            x340Var16.r(false);
                        }
                        String str9 = t941Var.a;
                        String str10 = t941Var.c;
                        z3 = ((((iIntValue7 & 896) ^ 384) <= 256 && x340Var16.g(iu30Var9)) || (iIntValue7 & 384) == 256) | ((((iIntValue7 & 112) ^ 48) <= 32 && x340Var16.i(v941Var)) || (iIntValue7 & 48) == 32);
                        objT = x340Var16.T();
                        if (z3 || objT == fkj0.X) {
                            objT = new rl21(iu30Var9, v941Var, (byte) 8);
                            x340Var16.s0(objT);
                        }
                        bs51.b(0, str9, strU, str10, (Function0) objT, x340Var16);
                        x340Var16.r(false);
                    }
                    z = false;
                    num = t941Var.b;
                    if (num == null) {
                        x340Var16.i0(66197383);
                        x340Var16.r(z);
                        strU = null;
                    } else {
                        x340Var16.i0(66197384);
                        int iIntValue9 = num.intValue();
                        if (z2) {
                            i3 = 2131820891;
                        } else {
                            i3 = 2131820890;
                        }
                        strU = cwl1.U(i3, iIntValue9, new Object[]{Integer.valueOf(iIntValue9)}, x340Var16);
                        x340Var16.r(false);
                    }
                    String str11 = t941Var.a;
                    String str12 = t941Var.c;
                    z3 = ((((iIntValue7 & 896) ^ 384) <= 256 && x340Var16.g(iu30Var9)) || (iIntValue7 & 384) == 256) | ((((iIntValue7 & 112) ^ 48) <= 32 && x340Var16.i(v941Var)) || (iIntValue7 & 48) == 32);
                    objT = x340Var16.T();
                    if (z3) {
                        objT = new rl21(iu30Var9, v941Var, (byte) 8);
                        x340Var16.s0(objT);
                    } else {
                        objT = new rl21(iu30Var9, v941Var, (byte) 8);
                        x340Var16.s0(objT);
                    }
                    bs51.b(0, str11, strU, str12, (Function0) objT, x340Var16);
                    x340Var16.r(false);
                }
                return rih1Var;
            case 8:
                int iIntValue10 = ((Number) obj5).intValue();
                nyn1.t((ru41) obj2, ((vu41) obj6).a, (qim0) null, (iu30) obj3, (b0k) obj4, ((iIntValue10 << 3) & 7168) | ((iIntValue10 >> 3) & 14));
                return rih1Var;
            case 9:
                n251 n251Var = (n251) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var17 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                q251 q251Var = (q251) obj6;
                if ((iIntValue11 & 48) == 0) {
                    i4 = iIntValue11 | (x340Var17.g(n251Var) ? 32 : 16);
                } else {
                    i4 = iIntValue11;
                }
                if ((iIntValue11 & 384) == 0) {
                    i4 |= x340Var17.i(iu30Var10) ? 256 : 128;
                }
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    Object objT17 = x340Var18.T();
                    m4c m4cVar3 = fkj0.X;
                    if (objT17 == m4cVar3) {
                        objT17 = v8r.q("");
                        x340Var18.s0(objT17);
                    }
                    ven0 ven0Var2 = (ven0) objT17;
                    y7e1 y7e1VarD = c4p1.D(0, 2, (String) ven0Var2.getValue(), x340Var18);
                    int i9 = i4 & 896;
                    boolean zG6 = x340Var18.g(y7e1VarD) | (i9 == 256);
                    Object objT18 = x340Var18.T();
                    if (zG6 || objT18 == m4cVar3) {
                        objT18 = new irn(y7e1VarD, iu30Var10, ven0Var2);
                        x340Var18.s0(objT18);
                    }
                    Function0 function2 = (Function0) objT18;
                    boolean zI4 = x340Var18.i(q251Var) | (i9 == 256);
                    Object objT19 = x340Var18.T();
                    if (zI4 || objT19 == m4cVar3) {
                        objT19 = new v721((Object) q251Var, (Object) iu30Var10, (Object) ven0Var2, (byte) 23);
                        x340Var18.s0(objT19);
                    }
                    ozn1.i(y7e1VarD, function2, (iu30) objT19, (qim0) null, x340Var18, 48);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 10:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                uwr uwrVar = cbx.a;
                f451 f451Var = (f451) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var19 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                fra fraVar = een.N0;
                if (f451Var.b) {
                    x340 x340Var20 = x340Var19;
                    x340Var20.i0(-1215414858);
                    long jA = cbx.a(x340Var20).a.a.a();
                    x340Var20.r(false);
                    j = jA;
                } else {
                    x340 x340Var21 = x340Var19;
                    x340Var21.i0(-1215413482);
                    j = cbx.a(x340Var21).a.c;
                    x340Var21.r(false);
                }
                Object[] objArr2 = new Object[0];
                x340 x340Var22 = x340Var19;
                Object objT20 = x340Var22.T();
                j06 j06Var = x340Var22.a;
                m4c m4cVar4 = fkj0.X;
                if (objT20 == m4cVar4) {
                    objT20 = oa41.O0;
                    x340Var22.s0(objT20);
                }
                ven0 ven0Var3 = (ven0) k5p1.s(objArr2, (Function0) objT20, x340Var22, 48);
                y7e1 y7e1VarD2 = c4p1.D(0, 2, f451Var.a, x340Var22);
                k6a1 k6a1Var = (k6a1) x340Var22.k(t4k.q);
                g451 g451Var = (g451) obj6;
                Object objT21 = x340Var22.T();
                if (objT21 == m4cVar4) {
                    objT21 = g451Var.b.a(new n601(iu30Var11, (byte) 19));
                    x340Var22.s0(objT21);
                }
                dha1 dha1Var = (dha1) objT21;
                boolean zI5 = x340Var22.i(ven0Var3) | x340Var22.i(k6a1Var) | x340Var22.i(y7e1VarD2);
                int i10 = (iIntValue12 & 896) ^ 384;
                if (i10 <= 256 || !x340Var22.g(iu30Var11)) {
                    z4 = zI5;
                    if ((iIntValue12 & 384) != 256) {
                        z5 = false;
                    }
                    z6 = z4 | z5;
                    objT2 = x340Var22.T();
                    if (!z6 || objT2 == m4cVar4) {
                        objT2 = new odp0(ven0Var3, k6a1Var, y7e1VarD2, iu30Var11, (byte) 16);
                        iu30Var = iu30Var11;
                        x340Var22.s0(objT2);
                    } else {
                        iu30Var = iu30Var11;
                    }
                    function1 = (Function0) objT2;
                    boolean zBooleanValue2 = ((Boolean) ven0Var3.getValue()).booleanValue();
                    zG = x340Var22.g(function1);
                    objT3 = x340Var22.T();
                    if (zG || objT3 == m4cVar4) {
                        objT3 = new us21(function1, (byte) 20);
                        x340Var22.s0(objT3);
                    }
                    q3p1.b(0, 0, (Function0) objT3, x340Var22, zBooleanValue2);
                    zBooleanValue = ((Boolean) ven0Var3.getValue()).booleanValue();
                    u5j1Var = d4o1.a;
                    n4kVar = hmb0.t1;
                    if (zBooleanValue) {
                        x340Var22.i0(977573723);
                        qim0 qim0VarF = dug.f(u291.f(nim0Var, 1.0f), j, u5j1Var);
                        cvx cvxVar = cbx.b(x340Var22).b;
                        cvx cvxVar2 = cbx.b(x340Var22).b;
                        cvx cvxVar3 = cbx.b(x340Var22).b;
                        qim0 qim0VarB = uyn1.B(qim0VarF, 8.0f, 0.0f, 16.0f, 8.0f, 2);
                        jw31VarA2 = ew31.a(h36.a, fraVar, x340Var22, 0);
                        iHashCode2 = Long.hashCode(x340Var22.T);
                        xos0VarM2 = x340Var22.m();
                        qim0VarE2 = zr7.E(x340Var22, qim0VarB);
                        hzj.A.getClass();
                        if (j06Var != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var22.m0();
                        if (x340Var22.S) {
                            x340Var22.l(n4kVar);
                        } else {
                            x340Var22.v0();
                        }
                        nko1.H(jw31VarA2, x340Var22, lljVar4);
                        nko1.H(xos0VarM2, x340Var22, lljVar3);
                        x0d.q(iHashCode2, x340Var22, lljVar2, x340Var22);
                        nko1.H(qim0VarE2, x340Var22, lljVar);
                        j1e1.a(0, function1, x340Var22, anm1.N("dsl_cancel_search_button", nim0Var));
                        rzn1.d(y7e1VarD2, anm1.N("dsl_find_playlist", new wnb0(1.0f, true)), x340Var22, 0);
                        x340Var22.r(true);
                        x340Var22.r(false);
                        m4cVar = m4cVar4;
                        iu30Var3 = iu30Var;
                    } else {
                        x340Var22.i0(978280864);
                        cvx cvxVar4 = cbx.b(x340Var22).b;
                        iu30Var2 = iu30Var;
                        d36 d36Var = new d36(12.0f, true, new um5(false));
                        qim0 qim0VarF2 = dug.f(u291.f(nim0Var, 1.0f), j, u5j1Var);
                        cvx cvxVar5 = cbx.b(x340Var22).b;
                        cvx cvxVar6 = cbx.b(x340Var22).b;
                        qim0 qim0VarY = uyn1.y(qim0VarF2, 16.0f, 12.0f);
                        jw31VarA = ew31.a(d36Var, fraVar, x340Var22, 0);
                        iHashCode = Long.hashCode(x340Var22.T);
                        xos0VarM = x340Var22.m();
                        qim0VarE = zr7.E(x340Var22, qim0VarY);
                        hzj.A.getClass();
                        if (j06Var != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var22.m0();
                        if (x340Var22.S) {
                            x340Var22.l(n4kVar);
                        } else {
                            x340Var22.v0();
                        }
                        nko1.H(jw31VarA, x340Var22, lljVar4);
                        nko1.H(xos0VarM, x340Var22, lljVar3);
                        x0d.q(iHashCode, x340Var22, lljVar2, x340Var22);
                        wnb0 wnb0VarQ = kk0.q(x340Var22, qim0VarE, lljVar, 1.0f, true);
                        boolean zI6 = x340Var22.i(ven0Var3);
                        if (i10 > 256) {
                            iu30Var3 = iu30Var2;
                            if (!x340Var22.g(iu30Var3)) {
                                z7 = true;
                            }
                            z8 = zI6 | z7;
                            objT4 = x340Var22.T();
                            if (z8) {
                                m4cVar = m4cVar4;
                            } else {
                                m4cVar = m4cVar4;
                                if (objT4 == m4cVar) {
                                }
                                rzn1.e(0, (Function0) objT4, x340Var22, wnb0VarQ);
                                otw.c(dha1Var, new cha1(), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                                x340Var22.r(true);
                                x340Var22.r(false);
                            }
                            objT4 = new rc21(iu30Var3, ven0Var3);
                            x340Var22.s0(objT4);
                            rzn1.e(0, (Function0) objT4, x340Var22, wnb0VarQ);
                            otw.c(dha1Var, new cha1(), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                            x340Var22.r(true);
                            x340Var22.r(false);
                        } else {
                            iu30Var3 = iu30Var2;
                        }
                        if ((iIntValue12 & 384) == 256) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        z8 = zI6 | z7;
                        objT4 = x340Var22.T();
                        if (z8) {
                            m4cVar = m4cVar4;
                            if (objT4 == m4cVar) {
                            }
                            rzn1.e(0, (Function0) objT4, x340Var22, wnb0VarQ);
                            otw.c(dha1Var, new cha1(), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                            x340Var22.r(true);
                            x340Var22.r(false);
                        } else {
                            m4cVar = m4cVar4;
                        }
                        objT4 = new rc21(iu30Var3, ven0Var3);
                        x340Var22.s0(objT4);
                        rzn1.e(0, (Function0) objT4, x340Var22, wnb0VarQ);
                        otw.c(dha1Var, new cha1(), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                        x340Var22.r(true);
                        x340Var22.r(false);
                    }
                    ven0VarS = v8r.s(iu30Var3, x340Var22);
                    Object value = ven0Var3.getValue();
                    zI = x340Var22.i(ven0Var3) | x340Var22.i(y7e1VarD2) | x340Var22.i(ven0VarS);
                    objT5 = x340Var22.T();
                    if (zI || objT5 == m4cVar) {
                        objT5 = new n641(ven0Var3, y7e1VarD2, ven0VarS, (lnm) null, (byte) 15);
                        x340Var22.s0(objT5);
                    }
                    qxd0.t(value, x340Var22, (vu30) objT5);
                    return rih1Var;
                }
                z4 = zI5;
                z5 = true;
                z6 = z4 | z5;
                objT2 = x340Var22.T();
                if (z6) {
                    objT2 = new odp0(ven0Var3, k6a1Var, y7e1VarD2, iu30Var11, (byte) 16);
                    iu30Var = iu30Var11;
                    x340Var22.s0(objT2);
                } else {
                    objT2 = new odp0(ven0Var3, k6a1Var, y7e1VarD2, iu30Var11, (byte) 16);
                    iu30Var = iu30Var11;
                    x340Var22.s0(objT2);
                }
                function1 = (Function0) objT2;
                boolean zBooleanValue3 = ((Boolean) ven0Var3.getValue()).booleanValue();
                zG = x340Var22.g(function1);
                objT3 = x340Var22.T();
                if (zG) {
                    objT3 = new us21(function1, (byte) 20);
                    x340Var22.s0(objT3);
                } else {
                    objT3 = new us21(function1, (byte) 20);
                    x340Var22.s0(objT3);
                }
                q3p1.b(0, 0, (Function0) objT3, x340Var22, zBooleanValue3);
                zBooleanValue = ((Boolean) ven0Var3.getValue()).booleanValue();
                u5j1Var = d4o1.a;
                n4kVar = hmb0.t1;
                if (zBooleanValue) {
                    x340Var22.i0(977573723);
                    qim0 qim0VarF3 = dug.f(u291.f(nim0Var, 1.0f), j, u5j1Var);
                    cvx cvxVar7 = cbx.b(x340Var22).b;
                    cvx cvxVar8 = cbx.b(x340Var22).b;
                    cvx cvxVar9 = cbx.b(x340Var22).b;
                    qim0 qim0VarB2 = uyn1.B(qim0VarF3, 8.0f, 0.0f, 16.0f, 8.0f, 2);
                    jw31VarA2 = ew31.a(h36.a, fraVar, x340Var22, 0);
                    iHashCode2 = Long.hashCode(x340Var22.T);
                    xos0VarM2 = x340Var22.m();
                    qim0VarE2 = zr7.E(x340Var22, qim0VarB2);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var22.m0();
                    if (x340Var22.S) {
                        x340Var22.l(n4kVar);
                    } else {
                        x340Var22.v0();
                    }
                    nko1.H(jw31VarA2, x340Var22, lljVar4);
                    nko1.H(xos0VarM2, x340Var22, lljVar3);
                    x0d.q(iHashCode2, x340Var22, lljVar2, x340Var22);
                    nko1.H(qim0VarE2, x340Var22, lljVar);
                    j1e1.a(0, function1, x340Var22, anm1.N("dsl_cancel_search_button", nim0Var));
                    rzn1.d(y7e1VarD2, anm1.N("dsl_find_playlist", new wnb0(1.0f, true)), x340Var22, 0);
                    x340Var22.r(true);
                    x340Var22.r(false);
                    m4cVar = m4cVar4;
                    iu30Var3 = iu30Var;
                } else {
                    x340Var22.i0(978280864);
                    cvx cvxVar10 = cbx.b(x340Var22).b;
                    iu30Var2 = iu30Var;
                    d36 d36Var2 = new d36(12.0f, true, new um5(false));
                    qim0 qim0VarF4 = dug.f(u291.f(nim0Var, 1.0f), j, u5j1Var);
                    cvx cvxVar11 = cbx.b(x340Var22).b;
                    cvx cvxVar12 = cbx.b(x340Var22).b;
                    qim0 qim0VarY2 = uyn1.y(qim0VarF4, 16.0f, 12.0f);
                    jw31VarA = ew31.a(d36Var2, fraVar, x340Var22, 0);
                    iHashCode = Long.hashCode(x340Var22.T);
                    xos0VarM = x340Var22.m();
                    qim0VarE = zr7.E(x340Var22, qim0VarY2);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var22.m0();
                    if (x340Var22.S) {
                        x340Var22.l(n4kVar);
                    } else {
                        x340Var22.v0();
                    }
                    nko1.H(jw31VarA, x340Var22, lljVar4);
                    nko1.H(xos0VarM, x340Var22, lljVar3);
                    x0d.q(iHashCode, x340Var22, lljVar2, x340Var22);
                    wnb0 wnb0VarQ2 = kk0.q(x340Var22, qim0VarE, lljVar, 1.0f, true);
                    boolean zI7 = x340Var22.i(ven0Var3);
                    if (i10 > 256) {
                        iu30Var3 = iu30Var2;
                        if (!x340Var22.g(iu30Var3)) {
                            z7 = true;
                        }
                        z8 = zI7 | z7;
                        objT4 = x340Var22.T();
                        if (z8) {
                            m4cVar = m4cVar4;
                            if (objT4 == m4cVar) {
                            }
                            rzn1.e(0, (Function0) objT4, x340Var22, wnb0VarQ2);
                            otw.c(dha1Var, new cha1(), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                            x340Var22.r(true);
                            x340Var22.r(false);
                        } else {
                            m4cVar = m4cVar4;
                        }
                        objT4 = new rc21(iu30Var3, ven0Var3);
                        x340Var22.s0(objT4);
                        rzn1.e(0, (Function0) objT4, x340Var22, wnb0VarQ2);
                        otw.c(dha1Var, new cha1(), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                        x340Var22.r(true);
                        x340Var22.r(false);
                    } else {
                        iu30Var3 = iu30Var2;
                    }
                    if ((iIntValue12 & 384) == 256) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = zI7 | z7;
                    objT4 = x340Var22.T();
                    if (z8) {
                        m4cVar = m4cVar4;
                        if (objT4 == m4cVar) {
                        }
                        rzn1.e(0, (Function0) objT4, x340Var22, wnb0VarQ2);
                        otw.c(dha1Var, new cha1(), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                        x340Var22.r(true);
                        x340Var22.r(false);
                    } else {
                        m4cVar = m4cVar4;
                    }
                    objT4 = new rc21(iu30Var3, ven0Var3);
                    x340Var22.s0(objT4);
                    rzn1.e(0, (Function0) objT4, x340Var22, wnb0VarQ2);
                    otw.c(dha1Var, new cha1(), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                    x340Var22.r(true);
                    x340Var22.r(false);
                }
                ven0VarS = v8r.s(iu30Var3, x340Var22);
                Object value2 = ven0Var3.getValue();
                zI = x340Var22.i(ven0Var3) | x340Var22.i(y7e1VarD2) | x340Var22.i(ven0VarS);
                objT5 = x340Var22.T();
                if (zI) {
                    objT5 = new n641(ven0Var3, y7e1VarD2, ven0VarS, (lnm) null, (byte) 15);
                    x340Var22.s0(objT5);
                } else {
                    objT5 = new n641(ven0Var3, y7e1VarD2, ven0VarS, (lnm) null, (byte) 15);
                    x340Var22.s0(objT5);
                }
                qxd0.t(value2, x340Var22, (vu30) objT5);
                return rih1Var;
            case 11:
                fa51 fa51Var = (fa51) obj2;
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var23 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                m4c m4cVar5 = fkj0.X;
                if ((iIntValue13 & 48) == 0) {
                    if ((iIntValue13 & 64) == 0) {
                        gbxVar = null;
                        zI2 = x340Var23.g(fa51Var);
                    } else {
                        gbxVar = null;
                        zI2 = x340Var23.i(fa51Var);
                    }
                    i5 = (zI2 ? 32 : 16) | iIntValue13;
                } else {
                    gbxVar = null;
                    i5 = iIntValue13;
                }
                if ((iIntValue13 & 384) == 0) {
                    i5 |= x340Var23.i(iu30Var12) ? 256 : 128;
                }
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(i5 & 1, (i5 & 1169) != 1168)) {
                    wq61 wq61Var = fa51Var.b;
                    jgb1 jgb1Var = (sq61) wq61Var.e;
                    if (fa51Var.d) {
                        x340Var24.i0(-264667283);
                        String strO0 = cwl1.o0(x340Var24, 2131962109);
                        boolean z17 = (i5 & 896) == 256;
                        Object objT22 = x340Var24.T();
                        if (z17 || objT22 == m4cVar5) {
                            objT22 = new wg31(iu30Var12, (byte) 17);
                            x340Var24.s0(objT22);
                        }
                        Function0 function3 = (Function0) objT22;
                        if (ihc1.y0(strO0)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        } else {
                            gbxVar2 = new gbx(new y50(strO0), function3);
                            x340Var24.r(false);
                        }
                        return gbxVar;
                    }
                    x340Var24.i0(-264505928);
                    x340Var24.r(false);
                    gbxVar2 = gbxVar;
                    if (!(jgb1Var instanceof jgb1)) {
                        if (jgb1Var instanceof vqo) {
                            if5VarO = tro1.o(((vqo) jgb1Var).b);
                        } else {
                            eg.o();
                        }
                        return gbxVar;
                    }
                    jgb1 jgb1Var2 = jgb1Var;
                    if5VarO = new if5(jgb1Var2.f, (String) null, jgb1Var2.g, (hf5) null, 8);
                    j2i j2iVarA = if5VarO.a((qim0) null, (lee1) null, (u7h) null, fa51Var.c, x340Var24, 7);
                    if (gbxVar2 == null) {
                        x340Var24.i0(-264120661);
                        x340Var24.r(false);
                        gbxVar3 = gbxVar;
                    } else {
                        x340Var24.i0(-264120660);
                        gbx gbxVarR = apo.r(1327811662, new u451(gbxVar2, b2), x340Var24);
                        x340Var24.r(false);
                        gbxVar3 = gbxVarR;
                    }
                    String strO1 = cwl1.o0(x340Var24, 2131962111);
                    boolean z18 = (i5 & 896) == 256;
                    Object objT23 = x340Var24.T();
                    if (z18 || objT23 == m4cVar5) {
                        objT23 = new wg31(iu30Var12, (byte) 16);
                        x340Var24.s0(objT23);
                    }
                    Function0 function4 = (Function0) objT23;
                    if (ihc1.y0(strO1)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return gbxVar;
                    }
                    gbx gbxVar4 = new gbx(new y50(strO1), function4);
                    qim0 qim0VarF5 = u291.f(nim0Var, 1.0f);
                    boolean zG7 = x340Var24.g(gbxVar2);
                    Object objT24 = x340Var24.T();
                    if (zG7 || objT24 == m4cVar5) {
                        objT24 = new o70(gbxVar2, (byte) 4);
                        x340Var24.s0(objT24);
                    }
                    jto1.b(s161.b(qim0VarF5, true, (iu30) objT24), (uvx) null, (max) null, false, (idn0) null, (ga80) null, gbxVar4, (gbx) null, (xu30) null, (xu30) null, (xu30) null, j2iVarA, gbxVar3, apo.r(1098665390, new rt11((ga51) obj6, wq61Var, (byte) 11), x340Var24), (xu30) null, apo.r(-759742672, new rt11(jgb1Var, fa51Var, (byte) 12), x340Var24), x340Var24, 0, 199680, 18366);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 12:
                return a(obj, obj2, obj3, obj4, obj5);
            case 13:
                x340 x340Var25 = (b0k) obj4;
                ((Number) obj5).intValue();
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var25).e;
                long j2 = cbx.a(x340Var25).b.a;
                qim0 qim0VarF6 = u291.f(nim0Var, 1.0f);
                cvx cvxVar13 = cbx.b(x340Var25).b;
                String str13 = (String) obj6;
                qim0 qim0VarN = anm1.N("SectionHeaderElement:".concat(str13), uyn1.z(16.0f, 0.0f, 2, qim0VarF6));
                x340 x340Var26 = x340Var25;
                boolean zG8 = x340Var26.g(str13);
                Object objT25 = x340Var26.T();
                if (zG8 || objT25 == fkj0.X) {
                    objT25 = new sc21(str13, (byte) 25);
                    x340Var26.s0(objT25);
                }
                uwo1.e(str13, s161.b(qim0VarN, false, (iu30) objT25), lee1Var, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var26, 0, 0, 2032);
                return rih1Var;
            case 14:
                return d(obj, obj2, obj3, obj4, obj5);
            case 15:
                return e(obj, obj2, obj3, obj4, obj5);
            case 16:
                return f(obj, obj2, obj3, obj4, obj5);
            case 17:
                return g(obj, obj2, obj3, obj4, obj5);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((ngs0) obj6).i((lt51) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return h(obj, obj2, obj3, obj4, obj5);
            case 20:
                return i(obj, obj2, obj3, obj4, obj5);
            case 21:
                return j(obj, obj2, obj3, obj4, obj5);
            case 22:
                return k(obj, obj2, obj3, obj4, obj5);
            case 23:
                return m(obj, obj2, obj3, obj4, obj5);
            case 24:
                return n(obj, obj2, obj3, obj4, obj5);
            case 25:
                return o(obj, obj2, obj3, obj4, obj5);
            case 26:
                return p(obj, obj2, obj3, obj4, obj5);
            case 27:
                ((et90) obj6).f((iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 6) & 14);
                return rih1Var;
            case 28:
                return q(obj, obj2, obj3, obj4, obj5);
            default:
                g271 g271Var = (g271) obj2;
                x340 x340Var27 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                int i11 = g271Var.b;
                if ((iIntValue14 & 48) == 0) {
                    iIntValue14 |= (iIntValue14 & 64) == 0 ? x340Var27.g(g271Var) : x340Var27.i(g271Var) ? 32 : 16;
                }
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 1041) != 1040)) {
                    ya71 ya71Var = (ya71) x340Var28.k(nge0.a);
                    Class clsN = g271Var.a.b.a.a.n();
                    d0r d0rVar = (d0r) x340Var28.k(q271.a);
                    boolean zG9 = x340Var28.g(ya71Var) | x340Var28.g(clsN) | x340Var28.e(i11);
                    smp0 smp0Var2 = (smp0) obj6;
                    Object objT26 = x340Var28.T();
                    if (zG9 || objT26 == fkj0.X) {
                        x171 x171Var = (x171) i0p1.y(ya71Var, clsN);
                        cfd cfdVar = (cfd) smp0Var2.d;
                        Function0 function0B = x171Var.b(new oud((flw0) cfdVar.b, (wh71) cfdVar.c, i11));
                        objT26 = d0rVar != null ? (maa) szq.b(d0rVar, new pt61(function0B, (byte) 4)) : (maa) function0B.invoke();
                        x340Var28.s0(objT26);
                    }
                    maa maaVar = (maa) objT26;
                    otw.c(maaVar, g271Var, (qim0) null, wpb1.C("wrapper_share_card", maaVar, g271Var, x340Var28, ((iIntValue14 << 3) & 896) | 6, 8), x340Var28, iIntValue14 & 112, 4);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
        }
    }
}
