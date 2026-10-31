package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gi7 {
    public static final gi7 a = new gi7();

    public final boolean a(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof zy70) || !(obj2 instanceof zy70)) {
            return u890.j(obj, obj2);
        }
        zy70 zy70Var = (zy70) obj;
        zy70 zy70Var2 = (zy70) obj2;
        return u890.j(zy70Var.a, zy70Var2.a) && zy70Var.b.equals(zy70Var2.b) && zy70Var.e.equals(zy70Var2.e) && u890.j(zy70Var.f156p, zy70Var2.f156p) && zy70Var.q == zy70Var2.q && zy70Var.r == zy70Var2.r;
    }

    public final int b(Object obj) {
        if (!(obj instanceof zy70)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        zy70 zy70Var = (zy70) obj;
        return l1d.C(zy70Var.r) + ((zy70Var.q.hashCode() + ((zy70Var.f156p.hashCode() + cy30.e((zy70Var.b.hashCode() + (zy70Var.a.hashCode() * 31)) * 961, 961, zy70Var.e)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
