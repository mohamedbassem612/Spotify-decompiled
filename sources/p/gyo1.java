package p;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.share.logging.impl.events.proto.ShareAssetGenerationTiming;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class gyo1 {
    public static b180 a;
    public static b180 b;

    public static final void A(lbt0 lbt0Var, iu30 iu30Var, wpv0 wpv0Var, xfx xfxVar, vzq0 vzq0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1446174491);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(lbt0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(wpv0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(xfxVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(nim0.a) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(vzq0Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            if (wpv0Var.b.m()) {
                x340Var.i0(-166988122);
                fyo1.e(lbt0Var, iu30Var, wpv0Var, xfxVar, vzq0Var, x340Var, i2 & 524286);
                x340Var.r(false);
            } else {
                x340Var.i0(-166768890);
                eyo1.g(lbt0Var, iu30Var, wpv0Var, xfxVar, vzq0Var, x340Var, i2 & 524286);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ibt0(lbt0Var, iu30Var, wpv0Var, xfxVar, vzq0Var, i, (byte) 2);
        }
    }

    public static final void B(int i, String str, b0k b0kVar, iu30 iu30Var) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-192373090);
        int i2 = (b0kVar3.g(str) ? 4 : 2) | i | (b0kVar3.i(iu30Var) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            y7e1 y7e1VarD = c4p1.D(i2 & 14, 2, str, b0kVar3);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(b0kVar3);
            }
            idn0 idn0Var = (idn0) objT;
            ven0 ven0VarS = v8r.s(iu30Var, b0kVar3);
            boolean zG = b0kVar3.g(y7e1VarD) | b0kVar3.g(ven0VarS);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new d7i0(y7e1VarD, ven0VarS, (lnm) null, (byte) 9);
                b0kVar3.s0(objT2);
            }
            qxd0.t(y7e1VarD, b0kVar3, (vu30) objT2);
            String strO0 = cwl1.o0(b0kVar3, 2131958579);
            uwr uwrVar = cbx.a;
            fyx fyxVar = new fyx(new zxx(cbx.a(b0kVar3).b.a, cbx.a(b0kVar3).b.b, cbx.a(b0kVar3).b.b, cbx.a(b0kVar3).b.d, cbx.a(b0kVar3).a.b.a(), cbx.a(b0kVar3).a.b.a(), cbx.a(b0kVar3).b.c, 0L, 896));
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(12.0f, 8.0f, 12.0f, 8.0f);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            rwo1.a(y7e1VarD, fyxVar, i1p1.q(uyn1.y(qim0VarF, 16.0f, 8.0f), er31.b(24.0f)), null, strO0, a1j.a, apo.r(-1195211094, new ex1(y7e1VarD, (byte) 3), b0kVar3), false, null, null, null, null, d6e1.b, null, idn0Var, null, null, zzq0Var, 0.0f, false, b0kVar2, 1769472, 199680, 0, 1793928);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qgd(str, iu30Var, i, (byte) 9);
        }
    }

    public static final void C(scj0 scj0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(22071206);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(scj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gw70 gw70Var = (gw70) x340Var.k(oi7.a);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            zzq0 zzq0VarJ = uyn1.j(0.0f, 8.0f, 0.0f, 0.0f, 13);
            WeakHashMap weakHashMap = osl1.x;
            hdh hdhVarN = lnn1.n(zzq0VarJ, hqq0.C(lhc.g(x340Var).e, x340Var));
            boolean zI = ((i2 & 14) == 4) | ((i2 & 112) == 32) | x340Var.i(gw70Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new gnf0(scj0Var, gw70Var, iu30Var, (byte) 18);
                x340Var.s0(objT);
            }
            ujo1.d(null, null, hdhVarN, false, null, null, null, false, null, (iu30) objT, x340Var, 0, 507);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pbj0(scj0Var, iu30Var, i, (byte) 1);
        }
    }

    public static final void D(evi1 evi1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1919476885);
        int i2 = i | (x340Var.g(evi1Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            vy71 vy71VarF = dem0.f(0, 3, x340Var, (iu30) null, false);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            boolean zI = x340Var.i(c9nVar) | x340Var.i(vy71VarF) | ((i2 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new o8e1(c9nVar, vy71VarF, iu30Var, (byte) 19);
                x340Var.s0(objT2);
            }
            j2i j2iVarR = apo.r(-92035389, new eii1(evi1Var, iu30Var, (byte) 2), x340Var);
            qim0Var2 = nim0.a;
            poo1.k(qim0Var2, (Function0) objT2, vy71VarF, 0L, null, 0, 0.0f, null, j2iVarR, x340Var, 100663302);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fvi1(evi1Var, iu30Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void E(evi1 evi1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        String str = evi1Var.d;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1181087408);
        int i2 = i | (b0kVar2.g(evi1Var) ? 4 : 2) | (b0kVar2.i(iu30Var) ? 32 : 16) | 384;
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarB = uyn1.B(uyn1.z(16.0f, 0.0f, 2, qim0VarF), 0.0f, 28.0f, 0.0f, 32.0f, 5);
            mbh mbhVarA = jbh.a(d36Var, eraVar, b0kVar2, 0);
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
            boolean zG = b0kVar2.g(str);
            Object objT = b0kVar2.T();
            if (zG || objT == fkj0.X) {
                objT = Uri.parse(str);
                b0kVar2.s0(objT);
            }
            eso1.h(oi7.a((Uri) objT, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, true, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar2, 805306368, 0, 130558), isl.a, u291.h(qim0Var3, 70.0f), (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, b0kVar2, 224304, 384);
            uwo1.e(evi1Var.e, u291.f(qim0Var3, 1.0f), cbx.d(b0kVar2).c, cbx.a(b0kVar2).b.a, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
            b0kVar2 = b0kVar2;
            o(evi1Var, iu30Var, b0kVar2, i2 & 126);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new fvi1(evi1Var, iu30Var, qim0Var2, i, (byte) 1);
        }
    }

    public static int F(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static final boolean G(Map map, dlc0... dlc0VarArr) {
        for (dlc0 dlc0Var : dlc0VarArr) {
            Integer num = (Integer) map.get(dlc0Var);
            if ((num != null ? num.intValue() : 0) > 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean H(Map map, dlc0 dlc0Var) {
        if (map.isEmpty()) {
            return false;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((Number) ((Map.Entry) it.next()).getValue()).intValue() > 0) {
                if (map.isEmpty()) {
                    return true;
                }
                for (Map.Entry entry : map.entrySet()) {
                    if (((Number) entry.getValue()).intValue() != 0 && entry.getKey() != dlc0Var) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:102:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:104:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:105:0x04de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0509  */
    /* JADX WARN: Code duplicated, block: B:110:0x0512  */
    /* JADX WARN: Code duplicated, block: B:111:0x0514 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0530  */
    /* JADX WARN: Code duplicated, block: B:117:0x0536  */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0383  */
    /* JADX WARN: Code duplicated, block: B:76:0x038d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:80:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:83:0x0412  */
    /* JADX WARN: Code duplicated, block: B:84:0x0414 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x045e  */
    /* JADX WARN: Code duplicated, block: B:99:0x04a2  */
    public static final Object I(nfm1 nfm1Var, o571 o571Var, List list, boolean z, e4p e4pVar, iac0 iac0Var, n771 n771Var, g871 g871Var, yqg yqgVar, String str, ou80 ou80Var, q8n q8nVar, onm onmVar) throws AbortFlowException {
        z371 z371Var;
        String str2;
        boolean z2;
        e4p e4pVar2;
        iac0 iac0Var2;
        g871 g871Var2;
        yqg yqgVar2;
        String str3;
        d9n d9nVar;
        ifm1 ifm1Var;
        String str4;
        boolean z3;
        Object obj;
        Map map;
        String str5;
        q8n q8nVar2;
        ou80 ou80Var2;
        o571 o571Var2;
        nfm1 nfm1Var2;
        Iterator it;
        d9n d9nVar2;
        String strConcat;
        Object obj2;
        boolean z4;
        String str6;
        Object obj3;
        d9n d9nVar3;
        n771 n771Var2;
        e4p e4pVar3;
        iac0 iac0Var3;
        ifm1 ifm1Var2;
        ou80 ou80Var3;
        String str7;
        yqg yqgVar3;
        boolean z5;
        q8n q8nVar3;
        Map map2;
        o571 o571Var3;
        nfm1 nfm1Var3;
        File file;
        boolean z6;
        Map map3;
        Long l;
        String str8;
        String str9;
        Long l2;
        n771 n771Var3;
        Object objJ;
        d9n d9nVar4;
        File file2;
        String str10;
        o571 o571Var4;
        ou80 ou80Var4;
        boolean z7;
        Object obj4;
        Map map4;
        nfm1 nfm1Var4;
        boolean z8;
        jpj1 jpj1Var;
        String str11;
        Object objY;
        String str12;
        nfm1 nfm1Var5;
        o571 o571Var5;
        n771 n771Var4 = n771Var;
        if (onmVar instanceof z371) {
            z371Var = (z371) onmVar;
            int i = z371Var.T0;
            if ((i & Integer.MIN_VALUE) != 0) {
                z371Var.T0 = i - Integer.MIN_VALUE;
            } else {
                z371Var = new z371(onmVar);
            }
        } else {
            z371Var = new z371(onmVar);
        }
        Object obj5 = z371Var.S0;
        int i2 = z371Var.T0;
        d9n d9nVar5 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj5);
            String str13 = nfm1Var.a;
            jfm1 jfm1Var = nfm1Var.d;
            mfm1 mfm1Var = nfm1Var.b;
            ifm1 ifm1Var3 = nfm1Var.e;
            if (ifm1Var3 instanceof gfm1) {
                str2 = ((gfm1) ifm1Var3).a;
            } else {
                if (!(ifm1Var3 instanceof hfm1)) {
                    eg.o();
                    return null;
                }
                str2 = null;
            }
            Map map5 = mfm1Var.c;
            String str14 = mfm1Var.a;
            boolean zJ = u890.j(o571Var, l571.d);
            z2 = !zJ;
            if ((list.contains(yy61.g) || list.contains(yy61.h)) && (ifm1Var3 instanceof hfm1)) {
                hfm1 hfm1Var = (hfm1) ifm1Var3;
                StringBuilder sb = new StringBuilder();
                sb.append(hfm1Var.a);
                Iterator it2 = hfm1Var.b.iterator();
                while (it2.hasNext()) {
                    sj31 sj31Var = (uj31) it2.next();
                    sb.append("_");
                    if (sj31Var instanceof sj31) {
                        sj31 sj31Var2 = sj31Var;
                        it = it2;
                        strConcat = gvg.h("s:", sj31Var2.a, "=", sj31Var2.b);
                        d9nVar2 = d9nVar5;
                    } else {
                        it = it2;
                        if (sj31Var instanceof rj31) {
                            rj31 rj31Var = (rj31) sj31Var;
                            d9nVar2 = d9nVar5;
                            strConcat = "n:" + rj31Var.a + "=" + rj31Var.b;
                        } else {
                            d9nVar2 = d9nVar5;
                            if (sj31Var instanceof nj31) {
                                nj31 nj31Var = (nj31) sj31Var;
                                strConcat = "b:" + nj31Var.a + "=" + nj31Var.b;
                            } else if (sj31Var instanceof oj31) {
                                oj31 oj31Var = (oj31) sj31Var;
                                strConcat = "c:" + oj31Var.a + "=" + oj31Var.b;
                            } else if (sj31Var instanceof pj31) {
                                pj31 pj31Var = (pj31) sj31Var;
                                strConcat = gvg.h("e:", pj31Var.a, "=", pj31Var.b);
                            } else if (sj31Var instanceof tj31) {
                                strConcat = "t:".concat(((tj31) sj31Var).a);
                            } else {
                                if (!(sj31Var instanceof qj31)) {
                                    eg.o();
                                    return null;
                                }
                                qj31 qj31Var = (qj31) sj31Var;
                                strConcat = "i:" + qj31Var.a + "=" + Arrays.hashCode(qj31Var.b);
                            }
                        }
                    }
                    sb.append(strConcat);
                    it2 = it;
                    d9nVar5 = d9nVar2;
                }
                d9n d9nVar6 = d9nVar5;
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(sb.toString().getBytes(nne.a));
                bArrDigest.getClass();
                String strR0 = f46.r0(bArrDigest, rq61.c1, 30);
                z371Var.a = nfm1Var;
                z371Var.b = o571Var;
                e4pVar2 = e4pVar;
                z371Var.c = e4pVar2;
                iac0Var2 = iac0Var;
                z371Var.d = iac0Var2;
                z371Var.e = n771Var4;
                g871Var2 = g871Var;
                z371Var.f = g871Var2;
                yqgVar2 = yqgVar;
                z371Var.g = yqgVar2;
                z371Var.h = str;
                z371Var.i = ou80Var;
                z371Var.t = q8nVar;
                z371Var.X = str13;
                z371Var.Y = ifm1Var3;
                z371Var.Z = map5;
                z371Var.N0 = strR0;
                z371Var.Q0 = z;
                z371Var.R0 = z2;
                z371Var.T0 = 1;
                str3 = str13;
                Object objY2 = fn31.Y(q8nVar, new lm61(n771Var4, strR0, (lnm) null, (byte) 8), z371Var);
                d9nVar = d9nVar6;
                if (objY2 == d9nVar) {
                    return d9nVar;
                }
                ifm1Var = ifm1Var3;
                str4 = str;
                z3 = z;
                obj = objY2;
                map = map5;
                str5 = strR0;
                q8nVar2 = q8nVar;
                ou80Var2 = ou80Var;
                o571Var2 = o571Var;
                nfm1Var2 = nfm1Var;
            } else {
                obj2 = null;
                if (list.contains(yy61.f) && !zJ && str2 != null) {
                    return new g9c1(str13, new bnt(str2), (bnt) null, (String) null, map5, (dqi1) null, J(jfm1Var, o571Var), 44);
                }
                if (list.contains(yy61.d) && !zJ && str2 != null) {
                    return new pz70(Uri.parse(str2), str13, map5, ihc1.y0(str14) ? null : str14, 76);
                }
                if (list.contains(yy61.c) && !ihc1.y0(str14)) {
                    return new a6j0(S(nfm1Var, o571Var), (!u890.j(o571Var, r471.d) || z) ? str14 : null, (String) null, (String) null, (dqi1) null, K(map5, o571Var), u890.j(o571Var, q471.d) ? J(jfm1Var, o571Var) : new o371((String) null, false, false, 7), 28);
                }
                if (list.contains(yy61.b)) {
                    return new vkc0(S(nfm1Var, o571Var), (String) null, K(map5, o571Var), (dqi1) null, u890.j(o571Var, q471.d) ? J(jfm1Var, o571Var) : new o371((String) null, false, false, 7), 10);
                }
            }
            return obj2;
        }
        if (i2 == 1) {
            boolean z9 = z371Var.R0;
            boolean z10 = z371Var.Q0;
            String str15 = z371Var.N0;
            Map map6 = z371Var.Z;
            ifm1 ifm1Var4 = z371Var.Y;
            String str16 = z371Var.X;
            q8n q8nVar4 = z371Var.t;
            ou80 ou80Var5 = z371Var.i;
            str4 = z371Var.h;
            yqgVar2 = z371Var.g;
            g871 g871Var3 = z371Var.f;
            n771 n771Var5 = z371Var.e;
            iac0 iac0Var4 = z371Var.d;
            e4p e4pVar4 = z371Var.c;
            o571 o571Var6 = z371Var.b;
            nfm1 nfm1Var6 = z371Var.a;
            hm5.M(obj5);
            map = map6;
            str3 = str16;
            obj = obj5;
            q8nVar2 = q8nVar4;
            ou80Var2 = ou80Var5;
            g871Var2 = g871Var3;
            z2 = z9;
            e4pVar2 = e4pVar4;
            z3 = z10;
            nfm1Var2 = nfm1Var6;
            d9nVar = d9nVar5;
            iac0Var2 = iac0Var4;
            ifm1Var = ifm1Var4;
            n771Var4 = n771Var5;
            str5 = str15;
            o571Var2 = o571Var6;
        } else if (i2 == 2) {
            boolean z11 = z371Var.R0;
            boolean z12 = z371Var.Q0;
            String str17 = z371Var.N0;
            Map map7 = z371Var.Z;
            ifm1 ifm1Var5 = z371Var.Y;
            String str18 = z371Var.X;
            q8n q8nVar5 = z371Var.t;
            ou80 ou80Var6 = z371Var.i;
            String str19 = z371Var.h;
            yqg yqgVar4 = z371Var.g;
            g871 g871Var4 = z371Var.f;
            n771 n771Var6 = z371Var.e;
            iac0 iac0Var5 = z371Var.d;
            e4p e4pVar5 = z371Var.c;
            o571 o571Var7 = z371Var.b;
            nfm1 nfm1Var7 = z371Var.a;
            hm5.M(obj5);
            z4 = z11;
            obj3 = obj5;
            d9nVar3 = d9nVar5;
            ou80Var3 = ou80Var6;
            g871Var2 = g871Var4;
            map2 = map7;
            str7 = str19;
            yqgVar3 = yqgVar4;
            o571Var3 = o571Var7;
            str6 = str18;
            z5 = z12;
            n771Var2 = n771Var6;
            q8nVar3 = q8nVar5;
            iac0Var3 = iac0Var5;
            str5 = str17;
            nfm1Var3 = nfm1Var7;
            e4pVar3 = e4pVar5;
            ifm1Var2 = ifm1Var5;
            file = ((l420) obj3).b;
            z6 = z5;
            f4p f4pVar = (f4p) e4pVar3.a.c;
            String str20 = str5;
            i7d i7dVar = f4pVar.a;
            map3 = map2;
            String str21 = str6;
            ti31 ti31Var = new ti31((Context) ((kly0) i7dVar.a).get(), (w5b1) ((kly0) i7dVar.g).get());
            i7d i7dVar2 = f4pVar.a;
            g931 g931Var = new g931(ti31Var, (zle1) ((kly0) i7dVar2.f).get(), (hj31) ((kly0) i7dVar2.b).get(), (byte) 2);
            if (yqgVar3 != null) {
                l = new Long(yqgVar3.e());
            } else {
                l = null;
            }
            hfm1 hfm1Var2 = (hfm1) ifm1Var2;
            String str22 = hfm1Var2.a;
            Long l3 = l;
            List list2 = hfm1Var2.b;
            Map map8 = dj31.a;
            bge bgeVarG = h4p1.g(new am31(g931Var, new rl31(str22, list2, file, nln.y(hfm1Var2.c)), iac0Var3, (lnm) null));
            fns fnsVar = igu.a;
            mr20 mr20VarR = o4p1.r(bgeVarG, b3s.c);
            ck01 ck01Var = new ck01(2, null, (byte) 15);
            z371Var.a = nfm1Var3;
            z371Var.b = o571Var3;
            z371Var.c = null;
            z371Var.d = null;
            z371Var.e = n771Var2;
            z371Var.f = g871Var2;
            z371Var.g = yqgVar3;
            z371Var.h = str7;
            z371Var.i = ou80Var3;
            z371Var.t = q8nVar3;
            str8 = str21;
            z371Var.X = str8;
            z371Var.Y = null;
            z371Var.Z = map3;
            str9 = str20;
            z371Var.N0 = str9;
            z371Var.O0 = file;
            l2 = l3;
            z371Var.P0 = l2;
            n771Var3 = n771Var2;
            z371Var.Q0 = z6;
            z371Var.R0 = z4;
            z371Var.T0 = 3;
            objJ = b5p1.j(mr20VarR, ck01Var, z371Var);
            d9nVar4 = d9nVar3;
            if (objJ == d9nVar4) {
                return d9nVar4;
            }
            file2 = file;
            str10 = str7;
            o571Var4 = o571Var3;
            ou80Var4 = ou80Var3;
            z7 = z6;
            obj4 = objJ;
            map4 = map3;
            nfm1Var4 = nfm1Var3;
            z8 = z4;
            jpj1Var = (lpj1) obj4;
            yqg yqgVar5 = yqgVar3;
            if (!(jpj1Var instanceof ipj1)) {
                obj2 = null;
                if (!(jpj1Var instanceof jpj1)) {
                    str11 = str10;
                    if (u890.j(jpj1Var, hpj1.a)) {
                        if (g871Var2 != null) {
                            g871Var2.b(new w771(212, str11, str8, "Video generation cancelled", (String) null));
                            return null;
                        }
                    } else if (!(jpj1Var instanceof kpj1)) {
                        eg.o();
                        return null;
                    }
                } else if (g871Var2 != null) {
                    Exception exc = jpj1Var.a;
                    g871Var2.b(new w771(211, str10, str8, l1d.m("Video generation failed: ", exc.getMessage()), j2h1.I(exc)));
                    return null;
                }
                return obj2;
            }
            if (g871Var2 == null) {
            }
            z371Var.a = nfm1Var4;
            z371Var.b = o571Var4;
            z371Var.c = null;
            z371Var.d = null;
            z371Var.e = null;
            z371Var.f = null;
            z371Var.g = null;
            z371Var.h = null;
            z371Var.i = null;
            z371Var.t = null;
            z371Var.X = str8;
            z371Var.Y = null;
            z371Var.Z = map4;
            z371Var.N0 = null;
            z371Var.O0 = null;
            z371Var.P0 = null;
            z371Var.Q0 = z7;
            z371Var.R0 = z8;
            z371Var.T0 = 4;
            objY = fn31.Y(q8nVar3, new p651(file2, n771Var3, str9, (lnm) null, (byte) 9), z371Var);
            if (objY == d9nVar4) {
                return d9nVar4;
            }
            str12 = str8;
            nfm1Var5 = nfm1Var4;
            obj5 = objY;
            o571Var5 = o571Var4;
        } else if (i2 == 3) {
            boolean z13 = z371Var.R0;
            boolean z14 = z371Var.Q0;
            Long l4 = z371Var.P0;
            File file3 = z371Var.O0;
            String str23 = z371Var.N0;
            Map map9 = z371Var.Z;
            String str24 = z371Var.X;
            q8nVar3 = z371Var.t;
            ou80 ou80Var7 = z371Var.i;
            String str25 = z371Var.h;
            yqgVar3 = z371Var.g;
            g871Var2 = z371Var.f;
            n771 n771Var7 = z371Var.e;
            o571 o571Var8 = z371Var.b;
            nfm1 nfm1Var8 = z371Var.a;
            hm5.M(obj5);
            o571Var4 = o571Var8;
            file2 = file3;
            z7 = z14;
            d9nVar4 = d9nVar5;
            obj4 = obj5;
            str8 = str24;
            nfm1Var4 = nfm1Var8;
            map4 = map9;
            str10 = str25;
            str9 = str23;
            n771Var3 = n771Var7;
            ou80Var4 = ou80Var7;
            l2 = l4;
            z8 = z13;
            jpj1Var = (lpj1) obj4;
            yqg yqgVar6 = yqgVar3;
            if (!(jpj1Var instanceof ipj1)) {
                obj2 = null;
                if (!(jpj1Var instanceof jpj1)) {
                    str11 = str10;
                    if (u890.j(jpj1Var, hpj1.a)) {
                        if (g871Var2 != null && str11 != null) {
                            g871Var2.b(new w771(212, str11, str8, "Video generation cancelled", (String) null));
                            return null;
                        }
                    } else if (!(jpj1Var instanceof kpj1)) {
                        eg.o();
                        return null;
                    }
                } else if (g871Var2 != null && str10 != null) {
                    Exception exc2 = jpj1Var.a;
                    g871Var2.b(new w771(211, str10, str8, l1d.m("Video generation failed: ", exc2.getMessage()), j2h1.I(exc2)));
                    return null;
                }
                return obj2;
            }
            if (g871Var2 == null && str10 != null && yqgVar6 != null && l2 != null) {
                double dE = (yqgVar6.e() - l2.longValue()) / 1000.0d;
                long length = file2.length();
                String str26 = ou80Var4 != null ? ou80Var4.a : null;
                cy61 cy61VarN = ShareAssetGenerationTiming.n();
                cy61VarN.u(str10);
                cy61VarN.q(str8);
                cy61VarN.n("video");
                cy61VarN.s(dE);
                cy61VarN.r(length);
                if (str26 != null) {
                    cy61VarN.t(str26);
                }
                g871Var2.d.a(cy61VarN.build());
            }
            z371Var.a = nfm1Var4;
            z371Var.b = o571Var4;
            z371Var.c = null;
            z371Var.d = null;
            z371Var.e = null;
            z371Var.f = null;
            z371Var.g = null;
            z371Var.h = null;
            z371Var.i = null;
            z371Var.t = null;
            z371Var.X = str8;
            z371Var.Y = null;
            z371Var.Z = map4;
            z371Var.N0 = null;
            z371Var.O0 = null;
            z371Var.P0 = null;
            z371Var.Q0 = z7;
            z371Var.R0 = z8;
            z371Var.T0 = 4;
            objY = fn31.Y(q8nVar3, new p651(file2, n771Var3, str9, (lnm) null, (byte) 9), z371Var);
            if (objY == d9nVar4) {
                return d9nVar4;
            }
            str12 = str8;
            nfm1Var5 = nfm1Var4;
            obj5 = objY;
            o571Var5 = o571Var4;
        } else {
            if (i2 != 4) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map4 = z371Var.Z;
            str12 = z371Var.X;
            o571Var5 = z371Var.b;
            nfm1Var5 = z371Var.a;
            hm5.M(obj5);
        }
        return new h9c1(str12, new cnt(Uri.fromFile((File) obj5), false), (bnt) null, (String) null, map4, (dqi1) null, J(nfm1Var5.d, o571Var5), 44);
        File file4 = (File) obj;
        if (file4 != null) {
            return new h9c1(str3, new cnt(Uri.fromFile(file4), false), (bnt) null, (String) null, map, (dqi1) null, J(nfm1Var2.d, o571Var2), 44);
        }
        String str27 = str3;
        z4 = z2;
        str6 = str27;
        d9n d9nVar7 = d9nVar;
        z371Var.a = nfm1Var2;
        z371Var.b = o571Var2;
        z371Var.c = e4pVar2;
        z371Var.d = iac0Var2;
        z371Var.e = n771Var4;
        z371Var.f = g871Var2;
        z371Var.g = yqgVar2;
        z371Var.h = str4;
        z371Var.i = ou80Var2;
        z371Var.t = q8nVar2;
        z371Var.X = str6;
        z371Var.Y = ifm1Var;
        z371Var.Z = map;
        z371Var.N0 = str5;
        z371Var.Q0 = z3;
        z371Var.R0 = z4;
        z371Var.T0 = 2;
        Object objA = n771.a(n771Var4, ".mp4", z371Var);
        nfm1 nfm1Var9 = nfm1Var2;
        if (objA == d9nVar7) {
            return d9nVar7;
        }
        obj3 = objA;
        d9nVar3 = d9nVar7;
        n771Var2 = n771Var4;
        e4pVar3 = e4pVar2;
        iac0Var3 = iac0Var2;
        ifm1Var2 = ifm1Var;
        ou80Var3 = ou80Var2;
        str7 = str4;
        yqgVar3 = yqgVar2;
        z5 = z3;
        q8nVar3 = q8nVar2;
        map2 = map;
        o571Var3 = o571Var2;
        nfm1Var3 = nfm1Var9;
        file = ((l420) obj3).b;
        z6 = z5;
        f4p f4pVar2 = (f4p) e4pVar3.a.c;
        String str28 = str5;
        i7d i7dVar3 = f4pVar2.a;
        map3 = map2;
        String str29 = str6;
        ti31 ti31Var2 = new ti31((Context) ((kly0) i7dVar3.a).get(), (w5b1) ((kly0) i7dVar3.g).get());
        i7d i7dVar4 = f4pVar2.a;
        g931 g931Var2 = new g931(ti31Var2, (zle1) ((kly0) i7dVar4.f).get(), (hj31) ((kly0) i7dVar4.b).get(), (byte) 2);
        if (yqgVar3 != null) {
            l = new Long(yqgVar3.e());
        } else {
            l = null;
        }
        hfm1 hfm1Var3 = (hfm1) ifm1Var2;
        String str210 = hfm1Var3.a;
        Long l5 = l;
        List list3 = hfm1Var3.b;
        Map map10 = dj31.a;
        bge bgeVarG2 = h4p1.g(new am31(g931Var2, new rl31(str210, list3, file, nln.y(hfm1Var3.c)), iac0Var3, (lnm) null));
        fns fnsVar2 = igu.a;
        mr20 mr20VarR2 = o4p1.r(bgeVarG2, b3s.c);
        ck01 ck01Var2 = new ck01(2, null, (byte) 15);
        z371Var.a = nfm1Var3;
        z371Var.b = o571Var3;
        z371Var.c = null;
        z371Var.d = null;
        z371Var.e = n771Var2;
        z371Var.f = g871Var2;
        z371Var.g = yqgVar3;
        z371Var.h = str7;
        z371Var.i = ou80Var3;
        z371Var.t = q8nVar3;
        str8 = str29;
        z371Var.X = str8;
        z371Var.Y = null;
        z371Var.Z = map3;
        str9 = str28;
        z371Var.N0 = str9;
        z371Var.O0 = file;
        l2 = l5;
        z371Var.P0 = l2;
        n771Var3 = n771Var2;
        z371Var.Q0 = z6;
        z371Var.R0 = z4;
        z371Var.T0 = 3;
        objJ = b5p1.j(mr20VarR2, ck01Var2, z371Var);
        d9nVar4 = d9nVar3;
        if (objJ == d9nVar4) {
            return d9nVar4;
        }
        file2 = file;
        str10 = str7;
        o571Var4 = o571Var3;
        ou80Var4 = ou80Var3;
        z7 = z6;
        obj4 = objJ;
        map4 = map3;
        nfm1Var4 = nfm1Var3;
        z8 = z4;
        jpj1Var = (lpj1) obj4;
        yqg yqgVar7 = yqgVar3;
        if (!(jpj1Var instanceof ipj1)) {
            obj2 = null;
            if (!(jpj1Var instanceof jpj1)) {
                str11 = str10;
                if (u890.j(jpj1Var, hpj1.a)) {
                    if (g871Var2 != null) {
                        g871Var2.b(new w771(212, str11, str8, "Video generation cancelled", (String) null));
                        return null;
                    }
                } else if (!(jpj1Var instanceof kpj1)) {
                    eg.o();
                    return null;
                }
            } else if (g871Var2 != null) {
                Exception exc3 = jpj1Var.a;
                g871Var2.b(new w771(211, str10, str8, l1d.m("Video generation failed: ", exc3.getMessage()), j2h1.I(exc3)));
                return null;
            }
            return obj2;
        }
        if (g871Var2 == null) {
        }
        z371Var.a = nfm1Var4;
        z371Var.b = o571Var4;
        z371Var.c = null;
        z371Var.d = null;
        z371Var.e = null;
        z371Var.f = null;
        z371Var.g = null;
        z371Var.h = null;
        z371Var.i = null;
        z371Var.t = null;
        z371Var.X = str8;
        z371Var.Y = null;
        z371Var.Z = map4;
        z371Var.N0 = null;
        z371Var.O0 = null;
        z371Var.P0 = null;
        z371Var.Q0 = z7;
        z371Var.R0 = z8;
        z371Var.T0 = 4;
        objY = fn31.Y(q8nVar3, new p651(file2, n771Var3, str9, (lnm) null, (byte) 9), z371Var);
        if (objY == d9nVar4) {
            return d9nVar4;
        }
        str12 = str8;
        nfm1Var5 = nfm1Var4;
        obj5 = objY;
        o571Var5 = o571Var4;
        return new h9c1(str12, new cnt(Uri.fromFile((File) obj5), false), (bnt) null, (String) null, map4, (dqi1) null, J(nfm1Var5.d, o571Var5), 44);
    }

    public static final o371 J(jfm1 jfm1Var, o571 o571Var) {
        Object next;
        List list = jfm1Var.c;
        boolean zBooleanValue = jfm1Var.b;
        String str = jfm1Var.a;
        if (list == null) {
            return new o371(str, zBooleanValue, false, 4);
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((ffm1) next).a, o571Var));
        ffm1 ffm1Var = (ffm1) next;
        if (ffm1Var == null || !ffm1Var.d) {
            return new o371((String) null, true, false, 4);
        }
        String str2 = ffm1Var.b;
        if (str2 != null) {
            str = str2;
        }
        Boolean bool = ffm1Var.c;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new o371(str, zBooleanValue, false, 4);
    }

    public static final LinkedHashMap K(Map map, o571 o571Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if ((o571Var != e571.d && o571Var != m471.d) || (!u890.j(str, "artist-id") && !u890.j(str, "track-id") && !u890.j(str, "show-id"))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final boolean L(Map map) {
        if (map.isEmpty()) {
            return true;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((Number) ((Map.Entry) it.next()).getValue()).intValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public static com.spotify.player.model.Context M(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        HubsImmutableComponentBundle hubsImmutableComponentBundleG;
        ArrayList arrayList;
        ArrayList arrayList2;
        HubsImmutableComponentBundle hubsImmutableComponentBundleG2 = hubsImmutableComponentBundle.g("player");
        if (hubsImmutableComponentBundleG2 == null || (hubsImmutableComponentBundleG = hubsImmutableComponentBundleG2.g("context")) == null) {
            return null;
        }
        String str = "uri";
        String str2 = "";
        String strF = hubsImmutableComponentBundleG.F("uri", "");
        String strF2 = hubsImmutableComponentBundleG.F("url", "");
        Map mapK = hyo1.k(hubsImmutableComponentBundleG.g("metadata"));
        HubsImmutableComponentBundle hubsImmutableComponentBundleG3 = hubsImmutableComponentBundleG.g("restrictions");
        Restrictions restrictionsBuild = hubsImmutableComponentBundleG3 == null ? null : Restrictions.builder().disallowPeekingPrevReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_peeking_prev_reasons")).disallowPeekingNextReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_peeking_next_reasons")).disallowSkippingPrevReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_skipping_prev_reasons")).disallowSkippingNextReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_skipping_next_reasons")).disallowPausingReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_pausing_reasons")).disallowResumingReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_resuming_reasons")).disallowTogglingRepeatContextReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_toggling_repeat_context_reasons")).disallowTogglingRepeatTrackReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_toggling_repeat_track_reasons")).disallowTogglingShuffleReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_toggling_shuffle_reasons")).disallowSeekingReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_seeking_reasons")).disallowTransferringPlaybackReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_transferring_playback_reasons")).disallowRemoteControlReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_remote_control_reasons")).disallowInsertingIntoNextTracksReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_inserting_into_next_tracks_reasons")).disallowInsertingIntoContextTracksReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_inserting_into_context_tracks_reasons")).disallowReorderingInNextTracksReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_reordering_in_next_tracks_reasons")).disallowReorderingInContextTracksReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_reordering_in_context_tracks_reasons")).disallowRemovingFromNextTracksReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_removing_from_next_tracks_reasons")).disallowRemovingFromContextTracksReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_removing_from_context_tracks_reasons")).disallowUpdatingContextReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_updating_context_reasons")).disallowSetQueueReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_set_queue_reasons")).disallowAddToQueueReasons(ge70.a(hubsImmutableComponentBundleG3, "disallow_add_to_queue_reasons")).build();
        HubsImmutableComponentBundle[] hubsImmutableComponentBundleArrH = hubsImmutableComponentBundleG.h("pages");
        if (hubsImmutableComponentBundleArrH == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList(hubsImmutableComponentBundleArrH.length);
            int length = hubsImmutableComponentBundleArrH.length;
            int i = 0;
            while (i < length) {
                HubsImmutableComponentBundle hubsImmutableComponentBundle2 = hubsImmutableComponentBundleArrH[i];
                String strF3 = hubsImmutableComponentBundle2.F("page_url", str2);
                String strF4 = hubsImmutableComponentBundle2.F("next_page_url", str2);
                HubsImmutableComponentBundle[] hubsImmutableComponentBundleArrH2 = hubsImmutableComponentBundle2.h("tracks");
                if (hubsImmutableComponentBundleArrH2 == null) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList(hubsImmutableComponentBundleArrH2.length);
                    int length2 = hubsImmutableComponentBundleArrH2.length;
                    int i2 = 0;
                    while (i2 < length2) {
                        int i3 = length2;
                        HubsImmutableComponentBundle hubsImmutableComponentBundle3 = hubsImmutableComponentBundleArrH2[i2];
                        String strF5 = hubsImmutableComponentBundle3.F(str, str2);
                        int i4 = i2;
                        String strF6 = hubsImmutableComponentBundle3.F("uid", str2);
                        String str3 = str;
                        String str4 = strF;
                        String strB = hubsImmutableComponentBundle3.B("album_uri");
                        int i5 = length;
                        int i6 = i;
                        String strB2 = hubsImmutableComponentBundle3.B("artist_uri");
                        Restrictions restrictions = restrictionsBuild;
                        String strF7 = hubsImmutableComponentBundle3.F("provider", str2);
                        gg11 gg11VarK = hyo1.k(hubsImmutableComponentBundle3.g("metadata"));
                        String str5 = str2;
                        h380 h380VarA = j380.a();
                        Map map = mapK;
                        h380VarA.f(gg11VarK.entrySet());
                        if (strB != null && !gg11VarK.containsKey("album_uri")) {
                            h380VarA.e("album_uri", strB);
                        }
                        if (strB2 != null && !gg11VarK.containsKey("artist_uri")) {
                            h380VarA.e("artist_uri", strB2);
                        }
                        arrayList2.add(ContextTrack.builder(strF5).uid(strF6).metadata(h380VarA.b(true)).provider(strF7).build());
                        i2 = i4 + 1;
                        length2 = i3;
                        str = str3;
                        strF = str4;
                        length = i5;
                        i = i6;
                        restrictionsBuild = restrictions;
                        str2 = str5;
                        mapK = map;
                    }
                }
                String str6 = str;
                String str7 = str2;
                String str8 = strF;
                Map map2 = mapK;
                Restrictions restrictions2 = restrictionsBuild;
                int i7 = length;
                int i8 = i;
                ContextPage.Builder builderMetadata = ContextPage.builder().pageUrl(strF3).nextPageUrl(strF4).metadata(hyo1.k(hubsImmutableComponentBundle2.g("metadata")));
                if (arrayList2 != null) {
                    builderMetadata.tracks(arrayList2);
                }
                arrayList3.add(builderMetadata.build());
                i = i8 + 1;
                hubsImmutableComponentBundleArrH = hubsImmutableComponentBundleArrH;
                str = str6;
                strF = str8;
                length = i7;
                restrictionsBuild = restrictions2;
                str2 = str7;
                mapK = map2;
            }
            arrayList = arrayList3;
        }
        Restrictions restrictions3 = restrictionsBuild;
        com.spotify.player.model.Context.Builder builderMetadata2 = com.spotify.player.model.Context.builder(strF).url(strF2).metadata(mapK);
        if (arrayList != null) {
            builderMetadata2.pages(arrayList);
        }
        if (restrictions3 != null) {
            builderMetadata2.restrictions(restrictions3);
        }
        return builderMetadata2.build();
    }

    public static PreparePlayOptions N(HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        HubsImmutableComponentBundle hubsImmutableComponentBundleG;
        SkipToTrack skipToTrackBuild;
        PlayerOptionOverrides playerOptionOverridesBuild;
        String[] strArrH;
        HubsImmutableComponentBundle hubsImmutableComponentBundleG2 = hubsImmutableComponentBundle.g("player");
        Suppressions suppressionsCreate = null;
        if (hubsImmutableComponentBundleG2 == null || (hubsImmutableComponentBundleG = hubsImmutableComponentBundleG2.g("options")) == null) {
            return null;
        }
        HubsImmutableComponentBundle hubsImmutableComponentBundleG3 = hubsImmutableComponentBundleG.g("skip_to");
        if (hubsImmutableComponentBundleG3 == null) {
            skipToTrackBuild = null;
        } else {
            String strB = hubsImmutableComponentBundleG3.B("page_url");
            Long lX = hubsImmutableComponentBundleG3.x("page_index");
            String strB2 = hubsImmutableComponentBundleG3.B("track_uid");
            String strB3 = hubsImmutableComponentBundleG3.B("track_uri");
            Long lX2 = hubsImmutableComponentBundleG3.x("track_index");
            SkipToTrack.Builder builder = SkipToTrack.builder();
            if (strB != null) {
                builder.pageUrl(strB);
            }
            if (lX != null) {
                builder.pageIndex(lX);
            }
            if (strB2 != null) {
                builder.trackUid(strB2);
            }
            if (strB3 != null) {
                builder.trackUri(strB3);
            }
            if (lX2 != null) {
                builder.trackIndex(lX2);
            }
            skipToTrackBuild = builder.build();
        }
        Long lX3 = hubsImmutableComponentBundleG.x("seek_to");
        Boolean boolA = hubsImmutableComponentBundleG.a("initially_paused");
        HubsImmutableComponentBundle hubsImmutableComponentBundleG4 = hubsImmutableComponentBundleG.g("player_options_override");
        if (hubsImmutableComponentBundleG4 == null) {
            playerOptionOverridesBuild = null;
        } else {
            Boolean boolA2 = hubsImmutableComponentBundleG4.a("shuffling_context");
            Boolean boolA3 = hubsImmutableComponentBundleG4.a("repeating_context");
            Boolean boolA4 = hubsImmutableComponentBundleG4.a("repeating_track");
            PlayerOptionOverrides.Builder builder2 = PlayerOptionOverrides.builder();
            if (boolA2 != null) {
                builder2.shufflingContext(boolA2);
            }
            if (boolA3 != null) {
                builder2.repeatingContext(boolA3);
            }
            if (boolA4 != null) {
                builder2.repeatingTrack(boolA4);
            }
            playerOptionOverridesBuild = builder2.build();
        }
        HubsImmutableComponentBundle hubsImmutableComponentBundleG5 = hubsImmutableComponentBundleG.g("suppressions");
        if (hubsImmutableComponentBundleG5 != null && (strArrH = hubsImmutableComponentBundleG5.H("providers")) != null) {
            suppressionsCreate = Suppressions.create(t380.q(strArrH));
        }
        PreparePlayOptions.Builder builder3 = PreparePlayOptions.builder();
        if (lX3 != null) {
            builder3.seekTo(lX3);
        }
        if (boolA != null) {
            builder3.initiallyPaused(boolA.booleanValue());
        }
        if (playerOptionOverridesBuild != null) {
            builder3.playerOptionsOverride(playerOptionOverridesBuild);
        }
        if (suppressionsCreate != null) {
            builder3.suppressions(suppressionsCreate);
        }
        if (skipToTrackBuild != null) {
            builder3.skipTo(skipToTrackBuild);
        }
        return builder3.build();
    }

    public static boolean O(x34 x34Var) {
        return x34Var.b();
    }

    public static void P(mhl mhlVar, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + mhlVar.b;
        try {
            int iC = l1d.C(mhlVar.c);
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z = true;
            switch (iC) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((F((int) (fArr[3] * 255.0f)) << 24) | (F((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (F((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | F((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iF = (F((int) (fArr[3] * 255.0f)) << 24) | (F((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (F((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | F((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iF);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + mhlVar.b);
                case 5:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z));
                    return;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException unused) {
            bmq0.z(view);
        } catch (NoSuchMethodException unused2) {
            bmq0.z(view);
        } catch (InvocationTargetException unused3) {
            bmq0.z(view);
        }
    }

    public static final long Q(long j, long j2, long j3, String str) {
        String property;
        int i = ped1.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lD0 = nhc1.d0(10, property);
        if (lD0 == null) {
            tw20.u("System property '", str, "' has unrecognized value '", property);
            return 0L;
        }
        long jLongValue = lD0.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final o571 R(k471 k471Var) {
        switch (k471Var.ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return m471.d;
            case 1:
                return p471.d;
            case 2:
                return l571.d;
            case 3:
                return e571.d;
            case 4:
                return w471.d;
            case 5:
                return u471.d;
            case 6:
                return f571.d;
            case 7:
                return n571.d;
            case 8:
                return s471.d;
            case 9:
                return r471.d;
            case 10:
                return q471.d;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return x471.d;
            case grn1.d /* 12 */:
                return z471.d;
            case 13:
                return i571.d;
            case 14:
                return j571.d;
            case 15:
                return g571.d;
            case 16:
                return c571.d;
            case 17:
                return m571.d;
            case 18:
                return h571.d;
            case 19:
                return y471.d;
            default:
                eg.o();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    public static final String S(nfm1 nfm1Var, o571 o571Var) {
        String strG;
        if (o571Var != e571.d && o571Var != m471.d) {
            String str = nfm1Var.b.b;
            return str == null ? nfm1Var.a : str;
        }
        Map map = nfm1Var.b.c;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            int iHashCode = str2.hashCode();
            if (iHashCode != 574471521) {
                if (iHashCode != 1270430941) {
                    if (iHashCode == 2067242475 && str2.equals("show-id")) {
                        strG = gvg.g(entry.getValue(), "spotify:show:");
                    } else {
                        strG = null;
                    }
                } else if (str2.equals("track-id")) {
                    strG = gvg.g(entry.getValue(), "spotify:track:");
                } else {
                    strG = null;
                }
            } else if (str2.equals("artist-id")) {
                strG = gvg.g(entry.getValue(), "spotify:artist:");
            } else {
                strG = null;
            }
            arrayList.add(strG);
        }
        String str3 = (String) o7h.s0(o7h.o0(arrayList));
        return (str3 == null && (str3 = nfm1Var.b.b) == null) ? nfm1Var.a : str3;
    }

    public static final lv01 T(zu01 zu01Var) {
        int iIntValue;
        lsg lsgVar = zu01Var.g;
        if (lsgVar != null) {
            iIntValue = ((Number) lsgVar.n()).intValue();
        } else {
            Logger.d("Requested range was null!", new Object[0]);
            iIntValue = 15;
        }
        int i = iIntValue;
        m9m m9mVar = zu01Var.e;
        return new lv01(i, zu01Var.d, m9mVar, zu01Var.f, zu01Var.i, zu01Var.k, 32);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(lj8 lj8Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        boolean z = lj8Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(543116180);
        int i2 = (x340Var.g(lj8Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            switch (lj8Var.a.ordinal()) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    x340Var.i0(-2051339674);
                    y(i2 & 1008, function0, x340Var, qim0Var, z);
                    x340Var.r(false);
                    break;
                case 1:
                    x340Var.i0(-2051350903);
                    k(i2 & 1008, function0, x340Var, qim0Var, z);
                    x340Var.r(false);
                    break;
                case 2:
                    x340Var.i0(-2051354937);
                    n(i2 & 1008, function0, x340Var, qim0Var, z);
                    x340Var.r(false);
                    break;
                case 3:
                    x340Var.i0(-2051324153);
                    w((i2 >> 3) & 126, function0, x340Var, qim0Var);
                    x340Var.r(false);
                    break;
                case 4:
                    x340Var.i0(-2051321176);
                    x(i2 & 1008, function0, x340Var, qim0Var, z);
                    x340Var.r(false);
                    break;
                case 5:
                    x340Var.i0(-2051346906);
                    d(i2 & 1008, function0, x340Var, qim0Var, z);
                    x340Var.r(false);
                    break;
                case 6:
                    x340Var.i0(-2051342934);
                    c((i2 >> 3) & 126, 4, function0, x340Var, qim0Var, false);
                    x340Var.r(false);
                    break;
                case 7:
                    x340Var.i0(-2051335541);
                    f(i2 & 1008, function0, x340Var, qim0Var, z);
                    x340Var.r(false);
                    break;
                case 8:
                    x340Var.i0(-2051331020);
                    h((i2 >> 3) & 126, function0, x340Var, qim0Var);
                    x340Var.r(false);
                    break;
                case 9:
                    x340Var.i0(-2051327245);
                    g((i2 >> 3) & 126, function0, x340Var, qim0Var);
                    x340Var.r(false);
                    break;
                default:
                    throw p3d1.k(x340Var, -2051355706, false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zt6(lj8Var, function0, qim0Var, i, (byte) 8);
        }
    }

    public static final void b(Function0 function0, y7e1 y7e1Var, y7e1 y7e1Var2, b0k b0kVar, int i) {
        y7e1 y7e1Var3;
        y7e1 y7e1Var4;
        y7e1 y7e1VarD;
        y7e1 y7e1VarD2;
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1884925667);
        int i3 = i | (x340Var.i(function0) ? 4 : 2) | 144;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                y7e1VarD = c4p1.D(0, 3, null, x340Var);
                y7e1VarD2 = c4p1.D(0, 3, null, x340Var);
                i2 = i3 & (-1009);
            } else {
                x340Var.b0();
                i2 = i3 & (-1009);
                y7e1VarD = y7e1Var;
                y7e1VarD2 = y7e1Var2;
            }
            x340Var.s();
            int i4 = i2;
            scx scxVarM = pno1.m(x340Var);
            k6a1 k6a1Var = (k6a1) x340Var.k(t4k.q);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(x340Var);
            }
            lz20 lz20Var = (lz20) objT;
            boolean zG = x340Var.g(y7e1VarD) | x340Var.g(y7e1VarD2);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = yv91.a(new ame(y7e1VarD, y7e1VarD2, (byte) 12));
                x340Var.s0(objT2);
            }
            tob1 tob1Var = (tob1) objT2;
            boolean zI = x340Var.i(k6a1Var) | x340Var.i(scxVarM);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new ame(k6a1Var, scxVarM, (byte) 13);
                x340Var.s0(objT3);
            }
            y7e1 y7e1Var5 = y7e1VarD2;
            y7e1 y7e1Var6 = y7e1VarD;
            x74.f(function0, scxVarM, (mfx) null, false, false, 0.0f, true, Boolean.TRUE, false, false, (vu30) null, apo.r(-483252476, new jb1((Object) lz20Var, objT3, (Object) tob1Var, (Object) y7e1Var6, (Object) y7e1Var5, (byte) 7), x340Var), x340Var, (i4 & 14) | 14155776, 48, 1852);
            y7e1Var3 = y7e1Var6;
            y7e1Var4 = y7e1Var5;
        } else {
            x340Var.b0();
            y7e1Var3 = y7e1Var;
            y7e1Var4 = y7e1Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swc(function0, y7e1Var3, y7e1Var4, i, (byte) 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final void c(int i, int i2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i3;
        boolean z2;
        boolean z3;
        b0k b0kVar2;
        boolean z4;
        h311 h311VarV;
        boolean z5;
        boolean z6;
        Object objT;
        jax haxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1567707192);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= b0kVar3.h(z2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (b0kVar3.Y(i3 & 1, z3)) {
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                z6 = (i3 & 14) == 4;
                objT = b0kVar3.T();
                if (z6 || objT == fkj0.X) {
                    objT = new lj2(function0, (byte) 21);
                    b0kVar3.s0(objT);
                }
                gbx gbxVar = new gbx(z50.c, (Function0) objT);
                idx idxVar = new idx(4);
                if (z5) {
                    b0kVar3.i0(-90273452);
                    b0kVar3.r(false);
                    haxVar = jax.a;
                } else {
                    b0kVar3.i0(-90226797);
                    haxVar = new hax(cwl1.o0(b0kVar3, 2131954985));
                    b0kVar3.r(false);
                }
                b0kVar2 = b0kVar3;
                foo1.c(gbxVar, idxVar, u291.f(qim0Var, 1.0f), haxVar, null, null, null, null, null, null, d8i.d, b0kVar2, 0, 48, 2024);
                z4 = z5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z4 = z2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new nj8(function0, qim0Var, z4, i, i2, (byte) 0);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b0kVar3.Y(i3 & 1, z3)) {
            if (i4 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if ((i3 & 14) == 4) {
            }
            objT = b0kVar3.T();
            if (z6) {
                objT = new lj2(function0, (byte) 21);
                b0kVar3.s0(objT);
            } else {
                objT = new lj2(function0, (byte) 21);
                b0kVar3.s0(objT);
            }
            gbx gbxVar2 = new gbx(z50.c, (Function0) objT);
            idx idxVar2 = new idx(4);
            if (z5) {
                b0kVar3.i0(-90273452);
                b0kVar3.r(false);
                haxVar = jax.a;
            } else {
                b0kVar3.i0(-90226797);
                haxVar = new hax(cwl1.o0(b0kVar3, 2131954985));
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar2, idxVar2, u291.f(qim0Var, 1.0f), haxVar, null, null, null, null, null, null, d8i.d, b0kVar2, 0, 48, 2024);
            z4 = z5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z4 = z2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nj8(function0, qim0Var, z4, i, i2, (byte) 0);
        }
    }

    public static final void d(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        qim0 qim0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1042859609);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= b0kVar3.i(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new lj2(function0, (byte) 22);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(z50.c, (Function0) objT), z ? new idx(4) : jdx.c, qim0Var2, null, null, null, null, null, d8i.g, d8i.h, d8i.i, b0kVar2, (i2 & 896) | 805306368, 54, 504);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oj8(z, function0, qim0Var, i, (byte) 0);
        }
    }

    public static final void e(y7e1 y7e1Var, String str, int i, qim0 qim0Var, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1985088181);
        int i3 = i2 | (x340Var.i(y7e1Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.e(i) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(str, null, cbx.d(x340Var).k, 0L, null, null, 0, false, null, 0, null, x340Var, (i3 >> 3) & 14, 0, 2042);
            fyx fyxVar = new fyx(new zxx(cbx.a(x340Var).b.a, cbx.a(x340Var).b.b, cbx.a(x340Var).b.b, cbx.a(x340Var).b.d, cbx.a(x340Var).a.b.c(), cbx.a(x340Var).a.b.a(), cbx.a(x340Var).b.c, 0L, 896));
            String strO0 = cwl1.o0(x340Var, 2131953853);
            kua0 kua0Var = new kua0(0, (Boolean) null, 6, i, 115);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            boolean z = (i3 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new irf(str, (byte) 2);
                x340Var.s0(objT);
            }
            rwo1.a(y7e1Var, fyxVar, s161.b(qim0VarF, false, (iu30) objT), null, strO0, null, null, false, null, null, kua0Var, null, d6e1.b, null, null, null, null, null, 0.0f, false, x340Var, i3 & 14, 0, 0, 2086888);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r27(y7e1Var, str, i, qim0Var, i2);
        }
    }

    public static final void f(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        qim0 qim0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(452103942);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= b0kVar3.i(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new lj2(function0, (byte) 23);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(z50.c, (Function0) objT), z ? new idx(4) : jdx.c, qim0Var2, null, null, null, null, null, null, null, d8i.l, b0kVar2, i2 & 896, 48, 2040);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oj8(z, function0, qim0Var, i, (byte) 1);
        }
    }

    public static final void g(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1201013218);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new lj2(function0, (byte) 24);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(4), qim0Var, null, null, null, null, null, null, null, d8i.n, x340Var, (i2 << 3) & 896, 48, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var, i, (byte) 2);
        }
    }

    public static final void h(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1573356384);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new lj2(function0, (byte) 25);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(4), qim0Var, null, null, null, null, null, null, null, d8i.m, x340Var, (i2 << 3) & 896, 48, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var, i, (byte) 3);
        }
    }

    public static final void i(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2889542);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131958577);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            long j = cbx.a(x340Var).b.b;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.x(qim0VarF, 16.0f), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry90(i, (byte) 21);
        }
    }

    public static final void j(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1386204819);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131958576);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            long j = cbx.a(x340Var).b.b;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.x(qim0VarF, 16.0f), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry90(i, (byte) 22);
        }
    }

    public static final void k(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        qim0 qim0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(255948831);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= b0kVar3.i(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new lj2(function0, (byte) 26);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(z50.c, (Function0) objT), z ? uj8.b : jdx.c, qim0Var2, null, null, null, null, null, apo.r(-697609297, new dr0((byte) 2, z), b0kVar3), d8i.e, d8i.f, b0kVar2, (i2 & 896) | 805306368, 54, 504);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oj8(z, function0, qim0Var, i, (byte) 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void l(String str, fyo1 fyo1Var, boolean z, float f, gbx gbxVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var;
        qim0 qim0Var2;
        boolean z2;
        int i2;
        int i3;
        long j;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2060360442);
        int i4 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(fyo1Var) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128) | (x340Var2.d(f) ? 2048 : 1024) | (x340Var2.g(gbxVar) ? 16384 : 8192) | (x340Var2.i(function0) ? 131072 : 65536) | 1572864;
        if (x340Var2.Y(i4 & 1, (599187 & i4) != 599186)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            cr31 cr31VarB = er31.b(16.0f);
            dx10 dx10Var = dx10.c;
            boolean zEquals = fyo1Var.equals(dx10Var);
            zw10 zw10Var = zw10.c;
            boolean z3 = zEquals || fyo1Var.equals(zw10Var);
            boolean z4 = fyo1Var instanceof bx10;
            boolean zEquals2 = fyo1Var.equals(dx10Var);
            ex10 ex10Var = ex10.c;
            cx10 cx10Var = cx10.c;
            if (zEquals2) {
                z2 = true;
            } else if (fyo1Var.equals(ex10Var) || fyo1Var.equals(cx10Var)) {
                z2 = false;
            } else {
                if (!z4) {
                    eg.o();
                    return;
                }
                z2 = true;
            }
            boolean z5 = fyo1Var.equals(ex10Var) || fyo1Var.equals(cx10Var);
            if (fyo1Var.equals(dx10Var)) {
                i2 = -26431196;
                i3 = 2131958866;
            } else if (fyo1Var.equals(ex10Var)) {
                i2 = -26427487;
                i3 = 2131958869;
            } else {
                if (!fyo1Var.equals(cx10Var) && !fyo1Var.equals(zw10Var) && !fyo1Var.equals(ax10.c)) {
                    throw p3d1.k(x340Var2, -26433129, false);
                }
                i2 = -26420921;
                i3 = 2131958867;
            }
            String strK = x0d.k(x340Var2, i2, i3, x340Var2, false);
            hax haxVar = z5 ? new hax(strK) : jax.a;
            if (z3) {
                x340Var2.i0(-26412238);
                j = cbx.a(x340Var2).b.c;
                x340Var2.r(false);
            } else {
                x340Var2.i0(-26411471);
                x340Var2.r(false);
                j = u7h.j;
            }
            tob1 tob1VarA = w191.a(j, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6), "borderColor", x340Var2, 432, 8);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            avw0 avw0Var = cbx.b(x340Var2).c;
            qim0 qim0VarN = anm1.N("feedback_option_row", d1u.E(2.0f, ((u7h) tob1VarA.getValue()).a, qim0VarF, cr31VarB));
            ogx ogxVar = ogx.e;
            cvx cvxVar = cbx.b(x340Var2).b;
            cwl1.b(qim0VarN, (tl3) null, cr31VarB, ogxVar, new zzq0(16.0f, 16.0f, 16.0f, 16.0f), haxVar, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(-1656947651, new ix10(z, z2, f, function0, z4, str, strK, fyo1Var, gbxVar), x340Var2), x340Var2, ((i4 << 15) & 1879048192) | 3072, 48, 1474);
            x340Var = x340Var2;
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mt9(str, fyo1Var, z, f, gbxVar, function0, qim0Var2, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:56:0x0114  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    /* JADX WARN: Code duplicated, block: B:61:0x0125  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Code duplicated, block: B:69:0x014f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0187  */
    /* JADX WARN: Code duplicated, block: B:76:0x018b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0197  */
    /* JADX WARN: Code duplicated, block: B:82:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void m(hx10 hx10Var, iu30 iu30Var, qim0 qim0Var, iu30 iu30Var2, b0k b0kVar, int i, int i2) throws NoWhenBranchMatchedException {
        iu30 iu30Var3;
        boolean z;
        boolean z2;
        iu30 iu30Var4;
        qim0 qim0Var2;
        h311 h311VarV;
        mbh mbhVarA;
        qim0 qim0Var3;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        int i3;
        int i4;
        qim0 qim0Var4;
        boolean z3;
        boolean zE;
        Object objT;
        boolean z4;
        boolean zE2;
        Object objT2;
        Object objT3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1856678900);
        int i5 = (i & 6) == 0 ? (x340Var.g(hx10Var) ? 4 : 2) | i : i;
        int i6 = 32;
        if ((i & 48) == 0) {
            i5 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i7 = i5 | 384;
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                iu30Var3 = iu30Var2;
                i7 |= x340Var.i(iu30Var3) ? 2048 : 1024;
            }
            z = false;
            if ((i7 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i7 & 1, z2)) {
                if (i8 != 0) {
                    objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = zs10.O0;
                        x340Var.s0(objT3);
                    }
                    iu30Var3 = (iu30) objT3;
                }
                qim0 qim0Var5 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var5, 1.0f);
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                qim0Var3 = qim0Var5;
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarF);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                x340Var.i0(-2118679545);
                i3 = 0;
                for (Object obj : hx10Var.a) {
                    i4 = i3 + 1;
                    if (i3 >= 0) {
                        p7h.T();
                        throw null;
                    }
                    gx10 gx10Var = (gx10) obj;
                    if (i3 > 0) {
                        x340Var.i0(739422107);
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var).b;
                        qim0Var4 = qim0Var3;
                        x0d.s(qim0Var4, 8.0f, x340Var, z);
                    } else {
                        qim0Var4 = qim0Var3;
                        x340Var.i0(739497065);
                        x340Var.r(z);
                    }
                    String str = gx10Var.a;
                    fyo1 fyo1Var = gx10Var.b;
                    boolean z5 = gx10Var.c;
                    float f = gx10Var.d;
                    if ((i7 & 112) == i6) {
                        z3 = true;
                    } else {
                        z3 = z;
                    }
                    zE = z3 | x340Var.e(i3);
                    objT = x340Var.T();
                    if (zE || objT == m4cVar) {
                        objT = new ck0(iu30Var, i3, (byte) 8);
                        x340Var.s0(objT);
                    }
                    gbx gbxVar = new gbx(z50.c, (Function0) objT);
                    if ((i7 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zE2 = z4 | x340Var.e(i3);
                    objT2 = x340Var.T();
                    if (zE2 || objT2 == m4cVar) {
                        objT2 = new ck0(iu30Var3, i3, (byte) 9);
                        x340Var.s0(objT2);
                    }
                    l(str, fyo1Var, z5, f, gbxVar, (Function0) objT2, null, x340Var, 0);
                    z = false;
                    qim0Var3 = qim0Var4;
                    i3 = i4;
                    m4cVar = m4cVar;
                    i6 = 32;
                }
                x340Var.r(z);
                x340Var.r(true);
                iu30Var4 = iu30Var3;
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                iu30Var4 = iu30Var3;
                qim0Var2 = qim0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nj2((Object) hx10Var, (Object) iu30Var, qim0Var2, (Object) iu30Var4, i, i2, (byte) 13);
            }
        }
        i7 = i5 | 3456;
        iu30Var3 = iu30Var2;
        z = false;
        if ((i7 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i7 & 1, z2)) {
            if (i8 != 0) {
                objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = zs10.O0;
                    x340Var.s0(objT3);
                }
                iu30Var3 = (iu30) objT3;
            }
            qim0 qim0Var6 = nim0.a;
            qim0 qim0VarF2 = u291.f(qim0Var6, 1.0f);
            mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            qim0Var3 = qim0Var6;
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarF2);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            x340Var.i0(-2118679545);
            i3 = 0;
            while (r17.hasNext()) {
                i4 = i3 + 1;
                if (i3 >= 0) {
                    p7h.T();
                    throw null;
                }
                gx10 gx10Var2 = (gx10) obj;
                if (i3 > 0) {
                    x340Var.i0(739422107);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    qim0Var4 = qim0Var3;
                    x0d.s(qim0Var4, 8.0f, x340Var, z);
                } else {
                    qim0Var4 = qim0Var3;
                    x340Var.i0(739497065);
                    x340Var.r(z);
                }
                String str2 = gx10Var2.a;
                fyo1 fyo1Var2 = gx10Var2.b;
                boolean z6 = gx10Var2.c;
                float f2 = gx10Var2.d;
                if ((i7 & 112) == i6) {
                    z3 = true;
                } else {
                    z3 = z;
                }
                zE = z3 | x340Var.e(i3);
                objT = x340Var.T();
                if (zE) {
                    objT = new ck0(iu30Var, i3, (byte) 8);
                    x340Var.s0(objT);
                } else {
                    objT = new ck0(iu30Var, i3, (byte) 8);
                    x340Var.s0(objT);
                }
                gbx gbxVar2 = new gbx(z50.c, (Function0) objT);
                if ((i7 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zE2 = z4 | x340Var.e(i3);
                objT2 = x340Var.T();
                if (zE2) {
                    objT2 = new ck0(iu30Var3, i3, (byte) 9);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new ck0(iu30Var3, i3, (byte) 9);
                    x340Var.s0(objT2);
                }
                l(str2, fyo1Var2, z6, f2, gbxVar2, (Function0) objT2, null, x340Var, 0);
                z = false;
                qim0Var3 = qim0Var4;
                i3 = i4;
                m4cVar = m4cVar;
                i6 = 32;
            }
            x340Var.r(z);
            x340Var.r(true);
            iu30Var4 = iu30Var3;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            iu30Var4 = iu30Var3;
            qim0Var2 = qim0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nj2((Object) hx10Var, (Object) iu30Var, qim0Var2, (Object) iu30Var4, i, i2, (byte) 13);
        }
    }

    public static final void n(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(654008082);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new lj2(function0, (byte) 27);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(z50.c, (Function0) objT), z ? uj8.a : jdx.c, qim0Var, null, null, null, null, null, d8i.a, d8i.b, d8i.c, b0kVar2, (i2 & 896) | 805306368, 54, 504);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oj8(z, function0, qim0Var, i, (byte) 3);
        }
    }

    public static final void o(evi1 evi1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(81422706);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(evi1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(4.0f, true, new um5(false));
            qim0 qim0VarY = uyn1.y(dug.f(u291.f(nim0.a, 1.0f), cbx.a(x340Var).a.a.c(), er31.b(8.0f)), 12.0f, 10.0f);
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var, 0);
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
            String str = evi1Var.b;
            String str2 = evi1Var.f;
            hyo1.g(0, str, evi1Var.c, x340Var, null);
            boolean zG = x340Var.g(str2);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = gf5.a(str2, new ceg1(iu30Var, (byte) 7));
                x340Var.s0(objT);
            }
            uwo1.d((af5) objT, cbx.a(x340Var).b.b, null, cbx.d(x340Var).j, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4084);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(evi1Var, iu30Var, i, (byte) 21);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void p(rcj0 rcj0Var, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-976287023);
        int i2 = (x340Var.e(rcj0Var.ordinal()) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = rcj0Var.ordinal();
            jax jaxVar = jax.a;
            z50 z50Var = z50.c;
            if (iOrdinal == 0) {
                x340Var.i0(951963558);
                boolean z = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z || objT == m4cVar) {
                    objT = new tze0(function0, (byte) 27);
                    x340Var.s0(objT);
                }
                foo1.c(new gbx(z50Var, (Function0) objT), new idx(8), null, jaxVar, yla.s(x340Var), null, null, null, null, null, a1j.c, x340Var, 24576, 48, 1996);
                x340Var.r(false);
            } else if (iOrdinal == 1) {
                x340Var.i0(952356545);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = z7i0.O0;
                    x340Var.s0(objT2);
                }
                foo1.c(new gbx(z50Var, (Function0) objT2), new idx(8), null, jaxVar, yla.s(x340Var), null, null, null, null, null, a1j.d, x340Var, 24576, 48, 1996);
                x340Var.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw p3d1.k(x340Var, -1908954923, false);
                }
                x340Var.i0(952725507);
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = z7i0.P0;
                    x340Var.s0(objT3);
                }
                foo1.c(new gbx(z50Var, (Function0) objT3), new idx(8), null, new hax(cwl1.o0(x340Var, 2131958575)), yla.s(x340Var), null, null, null, null, null, a1j.e, x340Var, 0, 48, 1996);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new loi0(rcj0Var, function0, i, (byte) 3);
        }
    }

    public static final void q(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-615651874);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131958581);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new edi0(iu30Var, (byte) 22);
                x340Var.s0(objT);
            }
            v8r.e(strO0, true, "", (Function0) objT, (qim0) null, (String) null, x340Var, 432, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 25, i, iu30Var, false);
        }
    }

    public static final void r(scj0 scj0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        c380 c380Var = scj0Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1479577293);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(scj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (c380Var.isEmpty()) {
                x340Var.i0(1162431407);
                x340Var.r(false);
            } else {
                x340Var.i0(1162333385);
                String str = scj0Var.d;
                boolean z = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = new mhg0(iu30Var, (byte) 28);
                    x340Var.s0(objT);
                }
                B(0, str, x340Var, (iu30) objT);
                x340Var.r(false);
            }
            q(iu30Var, x340Var, (i2 >> 3) & 14);
            if (c380Var.isEmpty()) {
                x340Var.i0(1162679407);
                x340Var.r(false);
            } else {
                x340Var.i0(1162518920);
                if (scj0Var.c.isEmpty()) {
                    x340Var.i0(1162561359);
                    i(x340Var, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1162600481);
                    C(scj0Var, iu30Var, x340Var, i2 & 126);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pbj0(scj0Var, iu30Var, i, (byte) 0);
        }
    }

    public static final void s(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-45147615);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, cbx.b(x340Var).b.c, 0.0f, 0.0f, 13);
            gfh0 gfh0VarC = t1c.c(een.e, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            xto1.e(null, 5, 0L, 0L, x340Var, 48, 13);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry90(i, (byte) 23);
        }
    }

    public static final void t(w4i1 w4i1Var, b0k b0kVar, int i) {
        byte b2;
        int i2;
        w4i1 w4i1Var2 = w4i1Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(238496555);
        int i3 = i | (b0kVar2.g(w4i1Var2) ? 4 : 2);
        if (b0kVar2.Y(i3 & 1, (i3 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(b0kVar2).a.a.a();
            zsc zscVar = zex.a;
            List listM = p7h.M(new u7h[]{new u7h(((vex) zscVar.b).n), new u7h(z4p1.g(4280267377L))});
            List listM2 = p7h.M(new u7h[]{new u7h(((xex) ((gmt) zscVar.c).b).C), new u7h(z4p1.g(4287168368L))});
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(nim0Var, 88.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarR);
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
            nko1.H(gfh0VarC, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            qim0 qim0VarC = eqr0.C(u291.r(nim0Var, 59.0f), 29.0f, 0.0f);
            boolean zG = b0kVar2.g(listM2) | b0kVar2.g(listM);
            Object objT = b0kVar2.T();
            if (zG || objT == m4cVar) {
                objT = new uah0(listM2, listM, (byte) 16);
                b0kVar2.s0(objT);
            }
            j0o1.b(6, b0kVar2, (iu30) objT, qim0VarC);
            cwl1.f(i3o1.n(2131233223, b0kVar2, 0), (String) null, eqr0.C(u291.r(nim0Var, 45.0f), 36.0f, 6.0f), (tl3) null, (j6m) null, 0.0f, (ColorFilter) null, b0kVar2, 440, 120);
            qim0 qim0VarC2 = eqr0.C(u291.r(nim0Var, 59.0f), 0.0f, 29.0f);
            boolean zF = b0kVar2.f(jA) | b0kVar2.g(listM);
            Object objT2 = b0kVar2.T();
            if (zF || objT2 == m4cVar) {
                i2 = 6;
                objT2 = new n82(jA, listM, (byte) 6);
                b0kVar2.s0(objT2);
            } else {
                i2 = 6;
            }
            j0o1.b(i2, b0kVar2, (iu30) objT2, qim0VarC2);
            w4i1Var2 = w4i1Var;
            String str = w4i1Var2.c;
            Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
            uri.getClass();
            b0kVar2 = b0kVar2;
            b2 = 0;
            bmq0.a(uri, eqr0.C(u291.r(nim0Var, 46.0f), 6.5f, 35.5f), hcx.d, w4i1Var2.a, w4i1Var2.b, bro1.q(w4i1Var2.d), 0L, false, b0kVar2, 432, 192);
            b0kVar2.r(true);
        } else {
            b2 = 0;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qbj0(w4i1Var2, i, b2);
        }
    }

    public static final void u(w4i1 w4i1Var, b0k b0kVar, int i) {
        byte b2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(552609251);
        int i2 = (x340Var.g(w4i1Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, 16.0f, 5);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
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
            Parcelable.Creator creator = w4i1.CREATOR;
            t(w4i1Var, x340Var, i2 & 14);
            String strO0 = cwl1.o0(x340Var, 2131958584);
            lee1 lee1Var = cbx.d(x340Var).e;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar4 = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            String strO1 = cwl1.o0(x340Var, 2131958582);
            lee1 lee1Var2 = cbx.d(x340Var).j;
            long j2 = cbx.a(x340Var).b.b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            uwo1.e(strO1, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), lee1Var2, j2, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            b2 = 1;
            x340Var.r(true);
        } else {
            b2 = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qbj0(w4i1Var, i, b2);
        }
    }

    public static final void v(scj0 scj0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(252390043);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(scj0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            i6o0 i6o0VarQ = k1o1.q(x340Var);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarL = bmq0.L(u291.c(qim0Var3, 1.0f), i6o0VarQ, (g6o0) null);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarL);
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
            w4i1 w4i1Var = scj0Var.a;
            Parcelable.Creator creator = w4i1.CREATOR;
            u(w4i1Var, x340Var, 0);
            int iC = l1d.C(scj0Var.f);
            if (iC == 0) {
                x340Var.i0(2059152447);
                s(x340Var, 0);
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var.i0(2059157002);
                r(scj0Var, iu30Var, x340Var, i3 & 126);
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, 2059151211, false);
                }
                x340Var.i0(-590744831);
                q(iu30Var, x340Var, (i3 >> 3) & 14);
                j(x340Var, 0);
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
            h311VarV.d = new vqd0((Object) scj0Var, (Object) iu30Var, (Object) qim0Var2, i, (byte) 23);
        }
    }

    public static final void w(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1616584817);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new lj2(function0, (byte) 28);
                x340Var.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), jdx.c, qim0Var, null, null, null, null, null, d8i.o, d8i.p, d8i.q, x340Var, 805306368 | ((i2 << 3) & 896), 54, 504);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var, i, (byte) 4);
        }
    }

    public static final void x(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        qim0 qim0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(303600363);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= b0kVar3.i(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new lj2(function0, (byte) 29);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(z50.c, (Function0) objT), z ? new idx(4) : jdx.c, qim0Var2, null, null, null, null, null, d8i.r, d8i.s, d8i.t, b0kVar2, (i2 & 896) | 805306368, 54, 504);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oj8(z, function0, qim0Var, i, (byte) 4);
        }
    }

    public static final void y(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        qim0 qim0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1364367403);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= b0kVar3.i(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new pj8(function0, (byte) 0);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(z50.c, (Function0) objT), z ? new idx(4) : jdx.c, qim0Var2, null, null, null, null, null, apo.r(756082331, new dr0((byte) 3, z), b0kVar3), d8i.j, d8i.k, b0kVar2, (i2 & 896) | 805306368, 54, 504);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oj8(z, function0, qim0Var, i, (byte) 5);
        }
    }

    public static final void z(lbt0 lbt0Var, iu30 iu30Var, wpv0 wpv0Var, xfx xfxVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-868806476);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(lbt0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(wpv0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(xfxVar) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            irn1.u(null, w7j.a, null, null, apo.r(-776993811, new c9y(lbt0Var, iu30Var, wpv0Var, xfxVar), x340Var), x340Var, 24624, 13);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(lbt0Var, iu30Var, wpv0Var, xfxVar, qim0Var2, i, (byte) 15);
        }
    }
}
