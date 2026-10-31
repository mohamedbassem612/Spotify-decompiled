package p;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l96 {
    public final Resources a;
    public final Set b;
    public final da6 c;
    public final c9n d;
    public final o86 e;
    public final x1i1 f;
    public final ba6 g;
    public final mlw0 h;
    public final mju i;
    public final e220 j;
    public final q120 k;
    public final a1r0 l;
    public final axc1 m;
    public final Map n;
    public final a4i1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final idd1 f53p;
    public final jd6 q;
    public bs91 r;
    public c9n s;

    public l96(Resources resources, Function0 function0, Set set, da6 da6Var, c9n c9nVar, o86 o86Var, x1i1 x1i1Var, o3o o3oVar, ba6 ba6Var, mlw0 mlw0Var, mju mjuVar, e220 e220Var, q120 q120Var, a1r0 a1r0Var, axc1 axc1Var, Map map, a4i1 a4i1Var) {
        this.a = resources;
        this.b = set;
        this.c = da6Var;
        this.d = c9nVar;
        this.e = o86Var;
        this.f = x1i1Var;
        this.g = ba6Var;
        this.h = mlw0Var;
        this.i = mjuVar;
        this.j = e220Var;
        this.k = q120Var;
        this.l = a1r0Var;
        this.m = axc1Var;
        this.n = map;
        this.o = a4i1Var;
        if (set.isEmpty()) {
            eg.m("No PromptChipFactory bindings reached the artifact page. Every chip module must contribute @IntoSet PromptChipFactory in MainActivityModule.");
            throw null;
        }
        this.f53p = new idd1(new lj2(function0, (byte) 6));
        this.q = o3oVar.a(function0);
    }

    public static final String b(ven0 ven0Var) {
        return (String) ven0Var.getValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.ni20 */
    /* JADX WARN: Code duplicated, block: B:170:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:171:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:175:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:180:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:181:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:185:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:189:0x0615  */
    /* JADX WARN: Code duplicated, block: B:195:0x0634  */
    /* JADX WARN: Code duplicated, block: B:201:0x0654  */
    /* JADX WARN: Code duplicated, block: B:207:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:210:0x06da  */
    /* JADX WARN: Code duplicated, block: B:218:0x0710  */
    /* JADX WARN: Code duplicated, block: B:219:0x0721  */
    /* JADX WARN: Code duplicated, block: B:222:0x0744  */
    /* JADX WARN: Code duplicated, block: B:224:0x079d  */
    /* JADX WARN: Code duplicated, block: B:226:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:228:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:231:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:232:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:238:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:241:0x0800  */
    /* JADX WARN: Code duplicated, block: B:243:0x0809  */
    /* JADX WARN: Code duplicated, block: B:246:0x0859  */
    /* JADX WARN: Code duplicated, block: B:247:0x085c  */
    /* JADX WARN: Code duplicated, block: B:251:0x0868  */
    /* JADX WARN: Code duplicated, block: B:256:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:257:0x08af  */
    /* JADX WARN: Code duplicated, block: B:263:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:269:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:272:0x091e  */
    /* JADX WARN: Code duplicated, block: B:275:0x093a  */
    /* JADX WARN: Code duplicated, block: B:277:0x095c  */
    /* JADX WARN: Code duplicated, block: B:279:0x0977  */
    /* JADX WARN: Code duplicated, block: B:281:0x097c  */
    /* JADX WARN: Code duplicated, block: B:283:0x09cc  */
    /* JADX WARN: Code duplicated, block: B:284:0x09ce  */
    /* JADX WARN: Code duplicated, block: B:290:0x09e6  */
    /* JADX WARN: Code duplicated, block: B:293:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:295:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:297:0x0a15  */
    /* JADX WARN: Code duplicated, block: B:298:0x0a17  */
    /* JADX WARN: Code duplicated, block: B:302:0x0a20  */
    /* JADX WARN: Code duplicated, block: B:306:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:307:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:310:0x0ab8  */
    /* JADX WARN: Code duplicated, block: B:312:0x0ac1  */
    /* JADX WARN: Code duplicated, block: B:314:0x0ac9  */
    /* JADX WARN: Code duplicated, block: B:317:0x0b01  */
    /* JADX WARN: Code duplicated, block: B:318:0x0b08  */
    /* JADX WARN: Code duplicated, block: B:321:0x0b49  */
    /* JADX WARN: Code duplicated, block: B:323:0x0b5d  */
    /* JADX WARN: Code duplicated, block: B:328:0x0b72  */
    /* JADX WARN: Code duplicated, block: B:332:0x0b80  */
    /* JADX WARN: Code duplicated, block: B:334:0x0b85  */
    /* JADX WARN: Code duplicated, block: B:337:0x0bb7  */
    /* JADX WARN: Code duplicated, block: B:338:0x0bba  */
    /* JADX WARN: Code duplicated, block: B:341:0x0be2  */
    /* JADX WARN: Code duplicated, block: B:346:0x0c00  */
    /* JADX WARN: Code duplicated, block: B:348:0x0c03  */
    /* JADX WARN: Code duplicated, block: B:376:0x0cf6 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:380:0x0d10 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:381:0x0d12  */
    /* JADX WARN: Code duplicated, block: B:384:0x0d34 A[LOOP:2: B:382:0x0d2e->B:384:0x0d34, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:389:0x0d61  */
    /* JADX WARN: Code duplicated, block: B:391:0x0d7d  */
    /* JADX WARN: Code duplicated, block: B:396:0x0dab  */
    /* JADX WARN: Code duplicated, block: B:401:0x0dfc  */
    /* JADX WARN: Code duplicated, block: B:403:0x0e05  */
    /* JADX WARN: Code duplicated, block: B:404:0x0e09  */
    /* JADX WARN: Code duplicated, block: B:406:0x0e48  */
    /* JADX WARN: Code duplicated, block: B:408:0x0e4c  */
    /* JADX WARN: Code duplicated, block: B:410:0x0e64  */
    /* JADX WARN: Code duplicated, block: B:411:0x0ec0  */
    /* JADX WARN: Code duplicated, block: B:418:0x0ee1  */
    /* JADX WARN: Code duplicated, block: B:437:0x0f79  */
    /* JADX WARN: Code duplicated, block: B:439:0x0fa7  */
    /* JADX WARN: Code duplicated, block: B:441:0x0fb3  */
    /* JADX WARN: Code duplicated, block: B:442:0x0fbd  */
    /* JADX WARN: Code duplicated, block: B:444:0x0fcf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:445:0x0fd1  */
    /* JADX WARN: Code duplicated, block: B:448:0x0fe2  */
    /* JADX WARN: Code duplicated, block: B:449:0x0fe4  */
    /* JADX WARN: Code duplicated, block: B:452:0x0fec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:453:0x0fee  */
    /* JADX WARN: Code duplicated, block: B:456:0x1000  */
    /* JADX WARN: Code duplicated, block: B:457:0x1002  */
    /* JADX WARN: Code duplicated, block: B:460:0x100a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:461:0x100c  */
    /* JADX WARN: Code duplicated, block: B:464:0x1024  */
    /* JADX WARN: Code duplicated, block: B:467:0x1031  */
    /* JADX WARN: Code duplicated, block: B:469:0x1039  */
    /* JADX WARN: Code duplicated, block: B:470:0x103b  */
    /* JADX WARN: Code duplicated, block: B:473:0x1042 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:474:0x1044  */
    /* JADX WARN: Code duplicated, block: B:477:0x1052  */
    /* JADX WARN: Code duplicated, block: B:478:0x1054  */
    /* JADX WARN: Code duplicated, block: B:481:0x105b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:482:0x105d  */
    /* JADX WARN: Code duplicated, block: B:485:0x106b  */
    /* JADX WARN: Code duplicated, block: B:486:0x106d  */
    /* JADX WARN: Code duplicated, block: B:489:0x1074 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:490:0x1076  */
    /* JADX WARN: Code duplicated, block: B:492:0x1088  */
    /* JADX WARN: Code duplicated, block: B:493:0x1092  */
    /* JADX WARN: Code duplicated, block: B:495:0x1096  */
    /* JADX WARN: Code duplicated, block: B:512:0x0d88 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x0dc5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x0da5 A[SYNTHETIC] */
    public final void a(fa6 fa6Var, iu30 iu30Var, b0k b0kVar, int i) throws ni20 {
        fa6 fa6Var2;
        iu30 iu30Var2;
        b0k b0kVar2;
        Object d96Var;
        Object obj;
        b0k b0kVar3;
        ven0 ven0Var;
        ven0 ven0Var2;
        tob1 tob1Var;
        ven0 ven0Var3;
        err0 err0Var;
        hwx0 hwx0Var;
        ven0 ven0Var4;
        tob1 tob1Var2;
        l96 l96Var;
        ven0 ven0Var5;
        psk pskVar;
        mn20 mn20VarF;
        psk pskVar2;
        Object obj2;
        ven0 ven0Var6;
        fa6 fa6Var3;
        tob1 tob1Var3;
        tob1 tob1Var4;
        err0 err0Var2;
        axx0 axx0Var;
        iu30 iu30Var3;
        boolean z;
        boolean z2;
        Object objT;
        iu30 iu30Var4;
        iu30 iu30Var5;
        ven0 ven0Var7;
        boolean z3;
        Object objT2;
        axx0 axx0Var2;
        hwx0 hwx0Var2;
        boolean zG;
        Object objT3;
        boolean zI;
        Object objT4;
        boolean zI2;
        Object objT5;
        Object obj3;
        Function0 function0;
        vu30 vu30Var;
        vu30 vu30Var2;
        vu30 vu30Var3;
        llj lljVar;
        psk pskVar3;
        ven0 ven0Var8;
        boolean zI3;
        Object objT6;
        Object objT7;
        ven0 ven0Var9;
        Object objT8;
        l96 l96Var2;
        tob1 tob1Var5;
        z3i1 z3i1VarD;
        nbh nbhVar;
        l96 l96Var3;
        tob1 tob1Var6;
        g36 g36Var;
        nl3 nl3Var;
        chr0 chr0Var;
        int i2;
        ni20 ni20Var;
        boolean z4;
        boolean z5;
        Object dbVar;
        boolean z6;
        hwx0 hwx0Var3;
        fa6 fa6Var4;
        iu30 iu30Var6;
        boolean z7;
        boolean z8;
        Object objT9;
        mbh mbhVarA;
        int iHashCode;
        ni20 ni20Var2;
        xos0 xos0VarC;
        qim0 qim0VarE;
        Function0 function1;
        vu30 vu30Var4;
        vu30 vu30Var5;
        llj lljVar2;
        vu30 vu30Var6;
        rxx0 rxx0VarN;
        xw51 xw51Var;
        ni20 ni20VarA;
        psk pskVar4;
        psk pskVar5;
        qim0 qim0Var;
        boolean z9;
        l96 l96Var4;
        y86 y86Var;
        byte b;
        int i3;
        gra graVar;
        h2c h2cVar;
        bs91 bs91Var;
        boolean z10;
        Object objT10;
        boolean z11;
        Object objT11;
        boolean z12;
        Object objT12;
        fqh1 fqh1VarC;
        o86 o86Var;
        boolean zI4;
        Object objT13;
        boolean z13;
        boolean z14;
        Object objT14;
        boolean z15;
        boolean z16;
        Object objT15;
        psk pskVar6;
        gab gabVar;
        g36 g36Var2;
        boolean z17;
        float f;
        Function0 function2;
        boolean z18;
        float f2;
        float f3;
        boolean z19;
        boolean zG2;
        LinkedHashMap linkedHashMap;
        Object obj4;
        LinkedHashMap linkedHashMap2;
        Set setKeySet;
        LinkedHashMap linkedHashMap3;
        Set setKeySet2;
        mbh mbhVarA2;
        int iHashCode2;
        xos0 xos0VarC2;
        qim0 qim0VarE2;
        mbh mbhVarA3;
        int iHashCode3;
        xos0 xos0VarC3;
        qim0 qim0VarE3;
        String str;
        String str2;
        boolean z20;
        long jK;
        boolean z21;
        boolean z22;
        axx0 axx0Var3;
        Object uh0Var;
        hwx0 hwx0Var4;
        ven0 ven0Var10;
        boolean z23;
        boolean z24;
        Object objT16;
        boolean zI5;
        Object objT17;
        byte b2;
        char c;
        boolean zI6;
        Object objT18;
        l96 l96Var5 = this;
        nl3 nl3Var2 = een.P0;
        vu30 vu30Var7 = y580.Y;
        llj lljVar3 = y580.R0;
        vu30 vu30Var8 = y580.N0;
        vu30 vu30Var9 = y580.O0;
        Object obj5 = fkj0.X;
        chr0 chr0Var2 = fa6Var.c;
        psk pskVar7 = fa6Var.b;
        y86 y86Var2 = fa6Var.a;
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(-867472187);
        int i4 = (i & 6) == 0 ? (b0kVar4.i(fa6Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= b0kVar4.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= b0kVar4.i(l96Var5) ? 256 : 128;
        }
        if (b0kVar4.Y(i4 & 1, (i4 & 147) != 146)) {
            Object objT19 = b0kVar4.T();
            if (objT19 == obj5) {
                objT19 = new bs91();
                b0kVar4.s0(objT19);
            }
            l96Var5.r = (bs91) objT19;
            Object objT20 = b0kVar4.T();
            if (objT20 == obj5) {
                objT20 = qxd0.M(o6x.a, b0kVar4);
                b0kVar4.s0(objT20);
            }
            l96Var5.s = (c9n) objT20;
            int i5 = i4;
            ven0 ven0VarV = xto.v(iu30Var, b0kVar4);
            bs91 bs91Var2 = l96Var5.r;
            if (bs91Var2 == null) {
                u890.C("snackbarHostState");
                throw null;
            }
            ven0 ven0VarV2 = xto.v(bs91Var2, b0kVar4);
            c9n c9nVar = l96Var5.s;
            if (c9nVar == null) {
                u890.C("coroutineScope");
                throw null;
            }
            ven0 ven0VarV3 = xto.v(c9nVar, b0kVar4);
            Object[] objArr = new Object[0];
            boolean zI7 = b0kVar4.i(fa6Var);
            Object objT21 = b0kVar4.T();
            if (zI7 || objT21 == obj5) {
                objT21 = new i26(fa6Var, (byte) 1);
                b0kVar4.s0(objT21);
            }
            ven0 ven0Var11 = (ven0) k5p1.s(objArr, (Function0) objT21, b0kVar4, 0);
            Object[] objArr2 = new Object[0];
            df41 df41Var = hwx0.c;
            df41 df41VarS = ern1.s();
            Object objT22 = b0kVar4.T();
            if (objT22 == obj5) {
                objT22 = ng5.N0;
                b0kVar4.s0(objT22);
            }
            hwx0 hwx0Var5 = (hwx0) k5p1.u(objArr2, df41VarS, (Function0) objT22, b0kVar4, 384);
            ba6 ba6Var = l96Var5.g;
            ba6Var.getClass();
            Object[] objArr3 = new Object[0];
            Object objT23 = b0kVar4.T();
            if (objT23 == obj5) {
                objT23 = ng5.Y;
                b0kVar4.s0(objT23);
            }
            tob1 tob1Var7 = (ven0) k5p1.s(objArr3, (Function0) objT23, b0kVar4, 48);
            Object objT24 = b0kVar4.T();
            if (objT24 == obj5) {
                objT24 = xto.t((Object) null);
                b0kVar4.s0(objT24);
            }
            tob1 tob1Var8 = (ven0) objT24;
            Object[] objArr4 = new Object[0];
            Object objT25 = b0kVar4.T();
            if (objT25 == obj5) {
                objT25 = ng5.Z;
                b0kVar4.s0(objT25);
            }
            err0 err0Var3 = (hdn0) k5p1.s(objArr4, (Function0) objT25, b0kVar4, 48);
            String str3 = y86Var2.c;
            boolean z25 = y86Var2.g;
            String str4 = y86Var2.c;
            boolean zI8 = b0kVar4.i(tob1Var7);
            Object objT26 = b0kVar4.T();
            if (zI8 || objT26 == obj5) {
                objT26 = new vk1(tob1Var7, (lnm) null, (byte) 1);
                b0kVar4.s0(objT26);
            }
            qxd0.t(str3, b0kVar4, (vu30) objT26);
            ven0 ven0VarV4 = xto.v(str4, b0kVar4);
            Object objT27 = b0kVar4.T();
            if (objT27 == obj5) {
                objT27 = new axx0();
                b0kVar4.s0(objT27);
            }
            axx0 axx0Var4 = (axx0) objT27;
            Object objT28 = b0kVar4.T();
            if (objT28 == obj5) {
                objT28 = xto.t(Boolean.FALSE);
                b0kVar4.s0(objT28);
            }
            tob1 tob1Var9 = (ven0) objT28;
            Object objT29 = b0kVar4.T();
            if (objT29 == obj5) {
                objT29 = xto.t((Object) null);
                b0kVar4.s0(objT29);
            }
            ven0 ven0Var12 = (ven0) objT29;
            ven0 ven0VarV5 = xto.v(b(ven0Var11), b0kVar4);
            boolean zI9 = b0kVar4.i(l96Var5) | b0kVar4.i(ven0Var12);
            Object objT30 = b0kVar4.T();
            if (zI9 || objT30 == obj5) {
                objT30 = new hi2(l96Var5, ven0Var12, (lnm) null, (byte) 28);
                b0kVar4.s0(objT30);
            }
            rih1 rih1Var = rih1.a;
            qxd0.t(rih1Var, b0kVar4, (vu30) objT30);
            Object objT31 = b0kVar4.T();
            if (objT31 == obj5) {
                objT31 = new Object();
                b0kVar4.s0(objT31);
            }
            Object obj6 = objT31;
            boolean zI10 = b0kVar4.i(l96Var5) | b0kVar4.i(obj6);
            Object objT32 = b0kVar4.T();
            if (zI10 || objT32 == obj5) {
                objT32 = new b96(l96Var5, obj6, (byte) 0);
                b0kVar4.s0(objT32);
            }
            qxd0.i(rih1Var, (iu30) objT32, b0kVar4);
            boolean zI11 = b0kVar4.i(l96Var5) | b0kVar4.i(ven0Var12) | b0kVar4.i(hwx0Var5) | b0kVar4.i(ven0VarV5) | b0kVar4.h(false) | b0kVar4.i(tob1Var8) | b0kVar4.i(tob1Var7) | b0kVar4.i(ven0VarV4) | b0kVar4.i(err0Var3) | b0kVar4.i(ven0Var11) | b0kVar4.i(ven0VarV);
            Object objT33 = b0kVar4.T();
            if (zI11 || objT33 == obj5) {
                obj = obj5;
                b0kVar3 = b0kVar4;
                d96Var = new d96(l96Var5, hwx0Var5, ven0Var12, ven0VarV5, tob1Var8, ven0VarV4, tob1Var7, err0Var3, ven0Var11, ven0VarV, (lnm) null);
                ven0Var = ven0Var12;
                ven0Var2 = ven0VarV;
                tob1Var = tob1Var8;
                ven0Var3 = ven0Var11;
                err0Var = err0Var3;
                tob1Var7 = tob1Var7;
                b0kVar3.s0(d96Var);
            } else {
                ven0Var3 = ven0Var11;
                d96Var = objT33;
                obj = obj5;
                tob1Var = tob1Var8;
                b0kVar3 = b0kVar4;
                err0Var = err0Var3;
                ven0Var2 = ven0VarV;
                ven0Var = ven0Var12;
            }
            qxd0.t(rih1Var, b0kVar3, (vu30) d96Var);
            Object objT34 = b0kVar3.T();
            if (objT34 == obj) {
                hwx0Var = hwx0Var5;
                ven0 ven0Var13 = ven0Var3;
                l96Var = this;
                objT34 = new j96(l96Var, hwx0Var, ven0Var2, ven0VarV3, ven0VarV2, ven0Var13, tob1Var9);
                tob1Var2 = tob1Var9;
                ven0Var4 = ven0Var13;
                b0kVar3.s0(objT34);
            } else {
                hwx0Var = hwx0Var5;
                ven0Var4 = ven0Var3;
                tob1Var2 = tob1Var9;
                l96Var = this;
            }
            iu30 iu30Var7 = (iu30) objT34;
            Set set = l96Var.b;
            boolean zG3 = b0kVar3.g(set);
            Object objT35 = b0kVar3.T();
            if (zG3 || objT35 == obj) {
                Set set2 = set;
                ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ypx0) it.next()).a(l96Var.d, l96Var.c, iu30Var7));
                }
                objT35 = o7h.p1(arrayList);
                b0kVar3.s0(objT35);
            }
            Set set3 = (Set) objT35;
            boolean zI12 = b0kVar3.i(l96Var);
            Object objT36 = b0kVar3.T();
            if (zI12 || objT36 == obj) {
                objT36 = new ve3(l96Var, (byte) 16);
                b0kVar3.s0(objT36);
            }
            qxd0.i(rih1Var, (iu30) objT36, b0kVar3);
            Object objT37 = b0kVar3.T();
            if (objT37 == obj) {
                objT37 = xto.t(Boolean.FALSE);
                b0kVar3.s0(objT37);
            }
            ven0 ven0Var14 = (ven0) objT37;
            Object objT38 = b0kVar3.T();
            if (objT38 == obj) {
                objT38 = xto.t(Boolean.FALSE);
                b0kVar3.s0(objT38);
            }
            ven0 ven0Var15 = (ven0) objT38;
            ven0 ven0VarV6 = xto.v(pskVar7, b0kVar3);
            ven0 ven0VarV7 = xto.v(b(ven0Var4), b0kVar3);
            boolean zI13 = b0kVar3.i(ven0Var15) | b0kVar3.i(ven0Var14) | b0kVar3.i(ven0VarV6) | b0kVar3.i(ven0VarV7) | b0kVar3.i(l96Var);
            Object objT39 = b0kVar3.T();
            if (zI13 || objT39 == obj) {
                ven0Var5 = ven0Var15;
                pskVar = pskVar7;
                objT39 = new uh0(l96Var, ven0Var5, ven0Var14, ven0VarV6, ven0VarV7, (byte) 4);
                b0kVar3.s0(objT39);
            } else {
                ven0Var5 = ven0Var15;
                pskVar = pskVar7;
            }
            qxd0.i(rih1Var, (iu30) objT39, b0kVar3);
            if (cev0.z(b0kVar3).d((wat) b0kVar3.k(t4k.h)) > 0) {
                b0kVar3.i0(-416937996);
                b0kVar3.u();
                mn20VarF = poo1.r(0, 14);
            } else {
                b0kVar3.i0(-416936349);
                mn20VarF = poo1.F(cev0.E(b0kVar3), 32);
                b0kVar3.u();
            }
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarY = too1.y(u291.e(qim0Var2), mn20VarF);
            gra graVar2 = een.d;
            gfh0 gfh0VarC = t1c.c(graVar2, false);
            int iHashCode4 = Long.hashCode(tgp1.l(b0kVar3));
            xos0 xos0VarC4 = b0kVar3.C();
            qim0 qim0VarE4 = zr7.E(b0kVar3, qim0VarY);
            hzj.A.getClass();
            if (b0kVar3.A() == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean zG4 = b0kVar3.G();
            Function0 function3 = hmb0.t1;
            if (zG4) {
                b0kVar3.l(function3);
            } else {
                b0kVar3.v0();
            }
            ven0 ven0Var16 = ven0Var5;
            nko1.H(gfh0VarC, b0kVar3, vu30Var9);
            nko1.H(xos0VarC4, b0kVar3, vu30Var8);
            x0d.q(iHashCode4, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE4, b0kVar3, vu30Var7);
            qim0 qim0VarE5 = u291.e(qim0Var2);
            uwr uwrVar = cbx.a;
            qim0 qim0VarN = anm1.N("artifact-page-content", dug.g(cbx.a(b0kVar3).a.a.a(), qim0VarE5));
            g36 g36Var3 = h36.c;
            err0 err0Var4 = err0Var;
            Object obj7 = obj;
            mbh mbhVarA4 = jbh.a(g36Var3, nl3Var2, b0kVar3, 0);
            int iHashCode5 = Long.hashCode(tgp1.l(b0kVar3));
            xos0 xos0VarC5 = b0kVar3.C();
            qim0 qim0VarE6 = zr7.E(b0kVar3, qim0VarN);
            if (b0kVar3.A() == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (b0kVar3.G()) {
                b0kVar3.l(function3);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA4, b0kVar3, vu30Var9);
            nko1.H(xos0VarC5, b0kVar3, vu30Var8);
            x0d.q(iHashCode5, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE6, b0kVar3, vu30Var7);
            String strB = y86Var2.b;
            chr0 chr0Var3 = chr0.b;
            psk pskVar8 = psk.b;
            if (chr0Var2 != chr0Var3 || pskVar != pskVar8 || ihc1.y0(strB)) {
                strB = null;
            }
            if (strB == null) {
                strB = ba6Var.b(pskVar);
            }
            String str5 = strB;
            String strD = ba6Var.d();
            String strValueOf = pskVar == pskVar8 ? String.valueOf(b(ven0Var4).length()) : "";
            chr0 chr0Var4 = chr0.c;
            boolean z26 = chr0Var2 == chr0Var4;
            int i6 = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x04e4: ARITH (r9v8 'i6' int) = (r24v0 int) & (112 int) A[DECLARE_VAR] (LINE:1253) in method: p.l96.a(p.fa6, p.iu30, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v0 int
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 4301
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.l96.a(p.fa6, p.iu30, p.b0k, int):void");
        }

        public final void c(ie40 ie40Var, qim0 qim0Var, b0k b0kVar, int i) {
            int i2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(590430924);
            if ((i & 6) == 0) {
                i2 = (x340Var.i(ie40Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(qim0Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.i(this) ? 256 : 128;
            }
            if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                x340Var.b0();
            } else if (ie40Var instanceof he40) {
                x340Var.i0(1636721653);
                he40 he40Var = (he40) ie40Var;
                boolean zE = x340Var.e(l1d.C(2));
                Object objT = x340Var.T();
                if (zE || objT == fkj0.X) {
                    x1i1 x1i1Var = this.f;
                    objT = new rwj(x1i1Var.a, new ij81(2, (byte) 18), x1i1Var.c);
                    x340Var.s0(objT);
                }
                otw.c((xpw) objT, new jh80(he40Var.b(), he40Var.a()), qim0Var, (ipb1) null, x340Var, (i2 << 3) & 896, 8);
                x340Var.r(false);
            } else {
                x340Var.i0(1636999382);
                x340Var.r(false);
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xx(this, ie40Var, qim0Var, i, (byte) 17);
            }
        }
    }
