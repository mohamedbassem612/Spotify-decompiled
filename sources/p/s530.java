package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s530 {
    public final dma1 a;
    public sha1 b;
    public int c = 2;
    public final bpb1 d = gio1.b(new mmr0(a(), d()));

    public s530(dma1 dma1Var) {
        this.a = dma1Var;
    }

    public final ArrayList a() {
        bma1 bma1Var = t530.a;
        dma1 dma1Var = this.a;
        Set set = w7x.a;
        Set setB = dma1Var.b(bma1Var, set);
        if (setB != null) {
            set = setB;
        }
        List<pa20> listM = p7h.M(new pa20[]{new na20(), new ma20(), new oa20(), new ka20()});
        ArrayList arrayList = new ArrayList(q7h.U(listM, 10));
        for (pa20 pa20Var : listM) {
            String str = pa20Var.a;
            arrayList.add(new qa20(str, set.contains(str), pa20Var));
        }
        return arrayList;
    }

    public final xj61 b() {
        ArrayList arrayListA = a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListA) {
            if (((qa20) obj).b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((qa20) it.next()).c);
        }
        xj61 xj61Var = new xj61();
        boolean zContains = arrayList2.contains(new ma20());
        boolean zContains2 = arrayList2.contains(new na20());
        if (zContains && zContains2) {
            xj61Var.add(drc0.a);
        } else if (zContains) {
            xj61Var.add(crc0.a);
        } else if (zContains2) {
            xj61Var.add(krc0.a);
        }
        if (arrayList2.contains(new oa20())) {
            xj61Var.add(nrc0.a);
        }
        if (arrayList2.contains(new ka20())) {
            xj61Var.add(pqc0.a);
        }
        return cwl1.j(xj61Var);
    }

    public final g3d0 c() {
        Object next;
        qha1 qha1Var;
        if (this.b != null) {
            Iterator it = d().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((uha1) next).c);
            uha1 uha1Var = (uha1) next;
            sha1 sha1Var = uha1Var != null ? uha1Var.b : null;
            int i = (uha1Var == null || (qha1Var = uha1Var.d) == null) ? 0 : qha1Var.a;
            int i2 = sha1Var == null ? -1 : r530.a[sha1Var.ordinal()];
            if (i2 == 1) {
                return new c3d0(i == 2);
            }
            if (i2 == 2) {
                return new e3d0(i == 2);
            }
        }
        return null;
    }

    public final ArrayList d() {
        int i;
        sha1 sha1Var = sha1.a;
        sha1 sha1Var2 = sha1.c;
        List<sha1> listM = p7h.M(new sha1[]{sha1Var2, sha1Var});
        ArrayList arrayList = new ArrayList(q7h.U(listM, 10));
        for (sha1 sha1Var3 : listM) {
            boolean z = true;
            int i2 = 2;
            if (sha1Var3 == this.b) {
                i = this.c;
            } else {
                int iOrdinal = sha1Var3.ordinal();
                i = (iOrdinal == 0 || iOrdinal != 2) ? 1 : 2;
            }
            int iOrdinal2 = sha1Var3.ordinal();
            if (iOrdinal2 == 0) {
                i2 = 1;
            } else if (iOrdinal2 != 2) {
                i2 = 3;
            }
            qha1 qha1Var = new qha1(i, i2);
            String lowerCase = sha1Var3.name().toLowerCase(Locale.ROOT);
            sha1 sha1Var4 = this.b;
            if (sha1Var4 == null) {
                sha1Var4 = sha1Var2;
            }
            if (sha1Var3 != sha1Var4) {
                z = false;
            }
            arrayList.add(new uha1(lowerCase, sha1Var3, z, qha1Var));
        }
        return arrayList;
    }
}
