package p;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.WebViewTemplate;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import j$.time.LocalDateTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sqk extends hab0 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqk(cua cuaVar, cvx cvxVar) {
        super(2);
        this.a = (byte) 28;
    }

    /* JADX WARN: Code duplicated, block: B:223:0x0539  */
    /* JADX WARN: Code duplicated, block: B:225:0x053f  */
    /* JADX WARN: Code duplicated, block: B:228:0x054a  */
    /* JADX WARN: Code duplicated, block: B:230:0x0551  */
    /* JADX WARN: Code duplicated, block: B:233:0x055c  */
    /* JADX WARN: Code duplicated, block: B:344:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:360:0x0805  */
    /* JADX WARN: Code duplicated, block: B:395:0x08c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:396:0x08c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:397:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:399:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:401:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:402:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:403:0x08db  */
    /* JADX WARN: Code duplicated, block: B:404:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:406:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:408:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:409:0x08f5  */
    /* JADX WARN: Code duplicated, block: B:411:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:412:0x08fb  */
    /* JADX WARN: Code duplicated, block: B:414:0x0903  */
    /* JADX WARN: Code duplicated, block: B:421:0x0939  */
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int iC;
        String str2;
        String strF;
        rnt rntVar;
        String str3;
        String str4;
        up70 up70Var;
        goj0 goj0VarA;
        int i;
        boolean z;
        int i2;
        String str5;
        int i3;
        fun funVar;
        String str6;
        w1o z1oVar;
        String str7;
        w1o z1oVar2;
        w1o w1oVar;
        w1o y1oVar;
        goj0 goj0VarA2;
        goj0 goj0VarA3;
        goj0 goj0VarA4;
        byte b = this.a;
        String str8 = "";
        vp70 vp70Var = vp70.c;
        u1o u1oVar = u1o.a;
        rih1 rih1Var = rih1.a;
        iwq iwqVar = null;
        switch (b) {
            case 0:
                vqk vqkVar = (vqk) obj;
                oqk oqkVar = (oqk) u890.G((k1r) obj2);
                if (oqkVar == null) {
                    return pqk.f33p;
                }
                j6k j6kVar = oqkVar.a;
                lhe0 lhe0Var = oqkVar.b;
                rnt rntVar2 = lhe0Var.b;
                String str9 = lhe0Var.a;
                jo70 jo70Var = oqkVar.d;
                xkk1 xkk1Var = oqkVar.e;
                k7r k7rVar = j6kVar.c.a;
                OffsetDateTime offsetDateTimePlusMinutes = LocalDateTime.parse(k7rVar.a, DateTimeFormatter.ISO_DATE_TIME).atOffset(ZoneOffset.UTC).plusMinutes(k7rVar.b);
                int iC2 = l1d.C(vqkVar.e);
                if (iC2 != 0) {
                    if (iC2 == 1) {
                        rnt rntVar3 = rntVar2 instanceof rnt ? rntVar2 : null;
                        String str10 = rntVar3 != null ? rntVar3.a : null;
                        if (str10 != null) {
                            str = str10;
                        }
                        String str11 = vqkVar.a;
                        af5 af5Var = vqkVar.b;
                        u7h u7hVar = vqkVar.c;
                        iC = l1d.C(vqkVar.f);
                        if (iC != 0) {
                            str2 = offsetDateTimePlusMinutes.format(lfk.a);
                            if (rntVar2 instanceof rnt) {
                                if (rntVar2 instanceof rnt) {
                                    rntVar = rntVar2;
                                } else {
                                    rntVar = null;
                                }
                                if (rntVar != null) {
                                    str3 = rntVar.a;
                                } else {
                                    str3 = null;
                                }
                                strF = cy30.p(str2, " • ", str9, ", ", str3);
                            } else {
                                strF = f4i1.f(str2, " • ", str9);
                            }
                        } else if (iC != 1) {
                            strF = f4i1.f(lfk.a(offsetDateTimePlusMinutes), " • ", str9);
                        } else if (iC != 2) {
                            strF = lfk.a(offsetDateTimePlusMinutes);
                        } else if (iC != 3) {
                            strF = f4i1.f(lfk.a(offsetDateTimePlusMinutes), " • ", str9);
                        } else {
                            eg.o();
                        }
                        String str12 = strF;
                        String displayName = offsetDateTimePlusMinutes.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault());
                        String strValueOf = String.valueOf(offsetDateTimePlusMinutes.getDayOfMonth());
                        boolean z2 = oqkVar.c;
                        if (vqkVar.d || xkk1Var == null || (up70Var = (up70) o7h.s0(xkk1Var.a.a)) == null) {
                            str4 = null;
                        } else {
                            str4 = up70Var.a.a;
                        }
                        return new pqk(str11, af5Var, u7hVar, str, str12, displayName, strValueOf, z2, str4, vqkVar.g, vqkVar.h, vqkVar.i, vqkVar.j, vqkVar.k, 0L, 16384);
                    }
                    eg.o();
                    return null;
                }
                str8 = jo70Var.a;
                str = str8;
                String str13 = vqkVar.a;
                af5 af5Var2 = vqkVar.b;
                u7h u7hVar2 = vqkVar.c;
                iC = l1d.C(vqkVar.f);
                if (iC != 0) {
                    str2 = offsetDateTimePlusMinutes.format(lfk.a);
                    if (rntVar2 instanceof rnt) {
                        if (rntVar2 instanceof rnt) {
                            rntVar = rntVar2;
                        } else {
                            rntVar = null;
                        }
                        if (rntVar != null) {
                            str3 = rntVar.a;
                        } else {
                            str3 = null;
                        }
                        strF = cy30.p(str2, " • ", str9, ", ", str3);
                    } else {
                        strF = f4i1.f(str2, " • ", str9);
                    }
                } else if (iC != 1) {
                    strF = f4i1.f(lfk.a(offsetDateTimePlusMinutes), " • ", str9);
                } else if (iC != 2) {
                    strF = lfk.a(offsetDateTimePlusMinutes);
                } else {
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    strF = f4i1.f(lfk.a(offsetDateTimePlusMinutes), " • ", str9);
                }
                String str14 = strF;
                String displayName2 = offsetDateTimePlusMinutes.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault());
                String strValueOf2 = String.valueOf(offsetDateTimePlusMinutes.getDayOfMonth());
                boolean z3 = oqkVar.c;
                if (vqkVar.d) {
                    str4 = null;
                } else {
                    str4 = null;
                }
                return new pqk(str13, af5Var2, u7hVar2, str, str14, displayName2, strValueOf2, z3, str4, vqkVar.g, vqkVar.h, vqkVar.i, vqkVar.j, vqkVar.k, 0L, 16384);
            case 1:
                mmr0 mmr0Var = (mmr0) obj2;
                ioj0 ioj0Var = (ioj0) mmr0Var.a;
                int iIntValue = ((Number) mmr0Var.b).intValue();
                hoj0 hoj0VarC = ioj0Var.c(hll.class, ((bll) obj).a);
                hll hllVar = (hll) ((hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null) ? null : (ez00) goj0VarA.a);
                return hllVar != null ? new cll(iIntValue, hllVar.a) : new cll();
            case 2:
                gcm gcmVar = (gcm) obj;
                icm icmVar = (icm) obj2;
                boolean z4 = icmVar.c;
                if (icmVar.a) {
                    i = 2;
                } else if (icmVar.b) {
                    String str15 = gcmVar.a;
                    Set set = s4b1.f;
                    if (uic.g(str15, blc0.ti) && icmVar.f && !icmVar.d) {
                        i = 3;
                    } else {
                        i = 1;
                    }
                } else {
                    i = 1;
                }
                return new jcm(gcmVar, i, z4, icmVar.e);
            case 3:
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj2).track().b();
                List listM = p7h.M(new String[]{"spotify:track:", "spotify:room:", "spotify:local:"});
                if ((listM instanceof Collection) && listM.isEmpty()) {
                    z = l4o1.P(contextTrack) ? true : true;
                } else {
                    Iterator it = listM.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (nhc1.Y(contextTrack.uri(), (String) it.next(), false)) {
                            }
                        } else if (l4o1.P(contextTrack) && !l4o1.L(contextTrack)) {
                            z = false;
                        }
                    }
                }
                String strF0 = l4o1.f0(contextTrack);
                str8 = strF0 != null ? strF0 : "";
                if (nhc1.Y(contextTrack.uri(), "spotify:track:", false) || nhc1.Y(contextTrack.uri(), "spotify:local:", false)) {
                    i2 = 1;
                } else if (l4o1.P(contextTrack)) {
                    i2 = 2;
                } else if (nhc1.Y(contextTrack.uri(), "spotify:room:", false)) {
                    i2 = 3;
                } else if (l4o1.L(contextTrack)) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                return new iem(str8, i2, z);
            case 4:
                nhm nhmVar = (nhm) obj;
                return new ohm(nhmVar.a, nhmVar.b, nhmVar.c);
            case 5:
                ((Number) obj2).intValue();
                fxm.e((b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                nho1.c((b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                dym.b((b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                oho1.r((b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                zcn zcnVar = (zcn) obj;
                Bundle bundle = (Bundle) obj2;
                cqz0 cqz0Var = dqz0.a;
                int i4 = zcnVar.c;
                if (bundle == null) {
                    return rno1.i(zcnVar);
                }
                adn adnVar = (adn) jhc1.t(bundle, "coverArtSnakeModel", adn.class);
                if (adnVar == null) {
                    return rno1.i(zcnVar);
                }
                adn adnVarA = adn.a(adnVar, zcnVar.b, 0, (yy30) null, (mu91) null, (zhd) null, 0, 0, 0, 0, (String) null, (String) null, (List) null, false, (List) null, 0, 131067);
                int i5 = adnVarA.d;
                List listL = adnVarA.P0;
                int iOrdinal = adnVarA.e.ordinal();
                if (iOrdinal != 2) {
                    if (iOrdinal != 4 && iOrdinal != 5) {
                        return rno1.i(zcnVar);
                    }
                    int iMax = Math.max(i5, i4);
                    mu91 mu91Var = (adnVarA.i <= 0 || (i3 = adnVarA.t) <= 0) ? adnVarA.f : new mu91(Collections.singletonList(new hg50(0, i3 / 2)), t5u.d);
                    z6x z6xVar = z6x.a;
                    return adn.a(adnVarA, (List) null, iMax, (yy30) null, mu91Var, (zhd) null, 0, 0, 0, 0, (String) null, (String) null, z6xVar, false, z6xVar, 0, 90071);
                }
                if (listL.isEmpty()) {
                    String str16 = adnVarA.Y;
                    if (str16 == null) {
                        zhd zhdVar = adnVarA.g;
                        str5 = zhdVar != null ? zhdVar.b : null;
                    } else {
                        str5 = str16;
                    }
                    List list = zcnVar.b;
                    listL = str5 != null ? rzn1.l(list, str5, cqz0Var) : o7h.d1(p7h.R(list, cqz0Var), 10);
                }
                return adn.a(adnVarA, (List) null, Math.max(i5, i4), (yy30) null, (mu91) null, (zhd) null, 0, 0, 0, 0, (String) null, (String) null, (List) null, false, listL, 0, 98295);
            case 10:
                bun bunVar = (bun) obj;
                gun gunVar = (iun) obj2;
                boolean z5 = gunVar instanceof gun;
                if (!z5) {
                    if (gunVar instanceof hun) {
                        funVar = ((hun) gunVar).c;
                    } else {
                        eg.o();
                    }
                    return null;
                }
                funVar = gunVar.a;
                fun funVar2 = funVar;
                if (z5 || (gunVar instanceof hun)) {
                    return First.b(new hun(bunVar.a, (CharSequence) null, funVar2, (Integer) null, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, false, false));
                }
                eg.o();
                return null;
            case 11:
                p1o p1oVar = (p1o) obj2;
                o2o o2oVar = p1oVar.a;
                if (o2oVar == null) {
                    return u1oVar;
                }
                String str17 = o2oVar.a;
                String str18 = o2oVar.e;
                String str19 = o2oVar.g;
                String str20 = o2oVar.b;
                String str21 = o2oVar.c;
                String str22 = o2oVar.d;
                xkk1 xkk1Var2 = p1oVar.b;
                if (xkk1Var2 != null) {
                    up70 up70VarA = xkk1Var2.a.a(vp70Var);
                    str6 = up70VarA != null ? up70VarA.a.a : null;
                } else {
                    str6 = null;
                }
                jo70 jo70Var2 = p1oVar.c;
                String str23 = jo70Var2 != null ? jo70Var2.a : null;
                String str24 = o2oVar.h;
                String str25 = !ihc1.y0(str24) ? str24 : null;
                Locale locale = Locale.ROOT;
                String lowerCase = str17.toLowerCase(locale);
                int iHashCode = lowerCase.hashCode();
                if (iHashCode != 103785407) {
                    if (iHashCode != 1591703009) {
                        if (iHashCode == 1731766418 && lowerCase.equals("concert_local")) {
                            long j = o2oVar.j;
                            if (ihc1.y0(str19)) {
                                str19 = null;
                            }
                            z1oVar = new w1o(j, str19);
                        } else if (ihc1.y0(str19)) {
                            String lowerCase2 = str17.toLowerCase(locale);
                            if (ihc1.y0(str18)) {
                                str18 = null;
                            }
                            z1oVar = new y1o(lowerCase2, str18);
                        } else {
                            String lowerCase3 = str17.toLowerCase(locale);
                            if (ihc1.y0(str18)) {
                                str18 = null;
                            }
                            z1oVar = new x1o(lowerCase3, str18, str19);
                        }
                    } else if (lowerCase.equals("music_video")) {
                        if (ihc1.y0(str19)) {
                            if (ihc1.y0(str18)) {
                                str18 = null;
                            }
                            z1oVar = new y1o("video", str18);
                        } else {
                            if (ihc1.y0(str18)) {
                                str18 = null;
                            }
                            z1oVar = new a2o(str18, str19);
                        }
                    } else if (ihc1.y0(str19)) {
                        String lowerCase4 = str17.toLowerCase(locale);
                        if (ihc1.y0(str18)) {
                            str18 = null;
                        }
                        z1oVar = new x1o(lowerCase4, str18, str19);
                    } else {
                        String lowerCase5 = str17.toLowerCase(locale);
                        if (ihc1.y0(str18)) {
                            str18 = null;
                        }
                        z1oVar = new y1o(lowerCase5, str18);
                    }
                } else if (lowerCase.equals("merch")) {
                    String str26 = o2oVar.n;
                    if (ihc1.y0(str26)) {
                        str26 = null;
                    }
                    if (ihc1.y0(str19)) {
                        str19 = null;
                    }
                    z1oVar = new z1o(str26, str19);
                } else if (ihc1.y0(str19)) {
                    String lowerCase6 = str17.toLowerCase(locale);
                    if (ihc1.y0(str18)) {
                        str18 = null;
                    }
                    z1oVar = new x1o(lowerCase6, str18, str19);
                } else {
                    String lowerCase7 = str17.toLowerCase(locale);
                    if (ihc1.y0(str18)) {
                        str18 = null;
                    }
                    z1oVar = new y1o(lowerCase7, str18);
                }
                return new v1o(str20, str21, str22, z1oVar, str6, str23, str25);
            case 12:
                ioj0 ioj0Var2 = (ioj0) obj2;
                String str27 = ((i2o) obj).a;
                hoj0 hoj0VarC2 = ioj0Var2.c(o2o.class, str27);
                o2o o2oVar2 = (o2o) ((hoj0VarC2 == null || (goj0VarA4 = hoj0VarC2.a()) == null) ? null : (ez00) goj0VarA4.a);
                if (o2oVar2 == null) {
                    return u1oVar;
                }
                String str28 = o2oVar2.a;
                String str29 = o2oVar2.e;
                String str30 = o2oVar2.g;
                hoj0 hoj0VarC3 = ioj0Var2.c(xkk1.class, str27);
                xkk1 xkk1Var3 = (xkk1) ((hoj0VarC3 == null || (goj0VarA3 = hoj0VarC3.a()) == null) ? null : (ez00) goj0VarA3.a);
                hoj0 hoj0VarC4 = ioj0Var2.c(jo70.class, str27);
                jo70 jo70Var3 = (jo70) ((hoj0VarC4 == null || (goj0VarA2 = hoj0VarC4.a()) == null) ? null : (ez00) goj0VarA2.a);
                String str31 = o2oVar2.b;
                String str32 = o2oVar2.c;
                String str33 = o2oVar2.d;
                if (xkk1Var3 != null) {
                    up70 up70VarA2 = xkk1Var3.a.a(vp70Var);
                    str7 = up70VarA2 != null ? up70VarA2.a.a : null;
                } else {
                    str7 = null;
                }
                String str34 = jo70Var3 != null ? jo70Var3.a : null;
                String str35 = o2oVar2.h;
                String str36 = !ihc1.y0(str35) ? str35 : null;
                Locale locale2 = Locale.ROOT;
                String lowerCase8 = str28.toLowerCase(locale2);
                int iHashCode2 = lowerCase8.hashCode();
                if (iHashCode2 == 103785407) {
                    if (lowerCase8.equals("merch")) {
                        String str37 = o2oVar2.n;
                        if (ihc1.y0(str37)) {
                            str37 = null;
                        }
                        if (ihc1.y0(str30)) {
                            str30 = null;
                        }
                        z1oVar2 = new z1o(str37, str30);
                    }
                    w1oVar = z1oVar2;
                    return new v1o(str31, str32, str33, w1oVar, str7, str34, str36);
                }
                if (iHashCode2 != 1591703009) {
                    if (iHashCode2 == 1731766418 && lowerCase8.equals("concert_local")) {
                        long j2 = o2oVar2.j;
                        if (ihc1.y0(str30)) {
                            str30 = null;
                        }
                        y1oVar = new w1o(j2, str30);
                        w1oVar = y1oVar;
                    }
                } else if (lowerCase8.equals("music_video")) {
                    if (ihc1.y0(str30)) {
                        if (ihc1.y0(str29)) {
                            str29 = null;
                        }
                        y1oVar = new y1o("video", str29);
                    } else {
                        if (ihc1.y0(str29)) {
                            str29 = null;
                        }
                        y1oVar = new a2o(str29, str30);
                    }
                    w1oVar = y1oVar;
                }
                return new v1o(str31, str32, str33, w1oVar, str7, str34, str36);
                if (ihc1.y0(str30)) {
                    String lowerCase9 = str28.toLowerCase(locale2);
                    if (ihc1.y0(str29)) {
                        str29 = null;
                    }
                    z1oVar2 = new y1o(lowerCase9, str29);
                } else {
                    String lowerCase10 = str28.toLowerCase(locale2);
                    if (ihc1.y0(str29)) {
                        str29 = null;
                    }
                    z1oVar2 = new x1o(lowerCase10, str29, str30);
                }
                w1oVar = z1oVar2;
                return new v1o(str31, str32, str33, w1oVar, str7, str34, str36);
            case 13:
                f9o f9oVar = (Parcelable) jhc1.t((Bundle) obj, "externalState", f9o.class);
                f9oVar.getClass();
                return new g9o((uqo) obj2, f9oVar);
            case 14:
                f9o f9oVar2 = (Parcelable) jhc1.t((Bundle) obj, "externalState", f9o.class);
                f9oVar2.getClass();
                return new g9o((uqo) obj2, f9oVar2);
            case 15:
                x340 x340Var = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fuo1.m(0, 0, x340Var2, (qim0) null);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var3 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    fuo1.m(12, 0, x340Var4, (qim0) null);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return efm.f((cno) obj, (kcz0) u890.G((k1r) obj2));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((Number) obj2).intValue();
                g2p1.a((b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                g2p1.d((b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                g2p1.e((b0k) obj, czo1.p(1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((Number) obj2).intValue();
                g2p1.h((b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                lk50 lk50Var = (lk50) obj;
                String str38 = lk50Var.a.a;
                return new zv31(str38, new uzd1(lk50Var.b, 1), new qk70(sqe.t(hqq0.l0(lk50Var.c), false, 0)), false, true, (List) null, (List) null, (ArrayList) null, new cp50(str38, (String) obj2), 480);
            case 23:
                lk50 lk50Var2 = (lk50) obj;
                String str39 = (String) obj2;
                gq50 gq50Var = lk50Var2.f;
                rk50 rk50Var = lk50Var2.g;
                String str40 = lk50Var2.a.a;
                boolean z6 = gq50Var == gq50.d;
                uzd1 uzd1Var = new uzd1(lk50Var2.b, 1);
                qk70 qk70Var = new qk70(sqe.t(hqq0.l0(lk50Var2.c), false, 0));
                mk50 mk50Var = lk50Var2.e;
                return new zv31(str40, uzd1Var, qk70Var, false, true, (List) null, (List) null, (ArrayList) null, new op50(str40, str39, mk50Var.a, mk50Var.b, rk50Var != null ? Double.valueOf(rk50Var.a) : null, rk50Var != null ? rk50Var.b : null, z6), 480);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                qgj0 qgj0Var = (qgj0) obj;
                return Next.h(rgj0.a((rgj0) obj2, qgj0Var.a, qgj0Var.b, qgj0Var.c, (myo1) null, 0, qgj0Var.d, 56));
            case 25:
                qgj0 qgj0Var2 = (qgj0) obj;
                return First.b(rgj0.a((rgj0) obj2, qgj0Var2.a, qgj0Var2.b, qgj0Var2.c, (myo1) null, 0, qgj0Var2.d, 56));
            case 26:
                thj0 thj0Var = (thj0) obj;
                uhj0 uhj0Var = (uhj0) obj2;
                WebViewTemplate.BasicWebView basicWebViewI = p3d1.i(thj0Var.a);
                MessageResponseToken messageResponseToken = thj0Var.a;
                if (basicWebViewI instanceof WebViewTemplate.BasicWebView) {
                    WebViewTemplate.BasicWebView basicWebView = basicWebViewI;
                    iwqVar = new iwq(basicWebView.getWebModalUri(), basicWebView.getDismissUriSuffix());
                }
                return Next.h(uhj0.a(uhj0Var, messageResponseToken, iwqVar, (String) null, false, false, (yhj0) null, false, (shj0) null, (Bundle) null, 508));
            case 27:
                ((Number) obj2).intValue();
                x340 x340Var5 = (b0k) obj;
                x340Var5.i0(-298281962);
                mds mdsVar = new mds();
                x340Var5.r(false);
                return mdsVar;
            case 28:
                x340 x340Var6 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarQ = i1p1.q(u291.d(nim0Var, 1.0f), er31.b(8.0f));
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarX = uyn1.x(dug.f(qim0VarQ, cbx.a(x340Var7).a.c, d4o1.a), 8.0f);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var7, 0);
                    int iHashCode3 = Long.hashCode(x340Var7.T);
                    xos0 xos0VarM = x340Var7.m();
                    qim0 qim0VarE = zr7.E(x340Var7, qim0VarX);
                    hzj.A.getClass();
                    if (x340Var7.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var7.m0();
                    if (x340Var7.S) {
                        x340Var7.l(hmb0.t1);
                    } else {
                        x340Var7.v0();
                    }
                    nko1.H(mbhVarA, x340Var7, y580.O0);
                    nko1.H(xos0VarM, x340Var7, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var7, y580.R0);
                    nko1.F(x340Var7);
                    nko1.H(qim0VarE, x340Var7, y580.Y);
                    eso1.h(hso1.G(wsx.c, u7h.f, u7h.d, x340Var7, wsx.d, 20), new jsl("Spotify"), i1p1.q(d7e.r(1.0f, u291.f(nim0Var, 1.0f), false), er31.b(4.0f)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var7, 8, 504);
                    uwo1.e("Spotify", (qim0) null, kk0.p(nim0Var, 8.0f, x340Var7, x340Var7).k, cbx.a(x340Var7).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var7, 6, 0, 1714);
                    x340Var7.r(true);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                bwp0.a((b0k) obj, czo1.p(7));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sqk(int i, byte b) {
        super(i);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sqk(Object obj, byte b) {
        super(2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sqk(byte b, int i, boolean z) {
        super(2);
        this.a = b;
    }
}
