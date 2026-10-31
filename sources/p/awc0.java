package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class awc0 extends onm {
    public String a;
    public hlr0 b;
    public Set c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ hwc0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awc0(hwc0 hwc0Var, onm onmVar) {
        super(onmVar);
        this.f = hwc0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c((String) null, false, (hlr0) null, this);
    }
}
