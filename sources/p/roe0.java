package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class roe0 {
    public final Object a;
    public final Function0 b;

    public roe0(Object obj, Function0 function0) {
        this.a = obj;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && roe0.class == obj.getClass() && this.a.equals(((roe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
