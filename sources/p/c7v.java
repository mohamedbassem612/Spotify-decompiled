package p;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c7v extends hab0 implements vu30 {
    public final /* synthetic */ ss50 N0;
    public final /* synthetic */ ven0 O0;
    public final /* synthetic */ ggv P0;
    public final /* synthetic */ fgv Q0;
    public final /* synthetic */ ven0 R0;
    public final /* synthetic */ hdn0 S0;
    public final /* synthetic */ long T0;
    public final /* synthetic */ ven0 U0;
    public final /* synthetic */ iu30 V0;
    public final /* synthetic */ String W0;
    public final /* synthetic */ int X;
    public final /* synthetic */ c380 X0;
    public final /* synthetic */ int Y;
    public final /* synthetic */ float Y0;
    public final /* synthetic */ ven0 Z;
    public final /* synthetic */ float Z0;
    public final /* synthetic */ List a;
    public final /* synthetic */ float a1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float b1;
    public final /* synthetic */ xtb0 c;
    public final /* synthetic */ float c1;
    public final /* synthetic */ dw91 d;
    public final /* synthetic */ float d1;
    public final /* synthetic */ dw91 e;
    public final /* synthetic */ c380 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Set h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7v(List list, float f, xtb0 xtb0Var, dw91 dw91Var, dw91 dw91Var2, c380 c380Var, boolean z, Set set, ven0 ven0Var, int i, int i2, int i3, ven0 ven0Var2, ss50 ss50Var, ven0 ven0Var3, ggv ggvVar, fgv fgvVar, ven0 ven0Var4, hdn0 hdn0Var, long j, ven0 ven0Var5, iu30 iu30Var, String str, c380 c380Var2, float f2, float f3, float f4, float f5, float f6, float f7) {
        super(2);
        this.a = list;
        this.b = f;
        this.c = xtb0Var;
        this.d = dw91Var;
        this.e = dw91Var2;
        this.f = c380Var;
        this.g = z;
        this.h = set;
        this.i = ven0Var;
        this.t = i;
        this.X = i2;
        this.Y = i3;
        this.Z = ven0Var2;
        this.N0 = ss50Var;
        this.O0 = ven0Var3;
        this.P0 = ggvVar;
        this.Q0 = fgvVar;
        this.R0 = ven0Var4;
        this.S0 = hdn0Var;
        this.T0 = j;
        this.U0 = ven0Var5;
        this.V0 = iu30Var;
        this.W0 = str;
        this.X0 = c380Var2;
        this.Y0 = f2;
        this.Z0 = f3;
        this.a1 = f4;
        this.b1 = f5;
        this.c1 = f6;
        this.d1 = f7;
    }

    public static final void a(c380 c380Var, int i, int i2, ggv ggvVar, fgv fgvVar, String str, String str2, ven0 ven0Var, hdn0 hdn0Var, fde1 fde1Var, int i3) {
        long j;
        String str3;
        int iOrdinal = fde1Var.ordinal();
        if (iOrdinal == 0) {
            j = ((oce1) c380Var.get(i)).b - ((oce1) c380Var.get(i3)).a;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            j = ((oce1) c380Var.get(i3)).b - ((oce1) c380Var.get(i2)).a;
        }
        String strA = ggvVar.a(j / 1000, fgvVar);
        int iOrdinal2 = fde1Var.ordinal();
        if (iOrdinal2 == 0) {
            str3 = String.format(str, Arrays.copyOf(new Object[]{strA}, 1));
        } else {
            if (iOrdinal2 != 1) {
                eg.o();
                return;
            }
            str3 = String.format(str2, Arrays.copyOf(new Object[]{strA}, 1));
        }
        ven0Var.setValue(str3);
        ydh.m((err0) hdn0Var, 1);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0665  */
    /* JADX WARN: Code duplicated, block: B:103:0x06a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x044d  */
    /* JADX WARN: Code duplicated, block: B:73:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:76:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:77:0x050a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0588  */
    /* JADX WARN: Code duplicated, block: B:86:0x058d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0591  */
    /* JADX WARN: Code duplicated, block: B:91:0x05dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x05df  */
    /* JADX WARN: Code duplicated, block: B:97:0x065e A[ADDED_TO_REGION] */
    public final Object invoke(Object obj, Object obj2) {
        Object w6vVar;
        dw91 dw91Var;
        int i;
        m4c m4cVar;
        int i2;
        ven0 ven0Var;
        ss50 ss50Var;
        ven0 ven0Var2;
        boolean zI;
        Object y6vVar;
        dw91 dw91Var2;
        int i3;
        ss50 ss50Var2;
        xtb0 xtb0Var;
        int i4;
        float f;
        float f2;
        float f3;
        float f4;
        boolean zD;
        Object z6vVar;
        int i5;
        dw91 dw91Var3;
        float f5;
        ss50 ss50Var3;
        int i6;
        boolean zI2;
        Object objT;
        xtb0 xtb0Var2;
        ven0 ven0Var3;
        ss50 ss50Var4;
        ss50 ss50Var5;
        int i7;
        m4c m4cVar2;
        int i8;
        ven0 ven0Var4;
        xtb0 xtb0Var3;
        Float f6;
        Float f7;
        boolean zI3;
        Object objT2;
        m4c m4cVar3;
        int i9;
        ss50 ss50Var6;
        ven0 ven0Var5;
        boolean zI4;
        Object objT3;
        dw91 dw91Var4;
        ss50 ss50Var7;
        ven0 ven0Var6;
        float f8;
        boolean zD2;
        Object objT4;
        ss50 ss50Var8;
        ven0 ven0Var7;
        boolean zI5;
        Object objT5;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var2, 2131963163);
            String strO1 = cwl1.o0(x340Var2, 2131963162);
            String strO2 = cwl1.o0(x340Var2, 2131963164);
            String strO3 = cwl1.o0(x340Var2, 2131963159);
            String strO4 = cwl1.o0(x340Var2, 2131963161);
            Object objT6 = x340Var2.T();
            m4c m4cVar4 = fkj0.X;
            if (objT6 == m4cVar4) {
                objT6 = o6v.c;
                x340Var2.s0(objT6);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = s161.b(nim0Var, false, (iu30) objT6);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            Float fValueOf = null;
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            x340Var2.i0(-609476060);
            List list = this.a;
            float f9 = !list.isEmpty() ? 0.0f : this.b;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            zzq0 zzq0VarJ = uyn1.j(12.0f, f9, 12.0f, 0.0f, 8);
            qim0 qim0VarR = i1p1.r(nim0Var);
            dw91 dw91Var5 = this.d;
            boolean zI6 = x340Var2.i(dw91Var5);
            dw91 dw91Var6 = this.e;
            boolean zI7 = zI6 | x340Var2.i(dw91Var6);
            c380 c380Var = this.f;
            boolean zI8 = zI7 | x340Var2.i(c380Var);
            boolean z = this.g;
            boolean zH = zI8 | x340Var2.h(z);
            Set set = this.h;
            boolean zG = zH | x340Var2.g(set);
            ven0 ven0Var8 = this.i;
            boolean zI9 = zG | x340Var2.i(ven0Var8);
            int i10 = this.t;
            boolean zE = zI9 | x340Var2.e(i10);
            int i11 = this.X;
            boolean zE2 = zE | x340Var2.e(i11);
            int i12 = this.Y;
            boolean zE3 = zE2 | x340Var2.e(i12) | x340Var2.g(strO0) | x340Var2.g(strO1);
            ven0 ven0Var9 = this.Z;
            boolean zI10 = zE3 | x340Var2.i(ven0Var9);
            ss50 ss50Var9 = this.N0;
            boolean zI11 = zI10 | x340Var2.i(ss50Var9);
            ven0 ven0Var10 = this.O0;
            boolean zI12 = zI11 | x340Var2.i(ven0Var10);
            xtb0 xtb0Var4 = this.c;
            boolean zI13 = zI12 | x340Var2.i(xtb0Var4);
            ggv ggvVar = this.P0;
            boolean zI14 = zI13 | x340Var2.i(ggvVar);
            fgv fgvVar = this.Q0;
            boolean zI15 = zI14 | x340Var2.i(fgvVar);
            ven0 ven0Var11 = this.R0;
            boolean zI16 = zI15 | x340Var2.i(ven0Var11) | x340Var2.g(strO2) | x340Var2.g(strO3);
            hdn0 hdn0Var = this.S0;
            boolean zI17 = zI16 | x340Var2.i(hdn0Var);
            long j = this.T0;
            boolean zF = zI17 | x340Var2.f(j) | x340Var2.g(strO4);
            ven0 ven0Var12 = this.U0;
            boolean zI18 = zF | x340Var2.i(ven0Var12);
            iu30 iu30Var = this.V0;
            boolean zG2 = zI18 | x340Var2.g(iu30Var) | x340Var2.i(list);
            String str = this.W0;
            boolean zG3 = zG2 | x340Var2.g(str);
            Object objT7 = x340Var2.T();
            if (zG3 || objT7 == m4cVar4) {
                w6vVar = new w6v(list, c380Var, str, ven0Var8, ss50Var9, ven0Var10, xtb0Var4, dw91Var5, dw91Var6, z, set, i10, i11, i12, strO0, strO1, j, strO4, ven0Var12, ven0Var9, ggvVar, fgvVar, strO2, strO3, ven0Var11, hdn0Var, iu30Var);
                dw91Var = dw91Var6;
                i = i12;
                x340Var2.s0(w6vVar);
            } else {
                w6vVar = objT7;
                i = i12;
                dw91Var = dw91Var6;
            }
            dw91 dw91Var7 = dw91Var;
            int i13 = i;
            ujo1.d(qim0VarR, xtb0Var4, zzq0VarJ, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) w6vVar, x340Var2, 0, 504);
            x340 x340Var3 = x340Var2;
            c380 c380Var2 = this.X0;
            if (!c380Var2.isEmpty()) {
                int size = c380Var.size() - 1;
                int size2 = c380Var2.size();
                String strA = ggvVar.a((((oce1) c380Var.get(i13)).b - ((oce1) c380Var.get(i11)).a) / 1000, fgvVar);
                String strO5 = cwl1.o0(x340Var3, 2131963158);
                String strO6 = cwl1.o0(x340Var3, 2131963157);
                oce1 oce1Var = (oce1) o7h.t0(i11, c380Var);
                String str2 = oce1Var != null ? oce1Var.d : null;
                if (str2 == null) {
                    str2 = "";
                }
                String strU = cwl1.U(2131820934, size2, new Object[]{str2, strA, Integer.valueOf(size2)}, x340Var3);
                oce1 oce1Var2 = (oce1) o7h.t0(i13, c380Var);
                String str3 = oce1Var2 != null ? oce1Var2.d : null;
                String strU2 = cwl1.U(2131820934, size2, new Object[]{str3 != null ? str3 : "", strA, Integer.valueOf(size2)}, x340Var3);
                Float fValueOf2 = ((h7v) ven0Var8.getValue()).a ? Float.valueOf(((h7v) ven0Var8.getValue()).e) : (Float) dw91Var5.get(Integer.valueOf(i11));
                h7v h7vVar = (h7v) ven0Var8.getValue();
                float f10 = i11 - 0.5f;
                float f11 = i13;
                Float f12 = fValueOf2;
                vfx0 vfx0Var = new vfx0(i13 - i11, new jsg(0.0f, f11), Math.max(i13 - 1, 0));
                boolean zI19 = x340Var3.i(ven0Var9) | x340Var3.i(ven0Var8) | x340Var3.i(ss50Var9) | x340Var3.i(ven0Var10) | x340Var3.i(xtb0Var4) | x340Var3.e(i13) | x340Var3.e(i11);
                Object objT8 = x340Var3.T();
                if (zI19) {
                    m4cVar = m4cVar4;
                } else {
                    m4cVar = m4cVar4;
                    if (objT8 != m4cVar) {
                        ss50Var = ss50Var9;
                        ven0Var2 = ven0Var10;
                        i2 = i11;
                        ven0Var = ven0Var9;
                    }
                    iu30 iu30Var2 = (iu30) objT8;
                    zI = x340Var3.i(dw91Var5) | x340Var3.e(i2) | x340Var3.i(ven0Var8) | x340Var3.i(ss50Var) | x340Var3.i(ven0Var2) | x340Var3.i(xtb0Var4);
                    Object objT9 = x340Var3.T();
                    if (!zI || objT9 == m4cVar) {
                        ss50 ss50Var10 = ss50Var;
                        int i14 = i2;
                        dw91Var2 = dw91Var5;
                        y6vVar = new y6v(dw91Var2, i14, ven0Var8, ss50Var10, xtb0Var4, ven0Var2);
                        i3 = i14;
                        ss50Var2 = ss50Var10;
                        xtb0Var = xtb0Var4;
                        x340Var3.s0(y6vVar);
                    } else {
                        y6vVar = objT9;
                        i3 = i2;
                        dw91Var2 = dw91Var5;
                        ss50Var2 = ss50Var;
                        xtb0Var = xtb0Var4;
                    }
                    Function0 function0 = (Function0) y6vVar;
                    i4 = i3;
                    boolean zI20 = x340Var3.i(ven0Var8) | x340Var3.i(ss50Var2) | x340Var3.i(ven0Var2) | x340Var3.i(xtb0Var) | x340Var3.e(i3) | x340Var3.e(i13) | x340Var3.i(dw91Var2) | x340Var3.i(dw91Var7);
                    f = this.a1;
                    boolean zD3 = zI20 | x340Var3.d(f);
                    f2 = this.b1;
                    boolean zD4 = zD3 | x340Var3.d(f2);
                    f3 = this.c1;
                    boolean zD5 = zD4 | x340Var3.d(f3);
                    f4 = this.d1;
                    zD = zD5 | x340Var3.d(f4);
                    Object objT10 = x340Var3.T();
                    if (!zD || objT10 == m4cVar) {
                        ss50 ss50Var11 = ss50Var2;
                        dw91 dw91Var8 = dw91Var2;
                        z6vVar = new z6v(i4, i13, dw91Var8, dw91Var7, f, f2, f3, f4, ven0Var8, ss50Var11, xtb0Var, ven0Var2, (byte) 0);
                        i5 = i4;
                        dw91Var3 = dw91Var8;
                        f5 = f2;
                        ss50Var3 = ss50Var11;
                        i6 = i13;
                        x340Var3.s0(z6vVar);
                    } else {
                        dw91 dw91Var9 = dw91Var2;
                        ss50Var3 = ss50Var2;
                        dw91Var3 = dw91Var9;
                        z6vVar = objT10;
                        f5 = f2;
                        i6 = i13;
                        i5 = i4;
                    }
                    iu30 iu30Var3 = (iu30) z6vVar;
                    zI2 = x340Var3.i(ven0Var8) | x340Var3.i(ss50Var3) | x340Var3.i(ven0Var2) | x340Var3.i(xtb0Var);
                    objT = x340Var3.T();
                    if (!zI2 || objT == m4cVar) {
                        xtb0Var2 = xtb0Var;
                        ven0Var3 = ven0Var2;
                        ss50Var4 = ss50Var3;
                        objT = new a7v(ven0Var8, ss50Var4, xtb0Var2, ven0Var3, (byte) 0);
                        x340Var3.s0(objT);
                    } else {
                        xtb0Var2 = xtb0Var;
                        ven0Var3 = ven0Var2;
                        ss50Var4 = ss50Var3;
                    }
                    float f13 = this.Y0;
                    float f14 = this.Z0;
                    ss50Var5 = ss50Var4;
                    i7 = i6;
                    m4cVar2 = m4cVar;
                    i8 = i5;
                    ven0Var4 = ven0Var3;
                    xtb0Var3 = xtb0Var2;
                    bs51.f(f12, f13, f14, graVar, "drag_handle_start", strO5, strU, f10, vfx0Var, iu30Var2, function0, iu30Var3, (Function0) objT, h7vVar, x340Var3, 196614);
                    int i15 = size - i8;
                    if (((h7v) ven0Var8.getValue()).b) {
                        fValueOf = Float.valueOf(((h7v) ven0Var8.getValue()).f);
                    } else {
                        f6 = (Float) dw91Var3.get(Integer.valueOf(i7));
                        f7 = (Float) 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x051c: CHECK_CAST (r13v12 'f7' java.lang.Float) = (java.lang.Float) (wrap java.lang.Object:0x0518: INVOKE 
                              (r18v7 ?? I:??[OBJECT, ARRAY])
                              (wrap java.lang.Integer:0x0514: INVOKE (r16v39 'i7' int) STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:1301))
                             VIRTUAL call: p.dw91.get(java.lang.Object):java.lang.Object A[WRAPPED] (LINE:1305)) in method: p.c7v.invoke(java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes9.dex
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
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v7 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1772
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.c7v.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }
