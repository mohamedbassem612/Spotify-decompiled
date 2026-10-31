package p;

import com.spotify.player.model.BitrateLevel;
import com.spotify.player.model.BitrateStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class v7f0 {
    public static final idd1 a = new idd1(i0f0.i);

    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:60:0x011b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0150 A[LOOP:2: B:64:0x014a->B:66:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x015d A[LOOP:0: B:38:0x0093->B:68:0x015d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0115 A[SYNTHETIC] */
    public static final ArrayList a(zaf0 zaf0Var) {
        xtd xtdVar;
        i9f0 i9f0Var;
        w690 w690Var;
        ual ualVar;
        Iterator it;
        mmr0 mmr0Var;
        x7f0 x7f0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it2;
        xa0 xa0Var = zaf0Var.d;
        xpb1 xpb1Var = (xpb1) a.getValue();
        ual ualVar2 = zaf0Var.a;
        u6o0 u6o0Var = zaf0Var.g;
        vdu0 vdu0Var = zaf0Var.e;
        BitrateStrategy bitrateStrategy = vdu0Var.e;
        boolean z = false;
        boolean z2 = bitrateStrategy == BitrateStrategy.BACKEND_ADVISED;
        BitrateLevel bitrateLevel = vdu0Var.b;
        boolean z3 = z2;
        BitrateLevel bitrateLevel2 = vdu0Var.c;
        if ((xa0Var != null && xa0Var.c) || (xa0Var != null && xa0Var.f)) {
            z = true;
        }
        if (xa0Var != null && (!xa0Var.c)) {
            i9f0Var = i9f0.b;
        } else if (bitrateStrategy == BitrateStrategy.CACHED_FILE) {
            i9f0Var = i9f0.d;
        } else if (bitrateStrategy == BitrateStrategy.OFFLINED_FILE) {
            i9f0Var = i9f0.c;
        } else {
            i9f0Var = bitrateStrategy == BitrateStrategy.LOCAL_FILE ? i9f0.e : i9f0.a;
        }
        xpb1 xpb1Var2 = (xpb1) s690.b.getValue();
        BitrateLevel bitrateLevel3 = vdu0Var.b;
        BitrateLevel bitrateLevel4 = vdu0Var.c;
        BitrateStrategy bitrateStrategy2 = vdu0Var.e;
        boolean z4 = vdu0Var.d;
        if (xa0Var != null) {
            ualVar = ualVar2;
            boolean z5 = xa0Var.f;
            w690Var = new w690(bitrateLevel3, bitrateLevel4, bitrateStrategy2, z4, z5, zaf0Var.g);
            it = xpb1Var2.a.iterator();
            while (true) {
                if (it.hasNext()) {
                    bhn0.t("Collection contains no element matching the predicate.");
                    return null;
                }
                mmr0Var = (mmr0) it.next();
                if (((yzq) mmr0Var.a).match(w690Var)) {
                    r690 r690Var = (r690) mmr0Var.b;
                    boolean z6 = vdu0Var.d;
                    if (xa0Var == null && (!xa0Var.c)) {
                        x7f0Var = x7f0.b;
                    } else if (zaf0Var.f != null) {
                        x7f0Var = x7f0.c;
                    } else if ((xa0Var != null ? xa0Var.b : null) == f0u.b) {
                        x7f0Var = x7f0.d;
                    } else {
                        x7f0Var = x7f0.a;
                    }
                    xtdVar = new xtd(ualVar, u6o0Var, z3, bitrateLevel, bitrateLevel2, z, i9f0Var, r690Var, z6, x7f0Var, u890.j(zaf0Var.h, Boolean.TRUE), zaf0Var.c, zaf0Var.i, zaf0Var.j, zaf0Var.k, zaf0Var.l, zaf0Var.m, zaf0Var.n, zaf0Var.o);
                    List list = xpb1Var.a;
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((yzq) ((mmr0) obj).a).match(xtdVar)) {
                            arrayList.add(obj);
                        }
                    }
                    List listD1 = o7h.d1(arrayList, Math.max(1, 3));
                    arrayList2 = new ArrayList(q7h.U(listD1, 10));
                    it2 = listD1.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((mmr0) it2.next()).b);
                    }
                    return arrayList2;
                }
                bitrateLevel = bitrateLevel;
                i9f0Var = i9f0Var;
            }
        } else {
            ualVar = ualVar2;
        }
        w690Var = new w690(bitrateLevel3, bitrateLevel4, bitrateStrategy2, z4, z5, zaf0Var.g);
        it = xpb1Var2.a.iterator();
        while (true) {
            if (it.hasNext()) {
                bhn0.t("Collection contains no element matching the predicate.");
                return null;
            }
            mmr0Var = (mmr0) it.next();
            if (((yzq) mmr0Var.a).match(w690Var)) {
                r690 r690Var2 = (r690) mmr0Var.b;
                boolean z7 = vdu0Var.d;
                if (xa0Var == null) {
                }
                if (zaf0Var.f != null) {
                    x7f0Var = x7f0.c;
                } else if ((xa0Var != null ? xa0Var.b : null) == f0u.b) {
                    x7f0Var = x7f0.d;
                } else {
                    x7f0Var = x7f0.a;
                }
                xtdVar = new xtd(ualVar, u6o0Var, z3, bitrateLevel, bitrateLevel2, z, i9f0Var, r690Var2, z7, x7f0Var, u890.j(zaf0Var.h, Boolean.TRUE), zaf0Var.c, zaf0Var.i, zaf0Var.j, zaf0Var.k, zaf0Var.l, zaf0Var.m, zaf0Var.n, zaf0Var.o);
                List list2 = xpb1Var.a;
                arrayList = new ArrayList();
                while (r1.hasNext()) {
                    if (((yzq) ((mmr0) obj).a).match(xtdVar)) {
                        arrayList.add(obj);
                    }
                }
                List listD2 = o7h.d1(arrayList, Math.max(1, 3));
                arrayList2 = new ArrayList(q7h.U(listD2, 10));
                it2 = listD2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((mmr0) it2.next()).b);
                }
                return arrayList2;
            }
            bitrateLevel = bitrateLevel;
            i9f0Var = i9f0Var;
        }
    }
}
