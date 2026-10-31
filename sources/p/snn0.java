package p;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class snn0 {
    public static final Pattern q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Pattern r = Pattern.compile("\\{(.+?)\\}");
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;
    public final idd1 f;
    public final idd1 g;
    public final znb0 h;
    public boolean i;
    public final znb0 j;
    public final znb0 k;
    public final znb0 l;
    public final idd1 m;
    public final String n;
    public final idd1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f135p;

    public snn0(String str, String str2, String str3) {
        List listX;
        List listD1;
        this.a = str;
        this.b = str2;
        this.c = str3;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f = new idd1(new rnn0(this, (byte) 6));
        this.g = new idd1(new rnn0(this, (byte) 4));
        this.h = dm5.S(3, new rnn0(this, (byte) 7));
        this.j = dm5.S(3, new rnn0(this, (byte) 1));
        this.k = dm5.S(3, new rnn0(this, (byte) 0));
        this.l = dm5.S(3, new rnn0(this, (byte) 3));
        this.m = new idd1(new rnn0(this, (byte) 2));
        this.o = new idd1(new rnn0(this, (byte) 5));
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!q.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            a(str.substring(0, matcher.start()), arrayList, sb);
            this.f135p = (ihc1.h0(sb, ".*", false) || ihc1.h0(sb, "([^/]+?)", false)) ? false : true;
            sb.append("($|(\\?(.)*)|(\\#(.)*))");
            this.e = nhc1.W(sb.toString(), ".*", "\\E.*\\Q");
        }
        if (str3 == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            hhg1.f(f4i1.f("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
            throw null;
        }
        Pattern patternCompile = Pattern.compile("/");
        ihc1.N0(0);
        Matcher matcher2 = patternCompile.matcher(str3);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList2.add(str3.subSequence(iEnd, matcher2.start()).toString());
                iEnd = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(str3.subSequence(iEnd, str3.length()).toString());
            listX = arrayList2;
        } else {
            listX = k4p1.x(str3.toString());
        }
        if (listX.isEmpty()) {
            listD1 = z6x.a;
        } else {
            ListIterator listIterator = listX.listIterator(listX.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listD1 = o7h.d1(listX, listIterator.nextIndex() + 1);
                }
            }
            listD1 = z6x.a;
        }
        this.n = nhc1.W(cy30.p("^(", (String) listD1.get(0), "|[*]+)/(", (String) listD1.get(1), "|[*]+)$"), "*|[*]", "[\\s\\S]");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = r.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            arrayList.add(matcher.group(1));
            if (matcher.start() > iEnd) {
                sb.append(Pattern.quote(str.substring(iEnd, matcher.start())));
            }
            sb.append("([^/]*?|)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            sb.append(Pattern.quote(str.substring(iEnd)));
        }
    }

    public final ArrayList b() {
        Collection collectionValues = ((Map) this.h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            r7h.W(((qnn0) it.next()).b, arrayList);
        }
        return o7h.N0((List) this.k.getValue(), o7h.N0(arrayList, this.d));
    }

    public final Bundle c(Uri uri, LinkedHashMap linkedHashMap) {
        Pattern pattern = (Pattern) this.f.getValue();
        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
        if (matcher != null && matcher.matches()) {
            Bundle bundle = new Bundle();
            if (d(matcher, bundle, linkedHashMap) && (!((Boolean) this.g.getValue()).booleanValue() || e(uri, bundle, linkedHashMap))) {
                String fragment = uri.getFragment();
                Pattern pattern2 = (Pattern) this.m.getValue();
                Matcher matcher2 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : null;
                if (matcher2 != null && matcher2.matches()) {
                    List list = (List) this.k.getValue();
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        String str = (String) obj;
                        String strDecode = Uri.decode(matcher2.group(i2));
                        dnn0 dnn0Var = (dnn0) linkedHashMap.get(str);
                        if (dnn0Var != null) {
                            try {
                                apn0 apn0Var = dnn0Var.a;
                                apn0Var.e(bundle, str, apn0Var.d(strDecode));
                            } catch (IllegalArgumentException unused) {
                            }
                        } else {
                            bundle.putString(str, strDecode);
                        }
                        arrayList.add(rih1.a);
                        i = i2;
                    }
                }
                if (m5n1.N(linkedHashMap, new zcr(bundle, (byte) 1)).isEmpty()) {
                    return bundle;
                }
            }
        }
        return null;
    }

    public final boolean d(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            String str = (String) obj;
            String strDecode = Uri.decode(matcher.group(i2));
            dnn0 dnn0Var = (dnn0) linkedHashMap.get(str);
            if (dnn0Var != null) {
                try {
                    apn0 apn0Var = dnn0Var.a;
                    apn0Var.e(bundle, str, apn0Var.d(strDecode));
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                bundle.putString(str, strDecode);
            }
            arrayList2.add(rih1.a);
            i = i2;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Boolean boolValueOf;
        boolean z;
        String query;
        for (Map.Entry entry : ((Map) this.h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            qnn0 qnn0Var = (qnn0) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = Collections.singletonList(query);
            }
            Boolean bool = rih1.a;
            int i = 0;
            Bundle bundleH = mno1.h(new mmr0[0]);
            for (String str2 : qnn0Var.b) {
                dnn0 dnn0Var = (dnn0) linkedHashMap.get(str2);
                apn0 apn0Var = dnn0Var != null ? dnn0Var.a : null;
                if ((apn0Var instanceof n4h) && !dnn0Var.c) {
                    apn0Var.e(bundleH, str2, ((n4h) apn0Var).g());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = qnn0Var.a;
                Matcher matcher = str4 != null ? Pattern.compile(str4, 32).matcher(str3) : null;
                if (matcher == null || !matcher.matches()) {
                    return i;
                }
                ArrayList arrayList = qnn0Var.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                int i2 = i;
                for (Object obj : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    String str5 = (String) obj;
                    String strGroup = matcher.group(i3);
                    if (strGroup == null) {
                        strGroup = "";
                    }
                    int i4 = i;
                    dnn0 dnn0Var2 = (dnn0) linkedHashMap.get(str5);
                    try {
                        if (bundleH.containsKey(str5)) {
                            if (bundleH.containsKey(str5)) {
                                if (dnn0Var2 != null) {
                                    apn0 apn0Var2 = dnn0Var2.a;
                                    Object objA = apn0Var2.a(bundleH, str5);
                                    if (!bundleH.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                    apn0Var2.e(bundleH, str5, apn0Var2.c(objA, strGroup));
                                    boolValueOf = bool;
                                }
                                z = i4;
                            } else {
                                z = 1;
                            }
                            try {
                                boolValueOf = Boolean.valueOf(z);
                            } catch (IllegalArgumentException unused) {
                                boolValueOf = bool;
                            }
                        } else {
                            if (dnn0Var2 != null) {
                                apn0 apn0Var3 = dnn0Var2.a;
                                apn0Var3.e(bundleH, str5, apn0Var3.d(strGroup));
                            } else {
                                bundleH.putString(str5, strGroup);
                            }
                            boolValueOf = bool;
                        }
                    } catch (IllegalArgumentException unused2) {
                    }
                    arrayList2.add(boolValueOf);
                    i2 = i3;
                    i = i4;
                }
            }
            bundle.putAll(bundleH);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof snn0)) {
            snn0 snn0Var = (snn0) obj;
            if (u890.j(this.a, snn0Var.a) && u890.j(this.b, snn0Var.b) && u890.j(this.c, snn0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
