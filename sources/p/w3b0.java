package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w3b0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ mma0[] f47p = {new een0(w3b0.class, "_hasSetter", "get_hasSetter()Z", 0), new een0(w3b0.class, "_hasGetter", "get_hasGetter()Z", 0)};
    public int a;
    public final String b;
    public final x3b0 c;
    public final x3b0 d;
    public final ArrayList e;
    public y3b0 f;
    public final ArrayList g;
    public final ArrayList h;
    public c4b0 i;
    public y3b0 j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;

    public w3b0(int i, int i2, int i3, String str) {
        this.a = i;
        this.b = str;
        mgc mgcVarQ = u2p1.q(new go20(no20.C, 1));
        mgc mgcVarQ2 = u2p1.q(new go20(no20.B, 1));
        x3b0 x3b0Var = new x3b0(i2);
        mma0[] mma0VarArr = f47p;
        mma0 mma0Var = mma0VarArr[1];
        do20.b.X(this, Integer.valueOf(mgcVarQ2.b | Integer.valueOf(this.a).intValue()));
        this.c = x3b0Var;
        mma0 mma0Var2 = mma0VarArr[0];
        this.d = mgcVarQ.D(this) ? new x3b0(i3) : null;
        this.e = new ArrayList(0);
        this.g = new ArrayList(0);
        new ArrayList(0);
        this.h = new ArrayList();
        this.k = new ArrayList(0);
        this.l = new ArrayList(0);
        this.m = new ArrayList(0);
        this.n = new ArrayList(0);
        zjj0.a.getClass();
        List listA = yjj0.a();
        ArrayList arrayList = new ArrayList(q7h.U(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((gja0) ((zjj0) it.next())).getClass();
            arrayList.add(new oja0());
        }
        this.o = arrayList;
    }

    public final String a() {
        return this.b;
    }

    public final y3b0 b() {
        return this.f;
    }

    public final y3b0 c() {
        y3b0 y3b0Var = this.j;
        if (y3b0Var != null) {
            return y3b0Var;
        }
        u890.C("returnType");
        throw null;
    }
}
