package p;

import android.app.Activity;
import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Flowable;
import j$.time.ZoneId;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rwj implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final psw c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public rwj(ymd0 ymd0Var, p1f0 p1f0Var, eci0 eci0Var, gw70 gw70Var, lzn0 lzn0Var, fza fzaVar, vgm vgmVar, hvp0 hvp0Var, fiv0 fiv0Var, nwt nwtVar, aru0 aru0Var, ycm ycmVar, aru0 aru0Var2, myq0 myq0Var, cua cuaVar, n801 n801Var, e9g1 e9g1Var, dnc dncVar, yqg yqgVar, ytp0 ytp0Var, clm clmVar, tbw0 tbw0Var, iuj iujVar, ytp0 ytp0Var2, yy4 yy4Var, Context context, oyo oyoVar, mev mevVar) {
        this.a = (byte) 15;
        kko kkoVar = (kko) p1f0Var.b;
        this.d = kkoVar;
        Function0 function0 = (Function0) p1f0Var.a;
        Function0 function1 = (Function0) p1f0Var.d;
        p731 p731Var = (p731) p1f0Var.e;
        this.e = p731Var;
        this.f = (vu30) p1f0Var.f;
        this.g = (vu30) p1f0Var.g;
        ojv0 ojv0Var = (ojv0) p1f0Var.c;
        this.h = x3p1.n(new qi1(this, eci0Var, yy4Var, clmVar, ymd0Var, nwtVar, ytp0Var2, p1f0Var, (byte) 6), new l690(ymd0Var, eci0Var, yy4Var, context, fzaVar, hvp0Var, yqgVar, ytp0Var, fiv0Var, this), new n(eci0Var, context, fzaVar, hvp0Var, yqgVar, ytp0Var, fiv0Var, this, (byte) 14), (o8n) null, new j96(lzn0Var, vgmVar, dncVar, ytp0Var2, this, eci0Var, (byte) 20), 8);
        this.b = n3o1.q(this).a(ytg0.T0, ytg0.U0);
        boolean z = eci0Var.j;
        j2i j2iVar = new j2i(-518968702, new t20(new aci0(eci0Var.b.a, eci0Var.h, z), new qq(gw70Var, function1, function0, p731Var, kkoVar, ojv0Var, aru0Var, ycmVar, aru0Var2, myq0Var, cuaVar, n801Var, e9g1Var, tbw0Var, iujVar, yqgVar, z ? mevVar : null, z ? (zob1) p1f0Var.h : null, z ? oyoVar : null), (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public static qcz0 r() {
        int iC = l1d.C(2);
        if (iC == 0) {
            return new pcz0(2131951713, 2131232595);
        }
        if (iC == 1) {
            return new ocz0(2131963236, 2131232592);
        }
        eg.o();
        return null;
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return (hy00) obj2;
            case 1:
                return (hy00) obj2;
            case 2:
                return (ia00) obj2;
            case 3:
                return (hy00) obj2;
            case 4:
                return (ia00) obj2;
            case 5:
                return (ia00) obj2;
            case 6:
                return (ia00) obj;
            case 7:
                return (ia00) obj2;
            case 8:
                return (ia00) obj2;
            case 9:
                return (eih1) obj2;
            case 10:
                return (c5o) obj2;
            case 11:
                return (eih1) obj2;
            case 12:
                return (ia00) obj;
            case 13:
                return (eih1) obj2;
            case 14:
                return (ia00) obj2;
            case 15:
                return (ia00) obj2;
            case 16:
                return (eih1) obj2;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (ia00) obj2;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (ia00) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (u7h1) obj2;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (ia00) obj2;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (ia00) obj2;
            case 22:
                return (ia00) obj2;
            case 23:
                return (ia00) obj2;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (eih1) obj2;
            case 25:
                return (hy00) obj2;
            default:
                return (ia00) obj2;
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                break;
            case 22:
                break;
            case 23:
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                break;
            case 25:
                break;
        }
        return this.c;
    }

    public void e(boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1047378957);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.h(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, z ? 2131958745 : 2131958746);
            qim0 qim0VarN = anm1.N("auto_mix_header_action_button", nim0.a);
            ldx ldxVar = ldx.c;
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new nc8(iu30Var, (byte) 1);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            wro1.h(new gbx(new y50(strO0), function0), ldxVar, qim0VarN, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(1697919332, new mv8(strO0, z, (byte) 0), x340Var), x340Var, 0, 6, 1016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(this, z, iu30Var, i, (byte) 4);
        }
    }

    public void f(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1265911439);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131952038);
            j2i j2iVarR = apo.r(-1764701389, new hb2(this, (byte) 0), x340Var);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new k52(iu30Var, (byte) 6);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z2 = i4 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new k52(iu30Var, (byte) 7);
                x340Var.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            boolean z3 = i4 == 4;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new ib2(iu30Var, (byte) 0);
                x340Var.s0(objT3);
            }
            tgp1.a(strO0, j2iVarR, function0, function1, (iu30) objT3, (Integer) null, x340Var, ((i3 << 15) & 3670016) | 24624, 128);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx(this, iu30Var, qim0Var2, i, (byte) 8);
        }
    }

    public void g(boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1406118809);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            luo1.a(i2 & 14, x340Var, (qim0) null, z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kf2(this, z, i, (byte) 3);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.h;
        switch (b) {
            case 0:
                return (rey0) obj2;
            case 1:
                return (js20) obj2;
            case 2:
                return (js20) obj2;
            case 3:
                return (rey0) obj2;
            case 4:
                return (ljm0) obj2;
            case 5:
                return (k8d1) obj2;
            case 6:
                return (js20) obj;
            case 7:
                return (e7m0) obj2;
            case 8:
                return (js20) obj2;
            case 9:
                return (rey0) obj2;
            case 10:
                return (ljm0) this.g;
            case 11:
                return (e7m0) obj2;
            case 12:
                return (poy0) obj;
            case 13:
                return (js20) obj2;
            case 14:
                return (rey0) obj2;
            case 15:
                return (js20) obj2;
            case 16:
                return (ljm0) obj2;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (ljm0) obj2;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (e7m0) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (js20) obj2;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (rey0) obj2;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (k8d1) obj2;
            case 22:
                return (ljm0) obj2;
            case 23:
                return (ljm0) obj2;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (k8d1) obj2;
            case 25:
                return (js20) obj2;
            default:
                return (js20) obj2;
        }
    }

    public void h(nbh nbhVar, hux huxVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-261676644);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(nbhVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarC = nbhVar.c(een.Q0, u291.r(qim0Var3, 48.0f));
            cvx cvxVar = cbx.b(x340Var).b;
            w0h1.a(huxVar, isl.a, uyn1.B(qim0VarC, 0.0f, 0.0f, 0.0f, 8.0f, 7), 0L, 0L, false, x340Var, 56 | ((i3 >> 3) & 14), 56);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, this, nbhVar, huxVar, qim0Var2, (byte) 12);
        }
    }

    public void i(wpf wpfVar, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2;
        List list;
        yve yveVar;
        xtb0 xtb0Var;
        float f;
        wpf wpfVar2;
        yve yveVar2;
        m4c m4cVar = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-39003331);
        int i2 = (i & 6) == 0 ? (x340Var3.i(wpfVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var3.i(this) ? 256 : 128;
        }
        if (x340Var3.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var3.T();
            if (objT == m4cVar) {
                x1q x1qVar = (x1q) this.e;
                String str = wpfVar.a;
                Set set = pcf.a;
                String strConcat = "spotify:chat-details:".concat(str);
                switch (x1qVar.a) {
                    case 0:
                        i2q i2qVar = x1qVar.b;
                        teq teqVar = i2qVar.b;
                        yveVar2 = new yve((lzn0) teqVar.i.get(), teqVar.a.A(), (a9d) i2qVar.c.g3.get(), str, strConcat);
                        break;
                    default:
                        teq teqVar2 = x1qVar.b.c;
                        yveVar2 = new yve((lzn0) teqVar2.i.get(), teqVar2.a.A(), (a9d) teqVar2.b.V1.get(), str, strConcat);
                        break;
                }
                objT = yveVar2;
                x340Var3.s0(objT);
            }
            yve yveVar3 = (yve) objT;
            boolean z = wpfVar.g;
            List list2 = wpfVar.d;
            if (z) {
                x340Var2 = x340Var3;
                list = list2;
                x340Var2.i0(1988514469);
                x340Var2.r(false);
            } else {
                x340Var3.i0(1988208685);
                qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var3).b;
                qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, qim0VarF);
                String strO0 = cwl1.o0(x340Var3, 2131953301);
                lee1 lee1Var = cbx.d(x340Var3).j;
                long j = cbx.a(x340Var3).b.b;
                list = list2;
                uwo1.e(strO0, qim0VarZ, lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2032);
                x340Var2 = x340Var3;
                x340Var2.r(false);
            }
            boolean zG = x340Var2.g(wpfVar);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : list) {
                    lte lteVar = (lte) this.d;
                    yve yveVar4 = yveVar3;
                    long j2 = ((vpf) obj).f;
                    Calendar calendarD = lteVar.a.d();
                    calendarD.setTimeInMillis(j2 * 1000);
                    TimeZone timeZone = TimeZone.getTimeZone(calendarD.getTimeZone().getID());
                    long timeInMillis = calendarD.getTimeInMillis();
                    Locale locale = lteVar.c;
                    android.icu.util.Calendar calendar = android.icu.util.Calendar.getInstance(timeZone, locale);
                    calendar.setTimeInMillis(timeInMillis);
                    String str2 = DateFormat.getInstanceForSkeleton("yMMMM", locale).format(calendar.getTime());
                    Object objH = linkedHashMap.get(str2);
                    if (objH == null) {
                        objH = cfm0.h(str2, linkedHashMap);
                    }
                    ((List) objH).add(obj);
                    yveVar3 = yveVar4;
                }
                yveVar = yveVar3;
                x340Var2.s0(linkedHashMap);
                objT2 = linkedHashMap;
            } else {
                yveVar = yveVar3;
            }
            Map map = (Map) objT2;
            xtb0 xtb0VarA = aub0.a(0, x340Var2, 3);
            ven0 ven0VarS = v8r.s(Boolean.valueOf(wpfVar.e), x340Var2);
            Integer numValueOf = Integer.valueOf(list.size());
            boolean zI = x340Var2.i(xtb0VarA) | x340Var2.i(ven0VarS) | x340Var2.i(wpfVar) | ((i2 & 112) == 32);
            Object objT3 = x340Var2.T();
            if (zI || objT3 == m4cVar) {
                xtb0Var = xtb0VarA;
                f = 0.0f;
                wpfVar2 = wpfVar;
                x4c x4cVar = new x4c(xtb0Var, ven0VarS, wpfVar2, iu30Var, (lnm) null, (byte) 7);
                x340Var2.s0(x4cVar);
                objT3 = x4cVar;
            } else {
                wpfVar2 = wpfVar;
                xtb0Var = xtb0VarA;
                f = 0.0f;
            }
            qxd0.s(xtb0Var, numValueOf, (vu30) objT3, x340Var2);
            zzq0 zzq0VarJ = uyn1.j(f, f, f, wpfVar2.c.a(), 7);
            boolean zI2 = x340Var2.i(map) | x340Var2.i(yveVar) | x340Var2.i(wpfVar2);
            Object objT4 = x340Var2.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new o0d((Object) map, (Object) wpfVar2, (Object) yveVar, (byte) 5);
                x340Var2.s0(objT4);
            }
            x340Var = x340Var2;
            ujo1.d((qim0) null, xtb0Var, zzq0VarJ, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT4, x340Var, 0, 505);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(this, wpfVar, iu30Var, i, (byte) 20);
        }
    }

    public void j(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-56835362);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("ucp_prompted_playlist_remove_item_button", nim0.a);
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(x340Var);
            String strO0 = cwl1.o0(x340Var, 2131963466);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            wro1.h(new gbx(new y50(strO0), function0), ldxVar, qim0VarN, (max) null, gdxVarS, (vzq0) null, false, (idn0) null, (ga80) null, ooj.a, x340Var, 0, 6, 984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xaf1(this, function0, i, (byte) 20);
        }
    }

    public void k(gf71 gf71Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        String str = gf71Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1071412182);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(gf71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zG = x340Var.g(str);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                Set set = s4b1.f;
                r6q0 r6q0Var = new r6q0(new e6q0(2131232430, 2131959382, 3, pcf.f(uic.x(pcf.f(uic.x(str)))), true));
                x340Var.s0(r6q0Var);
                objT = r6q0Var;
            }
            ucp1.b((jxp0) this.d, ((r6q0) objT).a, gf71Var, (qim0) null, function0, x340Var, ((i2 << 6) & 896) | ((i2 << 9) & 57344));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(this, gf71Var, function0, i, (byte) 18);
        }
    }

    public void l(int i, int i2, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1349618870);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(iu30Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131952056);
            j2i j2iVar = e5i.a;
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new k52(iu30Var, (byte) 8);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z2 = i5 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new k52(iu30Var, (byte) 9);
                x340Var.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            boolean z3 = i5 == 4;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new ib2(iu30Var, (byte) 1);
                x340Var.s0(objT3);
            }
            tgp1.a(strO0, j2iVar, function0, function1, (iu30) objT3, Integer.valueOf(i), x340Var, ((i4 << 18) & 29360128) | ((i4 << 12) & 3670016) | 24624, 0);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lb2(this, iu30Var, i, qim0Var2, i2, (byte) 0);
        }
    }

    public void m(int i, int i2, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i3;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-207544280);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(iu30Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            String strN0 = cwl1.n0(2131952071, new Object[]{Integer.valueOf(i)}, x340Var);
            j2i j2iVarR = apo.r(1491650922, new hb2(this, (byte) 1), x340Var);
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new k52(iu30Var, (byte) 10);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z2 = i5 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new k52(iu30Var, (byte) 11);
                x340Var.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            boolean z3 = i5 == 4;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new ib2(iu30Var, (byte) 2);
                x340Var.s0(objT3);
            }
            tgp1.a(strN0, j2iVarR, function0, function1, (iu30) objT3, Integer.valueOf(i), x340Var, ((i4 << 12) & 3670016) | 24624 | ((i4 << 18) & 29360128), 0);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lb2(this, iu30Var, i, qim0Var2, i2, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(z740 z740Var, onm onmVar) {
        hh80 hh80Var;
        if (onmVar instanceof hh80) {
            hh80Var = (hh80) onmVar;
            int i = hh80Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hh80Var.c = i - Integer.MIN_VALUE;
            } else {
                hh80Var = new hh80(this, onmVar);
            }
        } else {
            hh80Var = new hh80(this, onmVar);
        }
        Object objB = hh80Var.a;
        int i2 = hh80Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            h2i1 h2i1Var = (h2i1) this.d;
            hh80Var.c = 1;
            objB = h2i1Var.b(z740Var, e2i1.a, (fyl) null, hh80Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        z1i1 z1i1Var = (a2i1) objB;
        if (z1i1Var instanceof z1i1) {
            ila0 ila0Var = z1i1Var.a;
            if (ila0Var instanceof yyh1) {
                yyh1 yyh1Var = (yyh1) ila0Var;
                return new lh80(yyh1Var.i, yyh1Var.j, yyh1Var.k, yyh1Var.l);
            }
        } else if (!(z1i1Var instanceof y1i1)) {
            eg.o();
            return null;
        }
        return kh80.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object o(gch1 gch1Var, onm onmVar) {
        ich1 ich1Var;
        Boolean m231Var;
        Throwable thA;
        ymu0 ymu0Var;
        String str = (String) this.d;
        if (onmVar instanceof ich1) {
            ich1Var = (ich1) onmVar;
            int i = ich1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ich1Var.f = i - Integer.MIN_VALUE;
            } else {
                ich1Var = new ich1(this, onmVar);
            }
        } else {
            ich1Var = new ich1(this, onmVar);
        }
        Object objC = ich1Var.d;
        int i2 = ich1Var.f;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                iyc0 iyc0Var = (iyc0) this.e;
                List listSingletonList = Collections.singletonList(gch1Var.b);
                ich1Var.a = gch1Var;
                ich1Var.f = 1;
                objC = iyc0.c(iyc0Var, str, listSingletonList, ich1Var);
                if (objC != d9nVar) {
                }
                return d9nVar;
            }
            if (i2 == 1) {
                gch1Var = ich1Var.a;
                hm5.M(objC);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ymu0Var = ich1Var.c;
                str = ich1Var.b;
                hm5.M(objC);
            }
            m231Var = Boolean.valueOf(ymu0Var.a(new o3w(0, 1, 0, 5), str, ((cxc0) objC).f.w, true));
            thA = e331.a(m231Var);
            if (thA != null) {
                Logger.e(thA, "Failed to show snackbar after removing item.", new Object[0]);
            }
            return rih1Var;
            if (!(((py21) objC) instanceof oy21)) {
                Logger.d("Failed to remove item %s from %s", new Object[]{gch1Var.a, str});
                return rih1Var;
            }
            ymu0 ymu0Var2 = (ymu0) ((jxp) this.g).get();
            any anyVarD = ((roc0) ((koc0) this.f)).d();
            ich1Var.a = null;
            ich1Var.b = str;
            ich1Var.c = ymu0Var2;
            ich1Var.f = 2;
            objC = b5p1.i(anyVarD, ich1Var);
            if (objC != d9nVar) {
                ymu0Var = ymu0Var2;
                m231Var = Boolean.valueOf(ymu0Var.a(new o3w(0, 1, 0, 5), str, ((cxc0) objC).f.w, true));
                thA = e331.a(m231Var);
                if (thA != null) {
                    Logger.e(thA, "Failed to show snackbar after removing item.", new Object[0]);
                }
                return rih1Var;
            }
            return d9nVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public Object p(String str, v630 v630Var, onm onmVar) {
        x630 x630Var;
        String str2;
        kt91 kt91Var = (kt91) this.e;
        Context context = (Context) this.d;
        if (onmVar instanceof x630) {
            x630Var = (x630) onmVar;
            int i = x630Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                x630Var.d = i - Integer.MIN_VALUE;
            } else {
                x630Var = new x630(this, onmVar);
            }
        } else {
            x630Var = new x630(this, onmVar);
        }
        Object obj = x630Var.b;
        int i2 = x630Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                mvm mvmVar = new mvm(v630Var.b, v630Var.a, v630Var.c, new Long(v630Var.d / 1000));
                mqm mqmVar = new mqm(mvmVar, new lqm(Collections.singletonList(ovm.c), (List) null, (qle1) null, 6));
                prm prmVar = new prm(mvmVar, new num(str));
                d0r d0rVar = (d0r) this.f;
                hvm hvmVar = hvm.a;
                x630Var.a = str;
                x630Var.d = 1;
                d0rVar.getClass();
                Object objD = d0r.d(d0rVar, hvmVar, mqmVar, prmVar, x630Var);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
                str2 = str;
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = x630Var.a;
                hm5.M(obj);
            }
            kt91Var.k(new er91((fs91) null, context.getString(2131957402, str2), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            kt91Var.k(new er91((fs91) null, context.getString(2131957401), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        }
        return rih1.a;
    }

    public yp00 q(bq00 bq00Var) {
        int iOrdinal = bq00Var.ordinal();
        if (iOrdinal == 0) {
            return new xp00(1, true);
        }
        if (iOrdinal == 1) {
            return new xp00(2, true);
        }
        if (iOrdinal == 2) {
            return wp00.a;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:38:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object s(lv8 lv8Var, onm onmVar) {
        ov8 ov8Var;
        Object obj;
        lv8 lv8Var2;
        p9k0 p9k0Var;
        z9k0 z9k0Var = (z9k0) this.g;
        if (onmVar instanceof ov8) {
            ov8Var = (ov8) onmVar;
            int i = ov8Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ov8Var.d = i - Integer.MIN_VALUE;
            } else {
                ov8Var = new ov8(this, onmVar);
            }
        } else {
            ov8Var = new ov8(this, onmVar);
        }
        Object objI = ov8Var.b;
        int i2 = ov8Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            zwz0 zwz0Var = (zwz0) this.f;
            ov8Var.a = lv8Var;
            ov8Var.d = 1;
            objI = b5p1.i(zwz0Var.b(), ov8Var);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            lv8Var = ov8Var.a;
            hm5.M(objI);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lv8Var2 = ov8Var.a;
            hm5.M(objI);
            obj = ((e331) objI).a;
        }
        if (!(obj instanceof m231)) {
            if (lv8Var2.b) {
                if (lv8Var2.a) {
                    p9k0Var = p9k0.a;
                } else {
                    p9k0Var = q9k0.a;
                }
                z9k0.a(z9k0Var, p9k0Var);
            }
        }
        if (e331.a(obj) != null) {
            z9k0.a(z9k0Var, r9k0.a);
        }
        return rih1Var;
        if (((Boolean) objI).booleanValue()) {
            z9k0.a(z9k0Var, t9k0.a);
            return rih1Var;
        }
        qjk0 qjk0Var = (jjk0) this.e;
        String str = (String) this.d;
        boolean z = !lv8Var.a;
        ov8Var.a = lv8Var;
        ov8Var.d = 2;
        Object objD = qjk0Var.d(str, ov8Var, z);
        if (objD != d9nVar) {
            lv8 lv8Var3 = lv8Var;
            obj = objD;
            lv8Var2 = lv8Var3;
            if (!(obj instanceof m231)) {
                if (lv8Var2.b) {
                    if (lv8Var2.a) {
                        p9k0Var = p9k0.a;
                    } else {
                        p9k0Var = q9k0.a;
                    }
                    z9k0.a(z9k0Var, p9k0Var);
                }
            }
            if (e331.a(obj) != null) {
                z9k0.a(z9k0Var, r9k0.a);
            }
            return rih1Var;
        }
        return d9nVar;
    }

    public rwj(m1q m1qVar, lt20 lt20Var, String str) {
        this.a = (byte) 13;
        this.d = m1qVar;
        this.e = lt20Var;
        this.f = str;
        this.h = x3p1.n(new pdb0(this, (byte) 6), zib0.c1, new gs90(this, (byte) 27), (o8n) null, (iu30) null, 24);
        this.b = new eih1();
        this.g = new idd1(new pr90(this, (byte) 29));
        j2i j2iVar = new j2i(-1967947125, new pba0(this, (byte) 17), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(hyy0 hyy0Var, ycm ycmVar, idd1 idd1Var, agc0 agc0Var, uxy0 uxy0Var, pux0 pux0Var) {
        this.a = (byte) 20;
        this.e = hyy0Var;
        this.f = ycmVar;
        this.g = idd1Var;
        this.d = agc0Var;
        this.h = new rey0(new f2z0(uxy0Var, (byte) 20));
        this.b = n3o1.q(this).a(new er01(pux0Var, (byte) 0), new er01(pux0Var, (byte) 1));
        j2i j2iVar = new j2i(-2138281722, new dr01(this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(lo60 lo60Var, vgm vgmVar, agc0 agc0Var, bpb1 bpb1Var, gw70 gw70Var, i3h i3hVar, boolean z) {
        this.a = (byte) 0;
        this.d = agc0Var;
        this.e = gw70Var;
        this.f = i3hVar;
        this.g = new idd1(new qwj(bpb1Var, (byte) 0));
        this.h = new rey0(new n8k0(lo60Var, vgmVar, z, (byte) 7));
        this.b = new hy00(rwj.class.getName(), kxz0.Y0, kxz0.Z0);
        j2i j2iVar = new j2i(889717048, new rxg(this, (byte) 12), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(om80 om80Var, nxo nxoVar, d0r d0rVar, q8n q8nVar, q8n q8nVar2) {
        this.a = (byte) 11;
        this.d = nxoVar;
        this.e = d0rVar;
        this.f = q8nVar;
        this.g = q8nVar2;
        this.h = sbl.C(td80.T0, t2m.D, om80Var.d, rm80.a, new ux70(this, (byte) 9));
        this.b = new eih1();
        j2i j2iVar = new j2i(-972454797, new wv60(this, (byte) 14), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(jq jqVar, kw kwVar, uzl0 uzl0Var, lzn0 lzn0Var) {
        this.a = (byte) 1;
        this.d = jqVar;
        this.e = kwVar;
        this.f = uzl0Var;
        this.g = lzn0Var;
        this.h = x3p1.n(new is(this, (byte) 0), new is(this, (byte) 1), e3.g, (o8n) null, new is(this, (byte) 2), 8);
        this.b = n3o1.r(this).c(new m3(this, (byte) 4), n1.h);
        j2i j2iVar = t2i.b;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(gw70 gw70Var, lzn0 lzn0Var, ZoneId zoneId, Locale locale) {
        this.a = (byte) 14;
        this.e = gw70Var;
        this.d = lzn0Var;
        this.f = zoneId;
        this.g = locale;
        this.h = new rey0(new k2d0(this, (byte) 9));
        this.b = new ia00("ListeningPartyCarouselCardElement", i2d0.W0, i2d0.X0);
        j2i j2iVar = new j2i(1361703629, new qcd0(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(Context context, kt91 kt91Var, d0r d0rVar, c9n c9nVar) {
        this.a = (byte) 9;
        this.d = context;
        this.e = kt91Var;
        this.f = d0rVar;
        this.g = c9nVar;
        this.h = new rey0(new mp20(this, (byte) 2));
        j2i j2iVar = hpi.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.b = new eih1();
    }

    public rwj(Context context, kt91 kt91Var, xv61 xv61Var, i9i1 i9i1Var) {
        this.a = (byte) 2;
        this.d = context;
        this.e = kt91Var;
        this.f = xv61Var;
        this.g = i9i1Var;
        this.h = x3p1.n(new wl0(this, (byte) 0), di0.f, e3.R0, (o8n) null, new wl0(this, (byte) 1), 8);
        this.b = n3o1.q(this).a(n1.d1, n1.e1);
        j2i j2iVar = g3i.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(h2i1 h2i1Var, ij81 ij81Var, lzn0 lzn0Var) {
        this.a = (byte) 10;
        this.d = h2i1Var;
        this.e = ij81Var;
        this.f = lzn0Var;
        this.g = h7w.B(new z5z(this, (byte) 27), null, null, new bt70(this, (byte) 6), 6);
        this.h = n3o1.q(this).a(rb80.h, rb80.i);
        this.b = new c5o(this);
        j2i j2iVar = wsi.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(Flowable flowable, yge0 yge0Var, dw7 dw7Var, cw7 cw7Var) {
        this.a = (byte) 4;
        this.d = flowable;
        this.e = yge0Var;
        this.f = dw7Var;
        this.g = cw7Var;
        this.h = h7w.D(rq7.S0, null, null, new j2i(277947588, new sw1(this, (byte) 1), true), 6);
        this.b = n3o1.q(this).a(d27.P0, d27.Q0);
        j2i j2iVar = s7i.d;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(String str, iyc0 iyc0Var, koc0 koc0Var, jxp jxpVar) {
        this.a = (byte) 24;
        this.d = str;
        this.e = iyc0Var;
        this.f = koc0Var;
        this.g = jxpVar;
        this.h = k1o1.u(new xzu0((Object) this, (lnm) null, (byte) 3));
        this.b = new eih1();
        j2i j2iVar = new j2i(1561969963, new y2f1(this, (byte) 23), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(kdy0 kdy0Var, yrg0 yrg0Var, mwn0 mwn0Var, jtl1 jtl1Var) {
        this.a = (byte) 19;
        this.d = kdy0Var;
        this.e = yrg0Var;
        this.f = mwn0Var;
        this.g = jtl1Var;
        this.h = x3p1.n(new ewq0((Object) this, (byte) 28), new ewq0((Object) this, (byte) 29), new xgr0(this, (byte) 23), (o8n) null, new fbz0(this, (byte) 5), 8);
        j2i j2iVar = new j2i(-91681032, new zyy0(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.b = eth.a0((vu30) null, new f2z0(this, (byte) 8), 1);
    }

    public rwj(urk0 urk0Var, gw70 gw70Var, lko lkoVar, String str, yqg yqgVar, Flowable flowable, o241 o241Var, zr00 zr00Var, yh2 yh2Var, waz0 waz0Var, iu30 iu30Var) {
        this.a = (byte) 12;
        this.e = gw70Var;
        this.d = lkoVar;
        this.f = str;
        this.g = waz0Var;
        this.h = n3o1.q(this).a(new z63(urk0Var, (byte) 21), mx90.d1);
        this.b = d4o1.f(new uh0(flowable, o241Var, zr00Var, yh2Var, this, (byte) 27), mr90.a1, ul90.R0, new bv70(iu30Var, (byte) 24), 8);
        j2i j2iVar = new j2i(1520199587, new t20(this, yqgVar, (byte) 14), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(Activity activity, lzn0 lzn0Var, z710 z710Var, ewo ewoVar) {
        this.a = (byte) 3;
        this.d = activity;
        this.e = lzn0Var;
        this.f = z710Var;
        this.g = ewoVar;
        this.h = new rey0(new hb2(this, (byte) 2));
        this.b = n3o1.r(this).c(mm1.V0, mm1.W0);
        j2i j2iVar = new j2i(755160574, new r1(this, (byte) 25), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, dpb dpbVar) {
        this.a = (byte) 6;
        this.d = ynb0Var;
        this.e = ynb0Var2;
        this.f = ynb0Var3;
        this.g = dpbVar;
        this.h = n3o1.q(this).a(new hp9(this, (byte) 10), s1b.c);
        this.b = x3p1.n(new sgb(this, (byte) 0), c7b.Y, vq9.Y0, (o8n) null, new sgb(this, (byte) 1), 8);
        j2i j2iVar = new j2i(-1048351217, new zk9(this, (byte) 21), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(String str, jjk0 jjk0Var, zwz0 zwz0Var, b9q b9qVar, r6h1 r6h1Var) {
        this.a = (byte) 5;
        this.d = str;
        this.e = jjk0Var;
        this.f = zwz0Var;
        this.g = b9qVar.a(r6h1Var);
        this.h = k1o1.u(new r20((Object) this, (lnm) null, (byte) 10));
        this.b = n3o1.q(this).a(jb8.O0, jb8.P0);
        j2i j2iVar = new j2i(-1925375581, new i43(this, (byte) 27), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(n0b1 n0b1Var, n0b1 n0b1Var2, ruz ruzVar, Flowable flowable) {
        this.a = (byte) 22;
        this.d = n0b1Var;
        this.e = n0b1Var2;
        this.f = ruzVar;
        vbm[] vbmVarArr = q601.a;
        this.g = rqt0.u(new h801(new kge(flowable), (byte) 16));
        this.h = h7w.B(qva1.a1, null, null, new cq61(this, (byte) 28), 6);
        this.b = n3o1.q(this).a(vva1.h, vva1.i);
        j2i j2iVar = ukj.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(jxp0 jxp0Var, k7d k7dVar, wb2 wb2Var, m971 m971Var, opl0 opl0Var) {
        this.a = (byte) 21;
        this.d = jxp0Var;
        this.e = k7dVar;
        this.f = wb2Var;
        this.g = opl0Var;
        this.h = k1o1.u(new kw0(this, (lnm) null, (byte) 14));
        this.b = n3o1.q(this).a(new cq61(this, (byte) 7), vy61.P0);
        j2i j2iVar = new j2i(-938527421, new c771(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(hwb hwbVar, lzn0 lzn0Var, v5n v5nVar, String str, af10 af10Var) {
        this.a = (byte) 26;
        this.d = lzn0Var;
        this.e = v5nVar;
        this.f = str;
        this.g = af10Var;
        byte b = 0;
        this.h = x3p1.n(new ebm1(this, b), m5m1.e1, new c1j1(this, (byte) 13), (o8n) null, new ebm1(this, (byte) 1), 8);
        j2i j2iVar = new j2i(991616751, new fbm1(this, b), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.b = n3o1.q(this).a(yxl1.i, yxl1.t);
    }

    public rwj(l0y l0yVar, k0y k0yVar, mwn0 mwn0Var, hnl hnlVar) {
        this.a = (byte) 8;
        this.d = l0yVar;
        this.e = k0yVar;
        this.f = mwn0Var;
        u601 u601VarD = hnlVar.d();
        this.g = u601VarD;
        this.h = x3p1.m(new evz(r4p1.k(u601VarD.a(), 200L), this, (byte) 3), new zp00(this, (byte) 0), yty.S0, (o8n) null, new zp00(this, (byte) 1), 8);
        j2i j2iVar = new j2i(-1642354726, new xyh(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.b = n3o1.q(this).a(c0z.d1, c0z.e1);
    }

    public rwj(z8b0 z8b0Var, Map map, rn8 rn8Var, w6e0 w6e0Var) {
        this.a = (byte) 16;
        this.d = map;
        this.e = rn8Var;
        this.f = w6e0Var;
        this.g = new tlj0(map, z8b0Var);
        this.h = h7w.B(new r7j0(this, (byte) 4), null, null, new pah0(this, (byte) 9), 6);
        j2i j2iVar = new j2i(-221635509, new y3i0(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.b = new eih1();
    }

    public rwj(lpf lpfVar, lte lteVar, x1q x1qVar, q8n q8nVar, q8n q8nVar2) {
        this.a = (byte) 7;
        this.d = lteVar;
        this.e = x1qVar;
        this.f = q8nVar;
        this.g = q8nVar2;
        this.h = sbl.z(new wpf("", 0, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (List) null, false, false, 120), n4.v, lpfVar.d, eqe.Y, new m4d(this, (byte) 27));
        this.b = n3o1.q(this).a(r0f.X, r0f.Y);
        j2i j2iVar = new j2i(-2129472017, new gtd(this, (byte) 21), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(Context context, jkp0 jkp0Var, opl0 opl0Var, wh71 wh71Var, fjb fjbVar) {
        this.a = (byte) 17;
        this.d = context;
        this.e = jkp0Var;
        this.f = opl0Var;
        this.g = wh71Var;
        this.h = h7w.B(cwp0.U0, null, null, new p6q0(this, (byte) 0), 6);
        this.b = n3o1.q(this).a(new p6q0(this, (byte) 1), rmp0.R0);
        j2i j2iVar = v4j.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(String str, c4y0 c4y0Var, r3y0 r3y0Var, asn asnVar, ktv ktvVar, m980 m980Var) {
        this.a = (byte) 18;
        this.d = str;
        this.e = c4y0Var;
        this.f = asnVar;
        this.g = m980Var;
        this.h = n3o1.q(this).a(cnx0.R0, new ixt0(this, (byte) 16));
        this.b = sbl.B(new z3y0(false, w7x.a, (g3d0) null, (cio) null), t7p0.n, r3y0Var, gbw0.c1, new hox0(this, (byte) 9));
        j2i j2iVar = new j2i(-2300309, new qsu0(this, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(Context context, o860 o860Var, kt91 kt91Var, csc1 csc1Var) {
        this.a = (byte) 23;
        this.d = context;
        this.e = o860Var;
        this.f = kt91Var;
        this.g = csc1Var;
        this.h = h7w.D(ljc1.X, null, ljc1.Z, new j2i(-1109299681, new wcy0(this, (byte) 17), true), 2);
        this.b = n3o1.q(this).a(m1c1.Z, m1c1.N0);
        j2i j2iVar = new j2i(-475533527, new vsb1(this, (byte) 10), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public rwj(z710 z710Var, lzn0 lzn0Var, i8h1 i8h1Var, zob1 zob1Var) {
        this.a = (byte) 25;
        this.d = z710Var;
        this.e = lzn0Var;
        this.f = i8h1Var;
        this.g = zob1Var;
        this.h = z0o1.j(new j3j1(this, (byte) 0), zhi1.i, new j3j1(this, (byte) 1), 4);
        this.b = n3o1.r(this).c(ruh1.e1, k3j1.b);
        j2i j2iVar = new j2i(-813308152, new l6i1(this, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }
}
