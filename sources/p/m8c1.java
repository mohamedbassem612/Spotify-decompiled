package p;

import android.app.Activity;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.fandomcollectibles.protos.BaseStory;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m8c1 implements c8c1 {
    public final /* synthetic */ xu30 a;
    public final /* synthetic */ f8c1 b;
    public final /* synthetic */ BaseStory c;

    public m8c1(xu30 xu30Var, f8c1 f8c1Var, BaseStory baseStory) {
        this.a = xu30Var;
        this.b = f8c1Var;
        this.c = baseStory;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(onm onmVar) {
        k8c1 k8c1Var;
        sj41 sj41Var;
        f8c1 f8c1Var = this.b;
        hp91 hp91Var = f8c1Var.d;
        if (onmVar instanceof k8c1) {
            k8c1Var = (k8c1) onmVar;
            int i = k8c1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                k8c1Var.d = i - Integer.MIN_VALUE;
            } else {
                k8c1Var = new k8c1(this, onmVar);
            }
        } else {
            k8c1Var = new k8c1(this, onmVar);
        }
        Object obj = k8c1Var.b;
        int i2 = k8c1Var.d;
        BaseStory baseStory = this.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                sj41 sj41Var2 = new sj41();
                sj41Var2.a = dy61.a;
                sj41Var2.b = gy61.a;
                xu30 xu30Var = this.a;
                k8c1Var.a = sj41Var2;
                k8c1Var.d = 1;
                Object objInvoke = xu30Var.invoke(sj41Var2, f8c1Var, k8c1Var);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
                obj = objInvoke;
                sj41Var = sj41Var2;
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sj41Var = k8c1Var.a;
                hm5.M(obj);
            }
            List list = (List) obj;
            Activity activity = f8c1Var.a;
            String strQ = baseStory.q();
            Uri uri = strQ != null ? Uri.parse(strQ) : null;
            String strT = baseStory.t();
            String strO = baseStory.o();
            iy61 iy61Var = sj41Var.b;
            fy61 fy61Var = sj41Var.a;
            String strP = baseStory.p();
            if (baseStory.v()) {
                strP.getClass();
                if (ihc1.y0(strP)) {
                    strP = null;
                }
            } else {
                strP = null;
            }
            return new v7c1(new jdo0(activity, list, uri, strT, strO, iy61Var, fy61Var, strP != null ? new m551(hp91Var, baseStory, strP, (byte) 28) : null, 128));
        } catch (Exception e) {
            Logger.e(e, l1d.m("Error loading story ", baseStory.t()), new Object[0]);
            String strT2 = baseStory.t();
            String strH = gvg.h("Error loading story ", baseStory.t(), ": ", e.getMessage());
            i8h1 i8h1Var = (i8h1) hp91Var.b;
            txk0 txk0Var = (txk0) hp91Var.c;
            x6h1 x6h1VarC = txk0Var.b.c();
            x6h1VarC.i.add(new a7h1("story_container", strT2, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("story_error", (String) null, (Integer) null, (String) null, strH));
            x6h1VarC2.j = true;
            y6h1 y6h1VarA = x6h1VarC2.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            k7h1Var.e = txk0Var.c;
            i8h1Var.f(k7h1Var.a(), (Set) null);
            return new u7c1(e);
        }
    }
}
