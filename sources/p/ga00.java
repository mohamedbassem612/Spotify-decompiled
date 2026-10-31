package p;

import android.content.Context;
import android.graphics.Color;
import com.google.protobuf.Timestamp;
import com.google.type.DateTime;
import com.google.type.Money;
import com.spotify.concertpageview.v1.PlaceHolderText;
import com.spotify.concertpageview.v1.PlaceholderValue;
import com.spotify.concertpageview.v1.SourceReference;
import com.spotify.concertpageview.v1.TimelineAction;
import com.spotify.concertpageview.v1.TimelineEntry;
import com.spotify.mobius.functions.Function;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ga00 implements Function {
    public final e7r a;
    public final qfl1 b;
    public final xrk c;
    public final yqg d;

    public ga00(e7r e7rVar, v9c v9cVar, qfl1 qfl1Var, xrk xrkVar, yqg yqgVar) {
        this.a = e7rVar;
        this.b = qfl1Var;
        this.c = xrkVar;
        this.d = yqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    public static boolean a(TimelineAction timelineAction, SourceReference sourceReference) {
        String strN;
        if (timelineAction.getDisabled() || timelineAction.n() == tqe1.BEHAVIOR_UNSPECIFIED) {
            return false;
        }
        int i = ea00.a[timelineAction.n().ordinal()];
        if (i == 1) {
            if (timelineAction.hasUri() || ihc1.y0(timelineAction.getUri())) {
            }
        } else if (i != 5) {
            if (i == 6) {
                return timelineAction.hasUri() ? false : false;
            }
        } else if ((!timelineAction.hasUri() || ihc1.y0(timelineAction.getUri())) && (sourceReference == null || (strN = sourceReference.n()) == null || !(!ihc1.y0(strN)))) {
            return false;
        }
        return true;
    }

    public static boolean b(TimelineEntry timelineEntry) {
        return (timelineEntry.x() == plx0.e || timelineEntry.z() == j0z.e || timelineEntry.z() == j0z.f || timelineEntry.z() == j0z.g) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static String c(TimelineAction timelineAction, SourceReference sourceReference) {
        String strN;
        String uri = timelineAction.getUri();
        if (timelineAction.hasUri()) {
            uri.getClass();
            if (ihc1.y0(uri)) {
                uri = null;
            }
        } else {
            uri = null;
        }
        if (uri != null) {
            return uri;
        }
        if (sourceReference == null || (strN = sourceReference.n()) == null || timelineAction.n() != tqe1.SEE_ALL_SHOWS || ihc1.y0(strN)) {
            return null;
        }
        return strN;
    }

    public static SourceReference e(TimelineEntry timelineEntry) {
        if (timelineEntry.hasSource()) {
            return timelineEntry.y();
        }
        return null;
    }

    public static uqe1 f(fse1 fse1Var) {
        switch (fse1Var.ordinal()) {
            case 1:
                return new uqe1(bnx.c, false);
            case 2:
                return new uqe1(ttx.c, false);
            case 3:
                return new uqe1(eox.c, false);
            case 4:
                return new uqe1(wsx.c, false);
            case 5:
                return new uqe1(grx.c, false);
            case 6:
                return new uqe1(jpx.c, false);
            case 7:
                return new uqe1(jpx.c, true);
            case 8:
                return new uqe1(dnx.c, false);
            default:
                return null;
        }
    }

    public static u7h g(String str) {
        u7h m231Var;
        try {
            m231Var = new u7h(z4p1.e(Color.parseColor(str)));
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        return m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    public static pje1 i(TimelineEntry timelineEntry, String str, int i, int i2) {
        String str2;
        int i3;
        oje1 oje1Var;
        oje1 nje1Var;
        String strN;
        String strN2;
        String strN3;
        SourceReference sourceReferenceE = e(timelineEntry);
        if (sourceReferenceE == null || (strN3 = sourceReferenceE.n()) == null) {
            str2 = str;
        } else {
            if (ihc1.y0(strN3)) {
                strN3 = null;
            }
            if (strN3 == null) {
                str2 = str;
            } else {
                str2 = strN3;
            }
        }
        switch (timelineEntry.z().ordinal()) {
            case 0:
            case 7:
                i3 = 1;
                break;
            case 1:
                i3 = 2;
                break;
            case 2:
                i3 = 3;
                break;
            case 3:
                i3 = 4;
                break;
            case 4:
                i3 = 5;
                break;
            case 5:
                i3 = 6;
                break;
            case 6:
                i3 = 7;
                break;
            default:
                eg.o();
                return null;
        }
        int i4 = i3;
        String strR = sourceReferenceE != null ? sourceReferenceE.r() : null;
        String str3 = strR == null ? "" : strR;
        TimelineAction timelineActionO = timelineEntry.F() ? timelineEntry.o() : null;
        if (timelineActionO != null) {
            switch (timelineActionO.n()) {
                case BEHAVIOR_UNSPECIFIED:
                case SHARE:
                case UNRECOGNIZED:
                    nje1Var = null;
                    break;
                case EXTERNAL_PURCHASE:
                    String uri = timelineActionO.getUri();
                    if (timelineActionO.hasUri()) {
                        uri.getClass();
                        if (ihc1.y0(uri)) {
                            uri = null;
                        }
                    } else {
                        uri = null;
                    }
                    if (uri == null) {
                        nje1Var = null;
                    } else {
                        String strQ = sourceReferenceE != null ? sourceReferenceE.q() : null;
                        nje1Var = new nje1(strQ != null ? strQ : "", uri);
                    }
                    break;
                case CURATE:
                    if (sourceReferenceE == null || (strN = sourceReferenceE.n()) == null) {
                        nje1Var = null;
                    } else {
                        if (ihc1.y0(strN)) {
                            strN = null;
                        }
                        nje1Var = strN == null ? null : new kje1(strN);
                    }
                    break;
                case CANT_ATTEND:
                    nje1Var = jje1.a;
                    break;
                case NOT_INTERESTED:
                    if (sourceReferenceE == null || (strN2 = sourceReferenceE.n()) == null) {
                        nje1Var = null;
                    } else {
                        if (ihc1.y0(strN2)) {
                            strN2 = null;
                        }
                        nje1Var = strN2 == null ? null : new mje1(strN2);
                    }
                    break;
                case SEE_ALL_SHOWS:
                case NAVIGATE:
                    String strC = c(timelineActionO, sourceReferenceE);
                    nje1Var = strC == null ? null : new lje1(strC);
                    break;
                default:
                    eg.o();
                    return null;
            }
            oje1Var = nje1Var;
        } else {
            oje1Var = null;
        }
        TimelineAction timelineActionS = timelineEntry.J() ? timelineEntry.s() : null;
        return new pje1(str, i2, i, i4, str3, str2, oje1Var, timelineActionS != null ? c(timelineActionS, sourceReferenceE) : null);
    }

    public static vqe1 j(TimelineEntry timelineEntry, TimelineAction timelineAction) {
        if (timelineAction == null) {
            return null;
        }
        if (!a(timelineAction, e(timelineEntry))) {
            timelineAction = null;
        }
        if (timelineAction != null) {
            return new vqe1(timelineAction, e(timelineEntry));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02d3  */
    public final Object apply(Object obj) {
        Object next;
        boolean z;
        ArrayList arrayList;
        wik wikVar;
        Integer numValueOf;
        List list;
        lkk lkkVar;
        olo0 olo0Var;
        tt6 tt6Var;
        String strN;
        u7h u7hVarG;
        String str;
        z6x z6xVar;
        int i;
        int i2;
        ca00 ca00Var = (ca00) obj;
        boolean z2 = ca00Var.e;
        String str2 = ca00Var.f;
        List list2 = ca00Var.b;
        la00 la00Var = ca00Var.a;
        List list3 = list2;
        List list4 = ca00Var.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            r7h.W(((ved1) it.next()).d, arrayList2);
        }
        ep20 ep20Var = new ep20(z561.X(fa00.b, z561.T(aht.i, new i46(o7h.N0(arrayList2, list3), (byte) 1))));
        do {
            if (!ep20Var.hasNext()) {
                next = null;
                break;
            }
            next = ep20Var.next();
        } while (((TimelineEntry) next).t() != tzy.c);
        TimelineEntry timelineEntry = (TimelineEntry) next;
        k6k k6kVarK = upf.k(la00Var, this.d.b());
        String str3 = la00Var.d;
        DateTime dateTime = la00Var.f;
        List list5 = la00Var.b;
        String str4 = la00Var.e;
        String strX = dateTime != null ? z4p1.x(z4p1.H(dateTime), "EEEyMMMMdjmm") : "";
        String str5 = la00Var.h;
        String str6 = strX;
        String str7 = la00Var.i;
        String str8 = la00Var.j;
        sv50 sv50Var = (sv50) o7h.s0(list5);
        String str9 = sv50Var != null ? sv50Var.b : null;
        List list6 = list5;
        ArrayList arrayList3 = new ArrayList(q7h.U(list6, 10));
        Iterator it2 = list6.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((sv50) it2.next()).b);
        }
        ArrayList arrayList4 = new ArrayList(q7h.U(list6, 10));
        Iterator it3 = list6.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((sv50) it3.next()).a);
        }
        ArrayList arrayList5 = new ArrayList(q7h.U(list6, 10));
        Iterator it4 = list6.iterator();
        while (it4.hasNext()) {
            ((sv50) it4.next()).getClass();
            arrayList5.add("");
        }
        ArrayList arrayList6 = new ArrayList(q7h.U(list6, 10));
        Iterator it5 = list6.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((sv50) it5.next()).c);
        }
        String strA = dateTime != null ? this.a.a(dateTime) : "";
        String strValueOf = String.valueOf(dateTime != null ? Integer.valueOf(dateTime.n()) : null);
        boolean z3 = ca00Var.d;
        List list7 = la00Var.k;
        boolean z4 = k6kVarK != null;
        Long lValueOf = k6kVarK != null ? Long.valueOf(k6kVarK.b) : null;
        ma00 ma00Var = la00Var.l;
        if (ma00Var != null) {
            String str10 = ma00Var.c;
            int i3 = ma00Var.b;
            if (str10 == null) {
                sv50 sv50Var2 = (sv50) o7h.s0(list5);
                str = sv50Var2 != null ? sv50Var2.b : null;
            } else {
                str = str10;
            }
            if (i3 == 2) {
                z6xVar = z6x.a;
            } else {
                z6x arrayList7 = new ArrayList();
                Iterator it6 = list6.iterator();
                while (it6.hasNext()) {
                    Iterator it7 = it6;
                    Object next2 = it7.next();
                    boolean z5 = z3;
                    ArrayList arrayList8 = arrayList6;
                    if (((sv50) next2).d == 2) {
                        arrayList7.add(next2);
                    }
                    it6 = it7;
                    z3 = z5;
                    arrayList6 = arrayList8;
                }
                z6xVar = arrayList7;
            }
            z = z3;
            arrayList = arrayList6;
            Iterable iterable = (Iterable) z6xVar;
            ArrayList arrayList9 = new ArrayList(q7h.U(iterable, 10));
            Iterator it8 = iterable.iterator();
            while (it8.hasNext()) {
                arrayList9.add(((sv50) it8.next()).b);
            }
            ArrayList arrayList10 = new ArrayList();
            for (Object obj2 : arrayList9) {
                if (!ihc1.y0((String) obj2)) {
                    arrayList10.add(obj2);
                }
            }
            List listJ0 = o7h.j0(arrayList10);
            if (listJ0.isEmpty()) {
                sv50 sv50Var3 = (sv50) o7h.s0(list5);
                List listI0 = f46.i0(new String[]{str10, sv50Var3 != null ? sv50Var3.b : null});
                ArrayList arrayList11 = new ArrayList();
                for (Object obj3 : listI0) {
                    if (!ihc1.y0((String) obj3)) {
                        arrayList11.add(obj3);
                    }
                }
                listJ0 = o7h.d1(o7h.j0(arrayList11), 1);
            }
            List listD1 = listJ0;
            if (i3 == 2 || !this.c.l) {
                i = 1;
                listD1 = o7h.d1(listD1, 1);
            } else {
                i = 1;
            }
            List list8 = listD1;
            String str11 = ma00Var.d;
            String str12 = i3 == 2 ? ma00Var.a : null;
            int iC = l1d.C(i3);
            if (iC == 0) {
                i2 = 1;
            } else {
                if (iC != i) {
                    eg.o();
                    return null;
                }
                i2 = 2;
            }
            wikVar = new wik(str, list8, str11, str12, i2, ma00Var.e, ma00Var.f);
        } else {
            z = z3;
            arrayList = arrayList6;
            wikVar = null;
        }
        boolean z6 = timelineEntry != null;
        if (timelineEntry == null || (strN = timelineEntry.n()) == null) {
            numValueOf = null;
        } else {
            if (!timelineEntry.E()) {
                strN = null;
            }
            if (strN == null || (u7hVarG = g(strN)) == null) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(z4p1.G(u7hVarG.a));
            }
        }
        kkk kkkVar = new kkk(new xik(str3, str4, str6, str5, str7, str8, str9, arrayList3, arrayList4, arrayList5, arrayList, strA, strValueOf, z, list7, z4, lValueOf, wikVar, z6, numValueOf, 16384));
        ArrayList arrayListH = h(str2, str3, list2, z2);
        if (list4.isEmpty()) {
            list = null;
        }
        if (list != null) {
            list = list4;
            List<ved1> list9 = list;
            ArrayList arrayList12 = new ArrayList(q7h.U(list9, 10));
            for (ved1 ved1Var : list9) {
                arrayList12.add(new mkk(ved1Var.b, h(str2, str3, ved1Var.d, z2), ved1Var.c));
            }
            lkkVar = new lkk(arrayList12);
        } else {
            list = list4;
            lkkVar = null;
        }
        hvo0 hvo0Var = ca00Var.i;
        if (u890.j(hvo0Var, fvo0.a)) {
            plo0.c0.getClass();
            olo0Var = nlo0.b;
        } else {
            if (!(hvo0Var instanceof gvo0)) {
                eg.o();
                return null;
            }
            Context context = this.b.a;
            gvo0 gvo0Var = (gvo0) hvo0Var;
            olo0Var = new olo0(context.getString(2131959214), context.getString(2131959213), context.getString(2131959212), new mlo0(context.getString(2131959211), gvo0Var.a), new llo0(context.getString(2131959210), gvo0Var.b), true, 32);
        }
        jmo1 jmo1Var = ca00Var.k;
        if (jmo1Var instanceof vt6) {
            ArrayList<nt6> arrayList13 = ((vt6) jmo1Var).c;
            ArrayList arrayList14 = new ArrayList(q7h.U(arrayList13, 10));
            for (nt6 nt6Var : arrayList13) {
                arrayList14.add(new ot6(nt6Var.a, nt6Var.b, nt6Var.c));
            }
            tt6Var = new tt6(arrayList14, true);
        } else {
            if (!u890.j(jmo1Var, wt6.c)) {
                eg.o();
                return null;
            }
            ut6.a.getClass();
            tt6Var = pt6.b;
        }
        return new nkk(kkkVar, arrayListH, lkkVar, olo0Var, tt6Var);
    }

    public final da00 d(PlaceHolderText placeHolderText, boolean z) {
        String strP;
        Context context = this.b.a;
        String strO = placeHolderText.o();
        int i = 0;
        Long lValueOf = null;
        for (Object obj : placeHolderText.p()) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            PlaceholderValue placeholderValue = (PlaceholderValue) obj;
            int iR = placeholderValue.r();
            int i3 = iR == 0 ? -1 : ea00.c[l1d.C(iR)];
            if (i3 == 1) {
                strP = placeholderValue.p();
            } else if (i3 == 2) {
                Money moneyO = placeholderValue.o();
                String strN = moneyO.n();
                if (strN.length() == 0) {
                    strN = "USD";
                }
                Currency currency = Currency.getInstance(strN);
                BigDecimal bigDecimalAdd = new BigDecimal(moneyO.q()).add(new BigDecimal(moneyO.p()).divide(new BigDecimal(1000000000)));
                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                currencyInstance.setCurrency(currency);
                strP = currencyInstance.format(bigDecimalAdd);
            } else if (i3 != 3) {
                if (i3 == 4) {
                    Timestamp timestampN = placeholderValue.n();
                    lValueOf = Long.valueOf((timestampN.q() * 1000) + ((long) (timestampN.p() / 1000000)));
                    strP = "{{COUNTDOWN}}";
                } else if (i3 != 5) {
                    strP = "";
                } else {
                    Timestamp timestampQ = placeholderValue.q();
                    strP = DateFormat.getDateTimeInstance(2, 3).format(new Date((timestampQ.q() * 1000) + ((long) (timestampQ.p() / 1000000))));
                }
            } else if (z) {
                DateTime dateTimeS = placeholderValue.s();
                ZonedDateTime zonedDateTimeWithZoneSameInstant = z4p1.H(dateTimeS).atZone(dateTimeS.w() ? ZoneId.of(dateTimeS.u().getId()) : dateTimeS.x() ? ZoneOffset.ofTotalSeconds((int) dateTimeS.v().p()) : ZoneId.systemDefault()).withZoneSameInstant(ZoneId.systemDefault());
                strP = f4i1.f(context.getString(2131963209, z4p1.x(zonedDateTimeWithZoneSameInstant.toLocalDateTime(), "MMMd"), z4p1.x(zonedDateTimeWithZoneSameInstant.toLocalDateTime(), "jm")), " ", zonedDateTimeWithZoneSameInstant.format(DateTimeFormatter.ofPattern("z", Locale.forLanguageTag(upn1.p()))));
            } else {
                strP = context.getString(2131963209, z4p1.x(z4p1.H(placeholderValue.s()), "MMMd"), z4p1.x(z4p1.H(placeholderValue.s()), "jm"));
            }
            strP.getClass();
            strO = nhc1.W(strO, "$" + i2, strP);
            i = i2;
        }
        return new da00(lValueOf, strO);
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0399  */
    /* JADX WARN: Code duplicated, block: B:130:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:133:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:142:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:157:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:160:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:171:0x0413  */
    /* JADX WARN: Code duplicated, block: B:174:0x041f  */
    /* JADX WARN: Code duplicated, block: B:182:0x043d  */
    /* JADX WARN: Code duplicated, block: B:185:0x0445  */
    /* JADX WARN: Code duplicated, block: B:186:0x0450  */
    /* JADX WARN: Code duplicated, block: B:188:0x0456  */
    /* JADX WARN: Code duplicated, block: B:189:0x045b  */
    /* JADX WARN: Code duplicated, block: B:192:0x0463  */
    /* JADX WARN: Code duplicated, block: B:194:0x046c  */
    /* JADX WARN: Code duplicated, block: B:196:0x0472  */
    /* JADX WARN: Code duplicated, block: B:197:0x0477  */
    /* JADX WARN: Code duplicated, block: B:201:0x048b  */
    /* JADX WARN: Code duplicated, block: B:203:0x048f  */
    /* JADX WARN: Code duplicated, block: B:204:0x0496  */
    /* JADX WARN: Code duplicated, block: B:208:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:210:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:211:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:216:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:218:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:220:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:222:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:223:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:224:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:225:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:226:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:227:0x0501  */
    /* JADX WARN: Code duplicated, block: B:228:0x0504  */
    /* JADX WARN: Code duplicated, block: B:231:0x050c  */
    /* JADX WARN: Code duplicated, block: B:232:0x0511  */
    /* JADX WARN: Code duplicated, block: B:234:0x0515  */
    /* JADX WARN: Code duplicated, block: B:235:0x051a  */
    /* JADX WARN: Code duplicated, block: B:238:0x052e  */
    /* JADX WARN: Code duplicated, block: B:239:0x0531  */
    /* JADX WARN: Code duplicated, block: B:242:0x053b  */
    /* JADX WARN: Code duplicated, block: B:243:0x053e  */
    /* JADX WARN: Code duplicated, block: B:245:0x0544  */
    /* JADX WARN: Code duplicated, block: B:246:0x0547  */
    /* JADX WARN: Code duplicated, block: B:249:0x054d  */
    /* JADX WARN: Code duplicated, block: B:251:0x0553  */
    /* JADX WARN: Code duplicated, block: B:252:0x0556  */
    /* JADX WARN: Code duplicated, block: B:254:0x055a  */
    /* JADX WARN: Code duplicated, block: B:256:0x0564  */
    /* JADX WARN: Code duplicated, block: B:258:0x0571  */
    /* JADX WARN: Code duplicated, block: B:260:0x057c  */
    /* JADX WARN: Code duplicated, block: B:263:0x0588  */
    /* JADX WARN: Code duplicated, block: B:265:0x058c  */
    /* JADX WARN: Code duplicated, block: B:266:0x0591  */
    /* JADX WARN: Code duplicated, block: B:268:0x0596  */
    /* JADX WARN: Code duplicated, block: B:277:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:279:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:282:0x05be  */
    /* JADX WARN: Code duplicated, block: B:285:0x05df  */
    /* JADX WARN: Code duplicated, block: B:287:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:288:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:290:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:295:0x0601  */
    /* JADX WARN: Code duplicated, block: B:297:0x0615  */
    /* JADX WARN: Code duplicated, block: B:300:0x061d  */
    /* JADX WARN: Code duplicated, block: B:301:0x0620  */
    /* JADX WARN: Code duplicated, block: B:304:0x0631  */
    /* JADX WARN: Code duplicated, block: B:305:0x0633  */
    /* JADX WARN: Code duplicated, block: B:307:0x063d  */
    /* JADX WARN: Code duplicated, block: B:308:0x063f  */
    /* JADX WARN: Code duplicated, block: B:310:0x0643  */
    /* JADX WARN: Code duplicated, block: B:311:0x0653  */
    /* JADX WARN: Code duplicated, block: B:315:0x0664  */
    /* JADX WARN: Code duplicated, block: B:317:0x0671  */
    /* JADX WARN: Code duplicated, block: B:318:0x0674  */
    /* JADX WARN: Code duplicated, block: B:321:0x0680  */
    /* JADX WARN: Code duplicated, block: B:322:0x0683  */
    /* JADX WARN: Code duplicated, block: B:324:0x069f  */
    /* JADX WARN: Code duplicated, block: B:328:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:330:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:332:0x06da  */
    /* JADX WARN: Code duplicated, block: B:334:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:337:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:338:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:340:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:341:0x06f9 A[PHI: r5 r24 r27
      0x06f9: PHI (r5v8 p.tzy) = (r5v7 p.tzy), (r5v12 p.tzy) binds: [B:339:0x06f3, B:335:0x06ec] A[DONT_GENERATE, DONT_INLINE]
      0x06f9: PHI (r24v4 p.tzy) = (r24v3 p.tzy), (r24v7 p.tzy) binds: [B:339:0x06f3, B:335:0x06ec] A[DONT_GENERATE, DONT_INLINE]
      0x06f9: PHI (r27v2 java.util.Iterator) = (r27v1 java.util.Iterator), (r27v4 java.util.Iterator) binds: [B:339:0x06f3, B:335:0x06ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:344:0x0700  */
    /* JADX WARN: Code duplicated, block: B:345:0x070b  */
    /* JADX WARN: Code duplicated, block: B:348:0x0715  */
    /* JADX WARN: Code duplicated, block: B:350:0x071e  */
    /* JADX WARN: Code duplicated, block: B:352:0x0724  */
    /* JADX WARN: Code duplicated, block: B:353:0x0729  */
    /* JADX WARN: Code duplicated, block: B:356:0x073c  */
    /* JADX WARN: Code duplicated, block: B:358:0x0744  */
    /* JADX WARN: Code duplicated, block: B:360:0x0753  */
    /* JADX WARN: Code duplicated, block: B:362:0x0756  */
    /* JADX WARN: Code duplicated, block: B:364:0x0759  */
    /* JADX WARN: Code duplicated, block: B:366:0x0763  */
    /* JADX WARN: Code duplicated, block: B:368:0x0774  */
    /* JADX WARN: Code duplicated, block: B:369:0x0777  */
    /* JADX WARN: Code duplicated, block: B:370:0x077a  */
    /* JADX WARN: Code duplicated, block: B:371:0x077d  */
    /* JADX WARN: Code duplicated, block: B:372:0x0780  */
    /* JADX WARN: Code duplicated, block: B:373:0x0783  */
    /* JADX WARN: Code duplicated, block: B:374:0x0786  */
    /* JADX WARN: Code duplicated, block: B:376:0x078c  */
    /* JADX WARN: Code duplicated, block: B:377:0x079a  */
    /* JADX WARN: Code duplicated, block: B:380:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:381:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:384:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:385:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:388:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:391:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:393:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:396:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:398:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:399:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:401:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:403:0x0802  */
    /* JADX WARN: Code duplicated, block: B:405:0x080d  */
    /* JADX WARN: Code duplicated, block: B:407:0x0813  */
    /* JADX WARN: Code duplicated, block: B:410:0x081f  */
    /* JADX WARN: Code duplicated, block: B:411:0x0822  */
    /* JADX WARN: Code duplicated, block: B:414:0x082a  */
    /* JADX WARN: Code duplicated, block: B:415:0x082d  */
    /* JADX WARN: Code duplicated, block: B:418:0x0835  */
    /* JADX WARN: Code duplicated, block: B:419:0x083f  */
    /* JADX WARN: Code duplicated, block: B:423:0x0857 A[LOOP:8: B:421:0x0851->B:423:0x0857, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:426:0x0871  */
    /* JADX WARN: Code duplicated, block: B:427:0x0874  */
    /* JADX WARN: Code duplicated, block: B:428:0x0876  */
    /* JADX WARN: Code duplicated, block: B:431:0x0886  */
    /* JADX WARN: Code duplicated, block: B:434:0x088d  */
    /* JADX WARN: Code duplicated, block: B:437:0x089b  */
    /* JADX WARN: Code duplicated, block: B:439:0x089e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:442:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:443:0x08a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:444:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:445:0x08ab  */
    /* JADX WARN: Code duplicated, block: B:451:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:454:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:460:0x0903  */
    /* JADX WARN: Code duplicated, block: B:465:0x0914  */
    /* JADX WARN: Code duplicated, block: B:469:0x092b  */
    /* JADX WARN: Code duplicated, block: B:471:0x093e  */
    /* JADX WARN: Code duplicated, block: B:472:0x0943  */
    /* JADX WARN: Code duplicated, block: B:488:0x08cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0238  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r40v3 */
    /* JADX WARN: Type inference failed for: r40v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r40v5 */
    /* JADX WARN: Type inference failed for: r45v0 */
    /* JADX WARN: Type inference failed for: r45v1 */
    /* JADX WARN: Type inference failed for: r45v2 */
    /* JADX WARN: Type inference failed for: r45v3, types: [int] */
    /* JADX WARN: Type inference failed for: r45v4 */
    /* JADX WARN: Type inference failed for: r49v0 */
    /* JADX WARN: Type inference failed for: r49v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r49v2 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r50v0 */
    /* JADX WARN: Type inference failed for: r50v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r50v2 */
    /* JADX WARN: Type inference failed for: r54v0, types: [p.ga00] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v49 java.lang.Object, still in use, count: 2, list:
          (r7v49 java.lang.Object) from 0x0379: PHI (r7 I:??) = (r7v7 java.lang.Object), (r7v49 java.lang.Object) binds: [B:124:0x0377, B:498:0x0379] A[DONT_GENERATE, DONT_INLINE]
          (r7v49 java.lang.Object) from 0x036a: CHECK_CAST (p.aa80) (r7v49 java.lang.Object)
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
    public final java.util.ArrayList h(java.lang.String r55, java.lang.String r56, java.util.List r57, boolean r58) {
        /*
            Method dump skipped, instruction units count: 2478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ga00.h(java.lang.String, java.lang.String, java.util.List, boolean):java.util.ArrayList");
    }
}
