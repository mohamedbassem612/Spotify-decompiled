package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class byc1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ byc1(ArrayList arrayList, byte b) {
        this.a = b;
        this.b = arrayList;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 1:
                return ((yc90) arrayList.get(((Number) obj).intValue())).a.getUsername();
            case 2:
                arrayList.get(((Number) obj).intValue());
                return null;
            default:
                arrayList.get(((Number) obj).intValue());
                return null;
        }
    }
}
