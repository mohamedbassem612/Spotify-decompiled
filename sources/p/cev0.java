package p;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import j$.util.DesugarTimeZone;
import java.io.File;
import java.text.Collator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class cev0 {
    public static b180 a;

    public static final u85 A(b0k b0kVar) {
        WeakHashMap weakHashMap = osl1.x;
        return lhc.g(b0kVar).e;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    public static Object B(String str, Bundle bundle, ylq0 ylq0Var) {
        Object obj;
        Map map;
        if (ylq0Var != null) {
            LinkedHashMap linkedHashMap = ylq0Var.a;
            zlq0 zlq0Var = zlq0.a;
            if (linkedHashMap.containsKey(zlq0Var) && (map = (Map) linkedHashMap.get(zlq0Var)) != null) {
                obj = map.get(str);
            } else {
                obj = null;
            }
        } else {
            obj = null;
        }
        return obj == null ? bundle != null ? bundle.getCharSequence(str) : null : obj;
    }

    public static int C(String str) {
        Map map = ylq0.b;
        zlq0 zlq0Var = zlq0.a;
        mmr0 mmr0Var = (mmr0) map.get(zlq0Var);
        Set set = mmr0Var != null ? (Set) mmr0Var.a : null;
        mmr0 mmr0Var2 = (mmr0) map.get(zlq0Var);
        Set set2 = mmr0Var2 != null ? (Set) mmr0Var2.b : null;
        if (set == null || !set.contains(str)) {
            return (set2 == null || !set2.contains(str)) ? 1 : 3;
        }
        return 2;
    }

    public static final u85 D(b0k b0kVar) {
        WeakHashMap weakHashMap = osl1.x;
        return lhc.g(b0kVar).f;
    }

    public static final u85 E(b0k b0kVar) {
        WeakHashMap weakHashMap = osl1.x;
        return lhc.g(b0kVar).g;
    }

    public static int F(int i) {
        return Integer.hashCode(i);
    }

    public static final qim0 G(qim0 qim0Var, iu30 iu30Var) {
        return qim0Var.then(new vx20(iu30Var));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    public static final hev0 H(ArrayList arrayList) {
        String strConcat;
        Object objValueOf;
        List list;
        Object next;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if ((obj instanceof eer0) || (obj instanceof dfr0)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof efr0) {
                arrayList3.add(obj2);
            }
        }
        efr0 efr0Var = (efr0) o7h.s0(arrayList3);
        if (efr0Var == null || (list = efr0Var.a.a) == null) {
            strConcat = null;
        } else {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((xdv0) next).c);
            xdv0 xdv0Var = (xdv0) next;
            if (xdv0Var != null) {
                String str = xdv0Var.a;
                strConcat = str != null ? "tag:".concat(str) : "all";
            } else {
                strConcat = null;
            }
        }
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
        for (Object obj3 : arrayList2) {
            if (obj3 instanceof eer0) {
                objValueOf = ((eer0) obj3).a;
            } else {
                if (!(obj3 instanceof dfr0)) {
                    eg.m("Unexpected release row");
                    return null;
                }
                objValueOf = Integer.valueOf(((dfr0) obj3).a);
            }
            arrayList4.add(objValueOf);
        }
        boolean z = false;
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof dfr0) {
                    z = true;
                    break;
                }
            }
        }
        return new hev0(strConcat, arrayList4, z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void I(j2i j2iVar, onm onmVar) throws KotlinNothingValueException {
        xs40 xs40Var;
        if (onmVar instanceof xs40) {
            xs40Var = (xs40) onmVar;
            int i = xs40Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xs40Var.b = i - Integer.MIN_VALUE;
            } else {
                xs40Var = new xs40(onmVar);
            }
        } else {
            xs40Var = new xs40(onmVar);
        }
        Object obj = xs40Var.a;
        int i2 = xs40Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                throw l1d.v(obj);
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return;
        }
        hm5.M(obj);
        fy5 fy5VarA = xs40Var.getContext().A(mm10.Y0);
        if (fy5VarA == null) {
            eg.m("provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance");
        } else {
            xs40Var.b = 1;
            fy5VarA.b(j2iVar, xs40Var);
        }
    }

    public static final j341 J(jo70 jo70Var, ktl ktlVar, boolean z, boolean z2) {
        String str = null;
        if (!z2 && ktlVar == ktl.b && z) {
            String strY0 = o7h.y0(jo70Var.d, ", ", (String) null, (String) null, rz31.d, 30);
            if (strY0.length() != 0) {
                io70 io70Var = jo70Var.e;
                if (io70Var != null) {
                    String str2 = io70Var.b;
                    Set set = s4b1.f;
                    s4b1 s4b1VarX = uic.x(str2);
                    String str3 = io70Var.a;
                    if (str3.length() > 0 && s4b1VarX.c == blc0.fh && str2.equals("spotify:show:".concat(s4b1VarX.h()))) {
                        str = str3;
                    }
                }
                return new j341(strY0, str);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    public static ArrayList K(String str, String str2, String str3, ArrayList arrayList) {
        nbb0 nbb0Var;
        Object obj = null;
        if (str2 == null) {
            str2 = str;
        } else {
            if (arrayList.isEmpty()) {
                str2 = null;
                break;
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
            } while (!nhc1.S((String) it.next(), str2, true));
            if (str2 == null) {
                str2 = str;
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Locale localeForLanguageTag = Locale.forLanguageTag(upn1.s());
        Collator collator = Collator.getInstance(localeForLanguageTag);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            if (linkedHashSet.add(str4.toLowerCase(Locale.ROOT))) {
                localeForLanguageTag.getClass();
                String displayName = Locale.forLanguageTag(str4).getDisplayName(localeForLanguageTag);
                if (displayName.length() > 0) {
                    displayName = ((Object) eth.U(displayName.charAt(0), localeForLanguageTag)) + displayName.substring(1);
                }
                nbb0Var = new nbb0(str4, str2.equalsIgnoreCase(str4), displayName, str4.equalsIgnoreCase(str));
            } else {
                nbb0Var = null;
            }
            if (nbb0Var != null) {
                arrayList2.add(nbb0Var);
            }
        }
        for (Object obj2 : arrayList2) {
            if (((nbb0) obj2).d) {
                obj = obj2;
                break;
            }
        }
        nbb0 nbb0Var2 = (nbb0) obj;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (!((nbb0) obj3).d) {
                arrayList3.add(obj3);
            }
        }
        List listA1 = o7h.a1(arrayList3, new ck50(collator, (byte) 1));
        List listW = w(str3, listA1);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : listA1) {
            nbb0 nbb0Var3 = (nbb0) obj4;
            List list = listW;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it3 = list.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (!nhc1.S(((nbb0) it3.next()).a, nbb0Var3.a, true));
            }
            arrayList4.add(obj4);
        }
        return o7h.N0(arrayList4, o7h.N0(listW, p7h.N(nbb0Var2)));
    }

    public static final wk80 L(nk80 nk80Var) {
        return new wk80(nk80Var.a, nk80Var.b, nk80Var.c, nk80Var.d);
    }

    public static String M(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date(j));
    }

    public static final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1994610532);
        int i2 = i | 6 | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131960764);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            gdx gdxVarA = yla.s(x340Var).a();
            j2i j2iVar = yti.a;
            qim0 qim0Var2 = nim0.a;
            foo1.h(gbxVar, qim0Var2, null, gdxVarA, null, null, j2iVar, x340Var, 12582960, 116);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(qim0Var, function0, i, (byte) 6);
        }
    }

    public static final void b(j3f1 j3f1Var, xpw xpwVar, g9c g9cVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        xpw xpwVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(912836545);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(j3f1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            xpwVar2 = xpwVar;
            i2 |= x340Var.i(xpwVar2) ? 32 : 16;
        } else {
            xpwVar2 = xpwVar;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(g9cVar) : x340Var.i(g9cVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            otw.c(xpwVar2, j3f1Var, (qim0) null, (ipb1) null, x340Var, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 12);
            qim0 qim0VarB = uyn1.B(u291.f(nim0.a, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            otw.c(g9cVar, rih1.a, (qim0) null, (ipb1) null, x340Var, 56 | ((i2 >> 6) & 14), 12);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, j3f1Var, xpwVar, g9cVar, qim0Var, (byte) 7);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(lmt0 lmt0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1345304488);
        int i2 = (x340Var.g(lmt0Var) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.b0();
        } else if (lmt0Var != null) {
            x340Var.i0(-1626078028);
            if (lmt0Var instanceof nxf1) {
                x340Var.i0(-1626031125);
                String str = ((nxf1) lmt0Var).c;
                if (str == null) {
                    x340Var.r(false);
                    x340Var.r(false);
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new azf1(lmt0Var, i, (byte) 0);
                        return;
                    }
                    return;
                }
                String strN0 = cwl1.n0(2131962766, new Object[]{str}, x340Var);
                uwr uwrVar = cbx.a;
                z = false;
                uwo1.e(strN0, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                x340Var.r(false);
            } else {
                z = false;
                if (!(lmt0Var instanceof mxf1)) {
                    throw p3d1.k(x340Var, -52454130, false);
                }
                x340Var.i0(-1625664984);
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            x340Var.i0(-1625653142);
            x340Var.r(false);
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new azf1(lmt0Var, i, (byte) 1);
        }
    }

    public static final void d(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1997800706);
        int i2 = i | 6 | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var2 = nim0.a;
            function1 = function0;
            p(2131960762, 2131960767, (i2 << 6) & 8064, function1, x340Var, qim0Var2);
            qim0Var = qim0Var2;
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(qim0Var, function1, i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v21 */
    public static final void e(v9y v9yVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        j06 j06Var;
        char c;
        Integer num;
        u7h u7hVar;
        u7h u7hVar2;
        float f;
        long jD;
        iu30 iu30Var2;
        Object obj;
        ?? r5;
        m4c m4cVar;
        c380 c380Var;
        Object obj2;
        Object obj3;
        lsd lsdVar = v9yVar.g;
        gra graVar = een.h;
        List list = v9yVar.O0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(90959887);
        j06 j06Var2 = x340Var.a;
        int i2 = i | (x340Var.i(v9yVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            long j = ((afx) x340Var.k(gfx.a)).a.c;
            lsd lsdVar2 = lsdVar instanceof lsd ? lsdVar : null;
            d9h d9hVar = lsdVar2 != null ? lsdVar2.a : null;
            if (d9hVar != null) {
                j06Var = j06Var2;
                c = 1;
                u7hVar = new u7h(d9hVar.a);
            } else {
                j06Var = j06Var2;
                c = 1;
                ax70 ax70VarB = v9yVar.b();
                if (ax70VarB != null) {
                    int i3 = ax70VarB.c;
                    Integer numValueOf = Integer.valueOf(i3);
                    if (i3 == 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        u7hVar2 = new u7h(z4p1.e(numValueOf.intValue()));
                    } else {
                        num = v9yVar.e;
                        if (num != null) {
                            u7hVar2 = new u7h(z4p1.e(num.intValue()));
                        } else {
                            u7hVar = null;
                        }
                    }
                    u7hVar = u7hVar2;
                } else {
                    num = v9yVar.e;
                    if (num != null) {
                        u7hVar2 = new u7h(z4p1.e(num.intValue()));
                        u7hVar = u7hVar2;
                    } else {
                        u7hVar = null;
                    }
                }
            }
            if (u7hVar != null) {
                long j2 = u7hVar.a;
                float[] fArr = new float[3];
                uah.h(z4p1.G(j2), fArr);
                if (fArr[2] < 0.25f) {
                    fArr[2] = 0.25f;
                }
                int i4 = u7h.l;
                float f2 = fArr[0];
                f = 1.0f;
                float f3 = fArr[c];
                float f4 = fArr[2];
                float fC = u7h.c(j2);
                je31 je31Var = kah.e;
                if (0.0f > f2 || f2 > 360.0f || 0.0f > f3 || f3 > 1.0f || 0.0f > f4 || f4 > 1.0f) {
                    StringBuilder sbM = gvg.m("HSL (", f2, ", ", f3, ", ");
                    sbM.append(f4);
                    sbM.append(") must be in range (0..360, 0..1, 0..1)");
                    pf80.a(sbM.toString());
                }
                jD = z4p1.d(nfb.r(f2, f3, f4, 0), nfb.r(f2, f3, f4, 8), nfb.r(f2, f3, f4, 4), fC, je31Var);
            } else {
                f = 1.0f;
                jD = j;
            }
            Configuration configuration = (Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a);
            int i5 = configuration.screenWidthDp;
            int i6 = configuration.screenHeightDp;
            char c2 = (i5 <= i6 || i6 >= 480) ? (char) 0 : c;
            Object objT = x340Var.T();
            m4c m4cVar2 = fkj0.X;
            Object obj4 = objT;
            if (objT == m4cVar2) {
                hrr0 hrr0VarQ = v8r.q(Boolean.FALSE);
                x340Var.s0(hrr0VarQ);
                obj4 = hrr0VarQ;
            }
            ven0 ven0Var = (ven0) obj4;
            char c3 = (v9yVar.h != null || ((Boolean) ven0Var.getValue()).booleanValue()) ? (char) 0 : c;
            boolean z = c3;
            boolean z2 = c2;
            float f5 = f;
            tob1 tob1VarB = z95.b(c3 != 0 ? f : 0.0f, (fe5) null, (String) null, (iu30) null, x340Var, 0, 30);
            tob1 tob1VarB2 = z95.b(((Boolean) ven0Var.getValue()).booleanValue() ? f5 : 0.0f, (fe5) null, (String) null, (iu30) null, x340Var, 0, 30);
            Object objT2 = x340Var.T();
            n511 n511Var = n511.e;
            Object obj5 = objT2;
            if (objT2 == m4cVar2) {
                hrr0 hrr0VarQ2 = v8r.q(n511Var);
                x340Var.s0(hrr0VarQ2);
                obj5 = hrr0VarQ2;
            }
            ven0 ven0Var2 = (ven0) obj5;
            Object objT3 = x340Var.T();
            Object obj6 = objT3;
            if (objT3 == m4cVar2) {
                hrr0 hrr0VarQ3 = v8r.q(n511Var);
                x340Var.s0(hrr0VarQ3);
                obj6 = hrr0VarQ3;
            }
            ven0 ven0Var3 = (ven0) obj6;
            Object objT4 = x340Var.T();
            Object obj7 = objT4;
            if (objT4 == m4cVar2) {
                hrr0 hrr0VarQ4 = v8r.q(n511Var);
                x340Var.s0(hrr0VarQ4);
                obj7 = hrr0VarQ4;
            }
            ven0 ven0Var4 = (ven0) obj7;
            Object objT5 = x340Var.T();
            Object obj8 = objT5;
            if (objT5 == m4cVar2) {
                hrr0 hrr0VarQ5 = v8r.q(Boolean.FALSE);
                x340Var.s0(hrr0VarQ5);
                obj8 = hrr0VarQ5;
            }
            ven0 ven0Var5 = (ven0) obj8;
            boolean zG = x340Var.g(list);
            Object objT6 = x340Var.T();
            Object obj9 = objT6;
            if (zG || objT6 == m4cVar2) {
                c380 c380VarA = mqo1.A(list);
                x340Var.s0(c380VarA);
                obj9 = c380VarA;
            }
            c380 c380Var2 = (c380) obj9;
            vef0 vef0Var = v9yVar.i;
            lsd lsdVar3 = lsdVar instanceof lsd ? lsdVar : null;
            d9h d9hVar2 = lsdVar3 != null ? lsdVar3.a : null;
            kw9 kw9Var = d9hVar2 != null ? new kw9(z4p1.G(d9hVar2.a), z4p1.G(d9hVar2.b)) : v9yVar.t;
            vef0 vef0VarA = (d9hVar2 == null || vef0Var == 0) ? vef0Var : vef0.a(vef0Var, (cqs0) null, z4p1.G(d9hVar2.c), z4p1.G(d9hVar2.d), z4p1.G(d9hVar2.e), 0, (chf0) null, false, (c380) null, 16271);
            vef0 vef0VarA2 = vef0VarA != null ? vef0.a(vef0VarA, (cqs0) null, 0, 0, 0, v9yVar.Z, v9yVar.Y, v9yVar.N0, (c380) null, 14591) : null;
            qim0 qim0VarE = dug.e(qim0Var, v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.25f), new u7h(j)), new mmr0(Float.valueOf(f5), new u7h(jD))}, 0.0f, 0.0f, 14), null, 0.0f, 6);
            boolean zI = x340Var.i(ven0Var2);
            Object objT7 = x340Var.T();
            Object obj10 = objT7;
            if (zI || objT7 == m4cVar2) {
                d7v d7vVar = new d7v(ven0Var2, (byte) 14);
                x340Var.s0(d7vVar);
                obj10 = d7vVar;
            }
            qim0 qim0VarX = ern1.x(qim0VarE, (iu30) obj10);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf2, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE2, x340Var, lljVar4);
            nim0 nim0Var = nim0.a;
            long j3 = jD;
            qim0 qim0VarD = u291.d(nim0Var, f5);
            uwr uwrVar = cbx.a;
            qim0 qim0VarX2 = uyn1.x(qim0VarD, cbx.b(x340Var).e.b);
            vef0 vef0Var2 = vef0VarA2;
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            w2g0.c(uyn1.z(cbx.b(x340Var).b.c, 0.0f, 2, kk0.q(x340Var, qim0VarE3, lljVar4, 1.0f, true)), z2 != 0 ? een.X : graVar, apo.r(-1383889951, new nzd(kw9Var, v9yVar, ven0Var3, (byte) 27), x340Var), x340Var, 3072, 4);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            boolean z4 = !z2;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarQ = k8p1.q(qim0VarF, z4, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13));
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarQ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            qim0 qim0VarK = d9y0.k(nim0Var, ((Number) tob1VarB.getValue()).floatValue());
            int i7 = i2 & 112;
            boolean z5 = i7 == 32;
            Object objT8 = x340Var.T();
            if (z5 || objT8 == m4cVar2) {
                iu30Var2 = iu30Var;
                y9y y9yVar = new y9y(iu30Var2, (byte) 3);
                x340Var.s0(y9yVar);
                obj = y9yVar;
            } else {
                iu30Var2 = iu30Var;
                obj = objT8;
            }
            Function0 function0 = (Function0) obj;
            boolean zH = x340Var.h(z) | (i7 == 32);
            Object objT9 = x340Var.T();
            Object obj11 = objT9;
            if (zH || objT9 == m4cVar2) {
                rid ridVar = new rid(z, iu30Var2, (byte) 1);
                x340Var.s0(ridVar);
                obj11 = ridVar;
            }
            iu30 iu30Var3 = iu30Var2;
            q(j3, function0, (iu30) obj11, qim0VarK, z2, x340Var, 0);
            x340Var = x340Var;
            boolean zBooleanValue = ((Boolean) ven0Var5.getValue()).booleanValue();
            boolean zI2 = x340Var.i(ven0Var4);
            Object objT10 = x340Var.T();
            Object obj12 = objT10;
            if (zI2 || objT10 == m4cVar2) {
                d7v d7vVar2 = new d7v(ven0Var4, (byte) 16);
                x340Var.s0(d7vVar2);
                obj12 = d7vVar2;
            }
            o(0, x340Var, (iu30) obj12, d9y0.k(nim0Var, ((Number) tob1VarB2.getValue()).floatValue()), zBooleanValue);
            x340Var.r(true);
            x340Var.r(true);
            if (c380Var2.isEmpty()) {
                r5 = 0;
                m4cVar = m4cVar2;
                c380Var = c380Var2;
                x340Var.i0(-2058936147);
                x340Var.r(false);
            } else {
                x340Var.i0(-2059801047);
                n511 n511Var2 = (n511) ven0Var3.getValue();
                n511 n511Var3 = (n511) ven0Var4.getValue();
                boolean z6 = i7 == 32;
                Object objT11 = x340Var.T();
                Object obj13 = objT11;
                if (z6 || objT11 == m4cVar2) {
                    ent entVar = new ent(iu30Var3, (byte) 26);
                    x340Var.s0(entVar);
                    obj13 = entVar;
                }
                bv30 bv30Var = (bv30) obj13;
                boolean zI3 = x340Var.i(ven0Var);
                Object objT12 = x340Var.T();
                Object obj14 = objT12;
                if (zI3 || objT12 == m4cVar2) {
                    iwr iwrVar = new iwr(ven0Var, (byte) 16);
                    x340Var.s0(iwrVar);
                    obj14 = iwrVar;
                }
                Function0 function1 = (Function0) obj14;
                boolean zI4 = (i7 == 32) | x340Var.i(ven0Var);
                Object objT13 = x340Var.T();
                if (zI4 || objT13 == m4cVar2) {
                    t0f t0fVar = new t0f(iu30Var3, ven0Var, (byte) 1);
                    x340Var.s0(t0fVar);
                    obj3 = t0fVar;
                } else {
                    obj3 = objT13;
                }
                vu30 vu30Var = (vu30) obj3;
                boolean zI5 = x340Var.i(ven0Var5);
                Object objT14 = x340Var.T();
                Object obj15 = objT14;
                if (zI5 || objT14 == m4cVar2) {
                    d7v d7vVar3 = new d7v(ven0Var5, (byte) 17);
                    x340Var.s0(d7vVar3);
                    obj15 = d7vVar3;
                }
                qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                r5 = 0;
                m4cVar = m4cVar2;
                c380Var = c380Var2;
                r4o1.E(c380Var, n511Var2, n511Var3, bv30Var, function1, vu30Var, (iu30) obj15, qim0VarD2, x340Var, 0);
                x340Var = x340Var;
                x340Var.r(false);
            }
            if (u890.j((n511) ven0Var3.getValue(), n511Var) || u890.j((n511) ven0Var2.getValue(), n511Var)) {
                x340Var.i0(-2057658451);
                x340Var.r((boolean) r5);
            } else {
                x340Var.i0(-2058821261);
                wat watVar = (wat) x340Var.k(t4k.h);
                int i8 = (int) (((n511) ven0Var3.getValue()).a - ((n511) ven0Var2.getValue()).a);
                int i9 = (int) (((n511) ven0Var3.getValue()).b - ((n511) ven0Var2.getValue()).b);
                n511 n511Var4 = (n511) ven0Var3.getValue();
                float fN0 = watVar.N0(n511Var4.c - n511Var4.a);
                n511 n511Var5 = (n511) ven0Var3.getValue();
                float fN1 = watVar.N0(n511Var5.d - n511Var5.b);
                boolean zE = x340Var.e(i8) | x340Var.e(i9);
                Object objT15 = x340Var.T();
                if (zE || objT15 == m4cVar) {
                    obj2 = objT15;
                    mun munVar = new mun((byte) 1, i8, i9);
                    x340Var.s0(munVar);
                    obj2 = munVar;
                }
                qim0 qim0VarS = u291.s(eqr0.k(nim0Var, (iu30) obj2), fN0, fN1);
                if (c380Var.isEmpty()) {
                    x340Var.i0(-2058041363);
                    x340Var.r((boolean) r5);
                } else {
                    x340Var.i0(-2058288340);
                    n511 n511Var6 = (n511) ven0Var3.getValue();
                    float f6 = n511Var6.c - n511Var6.a;
                    n511 n511Var7 = (n511) ven0Var3.getValue();
                    r4o1.D(c380Var, f6, n511Var7.d - n511Var7.b, zr7.i(qim0VarS, gce0.a1), x340Var, 0);
                    x340Var.r((boolean) r5);
                }
                if (vef0Var2 != null) {
                    x340Var.i0(-2057986338);
                    bof0.e(vef0Var2, cwl1.n0(2131955526, new Object[]{vef0Var2.b}, x340Var), qim0VarS, x340Var, (int) r5);
                    x340Var.r((boolean) r5);
                } else {
                    x340Var.i0(-2057664403);
                    x340Var.r((boolean) r5);
                }
                x340Var.r((boolean) r5);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g6w(v9yVar, iu30Var, qim0Var, i, (byte) 19);
        }
    }

    public static final void f(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1620629850);
        int i2 = i | 6 | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var2 = nim0.a;
            function1 = function0;
            p(2131960763, 2131960769, (i2 << 6) & 8064, function1, x340Var, qim0Var2);
            qim0Var = qim0Var2;
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(qim0Var, function1, i, (byte) 8);
        }
    }

    public static final void g(jyf1 jyf1Var, d0r d0rVar, tyq tyqVar, tyq tyqVar2, tyq tyqVar3, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-700703037);
        int i2 = i | (b0kVar3.g(jyf1Var) ? 4 : 2) | (b0kVar3.i(d0rVar) ? 32 : 16) | (b0kVar3.i(tyqVar) ? 256 : 128) | (b0kVar3.i(tyqVar2) ? 2048 : 1024) | (b0kVar3.i(tyqVar3) ? 16384 : 8192) | 196608 | (b0kVar3.i(function0) ? 1048576 : 524288);
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = yv91.a(new j4f1(jyf1Var, (byte) 12));
                b0kVar3.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(1, (pgx) null, 3, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498);
            nxf1 nxf1Var = jyf1Var.k;
            if ((nxf1Var instanceof nxf1) && nxf1Var.c != null) {
                b0kVar3.i0(-1099596407);
                j2iVarR = apo.r(1833974284, new e9f1(jyf1Var, (byte) 6), b0kVar3);
                b0kVar3.r(false);
            } else if (nxf1Var != null || jyf1Var.i == null) {
                b0kVar3.i0(-1099387654);
                b0kVar3.r(false);
                j2iVarR = null;
            } else {
                b0kVar3.i0(-1099475755);
                j2iVarR = apo.r(1888767555, new bzf1(jyf1Var, tyqVar3, d0rVar, (byte) 0), b0kVar3);
                b0kVar3.r(false);
            }
            j2i j2iVar = j2iVarR;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("row", u291.f(qim0Var3, 1.0f));
            String strO0 = cwl1.o0(b0kVar3, 2131962764);
            if (ihc1.y0(strO0)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            }
            y50 y50Var = new y50(strO0);
            boolean z = (i2 & 3670016) == 1048576;
            Object objT2 = b0kVar3.T();
            if (z || objT2 == m4cVar) {
                objT2 = new uuc1(function0, (byte) 20);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, uvxVar, null, false, null, null, new gbx(y50Var, (Function0) objT2), null, null, apo.r(-1557055942, new bzf1(tyqVar, jyf1Var, d0rVar), b0kVar3), null, apo.r(-707431429, new czf1(jyf1Var, tob1Var, (byte) 0), b0kVar3), apo.r(-128665284, new bzf1(jyf1Var, tyqVar2, d0rVar, (byte) 2), b0kVar3), null, j2iVar, apo.r(1607633151, new czf1(jyf1Var, tob1Var, (byte) 1), b0kVar3), b0kVar2, 805306432, 197040, 9660);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ydi0((Object) jyf1Var, (Object) d0rVar, (Object) tyqVar, (Object) tyqVar2, (Object) tyqVar3, qim0Var2, function0, i, (byte) 21);
        }
    }

    public static final void h(int i, int i2, b0k b0kVar, qim0 qim0Var, boolean z) {
        boolean z2;
        int i3;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1691699329);
        int i4 = i | 6;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i | 54;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (b0kVar3.h(z2) ? 32 : 16);
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            boolean z3 = i5 != 0 ? false : z2;
            uvx uvxVar = new uvx((pgx) null, 0, (tvx) null, (p3v) null, 30);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(qim0Var3, 1.0f), uvxVar, null, false, null, null, null, null, null, wnj.d, null, wnj.e, wnj.f, null, apo.r(-1335856986, new epe0((byte) 13, z3), b0kVar3), wnj.g, b0kVar2, 805306432, 221616, 9724);
            z2 = z3;
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kt9(qim0Var2, z2, i, i2);
        }
    }

    public static final void i(jyf1 jyf1Var, tyq tyqVar, d0r d0rVar, b0k b0kVar, int i) {
        String str = jyf1Var.i;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-13092581);
        int i2 = i | (x340Var.g(jyf1Var) ? 4 : 2) | (x340Var.i(tyqVar) ? 32 : 16) | (x340Var.i(d0rVar) ? 256 : 128);
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (str != null) {
            x340Var.i0(801145704);
            i1o1.e(tyqVar, new tm31(jyf1Var.a, str, jyf1Var.j), d0rVar, null, null, apo.r(1574889171, new wcf1(jyf1Var, (byte) 15), x340Var), wnj.c, 0, null, x340Var, ((i2 >> 3) & 14) | 1769472 | (i2 & 896), 204);
            x340Var.r(false);
        } else {
            x340Var.i0(801486983);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new juc1(jyf1Var, tyqVar, d0rVar, i, (byte) 26);
        }
    }

    public static final void j(boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2013859767);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            l(140.0f, 16.0f, null, x340Var, 54);
            if (z) {
                x340Var.i0(-1775919139);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 4.0f));
                l(140.0f, 16.0f, null, x340Var, 54);
                x340Var.r(false);
            } else {
                x340Var.i0(-1775790365);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ov51((byte) 5, i, z);
        }
    }

    public static final void k(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-508285086);
        int i2 = i | 6 | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = u291.h(qim0Var3, 32.0f);
            String strO0 = cwl1.o0(x340Var, 2131960770);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                wro1.h(new gbx(new y50(strO0), function0), jdx.c, qim0VarH, null, yla.s(x340Var), null, false, null, null, yti.b, x340Var, 0, 6, 984);
                qim0Var2 = qim0Var3;
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(qim0Var2, function0, i, (byte) 9);
        }
    }

    public static final void l(float f, float f2, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1270252185);
        int i2 = i | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0Var = nim0.a;
            qim0 qim0VarS = u291.s(qim0Var, f, f2);
            uwr uwrVar = cbx.a;
            t1c.a(cwl1.l0(dug.f(qim0VarS, cbx.a(x340Var).a.b.a(), er31.b(8.0f)), 0L, er31.b(8.0f), 13), x340Var, 0);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k82(f, f2, qim0Var2, i, (byte) 3);
        }
    }

    public static final void m(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-989921532);
        if (x340Var.Y(i & 1, (i & 19) != 18)) {
            qim0 qim0VarR = u291.r(qim0Var, 32.0f);
            uwr uwrVar = cbx.a;
            t1c.a(cwl1.l0(dug.f(qim0VarR, cbx.a(x340Var).a.b.a(), er31.a), 0L, er31.b(32.0f), 13), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 7);
        }
    }

    public static final void n(sda1 sda1Var, iu30 iu30Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-312445026);
        int i2 = i | (x340Var.g(sda1Var) ? 4 : 2) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            pxg1 pxg1VarO0 = irn1.o0((int) jfv.h(cbx.c(x340Var).b.a), 0, ((jhx) cbx.c(x340Var).a.d).a, 2);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            int i3 = i2 & 14;
            boolean zI = x340Var.i(pxg1VarO0) | (i3 == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new ny51(iu30Var, sda1Var, pxg1VarO0, (byte) 17);
                x340Var.s0(objT);
            }
            hm5.a(sda1Var, qim0VarD, (iu30) objT, (tl3) null, "song_dna_search_surface", iu30Var, apo.r(815920557, new tda1(j2iVar, i2, (byte) 0), x340Var), x340Var, i3 | 1794048, 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gh61(i, sda1Var, iu30Var, qim0Var2, j2iVar, (byte) 19);
        }
    }

    public static final void o(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, boolean z) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1930829761);
        int i2 = i | (x340Var2.h(z) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16) | (x340Var2.i(qim0Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            tob1 tob1VarB = z95.b(z ? 1.2f : 1.0f, (fe5) null, (String) null, (iu30) null, x340Var2, 0, 30);
            gra graVar = een.h;
            qim0 qim0VarD = i541.D(qim0Var, ((Number) tob1VarB.getValue()).floatValue(), ((Number) tob1VarB.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048572);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var2).d;
            qim0 qim0VarF = dug.f(i1p1.q(u291.r(qim0VarD, 48.0f), er31.a), u7h.b(u7h.b, 0.54f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new v2y(iu30Var, (byte) 5);
                x340Var = x340Var2;
                x340Var.s0(objT);
            } else {
                x340Var = x340Var2;
            }
            qim0 qim0VarX = ern1.x(qim0VarF, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            cmx cmxVar = cmx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            x340 x340Var3 = x340Var;
            w0h1.a(cmxVar, isl.a, u291.r(nim0.a, 24.0f), 0L, 0L, true, x340Var3, cmx.d | 196656, 24);
            x340Var2 = x340Var3;
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        h311 h311VarV = x340Var2.v();
        if (h311VarV != null) {
            h311VarV.d = new uc6(z, iu30Var, qim0Var, i);
        }
    }

    public static final void p(int i, int i2, int i3, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i4;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2143283814);
        if ((i3 & 6) == 0) {
            i4 = (b0kVar3.e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= b0kVar3.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= b0kVar3.i(qim0Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i4 & 1, (i4 & 1171) != 1170)) {
            qim0 qim0VarH = u291.h(qim0Var, 32.0f);
            String strO0 = cwl1.o0(b0kVar3, i2);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function0);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ul90.X;
                b0kVar3.s0(objT);
            }
            vu30 vu30Var = (vu30) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = ul90.Y;
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, new hdx(0, vu30Var, (vu30) objT2, (vu30) null, (hw61) null, 25), qim0VarH, null, yla.s(b0kVar3), null, null, null, null, null, apo.r(1037651975, new vx1(i, (byte) 21), b0kVar3), b0kVar2, 0, 48, 2008);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new h0a0(i, i2, i3, function0, qim0Var);
        }
    }

    public static final void q(long j, Function0 function0, iu30 iu30Var, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        float f;
        qim0 qim0VarB;
        boolean z2;
        gdx gdxVarR;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1932517680);
        int i2 = i | (x340Var.f(j) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Configuration configuration = (Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a);
            float fO = yoi1.o(Math.min(configuration.screenWidthDp, configuration.screenHeightDp) / 360.0f, 1.0f, 1.5f);
            if (z) {
                fO *= 0.8f;
            }
            float f2 = fO;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            float f3 = 24.0f * f2;
            mta mtaVar = cbx.b(x340Var).d;
            yla.s(x340Var);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB2 = nim0.a;
            qim0 qim0VarQ = k8p1.q(qim0Var, z, uyn1.B(qim0VarB2, 0.0f, 12.0f, 0.0f, 0.0f, 13));
            if (z) {
                x340Var.i0(1723657598);
                x340Var.r(false);
                f = 4.0f;
            } else {
                x340Var.i0(1723659095);
                cvx cvxVar2 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 12.0f;
            }
            mbh mbhVarA = jbh.a(new d36(f, true, new um5(false)), een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
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
            cvx cvxVar3 = cbx.b(x340Var).b;
            if (z) {
                x340Var.i0(692480270);
                x340Var.r(false);
                qim0VarB = qim0VarB2;
            } else {
                x340Var.i0(692481306);
                qim0VarB = uyn1.B(qim0VarB2, 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.b, 7);
                x340Var.r(false);
            }
            wqn1.e(8.0f, qim0VarB, apo.r(-1621568447, new lk6(f2, iu30Var, j, f3), x340Var), x340Var, 384);
            boolean z3 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                objT = new ivw(function0, (byte) 6);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            idx idxVar = new idx(6);
            if (z) {
                x340Var.i0(692533387);
                gdxVarR = yla.s(x340Var);
                z2 = false;
            } else {
                z2 = false;
                x340Var.i0(692534417);
                gdxVarR = yla.r(x340Var);
            }
            x340Var.r(z2);
            gdx gdxVar = gdxVarR;
            if (z) {
                x340Var.i0(692536398);
                x340Var.r(z2);
            } else {
                x340Var.i0(692537431);
                cvx cvxVar4 = cbx.b(x340Var).b;
                qim0VarB2 = uyn1.B(qim0VarB2, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                x340Var.r(false);
            }
            foo1.c(gbxVar, idxVar, qim0VarB2, null, gdxVar, null, null, null, null, null, fmi.a, x340Var, 0, 48, 2008);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mvf(j, function0, iu30Var, qim0Var, z, i, (byte) 1);
        }
    }

    public static void r(String str, String str2, Bundle bundle, ylq0 ylq0Var) {
        int iC = l1d.C(C(str));
        if (iC == 0) {
            bundle.putCharSequence(str, str2);
            return;
        }
        zlq0 zlq0Var = zlq0.a;
        if (iC == 1) {
            ylq0Var.a(zlq0Var, str, str2);
        } else {
            if (iC != 2) {
                return;
            }
            ylq0Var.a(zlq0Var, str, str2);
            bundle.putCharSequence(str, str2);
        }
    }

    public static mmr0 s(String str, String str2, Bundle bundle, ylq0 ylq0Var) {
        int iC = l1d.C(C(str));
        if (iC != 0) {
            zlq0 zlq0Var = zlq0.a;
            if (iC == 1) {
                if (ylq0Var == null) {
                    ylq0Var = new ylq0();
                }
                ylq0Var.a(zlq0Var, str, str2);
            } else if (iC == 2) {
                if (ylq0Var == null) {
                    ylq0Var = new ylq0();
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                ylq0Var.a(zlq0Var, str, str2);
                bundle.putCharSequence(str, str2);
            }
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence(str, str2);
        }
        return new mmr0(bundle, ylq0Var);
    }

    public static final Observable t(EsOfflinePlugin.DownloadCommand downloadCommand, onf0 onf0Var, pmf0 pmf0Var, long j, Scheduler scheduler, boolean z) {
        lpz lpzVar = z ? lpz.b : lpz.c;
        Observable observableTimer = Observable.timer(j, TimeUnit.MILLISECONDS, scheduler);
        lpz lpzVar2 = lpzVar;
        return observableTimer.flatMap(new tjq(downloadCommand, onf0Var, scheduler, pmf0Var, lpzVar2)).onErrorReturn(new jut(downloadCommand, lpzVar2, (byte) 7)).subscribeOn(scheduler);
    }

    public static final boolean u(int i, int i2) {
        return i == i2;
    }

    public static final String v(Throwable th) {
        if (th instanceof HttpException) {
            return f4i1.c(((HttpException) th).a, "http ");
        }
        return th instanceof TimeoutException ? "timeout" : ihc1.J0(th.getClass().getSimpleName(), "Exception").toLowerCase(Locale.ROOT);
    }

    public static List w(String str, List list) {
        Object next;
        z6x z6xVar;
        List list2 = list;
        Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!nhc1.S(((nbb0) next).a, str, true));
        nbb0 nbb0Var = (nbb0) next;
        if (nbb0Var != null) {
            return Collections.singletonList(nbb0Var);
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (localeForLanguageTag.getLanguage().length() > 0 && localeForLanguageTag.getScript().length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                Locale localeForLanguageTag2 = Locale.forLanguageTag(((nbb0) obj).a);
                if (nhc1.S(localeForLanguageTag2.getLanguage(), localeForLanguageTag.getLanguage(), true) && nhc1.S(localeForLanguageTag2.getScript(), localeForLanguageTag.getScript(), true)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        if (localeForLanguageTag.getLanguage().length() == 0) {
            z6xVar = z6x.a;
        } else {
            z6x arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (nhc1.S(Locale.forLanguageTag(((nbb0) obj2).a).getLanguage(), localeForLanguageTag.getLanguage(), true)) {
                    arrayList2.add(obj2);
                }
            }
            z6xVar = arrayList2;
        }
        if (!((Collection) z6xVar).isEmpty()) {
            return z6xVar;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            if (nhc1.S(Locale.forLanguageTag(((nbb0) obj3).a).getLanguage(), "en", true)) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }

    public static kvw0 x(Context context) {
        File dir = context.getDir("remote-config", 0);
        dir.getClass();
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File file = new File(dir, "ps");
        if (!file.exists()) {
            file.mkdirs();
        }
        return (kvw0) kvw0.b.computeIfAbsent(new File(file, "product-state.pb"), jvw0.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    public static final String y(String str, ArrayList arrayList, boolean z) {
        List listT0 = arrayList;
        if (z) {
            listT0 = o7h.T0(arrayList);
        }
        List listM = p7h.M(new String[]{o7h.y0(listT0, ", ", (String) null, (String) null, (iu30) null, 62), str});
        ?? arrayList2 = new ArrayList();
        for (Object obj : listM) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        if (z) {
            arrayList2 = o7h.T0((Iterable) arrayList2);
        }
        return o7h.y0((Iterable) arrayList2, " • ", (String) null, (String) null, (iu30) null, 62);
    }

    public static final u85 z(b0k b0kVar) {
        WeakHashMap weakHashMap = osl1.x;
        return lhc.g(b0kVar).c;
    }
}
