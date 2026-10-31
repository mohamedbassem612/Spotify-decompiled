package app.p000rive;

import android.content.Context;
import app.p000rive.core.CommandQueue;
import kotlin.Metadata;
import p.hab0;
import p.iu30;
import p.tob1;
import p.ven0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lapp/rive/RiveTextureView;", "context", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class RiveKt$RiveSurfaceHost$3$1 extends hab0 implements iu30 {
    final /* synthetic */ ven0 $bitmapCallbackSent$delegate;
    final /* synthetic */ tob1 $currentOnBitmapAvailable$delegate;
    final /* synthetic */ CommandQueue $riveWorker;
    final /* synthetic */ RiveSurfaceState $surfaceState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveKt$RiveSurfaceHost$3$1(RiveSurfaceState riveSurfaceState, CommandQueue commandQueue, ven0 ven0Var, tob1 tob1Var) {
        super(1);
        this.$surfaceState = riveSurfaceState;
        this.$riveWorker = commandQueue;
        this.$bitmapCallbackSent$delegate = ven0Var;
        this.$currentOnBitmapAvailable$delegate = tob1Var;
    }

    public final RiveTextureView invoke(Context context) {
        RiveTextureView riveTextureView = new RiveTextureView(context);
        RiveSurfaceState riveSurfaceState = this.$surfaceState;
        CommandQueue commandQueue = this.$riveWorker;
        ven0 ven0Var = this.$bitmapCallbackSent$delegate;
        tob1 tob1Var = this.$currentOnBitmapAvailable$delegate;
        riveTextureView.setOpaque(false);
        riveTextureView.setSurfaceTextureListener(new RiveKt$RiveSurfaceHost$3$1$1$1(riveSurfaceState, commandQueue, ven0Var, riveTextureView, tob1Var));
        this.$surfaceState.setTextureView(riveTextureView);
        return riveTextureView;
    }
}
