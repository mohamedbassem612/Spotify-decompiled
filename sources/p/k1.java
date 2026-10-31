package p;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import io.reactivex.rxjava3.core.Observable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k1 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    private final Object e(Object obj) {
        Serializable serializableY;
        hot0 hot0Var = (hot0) this.c;
        iot0 iot0Var = (iot0) this.d;
        got0 got0Var = (got0) this.e;
        tqw tqwVar = (tqw) this.b;
        hm5.M(obj);
        if (!u890.j(got0Var, got0.a)) {
            eg.o();
            return null;
        }
        v6y0 v6y0Var = iot0Var.b;
        if (v6y0Var != null) {
            if (iot0Var.c) {
                v6y0Var = null;
            }
            if (v6y0Var != null) {
                lot0 lot0Var = (lot0) this.f;
                boolean z = v6y0Var.c;
                boolean z2 = !z;
                u6y0 u6y0Var = lot0Var.a.t;
                String str = hot0Var.a;
                if (tqwVar == null) {
                    serializableY = null;
                } else {
                    if (z) {
                        tqwVar = null;
                    }
                    if (tqwVar != null) {
                        serializableY = n3o1.y(tqwVar);
                    } else {
                        serializableY = null;
                    }
                }
                fn31.T(u6y0Var.Y, (o8n) null, 0, new du2(u6y0Var, str, z2, serializableY, (lnm) null, (byte) 11), 3);
            }
        }
        return rih1.a;
    }

    private final Object g(Object obj) {
        vtt0 vtt0Var;
        xtt0 xtt0Var = (xtt0) this.c;
        Boolean bool = (Boolean) this.d;
        Set set = (Set) this.e;
        Map map = (Map) this.b;
        hm5.M(obj);
        Map map2 = xtt0Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map2.size()));
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            ytt0 ytt0Var = (ytt0) entry.getValue();
            Boolean bool2 = (Boolean) xtt0Var.b.get(str);
            boolean zContains = set.contains(str);
            PlayabilityRestriction playabilityRestriction = ytt0Var.a;
            bool.getClass();
            boolean zBooleanValue = bool.booleanValue();
            if (u890.j(bool2, Boolean.TRUE)) {
                vtt0Var = new vtt0(ttt0.e);
            } else {
                int i = playabilityRestriction == null ? -1 : ztt0.a[playabilityRestriction.ordinal()];
                vtt0 vtt0Var2 = utt0.a;
                ttt0 ttt0Var = ttt0.f;
                switch (i) {
                    case SplitInstallErrorCode.ACTIVE_SESSIONS_LIMIT_EXCEEDED /* -1 */:
                        vtt0Var = new vtt0(ttt0Var);
                        continue;
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    default:
                        eg.o();
                        return null;
                    case 1:
                        break;
                    case 2:
                        vtt0Var = new vtt0(ttt0.d);
                        continue;
                    case 3:
                        if (!zContains) {
                            if (new y6b1(str, false).c == v6b1.t && zBooleanValue) {
                                vtt0Var = new vtt0(ttt0.b);
                                continue;
                            } else {
                                vtt0Var = new vtt0(ttt0.a);
                            }
                            break;
                        }
                        break;
                    case 4:
                        vtt0Var = new vtt0(ttt0.c);
                        continue;
                    case 5:
                    case 6:
                    case 7:
                        vtt0Var = new vtt0(ttt0Var);
                        continue;
                }
                vtt0Var = vtt0Var2;
            }
            linkedHashMap.put(key, vtt0Var);
        }
        return sqg0.O(linkedHashMap, map);
    }

    private final Object h(Object obj) {
        iu30 iu30Var = (iu30) this.f;
        bsu0 bsu0Var = (bsu0) this.c;
        fsu0 fsu0Var = (fsu0) this.d;
        pru0 pru0Var = (uru0) this.e;
        tqw tqwVar = (tqw) this.b;
        hm5.M(obj);
        if (pru0Var instanceof pru0) {
            o940 o940Var = bsu0Var.j;
            if (o940Var == null || !o940Var.a()) {
                iu30Var.invoke(new v051(new z951(bsu0Var.a, 3, false, (p7w) null, false, false, (Integer) null, false, u951.a, (String) null, bsu0Var.d, (String) null, false, 0, false, false, false, 259568), tqwVar != null ? n3o1.y(tqwVar) : null, pru0Var.a));
            } else {
                iu30Var.invoke(new uz41(bsu0Var.j.c));
            }
        } else {
            if (!u890.j(pru0Var, jru0.a)) {
                eg.o();
                return null;
            }
            iu30Var.invoke(new cz41(Collections.singletonList(bsu0Var.a), bsu0Var.a, fsu0Var.b, tqwVar != null ? n3o1.y(tqwVar) : null));
        }
        return rih1.a;
    }

    private final Object i(Object obj) {
        j5h1 j5h1Var = (j5h1) ((smp0) this.f).c;
        v6w0 v6w0Var = (v6w0) this.c;
        w6w0 w6w0Var = (w6w0) this.d;
        u6w0 u6w0Var = (u6w0) this.e;
        tqw tqwVar = (tqw) this.b;
        hm5.M(obj);
        if (u890.j(u6w0Var, s6w0.a)) {
            v6w0Var.b.invoke(cvl1.d(tqwVar));
        } else {
            if (!u890.j(u6w0Var, t6w0.a)) {
                eg.o();
                return null;
            }
            if (w6w0Var.b) {
                j5h1Var.b();
            } else {
                e9w0 e9w0Var = v6w0Var.a;
                String str = e9w0Var.l;
                o8w0 o8w0Var = str != null ? new o8w0(e9w0Var.a, str) : null;
                if (o8w0Var != null) {
                    j5h1Var.a(new g5h1(o8w0Var.a, o8w0Var.b));
                }
            }
        }
        return rih1.a;
    }

    private final Object j(Object obj) {
        ubw0 ubw0Var = (ubw0) ((hf2) this.f).f;
        yaw0 yaw0Var = (yaw0) this.c;
        zaw0 zaw0Var = (zaw0) this.d;
        waw0 waw0Var = (waw0) this.e;
        tqw tqwVar = (tqw) this.b;
        hm5.M(obj);
        if (waw0Var != null) {
            Function0 function0 = yaw0Var.j;
            if (function0 != null) {
                function0.invoke();
            }
            oiw0 oiw0Var = zaw0Var.a;
            if ((oiw0Var instanceof iiw0) || (oiw0Var instanceof kiw0)) {
                if (ubw0Var != null) {
                    ubw0Var.g(tqwVar != null ? n3o1.y(tqwVar) : null);
                }
            } else if (oiw0Var instanceof liw0) {
                if (ubw0Var != null) {
                    ubw0Var.h(tqwVar != null ? n3o1.y(tqwVar) : null);
                }
            } else if (ubw0Var != null) {
                ubw0Var.d();
            }
        }
        return rih1.a;
    }

    private final Object m(Object obj) {
        ou80 ou80Var;
        oey0 oey0Var = (oey0) this.c;
        kob1 kob1Var = (kob1) this.d;
        e700 e700Var = (e700) this.e;
        tqw tqwVar = (tqw) this.b;
        hm5.M(obj);
        uxy0 uxy0Var = (uxy0) this.f;
        int iJ = jxa.J(e700Var, oey0Var, kob1Var.s);
        String str = oey0Var.l;
        String str2 = oey0Var.h;
        dp5 dp5Var = (dp5) uxy0Var.b;
        String str3 = null;
        switch (l1d.C(iJ)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                String str4 = oey0Var.a;
                String str5 = oey0Var.h;
                String str6 = oey0Var.j;
                str3 = tqwVar != null ? n3o1.y(tqwVar).a : null;
                String str7 = oey0Var.m;
                String str8 = nik1.x0.a;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                dp5Var.g(new ps01(str4, str5, str6, new st01(str3, str, yon1.E4().a, str7, str8), oey0Var.p && !oey0Var.q));
                break;
            case 1:
                dp5Var.g(new ms01(str2, tqwVar != null ? n3o1.y(tqwVar) : null));
                break;
            case 2:
                String str9 = oey0Var.r;
                if (str9 != null) {
                    dp5Var.g(new ms01(str9, tqwVar != null ? n3o1.y(tqwVar) : null));
                }
                break;
            case 3:
                tqwVar.getClass();
                dp5Var.g(new is01(str2, n3o1.y(tqwVar)));
                break;
            case 4:
                dp5Var.g(new ss01(str2, oey0Var.w));
                break;
            case 5:
                if (tqwVar != null && (ou80Var = n3o1.y(tqwVar).a) != null) {
                    str3 = ou80Var.a;
                }
                dp5Var.g(new hs01(str2, str, str3));
                break;
            case 6:
                break;
            default:
                eg.o();
                return null;
        }
        return rih1.a;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                k1 k1Var = new k1((s1) obj6, (lnm) obj5, (byte) 0);
                k1Var.c = (c1) obj;
                k1Var.d = (h1) obj2;
                k1Var.e = (f1) obj3;
                k1Var.b = (tqw) obj4;
                k1Var.invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                k1 k1Var2 = new k1((rwj) obj6, (lnm) obj5, (byte) 1);
                k1Var2.c = (tl0) obj;
                k1Var2.d = (ul0) obj2;
                k1Var2.e = (rl0) obj3;
                k1Var2.b = (tqw) obj4;
                k1Var2.invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                k1 k1Var3 = new k1((iu30) obj6, (lnm) obj5, (byte) 2);
                k1Var3.c = (tf3) obj;
                k1Var3.d = (uf3) obj2;
                k1Var3.e = (sf3) obj3;
                k1Var3.b = (tqw) obj4;
                k1Var3.invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                k1 k1Var4 = new k1((yxb0) obj6, (lnm) obj5, (byte) 3);
                k1Var4.c = (f04) obj;
                k1Var4.d = (i04) obj2;
                k1Var4.e = (b04) obj3;
                k1Var4.b = (tqw) obj4;
                k1Var4.invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                k1 k1Var5 = new k1((qx6) obj6, (lnm) obj5, (byte) 4);
                k1Var5.c = (gx6) obj;
                k1Var5.d = (mx6) obj2;
                k1Var5.e = (yw6) obj3;
                k1Var5.b = (tqw) obj4;
                k1Var5.invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                k1 k1Var6 = new k1((iu30) obj6, (lnm) obj5, (byte) 5);
                k1Var6.c = (vb8) obj;
                k1Var6.d = (xb8) obj2;
                k1Var6.e = (tb8) obj3;
                k1Var6.b = (tqw) obj4;
                k1Var6.invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                k1 k1Var7 = new k1((jkf) this.e, (qtr) obj6, (lnm) obj5, (byte) 6);
                k1Var7.c = (ekf) obj;
                k1Var7.d = (dkf) obj3;
                k1Var7.b = (tqw) obj4;
                k1Var7.invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                k1 k1Var8 = new k1((idm) obj6, (lnm) obj5, (byte) 7);
                k1Var8.c = (wcm) obj;
                k1Var8.d = (cdm) obj2;
                k1Var8.e = (zcm) obj3;
                k1Var8.b = (tqw) obj4;
                k1Var8.invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                k1 k1Var9 = new k1((xyn) obj6, (lnm) obj5, (byte) 8);
                k1Var9.c = (pyn) obj;
                k1Var9.d = (vyn) obj2;
                k1Var9.e = (uyn) obj3;
                k1Var9.b = (tqw) obj4;
                k1Var9.invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                k1 k1Var10 = new k1((ft30) this.e, (tm) obj6, (lnm) obj5, (byte) 9);
                k1Var10.c = (zdy) obj2;
                k1Var10.d = (ydy) obj3;
                k1Var10.b = (tqw) obj4;
                k1Var10.invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                k1 k1Var11 = new k1((let) obj6, (lnm) obj5, (byte) 10);
                k1Var11.c = (k1r) obj;
                k1Var11.d = (k1r) obj2;
                k1Var11.e = (k1r) obj3;
                k1Var11.b = (k1r) obj4;
                return k1Var11.invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                k1 k1Var12 = new k1((cm0) obj6, (lnm) obj5, (byte) 11);
                k1Var12.c = (Set) obj;
                k1Var12.d = (g3d0) obj2;
                k1Var12.e = (cxc0) obj3;
                k1Var12.b = (ibk0) obj4;
                return k1Var12.invokeSuspend(rih1Var);
            case grn1.d /* 12 */:
                k1 k1Var13 = new k1((iu30) obj6, (lnm) obj5, (byte) 12);
                k1Var13.c = (qd60) obj;
                k1Var13.d = (rd60) obj2;
                k1Var13.e = (pd60) obj3;
                k1Var13.b = (tqw) obj4;
                k1Var13.invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                k1 k1Var14 = new k1((xv60) obj6, (lnm) obj5, (byte) 13);
                k1Var14.c = (qv60) obj;
                k1Var14.d = (tv60) obj2;
                k1Var14.e = (pv60) obj3;
                k1Var14.b = (tqw) obj4;
                k1Var14.invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                k1 k1Var15 = new k1((ng20) obj6, (lnm) obj5, (byte) 14);
                k1Var15.c = (e8d0) obj;
                k1Var15.d = (f8d0) obj2;
                k1Var15.e = (d8d0) obj3;
                k1Var15.b = (tqw) obj4;
                k1Var15.invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                k1 k1Var16 = new k1((nm1) obj6, (lnm) obj5, (byte) 15);
                k1Var16.c = (ilg0) obj;
                k1Var16.d = (plg0) obj2;
                k1Var16.e = (glg0) obj3;
                k1Var16.b = (tqw) obj4;
                k1Var16.invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                k1 k1Var17 = new k1((kai0) obj6, (lnm) obj5, (byte) 16);
                k1Var17.c = (lai0) obj;
                k1Var17.d = (hwt) obj2;
                k1Var17.e = (zkm) obj3;
                k1Var17.b = (ijo) obj4;
                return k1Var17.invokeSuspend(rih1Var);
            case 17:
                k1 k1Var18 = new k1((lzn0) this.e, (vgm) obj6, (lnm) obj5, (byte) 17);
                k1Var18.c = (iob1) obj2;
                k1Var18.d = (c700) obj3;
                k1Var18.b = (tqw) obj4;
                k1Var18.invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                k1 k1Var19 = new k1((wdi0) obj6, (lnm) obj5, (byte) 18);
                k1Var19.c = (ndi0) obj;
                k1Var19.d = (odi0) obj2;
                k1Var19.e = (mdi0) obj3;
                k1Var19.b = (tqw) obj4;
                k1Var19.invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                k1 k1Var20 = new k1((gei0) obj6, (lnm) obj5, (byte) 19);
                k1Var20.c = (hei0) obj;
                k1Var20.d = (hwt) obj2;
                k1Var20.e = (zkm) obj3;
                k1Var20.b = (ijo) obj4;
                return k1Var20.invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                k1 k1Var21 = new k1((xpi0) obj6, (lnm) obj5, (byte) 20);
                k1Var21.c = (tpi0) obj;
                k1Var21.d = (upi0) obj2;
                k1Var21.e = (spi0) obj3;
                k1Var21.b = (tqw) obj4;
                k1Var21.invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                k1 k1Var22 = new k1((jqm0) obj6, (lnm) obj5, (byte) 21);
                k1Var22.c = (gqm0) obj;
                k1Var22.d = (hqm0) obj2;
                k1Var22.e = (fqm0) obj3;
                k1Var22.b = (tqw) obj4;
                k1Var22.invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                k1 k1Var23 = new k1((et90) obj6, (lnm) obj5, (byte) 22);
                k1Var23.c = (xfn0) obj;
                k1Var23.d = (yfn0) obj2;
                k1Var23.e = (vfn0) obj3;
                k1Var23.b = (tqw) obj4;
                k1Var23.invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                k1 k1Var24 = new k1((lot0) obj6, (lnm) obj5, (byte) 23);
                k1Var24.c = (hot0) obj;
                k1Var24.d = (iot0) obj2;
                k1Var24.e = (got0) obj3;
                k1Var24.b = (tqw) obj4;
                k1Var24.invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                k1 k1Var25 = new k1((hut0) obj6, (lnm) obj5, (byte) 24);
                k1Var25.c = (xtt0) obj;
                k1Var25.d = (Boolean) obj2;
                k1Var25.e = (Set) obj3;
                k1Var25.b = (Map) obj4;
                return k1Var25.invokeSuspend(rih1Var);
            case 25:
                k1 k1Var26 = new k1((iu30) obj6, (lnm) obj5, (byte) 25);
                k1Var26.c = (bsu0) obj;
                k1Var26.d = (fsu0) obj2;
                k1Var26.e = (uru0) obj3;
                k1Var26.b = (tqw) obj4;
                k1Var26.invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                k1 k1Var27 = new k1((smp0) obj6, (lnm) obj5, (byte) 26);
                k1Var27.c = (v6w0) obj;
                k1Var27.d = (w6w0) obj2;
                k1Var27.e = (u6w0) obj3;
                k1Var27.b = (tqw) obj4;
                k1Var27.invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                k1 k1Var28 = new k1((hf2) obj6, (lnm) obj5, (byte) 27);
                k1Var28.c = (yaw0) obj;
                k1Var28.d = (zaw0) obj2;
                k1Var28.e = (waw0) obj3;
                k1Var28.b = (tqw) obj4;
                k1Var28.invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                k1 k1Var29 = new k1((uxy0) obj6, (lnm) obj5, (byte) 28);
                k1Var29.c = (oey0) obj;
                k1Var29.d = (kob1) obj2;
                k1Var29.e = (e700) obj3;
                k1Var29.b = (tqw) obj4;
                k1Var29.invokeSuspend(rih1Var);
                return rih1Var;
            default:
                k1 k1Var30 = new k1((jp61) obj6, (lnm) obj5, (byte) 29);
                k1Var30.c = (lax) obj;
                k1Var30.d = (jt61) obj2;
                k1Var30.e = obj3;
                k1Var30.b = (Map) obj4;
                return k1Var30.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:188:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:249:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:259:0x0670  */
    public final Object invokeSuspend(Object obj) {
        b1 b1Var;
        int i;
        jqf jqfVar;
        kyn kynVar;
        dp3 fp3Var;
        CharSequence spannableStringBuilder;
        iix0 iix0Var;
        String string;
        String string2;
        pnt pntVar;
        String str;
        ou80 ou80Var;
        byte b = this.a;
        int i2 = 2;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        tv80 p860Var = null;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                c1 c1Var = (c1) this.c;
                h1 h1Var = (h1) this.d;
                f1 f1Var = (f1) this.e;
                tqw tqwVar = (tqw) this.b;
                hm5.M(obj);
                s1 s1Var = (s1) obj2;
                if (!u890.j(f1Var, d1.a)) {
                    if (u890.j(f1Var, e1.a)) {
                        b1Var = c1Var.d;
                    } else {
                        eg.o();
                    }
                    return null;
                }
                b1Var = c1Var.c;
                String str2 = h1Var.d;
                boolean z2 = b1Var instanceof z0;
                if (z2 && ihc1.y0(str2)) {
                    return rih1Var;
                }
                String strF = s1.f(b1Var, c1Var.a);
                if (b1Var instanceof a1) {
                    if (tqwVar == null) {
                        return rih1Var;
                    }
                    s1Var.a.a(strF, n3o1.y(tqwVar), (Bundle) null);
                    return rih1Var;
                }
                if (!z2) {
                    eg.o();
                    return null;
                }
                if (tqwVar == null) {
                    return rih1Var;
                }
                a1r0.m(s1Var.b, strF, n3o1.y(tqwVar), (Bundle) null, 12);
                return rih1Var;
            case 1:
                rwj rwjVar = (rwj) obj2;
                tl0 tl0Var = (tl0) this.c;
                ul0 ul0Var = (ul0) this.d;
                rl0 rl0Var = (rl0) this.e;
                tqw tqwVar2 = (tqw) this.b;
                hm5.M(obj);
                if (!(rl0Var instanceof pl0)) {
                    if (rl0Var instanceof ql0) {
                        ((i9i1) rwjVar.g).b(((ql0) rl0Var).a);
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                bl0 bl0VarZ = x1p1.z(tl0Var.a, ((pl0) rl0Var).b);
                uv61 uv61VarA = ((xv61) rwjVar.f).a(rc11.a.b(ol0.class), tl0Var.b);
                Boolean bool = ul0Var.d;
                uv61VarA.a(bool != null ? x1p1.z(tl0Var.a, bool.booleanValue()) : null, bl0VarZ, tqwVar2 != null ? n3o1.y(tqwVar2) : null);
                if (bl0VarZ != bl0.c) {
                    return rih1Var;
                }
                ((kt91) rwjVar.e).k(new er91((fs91) null, ((Context) rwjVar.d).getString(2131951817, tl0Var.c), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 2:
                iu30 iu30Var = (iu30) obj2;
                tf3 tf3Var = (tf3) this.c;
                uf3 uf3Var = (uf3) this.d;
                rf3 rf3Var = (sf3) this.e;
                tqw tqwVar3 = (tqw) this.b;
                hm5.M(obj);
                if (rf3Var instanceof rf3) {
                    iu30Var.invoke(new v051(new z951(tf3Var.a, 3, uf3Var.e, (p7w) null, false, false, (Integer) null, false, u951.a, (String) null, tf3Var.d, (String) null, false, 0, false, false, false, 259568), tqwVar3 != null ? n3o1.y(tqwVar3) : null, rf3Var.a));
                    return rih1Var;
                }
                if (u890.j(rf3Var, qf3.a)) {
                    iu30Var.invoke(new cz41(Collections.singletonList(tf3Var.a), tf3Var.a, uf3Var.g, tqwVar3 != null ? n3o1.y(tqwVar3) : null));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 3:
                yxb0 yxb0Var = (yxb0) obj2;
                f04 f04Var = (f04) this.c;
                h04 h04Var = (i04) this.d;
                b04 b04Var = (b04) this.e;
                tqw tqwVar4 = (tqw) this.b;
                hm5.M(obj);
                if (u890.j(b04Var, b04.a)) {
                    ((lo60) yxb0Var.c).a(h04Var.getUri(), cvl1.d(tqwVar4), (Bundle) null);
                    return rih1Var;
                }
                if (!u890.j(b04Var, b04.b)) {
                    eg.o();
                    return null;
                }
                if (!(h04Var instanceof h04)) {
                    return rih1Var;
                }
                String str3 = h04Var.e;
                e04 e04Var = f04Var instanceof e04 ? (e04) f04Var : null;
                if (e04Var != null && (i = e04Var.f) != 0) {
                    p860Var = new p860(str3, i);
                }
                ((vgm) yxb0Var.f).d(str3, nik1.z0.a, cvl1.d(tqwVar4), new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, p860Var, (mgo0) null, false, false, -268435463, 1));
                return rih1Var;
            case 4:
                qx6 qx6Var = (qx6) obj2;
                gx6 gx6Var = (gx6) this.c;
                mx6 mx6Var = (mx6) this.d;
                yw6 yw6Var = (yw6) this.e;
                tqw tqwVar5 = (tqw) this.b;
                hm5.M(obj);
                if (!u890.j(yw6Var, yw6.a)) {
                    eg.o();
                    return null;
                }
                String strC = gx6Var.a;
                String str4 = mx6Var.b;
                if (gx6Var.c) {
                    strC = y1x0.c(strC);
                }
                if (tqwVar5 == null) {
                    return rih1Var;
                }
                qx6Var.b.a(strC, n3o1.y(tqwVar5), (Bundle) null);
                return rih1Var;
            case 5:
                iu30 iu30Var2 = (iu30) obj2;
                vb8 vb8Var = (vb8) this.c;
                xb8 xb8Var = (xb8) this.d;
                sb8 sb8Var = (tb8) this.e;
                tqw tqwVar6 = (tqw) this.b;
                hm5.M(obj);
                if (sb8Var instanceof sb8) {
                    iu30Var2.invoke(new v051(new z951(vb8Var.a, vb8Var.e, false, (p7w) null, false, false, (Integer) null, false, u951.a, (String) null, vb8Var.d, (String) null, false, 0, false, false, false, 259568), tqwVar6 != null ? n3o1.y(tqwVar6) : null, sb8Var.a));
                    return rih1Var;
                }
                if (sb8Var instanceof qb8) {
                    iu30Var2.invoke(new cz41(Collections.singletonList(vb8Var.a), vb8Var.a, xb8Var.b, tqwVar6 != null ? n3o1.y(tqwVar6) : null));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 6:
                jkf jkfVar = (jkf) this.e;
                ekf ekfVar = (ekf) this.c;
                dkf dkfVar = (dkf) this.d;
                tqw tqwVar7 = (tqw) this.b;
                hm5.M(obj);
                if (u890.j(dkfVar, akf.a) || u890.j(dkfVar, bkf.a)) {
                    lzn0 lzn0Var = jkfVar.a;
                    String strA = ekfVar.a();
                    int iC = l1d.C(jkfVar.i);
                    if (iC == 0) {
                        jqfVar = jqf.b;
                    } else if (iC == 1) {
                        jqfVar = jqf.c;
                    } else {
                        eg.o();
                    }
                    hqn1.q(lzn0Var, strA, tqwVar7, mno1.h(new mmr0[]{new mmr0("ChatSource", jqfVar)}));
                    return rih1Var;
                }
                if (u890.j(dkfVar, ckf.a) || u890.j(dkfVar, zjf.a)) {
                    if (tqwVar7 == null) {
                        n57.s("Failed to open context menu for chat, null interaction result");
                        return rih1Var;
                    }
                    goe goeVar = ekfVar.c;
                    ctf ctfVar = goeVar.b;
                    if (u890.j(ctfVar, atf.a)) {
                        for (jwm jwmVar : goeVar.e) {
                            if (!u890.j(jwmVar.a.a, ekfVar.b)) {
                                if (jkfVar.b.a() && sqe.w(goeVar)) {
                                    z = true;
                                }
                                boolean z3 = !z;
                                ((tte) jkfVar.c.get()).a(goeVar.a, jwmVar.a.a, ekfVar.a(), n3o1.y(tqwVar7), z3, z3, z3, z3);
                                return rih1Var;
                            }
                        }
                        bhn0.t("Collection contains no element matching the predicate.");
                    } else {
                        if (ctfVar instanceof btf) {
                            ((rj50) jkfVar.e.get()).a(goeVar.a, ekfVar.a(), goeVar.c, ekfVar.b, n3o1.y(tqwVar7));
                            return rih1Var;
                        }
                        eg.o();
                    }
                } else {
                    eg.o();
                }
                return null;
            case 7:
                wcm wcmVar = (wcm) this.c;
                cdm cdmVar = (cdm) this.d;
                zcm zcmVar = (zcm) this.e;
                tqw tqwVar8 = (tqw) this.b;
                hm5.M(obj);
                if (!u890.j(zcmVar, zcm.a)) {
                    eg.o();
                    return null;
                }
                if (cdmVar.b != 1) {
                    return rih1Var;
                }
                Function0 function0 = wcmVar.e;
                if (function0 != null) {
                    function0.invoke();
                }
                ((idm) obj2).b.d(wcmVar.a, wcmVar.b, cvl1.d(tqwVar8), tgm.a((tgm) wcmVar.f.invoke(), false, false, 0, cdmVar.c, (sgm) null, (iu30) null, (p860) null, false, -131073));
                return rih1Var;
            case 8:
                pyn pynVar = (pyn) this.c;
                vyn vynVar = (vyn) this.d;
                uyn uynVar = (uyn) this.e;
                tqw tqwVar9 = (tqw) this.b;
                hm5.M(obj);
                xyn xynVar = (xyn) obj2;
                if (!u890.j(uynVar, syn.a)) {
                    if (u890.j(uynVar, tyn.a)) {
                        kynVar = pynVar.d;
                    } else {
                        eg.o();
                    }
                    return null;
                }
                kynVar = pynVar.c;
                if (!xyn.g(kynVar, vynVar.d)) {
                    return rih1Var;
                }
                String strH = xyn.h(kynVar, pynVar.a);
                if (kynVar instanceof jyn) {
                    if (tqwVar9 == null) {
                        return rih1Var;
                    }
                    xynVar.b.a(strH, n3o1.y(tqwVar9), (Bundle) null);
                    return rih1Var;
                }
                if (!(kynVar instanceof iyn)) {
                    eg.o();
                    return null;
                }
                if (tqwVar9 == null) {
                    return rih1Var;
                }
                a1r0.m(xynVar.c, strH, n3o1.y(tqwVar9), (Bundle) null, 12);
                return rih1Var;
            case 9:
                zdy zdyVar = (zdy) this.c;
                ydy ydyVar = (ydy) this.d;
                tqw tqwVar10 = (tqw) this.b;
                hm5.M(obj);
                ft30 ft30Var = (ft30) this.e;
                int iOrdinal = ydyVar.ordinal();
                if (iOrdinal == 0) {
                    fp3Var = new fp3(zdyVar.a, cvl1.d(tqwVar10), zdyVar.b, zdyVar.d);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    fp3Var = new dp3(zdyVar.a, zdyVar.b, zdyVar.d, cvl1.d(tqwVar10), zdyVar.l);
                }
                ft30Var.invoke(fp3Var);
                return rih1Var;
            case 10:
                let letVar = (let) obj2;
                e5v0 e5v0Var = letVar.f;
                i1r i1rVar = (k1r) this.c;
                i1r i1rVar2 = (k1r) this.d;
                tv80 tv80Var = (k1r) this.e;
                i1r i1rVar3 = (k1r) this.b;
                hm5.M(obj);
                i1r i1rVar4 = i1rVar instanceof i1r ? i1rVar : null;
                z070 z070Var = i1rVar4 != null ? (z070) i1rVar4.a : null;
                i1r i1rVar5 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                mdz mdzVar = i1rVar5 != null ? (mdz) i1rVar5.a : null;
                i1r i1rVar6 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                String str5 = (i1rVar6 == null || (pntVar = (pnt) i1rVar6.a) == null) ? null : pntVar.a;
                if (z070Var != null) {
                    CharSequence charSequenceA = letVar.c.a(z070Var.a);
                    e5v0Var.getClass();
                    Pattern patternCompile = Pattern.compile("<li>([^<]*)<p>(.*?)</p>\\s*(.*?)</li>");
                    svu0 svu0Var = svu0.e1;
                    mbh0 mbh0VarM = mno1.m(patternCompile.matcher(charSequenceA), 0, charSequenceA);
                    if (mbh0VarM == null) {
                        string = charSequenceA.toString();
                    } else {
                        int length = ((String) charSequenceA).length();
                        StringBuilder sb = new StringBuilder(length);
                        int i3 = 0;
                        do {
                            sb.append(charSequenceA, i3, ((rr80) mbh0VarM.b()).a);
                            sb.append((CharSequence) svu0Var.invoke(mbh0VarM));
                            i3 = ((rr80) mbh0VarM.b()).b + 1;
                            mbh0VarM = mbh0VarM.c();
                            if (i3 < length) {
                            }
                            if (i3 < length) {
                                sb.append(charSequenceA, i3, length);
                            }
                            string = sb.toString();
                        } while (mbh0VarM != null);
                        if (i3 < length) {
                            sb.append(charSequenceA, i3, length);
                        }
                        string = sb.toString();
                    }
                    mbh0 mbh0VarM2 = mno1.m(Pattern.compile("<(/?)(ul|ol|li)>").matcher(string), 0, string);
                    if (mbh0VarM2 == null) {
                        string2 = string.toString();
                    } else {
                        int length2 = string.length();
                        StringBuilder sb2 = new StringBuilder(length2);
                        int i4 = 0;
                        do {
                            sb2.append((CharSequence) string, i4, ((rr80) mbh0VarM2.b()).a);
                            sb2.append((CharSequence) ("<" + mbh0VarM2.a().get(1) + "custom-" + mbh0VarM2.a().get(2) + ">"));
                            i4 = ((rr80) mbh0VarM2.b()).b + 1;
                            mbh0VarM2 = mbh0VarM2.c();
                            if (i4 < length2) {
                            }
                            if (i4 < length2) {
                                sb2.append((CharSequence) string, i4, length2);
                            }
                            string2 = sb2.toString();
                        } while (mbh0VarM2 != null);
                        if (i4 < length2) {
                            sb2.append((CharSequence) string, i4, length2);
                        }
                        string2 = sb2.toString();
                    }
                    spannableStringBuilder = letVar.e.a(letVar.d.a((Spannable) Html.fromHtml(string2, 0, null, e5v0Var)));
                } else {
                    spannableStringBuilder = (mdzVar != null ? mdzVar.m : null) != null ? new SpannableStringBuilder(ihc1.e1(mdzVar.m).toString()) : str5 != null ? new SpannableStringBuilder(ihc1.e1(str5).toString()) : new SpannableStringBuilder();
                }
                p860Var = tv80Var instanceof i1r ? (i1r) tv80Var : null;
                return new get(new SpannableStringBuilder(spannableStringBuilder), (p860Var == null || (iix0Var = (iix0) ((i1r) p860Var).a) == null) ? 0L : iix0Var.f());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                Set set = (Set) this.c;
                g3d0 g3d0Var = (g3d0) this.d;
                cxc0 cxc0Var = (cxc0) this.e;
                ibk0 ibk0Var = (ibk0) this.b;
                hm5.M(obj);
                boolean zB = z6k0.b(cxc0Var.f.q);
                if (!ibk0Var.b() || !zB) {
                    set = w7x.a;
                }
                return new bov(set, g3d0Var);
            case grn1.d /* 12 */:
                iu30 iu30Var3 = (iu30) obj2;
                qd60 qd60Var = (qd60) this.c;
                rd60 rd60Var = (rd60) this.d;
                od60 od60Var = (pd60) this.e;
                tqw tqwVar11 = (tqw) this.b;
                hm5.M(obj);
                if (od60Var instanceof od60) {
                    iu30Var3.invoke(new v051(new z951(qd60Var.a, 3, rd60Var.b, (p7w) null, false, false, (Integer) null, false, u951.a, (String) null, qd60Var.f, (String) null, false, 0, false, false, false, 259520), tqwVar11 != null ? n3o1.y(tqwVar11) : null, od60Var.a));
                    return rih1Var;
                }
                if (u890.j(od60Var, nd60.a)) {
                    iu30Var3.invoke(new cz41(Collections.singletonList(qd60Var.a), qd60Var.a, rd60Var.c, tqwVar11 != null ? n3o1.y(tqwVar11) : null));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 13:
                xv60 xv60Var = (xv60) obj2;
                vu60 vu60Var = xv60Var.i;
                qv60 qv60Var = (qv60) this.c;
                tv60 tv60Var = (tv60) this.d;
                pv60 pv60Var = (pv60) this.e;
                tqw tqwVar12 = (tqw) this.b;
                hm5.M(obj);
                vr60 vr60Var = new vr60(qv60Var.a);
                int iOrdinal2 = pv60Var.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (!(tv60Var instanceof sv60) || ((sv60) tv60Var).c.b.a.isEmpty()) {
                            return rih1Var;
                        }
                        vu60Var.b.accept(new ku60(vr60Var));
                        return rih1Var;
                    }
                    if (iOrdinal2 == 2) {
                        sv60 sv60Var = tv60Var instanceof sv60 ? (sv60) tv60Var : null;
                        p860Var = sv60Var != null ? (js60) o7h.s0(sv60Var.c.b.a) : null;
                        if (p860Var == null) {
                            return rih1Var;
                        }
                        vu60Var.b.accept(new vt60(((js60) p860Var).b, ((js60) p860Var).e, vr60Var));
                        return rih1Var;
                    }
                    if (iOrdinal2 != 3) {
                        eg.o();
                        return null;
                    }
                    sv60 sv60Var2 = tv60Var instanceof sv60 ? (sv60) tv60Var : null;
                    p860Var = sv60Var2 != null ? (js60) o7h.s0(sv60Var2.c.b.a) : null;
                    if (p860Var == null) {
                        return rih1Var;
                    }
                    vu60Var.b.accept(new nu60(((js60) p860Var).b, ((js60) p860Var).e, vr60Var));
                    return rih1Var;
                }
                js90 js90Var = xv60Var.h;
                String str6 = (tqwVar12 == null || (ou80Var = n3o1.y(tqwVar12).a) == null) ? null : ou80Var.a;
                sv60 sv60Var3 = tv60Var instanceof sv60 ? (sv60) tv60Var : null;
                if (sv60Var3 != null) {
                    ArrayList<js60> arrayList = sv60Var3.c.b.a;
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    for (js60 js60Var : arrayList) {
                        if (zv60.a[js60Var.e.ordinal()] == 1) {
                            str = "listening_activity";
                        } else {
                            str = js60Var.d;
                            if (str == null) {
                                str = "nearby_dialog";
                            }
                        }
                        arrayList2.add(str);
                    }
                    p860Var = o7h.p1(arrayList2);
                }
                if (p860Var == null) {
                    i2 = 1;
                } else if (p860Var.size() > 1) {
                    i2 = 3;
                } else if (!p860Var.contains("listening_activity")) {
                    i2 = 1;
                }
                js90Var.a(str6, new ds90(i2));
                return rih1Var;
            case 14:
                e8d0 e8d0Var = (e8d0) this.c;
                f8d0 f8d0Var = (f8d0) this.d;
                d8d0 d8d0Var = (d8d0) this.e;
                tqw tqwVar13 = (tqw) this.b;
                hm5.M(obj);
                if (!u890.j(d8d0Var, d8d0.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar13 == null) {
                    return rih1Var;
                }
                ktv.b((ktv) ((ng20) obj2).b, e8d0Var.a, n3o1.y(tqwVar13), (Set) null, f8d0Var.a, 12);
                return rih1Var;
            case 15:
                ilg0 ilg0Var = (ilg0) this.c;
                plg0 plg0Var = (plg0) this.d;
                dlg0 dlg0Var = (glg0) this.e;
                tqw tqwVar14 = (tqw) this.b;
                hm5.M(obj);
                if (dlg0Var instanceof dlg0) {
                    i1o1.w((mjm) ((nm1) obj2).f, dlg0Var.a, tqwVar14 != null ? n3o1.y(tqwVar14) : null, new Long(w361.v(plg0Var.a())));
                    return rih1Var;
                }
                if (!u890.j(dlg0Var, elg0.a)) {
                    if (u890.j(dlg0Var, flg0.a)) {
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                iu30 iu30Var4 = ilg0Var.h;
                if (iu30Var4 != null) {
                    iu30Var4.invoke(tqwVar14 != null ? n3o1.y(tqwVar14) : null);
                    return rih1Var;
                }
                ilg0Var.f.invoke();
                return rih1Var;
            case 16:
                lai0 lai0Var = (lai0) this.c;
                hwt hwtVar = (hwt) this.d;
                zkm zkmVar = (zkm) this.e;
                ijo ijoVar = (ijo) this.b;
                hm5.M(obj);
                kai0 kai0Var = (kai0) obj2;
                return new xai0(new t810(new ioj0(), zkmVar, hwtVar, ijoVar, false, false, false, false, false, false, false, false, new y2u0(0, false, false, false), (sq51) null, true, kai0Var.a, kai0Var.b, 229168), lai0Var);
            case 17:
                iob1 iob1Var = (iob1) this.c;
                c700 c700Var = (c700) this.d;
                tqw tqwVar15 = (tqw) this.b;
                hm5.M(obj);
                if (u890.j(c700Var, kwz.a) || (c700Var instanceof gzz)) {
                    hqn1.q((lzn0) this.e, iob1Var.n, tqwVar15, null);
                } else if (u890.j(c700Var, nwz.a) || u890.j(c700Var, hzz.a)) {
                    wcm wcmVar2 = too1.v(iob1Var).o;
                    String str7 = wcmVar2.a;
                    tqwVar15.getClass();
                    vgm.b((vgm) obj2, str7, (String) null, n3o1.y(tqwVar15), (tgm) wcmVar2.f.invoke(), 2);
                }
                return rih1Var;
            case 18:
                wdi0 wdi0Var = (wdi0) obj2;
                ndi0 ndi0Var = (ndi0) this.c;
                odi0 odi0Var = (odi0) this.d;
                mdi0 mdi0Var = (mdi0) this.e;
                tqw tqwVar16 = (tqw) this.b;
                hm5.M(obj);
                if (u890.j(mdi0Var, kdi0.a)) {
                    vgm.b(wdi0Var.d, ndi0Var.c, (String) null, cvl1.d(tqwVar16), (tgm) odi0Var.i.f.invoke(), 2);
                    return rih1Var;
                }
                if (u890.j(mdi0Var, jdi0.a) || u890.j(mdi0Var, ldi0.a)) {
                    wdi0Var.b.a(ndi0Var.c, cvl1.d(tqwVar16), (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 19:
                hei0 hei0Var = (hei0) this.c;
                hwt hwtVar2 = (hwt) this.d;
                zkm zkmVar2 = (zkm) this.e;
                ijo ijoVar2 = (ijo) this.b;
                hm5.M(obj);
                gei0 gei0Var = (gei0) obj2;
                return new lei0(new t810(new ioj0(), zkmVar2, hwtVar2, ijoVar2, false, false, false, false, false, false, false, false, new y2u0(0, false, false, false), (sq51) null, true, gei0Var.b, gei0Var.c, 229296), hei0Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                xpi0 xpi0Var = (xpi0) obj2;
                tpi0 tpi0Var = (tpi0) this.c;
                upi0 upi0Var = (upi0) this.d;
                spi0 spi0Var = (spi0) this.e;
                tqw tqwVar17 = (tqw) this.b;
                hm5.M(obj);
                if (u890.j(spi0Var, rpi0.a)) {
                    pcf.a(xpi0Var.a, upi0Var.b.a.e, tqwVar17 != null ? n3o1.y(tqwVar17) : null, null);
                    return rih1Var;
                }
                if (!u890.j(spi0Var, qpi0.a)) {
                    eg.o();
                    return null;
                }
                vi50 vi50Var = xpi0Var.d;
                String str8 = upi0Var.b.a.e;
                String str9 = tpi0Var.c;
                String str10 = tpi0Var.b;
                tv80 tv80VarY = tqwVar17 != null ? n3o1.y(tqwVar17) : null;
                boolean zJ = u890.j(upi0Var.c.b, zvm.a);
                Function0 function1 = tpi0Var.f;
                Set set2 = s4b1.f;
                String strS = uic.x(str8).s();
                if (strS == null) {
                    return rih1Var;
                }
                lik1 lik1Var = new lik1(str9);
                mfm mfmVarA = vi50Var.g.a(lik1Var);
                Observable observableL = anm1.L(o6x.a, new ui50(vi50Var, strS, zJ, str10, function1, str8, lik1Var, (lnm) null));
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                mfm.b(mfmVarA, observableL, yon1.d1(), (bjm) null, tv80VarY, 20);
                return rih1Var;
            case 21:
                lzn0 lzn0Var2 = ((jqm0) obj2).b;
                gqm0 gqm0Var = (gqm0) this.c;
                hqm0 hqm0Var = (hqm0) this.d;
                dqm0 dqm0Var = (fqm0) this.e;
                tqw tqwVar18 = (tqw) this.b;
                hm5.M(obj);
                if (u890.j(dqm0Var, eqm0.a)) {
                    List list = hqm0Var.a;
                    if (list.size() != 1) {
                        return rih1Var;
                    }
                    gqm0Var.getClass();
                    String str11 = (String) o7h.q0(list);
                    if (tqwVar18 != null) {
                        lzn0Var2.a(str11, n3o1.y(tqwVar18), (Bundle) null);
                        return rih1Var;
                    }
                    lzn0Var2.h(str11);
                    return rih1Var;
                }
                if (!(dqm0Var instanceof dqm0)) {
                    eg.o();
                    return null;
                }
                gqm0Var.getClass();
                String str12 = dqm0Var.a;
                if (tqwVar18 != null) {
                    lzn0Var2.a(str12, n3o1.y(tqwVar18), (Bundle) null);
                    return rih1Var;
                }
                lzn0Var2.h(str12);
                return rih1Var;
            case 22:
                ubw0 ubw0Var = (ubw0) ((et90) obj2).d;
                xfn0 xfn0Var = (xfn0) this.c;
                yfn0 yfn0Var = (yfn0) this.d;
                vfn0 vfn0Var = (vfn0) this.e;
                tqw tqwVar19 = (tqw) this.b;
                hm5.M(obj);
                if (vfn0Var == null) {
                    eg.o();
                    return null;
                }
                Function0 function2 = xfn0Var.a;
                if (function2 != null) {
                    function2.invoke();
                }
                if (yfn0Var.b) {
                    if (ubw0Var == null) {
                        return rih1Var;
                    }
                    ubw0Var.h(tqwVar19 != null ? n3o1.y(tqwVar19) : null);
                    return rih1Var;
                }
                if (yfn0Var.a) {
                    if (ubw0Var == null) {
                        return rih1Var;
                    }
                    ubw0Var.g(tqwVar19 != null ? n3o1.y(tqwVar19) : null);
                    return rih1Var;
                }
                if (ubw0Var == null) {
                    return rih1Var;
                }
                ubw0Var.d();
                return rih1Var;
            case 23:
                return e(obj);
            case 24:
                return g(obj);
            case 25:
                return h(obj);
            case 26:
                return i(obj);
            case 27:
                return j(obj);
            case 28:
                return m(obj);
            default:
                lax gaxVar = (lax) this.c;
                ht61 ht61Var = (jt61) this.d;
                Object obj3 = this.e;
                Map map = (Map) this.b;
                hm5.M(obj);
                if (!(gaxVar instanceof gax)) {
                    lax gaxVar2 = new gax(2131961689, (String) null);
                    if (ht61Var instanceof it61) {
                        gaxVar2 = iax.a;
                    } else {
                        if (!(ht61Var instanceof ht61)) {
                            eg.o();
                            return null;
                        }
                        Integer num = ht61Var.a;
                        if (num != null) {
                            gaxVar = new gax(Integer.valueOf(num.intValue()), (String) null);
                        }
                    }
                    gaxVar = gaxVar2;
                }
                return new lp61((jp61) obj2, gaxVar, ht61Var.a(), obj3, map);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(Object obj, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.f = obj;
    }
}
