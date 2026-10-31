package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z021 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ g121 a;

    public z021(g121 g121Var) {
        this.a = g121Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        bnj0 bnj0Var = this.a.e;
        if (((m05) bnj0Var.c).a()) {
            Intent data = new Intent("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.parse("spotify://downloads"));
            kdy0 kdy0Var = new kdy0((Context) bnj0Var.b);
            a321 a321Var = (a321) kdy0Var.b;
            if (a321Var.b) {
                Executor executor = (Executor) kdy0Var.d;
                mzc mzcVar = new mzc();
                mzcVar.c = new it21();
                pzc pzcVar = new pzc(mzcVar);
                mzcVar.b = pzcVar;
                mzcVar.a = x0d.class;
                try {
                    kdy0.c(data);
                    Uri data2 = data.getData();
                    data2.getClass();
                    Set<String> categories = data.getCategories();
                    categories.getClass();
                    a321Var.a(data2, o7h.l1(categories), executor, new ry11(mzcVar));
                    mzcVar.a = "startRemoteActivity";
                } catch (Exception e) {
                    pzcVar.a(e);
                }
            } else {
                upn1.t(new x8a0(kdy0Var, data, (byte) 27));
            }
        }
        return rih1.a;
    }
}
