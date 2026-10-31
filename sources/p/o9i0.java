package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o9i0 extends a8d1 implements vu30 {
    public /* synthetic */ Object a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ q9i0 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ w8i0 h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9i0(List list, List list2, ArrayList arrayList, ArrayList arrayList2, q9i0 q9i0Var, long j, w8i0 w8i0Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.b = list;
        this.c = list2;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = q9i0Var;
        this.g = j;
        this.h = w8i0Var;
        this.i = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        o9i0 o9i0Var = new o9i0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, lnmVar);
        o9i0Var.a = obj;
        return o9i0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        o9i0 o9i0VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        o9i0VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        c9n c9nVar = (c9n) this.a;
        hm5.M(obj);
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            woh0 woh0Var = (woh0) list.get(i);
            fn31.T(c9nVar, (o8n) null, 0, new n9i0((x8i0) this.c.get(i), (String) this.e.get(i), this.f, (List) this.d.get(i), this.g, this.h, this.i, woh0Var, (lnm) null), 3);
        }
        return rih1.a;
    }
}
