package app.p000rive.semantics.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.iu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RiveSemanticsOverlayKt$RenderSemanticNodeComposable$actions$1$1$2 extends hab0 implements Function0 {
    final /* synthetic */ RenderSemanticNode $node;
    final /* synthetic */ iu30 $onDecrease;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveSemanticsOverlayKt$RenderSemanticNodeComposable$actions$1$1$2(iu30 iu30Var, RenderSemanticNode renderSemanticNode) {
        super(0);
        this.$onDecrease = iu30Var;
        this.$node = renderSemanticNode;
    }

    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Boolean m588invoke() {
        this.$onDecrease.invoke(Integer.valueOf(this.$node.getId()));
        return Boolean.TRUE;
    }
}
