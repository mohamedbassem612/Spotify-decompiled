package app.p000rive;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.eg;
import p.hab0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RiveKt$RiveSurfaceHost$3$1$1$1$onSurfaceTextureUpdated$1$1 extends hab0 implements Function0 {
    final /* synthetic */ RiveTextureView $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveKt$RiveSurfaceHost$3$1$1$1$onSurfaceTextureUpdated$1$1(RiveTextureView riveTextureView) {
        super(0);
        this.$this_apply = riveTextureView;
    }

    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Bitmap m80invoke() {
        Bitmap bitmap = this.$this_apply.getBitmap();
        if (bitmap != null) {
            return bitmap;
        }
        eg.m("Bitmap no longer available; surface may have been destroyed");
        return null;
    }
}
