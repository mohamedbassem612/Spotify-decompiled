package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y0t implements xpw {
    public final we20 a;
    public final shp b;
    public final iu30 c;
    public final idd1 d = new idd1(new ots(this, (byte) 13));
    public final rey0 e = new rey0(new b1s(this, (byte) 25));
    public final ia00 f = n3o1.q(this).a(v0t.f, v0t.g);
    public final psw g;

    public y0t(we20 we20Var, shp shpVar, iu30 iu30Var) {
        this.a = we20Var;
        this.b = shpVar;
        this.c = iu30Var;
        j2i j2iVar = new j2i(-1777405888, new i6r(this, (byte) 24), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    public final pix e(otl otlVar) {
        if (otlVar instanceof vod1) {
            return g((vod1) otlVar, z6x.a);
        }
        if (otlVar instanceof d6c0) {
            return f((d6c0) otlVar);
        }
        eg.o();
        return null;
    }

    public final pix f(d6c0 d6c0Var) {
        boolean z = d6c0Var.a;
        int i = 0;
        we20 we20Var = this.a;
        if (z) {
            String strG = ero1.g(d6c0Var);
            String strB = we20Var.b(d6c0Var);
            String strA = we20Var.a(d6c0Var);
            List listA = d6c0Var.a();
            ArrayList arrayList = new ArrayList(listA.size());
            int size = listA.size();
            while (i < size) {
                arrayList.add(f((d6c0) listA.get(i)));
                i++;
            }
            return new nix(strG, mqo1.F(arrayList), strB, strA);
        }
        String strG2 = ero1.g(d6c0Var);
        String strB2 = we20Var.b(d6c0Var);
        String strA2 = we20Var.a(d6c0Var);
        List listA2 = d6c0Var.a();
        ArrayList arrayList2 = new ArrayList(listA2.size());
        int size2 = listA2.size();
        while (i < size2) {
            arrayList2.add(f((d6c0) listA2.get(i)));
            i++;
        }
        return new oix(strG2, mqo1.F(arrayList2), strB2, strA2);
    }

    public final nix g(vod1 vod1Var, List list) {
        String str = vod1Var.a;
        we20 we20Var = this.a;
        String strB = we20Var.b(vod1Var);
        String strA = we20Var.a(vod1Var);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            d6c0 d6c0Var = (d6c0) list.get(i);
            d6c0Var.getClass();
            arrayList.add(new oix(ero1.g(d6c0Var), we20Var.b(d6c0Var), 8, we20Var.a(d6c0Var)));
        }
        return new nix(str, mqo1.F(arrayList), strB, strA);
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
