package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gx30 {
    public final li90[] a;

    public gx30(li90[] li90VarArr) {
        this.a = li90VarArr;
    }

    public final li90[] a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return gx30.class.equals(obj != null ? obj.getClass() : null) && Arrays.equals(this.a, ((gx30) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
