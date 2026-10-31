package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class djg implements kly0 {
    public final /* synthetic */ byte a;
    public final kly0 b;

    public /* synthetic */ djg(kly0 kly0Var, byte b) {
        this.a = b;
        this.b = kly0Var;
    }

    public final Object get() {
        byte b = this.a;
        kly0 kly0Var = this.b;
        switch (b) {
            case 0:
                return (String) ((spq0) kly0Var.get()).h();
            default:
                String packageName = ((Context) kly0Var.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                bhn0.i("Cannot return null from a non-@Nullable @Provides method");
                return null;
        }
    }
}
