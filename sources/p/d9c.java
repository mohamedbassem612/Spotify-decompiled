package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class d9c implements gs31, iv30 {
    public final /* synthetic */ cka a;

    public d9c(cka ckaVar) {
        this.a = ckaVar;
    }

    public final /* synthetic */ void a(Intent intent, th61 th61Var) {
        this.a.invoke(intent, th61Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof gs31) && (obj instanceof iv30)) {
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
