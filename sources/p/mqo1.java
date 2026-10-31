package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.mobius.Next;
import com.spotify.showcase.v2.CreativeAdMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class mqo1 {
    public static final epj1 a = new epj1(13);
    public static b180 b;

    public static final c380 A(Iterable iterable) {
        c380 c380Var = iterable instanceof c380 ? (c380) iterable : null;
        return c380Var == null ? F(iterable) : c380Var;
    }

    public static final cqs0 B(Map map) {
        cqs0 cqs0Var = map instanceof cqs0 ? (cqs0) map : null;
        if (cqs0Var != null) {
            return cqs0Var;
        }
        bqs0 bqs0Var = map instanceof bqs0 ? (bqs0) map : null;
        cqs0 cqs0VarBuild = bqs0Var != null ? bqs0Var.build() : null;
        if (cqs0VarBuild != null) {
            return cqs0VarBuild;
        }
        dqs0 dqs0Var = dqs0.e;
        dqs0Var.getClass();
        eqs0 eqs0Var = new eqs0(dqs0Var);
        eqs0Var.putAll(map);
        return eqs0Var.build();
    }

    public static final u380 C(Iterable iterable) {
        u380 u380Var = iterable instanceof u380 ? (u380) iterable : null;
        if (u380Var != null) {
            return u380Var;
        }
        nqs0 nqs0Var = iterable instanceof nqs0 ? (nqs0) iterable : null;
        lqs0 lqs0VarC = nqs0Var != null ? nqs0Var.c() : null;
        return lqs0VarC == null ? w(lqs0.d, iterable) : lqs0VarC;
    }

    public static final String D(CreativeAdMetadata creativeAdMetadata) {
        if (!creativeAdMetadata.r()) {
            return null;
        }
        String strN = creativeAdMetadata.n().n();
        strN.getClass();
        if (strN.length() > 0) {
            return strN;
        }
        return null;
    }

    public static final p6r0 E(yxa0 yxa0Var) {
        if (yxa0Var.equals(txa0.a) || (yxa0Var instanceof vxa0)) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return yon1.G1("KID_ACCOUNT_CREATION_USER_INFO", "kid-account-creation/user-info", 884, "kid-account-creation");
        }
        if ((yxa0Var instanceof uxa0) || (yxa0Var instanceof wxa0)) {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            return yon1.G1("KID_ACCOUNT_TRANSITION_USER_INFO", "kid-account-transition/user-info", 898, "kid-account-transition");
        }
        eg.o();
        return null;
    }

    public static final c9 F(Iterable iterable) {
        c9 c9Var = iterable instanceof c9 ? (c9) iterable : null;
        if (c9Var != null) {
            return c9Var;
        }
        yps0 yps0Var = iterable instanceof yps0 ? (yps0) iterable : null;
        c9 c9VarD = yps0Var != null ? ((drs0) yps0Var).d() : null;
        if (c9VarD != null) {
            return c9VarD;
        }
        boolean z = iterable instanceof Collection;
        fg91 fg91Var = fg91.b;
        if (z) {
            return fg91Var.c((Collection) iterable);
        }
        drs0 drs0VarD = fg91Var.d();
        r7h.W(iterable, drs0VarD);
        return drs0VarD.d();
    }

    public static final cqs0 G(Map map) {
        dqs0 dqs0Var = map instanceof dqs0 ? (dqs0) map : null;
        if (dqs0Var != null) {
            return dqs0Var;
        }
        eqs0 eqs0Var = map instanceof eqs0 ? (eqs0) map : null;
        cqs0 cqs0VarBuild = eqs0Var != null ? eqs0Var.build() : null;
        if (cqs0VarBuild != null) {
            return cqs0VarBuild;
        }
        dqs0 dqs0Var2 = dqs0.e;
        dqs0Var2.getClass();
        eqs0 eqs0Var2 = new eqs0(dqs0Var2);
        eqs0Var2.putAll(map);
        return eqs0Var2.build();
    }

    public static final lqs0 H(Iterable iterable) {
        lqs0 lqs0Var = iterable instanceof lqs0 ? (lqs0) iterable : null;
        if (lqs0Var != null) {
            return lqs0Var;
        }
        nqs0 nqs0Var = iterable instanceof nqs0 ? (nqs0) iterable : null;
        lqs0 lqs0VarC = nqs0Var != null ? nqs0Var.c() : null;
        return lqs0VarC == null ? w(lqs0.d, iterable) : lqs0VarC;
    }

    public static final lik1 I(yxa0 yxa0Var) {
        if (yxa0Var.equals(txa0.a) || (yxa0Var instanceof vxa0)) {
            return nik1.B3;
        }
        if ((yxa0Var instanceof uxa0) || (yxa0Var instanceof wxa0)) {
            return nik1.C3;
        }
        eg.o();
        return null;
    }

    public static final void a(w4i1 w4i1Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-13856036);
        int i2 = (x340Var.g(w4i1Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            b(54, apo.r(641502847, new dwd(w4i1Var, (byte) 15), x340Var), x340Var);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a7e(w4i1Var, qim0Var, i, (byte) 9);
        }
    }

    public static final void b(int i, j2i j2iVar, b0k b0kVar) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1537237812);
        int i3 = i & 6;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 = (x340Var.i(nim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            era eraVar = een.Q0;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, cbx.b(x340Var).b.c, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            j2iVar.invoke(pbh.a, x340Var, Integer.valueOf((i2 & 112) | 6));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bf6(j2iVar, i, (byte) 2);
        }
    }

    public static final void c(w4i1 w4i1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-616062193);
        int i2 = (x340Var.g(w4i1Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            b(54, apo.r(1622596108, new ef8(w4i1Var, iu30Var, (byte) 17), x340Var), x340Var);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swc(w4i1Var, iu30Var, qim0Var2, i, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015d  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e2 A[PHI: r0 r2 r3 r10
      0x00e2: PHI (r0v6 p.hux) = (r0v3 p.hux), (r0v0 p.hux), (r0v0 p.hux) binds: [B:93:0x00fa, B:82:0x00de, B:83:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r2v20 int) = (r2v15 int), (r2v12 int), (r2v22 int) binds: [B:93:0x00fa, B:82:0x00de, B:83:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r3v8 p.i3u) = (r3v4 p.i3u), (r3v2 p.i3u), (r3v2 p.i3u) binds: [B:93:0x00fa, B:82:0x00de, B:83:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r10v8 java.lang.String) = (r10v4 java.lang.String), (r10v2 java.lang.String), (r10v2 java.lang.String) binds: [B:93:0x00fa, B:82:0x00de, B:83:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:97:0x014e  */
    public static final void d(Function0 function0, i3u i3uVar, hux huxVar, String str, String str2, zgx zgxVar, zgx zgxVar2, b0k b0kVar, int i, int i2) {
        int i3;
        i3u i3uVar2;
        String str3;
        int i4;
        zgx zgxVar3;
        int i5;
        boolean z;
        b0k b0kVar2;
        i3u i3uVar3;
        String str4;
        zgx zgxVar4;
        hux huxVar2;
        h311 h311VarV;
        int i6;
        String str5;
        i3u i3uVar4;
        zgx zgxVar5;
        int i7;
        int i8;
        hux huxVar3 = huxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2013266342);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                i3uVar2 = i3uVar;
                int i9 = b0kVar3.i(i3uVar2) ? 32 : 16;
                i3 |= i9;
            } else {
                i3uVar2 = i3uVar;
            }
            i3 |= i9;
        } else {
            i3uVar2 = i3uVar;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? b0kVar3.g(huxVar3) : b0kVar3.i(huxVar3) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 == 0) {
            if ((i & 3072) == 0) {
                str3 = str;
                i3 |= b0kVar3.g(str3) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (b0kVar3.g(str2)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            if ((196608 & i) == 0) {
                if (b0kVar3.i(zgxVar)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    zgxVar3 = zgxVar2;
                    if (b0kVar3.i(zgxVar3)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i3 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0 || b0kVar3.E()) {
                        if ((i2 & 2) != 0) {
                            i3uVar2 = new i3u(7, false, false, false);
                            i3 &= -113;
                        }
                        if (i10 != 0) {
                            huxVar3 = null;
                        }
                        if (i11 != 0) {
                            str3 = null;
                        }
                        if (i4 != 0) {
                            i6 = i3;
                            str5 = str3;
                            i3uVar4 = i3uVar2;
                            zgxVar5 = null;
                        }
                        b0kVar3.s();
                        b0kVar2 = b0kVar3;
                        e(function0, i3uVar4, r(huxVar3, zli.a, b0kVar3, ((i6 >> 6) & 14) | 56), r(str5, zli.b, b0kVar3, ((i6 >> 9) & 14) | 48), r(str2, zli.c, b0kVar3, ((i6 >> 12) & 14) | 48), r(zgxVar, zli.d, b0kVar3, ((i6 >> 15) & 14) | 48), r(zgxVar5, zli.e, b0kVar3, ((i6 >> 18) & 14) | 48), b0kVar2, i6 & 126, 0);
                        str4 = str5;
                        zgxVar4 = zgxVar5;
                        i3uVar3 = i3uVar4;
                    } else {
                        b0kVar3.b0();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                    }
                    i6 = i3;
                    str5 = str3;
                    i3uVar4 = i3uVar2;
                    zgxVar5 = zgxVar3;
                    b0kVar3.s();
                    b0kVar2 = b0kVar3;
                    e(function0, i3uVar4, r(huxVar3, zli.a, b0kVar3, ((i6 >> 6) & 14) | 56), r(str5, zli.b, b0kVar3, ((i6 >> 9) & 14) | 48), r(str2, zli.c, b0kVar3, ((i6 >> 12) & 14) | 48), r(zgxVar, zli.d, b0kVar3, ((i6 >> 15) & 14) | 48), r(zgxVar5, zli.e, b0kVar3, ((i6 >> 18) & 14) | 48), b0kVar2, i6 & 126, 0);
                    str4 = str5;
                    zgxVar4 = zgxVar5;
                    i3uVar3 = i3uVar4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    i3uVar3 = i3uVar2;
                    str4 = str3;
                    zgxVar4 = zgxVar3;
                }
                huxVar2 = huxVar3;
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new ra5(function0, i3uVar3, huxVar2, str4, str2, zgxVar, zgxVar4, i, i2);
                }
            }
            i3 |= 1572864;
            zgxVar3 = zgxVar2;
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        i3uVar2 = new i3u(7, false, false, false);
                        i3 &= -113;
                    }
                    if (i10 != 0) {
                        huxVar3 = null;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if (i4 != 0) {
                        i6 = i3;
                        str5 = str3;
                        i3uVar4 = i3uVar2;
                        zgxVar5 = null;
                    } else {
                        i6 = i3;
                        str5 = str3;
                        i3uVar4 = i3uVar2;
                        zgxVar5 = zgxVar3;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        i3uVar2 = new i3u(7, false, false, false);
                        i3 &= -113;
                    }
                    if (i10 != 0) {
                        huxVar3 = null;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if (i4 != 0) {
                        i6 = i3;
                        str5 = str3;
                        i3uVar4 = i3uVar2;
                        zgxVar5 = null;
                    } else {
                        i6 = i3;
                        str5 = str3;
                        i3uVar4 = i3uVar2;
                        zgxVar5 = zgxVar3;
                    }
                }
                b0kVar3.s();
                b0kVar2 = b0kVar3;
                e(function0, i3uVar4, r(huxVar3, zli.a, b0kVar3, ((i6 >> 6) & 14) | 56), r(str5, zli.b, b0kVar3, ((i6 >> 9) & 14) | 48), r(str2, zli.c, b0kVar3, ((i6 >> 12) & 14) | 48), r(zgxVar, zli.d, b0kVar3, ((i6 >> 15) & 14) | 48), r(zgxVar5, zli.e, b0kVar3, ((i6 >> 18) & 14) | 48), b0kVar2, i6 & 126, 0);
                str4 = str5;
                zgxVar4 = zgxVar5;
                i3uVar3 = i3uVar4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                i3uVar3 = i3uVar2;
                str4 = str3;
                zgxVar4 = zgxVar3;
            }
            huxVar2 = huxVar3;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ra5(function0, i3uVar3, huxVar2, str4, str2, zgxVar, zgxVar4, i, i2);
            }
        }
        i3 |= 3072;
        str3 = str;
        if ((i & 24576) == 0) {
            if (b0kVar3.g(str2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((196608 & i) == 0) {
            if (b0kVar3.i(zgxVar)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((1572864 & i) == 0) {
                zgxVar3 = zgxVar2;
                if (b0kVar3.i(zgxVar3)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        i3uVar2 = new i3u(7, false, false, false);
                        i3 &= -113;
                    }
                    if (i10 != 0) {
                        huxVar3 = null;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if (i4 != 0) {
                        i6 = i3;
                        str5 = str3;
                        i3uVar4 = i3uVar2;
                        zgxVar5 = null;
                    } else {
                        i6 = i3;
                        str5 = str3;
                        i3uVar4 = i3uVar2;
                        zgxVar5 = zgxVar3;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        i3uVar2 = new i3u(7, false, false, false);
                        i3 &= -113;
                    }
                    if (i10 != 0) {
                        huxVar3 = null;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if (i4 != 0) {
                        i6 = i3;
                        str5 = str3;
                        i3uVar4 = i3uVar2;
                        zgxVar5 = null;
                    } else {
                        i6 = i3;
                        str5 = str3;
                        i3uVar4 = i3uVar2;
                        zgxVar5 = zgxVar3;
                    }
                }
                b0kVar3.s();
                b0kVar2 = b0kVar3;
                e(function0, i3uVar4, r(huxVar3, zli.a, b0kVar3, ((i6 >> 6) & 14) | 56), r(str5, zli.b, b0kVar3, ((i6 >> 9) & 14) | 48), r(str2, zli.c, b0kVar3, ((i6 >> 12) & 14) | 48), r(zgxVar, zli.d, b0kVar3, ((i6 >> 15) & 14) | 48), r(zgxVar5, zli.e, b0kVar3, ((i6 >> 18) & 14) | 48), b0kVar2, i6 & 126, 0);
                str4 = str5;
                zgxVar4 = zgxVar5;
                i3uVar3 = i3uVar4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                i3uVar3 = i3uVar2;
                str4 = str3;
                zgxVar4 = zgxVar3;
            }
            huxVar2 = huxVar3;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ra5(function0, i3uVar3, huxVar2, str4, str2, zgxVar, zgxVar4, i, i2);
            }
        }
        i3 |= 1572864;
        zgxVar3 = zgxVar2;
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    i3uVar2 = new i3u(7, false, false, false);
                    i3 &= -113;
                }
                if (i10 != 0) {
                    huxVar3 = null;
                }
                if (i11 != 0) {
                    str3 = null;
                }
                if (i4 != 0) {
                    i6 = i3;
                    str5 = str3;
                    i3uVar4 = i3uVar2;
                    zgxVar5 = null;
                } else {
                    i6 = i3;
                    str5 = str3;
                    i3uVar4 = i3uVar2;
                    zgxVar5 = zgxVar3;
                }
            } else {
                if ((i2 & 2) != 0) {
                    i3uVar2 = new i3u(7, false, false, false);
                    i3 &= -113;
                }
                if (i10 != 0) {
                    huxVar3 = null;
                }
                if (i11 != 0) {
                    str3 = null;
                }
                if (i4 != 0) {
                    i6 = i3;
                    str5 = str3;
                    i3uVar4 = i3uVar2;
                    zgxVar5 = null;
                } else {
                    i6 = i3;
                    str5 = str3;
                    i3uVar4 = i3uVar2;
                    zgxVar5 = zgxVar3;
                }
            }
            b0kVar3.s();
            b0kVar2 = b0kVar3;
            e(function0, i3uVar4, r(huxVar3, zli.a, b0kVar3, ((i6 >> 6) & 14) | 56), r(str5, zli.b, b0kVar3, ((i6 >> 9) & 14) | 48), r(str2, zli.c, b0kVar3, ((i6 >> 12) & 14) | 48), r(zgxVar, zli.d, b0kVar3, ((i6 >> 15) & 14) | 48), r(zgxVar5, zli.e, b0kVar3, ((i6 >> 18) & 14) | 48), b0kVar2, i6 & 126, 0);
            str4 = str5;
            zgxVar4 = zgxVar5;
            i3uVar3 = i3uVar4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            i3uVar3 = i3uVar2;
            str4 = str3;
            zgxVar4 = zgxVar3;
        }
        huxVar2 = huxVar3;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ra5(function0, i3uVar3, huxVar2, str4, str2, zgxVar, zgxVar4, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc A[PHI: r1 r2 r5 r7
      0x00dc: PHI (r1v18 int) = (r1v12 int), (r1v10 int), (r1v19 int) binds: [B:91:0x00f4, B:80:0x00d8, B:81:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r2v12 p.i3u) = (r2v4 p.i3u), (r2v2 p.i3u), (r2v2 p.i3u) binds: [B:91:0x00f4, B:80:0x00d8, B:81:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r5v8 p.vu30) = (r5v4 p.vu30), (r5v2 p.vu30), (r5v2 p.vu30) binds: [B:91:0x00f4, B:80:0x00d8, B:81:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r7v10 p.vu30) = (r7v6 p.vu30), (r7v3 p.vu30), (r7v3 p.vu30) binds: [B:91:0x00f4, B:80:0x00d8, B:81:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:94:0x0146  */
    /* JADX WARN: Code duplicated, block: B:97:0x0153  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void e(Function0 function0, i3u i3uVar, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, vu30 vu30Var4, vu30 vu30Var5, b0k b0kVar, int i, int i2) {
        Function0 function1;
        int i3;
        i3u i3uVar2;
        vu30 vu30Var6;
        int i4;
        vu30 vu30Var7;
        int i5;
        int i6;
        vu30 vu30Var8;
        int i7;
        boolean z;
        vu30 vu30Var9;
        vu30 vu30Var10;
        vu30 vu30Var11;
        h311 h311VarV;
        i3u i3uVar3;
        vu30 vu30Var12;
        vu30 vu30Var13;
        vu30 vu30Var14;
        int i8;
        int i9;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-734795569);
        if ((i & 6) == 0) {
            function1 = function0;
            i3 = (x340Var.i(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                i3uVar2 = i3uVar;
                int i10 = x340Var.i(i3uVar2) ? 32 : 16;
                i3 |= i10;
            } else {
                i3uVar2 = i3uVar;
            }
            i3 |= i10;
        } else {
            i3uVar2 = i3uVar;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                vu30Var6 = vu30Var;
                i3 |= x340Var.i(vu30Var6) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (x340Var.i(vu30Var2)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i3 |= i9;
            }
            if ((i & 24576) == 0) {
                if (x340Var.i(vu30Var3)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    vu30Var7 = vu30Var4;
                    if (x340Var.i(vu30Var7)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    if ((1572864 & i) == 0) {
                        vu30Var8 = vu30Var5;
                        if (x340Var.i(vu30Var8)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                    if ((599187 & i3) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i3 & 1, z)) {
                        x340Var.d0();
                        if ((i & 1) != 0 || x340Var.E()) {
                            if ((i2 & 2) != 0) {
                                i3uVar2 = new i3u(7, false, false, false);
                                i3 &= -113;
                            }
                            if (i11 != 0) {
                                vu30Var6 = null;
                            }
                            if (i4 != 0) {
                                vu30Var7 = null;
                            }
                            if (i6 != 0) {
                                i3uVar3 = i3uVar2;
                                vu30Var12 = vu30Var7;
                                vu30Var13 = null;
                                vu30Var14 = vu30Var6;
                            }
                            x340Var.s();
                            WeakHashMap weakHashMap = osl1.x;
                            anm1.a(function1, new i3u(i3uVar3.a, i3uVar3.b, i3uVar3.c, false, false, i3uVar3.f, i3uVar3.g), apo.r(1655649958, new chx(lhc.g(x340Var).l, vu30Var14, vu30Var2, vu30Var3, vu30Var12, vu30Var13, (byte) 1), x340Var), x340Var, (i3 & 14) | 384, 0);
                            i3uVar2 = i3uVar3;
                            vu30Var9 = vu30Var14;
                            vu30Var10 = vu30Var12;
                            vu30Var11 = vu30Var13;
                        } else {
                            x340Var.b0();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                        }
                        i3uVar3 = i3uVar2;
                        vu30Var14 = vu30Var6;
                        vu30Var12 = vu30Var7;
                        vu30Var13 = vu30Var8;
                        x340Var.s();
                        WeakHashMap weakHashMap2 = osl1.x;
                        anm1.a(function1, new i3u(i3uVar3.a, i3uVar3.b, i3uVar3.c, false, false, i3uVar3.f, i3uVar3.g), apo.r(1655649958, new chx(lhc.g(x340Var).l, vu30Var14, vu30Var2, vu30Var3, vu30Var12, vu30Var13, (byte) 1), x340Var), x340Var, (i3 & 14) | 384, 0);
                        i3uVar2 = i3uVar3;
                        vu30Var9 = vu30Var14;
                        vu30Var10 = vu30Var12;
                        vu30Var11 = vu30Var13;
                    } else {
                        x340Var.b0();
                        vu30Var9 = vu30Var6;
                        vu30Var10 = vu30Var7;
                        vu30Var11 = vu30Var8;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ra5(function0, i3uVar2, vu30Var9, vu30Var2, vu30Var3, vu30Var10, vu30Var11, i, i2, (byte) 3);
                    }
                }
                i3 |= 1572864;
                vu30Var8 = vu30Var5;
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            i3uVar2 = new i3u(7, false, false, false);
                            i3 &= -113;
                        }
                        if (i11 != 0) {
                            vu30Var6 = null;
                        }
                        if (i4 != 0) {
                            vu30Var7 = null;
                        }
                        if (i6 != 0) {
                            i3uVar3 = i3uVar2;
                            vu30Var12 = vu30Var7;
                            vu30Var13 = null;
                            vu30Var14 = vu30Var6;
                        } else {
                            i3uVar3 = i3uVar2;
                            vu30Var14 = vu30Var6;
                            vu30Var12 = vu30Var7;
                            vu30Var13 = vu30Var8;
                        }
                    } else {
                        if ((i2 & 2) != 0) {
                            i3uVar2 = new i3u(7, false, false, false);
                            i3 &= -113;
                        }
                        if (i11 != 0) {
                            vu30Var6 = null;
                        }
                        if (i4 != 0) {
                            vu30Var7 = null;
                        }
                        if (i6 != 0) {
                            i3uVar3 = i3uVar2;
                            vu30Var12 = vu30Var7;
                            vu30Var13 = null;
                            vu30Var14 = vu30Var6;
                        } else {
                            i3uVar3 = i3uVar2;
                            vu30Var14 = vu30Var6;
                            vu30Var12 = vu30Var7;
                            vu30Var13 = vu30Var8;
                        }
                    }
                    x340Var.s();
                    WeakHashMap weakHashMap3 = osl1.x;
                    anm1.a(function1, new i3u(i3uVar3.a, i3uVar3.b, i3uVar3.c, false, false, i3uVar3.f, i3uVar3.g), apo.r(1655649958, new chx(lhc.g(x340Var).l, vu30Var14, vu30Var2, vu30Var3, vu30Var12, vu30Var13, (byte) 1), x340Var), x340Var, (i3 & 14) | 384, 0);
                    i3uVar2 = i3uVar3;
                    vu30Var9 = vu30Var14;
                    vu30Var10 = vu30Var12;
                    vu30Var11 = vu30Var13;
                } else {
                    x340Var.b0();
                    vu30Var9 = vu30Var6;
                    vu30Var10 = vu30Var7;
                    vu30Var11 = vu30Var8;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ra5(function0, i3uVar2, vu30Var9, vu30Var2, vu30Var3, vu30Var10, vu30Var11, i, i2, (byte) 3);
                }
            }
            i3 |= 196608;
            vu30Var7 = vu30Var4;
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    vu30Var8 = vu30Var5;
                    if (x340Var.i(vu30Var8)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            i3uVar2 = new i3u(7, false, false, false);
                            i3 &= -113;
                        }
                        if (i11 != 0) {
                            vu30Var6 = null;
                        }
                        if (i4 != 0) {
                            vu30Var7 = null;
                        }
                        if (i6 != 0) {
                            i3uVar3 = i3uVar2;
                            vu30Var12 = vu30Var7;
                            vu30Var13 = null;
                            vu30Var14 = vu30Var6;
                        } else {
                            i3uVar3 = i3uVar2;
                            vu30Var14 = vu30Var6;
                            vu30Var12 = vu30Var7;
                            vu30Var13 = vu30Var8;
                        }
                    } else {
                        if ((i2 & 2) != 0) {
                            i3uVar2 = new i3u(7, false, false, false);
                            i3 &= -113;
                        }
                        if (i11 != 0) {
                            vu30Var6 = null;
                        }
                        if (i4 != 0) {
                            vu30Var7 = null;
                        }
                        if (i6 != 0) {
                            i3uVar3 = i3uVar2;
                            vu30Var12 = vu30Var7;
                            vu30Var13 = null;
                            vu30Var14 = vu30Var6;
                        } else {
                            i3uVar3 = i3uVar2;
                            vu30Var14 = vu30Var6;
                            vu30Var12 = vu30Var7;
                            vu30Var13 = vu30Var8;
                        }
                    }
                    x340Var.s();
                    WeakHashMap weakHashMap4 = osl1.x;
                    anm1.a(function1, new i3u(i3uVar3.a, i3uVar3.b, i3uVar3.c, false, false, i3uVar3.f, i3uVar3.g), apo.r(1655649958, new chx(lhc.g(x340Var).l, vu30Var14, vu30Var2, vu30Var3, vu30Var12, vu30Var13, (byte) 1), x340Var), x340Var, (i3 & 14) | 384, 0);
                    i3uVar2 = i3uVar3;
                    vu30Var9 = vu30Var14;
                    vu30Var10 = vu30Var12;
                    vu30Var11 = vu30Var13;
                } else {
                    x340Var.b0();
                    vu30Var9 = vu30Var6;
                    vu30Var10 = vu30Var7;
                    vu30Var11 = vu30Var8;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ra5(function0, i3uVar2, vu30Var9, vu30Var2, vu30Var3, vu30Var10, vu30Var11, i, i2, (byte) 3);
                }
            }
            i3 |= 1572864;
            vu30Var8 = vu30Var5;
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        i3uVar2 = new i3u(7, false, false, false);
                        i3 &= -113;
                    }
                    if (i11 != 0) {
                        vu30Var6 = null;
                    }
                    if (i4 != 0) {
                        vu30Var7 = null;
                    }
                    if (i6 != 0) {
                        i3uVar3 = i3uVar2;
                        vu30Var12 = vu30Var7;
                        vu30Var13 = null;
                        vu30Var14 = vu30Var6;
                    } else {
                        i3uVar3 = i3uVar2;
                        vu30Var14 = vu30Var6;
                        vu30Var12 = vu30Var7;
                        vu30Var13 = vu30Var8;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        i3uVar2 = new i3u(7, false, false, false);
                        i3 &= -113;
                    }
                    if (i11 != 0) {
                        vu30Var6 = null;
                    }
                    if (i4 != 0) {
                        vu30Var7 = null;
                    }
                    if (i6 != 0) {
                        i3uVar3 = i3uVar2;
                        vu30Var12 = vu30Var7;
                        vu30Var13 = null;
                        vu30Var14 = vu30Var6;
                    } else {
                        i3uVar3 = i3uVar2;
                        vu30Var14 = vu30Var6;
                        vu30Var12 = vu30Var7;
                        vu30Var13 = vu30Var8;
                    }
                }
                x340Var.s();
                WeakHashMap weakHashMap5 = osl1.x;
                anm1.a(function1, new i3u(i3uVar3.a, i3uVar3.b, i3uVar3.c, false, false, i3uVar3.f, i3uVar3.g), apo.r(1655649958, new chx(lhc.g(x340Var).l, vu30Var14, vu30Var2, vu30Var3, vu30Var12, vu30Var13, (byte) 1), x340Var), x340Var, (i3 & 14) | 384, 0);
                i3uVar2 = i3uVar3;
                vu30Var9 = vu30Var14;
                vu30Var10 = vu30Var12;
                vu30Var11 = vu30Var13;
            } else {
                x340Var.b0();
                vu30Var9 = vu30Var6;
                vu30Var10 = vu30Var7;
                vu30Var11 = vu30Var8;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ra5(function0, i3uVar2, vu30Var9, vu30Var2, vu30Var3, vu30Var10, vu30Var11, i, i2, (byte) 3);
            }
        }
        i3 |= 384;
        vu30Var6 = vu30Var;
        if ((i & 3072) == 0) {
            if (x340Var.i(vu30Var2)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        if ((i & 24576) == 0) {
            if (x340Var.i(vu30Var3)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                vu30Var7 = vu30Var4;
                if (x340Var.i(vu30Var7)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    vu30Var8 = vu30Var5;
                    if (x340Var.i(vu30Var8)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if ((i2 & 2) != 0) {
                            i3uVar2 = new i3u(7, false, false, false);
                            i3 &= -113;
                        }
                        if (i11 != 0) {
                            vu30Var6 = null;
                        }
                        if (i4 != 0) {
                            vu30Var7 = null;
                        }
                        if (i6 != 0) {
                            i3uVar3 = i3uVar2;
                            vu30Var12 = vu30Var7;
                            vu30Var13 = null;
                            vu30Var14 = vu30Var6;
                        } else {
                            i3uVar3 = i3uVar2;
                            vu30Var14 = vu30Var6;
                            vu30Var12 = vu30Var7;
                            vu30Var13 = vu30Var8;
                        }
                    } else {
                        if ((i2 & 2) != 0) {
                            i3uVar2 = new i3u(7, false, false, false);
                            i3 &= -113;
                        }
                        if (i11 != 0) {
                            vu30Var6 = null;
                        }
                        if (i4 != 0) {
                            vu30Var7 = null;
                        }
                        if (i6 != 0) {
                            i3uVar3 = i3uVar2;
                            vu30Var12 = vu30Var7;
                            vu30Var13 = null;
                            vu30Var14 = vu30Var6;
                        } else {
                            i3uVar3 = i3uVar2;
                            vu30Var14 = vu30Var6;
                            vu30Var12 = vu30Var7;
                            vu30Var13 = vu30Var8;
                        }
                    }
                    x340Var.s();
                    WeakHashMap weakHashMap6 = osl1.x;
                    anm1.a(function1, new i3u(i3uVar3.a, i3uVar3.b, i3uVar3.c, false, false, i3uVar3.f, i3uVar3.g), apo.r(1655649958, new chx(lhc.g(x340Var).l, vu30Var14, vu30Var2, vu30Var3, vu30Var12, vu30Var13, (byte) 1), x340Var), x340Var, (i3 & 14) | 384, 0);
                    i3uVar2 = i3uVar3;
                    vu30Var9 = vu30Var14;
                    vu30Var10 = vu30Var12;
                    vu30Var11 = vu30Var13;
                } else {
                    x340Var.b0();
                    vu30Var9 = vu30Var6;
                    vu30Var10 = vu30Var7;
                    vu30Var11 = vu30Var8;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ra5(function0, i3uVar2, vu30Var9, vu30Var2, vu30Var3, vu30Var10, vu30Var11, i, i2, (byte) 3);
                }
            }
            i3 |= 1572864;
            vu30Var8 = vu30Var5;
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        i3uVar2 = new i3u(7, false, false, false);
                        i3 &= -113;
                    }
                    if (i11 != 0) {
                        vu30Var6 = null;
                    }
                    if (i4 != 0) {
                        vu30Var7 = null;
                    }
                    if (i6 != 0) {
                        i3uVar3 = i3uVar2;
                        vu30Var12 = vu30Var7;
                        vu30Var13 = null;
                        vu30Var14 = vu30Var6;
                    } else {
                        i3uVar3 = i3uVar2;
                        vu30Var14 = vu30Var6;
                        vu30Var12 = vu30Var7;
                        vu30Var13 = vu30Var8;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        i3uVar2 = new i3u(7, false, false, false);
                        i3 &= -113;
                    }
                    if (i11 != 0) {
                        vu30Var6 = null;
                    }
                    if (i4 != 0) {
                        vu30Var7 = null;
                    }
                    if (i6 != 0) {
                        i3uVar3 = i3uVar2;
                        vu30Var12 = vu30Var7;
                        vu30Var13 = null;
                        vu30Var14 = vu30Var6;
                    } else {
                        i3uVar3 = i3uVar2;
                        vu30Var14 = vu30Var6;
                        vu30Var12 = vu30Var7;
                        vu30Var13 = vu30Var8;
                    }
                }
                x340Var.s();
                WeakHashMap weakHashMap7 = osl1.x;
                anm1.a(function1, new i3u(i3uVar3.a, i3uVar3.b, i3uVar3.c, false, false, i3uVar3.f, i3uVar3.g), apo.r(1655649958, new chx(lhc.g(x340Var).l, vu30Var14, vu30Var2, vu30Var3, vu30Var12, vu30Var13, (byte) 1), x340Var), x340Var, (i3 & 14) | 384, 0);
                i3uVar2 = i3uVar3;
                vu30Var9 = vu30Var14;
                vu30Var10 = vu30Var12;
                vu30Var11 = vu30Var13;
            } else {
                x340Var.b0();
                vu30Var9 = vu30Var6;
                vu30Var10 = vu30Var7;
                vu30Var11 = vu30Var8;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ra5(function0, i3uVar2, vu30Var9, vu30Var2, vu30Var3, vu30Var10, vu30Var11, i, i2, (byte) 3);
            }
        }
        i3 |= 196608;
        vu30Var7 = vu30Var4;
        i6 = i2 & 64;
        if (i6 != 0) {
            if ((1572864 & i) == 0) {
                vu30Var8 = vu30Var5;
                if (x340Var.i(vu30Var8)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        i3uVar2 = new i3u(7, false, false, false);
                        i3 &= -113;
                    }
                    if (i11 != 0) {
                        vu30Var6 = null;
                    }
                    if (i4 != 0) {
                        vu30Var7 = null;
                    }
                    if (i6 != 0) {
                        i3uVar3 = i3uVar2;
                        vu30Var12 = vu30Var7;
                        vu30Var13 = null;
                        vu30Var14 = vu30Var6;
                    } else {
                        i3uVar3 = i3uVar2;
                        vu30Var14 = vu30Var6;
                        vu30Var12 = vu30Var7;
                        vu30Var13 = vu30Var8;
                    }
                } else {
                    if ((i2 & 2) != 0) {
                        i3uVar2 = new i3u(7, false, false, false);
                        i3 &= -113;
                    }
                    if (i11 != 0) {
                        vu30Var6 = null;
                    }
                    if (i4 != 0) {
                        vu30Var7 = null;
                    }
                    if (i6 != 0) {
                        i3uVar3 = i3uVar2;
                        vu30Var12 = vu30Var7;
                        vu30Var13 = null;
                        vu30Var14 = vu30Var6;
                    } else {
                        i3uVar3 = i3uVar2;
                        vu30Var14 = vu30Var6;
                        vu30Var12 = vu30Var7;
                        vu30Var13 = vu30Var8;
                    }
                }
                x340Var.s();
                WeakHashMap weakHashMap8 = osl1.x;
                anm1.a(function1, new i3u(i3uVar3.a, i3uVar3.b, i3uVar3.c, false, false, i3uVar3.f, i3uVar3.g), apo.r(1655649958, new chx(lhc.g(x340Var).l, vu30Var14, vu30Var2, vu30Var3, vu30Var12, vu30Var13, (byte) 1), x340Var), x340Var, (i3 & 14) | 384, 0);
                i3uVar2 = i3uVar3;
                vu30Var9 = vu30Var14;
                vu30Var10 = vu30Var12;
                vu30Var11 = vu30Var13;
            } else {
                x340Var.b0();
                vu30Var9 = vu30Var6;
                vu30Var10 = vu30Var7;
                vu30Var11 = vu30Var8;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ra5(function0, i3uVar2, vu30Var9, vu30Var2, vu30Var3, vu30Var10, vu30Var11, i, i2, (byte) 3);
            }
        }
        i3 |= 1572864;
        vu30Var8 = vu30Var5;
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    i3uVar2 = new i3u(7, false, false, false);
                    i3 &= -113;
                }
                if (i11 != 0) {
                    vu30Var6 = null;
                }
                if (i4 != 0) {
                    vu30Var7 = null;
                }
                if (i6 != 0) {
                    i3uVar3 = i3uVar2;
                    vu30Var12 = vu30Var7;
                    vu30Var13 = null;
                    vu30Var14 = vu30Var6;
                } else {
                    i3uVar3 = i3uVar2;
                    vu30Var14 = vu30Var6;
                    vu30Var12 = vu30Var7;
                    vu30Var13 = vu30Var8;
                }
            } else {
                if ((i2 & 2) != 0) {
                    i3uVar2 = new i3u(7, false, false, false);
                    i3 &= -113;
                }
                if (i11 != 0) {
                    vu30Var6 = null;
                }
                if (i4 != 0) {
                    vu30Var7 = null;
                }
                if (i6 != 0) {
                    i3uVar3 = i3uVar2;
                    vu30Var12 = vu30Var7;
                    vu30Var13 = null;
                    vu30Var14 = vu30Var6;
                } else {
                    i3uVar3 = i3uVar2;
                    vu30Var14 = vu30Var6;
                    vu30Var12 = vu30Var7;
                    vu30Var13 = vu30Var8;
                }
            }
            x340Var.s();
            WeakHashMap weakHashMap9 = osl1.x;
            anm1.a(function1, new i3u(i3uVar3.a, i3uVar3.b, i3uVar3.c, false, false, i3uVar3.f, i3uVar3.g), apo.r(1655649958, new chx(lhc.g(x340Var).l, vu30Var14, vu30Var2, vu30Var3, vu30Var12, vu30Var13, (byte) 1), x340Var), x340Var, (i3 & 14) | 384, 0);
            i3uVar2 = i3uVar3;
            vu30Var9 = vu30Var14;
            vu30Var10 = vu30Var12;
            vu30Var11 = vu30Var13;
        } else {
            x340Var.b0();
            vu30Var9 = vu30Var6;
            vu30Var10 = vu30Var7;
            vu30Var11 = vu30Var8;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ra5(function0, i3uVar2, vu30Var9, vu30Var2, vu30Var3, vu30Var10, vu30Var11, i, i2, (byte) 3);
        }
    }

    public static final void f(String str, jwm jwmVar, boolean z, c380 c380Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-591692283);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(jwmVar) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.g(c380Var) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            b(54, apo.r(-1848470424, new hh1(c380Var, jwmVar, function0, str, z, (byte) 1), x340Var), x340Var);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(str, (Object) jwmVar, z, (Object) c380Var, (Object) function0, (Object) qim0Var2, i, (byte) 2);
        }
    }

    public static final void g(n2c0 n2c0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1326326257);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(n2c0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            irn1.u(null, apo.r(1234733092, new iwa0(n2c0Var, iu30Var), x340Var), null, null, apo.r(53579242, new kwa0(l6o1.C(0, 0, 1, x340Var), n2c0Var, iu30Var), x340Var), x340Var, 24624, 13);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lwa0(n2c0Var, iu30Var, i, (byte) 1);
        }
    }

    public static final void h(tgs0 tgs0Var, pjp pjpVar, lbl0 lbl0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-991271779);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(tgs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(pjpVar) : x340Var.i(pjpVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(lbl0Var) ? 256 : 128;
        }
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            d36 d36Var = new d36(8.0f, true, new um5(false));
            zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, tgs0Var.a, 7);
            qim0 qim0VarN = anm1.N("pending-join-requests-list", uyn1.B(u291.f(nim0.a, 1.0f), 8.0f, 8.0f, 8.0f, 0.0f, 8));
            boolean zI = x340Var.i(tgs0Var);
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(pjpVar))) {
                z = true;
            }
            boolean zI2 = zI | z | x340Var.i(lbl0Var);
            Object objT = x340Var.T();
            if (zI2 || objT == fkj0.X) {
                objT = new mvn0(tgs0Var, pjpVar, lbl0Var, (byte) 18);
                x340Var.s0(objT);
            }
            ujo1.d(qim0VarN, null, zzq0VarJ, false, d36Var, null, null, false, null, (iu30) objT, x340Var, 0, 490);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(tgs0Var, pjpVar, lbl0Var, i, (byte) 17);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void i(tpw0 tpw0Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        String strN0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1791287934);
        int i2 = (x340Var.e(tpw0Var.ordinal()) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131957236);
            int iOrdinal = tpw0Var.ordinal();
            if (iOrdinal == 0) {
                x340Var.i0(854197390);
                x340Var.r(false);
                eg.m("This privacy policy type is not supported yet");
                return;
            }
            if (iOrdinal == 1) {
                x340Var.i0(854194505);
                strN0 = cwl1.n0(2131957222, new Object[]{strO0}, x340Var);
                x340Var.r(false);
            } else if (iOrdinal == 2) {
                x340Var.i0(854191364);
                strN0 = cwl1.n0(2131957232, new Object[]{strO0}, x340Var);
                x340Var.r(false);
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw p3d1.k(x340Var, 854187693, false);
                }
                x340Var.i0(854194505);
                strN0 = cwl1.n0(2131957222, new Object[]{strO0}, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(854188617);
                strN0 = cwl1.n0(2131957229, new Object[]{strO0}, x340Var);
                x340Var.r(false);
            }
            c9 c9VarS = s(new mae1(strO0, "https://www.spotify.com/legal/managed-account-parent-guardian-privacy-policy/plain/"));
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new jwa0(iu30Var, (byte) 8);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            i8p1.i(strN0, c9VarS, iu30Var2, uyn1.B(nim0.a, 16.0f, f, 16.0f, 0.0f, 8), null, 0L, 0L, x340Var, 0, 112);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx90(tpw0Var, iu30Var, i, (byte) 15);
        }
    }

    public static final void j(r6q r6qVar, o860 o860Var, csc1 csc1Var, kt91 kt91Var, b0k b0kVar, int i) {
        x340 x340Var;
        tob1 tob1Var;
        Context context;
        tob1 tob1Var2;
        Object objA;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(519539851);
        int i2 = i | (x340Var2.i(r6qVar) ? 4 : 2) | (x340Var2.g(o860Var) ? 32 : 16) | (x340Var2.i(csc1Var) ? 256 : 128) | (x340Var2.i(kt91Var) ? 2048 : 1024);
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Context context2 = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, x340Var2);
                x340Var2.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = new src1();
                x340Var2.s0(objT2);
            }
            src1 src1Var = (src1) objT2;
            boolean z = (i2 & 112) == 32;
            Object objT3 = x340Var2.T();
            if (z || objT3 == m4cVar) {
                x010 x010Var = new x010((mr20) o860Var.d, (mr20) o860Var.e, new bu51(3, (lnm) null, (byte) 11), (byte) 1);
                x340Var2.s0(x010Var);
                objT3 = x010Var;
            }
            tob1 tob1VarG = rwq.g((mr20) objT3, new rvs0(z6x.a, null), null, x340Var2, 0, 2);
            Object[] objArr = new Object[0];
            Object objT4 = x340Var2.T();
            if (objT4 == m4cVar) {
                objT4 = orc1.d;
                x340Var2.s0(objT4);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT4, x340Var2, 48);
            Object[] objArr2 = new Object[0];
            Object objT5 = x340Var2.T();
            if (objT5 == m4cVar) {
                objT5 = orc1.e;
                x340Var2.s0(objT5);
            }
            tob1 tob1Var3 = (ven0) k5p1.s(objArr2, (Function0) objT5, x340Var2, 48);
            boolean zG = x340Var2.g(r6qVar);
            Object objT6 = x340Var2.T();
            if (zG || objT6 == m4cVar) {
                x340Var = x340Var2;
                tob1Var = tob1Var3;
                context = context2;
                tob1Var2 = tob1VarG;
                objA = r6qVar.a(new trc1(c9nVar, tob1Var, ven0Var, o860Var, kt91Var, context, tob1Var2), new fjc1(csc1Var, (byte) 4), src1Var);
                x340Var.s0(objA);
            } else {
                tob1Var2 = tob1VarG;
                x340Var = x340Var2;
                tob1Var = tob1Var3;
                objA = objT6;
                context = context2;
            }
            ccb0 ccb0Var = (ccb0) objA;
            String str = ((Boolean) ven0Var.getValue()).booleanValue() ? (String) tob1Var.getValue() : ((rvs0) tob1Var2.getValue()).b;
            String string = context.getString(2131962995);
            List<vab0> list = ((rvs0) tob1Var2.getValue()).a;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (vab0 vab0Var : list) {
                arrayList.add(new xab0(vab0Var.b, vab0Var.e, vab0Var.c ? "[CC]" : null, vab0Var.d));
            }
            acb0 acb0Var = new acb0(string, str, arrayList, true);
            x340 x340Var3 = x340Var;
            x340Var2 = x340Var3;
            otw.c(ccb0Var, acb0Var, (qim0) null, wpb1.C("SubtitlesLanguagePickerStateHolder", ccb0Var, acb0Var, x340Var3, 6, 8), x340Var2, 0, 4);
        } else {
            x340Var2.b0();
        }
        h311 h311VarV = x340Var2.v();
        if (h311VarV != null) {
            h311VarV.d = new gh61(i, r6qVar, o860Var, csc1Var, kt91Var, (byte) 23);
        }
    }

    public static final void k(iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-87623779);
        int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strN0 = cwl1.n0(2131957238, new Object[]{cwl1.o0(x340Var, 2131957239)}, x340Var);
            c9 c9VarS = s(new mae1(cwl1.o0(x340Var, 2131957239), "https://www.spotify.com/legal/end-user-agreement/plain/"));
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new jwa0(iu30Var, (byte) 9);
                x340Var.s0(objT);
            }
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            i8p1.i(strN0, c9VarS, (iu30) objT, uyn1.B(nim0.a, 16.0f, f, 16.0f, 0.0f, 8), null, 0L, 0L, x340Var, 0, 112);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d720(iu30Var, i, (byte) 22);
        }
    }

    public static final void l(iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1702755714);
        int i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strN0 = cwl1.n0(2131957240, new Object[]{cwl1.o0(x340Var, 2131957241)}, x340Var);
            c9 c9VarS = s(new mae1(cwl1.o0(x340Var, 2131957241), "https://www.spotify.com/legal/managed-account-young-listener-privacy-policy/plain/"));
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new jwa0(iu30Var, (byte) 10);
                x340Var.s0(objT);
            }
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            i8p1.i(strN0, c9VarS, (iu30) objT, uyn1.B(nim0.a, 16.0f, f, 16.0f, 0.0f, 8), null, 0L, 0L, x340Var, 0, 112);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d720(iu30Var, i, (byte) 23);
        }
    }

    public static final void n(LinkedHashSet linkedHashSet, rl7 rl7Var) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((sl7) it.next()).b(rl7Var);
        }
    }

    public static final void o(LinkedHashSet linkedHashSet, rl7 rl7Var) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((sl7) it.next()).a(rl7Var);
        }
    }

    public static xh7 p() {
        return xh7.d;
    }

    public static ck60 q(String str) {
        if (sgy.d(str)) {
            return ck60.a;
        }
        if (sgy.i(str)) {
            return ck60.b;
        }
        if (nik1.N.a(str)) {
            return ck60.c;
        }
        if (nik1.E.a(str)) {
            return ck60.d;
        }
        if (nik1.P4.a(str)) {
            return ck60.e;
        }
        if (sgy.b(str)) {
            return ck60.f;
        }
        if (sgy.f(str)) {
            return ck60.g;
        }
        Set set = s4b1.f;
        blc0[] blc0VarArr = sgy.b;
        if (uic.h(str, (blc0[]) Arrays.copyOf(blc0VarArr, blc0VarArr.length))) {
            return ck60.h;
        }
        if (uic.g(str, blc0.de)) {
            return ck60.i;
        }
        if (uic.h(str, new blc0[]{blc0.J2, blc0.K2})) {
            return ck60.t;
        }
        if (uic.g(str, blc0.ij)) {
            return ck60.X;
        }
        if (uic.h(str, new blc0[]{blc0.U4, blc0.Y4})) {
            return ck60.Y;
        }
        if (sgy.a(str)) {
            return ck60.Z;
        }
        return sgy.c(str) ? ck60.N0 : ck60.O0;
    }

    public static final j2i r(Object obj, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        if (obj == null) {
            x340Var.i0(-1620169331);
            x340Var.r(false);
            return null;
        }
        x340Var.i0(-1620169330);
        j2i j2iVarR = apo.r(2020211199, new dhx(j2iVar, obj, i, (byte) 0), x340Var);
        x340Var.r(false);
        return j2iVarR;
    }

    public static final c9 s(Object... objArr) {
        return fg91.b.c(Arrays.asList(objArr));
    }

    public static final cqs0 t(mmr0... mmr0VarArr) {
        dqs0 dqs0Var = dqs0.e;
        dqs0Var.getClass();
        eqs0 eqs0Var = new eqs0(dqs0Var);
        sqg0.R(eqs0Var, mmr0VarArr);
        return eqs0Var.build();
    }

    public static final dqs0 u() {
        return dqs0.e;
    }

    public static final lqs0 v() {
        lqs0 lqs0Var = lqs0.d;
        return lqs0.d;
    }

    public static final lqs0 w(lqs0 lqs0Var, Iterable iterable) {
        if (iterable instanceof Collection) {
            nqs0 nqs0Var = new nqs0(lqs0Var);
            nqs0Var.addAll((Collection) iterable);
            return nqs0Var.c();
        }
        nqs0 nqs0Var2 = new nqs0(lqs0Var);
        r7h.W(iterable, nqs0Var2);
        return nqs0Var2.c();
    }

    public static final Next x(o501 o501Var, f501 f501Var) {
        boolean z = o501Var.a;
        cce0 cce0Var = o501Var.c;
        boolean zEquals = f501Var.equals(t401.a);
        h401 h401Var = h401.a;
        if (zEquals) {
            return Next.a(Collections.singleton(h401Var));
        }
        boolean z2 = f501Var instanceof u401;
        i401 i401Var = i401.a;
        if (z2) {
            Throwable th = ((u401) f501Var).a;
            return Next.i(o501.a(o501Var, (String) null, new yae0(th), 0, 11), Collections.singleton(new m401(i401Var, i3a.j("Failed to load reaction counts: ", th))));
        }
        if (f501Var instanceof w401) {
            o501 o501VarA = o501.a(o501Var, (String) null, new gbe0(new rxz0(((w401) f501Var).a)), 0, 11);
            return ((cce0Var instanceof qbe0) && z) ? Next.i(o501VarA, Collections.singleton(j401.a)) : Next.h(o501VarA);
        }
        if (f501Var instanceof z401) {
            return Next.h(o501.a(o501Var, (String) null, (cce0) null, ((z401) f501Var).a, 7));
        }
        if (f501Var instanceof y401) {
            String str = ((y401) f501Var).a;
            return cce0Var instanceof gbe0 ? Next.i(o501.a(o501Var, str, (cce0) null, 0, 5), Collections.singleton(new g401(str))) : Next.j();
        }
        if (f501Var instanceof s401) {
            return z ? Next.a(Collections.singleton(h401Var)) : Next.a(Collections.singleton(i401Var));
        }
        if (f501Var instanceof r401) {
            r401 r401Var = (r401) f501Var;
            return Next.i(o501.a(o501Var, "", (cce0) null, 0, 13), Collections.singleton(new m401(new g401(r401Var.a), i3a.j("Failed to add reaction: ", r401Var.b))));
        }
        if (f501Var instanceof c501) {
            l401 l401Var = ((c501) f501Var).a;
            if (l401Var.equals(i401Var)) {
                return Next.a(Collections.singleton(l401Var));
            }
            if (l401Var instanceof g401) {
                return Next.a(Collections.singleton(l401Var));
            }
            if (l401Var instanceof k401) {
                return Next.a(Collections.singleton(l401Var));
            }
            eg.o();
            return null;
        }
        if (f501Var instanceof d501) {
            return Next.j();
        }
        if (f501Var instanceof e501) {
            return cce0Var instanceof gbe0 ? Next.h(o501.a(o501Var, ((e501) f501Var).a, (cce0) null, 0, 13)) : Next.j();
        }
        if (f501Var instanceof a501) {
            a501 a501Var = (a501) f501Var;
            String str2 = a501Var.a;
            return Next.i(o501.a(o501Var, str2, (cce0) null, 0, 13), Collections.singleton(new m401(new k401(str2), i3a.j("Failed to remove reaction: ", a501Var.b))));
        }
        if (f501Var instanceof b501) {
            return Next.a(Collections.singleton(h401Var));
        }
        if (f501Var instanceof v401) {
            return Next.a(Collections.singleton(h401Var));
        }
        if (f501Var instanceof x401) {
            String str3 = ((x401) f501Var).a;
            return ((cce0Var instanceof gbe0) && str3.equals(o501Var.b)) ? Next.i(o501.a(o501Var, "", (cce0) null, 0, 5), Collections.singleton(new k401(str3))) : Next.j();
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static final Object y(ove1 ove1Var, Context context, cy5 cy5Var, jve1 jve1Var, opg opgVar, onm onmVar) throws Throwable {
        fj61 fj61Var;
        qz80 qz80Var;
        Context context2;
        qz80 qz80Var2;
        Context context3;
        cy5 cy5Var2;
        jve1 jve1Var2;
        cy5 cy5Var3;
        ove1 ove1Var2;
        cy5 cy5Var4;
        Context context4;
        qz80 qz80Var3;
        j3k j3kVar;
        j3k j3kVar2;
        j3k j3kVar3;
        cy5 cy5Var5;
        int i;
        Context context5 = context;
        cy5 cy5Var6 = cy5Var;
        if (onmVar instanceof fj61) {
            fj61Var = (fj61) onmVar;
            i = fj61Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                int i2 = i - Integer.MIN_VALUE;
                fj61Var.t = i2;
                qz80Var = i2;
            } else {
                fj61Var = new fj61(onmVar);
                qz80Var = i;
            }
        } else {
            fj61Var = new fj61(onmVar);
            qz80Var = i;
        }
        fj61 fj61Var2 = fj61Var;
        Object obj = fj61Var2.i;
        j3k j3kVar4 = fj61Var2.t;
        d9n d9nVar = d9n.a;
        try {
            if (j3kVar4 != 0) {
                try {
                    if (j3kVar4 == 1) {
                        j3k j3kVar5 = fj61Var2.h;
                        cy5 cy5Var7 = fj61Var2.g;
                        Context context6 = fj61Var2.f;
                        qz80 qz80Var4 = fj61Var2.e;
                        jve1 jve1Var3 = (jve1) fj61Var2.d;
                        cy5 cy5Var8 = (cy5) fj61Var2.c;
                        Context context7 = (Context) fj61Var2.b;
                        ove1 ove1Var3 = (ove1) fj61Var2.a;
                        hm5.M(obj);
                        context2 = context6;
                        qz80Var2 = qz80Var4;
                        context3 = context7;
                        cy5Var2 = cy5Var7;
                        jve1Var2 = jve1Var3;
                        cy5Var3 = cy5Var8;
                        ove1Var2 = ove1Var3;
                        j3kVar2 = j3kVar5;
                    } else {
                        if (j3kVar4 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3k j3kVar6 = (j3k) fj61Var2.d;
                        cy5Var4 = (p311) fj61Var2.c;
                        context4 = (faa0) fj61Var2.b;
                        qz80Var3 = (qz80) fj61Var2.a;
                        hm5.M(obj);
                        j3kVar = j3kVar6;
                    }
                    j3kVar.dispose();
                    qz80Var3.c();
                    context4.d((CancellationException) null);
                    cy5Var4.B();
                    return rih1.a;
                } catch (Throwable th) {
                    th = th;
                    j3kVar4.dispose();
                    qz80Var.c();
                    context5.d((CancellationException) null);
                    cy5Var6.B();
                    throw th;
                }
            }
            hm5.M(obj);
            qz80Var2 = new qz80(ove1Var);
            Context contextT = fn31.T(ove1Var, (o8n) null, 0, new yy11(2, (lnm) null, (byte) 2), 3);
            c9n c9nVar = ove1Var.a;
            cy5Var6.getClass();
            e421 e421Var = new e421();
            bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
            ej61 ej61Var = new ej61(ove1Var, cy5Var6, context5);
            opgVar.getClass();
            gaa0 gaa0VarF = op71.f();
            faa0 faa0VarA = c9nVar.J().A(fkj0.W0);
            if (faa0VarA != null) {
                faa0VarA.L(new h4s(gaa0VarF, (byte) 1));
            }
            cy5 p311Var = new p311(c9nVar.J().y(gaa0VarF).y(ej61Var));
            j3k h4kVar = new h4k(p311Var, new i06(e421Var));
            try {
                xd1 xd1Var = new xd1(h4kVar, cy5Var6, context5, p311Var, ove1Var, (lnm) null);
                j3kVar3 = h4kVar;
                cy5Var5 = p311Var;
                try {
                    fn31.T(ove1Var, qz80Var2, 0, xd1Var, 2);
                    context2 = contextT;
                    cy5Var3 = cy5Var;
                    try {
                        context3 = context;
                        ove1Var2 = ove1Var;
                        fn31.T(ove1Var2, (o8n) null, 0, new gj61(cy5Var5, cy5Var3, bpb1VarB, context, e421Var, ove1Var, jve1Var, (lnm) null), 3);
                        hj61 hj61Var = new hj61(2, (lnm) null, (byte) 0);
                        fj61Var2.a = ove1Var2;
                        fj61Var2.b = context3;
                        fj61Var2.c = cy5Var3;
                        jve1Var2 = jve1Var;
                        fj61Var2.d = jve1Var2;
                        fj61Var2.e = qz80Var2;
                        fj61Var2.f = context2;
                        fj61Var2.g = cy5Var5;
                        fj61Var2.h = j3kVar3;
                        fj61Var2.t = 1;
                        if (b5p1.j(bpb1VarB, hj61Var, fj61Var2) != d9nVar) {
                            cy5Var2 = cy5Var5;
                            j3kVar2 = j3kVar3;
                        }
                        return d9nVar;
                    } catch (Throwable th2) {
                        th = th2;
                        cy5Var6 = cy5Var5;
                        context5 = context2;
                        j3kVar4 = j3kVar3;
                        qz80Var = qz80Var2;
                        j3kVar4.dispose();
                        qz80Var.c();
                        context5.d((CancellationException) null);
                        cy5Var6.B();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    context2 = contextT;
                    cy5Var6 = cy5Var5;
                    context5 = context2;
                    j3kVar4 = j3kVar3;
                    qz80Var = qz80Var2;
                    j3kVar4.dispose();
                    qz80Var.c();
                    context5.d((CancellationException) null);
                    cy5Var6.B();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                j3kVar3 = h4kVar;
                cy5Var5 = p311Var;
            }
            ny51 ny51Var = new ny51(ove1Var2, jve1Var2, qz80Var2, (byte) 2);
            fj61Var2.a = qz80Var2;
            fj61Var2.b = context2;
            fj61Var2.c = cy5Var2;
            fj61Var2.d = j3kVar2;
            fj61Var2.e = null;
            fj61Var2.f = null;
            fj61Var2.g = null;
            fj61Var2.h = null;
            fj61Var2.t = 2;
            if (cy5Var3.f(context3, ny51Var, fj61Var2) != d9nVar) {
                cy5Var4 = cy5Var2;
                context4 = context2;
                qz80Var3 = qz80Var2;
                j3kVar = j3kVar2;
                j3kVar.dispose();
                qz80Var3.c();
                context4.d((CancellationException) null);
                cy5Var4.B();
                return rih1.a;
            }
            return d9nVar;
        } catch (Throwable th5) {
            th = th5;
            cy5Var6 = cy5Var2;
            context5 = context2;
            j3kVar4 = j3kVar2;
            qz80Var = qz80Var2;
            j3kVar4.dispose();
            qz80Var.c();
            context5.d((CancellationException) null);
            cy5Var6.B();
            throw th;
        }
    }

    public static final mxh z(CreativeAdMetadata creativeAdMetadata) {
        if (creativeAdMetadata.s()) {
            return new mxh(creativeAdMetadata.o().o(), creativeAdMetadata.o().p());
        }
        return null;
    }
}
