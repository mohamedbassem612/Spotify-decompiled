package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class quz implements yu30 {
    public final ruz a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(onm onmVar) {
        aas0 aas0Var;
        if (onmVar instanceof aas0) {
            aas0Var = (aas0) onmVar;
            int i = aas0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aas0Var.c = i - Integer.MIN_VALUE;
            } else {
                aas0Var = new aas0(this, onmVar);
            }
        } else {
            aas0Var = new aas0(this, onmVar);
        }
        Object objJ = aas0Var.a;
        int i2 = aas0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleA = this.a.a(new d9u0("listening-activity", false));
                aas0Var.c = 1;
                objJ = fc11.j(singleA, aas0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            objJ.getClass();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Logger.d("PauseHandler", new Object[]{l1d.m("Pause failed: ", th.getMessage())});
        }
        return rih1.a;
    }

    public Object apply(Object obj) {
        return this.a.g(SkipToPrevTrackCommand.create());
    }
}
