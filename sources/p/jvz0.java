package p;

import android.app.Application;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jvz0 extends onm {
    public Application a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ pvz0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvz0(pvz0 pvz0Var, onm onmVar) {
        super(onmVar);
        this.h = pvz0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b((Application) null, (String) null, (String) null, (cnr) null, this);
    }
}
