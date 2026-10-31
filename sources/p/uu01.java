package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uu01 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu01 b;

    public /* synthetic */ uu01(vu01 vu01Var, byte b) {
        this.a = b;
        this.b = vu01Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        vu01 vu01Var = this.b;
        switch (b) {
            case 0:
                vu01Var.h(((es01) obj).c);
                break;
            default:
                zu01 zu01Var = ((gs01) obj).c;
                Integer num = vu01Var.t;
                if (num != null && num.intValue() > 0) {
                    List list = zu01Var.a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof tt01) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        yq01 yq01Var = ((tt01) it.next()).a.m;
                        String str = yq01Var != null ? yq01Var.a : null;
                        if (str != null) {
                            arrayList2.add(str);
                        }
                    }
                    List listD1 = o7h.d1(arrayList2, num.intValue());
                    if (!listD1.isEmpty()) {
                        vu01Var.t = null;
                        ((yu01) vu01Var.d).a(new js01(listD1));
                    }
                }
                vu01Var.Y.m((Object) null, zu01Var);
                vu01Var.i();
                break;
        }
    }
}
