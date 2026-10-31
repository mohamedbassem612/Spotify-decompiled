package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.spotify.appstorage.userdirectory.UserDirectoryCachePaths;
import com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class eso1 {
    public static b180 a;

    public static final FlowableDistinctUntilChanged A(x8c0 x8c0Var) {
        jpa0 jpa0Var = new jpa0(x8c0Var, (byte) 5);
        int i = Flowable.a;
        return new FlowableCreate(jpa0Var, BackpressureStrategy.b).t(Functions.a);
    }

    public static final void B() {
        xos0 xos0Var = xos0.e;
    }

    public static final le C(int i, uu0 uu0Var) {
        x3j1 x3j1Var;
        int i2;
        o0g1 o0g1Var;
        int i3;
        int i4 = 3;
        le leVar = new le((byte) 3);
        zjn0 zjn0Var = (zjn0) uu0Var.b;
        dhy0 dhy0Var = (dhy0) o7h.t0(i, ((y3j1) uu0Var.d).a);
        x3j1 x3j1Var2 = x3j1.d;
        if (dhy0Var == null) {
            o0g1Var = null;
        } else {
            Integer numValueOf = (dhy0Var.b & 1) == 1 ? Integer.valueOf(dhy0Var.c) : null;
            Integer numValueOf2 = (dhy0Var.b & 2) == 2 ? Integer.valueOf(dhy0Var.d) : null;
            if (numValueOf2 != null) {
                x3j1Var = new x3j1(numValueOf2.intValue() & 255, (numValueOf2.intValue() >> 8) & 255, (numValueOf2.intValue() >> 16) & 255);
            } else {
                x3j1Var = numValueOf != null ? new x3j1(numValueOf.intValue() & 7, (numValueOf.intValue() >> 3) & 15, (numValueOf.intValue() >> 7) & 127) : x3j1Var2;
            }
            bhy0 bhy0Var = dhy0Var.e;
            bhy0Var.getClass();
            int iOrdinal = bhy0Var.ordinal();
            if (iOrdinal == 0) {
                i2 = 1;
            } else if (iOrdinal == 1) {
                i2 = 2;
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                i2 = 3;
            }
            o0g1Var = new o0g1(x3j1Var, dhy0Var.h, i2, (dhy0Var.b & 8) == 8 ? Integer.valueOf(dhy0Var.f) : null, (dhy0Var.b & 16) == 16 ? zjn0Var.getString(dhy0Var.g) : null, (byte) 17);
        }
        if (o0g1Var == null && !uu0Var.a) {
            throw new InconsistentKotlinMetadataException("No VersionRequirement with the given id in the table", null);
        }
        chy0 chy0Var = o0g1Var != null ? (chy0) o0g1Var.d : null;
        int i5 = chy0Var == null ? -1 : ue01.a[chy0Var.ordinal()];
        if (i5 == -1) {
            i3 = 4;
        } else if (i5 == 1) {
            i3 = 1;
        } else if (i5 == 2) {
            i3 = 2;
        } else {
            if (i5 != 3) {
                eg.o();
                return null;
            }
            i3 = 3;
        }
        int i6 = o0g1Var != null ? o0g1Var.b : 0;
        int i7 = i6 == 0 ? -1 : ue01.b[l1d.C(i6)];
        if (i7 != -1) {
            if (i7 == 1) {
                i4 = 1;
            } else if (i7 == 2) {
                i4 = 2;
            } else if (i7 != 3) {
                eg.o();
                return null;
            }
        }
        leVar.b = i3;
        leVar.e = i4;
        leVar.d = o0g1Var != null ? (Integer) o0g1Var.e : null;
        leVar.c = o0g1Var != null ? (String) o0g1Var.f : null;
        if (o0g1Var != null) {
            x3j1Var2 = (x3j1) o0g1Var.c;
        }
        leVar.f = new d4b0(x3j1Var2.a, x3j1Var2.b, x3j1Var2.c);
        return leVar;
    }

    public static final qim0 D(qim0 qim0Var, Object obj, vu30 vu30Var) {
        return obj != null ? (qim0) vu30Var.invoke(qim0Var, obj) : qim0Var;
    }

    public static final String E(q640 q640Var) {
        boolean z = q640Var.c;
        u740 u740Var = q640Var.a;
        String str = null;
        if (z) {
            if (u740Var != null) {
                str = u740Var.c.a;
            }
        } else if (u740Var != null) {
            str = u740Var.c.b;
        }
        fi10 fi10VarQ = q(q640Var);
        if (fi10VarQ != null) {
            return fi10VarQ.b;
        }
        return str == null ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0290  */
    public static l3b0 F(hfy0 hfy0Var, zjn0 zjn0Var, boolean z, int i) {
        boolean z2 = false;
        boolean z3 = (i & 2) != 0 ? false : z;
        l3b0 l3b0Var = new l3b0();
        l141 l141Var = new l141(hfy0Var.a1);
        y3j1 y3j1Var = y3j1.b;
        uu0 uu0VarV = new uu0(zjn0Var, l141Var, l0p1.h(hfy0Var.c1), z3, z6x.a, 16).v(hfy0Var.g);
        zjn0 zjn0Var2 = (zjn0) uu0VarV.b;
        List list = (List) uu0VarV.h;
        l141 l141Var2 = (l141) uu0VarV.c;
        l3b0Var.a = hfy0Var.d;
        l3b0Var.b = ero1.l(zjn0Var2, hfy0Var.e);
        for (wgy0 wgy0Var : hfy0Var.g) {
            wgy0Var.getClass();
            l3b0Var.c.add(L(wgy0Var, uu0VarV));
        }
        Iterator it = p2o1.G(hfy0Var, l141Var2).iterator();
        while (it.hasNext()) {
            l3b0Var.d.add(K((rgy0) it.next(), uu0VarV));
        }
        Iterator it2 = hfy0Var.P0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            kfy0 kfy0Var = (kfy0) it2.next();
            kfy0Var.getClass();
            p3b0 p3b0Var = new p3b0(kfy0Var.d);
            for (zgy0 zgy0Var : kfy0Var.e) {
                zgy0Var.getClass();
                p3b0Var.b.add(M(zgy0Var, uu0VarV));
            }
            for (Integer num : kfy0Var.f) {
                num.getClass();
                p3b0Var.c.add(C(num.intValue(), uu0VarV));
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ((gja0) ((zjj0) it3.next())).getClass();
                uia0 uia0Var = (uia0) ulo1.q(p3b0Var.e, uia0.b);
                for (efy0 efy0Var : kfy0Var.h) {
                    efy0Var.getClass();
                    p3b0Var.d.add(ero1.o(efy0Var, zjn0Var2));
                }
                vz00 vz00Var = fka0.a;
                fja0 fja0VarA = fka0.a(kfy0Var, zjn0Var2, l141Var2);
                uia0Var.a = fja0VarA != null ? new ija0(fja0VarA.d, fja0VarA.e) : null;
            }
            l3b0Var.h.add(p3b0Var);
        }
        O(l3b0Var, hfy0Var.Q0, hfy0Var.R0, hfy0Var.S0, uu0VarV);
        if ((hfy0Var.c & 4) == 4) {
            zjn0Var2.getString(hfy0Var.f);
        }
        for (Integer num2 : hfy0Var.X) {
            num2.getClass();
            l3b0Var.i.add(zjn0Var2.getString(num2.intValue()));
        }
        for (tfy0 tfy0Var : hfy0Var.T0) {
            if ((tfy0Var.c & 1) != 1) {
                throw new InconsistentKotlinMetadataException("No name for EnumEntry", null);
            }
            l3b0Var.j.add(zjn0Var2.getString(tfy0Var.d));
            ye90 ye90Var = new ye90(zjn0Var2.getString(tfy0Var.d));
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                ((gja0) ((zjj0) it4.next())).getClass();
                for (efy0 efy0Var2 : tfy0Var.e) {
                    ArrayList arrayList = (ArrayList) ye90Var.c;
                    efy0Var2.getClass();
                    arrayList.add(ero1.o(efy0Var2, zjn0Var2));
                }
            }
            l3b0Var.k.add(ye90Var);
        }
        for (Integer num3 : hfy0Var.U0) {
            num3.getClass();
            l3b0Var.l.add(ero1.l(zjn0Var2, num3.intValue()));
        }
        if ((hfy0Var.c & 8) == 8) {
            l3b0Var.m = zjn0Var2.getString(hfy0Var.W0);
        }
        int i2 = hfy0Var.c;
        rgy0 rgy0VarA = (i2 & 16) == 16 ? hfy0Var.X0 : (i2 & 32) == 32 ? l141Var2.a(hfy0Var.Y0) : null;
        if (rgy0VarA == null) {
            if ((hfy0Var.c & 8) == 8) {
                Iterator it5 = hfy0Var.R0.iterator();
                Object obj = null;
                while (true) {
                    if (!it5.hasNext()) {
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    Object next = it5.next();
                    ggy0 ggy0Var = (ggy0) next;
                    ggy0Var.getClass();
                    if (p2o1.C(ggy0Var, l141Var2) == null && zjn0Var2.getString(ggy0Var.f).equals(zjn0Var2.getString(hfy0Var.W0))) {
                        if (!z2) {
                            z2 = true;
                            obj = next;
                        }
                    }
                    obj = null;
                    break;
                }
                ggy0 ggy0Var2 = (ggy0) obj;
                if (ggy0Var2 != null) {
                    rgy0VarA = p2o1.F(ggy0Var2, l141Var2);
                } else {
                    rgy0VarA = null;
                }
            } else {
                rgy0VarA = null;
            }
        }
        l3b0Var.n = rgy0VarA != null ? K(rgy0VarA, uu0VarV) : null;
        Iterator it6 = p2o1.m(hfy0Var, l141Var2).iterator();
        while (it6.hasNext()) {
            l3b0Var.f27p.add(K((rgy0) it6.next(), uu0VarV));
        }
        for (Integer num4 : hfy0Var.b1) {
            num4.getClass();
            l3b0Var.q.add(C(num4.intValue(), uu0VarV));
        }
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            ((gja0) ((zjj0) it7.next())).getClass();
            sia0 sia0VarU = don1.u(l3b0Var);
            for (efy0 efy0Var3 : hfy0Var.Z0) {
                efy0Var3.getClass();
                l3b0Var.o.add(ero1.o(efy0Var3, zjn0Var2));
            }
            Integer num5 = (Integer) z0o1.l(hfy0Var, eka0.i);
            if (num5 != null) {
                zjn0Var2.getString(num5.intValue());
            }
            for (ggy0 ggy0Var3 : (List) hfy0Var.i(eka0.h)) {
                ArrayList arrayList2 = sia0VarU.a;
                ggy0Var3.getClass();
                arrayList2.add(J(ggy0Var3, uu0VarV));
            }
            Integer num6 = (Integer) z0o1.l(hfy0Var, eka0.g);
            sia0VarU.b = num6 != null ? zjn0Var2.getString(num6.intValue()) : "main";
        }
        return l3b0Var;
    }

    public static final be30 G(wfy0 wfy0Var, uu0 uu0Var) {
        be30 be30Var = new be30((byte) 1);
        int i = wfy0Var.c;
        rgy0 rgy0VarA = null;
        if ((wfy0Var.b & 4) == 4) {
            vfy0 vfy0Var = wfy0Var.e;
            if (vfy0Var == null) {
                hhg1.n("Required value was null.");
                return null;
            }
            int iOrdinal = vfy0Var.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                eg.o();
                return null;
            }
        }
        l141 l141Var = (l141) uu0Var.c;
        int i2 = wfy0Var.b;
        if ((i2 & 8) == 8) {
            rgy0VarA = wfy0Var.f;
        } else if ((i2 & 16) == 16) {
            rgy0VarA = l141Var.a(wfy0Var.g);
        }
        if (rgy0VarA != null) {
            K(rgy0VarA, uu0Var);
        }
        for (wfy0 wfy0Var2 : wfy0Var.h) {
            wfy0Var2.getClass();
            be30Var.a.add(G(wfy0Var2, uu0Var));
        }
        for (wfy0 wfy0Var3 : wfy0Var.i) {
            wfy0Var3.getClass();
            be30Var.b.add(G(wfy0Var3, uu0Var));
        }
        return be30Var;
    }

    public static final u3b0 H(yfy0 yfy0Var, uu0 uu0Var) {
        ArrayList arrayList;
        u3b0 u3b0Var = new u3b0(yfy0Var.d, ((zjn0) uu0Var.b).getString(yfy0Var.f));
        uu0 uu0VarV = uu0Var.v(yfy0Var.i);
        zjn0 zjn0Var = (zjn0) uu0VarV.b;
        l141 l141Var = (l141) uu0VarV.c;
        for (wgy0 wgy0Var : yfy0Var.i) {
            wgy0Var.getClass();
            u3b0Var.c.add(L(wgy0Var, uu0VarV));
        }
        rgy0 rgy0VarB = p2o1.B(yfy0Var, l141Var);
        u3b0Var.d = rgy0VarB != null ? K(rgy0VarB, uu0VarV) : null;
        Iterator it = yfy0Var.O0.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = u3b0Var.g;
            if (!zHasNext) {
                break;
            }
            zgy0 zgy0Var = (zgy0) it.next();
            zgy0Var.getClass();
            arrayList.add(M(zgy0Var, uu0VarV));
        }
        if (yfy0Var.O0.isEmpty() && !yfy0Var.Y.isEmpty()) {
            Iterator it2 = p2o1.n(yfy0Var, l141Var).iterator();
            while (it2.hasNext()) {
                y3b0 y3b0VarK = K((rgy0) it2.next(), uu0VarV);
                c4b0 c4b0Var = new c4b0(0, "_");
                c4b0Var.c = y3b0VarK;
                arrayList.add(c4b0Var);
            }
        }
        for (zgy0 zgy0Var2 : yfy0Var.P0) {
            zgy0Var2.getClass();
            u3b0Var.f.add(M(zgy0Var2, uu0VarV));
        }
        u3b0Var.h = K(p2o1.E(yfy0Var, l141Var), uu0VarV);
        if ((yfy0Var.c & 256) == 256) {
            mfy0 mfy0Var = yfy0Var.S0;
            ArrayList arrayList2 = new ArrayList(1);
            for (rfy0 rfy0Var : mfy0Var.b) {
                if ((rfy0Var.b & 1) == 1) {
                    pfy0 pfy0Var = rfy0Var.c;
                    if (pfy0Var == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    int iOrdinal = pfy0Var.ordinal();
                    if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    if ((rfy0Var.b & 4) == 4) {
                        qfy0 qfy0Var = rfy0Var.f;
                        if (qfy0Var == null) {
                            hhg1.n("Required value was null.");
                            return null;
                        }
                        int iOrdinal2 = qfy0Var.ordinal();
                        if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 2) {
                            eg.o();
                            return null;
                        }
                    }
                    tx txVar = new tx((byte) 1);
                    for (wfy0 wfy0Var : rfy0Var.d) {
                        wfy0Var.getClass();
                        txVar.a.add(G(wfy0Var, uu0VarV));
                    }
                    if ((rfy0Var.b & 2) == 2) {
                        G(rfy0Var.e, uu0VarV);
                    }
                    arrayList2.add(txVar);
                }
            }
        }
        for (Integer num : yfy0Var.R0) {
            num.getClass();
            u3b0Var.i.add(C(num.intValue(), uu0VarV));
        }
        Iterator it3 = ((List) uu0VarV.h).iterator();
        while (it3.hasNext()) {
            ((gja0) ((zjj0) it3.next())).getClass();
            yia0 yia0Var = (yia0) ulo1.q(u3b0Var.k, yia0.b);
            for (efy0 efy0Var : yfy0Var.U0) {
                efy0Var.getClass();
                u3b0Var.j.add(ero1.o(efy0Var, zjn0Var));
            }
            for (efy0 efy0Var2 : yfy0Var.V0) {
                efy0Var2.getClass();
                u3b0Var.e.add(ero1.o(efy0Var2, zjn0Var));
            }
            vz00 vz00Var = fka0.a;
            fja0 fja0VarD = fka0.d(yfy0Var, zjn0Var, l141Var);
            yia0Var.a = fja0VarD != null ? new ija0(fja0VarD.d, fja0VarD.e) : null;
            Integer num2 = (Integer) z0o1.l(yfy0Var, eka0.c);
            if (num2 != null) {
                zjn0Var.getString(num2.intValue());
            }
        }
        return u3b0Var;
    }

    public static v3b0 I(cgy0 cgy0Var, zjn0 zjn0Var, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        v3b0 v3b0Var = new v3b0();
        l141 l141Var = new l141(cgy0Var.g);
        y3j1 y3j1Var = y3j1.b;
        uu0 uu0Var = new uu0(zjn0Var, l141Var, l0p1.h(cgy0Var.h), z2, z6x.a, 16);
        O(v3b0Var, cgy0Var.d, cgy0Var.e, cgy0Var.f, uu0Var);
        Iterator it = ((List) uu0Var.h).iterator();
        while (it.hasNext()) {
            ((gja0) ((zjj0) it.next())).getClass();
            kja0 kja0Var = (kja0) ulo1.q(v3b0Var.d, kja0.b);
            for (ggy0 ggy0Var : (List) cgy0Var.i(eka0.l)) {
                ArrayList arrayList = kja0Var.a;
                ggy0Var.getClass();
                arrayList.add(J(ggy0Var, uu0Var));
            }
            Integer num = (Integer) z0o1.l(cgy0Var, eka0.k);
            if (num != null) {
                ((zjn0) uu0Var.b).getString(num.intValue());
            }
        }
        return v3b0Var;
    }

    public static final w3b0 J(ggy0 ggy0Var, uu0 uu0Var) {
        ArrayList arrayList;
        w3b0 w3b0Var = new w3b0(ggy0Var.d, (ggy0Var.c & 256) == 256 ? ggy0Var.Q0 : r(ggy0Var.d), (ggy0Var.c & 512) == 512 ? ggy0Var.R0 : r(ggy0Var.d), ((zjn0) uu0Var.b).getString(ggy0Var.f));
        uu0 uu0VarV = uu0Var.v(ggy0Var.i);
        zjn0 zjn0Var = (zjn0) uu0VarV.b;
        l141 l141Var = (l141) uu0VarV.c;
        for (wgy0 wgy0Var : ggy0Var.i) {
            wgy0Var.getClass();
            w3b0Var.e.add(L(wgy0Var, uu0VarV));
        }
        rgy0 rgy0VarC = p2o1.C(ggy0Var, l141Var);
        w3b0Var.f = rgy0VarC != null ? K(rgy0VarC, uu0VarV) : null;
        Iterator it = ggy0Var.O0.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = w3b0Var.h;
            if (!zHasNext) {
                break;
            }
            zgy0 zgy0Var = (zgy0) it.next();
            zgy0Var.getClass();
            arrayList.add(M(zgy0Var, uu0VarV));
        }
        if (ggy0Var.O0.isEmpty() && !ggy0Var.Y.isEmpty()) {
            Iterator it2 = p2o1.o(ggy0Var, l141Var).iterator();
            while (it2.hasNext()) {
                y3b0 y3b0VarK = K((rgy0) it2.next(), uu0VarV);
                c4b0 c4b0Var = new c4b0(0, "_");
                c4b0Var.c = y3b0VarK;
                arrayList.add(c4b0Var);
            }
        }
        if ((ggy0Var.c & 128) == 128) {
            w3b0Var.i = M(ggy0Var.P0, uu0VarV);
        }
        w3b0Var.j = K(p2o1.F(ggy0Var, l141Var), uu0VarV);
        for (Integer num : ggy0Var.S0) {
            num.getClass();
            w3b0Var.k.add(C(num.intValue(), uu0VarV));
        }
        Iterator it3 = ((List) uu0VarV.h).iterator();
        while (it3.hasNext()) {
            ((gja0) ((zjj0) it3.next())).getClass();
            oja0 oja0VarV = don1.v(w3b0Var);
            for (efy0 efy0Var : ggy0Var.U0) {
                efy0Var.getClass();
                w3b0Var.l.add(ero1.o(efy0Var, zjn0Var));
            }
            List<efy0> list = ggy0Var.V0;
            ArrayList arrayList2 = w3b0Var.c.b;
            for (efy0 efy0Var2 : list) {
                efy0Var2.getClass();
                arrayList2.add(ero1.o(efy0Var2, zjn0Var));
            }
            x3b0 x3b0Var = w3b0Var.d;
            if (x3b0Var != null) {
                List<efy0> list2 = ggy0Var.W0;
                ArrayList arrayList3 = x3b0Var.b;
                for (efy0 efy0Var3 : list2) {
                    efy0Var3.getClass();
                    arrayList3.add(ero1.o(efy0Var3, zjn0Var));
                }
            }
            for (efy0 efy0Var4 : ggy0Var.X0) {
                efy0Var4.getClass();
                w3b0Var.g.add(ero1.o(efy0Var4, zjn0Var));
            }
            for (efy0 efy0Var5 : ggy0Var.Y0) {
                efy0Var5.getClass();
                w3b0Var.m.add(ero1.o(efy0Var5, zjn0Var));
            }
            for (efy0 efy0Var6 : ggy0Var.Z0) {
                efy0Var6.getClass();
                w3b0Var.n.add(ero1.o(efy0Var6, zjn0Var));
            }
            vz00 vz00Var = fka0.a;
            eja0 eja0VarB = fka0.b(ggy0Var, zjn0Var, l141Var, true);
            yja0 yja0Var = (yja0) z0o1.l(ggy0Var, eka0.d);
            wja0 wja0Var = (yja0Var == null || !yja0Var.i()) ? null : yja0Var.e;
            wja0 wja0Var2 = (yja0Var == null || (yja0Var.b & 8) != 8) ? null : yja0Var.f;
            oja0VarV.a = ((Number) ggy0Var.i(eka0.e)).intValue();
            oja0VarV.b = eja0VarB != null ? new via0(eja0VarB.d, eja0VarB.e) : null;
            oja0VarV.c = wja0Var != null ? new ija0(zjn0Var.getString(wja0Var.c), zjn0Var.getString(wja0Var.d)) : null;
            oja0VarV.d = wja0Var2 != null ? new ija0(zjn0Var.getString(wja0Var2.c), zjn0Var.getString(wja0Var2.d)) : null;
            wja0 wja0Var3 = (yja0Var == null || (yja0Var.b & 2) != 2) ? null : yja0Var.d;
            oja0VarV.e = wja0Var3 != null ? new ija0(zjn0Var.getString(wja0Var3.c), zjn0Var.getString(wja0Var3.d)) : null;
            wja0 wja0Var4 = (yja0Var == null || !yja0Var.h()) ? null : yja0Var.g;
            oja0VarV.f = wja0Var4 != null ? new ija0(zjn0Var.getString(wja0Var4.c), zjn0Var.getString(wja0Var4.d)) : null;
        }
        return w3b0Var;
    }

    public static final y3b0 K(rgy0 rgy0Var, uu0 uu0Var) {
        z0o1 o3b0Var;
        int i;
        l141 l141Var = (l141) uu0Var.c;
        zjn0 zjn0Var = (zjn0) uu0Var.b;
        y3b0 y3b0Var = new y3b0((rgy0Var.e ? 1 : 0) + (rgy0Var.Q0 << 1));
        t3b0 t3b0Var = null;
        if (rgy0Var.n()) {
            o3b0Var = new m3b0(ero1.l(zjn0Var, rgy0Var.i));
        } else {
            int i2 = rgy0Var.c;
            if ((i2 & 128) == 128) {
                o3b0Var = new n3b0(ero1.l(zjn0Var, rgy0Var.Y));
            } else if ((i2 & 32) == 32) {
                o3b0Var = new o3b0(rgy0Var.t);
            } else {
                if ((i2 & 64) != 64) {
                    throw new InconsistentKotlinMetadataException("No classifier (class, type alias or type parameter) recorded for Type", null);
                }
                Integer numO = uu0Var.o(rgy0Var.X);
                if (numO == null) {
                    throw new InconsistentKotlinMetadataException("No type parameter id for ".concat(zjn0Var.getString(rgy0Var.X)), null);
                }
                o3b0Var = new o3b0(numO.intValue());
            }
        }
        y3b0Var.b = o3b0Var;
        for (pgy0 pgy0Var : rgy0Var.d) {
            ogy0 ogy0Var = pgy0Var.c;
            if (ogy0Var == null) {
                hhg1.n("Required value was null.");
                return null;
            }
            int iOrdinal = ogy0Var.ordinal();
            if (iOrdinal != 0) {
                i = 3;
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        i = 1;
                    } else {
                        if (iOrdinal != 3) {
                            eg.o();
                            return null;
                        }
                        i = 0;
                    }
                }
            } else {
                i = 2;
            }
            ArrayList arrayList = y3b0Var.c;
            if (i != 0) {
                int i3 = pgy0Var.b;
                rgy0 rgy0VarA = (i3 & 2) == 2 ? pgy0Var.d : (i3 & 4) == 4 ? l141Var.a(pgy0Var.e) : null;
                if (rgy0VarA == null) {
                    throw new InconsistentKotlinMetadataException("No type argument for non-STAR projection in Type", null);
                }
                arrayList.add(new b4b0(i, K(rgy0VarA, uu0Var)));
            } else {
                arrayList.add(b4b0.c);
            }
        }
        int i4 = rgy0Var.c;
        rgy0 rgy0VarA2 = (i4 & 1024) == 1024 ? rgy0Var.O0 : (i4 & 2048) == 2048 ? l141Var.a(rgy0Var.P0) : null;
        y3b0Var.d = rgy0VarA2 != null ? K(rgy0VarA2, uu0Var) : null;
        rgy0 rgy0VarZ = p2o1.z(rgy0Var, l141Var);
        y3b0Var.e = rgy0VarZ != null ? K(rgy0VarZ, uu0Var) : null;
        int i5 = rgy0Var.c;
        rgy0 rgy0VarA3 = (i5 & 4) == 4 ? rgy0Var.g : (i5 & 8) == 8 ? l141Var.a(rgy0Var.h) : null;
        if (rgy0VarA3 != null) {
            y3b0 y3b0VarK = K(rgy0VarA3, uu0Var);
            String string = (rgy0Var.c & 2) == 2 ? zjn0Var.getString(rgy0Var.f) : null;
            t3b0 t3b0Var2 = new t3b0();
            t3b0Var2.a = y3b0VarK;
            t3b0Var2.b = string;
            t3b0Var = t3b0Var2;
        }
        y3b0Var.f = t3b0Var;
        Iterator it = ((List) uu0Var.h).iterator();
        while (it.hasNext()) {
            ((gja0) ((zjj0) it.next())).getClass();
            lka0 lka0Var = (lka0) ulo1.q(y3b0Var.g, lka0.c);
            lka0Var.a = ((Boolean) rgy0Var.i(eka0.f)).booleanValue();
            for (efy0 efy0Var : rgy0Var.R0) {
                ArrayList arrayList2 = lka0Var.b;
                efy0Var.getClass();
                arrayList2.add(ero1.o(efy0Var, zjn0Var));
            }
        }
        return y3b0Var;
    }

    public static final a4b0 L(wgy0 wgy0Var, uu0 uu0Var) {
        zjn0 zjn0Var = (zjn0) uu0Var.b;
        vgy0 vgy0Var = wgy0Var.g;
        if (vgy0Var == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        int iOrdinal = vgy0Var.ordinal();
        int i = 2;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i = 3;
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                i = 1;
            }
        }
        boolean z = wgy0Var.f;
        a4b0 a4b0Var = new a4b0(z ? 1 : 0, wgy0Var.d, i, zjn0Var.getString(wgy0Var.e));
        Iterator it = p2o1.K(wgy0Var, (l141) uu0Var.c).iterator();
        while (it.hasNext()) {
            a4b0Var.e.add(K((rgy0) it.next(), uu0Var));
        }
        Iterator it2 = ((List) uu0Var.h).iterator();
        while (it2.hasNext()) {
            ((gja0) ((zjj0) it2.next())).getClass();
            mka0 mka0Var = (mka0) ulo1.q(a4b0Var.f, mka0.b);
            for (efy0 efy0Var : wgy0Var.X) {
                ArrayList arrayList = mka0Var.a;
                efy0Var.getClass();
                arrayList.add(ero1.o(efy0Var, zjn0Var));
            }
        }
        return a4b0Var;
    }

    public static final c4b0 M(zgy0 zgy0Var, uu0 uu0Var) {
        int i = zgy0Var.d;
        int i2 = zgy0Var.e;
        zjn0 zjn0Var = (zjn0) uu0Var.b;
        c4b0 c4b0Var = new c4b0(i, zjn0Var.getString(i2));
        l141 l141Var = (l141) uu0Var.c;
        c4b0Var.c = K(p2o1.J(zgy0Var, l141Var), uu0Var);
        int i3 = zgy0Var.c;
        rgy0 rgy0VarA = (i3 & 16) == 16 ? zgy0Var.h : (i3 & 32) == 32 ? l141Var.a(zgy0Var.i) : null;
        c4b0Var.d = rgy0VarA != null ? K(rgy0VarA, uu0Var) : null;
        if ((zgy0Var.c & 64) == 64) {
            ero1.p(zgy0Var.X, zjn0Var);
        }
        Iterator it = ((List) uu0Var.h).iterator();
        while (it.hasNext()) {
            ((gja0) ((zjj0) it.next())).getClass();
            for (efy0 efy0Var : zgy0Var.t) {
                efy0Var.getClass();
                c4b0Var.e.add(ero1.o(efy0Var, zjn0Var));
            }
        }
        return c4b0Var;
    }

    public static final fli0 N(hki0 hki0Var) {
        if (hki0Var instanceof k161) {
            k161 k161Var = (k161) hki0Var;
            return new fli0(k161Var.a, k161Var.f, k161Var.b, k161Var.g, new cx(k161Var.e, k161Var.i, k161Var.j, k161Var.k, k161Var.l, k161Var.m, k161Var.n, k161Var.o, k161Var.q), 2, k161Var.h, k161Var.f24p);
        }
        if (!(hki0Var instanceof o9g0)) {
            if (hki0Var instanceof y0c0) {
                y0c0 y0c0Var = (y0c0) hki0Var;
                return new fli0(y0c0Var.a, y0c0Var.f, y0c0Var.b, y0c0Var.g, new ax(y0c0Var.e), 2, y0c0Var.h, y0c0Var.i);
            }
            eg.o();
            return null;
        }
        o9g0 o9g0Var = (o9g0) hki0Var;
        String str = o9g0Var.a;
        String str2 = o9g0Var.b;
        String str3 = o9g0Var.e;
        String str4 = o9g0Var.l;
        boolean z = o9g0Var.i;
        boolean z2 = o9g0Var.k;
        Boolean bool = o9g0Var.j;
        return new fli0(str, o9g0Var.f, str2, o9g0Var.g, new bx(str3, str4, z, z2, bool != null, bool != null ? bool.booleanValue() : false, o9g0Var.o), 2, o9g0Var.h, o9g0Var.f35p);
    }

    public static final void O(q3b0 q3b0Var, List list, List list2, List list3, uu0 uu0Var) {
        rgy0 rgy0VarA;
        rgy0 rgy0VarA2;
        ArrayList arrayListC = q3b0Var.c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayListC.add(H((yfy0) it.next(), uu0Var));
        }
        ArrayList arrayListA = q3b0Var.a();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayListA.add(J((ggy0) it2.next(), uu0Var));
        }
        ArrayList arrayListB = q3b0Var.b();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            tgy0 tgy0Var = (tgy0) it3.next();
            int i = tgy0Var.d;
            ((zjn0) uu0Var.b).getString(tgy0Var.e);
            z3b0 z3b0Var = new z3b0(i);
            uu0 uu0VarV = uu0Var.v(tgy0Var.f);
            l141 l141Var = (l141) uu0VarV.c;
            for (wgy0 wgy0Var : tgy0Var.f) {
                wgy0Var.getClass();
                z3b0Var.b.add(L(wgy0Var, uu0VarV));
            }
            int i2 = tgy0Var.c;
            if ((i2 & 4) == 4) {
                rgy0VarA = tgy0Var.g;
            } else {
                if ((i2 & 8) != 8) {
                    eg.m("No underlyingType in ProtoBuf.TypeAlias");
                    return;
                }
                rgy0VarA = l141Var.a(tgy0Var.h);
            }
            K(rgy0VarA, uu0VarV);
            int i3 = tgy0Var.c;
            if ((i3 & 16) == 16) {
                rgy0VarA2 = tgy0Var.i;
            } else {
                if ((i3 & 32) != 32) {
                    eg.m("No expandedType in ProtoBuf.TypeAlias");
                    return;
                }
                rgy0VarA2 = l141Var.a(tgy0Var.t);
            }
            K(rgy0VarA2, uu0VarV);
            for (efy0 efy0Var : tgy0Var.X) {
                efy0Var.getClass();
                z3b0Var.c.add(ero1.o(efy0Var, (zjn0) uu0VarV.b));
            }
            for (Integer num : tgy0Var.Y) {
                num.getClass();
                z3b0Var.d.add(C(num.intValue(), uu0VarV));
            }
            Iterator it4 = ((List) uu0VarV.h).iterator();
            while (it4.hasNext()) {
                ((zjj0) it4.next()).getClass();
            }
            arrayListB.add(z3b0Var);
        }
    }

    public static final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1297422140);
        if (x340Var.Y(i & 1, i != 0)) {
            f65 f65Var = (f65) x340Var.k(t4k.s);
            String strO0 = cwl1.o0(x340Var, 2131953549);
            String strO1 = cwl1.o0(x340Var, 2131953550);
            uwr uwrVar = cbx.a;
            zma1 zma1Var = new zma1(cbx.a(x340Var).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61438);
            boolean zI = x340Var.i(f65Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new j03(f65Var, (byte) 2);
                x340Var.s0(objT);
            }
            af5 af5VarW = ot11.w(strO1, new hhg[]{new hhg(strO0, "https://www.spotify.com/legal/privacy-policy/?nd=1", zma1Var, (iu30) objT)});
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).b.a, 0.0f, 2, u291.f(dug.f(nim0.a, cbx.a(x340Var).a.c, d4o1.a), 1.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.d(af5VarW, cbx.a(x340Var).b.b, uyn1.B(qim0VarZ, 0.0f, 0.0f, 0.0f, 16.0f, 7), cbx.d(x340Var).m, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4064);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qza((byte) 11, i, false);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:182:0x02fa  */
    public static final void b(Uri uri, ksl kslVar, p3v p3vVar, zvx zvxVar, ecx ecxVar, j6m j6mVar, tl3 tl3Var, ColorFilter colorFilter, qux quxVar, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i, int i2) throws NoWhenBranchMatchedException {
        int i3;
        int i4;
        x340 x340Var;
        x340 x340Var2;
        jmr0 jmr0VarG;
        boolean z3;
        jmr0 jmr0Var;
        boolean z4;
        iu30 d5e1Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(1257387147);
        if ((i & 6) == 0) {
            i3 = (x340Var3.g(uri) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var3.g(kslVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var3.g(p3vVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? x340Var3.g(zvxVar) : x340Var3.i(zvxVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (i & 32768) == 0 ? x340Var3.g(ecxVar) : x340Var3.i(ecxVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var3.i(j6mVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= x340Var3.i(tl3Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= x340Var3.i(colorFilter) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= (i & 134217728) == 0 ? x340Var3.g(quxVar) : x340Var3.i(quxVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= x340Var3.h(z) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (x340Var3.h(z2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var3.i(qim0Var) ? 32 : 16;
        }
        boolean z5 = true;
        if (x340Var3.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            gw70 gw70Var = (gw70) x340Var3.k(oi7.a);
            int i5 = i3;
            boolean zG = ((i3 & 14) == 4) | x340Var3.g(gw70Var) | ((i5 & 1879048192) == 536870912) | ((i4 & 14) == 4);
            Object objT = x340Var3.T();
            if (zG || objT == m4cVar) {
                ixg ixgVarB = gw70Var.b(uri);
                if (z) {
                    ixgVarB.g = false;
                }
                if (z2) {
                    ixgVarB.e();
                }
                objT = new mmr0(ixgVarB.a(), ixgVarB.a);
                x340Var3.s0(objT);
            }
            mmr0 mmr0Var = (mmr0) objT;
            zy70 zy70Var = (zy70) mmr0Var.a;
            rf01 rf01Var = (rf01) mmr0Var.b;
            jmr0 jmr0VarG2 = null;
            String str = kslVar instanceof jsl ? ((jsl) kslVar).a : null;
            if ((i5 & 57344) != 16384 && ((i5 & 32768) == 0 || !x340Var3.i(ecxVar))) {
                z5 = false;
            }
            Object objT2 = x340Var3.T();
            if (z5 || objT2 == m4cVar) {
                objT2 = new hzw(ecxVar, (byte) 5);
                x340Var3.s0(objT2);
            }
            qim0 qim0VarD = D(qim0Var, p3vVar, (vu30) objT2);
            Object objT3 = x340Var3.T();
            if (objT3 == m4cVar) {
                objT3 = lgx.e;
                x340Var3.s0(objT3);
            }
            qim0 qim0VarD2 = D(qim0VarD, ecxVar, (vu30) objT3);
            Object objT4 = x340Var3.T();
            if (objT4 == m4cVar) {
                objT4 = lgx.f;
                x340Var3.s0(objT4);
            }
            qim0 qim0VarD3 = D(qim0VarD2, zvxVar, (vu30) objT4);
            if (quxVar instanceof oux) {
                x340Var3.i0(195827003);
                x340Var3.r(false);
                x340Var2 = x340Var3;
                jmr0VarG = null;
            } else if (quxVar instanceof nux) {
                x340Var3.i0(195884757);
                hux huxVar = ((nux) quxVar).a;
                if (huxVar == null) {
                    x340Var3.i0(195884756);
                    x340Var3.r(false);
                    x340Var2 = x340Var3;
                    z3 = false;
                    jmr0VarG = null;
                } else {
                    x340Var3.i0(2084528845);
                    z3 = false;
                    jmr0VarG = hso1.G(huxVar, 0L, 0L, x340Var3, 8, 30);
                    x340Var2 = x340Var3;
                    x340Var2.r(false);
                }
                x340Var2.r(z3);
            } else {
                x340Var2 = x340Var3;
                if (!(quxVar instanceof pux)) {
                    throw p3d1.k(x340Var2, 2084525434, false);
                }
                x340Var2.i0(2084530605);
                x340Var2.r(false);
                jmr0VarG = ((pux) quxVar).a;
            }
            if (quxVar instanceof oux) {
                x340Var2.i0(-2043061605);
                x340Var2.r(false);
                qim0VarD3 = qim0VarD3;
                jmr0VarG = jmr0VarG;
            } else {
                if (quxVar instanceof nux) {
                    x340Var2.i0(-2043009803);
                    hux huxVar2 = ((nux) quxVar).b;
                    if (huxVar2 == null) {
                        x340Var2.i0(-2043009804);
                        z4 = false;
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1035734867);
                        x340 x340Var4 = x340Var2;
                        jmr0VarG2 = hso1.G(huxVar2, 0L, 0L, x340Var4, 8, 30);
                        x340Var2 = x340Var4;
                        z4 = false;
                        x340Var2.r(false);
                    }
                    x340Var2.r(z4);
                } else {
                    qim0VarD3 = qim0VarD3;
                    jmr0VarG = jmr0VarG;
                    if (!(quxVar instanceof pux)) {
                        throw p3d1.k(x340Var2, -1035738098, false);
                    }
                    x340Var2.i0(-1035733113);
                    x340Var2.r(false);
                    jmr0Var = ((pux) quxVar).b;
                }
                int i6 = i5 >> 12;
                int i7 = (i6 & 7168) | ((i5 >> 18) & 14) | (i6 & 112);
                si7 si7Var = new si7(zy70Var, (gi7) x340Var2.k(pce0.a), rf01Var);
                int i8 = xpi1.b;
                if (jmr0VarG != null && jmr0Var == null && jmr0Var == null) {
                    d5e1Var = ni7.W0;
                } else {
                    d5e1Var = new d5e1(jmr0VarG, jmr0Var, jmr0Var, (byte) 7);
                }
                x340 x340Var5 = x340Var2;
                dm5.c(si7Var, str, qim0VarD3, d5e1Var, (iu30) null, tl3Var, j6mVar, 1.0f, colorFilter, 1, true, x340Var5, (i7 << 15) & 239009792, 0);
                x340Var = x340Var5;
            }
            jmr0Var = jmr0VarG2;
            int i9 = i5 >> 12;
            int i10 = (i9 & 7168) | ((i5 >> 18) & 14) | (i9 & 112);
            si7 si7Var2 = new si7(zy70Var, (gi7) x340Var2.k(pce0.a), rf01Var);
            int i11 = xpi1.b;
            if (jmr0VarG != null) {
                d5e1Var = new d5e1(jmr0VarG, jmr0Var, jmr0Var, (byte) 7);
            } else {
                d5e1Var = new d5e1(jmr0VarG, jmr0Var, jmr0Var, (byte) 7);
            }
            x340 x340Var6 = x340Var2;
            dm5.c(si7Var2, str, qim0VarD3, d5e1Var, (iu30) null, tl3Var, j6mVar, 1.0f, colorFilter, 1, true, x340Var6, (i10 << 15) & 239009792, 0);
            x340Var = x340Var6;
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jux(uri, kslVar, p3vVar, zvxVar, ecxVar, j6mVar, tl3Var, colorFilter, quxVar, z, z2, qim0Var, i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v22 */
    public static final void c(lvx lvxVar, iu30 iu30Var, ymq0 ymq0Var, ahs0 ahs0Var, u7i1 u7i1Var, j780 j780Var, h7f h7fVar, njf njfVar, hn50 hn50Var, xif xifVar, zlp0 zlp0Var, ynb0 ynb0Var, int i, boolean z, qim0 qim0Var, boolean z2, boolean z3, boolean z4, boolean z5, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        qim0 qim0Var3;
        iu30 iu30Var2;
        Function0 function0;
        ?? r1;
        iu30 iu30Var3;
        qim0 qim0Var4;
        boolean z6;
        boolean z7;
        lvx lvxVar2 = lvxVar;
        iu30 iu30Var4 = iu30Var;
        m4c m4cVar = fkj0.X;
        gra graVar = een.d;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        era eraVar = een.P0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(943915191);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.g(lvxVar2) ? 4 : 2) | (x340Var.i(iu30Var4) ? 32 : 16) | (x340Var.i(ymq0Var) ? 256 : 128) | (x340Var.i(ahs0Var) ? 2048 : 1024) | (x340Var.i(u7i1Var) ? 16384 : 8192) | (x340Var.i(j780Var) ? 131072 : 65536) | (x340Var.i(h7fVar) ? 1048576 : 524288) | (x340Var.i(njfVar) ? 8388608 : 4194304) | (x340Var.i(hn50Var) ? 67108864 : 33554432) | (x340Var.i(xifVar) ? 536870912 : 268435456);
        int i4 = (x340Var.i(zlp0Var) ? 4 : 2) | (x340Var.i(ynb0Var) ? 32 : 16) | (x340Var.e(l1d.C(i)) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | 24576 | (x340Var.h(z2) ? 131072 : 65536) | (x340Var.h(z3) ? 1048576 : 524288) | (x340Var.h(z4) ? 8388608 : 4194304) | (x340Var.h(z5) ? 67108864 : 33554432);
        if (x340Var.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 38347923) == 38347922) ? false : true)) {
            boolean z8 = lvxVar2 instanceof qub;
            Function0 function1 = hmb0.t1;
            f36 f36Var = h36.c;
            qim0 qim0Var5 = nim0.a;
            if (z8) {
                x340Var.i0(864431091);
                mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var5);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function1);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar4);
                nko1.H(xos0VarM, x340Var, lljVar3);
                x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE, x340Var, lljVar);
                qub qubVar = (qub) lvxVar2;
                if (qubVar.h) {
                    x340Var.i0(-201821417);
                    qim0Var4 = qim0Var5;
                    z6 = true;
                    z7 = false;
                    otw.c((maa) ynb0Var.get(), new goo0(qubVar.d), (qim0) null, (ipb1) null, x340Var, 0, 12);
                    x340Var.r(false);
                } else {
                    qim0Var4 = qim0Var5;
                    z6 = true;
                    z7 = false;
                    x340Var.i0(-201631139);
                    x340Var.r(false);
                }
                int i5 = i4 << 6;
                int i6 = i4 << 3;
                j(qubVar.e, qubVar.g, qubVar.f, h7fVar, i, z, z2, z3, z4, z5, x340Var, ((i3 >> 9) & 7168) | (i5 & 57344) | (i5 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (i6 & 234881024) | (i6 & 1879048192));
                x340Var = x340Var;
                x340Var.r(z6);
                x340Var.r(z7);
                qim0Var3 = qim0Var4;
            } else {
                boolean z9 = lvxVar2 instanceof rub;
                h2c h2cVar = h2c.a;
                if (z9) {
                    x340Var.i0(864461707);
                    mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0Var5);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA2, x340Var, lljVar4);
                    nko1.H(xos0VarM2, x340Var, lljVar3);
                    x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE2, x340Var, lljVar);
                    rub rubVar = (rub) lvxVar2;
                    if (rubVar.h) {
                        x340Var.i0(-1492261618);
                        maa maaVar = (maa) ynb0Var.get();
                        goo0 goo0Var = new goo0(rubVar.d);
                        qim0Var3 = qim0Var5;
                        function0 = function1;
                        r1 = 0;
                        otw.c(maaVar, goo0Var, (qim0) null, (ipb1) null, x340Var, 0, 12);
                        x340Var.r(false);
                    } else {
                        function0 = function1;
                        qim0Var3 = qim0Var5;
                        r1 = 0;
                        x340Var.i0(-1492071340);
                        x340Var.r(false);
                    }
                    qim0 qim0VarB = u291.B(qim0Var3, (gra) r26, 3);
                    gfh0 gfh0VarC = t1c.c(graVar, (boolean) r1);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
                    if (j06Var == null) {
                        tgp1.p();
                        throw 0;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function0);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, lljVar4);
                    nko1.H(xos0VarM3, x340Var, lljVar3);
                    x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar);
                    int i7 = i4 << 6;
                    int i8 = ((i3 >> 9) & 7168) | (i7 & 57344) | (i7 & 458752);
                    int i9 = i4 << 3;
                    j(rubVar.e, rubVar.g, rubVar.f, h7fVar, i, z, z2, z3, z4, z5, x340Var, i8 | (i9 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192));
                    x340Var = x340Var;
                    qim0 qim0VarN = anm1.N("disclaimer_overlay", h2cVar.b(qim0Var3));
                    ?? r11 = (i3 & 112) == 32 ? 1 : r1;
                    Object objT = x340Var.T();
                    if (r11 != 0 || objT == m4cVar) {
                        iu30Var3 = iu30Var;
                        objT = new gob(iu30Var3, (byte) 26);
                        x340Var.s0(objT);
                    } else {
                        iu30Var3 = iu30Var;
                    }
                    t1c.a(bin.x(qim0VarN, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), x340Var, (int) r1);
                    x340Var.r(true);
                    x340Var.r(true);
                    x340Var.r((boolean) r1);
                    lvxVar2 = lvxVar;
                    iu30Var4 = iu30Var3;
                } else {
                    qim0Var3 = qim0Var5;
                    lvxVar2 = lvxVar;
                    boolean zEquals = lvxVar2.equals(vub.d);
                    rih1 rih1Var = rih1.a;
                    if (zEquals) {
                        x340Var.i0(864499350);
                        otw.c(xifVar, rih1Var, (qim0) null, (ipb1) null, x340Var, ((i3 >> 27) & 14) | 48, 12);
                        x340Var.r(false);
                    } else if (lvxVar2.equals(uub.d)) {
                        x340Var.i0(864503033);
                        otw.c(hn50Var, new bn50(), (qim0) null, (ipb1) null, x340Var, (i3 >> 24) & 14, 12);
                        x340Var.r(false);
                    } else if (lvxVar2.equals(wub.d)) {
                        x340Var.i0(864508886);
                        otw.c(xifVar, rih1Var, (qim0) null, (ipb1) null, x340Var, ((i3 >> 27) & 14) | 48, 12);
                        x340Var.r(false);
                    } else if (lvxVar2 instanceof xub) {
                        x340Var.i0(864512988);
                        xub xubVar = (xub) lvxVar2;
                        otw.c(zlp0Var, new vlp0(xubVar.d, xubVar.e), (qim0) null, (ipb1) null, x340Var, i4 & 14, 12);
                        x340Var.r(false);
                    } else if (lvxVar2 instanceof cvb) {
                        x340Var.i0(864522964);
                        otw.c(njfVar, new jjf(new kjf(((cvb) lvxVar2).d, true)), (qim0) null, (ipb1) null, x340Var, (i3 >> 21) & 14, 12);
                        x340Var.r(false);
                    } else if (lvxVar2.equals(zub.d)) {
                        x340Var.i0(864534641);
                        otw.c(njfVar, new jjf(new ljf(true)), (qim0) null, (ipb1) null, x340Var, (i3 >> 21) & 14, 12);
                        x340Var.r(false);
                    } else if (lvxVar2 instanceof dvb) {
                        x340Var.i0(864544462);
                        mbh mbhVarA3 = jbh.a(f36Var, eraVar, x340Var, 0);
                        int iHashCode4 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM4 = x340Var.m();
                        qim0 qim0VarE4 = zr7.E(x340Var, qim0Var3);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(function1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(mbhVarA3, x340Var, lljVar4);
                        nko1.H(xos0VarM4, x340Var, lljVar3);
                        x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
                        nko1.H(qim0VarE4, x340Var, lljVar);
                        dvb dvbVar = (dvb) lvxVar2;
                        otw.c(njfVar, new jjf(new kjf(dvbVar.d, false)), (qim0) null, (ipb1) null, x340Var, (i3 >> 21) & 14, 12);
                        boolean z10 = dvbVar.f;
                        t7q0 t7q0Var = dvbVar.e;
                        int i10 = i4 << 6;
                        int i11 = ((i3 >> 9) & 7168) | (i10 & 57344) | (i10 & 458752);
                        int i12 = i4 << 3;
                        j(true, z10, t7q0Var, h7fVar, i, z, z2, z3, z4, z5, x340Var, i11 | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192));
                        x340Var = x340Var;
                        x340Var.r(true);
                        x340Var.r(false);
                    } else if (lvxVar2 instanceof avb) {
                        x340Var.i0(864578053);
                        mbh mbhVarA4 = jbh.a(f36Var, eraVar, x340Var, 0);
                        int iHashCode5 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM5 = x340Var.m();
                        qim0 qim0VarE5 = zr7.E(x340Var, qim0Var3);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(function1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(mbhVarA4, x340Var, lljVar4);
                        nko1.H(xos0VarM5, x340Var, lljVar3);
                        x0d.q(iHashCode5, x340Var, lljVar2, x340Var);
                        nko1.H(qim0VarE5, x340Var, lljVar);
                        otw.c(njfVar, new jjf(new ljf(false)), (qim0) null, (ipb1) null, x340Var, (i3 >> 21) & 14, 12);
                        avb avbVar = (avb) lvxVar2;
                        boolean z11 = avbVar.e;
                        t7q0 t7q0Var2 = avbVar.d;
                        int i13 = i4 << 6;
                        int i14 = ((i3 >> 9) & 7168) | (i13 & 57344) | (i13 & 458752);
                        int i15 = i4 << 3;
                        j(true, z11, t7q0Var2, h7fVar, i, z, z2, z3, z4, z5, x340Var, i14 | (i15 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192));
                        x340Var = x340Var;
                        x340Var.r(true);
                        x340Var.r(false);
                    } else if (lvxVar2 instanceof evb) {
                        x340Var.i0(864609254);
                        mbh mbhVarA5 = jbh.a(f36Var, eraVar, x340Var, 0);
                        int iHashCode6 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM6 = x340Var.m();
                        qim0 qim0VarE6 = zr7.E(x340Var, qim0Var3);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(function1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(mbhVarA5, x340Var, lljVar4);
                        nko1.H(xos0VarM6, x340Var, lljVar3);
                        x0d.q(iHashCode6, x340Var, lljVar2, x340Var);
                        nko1.H(qim0VarE6, x340Var, lljVar);
                        evb evbVar = (evb) lvxVar2;
                        otw.c(njfVar, new jjf(new kjf(evbVar.d, false)), (qim0) null, (ipb1) null, x340Var, (i3 >> 21) & 14, 12);
                        qim0 qim0VarB2 = u291.B(qim0Var3, (gra) null, 3);
                        gfh0 gfh0VarC2 = t1c.c(graVar, false);
                        int iHashCode7 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM7 = x340Var.m();
                        qim0 qim0VarE7 = zr7.E(x340Var, qim0VarB2);
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(function1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0VarC2, x340Var, lljVar4);
                        nko1.H(xos0VarM7, x340Var, lljVar3);
                        x0d.q(iHashCode7, x340Var, lljVar2, x340Var);
                        nko1.H(qim0VarE7, x340Var, lljVar);
                        int i16 = i4 << 6;
                        int i17 = ((i3 >> 9) & 7168) | (i16 & 57344) | (i16 & 458752);
                        int i18 = i4 << 3;
                        j(true, evbVar.f, evbVar.e, h7fVar, i, z, z2, z3, z4, z5, x340Var, i17 | (i18 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (i18 & 1879048192));
                        x340Var = x340Var;
                        qim0 qim0VarN2 = anm1.N("disclaimer_overlay", h2cVar.b(qim0Var3));
                        boolean z12 = (i3 & 112) == 32;
                        Object objT2 = x340Var.T();
                        if (z12 || objT2 == m4cVar) {
                            iu30Var2 = iu30Var;
                            objT2 = new gob(iu30Var2, (byte) 27);
                            x340Var.s0(objT2);
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        t1c.a(bin.x(qim0VarN2, false, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 15), x340Var, 0);
                        x340Var.r(true);
                        x340Var.r(true);
                        x340Var.r(false);
                        lvxVar2 = lvxVar;
                        iu30Var4 = iu30Var2;
                    } else if (lvxVar2 instanceof bvb) {
                        x340Var.i0(1034416503);
                        mbh mbhVarA6 = jbh.a(f36Var, eraVar, x340Var, 0);
                        int iHashCode8 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM8 = x340Var.m();
                        qim0 qim0VarE8 = zr7.E(x340Var, qim0Var3);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(function1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(mbhVarA6, x340Var, lljVar4);
                        nko1.H(xos0VarM8, x340Var, lljVar3);
                        x0d.q(iHashCode8, x340Var, lljVar2, x340Var);
                        nko1.H(qim0VarE8, x340Var, lljVar);
                        otw.c(njfVar, new jjf(new ljf(false)), (qim0) null, (ipb1) null, x340Var, (i3 >> 21) & 14, 12);
                        qim0 qim0VarB3 = u291.B(qim0Var3, (gra) null, 3);
                        gfh0 gfh0VarC3 = t1c.c(graVar, false);
                        int iHashCode9 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM9 = x340Var.m();
                        qim0 qim0VarE9 = zr7.E(x340Var, qim0VarB3);
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(function1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0VarC3, x340Var, lljVar4);
                        nko1.H(xos0VarM9, x340Var, lljVar3);
                        x0d.q(iHashCode9, x340Var, lljVar2, x340Var);
                        nko1.H(qim0VarE9, x340Var, lljVar);
                        bvb bvbVar = (bvb) lvxVar;
                        boolean z13 = bvbVar.e;
                        t7q0 t7q0Var3 = bvbVar.d;
                        int i19 = i4 << 6;
                        int i20 = ((i3 >> 9) & 7168) | (i19 & 57344) | (i19 & 458752);
                        int i21 = i4 << 3;
                        j(true, z13, t7q0Var3, h7fVar, i, z, z2, z3, z4, z5, x340Var, i20 | (i21 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192));
                        x340Var = x340Var;
                        qim0 qim0VarN3 = anm1.N("disclaimer_overlay", h2cVar.b(qim0Var3));
                        boolean z14 = (i3 & 112) == 32;
                        Object objT3 = x340Var.T();
                        if (z14 || objT3 == m4cVar) {
                            iu30Var4 = iu30Var;
                            objT3 = new gob(iu30Var4, (byte) 28);
                            x340Var.s0(objT3);
                        } else {
                            iu30Var4 = iu30Var;
                        }
                        t1c.a(bin.x(qim0VarN3, false, (String) null, (pm31) null, (idn0) null, (Function0) objT3, 15), x340Var, 0);
                        x340Var.r(true);
                        x340Var.r(true);
                        x340Var.r(false);
                        lvxVar2 = lvxVar;
                    } else {
                        iu30Var4 = iu30Var;
                        lvxVar2 = lvxVar;
                        if (lvxVar2.equals(oub.d)) {
                            x340Var.i0(864689345);
                            x340Var.r(false);
                        } else if (lvxVar2.equals(pub.d)) {
                            x340Var.i0(864690543);
                            otw.c(j780Var, rih1Var, (qim0) null, (ipb1) null, x340Var, ((i3 >> 15) & 14) | 48, 12);
                            x340Var.r(false);
                        } else if (lvxVar2.equals(yub.d)) {
                            x340Var.i0(864693134);
                            otw.c(u7i1Var, rih1Var, (qim0) null, (ipb1) null, x340Var, ((i3 >> 12) & 14) | 48, 12);
                            x340Var.r(false);
                        } else if (lvxVar2.equals(sub.d)) {
                            x340Var.i0(864695727);
                            otw.c(ymq0Var, rih1Var, (qim0) null, (ipb1) null, x340Var, ((i3 >> 6) & 14) | 48, 12);
                            x340Var.r(false);
                        } else {
                            if (!lvxVar2.equals(tub.d)) {
                                throw p3d1.k(x340Var, 864436888, false);
                            }
                            x340Var.i0(864698648);
                            otw.c(ahs0Var, rih1Var, (qim0) null, (ipb1) null, x340Var, ((i3 >> 9) & 14) | 48, 12);
                            x340Var.r(false);
                        }
                    }
                    iu30Var4 = iu30Var;
                }
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vff(lvxVar2, iu30Var4, ymq0Var, ahs0Var, u7i1Var, j780Var, h7fVar, njfVar, hn50Var, xifVar, zlp0Var, ynb0Var, i, z, qim0Var2, z2, z3, z4, z5, i2);
        }
    }

    public static final void d(Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1997862064);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            fra fraVar = een.N0;
            qim0 qim0VarV = bin.v(da80.a(nim0.a, idn0Var, jtr.f), idn0Var, (ga80) null, false, (String) null, (pm31) null, function0, 28);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarV);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bu9(function0, j2iVar, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0115  */
    /* JADX WARN: Code duplicated, block: B:102:0x011a  */
    /* JADX WARN: Code duplicated, block: B:103:0x011f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0125  */
    /* JADX WARN: Code duplicated, block: B:106:0x0128  */
    /* JADX WARN: Code duplicated, block: B:110:0x012f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0136  */
    /* JADX WARN: Code duplicated, block: B:113:0x013a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0144  */
    /* JADX WARN: Code duplicated, block: B:116:0x0147  */
    /* JADX WARN: Code duplicated, block: B:118:0x014c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0156  */
    /* JADX WARN: Code duplicated, block: B:123:0x015d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0161  */
    /* JADX WARN: Code duplicated, block: B:127:0x016b  */
    /* JADX WARN: Code duplicated, block: B:128:0x016e  */
    /* JADX WARN: Code duplicated, block: B:132:0x017e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0188  */
    /* JADX WARN: Code duplicated, block: B:139:0x0191  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:163:0x01ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:165:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:168:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:169:0x0206  */
    /* JADX WARN: Code duplicated, block: B:172:0x020b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0221  */
    /* JADX WARN: Code duplicated, block: B:176:0x0227  */
    /* JADX WARN: Code duplicated, block: B:177:0x0233  */
    /* JADX WARN: Code duplicated, block: B:180:0x0239  */
    /* JADX WARN: Code duplicated, block: B:183:0x0243  */
    /* JADX WARN: Code duplicated, block: B:184:0x0248  */
    /* JADX WARN: Code duplicated, block: B:186:0x024b  */
    /* JADX WARN: Code duplicated, block: B:187:0x024d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0252  */
    /* JADX WARN: Code duplicated, block: B:192:0x025d  */
    /* JADX WARN: Code duplicated, block: B:193:0x0260  */
    /* JADX WARN: Code duplicated, block: B:195:0x0264  */
    /* JADX WARN: Code duplicated, block: B:196:0x0279  */
    /* JADX WARN: Code duplicated, block: B:198:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:201:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:98:0x0111  */
    public static final void e(Uri uri, ksl kslVar, qim0 qim0Var, p3v p3vVar, zvx zvxVar, ecx ecxVar, j6m j6mVar, tl3 tl3Var, ColorFilter colorFilter, qux quxVar, boolean z, boolean z2, b0k b0kVar, int i, int i2, int i3) {
        Uri uri2;
        int i4;
        ksl kslVar2;
        qim0 qim0Var2;
        p3v p3vVar2;
        j6m j6mVar2;
        tl3 tl3Var2;
        int i5;
        ColorFilter colorFilter2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        b0k b0kVar2;
        boolean z4;
        j6m j6mVar3;
        tl3 tl3Var3;
        ColorFilter colorFilter3;
        qim0 qim0Var3;
        p3v p3vVar3;
        zvx zvxVar2;
        ecx ecxVar2;
        boolean z5;
        qux quxVar2;
        h311 h311VarV;
        qim0 qim0Var4;
        p3v p3vVar4;
        zvx zvxVar3;
        ecx ecxVarA;
        tl3 tl3Var4;
        ColorFilter colorFilter4;
        boolean z6;
        boolean z7;
        qim0 qim0Var5;
        tl3 tl3Var5;
        qux quxVar3;
        j6m j6mVar4;
        ColorFilter colorFilter5;
        boolean z8;
        p3v p3vVar5;
        zvx zvxVar4;
        ecx ecxVar3;
        int i12;
        boolean zI;
        int i13;
        boolean zI2;
        int i14;
        boolean zI3;
        qux nuxVar = quxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(218727509);
        if ((i & 6) == 0) {
            uri2 = uri;
            i4 = (b0kVar3.g(uri2) ? 4 : 2) | i;
        } else {
            uri2 = uri;
            i4 = i;
        }
        if ((i & 48) == 0) {
            kslVar2 = kslVar;
            i4 |= b0kVar3.g(kslVar2) ? 32 : 16;
        } else {
            kslVar2 = kslVar;
        }
        int i15 = i3 & 4;
        if (i15 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i4 |= b0kVar3.i(qim0Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    p3vVar2 = p3vVar;
                    int i16 = b0kVar3.g(p3vVar2) ? 2048 : 1024;
                    i4 |= i16;
                } else {
                    p3vVar2 = p3vVar;
                }
                i4 |= i16;
            } else {
                p3vVar2 = p3vVar;
            }
            if ((i & 24576) == 0) {
                if ((i3 & 16) != 0) {
                    i14 = 8192;
                } else {
                    if ((32768 & i) == 0) {
                        zI3 = b0kVar3.g(zvxVar);
                    } else {
                        zI3 = b0kVar3.i(zvxVar);
                    }
                    if (zI3) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                }
                i4 |= i14;
            }
            if ((196608 & i) == 0) {
                if ((i3 & 32) != 0) {
                    i13 = 65536;
                } else {
                    if ((262144 & i) == 0) {
                        zI2 = b0kVar3.g(ecxVar);
                    } else {
                        zI2 = b0kVar3.i(ecxVar);
                    }
                    if (zI2) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                }
                i4 |= i13;
            }
            if ((1572864 & i) == 0) {
                if ((i3 & 64) == 0) {
                    j6mVar2 = j6mVar;
                    int i17 = b0kVar3.i(j6mVar2) ? 1048576 : 524288;
                    i4 |= i17;
                } else {
                    j6mVar2 = j6mVar;
                }
                i4 |= i17;
            } else {
                j6mVar2 = j6mVar;
            }
            if ((i & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    tl3Var2 = tl3Var;
                    int i18 = b0kVar3.i(tl3Var2) ? 8388608 : 4194304;
                    i4 |= i18;
                } else {
                    tl3Var2 = tl3Var;
                }
                i4 |= i18;
            } else {
                tl3Var2 = tl3Var;
            }
            i5 = i3 & 256;
            if (i5 != 0) {
                i4 |= 100663296;
                colorFilter2 = colorFilter;
            } else {
                colorFilter2 = colorFilter;
                if ((i & 100663296) == 0) {
                    if (b0kVar3.i(colorFilter2)) {
                        i6 = 67108864;
                    } else {
                        i6 = 33554432;
                    }
                    i4 |= i6;
                }
            }
            if ((i & 805306368) == 0) {
                if ((i3 & 512) != 0) {
                    i12 = 268435456;
                } else {
                    if ((1073741824 & i) == 0) {
                        zI = b0kVar3.g(nuxVar);
                    } else {
                        zI = b0kVar3.i(nuxVar);
                    }
                    if (zI) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                }
                i4 |= i12;
            }
            i7 = i3 & 1024;
            if (i7 != 0) {
                i8 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (b0kVar3.h(z)) {
                    i9 = 4;
                } else {
                    i9 = 2;
                }
                i8 = i2 | i9;
            } else {
                i8 = i2;
            }
            i10 = i3 & 2048;
            if (i10 != 0) {
                if ((i2 & 48) == 0) {
                    if (b0kVar3.h(z2)) {
                        i11 = 32;
                    } else {
                        i11 = 16;
                    }
                    i8 |= i11;
                }
                if ((i4 & 306783379) == 306783378 || (i8 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (b0kVar3.Y(i4 & 1, z3)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0 || b0kVar3.E()) {
                        if (i15 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i3 & 8) != 0) {
                            uwr uwrVar = cbx.a;
                            zov0 zov0Var = cbx.b(b0kVar3).g;
                            p3vVar4 = new p3v(64.0f);
                            i4 &= -7169;
                        } else {
                            p3vVar4 = p3vVar2;
                        }
                        if ((i3 & 16) != 0) {
                            uwr uwrVar2 = cbx.a;
                            cua cuaVar = cbx.b(b0kVar3).f;
                            cua cuaVar2 = cbx.b(b0kVar3).f;
                            zvxVar3 = new zvx();
                            i4 &= -57345;
                        } else {
                            zvxVar3 = zvxVar;
                        }
                        if ((i3 & 32) != 0) {
                            cbx.a.getClass();
                            ecxVarA = uwr.a();
                            i4 &= -458753;
                        } else {
                            ecxVarA = ecxVar;
                        }
                        if ((i3 & 64) != 0) {
                            j6mVar2 = mif1.P0;
                            i4 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            tl3Var4 = een.h;
                            i4 &= -29360129;
                        } else {
                            tl3Var4 = tl3Var2;
                        }
                        if (i5 != 0) {
                            colorFilter4 = null;
                        } else {
                            colorFilter4 = colorFilter2;
                        }
                        if ((i3 & 512) != 0) {
                            box boxVar = box.c;
                            nuxVar = new nux(boxVar, boxVar);
                            i4 &= -1879048193;
                        }
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (i10 != 0) {
                            qim0Var5 = qim0Var4;
                            tl3Var5 = tl3Var4;
                            quxVar3 = nuxVar;
                            j6mVar4 = j6mVar2;
                            colorFilter5 = colorFilter4;
                            z8 = z6;
                            p3vVar5 = p3vVar4;
                            zvxVar4 = zvxVar3;
                            ecxVar3 = ecxVarA;
                            z7 = false;
                        } else {
                            z7 = z2;
                            qim0Var5 = qim0Var4;
                            tl3Var5 = tl3Var4;
                            quxVar3 = nuxVar;
                            j6mVar4 = j6mVar2;
                            colorFilter5 = colorFilter4;
                            z8 = z6;
                            p3vVar5 = p3vVar4;
                            zvxVar4 = zvxVar3;
                            ecxVar3 = ecxVarA;
                        }
                    } else {
                        b0kVar3.b0();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        if ((i3 & 512) != 0) {
                            i4 &= -1879048193;
                        }
                        zvxVar4 = zvxVar;
                        ecxVar3 = ecxVar;
                        z8 = z;
                        z7 = z2;
                        quxVar3 = nuxVar;
                        j6mVar4 = j6mVar2;
                        tl3Var5 = tl3Var2;
                        colorFilter5 = colorFilter2;
                        qim0Var5 = qim0Var2;
                        p3vVar5 = p3vVar2;
                    }
                    b0kVar3.s();
                    int i19 = i4 >> 3;
                    b0kVar2 = b0kVar3;
                    b(uri2, kslVar2, p3vVar5, zvxVar4, ecxVar3, j6mVar4, tl3Var5, colorFilter5, quxVar3, z8, z7, qim0Var5, b0kVar2, (i4 & 126) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | (29360128 & i19) | (234881024 & i19) | ((i8 << 27) & 1879048192), ((i8 >> 3) & 14) | (i19 & 112));
                    p3vVar3 = p3vVar5;
                    zvxVar2 = zvxVar4;
                    ecxVar2 = ecxVar3;
                    j6mVar3 = j6mVar4;
                    tl3Var3 = tl3Var5;
                    colorFilter3 = colorFilter5;
                    quxVar2 = quxVar3;
                    z4 = z8;
                    z5 = z7;
                    qim0Var3 = qim0Var5;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    z4 = z;
                    j6mVar3 = j6mVar2;
                    tl3Var3 = tl3Var2;
                    colorFilter3 = colorFilter2;
                    qim0Var3 = qim0Var2;
                    p3vVar3 = p3vVar2;
                    zvxVar2 = zvxVar;
                    ecxVar2 = ecxVar;
                    z5 = z2;
                    quxVar2 = nuxVar;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new lux(uri, kslVar, qim0Var3, p3vVar3, zvxVar2, ecxVar2, j6mVar3, tl3Var3, colorFilter3, quxVar2, z4, z5, i, i2, i3);
                }
            }
            i8 |= 48;
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (b0kVar3.Y(i4 & 1, z3)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 8) != 0) {
                        uwr uwrVar3 = cbx.a;
                        zov0 zov0Var2 = cbx.b(b0kVar3).g;
                        p3vVar4 = new p3v(64.0f);
                        i4 &= -7169;
                    } else {
                        p3vVar4 = p3vVar2;
                    }
                    if ((i3 & 16) != 0) {
                        uwr uwrVar4 = cbx.a;
                        cua cuaVar3 = cbx.b(b0kVar3).f;
                        cua cuaVar4 = cbx.b(b0kVar3).f;
                        zvxVar3 = new zvx();
                        i4 &= -57345;
                    } else {
                        zvxVar3 = zvxVar;
                    }
                    if ((i3 & 32) != 0) {
                        cbx.a.getClass();
                        ecxVarA = uwr.a();
                        i4 &= -458753;
                    } else {
                        ecxVarA = ecxVar;
                    }
                    if ((i3 & 64) != 0) {
                        j6mVar2 = mif1.P0;
                        i4 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        tl3Var4 = een.h;
                        i4 &= -29360129;
                    } else {
                        tl3Var4 = tl3Var2;
                    }
                    if (i5 != 0) {
                        colorFilter4 = null;
                    } else {
                        colorFilter4 = colorFilter2;
                    }
                    if ((i3 & 512) != 0) {
                        box boxVar2 = box.c;
                        nuxVar = new nux(boxVar2, boxVar2);
                        i4 &= -1879048193;
                    }
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z;
                    }
                    if (i10 != 0) {
                        qim0Var5 = qim0Var4;
                        tl3Var5 = tl3Var4;
                        quxVar3 = nuxVar;
                        j6mVar4 = j6mVar2;
                        colorFilter5 = colorFilter4;
                        z8 = z6;
                        p3vVar5 = p3vVar4;
                        zvxVar4 = zvxVar3;
                        ecxVar3 = ecxVarA;
                        z7 = false;
                    } else {
                        z7 = z2;
                        qim0Var5 = qim0Var4;
                        tl3Var5 = tl3Var4;
                        quxVar3 = nuxVar;
                        j6mVar4 = j6mVar2;
                        colorFilter5 = colorFilter4;
                        z8 = z6;
                        p3vVar5 = p3vVar4;
                        zvxVar4 = zvxVar3;
                        ecxVar3 = ecxVarA;
                    }
                } else {
                    if (i15 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 8) != 0) {
                        uwr uwrVar5 = cbx.a;
                        zov0 zov0Var3 = cbx.b(b0kVar3).g;
                        p3vVar4 = new p3v(64.0f);
                        i4 &= -7169;
                    } else {
                        p3vVar4 = p3vVar2;
                    }
                    if ((i3 & 16) != 0) {
                        uwr uwrVar6 = cbx.a;
                        cua cuaVar5 = cbx.b(b0kVar3).f;
                        cua cuaVar6 = cbx.b(b0kVar3).f;
                        zvxVar3 = new zvx();
                        i4 &= -57345;
                    } else {
                        zvxVar3 = zvxVar;
                    }
                    if ((i3 & 32) != 0) {
                        cbx.a.getClass();
                        ecxVarA = uwr.a();
                        i4 &= -458753;
                    } else {
                        ecxVarA = ecxVar;
                    }
                    if ((i3 & 64) != 0) {
                        j6mVar2 = mif1.P0;
                        i4 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        tl3Var4 = een.h;
                        i4 &= -29360129;
                    } else {
                        tl3Var4 = tl3Var2;
                    }
                    if (i5 != 0) {
                        colorFilter4 = null;
                    } else {
                        colorFilter4 = colorFilter2;
                    }
                    if ((i3 & 512) != 0) {
                        box boxVar3 = box.c;
                        nuxVar = new nux(boxVar3, boxVar3);
                        i4 &= -1879048193;
                    }
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z;
                    }
                    if (i10 != 0) {
                        qim0Var5 = qim0Var4;
                        tl3Var5 = tl3Var4;
                        quxVar3 = nuxVar;
                        j6mVar4 = j6mVar2;
                        colorFilter5 = colorFilter4;
                        z8 = z6;
                        p3vVar5 = p3vVar4;
                        zvxVar4 = zvxVar3;
                        ecxVar3 = ecxVarA;
                        z7 = false;
                    } else {
                        z7 = z2;
                        qim0Var5 = qim0Var4;
                        tl3Var5 = tl3Var4;
                        quxVar3 = nuxVar;
                        j6mVar4 = j6mVar2;
                        colorFilter5 = colorFilter4;
                        z8 = z6;
                        p3vVar5 = p3vVar4;
                        zvxVar4 = zvxVar3;
                        ecxVar3 = ecxVarA;
                    }
                }
                b0kVar3.s();
                int i110 = i4 >> 3;
                b0kVar2 = b0kVar3;
                b(uri2, kslVar2, p3vVar5, zvxVar4, ecxVar3, j6mVar4, tl3Var5, colorFilter5, quxVar3, z8, z7, qim0Var5, b0kVar2, (i4 & 126) | (i110 & 896) | (i110 & 7168) | (57344 & i110) | (458752 & i110) | (3670016 & i110) | (29360128 & i110) | (234881024 & i110) | ((i8 << 27) & 1879048192), ((i8 >> 3) & 14) | (i110 & 112));
                p3vVar3 = p3vVar5;
                zvxVar2 = zvxVar4;
                ecxVar2 = ecxVar3;
                j6mVar3 = j6mVar4;
                tl3Var3 = tl3Var5;
                colorFilter3 = colorFilter5;
                quxVar2 = quxVar3;
                z4 = z8;
                z5 = z7;
                qim0Var3 = qim0Var5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z4 = z;
                j6mVar3 = j6mVar2;
                tl3Var3 = tl3Var2;
                colorFilter3 = colorFilter2;
                qim0Var3 = qim0Var2;
                p3vVar3 = p3vVar2;
                zvxVar2 = zvxVar;
                ecxVar2 = ecxVar;
                z5 = z2;
                quxVar2 = nuxVar;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new lux(uri, kslVar, qim0Var3, p3vVar3, zvxVar2, ecxVar2, j6mVar3, tl3Var3, colorFilter3, quxVar2, z4, z5, i, i2, i3);
            }
        }
        i4 |= 384;
        qim0Var2 = qim0Var;
        if ((i & 3072) == 0) {
            if ((i3 & 8) == 0) {
                p3vVar2 = p3vVar;
                if (b0kVar3.g(p3vVar2)) {
                }
                i4 |= i16;
            } else {
                p3vVar2 = p3vVar;
            }
            i4 |= i16;
        } else {
            p3vVar2 = p3vVar;
        }
        if ((i & 24576) == 0) {
            if ((i3 & 16) != 0) {
                i14 = 8192;
            } else {
                if ((32768 & i) == 0) {
                    zI3 = b0kVar3.g(zvxVar);
                } else {
                    zI3 = b0kVar3.i(zvxVar);
                }
                if (zI3) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
            }
            i4 |= i14;
        }
        if ((196608 & i) == 0) {
            if ((i3 & 32) != 0) {
                i13 = 65536;
            } else {
                if ((262144 & i) == 0) {
                    zI2 = b0kVar3.g(ecxVar);
                } else {
                    zI2 = b0kVar3.i(ecxVar);
                }
                if (zI2) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
            }
            i4 |= i13;
        }
        if ((1572864 & i) == 0) {
            if ((i3 & 64) == 0) {
                j6mVar2 = j6mVar;
                if (b0kVar3.i(j6mVar2)) {
                }
                i4 |= i17;
            } else {
                j6mVar2 = j6mVar;
            }
            i4 |= i17;
        } else {
            j6mVar2 = j6mVar;
        }
        if ((i & 12582912) == 0) {
            if ((i3 & 128) == 0) {
                tl3Var2 = tl3Var;
                if (b0kVar3.i(tl3Var2)) {
                }
                i4 |= i18;
            } else {
                tl3Var2 = tl3Var;
            }
            i4 |= i18;
        } else {
            tl3Var2 = tl3Var;
        }
        i5 = i3 & 256;
        if (i5 != 0) {
            i4 |= 100663296;
            colorFilter2 = colorFilter;
        } else {
            colorFilter2 = colorFilter;
            if ((i & 100663296) == 0) {
                if (b0kVar3.i(colorFilter2)) {
                    i6 = 67108864;
                } else {
                    i6 = 33554432;
                }
                i4 |= i6;
            }
        }
        if ((i & 805306368) == 0) {
            if ((i3 & 512) != 0) {
                i12 = 268435456;
            } else {
                if ((1073741824 & i) == 0) {
                    zI = b0kVar3.g(nuxVar);
                } else {
                    zI = b0kVar3.i(nuxVar);
                }
                if (zI) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
            }
            i4 |= i12;
        }
        i7 = i3 & 1024;
        if (i7 != 0) {
            i8 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (b0kVar3.h(z)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i8 = i2 | i9;
        } else {
            i8 = i2;
        }
        i10 = i3 & 2048;
        if (i10 != 0) {
            if ((i2 & 48) == 0) {
                if (b0kVar3.h(z2)) {
                    i11 = 32;
                } else {
                    i11 = 16;
                }
                i8 |= i11;
            }
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (b0kVar3.Y(i4 & 1, z3)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 8) != 0) {
                        uwr uwrVar7 = cbx.a;
                        zov0 zov0Var4 = cbx.b(b0kVar3).g;
                        p3vVar4 = new p3v(64.0f);
                        i4 &= -7169;
                    } else {
                        p3vVar4 = p3vVar2;
                    }
                    if ((i3 & 16) != 0) {
                        uwr uwrVar8 = cbx.a;
                        cua cuaVar7 = cbx.b(b0kVar3).f;
                        cua cuaVar8 = cbx.b(b0kVar3).f;
                        zvxVar3 = new zvx();
                        i4 &= -57345;
                    } else {
                        zvxVar3 = zvxVar;
                    }
                    if ((i3 & 32) != 0) {
                        cbx.a.getClass();
                        ecxVarA = uwr.a();
                        i4 &= -458753;
                    } else {
                        ecxVarA = ecxVar;
                    }
                    if ((i3 & 64) != 0) {
                        j6mVar2 = mif1.P0;
                        i4 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        tl3Var4 = een.h;
                        i4 &= -29360129;
                    } else {
                        tl3Var4 = tl3Var2;
                    }
                    if (i5 != 0) {
                        colorFilter4 = null;
                    } else {
                        colorFilter4 = colorFilter2;
                    }
                    if ((i3 & 512) != 0) {
                        box boxVar4 = box.c;
                        nuxVar = new nux(boxVar4, boxVar4);
                        i4 &= -1879048193;
                    }
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z;
                    }
                    if (i10 != 0) {
                        qim0Var5 = qim0Var4;
                        tl3Var5 = tl3Var4;
                        quxVar3 = nuxVar;
                        j6mVar4 = j6mVar2;
                        colorFilter5 = colorFilter4;
                        z8 = z6;
                        p3vVar5 = p3vVar4;
                        zvxVar4 = zvxVar3;
                        ecxVar3 = ecxVarA;
                        z7 = false;
                    } else {
                        z7 = z2;
                        qim0Var5 = qim0Var4;
                        tl3Var5 = tl3Var4;
                        quxVar3 = nuxVar;
                        j6mVar4 = j6mVar2;
                        colorFilter5 = colorFilter4;
                        z8 = z6;
                        p3vVar5 = p3vVar4;
                        zvxVar4 = zvxVar3;
                        ecxVar3 = ecxVarA;
                    }
                } else {
                    if (i15 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 8) != 0) {
                        uwr uwrVar9 = cbx.a;
                        zov0 zov0Var5 = cbx.b(b0kVar3).g;
                        p3vVar4 = new p3v(64.0f);
                        i4 &= -7169;
                    } else {
                        p3vVar4 = p3vVar2;
                    }
                    if ((i3 & 16) != 0) {
                        uwr uwrVar10 = cbx.a;
                        cua cuaVar9 = cbx.b(b0kVar3).f;
                        cua cuaVar10 = cbx.b(b0kVar3).f;
                        zvxVar3 = new zvx();
                        i4 &= -57345;
                    } else {
                        zvxVar3 = zvxVar;
                    }
                    if ((i3 & 32) != 0) {
                        cbx.a.getClass();
                        ecxVarA = uwr.a();
                        i4 &= -458753;
                    } else {
                        ecxVarA = ecxVar;
                    }
                    if ((i3 & 64) != 0) {
                        j6mVar2 = mif1.P0;
                        i4 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        tl3Var4 = een.h;
                        i4 &= -29360129;
                    } else {
                        tl3Var4 = tl3Var2;
                    }
                    if (i5 != 0) {
                        colorFilter4 = null;
                    } else {
                        colorFilter4 = colorFilter2;
                    }
                    if ((i3 & 512) != 0) {
                        box boxVar5 = box.c;
                        nuxVar = new nux(boxVar5, boxVar5);
                        i4 &= -1879048193;
                    }
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z;
                    }
                    if (i10 != 0) {
                        qim0Var5 = qim0Var4;
                        tl3Var5 = tl3Var4;
                        quxVar3 = nuxVar;
                        j6mVar4 = j6mVar2;
                        colorFilter5 = colorFilter4;
                        z8 = z6;
                        p3vVar5 = p3vVar4;
                        zvxVar4 = zvxVar3;
                        ecxVar3 = ecxVarA;
                        z7 = false;
                    } else {
                        z7 = z2;
                        qim0Var5 = qim0Var4;
                        tl3Var5 = tl3Var4;
                        quxVar3 = nuxVar;
                        j6mVar4 = j6mVar2;
                        colorFilter5 = colorFilter4;
                        z8 = z6;
                        p3vVar5 = p3vVar4;
                        zvxVar4 = zvxVar3;
                        ecxVar3 = ecxVarA;
                    }
                }
                b0kVar3.s();
                int i111 = i4 >> 3;
                b0kVar2 = b0kVar3;
                b(uri2, kslVar2, p3vVar5, zvxVar4, ecxVar3, j6mVar4, tl3Var5, colorFilter5, quxVar3, z8, z7, qim0Var5, b0kVar2, (i4 & 126) | (i111 & 896) | (i111 & 7168) | (57344 & i111) | (458752 & i111) | (3670016 & i111) | (29360128 & i111) | (234881024 & i111) | ((i8 << 27) & 1879048192), ((i8 >> 3) & 14) | (i111 & 112));
                p3vVar3 = p3vVar5;
                zvxVar2 = zvxVar4;
                ecxVar2 = ecxVar3;
                j6mVar3 = j6mVar4;
                tl3Var3 = tl3Var5;
                colorFilter3 = colorFilter5;
                quxVar2 = quxVar3;
                z4 = z8;
                z5 = z7;
                qim0Var3 = qim0Var5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z4 = z;
                j6mVar3 = j6mVar2;
                tl3Var3 = tl3Var2;
                colorFilter3 = colorFilter2;
                qim0Var3 = qim0Var2;
                p3vVar3 = p3vVar2;
                zvxVar2 = zvxVar;
                ecxVar2 = ecxVar;
                z5 = z2;
                quxVar2 = nuxVar;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new lux(uri, kslVar, qim0Var3, p3vVar3, zvxVar2, ecxVar2, j6mVar3, tl3Var3, colorFilter3, quxVar2, z4, z5, i, i2, i3);
            }
        }
        i8 |= 48;
        if ((i4 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (b0kVar3.Y(i4 & 1, z3)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i3 & 8) != 0) {
                    uwr uwrVar11 = cbx.a;
                    zov0 zov0Var6 = cbx.b(b0kVar3).g;
                    p3vVar4 = new p3v(64.0f);
                    i4 &= -7169;
                } else {
                    p3vVar4 = p3vVar2;
                }
                if ((i3 & 16) != 0) {
                    uwr uwrVar12 = cbx.a;
                    cua cuaVar11 = cbx.b(b0kVar3).f;
                    cua cuaVar12 = cbx.b(b0kVar3).f;
                    zvxVar3 = new zvx();
                    i4 &= -57345;
                } else {
                    zvxVar3 = zvxVar;
                }
                if ((i3 & 32) != 0) {
                    cbx.a.getClass();
                    ecxVarA = uwr.a();
                    i4 &= -458753;
                } else {
                    ecxVarA = ecxVar;
                }
                if ((i3 & 64) != 0) {
                    j6mVar2 = mif1.P0;
                    i4 &= -3670017;
                }
                if ((i3 & 128) != 0) {
                    tl3Var4 = een.h;
                    i4 &= -29360129;
                } else {
                    tl3Var4 = tl3Var2;
                }
                if (i5 != 0) {
                    colorFilter4 = null;
                } else {
                    colorFilter4 = colorFilter2;
                }
                if ((i3 & 512) != 0) {
                    box boxVar6 = box.c;
                    nuxVar = new nux(boxVar6, boxVar6);
                    i4 &= -1879048193;
                }
                if (i7 != 0) {
                    z6 = false;
                } else {
                    z6 = z;
                }
                if (i10 != 0) {
                    qim0Var5 = qim0Var4;
                    tl3Var5 = tl3Var4;
                    quxVar3 = nuxVar;
                    j6mVar4 = j6mVar2;
                    colorFilter5 = colorFilter4;
                    z8 = z6;
                    p3vVar5 = p3vVar4;
                    zvxVar4 = zvxVar3;
                    ecxVar3 = ecxVarA;
                    z7 = false;
                } else {
                    z7 = z2;
                    qim0Var5 = qim0Var4;
                    tl3Var5 = tl3Var4;
                    quxVar3 = nuxVar;
                    j6mVar4 = j6mVar2;
                    colorFilter5 = colorFilter4;
                    z8 = z6;
                    p3vVar5 = p3vVar4;
                    zvxVar4 = zvxVar3;
                    ecxVar3 = ecxVarA;
                }
            } else {
                if (i15 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i3 & 8) != 0) {
                    uwr uwrVar13 = cbx.a;
                    zov0 zov0Var7 = cbx.b(b0kVar3).g;
                    p3vVar4 = new p3v(64.0f);
                    i4 &= -7169;
                } else {
                    p3vVar4 = p3vVar2;
                }
                if ((i3 & 16) != 0) {
                    uwr uwrVar14 = cbx.a;
                    cua cuaVar13 = cbx.b(b0kVar3).f;
                    cua cuaVar14 = cbx.b(b0kVar3).f;
                    zvxVar3 = new zvx();
                    i4 &= -57345;
                } else {
                    zvxVar3 = zvxVar;
                }
                if ((i3 & 32) != 0) {
                    cbx.a.getClass();
                    ecxVarA = uwr.a();
                    i4 &= -458753;
                } else {
                    ecxVarA = ecxVar;
                }
                if ((i3 & 64) != 0) {
                    j6mVar2 = mif1.P0;
                    i4 &= -3670017;
                }
                if ((i3 & 128) != 0) {
                    tl3Var4 = een.h;
                    i4 &= -29360129;
                } else {
                    tl3Var4 = tl3Var2;
                }
                if (i5 != 0) {
                    colorFilter4 = null;
                } else {
                    colorFilter4 = colorFilter2;
                }
                if ((i3 & 512) != 0) {
                    box boxVar7 = box.c;
                    nuxVar = new nux(boxVar7, boxVar7);
                    i4 &= -1879048193;
                }
                if (i7 != 0) {
                    z6 = false;
                } else {
                    z6 = z;
                }
                if (i10 != 0) {
                    qim0Var5 = qim0Var4;
                    tl3Var5 = tl3Var4;
                    quxVar3 = nuxVar;
                    j6mVar4 = j6mVar2;
                    colorFilter5 = colorFilter4;
                    z8 = z6;
                    p3vVar5 = p3vVar4;
                    zvxVar4 = zvxVar3;
                    ecxVar3 = ecxVarA;
                    z7 = false;
                } else {
                    z7 = z2;
                    qim0Var5 = qim0Var4;
                    tl3Var5 = tl3Var4;
                    quxVar3 = nuxVar;
                    j6mVar4 = j6mVar2;
                    colorFilter5 = colorFilter4;
                    z8 = z6;
                    p3vVar5 = p3vVar4;
                    zvxVar4 = zvxVar3;
                    ecxVar3 = ecxVarA;
                }
            }
            b0kVar3.s();
            int i112 = i4 >> 3;
            b0kVar2 = b0kVar3;
            b(uri2, kslVar2, p3vVar5, zvxVar4, ecxVar3, j6mVar4, tl3Var5, colorFilter5, quxVar3, z8, z7, qim0Var5, b0kVar2, (i4 & 126) | (i112 & 896) | (i112 & 7168) | (57344 & i112) | (458752 & i112) | (3670016 & i112) | (29360128 & i112) | (234881024 & i112) | ((i8 << 27) & 1879048192), ((i8 >> 3) & 14) | (i112 & 112));
            p3vVar3 = p3vVar5;
            zvxVar2 = zvxVar4;
            ecxVar2 = ecxVar3;
            j6mVar3 = j6mVar4;
            tl3Var3 = tl3Var5;
            colorFilter3 = colorFilter5;
            quxVar2 = quxVar3;
            z4 = z8;
            z5 = z7;
            qim0Var3 = qim0Var5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z4 = z;
            j6mVar3 = j6mVar2;
            tl3Var3 = tl3Var2;
            colorFilter3 = colorFilter2;
            qim0Var3 = qim0Var2;
            p3vVar3 = p3vVar2;
            zvxVar2 = zvxVar;
            ecxVar2 = ecxVar;
            z5 = z2;
            quxVar2 = nuxVar;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lux(uri, kslVar, qim0Var3, p3vVar3, zvxVar2, ecxVar2, j6mVar3, tl3Var3, colorFilter3, quxVar2, z4, z5, i, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0143  */
    /* JADX WARN: Code duplicated, block: B:115:0x0146  */
    /* JADX WARN: Code duplicated, block: B:118:0x014b  */
    /* JADX WARN: Code duplicated, block: B:119:0x015d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0162  */
    /* JADX WARN: Code duplicated, block: B:125:0x017b  */
    /* JADX WARN: Code duplicated, block: B:128:0x018a  */
    /* JADX WARN: Code duplicated, block: B:129:0x018f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0195  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:136:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:138:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:143:0x020b  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00db  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    public static final void f(yk4 yk4Var, ksl kslVar, qim0 qim0Var, p3v p3vVar, zvx zvxVar, ecx ecxVar, j6m j6mVar, tl3 tl3Var, ColorFilter colorFilter, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        p3v p3vVar2;
        j6m j6mVar2;
        int i4;
        ColorFilter colorFilter2;
        int i5;
        boolean z;
        b0k b0kVar2;
        zvx zvxVar2;
        qim0 qim0Var3;
        p3v p3vVar3;
        j6m j6mVar3;
        ColorFilter colorFilter3;
        tl3 tl3Var2;
        ecx ecxVar2;
        h311 h311VarV;
        qim0 qim0Var4;
        p3v p3vVar4;
        j6m j6mVar4;
        tl3 tl3Var3;
        int i6;
        zvx zvxVar3;
        ecx ecxVar3;
        qim0 qim0Var5;
        p3v p3vVar5;
        j6m j6mVar5;
        tl3 tl3Var4;
        ColorFilter colorFilter4;
        boolean zG;
        Object objT;
        int i7;
        boolean zI;
        int i8;
        boolean zI2;
        zvx zvxVar4 = zvxVar;
        ecx ecxVarA = ecxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(267861487);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.i(yk4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(kslVar) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    p3vVar2 = p3vVar;
                    int i10 = b0kVar3.g(p3vVar2) ? 2048 : 1024;
                    i3 |= i10;
                } else {
                    p3vVar2 = p3vVar;
                }
                i3 |= i10;
            } else {
                p3vVar2 = p3vVar;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) != 0) {
                    i8 = 8192;
                } else {
                    if ((32768 & i) == 0) {
                        zI2 = b0kVar3.g(zvxVar4);
                    } else {
                        zI2 = b0kVar3.i(zvxVar4);
                    }
                    if (zI2) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                }
                i3 |= i8;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) != 0) {
                    i7 = 65536;
                } else {
                    if ((262144 & i) == 0) {
                        zI = b0kVar3.g(ecxVarA);
                    } else {
                        zI = b0kVar3.i(ecxVarA);
                    }
                    if (zI) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    j6mVar2 = j6mVar;
                    int i11 = b0kVar3.i(j6mVar2) ? 1048576 : 524288;
                    i3 |= i11;
                } else {
                    j6mVar2 = j6mVar;
                }
                i3 |= i11;
            } else {
                j6mVar2 = j6mVar;
            }
            if ((12582912 & i) == 0) {
                i3 |= 4194304;
            }
            i4 = i2 & 256;
            if (i4 != 0) {
                if ((100663296 & i) == 0) {
                    colorFilter2 = colorFilter;
                    if (b0kVar3.i(colorFilter2)) {
                        i5 = 67108864;
                    } else {
                        i5 = 33554432;
                    }
                    i3 |= i5;
                }
                if ((38347923 & i3) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i3 & 1, z)) {
                    b0kVar3.d0();
                    if ((i & 1) != 0 || b0kVar3.E()) {
                        if (i9 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if ((i2 & 8) != 0) {
                            uwr uwrVar = cbx.a;
                            zov0 zov0Var = cbx.b(b0kVar3).g;
                            p3vVar4 = new p3v(64.0f);
                            i3 &= -7169;
                        } else {
                            p3vVar4 = p3vVar2;
                        }
                        if ((i2 & 16) != 0) {
                            uwr uwrVar2 = cbx.a;
                            cua cuaVar = cbx.b(b0kVar3).f;
                            cua cuaVar2 = cbx.b(b0kVar3).f;
                            zvxVar4 = new zvx();
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            cbx.a.getClass();
                            ecxVarA = uwr.a();
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            j6mVar4 = mif1.P0;
                            i3 &= -3670017;
                        } else {
                            j6mVar4 = j6mVar2;
                        }
                        tl3Var3 = een.h;
                        i6 = i3 & (-29360129);
                        if (i4 != 0) {
                            zvxVar3 = zvxVar4;
                            ecxVar3 = ecxVarA;
                            qim0Var5 = qim0Var4;
                            p3vVar5 = p3vVar4;
                            j6mVar5 = j6mVar4;
                            tl3Var4 = tl3Var3;
                            colorFilter4 = null;
                        } else {
                            zvxVar3 = zvxVar4;
                            ecxVar3 = ecxVarA;
                            qim0Var5 = qim0Var4;
                            p3vVar5 = p3vVar4;
                            j6mVar5 = j6mVar4;
                            tl3Var4 = tl3Var3;
                        }
                        b0kVar3.s();
                        zG = b0kVar3.g(yk4Var);
                        objT = b0kVar3.T();
                        if (zG || objT == fkj0.X) {
                            objT = new pxa(yk4Var);
                            b0kVar3.s0(objT);
                        }
                        b0kVar2 = b0kVar3;
                        h((jmr0) objT, kslVar, qim0Var5, p3vVar5, zvxVar3, ecxVar3, j6mVar5, tl3Var4, colorFilter4, b0kVar2, (i6 & 112) | 8 | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (234881024 & i6), 0);
                        qim0Var3 = qim0Var5;
                        p3vVar3 = p3vVar5;
                        zvxVar2 = zvxVar3;
                        ecxVar2 = ecxVar3;
                        j6mVar3 = j6mVar5;
                        tl3Var2 = tl3Var4;
                        colorFilter3 = colorFilter4;
                    } else {
                        b0kVar3.b0();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        i6 = i3 & (-29360129);
                        tl3Var4 = tl3Var;
                        zvxVar3 = zvxVar4;
                        ecxVar3 = ecxVarA;
                        qim0Var5 = qim0Var2;
                        p3vVar5 = p3vVar2;
                        j6mVar5 = j6mVar2;
                    }
                    colorFilter4 = colorFilter2;
                    b0kVar3.s();
                    zG = b0kVar3.g(yk4Var);
                    objT = b0kVar3.T();
                    if (zG) {
                        objT = new pxa(yk4Var);
                        b0kVar3.s0(objT);
                    } else {
                        objT = new pxa(yk4Var);
                        b0kVar3.s0(objT);
                    }
                    b0kVar2 = b0kVar3;
                    h((jmr0) objT, kslVar, qim0Var5, p3vVar5, zvxVar3, ecxVar3, j6mVar5, tl3Var4, colorFilter4, b0kVar2, (i6 & 112) | 8 | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (234881024 & i6), 0);
                    qim0Var3 = qim0Var5;
                    p3vVar3 = p3vVar5;
                    zvxVar2 = zvxVar3;
                    ecxVar2 = ecxVar3;
                    j6mVar3 = j6mVar5;
                    tl3Var2 = tl3Var4;
                    colorFilter3 = colorFilter4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    zvxVar2 = zvxVar4;
                    qim0Var3 = qim0Var2;
                    p3vVar3 = p3vVar2;
                    j6mVar3 = j6mVar2;
                    colorFilter3 = colorFilter2;
                    tl3Var2 = tl3Var;
                    ecxVar2 = ecxVarA;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new kux(yk4Var, kslVar, qim0Var3, p3vVar3, zvxVar2, ecxVar2, j6mVar3, tl3Var2, colorFilter3, i, i2, (byte) 1);
                }
            }
            i3 |= 100663296;
            colorFilter2 = colorFilter;
            if ((38347923 & i3) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        uwr uwrVar3 = cbx.a;
                        zov0 zov0Var2 = cbx.b(b0kVar3).g;
                        p3vVar4 = new p3v(64.0f);
                        i3 &= -7169;
                    } else {
                        p3vVar4 = p3vVar2;
                    }
                    if ((i2 & 16) != 0) {
                        uwr uwrVar4 = cbx.a;
                        cua cuaVar3 = cbx.b(b0kVar3).f;
                        cua cuaVar4 = cbx.b(b0kVar3).f;
                        zvxVar4 = new zvx();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        cbx.a.getClass();
                        ecxVarA = uwr.a();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        j6mVar4 = mif1.P0;
                        i3 &= -3670017;
                    } else {
                        j6mVar4 = j6mVar2;
                    }
                    tl3Var3 = een.h;
                    i6 = i3 & (-29360129);
                    if (i4 != 0) {
                        zvxVar3 = zvxVar4;
                        ecxVar3 = ecxVarA;
                        qim0Var5 = qim0Var4;
                        p3vVar5 = p3vVar4;
                        j6mVar5 = j6mVar4;
                        tl3Var4 = tl3Var3;
                        colorFilter4 = null;
                    } else {
                        zvxVar3 = zvxVar4;
                        ecxVar3 = ecxVarA;
                        qim0Var5 = qim0Var4;
                        p3vVar5 = p3vVar4;
                        j6mVar5 = j6mVar4;
                        tl3Var4 = tl3Var3;
                        colorFilter4 = colorFilter2;
                    }
                } else {
                    if (i9 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        uwr uwrVar5 = cbx.a;
                        zov0 zov0Var3 = cbx.b(b0kVar3).g;
                        p3vVar4 = new p3v(64.0f);
                        i3 &= -7169;
                    } else {
                        p3vVar4 = p3vVar2;
                    }
                    if ((i2 & 16) != 0) {
                        uwr uwrVar6 = cbx.a;
                        cua cuaVar5 = cbx.b(b0kVar3).f;
                        cua cuaVar6 = cbx.b(b0kVar3).f;
                        zvxVar4 = new zvx();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        cbx.a.getClass();
                        ecxVarA = uwr.a();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        j6mVar4 = mif1.P0;
                        i3 &= -3670017;
                    } else {
                        j6mVar4 = j6mVar2;
                    }
                    tl3Var3 = een.h;
                    i6 = i3 & (-29360129);
                    if (i4 != 0) {
                        zvxVar3 = zvxVar4;
                        ecxVar3 = ecxVarA;
                        qim0Var5 = qim0Var4;
                        p3vVar5 = p3vVar4;
                        j6mVar5 = j6mVar4;
                        tl3Var4 = tl3Var3;
                        colorFilter4 = null;
                    } else {
                        zvxVar3 = zvxVar4;
                        ecxVar3 = ecxVarA;
                        qim0Var5 = qim0Var4;
                        p3vVar5 = p3vVar4;
                        j6mVar5 = j6mVar4;
                        tl3Var4 = tl3Var3;
                        colorFilter4 = colorFilter2;
                    }
                }
                b0kVar3.s();
                zG = b0kVar3.g(yk4Var);
                objT = b0kVar3.T();
                if (zG) {
                    objT = new pxa(yk4Var);
                    b0kVar3.s0(objT);
                } else {
                    objT = new pxa(yk4Var);
                    b0kVar3.s0(objT);
                }
                b0kVar2 = b0kVar3;
                h((jmr0) objT, kslVar, qim0Var5, p3vVar5, zvxVar3, ecxVar3, j6mVar5, tl3Var4, colorFilter4, b0kVar2, (i6 & 112) | 8 | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (234881024 & i6), 0);
                qim0Var3 = qim0Var5;
                p3vVar3 = p3vVar5;
                zvxVar2 = zvxVar3;
                ecxVar2 = ecxVar3;
                j6mVar3 = j6mVar5;
                tl3Var2 = tl3Var4;
                colorFilter3 = colorFilter4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                zvxVar2 = zvxVar4;
                qim0Var3 = qim0Var2;
                p3vVar3 = p3vVar2;
                j6mVar3 = j6mVar2;
                colorFilter3 = colorFilter2;
                tl3Var2 = tl3Var;
                ecxVar2 = ecxVarA;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new kux(yk4Var, kslVar, qim0Var3, p3vVar3, zvxVar2, ecxVar2, j6mVar3, tl3Var2, colorFilter3, i, i2, (byte) 1);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                p3vVar2 = p3vVar;
                if (b0kVar3.g(p3vVar2)) {
                }
                i3 |= i10;
            } else {
                p3vVar2 = p3vVar;
            }
            i3 |= i10;
        } else {
            p3vVar2 = p3vVar;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) != 0) {
                i8 = 8192;
            } else {
                if ((32768 & i) == 0) {
                    zI2 = b0kVar3.g(zvxVar4);
                } else {
                    zI2 = b0kVar3.i(zvxVar4);
                }
                if (zI2) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
            }
            i3 |= i8;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) != 0) {
                i7 = 65536;
            } else {
                if ((262144 & i) == 0) {
                    zI = b0kVar3.g(ecxVarA);
                } else {
                    zI = b0kVar3.i(ecxVarA);
                }
                if (zI) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
            }
            i3 |= i7;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                j6mVar2 = j6mVar;
                if (b0kVar3.i(j6mVar2)) {
                }
                i3 |= i11;
            } else {
                j6mVar2 = j6mVar;
            }
            i3 |= i11;
        } else {
            j6mVar2 = j6mVar;
        }
        if ((12582912 & i) == 0) {
            i3 |= 4194304;
        }
        i4 = i2 & 256;
        if (i4 != 0) {
            if ((100663296 & i) == 0) {
                colorFilter2 = colorFilter;
                if (b0kVar3.i(colorFilter2)) {
                    i5 = 67108864;
                } else {
                    i5 = 33554432;
                }
                i3 |= i5;
            }
            if ((38347923 & i3) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        uwr uwrVar7 = cbx.a;
                        zov0 zov0Var4 = cbx.b(b0kVar3).g;
                        p3vVar4 = new p3v(64.0f);
                        i3 &= -7169;
                    } else {
                        p3vVar4 = p3vVar2;
                    }
                    if ((i2 & 16) != 0) {
                        uwr uwrVar8 = cbx.a;
                        cua cuaVar7 = cbx.b(b0kVar3).f;
                        cua cuaVar8 = cbx.b(b0kVar3).f;
                        zvxVar4 = new zvx();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        cbx.a.getClass();
                        ecxVarA = uwr.a();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        j6mVar4 = mif1.P0;
                        i3 &= -3670017;
                    } else {
                        j6mVar4 = j6mVar2;
                    }
                    tl3Var3 = een.h;
                    i6 = i3 & (-29360129);
                    if (i4 != 0) {
                        zvxVar3 = zvxVar4;
                        ecxVar3 = ecxVarA;
                        qim0Var5 = qim0Var4;
                        p3vVar5 = p3vVar4;
                        j6mVar5 = j6mVar4;
                        tl3Var4 = tl3Var3;
                        colorFilter4 = null;
                    } else {
                        zvxVar3 = zvxVar4;
                        ecxVar3 = ecxVarA;
                        qim0Var5 = qim0Var4;
                        p3vVar5 = p3vVar4;
                        j6mVar5 = j6mVar4;
                        tl3Var4 = tl3Var3;
                        colorFilter4 = colorFilter2;
                    }
                } else {
                    if (i9 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i2 & 8) != 0) {
                        uwr uwrVar9 = cbx.a;
                        zov0 zov0Var5 = cbx.b(b0kVar3).g;
                        p3vVar4 = new p3v(64.0f);
                        i3 &= -7169;
                    } else {
                        p3vVar4 = p3vVar2;
                    }
                    if ((i2 & 16) != 0) {
                        uwr uwrVar10 = cbx.a;
                        cua cuaVar9 = cbx.b(b0kVar3).f;
                        cua cuaVar10 = cbx.b(b0kVar3).f;
                        zvxVar4 = new zvx();
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        cbx.a.getClass();
                        ecxVarA = uwr.a();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        j6mVar4 = mif1.P0;
                        i3 &= -3670017;
                    } else {
                        j6mVar4 = j6mVar2;
                    }
                    tl3Var3 = een.h;
                    i6 = i3 & (-29360129);
                    if (i4 != 0) {
                        zvxVar3 = zvxVar4;
                        ecxVar3 = ecxVarA;
                        qim0Var5 = qim0Var4;
                        p3vVar5 = p3vVar4;
                        j6mVar5 = j6mVar4;
                        tl3Var4 = tl3Var3;
                        colorFilter4 = null;
                    } else {
                        zvxVar3 = zvxVar4;
                        ecxVar3 = ecxVarA;
                        qim0Var5 = qim0Var4;
                        p3vVar5 = p3vVar4;
                        j6mVar5 = j6mVar4;
                        tl3Var4 = tl3Var3;
                        colorFilter4 = colorFilter2;
                    }
                }
                b0kVar3.s();
                zG = b0kVar3.g(yk4Var);
                objT = b0kVar3.T();
                if (zG) {
                    objT = new pxa(yk4Var);
                    b0kVar3.s0(objT);
                } else {
                    objT = new pxa(yk4Var);
                    b0kVar3.s0(objT);
                }
                b0kVar2 = b0kVar3;
                h((jmr0) objT, kslVar, qim0Var5, p3vVar5, zvxVar3, ecxVar3, j6mVar5, tl3Var4, colorFilter4, b0kVar2, (i6 & 112) | 8 | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (234881024 & i6), 0);
                qim0Var3 = qim0Var5;
                p3vVar3 = p3vVar5;
                zvxVar2 = zvxVar3;
                ecxVar2 = ecxVar3;
                j6mVar3 = j6mVar5;
                tl3Var2 = tl3Var4;
                colorFilter3 = colorFilter4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                zvxVar2 = zvxVar4;
                qim0Var3 = qim0Var2;
                p3vVar3 = p3vVar2;
                j6mVar3 = j6mVar2;
                colorFilter3 = colorFilter2;
                tl3Var2 = tl3Var;
                ecxVar2 = ecxVarA;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new kux(yk4Var, kslVar, qim0Var3, p3vVar3, zvxVar2, ecxVar2, j6mVar3, tl3Var2, colorFilter3, i, i2, (byte) 1);
            }
        }
        i3 |= 100663296;
        colorFilter2 = colorFilter;
        if ((38347923 & i3) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar11 = cbx.a;
                    zov0 zov0Var6 = cbx.b(b0kVar3).g;
                    p3vVar4 = new p3v(64.0f);
                    i3 &= -7169;
                } else {
                    p3vVar4 = p3vVar2;
                }
                if ((i2 & 16) != 0) {
                    uwr uwrVar12 = cbx.a;
                    cua cuaVar11 = cbx.b(b0kVar3).f;
                    cua cuaVar12 = cbx.b(b0kVar3).f;
                    zvxVar4 = new zvx();
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    cbx.a.getClass();
                    ecxVarA = uwr.a();
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    j6mVar4 = mif1.P0;
                    i3 &= -3670017;
                } else {
                    j6mVar4 = j6mVar2;
                }
                tl3Var3 = een.h;
                i6 = i3 & (-29360129);
                if (i4 != 0) {
                    zvxVar3 = zvxVar4;
                    ecxVar3 = ecxVarA;
                    qim0Var5 = qim0Var4;
                    p3vVar5 = p3vVar4;
                    j6mVar5 = j6mVar4;
                    tl3Var4 = tl3Var3;
                    colorFilter4 = null;
                } else {
                    zvxVar3 = zvxVar4;
                    ecxVar3 = ecxVarA;
                    qim0Var5 = qim0Var4;
                    p3vVar5 = p3vVar4;
                    j6mVar5 = j6mVar4;
                    tl3Var4 = tl3Var3;
                    colorFilter4 = colorFilter2;
                }
            } else {
                if (i9 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar13 = cbx.a;
                    zov0 zov0Var7 = cbx.b(b0kVar3).g;
                    p3vVar4 = new p3v(64.0f);
                    i3 &= -7169;
                } else {
                    p3vVar4 = p3vVar2;
                }
                if ((i2 & 16) != 0) {
                    uwr uwrVar14 = cbx.a;
                    cua cuaVar13 = cbx.b(b0kVar3).f;
                    cua cuaVar14 = cbx.b(b0kVar3).f;
                    zvxVar4 = new zvx();
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    cbx.a.getClass();
                    ecxVarA = uwr.a();
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    j6mVar4 = mif1.P0;
                    i3 &= -3670017;
                } else {
                    j6mVar4 = j6mVar2;
                }
                tl3Var3 = een.h;
                i6 = i3 & (-29360129);
                if (i4 != 0) {
                    zvxVar3 = zvxVar4;
                    ecxVar3 = ecxVarA;
                    qim0Var5 = qim0Var4;
                    p3vVar5 = p3vVar4;
                    j6mVar5 = j6mVar4;
                    tl3Var4 = tl3Var3;
                    colorFilter4 = null;
                } else {
                    zvxVar3 = zvxVar4;
                    ecxVar3 = ecxVarA;
                    qim0Var5 = qim0Var4;
                    p3vVar5 = p3vVar4;
                    j6mVar5 = j6mVar4;
                    tl3Var4 = tl3Var3;
                    colorFilter4 = colorFilter2;
                }
            }
            b0kVar3.s();
            zG = b0kVar3.g(yk4Var);
            objT = b0kVar3.T();
            if (zG) {
                objT = new pxa(yk4Var);
                b0kVar3.s0(objT);
            } else {
                objT = new pxa(yk4Var);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            h((jmr0) objT, kslVar, qim0Var5, p3vVar5, zvxVar3, ecxVar3, j6mVar5, tl3Var4, colorFilter4, b0kVar2, (i6 & 112) | 8 | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (234881024 & i6), 0);
            qim0Var3 = qim0Var5;
            p3vVar3 = p3vVar5;
            zvxVar2 = zvxVar3;
            ecxVar2 = ecxVar3;
            j6mVar3 = j6mVar5;
            tl3Var2 = tl3Var4;
            colorFilter3 = colorFilter4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            zvxVar2 = zvxVar4;
            qim0Var3 = qim0Var2;
            p3vVar3 = p3vVar2;
            j6mVar3 = j6mVar2;
            colorFilter3 = colorFilter2;
            tl3Var2 = tl3Var;
            ecxVar2 = ecxVarA;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kux(yk4Var, kslVar, qim0Var3, p3vVar3, zvxVar2, ecxVar2, j6mVar3, tl3Var2, colorFilter3, i, i2, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x012b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0132  */
    /* JADX WARN: Code duplicated, block: B:107:0x0148  */
    /* JADX WARN: Code duplicated, block: B:110:0x0162  */
    /* JADX WARN: Code duplicated, block: B:113:0x0172  */
    /* JADX WARN: Code duplicated, block: B:116:0x017c  */
    /* JADX WARN: Code duplicated, block: B:119:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    public static final void g(b180 b180Var, ksl kslVar, qim0 qim0Var, p3v p3vVar, zvx zvxVar, ecx ecxVar, j6m j6mVar, tl3 tl3Var, ColorFilter colorFilter, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        p3v p3vVar2;
        zvx zvxVar2;
        ecx ecxVarA;
        j6m j6mVar2;
        int i3;
        int i4;
        ColorFilter colorFilter2;
        int i5;
        int i6;
        boolean z;
        b0k b0kVar2;
        ColorFilter colorFilter3;
        qim0 qim0Var3;
        p3v p3vVar3;
        zvx zvxVar3;
        ecx ecxVar2;
        j6m j6mVar3;
        tl3 tl3Var2;
        h311 h311VarV;
        ColorFilter colorFilter4;
        tl3 tl3Var3;
        qim0 qim0Var4;
        p3v p3vVar4;
        zvx zvxVar4;
        ecx ecxVar3;
        j6m j6mVar4;
        int i7;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1622286683);
        int i8 = (b0kVar3.i(b180Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i8 |= b0kVar3.g(kslVar) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i8 |= b0kVar3.i(qim0Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    p3vVar2 = p3vVar;
                    int i10 = b0kVar3.g(p3vVar2) ? 2048 : 1024;
                    i8 |= i10;
                } else {
                    p3vVar2 = p3vVar;
                }
                i8 |= i10;
            } else {
                p3vVar2 = p3vVar;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    zvxVar2 = zvxVar;
                    int i11 = b0kVar3.g(zvxVar2) ? 16384 : 8192;
                    i8 |= i11;
                } else {
                    zvxVar2 = zvxVar;
                }
                i8 |= i11;
            } else {
                zvxVar2 = zvxVar;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    ecxVarA = ecxVar;
                    int i12 = b0kVar3.g(ecxVarA) ? 131072 : 65536;
                    i8 |= i12;
                } else {
                    ecxVarA = ecxVar;
                }
                i8 |= i12;
            } else {
                ecxVarA = ecxVar;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    j6mVar2 = j6mVar;
                    int i13 = b0kVar3.i(j6mVar2) ? 1048576 : 524288;
                    i8 |= i13;
                } else {
                    j6mVar2 = j6mVar;
                }
                i8 |= i13;
            } else {
                j6mVar2 = j6mVar;
            }
            i3 = 4194304 | i8;
            i4 = i2 & 256;
            if (i4 != 0) {
                i6 = i8 | 104857600;
                colorFilter2 = colorFilter;
            } else {
                colorFilter2 = colorFilter;
                if (b0kVar3.i(colorFilter2)) {
                    i5 = 67108864;
                } else {
                    i5 = 33554432;
                }
                i6 = i3 | i5;
            }
            if ((38347923 & i6) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i6 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0 || b0kVar3.E()) {
                    if (i9 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 8) != 0) {
                        uwr uwrVar = cbx.a;
                        zov0 zov0Var = cbx.b(b0kVar3).g;
                        i6 &= -7169;
                        p3vVar2 = new p3v(64.0f);
                    }
                    if ((i2 & 16) != 0) {
                        uwr uwrVar2 = cbx.a;
                        cua cuaVar = cbx.b(b0kVar3).f;
                        cua cuaVar2 = cbx.b(b0kVar3).f;
                        i6 &= -57345;
                        zvxVar2 = new zvx();
                    }
                    if ((i2 & 32) != 0) {
                        cbx.a.getClass();
                        i6 &= -458753;
                        ecxVarA = uwr.a();
                    }
                    if ((i2 & 64) != 0) {
                        i6 &= -3670017;
                        j6mVar2 = mif1.P0;
                    }
                    tl3 tl3Var4 = een.h;
                    int i14 = i6 & (-29360129);
                    if (i4 != 0) {
                        colorFilter2 = null;
                    }
                    colorFilter4 = colorFilter2;
                    tl3Var3 = tl3Var4;
                    qim0Var4 = qim0Var2;
                    p3vVar4 = p3vVar2;
                    zvxVar4 = zvxVar2;
                    ecxVar3 = ecxVarA;
                    j6mVar4 = j6mVar2;
                    i7 = i14;
                } else {
                    b0kVar3.b0();
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i6 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i6 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i6 &= -3670017;
                    }
                    i7 = i6 & (-29360129);
                    tl3Var3 = tl3Var;
                    colorFilter4 = colorFilter2;
                    qim0Var4 = qim0Var2;
                    p3vVar4 = p3vVar2;
                    zvxVar4 = zvxVar2;
                    ecxVar3 = ecxVarA;
                    j6mVar4 = j6mVar2;
                }
                b0kVar3.s();
                b0kVar2 = b0kVar3;
                h(byo1.s(b180Var, b0kVar3), kslVar, qim0Var4, p3vVar4, zvxVar4, ecxVar3, j6mVar4, tl3Var3, colorFilter4, b0kVar2, (i7 & 112) | 8 | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (i7 & 234881024), 0);
                qim0Var3 = qim0Var4;
                p3vVar3 = p3vVar4;
                zvxVar3 = zvxVar4;
                ecxVar2 = ecxVar3;
                j6mVar3 = j6mVar4;
                tl3Var2 = tl3Var3;
                colorFilter3 = colorFilter4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                colorFilter3 = colorFilter2;
                qim0Var3 = qim0Var2;
                p3vVar3 = p3vVar2;
                zvxVar3 = zvxVar2;
                ecxVar2 = ecxVarA;
                j6mVar3 = j6mVar2;
                tl3Var2 = tl3Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new mux(b180Var, kslVar, qim0Var3, p3vVar3, zvxVar3, ecxVar2, j6mVar3, tl3Var2, colorFilter3, i, i2);
            }
        }
        i8 |= 384;
        qim0Var2 = qim0Var;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                p3vVar2 = p3vVar;
                if (b0kVar3.g(p3vVar2)) {
                }
                i8 |= i10;
            } else {
                p3vVar2 = p3vVar;
            }
            i8 |= i10;
        } else {
            p3vVar2 = p3vVar;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                zvxVar2 = zvxVar;
                if (b0kVar3.g(zvxVar2)) {
                }
                i8 |= i11;
            } else {
                zvxVar2 = zvxVar;
            }
            i8 |= i11;
        } else {
            zvxVar2 = zvxVar;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                ecxVarA = ecxVar;
                if (b0kVar3.g(ecxVarA)) {
                }
                i8 |= i12;
            } else {
                ecxVarA = ecxVar;
            }
            i8 |= i12;
        } else {
            ecxVarA = ecxVar;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                j6mVar2 = j6mVar;
                if (b0kVar3.i(j6mVar2)) {
                }
                i8 |= i13;
            } else {
                j6mVar2 = j6mVar;
            }
            i8 |= i13;
        } else {
            j6mVar2 = j6mVar;
        }
        i3 = 4194304 | i8;
        i4 = i2 & 256;
        if (i4 != 0) {
            i6 = i8 | 104857600;
            colorFilter2 = colorFilter;
        } else {
            colorFilter2 = colorFilter;
            if (b0kVar3.i(colorFilter2)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i6 = i3 | i5;
        }
        if ((38347923 & i6) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i6 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar3 = cbx.a;
                    zov0 zov0Var2 = cbx.b(b0kVar3).g;
                    i6 &= -7169;
                    p3vVar2 = new p3v(64.0f);
                }
                if ((i2 & 16) != 0) {
                    uwr uwrVar4 = cbx.a;
                    cua cuaVar3 = cbx.b(b0kVar3).f;
                    cua cuaVar4 = cbx.b(b0kVar3).f;
                    i6 &= -57345;
                    zvxVar2 = new zvx();
                }
                if ((i2 & 32) != 0) {
                    cbx.a.getClass();
                    i6 &= -458753;
                    ecxVarA = uwr.a();
                }
                if ((i2 & 64) != 0) {
                    i6 &= -3670017;
                    j6mVar2 = mif1.P0;
                }
                tl3 tl3Var5 = een.h;
                int i15 = i6 & (-29360129);
                if (i4 != 0) {
                    colorFilter2 = null;
                }
                colorFilter4 = colorFilter2;
                tl3Var3 = tl3Var5;
                qim0Var4 = qim0Var2;
                p3vVar4 = p3vVar2;
                zvxVar4 = zvxVar2;
                ecxVar3 = ecxVarA;
                j6mVar4 = j6mVar2;
                i7 = i15;
            } else {
                if (i9 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar5 = cbx.a;
                    zov0 zov0Var3 = cbx.b(b0kVar3).g;
                    i6 &= -7169;
                    p3vVar2 = new p3v(64.0f);
                }
                if ((i2 & 16) != 0) {
                    uwr uwrVar6 = cbx.a;
                    cua cuaVar5 = cbx.b(b0kVar3).f;
                    cua cuaVar6 = cbx.b(b0kVar3).f;
                    i6 &= -57345;
                    zvxVar2 = new zvx();
                }
                if ((i2 & 32) != 0) {
                    cbx.a.getClass();
                    i6 &= -458753;
                    ecxVarA = uwr.a();
                }
                if ((i2 & 64) != 0) {
                    i6 &= -3670017;
                    j6mVar2 = mif1.P0;
                }
                tl3 tl3Var6 = een.h;
                int i16 = i6 & (-29360129);
                if (i4 != 0) {
                    colorFilter2 = null;
                }
                colorFilter4 = colorFilter2;
                tl3Var3 = tl3Var6;
                qim0Var4 = qim0Var2;
                p3vVar4 = p3vVar2;
                zvxVar4 = zvxVar2;
                ecxVar3 = ecxVarA;
                j6mVar4 = j6mVar2;
                i7 = i16;
            }
            b0kVar3.s();
            b0kVar2 = b0kVar3;
            h(byo1.s(b180Var, b0kVar3), kslVar, qim0Var4, p3vVar4, zvxVar4, ecxVar3, j6mVar4, tl3Var3, colorFilter4, b0kVar2, (i7 & 112) | 8 | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (i7 & 234881024), 0);
            qim0Var3 = qim0Var4;
            p3vVar3 = p3vVar4;
            zvxVar3 = zvxVar4;
            ecxVar2 = ecxVar3;
            j6mVar3 = j6mVar4;
            tl3Var2 = tl3Var3;
            colorFilter3 = colorFilter4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            colorFilter3 = colorFilter2;
            qim0Var3 = qim0Var2;
            p3vVar3 = p3vVar2;
            zvxVar3 = zvxVar2;
            ecxVar2 = ecxVarA;
            j6mVar3 = j6mVar2;
            tl3Var2 = tl3Var;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mux(b180Var, kslVar, qim0Var3, p3vVar3, zvxVar3, ecxVar2, j6mVar3, tl3Var2, colorFilter3, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011d  */
    /* JADX WARN: Code duplicated, block: B:101:0x0120  */
    /* JADX WARN: Code duplicated, block: B:104:0x012a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x0172  */
    /* JADX WARN: Code duplicated, block: B:130:0x0179  */
    /* JADX WARN: Code duplicated, block: B:133:0x018f  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:141:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:153:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:158:0x01fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:162:0x0212  */
    /* JADX WARN: Code duplicated, block: B:165:0x0223  */
    /* JADX WARN: Code duplicated, block: B:168:0x0232  */
    /* JADX WARN: Code duplicated, block: B:169:0x0238  */
    /* JADX WARN: Code duplicated, block: B:171:0x026b  */
    /* JADX WARN: Code duplicated, block: B:174:0x027d  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x010b  */
    public static final void h(jmr0 jmr0Var, ksl kslVar, qim0 qim0Var, p3v p3vVar, zvx zvxVar, ecx ecxVar, j6m j6mVar, tl3 tl3Var, ColorFilter colorFilter, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        p3v p3vVar2;
        j6m j6mVar2;
        tl3 tl3Var2;
        int i4;
        ColorFilter colorFilter2;
        int i5;
        boolean z;
        zvx zvxVar2;
        qim0 qim0Var3;
        p3v p3vVar3;
        j6m j6mVar3;
        ColorFilter colorFilter3;
        tl3 tl3Var3;
        ecx ecxVar2;
        h311 h311VarV;
        zvx zvxVar3;
        j6m j6mVar4;
        tl3 tl3Var4;
        int i6;
        j6m j6mVar5;
        zvx zvxVar4;
        ecx ecxVar3;
        tl3 tl3Var5;
        p3v p3vVar4;
        qim0 qim0Var4;
        ColorFilter colorFilter4;
        boolean z2;
        Object objT;
        Object objT2;
        Object objT3;
        String str;
        int i7;
        boolean zI;
        int i8;
        boolean zI2;
        ecx ecxVarA = ecxVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1276929106);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(jmr0Var) : x340Var.i(jmr0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(kslVar) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    p3vVar2 = p3vVar;
                    int i10 = x340Var.g(p3vVar2) ? 2048 : 1024;
                    i3 |= i10;
                } else {
                    p3vVar2 = p3vVar;
                }
                i3 |= i10;
            } else {
                p3vVar2 = p3vVar;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) != 0) {
                    i8 = 8192;
                } else {
                    if ((32768 & i) == 0) {
                        zI2 = x340Var.g(zvxVar);
                    } else {
                        zI2 = x340Var.i(zvxVar);
                    }
                    if (zI2) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                }
                i3 |= i8;
            }
            if ((i & 196608) == 0) {
                if ((i2 & 32) != 0) {
                    i7 = 65536;
                } else {
                    if ((262144 & i) == 0) {
                        zI = x340Var.g(ecxVarA);
                    } else {
                        zI = x340Var.i(ecxVarA);
                    }
                    if (zI) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    j6mVar2 = j6mVar;
                    int i11 = x340Var.i(j6mVar2) ? 1048576 : 524288;
                    i3 |= i11;
                } else {
                    j6mVar2 = j6mVar;
                }
                i3 |= i11;
            } else {
                j6mVar2 = j6mVar;
            }
            if ((12582912 & i) == 0) {
                if ((i2 & 128) == 0) {
                    tl3Var2 = tl3Var;
                    int i12 = x340Var.i(tl3Var2) ? 8388608 : 4194304;
                    i3 |= i12;
                } else {
                    tl3Var2 = tl3Var;
                }
                i3 |= i12;
            } else {
                tl3Var2 = tl3Var;
            }
            i4 = i2 & 256;
            if (i4 != 0) {
                i3 |= 100663296;
                colorFilter2 = colorFilter;
            } else {
                colorFilter2 = colorFilter;
                if ((i & 100663296) == 0) {
                    if (x340Var.i(colorFilter2)) {
                        i5 = 67108864;
                    } else {
                        i5 = 33554432;
                    }
                    i3 |= i5;
                }
            }
            if ((i3 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if (i9 != 0) {
                        qim0Var2 = nim0.a;
                    }
                    if ((i2 & 8) != 0) {
                        uwr uwrVar = cbx.a;
                        zov0 zov0Var = cbx.b(x340Var).g;
                        i3 &= -7169;
                        p3vVar2 = new p3v(64.0f);
                    }
                    if ((i2 & 16) != 0) {
                        uwr uwrVar2 = cbx.a;
                        cua cuaVar = cbx.b(x340Var).f;
                        cua cuaVar2 = cbx.b(x340Var).f;
                        zvxVar3 = new zvx();
                        i3 &= -57345;
                    } else {
                        zvxVar3 = zvxVar;
                    }
                    if ((i2 & 32) != 0) {
                        cbx.a.getClass();
                        ecxVarA = uwr.a();
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        j6mVar4 = mif1.P0;
                        i3 &= -3670017;
                    } else {
                        j6mVar4 = j6mVar2;
                    }
                    if ((i2 & 128) != 0) {
                        tl3Var4 = een.h;
                        i3 &= -29360129;
                    } else {
                        tl3Var4 = tl3Var2;
                    }
                    if (i4 != 0) {
                        j6m j6mVar6 = j6mVar4;
                        i6 = i3;
                        j6mVar5 = j6mVar6;
                        zvxVar4 = zvxVar3;
                        ecxVar3 = ecxVarA;
                        p3vVar4 = p3vVar2;
                        tl3Var5 = tl3Var4;
                        qim0Var4 = qim0Var2;
                        colorFilter4 = null;
                    } else {
                        j6m j6mVar7 = j6mVar4;
                        i6 = i3;
                        j6mVar5 = j6mVar7;
                        zvxVar4 = zvxVar3;
                        ecxVar3 = ecxVarA;
                        tl3Var5 = tl3Var4;
                    }
                    x340Var.s();
                    z2 = (((458752 & i6) ^ 196608) <= 131072 && x340Var.i(ecxVar3)) || (i6 & 196608) == 131072;
                    objT = x340Var.T();
                    if (z2 || objT == m4cVar) {
                        objT = new fc3(ecxVar3, (byte) 6);
                        x340Var.s0(objT);
                    }
                    qim0 qim0VarD = D(qim0Var4, p3vVar4, (vu30) objT);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = v30.V0;
                        x340Var.s0(objT2);
                    }
                    qim0 qim0VarD2 = D(qim0VarD, ecxVar3, (vu30) objT2);
                    objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = lgx.g;
                        x340Var.s0(objT3);
                    }
                    qim0 qim0VarD3 = D(qim0VarD2, zvxVar4, (vu30) objT3);
                    if (kslVar instanceof jsl) {
                        str = ((jsl) kslVar).a;
                    } else {
                        str = null;
                    }
                    int i13 = 8 | (i6 & 14) | ((i6 >> 12) & 7168);
                    int i14 = i6 >> 6;
                    tl3 tl3Var6 = tl3Var5;
                    cwl1.f(jmr0Var, str, qim0VarD3, tl3Var6, j6mVar5, 0.0f, colorFilter4, x340Var, i13 | (57344 & i14) | (i14 & 3670016), 32);
                    tl3Var3 = tl3Var6;
                    colorFilter3 = colorFilter4;
                    qim0Var3 = qim0Var4;
                    zvxVar2 = zvxVar4;
                    ecxVar2 = ecxVar3;
                    j6mVar3 = j6mVar5;
                    p3vVar3 = p3vVar4;
                } else {
                    x340Var.b0();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    ecxVar3 = ecxVarA;
                    i6 = i3;
                    j6mVar5 = j6mVar2;
                    tl3Var5 = tl3Var2;
                    zvxVar4 = zvxVar;
                }
                qim0Var4 = qim0Var2;
                colorFilter4 = colorFilter2;
                p3vVar4 = p3vVar2;
                x340Var.s();
                if (((458752 & i6) ^ 196608) <= 131072) {
                }
                objT = x340Var.T();
                if (z2) {
                    objT = new fc3(ecxVar3, (byte) 6);
                    x340Var.s0(objT);
                } else {
                    objT = new fc3(ecxVar3, (byte) 6);
                    x340Var.s0(objT);
                }
                qim0 qim0VarD4 = D(qim0Var4, p3vVar4, (vu30) objT);
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = v30.V0;
                    x340Var.s0(objT2);
                }
                qim0 qim0VarD5 = D(qim0VarD4, ecxVar3, (vu30) objT2);
                objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = lgx.g;
                    x340Var.s0(objT3);
                }
                qim0 qim0VarD6 = D(qim0VarD5, zvxVar4, (vu30) objT3);
                if (kslVar instanceof jsl) {
                    str = ((jsl) kslVar).a;
                } else {
                    str = null;
                }
                int i15 = 8 | (i6 & 14) | ((i6 >> 12) & 7168);
                int i16 = i6 >> 6;
                tl3 tl3Var7 = tl3Var5;
                cwl1.f(jmr0Var, str, qim0VarD6, tl3Var7, j6mVar5, 0.0f, colorFilter4, x340Var, i15 | (57344 & i16) | (i16 & 3670016), 32);
                tl3Var3 = tl3Var7;
                colorFilter3 = colorFilter4;
                qim0Var3 = qim0Var4;
                zvxVar2 = zvxVar4;
                ecxVar2 = ecxVar3;
                j6mVar3 = j6mVar5;
                p3vVar3 = p3vVar4;
            } else {
                x340Var.b0();
                zvxVar2 = zvxVar;
                qim0Var3 = qim0Var2;
                p3vVar3 = p3vVar2;
                j6mVar3 = j6mVar2;
                colorFilter3 = colorFilter2;
                tl3Var3 = tl3Var2;
                ecxVar2 = ecxVarA;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new kux(jmr0Var, kslVar, qim0Var3, p3vVar3, zvxVar2, ecxVar2, j6mVar3, tl3Var3, colorFilter3, i, i2, (byte) 0);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                p3vVar2 = p3vVar;
                if (x340Var.g(p3vVar2)) {
                }
                i3 |= i10;
            } else {
                p3vVar2 = p3vVar;
            }
            i3 |= i10;
        } else {
            p3vVar2 = p3vVar;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) != 0) {
                i8 = 8192;
            } else {
                if ((32768 & i) == 0) {
                    zI2 = x340Var.g(zvxVar);
                } else {
                    zI2 = x340Var.i(zvxVar);
                }
                if (zI2) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
            }
            i3 |= i8;
        }
        if ((i & 196608) == 0) {
            if ((i2 & 32) != 0) {
                i7 = 65536;
            } else {
                if ((262144 & i) == 0) {
                    zI = x340Var.g(ecxVarA);
                } else {
                    zI = x340Var.i(ecxVarA);
                }
                if (zI) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
            }
            i3 |= i7;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                j6mVar2 = j6mVar;
                if (x340Var.i(j6mVar2)) {
                }
                i3 |= i11;
            } else {
                j6mVar2 = j6mVar;
            }
            i3 |= i11;
        } else {
            j6mVar2 = j6mVar;
        }
        if ((12582912 & i) == 0) {
            if ((i2 & 128) == 0) {
                tl3Var2 = tl3Var;
                if (x340Var.i(tl3Var2)) {
                }
                i3 |= i12;
            } else {
                tl3Var2 = tl3Var;
            }
            i3 |= i12;
        } else {
            tl3Var2 = tl3Var;
        }
        i4 = i2 & 256;
        if (i4 != 0) {
            i3 |= 100663296;
            colorFilter2 = colorFilter;
        } else {
            colorFilter2 = colorFilter;
            if ((i & 100663296) == 0) {
                if (x340Var.i(colorFilter2)) {
                    i5 = 67108864;
                } else {
                    i5 = 33554432;
                }
                i3 |= i5;
            }
        }
        if ((i3 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar3 = cbx.a;
                    zov0 zov0Var2 = cbx.b(x340Var).g;
                    i3 &= -7169;
                    p3vVar2 = new p3v(64.0f);
                }
                if ((i2 & 16) != 0) {
                    uwr uwrVar4 = cbx.a;
                    cua cuaVar3 = cbx.b(x340Var).f;
                    cua cuaVar4 = cbx.b(x340Var).f;
                    zvxVar3 = new zvx();
                    i3 &= -57345;
                } else {
                    zvxVar3 = zvxVar;
                }
                if ((i2 & 32) != 0) {
                    cbx.a.getClass();
                    ecxVarA = uwr.a();
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    j6mVar4 = mif1.P0;
                    i3 &= -3670017;
                } else {
                    j6mVar4 = j6mVar2;
                }
                if ((i2 & 128) != 0) {
                    tl3Var4 = een.h;
                    i3 &= -29360129;
                } else {
                    tl3Var4 = tl3Var2;
                }
                if (i4 != 0) {
                    j6m j6mVar8 = j6mVar4;
                    i6 = i3;
                    j6mVar5 = j6mVar8;
                    zvxVar4 = zvxVar3;
                    ecxVar3 = ecxVarA;
                    p3vVar4 = p3vVar2;
                    tl3Var5 = tl3Var4;
                    qim0Var4 = qim0Var2;
                    colorFilter4 = null;
                } else {
                    j6m j6mVar9 = j6mVar4;
                    i6 = i3;
                    j6mVar5 = j6mVar9;
                    zvxVar4 = zvxVar3;
                    ecxVar3 = ecxVarA;
                    tl3Var5 = tl3Var4;
                    qim0Var4 = qim0Var2;
                    colorFilter4 = colorFilter2;
                    p3vVar4 = p3vVar2;
                }
            } else {
                if (i9 != 0) {
                    qim0Var2 = nim0.a;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar5 = cbx.a;
                    zov0 zov0Var3 = cbx.b(x340Var).g;
                    i3 &= -7169;
                    p3vVar2 = new p3v(64.0f);
                }
                if ((i2 & 16) != 0) {
                    uwr uwrVar6 = cbx.a;
                    cua cuaVar5 = cbx.b(x340Var).f;
                    cua cuaVar6 = cbx.b(x340Var).f;
                    zvxVar3 = new zvx();
                    i3 &= -57345;
                } else {
                    zvxVar3 = zvxVar;
                }
                if ((i2 & 32) != 0) {
                    cbx.a.getClass();
                    ecxVarA = uwr.a();
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    j6mVar4 = mif1.P0;
                    i3 &= -3670017;
                } else {
                    j6mVar4 = j6mVar2;
                }
                if ((i2 & 128) != 0) {
                    tl3Var4 = een.h;
                    i3 &= -29360129;
                } else {
                    tl3Var4 = tl3Var2;
                }
                if (i4 != 0) {
                    j6m j6mVar10 = j6mVar4;
                    i6 = i3;
                    j6mVar5 = j6mVar10;
                    zvxVar4 = zvxVar3;
                    ecxVar3 = ecxVarA;
                    p3vVar4 = p3vVar2;
                    tl3Var5 = tl3Var4;
                    qim0Var4 = qim0Var2;
                    colorFilter4 = null;
                } else {
                    j6m j6mVar11 = j6mVar4;
                    i6 = i3;
                    j6mVar5 = j6mVar11;
                    zvxVar4 = zvxVar3;
                    ecxVar3 = ecxVarA;
                    tl3Var5 = tl3Var4;
                    qim0Var4 = qim0Var2;
                    colorFilter4 = colorFilter2;
                    p3vVar4 = p3vVar2;
                }
            }
            x340Var.s();
            if (((458752 & i6) ^ 196608) <= 131072) {
            }
            objT = x340Var.T();
            if (z2) {
                objT = new fc3(ecxVar3, (byte) 6);
                x340Var.s0(objT);
            } else {
                objT = new fc3(ecxVar3, (byte) 6);
                x340Var.s0(objT);
            }
            qim0 qim0VarD7 = D(qim0Var4, p3vVar4, (vu30) objT);
            objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v30.V0;
                x340Var.s0(objT2);
            }
            qim0 qim0VarD8 = D(qim0VarD7, ecxVar3, (vu30) objT2);
            objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = lgx.g;
                x340Var.s0(objT3);
            }
            qim0 qim0VarD9 = D(qim0VarD8, zvxVar4, (vu30) objT3);
            if (kslVar instanceof jsl) {
                str = ((jsl) kslVar).a;
            } else {
                str = null;
            }
            int i17 = 8 | (i6 & 14) | ((i6 >> 12) & 7168);
            int i18 = i6 >> 6;
            tl3 tl3Var8 = tl3Var5;
            cwl1.f(jmr0Var, str, qim0VarD9, tl3Var8, j6mVar5, 0.0f, colorFilter4, x340Var, i17 | (57344 & i18) | (i18 & 3670016), 32);
            tl3Var3 = tl3Var8;
            colorFilter3 = colorFilter4;
            qim0Var3 = qim0Var4;
            zvxVar2 = zvxVar4;
            ecxVar2 = ecxVar3;
            j6mVar3 = j6mVar5;
            p3vVar3 = p3vVar4;
        } else {
            x340Var.b0();
            zvxVar2 = zvxVar;
            qim0Var3 = qim0Var2;
            p3vVar3 = p3vVar2;
            j6mVar3 = j6mVar2;
            colorFilter3 = colorFilter2;
            tl3Var3 = tl3Var2;
            ecxVar2 = ecxVarA;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kux(jmr0Var, kslVar, qim0Var3, p3vVar3, zvxVar2, ecxVar2, j6mVar3, tl3Var3, colorFilter3, i, i2, (byte) 0);
        }
    }

    public static final void i(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1828052418);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarH = u291.h(qim0Var, 12.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            hr80.d(null, 1.0f, cbx.a(x340Var).a.b.c(), x340Var, 0, 1);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 9);
        }
    }

    public static final void j(boolean z, boolean z2, t7q0 t7q0Var, h7f h7fVar, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, b0k b0kVar, int i2) {
        int i3;
        boolean z8;
        boolean z9;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(95540006);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar2.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar2.h(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? b0kVar2.g(t7q0Var) : b0kVar2.i(t7q0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar2.i(h7fVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar2.e(l1d.C(i)) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= b0kVar2.h(z3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= b0kVar2.h(z4) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            z8 = z5;
            i3 |= b0kVar2.h(z8) ? 8388608 : 4194304;
        } else {
            z8 = z5;
        }
        if ((100663296 & i2) == 0) {
            z9 = z6;
            i3 |= b0kVar2.h(z9) ? 67108864 : 33554432;
        } else {
            z9 = z6;
        }
        if ((805306368 & i2) == 0) {
            i3 |= b0kVar2.h(z7) ? 536870912 : 268435456;
        }
        int i4 = i3;
        if (b0kVar2.Y(i4 & 1, (306783379 & i4) != 306783378)) {
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = c97.b(0.0f);
                b0kVar2.s0(objT);
            }
            o95 o95Var = (o95) objT;
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                objT2 = bb00.h(0, b0kVar2);
            }
            err0 err0Var = (hdn0) objT2;
            nyn1.a(z, z2, o95Var, err0Var.s(), b0kVar2, (i4 & 126) | 512);
            Object objT3 = b0kVar2.T();
            if (objT3 == m4cVar) {
                objT3 = new tu9(err0Var, (byte) 2);
                b0kVar2.s0(objT3);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarX = ern1.x(nim0Var, (iu30) objT3);
            boolean zI = b0kVar2.i(o95Var);
            Object objT4 = b0kVar2.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new wqe(o95Var, (byte) 1);
                b0kVar2.s0(objT4);
            }
            qim0 qim0VarB = eqr0.B(qim0VarX, (iu30) objT4);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            s6f s6fVar = new s6f(t7q0Var, i, z3, z8, z9, z7);
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar2;
            otw.c(h7fVar, s6fVar, dug.f(nim0Var, cbx.a(b0kVar2).a.c, d4o1.a), (ipb1) null, b0kVar2, (i4 >> 9) & 14, 8);
            if (z4) {
                b0kVar2.i0(-103066062);
                a(b0kVar2, 0);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-103035310);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wff(z, z2, t7q0Var, h7fVar, i, z3, z4, z5, z6, z7, i2);
        }
    }

    public static final void k(oxc1 oxc1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1626421725);
        int i2 = (b0kVar2.g(oxc1Var) ? 4 : 2) | i | 48;
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var3);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            jmr0 jmr0VarN = i3o1.n(oxc1Var.d, b0kVar2, 0);
            qim0 qim0VarN = anm1.N("summary-previous-period-icon-comparison", qim0Var3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarB = uyn1.B(qim0VarN, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            zov0 zov0Var = cbx.b(b0kVar2).g;
            h(jmr0VarN, isl.a, u291.r(qim0VarB, 12.0f), null, null, null, null, null, null, b0kVar2, 56, 504);
            qim0 qim0VarN2 = anm1.N("summary-previous-period-comparison", qim0Var3);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarN2, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            String strN0 = cwl1.n0(2131963621, new Object[]{Integer.valueOf(Math.abs(oxc1Var.a))}, b0kVar2);
            long jK = f5p1.k(b0kVar2, oxc1Var.c);
            lee1 lee1Var = cbx.d(b0kVar2).j;
            b0kVar2 = b0kVar2;
            uwo1.e(strN0, qim0VarB2, lee1Var, jK, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2032);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new sdb1(oxc1Var, qim0Var2, i, (byte) 8);
        }
    }

    public static final void l(String str, qxc1 qxc1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1190158418);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(qxc1Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            jw31 jw31VarA = ew31.a(h36.a, een.O0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, i2 & 14, 0, 1712);
            oxc1 oxc1Var = qxc1Var.e;
            if (oxc1Var == null) {
                x340Var.i0(885299663);
                x340Var.r(false);
            } else {
                x340Var.i0(885299664);
                k(oxc1Var, null, x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new juc1(str, qxc1Var, qim0Var2, i, (byte) 2);
        }
    }

    public static final void m(rxc1 rxc1Var, int i, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        boolean z;
        String string;
        boolean z2;
        qim0 qim0Var3;
        boolean z3;
        String str;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-75229419);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.i(rxc1Var) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qxc1 qxc1Var = rxc1Var.a;
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.c;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarA = uyn1.A(qim0Var4, 16.0f, f, 16.0f, 8.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
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
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            boolean z5 = (rxc1Var.b || qxc1Var.f == null) ? false : true;
            d761 d761Var = qxc1Var.a;
            boolean z6 = z5;
            String str2 = qxc1Var.c;
            Integer num = qxc1Var.f;
            d761 d761Var2 = qxc1Var.b;
            vnr0 vnr0VarG = d761Var.g((djc0) null, x340Var, 1);
            x340Var.i0(1889490466);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ljc1.W0;
                x340Var.s0(objT);
            }
            qim0 qim0VarN = anm1.N("summary-header", s161.b(qim0Var4, false, (iu30) objT));
            if (qxc1Var.d != null) {
                boolean zI = x340Var.i(qxc1Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new qwc1(qxc1Var, (byte) 1);
                    x340Var.s0(objT2);
                }
                qim0VarN = qim0VarN.then(s161.a(qim0Var4, (iu30) objT2));
            }
            x340Var.r(false);
            qim0 qim0Var5 = null;
            qgo1.f(vnr0VarG, qim0VarN, (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
            x340Var.i0(-1634685292);
            if (!z6 || num == null) {
                x340Var.i0(1724941902);
                x340Var.r(false);
                StringBuilder sb = new StringBuilder();
                sb.append(context.getString(i));
                if (d761Var2 == null) {
                    x340Var.i0(-465068432);
                    x340Var.r(false);
                    z = true;
                } else {
                    x340Var.i0(-465068431);
                    sb.append("\n");
                    z = true;
                    sb.append(kh.a(d761Var2.g((djc0) null, x340Var, 1)));
                    x340Var.r(false);
                }
                if (str2 != null) {
                    sb.append("\n");
                    sb.append(str2);
                }
                oxc1 oxc1Var = qxc1Var.e;
                if (oxc1Var != null) {
                    sb.append("\n");
                    sb.append(context.getString(oxc1Var.b, Integer.valueOf(oxc1Var.a)));
                }
                string = sb.toString();
                z2 = false;
                x340Var.r(false);
            } else {
                x340Var.i0(1724872710);
                string = cwl1.o0(x340Var, num.intValue());
                x340Var.r(false);
                x340Var.r(false);
                z2 = false;
                z = true;
            }
            if (!z6 && d761Var2 == null && str2 == null) {
                x340Var.i0(-1554010121);
                x340Var.r(z2);
                qim0Var3 = qim0Var4;
            } else {
                x340Var.i0(-1554870216);
                boolean zG = x340Var.g(string);
                Object objT3 = x340Var.T();
                if (zG || objT3 == m4cVar) {
                    objT3 = new hqa1(string, (byte) 10);
                    x340Var.s0(objT3);
                }
                qim0Var3 = qim0Var4;
                qim0 qim0VarA2 = s161.a(qim0Var3, (iu30) objT3);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA2);
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
                if (z6) {
                    x340Var.i0(1058895866);
                    String strO0 = cwl1.o0(x340Var, num.intValue());
                    qim0 qim0VarN2 = anm1.N("summary-title", qim0Var3);
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    z3 = false;
                    uwo1.e(strO0, uyn1.B(qim0VarN2, 0.0f, 12.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).c, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
                    x340Var.r(false);
                    qim0Var5 = null;
                    str = str2;
                } else {
                    z3 = false;
                    str = str2;
                    x340Var.i0(1059284606);
                    if (d761Var2 == null) {
                        x340Var.i0(1059284605);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1059284606);
                        vnr0 vnr0VarG2 = d761Var2.g((djc0) null, x340Var, 1);
                        qim0 qim0VarN3 = anm1.N("summary-title", qim0Var3);
                        cvx cvxVar5 = cbx.b(x340Var).b;
                        qgo1.f(vnr0VarG2, uyn1.B(qim0VarN3, 0.0f, 12.0f, 0.0f, 0.0f, 13), (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
                        x340Var.r(false);
                    }
                    x340Var.r(false);
                }
                if (str == null) {
                    x340Var = x340Var;
                    x340Var.i0(1059574734);
                } else {
                    x340Var = x340Var;
                    x340Var.i0(1059574735);
                    l(str, qxc1Var, qim0Var5, x340Var, 64);
                }
                x340Var.r(z3);
                z = true;
                x340Var.r(true);
                x340Var.r(z3);
            }
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(rxc1Var, i, qim0Var2, i2, (byte) 12);
        }
    }

    public static boolean n(byte b) {
        return b >= 0;
    }

    public static void o(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static final List p(jma jmaVar, px9 px9Var) {
        jlq0 opwVar = new opw((jnh0) new cbp0(0, px9Var.A, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 8).invoke(), (byte) 2);
        jlq0 j5nVar = new j5n(Boolean.TRUE.booleanValue());
        cbp0 cbp0Var = new cbp0(0, px9Var.W, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 10);
        kly0 kly0Var = px9Var.X;
        return p7h.M(new jlq0[]{opwVar, j5nVar, new l021((UserDirectoryCachePaths) cbp0Var.invoke(), (jqb1) new cbp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 11).invoke(), (byte) 1), new wo5((FireAndForgetResolver) new cbp0(0, px9Var.P, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6).invoke(), (jqb1) new cbp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 7).invoke(), (byte) 5), new l021(px9Var.Q, (y2g0) new cbp0(0, px9Var.S, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 9).invoke(), (byte) 0)});
    }

    public static final fi10 q(q640 q640Var) {
        u740 u740Var = q640Var.a;
        fi10 fi10Var = u740Var != null ? u740Var.d : null;
        String str = fi10Var != null ? fi10Var.a : null;
        if (str == null || str.length() == 0) {
            String str2 = fi10Var != null ? fi10Var.b : null;
            if (str2 == null || str2.length() == 0) {
                return null;
            }
        }
        return fi10Var;
    }

    public static final int r(int i) {
        return no20.b(no20.c.d(i).booleanValue(), (fhy0) no20.d.d(i), (agy0) no20.e.d(i));
    }

    public static final bqi0 s(ggy0 ggy0Var, zjn0 zjn0Var, l141 l141Var, boolean z, boolean z2, boolean z3) {
        yja0 yja0Var = (yja0) z0o1.l(ggy0Var, eka0.d);
        if (yja0Var != null) {
            if (z) {
                vz00 vz00Var = fka0.a;
                eja0 eja0VarB = fka0.b(ggy0Var, zjn0Var, l141Var, z3);
                if (eja0VarB != null) {
                    return new bqi0(cy30.l(eja0VarB.d, '#', eja0VarB.e));
                }
            } else if (z2 && (yja0Var.b & 2) == 2) {
                wja0 wja0Var = yja0Var.d;
                return new bqi0(zjn0Var.getString(wja0Var.c).concat(zjn0Var.getString(wja0Var.d)));
            }
        }
        return null;
    }

    public static final List u(xr61 xr61Var, kly0 kly0Var) {
        List list = xr61Var.e;
        boolean zIsEmpty = list.isEmpty();
        List list2 = xr61Var.d;
        if (zIsEmpty) {
            return list2;
        }
        List list3 = list2;
        hux huxVar = xr61Var.a;
        List<lq61> list4 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list4, 10));
        for (lq61 lq61Var : list4) {
            String str = lq61Var.a;
            Integer num = lq61Var.b;
            ks21 ks21Var = null;
            lq61 lq61Var2 = num != null ? lq61Var : null;
            if (lq61Var2 != null) {
                ks21Var = new ks21(lq61Var2, (byte) 16);
            }
            arrayList.add(new vqo(str, new uqo(num, (String) null, (Integer) null, ks21Var, 14), lq61Var.c, lq61Var.d, kly0Var, new sqo(new q961(lq61Var, (byte) 11))));
        }
        return o7h.O0(new xt61(huxVar, (Integer) null, (Integer) null, (cu61) null, mqo1.F(arrayList), 253), list3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static void v(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (!y(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !y(b3) && !y(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.a();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static void w(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (y(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || y(b3)))) {
            throw InvalidProtocolBufferException.a();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static void x(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
        if (b < -62 || y(b2)) {
            throw InvalidProtocolBufferException.a();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static boolean y(byte b) {
        return b > -65;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    public static final tnb1 z(q640 q640Var) {
        boolean z = q640Var.c;
        String strE = E(q640Var);
        u740 u740Var = q640Var.a;
        String strY0 = u740Var != null ? o7h.y0(u740Var.b, " • ", (String) null, (String) null, la10.U0, 30) : null;
        String str = "";
        if (strY0 == null || strY0.length() == 0) {
            strY0 = null;
        } else {
            Set set = s4b1.f;
            String str2 = u740Var != null ? u740Var.a : null;
            if (str2 == null) {
                str2 = "";
            }
            if (uic.x(str2).c == blc0.Pg || !z) {
                strY0 = null;
            }
        }
        fi10 fi10VarQ = q(q640Var);
        if (fi10VarQ != null) {
            str = fi10VarQ.a;
        } else {
            String str3 = u740Var != null ? u740Var.a : null;
            if (str3 != null) {
                str = str3;
            }
        }
        if (q(q640Var) != null) {
            z = false;
        }
        return new tnb1(strE, strY0, str, q640Var.b, z, !ihc1.y0(E(q640Var)));
    }
}
