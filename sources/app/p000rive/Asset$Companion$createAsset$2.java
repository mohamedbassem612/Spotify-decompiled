package app.p000rive;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004\"\u0004\b\u0002\u0010\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "H", "A", "Lapp/rive/Asset;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class Asset$Companion$createAsset$2 extends hab0 implements Function0 {
    final /* synthetic */ AssetOps<H, A> $ops;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Asset$Companion$createAsset$2(AssetOps<H, A> assetOps) {
        super(0);
        this.$ops = assetOps;
    }

    public final String invoke() {
        return l1d.m("Decoding ", this.$ops.getLabel());
    }
}
