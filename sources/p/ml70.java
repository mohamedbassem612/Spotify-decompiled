package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ml70 implements x9h, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ ml70(Function0 function0, byte b) {
        this.a = b;
        this.b = function0;
    }

    public final long a() {
        byte b = this.a;
        bey0 bey0Var = this.b;
        switch (b) {
            case 0:
                return ((u7h) bey0Var.invoke()).a;
            default:
                return ((u7h) bey0Var.get()).a;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof x9h) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof x9h) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        byte b = this.a;
        bey0 bey0Var = this.b;
        switch (b) {
        }
        return bey0Var;
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
