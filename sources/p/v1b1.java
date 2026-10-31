package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v1b1 {
    public final Observable a;
    public final yqg b;
    public volatile long c;
    public final llm d;

    public v1b1(Observable observable, yqg yqgVar, q8n q8nVar) {
        this.a = observable;
        this.b = yqgVar;
        this.c = (yqgVar.b() / 1000) - (yqgVar.e() / 1000);
        this.d = l1d.x(q8nVar);
    }
}
