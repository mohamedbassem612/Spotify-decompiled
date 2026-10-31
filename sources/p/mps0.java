package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mps0 extends a9 {
    public final /* synthetic */ byte a;
    public final ips0 b;

    public /* synthetic */ mps0(ips0 ips0Var, byte b) {
        this.a = b;
        this.b = ips0Var;
    }

    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int b() {
        byte b = this.a;
        ips0 ips0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return ips0Var.f;
    }

    public final void clear() {
        byte b = this.a;
        ips0 ips0Var = this.b;
        switch (b) {
            case 0:
                ips0Var.clear();
                break;
            default:
                ips0Var.clear();
                break;
        }
    }

    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    ips0 ips0Var = this.b;
                    Object obj2 = ips0Var.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && ips0Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.b.containsKey(obj);
        }
    }

    public final Iterator iterator() {
        byte b = this.a;
        ips0 ips0Var = this.b;
        switch (b) {
            case 0:
                return new nps0(ips0Var);
            default:
                mug1[] mug1VarArr = new mug1[8];
                for (int i = 0; i < 8; i++) {
                    mug1VarArr[i] = new pug1();
                }
                return new qps0(ips0Var, mug1VarArr);
        }
    }

    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.b.remove(entry.getKey(), entry.getValue());
            default:
                ips0 ips0Var = this.b;
                if (!ips0Var.containsKey(obj)) {
                    return false;
                }
                ips0Var.remove(obj);
                return true;
        }
    }
}
