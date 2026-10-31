package p;

import android.graphics.Color;
import android.net.Uri;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j9c1 implements vmt, Function {
    public final List a;

    public /* synthetic */ j9c1(List list) {
        this.a = list;
    }

    public Object a(wa71 wa71Var, llw0 llw0Var, jlw0 jlw0Var, Uri uri, onm onmVar) {
        return b(wa71Var, llw0Var != null ? lcc.F(llw0Var) : null, jlw0Var != null ? new bnt(jlw0Var.a) : null, uri);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0205  */
    public Object apply(Object obj) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        String str;
        ArrayList arrayList;
        Object next;
        u281 u281Var;
        Map map = ((xu00) obj).a;
        List list = (List) map.get(l98.class);
        ArrayList arrayList2 = null;
        LinkedHashMap linkedHashMap5 = b7x.a;
        if (list != null) {
            List<vu00> list2 = list;
            int iS = zno1.s(q7h.U(list2, 10));
            if (iS < 16) {
                iS = 16;
            }
            linkedHashMap = new LinkedHashMap(iS);
            for (vu00 vu00Var : list2) {
                String str2 = vu00Var.a;
                l98 l98Var = vu00Var.b;
                if (l98Var == null) {
                    bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.audiobookgenres.AudiobookGenres");
                    return null;
                }
                linkedHashMap.put(str2, l98Var);
            }
        } else {
            linkedHashMap = linkedHashMap5;
        }
        List list3 = (List) map.get(w281.class);
        if (list3 != null) {
            List<vu00> list4 = list3;
            int iS2 = zno1.s(q7h.U(list4, 10));
            if (iS2 < 16) {
                iS2 = 16;
            }
            linkedHashMap2 = new LinkedHashMap(iS2);
            for (vu00 vu00Var2 : list4) {
                String str3 = vu00Var2.a;
                w281 w281Var = vu00Var2.b;
                if (w281Var == null) {
                    bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.showaccess.ShowAccessInfo");
                    return null;
                }
                linkedHashMap2.put(str3, w281Var);
            }
        } else {
            linkedHashMap2 = linkedHashMap5;
        }
        List list5 = (List) map.get(v6v0.class);
        if (list5 != null) {
            List<vu00> list6 = list5;
            int iS3 = zno1.s(q7h.U(list6, 10));
            if (iS3 < 16) {
                iS3 = 16;
            }
            linkedHashMap3 = new LinkedHashMap(iS3);
            for (vu00 vu00Var3 : list6) {
                String str4 = vu00Var3.a;
                v6v0 v6v0Var = vu00Var3.b;
                if (v6v0Var == null) {
                    bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.podcastrating.PodcastRating");
                    return null;
                }
                linkedHashMap3.put(str4, v6v0Var);
            }
        } else {
            linkedHashMap3 = linkedHashMap5;
        }
        List list7 = (List) map.get(zc8.class);
        if (list7 != null) {
            List<vu00> list8 = list7;
            int iS4 = zno1.s(q7h.U(list8, 10));
            if (iS4 < 16) {
                iS4 = 16;
            }
            linkedHashMap4 = new LinkedHashMap(iS4);
            for (vu00 vu00Var4 : list8) {
                String str5 = vu00Var4.a;
                zc8 zc8Var = vu00Var4.b;
                if (zc8Var == null) {
                    bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.audiobookspecifics.AudiobookSpecifics");
                    return null;
                }
                linkedHashMap4.put(str5, zc8Var);
            }
        } else {
            linkedHashMap4 = linkedHashMap5;
        }
        List list9 = (List) map.get(z070.class);
        if (list9 != null) {
            List<vu00> list10 = list9;
            int iS5 = zno1.s(q7h.U(list10, 10));
            linkedHashMap5 = new LinkedHashMap(iS5 >= 16 ? iS5 : 16);
            for (vu00 vu00Var5 : list10) {
                String str6 = vu00Var5.a;
                z070 z070Var = vu00Var5.b;
                if (z070Var == null) {
                    bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.htmldescription.HtmlDescription");
                    return null;
                }
                linkedHashMap5.put(str6, z070Var);
            }
        }
        List<eh90> list11 = this.a;
        ArrayList arrayList3 = new ArrayList(q7h.U(list11, 10));
        for (eh90 eh90Var : list11) {
            if (eh90Var instanceof eh90) {
                eh90 eh90Var2 = eh90Var;
                String str7 = eh90Var2.a;
                zc8 zc8Var2 = (zc8) linkedHashMap4.get(str7);
                z070 z070Var2 = (z070) linkedHashMap5.get(str7);
                String str8 = z070Var2 != null ? z070Var2.a : eh90Var2.g;
                l98 l98Var2 = (l98) linkedHashMap.get(str7);
                ArrayList arrayList4 = l98Var2 != null ? l98Var2.a : arrayList2;
                v6v0 v6v0Var2 = (v6v0) linkedHashMap3.get(str7);
                float f = v6v0Var2 != null ? (float) v6v0Var2.c.a : 0.0f;
                long j = zc8Var2 != null ? zc8Var2.f : 0L;
                long j2 = zc8Var2 != null ? zc8Var2.e / 1000 : 0L;
                w281 w281Var2 = (w281) linkedHashMap2.get(str7);
                String str9 = (w281Var2 == null || (u281Var = w281Var2.g) == null) ? null : u281Var.a;
                if (arrayList4 != null) {
                    Iterator it = arrayList4.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            int i = ((k98) next).c;
                            do {
                                Object next2 = it.next();
                                int i2 = ((k98) next2).c;
                                if (i > i2) {
                                    next = next2;
                                    i = i2;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    k98 k98Var = (k98) next;
                    if (k98Var != null) {
                        str = k98Var.a;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                String str10 = str;
                if (zc8Var2 != null) {
                    ArrayList arrayList5 = zc8Var2.c.a;
                    arrayList = new ArrayList(q7h.U(arrayList5, 10));
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((l6o) it2.next()).a);
                    }
                } else {
                    arrayList = z6x.a;
                }
                eh90Var = new eh90(str7, eh90Var2.b, eh90Var2.c, str10, f, eh90Var2.f, str8, eh90Var2.h, str9, eh90Var2.t, j2, arrayList, j);
            }
            arrayList3.add(eh90Var);
            linkedHashMap5 = linkedHashMap5;
            arrayList2 = null;
        }
        return arrayList3;
    }

    public Object b(wa71 wa71Var, t0c t0cVar, bnt bntVar, Uri uri) {
        String str;
        vkc0 vkc0VarB = wa71.b(wa71Var);
        if (t0cVar == null) {
            return null;
        }
        if (t0cVar instanceof bnt) {
            String str2 = ((bnt) t0cVar).e;
            Uri uri2 = (bntVar == null || (str = bntVar.e) == null) ? null : Uri.parse(str);
            return new g9c1(vkc0VarB.a, new bnt(str2), uri2 != null ? new bnt(uri2) : null, vkc0VarB.b, vkc0VarB.c, vkc0VarB.d, (o371) null, 64);
        }
        boolean z = t0cVar instanceof cnt;
        if (!z) {
            if (t0cVar instanceof ant) {
                return new f9c1(vkc0VarB.a, (ant) t0cVar, bntVar, vkc0VarB.b, vkc0VarB.c, vkc0VarB.d, new o371((String) null, false, false, 7));
            }
            eg.o();
            return null;
        }
        yy61 yy61Var = yy61.h;
        List list = this.a;
        if (!list.contains(yy61Var) && !list.contains(yy61.g)) {
            return new f9c1(vkc0VarB.a, new ant(Color.parseColor("#1F1F1F"), Color.parseColor("#1F1F1F")), bntVar, vkc0VarB.b, vkc0VarB.c, vkc0VarB.d, new o371((String) null, false, false, 7));
        }
        String str3 = vkc0VarB.a;
        if (z) {
            return new h9c1(str3, (cnt) t0cVar, bntVar, vkc0VarB.b, vkc0VarB.c, vkc0VarB.d, (o371) null, 64);
        }
        hhg1.n("Cannot create StoryShareData.Video without a video background");
        return null;
    }
}
