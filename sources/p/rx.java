package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rx implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kd8 b;

    public /* synthetic */ rx(kd8 kd8Var, byte b) {
        this.a = b;
        this.b = kd8Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kd8 kd8Var = this.b;
        switch (b) {
            case 0:
                Map map = (Map) obj;
                if (!map.isEmpty()) {
                    kd8Var.invoke(map);
                }
                break;
            case 1:
                Map map2 = (Map) obj;
                if (!map2.isEmpty()) {
                    kd8Var.invoke(map2);
                }
                break;
            default:
                Map map3 = (Map) obj;
                if (!map3.isEmpty()) {
                    kd8Var.invoke(map3);
                }
                break;
        }
        return rih1Var;
    }
}
