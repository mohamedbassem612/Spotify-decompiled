package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oly0 implements nml {
    public final Function0 a;

    public oly0(Function0 function0) {
        this.a = function0;
    }

    public final m511 a() {
        return (m511) this.a.invoke();
    }

    public final kku b(pml pmlVar) {
        return oml.a;
    }

    public final Function0 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oly0) && u890.j(this.a, ((oly0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
