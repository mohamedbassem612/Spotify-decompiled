package p;

import com.spotify.player.model.command.options.TimerType;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class edu0 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ fdu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edu0(fdu0 fdu0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = fdu0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new edu0(this.b, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            this.a = true;
            Object objI = hap1.i(30000L, this);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        TimerType.Clear clear = TimerType.clear();
        fdu0 fdu0Var = this.b;
        ocu0 ocu0Var = fdu0Var.a;
        faa0 faa0Var = ocu0Var.c;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        ocu0Var.c = c921.y(ocu0Var.b, (o8n) null, 0, new ncu0(ocu0Var, clear, null), 3);
        fdu0Var.k = null;
        faa0 faa0Var2 = fdu0Var.i;
        if (faa0Var2 != null) {
            faa0Var2.d((CancellationException) null);
        }
        return rih1.a;
    }
}
