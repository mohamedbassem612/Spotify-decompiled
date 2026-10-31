package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qdn0 extends bng0 implements rla0 {
    public final nps0 d;
    public Object e;

    public qdn0(nps0 nps0Var, Object obj, Object obj2) {
        super(obj, obj2, (byte) 0);
        this.d = nps0Var;
        this.e = obj2;
    }

    public final Object getValue() {
        return this.e;
    }

    public final Object setValue(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        kps0 kps0Var = (kps0) this.d.b;
        ips0 ips0Var = kps0Var.d;
        Object obj3 = ((bng0) this).b;
        if (!ips0Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = kps0Var.c;
        if (!z) {
            ips0Var.put(obj3, obj);
        } else {
            if (!z) {
                hhg1.k();
                return null;
            }
            mug1 mug1Var = kps0Var.a[kps0Var.b];
            Object obj4 = mug1Var.a[mug1Var.c];
            ips0Var.put(obj3, obj);
            kps0Var.c(obj4 != null ? obj4.hashCode() : 0, ips0Var.c, obj4, 0);
        }
        kps0Var.g = ips0Var.e;
        return obj2;
    }
}
