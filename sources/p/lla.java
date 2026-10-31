package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class lla implements eec, iv30 {
    public final /* synthetic */ Function0 a;

    public lla(Function0 function0) {
        this.a = function0;
    }

    @Override // p.eec
    public final /* synthetic */ void a() {
        this.a.invoke();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof eec) && (obj instanceof iv30)) {
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
