package p;

import android.view.View;
import com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass;
import com.spotify.collection_esperanto.proto.Status;
import com.spotify.metadata.cosmos.proto.MetadataCosmos;
import com.spotify.metadata.esperanto.proto.GetEntityResponse;
import com.spotify.mobius.Next;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p9w implements Function, Predicate, s2i1, Function3, k1q0, BiFunction, eky {
    public final /* synthetic */ byte a;
    public static final p9w b = new p9w(0);
    public static final p9w c = new p9w(1);
    public static final p9w d = new p9w(2);
    public static final p9w e = new p9w(3);
    public static final p9w f = new p9w(4);
    public static final p9w g = new p9w(5);
    public static final p9w h = new p9w(6);
    public static final p9w i = new p9w(7);
    public static final p9w t = new p9w(8);
    public static final p9w X = new p9w(9);
    public static final p9w Y = new p9w(10);
    public static final p9w Z = new p9w(11);
    public static final p9w N0 = new p9w(12);
    public static final p9w O0 = new p9w(13);
    public static final p9w P0 = new p9w(14);
    public static final p9w Q0 = new p9w(15);
    public static final p9w R0 = new p9w(16);
    public static final p9w S0 = new p9w(17);
    public static final p9w T0 = new p9w(18);
    public static final p9w U0 = new p9w(19);
    public static final p9w V0 = new p9w(21);
    public static final p9w W0 = new p9w(22);
    public static final p9w X0 = new p9w(23);
    public static final p9w Y0 = new p9w(24);
    public static final p9w Z0 = new p9w(25);
    public static final p9w a1 = new p9w(26);
    public static final p9w b1 = new p9w(27);
    public static final p9w c1 = new p9w(28);
    public static final p9w d1 = new p9w(29);

    public /* synthetic */ p9w(byte b2) {
        this.a = b2;
    }

    public static final boolean a(m1h1 m1h1Var, qh31 qh31Var) {
        e8b0 e8b0VarN;
        return m1h1Var.l(qh31Var) || ((qh31Var instanceof wod) && (e8b0VarN = m1h1Var.n(m1h1Var.c(m1h1Var.M((wod) qh31Var)))) != null && m1h1Var.l(m1h1Var.O(e8b0VarN)));
    }

    public static final boolean b(m1h1 m1h1Var, teb tebVar, qh31 qh31Var, qh31 qh31Var2, boolean z) {
        Collection<e8b0> collectionH = m1h1Var.h(qh31Var);
        if ((collectionH instanceof Collection) && collectionH.isEmpty()) {
            return false;
        }
        for (e8b0 e8b0Var : collectionH) {
            if (u890.j(m1h1Var.G(e8b0Var), m1h1Var.q(qh31Var2))) {
                return true;
            }
            if (z && k(c, tebVar, qh31Var2, e8b0Var)) {
                return true;
            }
        }
        return false;
    }

    public static List c(teb tebVar, m1h1 m1h1Var, qh31 qh31Var, i0h1 i0h1Var) {
        ltn1 ltn1VarJ;
        g0h1 g0h1Var = g0h1.e;
        if (m1h1Var.D(i0h1Var) || !m1h1Var.l0(qh31Var)) {
            if (!m1h1Var.u(i0h1Var)) {
                zh91 zh91Var = new zh91();
                tebVar.h();
                m1h1 m1h1Var2 = (m1h1) tebVar.d;
                ArrayDeque arrayDeque = (ArrayDeque) tebVar.g;
                arrayDeque.getClass();
                bi91 bi91Var = (bi91) tebVar.h;
                bi91Var.getClass();
                arrayDeque.push(qh31Var);
                while (!arrayDeque.isEmpty()) {
                    qh31 qh31Var2 = (qh31) arrayDeque.pop();
                    qh31Var2.getClass();
                    if (bi91Var.add(qh31Var2)) {
                        qh31 qh31VarZ = m1h1Var.Z(qh31Var2);
                        if (qh31VarZ == null) {
                            qh31VarZ = qh31Var2;
                        }
                        if (m1h1Var.W(m1h1Var.q(qh31VarZ), i0h1Var)) {
                            zh91Var.add(qh31VarZ);
                            ltn1VarJ = g0h1Var;
                        } else {
                            ltn1VarJ = m1h1Var.f0(qh31VarZ) == 0 ? g0h1.d : m1h1Var2.j(qh31VarZ);
                        }
                        if (ltn1VarJ.equals(g0h1Var)) {
                            ltn1VarJ = null;
                        }
                        if (ltn1VarJ != null) {
                            Iterator it = m1h1Var2.p(m1h1Var2.q(qh31Var2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(ltn1VarJ.D(tebVar, (e8b0) it.next()));
                            }
                        }
                    }
                }
                tebVar.e();
                return zh91Var;
            }
            if (m1h1Var.W(m1h1Var.q(qh31Var), i0h1Var)) {
                qh31 qh31VarZ2 = m1h1Var.Z(qh31Var);
                if (qh31VarZ2 != null) {
                    qh31Var = qh31VarZ2;
                }
                return Collections.singletonList(qh31Var);
            }
        }
        return z6x.a;
    }

    public static List d(teb tebVar, m1h1 m1h1Var, qh31 qh31Var, i0h1 i0h1Var) {
        List listC = c(tebVar, m1h1Var, qh31Var, i0h1Var);
        if (listC.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listC) {
                c0h1 c0h1VarH = m1h1Var.H((qh31) obj);
                int iB = m1h1Var.B(c0h1VarH);
                int i2 = 0;
                while (true) {
                    if (i2 >= iB) {
                        arrayList.add(obj);
                        break;
                    }
                    e8b0 e8b0VarN = m1h1Var.n(m1h1Var.q0(c0h1VarH, i2));
                    if ((e8b0VarN != null ? m1h1Var.L(e8b0VarN) : null) != null) {
                        break;
                    }
                    i2++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listC;
    }

    public static boolean f(teb tebVar, e8b0 e8b0Var, e8b0 e8b0Var2) {
        tto1 tto1Var = (tto1) tebVar.e;
        xto1 xto1Var = (xto1) tebVar.f;
        m1h1 m1h1Var = (m1h1) tebVar.d;
        if (e8b0Var == e8b0Var2) {
            return true;
        }
        if (h(m1h1Var, e8b0Var) && h(m1h1Var, e8b0Var2)) {
            e8b0 e8b0VarR = tto1Var.r(xto1Var.D(e8b0Var));
            e8b0 e8b0VarR2 = tto1Var.r(xto1Var.D(e8b0Var2));
            qh31 qh31VarX = m1h1Var.X(e8b0VarR);
            if (!m1h1Var.W(m1h1Var.G(e8b0VarR), m1h1Var.G(e8b0VarR2))) {
                return false;
            }
            if (m1h1Var.f0(qh31VarX) == 0) {
                return m1h1Var.P(e8b0VarR) || m1h1Var.P(e8b0VarR2) || m1h1Var.t(qh31VarX) == m1h1Var.t(m1h1Var.X(e8b0VarR2));
            }
        }
        p9w p9wVar = c;
        return k(p9wVar, tebVar, e8b0Var, e8b0Var2) && k(p9wVar, tebVar, e8b0Var2, e8b0Var);
    }

    public static a1h1 g(m1h1 m1h1Var, e8b0 e8b0Var, qh31 qh31Var) {
        e8b0 e8b0VarN;
        int iF0 = m1h1Var.f0(e8b0Var);
        int i2 = 0;
        while (true) {
            if (i2 >= iF0) {
                return null;
            }
            d0h1 d0h1VarM0 = m1h1Var.m0(e8b0Var, i2);
            d0h1 d0h1Var = m1h1Var.J(d0h1VarM0) ? null : d0h1VarM0;
            if (d0h1Var != null && (e8b0VarN = m1h1Var.n(d0h1Var)) != null) {
                boolean z = m1h1Var.o(m1h1Var.X(e8b0VarN)) && m1h1Var.o(m1h1Var.X(qh31Var));
                if (e8b0VarN.equals(qh31Var) || (z && u890.j(m1h1Var.G(e8b0VarN), m1h1Var.G(qh31Var)))) {
                    return m1h1Var.h0(m1h1Var.G(e8b0Var), i2);
                }
                a1h1 a1h1VarG = g(m1h1Var, e8b0VarN, qh31Var);
                if (a1h1VarG != null) {
                    return a1h1VarG;
                }
            }
            i2++;
        }
    }

    public static boolean h(m1h1 m1h1Var, e8b0 e8b0Var) {
        if (!m1h1Var.Y(m1h1Var.G(e8b0Var))) {
            return false;
        }
        m1h1Var.T(e8b0Var);
        return (m1h1Var.I(e8b0Var) || m1h1Var.a0(e8b0Var) || m1h1Var.F(e8b0Var)) ? false : true;
    }

    public static boolean j(teb tebVar, m1h1 m1h1Var, c0h1 c0h1Var, qh31 qh31Var) {
        boolean zK;
        i0h1 i0h1VarQ = m1h1Var.q(qh31Var);
        int iB = m1h1Var.B(c0h1Var);
        int iR = m1h1Var.R(i0h1VarQ);
        if (iB == iR && iB == m1h1Var.f0(qh31Var)) {
            for (int i2 = 0; i2 < iR; i2++) {
                d0h1 d0h1VarM0 = m1h1Var.m0(qh31Var, i2);
                e8b0 e8b0VarN = m1h1Var.n(d0h1VarM0);
                if (e8b0VarN != null) {
                    d0h1 d0h1VarQ0 = m1h1Var.q0(c0h1Var, i2);
                    m1h1Var.V(d0h1VarQ0);
                    e8b0 e8b0VarN2 = m1h1Var.n(d0h1VarQ0);
                    e8b0VarN2.getClass();
                    int iB2 = m1h1Var.b(m1h1Var.h0(i0h1VarQ, i2));
                    int iV = m1h1Var.V(d0h1VarM0);
                    if (iB2 == 3) {
                        iB2 = iV;
                    } else if (iV != 3 && iB2 != iV) {
                        iB2 = 0;
                    }
                    if (iB2 == 0) {
                        return tebVar.a;
                    }
                    if (iB2 == 3) {
                        l(m1h1Var, e8b0VarN2, e8b0VarN);
                        l(m1h1Var, e8b0VarN, e8b0VarN2);
                    }
                    int i3 = tebVar.c;
                    if (i3 > 100) {
                        hhg1.o(e8b0VarN2, "Arguments depth is too high. Some related argument: ");
                        return false;
                    }
                    tebVar.c = i3 + 1;
                    int iC = l1d.C(iB2);
                    p9w p9wVar = c;
                    if (iC == 0) {
                        zK = k(p9wVar, tebVar, e8b0VarN, e8b0VarN2);
                    } else if (iC == 1) {
                        zK = k(p9wVar, tebVar, e8b0VarN2, e8b0VarN);
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return false;
                        }
                        zK = f(tebVar, e8b0VarN2, e8b0VarN);
                    }
                    tebVar.c--;
                    if (!zK) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean k(p9w p9wVar, teb tebVar, e8b0 e8b0Var, e8b0 e8b0Var2) {
        if (e8b0Var == e8b0Var2) {
            return true;
        }
        if (!tebVar.f(e8b0Var, e8b0Var2)) {
            return false;
        }
        return c.e(tebVar, (m1h1) tebVar.d, e8b0Var, e8b0Var2);
    }

    public static void l(m1h1 m1h1Var, e8b0 e8b0Var, e8b0 e8b0Var2) {
        qh31 qh31VarJ0 = m1h1Var.j0(e8b0Var);
        if (qh31VarJ0 instanceof wod) {
            wod wodVar = (wod) qh31VarJ0;
            if (!m1h1Var.d(wodVar) && m1h1Var.J(m1h1Var.c(m1h1Var.M(wodVar))) && m1h1Var.A(wodVar) == 1) {
                m1h1Var.G(e8b0Var2);
            }
        }
    }

    public static Next m(ayq ayqVar) {
        return Next.i(ayq.a(ayqVar, null, true, false, false, false, false, 25), Collections.singleton(cxq.c));
    }

    public static Next o(ayq ayqVar) {
        List list = ayqVar.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (u890.j(((b2r) obj).b, e2r.a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((b2r) it.next()).a);
        }
        return Next.i(ayq.a(ayqVar, null, false, false, true, false, false, 39), Collections.singleton(new dxq(arrayList2)));
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                byte[] bArr = (byte[]) obj;
                try {
                    return AdDetectionOuterClass.MapTimestampResponse.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass.MapTimestampResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 11:
            case 13:
            case 14:
            case 17:
            case 18:
            case 20:
            case 22:
            case 27:
            default:
                g900 g900Var = (g900) obj;
                return new g900(g900Var.a, g900Var.b);
            case 7:
                return ((GetEntityResponse) obj).n().o();
            case 8:
                return (String) ((spq0) obj).b();
            case 10:
                n57.e("[Puffin] Error getting filter prediction after restarting: " + ((Throwable) obj));
                return y49.a;
            case 12:
                String str = ((pfb) obj).a;
                if (str == null) {
                    str = "";
                }
                return new m210(2034, "bluetooth", (String) null, str, "bluetooth", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
            case 15:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return MetadataCosmos.MultiResponse.n(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.metadata.cosmos.proto.MetadataCosmos.MultiResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 16:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return Status.p(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.collection_esperanto.proto.Status: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case 19:
                jdu0 jdu0Var = (jdu0) obj;
                return new idu0(jdu0Var.a, jdu0Var.u, jdu0Var.l);
            case 21:
                return Integer.valueOf(((Status) obj).n());
            case 23:
                xtw0 xtw0Var = (xtw0) obj;
                return Boolean.valueOf(!xtw0Var.b && xtw0Var.c);
            case 24:
                return (l0l) ((spq0) obj).b();
            case 25:
                return new pou((l0l) ((spq0) obj).h());
            case 26:
                return new j0w((xb41) obj);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new ejt0((b8z) obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x020c  */
    /* JADX WARN: Code duplicated, block: B:160:0x026b  */
    /* JADX WARN: Code duplicated, block: B:210:0x0369  */
    /* JADX WARN: Code duplicated, block: B:213:0x037a  */
    /* JADX WARN: Code duplicated, block: B:217:0x0385 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:218:0x0387  */
    /* JADX WARN: Code duplicated, block: B:220:0x0398  */
    /* JADX WARN: Code duplicated, block: B:223:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:226:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:228:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:231:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX WARN: Code duplicated, block: B:242:0x0423  */
    /* JADX WARN: Code duplicated, block: B:245:0x042f  */
    /* JADX WARN: Code duplicated, block: B:250:0x0443  */
    /* JADX WARN: Code duplicated, block: B:252:0x0452  */
    /* JADX WARN: Code duplicated, block: B:254:0x045e  */
    /* JADX WARN: Code duplicated, block: B:256:0x0463  */
    /* JADX WARN: Code duplicated, block: B:259:0x046e  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:262:0x0488  */
    /* JADX WARN: Code duplicated, block: B:266:0x049d  */
    /* JADX WARN: Code duplicated, block: B:267:0x049f  */
    /* JADX WARN: Code duplicated, block: B:271:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:277:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:281:0x04d5 A[LOOP:7: B:275:0x04b7->B:281:0x04d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:297:0x037b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x03e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x041a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x03a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0438 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x0429 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:310:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x04ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x04d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:? A[LOOP:12: B:31:0x0099->B:333:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:? A[LOOP:13: B:47:0x00da->B:336:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    public boolean e(teb tebVar, m1h1 m1h1Var, e8b0 e8b0Var, e8b0 e8b0Var2) {
        Boolean boolValueOf;
        Boolean bool;
        boolean z;
        List listC;
        g0h1 g0h1Var;
        ArrayList<qh31> arrayList;
        int size;
        i0h1 i0h1VarQ;
        ArrayDeque arrayDeque;
        bi91 bi91Var;
        qh31 qh31Var;
        g0h1 g0h1Var2;
        Iterator it;
        qh31 qh31VarD;
        x26 x26Var;
        int iR;
        ?? r6;
        boolean zJ;
        boolean zJ2;
        d0h1 d0h1VarR;
        e8b0 e8b0VarN;
        qh31 qh31VarJ0;
        i0h1 i0h1VarQ2;
        i0h1 i0h1VarQ3;
        a1h1 a1h1VarG;
        Collection collectionP;
        Iterator it2;
        Collection collectionP2;
        Iterator it3;
        boolean z2;
        xto1 xto1Var = (xto1) tebVar.f;
        e8b0 e8b0VarD = xto1Var.D(e8b0Var);
        tto1 tto1Var = (tto1) tebVar.e;
        e8b0 e8b0VarR = tto1Var.r(e8b0VarD);
        e8b0 e8b0VarR2 = tto1Var.r(xto1Var.D(e8b0Var2));
        qh31 qh31VarX = m1h1Var.X(e8b0VarR);
        qh31 qh31VarO = m1h1Var.O(e8b0VarR2);
        boolean z3 = false;
        boolean z4 = true;
        if (!m1h1Var.k(qh31VarX) && !m1h1Var.k(qh31VarO)) {
            m1h1Var.p0(qh31VarX);
            m1h1Var.g0(qh31VarX);
            m1h1Var.g0(qh31VarO);
            wod wodVarA = m1h1Var.a(qh31VarO);
            e8b0 e8b0VarZ = wodVarA != null ? m1h1Var.z(wodVarA) : null;
            if (wodVarA == null || e8b0VarZ == null) {
                i0h1VarQ2 = m1h1Var.q(qh31VarO);
                if (m1h1Var.w(i0h1VarQ2)) {
                    m1h1Var.t(qh31VarO);
                    collectionP2 = m1h1Var.p(i0h1VarQ2);
                    if (!(collectionP2 instanceof Collection) && collectionP2.isEmpty()) {
                        z2 = true;
                        break;
                    }
                    it3 = collectionP2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z2 = true;
                            break;
                        }
                        if (!k(c, tebVar, qh31VarX, (e8b0) it3.next())) {
                            z2 = false;
                            break;
                        }
                    }
                    boolValueOf = Boolean.valueOf(z2);
                } else {
                    i0h1VarQ3 = m1h1Var.q(qh31VarX);
                    if (qh31VarX instanceof wod) {
                        a1h1VarG = g(m1h1Var, qh31VarO, qh31VarX);
                        if (a1h1VarG == null && m1h1Var.n0(a1h1VarG, m1h1Var.q(qh31VarO))) {
                            boolValueOf = Boolean.TRUE;
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        if (m1h1Var.w(i0h1VarQ3)) {
                            collectionP = m1h1Var.p(i0h1VarQ3);
                            if ((collectionP instanceof Collection) || !collectionP.isEmpty()) {
                                it2 = collectionP.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        a1h1VarG = g(m1h1Var, qh31VarO, qh31VarX);
                                        if (a1h1VarG == null) {
                                        }
                                    } else if (!(((e8b0) it2.next()) instanceof wod)) {
                                    }
                                }
                            } else {
                                a1h1VarG = g(m1h1Var, qh31VarO, qh31VarX);
                                if (a1h1VarG == null) {
                                }
                            }
                        }
                        boolValueOf = null;
                    }
                }
            } else {
                if (m1h1Var.t(qh31VarO)) {
                    e8b0VarZ = m1h1Var.c0(e8b0VarZ);
                } else if (m1h1Var.K(qh31VarO)) {
                    e8b0VarZ = m1h1Var.E(e8b0VarZ);
                }
                if (k(this, tebVar, qh31VarX, e8b0VarZ)) {
                    boolValueOf = Boolean.TRUE;
                } else {
                    i0h1VarQ2 = m1h1Var.q(qh31VarO);
                    if (m1h1Var.w(i0h1VarQ2)) {
                        m1h1Var.t(qh31VarO);
                        collectionP2 = m1h1Var.p(i0h1VarQ2);
                        if (!(collectionP2 instanceof Collection)) {
                            it3 = collectionP2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z2 = true;
                                    break;
                                }
                                if (!k(c, tebVar, qh31VarX, (e8b0) it3.next())) {
                                    z2 = false;
                                    break;
                                }
                            }
                        } else {
                            it3 = collectionP2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z2 = true;
                                    break;
                                }
                                if (!k(c, tebVar, qh31VarX, (e8b0) it3.next())) {
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z2);
                    } else {
                        i0h1VarQ3 = m1h1Var.q(qh31VarX);
                        if (qh31VarX instanceof wod) {
                            a1h1VarG = g(m1h1Var, qh31VarO, qh31VarX);
                            if (a1h1VarG == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = null;
                            }
                        } else {
                            if (m1h1Var.w(i0h1VarQ3)) {
                                collectionP = m1h1Var.p(i0h1VarQ3);
                                if (collectionP instanceof Collection) {
                                    it2 = collectionP.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            a1h1VarG = g(m1h1Var, qh31VarO, qh31VarX);
                                            if (a1h1VarG == null) {
                                            }
                                        } else if (!(((e8b0) it2.next()) instanceof wod)) {
                                        }
                                    }
                                } else {
                                    it2 = collectionP.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            a1h1VarG = g(m1h1Var, qh31VarO, qh31VarX);
                                            if (a1h1VarG == null) {
                                            }
                                        } else if (!(((e8b0) it2.next()) instanceof wod)) {
                                        }
                                    }
                                }
                            }
                            boolValueOf = null;
                        }
                    }
                }
            }
        } else if (tebVar.a) {
            boolValueOf = Boolean.TRUE;
        } else if (!m1h1Var.t(qh31VarX) || m1h1Var.t(qh31VarO)) {
            if (!m1h1Var.k(qh31VarX)) {
                qh31VarX = m1h1Var.U(qh31VarX, false);
            }
            if (!m1h1Var.k(qh31VarO)) {
                qh31VarO = m1h1Var.U(qh31VarO, false);
            }
            boolValueOf = Boolean.valueOf(sto1.q(m1h1Var, qh31VarX, qh31VarO));
        } else {
            boolValueOf = Boolean.FALSE;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        qh31 qh31VarX2 = m1h1Var.X(e8b0VarR);
        qh31 qh31VarO2 = m1h1Var.O(e8b0VarR2);
        g0h1 g0h1Var3 = g0h1.e;
        m1h1 m1h1Var2 = (m1h1) tebVar.d;
        g0h1 g0h1Var4 = g0h1.d;
        if (!m1h1Var2.t(qh31VarO2) && !m1h1Var2.a0(qh31VarX2) && !m1h1Var2.K(qh31VarX2) && ((!(qh31VarX2 instanceof wod) || !m1h1Var2.Q((wod) qh31VarX2)) && !jto1.x(tebVar, qh31VarX2, g0h1Var4))) {
            if (m1h1Var2.K(qh31VarO2) || jto1.x(tebVar, qh31VarO2, g0h1.f) || m1h1Var2.l0(qh31VarX2)) {
                return false;
            }
            i0h1 i0h1VarQ4 = m1h1Var2.q(qh31VarO2);
            if (!jto1.z(tebVar, qh31VarX2, i0h1VarQ4)) {
                tebVar.h();
                ArrayDeque arrayDeque2 = (ArrayDeque) tebVar.g;
                arrayDeque2.getClass();
                bi91 bi91Var2 = (bi91) tebVar.h;
                bi91Var2.getClass();
                arrayDeque2.push(qh31VarX2);
                loop0: while (true) {
                    if (arrayDeque2.isEmpty()) {
                        tebVar.e();
                        return false;
                    }
                    qh31 qh31Var2 = (qh31) arrayDeque2.pop();
                    qh31Var2.getClass();
                    if (bi91Var2.add(qh31Var2)) {
                        g0h1 g0h1Var5 = m1h1Var2.t(qh31Var2) ? g0h1Var3 : g0h1Var4;
                        if (g0h1Var5.equals(g0h1Var3)) {
                            g0h1Var5 = null;
                        }
                        if (g0h1Var5 == null) {
                            continue;
                        } else {
                            Iterator it4 = m1h1Var2.p(m1h1Var2.q(qh31Var2)).iterator();
                            while (it4.hasNext()) {
                                qh31 qh31VarD2 = g0h1Var5.D(tebVar, (e8b0) it4.next());
                                if (jto1.z(tebVar, qh31VarD2, i0h1VarQ4)) {
                                    tebVar.e();
                                    break loop0;
                                }
                                arrayDeque2.add(qh31VarD2);
                            }
                        }
                    }
                }
            }
        }
        if (!m1h1Var.l(qh31VarX2) && !m1h1Var.l(qh31VarO2)) {
            bool = null;
        } else if (a(m1h1Var, qh31VarX2) && a(m1h1Var, qh31VarO2)) {
            bool = Boolean.TRUE;
        } else if (m1h1Var.l(qh31VarX2)) {
            if (b(m1h1Var, tebVar, qh31VarX2, qh31VarO2, false)) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
        } else if (m1h1Var.l(qh31VarO2)) {
            i0h1 i0h1VarQ5 = m1h1Var.q(qh31VarX2);
            if (i0h1VarQ5 instanceof e890) {
                Collection collectionP3 = m1h1Var.p(i0h1VarQ5);
                if (!(collectionP3 instanceof Collection) || !collectionP3.isEmpty()) {
                    Iterator it5 = collectionP3.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            qh31 qh31VarJ1 = m1h1Var.j0((e8b0) it5.next());
                            if (qh31VarJ1 == null || !m1h1Var.l(qh31VarJ1)) {
                            }
                        } else if (!b(m1h1Var, tebVar, qh31VarO2, qh31VarX2, true)) {
                            bool = null;
                        }
                    }
                } else if (!b(m1h1Var, tebVar, qh31VarO2, qh31VarX2, true)) {
                    bool = null;
                }
            } else if (!b(m1h1Var, tebVar, qh31VarO2, qh31VarX2, true)) {
                bool = null;
            }
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        i0h1 i0h1VarQ6 = m1h1Var.q(qh31VarO2);
        if ((m1h1Var.W(m1h1Var.q(qh31VarX2), i0h1VarQ6) && m1h1Var.R(i0h1VarQ6) == 0) || m1h1Var.o0(m1h1Var.q(qh31VarO2))) {
            return true;
        }
        if (!m1h1Var2.l0(qh31VarX2)) {
            if (m1h1Var2.D(i0h1VarQ6) || m1h1Var2.b0(i0h1VarQ6)) {
                zh91<qh31> zh91Var = new zh91();
                tebVar.h();
                ArrayDeque arrayDeque3 = (ArrayDeque) tebVar.g;
                arrayDeque3.getClass();
                bi91 bi91Var3 = (bi91) tebVar.h;
                bi91Var3.getClass();
                arrayDeque3.push(qh31VarX2);
                while (!arrayDeque3.isEmpty()) {
                    qh31 qh31Var3 = (qh31) arrayDeque3.pop();
                    qh31Var3.getClass();
                    if (bi91Var3.add(qh31Var3)) {
                        if (m1h1Var2.l0(qh31Var3)) {
                            zh91Var.add(qh31Var3);
                            g0h1Var = g0h1Var3;
                        } else {
                            g0h1Var = g0h1Var4;
                        }
                        if (g0h1Var.equals(g0h1Var3)) {
                            g0h1Var = null;
                        }
                        if (g0h1Var != null) {
                            Iterator it6 = m1h1Var2.p(m1h1Var2.q(qh31Var3)).iterator();
                            while (it6.hasNext()) {
                                arrayDeque3.add(g0h1Var.D(tebVar, (e8b0) it6.next()));
                                z3 = z3;
                            }
                        }
                    }
                }
                z = z3;
                tebVar.e();
                ArrayList arrayList2 = new ArrayList();
                for (qh31 qh31Var4 : zh91Var) {
                    qh31Var4.getClass();
                    r7h.W(d(tebVar, m1h1Var2, qh31Var4, i0h1VarQ6), arrayList2);
                }
                listC = arrayList2;
            } else {
                listC = c(tebVar, m1h1Var2, qh31VarX2, i0h1VarQ6);
            }
            listC.size();
            List<qh31> list = listC;
            arrayList = new ArrayList(q7h.U(list, 10));
            for (qh31 qh31Var5 : list) {
                qh31VarJ0 = m1h1Var.j0(tto1Var.r(qh31Var5));
                if (qh31VarJ0 == null) {
                    qh31Var5 = qh31VarJ0;
                }
                arrayList.add(qh31Var5);
            }
            size = arrayList.size();
            if (size != 0) {
                i0h1VarQ = m1h1Var.q(qh31VarX2);
                if (m1h1Var.D(i0h1VarQ)) {
                    return m1h1Var.y(i0h1VarQ);
                }
                if (m1h1Var.y(m1h1Var.q(qh31VarX2))) {
                    return true;
                }
                tebVar.h();
                arrayDeque = (ArrayDeque) tebVar.g;
                arrayDeque.getClass();
                bi91Var = (bi91) tebVar.h;
                bi91Var.getClass();
                arrayDeque.push(qh31VarX2);
                while (!arrayDeque.isEmpty()) {
                    qh31Var = (qh31) arrayDeque.pop();
                    qh31Var.getClass();
                    if (!bi91Var.add(qh31Var)) {
                        if (m1h1Var.l0(qh31Var)) {
                            g0h1Var2 = g0h1Var3;
                        } else {
                            g0h1Var2 = g0h1Var4;
                        }
                        if (g0h1Var2.equals(g0h1Var3)) {
                            g0h1Var2 = null;
                        }
                        if (g0h1Var2 == null) {
                            continue;
                        } else {
                            it = m1h1Var2.p(m1h1Var2.q(qh31Var)).iterator();
                            while (it.hasNext()) {
                                qh31VarD = g0h1Var2.D(tebVar, (e8b0) it.next());
                                if (m1h1Var.y(m1h1Var.q(qh31VarD))) {
                                    tebVar.e();
                                    return true;
                                }
                                arrayDeque.add(qh31VarD);
                            }
                        }
                    }
                }
                tebVar.e();
                return z;
            }
            if (size != 1) {
                return j(tebVar, m1h1Var, m1h1Var.H((qh31) o7h.p0(arrayList)), qh31VarO2);
            }
            x26Var = new x26(m1h1Var.R(i0h1VarQ6));
            iR = m1h1Var.R(i0h1VarQ6);
            r6 = z;
            while (true) {
                if (r6 < iR) {
                    zJ = j(tebVar, m1h1Var, x26Var, qh31VarO2);
                    break;
                }
                if (m1h1Var.b(m1h1Var.h0(i0h1VarQ6, (int) r6)) != 2) {
                    zJ = z;
                    break;
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
                for (qh31 qh31Var6 : arrayList) {
                    d0h1VarR = m1h1Var.r(qh31Var6, (int) r6);
                    if (d0h1VarR != null) {
                        boolean z5 = z4;
                        if (m1h1Var.V(d0h1VarR) != 3) {
                            d0h1VarR = null;
                        }
                        if (d0h1VarR == null && (e8b0VarN = m1h1Var.n(d0h1VarR)) != null) {
                            arrayList3.add(e8b0VarN);
                            z4 = z5;
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + qh31Var6 + ", subType: " + qh31VarX2 + ", superType: " + qh31VarO2).toString());
                }
                x26Var.add(m1h1Var.m(m1h1Var.v(arrayList3)));
                r6++;
            }
            if (zJ) {
                return z4;
            }
            zJ2 = z;
            for (qh31 qh31Var7 : arrayList) {
                if (zJ2) {
                    zJ2 = j(tebVar, m1h1Var, m1h1Var.H(qh31Var7), qh31VarO2);
                }
            }
            return zJ2;
        }
        listC = d(tebVar, m1h1Var2, qh31VarX2, i0h1VarQ6);
        z = false;
        listC.size();
        List<qh31> list2 = listC;
        arrayList = new ArrayList(q7h.U(list2, 10));
        while (r11.hasNext()) {
            qh31VarJ0 = m1h1Var.j0(tto1Var.r(qh31Var5));
            if (qh31VarJ0 == null) {
                qh31Var5 = qh31VarJ0;
            }
            arrayList.add(qh31Var5);
        }
        size = arrayList.size();
        if (size != 0) {
            i0h1VarQ = m1h1Var.q(qh31VarX2);
            if (m1h1Var.D(i0h1VarQ)) {
                return m1h1Var.y(i0h1VarQ);
            }
            if (m1h1Var.y(m1h1Var.q(qh31VarX2))) {
                return true;
            }
            tebVar.h();
            arrayDeque = (ArrayDeque) tebVar.g;
            arrayDeque.getClass();
            bi91Var = (bi91) tebVar.h;
            bi91Var.getClass();
            arrayDeque.push(qh31VarX2);
            while (!arrayDeque.isEmpty()) {
                qh31Var = (qh31) arrayDeque.pop();
                qh31Var.getClass();
                if (!bi91Var.add(qh31Var)) {
                    if (m1h1Var.l0(qh31Var)) {
                        g0h1Var2 = g0h1Var3;
                    } else {
                        g0h1Var2 = g0h1Var4;
                    }
                    if (g0h1Var2.equals(g0h1Var3)) {
                        g0h1Var2 = null;
                    }
                    if (g0h1Var2 == null) {
                        continue;
                    } else {
                        it = m1h1Var2.p(m1h1Var2.q(qh31Var)).iterator();
                        while (it.hasNext()) {
                            qh31VarD = g0h1Var2.D(tebVar, (e8b0) it.next());
                            if (m1h1Var.y(m1h1Var.q(qh31VarD))) {
                                tebVar.e();
                                return true;
                            }
                            arrayDeque.add(qh31VarD);
                        }
                    }
                }
            }
            tebVar.e();
            return z;
        }
        if (size != 1) {
            return j(tebVar, m1h1Var, m1h1Var.H((qh31) o7h.p0(arrayList)), qh31VarO2);
        }
        x26Var = new x26(m1h1Var.R(i0h1VarQ6));
        iR = m1h1Var.R(i0h1VarQ6);
        r6 = z;
        while (true) {
            if (r6 < iR) {
                zJ = j(tebVar, m1h1Var, x26Var, qh31VarO2);
                break;
            }
            if (m1h1Var.b(m1h1Var.h0(i0h1VarQ6, (int) r6)) != 2) {
                zJ = z;
                break;
            }
            ArrayList arrayList4 = new ArrayList(q7h.U(arrayList, 10));
            while (r11.hasNext()) {
                d0h1VarR = m1h1Var.r(qh31Var6, (int) r6);
                if (d0h1VarR != null) {
                    boolean z6 = z4;
                    if (m1h1Var.V(d0h1VarR) != 3) {
                        d0h1VarR = null;
                    }
                    if (d0h1VarR == null) {
                    }
                }
                throw new IllegalStateException(("Incorrect type: " + qh31Var6 + ", subType: " + qh31VarX2 + ", superType: " + qh31VarO2).toString());
            }
            x26Var.add(m1h1Var.m(m1h1Var.v(arrayList4)));
            r6++;
        }
        if (zJ) {
            return z4;
        }
        zJ2 = z;
        while (r3.hasNext()) {
            if (zJ2) {
                zJ2 = j(tebVar, m1h1Var, m1h1Var.H(qh31Var7), qh31VarO2);
            }
        }
        return zJ2;
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        int i2 = 0;
        switch (this.a) {
            case 4:
                String str3 = (String) linkedHashMap.get("id");
                if (str3 == null || str3.length() != 22) {
                    return null;
                }
                int length = str3.length();
                while (i2 < length) {
                    char cCharAt = str3.charAt(i2);
                    if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                        return null;
                    }
                    i2++;
                }
                return new f03(str3, xkg0Var, str2, str);
            case 5:
                String str4 = (String) linkedHashMap.get("audiobook_id");
                if (str4 == null || str4.length() != 22) {
                    return null;
                }
                int length2 = str4.length();
                while (i2 < length2) {
                    char cCharAt2 = str4.charAt(i2);
                    if (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && ('0' > cCharAt2 || cCharAt2 >= ':'))) {
                        return null;
                    }
                    i2++;
                }
                return new gy3(str4, str2, str, xkg0Var);
            case 13:
                return new dgc(xkg0Var, str2, str);
            default:
                return new crk(xkg0Var, str2, str);
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new v0i0(((Boolean) obj).booleanValue(), (String) obj2, (String) obj3);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 3:
                wv00 wv00Var = (uv00) obj;
                return !wv00Var.f || wv00Var.c();
            case 14:
                return ((spq0) obj).c();
            default:
                return !((uv00) obj).f;
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(647);
        view.setPadding(nk80VarI.a, nk80VarI.b, nk80VarI.c, nk80VarI.d);
        return hsl1.b;
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 11:
                return new mmr0((PlayerState) obj, (Boolean) obj2);
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
        }
    }
}
