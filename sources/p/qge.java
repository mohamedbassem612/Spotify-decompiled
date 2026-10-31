package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qge {
    public static final pge b = new pge();
    public final Object a;

    public /* synthetic */ qge(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        oge ogeVar = obj instanceof oge ? (oge) obj : null;
        if (ogeVar != null) {
            return ogeVar.a;
        }
        return null;
    }

    public static final Object b(Object obj) {
        if (obj instanceof pge) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qge) {
            return u890.j(this.a, ((qge) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof oge) {
            return ((oge) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
