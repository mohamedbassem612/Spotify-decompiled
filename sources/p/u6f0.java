package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u6f0 {
    public final n381 a;
    public final d18 b;
    public final k261 c = l261.a(1);

    public u6f0(n381 n381Var, d18 d18Var) {
        this.a = n381Var;
        this.b = d18Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b7 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0033, B:33:0x00b1, B:35:0x00b7), top: B:42:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, List list, onm onmVar) throws Throwable {
        t6f0 t6f0Var;
        List listZ0;
        int i;
        List list2;
        k261 k261Var;
        k261 k261Var2;
        List list3;
        s6f0 r6f0Var;
        s6f0 s6f0Var;
        if (onmVar instanceof t6f0) {
            t6f0Var = (t6f0) onmVar;
            int i2 = t6f0Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t6f0Var.i = i2 - Integer.MIN_VALUE;
            } else {
                t6f0Var = new t6f0(this, onmVar);
            }
        } else {
            t6f0Var = new t6f0(this, onmVar);
        }
        Object obj = t6f0Var.g;
        int i3 = t6f0Var.i;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                listZ0 = o7h.Z0(list);
                t6f0Var.a = list;
                t6f0Var.b = str;
                t6f0Var.c = listZ0;
                k261 k261Var3 = this.c;
                t6f0Var.d = k261Var3;
                i = 0;
                t6f0Var.f = 0;
                t6f0Var.i = 1;
                if (k261Var3.b(t6f0Var) != d9nVar) {
                    list2 = list;
                    k261Var = k261Var3;
                }
                return d9nVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = t6f0Var.e;
                k261Var2 = t6f0Var.d;
                list3 = t6f0Var.c;
                List list4 = t6f0Var.a;
                try {
                    hm5.M(obj);
                    s6f0Var = (s6f0) obj;
                    if (s6f0Var instanceof r6f0) {
                        d18 d18Var = this.b;
                        ((LinkedHashMap) d18Var.c).put(list3, new sts(((yqg) d18Var.b).b(), ((r6f0) s6f0Var).a));
                    }
                    k261Var = k261Var2;
                    r6f0Var = s6f0Var;
                    k261Var.e();
                    return r6f0Var;
                } catch (Throwable th) {
                    th = th;
                    k261Var2.e();
                    throw th;
                }
            }
            int i4 = t6f0Var.f;
            k261Var = t6f0Var.d;
            List list5 = t6f0Var.c;
            String str2 = t6f0Var.b;
            List list6 = t6f0Var.a;
            hm5.M(obj);
            listZ0 = list5;
            list2 = list6;
            i = i4;
            str = str2;
            Map map = (Map) this.b.s(listZ0);
            if (map == null) {
                n381 n381Var = this.a;
                t6f0Var.a = null;
                t6f0Var.b = null;
                t6f0Var.c = listZ0;
                t6f0Var.d = k261Var;
                t6f0Var.e = this;
                t6f0Var.f = i;
                t6f0Var.i = 2;
                Object objC = a8o.C(n381Var, list2, str, t6f0Var);
                if (objC != d9nVar) {
                    List list7 = listZ0;
                    obj = objC;
                    k261Var2 = k261Var;
                    list3 = list7;
                    s6f0Var = (s6f0) obj;
                    if (s6f0Var instanceof r6f0) {
                        d18 d18Var2 = this.b;
                        ((LinkedHashMap) d18Var2.c).put(list3, new sts(((yqg) d18Var2.b).b(), ((r6f0) s6f0Var).a));
                    }
                    k261Var = k261Var2;
                    r6f0Var = s6f0Var;
                }
                return d9nVar;
            }
            r6f0Var = new r6f0(map);
            k261Var.e();
            return r6f0Var;
        } catch (Throwable th2) {
            th = th2;
            k261Var2 = k261Var;
            k261Var2.e();
            throw th;
        }
    }
}
