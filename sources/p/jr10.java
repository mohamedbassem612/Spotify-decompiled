package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Next;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jr10 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr10 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr10(mr10 mr10Var, byte b) {
        super(2);
        this.a = b;
        this.b = mr10Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        mr10 mr10Var = this.b;
        switch (b) {
            case 0:
                hr10 hr10Var = (hr10) obj2;
                return Next.h(hr10.a(hr10Var, mr10Var.f(hr10Var.a, (fr10) obj), false, false, 6));
            default:
                hr10 hr10Var2 = (hr10) obj2;
                return First.b(hr10.a(hr10Var2, mr10Var.f(hr10Var2.a, (fr10) obj), false, false, 6));
        }
    }
}
