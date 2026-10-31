package p;

import com.spotify.music.premiumtabbadge.events.proto.PremiumBadge;
import io.reactivex.rxjava3.disposables.Disposable;
import retrofit2.adapter.rxjava3.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bqv0 {
    public final vj4 a;
    public final rm5 b;
    public final m2a c;
    public final f2a d;
    public final t2j0 e;
    public Disposable f;
    public Disposable g;
    public jkp0 h;

    public bqv0(vj4 vj4Var, rm5 rm5Var, m2a m2aVar, f2a f2aVar, t2j0 t2j0Var) {
        this.a = vj4Var;
        this.b = rm5Var;
        this.c = m2aVar;
        this.d = f2aVar;
        this.e = t2j0Var;
    }

    public final void a(Throwable th) {
        String message;
        if (th instanceof HttpException) {
            HttpException httpException = (HttpException) th;
            message = ((retrofit2.HttpException) httpException).a + " " + ((retrofit2.HttpException) httpException).b;
        } else {
            message = th.getMessage();
            if (message == null) {
                message = "";
            }
        }
        zpv0 zpv0VarN = PremiumBadge.n();
        zpv0VarN.n(message);
        this.e.a(zpv0VarN.build());
    }
}
