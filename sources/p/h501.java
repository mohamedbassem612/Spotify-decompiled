package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h501 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    public /* synthetic */ h501(List list, byte b) {
        this.a = b;
        this.b = list;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                list.get(((Number) obj).intValue());
                return null;
            default:
                return udf1.Z.invoke(list.get(((Number) obj).intValue()));
        }
    }
}
