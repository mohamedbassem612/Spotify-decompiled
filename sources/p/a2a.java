package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a2a extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b2a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2a(b2a b2aVar, byte b) {
        super(0);
        this.a = b;
        this.b = b2aVar;
    }

    public final Object invoke() {
        byte b = this.a;
        b2a b2aVar = this.b;
        switch (b) {
            case 0:
                return o7h.d1(o7h.T0(o7h.a1(b2aVar.a, new k0d((byte) 23))), 3);
            case 1:
                List list = (List) b2aVar.b.getValue();
                if (list != null) {
                    return (z1a) o7h.t0(0, list);
                }
                return null;
            case 2:
                List list2 = (List) b2aVar.b.getValue();
                if (list2 != null) {
                    return (z1a) o7h.t0(1, list2);
                }
                return null;
            default:
                List list3 = (List) b2aVar.b.getValue();
                if (list3 != null) {
                    return (z1a) o7h.t0(2, list3);
                }
                return null;
        }
    }
}
