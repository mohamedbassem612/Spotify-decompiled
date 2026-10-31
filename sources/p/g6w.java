package p;

import android.view.ViewGroup;
import androidx.car.app.navigation.model.Maneuver;
import com.spotify.mobius.functions.Consumer;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g6w extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6w(oih oihVar, fih fihVar, iu30 iu30Var) {
        super(2);
        this.a = (byte) 7;
        this.b = oihVar;
        this.d = fihVar;
        this.c = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        gbx gbxVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                h6w h6wVar = (h6w) obj4;
                d6w d6wVar = (d6w) obj5;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = x340Var2.g(iu30Var) | x340Var2.g(d6wVar) | x340Var2.i(h6wVar);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new ssm(iu30Var, d6wVar, h6wVar, (byte) 23);
                        x340Var2.s0(objT);
                    }
                    rrn1.j(d6wVar, (Function0) objT, (qim0) null, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                ((xgc) obj5).j((String) obj3, (j2i) obj4, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                nyn1.f((d7w) obj5, (Function0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                ryn1.c((ni00) obj5, (Function0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qsw.c(new obk1((ViewGroup) obj5), apo.r(1329277097, new o1t((xpw) obj3, (k331) obj4, (byte) 28), x340Var4), x340Var4, 48);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                eio1.g((cm01) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ulo1.a((r9x) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ((oih) obj5).d((fih) obj4, (iu30) obj3, (qim0) null, x340Var6, 0, 4);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                bhx bhxVar = (bhx) obj5;
                ygx ygxVar = (ygx) obj3;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zI = x340Var8.i(bhxVar) | x340Var8.i(ygxVar);
                    Object objT2 = x340Var8.T();
                    if (zI || objT2 == fkj0.X) {
                        objT2 = new t3x(bhxVar, ygxVar, (byte) 2);
                        x340Var8.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    if (ygxVar.b.c.length() == 0) {
                        gbxVar = new gbx(z50.c, function0);
                    } else {
                        String str = ygxVar.b.c;
                        if (ihc1.y0(str)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return null;
                        }
                        gbxVar = new gbx(new y50(str), function0);
                    }
                    foo1.c(gbxVar, (yf) obj4, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(747415403, new hzw(ygxVar, (byte) 4), x340Var8), x340Var8, 0, 48, 2044);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                bro1.c((hcx) obj5, (qim0) obj3, (j2i) obj4, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                shx.b((c380) obj5, (hcx) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                shx.c((phx) obj5, (hcx) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    mod.c(new ely0[]{ai31.a.a((Object) null), p3d1.o(((hfx) obj5).a.b.a, wrl.a), q9e1.a.a(((uyx) obj3).g)}, (vu30) obj4, x340Var10, 8);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    xu30 xu30Var = (xu30) obj4;
                    gfh0 gfh0VarC = t1c.c((tl3) obj3, false);
                    int iHashCode = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM = x340Var12.m();
                    qim0 qim0VarE = zr7.E(x340Var12, (qim0) obj5);
                    hzj.A.getClass();
                    if (x340Var12.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(hmb0.t1);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(gfh0VarC, x340Var12, y580.O0);
                    nko1.H(xos0VarM, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE, x340Var12, y580.Y);
                    hrt.k(6, xu30Var, h2c.a, x340Var12, true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    dxo1.g(((gdx) obj5).d, (qim0) obj3, (j2i) obj4, x340Var14, 0);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                s2y s2yVar = (s2y) obj4;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    o2y o2yVar = (o2y) obj5;
                    o2yVar.getClass();
                    iu30 iu30Var2 = (iu30) obj3;
                    otu otuVar = s2yVar.g;
                    boolean zI2 = x340Var16.i(s2yVar);
                    Object objT3 = x340Var16.T();
                    if (zI2 || objT3 == fkj0.X) {
                        objT3 = new v7v(s2yVar, (byte) 24);
                        x340Var16.s0(objT3);
                    }
                    u7n0.f(o2yVar, iu30Var2, otuVar, (Function0) objT3, (qim0) null, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                acq0.g((v3y) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                acq0.l((bu91) obj5, (bs91) obj3, (Function0) obj4, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 18:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                j3y j3yVar = (j3y) obj3;
                m4c m4cVar = fkj0.X;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    v3y v3yVar = (v3y) ((tob1) obj4).getValue();
                    Consumer consumer = (Consumer) ((x2y) obj5).d;
                    if (consumer == null) {
                        u890.C("eventConsumer");
                        throw null;
                    }
                    boolean zI3 = x340Var18.i(consumer);
                    Object objT4 = x340Var18.T();
                    if (zI3 || objT4 == m4cVar) {
                        r1t r1tVar = new r1t(1, consumer, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0, (byte) 26);
                        x340Var18.s0(r1tVar);
                        objT4 = r1tVar;
                    }
                    iu30 iu30Var3 = (iu30) objT4;
                    boolean zI4 = x340Var18.i(j3yVar);
                    Object objT5 = x340Var18.T();
                    if (zI4 || objT5 == m4cVar) {
                        objT5 = new v7v(j3yVar, (byte) 25);
                        x340Var18.s0(objT5);
                    }
                    acq0.f(v3yVar, iu30Var3, (qim0) null, (Function0) objT5, x340Var18, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                cev0.e((v9y) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                j541.d((xhy) obj5, (qim0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                ply.a((yk80) obj5, (String) obj3, (qim0) obj4, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                cqy.b((tpy) obj5, (Function0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                szy.b((List) obj5, (qim0) obj3, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                irn1.m((fgz) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                prn1.c((dhz) obj5, (Function0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ((i7d) obj5).d((cj00) ((tob1) obj3).getValue(), (iu30) ((tob1) obj4).getValue(), (qim0) null, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                goq goqVar = (goq) obj5;
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    qsw.c(new obk1(((nsg) goqVar.b).a), apo.r(-339951790, new fi00((gw70) obj3, (i7d) obj4, rwq.h((wen0) ((idd1) goqVar.e).getValue(), x340Var22, 0), rwq.h((wen0) ((idd1) goqVar.f).getValue(), x340Var22, 0), (byte) 1), x340Var22), x340Var22, 48);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((Number) obj2).intValue();
                iho1.e((ye5) obj5, (String) obj4, (iu30) obj3, (b0k) obj, czo1.p(57));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                ((zx00) obj5).f(czo1.p(1), (String) obj4, (b0k) obj, (iu30) obj3);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6w(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6w(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6w(byte b, int i, Object obj, Object obj2, iu30 iu30Var) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = iu30Var;
    }
}
