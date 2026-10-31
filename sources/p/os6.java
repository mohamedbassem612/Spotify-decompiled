package p;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class os6 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    public /* synthetic */ os6(List list, byte b) {
        this.a = b;
        this.b = list;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                return pap1.t(Integer.valueOf(list.indexOf(((vy6) obj).a)), Integer.valueOf(list.indexOf(((vy6) obj2).a)));
            default:
                return u890.q(list.indexOf(((g471) obj).a()), list.indexOf(((g471) obj2).a()));
        }
    }
}
