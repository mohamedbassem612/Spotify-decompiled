package p;

import com.spotify.wrapped.v1.proto.StoryCard;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gh6 extends hab0 implements xu30 {
    public final /* synthetic */ String N0;
    public final /* synthetic */ String O0;
    public final /* synthetic */ xu30 P0;
    public final /* synthetic */ int Q0;
    public final /* synthetic */ yj41 R0;
    public final /* synthetic */ c380 S0;
    public final /* synthetic */ float T0;
    public final /* synthetic */ float U0;
    public final /* synthetic */ uh6 V0;
    public final /* synthetic */ uh6 W0;
    public final /* synthetic */ int X;
    public final /* synthetic */ vu30 X0;
    public final /* synthetic */ vu30 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ c380 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ vu30 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ vu30 i;
    public final /* synthetic */ vu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh6(c380 c380Var, float f, boolean z, boolean z2, vu30 vu30Var, Function0 function0, Function0 function1, boolean z3, vu30 vu30Var2, vu30 vu30Var3, int i, vu30 vu30Var4, boolean z4, String str, String str2, xu30 xu30Var, int i2, yj41 yj41Var, c380 c380Var2, float f2, float f3, uh6 uh6Var, uh6 uh6Var2, vu30 vu30Var5) {
        super(3);
        this.a = c380Var;
        this.b = f;
        this.c = z;
        this.d = z2;
        this.e = vu30Var;
        this.f = function0;
        this.g = function1;
        this.h = z3;
        this.i = vu30Var2;
        this.t = vu30Var3;
        this.X = i;
        this.Y = vu30Var4;
        this.Z = z4;
        this.N0 = str;
        this.O0 = str2;
        this.P0 = xu30Var;
        this.Q0 = i2;
        this.R0 = yj41Var;
        this.S0 = c380Var2;
        this.T0 = f2;
        this.U0 = f3;
        this.V0 = uh6Var;
        this.W0 = uh6Var2;
        this.X0 = vu30Var5;
    }

    public static final boolean a(drr0 drr0Var, Function0 function0, xd6 xd6Var, boolean z, Function0 function1, hdn0 hdn0Var, ven0 ven0Var, drr0 drr0Var2, boolean z2) {
        err0 err0Var = (err0) hdn0Var;
        if (err0Var.s() <= 0) {
            return false;
        }
        boolean z3 = err0Var.s() == 1;
        int iS = err0Var.s() - 1;
        if (iS < 0) {
            iS = 0;
        }
        err0Var.t(iS);
        if (err0Var.s() == 0 && !f(ven0Var)) {
            drr0Var2.t(drr0Var.s());
            ven0Var.setValue(Boolean.TRUE);
            function0.invoke();
        } else if (err0Var.s() > 0) {
            xd6Var.e = false;
        }
        if (z3 && z2 && !z) {
            function1.invoke();
        }
        return true;
    }

    public static final int d(hdn0 hdn0Var) {
        return ((err0) hdn0Var).s();
    }

    public static final boolean e(ven0 ven0Var) {
        return ((Boolean) ven0Var.getValue()).booleanValue();
    }

    public static final boolean f(ven0 ven0Var) {
        return ((Boolean) ven0Var.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:184:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:197:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:235:0x086c  */
    /* JADX WARN: Code duplicated, block: B:238:0x0874  */
    /* JADX WARN: Code duplicated, block: B:239:0x0876  */
    /* JADX WARN: Code duplicated, block: B:244:0x088a  */
    /* JADX WARN: Code duplicated, block: B:247:0x089c  */
    /* JADX WARN: Code duplicated, block: B:250:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:251:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:254:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:259:0x096e  */
    /* JADX WARN: Code duplicated, block: B:265:0x099f  */
    /* JADX WARN: Code duplicated, block: B:267:0x09c1  */
    /* JADX WARN: Code duplicated, block: B:270:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:271:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:274:0x0a21  */
    /* JADX WARN: Code duplicated, block: B:276:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:279:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:280:0x0a2e  */
    /* JADX WARN: Code duplicated, block: B:286:0x0a46  */
    /* JADX WARN: Code duplicated, block: B:289:0x0a60  */
    /* JADX WARN: Code duplicated, block: B:290:0x0a70  */
    /* JADX WARN: Code duplicated, block: B:292:0x0a74  */
    /* JADX WARN: Code duplicated, block: B:293:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:296:0x0b0a  */
    /* JADX WARN: Code duplicated, block: B:297:0x0b38  */
    /* JADX WARN: Code duplicated, block: B:299:0x0b46  */
    /* JADX WARN: Code duplicated, block: B:300:0x0b74  */
    /* JADX WARN: Code duplicated, block: B:303:0x0bd3  */
    /* JADX WARN: Code duplicated, block: B:304:0x0c07  */
    /* JADX WARN: Code duplicated, block: B:309:0x0c36  */
    /* JADX WARN: Code duplicated, block: B:312:0x0c68  */
    /* JADX WARN: Code duplicated, block: B:313:0x0c6d  */
    /* JADX WARN: Code duplicated, block: B:315:0x0c70  */
    /* JADX WARN: Code duplicated, block: B:317:0x0c7c  */
    /* JADX WARN: Code duplicated, block: B:320:0x0c9e  */
    /* JADX WARN: Code duplicated, block: B:326:0x0cc6  */
    /* JADX WARN: Code duplicated, block: B:329:0x0ce9  */
    /* JADX WARN: Code duplicated, block: B:346:0x0d35  */
    /* JADX WARN: Code duplicated, block: B:351:0x0d40  */
    /* JADX WARN: Code duplicated, block: B:354:0x0d52  */
    /* JADX WARN: Code duplicated, block: B:355:0x0d54  */
    /* JADX WARN: Code duplicated, block: B:361:0x0d8f  */
    /* JADX WARN: Code duplicated, block: B:366:0x0dcc  */
    /* JADX WARN: Code duplicated, block: B:372:0x0df8  */
    /* JADX WARN: Code duplicated, block: B:378:0x0e40  */
    /* JADX WARN: Code duplicated, block: B:384:0x0ec0  */
    /* JADX WARN: Code duplicated, block: B:387:0x0f28  */
    /* JADX WARN: Code duplicated, block: B:388:0x0f2a  */
    /* JADX WARN: Code duplicated, block: B:394:0x0f6d  */
    /* JADX WARN: Code duplicated, block: B:400:0x0fe6  */
    /* JADX WARN: Code duplicated, block: B:406:0x105d  */
    /* JADX WARN: Code duplicated, block: B:409:0x1081  */
    /* JADX WARN: Code duplicated, block: B:412:0x1091  */
    /* JADX WARN: Code duplicated, block: B:413:0x109d  */
    /* JADX WARN: Code duplicated, block: B:416:0x1127  */
    /* JADX WARN: Code duplicated, block: B:417:0x1133  */
    /* JADX WARN: Code duplicated, block: B:420:0x115c  */
    /* JADX WARN: Code duplicated, block: B:421:0x1180  */
    /* JADX WARN: Code duplicated, block: B:424:0x1193  */
    /* JADX WARN: Code duplicated, block: B:425:0x11a1  */
    /* JADX WARN: Code duplicated, block: B:428:0x11ba  */
    /* JADX WARN: Code duplicated, block: B:431:0x11cf  */
    /* JADX WARN: Code duplicated, block: B:433:0x11d2  */
    /* JADX WARN: Code duplicated, block: B:436:0x11e0  */
    /* JADX WARN: Code duplicated, block: B:442:0x1227  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        Object objI;
        float f;
        Function0 function0;
        Function0 function1;
        int i2;
        Object obj4;
        x340 x340Var;
        hdn0 hdn0Var;
        boolean z;
        int i3;
        ven0 ven0VarP;
        Function0 function2;
        x340 x340Var2;
        int i4;
        ven0 ven0VarP2;
        int i5;
        hsi1 hsi1VarR;
        gh6 gh6Var;
        Object fh6Var;
        tob1 tob1Var;
        xd6 xd6Var;
        wqz0 wqz0Var;
        hsi1 hsi1VarR2;
        x9b1 x9b1Var;
        int iS;
        int i6;
        int iL;
        pxg1 pxg1VarJ0;
        x340 x340Var3;
        ven0 ven0Var;
        boolean z2;
        ven0 ven0Var2;
        ven0 ven0Var3;
        float f2;
        ven0 ven0Var4;
        boolean zF;
        vu30 vu30Var;
        boolean z3;
        float f3;
        boolean zG;
        Object objT;
        tob1 tob1Var2;
        Function0 function3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i7;
        boolean z7;
        boolean z8;
        boolean z9;
        ven0 ven0Var5;
        ven0 ven0Var6;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ven0 ven0Var7;
        boolean zH;
        Object objT2;
        boolean z14;
        c21 c21Var;
        y3g1 y3g1Var;
        boolean zH2;
        Object objT3;
        tob1 tob1Var3;
        vu30 vu30Var2;
        Object objT4;
        boolean z15;
        boolean z16;
        c21 c21Var2;
        int i8;
        int iC;
        boolean z17;
        boolean z18;
        boolean zH3;
        Object objT5;
        dw91 dw91Var;
        dw91 dw91Var2;
        int iD;
        ven0 ven0Var8;
        boolean z19;
        boolean zE;
        Object objT6;
        boolean zG2;
        Object objT7;
        boolean z20;
        boolean z21;
        boolean zG3;
        Object objT8;
        xd6 xd6Var2;
        tob1 tob1Var4;
        drr0 drr0Var;
        Function0 function4;
        err0 err0Var;
        drr0 drr0Var2;
        int i9;
        int iC2;
        boolean zE2;
        Object objT9;
        float f4;
        drr0 drr0Var3;
        xd6 xd6Var3;
        drr0 drr0Var4;
        tob1 tob1Var5;
        vu30 vu30Var3;
        boolean zH4;
        Object objT10;
        drr0 drr0Var5;
        vu30 vu30Var4;
        x340 x340Var4;
        i2c i2cVar;
        byte b;
        Object objT11;
        Object objT12;
        drr0 drr0Var6;
        vu30 vu30Var5;
        vu30 vu30Var6;
        vu30 vu30Var7;
        ven0 ven0Var9;
        boolean zD;
        Object objT13;
        vu30 vu30Var8;
        vu30 vu30VarS;
        x340 x340Var5;
        boolean zG4;
        Object objT14;
        x9b1 x9b1Var2;
        Object objT15;
        boolean zG5;
        Object objT16;
        boolean zG6;
        Object objT17;
        boolean z22;
        pxg1 pxg1VarL0;
        boolean z23;
        ceo ceoVar;
        int i10;
        i2c i2cVar2 = (i2c) obj;
        x340 x340Var6 = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var6.g(i2cVar2) ? 4 : 2;
        }
        int i11 = iIntValue;
        x340 x340Var7 = x340Var6;
        if (x340Var7.Y(i11 & 1, (i11 & 19) != 18)) {
            wat watVar = (wat) x340Var7.k(t4k.h);
            float f5 = x340Var7.k(t4k.n) == flb0.b ? -1.0f : 1.0f;
            qam1 qam1Var = (qam1) x340Var7.k(sam1.a);
            c380 c380Var = this.a;
            int size = c380Var.size();
            float f6 = this.b;
            float f7 = 0.52f * f6 * 0.71428573f;
            float f8 = size - 1;
            float f9 = pap1.A(new p3v(f7), new p3v(350.0f), new p3v(i2cVar2.d() / ((f8 * 0.027777778f) + 1.0f))).a;
            float f10 = f9 / 0.71428573f;
            float f11 = f9 * 0.027777778f;
            float f12 = f8 * f11;
            float f13 = f9 + f12;
            float f14 = f10 + f12;
            float f15 = pap1.A(new p3v(f7), new p3v(350.0f), new p3v(i2cVar2.d())).a;
            float f16 = f15 / 0.71428573f;
            float fX0 = watVar.X0(i2cVar2.d());
            float fX1 = watVar.X0(i2cVar2.c()) / 2.0f;
            float fX2 = watVar.X0(f9);
            float fX3 = watVar.X0(f10);
            float fX4 = watVar.X0(f11);
            float fX5 = watVar.X0(f13);
            float f17 = (fX0 - fX5) / 2.0f;
            float fX6 = watVar.X0(f15);
            float fX7 = watVar.X0(f16);
            float fX8 = watVar.X0(this.T0 + 5.0f);
            ceo ceoVar2 = yh6.a;
            float fX9 = watVar.X0(80.0f);
            float fX10 = watVar.X0(500.0f);
            float fX11 = watVar.X0(400.0f);
            float fX12 = watVar.X0(10.0f);
            float fX13 = watVar.X0(this.U0);
            Object objT18 = x340Var7.T();
            m4c m4cVar = fkj0.X;
            if (objT18 == m4cVar) {
                objT18 = bb00.h(p7h.L(c380Var), x340Var7);
            }
            hdn0 hdn0Var2 = (hdn0) objT18;
            Object objT19 = x340Var7.T();
            if (objT19 == m4cVar) {
                objT19 = v8r.q(Boolean.FALSE);
                x340Var7.s0(objT19);
            }
            ven0 ven0Var10 = (ven0) objT19;
            boolean z24 = this.c;
            ven0 ven0VarS = v8r.s(Boolean.valueOf(z24), x340Var7);
            Object objT20 = x340Var7.T();
            if (objT20 == m4cVar) {
                objT20 = new dw91();
                x340Var7.s0(objT20);
            }
            dw91 dw91Var3 = (dw91) objT20;
            Object objT21 = x340Var7.T();
            if (objT21 == m4cVar) {
                objT21 = new dw91();
                x340Var7.s0(objT21);
            }
            dw91 dw91Var4 = (dw91) objT21;
            Object objT22 = x340Var7.T();
            if (objT22 == m4cVar) {
                objT22 = new dw91();
                x340Var7.s0(objT22);
            }
            dw91 dw91Var5 = (dw91) objT22;
            err0 err0Var2 = (err0) hdn0Var2;
            boolean zE3 = x340Var7.e(err0Var2.s());
            Object objT23 = x340Var7.T();
            drr0 drr0Var7 = (drr0) ((zE3 || objT23 == m4cVar) ? us71.i(0.0f, x340Var7) : objT23);
            boolean zE4 = x340Var7.e(err0Var2.s());
            Object objT24 = x340Var7.T();
            drr0 drr0Var8 = (drr0) ((zE4 || objT24 == m4cVar) ? us71.i(0.0f, x340Var7) : objT24);
            boolean zE5 = x340Var7.e(err0Var2.s());
            Object objT25 = x340Var7.T();
            if (zE5 || objT25 == m4cVar) {
                objT25 = us71.i(0.0f, x340Var7);
            }
            drr0 drr0Var9 = (drr0) objT25;
            boolean zE6 = x340Var7.e(err0Var2.s());
            Object objT26 = x340Var7.T();
            float f18 = f11;
            if (zE6 || objT26 == m4cVar) {
                objT26 = v8r.q((Object) null);
                x340Var7.s0(objT26);
            }
            tob1 tob1Var6 = (ven0) objT26;
            boolean zE7 = x340Var7.e(err0Var2.s());
            Object objT27 = x340Var7.T();
            if (zE7 || objT27 == m4cVar) {
                i = 0;
                objT27 = bb00.h(0, x340Var7);
            } else {
                i = 0;
            }
            err0 err0Var3 = (hdn0) objT27;
            Object objT28 = x340Var7.T();
            if (objT28 == m4cVar) {
                objT28 = bb00.h(i, x340Var7);
            }
            err0 err0Var4 = (hdn0) objT28;
            Object objT29 = x340Var7.T();
            if (objT29 == m4cVar) {
                objT29 = v8r.q(Boolean.FALSE);
                x340Var7.s0(objT29);
            }
            ven0 ven0Var11 = (ven0) objT29;
            Object objT30 = x340Var7.T();
            if (objT30 == m4cVar) {
                objT30 = v8r.q(Boolean.FALSE);
                x340Var7.s0(objT30);
            }
            ven0 ven0Var12 = (ven0) objT30;
            boolean z25 = size == 1;
            Object objT31 = x340Var7.T();
            if (objT31 == m4cVar) {
                objT31 = c13.l(z25, x340Var7);
            }
            ven0 ven0Var13 = (ven0) objT31;
            Object objT32 = x340Var7.T();
            if (objT32 == m4cVar) {
                objT32 = v8r.q(Boolean.FALSE);
                x340Var7.s0(objT32);
            }
            tob1 tob1Var7 = (ven0) objT32;
            boolean z26 = this.d;
            boolean z27 = z26 && !z25;
            boolean z28 = z26 && !z25;
            Object objT33 = x340Var7.T();
            if (objT33 == m4cVar) {
                objT33 = v8r.q(Boolean.FALSE);
                x340Var7.s0(objT33);
            }
            ven0 ven0Var14 = (ven0) objT33;
            boolean z29 = z28 && !((Boolean) ven0Var14.getValue()).booleanValue();
            Object objT34 = x340Var7.T();
            if (objT34 == m4cVar) {
                f = 0.0f;
                objI = us71.i(0.0f, x340Var7);
            } else {
                objI = objT34;
                f = 0.0f;
            }
            drr0 drr0Var10 = (drr0) objI;
            Object objT35 = x340Var7.T();
            if (objT35 == m4cVar) {
                objT35 = us71.i(f, x340Var7);
            }
            drr0 drr0Var11 = (drr0) objT35;
            Object objT36 = x340Var7.T();
            if (objT36 == m4cVar) {
                objT36 = us71.i(f, x340Var7);
            }
            drr0 drr0Var12 = (drr0) objT36;
            xd6 xd6VarV = mgo1.v(z26 && !z24 && e(ven0Var10), x340Var7);
            boolean zJ = u890.j(dw91Var5.get(Integer.valueOf(err0Var2.s())), Boolean.TRUE);
            Boolean boolValueOf = Boolean.valueOf(zJ);
            boolean zH5 = x340Var7.h(zJ) | x340Var7.g(xd6VarV);
            Object objT37 = x340Var7.T();
            if (zH5 || objT37 == m4cVar) {
                objT37 = new cf6(zJ, xd6VarV, null, (byte) 2);
                x340Var7.s0(objT37);
            }
            qxd0.t(boolValueOf, x340Var7, (vu30) objT37);
            Integer numValueOf = Integer.valueOf(err0Var2.s());
            Boolean boolValueOf2 = Boolean.valueOf(e(ven0Var10));
            Boolean boolValueOf3 = Boolean.valueOf(z24);
            boolean zH6 = x340Var7.h(z24) | x340Var7.g(this.e);
            Object objT38 = x340Var7.T();
            if (zH6 || objT38 == m4cVar) {
                objT38 = new bh(this.c, dw91Var3, this.e, ven0Var10, hdn0Var2, null, (byte) 19);
                x340Var7.s0(objT38);
            }
            qxd0.r(numValueOf, boolValueOf2, boolValueOf3, (vu30) objT38, x340Var7);
            boolean zH7 = x340Var7.h(z25);
            Function0 function5 = this.f;
            boolean zG7 = zH7 | x340Var7.g(function5);
            Function0 function6 = this.g;
            boolean zG8 = zG7 | x340Var7.g(function6);
            Object objT39 = x340Var7.T();
            if (zG8 || objT39 == m4cVar) {
                function0 = function6;
                objT39 = new zg6(z25, function5, function0, ven0Var10, (byte) 0);
                function1 = function5;
                x340Var7.s0(objT39);
            } else {
                function1 = function5;
                function0 = function6;
            }
            Function0 function7 = (Function0) objT39;
            zu91 zu91Var = new zu91(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER);
            tzg1 tzg1Var = rno1.a;
            Float f19 = fValueOf;
            Function0 function8 = function0;
            boolean z30 = z26;
            Float f20 = fValueOf2;
            ven0 ven0VarS2 = zod.S(new hsi1("artistCardsStackEntryAlpha", f20, f19, zu91Var, tzg1Var), z24, z30, (Function0) null, x340Var7, 8, 8);
            flv flvVar = ilv.a;
            flvVar.getClass();
            ceo ceoVar3 = flv.e;
            zvd zvdVar = new zvd(ven0VarS2, zod.S(new hsi1("artistCardsStackEntry", f20, f19, new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, ceoVar3), tzg1Var), z24, z30, function7, x340Var7, 8, 0));
            flvVar.getClass();
            ven0 ven0VarS3 = zod.S(new hsi1("artistCardsStackSupportingTextIn", f20, f19, new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 1500, ceoVar3), tzg1Var), z24, z30, (Function0) null, x340Var7, 8, 8);
            x9b1 x9b1Var3 = (x9b1) tob1Var6.getValue();
            int iS2 = (x9b1Var3 == null || !x9b1Var3.e || err0Var2.s() <= 1) ? err0Var2.s() : err0Var2.s() - 1;
            Float fValueOf3 = Float.valueOf(1.25f);
            Object objT40 = x340Var7.T();
            if (objT40 == m4cVar) {
                objT40 = bb00.h(iS2, x340Var7);
            }
            err0 err0Var5 = (hdn0) objT40;
            Object objT41 = x340Var7.T();
            if (objT41 == m4cVar) {
                objT41 = bb00.h(iS2, x340Var7);
            }
            hdn0 hdn0Var3 = (hdn0) objT41;
            Object objT42 = x340Var7.T();
            if (objT42 == m4cVar) {
                objT42 = bb00.h(0, x340Var7);
            }
            err0 err0Var6 = (hdn0) objT42;
            Object objT43 = x340Var7.T();
            if (objT43 == m4cVar) {
                objT43 = us71.i(1.0f, x340Var7);
            }
            ven0 ven0Var15 = (drr0) objT43;
            Integer numValueOf2 = Integer.valueOf(iS2);
            boolean zE8 = x340Var7.e(iS2);
            Object objT44 = x340Var7.T();
            if (zE8 || objT44 == m4cVar) {
                i2 = iS2;
                obj4 = null;
                objT44 = new xe6(i2, hdn0Var3, err0Var6, null, (byte) 1);
                x340Var7.s0(objT44);
            } else {
                i2 = iS2;
                obj4 = null;
            }
            qxd0.t(numValueOf2, x340Var7, (vu30) objT44);
            if (z30) {
                err0 err0Var7 = err0Var6;
                if (err0Var7.s() > 0) {
                    x340Var7.i0(1883043114);
                    boolean zE9 = x340Var7.e(err0Var7.s());
                    Object objT45 = x340Var7.T();
                    if (zE9 || objT45 == m4cVar) {
                        String str = "artistCardsRankOut-" + err0Var7.s();
                        flvVar.getClass();
                        ceo ceoVar4 = flv.i;
                        hdn0Var = hdn0Var3;
                        hsi1 hsi1Var = new hsi1(str, f19, f20, irn1.o0(100, 0, ceoVar4, 2), tzg1Var);
                        f19 = f19;
                        f20 = f20;
                        String strC = f4i1.c(err0Var7.s(), "artistCardsRankIn-");
                        err0 err0Var8 = (err0) hdn0Var;
                        int i12 = err0Var8.s() > 0 ? 300 : 500;
                        if (err0Var8.s() > 0) {
                            ceoVar = flv.g;
                            i10 = 0;
                            i3 = 2;
                        } else {
                            ceoVar = ceoVar4;
                            i3 = 2;
                            i10 = 0;
                        }
                        objT45 = mqo1.s(new hsi1[]{hsi1Var, new hsi1(strC, f20, f19, irn1.o0(i12, i10, ceoVar, i3), tzg1Var)});
                        x340Var7.s0(objT45);
                    } else {
                        function1 = function1;
                        hdn0Var = hdn0Var3;
                        i3 = 2;
                    }
                    c380 c380Var2 = (c380) objT45;
                    String strC2 = f4i1.c(err0Var7.s(), "artistCardsRankCrossfade-");
                    Object objT46 = x340Var7.T();
                    if (objT46 == m4cVar) {
                        objT46 = new af6(hdn0Var, err0Var5, (byte) 1);
                        x340Var7.s0(objT46);
                    }
                    ven0VarP = zod.P(c380Var2, z24, strC2, (Function0) objT46, (Function0) null, x340Var7, 3080, 16);
                    x340Var = x340Var7;
                    z = false;
                    x340Var.r(false);
                } else {
                    z27 = z27;
                    zvdVar = zvdVar;
                    err0Var5 = err0Var5;
                    function1 = function1;
                    x340Var = x340Var7;
                    z30 = z30;
                    hdn0Var = hdn0Var3;
                    z = false;
                    i3 = 2;
                    x340Var.i0(1883859809);
                    x340Var.r(false);
                    ven0VarP = ven0Var15;
                }
            } else {
                z27 = z27;
                zvdVar = zvdVar;
                err0Var5 = err0Var5;
                function1 = function1;
                x340Var = x340Var7;
                z30 = z30;
                hdn0Var = hdn0Var3;
                z = false;
                i3 = 2;
                x340Var.i0(1883859809);
                x340Var.r(false);
                ven0VarP = ven0Var15;
            }
            if (z30) {
                err0 err0Var9 = err0Var6;
                if (err0Var9.s() <= 0 || ((err0) hdn0Var).s() <= 0) {
                    function2 = function1;
                    hdn0Var = hdn0Var;
                    err0Var5 = err0Var5;
                    x340Var2 = x340Var;
                    boolean z31 = z;
                    i4 = i3;
                    f16 = f16;
                    f13 = f13;
                    fX10 = fX10;
                    f18 = f18;
                    err0Var3 = err0Var3;
                    fX9 = fX9;
                    ven0Var11 = ven0Var11;
                    x340Var2.i0(2000462291);
                    x340Var2.r(z31);
                    ven0VarP2 = ven0Var15;
                    i5 = z31;
                } else {
                    x340Var.i0(1883988955);
                    boolean zE10 = x340Var.e(err0Var9.s());
                    Object objT47 = x340Var.T();
                    if (zE10 || objT47 == m4cVar) {
                        String str2 = "artistCardsRankGrow-" + err0Var9.s();
                        flvVar.getClass();
                        int i13 = i3;
                        hsi1 hsi1Var2 = new hsi1(str2, f20, fValueOf3, new pxg1(300, 100, ceoVar3), tzg1Var);
                        String strC3 = f4i1.c(err0Var9.s(), "artistCardsRankSettle-");
                        pxg1 pxg1VarO0 = irn1.o0(300, 0, ceoVar3, i13);
                        z23 = false;
                        i4 = i13;
                        function2 = function1;
                        x340Var2 = x340Var;
                        objT47 = mqo1.s(new hsi1[]{hsi1Var2, new hsi1(strC3, fValueOf3, f19, pxg1VarO0, tzg1Var)});
                        x340Var2.s0(objT47);
                    } else {
                        function2 = function1;
                        x340Var2 = x340Var;
                        z23 = z;
                        i4 = i3;
                    }
                    ven0VarP2 = zod.P((c380) objT47, z24, f4i1.c(err0Var9.s(), "artistCardsRankScale-"), (Function0) null, (Function0) null, x340Var2, 8, 24);
                    x340Var2.r(z23);
                    i5 = z23;
                }
            } else {
                function2 = function1;
                hdn0Var = hdn0Var;
                err0Var5 = err0Var5;
                x340Var2 = x340Var;
                boolean z32 = z;
                i4 = i3;
                f16 = f16;
                f13 = f13;
                fX10 = fX10;
                f18 = f18;
                err0Var3 = err0Var3;
                fX9 = fX9;
                ven0Var11 = ven0Var11;
                x340Var2.i0(2000462291);
                x340Var2.r(z32);
                ven0VarP2 = ven0Var15;
                i5 = z32;
            }
            int iS3 = z30 ? err0Var5.s() : i2;
            if (err0Var5.s() != ((err0) hdn0Var).s()) {
                ven0VarP2 = ven0Var15;
            }
            wqz0 wqz0Var2 = new wqz0(iS3, ven0VarP, ven0VarP2);
            x9b1 x9b1Var4 = (x9b1) tob1Var6.getValue();
            if (x9b1Var4 != null) {
                String strI = cy30.i(err0Var2.s(), "artistCardsStackSettle-", err0Var3.s(), "-");
                if (x9b1Var4.e) {
                    flvVar.getClass();
                    pxg1VarL0 = irn1.o0(300, i5, flv.c, i4);
                } else {
                    pxg1VarL0 = z30 ? irn1.l0(0.8f, 400.0f, (Object) null, 4) : irn1.o0(160, i5, yh6.a, 2);
                }
                hsi1VarR = wxo1.r(strI, 0.0f, 1.0f, pxg1VarL0);
            } else {
                hsi1VarR = wxo1.r(f4i1.c(err0Var2.s(), "artistCardsStackSettleIdle-"), 0.0f, 0.0f, irn1.j0());
            }
            hsi1 hsi1Var3 = hsi1VarR;
            Function0 function9 = function2;
            boolean z33 = z27;
            boolean zG9 = x340Var2.g(tob1Var6) | x340Var2.g(function9) | x340Var2.g(xd6VarV) | x340Var2.h(z33) | x340Var2.g(function8) | x340Var2.g(drr0Var7);
            Object objT48 = x340Var2.T();
            if (zG9 || objT48 == m4cVar) {
                gh6Var = this;
                fh6Var = new fh6(tob1Var6, drr0Var10, gh6Var.f, xd6VarV, z33, gh6Var.g, hdn0Var2, ven0Var13, drr0Var12, drr0Var7);
                tob1Var = tob1Var6;
                xd6Var = xd6VarV;
                x340Var2.s0(fh6Var);
            } else {
                xd6Var = xd6VarV;
                tob1Var = tob1Var6;
                fh6Var = objT48;
                gh6Var = this;
            }
            x340 x340Var8 = x340Var2;
            ven0 ven0VarR = zod.R(hsi1Var3, gh6Var.c, (Function0) fh6Var, x340Var8, 8, 0);
            x9b1 x9b1Var5 = (x9b1) tob1Var.getValue();
            if (x9b1Var5 != null) {
                wqz0Var = wqz0Var2;
                if (x9b1Var5.e) {
                    String str3 = "artistCardsStackDismissDrop-" + err0Var2.s() + "-" + err0Var3.s();
                    flvVar.getClass();
                    hsi1VarR2 = wxo1.r(str3, 0.0f, fX12, irn1.o0(300, 0, flv.j, 2));
                }
                ven0 ven0VarR2 = zod.R(hsi1VarR2, gh6Var.c, (Function0) null, x340Var8, 8, 4);
                if (f(ven0Var13)) {
                    iS = p7h.L(c380Var);
                    if (1 <= iS) {
                        iS = 1;
                    }
                } else {
                    x9b1Var = (x9b1) tob1Var.getValue();
                    if (x9b1Var == null && x9b1Var.e) {
                        iS = err0Var2.s() - 1;
                    } else {
                        iS = err0Var2.s();
                    }
                }
                String strC4 = f4i1.c(iS, "artistCardsStackFanShift-");
                i6 = iS + 1;
                iL = p7h.L(c380Var);
                if (i6 > iL) {
                    i6 = iL;
                }
                float f21 = ((-(p7h.L(c380Var) - i6)) * fX4) / 2.0f;
                float f22 = ((-(p7h.L(c380Var) - iS)) * fX4) / 2.0f;
                if (z30) {
                    flvVar.getClass();
                    pxg1VarJ0 = irn1.o0(300, 0, flv.c, 2);
                } else {
                    pxg1VarJ0 = irn1.j0();
                }
                ven0 ven0VarR3 = zod.R(wxo1.r(strC4, f21, f22, pxg1VarJ0), gh6Var.c, (Function0) null, x340Var8, 8, 4);
                x340Var3 = x340Var8;
                if (((Boolean) ven0Var11.getValue()).booleanValue()) {
                    x340Var3.i0(360047287);
                    err0 err0Var10 = err0Var4;
                    c9 c9VarS = mqo1.s(new hsi1[]{wxo1.r(f4i1.c(err0Var10.s(), "artistCardsStackReducedSwapOut-"), 1.0f, 0.0f, irn1.o0(160, 0, yh6.b, 2)), wxo1.r(f4i1.c(err0Var10.s(), "artistCardsStackReducedSwapIn-"), 0.0f, 1.0f, irn1.o0(160, 0, yh6.a, 2))});
                    String strC5 = f4i1.c(err0Var10.s(), "artistCardsStackReducedSwap-");
                    zG5 = x340Var3.g(function9) | x340Var3.g(xd6Var) | x340Var3.h(z33) | x340Var3.g(function8);
                    objT16 = x340Var3.T();
                    if (!zG5 || objT16 == m4cVar) {
                        z2 = z33;
                        objT16 = new ch6(ven0Var12, drr0Var10, gh6Var.f, xd6Var, z2, gh6Var.g, hdn0Var2, ven0Var13, drr0Var12);
                        ven0Var2 = ven0Var12;
                        x340Var3.s0(objT16);
                    } else {
                        z2 = z33;
                        ven0Var2 = ven0Var12;
                    }
                    Function0 function10 = (Function0) objT16;
                    zG6 = x340Var3.g(function8);
                    objT17 = x340Var3.T();
                    if (!zG6 || objT17 == m4cVar) {
                        ven0Var = ven0Var11;
                        z22 = false;
                        objT17 = new dh6(function8, ven0Var, ven0Var13, (byte) 0);
                        x340Var3.s0(objT17);
                    } else {
                        ven0Var = ven0Var11;
                        z22 = false;
                    }
                    ven0 ven0VarP3 = zod.P(c9VarS, gh6Var.c, strC5, function10, (Function0) objT17, x340Var3, 8, 0);
                    x340Var3.r(z22);
                    ven0Var3 = ven0VarP3;
                } else {
                    ven0Var = ven0Var11;
                    z2 = z33;
                    ven0Var2 = ven0Var12;
                    ven0Var13 = ven0Var13;
                    x340Var3.i0(361177732);
                    x340Var3.u();
                    ven0Var3 = null;
                }
                if (gh6Var.h) {
                    x340Var3.i0(361338375);
                    f2 = f6;
                    ven0 ven0VarR4 = zod.R(wxo1.r("artistCardsStackOpeningMask", 0.0f, watVar.X0(f2), fi6.a), gh6Var.c, (Function0) null, x340Var3, 8, 4);
                    x340Var3.u();
                    ven0Var4 = ven0VarR4;
                } else {
                    f2 = f6;
                    x340Var3.i0(361623140);
                    x340Var3.u();
                    ven0Var4 = null;
                }
                zF = f(ven0Var13);
                vu30Var = gh6Var.i;
                if (vu30Var != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fX6 > 0.0f) {
                    f3 = fX2 / fX6;
                } else {
                    f3 = 1.0f;
                }
                zG = x340Var3.g(xd6Var);
                objT = x340Var3.T();
                if (!zG || objT == m4cVar) {
                    tob1Var2 = tob1Var7;
                    objT = new nx2(xd6Var, tob1Var2, (byte) 23);
                    x340Var3.s0(objT);
                } else {
                    tob1Var2 = tob1Var7;
                }
                function3 = (Function0) objT;
                x340Var3.i0(-1130556534);
                if (zF) {
                    z4 = gh6Var.c;
                    if (z2) {
                        z5 = z4;
                        x340Var3.i0(724560518);
                        z6 = z2;
                        yh6.d(z5, z6, "artistCardsStackRevealShareReady", 0.0f, 1.0f, new zu91(3700), gh6Var.g, x340Var3, 3510, 0);
                        i7 = 0;
                        x340Var3.r(false);
                    } else {
                        z5 = z4;
                        z6 = z2;
                        i7 = 0;
                        x340Var3.i0(724731576);
                        x340Var3.r(false);
                    }
                    ilv.a.getClass();
                    z7 = z3;
                    ven0 ven0VarD = yh6.d(z5, z6, "artistCardsStackRevealHintsOut", 1.0f, 0.0f, irn1.o0(100, i7, flv.i, 2), null, x340Var3, 438, 16);
                    ven0 ven0VarD2 = yh6.d(z5, z6, "artistCardsStackRevealHorizontal", 0.0f, 1.0f, irn1.o0(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, i7, flv.e, 2), null, x340Var3, 438, 16);
                    boolean z34 = z6;
                    boolean z35 = z5;
                    ven0 ven0VarE = yh6.e(z34, z35, "artistCardsStackRevealVertical", 0.0f, 1.0f, 2.0f, 1800, 1200, x340Var3, 224694);
                    z8 = z34;
                    z9 = z35;
                    x340Var3 = x340Var3;
                    if (z8) {
                        x340Var3.i0(726482549);
                        ven0 ven0VarE2 = yh6.e(z8, z9, "artistCardsStackRevealScale", f3, f3 * 1.25f, 1.0f, 1200, 1800, x340Var3, 224262);
                        x340Var3.r(false);
                        ven0Var5 = ven0VarE2;
                    } else {
                        x340Var3.i0(726737523);
                        x340Var3.r(false);
                        ven0Var5 = null;
                    }
                    if (z8) {
                        z8 = z8;
                        z9 = z9;
                        x340Var3.i0(726795618);
                        boolean z36 = z8;
                        boolean z37 = z9;
                        ven0 ven0VarE3 = yh6.e(z36, z37, "artistCardsStackRevealRotation", 0.0f, 360.0f, 0.0f, 1500, 1500, x340Var3, 224694);
                        z8 = z36;
                        z9 = z37;
                        x340Var3.r(false);
                        ven0Var6 = ven0VarE3;
                    } else {
                        z8 = z8;
                        z9 = z9;
                        x340Var3.i0(727007347);
                        x340Var3.r(false);
                        ven0Var6 = null;
                    }
                    ven0 ven0VarD3 = yh6.d(z9, z8, "artistCardsStackRevealStickers", 0.0f, 1.0f, new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 2500, flv.d), null, x340Var3, 438, 16);
                    z10 = z9;
                    z11 = z8;
                    y3g1 y3g1Var2 = new y3g1(yh6.c(z10, z11, "artistCardsRevealBackground", 2000, x340Var3), yh6.c(z10, z11, "artistCardsRevealPortrait", 2400, x340Var3), yh6.c(z10, z11, "artistCardsRevealName", 2800, x340Var3), yh6.c(z10, z11, "artistCardsRevealStatistics", 3200, x340Var3), yh6.c(z10, z11, "artistCardsRevealSparkles", 0, x340Var3));
                    if (z7) {
                        x340Var3.i0(727753053);
                        z12 = z10;
                        ven0 ven0VarD4 = yh6.d(z12, z11, "artistCardsStackRevealTitle", 0.0f, 1.0f, new pxg1(700, 2400, flv.g), null, x340Var3, 438, 16);
                        z13 = z11;
                        x340Var3.r(false);
                        ven0Var7 = ven0VarD4;
                    } else {
                        z12 = z10;
                        z13 = z11;
                        x340Var3.i0(727969587);
                        x340Var3.r(false);
                        ven0Var7 = null;
                    }
                    pxg1 pxg1Var = new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 3100, flv.c);
                    zH = x340Var3.h(z13) | x340Var3.g(function3);
                    objT2 = x340Var3.T();
                    if (zH || objT2 == fkj0.X) {
                        objT2 = new y96(z13, function3, (byte) 1);
                        x340Var3.s0(objT2);
                    }
                    boolean z38 = z13;
                    z14 = z38;
                    c21 c21Var3 = new c21(ven0VarD, ven0VarD2, ven0VarE, ven0Var5, ven0Var6, ven0VarD3, y3g1Var2, ven0Var7, yh6.d(z12, z38, "artistCardsStackRevealBody", 0.0f, 1.0f, pxg1Var, (Function0) objT2, x340Var3, 438, 0), (byte) 2);
                    x340Var3.r(false);
                    c21Var = c21Var3;
                } else {
                    x340Var3.r(false);
                    tob1Var2 = tob1Var2;
                    z14 = z2;
                    c21Var = null;
                }
                if (c21Var != null) {
                    y3g1Var = (y3g1) c21Var.h;
                } else {
                    y3g1Var = null;
                }
                if (y3g1Var == null) {
                    x340Var3.i0(362208700);
                    objT15 = x340Var3.T();
                    if (objT15 == m4cVar) {
                        drr0 drr0Var13 = new drr0(0.0f);
                        objT15 = new y3g1(drr0Var13, drr0Var13, drr0Var13, drr0Var13, drr0Var13);
                        x340Var3.s0(objT15);
                    }
                    y3g1Var = (y3g1) objT15;
                    x340Var3.u();
                } else {
                    x340Var3.i0(-1650884826);
                    x340Var3.u();
                }
                y3g1 y3g1Var3 = y3g1Var;
                Boolean boolValueOf4 = Boolean.valueOf(f(ven0Var13));
                Boolean boolValueOf5 = Boolean.valueOf(z14);
                zH2 = x340Var3.h(z14);
                objT3 = x340Var3.T();
                if (!zH2 || objT3 == m4cVar) {
                    tob1 tob1Var8 = tob1Var2;
                    objT3 = new pg6(z14, ven0Var13, tob1Var8, (lnm) null, (byte) 0);
                    tob1Var3 = tob1Var8;
                    vu30Var2 = null;
                    x340Var3.s0(objT3);
                } else {
                    tob1Var3 = tob1Var2;
                    vu30Var2 = null;
                }
                qxd0.s(boolValueOf4, boolValueOf5, (vu30) objT3, x340Var3);
                objT4 = x340Var3.T();
                if (objT4 == m4cVar) {
                    objT4 = new ma0(ven0Var14, (byte) 20);
                    x340Var3.s0(objT4);
                }
                boolean z39 = z29;
                boolean zB = yh6.b(z39, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0cf9: INVOKE (r92v2 'zB' boolean) = 
                      (r5v94 'z39' boolean)
                      (r20v5 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
                      (wrap kotlin.jvm.functions.Function0:0x0cf5: CHECK_CAST (kotlin.jvm.functions.Function0) (r2v54 'objT4' java.lang.Object))
                      (r15v24 'x340Var3' p.x340)
                     STATIC call: p.yh6.b(boolean, boolean, kotlin.jvm.functions.Function0, p.x340):boolean A[DECLARE_VAR, MD:(boolean, boolean, kotlin.jvm.functions.Function0, p.x340):boolean (m)] (LINE:3322) in method: p.gh6.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v5 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 4664
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.gh6.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }
