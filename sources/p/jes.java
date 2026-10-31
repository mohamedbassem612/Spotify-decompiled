package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class jes implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    public /* synthetic */ jes(List list, byte b) {
        this.a = b;
        this.b = list;
    }

    public final Object invoke() {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                return (Integer) list.get(2);
            case 1:
                return ((oma0) list.get(0)).k();
            default:
                return ((oma0) list.get(0)).k();
        }
    }
}
