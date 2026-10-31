package p;

import androidx.work.Worker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class hxl1 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;

    public final Object invoke() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((Worker) obj).f();
            default:
                ((uku) obj).invoke();
                return Boolean.TRUE;
        }
    }
}
