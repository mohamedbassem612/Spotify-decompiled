package p;

import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kne0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nhe0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kne0(nhe0 nhe0Var, byte b) {
        super(3);
        this.a = b;
        this.b = nhe0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nhe0 nhe0Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = nhe0Var.a;
                uwr uwrVar = cbx.a;
                uwo1.e(str, (qim0) null, cbx.d(b0kVar).h, cbx.a(b0kVar).b.c, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2034);
                break;
            default:
                ((Number) obj3).intValue();
                uwo1.e(nhe0Var.a, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                break;
        }
        return rih1Var;
    }
}
