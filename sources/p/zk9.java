package p;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattServer;
import android.icu.text.NumberFormat;
import android.net.Uri;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zk9 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zk9(Object obj, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        pgb pgbVar = (pgb) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(pgbVar) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            lkb lkbVar = pgbVar.a;
            boolean zIsEnabled = ((dpb) ((rwj) this.b).g).isEnabled();
            boolean z = (i & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new nc8(iu30Var, (byte) 28);
                x340Var2.s0(objT);
            }
            lyg.b(0, (Function0) objT, lkbVar, x340Var2, (qim0) null, zIsEnabled);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        int iIntValue3 = ((Number) obj4).intValue();
        byte[] bArr = (byte[]) obj5;
        BluetoothGattServer bluetoothGattServer = (BluetoothGattServer) ((p811) this.b).a;
        if (bluetoothGattServer != null) {
            bluetoothGattServer.sendResponse(bluetoothDevice, iIntValue, iIntValue2, iIntValue3, bArr);
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ta0 ta0VarA;
        b90 b90Var;
        int i;
        b90 b90VarValueOf;
        boolean z;
        b90 b90Var2;
        b90 r3gVar;
        rxe1 rxe1Var;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        yxb0 yxb0Var = (yxb0) this.b;
        qsb qsbVar = (qsb) rwq.h((zob1) yxb0Var.d, x340Var, 0).getValue();
        if (qsbVar != null && (ta0VarA = qsbVar.a()) != null) {
            String str = ta0VarA.a;
            rrb rrbVar = ta0VarA.b;
            int i2 = rrbVar.c;
            c380<crb> c380Var = rrbVar.b;
            x340 x340Var2 = x340Var;
            boolean zG = x340Var2.g(str);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                Iterator it = c380Var.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        b90Var = null;
                        i3 = -1;
                        break;
                    }
                    brb brbVar = (crb) it.next();
                    b90Var = null;
                    if (brbVar instanceof zqb) {
                        z = false;
                    } else if (brbVar instanceof brb) {
                        z = brbVar.c;
                    } else {
                        if (!(brbVar instanceof arb)) {
                            eg.o();
                            return null;
                        }
                        z = ((arb) brbVar).b;
                    }
                    if (z) {
                        break;
                    }
                    i3++;
                }
                if (i3 == -1) {
                    b90VarValueOf = b90Var;
                } else {
                    int iC = l1d.C(i2);
                    if (iC == 0) {
                        i = 0;
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return b90Var;
                        }
                        i = 1;
                    }
                    b90VarValueOf = Integer.valueOf(i3 + i);
                }
                objT = new xtb0(b90VarValueOf != null ? b90VarValueOf.intValue() : 0, 0);
                x340Var2.s0(objT);
            } else {
                b90Var = null;
            }
            xtb0 xtb0Var = (xtb0) objT;
            ven0 ven0VarH = rwq.h((zob1) yxb0Var.c, x340Var2, 0);
            x340Var2.i0(528962085);
            smc0 smc0VarN = k4p1.n();
            boolean zI = x340Var2.i(yxb0Var) | x340Var2.i(ta0VarA);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new rqa(yxb0Var, ta0VarA, (byte) 7);
                x340Var2.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            int iC2 = l1d.C(i2);
            if (iC2 == 0) {
                b90Var2 = b90Var;
            } else {
                if (iC2 != 1) {
                    eg.o();
                    return b90Var;
                }
                b90Var2 = new b90(f4i1.e(str, ":bottom_actions_leading"), new j2i(18305592, new wm(function0, (byte) 15), true));
            }
            if (b90Var2 != null) {
                smc0VarN.add(b90Var2);
            }
            for (crb crbVar : c380Var) {
                smc0VarN.add(new b90(xcg1.i(str, ":", crbVar.getId()), new j2i(1330855723, new zt6(yxb0Var, ta0VarA, crbVar, (byte) 22), true)));
            }
            smc0 smc0VarK = k4p1.k(smc0VarN);
            x340Var2.r(false);
            c380 c380VarA = mqo1.A(smc0VarK);
            ymc0 ymc0Var = (ymc0) ven0VarH.getValue();
            if (ymc0Var == null || (rxe1Var = ymc0Var.b) == null) {
                r3gVar = b90Var;
            } else {
                kiv kivVar = t3g.a;
                r3gVar = new r3g(z4p1.e(rxe1Var.a), z4p1.e(rxe1Var.b));
            }
            t3g.a(r3gVar, apo.r(-1424921760, new zt6(qsbVar, c380VarA, xtb0Var, (byte) 23), x340Var2), x340Var2, 48);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        a4d a4dVar = (a4d) this.b;
        z3d z3dVar = (z3d) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if (z3dVar instanceof y3d) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(171703903);
            y3d y3dVar = (y3d) z3dVar;
            a4dVar.f(y3dVar.a, y3dVar.h, y3dVar.i, y3dVar.b, y3dVar.c, y3dVar.d, y3dVar.g, y3dVar.f, iu30Var, x340Var2, (iIntValue << 18) & 234881024);
            x340Var2.r(false);
        } else {
            if (!(z3dVar instanceof x3d)) {
                throw p3d1.k(x340Var, -548651565, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(172209606);
            a4dVar.e(((x3d) z3dVar).a, x340Var3, 0);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        kiv kivVar = oi7.a;
        pt ptVar = (pt) this.b;
        mod.b(kivVar.a((gw70) ptVar.e), apo.r(2114200125, new swc((x5d) obj2, ptVar, (iu30) obj3, (byte) 1), b0kVar), b0kVar, 56);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str;
        boolean z;
        e6d e6dVar = (e6d) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        a6d a6dVar = (a6d) this.b;
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = new Object();
            x340Var.s0(objT);
        }
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = v8r.q(Boolean.FALSE);
            x340Var.s0(objT2);
        }
        ven0 ven0Var = (ven0) objT2;
        prb1 prb1Var = e6dVar.c;
        if (prb1Var instanceof prb1) {
            str = prb1Var.d;
        } else if (prb1Var instanceof hvl1) {
            str = ((hvl1) prb1Var).d;
        } else {
            str = prb1Var instanceof i460 ? ((i460) prb1Var).e : null;
        }
        if (str != null && nhc1.Y(str, "spotify:", false)) {
            Uri uri = Uri.parse(ihc1.H0(str, "spotify:"));
            if (u890.j(uri.getPath(), "home") && u890.j(uri.getQueryParameter("facet"), "wrapped-chip")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        boolean zI = x340Var.i(a6dVar) | x340Var.i(objT);
        Object objT3 = x340Var.T();
        if (zI || objT3 == m4cVar) {
            objT3 = new ztb(a6dVar, objT, (byte) 10);
            x340Var.s0(objT3);
        }
        qxd0.i(objT, (iu30) objT3, x340Var);
        boolean zI2 = x340Var.i(a6dVar) | x340Var.i(objT) | x340Var.h(z) | x340Var.i(ven0Var);
        Object objT4 = x340Var.T();
        if (zI2 || objT4 == m4cVar) {
            objT4 = new zg6(a6dVar, objT, z, ven0Var, (byte) 1);
            x340Var.s0(objT4);
        }
        qxd0.S((Function0) objT4, x340Var);
        pt ptVar = a6dVar.f;
        int i = a6dVar.c;
        kly0 kly0Var = a6dVar.a;
        boolean zI3 = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var.i(ven0Var) | x340Var.i(a6dVar) | x340Var.i(objT) | x340Var.h(z);
        Object objT5 = x340Var.T();
        if (zI3 || objT5 == m4cVar) {
            objT5 = new o96(a6dVar, objT, z, iu30Var, ven0Var);
            x340Var.s0(objT5);
        }
        prn1.b(e6dVar, ptVar, i, kly0Var, jzn1.w(nim0.a, (iu30) objT5, x340Var), x340Var, (iIntValue >> 3) & 14);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        gra graVar = een.h;
        qim0 qim0VarN = anm1.N("cancel_subscription", u291.f(nim0.a, 1.0f));
        ehd ehdVar = (ehd) this.b;
        gfh0 gfh0VarC = t1c.c(graVar, false);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(gfh0VarC, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        p60 p60Var = new p60((String) null, (String) null, ehdVar.a, (String) null, (String) null, 0.0f, (String) null, (String) null, (String) null, 2, (k20) null, (String) null, 3579);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT = x340Var3.T();
        if (z || objT == fkj0.X) {
            objT = new gob(iu30Var, (byte) 7);
            x340Var3.s0(objT);
        }
        kln1.c(p60Var, (qim0) null, (Function0) objT, x340Var, 8, 10);
        x340Var3.r(true);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:324:0x0b3c  */
    /* JADX WARN: Code duplicated, block: B:325:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:328:0x0b49  */
    /* JADX WARN: Code duplicated, block: B:340:0x0b74  */
    /* JADX WARN: Code duplicated, block: B:92:0x03b5  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws ParseException {
        int i;
        m4c m4cVar;
        m4c m4cVar2;
        boolean z;
        Object objT;
        boolean zI;
        Object objT2;
        c10 c10Var;
        k1b k1bVar;
        boolean z2;
        List list;
        byte b = this.a;
        byte b2 = 19;
        byte b3 = 8;
        nim0 nim0Var = nim0.a;
        fjf1 fjf1Var = null;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                wk9 wk9Var = (wk9) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                int i2 = (iIntValue & 896) ^ 384;
                boolean z3 = (i2 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
                x340 x340Var2 = x340Var;
                Object objT3 = x340Var2.T();
                if (z3 || objT3 == m4cVar3) {
                    objT3 = new nc8(iu30Var, (byte) 2);
                    x340Var2.s0(objT3);
                }
                Function0 function0 = (Function0) objT3;
                boolean z4 = (i2 > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT4 = x340Var2.T();
                if (z4 || objT4 == m4cVar3) {
                    i = 3;
                    objT4 = new nc8(iu30Var, (byte) 3);
                    x340Var2.s0(objT4);
                } else {
                    i = 3;
                }
                c2p1.b(wk9Var, function0, (Function0) objT4, ((al9) obj6).d, x340Var2, ((iIntValue >> i) & 14) | 4096);
                return rih1Var;
            case 1:
                jl9 jl9Var = (jl9) obj2;
                b0k b0kVar = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                el9 el9Var = (el9) obj6;
                j2i j2iVarR = apo.r(-97250250, new hj8((Object) el9Var, (Object) jl9Var, (byte) 3), b0kVar);
                al9 al9Var = (al9) el9Var.i;
                d0r d0rVar = el9Var.b;
                yqg yqgVar = (yqg) el9Var.X;
                tv80 tv80Var = al9.i;
                f2p1.d(jl9Var, j2iVarR, al9Var, d0rVar, yqgVar, b0kVar, ((iIntValue2 >> 3) & 14) | 560);
                return rih1Var;
            case 2:
                int iIntValue3 = ((Number) obj5).intValue();
                nl9 nl9Var = (nl9) obj6;
                w460 w460Var = (w460) nl9Var.f;
                al9 al9Var2 = (al9) nl9Var.g;
                d0r d0rVar2 = (d0r) nl9Var.i;
                yqg yqgVar2 = (yqg) nl9Var.t;
                tv80 tv80Var2 = al9.i;
                g2p1.c((jl9) obj2, w460Var, al9Var2, d0rVar2, yqgVar2, (b0k) obj4, ((iIntValue3 >> 3) & 14) | 576);
                return rih1Var;
            case 3:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                hn9 hn9Var = (hn9) obj6;
                mod.b(oi7.a.a(hn9Var.b), apo.r(1126335157, new zt6(hn9Var, (fn9) obj2, (iu30) obj3, (byte) 15), b0kVar2), b0kVar2, 56);
                return rih1Var;
            case 4:
                qn9 qn9Var = (qn9) obj2;
                ((Number) obj5).intValue();
                t2p1.a(qn9Var.a, qn9Var.b, qn9Var.c, (xho) ((nm1) obj6).g, qn9Var.d, (qim0) null, (b0k) obj4, 4096);
                return rih1Var;
            case 5:
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(1429011038, new zt6((wn9) obj2, (iu30) obj3, (nl9) obj6, (byte) 16), b0kVar3), b0kVar3, 3078, 6);
                return rih1Var;
            case 6:
                zo9 zo9Var = (zo9) obj2;
                g3p1.a(zo9Var.a, zo9Var.b, (w2k1) ((tm) obj6).d, (iu30) obj3, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() << 3) & 7168);
                return rih1Var;
            case 7:
                tq9 tq9Var = (tq9) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                int iIntValue4 = ((Number) obj5).intValue();
                List list2 = tq9Var.e;
                Long l = tq9Var.b;
                tm tmVar = (tm) obj6;
                x340 x340Var3 = (b0k) obj4;
                Object objT5 = x340Var3.T();
                m4c m4cVar4 = fkj0.X;
                if (objT5 == m4cVar4) {
                    objT5 = p3d1.m(tq9Var.a(((yqg) tmVar.e).b()), x340Var3);
                }
                frr0 frr0Var = (frr0) objT5;
                Object objT6 = x340Var3.T();
                if (objT6 == m4cVar4) {
                    objT6 = v8r.q((Object) null);
                    x340Var3.s0(objT6);
                }
                ven0 ven0Var = (ven0) objT6;
                Object[] objArr = {Long.valueOf(tq9Var.a), Long.valueOf(tq9Var.c), Float.valueOf(tq9Var.d), l};
                boolean zI2 = x340Var3.i(ven0Var) | x340Var3.i(frr0Var) | x340Var3.i(tq9Var) | x340Var3.i(tmVar);
                Object objT7 = x340Var3.T();
                if (zI2 || objT7 == m4cVar4) {
                    og5 og5Var = new og5(tq9Var, tmVar, ven0Var, frr0Var, null, (byte) 3);
                    x340Var3.s0(og5Var);
                    objT7 = og5Var;
                }
                qxd0.u(objArr, (vu30) objT7, x340Var3);
                boolean zG = x340Var3.g(list2);
                Object objT8 = x340Var3.T();
                if (zG || objT8 == m4cVar4) {
                    List<yq9> list3 = list2;
                    ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                    for (yq9 yq9Var : list3) {
                        arrayList.add(new ps51(yq9Var.b, yq9Var.c, yq9Var.a, yq9Var.d));
                        m4cVar4 = m4cVar4;
                    }
                    m4cVar = m4cVar4;
                    objT8 = mqo1.A(arrayList);
                    x340Var3.s0(objT8);
                } else {
                    m4cVar = m4cVar4;
                }
                c380 c380Var = (c380) objT8;
                Long l2 = (Long) ven0Var.getValue();
                long jLongValue = l2 != null ? l2.longValue() : frr0Var.s();
                long jLongValue2 = l != null ? l.longValue() : 0L;
                boolean zI3 = x340Var3.i(ven0Var);
                Object objT9 = x340Var3.T();
                if (!zI3) {
                    m4cVar2 = m4cVar;
                    if (objT9 == m4cVar2) {
                    }
                    iu30 iu30Var3 = (iu30) objT9;
                    if (l != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z5 = tq9Var.f;
                    objT = x340Var3.T();
                    if (objT == m4cVar2) {
                        objT = vc7.b1;
                        x340Var3.s0(objT);
                    }
                    Function0 function1 = (Function0) objT;
                    zI = x340Var3.i(ven0Var) | ((((iIntValue4 & 896) ^ 384) <= 256 && x340Var3.g(iu30Var2)) || (iIntValue4 & 384) == 256);
                    objT2 = x340Var3.T();
                    if (zI || objT2 == m4cVar2) {
                        objT2 = new wq9(iu30Var2, ven0Var);
                        x340Var3.s0(objT2);
                    }
                    ft51.i(jLongValue, jLongValue2, -1L, -1L, iu30Var3, c380Var, z, false, z5, agv.a, function1, (qim0) null, false, (Function0) null, (Function0) objT2, x340Var3, 817892736, 6, 14336);
                    return rih1Var;
                }
                m4cVar2 = m4cVar;
                objT9 = new cy7(ven0Var, (byte) 3);
                x340Var3.s0(objT9);
                iu30 iu30Var4 = (iu30) objT9;
                if (l != null) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z6 = tq9Var.f;
                objT = x340Var3.T();
                if (objT == m4cVar2) {
                    objT = vc7.b1;
                    x340Var3.s0(objT);
                }
                Function0 function2 = (Function0) objT;
                zI = x340Var3.i(ven0Var) | ((((iIntValue4 & 896) ^ 384) <= 256 && x340Var3.g(iu30Var2)) || (iIntValue4 & 384) == 256);
                objT2 = x340Var3.T();
                if (zI) {
                    objT2 = new wq9(iu30Var2, ven0Var);
                    x340Var3.s0(objT2);
                } else {
                    objT2 = new wq9(iu30Var2, ven0Var);
                    x340Var3.s0(objT2);
                }
                ft51.i(jLongValue, jLongValue2, -1L, -1L, iu30Var4, c380Var, z, false, z6, agv.a, function2, (qim0) null, false, (Function0) null, (Function0) objT2, x340Var3, 817892736, 6, 14336);
                return rih1Var;
            case 8:
                bs9 bs9Var = (bs9) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var4 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                m4c m4cVar5 = fkj0.X;
                boolean z7 = bs9Var.b;
                int i3 = bs9Var.a;
                ds9 ds9Var = (ds9) obj6;
                w2k1 w2k1Var = ds9Var.h;
                j2i j2iVarR2 = apo.r(1849622872, new tl9(ds9Var, (byte) 1), x340Var4);
                j2i j2iVarR3 = apo.r(2093159735, new tl9(ds9Var, (byte) 2), x340Var4);
                j2i j2iVarR4 = apo.r(-1958270698, new tl9(ds9Var, (byte) 3), x340Var4);
                j2i j2iVarR5 = apo.r(-1714733835, new tl9(ds9Var, (byte) 4), x340Var4);
                j2i j2iVarR6 = apo.r(-1471196972, new tl9(ds9Var, (byte) 5), x340Var4);
                j2i j2iVarR7 = apo.r(-1227660109, new tl9(ds9Var, (byte) 6), x340Var4);
                int i4 = (iIntValue5 & 896) ^ 384;
                boolean z8 = (i4 > 256 && x340Var4.g(iu30Var5)) || (iIntValue5 & 384) == 256;
                x340 x340Var5 = x340Var4;
                Object objT10 = x340Var5.T();
                if (z8 || objT10 == m4cVar5) {
                    objT10 = new ib2(iu30Var5, (byte) 25);
                    x340Var5.s0(objT10);
                }
                iu30 iu30Var6 = (iu30) objT10;
                boolean z9 = (i4 > 256 && x340Var5.g(iu30Var5)) || (iIntValue5 & 384) == 256;
                Object objT11 = x340Var5.T();
                if (z9 || objT11 == m4cVar5) {
                    objT11 = new nc8(iu30Var5, (byte) 9);
                    x340Var5.s0(objT11);
                }
                Function0 function3 = (Function0) objT11;
                boolean z10 = (i4 > 256 && x340Var5.g(iu30Var5)) || (iIntValue5 & 384) == 256;
                Object objT12 = x340Var5.T();
                if (z10 || objT12 == m4cVar5) {
                    objT12 = new ib2(iu30Var5, (byte) 26);
                    x340Var5.s0(objT12);
                }
                l3p1.e(z7, i3, w2k1Var, j2iVarR2, j2iVarR3, j2iVarR4, j2iVarR5, j2iVarR6, j2iVarR7, (qim0) null, iu30Var6, function3, (iu30) objT12, x340Var5, 920346624);
                return rih1Var;
            case 9:
                ix9 ix9Var = (ix9) obj2;
                x340 x340Var6 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                pt ptVar = (pt) obj6;
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= (iIntValue6 & 64) == 0 ? x340Var6.g(ix9Var) : x340Var6.i(ix9Var) ? 32 : 16;
                }
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue6 & 1, (iIntValue6 & 1041) != 1040)) {
                    mod.c(new ely0[]{oi7.a.a((gw70) ptVar.f), q7f0.a.a((woa) ptVar.g), q7f0.b.a((kma) ptVar.h)}, apo.r(-265308549, new mu6(ix9Var, (byte) 26), x340Var7), x340Var7, 56);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 10:
                b0k b0kVar4 = (b0k) obj4;
                ((Number) obj5).intValue();
                c0a c0aVar = (c0a) obj6;
                mod.b(und.a.a((zxa) c0aVar.e), apo.r(2009405382, new hj8(obj2, (Object) c0aVar, (byte) 9), b0kVar4), b0kVar4, 56);
                return rih1Var;
            case 11:
                ((hw2) obj6).g((v3a) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 12:
                lbt0 lbt0Var = (lbt0) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var8 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                if (lbt0Var.b.h.b) {
                    Object obj7 = lbt0Var.c.get(t80.b);
                    obj7.getClass();
                    c10Var = (c10) obj7;
                } else {
                    c10Var = new c10(null, 127, null, null, false, null);
                }
                xfx xfxVar = ((yja) obj6).a;
                String strO0 = cwl1.o0(x340Var8, 2131959768);
                ArrayList arrayList2 = new ArrayList(q7h.U(lbt0Var.a.c, 10));
                for (Iterator it = r0.iterator(); it.hasNext(); it = it) {
                    gja gjaVar = (gja) it.next();
                    arrayList2.add(new hja(gjaVar.a, gjaVar.b, gjaVar.c, gjaVar.d, gjaVar.e, gjaVar.f));
                }
                tja tjaVar = new tja(strO0, "", c10Var.b, arrayList2);
                qim0 qim0VarN = anm1.N("benefit_list", uyn1.x(nim0Var, 16.0f));
                boolean z11 = (((iIntValue7 & 896) ^ 384) > 256 && x340Var8.g(iu30Var7)) || (iIntValue7 & 384) == 256;
                x340 x340Var9 = x340Var8;
                Object objT13 = x340Var9.T();
                if (z11 || objT13 == fkj0.X) {
                    objT13 = new c5a(iu30Var7, (byte) 4);
                    x340Var9.s0(objT13);
                }
                n3o1.e(xfxVar, tjaVar, qim0VarN, (iu30) objT13, x340Var9, 0);
                return rih1Var;
            case 13:
                rih1 rih1Var2 = rih1Var;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var10 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                xfx xfxVar2 = ((bka) obj6).a;
                uja ujaVar = ((k8t0) obj2).a.e;
                String str = ujaVar.a;
                ArrayList<eka> arrayList3 = ujaVar.b;
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                for (eka ekaVar : arrayList3) {
                    arrayList4.add(new hja(ekaVar.a, ekaVar.b, ekaVar.c, ekaVar.d, false, ekaVar.e));
                    rih1Var2 = rih1Var2;
                }
                rih1 rih1Var3 = rih1Var2;
                tja tjaVar2 = new tja(str, String.valueOf(ujaVar.c), "", arrayList4);
                qim0 qim0VarA = uyn1.A(anm1.N("benefit_list", nim0Var), 16.0f, 8.0f, 16.0f, 8.0f);
                boolean z12 = (((iIntValue8 & 896) ^ 384) > 256 && x340Var10.g(iu30Var8)) || (iIntValue8 & 384) == 256;
                x340 x340Var11 = x340Var10;
                Object objT14 = x340Var11.T();
                if (z12 || objT14 == fkj0.X) {
                    objT14 = new c5a(iu30Var8, (byte) 5);
                    x340Var11.s0(objT14);
                }
                s3o1.i(xfxVar2, tjaVar2, qim0VarA, (iu30) objT14, x340Var11, 0);
                return rih1Var3;
            case 14:
                lwa lwaVar = (lwa) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                int i5 = (iIntValue9 & 48) == 0 ? iIntValue9 | (x340Var12.g(lwaVar) ? 32 : 16) : iIntValue9;
                if ((iIntValue9 & 384) == 0) {
                    i5 |= x340Var12.i(iu30Var9) ? 256 : 128;
                }
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(i5 & 1, (i5 & 1169) != 1168)) {
                    String strO1 = cwl1.o0(x340Var13, 2131958465);
                    String str2 = lwaVar.a;
                    Locale locale = ((mwa) obj6).b;
                    Date date = new SimpleDateFormat("yyyy-MM-dd", locale).parse(str2);
                    String str3 = date != null ? DateFormat.getDateInstance(1, locale).format(date) : "";
                    String strO2 = cwl1.o0(x340Var13, 2131958464);
                    pm31 pm31Var = new pm31(0);
                    boolean z13 = (i5 & 896) == 256;
                    Object objT15 = x340Var13.T();
                    if (z13 || objT15 == fkj0.X) {
                        objT15 = new nc8(iu30Var9, (byte) 17);
                        x340Var13.s0(objT15);
                    }
                    cto1.h(strO1, str3, anm1.N("birthday-row", bin.x(nim0.a, false, strO2, pm31Var, (idn0) null, (Function0) objT15, 9)), true, x340Var13, 3072, 0);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 15:
                yza yzaVar = (yza) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                m4c m4cVar6 = fkj0.X;
                NumberFormat numberInstance = NumberFormat.getNumberInstance(new Locale(upn1.m()));
                int i6 = yzaVar.c;
                String strU = cwl1.U(2131820915, i6, new Object[]{numberInstance.format(Integer.valueOf(i6))}, x340Var14);
                x340 x340Var15 = x340Var14;
                long j = ((u7h) x340Var15.k(gaa1.a)).a;
                Function0 function4 = (Function0) x340Var15.k(alg0.b);
                qim0 qim0VarN2 = anm1.N("blend-button-element-root", u291.D(nim0Var, (era) null, 3));
                boolean zG2 = x340Var15.g(function4) | ((((iIntValue10 & 896) ^ 384) > 256 && x340Var15.g(iu30Var10)) || (iIntValue10 & 384) == 256) | x340Var15.f(j);
                Object objT16 = x340Var15.T();
                if (zG2 || objT16 == m4cVar6) {
                    objT16 = new au0(function4, iu30Var10, j, (byte) 1);
                    x340Var15.s0(objT16);
                }
                Function0 function5 = (Function0) objT16;
                if (ihc1.y0(strU)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                gbx gbxVar = new gbx(new y50(strU), function5);
                cr31 cr31VarB = er31.b(36.0f);
                Object objT17 = x340Var15.T();
                if (objT17 == m4cVar6) {
                    objT17 = vq9.V0;
                    x340Var15.s0(objT17);
                }
                kgx kgxVar = new kgx(0, (vu30) null, (vu30) objT17, (vu30) null, 11);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var15).b;
                cvx cvxVar2 = cbx.b(x340Var15).b;
                cvx cvxVar3 = cbx.b(x340Var15).b;
                cvx cvxVar4 = cbx.b(x340Var15).b;
                cwl1.b(qim0VarN2, (tl3) null, cr31VarB, kgxVar, new zzq0(4.0f, 4.0f, 16.0f, 4.0f), (max) null, false, (idn0) null, ny3.a, gbxVar, (gbx) null, apo.r(-728127345, new ef8((jd6) obj6, yzaVar, strU), x340Var15), x340Var15, 0, 48, 1250);
                return rih1Var;
            case 16:
                s0b s0bVar = (s0b) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                int iIntValue11 = ((Number) obj5).intValue();
                m4c m4cVar7 = fkj0.X;
                d9c1 d9c1Var = (d9c1) obj6;
                x340 x340Var16 = (b0k) obj4;
                boolean zI4 = x340Var16.i(d9c1Var);
                Object objT18 = x340Var16.T();
                if (zI4 || objT18 == m4cVar7) {
                    objT18 = new tla(d9c1Var, b3);
                    x340Var16.s0(objT18);
                }
                iu30 iu30Var12 = (iu30) objT18;
                qim0 qim0VarR = u291.r(nim0Var, 64.0f);
                boolean zI5 = x340Var16.i(s0bVar) | ((((iIntValue11 & 896) ^ 384) > 256 && x340Var16.g(iu30Var11)) || (iIntValue11 & 384) == 256);
                Object objT19 = x340Var16.T();
                if (zI5 || objT19 == m4cVar7) {
                    objT19 = new kd8(s0bVar, iu30Var11, b2);
                    x340Var16.s0(objT19);
                }
                dm5.a(iu30Var12, qim0VarR, (iu30) objT19, x340Var16, 0, 0);
                return rih1Var;
            case 17:
                b0k b0kVar5 = (b0k) obj4;
                ((Number) obj5).intValue();
                l1b l1bVar = (l1b) obj6;
                j7e0 j7e0Var = ((hwq) obj2).g;
                if (j7e0Var instanceof j7e0) {
                    zuc0 zuc0Var = j7e0Var.a;
                    boolean zJ = u890.j(zuc0Var.g.get("blend.show_recs_icon"), "true");
                    if (zuc0Var.f()) {
                        z2 = false;
                    } else {
                        fjf1 fjf1Var2 = zuc0Var.p;
                        fjf1Var = fjf1Var2 instanceof fjf1 ? fjf1Var2 : null;
                        if (fjf1Var == null || !fjf1Var.h) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    }
                    fbp1 fbp1Var = zuc0Var.n;
                    smc0 smc0VarN = k4p1.n();
                    if (zuc0Var.k) {
                        smc0VarN.add(ell.b);
                    }
                    if (zuc0Var.c()) {
                        smc0VarN.add(ell.d);
                    }
                    c380 c380VarA = mqo1.A(k4p1.k(smc0VarN));
                    hll hllVarA = zuc0Var.q.a(hll.class);
                    k1bVar = new k1b(zJ, z2, (hllVarA == null || (list = hllVarA.d) == null) ? false : list.contains(fll.c), fbp1Var, c380VarA);
                } else {
                    k1bVar = new k1b(false, false, false, swp0.c, fg91.b);
                }
                l1bVar.e(k1bVar, b0kVar5, 0);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((ldo) obj6).q((o1b) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                x340 x340Var17 = (b0k) obj4;
                ((Number) obj5).intValue();
                m4c m4cVar8 = fkj0.X;
                Map map = ((cxc0) obj2).f.q;
                t3b t3bVar = (t3b) obj6;
                g4b g4bVar = t3bVar.c;
                ven0 ven0VarH = rwq.h(g4bVar.g, x340Var17, 0);
                ven0 ven0VarH2 = rwq.h(g4bVar.i, x340Var17, 0);
                ven0 ven0VarH3 = rwq.h(((k511) t3bVar.d.b).a(t3bVar.b), x340Var17, 0);
                sob1 sob1Var = (sob1) ven0VarH2.getValue();
                yb20 yb20Var = (yb20) ven0VarH.getValue();
                boolean zJ2 = u890.j(map.get("social_prompting_active"), "true");
                String str4 = (String) map.get("social_prompting_session_id");
                boolean zBooleanValue = ((Boolean) ven0VarH3.getValue()).booleanValue();
                ic9 ic9Var = t3bVar.g;
                x340 x340Var18 = x340Var17;
                boolean zI6 = x340Var18.i(t3bVar);
                Object objT20 = x340Var18.T();
                if (zI6 || objT20 == m4cVar8) {
                    objT20 = new qka(1, t3bVar, t3b.class, "launchPromptInput", "launchPromptInput$src_main_java_com_spotify_listuxplatformconsumers_blend_socialprompting_chips_chips(Ljava/lang/String;)V", 0, (byte) 4);
                    x340Var18.s0(objT20);
                }
                iu30 iu30Var13 = (iu30) objT20;
                boolean zI7 = x340Var18.i(t3bVar);
                Object objT21 = x340Var18.T();
                if (zI7 || objT21 == m4cVar8) {
                    objT21 = new q01(0, t3bVar, t3b.class, "clearPrompt", "clearPrompt$src_main_java_com_spotify_listuxplatformconsumers_blend_socialprompting_chips_chips()V", 0, (byte) 21);
                    x340Var18.s0(objT21);
                }
                Function0 function6 = (Function0) objT21;
                boolean zI8 = x340Var18.i(t3bVar);
                Object objT22 = x340Var18.T();
                if (zI8 || objT22 == m4cVar8) {
                    objT22 = new q3b(t3bVar, (byte) 1);
                    x340Var18.s0(objT22);
                }
                Function0 function7 = (Function0) objT22;
                boolean zI9 = x340Var18.i(t3bVar);
                Object objT23 = x340Var18.T();
                if (zI9 || objT23 == m4cVar8) {
                    objT23 = new cka(t3bVar, (byte) 7);
                    x340Var18.s0(objT23);
                }
                vu30 vu30Var = (vu30) objT23;
                boolean zI10 = x340Var18.i(t3bVar);
                Object objT24 = x340Var18.T();
                if (zI10 || objT24 == m4cVar8) {
                    objT24 = new qka(1, t3bVar, t3b.class, "applySession", "applySession$src_main_java_com_spotify_listuxplatformconsumers_blend_socialprompting_chips_chips(Ljava/lang/String;)V", 0, (byte) 5);
                    x340Var18.s0(objT24);
                }
                m3b.c(sob1Var, yb20Var, zJ2, str4, zBooleanValue, ic9Var, iu30Var13, function6, function7, vu30Var, (iu30) objT24, (qim0) null, x340Var18, 0);
                return rih1Var;
            case 20:
                ((Number) obj5).intValue();
                String str5 = (String) ((cxc0) obj2).f.q.get("description");
                x340 x340Var19 = (b0k) obj4;
                if (str5 == null) {
                    x340Var19.i0(1227269660);
                    x340Var19.r(false);
                    return rih1Var;
                }
                x340Var19.i0(1227269661);
                fb3 fb3Var = (fb3) obj6;
                boolean zI11 = x340Var19.i(fb3Var);
                Object objT25 = x340Var19.T();
                if (zI11 || objT25 == fkj0.X) {
                    objT25 = new kk(fb3Var, fjf1Var, (byte) 27);
                    x340Var19.s0(objT25);
                }
                qxd0.t(rih1Var, x340Var19, (vu30) objT25);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar5 = cbx.b(x340Var19).b;
                cvx cvxVar6 = cbx.b(x340Var19).b;
                uwo1.e(str5, uyn1.y(nim0Var, 16.0f, 4.0f), (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var19, 0, 0, 2044);
                x340Var19.r(false);
                return rih1Var;
            case 21:
                return a(obj, obj2, obj3, obj4, obj5);
            case 22:
                return d(obj, obj2, obj3, obj4, obj5);
            case 23:
                ((cnb) obj6).f((c380) obj2, null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 24:
                return e(obj, obj2, obj3, obj4, obj5);
            case 25:
                return f(obj, obj2, obj3, obj4, obj5);
            case 26:
                return g(obj, obj2, obj3, obj4, obj5);
            case 27:
                return h(obj, obj2, obj3, obj4, obj5);
            case 28:
                return i(obj, obj2, obj3, obj4, obj5);
            default:
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar3 = cbx.a;
                qim0 qim0VarB = uyn1.B(dug.f(qim0VarF, cbx.a(x340Var20).a.c, d4o1.a), 0.0f, cbx.b(x340Var20).b.a, 0.0f, cbx.b(x340Var20).b.d, 5);
                x340 x340Var21 = x340Var20;
                Object objT26 = x340Var21.T();
                m4c m4cVar9 = fkj0.X;
                if (objT26 == m4cVar9) {
                    objT26 = fjd.f;
                    x340Var21.s0(objT26);
                }
                qim0 qim0VarB2 = s161.b(qim0VarB, false, (iu30) objT26);
                qlb qlbVar = (qlb) obj6;
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(x340Var21.T);
                xos0 xos0VarM = x340Var21.m();
                qim0 qim0VarE = zr7.E(x340Var21, qim0VarB2);
                hzj.A.getClass();
                if (x340Var21.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var21.m0();
                if (x340Var21.S) {
                    x340Var21.l(hmb0.t1);
                } else {
                    x340Var21.v0();
                }
                nko1.H(gfh0VarC, x340Var21, y580.O0);
                nko1.H(xos0VarM, x340Var21, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var21, y580.R0);
                nko1.F(x340Var21);
                nko1.H(qim0VarE, x340Var21, y580.Y);
                jdx jdxVar = jdx.c;
                String str6 = (String) qlbVar.f;
                boolean z14 = (((iIntValue12 & 896) ^ 384) > 256 && x340Var21.g(iu30Var14)) || (iIntValue12 & 384) == 256;
                Object objT27 = x340Var21.T();
                if (z14 || objT27 == m4cVar9) {
                    objT27 = new gob(iu30Var14, b3);
                    x340Var21.s0(objT27);
                }
                Function0 function8 = (Function0) objT27;
                if (ihc1.y0(str6)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50(str6), function8), jdxVar, (qim0) null, (max) null, yla.s(x340Var21), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(112509028, new cka(qlbVar, (byte) 19), x340Var21), x340Var21, 0, 48, 2012);
                x340Var21.r(true);
                return rih1Var;
        }
    }
}
