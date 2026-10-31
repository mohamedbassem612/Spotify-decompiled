package p;

import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.upcomingreleases.v1.Artist;
import com.spotify.upcomingreleases.v1.Prerelease;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ajo1 {
    public static final t3v a = new t3v();
    public static b180 b;
    public static Boolean c;

    public static final heg A(String str) {
        boolean zY = nhc1.Y(str, ".", false);
        if (zY) {
            str = str.substring(1);
        }
        int iA0 = ihc1.A0(str, '/', 0, 6);
        return new heg(new kf30((iA0 == -1 ? "" : str.substring(0, iA0)).replace('/', '.')), new kf30(ihc1.V0(str, '/', str)), zY);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    /* JADX WARN: Code duplicated, block: B:27:0x00d3 A[LOOP:0: B:25:0x00cd->B:27:0x00d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:34:0x0100  */
    /* JADX WARN: Code duplicated, block: B:35:0x0103  */
    /* JADX WARN: Code duplicated, block: B:37:0x0106  */
    /* JADX WARN: Code duplicated, block: B:38:0x0109  */
    /* JADX WARN: Code duplicated, block: B:41:0x0124  */
    /* JADX WARN: Code duplicated, block: B:42:0x0128  */
    /* JADX WARN: Code duplicated, block: B:48:0x013c  */
    /* JADX WARN: Code duplicated, block: B:52:0x015f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0163  */
    /* JADX WARN: Code duplicated, block: B:56:0x016b  */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:97:0x023f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0242  */
    public static final b7 B(y3b0 y3b0Var, ClassLoader classLoader, c1h1 c1h1Var, Function0 function0) throws i9n {
        jla0 jla0VarA;
        jla0 jla0VarB;
        ArrayList arrayList;
        Iterator it;
        y3b0 y3b0Var2;
        oma0 oma0VarB;
        m3b0 m3b0VarA;
        m3b0 m3b0Var;
        String str;
        mgc mgcVar;
        m3b0 m3b0VarA2;
        m3b0 m3b0Var2;
        tka0 tka0VarN;
        t3b0 t3b0Var;
        Object obj;
        Object obj2;
        ax81 ax81Var;
        boolean z;
        List list;
        tma0 tma0Var;
        ax81 ax81Var2;
        StringBuilder sb;
        Object obj3;
        oma0 oma0Var;
        tma0 tma0Var2;
        oma0 oma0Var2;
        String str2;
        ArrayList arrayList2 = y3b0Var.g;
        p811 p811Var = new p811();
        List listK0 = z561.k0(new oh40(z561.Y(ye3.b1, z561.c0(ye3.a1, y3b0Var)), new q2n(classLoader, c1h1Var, function0, p811Var, (byte) 0), (byte) 2));
        m3b0 m3b0VarA3 = y3b0Var.a();
        if (m3b0VarA3 instanceof m3b0) {
            String str3 = m3b0VarA3.c;
            if (u890.j(str3, "kotlin/Array")) {
                oma0 oma0Var3 = ((tma0) o7h.V0(listK0)).b;
                if (oma0Var3 == null) {
                    oma0Var3 = pfb1.a;
                }
                Class clsN = jhc1.s(oma0Var3).n();
                kf30 kf30Var = bpi1.a;
                jla0VarB = rc11.a.b(Array.newInstance((Class<?>) clsN, 0).getClass());
            } else {
                jla0VarA = v(classLoader, str3);
                if (jla0VarA == null) {
                    throw new i9n("Class not found: ".concat(str3));
                }
            }
            mgc mgcVar2 = xm7.w;
            mma0 mma0Var = xm7.a[49];
            boolean zD = mgcVar2.D(y3b0Var);
            ArrayList arrayList3 = ulo1.q(arrayList2, lka0.c).b;
            arrayList = new ArrayList(q7h.U(arrayList3, 10));
            it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(y((q2b0) it.next(), classLoader));
            }
            y3b0Var2 = y3b0Var.d;
            if (y3b0Var2 != null) {
                oma0VarB = B(y3b0Var2, classLoader, c1h1Var, null);
            } else {
                oma0VarB = null;
            }
            mgc mgcVar3 = xm7.y;
            mma0[] mma0VarArr = xm7.a;
            mma0 mma0Var2 = mma0VarArr[51];
            boolean zD2 = mgcVar3.D(y3b0Var);
            m3b0VarA = y3b0Var.a();
            if (m3b0VarA instanceof m3b0) {
                m3b0Var = m3b0VarA;
            } else {
                m3b0Var = null;
            }
            if (m3b0Var != null) {
                str = m3b0Var.c;
            } else {
                str = null;
            }
            boolean zJ = u890.j(str, "kotlin/Nothing");
            mgcVar = xm7.x;
            mma0 mma0Var3 = mma0VarArr[50];
            boolean zD3 = mgcVar.D(y3b0Var);
            m3b0VarA2 = y3b0Var.a();
            if (m3b0VarA2 instanceof m3b0) {
                m3b0Var2 = m3b0VarA2;
            } else {
                m3b0Var2 = null;
            }
            if (m3b0Var2 != null || (str2 = m3b0Var2.c) == null) {
                tka0VarN = null;
            } else {
                heg hegVarA = A(str2);
                if (j8a0.l.containsKey(hegVarA)) {
                    tka0VarN = w6d1.n(hegVarA.a(), (tka0) jla0VarB);
                } else {
                    tka0VarN = null;
                }
            }
            p811Var.a = new ax81(jla0VarB, listK0, zD, arrayList, oma0VarB, zD2, zJ, zD3, tka0VarN, function0);
            mma0 mma0Var4 = mma0VarArr[50];
            if (mgcVar.D(y3b0Var)) {
                obj2 = p811Var.a;
                if (obj2 != null) {
                    u890.C("result");
                    throw null;
                }
                ax81Var = (ax81) obj2;
                z = ax81Var.i;
                list = ax81Var.c;
                if (z) {
                    bhn0.s(ax81Var, "Not a suspend function type: ");
                    return null;
                }
                tma0Var = (tma0) o7h.t0(list.size() - 2, list);
                if (tma0Var != null || (oma0Var = tma0Var.b) == null || !u890.j(oma0Var.k(), rc11.a.b(lnm.class)) || (tma0Var2 = (tma0) o7h.X0(oma0Var.v())) == null || (oma0Var2 = tma0Var2.b) == null) {
                    ax81Var2 = null;
                } else {
                    jla0 jla0Var = ax81Var.b;
                    List listL0 = o7h.l0(2, list);
                    tma0 tma0Var3 = tma0.c;
                    ax81Var2 = new ax81(jla0Var, o7h.O0(bqn1.y(oma0Var2), listL0), ax81Var.d, ax81Var.e, ax81Var.f, ax81Var.g, ax81Var.h, true, ax81Var.t, function0);
                }
                if (ax81Var2 == null) {
                    sb = new StringBuilder("Invalid suspend function type: ");
                    obj3 = p811Var.a;
                    if (obj3 == null) {
                        u890.C("result");
                        throw null;
                    }
                    sb.append((ax81) obj3);
                    throw new i9n(sb.toString());
                }
                p811Var.a = ax81Var2;
            }
            t3b0Var = y3b0Var.f;
            if (t3b0Var != null || !u890.j(t3b0Var.b, "kotlin.jvm.PlatformType")) {
                obj = p811Var.a;
                if (obj != null) {
                    return (ax81) obj;
                }
                u890.C("result");
                throw null;
            }
            Object obj4 = p811Var.a;
            if (obj4 == null) {
                u890.C("result");
                throw null;
            }
            ax81 ax81Var3 = (ax81) obj4;
            ax81 ax81VarB = B(t3b0Var.a, classLoader, c1h1Var, null);
            return ax81Var3.equals(ax81VarB) ? ax81Var3 : new cq20(ax81Var3, ax81VarB, ulo1.q(arrayList2, lka0.c).a, function0);
        }
        if (m3b0VarA3 instanceof n3b0) {
            jla0VarA = new pma0(A(((n3b0) m3b0VarA3).c).a());
        } else {
            if (!(m3b0VarA3 instanceof o3b0)) {
                eg.o();
                return null;
            }
            int i = ((o3b0) m3b0VarA3).c;
            jla0VarA = c1h1Var.a(i);
            if (jla0VarA == null) {
                jla0VarA = new akz(i);
            }
        }
        jla0VarB = jla0VarA;
        mgc mgcVar4 = xm7.w;
        mma0 mma0Var5 = xm7.a[49];
        boolean zD4 = mgcVar4.D(y3b0Var);
        ArrayList arrayList4 = ulo1.q(arrayList2, lka0.c).b;
        arrayList = new ArrayList(q7h.U(arrayList4, 10));
        it = arrayList4.iterator();
        while (it.hasNext()) {
            arrayList.add(y((q2b0) it.next(), classLoader));
        }
        y3b0Var2 = y3b0Var.d;
        if (y3b0Var2 != null) {
            oma0VarB = B(y3b0Var2, classLoader, c1h1Var, null);
        } else {
            oma0VarB = null;
        }
        mgc mgcVar5 = xm7.y;
        mma0[] mma0VarArr2 = xm7.a;
        mma0 mma0Var6 = mma0VarArr2[51];
        boolean zD5 = mgcVar5.D(y3b0Var);
        m3b0VarA = y3b0Var.a();
        if (m3b0VarA instanceof m3b0) {
            m3b0Var = m3b0VarA;
        } else {
            m3b0Var = null;
        }
        if (m3b0Var != null) {
            str = m3b0Var.c;
        } else {
            str = null;
        }
        boolean zJ2 = u890.j(str, "kotlin/Nothing");
        mgcVar = xm7.x;
        mma0 mma0Var7 = mma0VarArr2[50];
        boolean zD6 = mgcVar.D(y3b0Var);
        m3b0VarA2 = y3b0Var.a();
        if (m3b0VarA2 instanceof m3b0) {
            m3b0Var2 = m3b0VarA2;
        } else {
            m3b0Var2 = null;
        }
        if (m3b0Var2 != null) {
            tka0VarN = null;
        } else {
            tka0VarN = null;
        }
        p811Var.a = new ax81(jla0VarB, listK0, zD4, arrayList, oma0VarB, zD5, zJ2, zD6, tka0VarN, function0);
        mma0 mma0Var8 = mma0VarArr2[50];
        if (mgcVar.D(y3b0Var)) {
            obj2 = p811Var.a;
            if (obj2 != null) {
                u890.C("result");
                throw null;
            }
            ax81Var = (ax81) obj2;
            z = ax81Var.i;
            list = ax81Var.c;
            if (z) {
                bhn0.s(ax81Var, "Not a suspend function type: ");
                return null;
            }
            tma0Var = (tma0) o7h.t0(list.size() - 2, list);
            if (tma0Var != null) {
                ax81Var2 = null;
            } else {
                ax81Var2 = null;
            }
            if (ax81Var2 == null) {
                sb = new StringBuilder("Invalid suspend function type: ");
                obj3 = p811Var.a;
                if (obj3 == null) {
                    u890.C("result");
                    throw null;
                }
                sb.append((ax81) obj3);
                throw new i9n(sb.toString());
            }
            p811Var.a = ax81Var2;
        }
        t3b0Var = y3b0Var.f;
        if (t3b0Var != null) {
        }
        obj = p811Var.a;
        if (obj != null) {
            return (ax81) obj;
        }
        u890.C("result");
        throw null;
    }

    public static final xma0 C(vjk1 vjk1Var) {
        int iOrdinal = vjk1Var.ordinal();
        if (iOrdinal == 0) {
            return xma0.c;
        }
        xma0 xma0Var = xma0.d;
        if (iOrdinal == 1) {
            return xma0Var;
        }
        if (iOrdinal == 2) {
            return xma0.b;
        }
        if (iOrdinal == 3) {
            return xma0.a;
        }
        if (iOrdinal != 4) {
            xma0Var = null;
            if (iOrdinal == 5) {
                return null;
            }
            eg.o();
        }
        return xma0Var;
    }

    public static final s2w0 D(Prerelease prerelease, boolean z) {
        String uri = prerelease.getUri();
        String strN = prerelease.n();
        String strO = prerelease.o();
        String name = prerelease.getName();
        long jQ = prerelease.r().q();
        h290 h290VarP = prerelease.p();
        Long lValueOf = z ? Long.valueOf(prerelease.q()) : null;
        List<Artist> artistsList = prerelease.getArtistsList();
        ArrayList arrayList = new ArrayList();
        for (Artist artist : artistsList) {
            artist.getClass();
            arrayList.add(new rs6(artist.getUri(), artist.getName(), artist.getImageUrl()));
        }
        return new s2w0(uri, strN, strO, name, jQ, arrayList, h290VarP, lValueOf);
    }

    public static final float E(gj6 gj6Var, float f) {
        Float fValueOf;
        ej6 ej6Var = gj6Var.s;
        if (ej6Var != null) {
            Iterator it = w(ej6Var).iterator();
            if (it.hasNext()) {
                u5t0 u5t0Var = (u5t0) it.next();
                float fAbs = Math.abs(u5t0Var.c) + (s(u5t0Var) / 2.0f);
                while (it.hasNext()) {
                    u5t0 u5t0Var2 = (u5t0) it.next();
                    fAbs = Math.max(fAbs, Math.abs(u5t0Var2.c) + (s(u5t0Var2) / 2.0f));
                }
                fValueOf = Float.valueOf(fAbs);
            } else {
                fValueOf = null;
            }
            if (fValueOf != null) {
                return zjy.p(0.0f, new p3v((fValueOf.floatValue() - 168.0f) * (f / 240.0f))).a + 8.0f;
            }
        }
        return 0.0f;
    }

    public static int F(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static final void a(i2c i2cVar, ej6 ej6Var, Function0 function0, boolean z, boolean z2, xd6 xd6Var, b4g1 b4g1Var, float f, tob1 tob1Var, b0k b0kVar, int i) {
        int i2;
        ej6 ej6Var2;
        Function0 function1;
        tob1 tob1VarF;
        pxg1 pxg1VarJ0;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-299503149);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            ej6Var2 = ej6Var;
            i2 |= x340Var.g(ej6Var2) ? 32 : 16;
        } else {
            ej6Var2 = ej6Var;
        }
        if ((i & 384) == 0) {
            function1 = function0;
            i2 |= x340Var.i(function1) ? 256 : 128;
        } else {
            function1 = function0;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.g(xd6Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.g(b4g1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.d(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= x340Var.g(tob1Var) ? 67108864 : 33554432;
        }
        if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            if (tob1Var == null) {
                x340Var.i0(-59700949);
                Float fValueOf = Float.valueOf(((Boolean) function1.invoke()).booleanValue() ? 1.0f : 0.0f);
                if (z2) {
                    ilv.a.getClass();
                    pxg1VarJ0 = irn1.o0(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, 0, flv.i, 2);
                } else {
                    pxg1VarJ0 = irn1.j0();
                }
                tob1VarF = zod.F(fValueOf, z, pxg1VarJ0, x340Var, (i2 >> 6) & 112);
                x340Var.r(false);
            } else {
                i2 = i2;
                x340Var.i0(-59701631);
                x340Var.r(false);
                tob1VarF = tob1Var;
            }
            boolean z3 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z3 || objT == obj) {
                objT = w(ej6Var2);
                x340Var.s0(objT);
            }
            List list = (List) objT;
            qim0 qim0VarX = lrn1.x(i2cVar.b(nim0.a), ((Boolean) b4g1Var.b.getValue()).booleanValue() ? 1.0f : -1.0f);
            boolean zG = ((i2 & 3670016) == 1048576) | x340Var.g(tob1VarF) | ((i2 & 458752) == 131072);
            Object objT2 = x340Var.T();
            if (zG || objT2 == obj) {
                objT2 = new t6(tob1VarF, b4g1Var, xd6Var, (byte) 27);
                x340Var.s0(objT2);
            }
            qim0 qim0VarC = i541.C(qim0VarX, (iu30) objT2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
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
            x340Var.i0(-1340397728);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                o((u5t0) it.next(), f, x340Var, ((i2 >> 15) & 896) | 6);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sk6(i2cVar, ej6Var2, function1, z, z2, xd6Var, b4g1Var, f, tob1Var, i);
        }
    }

    public static final void b(w8e w8eVar, g9e g9eVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        g9e g9eVar2 = g9eVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(122057860);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? x340Var.g(w8eVar) : x340Var.i(w8eVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(g9eVar2) : x340Var.i(g9eVar2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && x340Var.i(w8eVar));
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new m4d(w8eVar, (byte) 14);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, false, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            String str = w8eVar.b;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).e;
            long j = cbx.a(x340Var).b.a;
            float f = cbx.b(x340Var).e.b;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.y(qim0Var3, f, 8.0f), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var.i0(-2136677543);
            Iterator it = w8eVar.c.iterator();
            while (it.hasNext()) {
                otw.c(g9eVar2, (d9e) it.next(), (qim0) null, (ipb1) null, x340Var, 8 | ((i3 >> 3) & 14), 12);
                g9eVar2 = g9eVar;
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(w8eVar, g9eVar, qim0Var2, i, (byte) 12);
        }
    }

    public static final void c(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1846989100);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gfx.g(4, apo.r(1931681351, new c980((byte) 2, str, function0, z), x340Var), x340Var, 54);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pfg(str, function0, z, qim0Var2, i);
        }
    }

    public static final void d(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-888368858);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(32.0f, 0.0f, 2, u291.f(qim0Var3, 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0VarZ, cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2016);
            uwo1.e(str2, qim0VarZ, kk0.p(qim0Var3, 8.0f, x340Var, x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2016);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var2, i, (byte) 24);
        }
    }

    public static final void e(int i, String str, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, boolean z) {
        int i2;
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1805379011);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(iu30Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (b0kVar2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = c13.l(z, b0kVar2);
            }
            ven0 ven0Var = (ven0) objT;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.h(u291.f(qim0Var3, 1.0f), 64.0f));
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                objT2 = qfo0.a1;
                b0kVar2.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarZ, true, (iu30) objT2);
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            pm31 pm31Var = new pm31(2);
            boolean zI = b0kVar2.i(ven0Var) | ((i3 & 896) == 256);
            Object objT3 = b0kVar2.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new gp0(iu30Var, ven0Var, (byte) 25);
                b0kVar2.s0(objT3);
            }
            qim0 qim0VarD = qmo1.D(qim0VarB, zBooleanValue, false, pm31Var, (iu30) objT3, 10);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarD);
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
            wnb0 wnb0VarQ = kk0.q(b0kVar2, qim0VarE, y580.Y, 1.0f, true);
            uwr uwrVar = cbx.a;
            uwo1.e(str, wnb0VarQ, cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.a, null, null, 0, false, null, 0, null, b0kVar2, i3 & 14, 0, 2032);
            boolean zBooleanValue2 = ((Boolean) ven0Var.getValue()).booleanValue();
            qim0 qim0VarS = u291.s(qim0Var3, 52.0f, 32.0f);
            tad1 tad1VarM = hxo1.m(cbx.a(b0kVar2).b.a, cbx.a(b0kVar2).c.c, cbx.a(b0kVar2).b.a, cbx.a(b0kVar2).a.b.c(), 0L, b0kVar2, 65484);
            b0kVar2 = b0kVar2;
            ljo1.j(zBooleanValue2, null, qim0VarS, false, tad1VarM, null, b0kVar2, 48, 88);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hmy(str, z, iu30Var, qim0Var2, i);
        }
    }

    public static final void f(mlo0 mlo0Var, iu30 iu30Var, llo0 llo0Var, iu30 iu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(513241446);
        int i2 = i | (x340Var.g(mlo0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(llo0Var) ? 256 : 128) | (x340Var.i(iu30Var2) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("events-notification-settings-options", uyn1.z(0.0f, 16.0f, 1, qim0Var3));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            if (mlo0Var == null) {
                x340Var.i0(-875226665);
                x340Var.r(false);
            } else {
                x340Var.i0(-875226664);
                e((i2 << 3) & 896, mlo0Var.c, x340Var, iu30Var, null, mlo0Var.d);
                x340Var.r(false);
            }
            if (llo0Var == null) {
                x340Var.i0(-875022220);
                x340Var.r(false);
            } else {
                x340Var.i0(-875022219);
                e((i2 >> 3) & 896, llo0Var.c, x340Var, iu30Var2, null, llo0Var.d);
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
            h311VarV.d = new e9g0((byte) 12, i, mlo0Var, iu30Var, llo0Var, iu30Var2, qim0Var2);
        }
    }

    public static final void g(t6x t6xVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1946768269);
        int i2 = i | (x340Var.i(t6xVar) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.f(qim0Var3, 1.0f), 0.0f, cbx.b(x340Var).b.b, 0.0f, 0.0f, 13);
            long jK = f5p1.k(x340Var, 2131101284);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarF = dug.f(qim0VarB, jK, er31.b(8.0f));
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("empty-highlight-tag", uyn1.y(qim0VarF, 8.0f, 12.0f));
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            uwo1.e(t6xVar.b, null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            qgo1.f(t6xVar.c.g((djc0) null, x340Var, 1), null, new a0e1(3), 0, false, null, x340Var, 8, 58);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ozw(t6xVar, qim0Var2, i, (byte) 4);
        }
    }

    public static final void h(long j, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-901341643);
        int i2 = (x340Var.f(j) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            jkx jkxVar = jkx.c;
            qim0 qim0VarX = uyn1.x(dug.f(u291.r(nim0.a, 32.0f), j, er31.a), 8.0f);
            uwr uwrVar = cbx.a;
            w0h1.a(jkxVar, isl.a, qim0VarX, cbx.a(x340Var).a.a.b(), 0L, false, x340Var, jkx.d | 48, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sre(j, i, (byte) 22);
        }
    }

    public static final void i(t660 t660Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        boolean z;
        byte b2;
        boolean z2;
        m4c m4cVar = fkj0.X;
        String str = t660Var.h;
        boolean z3 = t660Var.i;
        s660 s660Var = t660Var.j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1721648820);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(t660Var) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            boolean z4 = (s660Var == null && str == null) ? false : true;
            d36 d36Var = new d36(cvxVar.c, true, new um5(false));
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarA = uyn1.A(qim0VarF.then(z4 ? sgc1.D(1, qim0Var2) : qim0Var2), 16.0f, 12.0f, 16.0f, 16.0f);
            jw31 jw31VarA = ew31.a(d36Var, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z5 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z5) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            qim0 qim0VarThen = kk0.q(x340Var, qim0VarE, lljVar4, 1.0f, true).then(z4 ? u291.c(qim0Var2, 1.0f) : qim0Var2);
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarThen);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            mbh mbhVarA2 = jbh.a(new d36(2.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0Var2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            uwo1.e(t660Var.c, anm1.N("TAG", u291.z(u291.f(qim0Var2, 1.0f), (fra) null, 3)), vgo1.q(cbx.d(x340Var).k, z3, x340Var), t660Var.e, null, null, 0, false, null, 0, null, x340Var, 48, 0, 2032);
            uwo1.e(t660Var.d, anm1.N("TITLE", u291.z(u291.f(qim0Var2, 1.0f), (fra) null, 3)), vgo1.q(cbx.d(x340Var).d, z3, x340Var), cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 48, 0, 2032);
            x340Var.r(true);
            if (z4) {
                x340Var.i0(1377079362);
                b2 = 2;
                op71.g(x340Var, u291.j(2.0f, 0.0f, 2, new wnb0(1.0f, true)));
                z = false;
                x340Var.r(false);
            } else {
                z = false;
                b2 = 2;
                v8i0.i(2.0f, 1377162101, x340Var, x340Var, qim0Var2);
                x340Var.r(false);
            }
            int i3 = af5.e;
            String str2 = t660Var.f;
            pae1 pae1Var = new pae1(new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61439), (zma1) null, 14);
            boolean z6 = (i2 & 896) == 256 ? true : z;
            Object objT = x340Var.T();
            Object obj = objT;
            if (z6 || objT == m4cVar) {
                lq00 lq00Var = new lq00(iu30Var, b2);
                x340Var.s0(lq00Var);
                obj = lq00Var;
            }
            af5 af5VarI = ob51.i(str2, pae1Var, (rjc0) obj);
            lee1 lee1VarQ = vgo1.q(cbx.d(x340Var).j, z3, x340Var);
            boolean z7 = z;
            uwo1.d(af5VarI, cbx.a(x340Var).b.b, anm1.N("DESCRIPTION", u291.z(u291.f(qim0Var2, 1.0f), (fra) null, 3)), lee1VarQ, null, null, 0, false, null, 0, null, null, x340Var, 384, 0, 4080);
            x340Var = x340Var;
            x340Var.r(true);
            if (z4) {
                x340Var.i0(2044205431);
                era eraVar2 = een.Q0;
                qim0 qim0VarC = u291.c(qim0Var2, 1.0f);
                mbh mbhVarA3 = jbh.a(h36.g, eraVar2, x340Var, 54);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarC);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA3, x340Var, lljVar);
                nko1.H(xos0VarM4, x340Var, lljVar2);
                x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar4);
                if (s660Var != null) {
                    x340Var.i0(1625887685);
                    xzo1.b(s660Var.a, s660Var.b, z7 ? 1 : 0, x340Var, null);
                    x340Var.r(z7);
                } else {
                    x340Var.i0(1625992837);
                    op71.g(x340Var, qim0Var2);
                    x340Var.r(z7);
                }
                if (str != null) {
                    v8i0.i(8.0f, 1626074243, x340Var, x340Var, qim0Var2);
                    h(t660Var.e, x340Var, z7 ? 1 : 0);
                    x340Var.r(z7);
                } else {
                    x340Var.i0(1626174187);
                    x340Var.r(z7);
                }
                z2 = true;
                x340Var.r(true);
                x340Var.r(z7);
            } else {
                z2 = true;
                x340Var.i0(2044706298);
                x340Var.r(z7);
            }
            x340Var.r(z2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bp50((byte) 5, i, (Object) t660Var, iu30Var, qim0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(yjd1 yjd1Var, lzn0 lzn0Var, ryf ryfVar, vzq0 vzq0Var, b0k b0kVar, int i) {
        int i2;
        lzn0 lzn0Var2;
        vzq0 vzq0Var2;
        b0k b0kVar2;
        int i3;
        int i4;
        qim0 qim0VarD;
        Object obj;
        List list = yjd1Var.c;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-183568543);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(yjd1Var) : b0kVar3.i(yjd1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            lzn0Var2 = lzn0Var;
            i2 |= b0kVar3.i(lzn0Var2) ? 32 : 16;
        } else {
            lzn0Var2 = lzn0Var;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(ryfVar) ? 256 : 128;
        }
        int i5 = i & 3072;
        nim0 nim0Var = nim0.a;
        if (i5 == 0) {
            i2 |= b0kVar3.i(nim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            vzq0Var2 = vzq0Var;
            i2 |= b0kVar3.i(vzq0Var2) ? 16384 : 8192;
        } else {
            vzq0Var2 = vzq0Var;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            b0kVar3.d0();
            if ((i & 1) != 0 && !b0kVar3.E()) {
                b0kVar3.b0();
            }
            b0kVar3.s();
            if (yjd1Var.b) {
                float fD = vzq0Var2.d();
                i4 = 1;
                i3 = 0;
                qim0VarD = d1u.E(1.0f, u7h.g, u291.d(uyn1.B(nim0Var, 0.0f, fD, 0.0f, 0.0f, 13), 1.0f), d4o1.a);
            } else {
                i3 = 0;
                i4 = 1;
                qim0VarD = u291.d(uyn1.B(nim0Var, 0.0f, vzq0Var.d(), 0.0f, 0.0f, 13), 1.0f);
            }
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, i3);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarD);
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
            Object[] objArr = new Object[i3];
            int i6 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && b0kVar3.i(yjd1Var))) ? i4 : i3;
            Object objT = b0kVar3.T();
            if (i6 != 0 || objT == fkj0.X) {
                obj = objT;
                pr90 pr90Var = new pr90(yjd1Var, (byte) 25);
                b0kVar3.s0(pr90Var);
                obj = pr90Var;
            }
            obj = objT;
            err0 err0Var = (hdn0) k5p1.s(objArr, (Function0) obj, b0kVar3, i3);
            int iS = err0Var.s();
            int size = list.size() - i4;
            if (size < 0) {
                size = i3;
            }
            int iP = yoi1.p(iS, i3, size);
            j2i j2iVarR = apo.r(1775510294, new lg60(yjd1Var, iP, err0Var), b0kVar3);
            b0kVar2 = b0kVar3;
            boolean z = i4;
            jhc1.d(iP, (qim0) null, 0L, 0, (xu30) null, j2iVarR, b0kVar2, 196608, 30);
            ued1 ued1Var = (ued1) o7h.t0(iP, list);
            upo1.p(ued1Var != null ? ued1Var.b : z6x.a, lzn0Var2, ryfVar, l6o1.H(uyn1.B(new wnb0(1.0f, z), 0.0f, 0.0f, 0.0f, vzq0Var.a(), 7), l6o1.C(0, 0, z ? 1 : 0, b0kVar2), false, 14), b0kVar2, i2 & 1008);
            b0kVar2.r(z);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(yjd1Var, lzn0Var, ryfVar, vzq0Var, i);
        }
    }

    public static final void k(b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-311101616);
        if (b0kVar3.Y(i & 1, i != 0)) {
            b0kVar2 = b0kVar3;
            jto1.b(null, new uvx((pgx) null, 3, (tvx) null, (p3v) null, 26), null, false, null, null, null, null, null, pni.a, null, pni.b, null, null, null, pni.c, b0kVar2, 805306432, 196656, 30205);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new htu(i, (byte) 18);
        }
    }

    public static final void l(olo0 olo0Var, Function0 function0, iu30 iu30Var, iu30 iu30Var2, Function0 function1, Function0 function2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        Object df6Var;
        ven0 ven0Var;
        ven0 ven0Var2;
        c9n c9nVar;
        boolean z;
        boolean z2;
        vy71 vy71Var;
        boolean z3 = olo0Var.f;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1502784793);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(olo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(iu30Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.i(nim0.a) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var2.i(function2) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (x340Var2.Y(i3 & 1, (i3 & 599187) != 599186)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = c13.l(z3, x340Var2);
            }
            ven0 ven0Var3 = (ven0) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                mlo0 mlo0Var = olo0Var.d;
                objT2 = c13.l(mlo0Var != null ? mlo0Var.d : false, x340Var2);
            }
            ven0 ven0Var4 = (ven0) objT2;
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                llo0 llo0Var = olo0Var.e;
                objT3 = c13.l(llo0Var != null ? llo0Var.d : false, x340Var2);
            }
            ven0 ven0Var5 = (ven0) objT3;
            ven0 ven0VarS = v8r.s(function1, x340Var2);
            boolean z4 = ((Boolean) ven0Var4.getValue()).booleanValue() || ((Boolean) ven0Var5.getValue()).booleanValue();
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var2);
            Object objT4 = x340Var2.T();
            if (objT4 == m4cVar) {
                objT4 = qxd0.M(o6x.a, x340Var2);
                x340Var2.s0(objT4);
            }
            c9n c9nVar2 = (c9n) objT4;
            vy71 vy71VarF = dem0.f(6, 2, x340Var2, (iu30) null, true);
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zI = ((i3 & 14) == 4) | x340Var2.i(ven0VarS) | x340Var2.i(c9nVar2) | x340Var2.i(vy71VarF) | x340Var2.i(ven0Var4) | x340Var2.i(ven0Var5);
            Object objT5 = x340Var2.T();
            if (zI || objT5 == m4cVar) {
                ven0Var = ven0Var4;
                ven0Var2 = ven0Var5;
                c9nVar = c9nVar2;
                z = false;
                z2 = true;
                df6Var = new df6(olo0Var, c9nVar, ven0VarS, vy71VarF, ven0Var, ven0Var2, (lnm) null, (byte) 10);
                vy71Var = vy71VarF;
                x340Var2.s0(df6Var);
            } else {
                vy71Var = vy71VarF;
                df6Var = objT5;
                ven0Var = ven0Var4;
                ven0Var2 = ven0Var5;
                c9nVar = c9nVar2;
                z = false;
                z2 = true;
            }
            qxd0.t(boolValueOf, x340Var2, (vu30) df6Var);
            if (((Boolean) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 571
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.ajo1.l(p.olo0, kotlin.jvm.functions.Function0, p.iu30, p.iu30, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.b0k, int):void");
        }

        public static final void m(cce cceVar, o0i o0iVar, z0i z0iVar, boolean z, int i, b0k b0kVar, int i2) {
            int i3;
            cce cceVar2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1685990773);
            int i4 = i2 & 6;
            pbh pbhVar = pbh.a;
            if (i4 == 0) {
                i3 = (x340Var.g(pbhVar) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                cceVar2 = cceVar;
                i3 |= x340Var.i(cceVar2) ? 32 : 16;
            } else {
                cceVar2 = cceVar;
            }
            if ((i2 & 384) == 0) {
                i3 |= (i2 & 512) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i3 |= x340Var.g(z0iVar) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i3 |= x340Var.h(z) ? 16384 : 8192;
            }
            if ((196608 & i2) == 0) {
                i3 |= x340Var.e(i) ? 131072 : 65536;
            }
            if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
                ymb0 ymb0Var = z0iVar instanceof ymb0 ? (ymb0) z0iVar : null;
                xmb0 xmb0VarC = ymb0Var != null ? ymb0Var.c() : null;
                boolean z2 = xmb0VarC != null;
                boolean z3 = xmb0VarC != null ? xmb0VarC.a : false;
                mr20 mr20Var = o0iVar.b;
                int i5 = i * CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER;
                List list = cbc0.a;
                o0i o0iVar2 = new o0i(o0iVar.a, hu20.e(mr20Var, new bbc0(i5, (lnm) null)), o0iVar.c, o0iVar.d, o0iVar.e);
                qim0 qim0VarI = nim0.a;
                qim0 qim0VarThen = u291.f(qim0VarI, 1.0f).then(z2 ? pbhVar.a(1.0f, qim0VarI, true) : qim0VarI);
                if (!z3) {
                    qim0VarI = zr7.i(qim0VarI, new w9c1(i5, z));
                }
                cceVar2.a(((i3 << 6) & 7168) | ((i3 >> 6) & 112) | 8, o0iVar2, z0iVar, x340Var, qim0VarThen.then(qim0VarI));
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new pk7(cceVar, o0iVar, z0iVar, z, i, i2);
            }
        }

        public static final void n(p3v p3vVar, float f, float f2, b0k b0kVar, int i, int i2) {
            float f3;
            int i3;
            float f4;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1655454864);
            int i4 = i2 & 4;
            if (i4 != 0) {
                i3 = i | 384;
                f3 = f2;
            } else if ((i & 384) == 0) {
                f3 = f2;
                i3 = (x340Var.d(f3) ? 256 : 128) | i;
            } else {
                f3 = f2;
                i3 = i;
            }
            if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                float f5 = i4 != 0 ? 0.0f : f3;
                qim0 qim0VarB = uyn1.B(u291.h(u291.v(nim0.a, p3vVar.a), f), 0.0f, f5, 0.0f, 0.0f, 13);
                uwr uwrVar = cbx.a;
                long jA = cbx.a(x340Var).a.b.a();
                cua cuaVar = cbx.b(x340Var).f;
                t1c.a(cwl1.l0(dug.f(qim0VarB, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
                f4 = f5;
            } else {
                x340Var.b0();
                f4 = f3;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xt00(p3vVar, f, f4, i, i2, (byte) 1);
            }
        }

        public static final void o(u5t0 u5t0Var, float f, b0k b0kVar, int i) {
            int i2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1674106312);
            int i3 = i & 6;
            h2c h2cVar = h2c.a;
            if (i3 == 0) {
                i2 = (x340Var.g(h2cVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.g(u5t0Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.d(f) ? 256 : 128;
            }
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                float f2 = f / 240.0f;
                yj41 yj41Var = u5t0Var.a;
                gra graVar = een.h;
                vi6.b(yj41Var, u291.h(u291.v(eqr0.C(u291.A(h2cVar.a(nim0.a, graVar), graVar, true), u5t0Var.b * f2, u5t0Var.c * f2), 107.69f * f2), s(u5t0Var) * f2), null, x340Var, 8, 4);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new tk6(u5t0Var, f, i);
            }
        }

        public static final void p(cce cceVar, o0i o0iVar, ubc1 ubc1Var, Function0 function0, dfn0 dfn0Var, qim0 qim0Var, b0k b0kVar, int i) throws Throwable {
            Function0 function1;
            Throwable th;
            o0i o0iVar2;
            tob1 tob1Var;
            float f;
            float f2;
            boolean z;
            llj lljVar = y580.Y;
            llj lljVar2 = y580.R0;
            llj lljVar3 = y580.N0;
            llj lljVar4 = y580.O0;
            nl3 nl3Var = een.Q0;
            ArrayList arrayList = ubc1Var.d;
            ArrayList arrayList2 = ubc1Var.c;
            ArrayList arrayList3 = ubc1Var.b;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1384057422);
            j06 j06Var = x340Var.a;
            int i2 = (i & 6) == 0 ? i | (x340Var.i(cceVar) ? 4 : 2) : i;
            if ((i & 48) == 0) {
                i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.g(ubc1Var) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                function1 = function0;
                i2 |= x340Var.i(function1) ? 2048 : 1024;
            } else {
                function1 = function0;
            }
            if ((i & 24576) == 0) {
                i2 |= x340Var.i(dfn0Var) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i2 |= x340Var.g(qim0Var) ? 131072 : 65536;
            }
            if (x340Var.Y(i2 & 1, (i2 & 74899) != 74898)) {
                okc1 okc1Var = ubc1Var.f;
                h290 h290Var = okc1Var != null ? okc1Var.a.a : null;
                qim0 qim0VarQ = i1p1.q(qim0Var, er31.b(24.0f));
                qim0 qim0Var2 = nim0.a;
                qim0 qim0VarThen = qim0VarQ.then(h290Var != null ? exd0.r(qim0Var2, new s6(h290Var, (byte) 11)) : qim0Var2);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = l4b1.U0;
                    x340Var.s0(objT);
                }
                Function0 function2 = (Function0) objT;
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = l4b1.V0;
                    x340Var.s0(objT2);
                }
                Function0 function3 = (Function0) objT2;
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = l4b1.W0;
                    x340Var.s0(objT3);
                }
                qim0 qim0VarL = i1k0.l(qim0VarThen, function1, function2, function3, (Function0) objT3, (c5f0) null, 16);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarL);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                boolean z2 = x340Var.S;
                n4k n4kVar = hmb0.t1;
                if (z2) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar4);
                nko1.H(xos0VarM, x340Var, lljVar3);
                x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE, x340Var, lljVar);
                vpl vplVar = ubc1Var.a;
                if (vplVar == null) {
                    x340Var.i0(-1718410719);
                    x340Var.r(false);
                    th = null;
                    o0iVar2 = o0iVar;
                } else {
                    x340Var.i0(-1718410718);
                    th = null;
                    cceVar.a(((i2 >> 3) & 14) | 392 | ((i2 << 9) & 7168), o0iVar, vplVar, x340Var, anm1.N("storytelling_content_container", u291.d(qim0Var2, 1.0f)));
                    o0iVar2 = o0iVar;
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT4);
                }
                tob1 tob1Var2 = (ven0) objT4;
                Object objT5 = x340Var.T();
                if (objT5 == m4cVar) {
                    objT5 = new ry71(tob1Var2, (byte) 11);
                    x340Var.s0(objT5);
                }
                oto1.c(ubc1Var, o0iVar2, (iu30) objT5, x340Var, ((i2 >> 6) & 14) | 448 | (i2 & 112));
                Throwable th2 = th;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, zr7.i(h2c.a.a(u291.d(qim0Var2, 1.0f), een.e), new bxb1(dfn0Var, (byte) 6)));
                d36 d36Var = new d36(8.0f, true, new um5(false));
                era eraVar = een.P0;
                mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 6);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                if (arrayList3.isEmpty()) {
                    tob1Var = tob1Var2;
                    f = 8.0f;
                    f2 = 16.0f;
                    v8i0.i(16.0f, -1441739140, x340Var, x340Var, qim0Var2);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1442314531);
                    qim0 qim0VarN = anm1.N("storytelling_top_components", uyn1.z(0.0f, 8.0f, 1, u291.f(qim0Var2, 1.0f)));
                    tob1Var = tob1Var2;
                    mbh mbhVarA2 = jbh.a(new d36(8.0f, false, new g21(een.Z, (byte) 28)), eraVar, x340Var, 6);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarN);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA2, x340Var, lljVar4);
                    nko1.H(xos0VarM3, x340Var, lljVar3);
                    x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar);
                    x340Var.i0(976688119);
                    int i3 = 0;
                    for (Object obj : arrayList3) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            p7h.T();
                            throw th2;
                        }
                        int i5 = i2 << 3;
                        m(cceVar, o0iVar2, (z0i) obj, ((Boolean) tob1Var.getValue()).booleanValue(), i3, x340Var, (i5 & 112) | 518 | (i5 & 896));
                        o0iVar2 = o0iVar;
                        i3 = i4;
                    }
                    f = 8.0f;
                    x340Var.r(false);
                    x340Var.r(true);
                    op71.g(x340Var, u291.h(qim0Var2, 8.0f));
                    x340Var.r(false);
                    f2 = 16.0f;
                }
                qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
                if (!(((double) 1.0f) > 0.0d)) {
                    of80.a("invalid weight; must be greater than zero");
                }
                qim0 qim0VarN2 = anm1.N("storytelling_center_components", uyn1.B(qim0VarF.then(new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true)), 0.0f, 0.0f, 0.0f, f2, 7));
                nl3 nl3Var2 = nl3Var;
                mbh mbhVarA3 = jbh.a(new d36(f, false, new g21(een.N0, (byte) 28)), nl3Var2, x340Var, 54);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarN2);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA3, x340Var, lljVar4);
                nko1.H(xos0VarM4, x340Var, lljVar3);
                x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar);
                int size = arrayList3.size();
                x340Var.i0(-1706780081);
                int i6 = 0;
                for (Object obj2 : arrayList2) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        p7h.T();
                        throw th2;
                    }
                    int i8 = size + i6;
                    int i9 = i2 << 3;
                    m(cceVar, o0iVar, (z0i) obj2, ((Boolean) tob1Var.getValue()).booleanValue(), i8, x340Var, (i9 & 112) | 518 | (i9 & 896));
                    i6 = i7;
                    nl3Var2 = nl3Var2;
                }
                nl3 nl3Var3 = nl3Var2;
                x340Var.r(false);
                x340Var.r(true);
                if (arrayList.isEmpty()) {
                    z = true;
                    v8i0.i(24.0f, -1440136068, x340Var, x340Var, qim0Var2);
                    x340Var.r(false);
                } else {
                    v8i0.i(f, -1440921918, x340Var, x340Var, qim0Var2);
                    qim0 qim0VarN3 = anm1.N("storytelling_bottom_components", uyn1.B(u291.z(u291.b(0.0f, 96.0f, 1, u291.f(qim0Var2, 1.0f)), th2, 3), 0.0f, 0.0f, 0.0f, 32.0f, 7));
                    mbh mbhVarA4 = jbh.a(new d36(f, false, new g21(een.O0, (byte) 28)), nl3Var3, x340Var, 54);
                    int iHashCode5 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM5 = x340Var.m();
                    qim0 qim0VarE5 = zr7.E(x340Var, qim0VarN3);
                    hzj.A.getClass();
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA4, x340Var, lljVar4);
                    nko1.H(xos0VarM5, x340Var, lljVar3);
                    x0d.q(iHashCode5, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE5, x340Var, lljVar);
                    int size2 = arrayList2.size() + arrayList3.size();
                    x340Var.i0(-1786155763);
                    int i10 = 0;
                    for (Object obj3 : arrayList) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            p7h.T();
                            throw null;
                        }
                        int i12 = i2 << 3;
                        m(cceVar, o0iVar, (z0i) obj3, ((Boolean) tob1Var.getValue()).booleanValue(), size2 + i10, x340Var, (i12 & 112) | 518 | (i12 & 896));
                        i10 = i11;
                    }
                    z = true;
                    us71.m(x340Var, false, true, false);
                }
                x340Var.r(z);
                x340Var.r(z);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ryb1(cceVar, o0iVar, ubc1Var, function0, dfn0Var, qim0Var, i, (byte) 1);
            }
        }

        public static final p6r0 q(vur0 vur0Var, String str) {
            int iOrdinal = vur0Var.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return yon1.G1("KID_ACCOUNT_TRANSITION_ENTRY", "kid-account-transition/entry", 892, "kid-account-transition");
            }
            if (iOrdinal == 2) {
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                return yon1.G1("KID_ACCOUNT_CREATION_ENTRY", "kid-account-creation/entry", 878, "kid-account-creation");
            }
            if (iOrdinal != 3) {
                eg.o();
                return null;
            }
            if (str != null) {
                AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                return yon1.G1("KID_ACCOUNT_TRANSITION_ENTRY", "kid-account-transition/entry", 892, "kid-account-transition");
            }
            AtomicReferenceArray atomicReferenceArray4 = p6r0.e;
            return yon1.G1("KID_ACCOUNT_CREATION_ENTRY", "kid-account-creation/entry", 878, "kid-account-creation");
        }

        public static int r(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            if (Build.VERSION.SDK_INT < 29) {
                return 0;
            }
            Boolean bool = c;
            if (bool == null || !bool.booleanValue()) {
                return x74.i(videoCapabilities, i, i2, d);
            }
            return 0;
        }

        public static final float s(u5t0 u5t0Var) {
            Bitmap bitmap = u5t0Var.a.a;
            float width = 107.69f / ((bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) ? 1.0f : bitmap.getWidth() / bitmap.getHeight());
            if (width > 336.0f) {
                return 336.0f;
            }
            return width;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0097  */
        public static final String t(w3b0 w3b0Var, mla0 mla0Var) {
            String strConcat;
            ija0 ija0Var = don1.v(w3b0Var).c;
            if (ija0Var != null) {
                return ija0Var.toString();
            }
            via0 via0Var = don1.v(w3b0Var).b;
            if (via0Var == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder(dia0.a(via0Var.c));
            yzu yzuVar = xm7.o;
            mma0[] mma0VarArr = xm7.a;
            mma0 mma0Var = mma0VarArr[33];
            if (yzuVar.y(w3b0Var) == vjk1.b && (mla0Var instanceof bla0)) {
                l3b0 l3b0VarP = ((bla0) mla0Var).P();
                String str = l3b0VarP != null ? don1.u(l3b0VarP).b : null;
                if (str == null) {
                    str = "main";
                }
                strConcat = "$".concat(ikn0.a.g("_", str));
            } else {
                mma0 mma0Var2 = mma0VarArr[33];
                if (yzuVar.y(w3b0Var) == vjk1.c && (mla0Var instanceof ema0)) {
                    ema0 ema0Var = (ema0) mla0Var;
                    mc11 mc11Var = ((dma0) ema0Var.c.getValue()).d;
                    mma0 mma0Var3 = dma0.g[0];
                    jc11 jc11Var = (jc11) mc11Var.invoke();
                    if ((jc11Var != null ? (h6b0) jc11Var.b.c : null) == h6b0.h) {
                        strConcat = "$".concat(ema0Var.b.getSimpleName());
                    } else {
                        strConcat = "";
                    }
                } else {
                    strConcat = "";
                }
            }
            sb.append(strConcat);
            sb.append("()");
            sb.append(via0Var.d);
            return sb.toString();
        }

        public static final int u(y9e1 y9e1Var, int i) {
            x9e1 x9e1Var = y9e1Var.a;
            zrm0 zrm0Var = y9e1Var.b;
            if (x9e1Var.a.b.length() != 0) {
                int iD = zrm0Var.d(i);
                if ((i != 0 && iD == zrm0Var.d(i - 1)) || (i != x9e1Var.a.b.length() && iD == zrm0Var.d(i + 1))) {
                    return y9e1Var.a(i);
                }
            }
            return y9e1Var.j(i);
        }

        public static final tka0 v(ClassLoader classLoader, String str) {
            Class clsK = bpi1.k(classLoader, A(str), 0);
            if (clsK != null) {
                return rc11.a.b(clsK);
            }
            return null;
        }

        public static final List w(ej6 ej6Var) {
            yj41 yj41Var = ej6Var.a;
            u5t0 u5t0Var = yj41Var != null ? new u5t0(yj41Var, 63.3f, -149.9f) : null;
            yj41 yj41Var2 = ej6Var.b;
            u5t0 u5t0Var2 = yj41Var2 != null ? new u5t0(yj41Var2, -105.7f, -22.5f) : null;
            yj41 yj41Var3 = ej6Var.c;
            return f46.i0(new u5t0[]{u5t0Var, u5t0Var2, yj41Var3 != null ? new u5t0(yj41Var3, 66.0f, 160.5f) : null});
        }

        public static final qim0 x(Function0 function0, qim0 qim0Var, boolean z, boolean z2) {
            if (!z || !rkc1.a) {
                return qim0Var;
            }
            if (z2) {
                qim0Var = qim0Var.then(new skc1(a));
            }
            return qim0Var.then(new pkc1(function0));
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
        public static final Annotation y(q2b0 q2b0Var, ClassLoader classLoader) throws i9n {
            String str = q2b0Var.a;
            Class clsK = bpi1.k(classLoader, A(str), 0);
            if (clsK == null) {
                throw new i9n("Annotation class not found: ".concat(str));
            }
            Map map = q2b0Var.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), z((k3b0) entry.getValue(), str, (String) entry.getKey(), classLoader));
            }
            return (Annotation) bzn1.o(clsK, linkedHashMap);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
        public static final Object z(k3b0 k3b0Var, String str, String str2, ClassLoader classLoader) throws i9n {
            List parameters;
            oma0 oma0VarT;
            if (k3b0Var instanceof r2b0) {
                return y(((r2b0) k3b0Var).a, classLoader);
            }
            int i = 0;
            if (k3b0Var instanceof s2b0) {
                s2b0 s2b0Var = (s2b0) k3b0Var;
                String str3 = s2b0Var.a;
                wdg wdgVarV = v(classLoader, str3);
                if (wdgVarV == null) {
                    throw new i9n("Unresolved class: ".concat(str3));
                }
                Class<?> clsN = wdgVarV.n();
                int i2 = s2b0Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    clsN = Array.newInstance(clsN, 0).getClass();
                }
                return clsN;
            }
            Object obj = null;
            if (!(k3b0Var instanceof t2b0)) {
                if (!(k3b0Var instanceof y2b0)) {
                    if (!(k3b0Var instanceof b3b0)) {
                        if (k3b0Var instanceof c3b0) {
                            return ((c3b0) k3b0Var).a();
                        }
                        eg.o();
                        return null;
                    }
                    String str4 = ((b3b0) k3b0Var).a;
                    Class clsK = bpi1.k(classLoader, A(str4), 0);
                    if (clsK != null) {
                        return clsK;
                    }
                    throw new i9n("Unresolved class: ".concat(str4));
                }
                y2b0 y2b0Var = (y2b0) k3b0Var;
                String str5 = y2b0Var.b;
                String str6 = y2b0Var.a;
                Class clsK2 = bpi1.k(classLoader, A(str6), 0);
                if (clsK2 == null) {
                    throw new i9n("Unresolved enum class: ".concat(str6));
                }
                Object[] enumConstants = clsK2.getEnumConstants();
                int length = enumConstants.length;
                boolean z = false;
                Object obj2 = null;
                while (true) {
                    if (i >= length) {
                        if (!z) {
                            break;
                        }
                        obj = obj2;
                        break;
                    }
                    Object obj3 = enumConstants[i];
                    if (u890.j(((Enum) obj3).name(), str5)) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj2 = obj3;
                    }
                    i++;
                }
                if (obj != null) {
                    return obj;
                }
                throw new i9n("Unresolved enum entry: " + str6 + '.' + str5);
            }
            tka0 tka0VarV = v(classLoader, str);
            if (tka0VarV != null) {
                if (!((wdg) tka0VarV).n().isAnnotation()) {
                    tka0VarV = null;
                }
                if (tka0VarV != null) {
                    nla0 nla0Var = (nla0) o7h.W0(tka0VarV.h());
                    if (nla0Var != null && (parameters = nla0Var.getParameters()) != null) {
                        Iterator it = parameters.iterator();
                        boolean z2 = false;
                        Object obj4 = null;
                        while (true) {
                            if (!it.hasNext()) {
                                if (!z2) {
                                    break;
                                }
                                break;
                            }
                            Object next = it.next();
                            if (u890.j(((hc11) next).getName(), str2)) {
                                if (!z2) {
                                    z2 = true;
                                    obj4 = next;
                                }
                            }
                            obj4 = null;
                            break;
                        }
                        hc11 hc11Var = (hc11) obj4;
                        if (hc11Var != null && (oma0VarT = hc11Var.t()) != null) {
                            tka0 tka0VarK = oma0VarT.k();
                            tka0 tka0Var = tka0VarK instanceof tka0 ? tka0VarK : null;
                            if (tka0Var == null) {
                                mna0.d(oma0VarT, "Array parameter type is not a class: ");
                                return null;
                            }
                            Class clsN2 = ((wdg) tka0Var).n();
                            Class<?> componentType = u890.j(clsN2.getComponentType(), tka0.class) ? Class.class : clsN2.getComponentType();
                            ArrayList arrayList = ((t2b0) k3b0Var).a;
                            Object objNewInstance = Array.newInstance(componentType, arrayList.size());
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                Array.set(objNewInstance, i, z((k3b0) it2.next(), str, null, classLoader));
                                i++;
                            }
                            objNewInstance.getClass();
                            return objNewInstance;
                        }
                    }
                    throw new i9n(gvg.h("No parameter ", str2, " found in annotation constructor of ", str));
                }
            }
            throw new i9n("Not an annotation class: ".concat(str));
        }
    }
