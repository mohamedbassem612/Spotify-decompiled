package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class xzh implements ne41 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xzh(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.ne41
    public final Bundle a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                ((g0i) obj).i.f(bundle);
                return bundle;
            default:
                return ((th30) obj).e0();
        }
    }
}
