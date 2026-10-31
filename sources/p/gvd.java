package p;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gvd implements Comparator {
    public final boolean a;
    public final List b;

    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa  */
    public gvd(List list, djo djoVar, boolean z) {
        List list2;
        this.a = z;
        if (list.isEmpty()) {
            list2 = z ? hvd.c : hvd.a;
        } else {
            List<String> list3 = list;
            boolean z2 = list3 instanceof Collection;
            if (!z2 || !list3.isEmpty()) {
                for (String str : list3) {
                    Set set = s4b1.f;
                    if (!uic.g(str, blc0.Pg)) {
                        if (z2 && list3.isEmpty()) {
                            list2 = hvd.g;
                        } else {
                            for (String str2 : list3) {
                                Set set2 = s4b1.f;
                                if (!uic.g(str2, blc0.fh)) {
                                    if (!z2 || !list3.isEmpty()) {
                                        for (String str3 : list3) {
                                            Set set3 = s4b1.f;
                                            if (!uic.g(str3, blc0.ti)) {
                                                list2 = this.a ? hvd.b : hvd.a;
                                            }
                                        }
                                        if (this.a) {
                                            list2 = hvd.f;
                                        } else {
                                            list2 = hvd.a;
                                        }
                                    } else if (this.a) {
                                        list2 = hvd.f;
                                    } else {
                                        list2 = hvd.a;
                                    }
                                }
                            }
                            list2 = hvd.g;
                        }
                    }
                }
                if (this.a) {
                    list2 = hvd.e;
                } else {
                    list2 = hvd.d;
                }
            } else if (this.a) {
                list2 = hvd.e;
            } else {
                list2 = hvd.d;
            }
        }
        this.b = djoVar.n(list2);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        yrd yrdVar = (yrd) obj;
        yrd yrdVar2 = (yrd) obj2;
        int iR = u890.r(yrdVar2.j, yrdVar.j);
        if (iR != 0) {
            return iR;
        }
        pud pudVar = yrdVar.f;
        List list = this.b;
        int iIndexOf = list.indexOf(pudVar);
        if (iIndexOf == -1) {
            iIndexOf = list.size();
        }
        int iIndexOf2 = list.indexOf(yrdVar2.f);
        if (iIndexOf2 == -1) {
            iIndexOf2 = list.size();
        }
        return iIndexOf - iIndexOf2;
    }
}
