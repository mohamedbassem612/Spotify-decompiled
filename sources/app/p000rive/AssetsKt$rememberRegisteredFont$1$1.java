package app.p000rive;

import app.p000rive.core.CommandQueue;
import kotlin.Metadata;
import p.lnm;
import p.lyc;
import p.tv30;
import p.xu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class AssetsKt$rememberRegisteredFont$1$1 extends tv30 implements xu30 {
    public AssetsKt$rememberRegisteredFont$1$1(Object obj) {
        super(3, obj, FontAsset.Companion.class, "create", "create(Lapp/rive/core/CommandQueue;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(CommandQueue commandQueue, byte[] bArr, lnm<? super FontAsset> lnmVar) {
        return ((FontAsset.Companion) ((lyc) this).receiver).create(commandQueue, bArr, lnmVar);
    }
}
