package p;

import android.view.View;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kze implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public kze(o0f o0fVar) {
        this.a = o0fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        jze jzeVar;
        Object objO;
        if (onmVar instanceof jze) {
            jzeVar = (jze) onmVar;
            int i = jzeVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jzeVar.b = i - Integer.MIN_VALUE;
            } else {
                jzeVar = new jze(this, onmVar);
            }
        } else {
            jzeVar = new jze(this, onmVar);
        }
        Object obj2 = jzeVar.a;
        int i2 = jzeVar.b;
        o0f o0fVar = this.a;
        if (i2 == 0) {
            hm5.M(obj2);
            xxe xxeVar = (xxe) obj;
            nl51 nl51Var = o0fVar.D;
            String str = xxeVar.a;
            String str2 = xxeVar.b;
            jzeVar.b = 1;
            objO = nl51Var.o(str, str2, jzeVar);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
            objO = ((e331) obj2).a;
        }
        if (e331.a(objO) != null) {
            op71.x(jzeVar.getContext());
            kt91 kt91Var = o0fVar.E;
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131959701});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            kt91Var.k(new er91((fs91) null, "", 2131959701, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        }
        return rih1.a;
    }
}
