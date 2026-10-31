package app.p000rive.runtime.kotlin.renderers;

import app.p000rive.runtime.kotlin.core.Artboard;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.hab0;
import p.iu30;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lapp/rive/runtime/kotlin/core/Artboard;", "Lp/rih1;", "invoke", "(Lapp/rive/runtime/kotlin/core/Artboard;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class RiveArtboardRenderer$resizeArtboard$1$2 extends hab0 implements iu30 {
    final /* synthetic */ Function0 $applyLayout;
    final /* synthetic */ float $newHeight;
    final /* synthetic */ float $newWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveArtboardRenderer$resizeArtboard$1$2(float f, float f2, Function0 function0) {
        super(1);
        this.$newWidth = f;
        this.$newHeight = f2;
        this.$applyLayout = function0;
    }

    public final void invoke(Artboard artboard) {
        boolean z = (artboard.getWidth() == this.$newWidth && artboard.getHeight() == this.$newHeight) ? false : true;
        artboard.setWidth(this.$newWidth);
        artboard.setHeight(this.$newHeight);
        if (z) {
            this.$applyLayout.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Artboard) obj);
        return rih1.a;
    }
}
