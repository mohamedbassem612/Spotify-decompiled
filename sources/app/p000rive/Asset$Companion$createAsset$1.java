package app.p000rive;

import app.p000rive.Asset;
import kotlin.Metadata;
import p.lnm;
import p.onm;
import p.os00;
import p.q8r;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@q8r(c = "app.rive.Asset$Companion", f = "Assets.kt", l = {159}, m = "createAsset$kotlin_release")
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public final class Asset$Companion$createAsset$1<H, A extends Asset<H>> extends onm {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Asset.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Asset$Companion$createAsset$1(Asset.Companion companion, lnm<? super Asset$Companion$createAsset$1> lnmVar) {
        super(lnmVar);
        this.this$0 = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= os00.INVALID_ID;
        return this.this$0.createAsset$kotlin_release(null, null, null, this);
    }
}
