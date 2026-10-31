package p;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class h380 {
    public Object[] a;
    public int b = 0;
    public g380 c;

    public h380(int i) {
        this.a = new Object[i * 2];
    }

    public j380 a() {
        return b(true);
    }

    public final gg11 b(boolean z) {
        g380 g380Var;
        g380 g380Var2;
        if (z && (g380Var2 = this.c) != null) {
            throw g380Var2.a();
        }
        gg11 gg11VarP = gg11.p(this.b, this.a, this);
        if (!z || (g380Var = this.c) == null) {
            return gg11VarP;
        }
        throw g380Var.a();
    }

    public j380 c() {
        return b(false);
    }

    public j380 d() {
        return b(true);
    }

    public h380 e(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = this.a;
        if (i > objArr.length) {
            this.a = Arrays.copyOf(objArr, o280.b(objArr.length, i));
        }
        n3p1.i(obj, obj2);
        Object[] objArr2 = this.a;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
        return this;
    }

    public h380 f(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.b) * 2;
            Object[] objArr = this.a;
            if (size > objArr.length) {
                this.a = Arrays.copyOf(objArr, o280.b(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            e(entry.getKey(), entry.getValue());
        }
        return this;
    }
}
