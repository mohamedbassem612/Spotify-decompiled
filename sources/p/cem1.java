package p;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cem1 extends f311 {
    public static final bpb1 i = gio1.b(kem1.a);
    public static final bpb1 j = gio1.b(Boolean.FALSE);
    public static final bpb1 k = gio1.b(w7x.a);
    public final rdm1 a;
    public final boolean b;
    public final mr20 c;
    public final qem1 d;
    public final ycm1 e;
    public final idm1 f;
    public final String g;
    public final qk41 h;

    public cem1(rdm1 rdm1Var, boolean z, mr20 mr20Var, qem1 qem1Var, ycm1 ycm1Var, idm1 idm1Var, String str) {
        this.a = rdm1Var;
        this.b = z;
        this.c = mr20Var;
        this.d = qem1Var;
        this.e = ycm1Var;
        this.f = idm1Var;
        this.g = str;
        this.h = z ? new ok41(3000) : pk41.a;
    }

    public static final boolean e(ven0 ven0Var) {
        return ((Boolean) ven0Var.getValue()).booleanValue();
    }

    public static ven0 f(String str, fe5 fe5Var, rk41 rk41Var, boolean z, Function0 function0, b0k b0kVar, int i2, int i3) {
        if ((i3 & 16) != 0) {
            x340 x340Var = (x340) b0kVar;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = wam1.d;
                x340Var.s0(objT);
            }
            function0 = (Function0) objT;
        }
        hsi1 hsi1Var = new hsi1(str, Float.valueOf(1.0f), Float.valueOf(0.0f), fe5Var, rno1.a);
        int i4 = i2 >> 3;
        return zod.S(hsi1Var, rk41Var.a, z, function0, b0kVar, (i4 & 896) | 8 | (i4 & 7168), 0);
    }

    @Override // p.qj41
    public final Object b(ak41 ak41Var) {
        fns fnsVar = igu.a;
        return fn31.Y(pyf0.a.f, new bem1(this, null, (byte) 1), ak41Var);
    }

    @Override // p.qj41
    public final Object c(zj41 zj41Var) {
        fns fnsVar = igu.a;
        return fn31.Y(pyf0.a.f, new bem1(this, null, (byte) 0), zj41Var);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:109:0x0215  */
    /* JADX WARN: Code duplicated, block: B:112:0x0226  */
    /* JADX WARN: Code duplicated, block: B:115:0x0238  */
    /* JADX WARN: Code duplicated, block: B:124:0x0267  */
    /* JADX WARN: Code duplicated, block: B:130:0x0278  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:138:0x030e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0338  */
    /* JADX WARN: Code duplicated, block: B:152:0x034e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0359  */
    /* JADX WARN: Code duplicated, block: B:160:0x038f  */
    /* JADX WARN: Code duplicated, block: B:163:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:164:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:167:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:170:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:173:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:181:0x0406  */
    /* JADX WARN: Code duplicated, block: B:184:0x0417  */
    /* JADX WARN: Code duplicated, block: B:186:0x041f  */
    /* JADX WARN: Code duplicated, block: B:192:0x0456  */
    /* JADX WARN: Code duplicated, block: B:198:0x0490  */
    /* JADX WARN: Code duplicated, block: B:202:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:210:0x051f  */
    /* JADX WARN: Code duplicated, block: B:213:0x0534  */
    /* JADX WARN: Code duplicated, block: B:221:0x055c  */
    /* JADX WARN: Code duplicated, block: B:228:0x056a  */
    /* JADX WARN: Code duplicated, block: B:234:0x059e  */
    /* JADX WARN: Code duplicated, block: B:240:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:247:0x05da  */
    /* JADX WARN: Code duplicated, block: B:253:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:255:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:256:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:261:0x060a  */
    /* JADX WARN: Code duplicated, block: B:264:0x062b  */
    /* JADX WARN: Code duplicated, block: B:267:0x0635  */
    /* JADX WARN: Code duplicated, block: B:276:0x0671  */
    /* JADX WARN: Code duplicated, block: B:278:0x0685 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:279:0x0687  */
    /* JADX WARN: Code duplicated, block: B:282:0x069e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:283:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:286:0x06c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:289:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:292:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:295:0x0723  */
    /* JADX WARN: Code duplicated, block: B:299:0x0763  */
    /* JADX WARN: Code duplicated, block: B:326:0x084c  */
    /* JADX WARN: Code duplicated, block: B:329:0x0865  */
    /* JADX WARN: Code duplicated, block: B:332:0x087d  */
    /* JADX WARN: Code duplicated, block: B:335:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:337:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:338:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:341:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:342:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:345:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:347:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:351:0x0959  */
    /* JADX WARN: Code duplicated, block: B:355:0x098e  */
    /* JADX WARN: Code duplicated, block: B:358:0x09be  */
    /* JADX WARN: Code duplicated, block: B:361:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:362:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:365:0x09f5  */
    /* JADX WARN: Code duplicated, block: B:375:0x0a19  */
    /* JADX WARN: Code duplicated, block: B:381:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:387:0x0a4b  */
    /* JADX WARN: Code duplicated, block: B:395:0x0ab1  */
    /* JADX WARN: Code duplicated, block: B:398:0x0afe  */
    /* JADX WARN: Code duplicated, block: B:400:0x0b0e  */
    /* JADX WARN: Code duplicated, block: B:401:0x0b29  */
    /* JADX WARN: Code duplicated, block: B:405:0x0b41  */
    /* JADX WARN: Code duplicated, block: B:412:0x0b52  */
    /* JADX WARN: Code duplicated, block: B:415:0x0b64 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:416:0x0b66  */
    /* JADX WARN: Code duplicated, block: B:421:0x0bcd  */
    /* JADX WARN: Code duplicated, block: B:424:0x0bfd  */
    /* JADX WARN: Code duplicated, block: B:426:0x0c06  */
    /* JADX WARN: Code duplicated, block: B:428:0x0c0c  */
    /* JADX WARN: Code duplicated, block: B:431:0x0c4e  */
    /* JADX WARN: Code duplicated, block: B:433:0x0c57  */
    /* JADX WARN: Code duplicated, block: B:434:0x0c5b  */
    /* JADX WARN: Code duplicated, block: B:437:0x0c86 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:440:0x0c8c  */
    /* JADX WARN: Code duplicated, block: B:443:0x0cd6  */
    /* JADX WARN: Code duplicated, block: B:446:0x0ced A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:447:0x0cef  */
    /* JADX WARN: Code duplicated, block: B:450:0x0d36  */
    /* JADX WARN: Code duplicated, block: B:452:0x0d3f  */
    /* JADX WARN: Code duplicated, block: B:453:0x0d43  */
    /* JADX WARN: Code duplicated, block: B:456:0x0d59  */
    /* JADX WARN: Code duplicated, block: B:457:0x0d6a  */
    /* JADX WARN: Code duplicated, block: B:459:0x0d75 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:462:0x0d89  */
    /* JADX WARN: Code duplicated, block: B:465:0x0db7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:466:0x0db9  */
    /* JADX WARN: Code duplicated, block: B:469:0x0de4  */
    /* JADX WARN: Code duplicated, block: B:475:0x0e1e  */
    /* JADX WARN: Code duplicated, block: B:477:0x0e30  */
    /* JADX WARN: Code duplicated, block: B:479:0x0e40 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:480:0x0e42  */
    /* JADX WARN: Code duplicated, block: B:483:0x0e58 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:484:0x0e5a  */
    /* JADX WARN: Code duplicated, block: B:487:0x0e81 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:488:0x0e83  */
    /* JADX WARN: Code duplicated, block: B:491:0x0e95  */
    /* JADX WARN: Code duplicated, block: B:492:0x0edd  */
    /* JADX WARN: Code duplicated, block: B:494:0x0ee3  */
    /* JADX WARN: Code duplicated, block: B:496:0x0ef2  */
    /* JADX WARN: Code duplicated, block: B:500:0x0f25  */
    /* JADX WARN: Code duplicated, block: B:501:0x0f2f  */
    /* JADX WARN: Code duplicated, block: B:503:0x0f35  */
    /* JADX WARN: Code duplicated, block: B:505:0x0f3b  */
    /* JADX WARN: Code duplicated, block: B:76:0x014e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0161  */
    /* JADX WARN: Code duplicated, block: B:89:0x0172  */
    /* JADX WARN: Code duplicated, block: B:92:0x017b  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i2) throws Throwable {
        int i3;
        b0k b0kVar2;
        cem1 cem1Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objT;
        udm1 udm1Var;
        boolean z7;
        ven0 ven0VarS;
        boolean zI;
        Object objT2;
        Context context;
        boolean z8;
        drr0 drr0VarB;
        boolean zG;
        Object objT3;
        tob1 tob1Var;
        tob1 tob1Var2;
        lnm lnmVar;
        b0k b0kVar3;
        boolean z9;
        int i4;
        boolean z10;
        Object objT4;
        b0k b0kVar4;
        tob1 tob1Var3;
        ven0 ven0VarF;
        boolean zG2;
        Object objT5;
        tob1 tob1Var4;
        vu30 vu30Var;
        boolean z11;
        Object objT6;
        ven0 ven0Var;
        Object objT7;
        tob1 tob1Var5;
        Object objT8;
        ven0 ven0Var2;
        float f;
        pxg1 pxg1Var;
        tob1 tob1VarF;
        boolean zG3;
        Object objT9;
        tob1 tob1Var6;
        boolean zG4;
        Object objT10;
        tob1 tob1Var7;
        udm1 udm1Var2;
        boolean zI2;
        Object objT11;
        boolean zI3;
        Object objT12;
        boolean z12;
        Object obj;
        Context context2;
        boolean zH;
        Object objT13;
        Object objT14;
        tob1 tob1Var8;
        boolean z13;
        hdm1 hdm1Var;
        ven0 ven0VarS2;
        xhm1 xhm1Var;
        ven0 ven0VarS3;
        boolean zI4;
        Object objT15;
        idm1 idm1Var;
        boolean zI5;
        Object objT16;
        boolean z14;
        boolean z15;
        float f2;
        pxg1 pxg1VarJ0;
        float fFloatValue;
        Bitmap bitmap;
        Object objT17;
        tob1 tob1Var9;
        rdm1 rdm1Var;
        int i5;
        boolean z16;
        nim0 nim0Var;
        boolean zI6;
        Object objT18;
        boolean zI7;
        Object objT19;
        boolean zG5;
        Object objT20;
        tob1 tob1Var10;
        Bitmap bitmap2;
        tob1 tob1Var11;
        float f3;
        b0k b0kVar5;
        tob1 tob1Var12;
        Throwable th;
        boolean zBooleanValue;
        n4k n4kVar;
        b0k b0kVar6;
        vu30 vu30Var2;
        vu30 vu30Var3;
        llj lljVar;
        vu30 vu30Var4;
        Throwable th2;
        tl3 tl3Var;
        vu30 vu30Var5;
        vu30 vu30Var6;
        vu30 vu30Var7;
        llj lljVar2;
        tl3 tl3Var2;
        ven0 ven0VarF2;
        ven0 ven0VarF3;
        ven0 ven0VarF4;
        kjd kjdVarI;
        kjd kjdVarI2;
        boolean zG6;
        Object objT21;
        boolean zG7;
        Object objT22;
        Object objT23;
        ven0 ven0Var3;
        Object objT24;
        Object objT25;
        ven0 ven0Var4;
        boolean z17;
        Object objT26;
        boolean z18;
        b0k b0kVar7;
        rdm1 rdm1Var2;
        idm1 idm1Var2;
        float f4;
        float f5;
        float f6;
        boolean z19;
        boolean zH2;
        Object hl0Var;
        float f7;
        boolean z20;
        Object objT27;
        era eraVar;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarC;
        qim0 qim0VarE;
        f36 f36Var;
        mbh mbhVarA2;
        int iHashCode2;
        xos0 xos0VarC2;
        qim0 qim0VarE2;
        Integer num;
        boolean zG8;
        Object objT28;
        Object objT29;
        boolean zG9;
        Object objT30;
        mbh mbhVarA3;
        int iHashCode3;
        xos0 xos0VarC3;
        qim0 qim0VarE3;
        vnr0 vnr0Var;
        boolean zG10;
        Object objT31;
        i2c i2cVar2;
        rdm1 rdm1Var3;
        idm1 idm1Var3;
        tl3 tl3Var3;
        boolean zI8;
        Object objT32;
        boolean zI9;
        Object objT33;
        String str;
        boolean zI10;
        Object objT34;
        Function0 function1;
        float f8;
        boolean zD;
        Object objT35;
        gfh0 gfh0VarC;
        int iHashCode4;
        xos0 xos0VarC4;
        qim0 qim0VarE4;
        qim0 qim0VarE5;
        boolean zI11;
        Object objT36;
        udm1 udm1Var3;
        qim0 qim0Var;
        boolean zI12;
        Object objT37;
        boolean z21;
        boolean z22;
        Object objT38;
        Boolean boolValueOf;
        boolean zI13;
        Object objT39;
        Boolean bool;
        vu30 vu30Var8 = y580.Y;
        llj lljVar3 = y580.R0;
        vu30 vu30Var9 = y580.N0;
        vu30 vu30Var10 = y580.O0;
        long j2 = i2cVar.b;
        m4c m4cVar = fkj0.X;
        tl3 tl3Var4 = een.h;
        boolean z23 = rk41Var.a;
        b0k b0kVar8 = (x340) b0kVar;
        b0kVar8.k0(-253680049);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar8.g(i2cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? b0kVar8.g(rk41Var) : b0kVar8.i(rk41Var) ? 32 : 16;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar8.i(this) ? 2048 : 1024;
        }
        int i6 = i3;
        tl3 tl3Var5 = tl3Var4;
        if (b0kVar8.Y(i6 & 1, (i6 & 1043) != 1042)) {
            boolean z24 = this.b;
            ven0 ven0VarG = rwq.g(this.c, Boolean.valueOf(z24), (o8n) null, b0kVar8, 0, 2);
            qem1 qem1Var = this.d;
            ven0 ven0VarH = rwq.h(qem1Var != null ? qem1Var.l : i, b0kVar8, 0);
            ven0 ven0VarH2 = rwq.h(qem1Var != null ? qem1Var.m : j, b0kVar8, 0);
            ycm1 ycm1Var = this.e;
            Integer num2 = 0;
            ven0 ven0VarH3 = rwq.h(ycm1Var != null ? ycm1Var.f83p : k, b0kVar8, 0);
            ven0 ven0VarH4 = rwq.h(((xgm1) rk41Var.c).getState(), b0kVar8, 0);
            boolean zG11 = b0kVar8.g(ven0VarH4) | b0kVar8.g(this.g);
            Object objT40 = b0kVar8.T();
            if (zG11 || objT40 == m4cVar) {
                objT40 = yv91.a(new g4k1(ven0VarH4, this, (byte) 18));
                b0kVar8.s0(objT40);
            }
            tob1 tob1Var13 = (tob1) objT40;
            boolean z25 = qem1Var != null && e(ven0VarG);
            boolean z26 = z25 && (u890.j((oem1) ven0VarH.getValue(), kem1.a) || (u890.j((oem1) ven0VarH.getValue(), jem1.a) && !((Boolean) ven0VarH2.getValue()).booleanValue()));
            if (z25) {
                z = z23;
                z2 = u890.j((oem1) ven0VarH.getValue(), nem1.a);
                if (!z26 || z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z && ((Boolean) tob1Var13.getValue()).booleanValue()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4 && e(ven0VarG) && !z3) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z3;
                objT = b0kVar8.T();
                if (objT == m4cVar) {
                    objT = new udm1();
                    b0kVar8.s0(objT);
                }
                udm1Var = (udm1) objT;
                z7 = z26;
                ven0VarS = v8r.s(Float.valueOf(pdm1.a(yoi1.k(hjl.i(j2), 1) / yoi1.k(hjl.h(j2), 1))), b0kVar8);
                zI = b0kVar8.i(udm1Var) | b0kVar8.g(ven0VarS);
                objT2 = b0kVar8.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new g4k1(udm1Var, ven0VarS, (byte) 16);
                    b0kVar8.s0(objT2);
                }
                qxd0.D((Function0) objT2, b0kVar8);
                context = (Context) b0kVar8.k(AndroidCompositionLocals_androidKt.b);
                ven0 ven0VarG2 = rwq.g(udm1Var.c, Float.valueOf(0.0f), (o8n) null, b0kVar8, 48, 2);
                if (!z4 || z6) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                drr0VarB = jon1.B(ven0VarG2, z8, e(ven0VarG), b0kVar8);
                zG = b0kVar8.g(drr0VarB);
                objT3 = b0kVar8.T();
                if (zG || objT3 == m4cVar) {
                    objT3 = yv91.a(new yka(drr0VarB, ven0VarS, (byte) 2));
                    b0kVar8.s0(objT3);
                }
                tob1Var = (tob1) objT3;
                if (ycm1Var != null) {
                    b0kVar8.i0(1762614652);
                    zI12 = b0kVar8.i(this);
                    objT37 = b0kVar8.T();
                    if (zI12 || objT37 == m4cVar) {
                        objT37 = new vdm1(this, (byte) 1);
                        b0kVar8.s0(objT37);
                    }
                    qxd0.i(ycm1Var, (iu30) objT37, b0kVar8);
                    Boolean boolValueOf2 = Boolean.valueOf(rk41Var.b);
                    boolean zI14 = b0kVar8.i(this);
                    if ((i6 & 112) != 32 || ((i6 & 64) != 0 && b0kVar8.i(rk41Var))) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = zI14 | z21;
                    objT38 = b0kVar8.T();
                    if (z22 || objT38 == m4cVar) {
                        objT38 = new zdm1(this, rk41Var, (lnm) null, (byte) 0);
                        b0kVar8.s0(objT38);
                    }
                    qxd0.t(boolValueOf2, b0kVar8, (vu30) objT38);
                    Boolean boolValueOf3 = Boolean.valueOf(z4);
                    boolValueOf = Boolean.valueOf(e(ven0VarG));
                    oem1 oem1Var = (oem1) ven0VarH.getValue();
                    zI13 = b0kVar8.i(this) | b0kVar8.g(ven0VarG) | b0kVar8.h(z4) | b0kVar8.g(ven0VarH) | b0kVar8.h(z25) | b0kVar8.g(tob1Var);
                    objT39 = b0kVar8.T();
                    if (!zI13 || objT39 == m4cVar) {
                        lnmVar = null;
                        bool = boolValueOf;
                        b0kVar3 = b0kVar8;
                        on1 on1Var = new on1(this, z4, tob1Var, ven0VarG, ven0VarH, z25, (lnm) null);
                        tob1Var2 = tob1Var;
                        b0kVar3.s0(on1Var);
                        objT39 = on1Var;
                    } else {
                        tob1Var2 = tob1Var;
                        lnmVar = null;
                        bool = boolValueOf;
                        b0kVar3 = b0kVar8;
                    }
                    qxd0.r(boolValueOf3, bool, oem1Var, (vu30) objT39, b0kVar3);
                    b0kVar3.u();
                } else {
                    z25 = z25;
                    context = context;
                    tob1Var2 = tob1Var;
                    vu30Var9 = vu30Var9;
                    tl3Var5 = tl3Var5;
                    num2 = null;
                    lnmVar = null;
                    b0kVar3 = b0kVar8;
                    vu30Var10 = vu30Var10;
                    udm1Var = udm1Var;
                    z = z;
                    b0kVar3.i0(1763159539);
                    b0kVar3.u();
                }
                if (e(ven0VarG) || !z24) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                pxg1 pxg1Var2 = sdm1.f;
                i4 = i6 & 112;
                if (i4 != 32 || ((i6 & 64) != 0 && b0kVar3.i(rk41Var))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objT4 = b0kVar3.T();
                if (z10 || objT4 == m4cVar) {
                    objT4 = new kf6(rk41Var, (byte) 10);
                    b0kVar3.s0(objT4);
                }
                int i7 = ((i6 << 3) & 896) | 6 | ((i6 << 6) & 458752);
                b0kVar4 = b0kVar3;
                tob1Var3 = tob1Var2;
                ven0VarF = f("zoomOut", pxg1Var2, rk41Var, z9, (Function0) objT4, b0kVar4, i7, 0);
                boolean z27 = z9;
                zG2 = b0kVar4.g(ven0VarF);
                objT5 = b0kVar4.T();
                if (zG2 || objT5 == m4cVar) {
                    objT5 = yv91.a(new l5m1(ven0VarF, (byte) 6));
                    b0kVar4.s0(objT5);
                }
                tob1Var4 = (tob1) objT5;
                rdm1 rdm1Var4 = this.a;
                vu30Var = rdm1Var4.c;
                if (vu30Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objT6 = b0kVar4.T();
                if (objT6 == m4cVar) {
                    objT6 = v8r.q(Boolean.FALSE);
                    b0kVar4.s0(objT6);
                }
                ven0Var = (ven0) objT6;
                objT7 = b0kVar4.T();
                if (objT7 == m4cVar) {
                    objT7 = v8r.q(Boolean.FALSE);
                    b0kVar4.s0(objT7);
                }
                tob1Var5 = (ven0) objT7;
                objT8 = b0kVar4.T();
                if (objT8 == m4cVar) {
                    objT8 = c13.l(!z11, b0kVar4);
                }
                ven0Var2 = (ven0) objT8;
                if (((Boolean) ven0Var.getValue()).booleanValue() || ((Boolean) tob1Var5.getValue()).booleanValue() || ((Boolean) ven0Var2.getValue()).booleanValue()) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                Float fValueOf = Float.valueOf(f);
                if (((Boolean) tob1Var5.getValue()).booleanValue()) {
                    pxg1Var = sdm1.e;
                } else {
                    pxg1Var = sdm1.d;
                }
                tob1VarF = zod.F(fValueOf, z, pxg1Var, b0kVar4, 0);
                Boolean bool2 = (Boolean) ven0Var.getValue();
                bool2.getClass();
                Boolean bool3 = (Boolean) ven0Var2.getValue();
                bool3.getClass();
                zG3 = b0kVar4.g(tob1VarF) | b0kVar4.g(drr0VarB);
                objT9 = b0kVar4.T();
                if (!zG3 || objT9 == m4cVar) {
                    tob1Var6 = tob1Var5;
                    objT9 = new z0i1((byte) 4, ven0Var, ven0Var2, tob1VarF, drr0VarB, tob1Var6, (lnm) null);
                    b0kVar4.s0(objT9);
                } else {
                    tob1Var6 = tob1Var5;
                }
                qxd0.s(bool2, bool3, (vu30) objT9, b0kVar4);
                Boolean bool4 = (Boolean) tob1Var6.getValue();
                bool4.getClass();
                zG4 = b0kVar4.g(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x047c: INVOKE (r2v40 'zG4' boolean) = (r5v24 'b0kVar4' p.b0k), (r43v0 p.tob1) VIRTUAL call: p.x340.g(java.lang.Object):boolean (LINE:1149) in method: p.cem1.d(p.i2c, p.rk41, kotlin.jvm.functions.Function0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes5.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r43v0 p.tob1
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 3937
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.cem1.d(p.i2c, p.rk41, kotlin.jvm.functions.Function0, p.b0k, int):void");
            }

            @Override // p.qj41
            public final qk41 getDuration() {
                return this.h;
            }
        }
