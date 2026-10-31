package p;

import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class gi3 {
    public static final zzq0 a = new zzq0(24.0f, 24.0f, 24.0f, 24.0f);
    public static final zzq0 b;
    public static final zzq0 c;
    public static final kiv d;

    static {
        uyn1.j(0.0f, 0.0f, 0.0f, 16.0f, 7);
        b = uyn1.j(0.0f, 0.0f, 0.0f, 16.0f, 7);
        c = uyn1.j(0.0f, 0.0f, 0.0f, 24.0f, 7);
        d = new kiv(new xh3((byte) 0), (byte) 0);
    }

    public static final void a(final j2i j2iVar, qim0 qim0Var, final vu30 vu30Var, final vu30 vu30Var2, final hw61 hw61Var, final long j, final long j2, final long j3, final long j4, final long j5, b0k b0kVar, final int i) {
        final qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1378716401);
        int i2 = i | 48 | (x340Var.i((Object) null) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.i(vu30Var) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var.i(vu30Var2) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (x340Var.g(hw61Var) ? 131072 : 65536) | (x340Var.f(j) ? 1048576 : 524288) | (x340Var.d(0.0f) ? 8388608 : 4194304) | (x340Var.f(j2) ? 67108864 : 33554432) | (x340Var.f(j3) ? 536870912 : 268435456);
        if (x340Var.Y(i2 & 1, ((306783379 & i2) == 306783378 && (((x340Var.f(j5) ? ' ' : (char) 16) | (x340Var.f(j4) ? (char) 4 : (char) 2)) & 19) == 18) ? false : true)) {
            j2i j2iVarR = apo.r(-652798794, new ci3(vu30Var, vu30Var2, j3, j4, j5, j2, j2iVar), x340Var);
            int i3 = i2 >> 12;
            int i4 = (i3 & 896) | (i3 & ContentType.LONG_FORM_ON_DEMAND) | 12582918 | ((i2 >> 9) & 57344);
            qim0 qim0Var3 = nim0.a;
            w3d1.a(qim0Var3, hw61Var, j, 0L, 0.0f, 0.0f, null, j2iVarR, x340Var, i4, 104);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30(j2iVar, qim0Var2, vu30Var, vu30Var2, hw61Var, j, j2, j3, j4, j5, i) { // from class: p.yh3
                public final /* synthetic */ j2i a;
                public final /* synthetic */ qim0 b;
                public final /* synthetic */ vu30 c;
                public final /* synthetic */ vu30 d;
                public final /* synthetic */ hw61 e;
                public final /* synthetic */ long f;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;
                public final /* synthetic */ long t;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(7);
                    gi3.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, iP);
                    return rih1.a;
                }
            };
        }
    }

    public static final void b(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-917637668);
        if (x340Var.Y(i & 1, (i & 147) != 146)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new td4((byte) 14);
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iK = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            llj lljVar = y580.R0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var, iK, lljVar);
            }
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ai3(j2iVar, i, (byte) 0);
        }
    }

    public static final void c(final Function0 function0, final j2i j2iVar, final qim0 qim0Var, final vu30 vu30Var, final vu30 vu30Var2, final vu30 vu30Var3, final hw61 hw61Var, final long j, final long j2, final long j3, final long j4, final i3u i3uVar, b0k b0kVar, final int i, final int i2) {
        int i3;
        j2i j2iVar2;
        vu30 vu30Var4;
        int i4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-867616355);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            j2iVar2 = j2iVar;
            i3 |= x340Var.i(j2iVar2) ? 32 : 16;
        } else {
            j2iVar2 = j2iVar;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.g(qim0Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            vu30Var4 = vu30Var;
            i3 |= x340Var.i(vu30Var4) ? SemanticState.Modal : SemanticState.ReadOnly;
        } else {
            vu30Var4 = vu30Var;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var.i((Object) null) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var.i(vu30Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= x340Var.i(vu30Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= x340Var.g(hw61Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= x340Var.f(j) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= x340Var.f(j2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (x340Var.f(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.f(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.d(0.0f) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.g(i3uVar) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        int i5 = i4;
        if (x340Var.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            d(function0, qim0Var, i3uVar, apo.r(527420759, new fi3(vu30Var2, vu30Var3, hw61Var, j, j2, j3, j4, vu30Var4, j2iVar2), x340Var), x340Var, (i3 & 14) | 3072 | ((i3 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | ((i5 >> 3) & 896));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.wh3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(i | 1);
                    int iP2 = czo1.p(i2);
                    gi3.c(function0, j2iVar, qim0Var, vu30Var, vu30Var2, vu30Var3, hw61Var, j, j2, j3, j4, i3uVar, (b0k) obj, iP, iP2);
                    return rih1.a;
                }
            };
        }
    }

    public static final void d(Function0 function0, qim0 qim0Var, i3u i3uVar, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(24925658);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.g(i3uVar) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.i(j2iVar) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ((kjr) b0kVar2.k(d)).a(new yu3(function0, qim0Var, i3uVar, j2iVar, (byte) 29), b0kVar2, 0);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zh3(function0, qim0Var, i3uVar, j2iVar, i);
        }
    }
}
