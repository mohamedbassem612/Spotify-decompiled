package p;

import com.spotify.home.evopage.structureapi.DismissedEntity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x4n0 extends hab0 implements Function0 {
    public final /* synthetic */ xk00 a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4n0(xk00 xk00Var, String str) {
        super(0);
        this.a = xk00Var;
        this.b = str;
    }

    public final Object invoke() {
        this.a.d.m(this.b, DismissedEntity.Type.MARKED_AS_PLAYED);
        return rih1.a;
    }
}
