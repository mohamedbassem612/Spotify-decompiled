package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jur {
    public final g0l a;
    public final zor b;

    public jur(g0l g0lVar, zor zorVar) {
        this.a = g0lVar;
        this.b = zorVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:63:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0085 A[SYNTHETIC] */
    public final void a(String str, String str2, String str3, f0u f0uVar) {
        l0l l0lVar;
        ArrayList arrayList;
        List listI = this.a.i();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listI) {
            if (u890.j(((l0l) obj).d(), str)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            l0lVar = null;
        } else if (arrayList2.size() == 1) {
            l0lVar = (l0l) o7h.q0(arrayList2);
        } else if (str2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (u890.j(((l0l) obj2).getName(), str2)) {
                    arrayList3.add(obj2);
                }
            }
            if (arrayList3.size() == 1) {
                l0lVar = (l0l) o7h.q0(arrayList3);
            } else if (f0uVar != null) {
                arrayList = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (((l0l) obj3).getType() == f0uVar) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.size() == 1) {
                    l0lVar = (l0l) o7h.q0(arrayList);
                } else if (str2 != null || f0uVar == null) {
                    l0lVar = (l0l) o7h.q0(arrayList2);
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : arrayList2) {
                        l0l l0lVar2 = (l0l) obj4;
                        if (u890.j(l0lVar2.getName(), str2) && l0lVar2.getType() == f0uVar) {
                            arrayList4.add(obj4);
                        }
                    }
                    if (arrayList4.isEmpty()) {
                        l0lVar = (l0l) o7h.q0(arrayList2);
                    } else {
                        l0lVar = (l0l) o7h.q0(arrayList4);
                    }
                }
            } else if (str2 != null) {
                l0lVar = (l0l) o7h.q0(arrayList2);
            } else {
                l0lVar = (l0l) o7h.q0(arrayList2);
            }
        } else if (f0uVar != null) {
            arrayList = new ArrayList();
            while (r2.hasNext()) {
                if (((l0l) obj3).getType() == f0uVar) {
                    arrayList.add(obj3);
                }
            }
            if (arrayList.size() == 1) {
                l0lVar = (l0l) o7h.q0(arrayList);
            } else if (str2 != null) {
                l0lVar = (l0l) o7h.q0(arrayList2);
            } else {
                l0lVar = (l0l) o7h.q0(arrayList2);
            }
        } else if (str2 != null) {
            l0lVar = (l0l) o7h.q0(arrayList2);
        } else {
            l0lVar = (l0l) o7h.q0(arrayList2);
        }
        if (l0lVar == null) {
            return;
        }
        zor.k(this.b, l0lVar.j(), str3, 28);
    }
}
