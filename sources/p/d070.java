package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d070 {
    public final Function0 a;

    public d070(Function0 function0) {
        this.a = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d070) && this.a.equals(((d070) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
