package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tpb1 extends y6 implements Iterator, ola0 {
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tpb1(dw91 dw91Var, Iterator it, byte b) {
        super(dw91Var, it);
        this.g = b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.g) {
            case 0:
                b();
                if (((Map.Entry) ((y6) this).e) != null) {
                    return new spb1(this);
                }
                bhn0.w();
                return null;
            case 1:
                Map.Entry entry = (Map.Entry) ((y6) this).f;
                if (entry != null) {
                    b();
                    return entry.getKey();
                }
                bhn0.w();
                return null;
            default:
                Map.Entry entry2 = (Map.Entry) ((y6) this).f;
                if (entry2 != null) {
                    b();
                    return entry2.getValue();
                }
                bhn0.w();
                return null;
        }
    }
}
