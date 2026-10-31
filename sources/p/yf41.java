package p;

import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class yf41 {
    public static final kiv a = new kiv(new mf41((byte) 0), (byte) 1);
    public static final float b = 16.0f;

    public static final void a(bg41 bg41Var, vu30 vu30Var, vu30 vu30Var2, final j2i j2iVar, vu30 vu30Var3, int i, boolean z, hw61 hw61Var, float f, long j, long j2, long j3, final long j4, long j5, final j2i j2iVar2, b0k b0kVar, final int i2) {
        int i3;
        b0k b0kVar2;
        final bg41 bg41Var2;
        final vu30 vu30Var4;
        final vu30 vu30Var5;
        final vu30 vu30Var6;
        final int i4;
        final boolean z2;
        final hw61 hw61Var2;
        final float f2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        int i5;
        bg41 bg41Var3;
        hw61 hw61Var3;
        vu30 vu30Var7;
        long j10;
        long j11;
        long j12;
        long j13;
        float f3;
        vu30 vu30Var8;
        vu30 vu30Var9;
        boolean z3;
        int i6;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1135600301);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.g(nim0.a) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= 16;
        }
        int i7 = i3 | 3456;
        if ((i2 & 24576) == 0) {
            i7 |= b0kVar3.i(j2iVar) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        int i8 = i7 | 920322048;
        if (b0kVar3.Y(i8 & 1, (306783379 & i8) != 306783378)) {
            b0kVar3.d0();
            if ((i2 & 1) == 0 || b0kVar3.E()) {
                Object obj = fkj0.X;
                n8v n8vVarA = g8v.a(b0kVar3);
                Object objT = b0kVar3.T();
                if (objT == obj) {
                    objT = new cs91();
                    b0kVar3.s0(objT);
                }
                cs91 cs91Var = (cs91) objT;
                Object objT2 = b0kVar3.T();
                if (objT2 == obj) {
                    objT2 = new bg41(n8vVarA, cs91Var);
                    b0kVar3.s0(objT2);
                }
                bg41 bg41Var4 = (bg41) objT2;
                hw61 hw61Var4 = ((ox61) b0kVar3.k(qx61.a)).c;
                float f4 = e8v.a;
                long jC = ((bbh) b0kVar3.k(cbh.a)).c();
                long jA = cbh.a(jC, b0kVar3);
                long jB = u7h.b(((bbh) b0kVar3.k(cbh.a)).a(), 0.32f, 0.0f, 0.0f, 0.0f, 14);
                long jA2 = cbh.a(j4, b0kVar3);
                vu30 vu30Var10 = k1u.a;
                vu30 vu30Var11 = k1u.b;
                i5 = i8 & (-113);
                bg41Var3 = bg41Var4;
                hw61Var3 = hw61Var4;
                vu30Var7 = k1u.c;
                j10 = jA2;
                j11 = jB;
                j12 = jA;
                j13 = jC;
                f3 = f4;
                vu30Var8 = vu30Var10;
                vu30Var9 = vu30Var11;
                z3 = true;
                i6 = 2;
            } else {
                b0kVar3.b0();
                vu30Var8 = vu30Var;
                vu30Var9 = vu30Var2;
                vu30Var7 = vu30Var3;
                i6 = i;
                z3 = z;
                hw61Var3 = hw61Var;
                f3 = f;
                j13 = j;
                j12 = j2;
                j11 = j3;
                j10 = j5;
                i5 = i8 & (-113);
                bg41Var3 = bg41Var;
            }
            b0kVar3.s();
            b0kVar2 = b0kVar3;
            b(poo1.s(0.0f, 14), bg41Var3, vu30Var8, vu30Var9, j2iVar, vu30Var7, i6, z3, hw61Var3, f3, j13, j12, j11, j4, j10, j2iVar2, b0kVar2, (i5 << 3) & 2147483632, (14 & (i5 >> 27)) | 102236544);
            bg41Var2 = bg41Var3;
            vu30Var4 = vu30Var8;
            vu30Var5 = vu30Var9;
            vu30Var6 = vu30Var7;
            i4 = i6;
            z2 = z3;
            hw61Var2 = hw61Var3;
            f2 = f3;
            j6 = j13;
            j7 = j12;
            j8 = j11;
            j9 = j10;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            bg41Var2 = bg41Var;
            vu30Var4 = vu30Var;
            vu30Var5 = vu30Var2;
            vu30Var6 = vu30Var3;
            i4 = i;
            z2 = z;
            hw61Var2 = hw61Var;
            f2 = f;
            j6 = j;
            j7 = j2;
            j8 = j3;
            j9 = j5;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.pf41
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = czo1.p(i2 | 1);
                    yf41.a(bg41Var2, vu30Var4, vu30Var5, j2iVar, vu30Var6, i4, z2, hw61Var2, f2, j6, j7, j8, j4, j9, j2iVar2, (b0k) obj2, iP);
                    return rih1.a;
                }
            };
        }
    }

    public static final void b(final in20 in20Var, final bg41 bg41Var, final vu30 vu30Var, final vu30 vu30Var2, final j2i j2iVar, final vu30 vu30Var3, final int i, final boolean z, final hw61 hw61Var, final float f, final long j, final long j2, final long j3, final long j4, final long j5, final j2i j2iVar2, b0k b0kVar, final int i2, final int i3) {
        int i4;
        vu30 vu30Var4;
        int i5;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(50073903);
        if ((i2 & 6) == 0) {
            i4 = (b0kVar3.g(in20Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i2 & 48;
        nim0 nim0Var = nim0.a;
        if (i6 == 0) {
            i4 |= b0kVar3.g(nim0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar3.g(bg41Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i2 & 3072) == 0) {
            vu30Var4 = vu30Var;
            i4 |= b0kVar3.i(vu30Var4) ? 2048 : SemanticState.ReadOnly;
        } else {
            vu30Var4 = vu30Var;
        }
        int i7 = i2 & 24576;
        int i8 = SemanticState.Multiline;
        if (i7 == 0) {
            i4 |= b0kVar3.i(vu30Var2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= b0kVar3.i(j2iVar) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= b0kVar3.i(vu30Var3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= b0kVar3.e(i) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= b0kVar3.h(false) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= b0kVar3.i((Object) null) ? 536870912 : 268435456;
        }
        int i9 = i4;
        if ((i3 & 6) == 0) {
            i5 = (b0kVar3.h(z) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= b0kVar3.g(hw61Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= b0kVar3.d(f) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i3 & 3072) == 0) {
            i5 |= b0kVar3.f(j) ? 2048 : SemanticState.ReadOnly;
        }
        if ((i3 & 24576) == 0) {
            if (b0kVar3.f(j2)) {
                i8 = 16384;
            }
            i5 |= i8;
        }
        if ((i3 & 196608) == 0) {
            i5 |= b0kVar3.f(j3) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= b0kVar3.f(j4) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= b0kVar3.f(j5) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= b0kVar3.i(j2iVar2) ? 67108864 : 33554432;
        }
        if (b0kVar3.Y(i9 & 1, ((i9 & 306783379) == 306783378 && (38347923 & i5) == 38347922) ? false : true)) {
            b0kVar3.d0();
            if ((i2 & 1) != 0 && !b0kVar3.E()) {
                b0kVar3.b0();
            }
            b0kVar3.s();
            boolean z2 = (i9 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new efn0(in20Var);
                b0kVar3.s0(objT);
            }
            final efn0 efn0Var = (efn0) objT;
            b0kVar2 = b0kVar3;
            final vu30 vu30Var5 = vu30Var4;
            j2i j2iVarR = apo.r(-1236753028, new xu30() { // from class: p.rf41
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    qim0 qim0Var = (qim0) obj;
                    x340 x340Var = (b0k) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= x340Var.g(qim0Var) ? 4 : 2;
                    }
                    x340 x340Var2 = x340Var;
                    if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                        efn0 efn0Var2 = efn0Var;
                        boolean zG = x340Var2.g(efn0Var2);
                        in20 in20Var2 = in20Var;
                        boolean zG2 = zG | x340Var2.g(in20Var2);
                        Object objT2 = x340Var2.T();
                        if (zG2 || objT2 == fkj0.X) {
                            objT2 = new gub0(efn0Var2, in20Var2, (byte) 18);
                            x340Var2.s0(objT2);
                        }
                        puo1.i(too1.s(qim0Var, (iu30) objT2), (hw61) null, j4, j5, 0.0f, apo.r(-1761194824, new qf41(i, vu30Var5, j2iVar2, vu30Var3, efn0Var2, vu30Var2, j2iVar, bg41Var), x340Var2), x340Var2, 1572864, 50);
                    } else {
                        x340Var2.b0();
                    }
                    return rih1.a;
                }
            }, b0kVar2);
            b0kVar2.i0(1400739380);
            j2iVarR.invoke(nim0Var, b0kVar2, Integer.valueOf(((i9 >> 3) & 14) | 48));
            b0kVar2.r(false);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.tf41
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(i2 | 1);
                    int iP2 = czo1.p(i3);
                    yf41.b(in20Var, bg41Var, vu30Var, vu30Var2, j2iVar, vu30Var3, i, z, hw61Var, f, j, j2, j3, j4, j5, j2iVar2, (b0k) obj, iP, iP2);
                    return rih1.a;
                }
            };
        }
    }

    public static final void c(int i, vu30 vu30Var, j2i j2iVar, j2i j2iVar2, vu30 vu30Var2, erl1 erl1Var, vu30 vu30Var3, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(675142332);
        int i3 = i2 | (x340Var.h(false) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.i(vu30Var) ? 256 : SemanticState.Focused) | (x340Var.i(j2iVar) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var.i(vu30Var2) ? 131072 : 65536) | (x340Var.g(erl1Var) ? 1048576 : 524288) | (x340Var.i(vu30Var3) ? 8388608 : 4194304);
        if (x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = new xf41();
                x340Var.s0(objT);
            }
            xf41 xf41Var = (xf41) objT;
            boolean z = ((i3 & 896) == 256) | ((3670016 & i3) == 1048576) | ((458752 & i3) == 131072) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i3 & 14) == 4) | ((29360128 & i3) == 8388608) | ((i3 & 7168) == 2048);
            Object objT2 = x340Var.T();
            if (z || objT2 == obj) {
                qf41 qf41Var = new qf41(vu30Var, j2iVar2, vu30Var2, i, erl1Var, xf41Var, vu30Var3, j2iVar);
                x340Var.s0(qf41Var);
                objT2 = qf41Var;
            }
            ejo1.l(0, 1, x340Var, (vu30) objT2, (qim0) null);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sf41(i, vu30Var, j2iVar, j2iVar2, vu30Var2, erl1Var, vu30Var3, i2);
        }
    }
}
