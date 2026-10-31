package app.p000rive;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.FrameLayout;
import app.p000rive.core.ArtboardHandle;
import app.p000rive.core.CommandQueue;
import app.p000rive.core.RiveSurface;
import app.p000rive.core.StateMachineHandle;
import app.p000rive.core.SurfaceTextureSurface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.a8d1;
import p.adt;
import p.c9n;
import p.cto1;
import p.d9n;
import p.eg;
import p.fn31;
import p.hm5;
import p.iac0;
import p.lnm;
import p.q8r;
import p.rih1;
import p.vu30;
import p.w8c0;
import p.x8c0;
import p.x9p1;
import p.z8p1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@adt
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0013J-\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010#R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R(\u0010(\u001a\u0004\u0018\u00010\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u000e8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Lapp/rive/RiveView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lapp/rive/RiveFile;", "file", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "Lapp/rive/core/RiveSurface;", "createRiveSurface", "(Lapp/rive/RiveFile;Landroid/graphics/SurfaceTexture;)Lapp/rive/core/RiveSurface;", "Lp/rih1;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lapp/rive/Artboard;", "artboard", "", "stateMachineName", "setRiveFile", "(Lapp/rive/RiveFile;Lapp/rive/Artboard;Ljava/lang/String;)V", "riveFile", "Lapp/rive/RiveFile;", "Lapp/rive/core/ArtboardHandle;", "artboardHandle", "Lapp/rive/core/ArtboardHandle;", "Lapp/rive/core/StateMachineHandle;", "stateMachineHandle", "Lapp/rive/core/StateMachineHandle;", "Landroid/graphics/SurfaceTexture;", "surfaceWidth", "I", "surfaceHeight", "value", "riveSurface", "Lapp/rive/core/RiveSurface;", "setRiveSurface", "(Lapp/rive/core/RiveSurface;)V", "Landroid/view/TextureView;", "textureView", "Landroid/view/TextureView;", "getTextureView", "()Landroid/view/TextureView;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveView extends FrameLayout {
    public static final int $stable = 8;
    private ArtboardHandle artboardHandle;
    private RiveFile riveFile;
    private RiveSurface riveSurface;
    private StateMachineHandle stateMachineHandle;
    private int surfaceHeight;
    private SurfaceTexture surfaceTexture;
    private int surfaceWidth;
    private final TextureView textureView;

    /* JADX INFO: renamed from: app.rive.RiveView$onAttachedToWindow$1, reason: invalid class name */
    @q8r(c = "app.rive.RiveView$onAttachedToWindow$1", f = "RiveView.kt", l = {64}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends a8d1 implements vu30 {
        final /* synthetic */ iac0 $owner;
        int label;
        final /* synthetic */ RiveView this$0;

        /* JADX INFO: renamed from: app.rive.RiveView$onAttachedToWindow$1$1, reason: invalid class name and collision with other inner class name */
        @q8r(c = "app.rive.RiveView$onAttachedToWindow$1$1", f = "RiveView.kt", l = {68}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
        public static final class C00101 extends a8d1 implements vu30 {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ RiveView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00101(RiveView riveView, lnm<? super C00101> lnmVar) {
                super(2, lnmVar);
                this.this$0 = riveView;
            }

            public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
                C00101 c00101 = new C00101(this.this$0, lnmVar);
                c00101.L$0 = obj;
                return c00101;
            }

            public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
                return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0040  */
            /* JADX WARN: Code duplicated, block: B:13:0x005a A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:17:0x006c A[ADDED_TO_REGION, Catch: all -> 0x00cb, REMOVE, TryCatch #2 {all -> 0x00cb, blocks: (B:15:0x0066, B:17:0x006c, B:18:0x006f, B:20:0x0075, B:22:0x007f, B:24:0x0089, B:25:0x008c, B:27:0x0098, B:29:0x00b0, B:31:0x00b5, B:32:0x00b8, B:34:0x00ba, B:35:0x00bd, B:36:0x00be, B:37:0x00c1, B:28:0x00a0, B:26:0x0095), top: B:50:0x0066, inners: #0, #1 }] */
            /* JADX WARN: Code duplicated, block: B:18:0x006f A[Catch: all -> 0x00cb, TryCatch #2 {all -> 0x00cb, blocks: (B:15:0x0066, B:17:0x006c, B:18:0x006f, B:20:0x0075, B:22:0x007f, B:24:0x0089, B:25:0x008c, B:27:0x0098, B:29:0x00b0, B:31:0x00b5, B:32:0x00b8, B:34:0x00ba, B:35:0x00bd, B:36:0x00be, B:37:0x00c1, B:28:0x00a0, B:26:0x0095), top: B:50:0x0066, inners: #0, #1 }] */
            /* JADX WARN: Code duplicated, block: B:22:0x007f A[Catch: all -> 0x00cb, TryCatch #2 {all -> 0x00cb, blocks: (B:15:0x0066, B:17:0x006c, B:18:0x006f, B:20:0x0075, B:22:0x007f, B:24:0x0089, B:25:0x008c, B:27:0x0098, B:29:0x00b0, B:31:0x00b5, B:32:0x00b8, B:34:0x00ba, B:35:0x00bd, B:36:0x00be, B:37:0x00c1, B:28:0x00a0, B:26:0x0095), top: B:50:0x0066, inners: #0, #1 }] */
            /* JADX WARN: Code duplicated, block: B:24:0x0089 A[Catch: all -> 0x00cb, TryCatch #2 {all -> 0x00cb, blocks: (B:15:0x0066, B:17:0x006c, B:18:0x006f, B:20:0x0075, B:22:0x007f, B:24:0x0089, B:25:0x008c, B:27:0x0098, B:29:0x00b0, B:31:0x00b5, B:32:0x00b8, B:34:0x00ba, B:35:0x00bd, B:36:0x00be, B:37:0x00c1, B:28:0x00a0, B:26:0x0095), top: B:50:0x0066, inners: #0, #1 }] */
            /* JADX WARN: Code duplicated, block: B:25:0x008c A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #2 {all -> 0x00cb, blocks: (B:15:0x0066, B:17:0x006c, B:18:0x006f, B:20:0x0075, B:22:0x007f, B:24:0x0089, B:25:0x008c, B:27:0x0098, B:29:0x00b0, B:31:0x00b5, B:32:0x00b8, B:34:0x00ba, B:35:0x00bd, B:36:0x00be, B:37:0x00c1, B:28:0x00a0, B:26:0x0095), top: B:50:0x0066, inners: #0, #1 }] */
            /* JADX WARN: Code duplicated, block: B:36:0x00be A[Catch: all -> 0x00cb, TryCatch #2 {all -> 0x00cb, blocks: (B:15:0x0066, B:17:0x006c, B:18:0x006f, B:20:0x0075, B:22:0x007f, B:24:0x0089, B:25:0x008c, B:27:0x0098, B:29:0x00b0, B:31:0x00b5, B:32:0x00b8, B:34:0x00ba, B:35:0x00bd, B:36:0x00be, B:37:0x00c1, B:28:0x00a0, B:26:0x0095), top: B:50:0x0066, inners: #0, #1 }] */
            /* JADX WARN: Code duplicated, block: B:9:0x003a A[PHI: r4 r5
              0x003a: PHI (r4v1 p.o811) = (r4v0 p.o811), (r4v2 p.o811) binds: [B:8:0x0022, B:39:0x00c8] A[DONT_GENERATE, DONT_INLINE]
              0x003a: PHI (r5v4 p.c9n) = (r5v3 p.c9n), (r5v5 p.c9n) binds: [B:8:0x0022, B:39:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0058 -> B:14:0x005b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                /*
                    Method dump skipped, instruction units count: 211
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: app.p000rive.RiveView.AnonymousClass1.C00101.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(iac0 iac0Var, RiveView riveView, lnm<? super AnonymousClass1> lnmVar) {
            super(2, lnmVar);
            this.$owner = iac0Var;
            this.this$0 = riveView;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            return new AnonymousClass1(this.$owner, this.this$0, lnmVar);
        }

        public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
            return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
        }

        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                hm5.M(obj);
                x8c0 lifecycle = this.$owner.getLifecycle();
                C00101 c00101 = new C00101(this.this$0, null);
                this.label = 1;
                Object objT = z8p1.t(lifecycle, w8c0.e, c00101, this);
                d9n d9nVar = d9n.a;
                if (objT == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return rih1.a;
        }
    }

    public RiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TextureView textureView = new TextureView(context);
        textureView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: app.rive.RiveView$textureView$1$1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture newSurfaceTexture, int width, int height) {
                this.this$0.surfaceTexture = newSurfaceTexture;
                this.this$0.surfaceWidth = width;
                this.this$0.surfaceHeight = height;
                RiveFile riveFile = this.this$0.riveFile;
                if (riveFile != null) {
                    RiveView riveView = this.this$0;
                    riveView.setRiveSurface(riveView.createRiveSurface(riveFile, newSurfaceTexture));
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture destroyedSurfaceTexture) {
                this.this$0.setRiveSurface(null);
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int width, int height) {
                this.this$0.surfaceTexture = surfaceTexture;
                this.this$0.surfaceWidth = width;
                this.this$0.surfaceHeight = height;
                RiveSurface riveSurface = this.this$0.riveSurface;
                if (riveSurface != null) {
                    riveSurface.resize$kotlin_release(width, height);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        });
        this.textureView = textureView;
        addView(textureView, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RiveSurface createRiveSurface(RiveFile file, SurfaceTexture surfaceTexture) {
        return file.getRiveWorker().createRiveSurface(new SurfaceTextureSurface(surfaceTexture, this.surfaceWidth, this.surfaceHeight));
    }

    public static /* synthetic */ void setRiveFile$default(RiveView riveView, RiveFile riveFile, Artboard artboard, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            artboard = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        riveView.setRiveFile(riveFile, artboard, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRiveSurface(RiveSurface riveSurface) {
        RiveSurface riveSurface2 = this.riveSurface;
        if (riveSurface2 != null && riveSurface2 != null) {
            riveSurface2.close();
        }
        this.riveSurface = riveSurface;
    }

    public final TextureView getTextureView() {
        return this.textureView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        CommandQueue riveWorker;
        super.onAttachedToWindow();
        iac0 iac0VarH = x9p1.h(this);
        if (iac0VarH == null) {
            eg.m("RiveView must be hosted under a LifecycleOwner.");
            return;
        }
        RiveFile riveFile = this.riveFile;
        if (riveFile != null && (riveWorker = riveFile.getRiveWorker()) != null) {
            riveWorker.acquire("RiveView");
        }
        fn31.T(cto1.q(iac0VarH), null, 0, new AnonymousClass1(iac0VarH, this, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        CommandQueue riveWorker;
        super.onDetachedFromWindow();
        RiveFile riveFile = this.riveFile;
        if (riveFile == null || (riveWorker = riveFile.getRiveWorker()) == null) {
            return;
        }
        riveWorker.release("RiveView", "Detached from window");
    }

    public final void setRiveFile(RiveFile file, Artboard artboard, String stateMachineName) {
        StateMachineHandle stateMachineHandleM434boximpl;
        file.checkOpen$kotlin_release();
        if (artboard != null) {
            artboard.checkOpen$kotlin_release();
        }
        if (artboard != null) {
            artboard.requireFromFile$kotlin_release(file);
        }
        this.riveFile = file;
        this.artboardHandle = ArtboardHandle.m178boximpl(artboard != null ? artboard.getArtboardHandle() : file.getRiveWorker().m213createDefaultArtboard6NrLy0M(file.getFileHandle()));
        if (stateMachineName != null) {
            CommandQueue riveWorker = file.getRiveWorker();
            ArtboardHandle artboardHandle = this.artboardHandle;
            artboardHandle.getClass();
            stateMachineHandleM434boximpl = StateMachineHandle.m434boximpl(riveWorker.m217createStateMachineByNameItmKBmM(artboardHandle.m184unboximpl(), stateMachineName));
        } else {
            CommandQueue riveWorker2 = file.getRiveWorker();
            ArtboardHandle artboardHandle2 = this.artboardHandle;
            artboardHandle2.getClass();
            stateMachineHandleM434boximpl = StateMachineHandle.m434boximpl(riveWorker2.m215createDefaultStateMachinexY8vNfM(artboardHandle2.m184unboximpl()));
        }
        this.stateMachineHandle = stateMachineHandleM434boximpl;
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture == null || this.riveSurface != null) {
            return;
        }
        surfaceTexture.getClass();
        setRiveSurface(createRiveSurface(file, surfaceTexture));
    }

    public RiveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ RiveView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public RiveView(Context context) {
        this(context, null, 0, 6, null);
    }
}
