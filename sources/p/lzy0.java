package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lzy0 {
    public final Class a;
    public final Class b;

    public lzy0(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static lzy0 a(Class cls) {
        return new lzy0(kzy0.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lzy0.class != obj.getClass()) {
            return false;
        }
        lzy0 lzy0Var = (lzy0) obj;
        if (this.b.equals(lzy0Var.b)) {
            return this.a.equals(lzy0Var.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == kzy0.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
