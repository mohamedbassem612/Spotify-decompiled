package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hj30 extends cjg1 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ jj30 e;

    public hj30(jj30 jj30Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = jj30Var;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    public final void f(jhg1 jhg1Var) {
        jhg1Var.G(this);
    }

    public final void g(jhg1 jhg1Var) {
        jj30 jj30Var = this.e;
        Object obj = this.a;
        if (obj != null) {
            jj30Var.z(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            jj30Var.z(obj2, this.d, null);
        }
    }
}
