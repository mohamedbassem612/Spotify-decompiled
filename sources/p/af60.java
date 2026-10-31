package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class af60 implements tyq {
    public final gw70 a;
    public final lzn0 b;
    public final j2i c;
    public final u3e0 d = o2p1.n();
    public final f4r e;
    public final idd1 f;
    public final js20 g;
    public final ia00 h;
    public final df60 i;
    public static final /* synthetic */ mma0[] t = {new cey0(af60.class, "dataPool", "getDataPool()Lcom/spotify/kodiak/dataloader/DataPool;", 0)};
    public static final byte X = 8;

    public af60(gw70 gw70Var, lzn0 lzn0Var, tsq tsqVar, j2i j2iVar) {
        this.a = gw70Var;
        this.b = lzn0Var;
        this.c = j2iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h4r(new z5z(this, (byte) 18), se60.a));
        this.e = arrayList.isEmpty() ? i13.j : arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        this.f = new idd1(new ze60(this, (byte) 0));
        this.g = x3p1.n(new zi50(this, (byte) 14), z860.a1, new yg20(this, (byte) 19), (o8n) null, (iu30) null, 24);
        this.h = n3o1.q(this).a(oe60.d, oe60.e);
        this.i = new df60(tsqVar, new ze60(this, (byte) 1));
    }

    public static ArrayList f(ue60 ue60Var) {
        c380 c380Var = ue60Var.c;
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        Iterator it = c380Var.iterator();
        while (it.hasNext()) {
            arrayList.add(new te60((String) it.next(), ue60Var.d, null));
        }
        return arrayList;
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    public final d0r e() {
        mma0 mma0Var = t[0];
        return this.d.a;
    }

    public final mqw getBehavior() {
        return this.g;
    }

    public final f4r getData() {
        return this.e;
    }
}
