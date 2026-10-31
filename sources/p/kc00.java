package p;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class kc00 implements kly0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ kc00(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((den0) obj).get();
            case 1:
                return obj;
            case 2:
                return ((ui8) obj).d();
            case 3:
                return (tau0) ((io80) obj).a();
            default:
                return (SharedPreferences) obj;
        }
    }
}
