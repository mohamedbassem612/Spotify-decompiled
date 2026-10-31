package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Next;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeCreate;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class t0c {
    public static final ofv0 a = new ofv0(0.083333336f, 0.0f);
    public static final ofv0 b = new ofv0(0.025f, 4.0f);
    public static b180 c;
    public static b180 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    public static final void a(String str, qim0 qim0Var, int i, dlv dlvVar, long j, int i2, int i3, List list, lee1 lee1Var, b0k b0kVar, int i4) {
        long j2;
        int i5;
        int i6;
        List list2;
        int i7;
        int i8;
        long j3;
        List listM;
        int i9;
        ?? arrayList;
        int i10;
        hdn0 hdn0Var;
        List list3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1253112254);
        int i11 = i4 | (x340Var.g(str) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(dlvVar) ? 2048 : 1024) | 14360576 | (x340Var.i(lee1Var) ? 67108864 : 33554432);
        if (x340Var.Y(i11 & 1, (38347923 & i11) != 38347922)) {
            x340Var.d0();
            if ((i4 & 1) == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                i7 = i11 & (-57345);
                i8 = 40;
                j3 = cbx.a(x340Var).b.a;
                listM = p7h.M(new Float[]{Float.valueOf(0.0f), Float.valueOf(0.33f), Float.valueOf(0.66f)});
                i9 = 250;
            } else {
                x340Var.b0();
                j3 = j;
                i9 = i2;
                listM = list;
                i7 = i11 & (-57345);
                i8 = i3;
            }
            x340Var.s();
            boolean z = (i7 & 14) == 4;
            Object objT = x340Var.T();
            ?? r7 = objT;
            if (z || objT == m4cVar) {
                int iC = l1d.C(i);
                if (iC == 0) {
                    arrayList = new ArrayList(str.length());
                    for (int i12 = 0; i12 < str.length(); i12++) {
                        arrayList.add(String.valueOf(str.charAt(i12)));
                    }
                } else {
                    if (iC != 1) {
                        eg.o();
                        return;
                    }
                    arrayList = z561.k0(new sgg1(nhe1.U0, se11.b(new se11("\\S+|\\s+"), str)));
                }
                ?? r8 = arrayList;
                x340Var.s0((Object) r8);
                r7 = r8;
            }
            List list4 = (List) r7;
            int size = listM.size();
            boolean zG = x340Var.g(list4);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = bb00.h(-1, x340Var);
            }
            hdn0 hdn0Var2 = (hdn0) objT2;
            ven0 ven0VarS = v8r.s(Integer.valueOf(i8 >= 1 ? i8 : 1), x340Var);
            boolean zG2 = x340Var.g(list4) | x340Var.i(hdn0Var2) | x340Var.i(ven0VarS) | x340Var.e(size);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == m4cVar) {
                i10 = size;
                hdn0Var = hdn0Var2;
                objT3 = new z1v0(list4, i10, hdn0Var, ven0VarS, (lnm) null);
                list3 = list4;
                x340Var.s0(objT3);
            } else {
                i10 = size;
                list3 = list4;
                hdn0Var = hdn0Var2;
            }
            qxd0.s(list3, listM, (vu30) objT3, x340Var);
            k5p1.d(qim0Var, (c36) null, (g36) null, (pl3) null, 0, 0, apo.r(-2091400003, new d1f1(list3, listM, j3, lee1Var, i9, dlvVar, hdn0Var, i10), x340Var), x340Var, ((i7 >> 3) & 14) | 1572864, 62);
            i6 = i8;
            list2 = listM;
            j2 = j3;
            i5 = i9;
        } else {
            x340Var.b0();
            j2 = j;
            i5 = i2;
            i6 = i3;
            list2 = list;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e1f1(str, qim0Var, i, dlvVar, j2, i5, i6, list2, lee1Var, i4);
        }
    }

    public static final void b(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1299329212);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131960323);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new zqu0(strO0, (byte) 10);
                x340Var.s0(objT);
            }
            qim0 qim0VarN = anm1.N("premium-early-access-banner-tag", s161.b(qim0VarF, false, (iu30) objT));
            mgx mgxVar = mgx.e;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cwl1.b(qim0VarN, (tl3) null, d4o1.a, mgxVar, new zzq0(16.0f, 16.0f, 16.0f, 16.0f), (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, function0), (gbx) null, m9j.a, x340Var, 0, 48, 1506);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function0, qim0Var2, i, (byte) 20);
        }
    }

    public static final void c(vnr0 vnr0Var, String str, String str2, String str3, dzo1 dzo1Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        qim0 qim0Var2;
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1004943607);
        int i3 = i | (x340Var.i(vnr0Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.d(61.5f) ? 256 : 128) | (x340Var.d(0.58f) ? 2048 : 1024) | (x340Var.d(16.0f) ? 16384 : 8192) | (x340Var.g(str2) ? 131072 : 65536) | (x340Var.g(str3) ? 1048576 : 524288) | (x340Var.g(dzo1Var) ? 8388608 : 4194304) | 100663296 | (x340Var.i(function0) ? 536870912 : 268435456);
        if (x340Var.Y(i3 & 1, (i3 & 306783379) != 306783378)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            int iA = (int) (((crl1) x340Var.k(t4k.u)).a() & 4294967295L);
            boolean zE = ((i3 & 896) == 256) | x340Var.e(iA) | ((i3 & 7168) == 2048) | ((3670016 & i3) == 1048576) | ((29360128 & i3) == 8388608) | ((1879048192 & i3) == 536870912) | x340Var.i(idn0Var) | ((i3 & 112) == 32) | ((i3 & 14) == 4 || x340Var.i(vnr0Var)) | ((458752 & i3) == 131072) | ((i3 & 57344) == 16384);
            Object objT2 = x340Var.T();
            if (zE || objT2 == m4cVar) {
                i2 = 0;
                kt3 kt3Var = new kt3(iA, str2, str3, dzo1Var, function0, idn0Var, str, vnr0Var);
                x340Var.s0(kt3Var);
                objT2 = kt3Var;
            } else {
                i2 = 0;
            }
            qim0 qim0Var3 = nim0.a;
            ejo1.l(6, i2, x340Var, (vu30) objT2, qim0Var3);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ydi0(vnr0Var, str, str2, str3, dzo1Var, qim0Var2, function0, i, (byte) 13);
        }
    }

    public static final void d(int i, uvx uvxVar, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1564286441);
        if ((i2 & 6) == 0) {
            i3 = i2 | (b0kVar3.e(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? b0kVar3.g(uvxVar) : b0kVar3.i(uvxVar) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (b0kVar3.Y(i4 & 1, (i4 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("warning_message", qim0Var3), uvxVar, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, yrj.b, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(-936675291, new f13(i, (byte) 25), b0kVar3), b0kVar2, 805306432 | (i4 & 112), 196608, 32252);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2(i, uvxVar, qim0Var2, i2, (byte) 24);
        }
    }

    public static final void e(float f, int i, int i2, int i3, long j, Float f2, String str, b0k b0kVar, dlv dlvVar, lee1 lee1Var) {
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1345375794);
        int i4 = i3 | (b0kVar3.e(i) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.f(j) ? 256 : 128) | (b0kVar3.i(lee1Var) ? 2048 : 1024) | (b0kVar3.d(f) ? 16384 : 8192) | (b0kVar3.g(f2) ? 131072 : 65536) | (b0kVar3.e(i2) ? 1048576 : 524288) | (b0kVar3.i(dlvVar) ? 8388608 : 4194304);
        if (b0kVar3.Y(i4 & 1, (i4 & 4793491) != 4793490)) {
            boolean z = (i4 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = c97.b(f2 != null ? f2.floatValue() : 1.0f);
                b0kVar3.s0(objT);
            }
            o95 o95Var = (o95) objT;
            Integer numValueOf = Integer.valueOf(i);
            boolean zI = ((i4 & 458752) == 131072) | b0kVar3.i(o95Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new qc5(f2, o95Var, null, (byte) 1);
                b0kVar3.s0(objT2);
            }
            qxd0.t(numValueOf, b0kVar3, (vu30) objT2);
            Float fValueOf = Float.valueOf(f);
            boolean zI2 = b0kVar3.i(o95Var) | ((i4 & 57344) == 16384) | ((i4 & 3670016) == 1048576) | b0kVar3.i(dlvVar);
            Object objT3 = b0kVar3.T();
            if (zI2 || objT3 == m4cVar) {
                rc5 rc5Var = new rc5(o95Var, f, i2, dlvVar, null, (byte) 1);
                b0kVar3.s0(rc5Var);
                objT3 = rc5Var;
            }
            qxd0.t(fValueOf, b0kVar3, (vu30) objT3);
            b0kVar2 = b0kVar3;
            uwo1.e(str, (qim0) null, lee1Var, u7h.b(j, ((Number) o95Var.e()).floatValue(), 0.0f, 0.0f, 0.0f, 14), (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, (i4 >> 3) & 910, 0, 2034);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pc5(i, str, j, lee1Var, f, f2, i2, dlvVar, i3);
        }
    }

    public static final int f(s4b1 s4b1Var) {
        return u890.j(s4b1Var.n("source"), "qs") ? 2 : 1;
    }

    public static final MaybeCreate g(n8d0 n8d0Var) {
        return new MaybeCreate(new lmw(n8d0Var, (byte) 18));
    }

    public static final boolean h(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x0100, please report this as an issue */
    public static final Object i(String str, String str2, bfd bfdVar, cks0 cks0Var, kbd kbdVar, boolean z, onm onmVar) {
        i190 i190Var;
        String str3;
        cks0 cks0Var2;
        String str4;
        boolean z2;
        vd90 m231Var;
        Throwable thA;
        ud90 ud90Var;
        td90 td90Var;
        if (onmVar instanceof i190) {
            i190Var = (i190) onmVar;
            int i = i190Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                i190Var.g = i - Integer.MIN_VALUE;
            } else {
                i190Var = new i190(onmVar);
            }
        } else {
            i190Var = new i190(onmVar);
        }
        Object objI = i190Var.f;
        int i2 = i190Var.g;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            mr20 mr20VarB = kbdVar.b();
            i190Var.a = str;
            i190Var.b = str2;
            i190Var.c = bfdVar;
            i190Var.d = cks0Var;
            i190Var.e = z;
            i190Var.g = 1;
            objI = b5p1.i(mr20VarB, i190Var);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = i190Var.e;
            cks0Var2 = i190Var.d;
            str3 = i190Var.b;
            str4 = i190Var.a;
            try {
                hm5.M(objI);
                m231Var = (vd90) objI;
            } catch (Throwable th) {
                th = th;
                m231Var = new m231(th);
            }
            thA = e331.a(m231Var);
            if (thA == null) {
                op71.x(i190Var.getContext());
                cks0Var2.c(1);
                Logger.e(thA, "Failed to get chat from campfire invite's share id: " + str4, new Object[0]);
                return new cmb1(str3, true);
            }
            vd90 vd90Var = m231Var;
            ud90Var = vd90Var.a;
            if (ud90Var instanceof td90) {
                cks0Var2.a(17);
            } else {
                if (ud90Var instanceof sd90) {
                    cks0Var2.getClass();
                    eg.o();
                    return null;
                }
                cks0Var2.d(((sd90) ud90Var).a, z2);
            }
            td90Var = vd90Var.a;
            if (td90Var instanceof sd90) {
                if (z2) {
                    return emb1.a;
                }
                piz pizVar = ((sd90) td90Var).a;
                return (!u890.j(pizVar, iiz.a) || pizVar == null) ? new cmb1(str3, true) : new fmb1(str3, pizVar, true, false);
            }
            if (td90Var instanceof td90) {
                return new gmb1(str3, td90Var);
            }
            eg.o();
            return null;
        }
        z = i190Var.e;
        cks0Var = i190Var.d;
        bfdVar = i190Var.c;
        str2 = i190Var.b;
        str = i190Var.a;
        hm5.M(objI);
        if (!((Boolean) objI).booleanValue()) {
            cks0Var.c(4);
            return new fmb1(str2, jiz.a, true, false);
        }
        try {
            i190Var.a = str;
            i190Var.b = str2;
            i190Var.c = null;
            i190Var.d = cks0Var;
            i190Var.e = z;
            i190Var.g = 2;
            try {
                objI = bfdVar.b.u(str, i190Var);
                if (objI != d9nVar) {
                    str3 = str2;
                    cks0Var2 = cks0Var;
                    str4 = str;
                    z2 = z;
                    m231Var = (vd90) objI;
                    thA = e331.a(m231Var);
                    if (thA == null) {
                        op71.x(i190Var.getContext());
                        cks0Var2.c(1);
                        Logger.e(thA, "Failed to get chat from campfire invite's share id: " + str4, new Object[0]);
                        return new cmb1(str3, true);
                    }
                    vd90 vd90Var2 = m231Var;
                    ud90Var = vd90Var2.a;
                    if (ud90Var instanceof td90) {
                        cks0Var2.a(17);
                    } else {
                        if (ud90Var instanceof sd90) {
                            cks0Var2.getClass();
                            eg.o();
                            return null;
                        }
                        cks0Var2.d(((sd90) ud90Var).a, z2);
                    }
                    td90Var = vd90Var2.a;
                    if (td90Var instanceof sd90) {
                        if (z2) {
                            return emb1.a;
                        }
                        piz pizVar2 = ((sd90) td90Var).a;
                        if (u890.j(pizVar2, iiz.a)) {
                        }
                    }
                    if (td90Var instanceof td90) {
                        return new gmb1(str3, td90Var);
                    }
                    eg.o();
                    return null;
                }
                return d9nVar;
            } catch (Throwable th2) {
                th = th2;
                str3 = str2;
                cks0Var2 = cks0Var;
                str4 = str;
                z2 = z;
                m231Var = new m231(th);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:13:0x0030, B:39:0x00ae, B:41:0x00b8, B:43:0x00c3, B:45:0x00c7, B:47:0x00d1, B:49:0x00d4, B:51:0x00de, B:52:0x00e3), top: B:57:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c3 A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:13:0x0030, B:39:0x00ae, B:41:0x00b8, B:43:0x00c3, B:45:0x00c7, B:47:0x00d1, B:49:0x00d4, B:51:0x00de, B:52:0x00e3), top: B:57:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7 A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:13:0x0030, B:39:0x00ae, B:41:0x00b8, B:43:0x00c3, B:45:0x00c7, B:47:0x00d1, B:49:0x00d4, B:51:0x00de, B:52:0x00e3), top: B:57:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d1 A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:13:0x0030, B:39:0x00ae, B:41:0x00b8, B:43:0x00c3, B:45:0x00c7, B:47:0x00d1, B:49:0x00d4, B:51:0x00de, B:52:0x00e3), top: B:57:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4 A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:13:0x0030, B:39:0x00ae, B:41:0x00b8, B:43:0x00c3, B:45:0x00c7, B:47:0x00d1, B:49:0x00d4, B:51:0x00de, B:52:0x00e3), top: B:57:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00de A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:13:0x0030, B:39:0x00ae, B:41:0x00b8, B:43:0x00c3, B:45:0x00c7, B:47:0x00d1, B:49:0x00d4, B:51:0x00de, B:52:0x00e3), top: B:57:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object j(s4b1 s4b1Var, String str, bfd bfdVar, boolean z, cks0 cks0Var, kbd kbdVar, onm onmVar) throws NoWhenBranchMatchedException {
        j190 j190Var;
        String str2;
        cks0 cks0Var2;
        boolean z2;
        String str3;
        String queryParameter;
        rd90 rd90Var;
        if (onmVar instanceof j190) {
            j190Var = (j190) onmVar;
            int i = j190Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                j190Var.h = i - Integer.MIN_VALUE;
            } else {
                j190Var = new j190(onmVar);
            }
        } else {
            j190Var = new j190(onmVar);
        }
        Object objI = j190Var.g;
        int i2 = j190Var.h;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            mr20 mr20VarB = kbdVar.b();
            j190Var.a = s4b1Var;
            j190Var.b = str;
            j190Var.c = bfdVar;
            j190Var.d = cks0Var;
            j190Var.f = z;
            j190Var.h = 1;
            objI = b5p1.i(mr20VarB, j190Var);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = j190Var.f;
            str3 = j190Var.e;
            cks0Var2 = j190Var.d;
            str2 = j190Var.b;
            try {
                hm5.M(objI);
                rd90Var = (rd90) objI;
                if (u890.j(rd90Var, qd90.a)) {
                    cks0Var2.a(17);
                    return new vlb1(str3);
                }
                if (rd90Var instanceof pd90) {
                    throw new NoWhenBranchMatchedException();
                }
                cks0Var2.d(((pd90) rd90Var).a, z2);
                return z2 ? emb1.a : new fmb1(str2, ((pd90) rd90Var).a, false, true);
            } catch (Exception unused) {
                Logger.d("Error claiming chat invite link", new Object[0]);
                cks0Var2.c(1);
                return new cmb1(str2, false);
            }
        }
        z = j190Var.f;
        cks0Var = j190Var.d;
        bfdVar = j190Var.c;
        str = j190Var.b;
        s4b1Var = j190Var.a;
        hm5.M(objI);
        if (!((Boolean) objI).booleanValue()) {
            cks0Var.c(4);
            return new fmb1(str, jiz.a, false, true);
        }
        String strJ = s4b1Var.j();
        String str4 = "";
        if (strJ == null) {
            strJ = "";
        }
        Uri uri = s4b1Var.a;
        if (uri != null && (queryParameter = uri.getQueryParameter("pt")) != null) {
            str4 = queryParameter;
        }
        try {
            String strD = pcf.d(6, strJ, (String) null);
            j190Var.a = null;
            j190Var.b = str;
            j190Var.c = null;
            j190Var.d = cks0Var;
            j190Var.e = strJ;
            j190Var.f = z;
            j190Var.h = 2;
            objI = bfdVar.b.k(strD, str4, j190Var);
            if (objI != d9nVar) {
                z2 = z;
                cks0Var2 = cks0Var;
                str2 = str;
                str3 = strJ;
                rd90Var = (rd90) objI;
                if (u890.j(rd90Var, qd90.a)) {
                    cks0Var2.a(17);
                    return new vlb1(str3);
                }
                if (rd90Var instanceof pd90) {
                    throw new NoWhenBranchMatchedException();
                }
                cks0Var2.d(((pd90) rd90Var).a, z2);
                if (z2) {
                }
            }
            return d9nVar;
        } catch (Exception unused2) {
            str2 = str;
            cks0Var2 = cks0Var;
            Logger.d("Error claiming chat invite link", new Object[0]);
            cks0Var2.c(1);
            return new cmb1(str2, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(String str, String str2, bfd bfdVar, cks0 cks0Var, onm onmVar) {
        k190 k190Var;
        ymp0 m231Var;
        if (onmVar instanceof k190) {
            k190Var = (k190) onmVar;
            int i = k190Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                k190Var.e = i - Integer.MIN_VALUE;
            } else {
                k190Var = new k190(onmVar);
            }
        } else {
            k190Var = new k190(onmVar);
        }
        Object objY = k190Var.d;
        int i2 = k190Var.e;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                k190Var.a = str;
                k190Var.b = str2;
                k190Var.c = cks0Var;
                k190Var.e = 1;
                objY = bfdVar.b.y(str, k190Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cks0Var = k190Var.c;
                str2 = k190Var.b;
                str = k190Var.a;
                hm5.M(objY);
            }
            m231Var = (ymp0) objY;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            op71.x(k190Var.getContext());
            cks0Var.c(1);
            Logger.e(thA, "Failed to get chat from off platform's share id: " + str, new Object[0]);
            return new cmb1(str2, true);
        }
        ymp0 ymp0Var = m231Var;
        cks0Var.e(ymp0Var.a, str2);
        vmp0 vmp0Var = ymp0Var.a;
        if (vmp0Var instanceof vmp0) {
            piz pizVar = vmp0Var.a;
            return pizVar instanceof liz ? new anb1(str2, new zmb1(((liz) pizVar).a)) : new cmb1(str2, true);
        }
        if (vmp0Var instanceof wmp0) {
            return new bnb1(str2, (wmp0) vmp0Var);
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object l(String str, String str2, bfd bfdVar, cks0 cks0Var, onm onmVar) {
        l190 l190Var;
        cmb1 m231Var;
        String str3;
        if (onmVar instanceof l190) {
            l190Var = (l190) onmVar;
            int i = l190Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                l190Var.e = i - Integer.MIN_VALUE;
            } else {
                l190Var = new l190(onmVar);
            }
        } else {
            l190Var = new l190(onmVar);
        }
        Object objY = l190Var.d;
        int i2 = l190Var.e;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                l190Var.a = str;
                l190Var.b = str2;
                l190Var.c = cks0Var;
                l190Var.e = 1;
                objY = bfdVar.b.y(str, l190Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cks0Var = l190Var.c;
                str2 = l190Var.b;
                str = l190Var.a;
                hm5.M(objY);
            }
            wmp0 wmp0Var = ((ymp0) objY).a;
            cks0Var.e(wmp0Var, str2);
            if (wmp0Var instanceof vmp0) {
                m231Var = new cmb1(str2, true);
            } else {
                if (!(wmp0Var instanceof wmp0)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (wmp0Var.b.length() > 0) {
                    str3 = str2 + "&chatId=" + wmp0Var.b;
                } else {
                    str3 = str2;
                }
                m231Var = new bnb1(str3, wmp0Var);
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA == null) {
            return (pnb1) m231Var;
        }
        op71.x(l190Var.getContext());
        cks0Var.c(1);
        Logger.e(thA, "Failed to get chat from off platform's share id: " + str, new Object[0]);
        return new cmb1(str2, true);
    }

    public static int m(int i) {
        return Integer.hashCode(i);
    }

    public static h4l0 n() {
        r6h1 r6h1Var = r6h1.c;
        return new h4l0((byte) 17);
    }

    public static EnumSet o(long j) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(ai91.class);
        for (ai91 ai91Var : ai91.b) {
            if ((((long) ai91Var.a) & j) != 0) {
                enumSetNoneOf.add(ai91Var);
            }
        }
        return enumSetNoneOf;
    }

    public static boolean p(ye4 ye4Var) {
        return ye4Var.b();
    }

    public static boolean q(ye4 ye4Var) {
        return ye4Var.d();
    }

    public static boolean r(ye4 ye4Var) {
        return ye4Var.i();
    }

    public static final ArrayList s(ArrayList arrayList) {
        uxk uxkVar;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y681 y681Var = (z681) it.next();
            if (y681Var instanceof y681) {
                uxkVar = new uxk(new wxk(y681Var.a));
            } else {
                if (!(y681Var instanceof x681)) {
                    eg.o();
                    return null;
                }
                x681 x681Var = (x681) y681Var;
                uxkVar = new uxk(new vxk(x681Var.a, x681Var.d, x681Var.b, x681Var.c));
            }
            arrayList2.add(uxkVar);
        }
        return arrayList2;
    }

    public static String t(int i) {
        return gvg.e(i, "CompositingStrategy(value=", ")");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    public static Next u(kak0 kak0Var, b2k0 b2k0Var) {
        lhg1 lhg1Var;
        Float f;
        ruq0 ruq0Var;
        int i = kak0Var.e1;
        int i2 = kak0Var.d1;
        lhg1 lhg1Var2 = kak0Var.S0;
        if (!b2k0Var.a) {
            ruq0 ruq0Var2 = lhg1Var2.b;
            int i3 = kak0Var.Z0;
            return x1p1.t(x1p1.B(x1p1.C(x1p1.w(dzo1.l(x1p1.F(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(lhg1Var2, (q6w0) null, ruq0.a(ruq0.a(ruq0Var2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, i3, (Float) null, Float.valueOf(1.0f), (Integer) null, false, 0.0f, 0.0f, 0.0d, 0.0d, 494591), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, x1p1.e(ruq0Var2.i, i3, i2), x1p1.e(ruq0Var2.t, i3, i), 0, (Float) null, (Float) null, (Integer) null, false, 0.0f, 0.0f, 0.0d, 0.0d, 523519), false, false, 13), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, ruq0Var2.N0, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 1032191)), kak0Var), kak0Var)))), 3);
        }
        lhg1 lhg1Var3 = kak0Var.h;
        if (kak0Var.X == xx8.b) {
            ruq0 ruq0Var3 = lhg1Var3.b;
            if (!ruq0Var3.O0 || ruq0Var3.X <= 0) {
                lhg1Var = null;
            } else {
                lhg1Var = lhg1Var3;
            }
        } else {
            lhg1Var = null;
        }
        if (lhg1Var == null) {
            lhg1Var = kak0Var.s1;
        }
        if (lhg1Var != null) {
            lhg1Var3 = lhg1Var;
        }
        ruq0 ruq0Var4 = lhg1Var3.b;
        Integer num = ruq0Var4.N0;
        Float f2 = ruq0Var4.Z;
        int iIntValue = ruq0Var4.X;
        Integer num2 = kak0Var.u1;
        Integer num3 = num2 == null ? num : num2;
        Integer numValueOf = (num == null || num.intValue() <= 0) ? null : Integer.valueOf(iIntValue / num.intValue());
        if (num3 != null && numValueOf != null) {
            iIntValue = num3.intValue() * numValueOf.intValue();
        }
        int i4 = iIntValue;
        ruq0 ruq0Var5 = lhg1Var2.b;
        ruq0 ruq0VarA = ruq0.a(ruq0Var5, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, i4, ruq0Var4.Y, (lhg1Var == null && (f = kak0Var.P0) != null) ? f : f2, num3, ruq0Var4.O0, 0.0f, 0.0f, 0.0d, 0.0d, 492543);
        ruq0 ruq0Var6 = i2p1.o(kak0Var, ruq0VarA) ? ruq0VarA : null;
        if (ruq0Var6 == null) {
            ruq0 ruq0VarA2 = ruq0.a(ruq0VarA, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, ruq0Var4.X, (Float) null, (Float) null, num, false, 0.0f, 0.0f, 0.0d, 0.0d, 515071);
            ruq0 ruq0Var7 = i2p1.o(kak0Var, ruq0VarA2) ? ruq0VarA2 : null;
            if (ruq0Var7 == null) {
                return Next.j();
            }
            ruq0Var = ruq0Var7;
        } else {
            ruq0Var = ruq0Var6;
        }
        int i5 = ruq0Var.X;
        return x1p1.t(x1p1.B(x1p1.C(x1p1.w(dzo1.l(x1p1.E(x1p1.F(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(lhg1Var2, (q6w0) null, ruq0.a(ruq0Var, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, x1p1.e(ruq0Var5.i, i5, i2), x1p1.e(ruq0Var5.t, i5, i), 0, (Float) null, (Float) null, (Integer) null, false, 0.0f, 0.0f, 0.0d, 0.0d, 523519), false, false, 13), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 1048575)), kak0Var)), kak0Var)))), 3);
    }
}
