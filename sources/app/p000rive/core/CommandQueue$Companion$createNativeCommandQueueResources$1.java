package app.p000rive.core;

import app.p000rive.RenderBackend;
import kotlin.Metadata;
import p.iu30;
import p.lyc;
import p.tv30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
public /* synthetic */ class CommandQueue$Companion$createNativeCommandQueueResources$1 extends tv30 implements iu30 {
    public CommandQueue$Companion$createNativeCommandQueueResources$1(Object obj) {
        super(1, obj, CommandQueue.Companion.class, "createRenderContext", "createRenderContext(Lapp/rive/RenderBackend;)Lapp/rive/core/RenderContext;", 0);
    }

    public final RenderContext invoke(RenderBackend renderBackend) {
        return ((CommandQueue.Companion) ((lyc) this).receiver).createRenderContext(renderBackend);
    }
}
