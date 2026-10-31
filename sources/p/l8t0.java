package p;

import android.content.Context;
import com.spotify.voting.proto.v2.SendVotesRequestV2;
import com.spotify.voting.proto.v2.VotingSharePage;
import io.reactivex.rxjava3.core.Flowable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l8t0 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l8t0(Object obj, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return new l8t0((n8t0) obj, lnmVar, (byte) 0);
            case 1:
                return new l8t0((nbt0) obj, lnmVar, (byte) 1);
            case 2:
                return new l8t0((mwu0) obj, lnmVar, (byte) 2);
            case 3:
                return new l8t0((anc0) obj, lnmVar, (byte) 3);
            case 4:
                return new l8t0((aru0) obj, lnmVar, (byte) 4);
            case 5:
                return new l8t0((iiz0) obj, lnmVar, (byte) 5);
            case 6:
                return new l8t0((qjz0) obj, lnmVar, (byte) 6);
            case 7:
                return new l8t0((hyy0) obj, lnmVar, (byte) 7);
            case 8:
                return new l8t0((jh11) obj, lnmVar, (byte) 8);
            case 9:
                return new l8t0((la21) obj, lnmVar, (byte) 9);
            case 10:
                return new l8t0((yb21) obj, lnmVar, (byte) 10);
            case 11:
                return new l8t0((ven0) obj, lnmVar, (byte) 11);
            case 12:
                return new l8t0((xtb0) obj, lnmVar, (byte) 12);
            case 13:
                return new l8t0((toc1) obj, lnmVar, (byte) 13);
            case 14:
                return new l8t0((vxc1) obj, lnmVar, (byte) 14);
            case 15:
                return new l8t0((ua91) obj, lnmVar, (byte) 15);
            case 16:
                return new l8t0((uud1) obj, lnmVar, (byte) 16);
            case 17:
                return new l8t0((x5f1) obj, lnmVar, (byte) 17);
            case 18:
                return new l8t0((ewg1) obj, lnmVar, (byte) 18);
            case 19:
                return new l8t0((xgh1) obj, lnmVar, (byte) 19);
            case 20:
                return new l8t0((kph1) obj, lnmVar, (byte) 20);
            case 21:
                return new l8t0((a0j1) obj, lnmVar, (byte) 21);
            case 22:
                return new l8t0((a1j1) obj, lnmVar, (byte) 22);
            case 23:
                return new l8t0((z1j1) obj, lnmVar, (byte) 23);
            case 24:
                return new l8t0((b1k1) obj, lnmVar, (byte) 24);
            case 25:
                return new l8t0((hmk1) obj, lnmVar, (byte) 25);
            case 26:
                return new l8t0((hyk1) obj, lnmVar, (byte) 26);
            case 27:
                return new l8t0((qml1) obj, lnmVar, (byte) 27);
            default:
                return new l8t0((y241) obj, lnmVar, (byte) 28);
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
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:167:0x031a  */
    public final Object invokeSuspend(Object obj) {
        Object objH;
        Object objI;
        float fH0;
        Object objL;
        Object objI2;
        Object objI3;
        Object objI4;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Serializable serializable = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                n8t0 n8t0Var = (n8t0) obj2;
                t4d1 t4d1Var = n8t0Var.c;
                p8t0 p8t0Var = n8t0Var.e;
                String str = p8t0Var.b;
                boolean z2 = p8t0Var.c;
                this.b = true;
                Object objB = t4d1Var.b(str, this, z2);
                return objB == serializable ? serializable : objB;
            case 1:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                nbt0 nbt0Var = (nbt0) obj2;
                fv9 fv9Var = nbt0Var.c;
                boolean z4 = nbt0Var.e.b;
                this.b = true;
                Object objC = fv9Var.c(z4, this);
                return objC == serializable ? serializable : objC;
            case 2:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mwu0 mwu0Var = (mwu0) obj2;
                yeu0 yeu0Var = mwu0Var.b;
                String str2 = mwu0Var.c.b;
                this.b = true;
                if (str2.length() <= 0) {
                    hhg1.n("Failed requirement.");
                    return null;
                }
                if (((l35) yeu0Var.c).b()) {
                    cqz0 cqz0Var = dqz0.a;
                    hwu0 hwu0VarL = yeu0.l(yeu0Var, 8000L, 2000L, 8);
                    hwu0 hwu0VarL2 = yeu0.l(yeu0Var, 12000L, 3000L, 16);
                    hwu0 hwu0VarL3 = yeu0.l(yeu0Var, 20000L, 6000L, 24);
                    long j = hwu0VarL.a;
                    ewu0 ewu0Var = ewu0.a;
                    fwu0 fwu0Var = new fwu0(j, 1, ewu0Var);
                    long j2 = hwu0VarL.b;
                    ewu0 ewu0Var2 = ewu0.b;
                    objH = new gwu0(p7h.M(new fwu0[]{fwu0Var, new fwu0(j2, 1, ewu0Var2), new fwu0(hwu0VarL2.a, 2, ewu0Var), new fwu0(hwu0VarL2.b, 2, ewu0Var2), new fwu0(hwu0VarL3.a * 3600, 3, ewu0Var), new fwu0(hwu0VarL3.b * 3600, 3, ewu0Var2)}));
                } else {
                    objH = yeu0Var.h(str2, this);
                }
                return objH == serializable ? serializable : objH;
            case 3:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    this.b = true;
                    return ((anc0) obj2).h(this) == serializable ? serializable : rih1Var;
                }
                if (z6) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                aru0 aru0Var = (aru0) obj2;
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    mr20 mr20VarA = ((ov20) aru0Var.c).a("restrict-settings-for-child", false);
                    this.b = true;
                    objI = b5p1.i(mr20VarA, this);
                    if (objI == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI = obj;
                }
                return ((Boolean) objI).booleanValue() ? "https://www.spotify.com/legal/managed-account-young-listener-privacy-policy/plain" : ((Context) aru0Var.b).getString(2131963140);
            case 5:
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    this.b = true;
                    Object objS = smo1.s(new xd1((iiz0) obj2, (lnm) null), this);
                    return objS == serializable ? serializable : objS;
                }
                if (z8) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    this.b = true;
                    Object objC2 = ((qjz0) obj2).c(this);
                    return objC2 == serializable ? serializable : objC2;
                }
                if (z9) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m111 m111Var = (m111) ((hyy0) obj2).b;
                this.b = true;
                Object objA = m111Var.a(this);
                return objA == serializable ? serializable : objA;
            case 8:
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                jh11 jh11Var = (jh11) obj2;
                gj10 gj10Var = jh11Var.d;
                String str3 = jh11Var.c.a;
                this.b = true;
                Object objG = gj10Var.g(str3, this);
                return objG == serializable ? serializable : objG;
            case 9:
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rpv0 rpv0Var = ((la21) obj2).b;
                this.b = true;
                Object objJ = rpv0Var.j(this);
                return objJ == serializable ? serializable : objJ;
            case 10:
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                yb21 yb21Var = (yb21) obj2;
                rut0 rut0Var = yb21Var.c;
                String str4 = yb21Var.b.a;
                this.b = true;
                Object objJ2 = rut0Var.j(str4, this);
                return objJ2 == serializable ? serializable : objJ2;
            case 11:
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                iu30 iu30Var = (iu30) ((ven0) obj2).getValue();
                this.b = true;
                Object objInvoke = iu30Var.invoke(this);
                return objInvoke == serializable ? serializable : objInvoke;
            case 12:
                boolean z15 = this.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xtb0 xtb0Var = (xtb0) obj2;
                this.b = true;
                ptb0 ptb0VarH = xtb0Var.h();
                i25 i25Var = xtb0Var.e;
                List list = ptb0VarH.l;
                if (list.isEmpty()) {
                    objL = rih1Var;
                } else {
                    if (((err0) i25Var.b).s() == 0) {
                        fH0 = 0.0f;
                    } else {
                        float fS = ((err0) i25Var.b).s();
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new Integer(((qtb0) it.next()).q));
                        }
                        fH0 = ((float) o7h.h0(arrayList)) * fS;
                    }
                    objL = kqn1.l(xtb0Var, -(fH0 + ((err0) i25Var.c).s()), irn1.o0(600, 0, mlv.d, 2), this);
                    if (objL != serializable) {
                        objL = rih1Var;
                    }
                }
                return objL == serializable ? serializable : rih1Var;
            case 13:
                boolean z16 = this.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                toc1 toc1Var = (toc1) obj2;
                ic9 ic9Var = toc1Var.b;
                woc1 woc1Var = toc1Var.c;
                String str5 = woc1Var.b;
                boolean z17 = woc1Var.d;
                Map map = woc1Var.e;
                this.b = true;
                Object objI5 = ic9Var.i(str5, map, this, z17);
                return objI5 == serializable ? serializable : objI5;
            case 14:
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vxc1 vxc1Var = (vxc1) obj2;
                ua91 ua91Var = vxc1Var.d;
                Long l = vxc1Var.b.a;
                this.b = true;
                Object objS2 = smo1.s(new hgo0(l, ua91Var, (lnm) null, (byte) 25), this);
                return objS2 == serializable ? serializable : objS2;
            case 15:
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    this.b = true;
                    objI2 = b5p1.i(((ov20) ((ua91) obj2).b).a("restrict-settings-for-child", false), this);
                    if (objI2 == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI2 = obj;
                }
                return ((Boolean) objI2).booleanValue() ? "https://support.spotify.com/article/managed-accounts-for-premium-family-young-listeners/?plain" : "https://support.spotify.com";
            case 16:
                boolean z20 = this.b;
                if (z20) {
                    if (z20) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                std1 std1Var = ((uud1) obj2).c;
                this.b = true;
                Object objA2 = std1Var.a(this);
                return objA2 == serializable ? serializable : objA2;
            case 17:
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                x5f1 x5f1Var = (x5f1) obj2;
                this.b = true;
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                x5f1Var.c.w1(Boolean.TRUE);
                x5f1Var.d = ohdVar;
                return ohdVar.r() == serializable ? serializable : rih1Var;
            case 18:
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                h971 h971Var = ((ewg1) obj2).b;
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x("spotify:chat-trusted-circle");
                this.b = true;
                Object objA3 = h971.a(h971Var, s4b1VarX, false, (String) null, this, 14);
                return objA3 == serializable ? serializable : objA3;
            case 19:
                boolean z23 = this.b;
                if (z23) {
                    if (z23) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xgh1 xgh1Var = (xgh1) obj2;
                ffe1 ffe1Var = xgh1Var.c;
                boolean z24 = xgh1Var.b.a;
                this.b = true;
                Object objG2 = ffe1Var.g(z24, this);
                return objG2 == serializable ? serializable : objG2;
            case 20:
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                gza0 gza0Var = ((kph1) obj2).e;
                this.b = true;
                Object objB2 = gza0Var.b(this);
                return objB2 == serializable ? serializable : objB2;
            case 21:
                boolean z26 = this.b;
                if (z26) {
                    if (z26) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                a0j1 a0j1Var = (a0j1) obj2;
                pvm0 pvm0Var = a0j1Var.c;
                boolean z27 = a0j1Var.j;
                this.b = true;
                Object objA4 = pvm0Var.a(z27, this);
                return objA4 == serializable ? serializable : objA4;
            case 22:
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                a3e0 a3e0Var = ((a1j1) obj2).c;
                this.b = true;
                Object objInvoke2 = a3e0Var.invoke(this);
                return objInvoke2 == serializable ? serializable : objInvoke2;
            case 23:
                boolean z29 = this.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                z1j1 z1j1Var = (z1j1) obj2;
                pvm0 pvm0Var2 = z1j1Var.d;
                String str6 = z1j1Var.b.a;
                this.b = true;
                Object objD = pvm0Var2.d(str6, this);
                return objD == serializable ? serializable : objD;
            case 24:
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                b1k1 b1k1Var = (b1k1) obj2;
                gj10 gj10Var2 = b1k1Var.d;
                String str7 = b1k1Var.c.a;
                this.b = true;
                Object objG3 = gj10Var2.g(str7, this);
                return objG3 == serializable ? serializable : objG3;
            case 25:
                boolean z31 = this.b;
                if (z31) {
                    if (z31) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                t4d1 t4d1Var2 = ((hmk1) obj2).c;
                this.b = true;
                Serializable serializableA = t4d1Var2.a(this);
                return serializableA == serializable ? serializable : serializableA;
            case 26:
                hyk1 hyk1Var = (hyk1) obj2;
                iyk1 iyk1Var = hyk1Var.d;
                boolean z32 = this.b;
                if (!z32) {
                    hm5.M(obj);
                    byte[] bArr = iyk1Var.d;
                    if (bArr != null) {
                        VotingSharePage votingSharePageR = VotingSharePage.r(bArr);
                        Set set2 = s4b1.f;
                        String strJ = uic.x(iyk1Var.c).j();
                        if (strJ == null) {
                            strJ = "";
                        }
                        return new eyk1(0, strJ, votingSharePageR.n(), votingSharePageR.p(), votingSharePageR.o(), zr7.A(iyk1Var.c, votingSharePageR.q()));
                    }
                    cik1 cik1Var = hyk1Var.c;
                    String str8 = iyk1Var.a;
                    String str9 = iyk1Var.b;
                    x461 x461VarO = SendVotesRequestV2.o();
                    x461VarO.r(iyk1Var.a);
                    x461VarO.q(iyk1Var.b);
                    SendVotesRequestV2 sendVotesRequestV2Build = x461VarO.build();
                    String str10 = iyk1Var.c;
                    this.b = true;
                    objI3 = cik1Var.i(str8, str9, sendVotesRequestV2Build, str10, this);
                    if (objI3 == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z32) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI3 = obj;
                }
                return (eyk1) objI3;
            case 27:
                boolean z33 = this.b;
                if (z33) {
                    if (z33) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                qpj1 qpj1Var = ((qml1) obj2).f;
                this.b = true;
                Object objW = qpj1Var.w(this);
                return objW == serializable ? serializable : objW;
            default:
                boolean z34 = this.b;
                if (!z34) {
                    hm5.M(obj);
                    Flowable flowable = ((y241) obj2).a;
                    vbm[] vbmVarArr = q601.a;
                    kge kgeVar = new kge(flowable);
                    this.b = true;
                    objI4 = b5p1.i(kgeVar, this);
                    if (objI4 == serializable) {
                        return serializable;
                    }
                } else {
                    if (!z34) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI4 = obj;
                }
                return ((th61) objI4).a;
        }
    }
}
