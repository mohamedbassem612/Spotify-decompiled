package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h1y {
    public final yqg a;
    public final xrc0 b;
    public final gmt c;
    public final q8n d;
    public final muz e;

    public h1y(yqg yqgVar, xrc0 xrc0Var, p5y p5yVar, gmt gmtVar, q8n q8nVar, muz muzVar) {
        this.a = yqgVar;
        this.b = xrc0Var;
        this.c = gmtVar;
        this.d = q8nVar;
        this.e = muzVar;
    }

    public final Completable a(f1y f1yVar) {
        return Single.fromCallable(new sra(this, (byte) 3)).flatMapCompletable(new jut(f1yVar, this, (byte) 25));
    }
}
