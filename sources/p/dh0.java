package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class dh0 implements bh0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dh0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((iu30) obj2).invoke(obj);
                break;
            default:
                ((dt71) obj2).a((Map) obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof bh0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof bh0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (iu30) obj;
            default:
                return new k01(1, (dt71) obj, sen0.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
