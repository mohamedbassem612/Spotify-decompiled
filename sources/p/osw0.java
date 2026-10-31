package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class osw0 extends onm {
    public hab0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ psw0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osw0(psw0 psw0Var, onm onmVar) {
        super(onmVar);
        this.c = psw0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        this.c.d((Function0) null, this);
        return d9n.a;
    }
}
