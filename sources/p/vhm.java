package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vhm extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xhm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vhm(xhm xhmVar, byte b) {
        super(0);
        this.a = b;
        this.b = xhmVar;
    }

    public final Object invoke() {
        byte b = this.a;
        xhm xhmVar = this.b;
        switch (b) {
            case 0:
                return xhmVar.f.c(xhmVar.o.a(xhmVar.g));
            default:
                return xhmVar.a.a(xhmVar.b.getViewUri());
        }
    }
}
