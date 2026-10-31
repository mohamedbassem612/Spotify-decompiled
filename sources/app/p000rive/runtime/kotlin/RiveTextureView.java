package app.p000rive.runtime.kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import app.p000rive.RiveLog;
import app.p000rive.runtime.kotlin.renderers.Renderer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.cy30;
import p.dm5;
import p.f4i1;
import p.hab0;
import p.hac0;
import p.idd1;
import p.u890;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH$¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000f\u0018\u0001H\u0084\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010 \u001a\u00020\u0014H\u0015¢\u0006\u0004\b \u0010\u001dJ\u001f\u0010$\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0017H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00101\u001a\u00020\f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u000eR$\u00102\u001a\u0004\u0018\u00010\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u000b\"\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lapp/rive/runtime/kotlin/RiveTextureView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lapp/rive/runtime/kotlin/renderers/Renderer;", "createRenderer", "()Lapp/rive/runtime/kotlin/renderers/Renderer;", "Lp/hac0;", "createObserver", "()Lp/hac0;", "T", "getContextAsType", "()Ljava/lang/Object;", "Landroid/graphics/SurfaceTexture;", "surface", "Lp/rih1;", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "", "width", "height", "onSurfaceTextureSizeChanged", "(Landroid/graphics/SurfaceTexture;II)V", "onAttachedToWindow", "()V", "surfaceTexture", "onSurfaceTextureAvailable", "onDetachedFromWindow", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "Landroid/app/Activity;", "activity$delegate", "Lp/znb0;", "getActivity", "()Landroid/app/Activity;", "activity", "lifecycleObserver$delegate", "getLifecycleObserver", "lifecycleObserver", "renderer", "Lapp/rive/runtime/kotlin/renderers/Renderer;", "getRenderer", "setRenderer", "(Lapp/rive/runtime/kotlin/renderers/Renderer;)V", "Lapp/rive/runtime/kotlin/SharedSurface;", "sharedSurface", "Lapp/rive/runtime/kotlin/SharedSurface;", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class RiveTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    private static final String TAG = "RiveL/RiveTextureView";

    /* JADX INFO: renamed from: activity$delegate, reason: from kotlin metadata */
    private final znb0 activity;

    /* JADX INFO: renamed from: lifecycleObserver$delegate, reason: from kotlin metadata */
    private final znb0 lifecycleObserver;
    private Renderer renderer;
    private SharedSurface sharedSurface;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveTextureView$onSurfaceTextureAvailable$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00971 extends hab0 implements Function0 {
        final /* synthetic */ int $height;
        final /* synthetic */ int $width;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00971(int i, int i2) {
            super(0);
            this.$width = i;
            this.$height = i2;
        }

        public final String invoke() {
            return cy30.i(this.$width, "onSurfaceTextureAvailable: ", this.$height, " x ");
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveTextureView$onSurfaceTextureSizeChanged$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00991 extends hab0 implements Function0 {
        final /* synthetic */ int $height;
        final /* synthetic */ int $width;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00991(int i, int i2) {
            super(0);
            this.$width = i;
            this.$height = i2;
        }

        public final String invoke() {
            return cy30.i(this.$width, "onSurfaceTextureSizeChanged: ", this.$height, " x ");
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveTextureView$onVisibilityChanged$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01001 extends hab0 implements Function0 {
        final /* synthetic */ int $visibility;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01001(int i) {
            super(0);
            this.$visibility = i;
        }

        public final String invoke() {
            return f4i1.c(this.$visibility, "onVisibilityChanged: ");
        }
    }

    public RiveTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.activity = dm5.S(3, new RiveTextureView$activity$2(this));
        this.lifecycleObserver = new idd1(new RiveTextureView$lifecycleObserver$2(this));
    }

    public abstract hac0 createObserver();

    public abstract Renderer createRenderer();

    public final Activity getActivity() {
        return (Activity) this.activity.getValue();
    }

    public final <T> T getContextAsType() {
        if (!(getContext() instanceof ContextWrapper)) {
            return null;
        }
        u890.B();
        throw null;
    }

    public final hac0 getLifecycleObserver() {
        return (hac0) this.lifecycleObserver.getValue();
    }

    public final Renderer getRenderer() {
        return this.renderer;
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        RiveLog.INSTANCE.getLogger().d(TAG, AnonymousClass1.INSTANCE);
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
        setOpaque(false);
        Renderer rendererCreateRenderer = createRenderer();
        rendererCreateRenderer.make();
        this.renderer = rendererCreateRenderer;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        RiveLog.INSTANCE.getLogger().d(TAG, C00961.INSTANCE);
        SharedSurface sharedSurface = this.sharedSurface;
        if (sharedSurface != null) {
            sharedSurface.release();
        }
        this.sharedSurface = null;
        Renderer renderer = this.renderer;
        renderer.getClass();
        renderer.delete();
        this.renderer = null;
        super.onDetachedFromWindow();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int width, int height) {
        RiveLog.INSTANCE.getLogger().d(TAG, new C00971(width, height));
        SharedSurface sharedSurface = this.sharedSurface;
        if (sharedSurface != null) {
            sharedSurface.release();
        }
        Renderer renderer = this.renderer;
        if (renderer != null) {
            renderer.stop();
            SharedSurface sharedSurface2 = new SharedSurface(new Surface(surfaceTexture));
            this.sharedSurface = sharedSurface2;
            renderer.setSurface$kotlin_release(sharedSurface2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        RiveLog.INSTANCE.getLogger().d(TAG, C00981.INSTANCE);
        Renderer renderer = this.renderer;
        if (renderer != null) {
            renderer.destroySurfaceAsync$kotlin_release();
        }
        SharedSurface sharedSurface = this.sharedSurface;
        if (sharedSurface != null) {
            sharedSurface.release();
        }
        this.sharedSurface = null;
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
        RiveLog.INSTANCE.getLogger().d(TAG, new C00991(width, height));
        onSurfaceTextureAvailable(surface, width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
    }

    @Override // android.view.TextureView, android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        RiveLog.INSTANCE.getLogger().d(TAG, new C01001(visibility));
        super.onVisibilityChanged(changedView, visibility);
        Renderer renderer = this.renderer;
        if (visibility == 0) {
            if (renderer != null) {
                renderer.start();
            }
        } else if (renderer != null) {
            renderer.stop();
        }
    }

    public final void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveTextureView$onAttachedToWindow$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        public final String invoke() {
            return "onAttachedToWindow";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveTextureView$onDetachedFromWindow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00961 extends hab0 implements Function0 {
        public static final C00961 INSTANCE = new C00961();

        public C00961() {
            super(0);
        }

        public final String invoke() {
            return "onDetachedFromWindow";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveTextureView$onSurfaceTextureDestroyed$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00981 extends hab0 implements Function0 {
        public static final C00981 INSTANCE = new C00981();

        public C00981() {
            super(0);
        }

        public final String invoke() {
            return "onSurfaceTextureDestroyed";
        }
    }

    public /* synthetic */ RiveTextureView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
