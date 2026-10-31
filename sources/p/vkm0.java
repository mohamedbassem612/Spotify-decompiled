package p;

import com.spotify.mobius.First;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vkm0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vkm0(cm0 cm0Var) {
        super(2);
        this.a = (byte) 3;
        this.b = cm0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cm0 cm0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                cm0Var.f((b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                cm0Var.h((b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                cm0Var.j((b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                return First.b(ehm0.a((ehm0) obj2, (String) cm0Var.g, (List) null, 0, 6));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vkm0(cm0 cm0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = cm0Var;
    }
}
