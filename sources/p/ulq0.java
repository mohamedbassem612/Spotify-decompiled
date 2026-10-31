package p;

import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ulq0 implements nzc {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ vhc b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ kdn0 e;

    public /* synthetic */ ulq0(Executor executor, vhc vhcVar, String str, Function0 function0, kdn0 kdn0Var) {
        this.a = executor;
        this.b = vhcVar;
        this.c = str;
        this.d = function0;
        this.e = kdn0Var;
    }

    public final Object attachCompleter(mzc mzcVar) {
        this.a.execute(new m2d((byte) 21, this.c, this.b, this.d, this.e, mzcVar));
        return rih1.a;
    }
}
