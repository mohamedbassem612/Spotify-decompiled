package p;

import android.util.LruCache;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hqc1 {
    public final a8o0 a;
    public final big0 b;
    public final sjb c;
    public final LruCache d = new LruCache(20);

    public hqc1(a8o0 a8o0Var, big0 big0Var, sjb sjbVar) {
        this.a = a8o0Var;
        this.b = big0Var;
        this.c = sjbVar;
    }

    public static String e(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (ihc1.h0(lowerCase, ".vtt", false) || ihc1.h0(lowerCase, "webvtt", false)) {
            return "text/vtt";
        }
        if (ihc1.h0(lowerCase, ".mp4vtt", false) || ihc1.h0(lowerCase, "mp4webvtt", false)) {
            return "application/x-mp4-vtt";
        }
        if (ihc1.h0(lowerCase, ".srt", false) || ihc1.h0(lowerCase, "subrip", false)) {
            return "application/x-subrip";
        }
        if (ihc1.h0(lowerCase, ".sub", false) || ihc1.h0(lowerCase, "vobsub", false)) {
            return "application/vobsub";
        }
        if (ihc1.h0(lowerCase, ".ass", false) || ihc1.h0(lowerCase, ".ssa", false)) {
            return "text/x-ssa";
        }
        if (ihc1.h0(lowerCase, ".ttml", false) || ihc1.h0(lowerCase, ".xml", false)) {
            return "application/ttml+xml";
        }
        if (ihc1.h0(lowerCase, ".tx3g", false)) {
            return "application/x-quicktime-tx3g";
        }
        if (ihc1.h0(lowerCase, ".pgs", false)) {
            return "application/pgs";
        }
        if (ihc1.h0(lowerCase, ".dvb", false)) {
            return "application/dvbsubs";
        }
        Logger.k(f4i1.f("Could not determine subtitle format from URL: ", f4i1.f("SubtitleUrl(value=", str, ")"), ", defaulting to WebVTT"), new Object[0]);
        return "text/vtt";
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, Locale locale, onm onmVar) throws IOException {
        cqc1 cqc1Var;
        mmr0 mmr0Var;
        String str2;
        Locale locale2;
        List list;
        LruCache lruCache;
        l2k1 l2k1Var;
        if (onmVar instanceof cqc1) {
            cqc1Var = (cqc1) onmVar;
            int i = cqc1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cqc1Var.f = i - Integer.MIN_VALUE;
            } else {
                cqc1Var = new cqc1(this, onmVar);
            }
        } else {
            cqc1Var = new cqc1(this, onmVar);
        }
        Object objD = cqc1Var.d;
        int i2 = cqc1Var.f;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objD);
            cqc1Var.a = str;
            cqc1Var.b = locale;
            cqc1Var.f = 1;
            objD = d(str, locale, cqc1Var);
            if (objD != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            locale = cqc1Var.b;
            str = cqc1Var.a;
            hm5.M(objD);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            locale2 = cqc1Var.c;
            str2 = cqc1Var.a;
            hm5.M(objD);
        }
        list = (List) objD;
        if (!list.isEmpty()) {
            cig0 cig0Var = new cig0(str2);
            lruCache = this.d;
            l2k1Var = (l2k1) lruCache.get(cig0Var);
            if (l2k1Var == null) {
                l2k1Var = new l2k1();
                lruCache.put(new cig0(str2), l2k1Var);
            }
            l2k1Var.a.put(locale2, list);
        }
        return list;
        Map map = (Map) objD;
        if (!map.isEmpty()) {
            irc1 irc1Var = (irc1) map.get(locale);
            String str3 = irc1Var != null ? irc1Var.a : null;
            if (str3 != null) {
                mmr0Var = new mmr0(locale, new irc1(str3));
            } else {
                Set setEntrySet = map.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : setEntrySet) {
                    if (u890.j(locale.getLanguage(), ((Locale) ((Map.Entry) obj2).getKey()).getLanguage())) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    mmr0Var = null;
                } else {
                    Map.Entry entry = (Map.Entry) o7h.q0(arrayList);
                    mmr0Var = new mmr0(entry.getKey(), entry.getValue());
                }
            }
            if (mmr0Var != null) {
                Locale locale3 = (Locale) mmr0Var.a;
                String str4 = ((irc1) mmr0Var.b).a;
                cqc1Var.a = str;
                cqc1Var.b = null;
                cqc1Var.c = locale3;
                cqc1Var.f = 2;
                objD = f(str4, cqc1Var);
                if (objD != obj) {
                    str2 = str;
                    locale2 = locale3;
                    list = (List) objD;
                    if (!list.isEmpty()) {
                        cig0 cig0Var2 = new cig0(str2);
                        lruCache = this.d;
                        l2k1Var = (l2k1) lruCache.get(cig0Var2);
                        if (l2k1Var == null) {
                            l2k1Var = new l2k1();
                            lruCache.put(new cig0(str2), l2k1Var);
                        }
                        l2k1Var.a.put(locale2, list);
                    }
                    return list;
                }
                return obj;
            }
        }
        return z6x.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) throws IOException {
        dqc1 dqc1Var;
        Object next;
        if (onmVar instanceof dqc1) {
            dqc1Var = (dqc1) onmVar;
            int i = dqc1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dqc1Var.d = i - Integer.MIN_VALUE;
            } else {
                dqc1Var = new dqc1(this, onmVar);
            }
        } else {
            dqc1Var = new dqc1(this, onmVar);
        }
        Object objA = dqc1Var.b;
        int i2 = dqc1Var.d;
        LruCache lruCache = this.d;
        if (i2 == 0) {
            hm5.M(objA);
            l2k1 l2k1Var = (l2k1) lruCache.get(new cig0(str));
            if (l2k1Var != null) {
                ConcurrentHashMap concurrentHashMap = l2k1Var.a;
                ArrayList arrayList = l2k1Var.b;
                if (arrayList != null) {
                    return arrayList;
                }
                if (!concurrentHashMap.isEmpty()) {
                    Set setKeySet = concurrentHashMap.keySet();
                    ArrayList arrayList2 = new ArrayList(q7h.U(setKeySet, 10));
                    Iterator it = setKeySet.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new hpc1(((Locale) it.next()).toLanguageTag(), null, 0, 0, 30, null));
                    }
                    l2k1Var.b = arrayList2;
                    return arrayList2;
                }
            }
            dqc1Var.a = str;
            dqc1Var.d = 1;
            objA = this.b.a(str, dqc1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = dqc1Var.a;
            hm5.M(objA);
        }
        d5b1 d5b1Var = (d5b1) objA;
        z6x z6xVar = z6x.a;
        if (d5b1Var == null) {
            return z6xVar;
        }
        rrc1 rrc1Var = d5b1Var.c;
        z6x z6xVar2 = rrc1Var != null ? rrc1Var.a : z6xVar;
        rpl rplVar = (rpl) o7h.s0(d5b1Var.a);
        if (rplVar != null) {
            List list = rplVar.d;
            z6x arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (((xdx0) obj).a == 3) {
                    arrayList3.add(obj);
                }
            }
            z6xVar = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : (Iterable) z6xVar) {
            xdx0 xdx0Var = (xdx0) obj2;
            if (xdx0Var.c != null) {
                zvw0 zvw0Var = (zvw0) o7h.s0(xdx0Var.b);
                if ((zvw0Var != null ? (String) o7h.s0(zvw0Var.c) : null) != null) {
                    arrayList4.add(obj2);
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<xdx0> arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (hashSet.add(((xdx0) obj3).c)) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
        for (xdx0 xdx0Var2 : arrayList5) {
            String str2 = xdx0Var2.c;
            str2.getClass();
            Iterator it2 = ((Iterable) z6xVar2).iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!u890.j(((hpc1) next).f, str2));
            hpc1 hpc1VarK = (hpc1) next;
            if (hpc1VarK == null) {
                zvw0 zvw0Var2 = (zvw0) o7h.s0(xdx0Var2.b);
                hpc1VarK = zvw0Var2 != null ? fqo1.K(zvw0Var2.b) : null;
                if (hpc1VarK == null) {
                    hpc1VarK = new hpc1(str2, null, 0, 0, 30, null);
                }
            }
            arrayList6.add(hpc1VarK);
        }
        if (!arrayList6.isEmpty()) {
            l2k1 l2k1Var2 = (l2k1) lruCache.get(new cig0(str));
            if (l2k1Var2 == null) {
                l2k1Var2 = new l2k1();
                lruCache.put(new cig0(str), l2k1Var2);
            }
            l2k1Var2.b = arrayList6;
        }
        return arrayList6;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, Locale locale, onm onmVar) {
        eqc1 eqc1Var;
        if (onmVar instanceof eqc1) {
            eqc1Var = (eqc1) onmVar;
            int i = eqc1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                eqc1Var.e = i - Integer.MIN_VALUE;
            } else {
                eqc1Var = new eqc1(this, onmVar);
            }
        } else {
            eqc1Var = new eqc1(this, onmVar);
        }
        Object objA = eqc1Var.c;
        int i2 = eqc1Var.e;
        List list = null;
        if (i2 == 0) {
            hm5.M(objA);
            l2k1 l2k1Var = (l2k1) this.d.get(new cig0(str));
            if (l2k1Var != null) {
                ConcurrentHashMap concurrentHashMap = l2k1Var.a;
                List list2 = (List) concurrentHashMap.get(locale);
                if (list2 != null) {
                    list = list2;
                } else {
                    Set setEntrySet = concurrentHashMap.entrySet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : setEntrySet) {
                        if (u890.j(locale.getLanguage(), ((Locale) ((Map.Entry) obj).getKey()).getLanguage())) {
                            arrayList.add(obj);
                        }
                    }
                    Map.Entry entry = (Map.Entry) o7h.s0(arrayList);
                    if (entry != null) {
                        list = (List) entry.getValue();
                    }
                }
            }
            if (list != null) {
                return list;
            }
            eqc1Var.a = str;
            eqc1Var.b = locale;
            eqc1Var.e = 1;
            objA = a(str, locale, eqc1Var);
            Object obj2 = d9n.a;
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            locale = eqc1Var.b;
            str = eqc1Var.a;
            hm5.M(objA);
        }
        List list3 = (List) objA;
        if (!list3.isEmpty()) {
            return list3;
        }
        Logger.k(cy30.p("No subtitles found for manifestId: ", str, " [", locale.toLanguageTag(), "]"), new Object[0]);
        return z6x.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable d(String str, Locale locale, onm onmVar) throws IOException {
        fqc1 fqc1Var;
        if (onmVar instanceof fqc1) {
            fqc1Var = (fqc1) onmVar;
            int i = fqc1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fqc1Var.d = i - Integer.MIN_VALUE;
            } else {
                fqc1Var = new fqc1(this, onmVar);
            }
        } else {
            fqc1Var = new fqc1(this, onmVar);
        }
        Object objA = fqc1Var.b;
        int i2 = fqc1Var.d;
        ArrayList<xdx0> arrayList = null;
        if (i2 == 0) {
            hm5.M(objA);
            fqc1Var.a = locale;
            fqc1Var.d = 1;
            objA = this.b.a(str, fqc1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            locale = fqc1Var.a;
            hm5.M(objA);
        }
        d5b1 d5b1Var = (d5b1) objA;
        if (d5b1Var == null) {
            return b7x.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        rpl rplVar = (rpl) o7h.s0(d5b1Var.a);
        if (rplVar != null) {
            List list = rplVar.d;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((xdx0) obj).a == 3) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList != null) {
            for (xdx0 xdx0Var : arrayList) {
                String str2 = xdx0Var.c;
                if (str2 != null) {
                    Locale localeForLanguageTag = Locale.forLanguageTag(str2);
                    if (locale != null) {
                        localeForLanguageTag.getClass();
                        if (u890.j(localeForLanguageTag.getLanguage(), locale.getLanguage())) {
                        }
                    }
                    zvw0 zvw0Var = (zvw0) o7h.s0(xdx0Var.b);
                    if (zvw0Var != null) {
                        String str3 = (String) o7h.s0(zvw0Var.c);
                        String str4 = zvw0Var.e;
                        if (str3 != null) {
                            linkedHashMap.put(localeForLanguageTag, new irc1(l1d.m(str3, str4)));
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final Serializable f(String str, onm onmVar) {
        gqc1 gqc1Var;
        String str2 = str;
        sjb sjbVar = this.c;
        if (onmVar instanceof gqc1) {
            gqc1Var = (gqc1) onmVar;
            int i = gqc1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gqc1Var.d = i - Integer.MIN_VALUE;
            } else {
                gqc1Var = new gqc1(this, onmVar);
            }
        } else {
            gqc1Var = new gqc1(this, onmVar);
        }
        Object objY = gqc1Var.b;
        int i2 = gqc1Var.d;
        z6x z6xVar = z6x.a;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                a8o0 a8o0Var = this.a;
                gqc1Var.a = str2;
                gqc1Var.d = 1;
                objY = fn31.Y(a8o0Var.a, new rwm0(str2, a8o0Var, (lnm) null, (byte) 3), gqc1Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = gqc1Var.a;
                hm5.M(objY);
            }
            byte[] bArr = (byte[]) objY;
            if (bArr == null) {
                Logger.k("Failed to download subtitle from: " + str2, new Object[0]);
                return z6xVar;
            }
            if (bArr.length == 0) {
                Logger.k("Empty subtitle content from: " + str2, new Object[0]);
                return z6xVar;
            }
            String strE = e(str2);
            ge30 ge30Var = new ge30();
            ge30Var.o = asj0.p(strE);
            ie30 ie30Var = new ie30(ge30Var);
            if (!sjbVar.e(ie30Var)) {
                Logger.k("Unsupported subtitle format: " + strE + " for URL: " + str2, new Object[0]);
                return z6xVar;
            }
            lqc1 lqc1VarH = sjbVar.h(ie30Var);
            ArrayList arrayList = new ArrayList();
            int length = bArr.length;
            kqc1 kqc1Var = kqc1.c;
            cwh0 cwh0Var = new cwh0();
            cwh0Var.a = arrayList;
            lqc1VarH.g(bArr, 0, length, kqc1Var, cwh0Var);
            return arrayList;
        } catch (Exception e) {
            Logger.e(e, l1d.m("Failed to parse subtitle from: ", str2), new Object[0]);
            return z6xVar;
        }
    }
}
