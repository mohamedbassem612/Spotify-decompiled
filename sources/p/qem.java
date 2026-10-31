package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qem implements tem {
    public final Function0 a;

    public qem(Function0 function0) {
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qem) && u890.j(this.a, ((qem) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
