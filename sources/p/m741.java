package p;

import android.os.Bundle;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m741 extends x43 {
    public final yqg m;
    public String n;
    public long o;

    public m741(x610 x610Var, PlayOrigin playOrigin, oyr oyrVar, g510 g510Var, d8q d8qVar, rm5 rm5Var, fnh0 fnh0Var, r8l r8lVar, b791 b791Var, u210 u210Var, phl1 phl1Var, e8q e8qVar, uic uicVar, yqg yqgVar) {
        super(x610Var, playOrigin, oyrVar, g510Var, d8qVar, rm5Var, fnh0Var, r8lVar, b791Var, u210Var, phl1Var, e8qVar, uicVar);
        this.m = yqgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Completable r(int i, Bundle bundle, String str, String str2) {
        long jE = this.m.e();
        long j = jE - this.o;
        if (str2.equals(this.n) && j < 5000) {
            return CompletableEmpty.a;
        }
        this.n = str2;
        this.o = jE;
        return super/*p.v7s*/.r(i, bundle, str, str2);
    }
}
