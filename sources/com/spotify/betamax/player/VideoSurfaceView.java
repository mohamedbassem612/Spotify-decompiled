package com.spotify.betamax.player;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.media3.ui.SubtitleView;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import p.a3k1;
import p.b3k1;
import p.bg11;
import p.bnd;
import p.c3k1;
import p.eg;
import p.feo;
import p.g54;
import p.gvt0;
import p.iu30;
import p.l1d;
import p.mc81;
import p.n57;
import p.o7h;
import p.o8u0;
import p.qeo;
import p.qx21;
import p.rm51;
import p.rmz0;
import p.s2k1;
import p.sm51;
import p.t2k1;
import p.toa;
import p.u890;
import p.xm51;
import p.y2k1;
import p.ywv0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0018)B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB=\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0004\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u001a2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u001a2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020!H\u0016¢\u0006\u0004\b.\u0010$J\u0017\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020!H\u0016¢\u0006\u0004\b0\u0010$J\u0017\u00103\u001a\u00020\u001a2\u0006\u00102\u001a\u000201H\u0007¢\u0006\u0004\b3\u00104R*\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b5\u00106\u0012\u0004\b:\u0010;\u001a\u0004\b7\u00108\"\u0004\b9\u0010,R$\u0010C\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010K\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR*\u0010O\u001a\u00020!2\u0006\u0010L\u001a\u00020!8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010$R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010_\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010c\u001a\u00020!8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b`\u0010N\u001a\u0004\ba\u0010P\"\u0004\bb\u0010$R*\u0010g\u001a\u00020!2\u0006\u0010L\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010N\u001a\u0004\be\u0010P\"\u0004\bf\u0010$R*\u0010k\u001a\u00020!2\u0006\u0010L\u001a\u00020!8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bh\u0010N\u001a\u0004\bi\u0010P\"\u0004\bj\u0010$R*\u0010o\u001a\u00020!2\u0006\u0010L\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010N\u001a\u0004\bm\u0010P\"\u0004\bn\u0010$R^\u0010x\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020\u001a0p\u0012\u0004\u0012\u00020\u001a\u0018\u00010p2 \u0010L\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020\u001a0p\u0012\u0004\u0012\u00020\u001a\u0018\u00010p8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR*\u0010|\u001a\u00020!2\u0006\u0010L\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010N\u001a\u0004\bz\u0010P\"\u0004\b{\u0010$R+\u0010\u0080\u0001\u001a\u00020!2\u0006\u0010L\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010N\u001a\u0004\b~\u0010P\"\u0004\b\u007f\u0010$R,\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R,\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R2\u0010\u0098\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0091\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R2\u0010\u009c\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0091\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u0093\u0001\u001a\u0006\b\u009a\u0001\u0010\u0095\u0001\"\u0006\b\u009b\u0001\u0010\u0097\u0001R2\u0010 \u0001\u001a\u000b\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0091\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u0093\u0001\u001a\u0006\b\u009e\u0001\u0010\u0095\u0001\"\u0006\b\u009f\u0001\u0010\u0097\u0001R&\u0010¤\u0001\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¡\u0001\u0010N\u001a\u0005\b¢\u0001\u0010P\"\u0005\b£\u0001\u0010$R\u001d\u0010ª\u0001\u001a\u00030¥\u00018\u0006¢\u0006\u0010\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R'\u0010\u00ad\u0001\u001a\u00020X2\u0006\u0010L\u001a\u00020X8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b«\u0001\u0010Z\u001a\u0005\b¬\u0001\u0010\\R\u001a\u0010±\u0001\u001a\u0005\u0018\u00010®\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010µ\u0001\u001a\u00030²\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R\u0016\u0010\u0010\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001¨\u0006¸\u0001"}, d2 = {"Lcom/spotify/betamax/player/VideoSurfaceView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/TextureView;", "textureView", "Landroid/view/SurfaceView;", "surfaceView", "Landroid/widget/ProgressBar;", "throbber", "Landroidx/media3/ui/SubtitleView;", "exoPlayerSubtitleView", "Lp/y2k1;", "priority", "(Landroid/content/Context;Landroid/view/TextureView;Landroid/view/SurfaceView;Landroid/widget/ProgressBar;Landroidx/media3/ui/SubtitleView;Lp/y2k1;)V", "getSurfaceView", "()Landroid/view/SurfaceView;", "getTextureView", "()Landroid/view/TextureView;", "Lp/b3k1;", "scaleType", "Lp/rih1;", "setScaleType", "(Lp/b3k1;)V", "Lp/gvt0;", "predicate", "setPlayablePredicate", "(Lp/gvt0;)V", "", "enabled", "setBufferingThrobberEnabled", "(Z)V", "Lp/s2k1;", "callback", "setVideoSurfaceCallback", "(Lp/s2k1;)V", "Lp/a3k1;", "listener", "setOnPredicateChangedListener", "(Lp/a3k1;)V", "isBuffering", "setIsBuffering", "isJoining", "setIsJoining", "Landroid/os/Handler;", "handler", "setHandler", "(Landroid/os/Handler;)V", "T0", "Lp/a3k1;", "getListener", "()Lp/a3k1;", "setListener", "getListener$annotations", "()V", "Lp/t2k1;", "Y0", "Lp/t2k1;", "getConfiguration", "()Lp/t2k1;", "setConfiguration", "(Lp/t2k1;)V", "configuration", "Landroid/view/Surface;", "Z0", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "setSurface", "(Landroid/view/Surface;)V", "surface", "value", "a1", "Z", "isFullscreen", "()Z", "setFullscreen", "b1", "Lp/y2k1;", "getPriority", "()Lp/y2k1;", "setPriority", "(Lp/y2k1;)V", "", "c1", "Ljava/lang/String;", "getPlaybackId", "()Ljava/lang/String;", "setPlaybackId", "(Ljava/lang/String;)V", "playbackId", "d1", "getSupportsSurfaceView", "setSupportsSurfaceView", "supportsSurfaceView", "e1", "getUseSurfaceView", "setUseSurfaceView", "useSurfaceView", "f1", "getEnableVideoScreenRecording", "setEnableVideoScreenRecording", "enableVideoScreenRecording", "g1", "getRenderAsOverlay", "setRenderAsOverlay", "renderAsOverlay", "Lkotlin/Function1;", "Landroidx/media3/exoplayer/ExoPlayer;", "h1", "Lp/iu30;", "getExoPlayer", "()Lp/iu30;", "setExoPlayer", "(Lp/iu30;)V", "exoPlayer", "i1", "getUseExoPlayerSubtitleViewStyling", "setUseExoPlayerSubtitleViewStyling", "useExoPlayerSubtitleViewStyling", "j1", "getCanPrefetchSeekFrames", "setCanPrefetchSeekFrames", "canPrefetchSeekFrames", "Lp/xm51;", "k1", "Lp/xm51;", "getSeekFramePrefetcher", "()Lp/xm51;", "setSeekFramePrefetcher", "(Lp/xm51;)V", "seekFramePrefetcher", "Lp/sm51;", "l1", "Lp/sm51;", "getSeekFrameLoader", "()Lp/sm51;", "setSeekFrameLoader", "(Lp/sm51;)V", "seekFrameLoader", "Lkotlin/Function0;", "m1", "Lkotlin/jvm/functions/Function0;", "getOnScrubStart", "()Lkotlin/jvm/functions/Function0;", "setOnScrubStart", "(Lkotlin/jvm/functions/Function0;)V", "onScrubStart", "n1", "getOnScrubEnd", "setOnScrubEnd", "onScrubEnd", "o1", "getOnFirstFrameRendered", "setOnFirstFrameRendered", "onFirstFrameRendered", "p1", "getCaptureFrozenFrameOnDetach", "setCaptureFrozenFrameOnDetach", "captureFrozenFrameOnDetach", "Lp/o8u0;", "q1", "Lp/o8u0;", "getOnRenderedFirstFrameListener", "()Lp/o8u0;", "onRenderedFirstFrameListener", "u1", "getCurrentRenderedSubtitlesText", "currentRenderedSubtitlesText", "Landroid/graphics/SurfaceTexture;", "getSurfaceTexture", "()Landroid/graphics/SurfaceTexture;", "surfaceTexture", "Landroid/util/Size;", "getDisplaySize", "()Landroid/util/Size;", "displaySize", "getExoPlayerSubtitleView", "()Landroidx/media3/ui/SubtitleView;", "src_main_java_com_spotify_betamax_player-player"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public class VideoSurfaceView extends FrameLayout {
    public static final /* synthetic */ int v1 = 0;
    public Handler N0;
    public int O0;
    public int P0;
    public ImageView Q0;
    public ImageView R0;
    public Bitmap S0;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public a3k1 listener;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public final toa X0;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    public t2k1 configuration;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    public Surface surface;
    public TextureView a;

    /* JADX INFO: renamed from: a1, reason: from kotlin metadata */
    public boolean isFullscreen;
    public Matrix b;

    /* JADX INFO: renamed from: b1, reason: from kotlin metadata */
    public y2k1 priority;
    public SurfaceView c;

    /* JADX INFO: renamed from: c1, reason: from kotlin metadata */
    public String playbackId;
    public ViewStub d;

    /* JADX INFO: renamed from: d1, reason: from kotlin metadata */
    public boolean supportsSurfaceView;
    public boolean e;

    /* JADX INFO: renamed from: e1, reason: from kotlin metadata */
    public boolean useSurfaceView;
    public SubtitleView f;

    /* JADX INFO: renamed from: f1, reason: from kotlin metadata */
    public boolean enableVideoScreenRecording;
    public ProgressBar g;

    /* JADX INFO: renamed from: g1, reason: from kotlin metadata */
    public boolean renderAsOverlay;
    public gvt0 h;

    /* JADX INFO: renamed from: h1, reason: from kotlin metadata */
    public iu30 exoPlayer;
    public s2k1 i;

    /* JADX INFO: renamed from: i1, reason: from kotlin metadata */
    public boolean useExoPlayerSubtitleViewStyling;

    /* JADX INFO: renamed from: j1, reason: from kotlin metadata */
    public boolean canPrefetchSeekFrames;

    /* JADX INFO: renamed from: k1, reason: from kotlin metadata */
    public xm51 seekFramePrefetcher;

    /* JADX INFO: renamed from: l1, reason: from kotlin metadata */
    public sm51 seekFrameLoader;

    /* JADX INFO: renamed from: m1, reason: from kotlin metadata */
    public Function0 onScrubStart;

    /* JADX INFO: renamed from: n1, reason: from kotlin metadata */
    public Function0 onScrubEnd;

    /* JADX INFO: renamed from: o1, reason: from kotlin metadata */
    public Function0 onFirstFrameRendered;

    /* JADX INFO: renamed from: p1, reason: from kotlin metadata */
    public boolean captureFrozenFrameOnDetach;
    public final c3k1 q1;
    public rm51 r1;
    public final String s1;
    public b3k1 t;
    public boolean t1;

    /* JADX INFO: renamed from: u1, reason: from kotlin metadata */
    public String currentRenderedSubtitlesText;

    public VideoSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = b3k1.ASPECT_FIT;
        this.N0 = new Handler(Looper.getMainLooper());
        this.U0 = true;
        this.X0 = new toa(this, (byte) 4);
        y2k1 y2k1Var = y2k1.MEDIUM;
        this.priority = y2k1Var;
        this.supportsSurfaceView = true;
        this.enableVideoScreenRecording = true;
        this.captureFrozenFrameOnDetach = true;
        this.q1 = new c3k1(this);
        this.s1 = "video_surface_view_seek_frame_tag";
        this.currentRenderedSubtitlesText = "";
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, rmz0.a, 0, 0);
        try {
            int i = typedArrayObtainStyledAttributes.getInt(0, 1);
            for (y2k1 y2k1Var2 : y2k1.values()) {
                if (y2k1Var2.a == i) {
                    y2k1Var = y2k1Var2;
                    break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            b(context, y2k1Var);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final Size getDisplaySize() {
        int iWidth;
        int iHeight;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            iWidth = bounds.width();
            iHeight = bounds.height();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            iWidth = i;
            iHeight = i2;
        }
        return new Size(iWidth, iHeight);
    }

    private final SubtitleView getExoPlayerSubtitleView() {
        if (this.f == null) {
            this.f = LayoutInflater.from(getContext()).inflate(2131626212, (ViewGroup) this, false);
            f();
            addView(this.f);
        }
        SubtitleView subtitleView = this.f;
        subtitleView.getClass();
        return subtitleView;
    }

    public static /* synthetic */ void getListener$annotations() {
    }

    private final SurfaceTexture getSurfaceTexture() {
        TextureView textureView = this.a;
        if (textureView != null) {
            return textureView.getSurfaceTexture();
        }
        return null;
    }

    public final int[] a(int i, int i2) {
        long jRound;
        long jRound2;
        double d = ((double) this.P0) / ((double) this.O0);
        double d2 = ((double) i) * d;
        int iRound = (int) Math.round(d2);
        b3k1 b3k1Var = this.t;
        b3k1 b3k1Var2 = b3k1.ASPECT_FIT;
        b3k1 b3k1Var3 = b3k1.ASPECT_FILL_DISPLAY_AR;
        b3k1 b3k1Var4 = b3k1.ASPECT_FILL;
        if (i2 > iRound) {
            if (b3k1Var == b3k1Var4 || b3k1Var == b3k1Var3) {
                jRound2 = Math.round(((double) i2) / d);
                i = (int) jRound2;
            } else if (b3k1Var == b3k1Var2) {
                jRound = Math.round(d2);
                i2 = (int) jRound;
            }
        } else if (b3k1Var == b3k1Var4 || b3k1Var == b3k1Var3) {
            jRound = Math.round(d2);
            i2 = (int) jRound;
        } else if (b3k1Var == b3k1Var2) {
            jRound2 = Math.round(((double) i2) / d);
            i = (int) jRound2;
        }
        return new int[]{i, i2};
    }

    public final void b(Context context, y2k1 y2k1Var) {
        this.priority = y2k1Var;
        this.b = new Matrix();
        LayoutInflater.from(context).inflate(2131626311, (ViewGroup) this, true);
        this.d = (ViewStub) findViewById(2131431609);
        this.g = (ProgressBar) findViewById(2131431333);
        this.R0 = (ImageView) findViewById(2131428979);
        this.Q0 = (ImageView) findViewById(2131430904);
        SubtitleView subtitleView = this.f;
        if (subtitleView != null) {
            subtitleView.setVisibility(0);
        }
    }

    public final void c() {
        this.currentRenderedSubtitlesText = "";
        getExoPlayerSubtitleView().setCues((List) null);
        getExoPlayerSubtitleView().setVisibility(0);
        s2k1 s2k1Var = this.i;
        if (s2k1Var != null) {
            s2k1Var.e();
        }
    }

    public final void d(int i, int i2) {
        if (this.O0 == i && this.P0 == i2) {
            return;
        }
        this.O0 = i;
        this.P0 = i2;
        this.N0.post(new toa(this, (byte) 2));
    }

    public final void e(qeo qeoVar) {
        bg11 bg11Var = qeoVar.a;
        t2k1 t2k1Var = this.configuration;
        String strY0 = "";
        if (t2k1Var == null || !t2k1Var.a()) {
            this.currentRenderedSubtitlesText = "";
            return;
        }
        if (!bg11Var.isEmpty()) {
            List listJ0 = o7h.j0(bg11Var);
            ArrayList arrayList = new ArrayList();
            Iterator it = listJ0.iterator();
            while (it.hasNext()) {
                CharSequence charSequence = ((feo) it.next()).a;
                if (charSequence != null) {
                    arrayList.add(charSequence);
                }
            }
            strY0 = o7h.y0(arrayList, "\n", (String) null, (String) null, (iu30) null, 62);
        }
        this.currentRenderedSubtitlesText = strY0;
        getExoPlayerSubtitleView().setCues(bg11Var);
    }

    public final void f() {
        bnd bndVar;
        SubtitleView subtitleView = this.f;
        if (subtitleView != null) {
            Object systemService = getContext().getSystemService("captioning");
            CaptioningManager captioningManager = systemService instanceof CaptioningManager ? (CaptioningManager) systemService : null;
            Typeface typefaceB = qx21.b(getContext(), 2131296269);
            if (captioningManager == null || !captioningManager.isEnabled()) {
                bndVar = new bnd(-1, -16777216, 0, 0, -1, typefaceB);
            } else {
                CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
                int i = userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1;
                int i2 = userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216;
                int i3 = userStyle.hasWindowColor() ? userStyle.windowColor : 0;
                int i4 = userStyle.hasEdgeType() ? userStyle.edgeType : 0;
                int i5 = userStyle.hasEdgeColor() ? userStyle.edgeColor : -1;
                Typeface typeface = userStyle.getTypeface();
                bndVar = new bnd(i, i2, i3, i4, i5, typeface == null ? typefaceB : typeface);
            }
            subtitleView.setStyle(bndVar);
            subtitleView.setApplyEmbeddedStyles(this.useExoPlayerSubtitleViewStyling);
        }
    }

    public final void g() {
        SurfaceView surfaceView = this.c;
        if (surfaceView == null) {
            return;
        }
        int i = (Build.VERSION.SDK_INT >= 29 || (isAttachedToWindow() && isShown() && getWindowVisibility() == 0)) ? 0 : 8;
        if (surfaceView.getVisibility() != i) {
            surfaceView.setVisibility(i);
        }
    }

    public final boolean getCanPrefetchSeekFrames() {
        return this.canPrefetchSeekFrames;
    }

    public final boolean getCaptureFrozenFrameOnDetach() {
        return this.captureFrozenFrameOnDetach;
    }

    public final t2k1 getConfiguration() {
        return this.configuration;
    }

    public final String getCurrentRenderedSubtitlesText() {
        return this.currentRenderedSubtitlesText;
    }

    public boolean getEnableVideoScreenRecording() {
        return this.enableVideoScreenRecording;
    }

    public final iu30 getExoPlayer() {
        return this.exoPlayer;
    }

    public final a3k1 getListener() {
        return this.listener;
    }

    public final Function0 getOnFirstFrameRendered() {
        return this.onFirstFrameRendered;
    }

    public final o8u0 getOnRenderedFirstFrameListener() {
        return this.q1;
    }

    public final Function0 getOnScrubEnd() {
        return this.onScrubEnd;
    }

    public final Function0 getOnScrubStart() {
        return this.onScrubStart;
    }

    public final String getPlaybackId() {
        return this.playbackId;
    }

    public final y2k1 getPriority() {
        return this.priority;
    }

    public final boolean getRenderAsOverlay() {
        return this.renderAsOverlay;
    }

    public final sm51 getSeekFrameLoader() {
        return this.seekFrameLoader;
    }

    public final xm51 getSeekFramePrefetcher() {
        return this.seekFramePrefetcher;
    }

    public boolean getSupportsSurfaceView() {
        return this.supportsSurfaceView;
    }

    public final Surface getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: getSurfaceView, reason: from getter */
    public SurfaceView getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: getTextureView, reason: from getter */
    public TextureView getA() {
        return this.a;
    }

    public final boolean getUseExoPlayerSubtitleViewStyling() {
        return this.useExoPlayerSubtitleViewStyling;
    }

    public final boolean getUseSurfaceView() {
        return this.useSurfaceView;
    }

    public final void h() {
        if (this.U0) {
            boolean z = this.V0;
            Runnable runnable = this.X0;
            if (z || this.W0) {
                this.N0.postDelayed(runnable, 800L);
            } else {
                this.N0.removeCallbacks(runnable);
                this.N0.post(new toa(this, (byte) 5));
            }
        }
    }

    public final void i(boolean z) {
        SurfaceView surfaceView;
        ViewStub viewStub;
        boolean z2 = this.e;
        if (!z2 && (viewStub = this.d) != null) {
            if (z) {
                viewStub.setLayoutResource(2131626312);
                ViewStub viewStub2 = this.d;
                View viewInflate = viewStub2 != null ? viewStub2.inflate() : null;
                this.c = viewInflate instanceof SurfaceView ? (SurfaceView) viewInflate : null;
            } else {
                viewStub.setLayoutResource(2131626313);
                ViewStub viewStub3 = this.d;
                View viewInflate2 = viewStub3 != null ? viewStub3.inflate() : null;
                this.a = viewInflate2 instanceof TextureView ? (TextureView) viewInflate2 : null;
            }
            this.d = null;
            this.e = true;
        } else if (z2) {
            if (z && this.c == null) {
                View view = this.a;
                if (view != null) {
                    removeView(view);
                }
                this.a = null;
                SurfaceView surfaceView2 = (SurfaceView) LayoutInflater.from(getContext()).inflate(2131626312, (ViewGroup) this, false);
                this.c = surfaceView2;
                addView(surfaceView2, 0);
            } else if (!z && this.a == null) {
                View view2 = this.c;
                if (view2 != null) {
                    removeView(view2);
                }
                this.c = null;
                TextureView textureView = (TextureView) LayoutInflater.from(getContext()).inflate(2131626313, (ViewGroup) this, false);
                this.a = textureView;
                addView(textureView, 0);
            }
        }
        if (!z) {
            TextureView textureView2 = this.a;
            if (textureView2 != null) {
                textureView2.setVisibility(0);
            }
            SurfaceView surfaceView3 = this.c;
            if (surfaceView3 != null) {
                surfaceView3.setVisibility(8);
                return;
            }
            return;
        }
        if (this.useSurfaceView && this.renderAsOverlay && (surfaceView = this.c) != null) {
            surfaceView.setZOrderMediaOverlay(true);
        }
        SurfaceView surfaceView4 = this.c;
        if (surfaceView4 != null) {
            surfaceView4.setSecure(true ^ getEnableVideoScreenRecording());
        }
        g();
        TextureView textureView3 = this.a;
        if (textureView3 != null) {
            textureView3.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useSurfaceView && Build.VERSION.SDK_INT < 29) {
            g();
        }
        if (this.e) {
            return;
        }
        this.N0.post(new g54(this, (byte) 18));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d5  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws NoWhenBranchMatchedException {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        SurfaceView surfaceView;
        super.onLayout(z, i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i9 = i3 - i;
        int paddingRight = i9 - getPaddingRight();
        int i10 = i4 - i2;
        int paddingBottom = i10 - getPaddingBottom();
        int iF = l1d.f(paddingRight, paddingLeft, 2, paddingLeft);
        int iF2 = l1d.f(paddingBottom, paddingTop, 2, paddingTop);
        ProgressBar progressBar = this.g;
        if (progressBar == null) {
            u890.C("throbber");
            throw null;
        }
        int measuredWidth = progressBar.getMeasuredWidth() / 2;
        ProgressBar progressBar2 = this.g;
        if (progressBar2 == null) {
            u890.C("throbber");
            throw null;
        }
        int measuredHeight = progressBar2.getMeasuredHeight() / 2;
        ProgressBar progressBar3 = this.g;
        if (progressBar3 == null) {
            u890.C("throbber");
            throw null;
        }
        progressBar3.layout(iF - measuredWidth, iF2 - measuredHeight, iF + measuredWidth, iF2 + measuredHeight);
        if (this.useSurfaceView && this.c != null && this.O0 > 0 && this.P0 > 0) {
            int iOrdinal = this.t.ordinal();
            if (iOrdinal == 0) {
                int[] iArrA = a(i9, i10);
                i5 = iArrA[0];
                i6 = iArrA[1];
                i7 = (i9 - i5) / 2;
                i8 = (i10 - i6) / 2;
                surfaceView = this.c;
                if (surfaceView != null) {
                    surfaceView.layout(i7, i8, i5 + i7, i6 + i8);
                }
            } else if (iOrdinal == 1) {
                SurfaceView surfaceView2 = this.c;
                if (surfaceView2 != null) {
                    surfaceView2.layout(0, 0, i9, i10);
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    eg.o();
                    return;
                }
                int[] iArrA2 = a(i9, i10);
                i5 = iArrA2[0];
                i6 = iArrA2[1];
                i7 = (i9 - i5) / 2;
                i8 = (i10 - i6) / 2;
                surfaceView = this.c;
                if (surfaceView != null) {
                    surfaceView.layout(i7, i8, i5 + i7, i6 + i8);
                }
            } else {
                int[] iArrA3 = a(i9, i10);
                int i11 = iArrA3[0];
                int i12 = iArrA3[1];
                int i13 = (i9 - i11) / 2;
                int i14 = (i10 - i12) / 2;
                SurfaceView surfaceView3 = this.c;
                if (surfaceView3 != null) {
                    surfaceView3.layout(i13, i14, i11 + i13, i12 + i14);
                }
            }
        }
        Size displaySize = getDisplaySize();
        int width = displaySize.getWidth();
        int height = displaySize.getHeight();
        if (width > 0 && height > 0) {
            z2 = Math.abs(1.0f - (((float) getWidth()) / ((float) width))) < 0.075f && Math.abs(1.0f - (((float) getHeight()) / ((float) height))) < 0.075f;
        }
        this.isFullscreen = z2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x010b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0122  */
    /* JADX WARN: Code duplicated, block: B:74:0x013b  */
    /* JADX WARN: Code duplicated, block: B:76:0x013f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0148  */
    /* JADX WARN: Code duplicated, block: B:82:0x0155  */
    /* JADX WARN: Code duplicated, block: B:85:0x015e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0167  */
    /* JADX WARN: Code duplicated, block: B:92:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x008a, please report this as an issue */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size;
        int i3;
        int i4;
        int iMin;
        int iMin2;
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount;
        TextureView textureView;
        Matrix matrix;
        Matrix matrix2;
        TextureView textureView2;
        TextureView textureView3;
        SubtitleView childAt;
        ImageView imageView;
        int i9 = this.O0;
        if (i9 == 0 && this.P0 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        double d = ((double) this.P0) / ((double) i9);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        byte b = this.t.a;
        int size2 = Integer.MAX_VALUE;
        if (mode == Integer.MIN_VALUE) {
            int i10 = b | 1;
            size = View.MeasureSpec.getSize(i);
            i3 = i10;
        } else if (mode != 1073741824) {
            i3 = b | 1;
            size = Integer.MAX_VALUE;
        } else {
            i3 = b | 2;
            size = 0;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 1073741824) {
                i4 = i3 | 8;
                size2 = 0;
            }
            if (i4 == 21) {
                iMin = Math.min(this.O0, size);
                iMin2 = Math.min(this.P0, size2);
            } else if (i4 != 22) {
                iMin = View.MeasureSpec.getSize(i);
                iMin2 = Math.min((int) Math.round(((double) iMin) * d), size2);
            } else if (i4 != 25) {
                iMin2 = View.MeasureSpec.getSize(i2);
                iMin = Math.min((int) Math.round(((double) iMin2) / d), size);
            } else if (i4 == 26) {
                iMin = View.MeasureSpec.getSize(i);
                iMin2 = View.MeasureSpec.getSize(i2);
            } else if (i4 == 37) {
                iMin = Math.min(this.O0, size);
                iMin2 = Math.min(this.P0, size2);
            } else if (i4 == 38) {
                iMin = View.MeasureSpec.getSize(i);
                iMin2 = Math.min(this.P0, size2);
            } else if (i4 == 41) {
                iMin = Math.min(this.O0, size);
                iMin2 = View.MeasureSpec.getSize(i2);
            } else if (i4 == 42) {
                iMin = View.MeasureSpec.getSize(i);
                iMin2 = View.MeasureSpec.getSize(i2);
            } else if (i4 == 53) {
                iMin = Math.min(this.O0, size);
                iMin2 = Math.min(this.P0, size2);
            } else if (i4 == 54) {
                iMin = View.MeasureSpec.getSize(i);
                iMin2 = Math.min(this.P0, size2);
            } else if (i4 == 57) {
                iMin = Math.min(this.O0, size);
                iMin2 = View.MeasureSpec.getSize(i2);
            } else if (i4 == 58) {
                iMin = View.MeasureSpec.getSize(i);
                iMin2 = View.MeasureSpec.getSize(i2);
            } else if (i4 != 69) {
                iMin = Math.min(this.O0, size);
                iMin2 = Math.min(this.P0, size2);
            } else if (i4 != 70) {
                iMin = View.MeasureSpec.getSize(i);
                iMin2 = Math.min(this.P0, size2);
            } else if (i4 != 73) {
                iMin = Math.min(this.O0, size);
                iMin2 = View.MeasureSpec.getSize(i2);
            } else if (i4 != 74) {
                n57.m("Invalid combination: " + Integer.toHexString(i4));
                iMin = 0;
                iMin2 = 0;
            } else {
                iMin = View.MeasureSpec.getSize(i);
                iMin2 = View.MeasureSpec.getSize(i2);
            }
            int[] iArrA = a(iMin, iMin2);
            i5 = iArrA[0];
            i6 = iArrA[1];
            i7 = (iMin - i5) / 2;
            i8 = (iMin2 - i6) / 2;
            childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                childAt = getChildAt(i11);
                imageView = this.Q0;
                if (imageView != null) {
                    u890.C("seekFrameView");
                    throw null;
                }
                if (!u890.j(childAt, imageView) || childAt == this.f) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iMin2, Integer.MIN_VALUE));
                }
            }
            if (!this.useSurfaceView) {
                textureView = this.a;
                if (textureView != null) {
                    textureView.getTransform(this.b);
                }
                matrix = this.b;
                if (matrix != null) {
                    matrix.setScale(i5 / iMin, i6 / iMin2);
                }
                matrix2 = this.b;
                if (matrix2 != null) {
                    matrix2.postTranslate(i7, i8);
                }
                textureView2 = this.a;
                if (textureView2 != null) {
                    textureView2.setTransform(this.b);
                }
                textureView3 = this.a;
                if (textureView3 != null) {
                    textureView3.invalidate();
                }
            }
            setMeasuredDimension(iMin, iMin2);
        }
        size2 = View.MeasureSpec.getSize(i2);
        i4 = i3 | 4;
        if (i4 == 21) {
            iMin = Math.min(this.O0, size);
            iMin2 = Math.min(this.P0, size2);
        } else if (i4 != 22) {
            iMin = View.MeasureSpec.getSize(i);
            iMin2 = Math.min((int) Math.round(((double) iMin) * d), size2);
        } else if (i4 != 25) {
            iMin2 = View.MeasureSpec.getSize(i2);
            iMin = Math.min((int) Math.round(((double) iMin2) / d), size);
        } else if (i4 == 26) {
            iMin = View.MeasureSpec.getSize(i);
            iMin2 = View.MeasureSpec.getSize(i2);
        } else if (i4 == 37) {
            iMin = Math.min(this.O0, size);
            iMin2 = Math.min(this.P0, size2);
        } else if (i4 == 38) {
            iMin = View.MeasureSpec.getSize(i);
            iMin2 = Math.min(this.P0, size2);
        } else if (i4 == 41) {
            iMin = Math.min(this.O0, size);
            iMin2 = View.MeasureSpec.getSize(i2);
        } else if (i4 == 42) {
            iMin = View.MeasureSpec.getSize(i);
            iMin2 = View.MeasureSpec.getSize(i2);
        } else if (i4 == 53) {
            iMin = Math.min(this.O0, size);
            iMin2 = Math.min(this.P0, size2);
        } else if (i4 == 54) {
            iMin = View.MeasureSpec.getSize(i);
            iMin2 = Math.min(this.P0, size2);
        } else if (i4 == 57) {
            iMin = Math.min(this.O0, size);
            iMin2 = View.MeasureSpec.getSize(i2);
        } else if (i4 == 58) {
            iMin = View.MeasureSpec.getSize(i);
            iMin2 = View.MeasureSpec.getSize(i2);
        } else if (i4 != 69) {
            iMin = Math.min(this.O0, size);
            iMin2 = Math.min(this.P0, size2);
        } else if (i4 != 70) {
            iMin = View.MeasureSpec.getSize(i);
            iMin2 = Math.min(this.P0, size2);
        } else if (i4 != 73) {
            iMin = Math.min(this.O0, size);
            iMin2 = View.MeasureSpec.getSize(i2);
        } else if (i4 != 74) {
            n57.m("Invalid combination: " + Integer.toHexString(i4));
            iMin = 0;
            iMin2 = 0;
        } else {
            iMin = View.MeasureSpec.getSize(i);
            iMin2 = View.MeasureSpec.getSize(i2);
        }
        int[] iArrA2 = a(iMin, iMin2);
        i5 = iArrA2[0];
        i6 = iArrA2[1];
        i7 = (iMin - i5) / 2;
        i8 = (iMin2 - i6) / 2;
        childCount = getChildCount();
        while (i11 < childCount) {
            childAt = getChildAt(i11);
            imageView = this.Q0;
            if (imageView != null) {
                u890.C("seekFrameView");
                throw null;
            }
            if (u890.j(childAt, imageView)) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824));
            } else {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824));
            }
        }
        if (!this.useSurfaceView) {
            textureView = this.a;
            if (textureView != null) {
                textureView.getTransform(this.b);
            }
            matrix = this.b;
            if (matrix != null) {
                matrix.setScale(i5 / iMin, i6 / iMin2);
            }
            matrix2 = this.b;
            if (matrix2 != null) {
                matrix2.postTranslate(i7, i8);
            }
            textureView2 = this.a;
            if (textureView2 != null) {
                textureView2.setTransform(this.b);
            }
            textureView3 = this.a;
            if (textureView3 != null) {
                textureView3.invalidate();
            }
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        ywv0 ywv0Var;
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.canPrefetchSeekFrames || (ywv0Var = this.seekFramePrefetcher) == null) {
            return;
        }
        ywv0Var.m(i, i2);
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        if (!this.useSurfaceView || Build.VERSION.SDK_INT >= 29) {
            return;
        }
        g();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (!this.useSurfaceView || Build.VERSION.SDK_INT >= 29) {
            return;
        }
        g();
    }

    public final void setBufferingThrobberEnabled(boolean enabled) {
        this.U0 = enabled;
        if (enabled) {
            return;
        }
        ProgressBar progressBar = this.g;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        } else {
            u890.C("throbber");
            throw null;
        }
    }

    public final void setCanPrefetchSeekFrames(boolean z) {
        this.canPrefetchSeekFrames = z;
        ywv0 ywv0Var = this.seekFramePrefetcher;
        if (!z) {
            if (ywv0Var != null) {
                ywv0Var.o();
            }
        } else if (ywv0Var != null) {
            ywv0Var.n(getWidth(), getHeight());
        }
    }

    public final void setCaptureFrozenFrameOnDetach(boolean z) {
        this.captureFrozenFrameOnDetach = z;
    }

    public final void setConfiguration(t2k1 t2k1Var) {
        this.configuration = t2k1Var;
    }

    public void setEnableVideoScreenRecording(boolean z) {
        SurfaceView surfaceView;
        this.enableVideoScreenRecording = z;
        if (!this.useSurfaceView || (surfaceView = this.c) == null) {
            return;
        }
        surfaceView.setSecure(!getEnableVideoScreenRecording());
    }

    public final void setExoPlayer(iu30 iu30Var) {
        this.exoPlayer = iu30Var;
        if (this.useSurfaceView && iu30Var != null) {
            iu30Var.invoke(new mc81(this, (byte) 2));
        }
    }

    public final void setFullscreen(boolean z) {
        this.isFullscreen = z;
    }

    public final void setHandler(Handler handler) {
        this.N0 = handler;
    }

    public void setIsBuffering(boolean isBuffering) {
        this.V0 = isBuffering;
        h();
    }

    public void setIsJoining(boolean isJoining) {
        this.W0 = isJoining;
        h();
    }

    public final void setListener(a3k1 a3k1Var) {
        this.listener = a3k1Var;
    }

    public final void setOnFirstFrameRendered(Function0 function0) {
        this.onFirstFrameRendered = function0;
    }

    public final void setOnPredicateChangedListener(a3k1 listener) {
        this.listener = listener;
    }

    public final void setOnScrubEnd(Function0 function0) {
        this.onScrubEnd = function0;
    }

    public final void setOnScrubStart(Function0 function0) {
        this.onScrubStart = function0;
    }

    public final void setPlayablePredicate(gvt0 predicate) {
        this.h = predicate;
    }

    public final void setPlaybackId(String str) {
        this.playbackId = str;
    }

    public final void setPriority(y2k1 y2k1Var) {
        this.priority = y2k1Var;
    }

    public final void setRenderAsOverlay(boolean z) {
        SurfaceView surfaceView;
        this.renderAsOverlay = z;
        if (this.useSurfaceView && z && (surfaceView = this.c) != null) {
            surfaceView.setZOrderMediaOverlay(true);
        }
    }

    public final void setScaleType(b3k1 scaleType) {
        iu30 iu30Var;
        if (this.t != scaleType) {
            this.t = scaleType;
            if (this.useSurfaceView && (iu30Var = this.exoPlayer) != null) {
                iu30Var.invoke(new mc81(this, (byte) 2));
            }
            requestLayout();
        }
    }

    public final void setSeekFrameLoader(sm51 sm51Var) {
        this.seekFrameLoader = sm51Var;
    }

    public final void setSeekFramePrefetcher(xm51 xm51Var) {
        this.seekFramePrefetcher = xm51Var;
    }

    public void setSupportsSurfaceView(boolean z) {
        this.supportsSurfaceView = z;
    }

    public final void setSurface(Surface surface) {
        this.surface = surface;
    }

    public final void setUseExoPlayerSubtitleViewStyling(boolean z) {
        this.useExoPlayerSubtitleViewStyling = z;
        f();
    }

    public final void setUseSurfaceView(boolean z) {
        if (getSupportsSurfaceView() || !z) {
            this.useSurfaceView = z;
            i(z);
        }
    }

    public final void setVideoSurfaceCallback(s2k1 callback) {
        this.i = callback;
    }

    @Override // android.view.View
    public final String toString() {
        String identifier;
        t2k1 t2k1Var = this.configuration;
        return (t2k1Var == null || (identifier = t2k1Var.getIdentifier()) == null) ? super.toString() : identifier;
    }

    public VideoSurfaceView(Context context) {
        super(context);
        this.t = b3k1.ASPECT_FIT;
        this.N0 = new Handler(Looper.getMainLooper());
        this.U0 = true;
        this.X0 = new toa(this, (byte) 4);
        y2k1 y2k1Var = y2k1.MEDIUM;
        this.priority = y2k1Var;
        this.supportsSurfaceView = true;
        this.enableVideoScreenRecording = true;
        this.captureFrozenFrameOnDetach = true;
        this.q1 = new c3k1(this);
        this.s1 = "video_surface_view_seek_frame_tag";
        this.currentRenderedSubtitlesText = "";
        b(context, y2k1Var);
    }

    public VideoSurfaceView(Context context, TextureView textureView, SurfaceView surfaceView, ProgressBar progressBar, SubtitleView subtitleView, y2k1 y2k1Var) {
        super(context);
        this.t = b3k1.ASPECT_FIT;
        this.N0 = new Handler(Looper.getMainLooper());
        this.U0 = true;
        this.X0 = new toa(this, (byte) 4);
        this.supportsSurfaceView = true;
        this.enableVideoScreenRecording = true;
        this.captureFrozenFrameOnDetach = true;
        this.q1 = new c3k1(this);
        this.s1 = "video_surface_view_seek_frame_tag";
        this.currentRenderedSubtitlesText = "";
        this.a = textureView;
        this.c = surfaceView;
        this.g = progressBar;
        this.f = subtitleView;
        this.priority = y2k1Var;
        this.b = new Matrix();
        setUseSurfaceView(surfaceView != null && textureView == null);
        this.R0 = new ImageView(context);
    }
}
