package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z8c implements av30, Function {
    public final /* synthetic */ byte a;
    public final List b;

    public z8c() {
        this.a = (byte) 3;
        this.b = f46.i0(new sio1[0]);
    }

    public Object apply(Object obj) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof j631) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r7h.W(((j631) it.next()).b(), arrayList2);
                }
                return o7h.p1(arrayList2);
            case 1:
                List list2 = (List) obj;
                if (!list2.isEmpty()) {
                    list = list2;
                }
                return list;
            default:
                uv00 uv00Var = (uv00) obj;
                ArrayList<String> arrayList3 = new ArrayList();
                for (Object obj3 : list) {
                    if (uv00Var.a(b9v0.class, (String) obj3).b != null) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                for (String str : arrayList3) {
                    b9v0 b9v0Var = uv00Var.a(b9v0.class, str).b;
                    arrayList4.add(new mmr0(str, Boolean.valueOf(b9v0Var != null ? k8p1.k(b9v0Var) : false)));
                }
                return sqg0.T(arrayList4);
        }
    }

    public /* synthetic */ z8c(List list, byte b) {
        this.a = b;
        this.b = list;
    }
}
