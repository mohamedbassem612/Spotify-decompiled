package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lka0 implements r3b0 {
    public static final s3b0 c = new s3b0(rc11.a.b(lka0.class));
    public boolean a;
    public final ArrayList b = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lka0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        lka0 lka0Var = (lka0) obj;
        return this.a == lka0Var.a && this.b.equals(lka0Var.b);
    }

    public final s3b0 getType() {
        return c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
