package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ppr extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ spr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ppr(spr sprVar, byte b) {
        super(0);
        this.a = b;
        this.b = sprVar;
    }

    public final Object invoke() {
        byte b = this.a;
        spr sprVar = this.b;
        switch (b) {
            case 0:
                return (wnr) sprVar.f.get();
            case 1:
                return (wpr) sprVar.a.get();
            default:
                return (qor) sprVar.c.get();
        }
    }
}
