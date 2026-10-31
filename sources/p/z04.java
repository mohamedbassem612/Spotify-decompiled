package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class z04 implements iv30 {
    public final /* synthetic */ Function0 a;

    public z04(Function0 function0) {
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z04) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    public final cv30 getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
