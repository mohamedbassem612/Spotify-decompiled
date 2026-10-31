package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class wb20 {
    public static final ub20 a = new ub20();

    /* JADX WARN: Code duplicated, block: B:31:0x007b A[LOOP:0: B:29:0x0075->B:31:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static final ub20 a(Map map, nfa0 nfa0Var) {
        ub20 m231Var;
        ArrayList arrayList;
        Iterator it;
        List list;
        int i;
        Iterator it2;
        String str = (String) map.get("filter_pill_metadata");
        if (str != null) {
            try {
                m231Var = (ub20) nfa0Var.a(str, ub20.Companion.serializer());
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            ub20 ub20Var = null;
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            ub20 ub20Var2 = m231Var;
            if (ub20Var2 != null) {
                List list2 = ub20Var2.b;
                if (ub20Var2.a) {
                    List list3 = list2;
                    if ((list3 instanceof Collection) && list3.isEmpty()) {
                        List list4 = list2;
                        arrayList = new ArrayList(q7h.U(list4, 10));
                        it = list4.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((jb20) it.next()).a);
                        }
                        if (o7h.j0(arrayList).size() == list2.size()) {
                            list = list2;
                            i = 0;
                            if (list instanceof Collection) {
                                it2 = list.iterator();
                                while (it2.hasNext()) {
                                    if (!((jb20) it2.next()).c) {
                                    }
                                }
                            } else {
                                it2 = list.iterator();
                                while (it2.hasNext()) {
                                    if (!((jb20) it2.next()).c) {
                                    }
                                }
                            }
                            if (i <= 1) {
                                ub20Var = ub20Var2;
                            }
                        }
                    } else {
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                jb20 jb20Var = (jb20) it3.next();
                                if (ihc1.y0(jb20Var.a) || ihc1.y0(jb20Var.b)) {
                                }
                            } else {
                                List list5 = list2;
                                arrayList = new ArrayList(q7h.U(list5, 10));
                                it = list5.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((jb20) it.next()).a);
                                }
                                if (o7h.j0(arrayList).size() == list2.size()) {
                                    list = list2;
                                    i = 0;
                                    if ((list instanceof Collection) || !list.isEmpty()) {
                                        it2 = list.iterator();
                                        while (it2.hasNext()) {
                                            if (!((jb20) it2.next()).c && (i = i + 1) < 0) {
                                                p7h.S();
                                                throw null;
                                            }
                                        }
                                    }
                                    if (i <= 1) {
                                        ub20Var = ub20Var2;
                                    }
                                }
                            }
                        }
                    }
                }
                if (ub20Var != null) {
                    return ub20Var;
                }
            }
        }
        return a;
    }
}
