package app.p000rive;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import app.p000rive.core.CommandQueue;
import app.p000rive.core.RiveSurface;
import app.p000rive.core.SurfaceTextureSurface;
import kotlin.Metadata;
import p.iu30;
import p.tob1;
import p.ven0;
import p.zyh0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"app/rive/RiveKt$RiveSurfaceHost$3$1$1$1", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/graphics/SurfaceTexture;", "newSurfaceTexture", "", "width", "height", "Lp/rih1;", "onSurfaceTextureAvailable", "(Landroid/graphics/SurfaceTexture;II)V", "destroyedSurfaceTexture", "", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "surfaceTexture", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveKt$RiveSurfaceHost$3$1$1$1 implements TextureView.SurfaceTextureListener {
    final /* synthetic */ ven0 $bitmapCallbackSent$delegate;
    final /* synthetic */ tob1 $currentOnBitmapAvailable$delegate;
    final /* synthetic */ CommandQueue $riveWorker;
    final /* synthetic */ RiveSurfaceState $surfaceState;
    final /* synthetic */ RiveTextureView $this_apply;

    public RiveKt$RiveSurfaceHost$3$1$1$1(RiveSurfaceState riveSurfaceState, CommandQueue commandQueue, ven0 ven0Var, RiveTextureView riveTextureView, tob1 tob1Var) {
        this.$surfaceState = riveSurfaceState;
        this.$riveWorker = commandQueue;
        this.$bitmapCallbackSent$delegate = ven0Var;
        this.$this_apply = riveTextureView;
        this.$currentOnBitmapAvailable$delegate = tob1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSurfaceTextureUpdated$lambda$0(tob1 tob1Var, RiveTextureView riveTextureView) {
        iu30 iu30VarRiveSurfaceHost$lambda$9 = RiveKt.RiveSurfaceHost$lambda$9(tob1Var);
        if (iu30VarRiveSurfaceHost$lambda$9 != null) {
            iu30VarRiveSurfaceHost$lambda$9.invoke(new RiveKt$RiveSurfaceHost$3$1$1$1$onSurfaceTextureUpdated$1$1(riveTextureView));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int width, int height) {
        RiveLog.INSTANCE.getLogger().d("Rive/UI", new RiveKt$RiveSurfaceHost$3$1$1$1$onSurfaceTextureAvailable$1(width, height));
        this.$surfaceState.setWidth(width);
        this.$surfaceState.setHeight(height);
        this.$surfaceState.setSurface(this.$riveWorker.createRiveSurface(new SurfaceTextureSurface(newSurfaceTexture, width, height)));
        RiveKt.RiveSurfaceHost$lambda$12(this.$bitmapCallbackSent$delegate, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
        RiveLog.INSTANCE.getLogger().d("Rive/UI", RiveKt$RiveSurfaceHost$3$1$1$1$onSurfaceTextureDestroyed$1.INSTANCE);
        this.$surfaceState.setSurface(null);
        RiveKt.RiveSurfaceHost$lambda$12(this.$bitmapCallbackSent$delegate, false);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int width, int height) {
        RiveLog.INSTANCE.getLogger().d("Rive/UI", new RiveKt$RiveSurfaceHost$3$1$1$1$onSurfaceTextureSizeChanged$1(width, height));
        this.$surfaceState.setWidth(width);
        this.$surfaceState.setHeight(height);
        RiveSurface surface = this.$surfaceState.getSurface();
        if (surface != null) {
            surface.resize$kotlin_release(width, height);
        }
        RiveKt.RiveSurfaceHost$lambda$12(this.$bitmapCallbackSent$delegate, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (RiveKt.RiveSurfaceHost$lambda$11(this.$bitmapCallbackSent$delegate) || RiveKt.RiveSurfaceHost$lambda$9(this.$currentOnBitmapAvailable$delegate) == null || this.$this_apply.getBitmap() == null) {
            return;
        }
        RiveKt.RiveSurfaceHost$lambda$12(this.$bitmapCallbackSent$delegate, true);
        RiveTextureView riveTextureView = this.$this_apply;
        riveTextureView.post(new zyh0((Object) this.$currentOnBitmapAvailable$delegate, (Object) riveTextureView, (byte) 24));
    }
}
