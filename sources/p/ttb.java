package p;

import android.graphics.Color;
import com.spotify.wrapped.v1.proto.Action;
import com.spotify.wrapped.v1.proto.ButtonConfiguration;
import com.spotify.wrapped.v1.proto.CardShareConfiguration;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ttb implements o1i {
    public final kly0 a;
    public final xgm1 b;
    public final mub c;
    public final zxl1 d;
    public final lzn0 e;

    public ttb(kly0 kly0Var, xgm1 xgm1Var, mub mubVar, zxl1 zxl1Var, lzn0 lzn0Var) {
        this.a = kly0Var;
        this.b = xgm1Var;
        this.c = mubVar;
        this.d = zxl1Var;
        this.e = lzn0Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:104:0x022e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0242  */
    /* JADX WARN: Code duplicated, block: B:110:0x0246  */
    /* JADX WARN: Code duplicated, block: B:111:0x0251  */
    /* JADX WARN: Code duplicated, block: B:115:0x0265  */
    /* JADX WARN: Code duplicated, block: B:117:0x0269  */
    /* JADX WARN: Code duplicated, block: B:119:0x0276  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:144:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:147:0x0302  */
    /* JADX WARN: Code duplicated, block: B:148:0x0306  */
    /* JADX WARN: Code duplicated, block: B:150:0x030a  */
    /* JADX WARN: Code duplicated, block: B:151:0x031b  */
    /* JADX WARN: Code duplicated, block: B:153:0x033c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0348  */
    /* JADX WARN: Code duplicated, block: B:158:0x0359  */
    /* JADX WARN: Code duplicated, block: B:161:0x036c  */
    /* JADX WARN: Code duplicated, block: B:162:0x036e  */
    /* JADX WARN: Code duplicated, block: B:165:0x0378  */
    /* JADX WARN: Code duplicated, block: B:166:0x037b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0389  */
    /* JADX WARN: Code duplicated, block: B:174:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:178:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:184:0x042c  */
    /* JADX WARN: Code duplicated, block: B:188:0x044e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0464  */
    /* JADX WARN: Code duplicated, block: B:196:0x047b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0494  */
    /* JADX WARN: Code duplicated, block: B:204:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:210:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:214:0x04df  */
    /* JADX WARN: Code duplicated, block: B:218:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:222:0x050e  */
    /* JADX WARN: Code duplicated, block: B:226:0x0525  */
    /* JADX WARN: Code duplicated, block: B:236:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0160  */
    /* JADX WARN: Code duplicated, block: B:78:0x0163  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01af  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:94:0x01da  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ec  */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(btb btbVar, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        boolean z4;
        hp80 hp80Var;
        xhm1 xhm1Var;
        String str;
        ven0 ven0VarS;
        boolean zG;
        Object objT;
        ven0 ven0VarG;
        ArrayList arrayList;
        Iterator it;
        int i2;
        ArrayList arrayList2;
        Iterator it2;
        CardShareConfiguration cardShareConfigurationP;
        String strR;
        String strQ;
        Integer numValueOf;
        String strN;
        Integer numValueOf2;
        Object next;
        ArrayList arrayList3;
        w50 w50Var;
        int i3;
        iec iecVar;
        mr20 mr20Var;
        tob1 tob1Var;
        boolean z5;
        tob1 tob1Var2;
        int i4;
        int i5;
        l2u0 l2u0Var;
        long j;
        boolean zG2;
        Object objT2;
        lub lubVar;
        boolean zI;
        Object objT3;
        boolean zI2;
        Object f80Var;
        int i6;
        boolean zI3;
        Object objT4;
        boolean zI4;
        Object objT5;
        boolean zI5;
        Object objT6;
        boolean zI6;
        Object objT7;
        boolean zI7;
        Object objT8;
        boolean zE;
        Object objT9;
        byte b;
        boolean zI8;
        Object objT10;
        boolean zI9;
        Object objT11;
        boolean zI10;
        Object objT12;
        boolean zI11;
        Object objT13;
        Object objT14;
        Action actionN;
        l2u0 l2u0Var2;
        Object obj = fkj0.X;
        ArrayList arrayList4 = btbVar.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1739977450);
        int i7 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(btbVar) : x340Var.i(btbVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i7 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i7 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i7 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i7 & 1, (i7 & 1171) != 1170)) {
            pe peVarA = ef.a(x340Var);
            Object objT15 = x340Var.T();
            if (objT15 == obj) {
                objT15 = (tjs0) this.a.get();
                x340Var.s0(objT15);
            }
            tjs0 tjs0Var = (tjs0) objT15;
            Object objT16 = x340Var.T();
            if (objT16 == obj) {
                objT16 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT16);
            }
            tob1 tob1Var3 = (ven0) objT16;
            Object objT17 = x340Var.T();
            if (objT17 == obj) {
                objT17 = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT17;
            boolean zI12 = x340Var.i(tob1Var3) | x340Var.i(err0Var);
            Object objT18 = x340Var.T();
            if (zI12 || objT18 == obj) {
                objT18 = new ntb(tob1Var3, err0Var, (byte) 0);
                x340Var.s0(objT18);
            }
            int i8 = i7 & 14;
            oto1.c(btbVar, o0iVar, (iu30) objT18, x340Var, i8 | 64 | (i7 & 112));
            tjs0Var.getClass();
            boolean z6 = !pwo1.v(peVarA, tjs0Var);
            ven0 ven0VarH = rwq.h(this.b.getState(), x340Var, 0);
            StoryCard storyCard = ((wgm1) ven0VarH.getValue()).a;
            n2u0 n2u0Var = o0iVar.c.b;
            if (n2u0Var == null) {
                hhg1.n("Required value was null.");
                return;
            }
            tob1 tob1VarH = rwq.h(n2u0Var.c, x340Var, 0);
            if (!((Boolean) tob1Var3.getValue()).booleanValue() || (l2u0Var2 = (l2u0) tob1VarH.getValue()) == null) {
                z = true;
            } else {
                z = true;
                if (l2u0Var2.a) {
                    z2 = false;
                }
                if (storyCard == null && storyCard.w() == z && storyCard.r().s() == 6) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                num = ((wgm1) ven0VarH.getValue()).c.b;
                z4 = ((wgm1) ven0VarH.getValue()).c.c;
                int i9 = i7;
                hp80Var = o0iVar.e;
                xhm1Var = (xhm1) x340Var.k(yhm1.a);
                if (xhm1Var != null) {
                    str = xhm1Var.a;
                } else {
                    str = "";
                }
                ven0VarS = v8r.s(str, x340Var);
                zG = x340Var.g(arrayList4) | x340Var.g(storyCard) | x340Var.g((String) ven0VarS.getValue()) | x340Var.g(num) | x340Var.h(z4);
                objT = x340Var.T();
                ven0VarG = null;
                if (!zG || objT == obj) {
                    arrayList = new ArrayList();
                    it = arrayList4.iterator();
                    while (it.hasNext()) {
                        Iterator it3 = it;
                        next = it3.next();
                        int i10 = i8;
                        if (next instanceof w50) {
                            arrayList.add(next);
                        }
                        it = it3;
                        i8 = i10;
                    }
                    i2 = i8;
                    arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ButtonConfiguration buttonConfiguration = ((w50) it2.next()).a;
                        String str2 = (String) ven0VarS.getValue();
                        if (storyCard != null || (cardShareConfigurationP = storyCard.v()) == null) {
                            cardShareConfigurationP = CardShareConfiguration.p();
                        }
                        CardShareConfiguration cardShareConfiguration = cardShareConfigurationP;
                        cardShareConfiguration.getClass();
                        Iterator it4 = it2;
                        mmr0 mmr0VarA = p1p1.A(cardShareConfiguration, num, z4);
                        CardShareConfiguration cardShareConfiguration2 = (CardShareConfiguration) mmr0VarA.a;
                        int iIntValue = ((Number) mmr0VarA.b).intValue();
                        String strP = buttonConfiguration.q().p();
                        strR = buttonConfiguration.q().r();
                        strR.getClass();
                        if (strR.length() <= 0) {
                            strR = null;
                        }
                        strQ = buttonConfiguration.q().q();
                        strQ.getClass();
                        if (ihc1.y0(strQ)) {
                            strQ = null;
                        }
                        if (strQ != null) {
                            numValueOf = Integer.valueOf(Color.parseColor(strQ));
                        } else {
                            numValueOf = null;
                        }
                        strN = buttonConfiguration.q().n();
                        strN.getClass();
                        if (ihc1.y0(strN)) {
                            strN = null;
                        }
                        if (strN != null) {
                            numValueOf2 = Integer.valueOf(Color.parseColor(strN));
                        } else {
                            numValueOf2 = null;
                        }
                        StoryCard storyCard2 = storyCard;
                        arrayList2.add(jec.a(this.d, buttonConfiguration, new q8m1(str2, cardShareConfiguration2, new gec(numValueOf, numValueOf2, strP, strR), iIntValue, 40), str2, 20));
                        it2 = it4;
                        storyCard = storyCard2;
                    }
                    x340Var.s0(arrayList2);
                    objT = arrayList2;
                } else {
                    i2 = i8;
                }
                List list = (List) objT;
                arrayList3 = new ArrayList();
                for (Object obj2 : arrayList4) {
                    if (obj2 instanceof w50) {
                        arrayList3.add(obj2);
                    }
                }
                w50Var = (w50) o7h.s0(arrayList3);
                if (w50Var == null && (actionN = w50Var.a.n()) != null) {
                    int iN = actionN.n();
                    switch (iN == 0 ? -1 : utb.a[l1d.C(iN)]) {
                        case -1:
                        case 6:
                        case 7:
                            i3 = 0;
                            break;
                        case 0:
                        default:
                            eg.o();
                            return;
                        case 1:
                            i3 = 1;
                            break;
                        case 2:
                            i3 = 2;
                            break;
                        case 3:
                            i3 = 3;
                            break;
                        case 4:
                            i3 = 4;
                            break;
                        case 5:
                            i3 = 5;
                            break;
                    }
                } else {
                    i3 = 0;
                }
                iecVar = (iec) o7h.s0(list);
                if (iecVar != null) {
                    mr20Var = iecVar.c;
                } else {
                    mr20Var = null;
                }
                if (mr20Var == null) {
                    x340Var.i0(294231767);
                    x340Var.r(false);
                    z5 = false;
                    tob1Var2 = tob1VarH;
                    tob1Var = tob1Var3;
                    i4 = 1;
                } else {
                    x340Var.i0(-1375981974);
                    tob1Var = tob1Var3;
                    z5 = false;
                    tob1Var2 = tob1VarH;
                    i4 = 1;
                    ven0VarG = rwq.g(mr20Var, Boolean.TRUE, (o8n) null, x340Var, 48, 2);
                    x340Var.r(false);
                }
                if (ven0VarG == null) {
                    x340Var.i0(294263915);
                    objT14 = x340Var.T();
                    if (objT14 == obj) {
                        objT14 = v8r.q(Boolean.TRUE);
                        x340Var.s0(objT14);
                    }
                    ven0VarG = (ven0) objT14;
                } else {
                    x340Var.i0(-1375983448);
                }
                x340Var.r(z5);
                if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                    i5 = 2;
                } else {
                    i5 = i4;
                }
                l2u0Var = (l2u0) tob1Var2.getValue();
                if (l2u0Var != null) {
                    j = l2u0Var.c;
                } else {
                    j = 0;
                }
                zG2 = x340Var.g(hp80Var);
                objT2 = x340Var.T();
                if (zG2 || objT2 == obj) {
                    objT2 = new lub(this.c, hp80Var, new bp9(ven0VarS, (byte) 5));
                    x340Var.s0(objT2);
                }
                lubVar = (lub) objT2;
                zI = x340Var.i(lubVar);
                objT3 = x340Var.T();
                if (zI || objT3 == obj) {
                    objT3 = new tla(lubVar, (byte) 17);
                    x340Var.s0(objT3);
                }
                qxd0.i(lubVar, (iu30) objT3, x340Var);
                egm1 egm1Var = ((wgm1) ven0VarH.getValue()).c;
                boolean zBooleanValue = ((Boolean) tob1Var.getValue()).booleanValue();
                Integer numValueOf3 = Integer.valueOf(err0Var.s());
                zI2 = x340Var.i(this) | x340Var.i(hp80Var) | x340Var.i(ven0VarS) | x340Var.i(tob1Var2);
                Object objT19 = x340Var.T();
                if (!zI2 || objT19 == obj) {
                    i6 = i3;
                    f80Var = new f80(this, hp80Var, ven0VarS, tob1Var2, (byte) 15);
                    x340Var.s0(f80Var);
                } else {
                    i6 = i3;
                    f80Var = objT19;
                }
                Function0 function0 = (Function0) f80Var;
                zI3 = x340Var.i(this) | x340Var.i(hp80Var) | x340Var.i(ven0VarS);
                objT4 = x340Var.T();
                if (zI3 || objT4 == obj) {
                    objT4 = new oo6(this, hp80Var, ven0VarS, (byte) 19);
                    x340Var.s0(objT4);
                }
                iu30 iu30Var = (iu30) objT4;
                zI4 = x340Var.i(lubVar) | x340Var.f(j) | x340Var.h((boolean) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0445: ARITH (r2v11 'zI4' boolean) = (wrap boolean:0x0440: ARITH (wrap boolean:0x0438: INVOKE (r13v1 'x340Var' p.x340), (r15v7 'lubVar' p.lub) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:1081)) | (wrap boolean:0x043c: INVOKE (r13v1 'x340Var' p.x340), (r10v23 'j' long) VIRTUAL call: p.x340.f(long):boolean A[WRAPPED] (LINE:1085)) A[DONT_WRAP, WRAPPED] (LINE:1089)) | (wrap boolean:0x0441: INVOKE 
                      (r13v1 'x340Var' p.x340)
                      (wrap boolean:?: CAST (boolean) (r25v0 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]))
                     VIRTUAL call: p.x340.h(boolean):boolean A[WRAPPED] (LINE:1090)) (LINE:1094) in method: p.ttb.c(p.btb, p.o0i, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v0 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1442
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.ttb.a(p.btb, p.o0i, p.qim0, p.b0k, int):void");
            }
        }
