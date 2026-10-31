package p;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u5e implements wu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u5e(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return j4p.a((j4p) obj3, list, null, ((oto0) obj2).a.e(), 2);
            case 1:
                List list2 = (List) obj;
                list2.getClass();
                return j4p.a((j4p) obj3, list2, (Bundle) obj2, false, 4);
            case 2:
                return new m4h1(new azf((l4h1) ((iu30) obj3).invoke(new jgd0((v6e0) obj2, (byte) 6)), obj, (byte) 1));
            default:
                List list3 = (List) obj;
                return list3.isEmpty() ? ((ztp) obj3).a() : ((ytp) obj2).a(list3);
        }
    }
}
