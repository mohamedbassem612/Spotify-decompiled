package p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class r7s implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v7s b;

    public /* synthetic */ r7s(v7s v7sVar, byte b) {
        this.a = b;
        this.b = v7sVar;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        v7s v7sVar = this.b;
        spq0 spq0Var = (spq0) obj;
        switch (b) {
            case 0:
                return v7sVar.b.c().d(spq0Var).ignoreElement();
            case 1:
                return v7sVar.b.c().g(spq0Var, true).ignoreElement();
            default:
                return v7sVar.b.c().c(spq0Var).ignoreElement();
        }
    }
}
