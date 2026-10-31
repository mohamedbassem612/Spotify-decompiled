package p;

import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class pig0 implements bh0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p2o0 b;

    public /* synthetic */ pig0(p2o0 p2o0Var, byte b) {
        this.a = b;
        this.b = p2o0Var;
    }

    public final void a(Object obj) {
        byte b = this.a;
        p2o0 p2o0Var = this.b;
        switch (b) {
            case 0:
                PublishSubject publishSubject = (PublishSubject) p2o0Var.g;
                Boolean bool = (Boolean) ((Map) obj).get("android.permission.BLUETOOTH_CONNECT");
                publishSubject.onNext(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
                break;
            default:
                PublishSubject publishSubject2 = (PublishSubject) p2o0Var.g;
                Boolean bool2 = (Boolean) ((Map) obj).get("android.permission.BLUETOOTH_CONNECT");
                publishSubject2.onNext(Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
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
        switch (this.a) {
            case 0:
                break;
        }
        return new tv30(1, this.b, p2o0.class, "onRequestPermissionResult", "onRequestPermissionResult(Ljava/util/Map;)V", 0);
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
