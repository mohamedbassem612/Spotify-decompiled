package p;

import java.util.LinkedList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class rhr0 implements rjp0, iv30 {
    public final /* synthetic */ air0 a;

    public rhr0(air0 air0Var) {
        this.a = air0Var;
    }

    public final void b(Object obj) {
        if (((l3r) obj) == l3r.c) {
            LinkedList linkedList = this.a.Z;
            while (!linkedList.isEmpty()) {
                Function0 function0 = (Function0) linkedList.poll();
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof rjp0) && (obj instanceof iv30)) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p.iv30
    public final cv30 getFunctionDelegate() {
        return new tv30(1, this.a, air0.class, "onRenderedStateChanged", "onRenderedStateChanged(Lcom/spotify/tome/pageapi/content/DataSourceState;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
