package app.p000rive;

import kotlin.Metadata;
import p.lnm;
import p.onm;
import p.os00;
import p.q8r;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@q8r(c = "app.rive.ImageAsset$Companion", f = "Assets.kt", l = {291}, m = "fromBytes")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class ImageAsset$Companion$fromBytes$1 extends onm {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ImageAsset.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAsset$Companion$fromBytes$1(ImageAsset.Companion companion, lnm<? super ImageAsset$Companion$fromBytes$1> lnmVar) {
        super(lnmVar);
        this.this$0 = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= os00.INVALID_ID;
        return this.this$0.fromBytes(null, null, this);
    }
}
