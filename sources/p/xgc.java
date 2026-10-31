package p;

import android.icu.text.CompactDecimalFormat;
import android.icu.text.NumberFormat;
import com.spotify.authentication.tokenexchangeesperanto.EsTokenExchange;
import com.spotify.base.java.logging.Logger;
import com.spotify.common.uri.SpotifyUriParserException;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xgc implements bhc, xyz0, Function, hv30, jrn0, leh {
    public final /* synthetic */ byte a;

    public xgc(cjl cjlVar, yic0 yic0Var) {
        this.a = (byte) 29;
        new WeakReference(cjlVar);
        lhl lhlVar = cjlVar.J;
        yic0Var.getClass();
        yic0.n(lhlVar);
        yic0.n(cjlVar.K);
        yic0.n(cjlVar.L);
        yic0.n(cjlVar.M);
        yic0.n(cjlVar.N);
    }

    public static final Lock k(String str) {
        Lock lock;
        HashMap map = qrw0.e;
        HashMap map2 = qrw0.e;
        synchronized (map2) {
            try {
                Object reentrantLock = map2.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map2.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lock;
    }

    public static String p(long j, Locale locale) {
        if (j <= 9999) {
            return NumberFormat.getInstance(locale).format(j);
        }
        CompactDecimalFormat compactDecimalFormat = CompactDecimalFormat.getInstance(locale, CompactDecimalFormat.CompactStyle.SHORT);
        compactDecimalFormat.setMaximumFractionDigits(1);
        return compactDecimalFormat.format(j);
    }

    public static ly21 q(String str) {
        return new ly21(new by21(l1d.m("The URI is not supported by the playlist permission system: ", str)));
    }

    public static vls0 r(wls0 wls0Var) {
        int iOrdinal = wls0Var.ordinal();
        if (iOrdinal == 0) {
            return vls0.g;
        }
        if (iOrdinal == 1) {
            return vls0.b;
        }
        if (iOrdinal == 2) {
            return vls0.c;
        }
        if (iOrdinal == 3) {
            return vls0.d;
        }
        if (iOrdinal == 4) {
            return vls0.f;
        }
        if (iOrdinal == 5) {
            return vls0.e;
        }
        eg.o();
        return null;
    }

    public static int s() {
        int i = wgt.d;
        wgt.d = i << 1;
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    public static jyc0 v(String str) {
        String strConcat;
        try {
            y6b1 y6b1Var = new y6b1(str, false);
            v6b1 v6b1Var = y6b1Var.c;
            String str2 = y6b1Var.e;
            if (str2 == null) {
                return null;
            }
            int iOrdinal = v6b1Var.ordinal();
            if (iOrdinal == 6) {
                strConcat = v6b1Var.a;
            } else if (iOrdinal == 188) {
                String str3 = y6b1Var.N0;
                if (str3 == null) {
                    return null;
                }
                strConcat = "list/".concat(nhc1.W(y6b1.f(str3), "+", "%20"));
            } else if (iOrdinal == 205) {
                strConcat = v6b1Var.a;
            } else if (iOrdinal == 12 || iOrdinal == 13) {
                strConcat = "playlist";
            } else {
                if (iOrdinal != 63 && iOrdinal != 64) {
                    return null;
                }
                strConcat = v6b1Var.a;
            }
            strConcat.getClass();
            return new jyc0(strConcat, str2);
        } catch (SpotifyUriParserException unused) {
            return null;
        }
    }

    public static bxn w(x4i1 x4i1Var) {
        String str = null;
        String str2 = x4i1Var != null ? x4i1Var.a : null;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = x4i1Var != null ? x4i1Var.c : null;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = x4i1Var != null ? x4i1Var.b : null;
        if (str4 == null) {
            str4 = "";
        }
        if (x4i1Var != null && ((str = x4i1Var.f) == null || str.length() == 0)) {
            str = x4i1Var.e;
        }
        return new bxn(str2, str4, str3, str != null ? str : "");
    }

    public byte[] a(int i, byte[] bArr, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    public Object apply(Object obj) {
        String strUri;
        String strUri2;
        int i = 0;
        switch (this.a) {
            case 9:
                Object[] objArr = (Object[]) obj;
                int[] iArrH = l1d.H(6);
                ArrayList arrayList = new ArrayList(iArrH.length);
                int length = iArrH.length;
                int i2 = 0;
                while (i < length) {
                    arrayList.add(new n620(iArrH[i], (((int) ((Long) objArr[i2]).longValue()) * 12.0f) / 2.1474836E9f));
                    i++;
                    i2++;
                }
                return arrayList;
            case 11:
                return obj;
            case 19:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                String str = "";
                if (contextTrack == null || (strUri = contextTrack.uri()) == null) {
                    strUri = "";
                }
                ContextTrack contextTrack2 = (ContextTrack) playerState.track().h();
                if (contextTrack2 == null || (strUri2 = contextTrack2.uri()) == null) {
                    strUri2 = "";
                }
                boolean z = strUri2.length() > 0 && playerState.isPlaying() && !playerState.isPaused();
                spq0 spq0VarTrack = playerState.track();
                if (spq0VarTrack.c()) {
                    ContextTrack contextTrack3 = (ContextTrack) spq0VarTrack.b();
                    String str2 = (String) contextTrack3.metadata().get("parent_episode.uri");
                    if (str2 == null) {
                        Logger.k(" [parent_episode.uri] key missing for track [%s]", new Object[]{contextTrack3.uri()});
                    } else {
                        Logger.g(" [parent_episode.uri] for track [%s] is [%s]", new Object[]{contextTrack3.uri(), str2});
                        str = str2;
                    }
                } else {
                    Logger.k("PlayerState has no current track", new Object[0]);
                }
                if (str.length() == 0) {
                    str = strUri;
                }
                return new ege0((ContextTrack) playerState.track().h(), strUri, str, z);
            case 21:
                return kfz0.b.get(obj);
            case 25:
                return ypa.o((re70) obj);
            default:
                return a0f1.d((EsTokenExchange.TokenExchangeResponse) obj);
        }
    }

    public long b(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1735978122);
        uwr uwrVar = cbx.a;
        long jA = cbx.a(x340Var).a.b.a();
        x340Var.r(false);
        return jA;
    }

    public long d(boolean z, b0k b0kVar) {
        long jC;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(376003163);
        if (z) {
            x340Var.i0(235604698);
            uwr uwrVar = cbx.a;
            jC = cbx.a(x340Var).a.c;
            x340Var.r(false);
        } else {
            x340Var.i0(235655724);
            uwr uwrVar2 = cbx.a;
            jC = cbx.a(x340Var).a.a.c();
            x340Var.r(false);
        }
        x340Var.r(false);
        return jC;
    }

    public void e(py8 py8Var, Throwable th) {
        n57.g(cy30.p("Command failed: ", py8Var.c, " (", py8Var.b, ")"), th);
    }

    public void f(String str, List list, Integer num, Function0 function0, Function0 function1, j2i j2iVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        long j;
        String strN0;
        int i2;
        int i3;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-940946306);
        int i4 = i | (b0kVar3.g(list) ? 32 : 16) | (b0kVar3.g(num) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024) | (b0kVar3.i(function1) ? 16384 : 8192);
        if (b0kVar3.Y(i4 & 1, (74897 & i4) != 74896)) {
            u7h u7hVar = num != null ? new u7h(z4p1.e(num.intValue())) : null;
            if (u7hVar == null) {
                b0kVar3.i0(1988708709);
                uwr uwrVar = cbx.a;
                j = cbx.a(b0kVar3).b.b;
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1988706818);
                b0kVar3.r(false);
                j = u7hVar.a;
            }
            int size = list.size();
            if (size == 0) {
                b0kVar3.i0(-494235363);
                b0kVar3.r(false);
                strN0 = "";
            } else if (size == 1) {
                b0kVar3.i0(-847226324);
                b0kVar3.r(false);
                strN0 = ((bxn) list.get(0)).c;
            } else if (size != 2) {
                b0kVar3.i0(-847220275);
                strN0 = cwl1.n0(2131955405, new Object[]{((bxn) list.get(0)).c, ((bxn) list.get(1)).c}, b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-847225332);
                strN0 = cwl1.n0(2131955406, new Object[]{((bxn) list.get(0)).c, ((bxn) list.get(1)).c}, b0kVar3);
                b0kVar3.r(false);
            }
            if (list.size() == 1) {
                i2 = 1520527440;
                i3 = 2131955408;
            } else {
                i2 = 1520616658;
                i3 = 2131955407;
            }
            String strK = x0d.k(b0kVar3, i2, i3, b0kVar3, false);
            String strN1 = cwl1.n0(2131955404, new Object[]{strN0}, b0kVar3);
            gra graVar = een.g;
            boolean z = ((i4 & 7168) == 2048) | ((i4 & 112) == 32) | ((57344 & i4) == 16384);
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new ssm(list, function1, function0, (byte) 24);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            boolean zG = b0kVar3.g(strN1);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new kov(strN1, (byte) 3);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            cwl1.b(s161.b(nim0.a, false, (iu30) objT2), graVar, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(2089692583, new oo9(list, strN0, strK, j, j2iVar), b0kVar3), b0kVar2, 0, 48, 1532);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ta5(this, str, list, num, function0, function1, j2iVar, i, (byte) 17);
        }
    }

    public boolean g(int i) {
        return false;
    }

    public long h(boolean z, b0k b0kVar) {
        long jC;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-50361251);
        if (z) {
            x340Var.i0(-1368354102);
            uwr uwrVar = cbx.a;
            jC = cbx.a(x340Var).a.a.c();
            x340Var.r(false);
        } else {
            x340Var.i0(-1368290056);
            uwr uwrVar2 = cbx.a;
            jC = cbx.a(x340Var).a.c;
            x340Var.r(false);
        }
        x340Var.r(false);
        return jC;
    }

    public void i(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1700387206);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0Var = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarL0 = cwl1.l0(dug.f(qim0VarD, jA, er31.b(4.0f)), 0L, (hw61) null, 15);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarL0);
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
            qim0 qim0VarQ = i1p1.q(u291.f(qim0Var, 1.0f), er31.b(8.0f));
            cbx.a.getClass();
            t1c.a(hno1.f(qim0VarQ, uwr.a()), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l2i(this, qim0Var, i, (byte) 29);
        }
    }

    public void j(String str, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1861385777);
        if (x340Var.Y(i & 1, (i & 17) != 16)) {
            String strO0 = cwl1.o0(x340Var, 2131955409);
            String strN0 = cwl1.n0(2131955404, new Object[]{strO0}, x340Var);
            gra graVar = een.g;
            boolean zG = x340Var.g(strN0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new kov(strN0, (byte) 4);
                x340Var.s0(objT);
            }
            cwl1.b(s161.b(nim0.a, false, (iu30) objT), graVar, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-728750266, new e6j(strO0, j2iVar, (byte) 28), x340Var), x340Var, 0, 48, 2044);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g6w(this, str, j2iVar, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 java.lang.Object, still in use, count: 2, list:
          (r2v5 java.lang.Object) from 0x007c: PHI (r2 I:??) = (r2v2 java.lang.Object), (r2v5 java.lang.Object) binds: [B:26:0x007b, B:34:0x007c] A[DONT_GENERATE, DONT_INLINE]
          (r2v5 java.lang.Object) from 0x0070: CHECK_CAST (java.lang.String) (r2v5 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public p.irn0 l(android.content.Intent r8, p.th61 r9) {
        /*
            r7 = this;
            byte r7 = r7.a
            p.a6w0 r0 = p.a6w0.a
            r1 = 0
            switch(r7) {
                case 12: goto L46;
                default: goto L8;
            }
        L8:
            java.util.Set r7 = p.s4b1.f
            java.lang.String r7 = r8.getDataString()
            java.lang.String r9 = ""
            if (r7 != 0) goto L13
            r7 = r9
        L13:
            p.s4b1 r7 = p.uic.x(r7)
            android.os.Bundle r8 = r8.getExtras()
            if (r8 == 0) goto L23
            java.lang.String r1 = "overriddenReturnToUri"
            java.lang.String r1 = r8.getString(r1)
        L23:
            java.lang.String r7 = r7.j()
            if (r7 != 0) goto L2a
            goto L2b
        L2a:
            r9 = r7
        L2b:
            p.e7g0 r7 = new p.e7g0
            p.kik1 r8 = p.nik1.R5
            java.lang.String r2 = "spotify:internal:parental-control:manage-blocked-content:"
            java.lang.String r2 = r2.concat(r9)
            p.lik1 r8 = r8.b(r2)
            p.iyr0 r2 = p.iyr0.b
            r7.<init>(r9, r8, r2, r1)
            p.hrn0 r8 = new p.hrn0
            java.lang.Class<p.z6g0> r9 = p.z6g0.class
            r8.<init>(r9, r7, r0)
            return r8
        L46:
            android.net.Uri r7 = r8.getData()
            if (r7 == 0) goto L91
            java.lang.String r7 = r7.getQuery()
            if (r7 == 0) goto L91
            r8 = 1
            char[] r2 = new char[r8]
            r3 = 38
            r4 = 0
            r2[r4] = r3
            r3 = 6
            java.util.List r7 = p.ihc1.P0(r7, r2, r3)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L65:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r7.next()
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "facet"
            boolean r5 = p.ihc1.h0(r5, r6, r4)
            if (r5 == 0) goto L65
            goto L7c
        L7b:
            r2 = r1
        L7c:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L91
            char[] r7 = new char[r8]
            r8 = 61
            r7[r4] = r8
            java.util.List r7 = p.ihc1.P0(r2, r7, r3)
            java.lang.Object r7 = p.o7h.C0(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L92
        L91:
            r7 = r1
        L92:
            p.zw30 r8 = new p.zw30
            java.lang.String r9 = r9.a
            r8.<init>(r9, r7, r1)
            java.lang.Class<p.xw30> r7 = p.xw30.class
            p.hrn0 r7 = p.lfb.l(r7, r8, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xgc.l(android.content.Intent, p.th61):p.irn0");
    }

    public Next t(z551 z551Var, sz41 sz41Var) {
        xo20 xo20Var = sz41Var.a;
        String strF = ejb.f();
        re20 re20Var = z551Var.h;
        if (!(re20Var instanceof re20)) {
            if ((re20Var instanceof se20) || (re20Var instanceof te20)) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        re20 re20Var2 = re20Var;
        z551 z551VarA = z551.a(z551Var, (String) null, (String) null, 0, y851.a, (val) null, (fw41) null, jlr0.a, re20.a(re20Var2, xo20Var, false, 2), (xrt0) null, 0, (m131) null, (e7r0) null, false, (h1z0) null, false, 32563);
        val valVar = z551VarA.e;
        if (!(valVar instanceof ral)) {
            if (valVar instanceof pal) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (u890.j(re20Var2.a, xo20Var)) {
            return Next.j();
        }
        String str = z551VarA.a;
        xo20 xo20Var2 = sz41Var.a;
        String strG = uap1.g(z551VarA);
        fw41 fw41Var = z551Var.f;
        int i = fw41Var.d;
        tv80 tv80Var = sz41Var.b;
        gyh gyhVar = z551Var.N0.a;
        if (gyhVar == null) {
            gyhVar = gyh.b;
        }
        return Next.i(z551VarA, f46.S0(new xyn1[]{sc51.b, new qx41(str, strF, xo20Var2, strG, i, tv80Var, gyhVar, fw41Var.c, (List) null)}));
    }

    public String toString() {
        switch (this.a) {
            case 26:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    public Next u(z551 z551Var, i151 i151Var) {
        rx41 qx41Var;
        te20 te20Var = z551Var.h;
        te20 te20Var2 = te20Var instanceof te20 ? te20Var : null;
        if (te20Var2 == null) {
            return Next.j();
        }
        List list = te20Var2.a;
        if (z551Var.e instanceof pal) {
            return Next.j();
        }
        List<db20> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((db20) it.next()).a);
        }
        Set setP1 = o7h.p1(arrayList);
        List listJ0 = o7h.j0(i151Var.a);
        List list3 = listJ0;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                if (!setP1.contains((String) it2.next())) {
                    return Next.j();
                }
            }
        }
        if (o7h.p1(list3).equals(o7h.p1(te20Var2.b()))) {
            return Next.j();
        }
        Set setP2 = o7h.p1(list3);
        String strF = ejb.f();
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        for (db20 db20Var : list2) {
            arrayList2.add(db20.a(db20Var, setP2.contains(db20Var.a)));
        }
        z551 z551VarA = z551.a(z551Var, (String) null, (String) null, 0, y851.a, (val) null, (fw41) null, jlr0.a, new te20(arrayList2, strF), (xrt0) null, 0, (m131) null, (e7r0) null, false, (h1z0) null, false, 32563);
        h1z0 h1z0Var = z551VarA.N0;
        fw41 fw41Var = z551VarA.f;
        boolean zIsEmpty = listJ0.isEmpty();
        String str = z551VarA.a;
        gyh gyhVar = gyh.b;
        if (zIsEmpty) {
            String strG = uap1.g(z551VarA);
            int i = fw41Var.d;
            gyh gyhVar2 = h1z0Var.a;
            qx41Var = new rx41(str, strF, strG, i, gyhVar2 == null ? gyhVar : gyhVar2, i151Var.b, fw41Var.c);
        } else {
            String strG2 = uap1.g(z551VarA);
            int i2 = fw41Var.d;
            tv80 tv80Var = i151Var.b;
            gyh gyhVar3 = h1z0Var.a;
            qx41Var = new qx41(str, strF, (xo20) null, strG2, i2, tv80Var, gyhVar3 == null ? gyhVar : gyhVar3, fw41Var.c, listJ0);
        }
        return Next.i(z551VarA, f46.S0(new xyn1[]{sc51.b, qx41Var}));
    }

    public void c(py8 py8Var) {
    }
}
