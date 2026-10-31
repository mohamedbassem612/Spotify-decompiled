package p;

import com.spotify.kodiak.table.table.DataSourceException;
import com.spotify.kodiak.table.table.DataSourceException$UnsupportedKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tmv0 implements qua0 {
    public final zjd1 a;
    public final List b;
    public final zhq0 c = new zhq0((byte) 14);

    public tmv0(zjd1 zjd1Var, List list) {
        this.a = zjd1Var;
        this.b = list;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:3:0x0008, B:7:0x0012, B:9:0x0018, B:25:0x005b, B:28:0x0062, B:12:0x002b, B:13:0x0030, B:15:0x0036, B:20:0x0051, B:18:0x004d, B:29:0x0064, B:30:0x0067, B:31:0x006e, B:33:0x0074, B:47:0x00a9, B:48:0x00ae, B:49:0x00b1, B:34:0x0080, B:36:0x0086, B:38:0x008c, B:41:0x0099, B:44:0x009f, B:46:0x00a4), top: B:54:0x0008, inners: #1 }] */
    public final void b(ses0 ses0Var) {
        List<qmv0> list;
        Integer numValueOf;
        int i = ses0Var.a;
        zhq0 zhq0Var = this.c;
        ues0 ues0VarB = zhq0Var.b(i);
        try {
            int[] iArr = ues0VarB.a;
            int i2 = ses0Var.a;
            int i3 = 0;
            while (true) {
                list = this.b;
                if (i3 >= i2) {
                    break;
                }
                if (ses0Var.g(i3)) {
                    jh5 jh5VarH = ses0Var.h(i3);
                    jh5VarH.getClass();
                    if (u890.j(jh5VarH.a, this.a)) {
                        Iterator it = list.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i4 = -1;
                                break;
                            } else if (((Boolean) ((qmv0) it.next()).b.invoke(jh5VarH.b)).booleanValue()) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        numValueOf = Integer.valueOf(i4);
                        if (i4 >= 0) {
                        }
                        iArr[i3] = numValueOf != null ? numValueOf.intValue() : -1;
                    }
                    numValueOf = null;
                    iArr[i3] = numValueOf != null ? numValueOf.intValue() : -1;
                }
                i3++;
            }
            int i5 = 0;
            for (qmv0 qmv0Var : list) {
                int i6 = i5 + 1;
                long jK = ses0Var.k();
                try {
                    int i7 = ses0Var.a;
                    boolean z = false;
                    for (int i8 = 0; i8 < i7; i8++) {
                        if (ses0Var.g(i8)) {
                            ses0Var.h(i8).getClass();
                            if (iArr[i8] == i5) {
                                z = true;
                            } else {
                                ses0Var.d(i8);
                            }
                        }
                    }
                    if (z) {
                        qmv0Var.a.b(ses0Var);
                    }
                    ses0Var.i(jK);
                    i5 = i6;
                } catch (Throwable th) {
                    ses0Var.i(jK);
                    throw th;
                }
            }
            zhq0Var.r(ues0VarB);
        } catch (Throwable th2) {
            zhq0Var.r(ues0VarB);
            throw th2;
        }
    }

    public final pua0 c(iu30 iu30Var) {
        List list = this.b;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((qmv0) it.next()).a.c(iu30Var));
        }
        return new smv0(this, arrayList);
    }

    public final zjd1 d() {
        return this.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.kodiak.table.table.DataSourceException */
    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    public final int f(Object obj) throws DataSourceException {
        Iterator it = this.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((Boolean) ((qmv0) it.next()).b.invoke(obj)).booleanValue()) {
                if (i != -1) {
                    return i;
                }
                throw new DataSourceException$UnsupportedKey(new jh5(this.a, obj));
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            return i;
        }
        throw new DataSourceException$UnsupportedKey(new jh5(this.a, obj));
    }

    public final LinkedHashMap g(Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            Integer numValueOf = Integer.valueOf(f(obj));
            Object linkedHashSet = linkedHashMap.get(numValueOf);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(numValueOf, linkedHashSet);
            }
            ((Set) linkedHashSet).add(obj);
        }
        return linkedHashMap;
    }
}
