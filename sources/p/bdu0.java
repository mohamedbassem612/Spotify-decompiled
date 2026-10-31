package p;

import android.os.Handler;
import com.spotify.player.model.SleepTimer;
import com.spotify.player.model.command.options.TimerType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bdu0 extends a8d1 implements vu30 {
    public final /* synthetic */ SleepTimer.Timestamp a;
    public final /* synthetic */ fdu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdu0(SleepTimer.Timestamp timestamp, fdu0 fdu0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = timestamp;
        this.b = fdu0Var;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        return new bdu0(this.a, this.b, lnmVar);
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        bdu0 bdu0Var = (bdu0) create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        bdu0Var.invokeSuspend(rih1Var);
        return rih1Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        SleepTimer.Timestamp timestamp = this.a;
        fdu0 fdu0Var = this.b;
        if (timestamp != null) {
            long jB = timestamp.timestamp - fdu0Var.b.b();
            if (jB <= 0) {
                TimerType.Clear clear = TimerType.clear();
                ocu0 ocu0Var = fdu0Var.a;
                faa0 faa0Var = ocu0Var.c;
                if (faa0Var != null) {
                    faa0Var.d(null);
                }
                ocu0Var.c = c921.y(ocu0Var.b, (o8n) null, 0, new ncu0(ocu0Var, clear, (lnm) null), 3);
            } else {
                fdu0Var.h();
                mmr0 mmr0VarN = fdu0Var.d.h() ? oqn1.n(new ddu0(fdu0Var, (byte) 0), Long.valueOf(jB - 30000)) : oqn1.n(new ddu0(fdu0Var, (byte) 1), Long.valueOf(jB));
                Runnable runnable = (Runnable) mmr0VarN.a;
                long jLongValue = ((Number) mmr0VarN.b).longValue();
                es50 es50Var = fdu0Var.c;
                es50Var.getClass();
                Handler handler = new Handler();
                es50Var.a = handler;
                handler.postDelayed(runnable, jLongValue);
                fdu0Var.k = runnable;
            }
        } else {
            fdu0Var.h();
        }
        return rih1.a;
    }
}
