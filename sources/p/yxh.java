package p;

import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class yxh implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yxh(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                for (iu30 iu30Var : (iu30[]) obj3) {
                    int iT = pap1.t((Comparable) iu30Var.invoke(obj), (Comparable) iu30Var.invoke(obj2));
                    if (iT != 0) {
                        return iT;
                    }
                }
                return 0;
            default:
                gkh0 gkh0Var = (gkh0) obj3;
                return gkh0Var.b(obj2) - gkh0Var.b(obj);
        }
    }
}
