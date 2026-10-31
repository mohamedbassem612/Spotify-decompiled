package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Supplier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class omf0 implements Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o3e0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ omf0(o3e0 o3e0Var, String str, byte b) {
        this.a = b;
        this.b = o3e0Var;
        this.c = str;
    }

    public final Object get() {
        byte b = this.a;
        String str = this.c;
        o3e0 o3e0Var = this.b;
        switch (b) {
            case 0:
                return Single.defer(new omf0(o3e0Var, str, (byte) 1)).subscribeOn((Scheduler) o3e0Var.d).onErrorReturnItem(str);
            default:
                return ((uu00) o3e0Var.c).b(new oi("android-lyrics-offline", false, new z9b0(str, (byte) 22))).observeOn((Scheduler) o3e0Var.d).map(new vdn1(str, (byte) 10)).first(str);
        }
    }
}
