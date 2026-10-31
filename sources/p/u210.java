package p;

import com.spotify.libs.sociallistening.events.proto.JamResolveTokenResult;
import com.spotify.reflection.reflectionelement.events.proto.ReflectionEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u210 {
    public final t2j0 a;

    public void a(Collection collection) {
        a1a0 a1a0VarP = JamResolveTokenResult.p();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(q7h.U(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((cot) it.next()).a);
        }
        a1a0VarP.q(arrayList);
        ArrayList arrayList2 = new ArrayList(q7h.U(collection2, 10));
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((cot) it2.next()).b);
        }
        a1a0VarP.n(arrayList2);
        a1a0VarP.s("server");
        a1a0VarP.t("404:not_found");
        this.a.a(a1a0VarP.build());
    }

    public void b(lv21 lv21Var) {
        a1a0 a1a0VarP = JamResolveTokenResult.p();
        List list = lv21Var.c;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((jw21) it.next()).b);
        }
        a1a0VarP.q(arrayList);
        ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((jw21) it2.next()).a);
        }
        a1a0VarP.n(arrayList2);
        a1a0VarP.u(lv21Var.a.a.a);
        a1a0VarP.r(lv21Var.e);
        this.a.a(a1a0VarP.build());
    }

    public void c(String str, List list, String str2) {
        String str3;
        id11 id11VarO = ReflectionEvent.o();
        id11VarO.q(str);
        id11VarO.r(str2);
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((sc11) it.next()).ordinal();
            if (iOrdinal == 0) {
                str3 = "Meaningful";
            } else if (iOrdinal == 1) {
                str3 = "Regretful";
            } else if (iOrdinal == 2) {
                str3 = "Fun";
            } else if (iOrdinal == 3) {
                str3 = "Interesting";
            } else if (iOrdinal == 4) {
                str3 = "Enjoyable";
            } else {
                if (iOrdinal != 5) {
                    eg.o();
                    return;
                }
                str3 = "Boring";
            }
            arrayList.add(str3);
        }
        id11VarO.n(arrayList);
        ReflectionEvent reflectionEventBuild = id11VarO.build();
        reflectionEventBuild.getClass();
        this.a.a(reflectionEventBuild);
    }
}
