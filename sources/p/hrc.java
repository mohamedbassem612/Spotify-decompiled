package p;

import android.content.Context;
import android.text.format.Formatter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.reactivex.rxjava3.core.Flowable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hrc extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ cv30 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrc(String str, if5 if5Var, vrc vrcVar, qim0 qim0Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, boolean z, Function0 function1, Function0 function2, lz20 lz20Var, iu30 iu30Var3, int i) {
        super(2);
        this.d = str;
        this.f = if5Var;
        this.g = vrcVar;
        this.h = qim0Var;
        this.c = iu30Var;
        this.i = iu30Var2;
        this.X = function0;
        this.b = z;
        this.Y = function1;
        this.Z = function2;
        this.e = lz20Var;
        this.t = iu30Var3;
    }

    public static final boolean a(ven0 ven0Var) {
        return ((Boolean) ven0Var.getValue()).booleanValue();
    }

    public static final boolean d(ven0 ven0Var) {
        return ((Boolean) ven0Var.getValue()).booleanValue();
    }

    public static final boolean e(ven0 ven0Var) {
        return ((Boolean) ven0Var.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:368:0x0ec6  */
    /* JADX WARN: Code duplicated, block: B:370:0x0ed2  */
    /* JADX WARN: Code duplicated, block: B:371:0x0edf  */
    /* JADX WARN: Code duplicated, block: B:377:0x0f00  */
    /* JADX WARN: Code duplicated, block: B:381:0x0f28  */
    /* JADX WARN: Code duplicated, block: B:385:0x0f4f  */
    /* JADX WARN: Code duplicated, block: B:389:0x0f76  */
    /* JADX WARN: Code duplicated, block: B:391:0x0fa4  */
    /* JADX WARN: Code duplicated, block: B:394:0x0fb3  */
    /* JADX WARN: Code duplicated, block: B:396:0x0fc3  */
    /* JADX WARN: Code duplicated, block: B:398:0x0fd8  */
    /* JADX WARN: Code duplicated, block: B:401:0x0fe7  */
    /* JADX WARN: Code duplicated, block: B:403:0x0ff9  */
    /* JADX WARN: Code duplicated, block: B:406:0x1010  */
    private final Object f(Object obj, Object obj2) {
        d0r d0rVar;
        goe goeVar;
        Object bzi0Var;
        yqg yqgVar;
        Context context;
        long j;
        yqg yqgVar2;
        x340 x340Var;
        fth0 fth0Var;
        uff uffVar;
        cir0 cir0Var;
        fth0 fth0Var2;
        ven0 ven0Var;
        tgf tgfVar;
        iu30 iu30Var;
        String str;
        zks0 zks0Var;
        Object objA;
        String str2;
        Context context2;
        Object objT;
        Object objT2;
        Object objT3;
        ven0 ven0Var2;
        cir0 cir0Var2;
        boolean zG;
        Object objT4;
        uvk0 uvk0Var;
        boolean zG2;
        Object objT5;
        boolean zG3;
        Object objT6;
        Function0 function0;
        boolean zG4;
        Object objT7;
        fth0 fth0Var3;
        x340 x340Var2 = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        Object obj3 = fkj0.X;
        ven0 ven0Var3 = (ven0) this.t;
        cir0 cir0Var3 = (cir0) this.X;
        uvk0 uvk0Var2 = (uvk0) this.i;
        Object obj4 = this.h;
        w4i1 w4i1Var = (w4i1) obj4;
        iu30 iu30Var2 = this.c;
        ncf ncfVar = (ncf) this.g;
        uff uffVar2 = (uff) this.f;
        r3d r3dVar = uffVar2.d0;
        yqg yqgVar3 = uffVar2.i0;
        d0r d0rVar2 = uffVar2.c;
        pbr0 pbr0Var = uffVar2.c0;
        tgf tgfVar2 = uffVar2.e;
        x340 x340Var3 = x340Var2;
        boolean zY = x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2);
        rih1 rih1Var = rih1.a;
        if (!zY) {
            x340Var3.b0();
            return rih1Var;
        }
        iac0 iac0Var = (iac0) x340Var3.k(jfe0.a);
        boolean zI = x340Var3.i(uffVar2) | x340Var3.i(ncfVar) | x340Var3.i(iac0Var);
        Object objT8 = x340Var3.T();
        if (zI || objT8 == obj3) {
            objT8 = new lz6(iac0Var, uffVar2, ncfVar, (byte) 1);
            x340Var3.s0(objT8);
        }
        qxd0.i(iac0Var, (iu30) objT8, x340Var3);
        goe goeVar2 = ncfVar.a;
        acf acfVar = ncfVar.e;
        boolean zG5 = x340Var3.g(goeVar2.a);
        Object objT9 = x340Var3.T();
        if (zG5 || objT9 == obj3) {
            f5f f5fVar = new f5f((lzn0) uffVar2.z.a.c.i.get(), goeVar2.a, tgfVar2.a);
            x340Var3.s0(f5fVar);
            objT9 = f5fVar;
        }
        f5f f5fVar2 = (f5f) objT9;
        String str3 = goeVar2.a;
        zks0 zks0Var2 = goeVar2.c;
        String str4 = goeVar2.a;
        boolean zG6 = x340Var3.g(str3);
        Object objT10 = x340Var3.T();
        if (zG6 || objT10 == obj3) {
            ihq ihqVar = uffVar2.R;
            String str5 = goeVar2.a;
            thq thqVar = ihqVar.a;
            teq teqVar = thqVar.c;
            ziq ziqVar = teqVar.a;
            daq daqVar = ziqVar.a;
            blw blwVar = new blw(new haa0((btf1) daqVar.Ep.get(), (ihd0) daqVar.ys.get(), (yqg) daqVar.J1.get(), (byte) 28), new swm0((f1n0) ziqVar.b.T2.get(), (byte) 3), (q8n) daqVar.E1.get());
            daq daqVar2 = teqVar.a.a;
            dbd0 dbd0Var = new dbd0(new o2b1((vcd0) daqVar2.Yd.get(), (byte) 7), (q8n) daqVar2.E1.get());
            daq daqVar3 = thqVar.b;
            objT10 = new cbd0(blwVar, dbd0Var, (q8n) daqVar3.E1.get(), (q8n) daqVar3.V2.get(), str5);
            x340Var3.s0(objT10);
        }
        cbd0 cbd0Var = (cbd0) objT10;
        Object objT11 = x340Var3.T();
        if (objT11 == obj3) {
            khq khqVar = uffVar2.S;
            String str6 = tgfVar2.a;
            sm smVar = new sm(iu30Var2, (byte) 16);
            daq daqVar4 = khqVar.a.c.a.a;
            bgd0 bgd0Var = new bgd0(str6, d0rVar2, smVar, new gal((Flowable) daqVar4.D5.get(), (vcd0) daqVar4.Yd.get(), (byte) 18));
            x340Var3.s0(bgd0Var);
            objT11 = bgd0Var;
        }
        bgd0 bgd0Var2 = (bgd0) objT11;
        Object objT12 = x340Var3.T();
        if (objT12 == obj3) {
            v1q v1qVar = uffVar2.N;
            switch (v1qVar.a) {
                case 0:
                    i2q i2qVar = (i2q) v1qVar.b;
                    lzn0 lzn0Var = (lzn0) i2qVar.b.i.get();
                    a9d a9dVar = (a9d) i2qVar.c.g3.get();
                    daq daqVar5 = i2qVar.a;
                    d0rVar = d0rVar2;
                    objT12 = new ysd1(d0rVar2, lzn0Var, a9dVar, (j0a1) daqVar5.ls.get(), (kt91) daqVar5.f8.get(), (q8n) daqVar5.E1.get(), (q8n) daqVar5.V2.get());
                    break;
                default:
                    thq thqVar2 = (thq) v1qVar.b;
                    teq teqVar2 = thqVar2.c;
                    lzn0 lzn0Var2 = (lzn0) teqVar2.i.get();
                    a9d a9dVar2 = (a9d) teqVar2.b.V1.get();
                    daq daqVar6 = thqVar2.b;
                    objT12 = new ysd1(d0rVar2, lzn0Var2, a9dVar2, (j0a1) daqVar6.ls.get(), (kt91) daqVar6.f8.get(), (q8n) daqVar6.E1.get(), (q8n) daqVar6.V2.get());
                    d0rVar = d0rVar2;
                    break;
            }
            x340Var3.s0(objT12);
        } else {
            d0rVar = d0rVar2;
        }
        ysd1 ysd1Var = (ysd1) objT12;
        boolean z = this.b;
        boolean zH = x340Var3.h(z);
        Object objT13 = x340Var3.T();
        if (zH || objT13 == obj3) {
            jgq jgqVar = uffVar2.k;
            goeVar = goeVar2;
            String str7 = goeVar.a;
            String str8 = tgfVar2.c;
            thq thqVar3 = jgqVar.a;
            teq teqVar3 = thqVar3.c;
            lzn0 lzn0Var3 = (lzn0) teqVar3.i.get();
            hyy0 hyy0VarD3 = teqVar3.d3();
            ziq ziqVar2 = teqVar3.a;
            thq thqVar4 = ziqVar2.g8;
            daq daqVar7 = ziqVar2.a;
            bzi0Var = new bzi0(lzn0Var3, hyy0VarD3, (z201) thqVar4.get(), (add) thqVar3.b.Ge.get(), new qj0((add) daqVar7.Ge.get(), (kgq) ziqVar2.Jf.get()), ziqVar2.N(), ziqVar2.R1(), (lgq) ziqVar2.Kf.get(), (mgq) ziqVar2.Lf.get(), (h4q) teqVar3.u1.get(), new umf0((yqg) daqVar7.J1.get()), str7, str8, this.b);
            x340Var3.s0(bzi0Var);
        } else {
            bzi0Var = objT13;
            goeVar = goeVar2;
        }
        bzi0 bzi0Var2 = (bzi0) bzi0Var;
        Context context3 = uffVar2.b;
        fpf fpfVar = uffVar2.q;
        add addVar = uffVar2.j;
        qf4 qf4Var = addVar.a;
        String str9 = tgfVar2.a;
        String str10 = tgfVar2.c;
        Object objT14 = x340Var3.T();
        o6x o6xVar = o6x.a;
        if (objT14 == obj3) {
            objT14 = qxd0.M(o6xVar, x340Var3);
            x340Var3.s0(objT14);
        }
        c9n c9nVar = (c9n) objT14;
        fh0 fh0Var = new fh0(10);
        boolean zI2 = x340Var3.i(c9nVar) | x340Var3.i(pbr0Var) | x340Var3.g(yqgVar3);
        goe goeVar3 = goeVar;
        Object objT15 = x340Var3.T();
        if (zI2 || objT15 == obj3) {
            objT15 = new lb50(c9nVar, pbr0Var, yqgVar3, (byte) 13);
            x340Var3.s0(objT15);
        }
        ihg0 ihg0VarE = p1p1.E(fh0Var, (iu30) objT15, x340Var3);
        Object objT16 = x340Var3.T();
        if (objT16 == obj3) {
            objT16 = new bkb0(ihg0VarE, pbr0Var, (byte) 0);
            x340Var3.s0(objT16);
        }
        Function0 function1 = (Function0) objT16;
        int iM = qf4Var.m();
        q8n q8nVar = uffVar2.l0;
        kiv kivVar = AndroidCompositionLocals_androidKt.b;
        Context context4 = (Context) x340Var3.k(kivVar);
        Object objT17 = x340Var3.T();
        if (objT17 == obj3) {
            objT17 = qxd0.M(o6xVar, x340Var3);
            x340Var3.s0(objT17);
        }
        c9n c9nVar2 = (c9n) objT17;
        long j2 = ((long) iM) * 1000000;
        Object objT18 = x340Var3.T();
        if (objT18 == obj3) {
            objT18 = v8r.q(Boolean.FALSE);
            x340Var3.s0(objT18);
        }
        ven0 ven0Var4 = (ven0) objT18;
        e1r0 e1r0Var = new e1r0((byte) 2);
        boolean zI3 = x340Var3.i(c9nVar2) | x340Var3.i(context4) | x340Var3.i(q8nVar) | x340Var3.f(j2) | x340Var3.i(pbr0Var) | x340Var3.g(yqgVar3);
        Object objT19 = x340Var3.T();
        if (zI3 || objT19 == obj3) {
            yqgVar = yqgVar3;
            objT19 = new jkb0(c9nVar2, context4, q8nVar, j2, ven0Var4, pbr0Var, yqgVar);
            context = context4;
            j = j2;
            x340Var3.s0(objT19);
        } else {
            yqgVar = yqgVar3;
            context = context4;
            j = j2;
        }
        ihg0 ihg0VarE2 = p1p1.E(e1r0Var, (iu30) objT19, x340Var3);
        if (((Boolean) ven0Var4.getValue()).booleanValue()) {
            x340Var3.i0(1437726129);
            String shortFileSize = Formatter.formatShortFileSize(context, j);
            Object objT20 = x340Var3.T();
            if (objT20 == obj3) {
                objT20 = new c470(ven0Var4, (byte) 14);
                x340Var3.s0(objT20);
            }
            r2p1.g(48, shortFileSize, (Function0) objT20, x340Var3);
            x340Var3.r(false);
        } else {
            x340Var3.i0(1437910641);
            x340Var3.r(false);
        }
        Object objT21 = x340Var3.T();
        if (objT21 == obj3) {
            objT21 = new bkb0(ihg0VarE2, pbr0Var, (byte) 1);
            x340Var3.s0(objT21);
        }
        Function0 function2 = (Function0) objT21;
        Context context5 = (Context) x340Var3.k(kivVar);
        Object objT22 = x340Var3.T();
        if (objT22 == obj3) {
            objT22 = v8r.q(Boolean.FALSE);
            x340Var3.s0(objT22);
        }
        ven0 ven0Var5 = (ven0) objT22;
        Object objT23 = x340Var3.T();
        if (objT23 == obj3) {
            objT23 = v8r.q(Boolean.FALSE);
            x340Var3.s0(objT23);
        }
        ven0 ven0Var6 = (ven0) objT23;
        boolean zG7 = x340Var3.g(r3dVar);
        Object objT24 = x340Var3.T();
        if (zG7 || objT24 == obj3) {
            yqg yqgVar4 = yqgVar;
            objT24 = new vt1(r3dVar, pbr0Var, yqgVar4, ven0Var5, ven0Var6, (byte) 21);
            yqgVar2 = yqgVar4;
            x340Var3.s0(objT24);
        } else {
            yqgVar2 = yqgVar;
        }
        Function0 function3 = (Function0) objT24;
        if (((Boolean) ven0Var5.getValue()).booleanValue()) {
            x340Var3.i0(-1468444355);
            String strO0 = cwl1.o0(x340Var3, 2131953561);
            String strO1 = cwl1.o0(x340Var3, 2131953560);
            fth0Var = null;
            String strO2 = cwl1.o0(x340Var3, 2131953558);
            String strO3 = cwl1.o0(x340Var3, 2131953557);
            Object objT25 = x340Var3.T();
            if (objT25 == obj3) {
                objT25 = new c470(ven0Var5, (byte) 5);
                x340Var3.s0(objT25);
            }
            Function0 function4 = (Function0) objT25;
            boolean zG8 = x340Var3.g(function3);
            Object objT26 = x340Var3.T();
            if (zG8 || objT26 == obj3) {
                objT26 = new cb(ven0Var5, function3, (byte) 21);
                x340Var3.s0(objT26);
            }
            Function0 function5 = (Function0) objT26;
            if (ihc1.y0(strO2)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            }
            zgx zgxVar = new zgx(strO2, new gbx(new y50(strO2), function5));
            Object objT27 = x340Var3.T();
            if (objT27 == obj3) {
                objT27 = new c470(ven0Var5, (byte) 6);
                x340Var3.s0(objT27);
            }
            Function0 function6 = (Function0) objT27;
            if (ihc1.y0(strO3)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            }
            mqo1.d(function4, (i3u) null, (hux) null, strO0, strO1, zgxVar, new zgx(strO3, new gbx(new y50(strO3), function6)), x340Var3, 2359302, 6);
            x340Var = x340Var3;
            x340Var.r(false);
        } else {
            function2 = function2;
            x340Var = x340Var3;
            fth0Var = null;
            x340Var.i0(-1467590026);
            x340Var.r(false);
        }
        if (((Boolean) ven0Var6.getValue()).booleanValue()) {
            x340Var.i0(-1467521051);
            String strO4 = cwl1.o0(x340Var, 2131953561);
            String strO5 = cwl1.o0(x340Var, 2131953560);
            String strO6 = cwl1.o0(x340Var, 2131953559);
            String strO7 = cwl1.o0(x340Var, 2131953557);
            Object objT28 = x340Var.T();
            if (objT28 == obj3) {
                objT28 = new c470(ven0Var6, (byte) 7);
                x340Var.s0(objT28);
            }
            Function0 function7 = (Function0) objT28;
            boolean zI4 = x340Var.i(context5);
            Object objT29 = x340Var.T();
            if (zI4 || objT29 == obj3) {
                objT29 = new akb0((byte) 0, context5, ven0Var6);
                x340Var.s0(objT29);
            }
            Function0 function8 = (Function0) objT29;
            if (ihc1.y0(strO6)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return fth0Var;
            }
            zgx zgxVar2 = new zgx(strO6, new gbx(new y50(strO6), function8));
            Object objT30 = x340Var.T();
            if (objT30 == obj3) {
                objT30 = new c470(ven0Var6, (byte) 8);
                x340Var.s0(objT30);
            }
            Function0 function9 = (Function0) objT30;
            if (ihc1.y0(strO7)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return fth0Var;
            }
            mqo1.d(function7, (i3u) null, (hux) null, strO4, strO5, zgxVar2, new zgx(strO7, new gbx(new y50(strO7), function9)), x340Var, 2359302, 6);
            x340Var.r(false);
        } else {
            x340Var.i0(-1466459146);
            x340Var.r(false);
        }
        c9n c9nVar3 = uffVar2.k0;
        int iM2 = qf4Var.m();
        q8n q8nVar2 = uffVar2.l0;
        Context context6 = (Context) x340Var.k(kivVar);
        Object objT31 = x340Var.T();
        if (objT31 == obj3) {
            objT31 = v8r.q(Boolean.FALSE);
            x340Var.s0(objT31);
        }
        ven0 ven0Var7 = (ven0) objT31;
        Object objT32 = x340Var.T();
        if (objT32 == obj3) {
            objT32 = v8r.q(Boolean.FALSE);
            x340Var.s0(objT32);
        }
        ven0 ven0Var8 = (ven0) objT32;
        Object objT33 = x340Var.T();
        if (objT33 == obj3) {
            objT33 = v8r.q(Boolean.FALSE);
            x340Var.s0(objT33);
        }
        ven0 ven0Var9 = (ven0) objT33;
        long j3 = ((long) iM2) * 1000000;
        boolean zG9 = x340Var.g(r3dVar);
        Object objT34 = x340Var.T();
        if (zG9 || objT34 == obj3) {
            objT34 = new ikb0(r3dVar, c9nVar3, ven0Var7, ven0Var8, context6, q8nVar2, j3, ven0Var9, pbr0Var, yqgVar2);
            x340Var.s0(objT34);
        }
        Function0 function10 = (Function0) objT34;
        if (((Boolean) ven0Var7.getValue()).booleanValue()) {
            x340Var.i0(-441585003);
            String strO8 = cwl1.o0(x340Var, 2131953561);
            String strO9 = cwl1.o0(x340Var, 2131953560);
            String strO10 = cwl1.o0(x340Var, 2131953558);
            String strO11 = cwl1.o0(x340Var, 2131953557);
            Object objT35 = x340Var.T();
            if (objT35 == obj3) {
                objT35 = new c470(ven0Var7, (byte) 9);
                x340Var.s0(objT35);
            }
            Function0 function11 = (Function0) objT35;
            boolean zG10 = x340Var.g(function10);
            Object objT36 = x340Var.T();
            if (zG10 || objT36 == obj3) {
                objT36 = new cb(ven0Var7, function10, (byte) 22);
                x340Var.s0(objT36);
            }
            Function0 function12 = (Function0) objT36;
            if (ihc1.y0(strO10)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return fth0Var;
            }
            zgx zgxVar3 = new zgx(strO10, new gbx(new y50(strO10), function12));
            Object objT37 = x340Var.T();
            if (objT37 == obj3) {
                objT37 = new c470(ven0Var7, (byte) 10);
                x340Var.s0(objT37);
            }
            Function0 function13 = (Function0) objT37;
            if (ihc1.y0(strO11)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return fth0Var;
            }
            mqo1.d(function11, (i3u) null, (hux) null, strO8, strO9, zgxVar3, new zgx(strO11, new gbx(new y50(strO11), function13)), x340Var, 2359302, 6);
            x340Var.r(false);
        } else {
            fpfVar = fpfVar;
            x340Var.i0(-440730674);
            x340Var.r(false);
        }
        if (((Boolean) ven0Var8.getValue()).booleanValue()) {
            x340Var.i0(-440661699);
            String strO12 = cwl1.o0(x340Var, 2131953561);
            String strO13 = cwl1.o0(x340Var, 2131953560);
            String strO14 = cwl1.o0(x340Var, 2131953559);
            String strO15 = cwl1.o0(x340Var, 2131953557);
            Object objT38 = x340Var.T();
            if (objT38 == obj3) {
                objT38 = new c470(ven0Var8, (byte) 11);
                x340Var.s0(objT38);
            }
            Function0 function14 = (Function0) objT38;
            boolean zI5 = x340Var.i(context6);
            Object objT39 = x340Var.T();
            if (zI5 || objT39 == obj3) {
                objT39 = new akb0((byte) 1, context6, ven0Var8);
                x340Var.s0(objT39);
            }
            Function0 function15 = (Function0) objT39;
            if (ihc1.y0(strO14)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return fth0Var;
            }
            zgx zgxVar4 = new zgx(strO14, new gbx(new y50(strO14), function15));
            Object objT40 = x340Var.T();
            if (objT40 == obj3) {
                objT40 = new c470(ven0Var8, (byte) 12);
                x340Var.s0(objT40);
            }
            Function0 function16 = (Function0) objT40;
            if (ihc1.y0(strO15)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return fth0Var;
            }
            mqo1.d(function14, (i3u) null, (hux) null, strO12, strO13, zgxVar4, new zgx(strO15, new gbx(new y50(strO15), function16)), x340Var, 2359302, 6);
            x340Var.r(false);
        } else {
            x340Var.i0(-439599794);
            x340Var.r(false);
        }
        if (((Boolean) ven0Var9.getValue()).booleanValue()) {
            x340Var.i0(-439551186);
            String shortFileSize2 = Formatter.formatShortFileSize(context6, j3);
            Object objT41 = x340Var.T();
            if (objT41 == obj3) {
                objT41 = new c470(ven0Var9, (byte) 13);
                x340Var.s0(objT41);
            }
            r2p1.g(48, shortFileSize2, (Function0) objT41, x340Var);
            x340Var.r(false);
        } else {
            x340Var.i0(-439366674);
            x340Var.r(false);
        }
        Object objT42 = x340Var.T();
        if (objT42 == obj3) {
            objT42 = v8r.q(Boolean.FALSE);
            x340Var.s0(objT42);
        }
        ven0 ven0Var10 = (ven0) objT42;
        Object objT43 = x340Var.T();
        if (objT43 == obj3) {
            objT43 = Long.valueOf(((long) qf4Var.m()) * 1000000);
            x340Var.s0(objT43);
        }
        long jLongValue = ((Number) objT43).longValue();
        if (qf4Var.h() && qf4Var.p()) {
            x340Var.i0(-2095158630);
            Object objT44 = x340Var.T();
            if (objT44 == obj3) {
                igq igqVar = uffVar2.e0;
                lff lffVar = new lff(uffVar2, jLongValue, ven0Var10, (byte) 0);
                uffVar = uffVar2;
                cir0Var = cir0Var3;
                fth0 fth0Var4 = new fth0((q8n) igqVar.a.b.V2.get(), cir0Var, lffVar);
                x340Var.s0(fth0Var4);
                objT44 = fth0Var4;
            } else {
                uffVar = uffVar2;
                cir0Var = cir0Var3;
            }
            x340Var.r(false);
            fth0Var2 = (fth0) objT44;
        } else {
            uffVar = uffVar2;
            ven0Var10 = ven0Var10;
            cir0Var = cir0Var3;
            x340Var.i0(-2092841380);
            x340Var.r(false);
            fth0Var2 = fth0Var;
        }
        Object objT45 = x340Var.T();
        if (objT45 == obj3) {
            objT45 = v8r.q(Boolean.FALSE);
            x340Var.s0(objT45);
        }
        ven0 ven0Var11 = (ven0) objT45;
        Object objT46 = x340Var.T();
        if (objT46 == obj3) {
            objT46 = v8r.q(Boolean.FALSE);
            x340Var.s0(objT46);
        }
        ven0 ven0Var12 = (ven0) objT46;
        boolean z2 = qf4Var.h() && qf4Var.s();
        Object obj5 = this.d;
        String str11 = (String) obj5;
        Object objT47 = x340Var.T();
        if (objT47 == obj3) {
            if (z2) {
                dpf dpfVar = (dpf) fpfVar.b().get(str11);
                if (dpfVar == null || (fth0Var3 = dpfVar.a) == null || fth0Var3.length() <= 0) {
                    fth0Var3 = fth0Var;
                }
                objT47 = fth0Var3;
            } else {
                objT47 = fth0Var;
            }
            x340Var.s0(objT47);
        }
        String str12 = (String) objT47;
        String str13 = (String) obj5;
        w4i1 w4i1Var2 = (w4i1) this.Y;
        lz20 lz20Var = (lz20) this.e;
        Object objT48 = x340Var.T();
        if (objT48 == obj3) {
            h7q h7qVar = uffVar.D;
            String str14 = tgfVar2.a;
            boolean z3 = z2;
            ncfVar = ncfVar;
            boolean z4 = ncfVar.j1;
            fth0 w9fVar = z3 ? new w9f(uffVar, str13, (byte) 5) : fth0Var;
            tgfVar = tgfVar2;
            iu30Var = iu30Var2;
            ven0Var = ven0Var3;
            uff uffVar3 = uffVar;
            uffVar = uffVar3;
            objT48 = h7qVar.a(str13, str14, z4, w4i1Var2, lz20Var, str12, w9fVar, uffVar.x, new q3(iu30Var, z3, uffVar3, str13, ven0Var, fth0Var2, ven0Var11, ven0Var12));
            x340Var.s0(objT48);
        } else {
            ven0Var = ven0Var3;
            tgfVar = tgfVar2;
            iu30Var = iu30Var2;
        }
        h7f h7fVar = (h7f) objT48;
        Object objT49 = x340Var.T();
        if (objT49 == obj3) {
            objT49 = uffVar.n.a(d0rVar, (ttm0) uffVar.v.get());
            x340Var.s0(objT49);
        }
        ig31 ig31Var = (ig31) objT49;
        boolean zH2 = x340Var.h(z);
        Object objT50 = x340Var.T();
        if (zH2 || objT50 == obj3) {
            objT50 = uffVar.w.a(goeVar3.a, this.b, tgfVar.c, uffVar.F, uffVar.p, uffVar.v, uffVar.c, uffVar.n0, uffVar.j0.a(), uffVar.x);
            x340Var.s0(objT50);
        }
        r171 r171Var = (r171) objT50;
        Object objT51 = x340Var.T();
        if (objT51 == obj3) {
            str = str10;
            objT51 = uffVar.K.a(str, uffVar.a);
            x340Var.s0(objT51);
        } else {
            str = str10;
        }
        h001 h001Var = (h001) objT51;
        boolean zG11 = x340Var.g(str4) | x340Var.g(w4i1Var) | x340Var.g(acfVar.a);
        Object objT52 = x340Var.T();
        if (zG11 || objT52 == obj3) {
            objT52 = uffVar.J.a(acfVar.a, goeVar3.a, tgfVar.a, tgfVar.c, new wq9(iu30Var, ven0Var, (byte) 6), new gp0(iu30Var, ven0Var, (byte) 6));
            x340Var.s0(objT52);
        }
        hn50 hn50Var = (hn50) objT52;
        boolean zG12 = x340Var.g(str4) | x340Var.g(w4i1Var);
        w4i1 w4i1Var3 = (w4i1) obj4;
        Object objT53 = x340Var.T();
        if (zG12 || objT53 == obj3) {
            zks0Var = zks0Var2;
            objA = uffVar.L.a(w4i1Var3, goeVar3.a, tgfVar.a, gff.a[l1d.C(zks0Var.a)] == 1 ? 2 : 1, new wq9(iu30Var, ven0Var, (byte) 4), new gp0(iu30Var, ven0Var, (byte) 5));
            x340Var.s0(objA);
        } else {
            objA = objT53;
            zks0Var = zks0Var2;
        }
        xif xifVar = (xif) objA;
        boolean zG13 = x340Var.g(str4) | x340Var.g(w4i1Var);
        Object objT54 = x340Var.T();
        if (zG13 || objT54 == obj3) {
            str2 = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0ba2: MOVE (r12v13 'str2' java.lang.String) = (r46v1 java.lang.String) (LINE:2979) in method: p.hrc.f(java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes9.dex
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
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r46v1 java.lang.String
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 4136
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.hrc.f(java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0049  */
        /* JADX WARN: Code duplicated, block: B:12:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:14:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:15:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:18:0x010b  */
        /* JADX WARN: Code duplicated, block: B:21:0x011c  */
        /* JADX WARN: Code duplicated, block: B:25:0x0143  */
        /* JADX WARN: Code duplicated, block: B:28:0x0159  */
        /* JADX WARN: Code duplicated, block: B:31:0x0177  */
        /* JADX WARN: Code duplicated, block: B:34:0x0188  */
        /* JADX WARN: Code duplicated, block: B:37:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:39:0x01b1  */
        public final Object invoke(Object obj, Object obj2) {
            int i;
            x340 x340Var;
            ihl ihlVarK;
            ihl ihlVarK2;
            ihl ihlVarK3;
            nim0 nim0Var;
            gfh0 gfh0VarC;
            int iHashCode;
            xos0 xos0VarM;
            qim0 qim0VarE;
            Object objT;
            m4c m4cVar;
            Object objT2;
            boolean zG;
            Object objT3;
            Object objT4;
            Object objT5;
            Object objT6;
            byte b = this.a;
            Object obj3 = this.g;
            Object obj4 = this.i;
            j2i j2iVar = this.c;
            Object obj5 = this.h;
            Object obj6 = this.X;
            Object obj7 = this.d;
            Object obj8 = this.f;
            Object obj9 = this.t;
            Object obj10 = this.Y;
            Object obj11 = this.Z;
            Object obj12 = this.e;
            rih1 rih1Var = rih1.a;
            switch (b) {
                case 0:
                    ((Number) obj2).intValue();
                    int iP = czo1.p(65);
                    boolean z = this.b;
                    t4n1.d((String) obj7, (if5) obj8, (vrc) obj3, (qim0) obj5, (iu30) j2iVar, (iu30) obj4, (Function0) obj6, z, (Function0) obj10, (Function0) obj11, (lz20) obj12, (iu30) obj9, (b0k) obj, iP);
                    return rih1Var;
                case 1:
                    return f(obj, obj2);
                default:
                    x340 x340Var2 = (b0k) obj;
                    err0 err0Var = (hdn0) obj12;
                    err0 err0Var2 = (hdn0) obj11;
                    err0 err0Var3 = (hdn0) obj10;
                    wat watVar = (wat) obj9;
                    xhl xhlVar = (xhl) obj8;
                    if ((((Number) obj2).intValue() & 11) == 2) {
                        x340 x340Var3 = x340Var2;
                        if (x340Var3.H()) {
                            x340Var3.b0();
                        } else {
                            ((ven0) obj7).setValue(rih1Var);
                            i = ((uhl) xhlVar).b;
                            xhlVar.m();
                            x340Var = x340Var2;
                            x340Var.i0(-896872256);
                            xhl xhlVar2 = (xhl) xhlVar.l().b;
                            ihlVarK = xhlVar2.k();
                            ihlVarK2 = xhlVar2.k();
                            ihlVarK3 = xhlVar2.k();
                            nim0Var = nim0.a;
                            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                            gfh0VarC = t1c.c(een.d, false);
                            iHashCode = Long.hashCode(x340Var.T);
                            xos0VarM = x340Var.m();
                            qim0VarE = zr7.E(x340Var, qim0VarD);
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(gfh0VarC, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            ((j2i) obj6).invoke(uyn1.j(0.0f, watVar.M0(err0Var3.s()), 0.0f, watVar.M0(err0Var.s() + err0Var2.s()), 5), x340Var, 0);
                            x340Var.r(true);
                            objT = x340Var.T();
                            m4cVar = fkj0.X;
                            if (objT == m4cVar) {
                                objT = zr70.f;
                                x340Var.s0(objT);
                            }
                            qim0 qim0VarJ = xhl.j(nim0Var, ihlVarK, (iu30) objT);
                            objT2 = x340Var.T();
                            if (objT2 == m4cVar) {
                                objT2 = new tu9(err0Var3, (byte) 20);
                                x340Var.s0(objT2);
                            }
                            qim0 qim0VarX = ern1.x(qim0VarJ, (iu30) objT2);
                            boolean z2 = this.b;
                            kqn1.b(0, (j2i) obj5, x340Var, qim0VarX, z2);
                            zG = x340Var.g(ihlVarK3);
                            objT3 = x340Var.T();
                            if (zG || objT3 == m4cVar) {
                                objT3 = new pu(ihlVarK3, (byte) 13);
                                x340Var.s0(objT3);
                            }
                            qim0 qim0VarJ2 = xhl.j(nim0Var, ihlVarK2, (iu30) objT3);
                            objT4 = x340Var.T();
                            if (objT4 == m4cVar) {
                                objT4 = new tu9(err0Var2, (byte) 21);
                                x340Var.s0(objT4);
                            }
                            kqn1.b(0, j2iVar, x340Var, ern1.x(qim0VarJ2, (iu30) objT4), z2);
                            objT5 = x340Var.T();
                            if (objT5 == m4cVar) {
                                objT5 = zr70.g;
                                x340Var.s0(objT5);
                            }
                            qim0 qim0VarJ3 = xhl.j(nim0Var, ihlVarK3, (iu30) objT5);
                            objT6 = x340Var.T();
                            if (objT6 == m4cVar) {
                                objT6 = new tu9(err0Var, (byte) 22);
                                x340Var.s0(objT6);
                            }
                            kqn1.b(0, (j2i) obj4, x340Var, ern1.x(qim0VarJ3, (iu30) objT6), z2);
                            x340Var.r(false);
                            if (((uhl) xhlVar).b != i) {
                                qxd0.S((su) obj3, x340Var);
                            }
                        }
                    } else {
                        ((ven0) obj7).setValue(rih1Var);
                        i = ((uhl) xhlVar).b;
                        xhlVar.m();
                        x340Var = x340Var2;
                        x340Var.i0(-896872256);
                        xhl xhlVar3 = (xhl) xhlVar.l().b;
                        ihlVarK = xhlVar3.k();
                        ihlVarK2 = xhlVar3.k();
                        ihlVarK3 = xhlVar3.k();
                        nim0Var = nim0.a;
                        qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                        gfh0VarC = t1c.c(een.d, false);
                        iHashCode = Long.hashCode(x340Var.T);
                        xos0VarM = x340Var.m();
                        qim0VarE = zr7.E(x340Var, qim0VarD2);
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0VarC, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        ((j2i) obj6).invoke(uyn1.j(0.0f, watVar.M0(err0Var3.s()), 0.0f, watVar.M0(err0Var.s() + err0Var2.s()), 5), x340Var, 0);
                        x340Var.r(true);
                        objT = x340Var.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = zr70.f;
                            x340Var.s0(objT);
                        }
                        qim0 qim0VarJ4 = xhl.j(nim0Var, ihlVarK, (iu30) objT);
                        objT2 = x340Var.T();
                        if (objT2 == m4cVar) {
                            objT2 = new tu9(err0Var3, (byte) 20);
                            x340Var.s0(objT2);
                        }
                        qim0 qim0VarX2 = ern1.x(qim0VarJ4, (iu30) objT2);
                        boolean z3 = this.b;
                        kqn1.b(0, (j2i) obj5, x340Var, qim0VarX2, z3);
                        zG = x340Var.g(ihlVarK3);
                        objT3 = x340Var.T();
                        if (zG) {
                            objT3 = new pu(ihlVarK3, (byte) 13);
                            x340Var.s0(objT3);
                        } else {
                            objT3 = new pu(ihlVarK3, (byte) 13);
                            x340Var.s0(objT3);
                        }
                        qim0 qim0VarJ5 = xhl.j(nim0Var, ihlVarK2, (iu30) objT3);
                        objT4 = x340Var.T();
                        if (objT4 == m4cVar) {
                            objT4 = new tu9(err0Var2, (byte) 21);
                            x340Var.s0(objT4);
                        }
                        kqn1.b(0, j2iVar, x340Var, ern1.x(qim0VarJ5, (iu30) objT4), z3);
                        objT5 = x340Var.T();
                        if (objT5 == m4cVar) {
                            objT5 = zr70.g;
                            x340Var.s0(objT5);
                        }
                        qim0 qim0VarJ6 = xhl.j(nim0Var, ihlVarK3, (iu30) objT5);
                        objT6 = x340Var.T();
                        if (objT6 == m4cVar) {
                            objT6 = new tu9(err0Var, (byte) 22);
                            x340Var.s0(objT6);
                        }
                        kqn1.b(0, (j2i) obj4, x340Var, ern1.x(qim0VarJ6, (iu30) objT6), z3);
                        x340Var.r(false);
                        if (((uhl) xhlVar).b != i) {
                            qxd0.S((su) obj3, x340Var);
                        }
                    }
                    return rih1Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public hrc(uff uffVar, ncf ncfVar, boolean z, w4i1 w4i1Var, iu30 iu30Var, uvk0 uvk0Var, ven0 ven0Var, cir0 cir0Var, String str, w4i1 w4i1Var2, lz20 lz20Var, b431 b431Var) {
            super(2);
            this.f = uffVar;
            this.g = ncfVar;
            this.b = z;
            this.h = w4i1Var;
            this.c = iu30Var;
            this.i = uvk0Var;
            this.t = ven0Var;
            this.X = cir0Var;
            this.d = str;
            this.Y = w4i1Var2;
            this.e = lz20Var;
            this.Z = b431Var;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public hrc(ven0 ven0Var, xhl xhlVar, int i, su suVar, boolean z, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, wat watVar, j2i j2iVar4, hdn0 hdn0Var, hdn0 hdn0Var2, hdn0 hdn0Var3) {
            super(2);
            this.d = ven0Var;
            this.f = xhlVar;
            this.g = suVar;
            this.b = z;
            this.h = j2iVar;
            this.c = j2iVar2;
            this.i = j2iVar3;
            this.t = watVar;
            this.X = j2iVar4;
            this.Y = hdn0Var;
            this.Z = hdn0Var2;
            this.e = hdn0Var3;
        }
    }
