package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cz8 implements Function {
    public String a;
    public List b;

    public dz8 a() {
        List list = this.b;
        if (list != null) {
            return new dz8(list, this.a);
        }
        eg.m("Missing required properties: files");
        return null;
    }

    public Object apply(Object obj) {
        jdu0 jdu0Var = (jdu0) obj;
        List list = this.b;
        if (!u890.j(jdu0Var.d, this.a) || jdu0Var.e.length() <= 0) {
            return list;
        }
        return o7h.d1(o7h.N0(list, Collections.singletonList(new kkt0(jdu0Var.h, 0L, jdu0Var.i, jdu0Var.f, jdu0Var.e))), 20);
    }

    public void b(List list) {
        if (list != null) {
            this.b = list;
        } else {
            bhn0.i("Null files");
        }
    }

    public void c(String str) {
        this.a = str;
    }
}
