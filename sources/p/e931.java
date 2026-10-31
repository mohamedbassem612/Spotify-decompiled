package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e931 implements eck1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ e931(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final xbk1 b(Class cls) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new f931((nt01) obj, (Bundle) obj2);
            default:
                if (cls.isAssignableFrom(cck1.class)) {
                    return new cck1(((q1n0) ((u5b) obj2).b).a((q6e0) obj));
                }
                hhg1.n(cls.getName());
                return null;
        }
    }
}
