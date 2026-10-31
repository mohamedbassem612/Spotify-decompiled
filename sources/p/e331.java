package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e331 implements Serializable {
    public final Object a;

    public /* synthetic */ e331(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof m231) {
            return ((m231) obj).a;
        }
        return null;
    }

    public static int b(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean c(Serializable serializable) {
        return !(serializable instanceof m231);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e331) {
            return u890.j(this.a, ((e331) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return b(this.a);
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof m231) {
            return ((m231) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
