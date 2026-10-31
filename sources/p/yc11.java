package p;

import android.content.Context;
import com.spotify.home.evopage.structureapi.DismissedEntity;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yc11 extends hab0 implements Function0 {
    public final /* synthetic */ xk00 a;
    public final /* synthetic */ wc11 b;
    public final /* synthetic */ g0y0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc11(xk00 xk00Var, wc11 wc11Var, g0y0 g0y0Var) {
        super(0);
        this.a = xk00Var;
        this.b = wc11Var;
        this.c = g0y0Var;
    }

    public final Object invoke() {
        xk00 xk00Var = this.a;
        tj00 tj00Var = xk00Var.d;
        wc11 wc11Var = this.b;
        String str = wc11Var.a;
        tj00Var.k(str, DismissedEntity.Type.INLINE_CARD);
        String str2 = wc11Var.c.c;
        g0y0 g0y0Var = this.c;
        Context context = (Context) g0y0Var.f;
        Set set = s4b1.f;
        ((kt91) g0y0Var.e).k(new er91((fs91) null, context.getString(uic.x(str2).c == blc0.Pg ? 2131960989 : 2131960990), (Integer) null, context.getString(2131959154), (Integer) null, new zc11(xk00Var, str), (cvr) null, (xq91) null, false));
        return rih1.a;
    }
}
