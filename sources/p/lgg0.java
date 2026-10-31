package p;

import android.content.res.Resources;
import android.view.View;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lgg0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qgg0 a;

    public lgg0(qgg0 qgg0Var) {
        this.a = qgg0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ehg0 ehg0Var = this.a.b;
        String str = ((igg0) obj).a;
        Resources resources = ehg0Var.a;
        String string = (str == null || ihc1.y0(str)) ? resources.getString(2131958165) : resources.getString(2131958164, str);
        string.getClass();
        ehg0Var.b.k(new er91((fs91) null, string, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        return rih1.a;
    }
}
