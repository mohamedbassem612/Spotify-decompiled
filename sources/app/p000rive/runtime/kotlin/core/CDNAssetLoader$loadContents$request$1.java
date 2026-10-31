package app.p000rive.runtime.kotlin.core;

import kotlin.Metadata;
import p.hab0;
import p.iu30;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "bytes", "Lp/rih1;", "invoke", "([B)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class CDNAssetLoader$loadContents$request$1 extends hab0 implements iu30 {
    final /* synthetic */ FileAsset $asset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CDNAssetLoader$loadContents$request$1(FileAsset fileAsset) {
        super(1);
        this.$asset = fileAsset;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((byte[]) obj);
        return rih1.a;
    }

    public final void invoke(byte[] bArr) {
        this.$asset.decode(bArr);
    }
}
