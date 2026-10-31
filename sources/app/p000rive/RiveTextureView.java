package app.p000rive;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView;
import app.p000rive.semantics.AndroidVirtualNodeIdAllocator;
import app.p000rive.semantics.AndroidVirtualNodeIdRegistry;
import app.p000rive.semantics.RiveExploreByTouchHelper;
import app.p000rive.semantics.SemanticTreeModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.b8k1;
import p.hab0;
import p.hrt;
import p.iu30;
import p.ktd;
import p.rf;
import p.rih1;
import p.u890;
import p.vu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJk\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u000f2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u00132\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u00132\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001e\u0010\fJ\u0015\u0010!\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\bH\u0014¢\u0006\u0004\b$\u0010\fJ\u000f\u0010%\u001a\u00020\bH\u0014¢\u0006\u0004\b%\u0010\fR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lapp/rive/RiveTextureView;", "Landroid/view/TextureView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lapp/rive/RiveTextureView$SemanticsInstallation;", "installation", "Lp/rih1;", "installSemanticsHelper", "(Lapp/rive/RiveTextureView$SemanticsInstallation;)V", "disposeSemanticsHelper", "()V", "Lapp/rive/semantics/SemanticTreeModel;", "tree", "Lkotlin/Function2;", "", "Lapp/rive/semantics/SemanticActionType;", "onSemanticAction", "Lkotlin/Function1;", "Lapp/rive/semantics/SemanticAccessibilityFocusTransition;", "onAccessibilityFocusChanged", "onSemanticFocusRequested", "Lkotlin/Function0;", "onSemanticFocusCleared", "installSemantics", "(Lapp/rive/semantics/SemanticTreeModel;Lp/vu30;Lp/iu30;Lp/iu30;Lkotlin/jvm/functions/Function0;)V", "", "synchronizeSemantics", "()Z", "clearSemantics", "Landroid/view/MotionEvent;", "event", "dispatchSemanticHoverEvent", "(Landroid/view/MotionEvent;)Z", "dispatchHoverEvent", "onAttachedToWindow", "onDetachedFromWindow", "Lapp/rive/semantics/AndroidVirtualNodeIdAllocator;", "semanticsIdAllocator", "Lapp/rive/semantics/AndroidVirtualNodeIdAllocator;", "semanticsInstallation", "Lapp/rive/RiveTextureView$SemanticsInstallation;", "Lapp/rive/semantics/RiveExploreByTouchHelper;", "semanticsHelper", "Lapp/rive/semantics/RiveExploreByTouchHelper;", "SemanticsInstallation", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveTextureView extends TextureView {
    public static final int $stable = 8;
    private RiveExploreByTouchHelper semanticsHelper;
    private final AndroidVirtualNodeIdAllocator semanticsIdAllocator;
    private SemanticsInstallation semanticsInstallation;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\rHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019Jr\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\rHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0012R)\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0014R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0016R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b+\u0010\u0016R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010\u0019¨\u0006."}, d2 = {"Lapp/rive/RiveTextureView$SemanticsInstallation;", "", "Lapp/rive/semantics/SemanticTreeModel;", "tree", "Lkotlin/Function2;", "", "Lapp/rive/semantics/SemanticActionType;", "Lp/rih1;", "onSemanticAction", "Lkotlin/Function1;", "Lapp/rive/semantics/SemanticAccessibilityFocusTransition;", "onAccessibilityFocusChanged", "onSemanticFocusRequested", "Lkotlin/Function0;", "onSemanticFocusCleared", "<init>", "(Lapp/rive/semantics/SemanticTreeModel;Lp/vu30;Lp/iu30;Lp/iu30;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lapp/rive/semantics/SemanticTreeModel;", "component2", "()Lp/vu30;", "component3", "()Lp/iu30;", "component4", "component5", "()Lkotlin/jvm/functions/Function0;", "copy", "(Lapp/rive/semantics/SemanticTreeModel;Lp/vu30;Lp/iu30;Lp/iu30;Lkotlin/jvm/functions/Function0;)Lapp/rive/RiveTextureView$SemanticsInstallation;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lapp/rive/semantics/SemanticTreeModel;", "getTree", "Lp/vu30;", "getOnSemanticAction", "Lp/iu30;", "getOnAccessibilityFocusChanged", "getOnSemanticFocusRequested", "Lkotlin/jvm/functions/Function0;", "getOnSemanticFocusCleared", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SemanticsInstallation {
        private final iu30 onAccessibilityFocusChanged;
        private final vu30 onSemanticAction;
        private final Function0 onSemanticFocusCleared;
        private final iu30 onSemanticFocusRequested;
        private final SemanticTreeModel tree;

        public SemanticsInstallation(SemanticTreeModel semanticTreeModel, vu30 vu30Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0) {
            this.tree = semanticTreeModel;
            this.onSemanticAction = vu30Var;
            this.onAccessibilityFocusChanged = iu30Var;
            this.onSemanticFocusRequested = iu30Var2;
            this.onSemanticFocusCleared = function0;
        }

        public static /* synthetic */ SemanticsInstallation copy$default(SemanticsInstallation semanticsInstallation, SemanticTreeModel semanticTreeModel, vu30 vu30Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                semanticTreeModel = semanticsInstallation.tree;
            }
            if ((i & 2) != 0) {
                vu30Var = semanticsInstallation.onSemanticAction;
            }
            if ((i & 4) != 0) {
                iu30Var = semanticsInstallation.onAccessibilityFocusChanged;
            }
            if ((i & 8) != 0) {
                iu30Var2 = semanticsInstallation.onSemanticFocusRequested;
            }
            if ((i & 16) != 0) {
                function0 = semanticsInstallation.onSemanticFocusCleared;
            }
            Function0 function1 = function0;
            iu30 iu30Var3 = iu30Var;
            return semanticsInstallation.copy(semanticTreeModel, vu30Var, iu30Var3, iu30Var2, function1);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SemanticTreeModel getTree() {
            return this.tree;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final vu30 getOnSemanticAction() {
            return this.onSemanticAction;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final iu30 getOnAccessibilityFocusChanged() {
            return this.onAccessibilityFocusChanged;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final iu30 getOnSemanticFocusRequested() {
            return this.onSemanticFocusRequested;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Function0 getOnSemanticFocusCleared() {
            return this.onSemanticFocusCleared;
        }

        public final SemanticsInstallation copy(SemanticTreeModel tree, vu30 onSemanticAction, iu30 onAccessibilityFocusChanged, iu30 onSemanticFocusRequested, Function0 onSemanticFocusCleared) {
            return new SemanticsInstallation(tree, onSemanticAction, onAccessibilityFocusChanged, onSemanticFocusRequested, onSemanticFocusCleared);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SemanticsInstallation)) {
                return false;
            }
            SemanticsInstallation semanticsInstallation = (SemanticsInstallation) other;
            return u890.j(this.tree, semanticsInstallation.tree) && u890.j(this.onSemanticAction, semanticsInstallation.onSemanticAction) && u890.j(this.onAccessibilityFocusChanged, semanticsInstallation.onAccessibilityFocusChanged) && u890.j(this.onSemanticFocusRequested, semanticsInstallation.onSemanticFocusRequested) && u890.j(this.onSemanticFocusCleared, semanticsInstallation.onSemanticFocusCleared);
        }

        public final iu30 getOnAccessibilityFocusChanged() {
            return this.onAccessibilityFocusChanged;
        }

        public final vu30 getOnSemanticAction() {
            return this.onSemanticAction;
        }

        public final Function0 getOnSemanticFocusCleared() {
            return this.onSemanticFocusCleared;
        }

        public final iu30 getOnSemanticFocusRequested() {
            return this.onSemanticFocusRequested;
        }

        public final SemanticTreeModel getTree() {
            return this.tree;
        }

        public int hashCode() {
            return this.onSemanticFocusCleared.hashCode() + ktd.g(this.onSemanticFocusRequested, ktd.g(this.onAccessibilityFocusChanged, hrt.g(this.tree.hashCode() * 31, 31, this.onSemanticAction), 31), 31);
        }

        public String toString() {
            return "SemanticsInstallation(tree=" + this.tree + ", onSemanticAction=" + this.onSemanticAction + ", onAccessibilityFocusChanged=" + this.onAccessibilityFocusChanged + ", onSemanticFocusRequested=" + this.onSemanticFocusRequested + ", onSemanticFocusCleared=" + this.onSemanticFocusCleared + ")";
        }
    }

    public RiveTextureView(Context context) {
        super(context);
        this.semanticsIdAllocator = new AndroidVirtualNodeIdAllocator();
    }

    private final void disposeSemanticsHelper() {
        RiveExploreByTouchHelper riveExploreByTouchHelper = this.semanticsHelper;
        if (riveExploreByTouchHelper == null) {
            return;
        }
        riveExploreByTouchHelper.dispose();
        riveExploreByTouchHelper.invalidateRoot();
        this.semanticsHelper = null;
        b8k1.p(this, (rf) null);
    }

    public static /* synthetic */ void installSemantics$default(RiveTextureView riveTextureView, SemanticTreeModel semanticTreeModel, vu30 vu30Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            iu30Var2 = AnonymousClass1.INSTANCE;
        }
        iu30 iu30Var3 = iu30Var2;
        if ((i & 16) != 0) {
            function0 = AnonymousClass2.INSTANCE;
        }
        riveTextureView.installSemantics(semanticTreeModel, vu30Var, iu30Var, iu30Var3, function0);
    }

    private final void installSemanticsHelper(SemanticsInstallation installation) {
        disposeSemanticsHelper();
        RiveExploreByTouchHelper riveExploreByTouchHelper = new RiveExploreByTouchHelper(this, installation.getTree(), installation.getOnSemanticAction(), installation.getOnAccessibilityFocusChanged(), installation.getOnSemanticFocusRequested(), installation.getOnSemanticFocusCleared(), new AndroidVirtualNodeIdRegistry(this.semanticsIdAllocator));
        this.semanticsHelper = riveExploreByTouchHelper;
        b8k1.p(this, riveExploreByTouchHelper);
        riveExploreByTouchHelper.onInstalled();
        riveExploreByTouchHelper.invalidateRoot();
    }

    public final void clearSemantics() {
        this.semanticsInstallation = null;
        disposeSemanticsHelper();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent event) {
        return dispatchSemanticHoverEvent(event) || super.dispatchHoverEvent(event);
    }

    public final boolean dispatchSemanticHoverEvent(MotionEvent event) {
        RiveExploreByTouchHelper riveExploreByTouchHelper = this.semanticsHelper;
        return riveExploreByTouchHelper != null && riveExploreByTouchHelper.dispatchHoverEvent(event);
    }

    public final void installSemantics(SemanticTreeModel tree, vu30 onSemanticAction, iu30 onAccessibilityFocusChanged, iu30 onSemanticFocusRequested, Function0 onSemanticFocusCleared) {
        SemanticsInstallation semanticsInstallation = new SemanticsInstallation(tree, onSemanticAction, onAccessibilityFocusChanged, onSemanticFocusRequested, onSemanticFocusCleared);
        this.semanticsInstallation = semanticsInstallation;
        installSemanticsHelper(semanticsInstallation);
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        SemanticsInstallation semanticsInstallation;
        super.onAttachedToWindow();
        if (this.semanticsHelper != null || (semanticsInstallation = this.semanticsInstallation) == null) {
            return;
        }
        installSemanticsHelper(semanticsInstallation);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        disposeSemanticsHelper();
        super.onDetachedFromWindow();
    }

    public final boolean synchronizeSemantics() {
        RiveExploreByTouchHelper riveExploreByTouchHelper = this.semanticsHelper;
        if (riveExploreByTouchHelper == null || !riveExploreByTouchHelper.synchronizeWithTree()) {
            return false;
        }
        riveExploreByTouchHelper.invalidateRoot();
        return true;
    }

    /* JADX INFO: renamed from: app.rive.RiveTextureView$installSemantics$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends hab0 implements Function0 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m96invoke();
            return rih1.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m96invoke() {
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveTextureView$installSemantics$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lp/rih1;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends hab0 implements iu30 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return rih1.a;
        }

        public final void invoke(int i) {
        }
    }
}
