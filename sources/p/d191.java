package p;

import java.io.FileInputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d191 extends onm {
    public h191 a;
    public FileInputStream b;
    public /* synthetic */ Object c;
    public final /* synthetic */ h191 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d191(h191 h191Var, onm onmVar) {
        super(onmVar);
        this.d = h191Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.g(this);
    }
}
