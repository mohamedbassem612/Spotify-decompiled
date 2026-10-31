package p;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class jcf0 implements idf0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AtomicBoolean c;

    public /* synthetic */ jcf0(String str, AtomicBoolean atomicBoolean, byte b) {
        this.a = b;
        this.b = str;
        this.c = atomicBoolean;
    }

    @Override // p.idf0
    public final void onResult(Object obj) {
        byte b = this.a;
        AtomicBoolean atomicBoolean = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                HashMap map = kcf0.a;
                map.remove(str);
                atomicBoolean.set(true);
                if (map.size() == 0) {
                    kcf0.k();
                }
                break;
            default:
                HashMap map2 = kcf0.a;
                map2.remove(str);
                atomicBoolean.set(true);
                if (map2.size() == 0) {
                    kcf0.k();
                }
                break;
        }
    }
}
