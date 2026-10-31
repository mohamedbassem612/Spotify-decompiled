package p;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class spr0 extends fho1 {
    public final /* synthetic */ byte d = 1;
    public final Method e;
    public final int f;
    public final t2n g;
    public final Object h;

    public spr0(Method method, int i, t2n t2nVar, String str) {
        this.e = method;
        this.f = i;
        this.g = t2nVar;
        this.h = str;
    }

    public final void l(un21 un21Var, Object obj) {
        byte b = this.d;
        t2n t2nVar = this.g;
        Object obj2 = this.h;
        Method method = this.e;
        int i = this.f;
        switch (b) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    tn21 tn21Var = (tn21) t2nVar.g(obj);
                    un21Var.i.d((v360) obj2, tn21Var);
                    return;
                } catch (IOException e) {
                    throw m5n1.O(method, i, cy30.m("Unable to convert ", obj, " to RequestBody"), new Object[]{e});
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw m5n1.O(method, i, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw m5n1.O(method, i, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw m5n1.O(method, i, f4i1.f("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    un21Var.i.d(dm5.V(new String[]{"Content-Disposition", f4i1.f("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2}), (tn21) t2nVar.g(value));
                }
                return;
        }
    }

    public spr0(Method method, int i, v360 v360Var, t2n t2nVar) {
        this.e = method;
        this.f = i;
        this.h = v360Var;
        this.g = t2nVar;
    }
}
