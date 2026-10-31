package p;

import android.content.res.Resources;
import android.view.View;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.text.DateFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class el41 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ jl41 a;

    public el41(jl41 jl41Var) {
        this.a = jl41Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x007b A[RETURN] */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String str;
        String string;
        Object objY;
        hm41 hm41Var = ((cl41) obj).a;
        jl41 jl41Var = this.a;
        Resources resources = jl41Var.d;
        xk41 xk41Var = hm41Var.b;
        if (hm41Var.e) {
            int i = xk41Var.a;
            if (i != 2) {
                if (i == 3) {
                    n7r n7rVar = xk41Var.b;
                    if (n7rVar == null) {
                        n7rVar = n7r.a;
                    }
                    Locale localeB = yoi1.A(resources.getConfiguration()).b(0);
                    if (localeB == null) {
                        localeB = Locale.ENGLISH;
                    }
                    string = resources.getString(2131961458, new DateFormatSymbols(localeB).getWeekdays()[n7rVar.a()]);
                } else {
                    str = null;
                }
                if (str != null) {
                    objY = fn31.Y(jl41Var.i, new p2z0(jl41Var, new er91((fs91) null, str, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false), (lnm) null, (byte) 28), onmVar);
                    if (objY == d9n.a) {
                        return objY;
                    }
                }
                return rih1.a;
            }
            string = resources.getString(2131961456);
        } else {
            string = resources.getString(2131961457);
        }
        str = string;
        if (str != null) {
            objY = fn31.Y(jl41Var.i, new p2z0(jl41Var, new er91((fs91) null, str, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false), (lnm) null, (byte) 28), onmVar);
            if (objY == d9n.a) {
                return objY;
            }
        }
        return rih1.a;
    }
}
