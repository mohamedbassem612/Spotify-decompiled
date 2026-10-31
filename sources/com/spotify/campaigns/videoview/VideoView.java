package com.spotify.campaigns.videoview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import kotlin.Metadata;
import p.b3k1;
import p.b8k1;
import p.gpr0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00132\b\b\u0001\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/spotify/campaigns/videoview/VideoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lcom/spotify/betamax/player/VideoSurfaceView;", "getVideoSurface", "()Lcom/spotify/betamax/player/VideoSurfaceView;", "Lp/gpr0;", "title", "Lp/rih1;", "setErrorTitle", "(Lp/gpr0;)V", "subtitle", "setErrorSubtitle", "color", "setErrorBackground", "(I)V", "src_main_java_com_spotify_campaigns_videoview-videoview"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoView extends ConstraintLayout {
    public final VideoSurfaceView T0;
    public final View U0;
    public final ParagraphView V0;
    public final ParagraphView W0;
    public final EncoreButton X0;
    public final View Y0;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoView(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(2131626315, (ViewGroup) this, true);
        VideoSurfaceView videoSurfaceViewN = b8k1.n(this, 2131431606);
        this.T0 = videoSurfaceViewN;
        this.U0 = b8k1.n(this, 2131430685);
        this.V0 = (ParagraphView) b8k1.n(this, 2131428732);
        this.W0 = (ParagraphView) b8k1.n(this, 2131428730);
        this.X0 = b8k1.n(this, 2131428721);
        this.Y0 = b8k1.n(this, 2131428719);
        videoSurfaceViewN.setVisibility(8);
        videoSurfaceViewN.setScaleType(b3k1.c);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void y(VideoView videoView, boolean z, int i) {
        boolean z2 = (i & 1) == 0;
        boolean z3 = (i & 2) == 0;
        boolean z4 = (i & 4) == 0;
        boolean z5 = (i & 8) == 0;
        boolean z6 = (i & 16) == 0;
        if ((i & 32) != 0) {
            z = false;
        }
        videoView.V0.setVisibility(z2 ? 0 : 8);
        videoView.W0.setVisibility(z3 ? 0 : 8);
        videoView.X0.setVisibility(z4 ? 0 : 8);
        videoView.Y0.setVisibility(z5 ? 0 : 8);
        videoView.U0.setVisibility(z6 ? 0 : 8);
        videoView.T0.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: getVideoSurface, reason: from getter */
    public VideoSurfaceView getT0() {
        return this.T0;
    }

    public final void setErrorBackground(int color) {
        this.Y0.setBackgroundColor(color);
    }

    public final void setErrorSubtitle(gpr0 subtitle) {
        this.V0.x(subtitle);
    }

    public final void setErrorTitle(gpr0 title) {
        this.V0.x(title);
    }

    public final void z() {
        y(this, true, 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(2131626315, (ViewGroup) this, true);
        VideoSurfaceView videoSurfaceViewN = b8k1.n(this, 2131431606);
        this.T0 = videoSurfaceViewN;
        this.U0 = b8k1.n(this, 2131430685);
        this.V0 = (ParagraphView) b8k1.n(this, 2131428732);
        this.W0 = (ParagraphView) b8k1.n(this, 2131428730);
        this.X0 = b8k1.n(this, 2131428721);
        this.Y0 = b8k1.n(this, 2131428719);
        videoSurfaceViewN.setVisibility(8);
        videoSurfaceViewN.setScaleType(b3k1.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(2131626315, (ViewGroup) this, true);
        VideoSurfaceView videoSurfaceViewN = b8k1.n(this, 2131431606);
        this.T0 = videoSurfaceViewN;
        this.U0 = b8k1.n(this, 2131430685);
        this.V0 = (ParagraphView) b8k1.n(this, 2131428732);
        this.W0 = (ParagraphView) b8k1.n(this, 2131428730);
        this.X0 = b8k1.n(this, 2131428721);
        this.Y0 = b8k1.n(this, 2131428719);
        videoSurfaceViewN.setVisibility(8);
        videoSurfaceViewN.setScaleType(b3k1.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(getContext()).inflate(2131626315, (ViewGroup) this, true);
        VideoSurfaceView videoSurfaceViewN = b8k1.n(this, 2131431606);
        this.T0 = videoSurfaceViewN;
        this.U0 = b8k1.n(this, 2131430685);
        this.V0 = (ParagraphView) b8k1.n(this, 2131428732);
        this.W0 = (ParagraphView) b8k1.n(this, 2131428730);
        this.X0 = b8k1.n(this, 2131428721);
        this.Y0 = b8k1.n(this, 2131428719);
        videoSurfaceViewN.setVisibility(8);
        videoSurfaceViewN.setScaleType(b3k1.c);
    }
}
