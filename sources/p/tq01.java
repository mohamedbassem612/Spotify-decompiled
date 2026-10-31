package p;

import com.spotify.home.evopage.structureapi.DismissedEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tq01 extends hab0 implements iu30 {
    public final /* synthetic */ xk00 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq01(xk00 xk00Var) {
        super(1);
        this.a = xk00Var;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        ((tj00) this.a.d).k((String) obj, DismissedEntity.Type.RECENTS);
        return rih1.a;
    }
}
