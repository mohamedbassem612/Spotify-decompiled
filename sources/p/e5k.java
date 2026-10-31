package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e5k extends onm {
    public int N0;
    public int O0;
    public /* synthetic */ Object P0;
    public final /* synthetic */ f5k Q0;
    public int R0;
    public boolean X;
    public boolean Y;
    public int Z;
    public guq0 a;
    public iu30 b;
    public String c;
    public Integer d;
    public iu30 e;
    public f5k f;
    public ArrayList g;
    public String h;
    public z57 i;
    public boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5k(f5k f5kVar, onm onmVar) {
        super(onmVar);
        this.Q0 = f5kVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.P0 = obj;
        this.R0 |= Integer.MIN_VALUE;
        Object objF = this.Q0.f(null, null, null, null, null, false, null, null, false, this);
        return objF == d9n.a ? objF : new e331(objF);
    }
}
