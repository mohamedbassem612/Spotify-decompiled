package p;

import android.graphics.Color;
import android.os.Build;
import com.spotify.fandomcollectibles.protos.ShareData;
import com.spotify.share.linkgeneration.api.proto.CustomData;
import com.spotify.share.linkgeneration.api.proto.UnshortenUrlResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class dio1 {
    public static final Object a = new Object();
    public static b180 b;

    public static final boolean A(hmb0 hmb0Var) {
        int iC = l1d.C(hmb0Var.f1.d);
        if (iC != 0) {
            if (iC != 1) {
                if (iC != 2) {
                    if (iC != 3) {
                        if (iC != 4) {
                            eg.o();
                            return false;
                        }
                        hmb0 hmb0VarV = hmb0Var.v();
                        if (hmb0VarV != null) {
                            return A(hmb0VarV);
                        }
                        hhg1.n("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final void B(rrb0 rrb0Var) {
        oap1.B(rrb0Var).l();
    }

    public static final a4g1 C(gj6 gj6Var, int i, tf6 tf6Var) {
        uf6 uf6Var = gj6Var.a;
        if (uf6Var == null) {
            return null;
        }
        String str = gj6Var.b;
        if (str == null) {
            str = "null";
        }
        return new a4g1(uf6Var, i, str, tf6Var);
    }

    public static final nlh1 D(UnshortenUrlResponse unshortenUrlResponse) {
        Integer numValueOf = Integer.valueOf(unshortenUrlResponse.q());
        String strP = unshortenUrlResponse.p();
        String strN = unshortenUrlResponse.n();
        h290<CustomData> h290VarQ = unshortenUrlResponse.o().q();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarQ, 10));
        for (CustomData customData : h290VarQ) {
            arrayList.add(new zpo(customData.getKey(), customData.getValue()));
        }
        return new nlh1(numValueOf, strP, strN, new llh1(arrayList, unshortenUrlResponse.o().getUri(), unshortenUrlResponse.o().u(), unshortenUrlResponse.o().r(), unshortenUrlResponse.o().t(), unshortenUrlResponse.o().getShareId(), unshortenUrlResponse.o().getId(), Integer.valueOf(unshortenUrlResponse.o().p()), unshortenUrlResponse.o().B(), unshortenUrlResponse.o().y(), unshortenUrlResponse.o().z(), unshortenUrlResponse.o().x(), unshortenUrlResponse.o().C(), unshortenUrlResponse.o().G(), unshortenUrlResponse.o().E(), unshortenUrlResponse.o().D(), unshortenUrlResponse.o().F(), unshortenUrlResponse.o().getUrl(), unshortenUrlResponse.o().w(), unshortenUrlResponse.o().n(), unshortenUrlResponse.o().v(), unshortenUrlResponse.o().o(), new nyp0(unshortenUrlResponse.o().A().q(), unshortenUrlResponse.o().A().p(), unshortenUrlResponse.o().A().o())));
    }

    public static final void E(zlb0 zlb0Var, iu30 iu30Var) {
        ndo0 ndo0Var;
        if (((pim0) zlb0Var).a.N0 && (ndo0Var = oap1.w(zlb0Var, 2).X0) != null) {
            ndo0Var.M1(iu30Var, true);
        }
    }

    public static final yw51 F(final jqd0 jqd0Var, final a9a a9aVar, yw51 yw51Var) {
        int i = a9aVar.c;
        int i2 = a9aVar.b;
        boolean z = jqd0Var.b;
        final int i3 = z ? i2 : i;
        y9e1 y9e1Var = (y9e1) a9aVar.e;
        int i4 = a9aVar.d;
        final znb0 znb0VarS = dm5.S(3, new u170(a9aVar, i3, (byte) 2));
        final int i5 = z ? i : i2;
        znb0 znb0VarS2 = dm5.S(3, new Function0() { // from class: p.hx51
            public final Object invoke() {
                a9a a9aVar2 = a9aVar;
                y9e1 y9e1Var2 = (y9e1) a9aVar2.e;
                int iIntValue = ((Number) znb0VarS.getValue()).intValue();
                jqd0 jqd0Var2 = jqd0Var;
                boolean z2 = jqd0Var2.b;
                boolean z3 = jqd0Var2.q() == 1;
                int i6 = i3;
                long jL = y9e1Var2.l(i6);
                zrm0 zrm0Var = y9e1Var2.b;
                int i7 = nbe1.c;
                int i8 = (int) (jL >> 32);
                int i9 = zrm0Var.f;
                if (zrm0Var.d(i8) != iIntValue) {
                    i8 = iIntValue >= i9 ? y9e1Var2.i(i9 - 1) : y9e1Var2.i(iIntValue);
                }
                int iC = (int) (jL & 4294967295L);
                if (zrm0Var.d(iC) != iIntValue) {
                    iC = iIntValue >= i9 ? zrm0Var.c(i9 - 1, false) : zrm0Var.c(iIntValue, false);
                }
                int i10 = i5;
                if (i8 == i10) {
                    return a9aVar2.c(iC);
                }
                if (iC == i10) {
                    return a9aVar2.c(i8);
                }
                if (!(z2 ^ z3) ? i6 >= i8 : i6 > iC) {
                    i8 = iC;
                }
                return a9aVar2.c(i8);
            }
        });
        if (1 != yw51Var.c) {
            return (yw51) znb0VarS2.getValue();
        }
        if (i3 == i4) {
            return yw51Var;
        }
        if (((Number) znb0VarS.getValue()).intValue() != y9e1Var.b.d(i4)) {
            return (yw51) znb0VarS2.getValue();
        }
        int i6 = yw51Var.b;
        long jL = y9e1Var.l(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                if (!((i2 >= i && i2 > i) ^ z)) {
                }
            }
            return a9aVar.c(i3);
        }
        int i7 = nbe1.c;
        return (i6 == ((int) (jL >> 32)) || i6 == ((int) (4294967295L & jL))) ? (yw51) znb0VarS2.getValue() : a9aVar.c(i3);
    }

    public static String G(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static final void a(t6e t6eVar, iu30 iu30Var, t9p t9pVar, d0r d0rVar, b0k b0kVar, int i) throws Throwable {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1765066452);
        int i2 = i | (x340Var.i(t6eVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(t9pVar) ? 256 : 128) | (x340Var.i(d0rVar) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, dug.f(i1p1.q(qim0VarF, er31.b(16.0f)), cbx.a(x340Var).a.a.a(), d4o1.a));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            d(t6eVar, iu30Var, t9pVar, d0rVar, x340Var, i2 & 8190);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y6e(t6eVar, iu30Var, t9pVar, d0rVar, i, (byte) 0);
        }
    }

    public static final void b(t6e t6eVar, iu30 iu30Var, t9p t9pVar, d0r d0rVar, gw70 gw70Var, b0k b0kVar, int i) {
        int i2;
        t6e t6eVar2;
        iu30 iu30Var2;
        t9p t9pVar2;
        d0r d0rVar2;
        gw70 gw70Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2141458340);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(t6eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(t9pVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(d0rVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(gw70Var) ? 16384 : 8192;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            t6eVar2 = t6eVar;
            iu30Var2 = iu30Var;
            t9pVar2 = t9pVar;
            d0rVar2 = d0rVar;
            gw70Var2 = gw70Var;
            x340Var.b0();
        } else {
            if (t6eVar.i.isEmpty()) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new z6e(t6eVar, iu30Var, t9pVar, d0rVar, gw70Var, i, (byte) 0);
                    return;
                }
                return;
            }
            t6eVar2 = t6eVar;
            iu30Var2 = iu30Var;
            t9pVar2 = t9pVar;
            d0rVar2 = d0rVar;
            gw70Var2 = gw70Var;
            mod.b(oi7.a.a(gw70Var2), apo.r(1107829860, new y6e(t6eVar2, iu30Var2, t9pVar2, d0rVar2), x340Var), x340Var, 56);
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            gw70 gw70Var3 = gw70Var2;
            d0r d0rVar3 = d0rVar2;
            h311VarV2.d = new z6e(t6eVar2, iu30Var2, t9pVar2, d0rVar3, gw70Var3, i, (byte) 1);
        }
    }

    public static final void c(List list, j6e j6eVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1732696314);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j6eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            boolean zI = x340Var.i(list) | x340Var.i(j6eVar) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new o0d(list, j6eVar, iu30Var, (byte) 4);
                x340Var.s0(objT);
            }
            too1.b(null, null, zzq0VarH, (iu30) objT, x340Var, 0, 3);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(list, j6eVar, iu30Var, i, (byte) 11);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void d(t6e t6eVar, iu30 iu30Var, t9p t9pVar, d0r d0rVar, b0k b0kVar, int i) throws Throwable {
        ?? r6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1789520778);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(t6eVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(t9pVar) ? 256 : 128) | (x340Var.i(d0rVar) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            int i3 = i2 & 14;
            g(t6eVar, iu30Var, x340Var, i2 & 126);
            List list = t6eVar.h;
            if (list.isEmpty()) {
                r6 = 0;
                x340Var.i0(578998018);
                x340Var.r(false);
            } else {
                v8i0.i(12.0f, 578864439, x340Var, x340Var, nim0Var);
                c(list, t6eVar.g, iu30Var, x340Var, (i2 << 3) & 896);
                r6 = 0;
                x340Var.r(false);
            }
            op71.g(x340Var, u291.h(nim0Var, 12.0f));
            if (t6eVar.e) {
                x340Var.i0(579085004);
                qim0 qim0VarH = l6o1.H(nim0Var, l6o1.C(r6, r6, 1, x340Var), r6, 14);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, (int) r6);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA2, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                int i4 = i2 >> 3;
                j(t6eVar, t9pVar, d0rVar, x340Var, (i4 & 896) | i3 | (i4 & 112));
                x340Var.r(true);
                x340Var.r(false);
            } else {
                x340Var.i0(579237152);
                int i5 = i2 >> 3;
                j(t6eVar, t9pVar, d0rVar, x340Var, (i5 & 896) | i3 | (i5 & 112));
                x340Var.r((boolean) r6);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y6e(t6eVar, iu30Var, t9pVar, d0rVar, i, (byte) 2);
        }
    }

    public static final void e(zzm zzmVar, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(945999965);
        int i2 = i | (x340Var.i(zzmVar) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var, 2131958287);
            String strN0 = cwl1.n0(2131958284, new Object[]{zzmVar.b}, x340Var);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            boolean zG = ((i2 & 896) == 256) | x340Var.g(strN0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new f0n(strN0, function1, (byte) 0);
                x340Var.s0(objT);
            }
            puo1.c(bin.x(s161.b(qim0VarF, true, (iu30) objT), false, strO0, new pm31(0), null, function0, 9), null, new n9d1(3, function1, cmx.c), false, apo.r(-1305694841, new h1m(zzmVar, (byte) 20), x340Var), x340Var, 24576, 10);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n7m(i, zzmVar, function0, function1, qim0Var2, (byte) 7);
        }
    }

    public static final void f(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1346953764);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.i0(780093939);
            j2iVar.invoke(x340Var, 6);
            x340Var.r(false);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new klb((byte) 4, i, j2iVar, qim0Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(t6e t6eVar, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        byte b2;
        x340 x340Var;
        boolean z;
        lee1 lee1Var;
        Object obj;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-625791385);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.i(t6eVar) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            int iC = l1d.C(t6eVar.d);
            if (iC == 0) {
                z = false;
                x340Var2.i0(-2058898917);
                lee1Var = cbx.d(x340Var2).h;
                x340Var2.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var2, -2058901173, false);
                }
                x340Var2.i0(-2058896905);
                lee1Var = cbx.d(x340Var2).e;
                z = false;
                x340Var2.r(false);
            }
            x340Var = x340Var2;
            boolean z3 = z;
            uwo1.e(t6eVar.a, new wnb0(1.0f, true), lee1Var, cbx.a(x340Var2).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            h6e h6eVar = t6eVar.b.a;
            if (h6eVar == null) {
                x340Var.i0(598933267);
                x340Var.r(z3);
            } else {
                x340Var.i0(598933268);
                boolean z4 = (x340Var.i(h6eVar) ? 1 : 0) | ((i2 & 112) == 32 ? true : z3 ? 1 : 0);
                Object objT = x340Var.T();
                if (z4 != 0 || objT == fkj0.X) {
                    obj = objT;
                    rqa rqaVar = new rqa(iu30Var, h6eVar, (byte) 25);
                    x340Var.s0(rqaVar);
                    obj = rqaVar;
                }
                obj = objT;
                foo1.c(new gbx(z50.c, (Function0) obj), ldx.c, null, null, yla.s(x340Var), uyn1.j(0.0f, 0.0f, 0.0f, 0.0f, 11), null, null, null, null, apo.r(-1830029435, new cka(h6eVar, (byte) 23), x340Var), x340Var, 0, 48, 1948);
                x340Var = x340Var;
                x340Var.r(z3);
            }
            x340Var.r(true);
            x340Var.r(true);
            b2 = z3;
        } else {
            b2 = 0;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a7e(t6eVar, iu30Var, i, b2);
        }
    }

    public static final void h(int i, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1953004069);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131959573);
            gpc1 gpc1Var = new gpc1(cwl1.U(2131820790, i, new Object[]{Integer.valueOf(i)}, x340Var));
            String strO1 = cwl1.o0(x340Var, 2131954937);
            boolean z = (i3 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new dgq0(iu30Var, (byte) 22);
                x340Var.s0(objT);
            }
            pdp1.e(strO0, strO1, gpc1Var, false, (Function0) objT, x340Var, 0, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ajh((byte) 1, i, i2, iu30Var);
        }
    }

    public static final void i(h4z0 h4z0Var, boolean z, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        String description;
        gbx gbxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(986780730);
        int i2 = i | (b0kVar3.g(h4z0Var) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(b0kVar3, 2131960744);
            if (h4z0Var instanceof g4z0) {
                description = x0d.k(b0kVar3, -1866171175, 2131960748, b0kVar3, false);
            } else {
                b0kVar3.i0(-1866088312);
                b0kVar3.r(false);
                description = h4z0Var.getDescription();
            }
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new cb8(h4z0Var, z, (byte) 17);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 12.0f, 16.0f, 12.0f);
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            cvx cvxVar5 = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(1, (pgx) null, 3, zzq0Var, (zzq0) null, new tvx(2.0f, 8.0f, 8.0f), (hw61) null, 0, (p3v) null, 466);
            jax haxVar = z ? jax.a : new hax(strO0);
            xu30 xu30VarR = null;
            if (z) {
                String text = h4z0Var.getText();
                if (ihc1.y0(text)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                gbxVar = new gbx(new y50(text), function0);
            } else {
                gbxVar = null;
            }
            if (description == null) {
                b0kVar3.i0(-1864772208);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1864772207);
                xu30VarR = apo.r(1486862950, new iww0(description, (byte) 1), b0kVar3);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarB, uvxVar, haxVar, false, null, null, gbxVar, null, null, null, null, xu30VarR, apo.r(917740257, new e4z0(h4z0Var, (byte) 0), b0kVar3), null, null, apo.r(-909317762, new e4z0(h4z0Var, (byte) 1), b0kVar3), b0kVar2, 64, 196992, 26552);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0((Object) h4z0Var, z, (Object) function0, i, (byte) 16);
        }
    }

    public static final void j(t6e t6eVar, t9p t9pVar, d0r d0rVar, b0k b0kVar, int i) throws Throwable {
        Throwable th;
        qim0 qim0VarU;
        Integer num = t6eVar.f;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1525013637);
        int i2 = (x340Var.i(t6eVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(t9pVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(d0rVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                u9p u9pVar = (u9p) t9pVar.a.c;
                ynb0 ynb0VarA = xqu.a(u9pVar.S);
                ynb0 ynb0VarA2 = xqu.a(u9pVar.J);
                iac0 iac0VarO = u9pVar.o();
                i1o i1oVar = (i1o) u9pVar.C;
                yh2 yh2Var = (yh2) i1oVar.u.get();
                c8o.l(yh2Var);
                vb2 vb2Var = (vb2) i1oVar.b1.get();
                c8o.l(vb2Var);
                qns0 qns0Var = (qns0) i1oVar.a1.get();
                c8o.l(qns0Var);
                zr00 zr00Var = (zr00) i1oVar.e1.get();
                c8o.l(zr00Var);
                y390 y390Var = (y390) i1oVar.v0.get();
                c8o.l(y390Var);
                objT = new san0(ynb0VarA, ynb0VarA2, new ytp0(yh2Var, zr00Var, y390Var.a(iac0VarO, r6h1.c), qns0Var, vb2Var, (byte) 11), d0rVar);
                x340Var.s0(objT);
            }
            san0 san0Var = (san0) objT;
            List listD1 = t6eVar.i;
            if (num != null) {
                listD1 = o7h.d1(listD1, num.intValue());
            }
            wat watVar = (wat) x340Var.k(t4k.h);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(num != null ? new p3v(65.0f * num.intValue()) : null);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            p3v p3vVar = (p3v) ven0Var.getValue();
            qim0 qim0Var = nim0.a;
            if (p3vVar == null) {
                x340Var.i0(483447912);
                x340Var.r(false);
                th = null;
                qim0VarU = null;
            } else {
                th = null;
                x340Var.i0(483447913);
                float f = p3vVar.a;
                qim0 qim0VarJ = u291.j(f, 0.0f, 2, qim0Var);
                boolean zI = x340Var.i(watVar) | x340Var.d(f) | x340Var.i(ven0Var);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new ja5(watVar, f, ven0Var, (byte) 2);
                    x340Var.s0(objT3);
                }
                qim0VarU = lrn1.u(qim0VarJ, (iu30) objT3);
                x340Var.r(false);
            }
            if (qim0VarU != null) {
                qim0Var = qim0VarU;
            }
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw th;
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
            x340Var.i0(968992987);
            int i3 = 0;
            for (Object obj : listD1) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw th;
                }
                String str = (String) obj;
                boolean zE = x340Var.e(i3);
                Object objT4 = x340Var.T();
                if (zE || objT4 == m4cVar) {
                    objT4 = new uv4(i3, (byte) 8);
                    x340Var.s0(objT4);
                }
                dgo1.c(str, (iu30) objT4, apo.r(-1844623517, new swc((Object) san0Var, (Object) str, (Object) d0rVar, (byte) 3), x340Var), x340Var, 384);
                i3 = i4;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c7e(t6eVar, t9pVar, d0rVar, i, (byte) 0);
        }
    }

    public static final hec k(String str, String str2, String str3, String str4, f8c1 f8c1Var) {
        bpb1 bpb1VarB = gio1.b(Boolean.TRUE);
        fec fecVar = new fec(Integer.valueOf(Color.parseColor(str2)), str, Integer.valueOf(Color.parseColor(str3)));
        fec fecVar2 = new fec(Integer.valueOf(Color.parseColor(str2)), str, Integer.valueOf(Color.parseColor(str3)));
        mwm1 mwm1Var = f8c1Var.j;
        Boolean bool = Boolean.FALSE;
        bpb1 bpb1VarB2 = gio1.b(bool);
        ssm1 ssm1VarQ = YourLibraryContainsRequest.q();
        ssm1VarQ.n(Collections.singletonList(str4));
        return new hec(fecVar, fecVar2, new x010(bpb1VarB, new x010(bpb1VarB2, yoi1.g(mwm1Var.a(ssm1VarQ.build()).map(u3x0.R0).onErrorReturnItem(bool).toObservable()), new a82(3, (lnm) null, (byte) 8), (byte) 1), new irp0(3, (lnm) null, (byte) 19), (byte) 1), new yt91(f8c1Var, str4, bpb1VarB, (byte) 26));
    }

    public static final void l(ina1 ina1Var) {
        int i = ina1Var.d;
        int[] iArr = ina1Var.b;
        Object[] objArr = ina1Var.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        ina1Var.a = false;
        ina1Var.d = i2;
    }

    public static final boolean m(f8c1 f8c1Var) {
        return f8c1Var.i.a;
    }

    public static final ax51 n(jqd0 jqd0Var, r0c r0cVar) {
        int iQ = jqd0Var.q();
        a9a a9aVar = (a9a) jqd0Var.d;
        boolean z = iQ == 1;
        return new ax51(o(a9aVar, z, true, r0cVar), o(a9aVar, z, false, r0cVar), z);
    }

    public static final yw51 o(a9a a9aVar, boolean z, boolean z2, r0c r0cVar) {
        long j;
        long jA = r0cVar.a(z2 ? a9aVar.b : a9aVar.c, a9aVar);
        if (z ^ z2) {
            int i = nbe1.c;
            j = jA >> 32;
        } else {
            int i2 = nbe1.c;
            j = 4294967295L & jA;
        }
        return a9aVar.c((int) j);
    }

    public static final mmr0 p(ShareData shareData, String str, String str2) {
        if (shareData == null) {
            return new mmr0(gy61.a, dy61.a);
        }
        return new mmr0(hy61.a, new ey61(new xot(str, str2, (byte) 7)));
    }

    public static final yw51 q(yw51 yw51Var, a9a a9aVar, int i) {
        return new yw51(((y9e1) a9aVar.e).a(i), yw51Var.c, i);
    }

    public static final Object r(ina1 ina1Var, int i) {
        Object obj;
        int iJ = mp10.j(ina1Var.d, i, ina1Var.b);
        if (iJ < 0 || (obj = ina1Var.c[iJ]) == a) {
            return null;
        }
        return obj;
    }

    public static vzh s() {
        v560 v560Var = new v560((byte) 0);
        hzh hzhVarA = vzh.a(v560.class);
        hzhVarA.e = true;
        hzhVarA.f = new bzh(v560Var);
        return hzhVarA.b();
    }

    public static final ax51 t(ax51 ax51Var, jqd0 jqd0Var) {
        a9a a9aVar = (a9a) jqd0Var.d;
        if (ax51Var != null) {
            yw51 yw51Var = ax51Var.a;
            long j = yw51Var.c;
            yw51 yw51Var2 = ax51Var.b;
            if (j != yw51Var2.c) {
                boolean z = ax51Var.c;
                if ((z ? yw51Var : yw51Var2).b != 0) {
                    return ax51Var;
                }
                if (z) {
                    yw51Var = yw51Var2;
                }
                if (((y9e1) a9aVar.e).a.a.b.length() != yw51Var.b) {
                    return ax51Var;
                }
            } else if (yw51Var.b != yw51Var2.b) {
                return ax51Var;
            }
        }
        ax51 ax51Var2 = (ax51) jqd0Var.c;
        String str = ((y9e1) a9aVar.e).a.a.b;
        if (ax51Var2 == null || str.length() == 0) {
            return ax51Var;
        }
        boolean z2 = jqd0Var.b;
        String str2 = ((y9e1) a9aVar.e).a.a.b;
        int i = a9aVar.b;
        int length = str2.length();
        if (i == 0) {
            int iU = mmo1.u(0, str2);
            return z2 ? ax51.a(ax51Var, q(ax51Var.a, a9aVar, iU), null, true, 2) : ax51.a(ax51Var, null, q(ax51Var.b, a9aVar, iU), false, 1);
        }
        if (i == length) {
            int iV = mmo1.v(length, str2);
            return z2 ? ax51.a(ax51Var, q(ax51Var.a, a9aVar, iV), null, false, 2) : ax51.a(ax51Var, null, q(ax51Var.b, a9aVar, iV), true, 1);
        }
        boolean z3 = ax51Var2.c;
        int iV2 = z2 ^ z3 ? mmo1.v(i, str2) : mmo1.u(i, str2);
        return z2 ? ax51.a(ax51Var, q(ax51Var.a, a9aVar, iV2), null, z3, 2) : ax51.a(ax51Var, null, q(ax51Var.b, a9aVar, iV2), z3, 1);
    }

    public static final ArrayList u(p890 p890Var) {
        hmb0 hmb0VarZ0 = ((x5f0) p890Var).z0();
        boolean zA = A(hmb0VarZ0);
        afn0 afn0VarP = hmb0VarZ0.p();
        afn0 afn0Var = afn0VarP;
        ArrayList arrayList = new ArrayList(afn0Var.a.c);
        int size = afn0VarP.size();
        for (int i = 0; i < size; i++) {
            hmb0 hmb0Var = (hmb0) afn0Var.get(i);
            arrayList.add(zA ? hmb0Var.m() : hmb0Var.n());
        }
        return arrayList;
    }

    public static Set v() {
        return Build.VERSION.SDK_INT >= 34 ? zho1.F() : zho1.F();
    }

    public static final void x(zlb0 zlb0Var) {
        oap1.w(zlb0Var, 2).u1();
    }

    public static final void y(zlb0 zlb0Var) {
        oap1.B(zlb0Var).F();
    }

    public static final void z(zlb0 zlb0Var) {
        oap1.B(zlb0Var).V(false);
    }

    public wnw0 w() {
        return wnw0.c;
    }
}
