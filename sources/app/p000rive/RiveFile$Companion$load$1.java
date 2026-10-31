package app.p000rive;

import kotlin.Metadata;
import p.lnm;
import p.onm;
import p.os00;
import p.q8r;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@q8r(c = "app.rive.RiveFile$Companion", f = "RiveFile.kt", l = {107, 116}, m = "load")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class RiveFile$Companion$load$1 extends onm {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RiveFile.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFile$Companion$load$1(RiveFile.Companion companion, lnm<? super RiveFile$Companion$load$1> lnmVar) {
        super(lnmVar);
        this.this$0 = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= os00.INVALID_ID;
        return this.this$0.load(null, null, this);
    }
}
