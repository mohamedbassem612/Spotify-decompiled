package p;

import android.app.Activity;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.culturalmoments.stories.v1.BaseStory;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n8c1 implements c8c1 {
    public final /* synthetic */ xu30 a;
    public final /* synthetic */ g8c1 b;
    public final /* synthetic */ BaseStory c;

    public n8c1(xu30 xu30Var, g8c1 g8c1Var, BaseStory baseStory) {
        this.a = xu30Var;
        this.b = g8c1Var;
        this.c = baseStory;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(onm onmVar) {
        l8c1 l8c1Var;
        tj41 tj41Var;
        if (onmVar instanceof l8c1) {
            l8c1Var = (l8c1) onmVar;
            int i = l8c1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                l8c1Var.d = i - Integer.MIN_VALUE;
            } else {
                l8c1Var = new l8c1(this, onmVar);
            }
        } else {
            l8c1Var = new l8c1(this, onmVar);
        }
        Object obj = l8c1Var.b;
        int i2 = l8c1Var.d;
        g8c1 g8c1Var = this.b;
        BaseStory baseStory = this.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                tj41 tj41Var2 = new tj41();
                xu30 xu30Var = this.a;
                l8c1Var.a = tj41Var2;
                l8c1Var.d = 1;
                Object objInvoke = xu30Var.invoke(tj41Var2, g8c1Var, l8c1Var);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
                obj = objInvoke;
                tj41Var = tj41Var2;
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tj41Var = l8c1Var.a;
                hm5.M(obj);
            }
            List list = (List) obj;
            Activity activityA = g8c1Var.a();
            String strO = baseStory.o();
            return new v7c1(new jdo0(activityA, list, strO != null ? Uri.parse(strO) : null, baseStory.r(), baseStory.n(), tj41Var.b(), tj41Var.a(), null, 384));
        } catch (Exception e) {
            Logger.e(e, l1d.m("Error loading story ", baseStory.r()), new Object[0]);
            g8c1Var.b().i(baseStory.r(), gvg.h("Error loading story ", baseStory.r(), ": ", e.getMessage()));
            return new u7c1(e);
        }
    }
}
