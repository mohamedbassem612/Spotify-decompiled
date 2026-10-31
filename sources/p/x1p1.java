package p;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.OnClickDelegateImpl;
import com.spotify.betamax.contextplayercoordinatorimpl.model.VideoPlayerCommand;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class x1p1 {
    public static b180 a;
    public static b180 b;

    public static Next A(dk9 dk9Var, uj9 uj9Var, yqg yqgVar) {
        Object next;
        Object next2;
        di9 di9Var;
        ArrayList arrayList;
        Object next3;
        Map map = dk9Var.e;
        Set set = dk9Var.d;
        be9 ek9Var = null;
        if (uj9Var instanceof pj9) {
            be9 be9Var = ((pj9) uj9Var).a;
            ek9Var = ((Collection) be9Var).isEmpty() ? null : be9Var;
            if (ek9Var == null) {
                return Next.j();
            }
            Set setO1 = o7h.o1(set);
            Collection<?> collection = (Collection) ek9Var;
            if (setO1.containsAll(collection)) {
                return Next.j();
            }
            setO1.addAll(collection);
            dk9 dk9VarA = dk9.a(dk9Var, false, false, false, setO1, (Map) null, 55);
            return Next.i(dk9VarA, Effects.a(new bj9[]{o(dk9VarA), new wi9(dk9VarA.d)}));
        }
        if (uj9Var instanceof sj9) {
            be9 be9Var2 = ((sj9) uj9Var).a;
            ek9Var = ((Collection) be9Var2).isEmpty() ? null : be9Var2;
            if (ek9Var == null) {
                return Next.j();
            }
            Set setO2 = o7h.o1(set);
            Iterable iterable = (Iterable) ek9Var;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (setO2.contains((ee9) it.next())) {
                        setO2.removeAll((Collection) ek9Var);
                        dk9 dk9VarA2 = dk9.a(dk9Var, false, false, false, setO2, (Map) null, 55);
                        return Next.i(dk9VarA2, Effects.a(new bj9[]{o(dk9VarA2), new wi9(dk9VarA2.d)}));
                    }
                }
            }
            return Next.j();
        }
        if (uj9Var instanceof hj9) {
            hj9 hj9Var = (hj9) uj9Var;
            dk9 dk9VarA3 = dk9.a(dk9Var, false, hj9Var.a, hj9Var.b, (Set) null, (Map) null, 57);
            return Next.i(dk9VarA3, Effects.a(new zi9[]{o(dk9VarA3)}));
        }
        if (uj9Var instanceof qj9) {
            dk9 dk9VarA4 = dk9.a(dk9Var, true, false, false, (Set) null, (Map) null, 62);
            return Next.i(dk9VarA4, Effects.a(new xi9[]{new xi9(dk9VarA4.a)}));
        }
        if (uj9Var instanceof rj9) {
            dk9 dk9VarA5 = dk9.a(dk9Var, false, false, false, (Set) null, (Map) null, 62);
            return Next.i(dk9VarA5, Effects.a(new xi9[]{new xi9(dk9VarA5.a)}));
        }
        if (uj9Var instanceof nj9) {
            ve9 ve9Var = ((nj9) uj9Var).a;
            String str = ve9Var.a;
            Set<UUID> set2 = ve9Var.d;
            ue9 ue9Var = ve9Var.b;
            int iOrdinal = ue9Var.b.ordinal();
            if (iOrdinal == 0) {
                di9Var = di9.d;
            } else if (iOrdinal == 1) {
                di9Var = di9.a;
            } else if (iOrdinal == 2) {
                di9Var = di9.b;
            } else {
                if (iOrdinal != 3) {
                    eg.o();
                    return null;
                }
                di9Var = di9.c;
            }
            di9 di9Var2 = di9Var;
            fi9 fi9Var = ve9Var.c;
            if (dk9Var.f) {
                arrayList = new ArrayList();
                for (UUID uuid : set2) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : set) {
                        if (u890.j(((ee9) obj).getUuid(), uuid)) {
                            arrayList2.add(obj);
                        }
                    }
                    r7h.W(arrayList2, arrayList);
                }
            } else {
                arrayList = new ArrayList();
                for (UUID uuid2 : set2) {
                    Iterator it2 = set.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it2.next();
                    } while (!u890.j(((ee9) next3).getUuid(), uuid2));
                    ee9 ee9Var = (ee9) next3;
                    if (ee9Var != null) {
                        arrayList.add(ee9Var);
                    }
                }
            }
            ArrayList arrayList3 = arrayList;
            return arrayList3.isEmpty() ? Next.j() : Next.i(dk9.a(dk9Var, false, false, false, (Set) null, sqg0.P(map, new mmr0(str, set2)), 47), Effects.a(new ui9[]{new ui9(new re9(str, new ei9(ue9Var.c, di9Var2), fi9Var, o7h.p1(arrayList3)))}));
        }
        if (uj9Var instanceof oj9) {
            oj9 oj9Var = (oj9) uj9Var;
            return Next.a(Effects.a(new yi9[]{new yi9(oj9Var.a, oj9Var.b)}));
        }
        if (uj9Var instanceof jj9) {
            jj9 jj9Var = (jj9) uj9Var;
            Iterator it3 = set.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!u890.j(((ee9) next2).getUuid(), jj9Var.b));
            ee9 ee9Var2 = (ee9) next2;
            if (ee9Var2 != null) {
                ek9Var = ee9Var2 instanceof be9 ? (be9) ee9Var2 : null;
                if (ek9Var != null) {
                    return Next.a(Effects.a(new qi9[]{new qi9(jj9Var.a, ek9Var, jj9Var.c)}));
                }
            }
            return Next.j();
        }
        if (uj9Var instanceof ij9) {
            ij9 ij9Var = (ij9) uj9Var;
            Iterator it4 = set.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!u890.j(((ee9) next).getUuid(), ij9Var.b));
            be9 be9Var3 = (ee9) next;
            if (be9Var3 != null) {
                ek9Var = be9Var3 instanceof be9 ? be9Var3 : null;
                if (ek9Var != null) {
                    return Next.a(Effects.a(new pi9[]{new pi9(ij9Var.a, ek9Var, ij9Var.c, ij9Var.d)}));
                }
            }
            return Next.j();
        }
        if (!(uj9Var instanceof tj9)) {
            if (uj9Var instanceof mj9) {
                mj9 mj9Var = (mj9) uj9Var;
                UUID uuid3 = mj9Var.b;
                return !s(dk9Var, uuid3) ? Next.j() : Next.a(Effects.a(new bj9[]{new ti9(mj9Var.a, uuid3), new vi9(yqgVar.b())}));
            }
            if (uj9Var instanceof lj9) {
                lj9 lj9Var = (lj9) uj9Var;
                UUID uuid4 = lj9Var.b;
                return !s(dk9Var, uuid4) ? Next.j() : Next.a(Effects.a(new si9[]{new si9(lj9Var.a, uuid4)}));
            }
            if (!(uj9Var instanceof kj9)) {
                eg.o();
                return null;
            }
            kj9 kj9Var = (kj9) uj9Var;
            UUID uuid5 = kj9Var.b;
            return !s(dk9Var, uuid5) ? Next.j() : Next.a(Effects.a(new ri9[]{new ri9(kj9Var.a, uuid5, kj9Var.c, kj9Var.d)}));
        }
        tj9 tj9Var = (tj9) uj9Var;
        ce9 ce9Var = tj9Var.b;
        byte[] bArr = tj9Var.c;
        String str2 = tj9Var.a;
        if (!(ce9Var instanceof ce9)) {
            if (u890.j(ce9Var.getUuid(), pe9.g)) {
                n57.e("BLE unified write bypassed typed scanner path; byteCount=" + bArr.length + "; value=" + new String(bArr, nne.a));
            }
            return Next.a(Effects.a(new aj9[]{new aj9(str2, ce9Var, bArr)}));
        }
        cih1 cih1Var = ce9Var.a;
        w7x w7xVar = (Set) map.get(str2);
        if (w7xVar == null) {
            w7xVar = w7x.a;
        }
        UUID uuid6 = pe9.g;
        if (w7xVar.contains(uuid6)) {
            ek9Var = new ek9(uuid6, cih1Var, f46.x0(cih1Var.a.concat(":").getBytes(nne.a), bArr));
        } else {
            UUID uuidA = cih1Var.a();
            if (uuidA != null && w7xVar.contains(uuidA)) {
                ek9Var = new ek9(uuidA, null, bArr);
            }
        }
        if (ek9Var == null) {
            return Next.j();
        }
        cih1 cih1Var2 = ek9Var.b;
        return Next.a(Effects.a(new aj9[]{new aj9(str2, cih1Var2 != null ? new ce9(cih1Var2) : new de9(ek9Var.a), ek9Var.c)}));
    }

    public static final Next B(Next next) {
        kak0 kak0Var = (kak0) l(next);
        if (kak0Var != null) {
            if (!u890.j(kak0Var.W0, k8w0.a)) {
                kak0Var = null;
            }
            kak0 kak0Var2 = kak0Var;
            if (kak0Var2 != null) {
                return Next.i(kak0.a(kak0Var2, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, kak0Var2.S0, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -131073, 1048575), next.b());
            }
        }
        return next;
    }

    public static final Next C(Next next) {
        kak0 kak0Var = (kak0) l(next);
        if (kak0Var == null) {
            return next;
        }
        return Next.i(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(kak0Var.S0, (q6w0) null, (ruq0) null, !u890.j(kak0Var.S0.b, kak0Var.h.b), false, 11), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 1048575), next.b());
    }

    public static final Next D(Next next) {
        kak0 kak0Var = (kak0) l(next);
        if (kak0Var != null) {
            if (!u890.j(kak0Var.W0, j8w0.a)) {
                kak0Var = null;
            }
            kak0 kak0Var2 = kak0Var;
            if (kak0Var2 != null) {
                return Next.i(kak0.a(kak0Var2, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(kak0Var2.S0, (q6w0) null, (ruq0) null, false, false, 7), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 1048575), next.b());
            }
        }
        return next;
    }

    public static final Next E(Next next) {
        kak0 kak0Var = (kak0) l(next);
        if (kak0Var == null) {
            return next;
        }
        Float f = kak0Var.k1;
        Float f2 = kak0Var.j1;
        lhg1 lhg1VarT = t9p1.t(kak0Var.S0, f2, f);
        lhg1 lhg1Var = kak0Var.Q0;
        return Next.i(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, lhg1Var != null ? t9p1.t(lhg1Var, f2, f) : null, (lhg1) null, lhg1VarT, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -327681, 1048575), next.b());
    }

    public static final Next F(Next next, kak0 kak0Var) {
        Float fValueOf;
        ruq0 ruq0Var;
        kak0 kak0Var2 = (kak0) l(next);
        if (kak0Var2 != null) {
            lhg1 lhg1Var = kak0Var2.S0;
            if (!u890.j(lhg1Var, kak0Var.S0)) {
                ruq0 ruq0Var2 = lhg1Var.b;
                boolean z = ruq0Var2.O0;
                Float f = ruq0Var2.Z;
                if (z) {
                    lhg1 lhg1Var2 = kak0Var2.s1;
                    if (lhg1Var2 == null || (ruq0Var = lhg1Var2.b) == null || (fValueOf = ruq0Var.Z) == null) {
                        fValueOf = kak0Var2.P0;
                    }
                    if (fValueOf == null) {
                        fValueOf = f;
                    }
                } else {
                    fValueOf = Float.valueOf(1.0f);
                }
                if (!u890.i(fValueOf, f)) {
                    return C(Next.i(kak0.a(kak0Var2, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(lhg1Var, (q6w0) null, ruq0.a(ruq0Var2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (Float) null, fValueOf, (Integer) null, false, 0.0f, 0.0f, 0.0d, 0.0d, 520191), false, false, 13), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 1048575), next.b()));
                }
            }
        }
        return next;
    }

    public static final void a(jmd0 jmd0Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1611408707);
        int i2 = (b0kVar3.g(jmd0Var) ? 4 : 2) | i | 48;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            boolean zI = b0kVar3.i(jmd0Var);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                objT = new imd0(jmd0Var, (byte) 0);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, false, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarB);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar3).b.b;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            qgo1.f(jmd0Var.a.g((djc0) null, b0kVar3, 1), uyn1.B(qim0Var2, 16.0f, f, 16.0f, 0.0f, 8), null, 0, false, null, b0kVar2, 8, 60);
            qim0 qim0VarD = eqr0.D(0.0f, -8.0f, 1, u291.f(u291.k(qim0Var2, dsa0.m(b0kVar2, 2131167184)), 1.0f));
            boolean zI2 = b0kVar2.i(jmd0Var);
            Object objT2 = b0kVar2.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new imd0(jmd0Var, (byte) 1);
                b0kVar2.s0(objT2);
            }
            dm5.a((iu30) objT2, qim0VarD, (iu30) null, b0kVar2, 0, 4);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vx90(jmd0Var, qim0Var2, i, (byte) 28);
        }
    }

    public static final void b(boolean z, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, j2i j2iVar4, j2i j2iVar5, j2i j2iVar6, b0k b0kVar, int i) {
        j2i j2iVar7;
        j2i j2iVar8;
        j2i j2iVar9;
        j2i j2iVar10;
        j2i j2iVar11;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1255100659);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.h(z) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarN = anm1.N("playbackArea", too1.y(qim0VarF, new bgc0(lhc.g(x340Var).e, 32)));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            if (z) {
                x340Var.i0(-577355570);
                j2iVar7 = j2iVar;
                j2iVar7.invoke(x340Var, 6);
                x340Var.r(false);
            } else {
                j2iVar7 = j2iVar;
                x340Var.i0(-577333467);
                x340Var.r(false);
            }
            j2iVar2.invoke(x340Var, 6);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = u291.f(uyn1.B(nim0Var, cbx.b(x340Var).b.a, 0.0f, cbx.b(x340Var).b.a, cbx.b(x340Var).b.c, 2), 1.0f);
            jw31 jw31VarA = ew31.a(new d36(cbx.b(x340Var).b.b, true, new g21(een.Q0, (byte) 29)), een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (z) {
                z2 = false;
                x340Var.i0(-1476066455);
                x340Var.r(false);
            } else {
                x340Var.i0(-1476163516);
                zov0 zov0Var = cbx.b(x340Var).g;
                z2 = false;
                ywx0.n(nim0Var, 40.0f, x340Var, false);
            }
            j2iVar8 = j2iVar3;
            j2iVar8.invoke(x340Var, 6);
            j2iVar9 = j2iVar4;
            j2iVar9.invoke(x340Var, 6);
            j2iVar10 = j2iVar5;
            j2iVar10.invoke(x340Var, 6);
            if (z) {
                j2iVar11 = j2iVar6;
                x340Var.i0(-1475944439);
                x340Var.r(z2);
            } else {
                x340Var.i0(-1475974230);
                j2iVar11 = j2iVar6;
                j2iVar11.invoke(x340Var, 6);
                x340Var.r(z2);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            j2iVar7 = j2iVar;
            j2iVar8 = j2iVar3;
            j2iVar9 = j2iVar4;
            j2iVar10 = j2iVar5;
            j2iVar11 = j2iVar6;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uu(z, j2iVar7, j2iVar2, j2iVar8, j2iVar9, j2iVar10, j2iVar11, i);
        }
    }

    public static final void c(ug71 ug71Var, zg71 zg71Var, c380 c380Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-194671803);
        int i2 = i | (x340Var.g(ug71Var) ? 4 : 2) | (x340Var.g(zg71Var) ? 32 : 16) | (x340Var.g(c380Var) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | (x340Var.g(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            u5j1 u5j1Var = d4o1.a;
            nim0 nim0Var = nim0.a;
            f2p1.k(ug71Var, zg71Var, c380Var, anm1.N("share_sheet_slots", u291.z(u291.f(dug.f(nim0Var, jA, u5j1Var), 1.0f), (fra) null, 3)), x340Var, i2 & 1022);
            Integer num = zg71Var.c;
            h2c h2cVar = h2c.a;
            if (num == null) {
                x340Var.i0(-772964537);
                x340Var.r(false);
            } else {
                x340Var.i0(-772964536);
                String strO0 = cwl1.o0(x340Var, num.intValue());
                if (ihc1.y0(strO0)) {
                    x340Var.i0(-1387817011);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1388065910);
                    qim0 qim0VarN = anm1.N("share_sheet_snackbar", h2cVar.a(u291.B(nim0Var, (gra) null, 3), een.X));
                    boolean z = (i2 & 7168) == 2048;
                    Object objT = x340Var.T();
                    if (z || objT == m4cVar) {
                        objT = new pt61(function0, (byte) 10);
                        x340Var.s0(objT);
                    }
                    j2p1.n(0, strO0, (Function0) objT, x340Var, qim0VarN);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
            if (zg71Var.d instanceof qe71) {
                x340Var.i0(-772570154);
                qim0 qim0VarB = h2cVar.b(nim0Var);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = da71.h;
                    x340Var.s0(objT2);
                }
                t1c.a(anm1.N("share_sheet_loading", bin.x(qim0VarB, false, null, null, null, (Function0) objT2, 14)), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-772434653);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0(ug71Var, zg71Var, c380Var, function0, qim0Var, i, (byte) 14);
        }
    }

    public static Action d(kwc kwcVar, hvc hvcVar, CarColor carColor, boolean z, Function0 function0, int i) {
        if ((i & 1) != 0) {
            kwcVar = null;
        }
        if ((i & 2) != 0) {
            hvcVar = null;
        }
        if ((i & 4) != 0) {
            carColor = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        ty tyVar = new ty();
        if (hvcVar != null) {
            CarIcon carIconR = lnn1.r(hvcVar);
            yo31.f.j(carIconR);
            tyVar.c = carIconR;
        }
        if (carColor != null) {
            qpd.b.a(carColor);
            tyVar.e = carColor;
        }
        if (kwcVar != null) {
            CharSequence charSequenceB = hon1.B(kwcVar);
            Objects.requireNonNull(charSequenceB);
            tyVar.b = CarText.create(charSequenceB);
        }
        if (z) {
            tyVar.g |= 1;
        }
        tyVar.d = OnClickDelegateImpl.create(new ck90(function0, (byte) 1));
        return tyVar.a();
    }

    public static final int e(int i, int i2, int i3) {
        return i3 <= 0 ? i : Math.max(0, Math.min(i, Math.max(0, i3 - i2)));
    }

    public static wdm f(yxc1 yxc1Var, ivj ivjVar, zxc1 zxc1Var, q7r0 q7r0Var, rih1 rih1Var) {
        yxc1Var.getClass();
        ivjVar.getClass();
        rih1Var.getClass();
        return new wdm(yxc1Var, ivjVar, zxc1Var);
    }

    public static final LinkedHashMap g(VideoPlayerCommand videoPlayerCommand) {
        j380 j380VarMetadata;
        z6x z6xVarX;
        ContextTrack contextTrack;
        String strUri;
        ContextTrack contextTrack2;
        j380 j380VarMetadata2;
        String str;
        ContextTrack contextTrack3;
        j380 j380VarMetadata3;
        String str2;
        ContextTrack contextTrack4;
        j380 j380VarMetadata4;
        String str3;
        ContextTrack contextTrack5;
        j380 j380VarMetadata5;
        String str4;
        ContextTrack contextTrack6;
        PlayOrigin playOrigin;
        ContextTrack contextTrack7;
        ContextTrack contextTrack8;
        PlayOrigin playOrigin2;
        ContextTrack contextTrack9;
        PlayOrigin playOrigin3;
        PlayOrigin playOrigin4;
        PlayOrigin playOrigin5;
        spq0 spq0VarCommandInitiatedTime;
        Long l;
        q2g1 trackWithPlayOrigin = videoPlayerCommand.getTrackWithPlayOrigin();
        String strViewUri = null;
        String str5 = trackWithPlayOrigin != null ? trackWithPlayOrigin.c : null;
        if (str5 == null) {
            str5 = "";
        }
        mmr0 mmr0Var = new mmr0("playback_id", str5);
        LoggingParams loggingParameters = videoPlayerCommand.getLoggingParameters();
        long jLongValue = 0;
        if (loggingParameters != null && (spq0VarCommandInitiatedTime = loggingParameters.commandInitiatedTime()) != null && (l = (Long) spq0VarCommandInitiatedTime.e(0L)) != null) {
            jLongValue = l.longValue();
        }
        mmr0 mmr0Var2 = new mmr0("endvideo_command_initiated_time_ms", String.valueOf(jLongValue));
        q2g1 trackWithPlayOrigin2 = videoPlayerCommand.getTrackWithPlayOrigin();
        String str6 = trackWithPlayOrigin2 != null ? trackWithPlayOrigin2.d : null;
        if (str6 == null) {
            str6 = "";
        }
        mmr0 mmr0Var3 = new mmr0("endvideo_context_uri", str6);
        q2g1 trackWithPlayOrigin3 = videoPlayerCommand.getTrackWithPlayOrigin();
        String strDeviceIdentifier = (trackWithPlayOrigin3 == null || (playOrigin5 = trackWithPlayOrigin3.b) == null) ? null : playOrigin5.deviceIdentifier();
        if (strDeviceIdentifier == null) {
            strDeviceIdentifier = "";
        }
        mmr0 mmr0Var4 = new mmr0("endvideo_device_identifier", strDeviceIdentifier);
        q2g1 trackWithPlayOrigin4 = videoPlayerCommand.getTrackWithPlayOrigin();
        String strFeatureIdentifier = (trackWithPlayOrigin4 == null || (playOrigin4 = trackWithPlayOrigin4.b) == null) ? null : playOrigin4.featureIdentifier();
        if (strFeatureIdentifier == null) {
            strFeatureIdentifier = "";
        }
        mmr0 mmr0Var5 = new mmr0("endvideo_feature_identifier", strFeatureIdentifier);
        q2g1 trackWithPlayOrigin5 = videoPlayerCommand.getTrackWithPlayOrigin();
        String strFeatureVersion = (trackWithPlayOrigin5 == null || (playOrigin3 = trackWithPlayOrigin5.b) == null) ? null : playOrigin3.featureVersion();
        if (strFeatureVersion == null) {
            strFeatureVersion = "";
        }
        mmr0 mmr0Var6 = new mmr0("endvideo_feature_version", strFeatureVersion);
        q2g1 trackWithPlayOrigin6 = videoPlayerCommand.getTrackWithPlayOrigin();
        String strProvider = (trackWithPlayOrigin6 == null || (contextTrack9 = trackWithPlayOrigin6.a) == null) ? null : contextTrack9.provider();
        if (strProvider == null) {
            strProvider = "";
        }
        mmr0 mmr0Var7 = new mmr0("endvideo_provider", strProvider);
        mmr0 mmr0Var8 = new mmr0("endvideo_reason_start", videoPlayerCommand.getStartReason());
        q2g1 trackWithPlayOrigin7 = videoPlayerCommand.getTrackWithPlayOrigin();
        String strReferrerIdentifier = (trackWithPlayOrigin7 == null || (playOrigin2 = trackWithPlayOrigin7.b) == null) ? null : playOrigin2.referrerIdentifier();
        if (strReferrerIdentifier == null) {
            strReferrerIdentifier = "";
        }
        mmr0 mmr0Var9 = new mmr0("endvideo_referrer_identifier", strReferrerIdentifier);
        q2g1 trackWithPlayOrigin8 = videoPlayerCommand.getTrackWithPlayOrigin();
        String strUri2 = (trackWithPlayOrigin8 == null || (contextTrack8 = trackWithPlayOrigin8.a) == null) ? null : contextTrack8.uri();
        if (strUri2 == null) {
            strUri2 = "";
        }
        mmr0 mmr0Var10 = new mmr0("endvideo_track_uri", strUri2);
        q2g1 trackWithPlayOrigin9 = videoPlayerCommand.getTrackWithPlayOrigin();
        String strUid = (trackWithPlayOrigin9 == null || (contextTrack7 = trackWithPlayOrigin9.a) == null) ? null : contextTrack7.uid();
        if (strUid == null) {
            strUid = "";
        }
        mmr0 mmr0Var11 = new mmr0("track_uid", strUid);
        q2g1 trackWithPlayOrigin10 = videoPlayerCommand.getTrackWithPlayOrigin();
        if (trackWithPlayOrigin10 != null && (playOrigin = trackWithPlayOrigin10.b) != null) {
            strViewUri = playOrigin.viewUri();
        }
        if (strViewUri == null) {
            strViewUri = "";
        }
        mmr0 mmr0Var12 = new mmr0("endvideo_view_uri", strViewUri);
        String sessionId = videoPlayerCommand.getSessionId();
        LinkedHashMap linkedHashMapM = sqg0.M(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, mmr0Var4, mmr0Var5, mmr0Var6, mmr0Var7, mmr0Var8, mmr0Var9, mmr0Var10, mmr0Var11, mmr0Var12, new mmr0("endvideo_session_id", sessionId != null ? sessionId : "")});
        q2g1 trackWithPlayOrigin11 = videoPlayerCommand.getTrackWithPlayOrigin();
        if (trackWithPlayOrigin11 == null || (contextTrack6 = trackWithPlayOrigin11.a) == null || (j380VarMetadata = contextTrack6.metadata()) == null) {
            j380VarMetadata = b7x.a;
        }
        linkedHashMapM.putAll(j380VarMetadata);
        q2g1 trackWithPlayOrigin12 = videoPlayerCommand.getTrackWithPlayOrigin();
        if (trackWithPlayOrigin12 != null && (contextTrack5 = trackWithPlayOrigin12.a) != null && (j380VarMetadata5 = contextTrack5.metadata()) != null && (str4 = (String) j380VarMetadata5.get("user_behavior.on_demand_type")) != null) {
            linkedHashMapM.put("on_demand_type", str4);
        }
        q2g1 trackWithPlayOrigin13 = videoPlayerCommand.getTrackWithPlayOrigin();
        if (trackWithPlayOrigin13 != null && (contextTrack4 = trackWithPlayOrigin13.a) != null && (j380VarMetadata4 = contextTrack4.metadata()) != null && (str3 = (String) j380VarMetadata4.get("pointer.uri")) != null) {
            linkedHashMapM.put("entrypoint_uri", str3);
        }
        q2g1 trackWithPlayOrigin14 = videoPlayerCommand.getTrackWithPlayOrigin();
        if (trackWithPlayOrigin14 != null && (contextTrack3 = trackWithPlayOrigin14.a) != null && (j380VarMetadata3 = contextTrack3.metadata()) != null && (str2 = (String) j380VarMetadata3.get("decision_id")) != null) {
            linkedHashMapM.put("endvideo_decision_id", str2);
        }
        q2g1 trackWithPlayOrigin15 = videoPlayerCommand.getTrackWithPlayOrigin();
        if (trackWithPlayOrigin15 != null && (contextTrack2 = trackWithPlayOrigin15.a) != null && (j380VarMetadata2 = contextTrack2.metadata()) != null && (str = (String) j380VarMetadata2.get("play_context_decision_id")) != null) {
            linkedHashMapM.put("endvideo_play_context_decision_id", str);
        }
        if (videoPlayerCommand.getClientOffline()) {
            linkedHashMapM.put("endvideo_is_client_offline", "true");
        }
        if (videoPlayerCommand.isListPlayer()) {
            linkedHashMapM.put("orchestration_stack", "unknown");
        } else {
            linkedHashMapM.put("orchestration_stack", "context_player");
        }
        wkm contextPlayerOptions = videoPlayerCommand.getContextPlayerOptions();
        if (contextPlayerOptions != null && contextPlayerOptions.a) {
            linkedHashMapM.put("endvideo_is_shuffling_context", "true");
        }
        if ("mixed".equals(linkedHashMapM.get("media.type"))) {
            linkedHashMapM.put("betamax_override_feature_identifier", "context-player-vodcast");
            return linkedHashMapM;
        }
        boolean zEquals = "video".equals(linkedHashMapM.get("media.type"));
        q2g1 trackWithPlayOrigin16 = videoPlayerCommand.getTrackWithPlayOrigin();
        if (trackWithPlayOrigin16 == null || (contextTrack = trackWithPlayOrigin16.a) == null || (strUri = contextTrack.uri()) == null) {
            z6xVarX = z6x.a;
        } else {
            Pattern patternCompile = Pattern.compile(":");
            ihc1.N0(0);
            Matcher matcher = patternCompile.matcher(strUri);
            if (matcher.find()) {
                z6x arrayList = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList.add(strUri.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(strUri.subSequence(iEnd, strUri.length()).toString());
                z6xVarX = arrayList;
            } else {
                z6xVarX = k4p1.x(strUri.toString());
            }
        }
        if (z6xVarX.size() > 1 && "spotify".equals(z6xVarX.get(0))) {
            String str7 = (String) z6xVarX.get(1);
            linkedHashMapM.put("betamax_override_feature_identifier", (zEquals && u890.j(str7, "track")) ? "context-player-music-video" : l1d.m("context-player-", str7));
        }
        return linkedHashMapM;
    }

    public static final beg h(zim0 zim0Var, heg hegVar) {
        beg begVarI = i(zim0Var, hegVar);
        if (begVarI instanceof beg) {
            return begVarI;
        }
        return null;
    }

    public static final jfg i(zim0 zim0Var, heg hegVar) {
        if (zim0Var.t(l4o1.a) != null) {
            bhn0.d();
            return null;
        }
        dub0 dub0VarD = zim0Var.D(hegVar.a);
        List listF = lf30.f(hegVar.b.a);
        beg begVarG = dub0VarD.h.g((ajn0) o7h.q0(listF), 18);
        if (begVarG != null) {
            for (ajn0 ajn0Var : listF.subList(1, listF.size())) {
                if (begVarG instanceof beg) {
                    beg begVarG2 = begVarG.O().g(ajn0Var, 18);
                    begVarG = begVarG2 instanceof beg ? begVarG2 : null;
                    if (begVarG != null) {
                    }
                }
            }
            return begVarG;
        }
        return null;
    }

    public static final beg j(zim0 zim0Var, heg hegVar, poj0 poj0Var) {
        beg begVarH = h(zim0Var, hegVar);
        if (begVarH != null) {
            return begVarH;
        }
        return poj0Var.p(hegVar, z561.k0(new sgg1(aht.Z, z561.c0(dg20.b, hegVar))));
    }

    public static final cgc0 k(float f) {
        cgc0 cgc0Var = new cgc0();
        cgc0Var.e = 0.0f;
        cgc0Var.f = 2.0f;
        cgc0Var.g = Color.rgb(237, 91, 91);
        cgc0Var.h = Paint.Style.FILL_AND_STROKE;
        cgc0Var.i = "";
        cgc0Var.j = 3;
        cgc0Var.e = f;
        cgc0Var.g = uah.l(-1, 50);
        cgc0Var.f = npi1.c(1.0f);
        return cgc0Var;
    }

    public static final Object l(Next next) {
        if (next.d()) {
            return next.g();
        }
        return null;
    }

    public static final Long m(VideoPlayerCommand videoPlayerCommand) {
        ContextTrack contextTrack;
        j380 j380VarMetadata;
        String str;
        q2g1 trackWithPlayOrigin = videoPlayerCommand.getTrackWithPlayOrigin();
        if (trackWithPlayOrigin == null || (contextTrack = trackWithPlayOrigin.a) == null || (j380VarMetadata = contextTrack.metadata()) == null || (str = (String) j380VarMetadata.get("video.seconds_before_track_stuck")) == null) {
            return null;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    public static final Action n(y6x0 y6x0Var) {
        if (y6x0Var != null) {
            return new ty(Action.MEDIA_PLAYBACK).a();
        }
        if (y6x0Var == null) {
            return null;
        }
        eg.o();
        return null;
    }

    public static zi9 o(dk9 dk9Var) {
        boolean z = dk9Var.b;
        Set set = dk9Var.d;
        if (!z || !dk9Var.c || set.isEmpty()) {
            set = w7x.a;
        }
        return new zi9(set);
    }

    public static final String p(VideoPlayerCommand videoPlayerCommand) {
        String str;
        q2g1 trackWithPlayOrigin = videoPlayerCommand.getTrackWithPlayOrigin();
        return (trackWithPlayOrigin == null || (str = trackWithPlayOrigin.c) == null) ? "" : str;
    }

    public static final Header q(String str, Action action, List list) {
        vu50 vu50Var = new vu50();
        if (str != null) {
            vu50Var.d(CarText.create(str));
        }
        if (action != null) {
            vu50Var.c(action);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vu50Var.a((Action) it.next());
        }
        return vu50Var.b();
    }

    public static /* synthetic */ Header r(String str, Action action, smc0 smc0Var, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            action = null;
        }
        if ((i & 4) != 0) {
            smc0Var = z6x.a;
        }
        return q(str, action, smc0Var);
    }

    public static boolean s(dk9 dk9Var, UUID uuid) {
        Set<ee9> set = dk9Var.d;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (ee9 ee9Var : set) {
            if (u890.j(ee9Var.getUuid(), uuid)) {
                if (ee9Var instanceof de9) {
                    return true;
                }
                if (dk9Var.f && (ee9Var instanceof ce9)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Next t(Next next, int i) {
        long j = (i & 2) != 0 ? 0L : 2000L;
        kak0 kak0Var = (kak0) l(next);
        if (kak0Var == null) {
            return next;
        }
        if (kak0Var.S0.a.a != b8w0.b) {
            return Next.i(kak0.a(kak0Var, (pdm0) null, (Boolean) null, rcu0.a, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -65, 1048575), dm61.x0(new r0k0(kak0Var.S0, (String) null, false, j, kak0Var.b(), 4), next.b()));
        }
        ycu0 ycu0Var = kak0Var.g;
        boolean z = ycu0Var instanceof vcu0;
        wcu0 wcu0Var = wcu0.a;
        if (z || (ycu0Var instanceof rcu0)) {
            return Next.i(kak0.a(kak0Var, (pdm0) null, (Boolean) null, wcu0Var, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -65, 1048575), dm61.x0(e1k0.a, next.b()));
        }
        return Next.i(kak0.a(kak0Var, (pdm0) null, (Boolean) null, wcu0Var, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -65, 1048575), next.b());
    }

    public static final nah u(ArtworkView artworkView, ird1 ird1Var) {
        nah nahVar = (nah) artworkView.getTag(2131428641);
        if (nahVar == null) {
            nahVar = new nah(artworkView);
            artworkView.setTag(2131428641, nahVar);
        }
        nahVar.b = ird1Var;
        return nahVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException */
    public static final nft v(cv30 cv30Var) throws InvalidProtocolBufferException {
        Metadata annotation = cv30Var.getClass().getAnnotation(Metadata.class);
        if (annotation != null) {
            String[] strArrD1 = annotation.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                String[] strArrD2 = annotation.d2();
                vz00 vz00Var = fka0.a;
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(pwa.a(strArrD1));
                vz00 vz00Var2 = fka0.a;
                jja0 jja0Var = new jja0(dka0.h.a(byteArrayInputStream, vz00Var2), strArrD2);
                tja0 tja0Var = yfy0.Z0;
                tja0Var.getClass();
                mwg mwgVar = new mwg(byteArrayInputStream);
                yfy0 yfy0Var = (t8) tja0Var.b(mwgVar, vz00Var2);
                try {
                    mwgVar.a(0);
                    if (!yfy0Var.isInitialized()) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
                        invalidProtocolBufferException.a = yfy0Var;
                        throw invalidProtocolBufferException;
                    }
                    yfy0 yfy0Var2 = yfy0Var;
                    return new nft(m6x.b, bpi1.f(cv30Var.getClass(), oc11.a, yfy0Var2, jja0Var, new l141(yfy0Var2.Q0), new joj0((annotation.xi() & 8) != 0, annotation.mv()), lc11.a));
                } catch (InvalidProtocolBufferException e) {
                    e.a = yfy0Var;
                    throw e;
                }
            }
        }
        return null;
    }

    public static final Next w(Next next) {
        kak0 kak0Var = (kak0) l(next);
        if (kak0Var != null) {
            if (!u890.j(kak0Var.W0, j8w0.a)) {
                kak0Var = null;
            }
            kak0 kak0Var2 = kak0Var;
            if (kak0Var2 != null) {
                return Next.i(kak0.a(kak0Var2, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, k8w0.a, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -4194305, 1048575), next.b());
            }
        }
        return next;
    }

    public static final Next x(Next next) {
        kak0 kak0Var = (kak0) l(next);
        if (kak0Var != null) {
            m8w0 m8w0Var = kak0Var.W0;
            k8w0 k8w0Var = k8w0.a;
            if (u890.j(m8w0Var, k8w0Var)) {
                kak0Var = null;
            }
            if (kak0Var != null) {
                return Next.i(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, k8w0Var, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -4194305, 1048575), next.b());
            }
        }
        return next;
    }

    public static final ArrayList y(Iterable iterable, int i, iu30 iu30Var) {
        hvc fvcVar;
        CarColor carColorCreateCustom;
        Action actionD;
        boolean z = i >= 9;
        ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ad10 ad10Var = (cd10) it.next();
            if (ad10Var instanceof ad10) {
                CarColor carColor = ((cd10) ad10Var).b;
                k7a1 k7a1Var = new k7a1(iu30Var, ad10Var, (byte) 26);
                ty tyVar = new ty(Action.MEDIA_PLAYBACK);
                qpd.b.a(carColor);
                tyVar.e = carColor;
                tyVar.d = OnClickDelegateImpl.create(new ck90(k7a1Var, (byte) 1));
                actionD = tyVar.a();
            } else {
                if (!(ad10Var instanceof bd10)) {
                    eg.o();
                    return null;
                }
                hvc hvcVar = ((cd10) ad10Var).a;
                if (z) {
                    sfm0 sfm0Var = zuc.m;
                    fvcVar = new fvc(((fvc) hvcVar).a, ((fvc) hvcVar).b, new mmr0(Integer.valueOf(sfm0Var.b), Integer.valueOf(sfm0Var.a)), ((fvc) hvcVar).d);
                } else {
                    fvcVar = hvcVar;
                }
                if (z) {
                    sfm0 sfm0Var2 = zuc.k;
                    carColorCreateCustom = CarColor.createCustom(sfm0Var2.b, sfm0Var2.a);
                } else {
                    carColorCreateCustom = ((cd10) ad10Var).b;
                }
                actionD = d(null, fvcVar, carColorCreateCustom, false, new ft0(iu30Var, (bd10) ad10Var, (byte) 24), 25);
            }
            arrayList.add(actionD);
        }
        return arrayList;
    }

    public static bl0 z(int i, boolean z) {
        int iC = l1d.C(i);
        if (iC != 0) {
            if (iC != 1) {
                eg.o();
                return null;
            }
            if (!z) {
                if (!z) {
                    return bl0.c;
                }
                eg.o();
                return null;
            }
        } else {
            if (z) {
                return bl0.b;
            }
            if (z) {
                eg.o();
                return null;
            }
        }
        return bl0.a;
    }
}
