package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class hyr implements av30, Function, com.spotify.mobius.functions.Function, p2r0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ hyr(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                return iu30Var.invoke(obj);
            case 1:
                return iu30Var.invoke(obj);
            case 2:
                obj.getClass();
                return (CompletableSource) iu30Var.invoke(obj);
            case 3:
                return iu30Var.invoke(obj);
            case 4:
                return iu30Var.invoke(obj);
            case 5:
                return iu30Var.invoke(obj);
            case 6:
                return iu30Var.invoke(obj);
            default:
                return iu30Var.invoke(obj);
        }
    }

    public o2r0 h(q7r0 q7r0Var, Bundle bundle) {
        return new ke71(this.b);
    }
}
