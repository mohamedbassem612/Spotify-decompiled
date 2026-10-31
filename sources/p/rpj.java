package p;

import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rpj extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xji1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rpj(xji1 xji1Var, byte b) {
        super(3);
        this.a = b;
        this.b = xji1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xji1 xji1Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = xji1Var.b;
                if (str == null) {
                    str = "";
                }
                uwo1.e(str, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(tro1.B(xji1Var.a, b0kVar2, 0), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                break;
        }
        return rih1Var;
    }
}
