package p;

import com.spotify.wrapped.v1.proto.Paragraph;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qme1 implements a3k {
    public final pe a;
    public final tjs0 b;
    public final cxc c;
    public final ti31 d;
    public final kj31 e;
    public final xgm1 f;
    public final ohm1 g;
    public final sme1 h;

    public qme1(pe peVar, tjs0 tjs0Var, cxc cxcVar, ti31 ti31Var, kj31 kj31Var, xgm1 xgm1Var, ohm1 ohm1Var, sme1 sme1Var) {
        this.a = peVar;
        this.b = tjs0Var;
        this.c = cxcVar;
        this.d = ti31Var;
        this.e = kj31Var;
        this.f = xgm1Var;
        this.g = ohm1Var;
        this.h = sme1Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0118  */
    /* JADX WARN: Code duplicated, block: B:42:0x0143  */
    /* JADX WARN: Code duplicated, block: B:48:0x0171  */
    /* JADX WARN: Code duplicated, block: B:51:0x017e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0183  */
    /* JADX WARN: Code duplicated, block: B:54:0x0186  */
    /* JADX WARN: Code duplicated, block: B:55:0x0188  */
    /* JADX WARN: Code duplicated, block: B:57:0x018b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0190  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x0216  */
    /* JADX WARN: Code duplicated, block: B:77:0x023e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0240  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x025a  */
    /* JADX WARN: Code duplicated, block: B:82:0x026c  */
    /* JADX WARN: Code duplicated, block: B:85:0x029a  */
    /* JADX WARN: Code duplicated, block: B:87:0x029e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0311 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[LOOP:0: B:35:0x0112->B:94:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(g7m1 g7m1Var, lnm lnmVar) {
        hme1 hme1Var;
        boolean zV;
        StoryCard storyCard;
        SceneTemplate.TimeMachineContent.Card2 card2;
        wj31 wj31Var;
        h290 h290VarV;
        g7m1 g7m1Var2;
        SceneTemplate.TimeMachineContent.Card2 card3;
        eme1 eme1Var;
        Iterator it;
        Object objD;
        g7m1 g7m1Var3;
        boolean z;
        StoryCard storyCard2;
        wj31 wj31Var2;
        Object objB;
        SceneTemplate.TimeMachineContent.Card2 card4;
        StoryCard storyCard3;
        g7m1 g7m1Var4;
        wj31 wj31Var3;
        boolean z2;
        eme1 eme1Var2;
        String str;
        Integer numC0;
        int i;
        int iIntValue;
        int iP;
        int i2;
        String strU;
        hrr0 hrr0VarQ;
        hrr0 hrr0VarQ2;
        String strU2;
        Object objD2;
        wj31 wj31Var4;
        u3k u3kVar;
        int i3;
        StoryCard storyCard4;
        int i4;
        hrr0 hrr0Var;
        String str2;
        hrr0 hrr0Var2;
        boolean z3;
        bbc bbcVarA;
        smc0 smc0VarN;
        List list;
        Object objA;
        g7m1 g7m1Var5 = g7m1Var;
        if (lnmVar instanceof hme1) {
            hme1Var = (hme1) lnmVar;
            int i5 = hme1Var.O0;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                hme1Var.O0 = i5 - Integer.MIN_VALUE;
            } else {
                hme1Var = new hme1(this, (onm) lnmVar);
            }
        } else {
            hme1Var = new hme1(this, (onm) lnmVar);
        }
        Object obj = hme1Var.Z;
        int i6 = hme1Var.O0;
        ohm1 ohm1Var = this.g;
        u3k u3kVar2 = u3k.a;
        d9n d9nVar = d9n.a;
        switch (i6) {
            case 0:
                hm5.M(obj);
                StoryCard storyCard5 = g7m1Var5.a;
                SceneTemplate.TimeMachineContent.Card2 card2B = storyCard5.q().B();
                if (card2B.v().isEmpty()) {
                    ime1 ime1Var = new ime1(1, null, (byte) 0);
                    hme1Var.a = null;
                    hme1Var.b = null;
                    hme1Var.c = null;
                    hme1Var.O0 = 1;
                    Object objA2 = u3kVar2.a(ime1Var, hme1Var);
                    if (objA2 != d9nVar) {
                        return objA2;
                    }
                } else {
                    zV = pwo1.v(this.a, this.b);
                    bju bjuVar = g7m1Var5.b;
                    lme1 lme1Var = new lme1(card2B, this, null, (byte) 0);
                    hme1Var.a = g7m1Var5;
                    hme1Var.b = storyCard5;
                    hme1Var.c = card2B;
                    hme1Var.i = zV;
                    hme1Var.O0 = 2;
                    Object objD3 = bjuVar.d("timeMachineBackground", lme1Var, hme1Var);
                    if (objD3 != d9nVar) {
                        storyCard = storyCard5;
                        obj = objD3;
                        card2 = card2B;
                        wj31Var = (wj31) obj;
                        h290VarV = card2.v();
                        if (!h290VarV.isEmpty()) {
                            it = h290VarV.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((SceneTemplate.TimeMachineContent.Card2.YearEntry) it.next()).y()) {
                                        bju bjuVar2 = g7m1Var5.b;
                                        pme1 pme1Var = new pme1(card2, this, g7m1Var5, null);
                                        hme1Var.a = g7m1Var5;
                                        hme1Var.b = storyCard;
                                        hme1Var.c = card2;
                                        hme1Var.d = wj31Var;
                                        hme1Var.i = zV;
                                        hme1Var.O0 = 3;
                                        objD = bjuVar2.d("timeMachineEntity", pme1Var, hme1Var);
                                        if (objD != d9nVar) {
                                            g7m1Var3 = g7m1Var5;
                                            z = zV;
                                            storyCard2 = storyCard;
                                            wj31Var2 = wj31Var;
                                            obj = objD;
                                            StoryCard storyCard6 = storyCard2;
                                            zV = z;
                                            card3 = card2;
                                            eme1Var = (eme1) obj;
                                            wj31Var = wj31Var2;
                                            storyCard = storyCard6;
                                            g7m1Var2 = g7m1Var3;
                                            hme1Var.a = g7m1Var2;
                                            hme1Var.b = storyCard;
                                            hme1Var.c = card3;
                                            hme1Var.d = wj31Var;
                                            hme1Var.e = eme1Var;
                                            hme1Var.i = zV;
                                            hme1Var.O0 = 4;
                                            objB = ohm1Var.b("time_machine_last_viewed_year_index", hme1Var);
                                            if (objB != d9nVar) {
                                                g7m1 g7m1Var6 = g7m1Var2;
                                                card4 = card3;
                                                storyCard3 = storyCard;
                                                g7m1Var4 = g7m1Var6;
                                                wj31Var3 = wj31Var;
                                                obj = objB;
                                                z2 = zV;
                                                eme1Var2 = eme1Var;
                                                str = (String) obj;
                                                if (str != null) {
                                                    numC0 = nhc1.c0(str);
                                                } else {
                                                    numC0 = null;
                                                }
                                                if (numC0 != null) {
                                                    i = 1;
                                                } else {
                                                    i = 0;
                                                }
                                                if (numC0 != null) {
                                                    iIntValue = numC0.intValue();
                                                } else {
                                                    iIntValue = 0;
                                                }
                                                iP = yoi1.p(iIntValue, 0, card4.v().size() - 1);
                                                if (i == 0 || !z2) {
                                                    i2 = 0;
                                                } else {
                                                    i2 = 1;
                                                }
                                                if (i2 != 0) {
                                                    strU = null;
                                                } else {
                                                    strU = ((SceneTemplate.TimeMachineContent.Card2.YearEntry) card4.v().get(iP)).u();
                                                }
                                                hrr0VarQ = v8r.q(strU);
                                                hrr0VarQ2 = v8r.q(new Integer(0));
                                                if (i2 != 0) {
                                                    strU2 = "intro";
                                                } else {
                                                    strU2 = ((SceneTemplate.TimeMachineContent.Card2.YearEntry) card4.v().get(iP)).u();
                                                }
                                                bju bjuVar3 = g7m1Var4.b;
                                                lme1 lme1Var2 = new lme1(card4, this, null, (byte) 1);
                                                hme1Var.a = null;
                                                hme1Var.b = storyCard3;
                                                hme1Var.c = card4;
                                                hme1Var.d = wj31Var3;
                                                hme1Var.e = eme1Var2;
                                                hme1Var.f = hrr0VarQ;
                                                hme1Var.g = hrr0VarQ2;
                                                hme1Var.h = strU2;
                                                hme1Var.i = z2;
                                                hme1Var.t = i;
                                                hme1Var.X = iP;
                                                hme1Var.Y = i2;
                                                hme1Var.O0 = 5;
                                                objD2 = bjuVar3.d("timeMachineBackgroundInputs", lme1Var2, hme1Var);
                                                d9nVar = d9nVar;
                                                if (objD2 != d9nVar) {
                                                    wj31Var4 = wj31Var3;
                                                    u3kVar = u3kVar2;
                                                    i3 = iP;
                                                    storyCard4 = storyCard3;
                                                    i4 = i2;
                                                    hrr0Var = hrr0VarQ;
                                                    str2 = strU2;
                                                    hrr0Var2 = hrr0VarQ2;
                                                    smc0 smc0VarN2 = k4p1.n();
                                                    smc0VarN2.addAll((List) objD2);
                                                    str2.getClass();
                                                    smc0VarN2.add(new pj31("enumYear", str2));
                                                    if (i4 == 0) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    smc0VarN2.add(new nj31("skip", z3));
                                                    smc0 smc0VarK = k4p1.k(smc0VarN2);
                                                    bbcVarA = mno1.a(-2, 0, 6);
                                                    smc0VarN = k4p1.n();
                                                    if (i4 != 0) {
                                                        smc0VarN.add(new ve8(bbcVarA, new zqe(hrr0Var, hrr0Var2, (byte) 13)));
                                                    }
                                                    h290 h290VarV2 = card4.v();
                                                    u3k u3kVar3 = u3kVar;
                                                    String strR = card4.r();
                                                    SceneTemplate.TimeMachineContent.Card2 card5 = card4;
                                                    String strT = card5.t();
                                                    d9n d9nVar2 = d9nVar;
                                                    Paragraph paragraphS = card5.s();
                                                    String id = storyCard4.getId();
                                                    boolean zP = card5.p();
                                                    boolean zO = card5.o();
                                                    String strU3 = card5.u();
                                                    if (eme1Var2 != null || (list = eme1Var2.a) == null) {
                                                        list = z6x.a;
                                                    }
                                                    smc0VarN.add(new ane1(h290VarV2, strR, strT, paragraphS, this.f, ohm1Var, z2, id, zP, zO, this.h, strU3, i3, list, new ry71(hrr0Var, (byte) 17), new aya1(hrr0Var2, (byte) 5)));
                                                    kme1 kme1Var = new kme1(wj31Var4, (List) smc0VarK, (List) k4p1.k(smc0VarN), bbcVarA, (ven0) hrr0Var, (ven0) hrr0Var2, (lnm) null);
                                                    hme1Var.a = null;
                                                    hme1Var.b = null;
                                                    hme1Var.c = null;
                                                    hme1Var.d = null;
                                                    hme1Var.e = null;
                                                    hme1Var.f = null;
                                                    hme1Var.g = null;
                                                    hme1Var.h = null;
                                                    hme1Var.i = z2;
                                                    hme1Var.t = i;
                                                    hme1Var.X = i3;
                                                    hme1Var.Y = i4;
                                                    hme1Var.O0 = 6;
                                                    objA = u3kVar3.a(kme1Var, hme1Var);
                                                    d9nVar = d9nVar2;
                                                    if (objA == d9nVar) {
                                                        return objA;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        g7m1Var2 = g7m1Var5;
                        card3 = card2;
                        eme1Var = null;
                        hme1Var.a = g7m1Var2;
                        hme1Var.b = storyCard;
                        hme1Var.c = card3;
                        hme1Var.d = wj31Var;
                        hme1Var.e = eme1Var;
                        hme1Var.i = zV;
                        hme1Var.O0 = 4;
                        objB = ohm1Var.b("time_machine_last_viewed_year_index", hme1Var);
                        if (objB != d9nVar) {
                            g7m1 g7m1Var7 = g7m1Var2;
                            card4 = card3;
                            storyCard3 = storyCard;
                            g7m1Var4 = g7m1Var7;
                            wj31Var3 = wj31Var;
                            obj = objB;
                            z2 = zV;
                            eme1Var2 = eme1Var;
                            str = (String) obj;
                            if (str != null) {
                                numC0 = nhc1.c0(str);
                            } else {
                                numC0 = null;
                            }
                            if (numC0 != null) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            if (numC0 != null) {
                                iIntValue = numC0.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            iP = yoi1.p(iIntValue, 0, card4.v().size() - 1);
                            if (i == 0) {
                                i2 = 0;
                            } else {
                                i2 = 0;
                            }
                            if (i2 != 0) {
                                strU = null;
                            } else {
                                strU = ((SceneTemplate.TimeMachineContent.Card2.YearEntry) card4.v().get(iP)).u();
                            }
                            hrr0VarQ = v8r.q(strU);
                            hrr0VarQ2 = v8r.q(new Integer(0));
                            if (i2 != 0) {
                                strU2 = "intro";
                            } else {
                                strU2 = ((SceneTemplate.TimeMachineContent.Card2.YearEntry) card4.v().get(iP)).u();
                            }
                            bju bjuVar4 = g7m1Var4.b;
                            lme1 lme1Var3 = new lme1(card4, this, null, (byte) 1);
                            hme1Var.a = null;
                            hme1Var.b = storyCard3;
                            hme1Var.c = card4;
                            hme1Var.d = wj31Var3;
                            hme1Var.e = eme1Var2;
                            hme1Var.f = hrr0VarQ;
                            hme1Var.g = hrr0VarQ2;
                            hme1Var.h = strU2;
                            hme1Var.i = z2;
                            hme1Var.t = i;
                            hme1Var.X = iP;
                            hme1Var.Y = i2;
                            hme1Var.O0 = 5;
                            objD2 = bjuVar4.d("timeMachineBackgroundInputs", lme1Var3, hme1Var);
                            d9nVar = d9nVar;
                            if (objD2 != d9nVar) {
                                wj31Var4 = wj31Var3;
                                u3kVar = u3kVar2;
                                i3 = iP;
                                storyCard4 = storyCard3;
                                i4 = i2;
                                hrr0Var = hrr0VarQ;
                                str2 = strU2;
                                hrr0Var2 = hrr0VarQ2;
                                smc0 smc0VarN3 = k4p1.n();
                                smc0VarN3.addAll((List) objD2);
                                str2.getClass();
                                smc0VarN3.add(new pj31("enumYear", str2));
                                if (i4 == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                smc0VarN3.add(new nj31("skip", z3));
                                smc0 smc0VarK2 = k4p1.k(smc0VarN3);
                                bbcVarA = mno1.a(-2, 0, 6);
                                smc0VarN = k4p1.n();
                                if (i4 != 0) {
                                    smc0VarN.add(new ve8(bbcVarA, new zqe(hrr0Var, hrr0Var2, (byte) 13)));
                                }
                                h290 h290VarV3 = card4.v();
                                u3k u3kVar4 = u3kVar;
                                String strR2 = card4.r();
                                SceneTemplate.TimeMachineContent.Card2 card6 = card4;
                                String strT2 = card6.t();
                                d9n d9nVar3 = d9nVar;
                                Paragraph paragraphS2 = card6.s();
                                String id2 = storyCard4.getId();
                                boolean zP2 = card6.p();
                                boolean zO2 = card6.o();
                                String strU4 = card6.u();
                                if (eme1Var2 != null) {
                                    list = z6x.a;
                                } else {
                                    list = z6x.a;
                                }
                                smc0VarN.add(new ane1(h290VarV3, strR2, strT2, paragraphS2, this.f, ohm1Var, z2, id2, zP2, zO2, this.h, strU4, i3, list, new ry71(hrr0Var, (byte) 17), new aya1(hrr0Var2, (byte) 5)));
                                kme1 kme1Var2 = new kme1(wj31Var4, (List) smc0VarK2, (List) k4p1.k(smc0VarN), bbcVarA, (ven0) hrr0Var, (ven0) hrr0Var2, (lnm) null);
                                hme1Var.a = null;
                                hme1Var.b = null;
                                hme1Var.c = null;
                                hme1Var.d = null;
                                hme1Var.e = null;
                                hme1Var.f = null;
                                hme1Var.g = null;
                                hme1Var.h = null;
                                hme1Var.i = z2;
                                hme1Var.t = i;
                                hme1Var.X = i3;
                                hme1Var.Y = i4;
                                hme1Var.O0 = 6;
                                objA = u3kVar4.a(kme1Var2, hme1Var);
                                d9nVar = d9nVar3;
                                if (objA == d9nVar) {
                                    return objA;
                                }
                            }
                        }
                    }
                }
                return d9nVar;
            case 1:
                hm5.M(obj);
                return obj;
            case 2:
                boolean z4 = hme1Var.i;
                SceneTemplate.TimeMachineContent.Card2 card7 = hme1Var.c;
                StoryCard storyCard7 = hme1Var.b;
                g7m1 g7m1Var8 = hme1Var.a;
                hm5.M(obj);
                zV = z4;
                g7m1Var5 = g7m1Var8;
                card2 = card7;
                storyCard = storyCard7;
                wj31Var = (wj31) obj;
                h290VarV = card2.v();
                if (!h290VarV.isEmpty()) {
                    it = h290VarV.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((SceneTemplate.TimeMachineContent.Card2.YearEntry) it.next()).y()) {
                                bju bjuVar5 = g7m1Var5.b;
                                pme1 pme1Var2 = new pme1(card2, this, g7m1Var5, null);
                                hme1Var.a = g7m1Var5;
                                hme1Var.b = storyCard;
                                hme1Var.c = card2;
                                hme1Var.d = wj31Var;
                                hme1Var.i = zV;
                                hme1Var.O0 = 3;
                                objD = bjuVar5.d("timeMachineEntity", pme1Var2, hme1Var);
                                if (objD != d9nVar) {
                                    g7m1Var3 = g7m1Var5;
                                    z = zV;
                                    storyCard2 = storyCard;
                                    wj31Var2 = wj31Var;
                                    obj = objD;
                                    StoryCard storyCard8 = storyCard2;
                                    zV = z;
                                    card3 = card2;
                                    eme1Var = (eme1) obj;
                                    wj31Var = wj31Var2;
                                    storyCard = storyCard8;
                                    g7m1Var2 = g7m1Var3;
                                    hme1Var.a = g7m1Var2;
                                    hme1Var.b = storyCard;
                                    hme1Var.c = card3;
                                    hme1Var.d = wj31Var;
                                    hme1Var.e = eme1Var;
                                    hme1Var.i = zV;
                                    hme1Var.O0 = 4;
                                    objB = ohm1Var.b("time_machine_last_viewed_year_index", hme1Var);
                                    if (objB != d9nVar) {
                                        g7m1 g7m1Var9 = g7m1Var2;
                                        card4 = card3;
                                        storyCard3 = storyCard;
                                        g7m1Var4 = g7m1Var9;
                                        wj31Var3 = wj31Var;
                                        obj = objB;
                                        z2 = zV;
                                        eme1Var2 = eme1Var;
                                        str = (String) obj;
                                        if (str != null) {
                                            numC0 = nhc1.c0(str);
                                        } else {
                                            numC0 = null;
                                        }
                                        if (numC0 != null) {
                                            i = 1;
                                        } else {
                                            i = 0;
                                        }
                                        if (numC0 != null) {
                                            iIntValue = numC0.intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        iP = yoi1.p(iIntValue, 0, card4.v().size() - 1);
                                        if (i == 0) {
                                            i2 = 0;
                                        } else {
                                            i2 = 0;
                                        }
                                        if (i2 != 0) {
                                            strU = null;
                                        } else {
                                            strU = ((SceneTemplate.TimeMachineContent.Card2.YearEntry) card4.v().get(iP)).u();
                                        }
                                        hrr0VarQ = v8r.q(strU);
                                        hrr0VarQ2 = v8r.q(new Integer(0));
                                        if (i2 != 0) {
                                            strU2 = "intro";
                                        } else {
                                            strU2 = ((SceneTemplate.TimeMachineContent.Card2.YearEntry) card4.v().get(iP)).u();
                                        }
                                        bju bjuVar6 = g7m1Var4.b;
                                        lme1 lme1Var4 = new lme1(card4, this, null, (byte) 1);
                                        hme1Var.a = null;
                                        hme1Var.b = storyCard3;
                                        hme1Var.c = card4;
                                        hme1Var.d = wj31Var3;
                                        hme1Var.e = eme1Var2;
                                        hme1Var.f = hrr0VarQ;
                                        hme1Var.g = hrr0VarQ2;
                                        hme1Var.h = strU2;
                                        hme1Var.i = z2;
                                        hme1Var.t = i;
                                        hme1Var.X = iP;
                                        hme1Var.Y = i2;
                                        hme1Var.O0 = 5;
                                        objD2 = bjuVar6.d("timeMachineBackgroundInputs", lme1Var4, hme1Var);
                                        d9nVar = d9nVar;
                                        if (objD2 != d9nVar) {
                                            wj31Var4 = wj31Var3;
                                            u3kVar = u3kVar2;
                                            i3 = iP;
                                            storyCard4 = storyCard3;
                                            i4 = i2;
                                            hrr0Var = hrr0VarQ;
                                            str2 = strU2;
                                            hrr0Var2 = hrr0VarQ2;
                                            smc0 smc0VarN4 = k4p1.n();
                                            smc0VarN4.addAll((List) objD2);
                                            str2.getClass();
                                            smc0VarN4.add(new pj31("enumYear", str2));
                                            if (i4 == 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            smc0VarN4.add(new nj31("skip", z3));
                                            smc0 smc0VarK3 = k4p1.k(smc0VarN4);
                                            bbcVarA = mno1.a(-2, 0, 6);
                                            smc0VarN = k4p1.n();
                                            if (i4 != 0) {
                                                smc0VarN.add(new ve8(bbcVarA, new zqe(hrr0Var, hrr0Var2, (byte) 13)));
                                            }
                                            h290 h290VarV4 = card4.v();
                                            u3k u3kVar5 = u3kVar;
                                            String strR3 = card4.r();
                                            SceneTemplate.TimeMachineContent.Card2 card8 = card4;
                                            String strT3 = card8.t();
                                            d9n d9nVar4 = d9nVar;
                                            Paragraph paragraphS3 = card8.s();
                                            String id3 = storyCard4.getId();
                                            boolean zP3 = card8.p();
                                            boolean zO3 = card8.o();
                                            String strU5 = card8.u();
                                            if (eme1Var2 != null) {
                                                list = z6x.a;
                                            } else {
                                                list = z6x.a;
                                            }
                                            smc0VarN.add(new ane1(h290VarV4, strR3, strT3, paragraphS3, this.f, ohm1Var, z2, id3, zP3, zO3, this.h, strU5, i3, list, new ry71(hrr0Var, (byte) 17), new aya1(hrr0Var2, (byte) 5)));
                                            kme1 kme1Var3 = new kme1(wj31Var4, (List) smc0VarK3, (List) k4p1.k(smc0VarN), bbcVarA, (ven0) hrr0Var, (ven0) hrr0Var2, (lnm) null);
                                            hme1Var.a = null;
                                            hme1Var.b = null;
                                            hme1Var.c = null;
                                            hme1Var.d = null;
                                            hme1Var.e = null;
                                            hme1Var.f = null;
                                            hme1Var.g = null;
                                            hme1Var.h = null;
                                            hme1Var.i = z2;
                                            hme1Var.t = i;
                                            hme1Var.X = i3;
                                            hme1Var.Y = i4;
                                            hme1Var.O0 = 6;
                                            objA = u3kVar5.a(kme1Var3, hme1Var);
                                            d9nVar = d9nVar4;
                                            if (objA == d9nVar) {
                                                return objA;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return d9nVar;
                    }
                }
                g7m1Var2 = g7m1Var5;
                card3 = card2;
                eme1Var = null;
                hme1Var.a = g7m1Var2;
                hme1Var.b = storyCard;
                hme1Var.c = card3;
                hme1Var.d = wj31Var;
                hme1Var.e = eme1Var;
                hme1Var.i = zV;
                hme1Var.O0 = 4;
                objB = ohm1Var.b("time_machine_last_viewed_year_index", hme1Var);
                if (objB != d9nVar) {
                    g7m1 g7m1Var10 = g7m1Var2;
                    card4 = card3;
                    storyCard3 = storyCard;
                    g7m1Var4 = g7m1Var10;
                    wj31Var3 = wj31Var;
                    obj = objB;
                    z2 = zV;
                    eme1Var2 = eme1Var;
                    str = (String) obj;
                    if (str != null) {
                        numC0 = nhc1.c0(str);
                    } else {
                        numC0 = null;
                    }
                    if (numC0 != null) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (numC0 != null) {
                        iIntValue = numC0.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    iP = yoi1.p(iIntValue, 0, card4.v().size() - 1);
                    if (i == 0) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                    }
                    if (i2 != 0) {
                        strU = null;
                    } else {
                        strU = ((SceneTemplate.TimeMachineContent.Card2.YearEntry) card4.v().get(iP)).u();
                    }
                    hrr0VarQ = v8r.q(strU);
                    hrr0VarQ2 = v8r.q(new Integer(0));
                    if (i2 != 0) {
                        strU2 = "intro";
                    } else {
                        strU2 = ((SceneTemplate.TimeMachineContent.Card2.YearEntry) card4.v().get(iP)).u();
                    }
                    bju bjuVar7 = g7m1Var4.b;
                    lme1 lme1Var5 = new lme1(card4, this, null, (byte) 1);
                    hme1Var.a = null;
                    hme1Var.b = storyCard3;
                    hme1Var.c = card4;
                    hme1Var.d = wj31Var3;
                    hme1Var.e = eme1Var2;
                    hme1Var.f = hrr0VarQ;
                    hme1Var.g = hrr0VarQ2;
                    hme1Var.h = strU2;
                    hme1Var.i = z2;
                    hme1Var.t = i;
                    hme1Var.X = iP;
                    hme1Var.Y = i2;
                    hme1Var.O0 = 5;
                    objD2 = bjuVar7.d("timeMachineBackgroundInputs", lme1Var5, hme1Var);
                    d9nVar = d9nVar;
                    if (objD2 != d9nVar) {
                        wj31Var4 = wj31Var3;
                        u3kVar = u3kVar2;
                        i3 = iP;
                        storyCard4 = storyCard3;
                        i4 = i2;
                        hrr0Var = hrr0VarQ;
                        str2 = strU2;
                        hrr0Var2 = hrr0VarQ2;
                        smc0 smc0VarN5 = k4p1.n();
                        smc0VarN5.addAll((List) objD2);
                        str2.getClass();
                        smc0VarN5.add(new pj31("enumYear", str2));
                        if (i4 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        smc0VarN5.add(new nj31("skip", z3));
                        smc0 smc0VarK4 = k4p1.k(smc0VarN5);
                        bbcVarA = mno1.a(-2, 0, 6);
                        smc0VarN = k4p1.n();
                        if (i4 != 0) {
                            smc0VarN.add(new ve8(bbcVarA, new zqe(hrr0Var, hrr0Var2, (byte) 13)));
                        }
                        h290 h290VarV5 = card4.v();
                        u3k u3kVar6 = u3kVar;
                        String strR4 = card4.r();
                        SceneTemplate.TimeMachineContent.Card2 card9 = card4;
                        String strT4 = card9.t();
                        d9n d9nVar5 = d9nVar;
                        Paragraph paragraphS4 = card9.s();
                        String id4 = storyCard4.getId();
                        boolean zP4 = card9.p();
                        boolean zO4 = card9.o();
                        String strU6 = card9.u();
                        if (eme1Var2 != null) {
                            list = z6x.a;
                        } else {
                            list = z6x.a;
                        }
                        smc0VarN.add(new ane1(h290VarV5, strR4, strT4, paragraphS4, this.f, ohm1Var, z2, id4, zP4, zO4, this.h, strU6, i3, list, new ry71(hrr0Var, (byte) 17), new aya1(hrr0Var2, (byte) 5)));
                        kme1 kme1Var4 = new kme1(wj31Var4, (List) smc0VarK4, (List) k4p1.k(smc0VarN), bbcVarA, (ven0) hrr0Var, (ven0) hrr0Var2, (lnm) null);
                        hme1Var.a = null;
                        hme1Var.b = null;
                        hme1Var.c = null;
                        hme1Var.d = null;
                        hme1Var.e = null;
                        hme1Var.f = null;
                        hme1Var.g = null;
                        hme1Var.h = null;
                        hme1Var.i = z2;
                        hme1Var.t = i;
                        hme1Var.X = i3;
                        hme1Var.Y = i4;
                        hme1Var.O0 = 6;
                        objA = u3kVar6.a(kme1Var4, hme1Var);
                        d9nVar = d9nVar5;
                        if (objA == d9nVar) {
                            return objA;
                        }
                    }
                }
                return d9nVar;
            case 3:
                z = hme1Var.i;
                wj31Var2 = hme1Var.d;
                card2 = hme1Var.c;
                storyCard2 = hme1Var.b;
                g7m1Var3 = hme1Var.a;
                hm5.M(obj);
                StoryCard storyCard9 = storyCard2;
                zV = z;
                card3 = card2;
                eme1Var = (eme1) obj;
                wj31Var = wj31Var2;
                storyCard = storyCard9;
                g7m1Var2 = g7m1Var3;
                hme1Var.a = g7m1Var2;
                hme1Var.b = storyCard;
                hme1Var.c = card3;
                hme1Var.d = wj31Var;
                hme1Var.e = eme1Var;
                hme1Var.i = zV;
                hme1Var.O0 = 4;
                objB = ohm1Var.b("time_machine_last_viewed_year_index", hme1Var);
                if (objB != d9nVar) {
                    g7m1 g7m1Var11 = g7m1Var2;
                    card4 = card3;
                    storyCard3 = storyCard;
                    g7m1Var4 = g7m1Var11;
                    wj31Var3 = wj31Var;
                    obj = objB;
                    z2 = zV;
                    eme1Var2 = eme1Var;
                    str = (String) obj;
                    if (str != null) {
                        numC0 = nhc1.c0(str);
                    } else {
                        numC0 = null;
                    }
                    if (numC0 != null) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (numC0 != null) {
                        iIntValue = numC0.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    iP = yoi1.p(iIntValue, 0, card4.v().size() - 1);
                    if (i == 0) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                    }
                    if (i2 != 0) {
                        strU = null;
                    } else {
                        strU = ((SceneTemplate.TimeMachineContent.Card2.YearEntry) card4.v().get(iP)).u();
                    }
                    hrr0VarQ = v8r.q(strU);
                    hrr0VarQ2 = v8r.q(new Integer(0));
                    if (i2 != 0) {
                        strU2 = "intro";
                    } else {
                        strU2 = ((SceneTemplate.TimeMachineContent.Card2.YearEntry) card4.v().get(iP)).u();
                    }
                    bju bjuVar8 = g7m1Var4.b;
                    lme1 lme1Var6 = new lme1(card4, this, null, (byte) 1);
                    hme1Var.a = null;
                    hme1Var.b = storyCard3;
                    hme1Var.c = card4;
                    hme1Var.d = wj31Var3;
                    hme1Var.e = eme1Var2;
                    hme1Var.f = hrr0VarQ;
                    hme1Var.g = hrr0VarQ2;
                    hme1Var.h = strU2;
                    hme1Var.i = z2;
                    hme1Var.t = i;
                    hme1Var.X = iP;
                    hme1Var.Y = i2;
                    hme1Var.O0 = 5;
                    objD2 = bjuVar8.d("timeMachineBackgroundInputs", lme1Var6, hme1Var);
                    d9nVar = d9nVar;
                    if (objD2 != d9nVar) {
                        wj31Var4 = wj31Var3;
                        u3kVar = u3kVar2;
                        i3 = iP;
                        storyCard4 = storyCard3;
                        i4 = i2;
                        hrr0Var = hrr0VarQ;
                        str2 = strU2;
                        hrr0Var2 = hrr0VarQ2;
                        smc0 smc0VarN6 = k4p1.n();
                        smc0VarN6.addAll((List) objD2);
                        str2.getClass();
                        smc0VarN6.add(new pj31("enumYear", str2));
                        if (i4 == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        smc0VarN6.add(new nj31("skip", z3));
                        smc0 smc0VarK5 = k4p1.k(smc0VarN6);
                        bbcVarA = mno1.a(-2, 0, 6);
                        smc0VarN = k4p1.n();
                        if (i4 != 0) {
                            smc0VarN.add(new ve8(bbcVarA, new zqe(hrr0Var, hrr0Var2, (byte) 13)));
                        }
                        h290 h290VarV6 = card4.v();
                        u3k u3kVar7 = u3kVar;
                        String strR5 = card4.r();
                        SceneTemplate.TimeMachineContent.Card2 card10 = card4;
                        String strT5 = card10.t();
                        d9n d9nVar6 = d9nVar;
                        Paragraph paragraphS5 = card10.s();
                        String id5 = storyCard4.getId();
                        boolean zP5 = card10.p();
                        boolean zO5 = card10.o();
                        String strU7 = card10.u();
                        if (eme1Var2 != null) {
                            list = z6x.a;
                        } else {
                            list = z6x.a;
                        }
                        smc0VarN.add(new ane1(h290VarV6, strR5, strT5, paragraphS5, this.f, ohm1Var, z2, id5, zP5, zO5, this.h, strU7, i3, list, new ry71(hrr0Var, (byte) 17), new aya1(hrr0Var2, (byte) 5)));
                        kme1 kme1Var5 = new kme1(wj31Var4, (List) smc0VarK5, (List) k4p1.k(smc0VarN), bbcVarA, (ven0) hrr0Var, (ven0) hrr0Var2, (lnm) null);
                        hme1Var.a = null;
                        hme1Var.b = null;
                        hme1Var.c = null;
                        hme1Var.d = null;
                        hme1Var.e = null;
                        hme1Var.f = null;
                        hme1Var.g = null;
                        hme1Var.h = null;
                        hme1Var.i = z2;
                        hme1Var.t = i;
                        hme1Var.X = i3;
                        hme1Var.Y = i4;
                        hme1Var.O0 = 6;
                        objA = u3kVar7.a(kme1Var5, hme1Var);
                        d9nVar = d9nVar6;
                        if (objA == d9nVar) {
                            return objA;
                        }
                    }
                }
                return d9nVar;
            case 4:
                boolean z5 = hme1Var.i;
                eme1 eme1Var3 = hme1Var.e;
                wj31 wj31Var5 = hme1Var.d;
                SceneTemplate.TimeMachineContent.Card2 card11 = hme1Var.c;
                StoryCard storyCard10 = hme1Var.b;
                g7m1 g7m1Var12 = hme1Var.a;
                hm5.M(obj);
                eme1Var2 = eme1Var3;
                g7m1Var4 = g7m1Var12;
                card4 = card11;
                z2 = z5;
                storyCard3 = storyCard10;
                wj31Var3 = wj31Var5;
                str = (String) obj;
                if (str != null) {
                    numC0 = nhc1.c0(str);
                } else {
                    numC0 = null;
                }
                if (numC0 != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (numC0 != null) {
                    iIntValue = numC0.intValue();
                } else {
                    iIntValue = 0;
                }
                iP = yoi1.p(iIntValue, 0, card4.v().size() - 1);
                if (i == 0) {
                    i2 = 0;
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    strU = null;
                } else {
                    strU = ((SceneTemplate.TimeMachineContent.Card2.YearEntry) card4.v().get(iP)).u();
                }
                hrr0VarQ = v8r.q(strU);
                hrr0VarQ2 = v8r.q(new Integer(0));
                if (i2 != 0) {
                    strU2 = "intro";
                } else {
                    strU2 = ((SceneTemplate.TimeMachineContent.Card2.YearEntry) card4.v().get(iP)).u();
                }
                bju bjuVar9 = g7m1Var4.b;
                lme1 lme1Var7 = new lme1(card4, this, null, (byte) 1);
                hme1Var.a = null;
                hme1Var.b = storyCard3;
                hme1Var.c = card4;
                hme1Var.d = wj31Var3;
                hme1Var.e = eme1Var2;
                hme1Var.f = hrr0VarQ;
                hme1Var.g = hrr0VarQ2;
                hme1Var.h = strU2;
                hme1Var.i = z2;
                hme1Var.t = i;
                hme1Var.X = iP;
                hme1Var.Y = i2;
                hme1Var.O0 = 5;
                objD2 = bjuVar9.d("timeMachineBackgroundInputs", lme1Var7, hme1Var);
                d9nVar = d9nVar;
                if (objD2 != d9nVar) {
                    wj31Var4 = wj31Var3;
                    u3kVar = u3kVar2;
                    i3 = iP;
                    storyCard4 = storyCard3;
                    i4 = i2;
                    hrr0Var = hrr0VarQ;
                    str2 = strU2;
                    hrr0Var2 = hrr0VarQ2;
                    smc0 smc0VarN7 = k4p1.n();
                    smc0VarN7.addAll((List) objD2);
                    str2.getClass();
                    smc0VarN7.add(new pj31("enumYear", str2));
                    if (i4 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    smc0VarN7.add(new nj31("skip", z3));
                    smc0 smc0VarK6 = k4p1.k(smc0VarN7);
                    bbcVarA = mno1.a(-2, 0, 6);
                    smc0VarN = k4p1.n();
                    if (i4 != 0) {
                        smc0VarN.add(new ve8(bbcVarA, new zqe(hrr0Var, hrr0Var2, (byte) 13)));
                    }
                    h290 h290VarV7 = card4.v();
                    u3k u3kVar8 = u3kVar;
                    String strR6 = card4.r();
                    SceneTemplate.TimeMachineContent.Card2 card12 = card4;
                    String strT6 = card12.t();
                    d9n d9nVar7 = d9nVar;
                    Paragraph paragraphS6 = card12.s();
                    String id6 = storyCard4.getId();
                    boolean zP6 = card12.p();
                    boolean zO6 = card12.o();
                    String strU8 = card12.u();
                    if (eme1Var2 != null) {
                        list = z6x.a;
                    } else {
                        list = z6x.a;
                    }
                    smc0VarN.add(new ane1(h290VarV7, strR6, strT6, paragraphS6, this.f, ohm1Var, z2, id6, zP6, zO6, this.h, strU8, i3, list, new ry71(hrr0Var, (byte) 17), new aya1(hrr0Var2, (byte) 5)));
                    kme1 kme1Var6 = new kme1(wj31Var4, (List) smc0VarK6, (List) k4p1.k(smc0VarN), bbcVarA, (ven0) hrr0Var, (ven0) hrr0Var2, (lnm) null);
                    hme1Var.a = null;
                    hme1Var.b = null;
                    hme1Var.c = null;
                    hme1Var.d = null;
                    hme1Var.e = null;
                    hme1Var.f = null;
                    hme1Var.g = null;
                    hme1Var.h = null;
                    hme1Var.i = z2;
                    hme1Var.t = i;
                    hme1Var.X = i3;
                    hme1Var.Y = i4;
                    hme1Var.O0 = 6;
                    objA = u3kVar8.a(kme1Var6, hme1Var);
                    d9nVar = d9nVar7;
                    if (objA == d9nVar) {
                        return objA;
                    }
                }
                return d9nVar;
            case 5:
                int i7 = hme1Var.Y;
                int i8 = hme1Var.X;
                i = hme1Var.t;
                z2 = hme1Var.i;
                str2 = hme1Var.h;
                hrr0VarQ2 = hme1Var.g;
                hrr0Var = hme1Var.f;
                eme1Var2 = hme1Var.e;
                wj31 wj31Var6 = hme1Var.d;
                card4 = hme1Var.c;
                StoryCard storyCard11 = hme1Var.b;
                hm5.M(obj);
                storyCard4 = storyCard11;
                i4 = i7;
                i3 = i8;
                objD2 = obj;
                wj31Var4 = wj31Var6;
                u3kVar = u3kVar2;
                hrr0Var2 = hrr0VarQ2;
                smc0 smc0VarN8 = k4p1.n();
                smc0VarN8.addAll((List) objD2);
                str2.getClass();
                smc0VarN8.add(new pj31("enumYear", str2));
                if (i4 == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                smc0VarN8.add(new nj31("skip", z3));
                smc0 smc0VarK7 = k4p1.k(smc0VarN8);
                bbcVarA = mno1.a(-2, 0, 6);
                smc0VarN = k4p1.n();
                if (i4 != 0) {
                    smc0VarN.add(new ve8(bbcVarA, new zqe(hrr0Var, hrr0Var2, (byte) 13)));
                }
                h290 h290VarV8 = card4.v();
                u3k u3kVar9 = u3kVar;
                String strR7 = card4.r();
                SceneTemplate.TimeMachineContent.Card2 card13 = card4;
                String strT7 = card13.t();
                d9n d9nVar8 = d9nVar;
                Paragraph paragraphS7 = card13.s();
                String id7 = storyCard4.getId();
                boolean zP7 = card13.p();
                boolean zO7 = card13.o();
                String strU9 = card13.u();
                if (eme1Var2 != null) {
                    list = z6x.a;
                } else {
                    list = z6x.a;
                }
                smc0VarN.add(new ane1(h290VarV8, strR7, strT7, paragraphS7, this.f, ohm1Var, z2, id7, zP7, zO7, this.h, strU9, i3, list, new ry71(hrr0Var, (byte) 17), new aya1(hrr0Var2, (byte) 5)));
                kme1 kme1Var7 = new kme1(wj31Var4, (List) smc0VarK7, (List) k4p1.k(smc0VarN), bbcVarA, (ven0) hrr0Var, (ven0) hrr0Var2, (lnm) null);
                hme1Var.a = null;
                hme1Var.b = null;
                hme1Var.c = null;
                hme1Var.d = null;
                hme1Var.e = null;
                hme1Var.f = null;
                hme1Var.g = null;
                hme1Var.h = null;
                hme1Var.i = z2;
                hme1Var.t = i;
                hme1Var.X = i3;
                hme1Var.Y = i4;
                hme1Var.O0 = 6;
                objA = u3kVar9.a(kme1Var7, hme1Var);
                d9nVar = d9nVar8;
                if (objA == d9nVar) {
                    return d9nVar;
                }
                return objA;
            case 6:
                hm5.M(obj);
                return obj;
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
