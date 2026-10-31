package p;

import com.spotify.home.evopage.structureapi.DismissedEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zox0 extends hab0 implements iu30 {
    public final /* synthetic */ xk00 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zox0(xk00 xk00Var) {
        super(1);
        this.a = xk00Var;
    }

    public final Object invoke(Object obj) {
        this.a.d.k((String) obj, DismissedEntity.Type.EXPLICIT_FEEDBACK);
        return rih1.a;
    }
}
