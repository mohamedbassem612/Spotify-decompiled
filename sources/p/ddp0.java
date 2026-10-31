package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ddp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wdm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ddp0(wdm wdmVar, byte b) {
        super(0);
        this.a = b;
        this.b = wdmVar;
    }

    public final Object invoke() {
        byte b = this.a;
        wdm wdmVar = this.b;
        switch (b) {
            case 0:
                return wdmVar.p();
            default:
                return wdmVar.o();
        }
    }
}
