package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l3b0 implements q3b0 {
    public int a;
    public String b;
    public String m;
    public y3b0 n;
    public final ArrayList r;
    public final ArrayList c = new ArrayList(0);
    public final ArrayList d = new ArrayList(1);
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList(0);
    public final ArrayList h = new ArrayList(1);
    public final ArrayList i = new ArrayList(0);
    public final ArrayList j = new ArrayList(0);
    public final ArrayList k = new ArrayList(0);
    public final ArrayList l = new ArrayList(0);
    public final ArrayList o = new ArrayList(0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f27p = new ArrayList(0);
    public final ArrayList q = new ArrayList(0);

    public l3b0() {
        zjj0.a.getClass();
        List listA = yjj0.a();
        ArrayList arrayList = new ArrayList(q7h.U(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((gja0) ((zjj0) it.next())).getClass();
            arrayList.add(new sia0());
        }
        this.r = arrayList;
    }

    @Override // p.q3b0
    public final ArrayList a() {
        return this.f;
    }

    @Override // p.q3b0
    public final ArrayList b() {
        return this.g;
    }

    @Override // p.q3b0
    public final ArrayList c() {
        return this.e;
    }

    public final ArrayList d() {
        return this.h;
    }

    public final String e() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        u890.C("name");
        throw null;
    }
}
