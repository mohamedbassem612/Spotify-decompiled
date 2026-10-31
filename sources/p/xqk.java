package p;

import android.net.Uri;
import j$.time.LocalDateTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class xqk {
    public static final DateTimeFormatter a = DateTimeFormatter.ofPattern("EEE • h:mm a");

    public static final Uri a(String str) {
        List listX;
        List listD1;
        Pattern patternCompile = Pattern.compile(":");
        ihc1.N0(0);
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listX = arrayList;
        } else {
            listX = k4p1.x(str.toString());
        }
        if (!listX.isEmpty()) {
            ListIterator listIterator = listX.listIterator(listX.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listD1 = z6x.a;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    listD1 = o7h.d1(listX, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listD1 = z6x.a;
            break;
        }
        String[] strArr = (String[]) listD1.toArray(new String[0]);
        if (strArr.length != 3) {
            return Uri.EMPTY;
        }
        return Uri.parse("https://i.scdn.co/image/" + strArr[2]);
    }

    public static final lrk b(da10 da10Var, krk krkVar) {
        int i;
        goj0 goj0VarA;
        goj0 goj0VarA2;
        goj0 goj0VarA3;
        String str = krkVar.a;
        x360 x360Var = krkVar.b;
        ioj0 ioj0Var = da10Var.a;
        if (ioj0Var == null) {
            return new lrk(str, x360Var, fg91.b);
        }
        c380 c380Var = krkVar.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = c380Var.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            hoj0 hoj0VarC = ioj0Var.c(j6k.class, (String) next);
            if (hoj0VarC != null ? hoj0VarC instanceof goj0 : false) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            String str2 = (String) obj;
            hoj0 hoj0VarC2 = ioj0Var.c(j6k.class, str2);
            ez00 ez00Var = (hoj0VarC2 == null || (goj0VarA3 = hoj0VarC2.a()) == null) ? null : (ez00) goj0VarA3.a;
            if (ez00Var == null) {
                hhg1.f(f4i1.f(j6k.class.getSimpleName(), " not found for uri: ", str2));
                return null;
            }
            j6k j6kVar = (j6k) ez00Var;
            hoj0 hoj0VarC3 = ioj0Var.c(lhe0.class, str2);
            ez00 ez00Var2 = (hoj0VarC3 == null || (goj0VarA2 = hoj0VarC3.a()) == null) ? null : (ez00) goj0VarA2.a;
            if (ez00Var2 == null) {
                hhg1.f(f4i1.f(lhe0.class.getSimpleName(), " not found for uri: ", str2));
                return null;
            }
            lhe0 lhe0Var = (lhe0) ez00Var2;
            hoj0 hoj0VarC4 = ioj0Var.c(jfk.class, str2);
            ez00 ez00Var3 = (hoj0VarC4 == null || (goj0VarA = hoj0VarC4.a()) == null) ? null : (ez00) goj0VarA.a;
            if (ez00Var3 == null) {
                hhg1.f(f4i1.f(jfk.class.getSimpleName(), " not found for uri: ", str2));
                return null;
            }
            String string = a(((jfk) ez00Var3).a).toString();
            k7r k7rVar = j6kVar.c.a;
            OffsetDateTime offsetDateTimePlusMinutes = LocalDateTime.parse(k7rVar.a, DateTimeFormatter.ISO_DATE_TIME).atOffset(ZoneOffset.UTC).plusMinutes(k7rVar.b);
            arrayList2.add(new hqk(j6kVar.a, string, offsetDateTimePlusMinutes.format(a), offsetDateTimePlusMinutes.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()), ihc1.F0(2, String.valueOf(offsetDateTimePlusMinutes.getDayOfMonth())), j6kVar.b, c(lhe0Var)));
            i = i2;
        }
        return new lrk(str, x360Var, mqo1.A(arrayList2));
    }

    public static final String c(lhe0 lhe0Var) {
        StringBuilder sb = new StringBuilder();
        String str = lhe0Var.a;
        if (str.length() > 0) {
            sb.append(str);
        }
        rnt rntVar = lhe0Var.b;
        if (rntVar instanceof rnt) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(rntVar.a);
        } else if (!rntVar.equals(mpi1.Y0)) {
            eg.o();
            return null;
        }
        return sb.toString();
    }
}
