package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mxj implements vr20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ txj c;
    public final /* synthetic */ List d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ List f;
    public final /* synthetic */ ven0 g;

    public mxj(int i, List list, txj txjVar, List list2, ArrayList arrayList, List list3, ven0 ven0Var) {
        this.a = i;
        this.b = list;
        this.c = txjVar;
        this.d = list2;
        this.e = arrayList;
        this.f = list3;
        this.g = ven0Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        int i;
        Object next;
        int i2;
        int size;
        int size2;
        vwj vwjVar = (vwj) obj;
        int i3 = vwjVar.a - this.a;
        if (i3 < 0) {
            i3 = 0;
        }
        List list = this.b;
        int size3 = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size3 && ((rrj0) list.get(i5)).a + i5 <= i3; i5++) {
            i4++;
        }
        txj txjVar = this.c;
        bpb1 bpb1Var = txjVar.k;
        int i6 = i3 - i4;
        if (i6 < 0) {
            i6 = 0;
        }
        bpb1Var.m((Object) null, new Integer(i6));
        for (Map.Entry entry : txjVar.o.entrySet()) {
            String str = (String) entry.getKey();
            sen0 sen0Var = (sen0) entry.getValue();
            if (u890.j(str, (String) this.g.getValue())) {
                sen0Var.a(new Integer(0));
            } else {
                int size4 = this.d.size();
                ArrayList arrayList = this.e;
                Iterator it = arrayList.iterator();
                int i7 = 0;
                while (true) {
                    i = -1;
                    if (!it.hasNext()) {
                        i7 = -1;
                        break;
                    }
                    if (u890.j((String) it.next(), str)) {
                        break;
                    }
                    i7++;
                }
                if (i7 != -1) {
                    i = i7;
                } else {
                    List list2 = list;
                    Iterator it2 = list2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!u890.j(((rrj0) next).b, str));
                    rrj0 rrj0Var = (rrj0) next;
                    if (rrj0Var != null) {
                        size = rrj0Var.a;
                        if (size > size4) {
                            size = size4;
                        }
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            i2 = 0;
                        } else {
                            Iterator it3 = list2.iterator();
                            i2 = 0;
                            while (it3.hasNext()) {
                                int i8 = ((rrj0) it3.next()).a;
                                if (i8 > size4) {
                                    i8 = size4;
                                }
                                if (i8 < size && (i2 = i2 + 1) < 0) {
                                    p7h.S();
                                    throw null;
                                }
                            }
                        }
                        size2 = arrayList.size();
                    } else {
                        Iterator it4 = this.f.iterator();
                        i2 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            if (u890.j((String) it4.next(), str)) {
                                break;
                            }
                            i2++;
                        }
                        if (i2 != -1) {
                            size = arrayList.size() + size4;
                            size2 = list.size();
                        }
                    }
                    i = size2 + size + i2;
                }
                sen0Var.a(new Integer(i - vwjVar.b));
            }
        }
        return rih1.a;
    }
}
