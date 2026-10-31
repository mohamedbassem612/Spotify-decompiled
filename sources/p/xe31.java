package p;

import com.spotify.home.evopage.structureapi.DismissedEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xe31 extends hab0 implements xu30 {
    public final /* synthetic */ ye31 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe31(ye31 ye31Var) {
        super(3);
        this.a = ye31Var;
    }

    @Override // p.xu30
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        cf31 cf31Var = (cf31) obj;
        we31 we31Var = (we31) obj2;
        tqw tqwVar = (tqw) obj3;
        boolean zEquals = we31Var.equals(ue31.a);
        ye31 ye31Var = this.a;
        if (zEquals) {
            if (tqwVar != null) {
                ye31Var.b.a(cf31Var.d(), n3o1.y(tqwVar), null);
            }
        } else {
            if (!we31Var.equals(ve31.a)) {
                eg.o();
                return null;
            }
            if (cf31Var.i()) {
                vu30 vu30Var = ye31Var.c;
                if (vu30Var != null) {
                    vu30Var.invoke(cf31Var.b(), DismissedEntity.Type.ONBOARDING);
                }
                int iL = k4k.l(cf31Var.h());
                if (iL != 0) {
                    ye31Var.d.a(iL);
                }
            }
        }
        return rih1.a;
    }
}
