package app.p000rive;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Trace;
import android.view.MotionEvent;
import app.p000rive.core.CheckableAutoCloseable;
import app.p000rive.core.CloseOnce;
import app.p000rive.core.CommandQueue;
import app.p000rive.core.FrameTicker;
import app.p000rive.core.FrameTickerKt;
import app.p000rive.core.RenderingDefaults;
import app.p000rive.core.StateMachineHandle;
import app.p000rive.core.ViewModelInstanceHandle;
import app.p000rive.semantics.AndroidAccessibilityStateProvider;
import app.p000rive.semantics.RiveSemanticsModeController;
import app.p000rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.a8d1;
import p.at71;
import p.b7x;
import p.bhn0;
import p.c9n;
import p.cy30;
import p.d9n;
import p.dt71;
import p.eg;
import p.ev30;
import p.faa0;
import p.fn31;
import p.gio1;
import p.hab0;
import p.hhg1;
import p.hm5;
import p.k4p1;
import p.lnm;
import p.mgo1;
import p.onm;
import p.op71;
import p.os00;
import p.q7h;
import p.q8r;
import p.rih1;
import p.rmc0;
import p.sap1;
import p.sen0;
import p.smc0;
import p.smo1;
import p.sqg0;
import p.u890;
import p.vu30;
import p.wen0;
import p.x8c0;
import p.xab1;
import p.zxh;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 s2\u00020\u0001:\u0001sBm\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019BW\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u001aBk\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0004\b\u0018\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!J\"\u0010&\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0087@¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00162\u0006\u00101\u001a\u00020.H\u0002¢\u0006\u0004\b2\u00103R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00106R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00107R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00108R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00109R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010ARH\u0010F\u001a6\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00160Bj\u0002`E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GRH\u0010H\u001a6\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00160Bj\u0002`E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010GRH\u0010I\u001a6\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00160Bj\u0002`E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GRH\u0010J\u001a6\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00160Bj\u0002`E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010GR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00160K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u001c\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00160Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00160]8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010eR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR*\u0010\u0012\u001a\u00020\u00112\u0006\u0010m\u001a\u00020\u00118F@GX\u0087\u000e¢\u0006\u0012\u0012\u0004\br\u0010\u001d\u001a\u0004\bn\u0010o\"\u0004\bp\u0010q¨\u0006t"}, d2 = {"Lapp/rive/RiveCanvasSession;", "Lapp/rive/core/CheckableAutoCloseable;", "Landroid/content/Context;", "context", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "Lapp/rive/Artboard;", "artboard", "Lapp/rive/StateMachine;", "stateMachine", "Lapp/rive/ViewModelInstance;", "viewModelInstance", "Lapp/rive/Fit;", "fit", "", "clearColor", "Lapp/rive/RiveSemanticsMode;", "semantics", "", "", "globalViewModelInstances", "Lp/rih1;", "initializationToken", "<init>", "(Landroid/content/Context;Lapp/rive/core/CommandQueue;Lapp/rive/Artboard;Lapp/rive/StateMachine;Lapp/rive/ViewModelInstance;Lapp/rive/Fit;ILapp/rive/RiveSemanticsMode;Ljava/util/Map;Lp/rih1;)V", "(Landroid/content/Context;Lapp/rive/core/CommandQueue;Lapp/rive/Artboard;Lapp/rive/StateMachine;Lapp/rive/ViewModelInstance;Lapp/rive/Fit;ILapp/rive/RiveSemanticsMode;)V", "(Landroid/content/Context;Lapp/rive/core/CommandQueue;Lapp/rive/Artboard;Lapp/rive/StateMachine;Lapp/rive/ViewModelInstance;Lapp/rive/Fit;ILapp/rive/RiveSemanticsMode;Ljava/util/Map;)V", "close", "()V", "Landroid/graphics/Rect;", "region", "setRegion", "(Landroid/graphics/Rect;)V", "Lp/x8c0;", "lifecycle", "Lapp/rive/core/FrameTicker;", "ticker", "beginPlaying", "(Lp/x8c0;Lapp/rive/core/FrameTicker;Lp/lnm;)Ljava/lang/Object;", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "enabled", "setSemanticsEnabled", "(Z)V", "Lapp/rive/core/CommandQueue;", "Lapp/rive/Artboard;", "Lapp/rive/StateMachine;", "Lapp/rive/ViewModelInstance;", "Lapp/rive/Fit;", "I", "globalViewModelInstancesSnapshot", "Ljava/util/Map;", "", "boundViewModelInstances", "Ljava/util/List;", "Landroid/graphics/Paint;", "clearPaint", "Landroid/graphics/Paint;", "Lkotlin/Function7;", "Lapp/rive/core/StateMachineHandle;", "", "Lapp/rive/PointerFn;", "pointerDownFn", "Lp/ev30;", "pointerMoveFn", "pointerUpFn", "pointerExitFn", "Lp/zxh;", "closeSignal", "Lp/zxh;", "Lapp/rive/core/CloseOnce;", "closer", "Lapp/rive/core/CloseOnce;", "Lapp/rive/HardwareRenderBuffer;", "renderBuffer", "Lapp/rive/HardwareRenderBuffer;", "Lp/wen0;", "renderBufferState", "Lp/wen0;", "Landroid/graphics/Bitmap;", "latestBitmap", "Landroid/graphics/Bitmap;", "Lp/sen0;", "_frameAvailable", "Lp/sen0;", "Lp/at71;", "frameAvailable", "Lp/at71;", "getFrameAvailable", "()Lp/at71;", "renderRegion", "Landroid/graphics/Rect;", "isPlaying", "Z", "semanticsEnabled", "Lapp/rive/semantics/RiveSemanticsModeController;", "semanticsModeController", "Lapp/rive/semantics/RiveSemanticsModeController;", "getClosed", "()Z", "closed", "value", "getSemantics", "()Lapp/rive/RiveSemanticsMode;", "setSemantics", "(Lapp/rive/RiveSemanticsMode;)V", "getSemantics$annotations", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveCanvasSession implements CheckableAutoCloseable {
    private static final String TAG = "Rive/CanvasSession";
    private final sen0 _frameAvailable;
    private final Artboard artboard;
    private final List<ViewModelInstance> boundViewModelInstances;
    private final int clearColor;
    private final Paint clearPaint;
    private final zxh closeSignal;
    private final CloseOnce closer;
    private final Fit fit;
    private final at71 frameAvailable;
    private final Map<String, ViewModelInstance> globalViewModelInstancesSnapshot;
    private boolean isPlaying;
    private Bitmap latestBitmap;
    private final ev30 pointerDownFn;
    private final ev30 pointerExitFn;
    private final ev30 pointerMoveFn;
    private final ev30 pointerUpFn;
    private HardwareRenderBuffer renderBuffer;
    private final wen0 renderBufferState;
    private final Rect renderRegion;
    private final CommandQueue riveWorker;
    private boolean semanticsEnabled;
    private final RiveSemanticsModeController semanticsModeController;
    private final StateMachine stateMachine;
    private final ViewModelInstance viewModelInstance;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: app.rive.RiveCanvasSession$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass4 extends hab0 implements Function0 {
        public AnonymousClass4() {
            super(0);
        }

        public final String invoke() {
            return cy30.p("Creating RiveCanvasSession with artboard '", RiveCanvasSession.this.artboard.getName(), "' and state machine '", RiveCanvasSession.this.stateMachine.getName(), "'");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lapp/rive/RiveCanvasSession$Companion;", "", "()V", "TAG", "", "isSupported", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isSupported() {
            return HardwareRenderBuffer.INSTANCE.isSupported();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveCanvasSession$beginPlaying$1, reason: invalid class name */
    @q8r(c = "app.rive.RiveCanvasSession", f = "RiveCanvasSession.kt", l = {559}, m = "beginPlaying")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends onm {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(lnm<? super AnonymousClass1> lnmVar) {
            super(lnmVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= os00.INVALID_ID;
            return RiveCanvasSession.this.beginPlaying(null, null, this);
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveCanvasSession$beginPlaying$3, reason: invalid class name */
    @q8r(c = "app.rive.RiveCanvasSession$beginPlaying$3", f = "RiveCanvasSession.kt", l = {680, 682, 683, 685, 682, 683, 685}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass3 extends a8d1 implements vu30 {
        final /* synthetic */ x8c0 $lifecycle;
        final /* synthetic */ FrameTicker $ticker;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(x8c0 x8c0Var, FrameTicker frameTicker, lnm<? super AnonymousClass3> lnmVar) {
            super(2, lnmVar);
            this.$lifecycle = x8c0Var;
            this.$ticker = frameTicker;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            AnonymousClass3 anonymousClass3 = RiveCanvasSession.this.new AnonymousClass3(this.$lifecycle, this.$ticker, lnmVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
            return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:33:0x0101  */
        /* JADX WARN: Code duplicated, block: B:37:0x010f  */
        /* JADX WARN: Code duplicated, block: B:47:0x0139  */
        /* JADX WARN: Code duplicated, block: B:51:0x014b  */
        /* JADX WARN: Code duplicated, block: B:55:0x015a  */
        /* JADX WARN: Code duplicated, block: B:64:0x016d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:? A[LOOP:0: B:53:0x0154->B:66:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:68:0x016d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:70:? A[LOOP:1: B:35:0x0109->B:70:?, LOOP_END, SYNTHETIC] */
        public final Object invokeSuspend(Object obj) throws Throwable {
            faa0 faa0Var;
            Throwable th;
            faa0 faa0Var2;
            faa0 faa0Var3;
            List list;
            Throwable th2;
            List list2;
            List list3;
            faa0 faa0Var4;
            List list4;
            List list5;
            Iterator it;
            faa0 faa0Var5;
            List list6;
            Throwable th3;
            Iterator it2;
            faa0 faa0Var6;
            int i = this.label;
            d9n d9nVar = d9n.a;
            switch (i) {
                case 0:
                    hm5.M(obj);
                    c9n c9nVar = (c9n) this.L$0;
                    List list7 = RiveCanvasSession.this.boundViewModelInstances;
                    RiveCanvasSession riveCanvasSession = RiveCanvasSession.this;
                    ArrayList arrayList = new ArrayList(q7h.U(list7, 10));
                    Iterator it3 = list7.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(fn31.T(c9nVar, null, 0, new RiveCanvasSession$beginPlaying$3$viewModelDirtyCollectors$1$1((ViewModelInstance) it3.next(), riveCanvasSession, null), 3));
                    }
                    faa0 faa0VarT = fn31.T(c9nVar, null, 0, new RiveCanvasSession$beginPlaying$3$frameAvailableCollector$1(RiveCanvasSession.this, null), 3);
                    xab1 xab1VarT = fn31.T(c9nVar, null, 0, new RiveCanvasSession$beginPlaying$3$renderLoop$1(this.$lifecycle, RiveCanvasSession.this, this.$ticker, null), 3);
                    faa0 faa0VarT2 = fn31.T(c9nVar, null, 0, new RiveCanvasSession$beginPlaying$3$closeWatcher$1(RiveCanvasSession.this, xab1VarT, null), 3);
                    try {
                        this.L$0 = arrayList;
                        this.L$1 = faa0VarT;
                        this.L$2 = faa0VarT2;
                        this.label = 1;
                        if (xab1VarT.j(this) != d9nVar) {
                            faa0Var3 = faa0VarT;
                            faa0Var = faa0VarT2;
                            list3 = arrayList;
                            this.L$0 = list3;
                            this.L$1 = faa0Var3;
                            this.L$2 = null;
                            this.label = 2;
                            if (op71.p(faa0Var, this) != d9nVar) {
                                faa0Var4 = faa0Var3;
                                list4 = list3;
                                this.L$0 = list4;
                                this.L$1 = null;
                                this.label = 3;
                                if (op71.p(faa0Var4, this) != d9nVar) {
                                    list5 = list4;
                                    it = list5.iterator();
                                    while (it.hasNext()) {
                                        faa0Var5 = (faa0) it.next();
                                        this.L$0 = it;
                                        this.label = 4;
                                        if (op71.p(faa0Var5, this) == d9nVar) {
                                        }
                                    }
                                    return rih1.a;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        faa0Var = faa0VarT2;
                        th = th4;
                        faa0Var2 = faa0VarT;
                        list = arrayList;
                        this.L$0 = list;
                        this.L$1 = faa0Var2;
                        this.L$2 = th;
                        this.label = 5;
                        if (op71.p(faa0Var, this) != d9nVar) {
                            th2 = th;
                            list2 = list;
                            this.L$0 = list2;
                            this.L$1 = th2;
                            this.L$2 = null;
                            this.label = 6;
                            if (op71.p(faa0Var2, this) != d9nVar) {
                                list6 = list2;
                                Iterator it4 = list6.iterator();
                                th3 = th2;
                                it2 = it4;
                                while (it2.hasNext()) {
                                    faa0Var6 = (faa0) it2.next();
                                    this.L$0 = th3;
                                    this.L$1 = it2;
                                    this.label = 7;
                                    if (op71.p(faa0Var6, this) == d9nVar) {
                                    }
                                }
                                throw th3;
                            }
                        }
                    }
                    return d9nVar;
                case 1:
                    faa0Var = (faa0) this.L$2;
                    faa0Var3 = (faa0) this.L$1;
                    List list8 = (List) this.L$0;
                    try {
                        hm5.M(obj);
                        list3 = list8;
                        this.L$0 = list3;
                        this.L$1 = faa0Var3;
                        this.L$2 = null;
                        this.label = 2;
                        if (op71.p(faa0Var, this) != d9nVar) {
                            faa0Var4 = faa0Var3;
                            list4 = list3;
                            this.L$0 = list4;
                            this.L$1 = null;
                            this.label = 3;
                            if (op71.p(faa0Var4, this) != d9nVar) {
                                list5 = list4;
                                it = list5.iterator();
                                while (it.hasNext()) {
                                    faa0Var5 = (faa0) it.next();
                                    this.L$0 = it;
                                    this.label = 4;
                                    if (op71.p(faa0Var5, this) == d9nVar) {
                                    }
                                }
                                return rih1.a;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        faa0Var2 = faa0Var3;
                        list = list8;
                        this.L$0 = list;
                        this.L$1 = faa0Var2;
                        this.L$2 = th;
                        this.label = 5;
                        if (op71.p(faa0Var, this) != d9nVar) {
                            th2 = th;
                            list2 = list;
                            this.L$0 = list2;
                            this.L$1 = th2;
                            this.L$2 = null;
                            this.label = 6;
                            if (op71.p(faa0Var2, this) != d9nVar) {
                                list6 = list2;
                                Iterator it5 = list6.iterator();
                                th3 = th2;
                                it2 = it5;
                                while (it2.hasNext()) {
                                    faa0Var6 = (faa0) it2.next();
                                    this.L$0 = th3;
                                    this.L$1 = it2;
                                    this.label = 7;
                                    if (op71.p(faa0Var6, this) == d9nVar) {
                                    }
                                }
                                throw th3;
                            }
                        }
                    }
                    return d9nVar;
                case 2:
                    faa0Var4 = (faa0) this.L$1;
                    List list9 = (List) this.L$0;
                    hm5.M(obj);
                    list4 = list9;
                    this.L$0 = list4;
                    this.L$1 = null;
                    this.label = 3;
                    if (op71.p(faa0Var4, this) != d9nVar) {
                        list5 = list4;
                        it = list5.iterator();
                        while (it.hasNext()) {
                            faa0Var5 = (faa0) it.next();
                            this.L$0 = it;
                            this.label = 4;
                            if (op71.p(faa0Var5, this) == d9nVar) {
                            }
                        }
                        return rih1.a;
                    }
                    return d9nVar;
                case 3:
                    List list10 = (List) this.L$0;
                    hm5.M(obj);
                    list5 = list10;
                    it = list5.iterator();
                    while (it.hasNext()) {
                        faa0Var5 = (faa0) it.next();
                        this.L$0 = it;
                        this.label = 4;
                        if (op71.p(faa0Var5, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return rih1.a;
                case 4:
                    it = (Iterator) this.L$0;
                    hm5.M(obj);
                    while (it.hasNext()) {
                        faa0Var5 = (faa0) it.next();
                        this.L$0 = it;
                        this.label = 4;
                        if (op71.p(faa0Var5, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return rih1.a;
                case 5:
                    th2 = (Throwable) this.L$2;
                    faa0Var2 = (faa0) this.L$1;
                    List list11 = (List) this.L$0;
                    hm5.M(obj);
                    list2 = list11;
                    this.L$0 = list2;
                    this.L$1 = th2;
                    this.L$2 = null;
                    this.label = 6;
                    if (op71.p(faa0Var2, this) != d9nVar) {
                        list6 = list2;
                        Iterator it6 = list6.iterator();
                        th3 = th2;
                        it2 = it6;
                        while (it2.hasNext()) {
                            faa0Var6 = (faa0) it2.next();
                            this.L$0 = th3;
                            this.L$1 = it2;
                            this.label = 7;
                            if (op71.p(faa0Var6, this) == d9nVar) {
                            }
                        }
                        throw th3;
                    }
                    return d9nVar;
                case 6:
                    th2 = (Throwable) this.L$1;
                    List list12 = (List) this.L$0;
                    hm5.M(obj);
                    list6 = list12;
                    Iterator it7 = list6.iterator();
                    th3 = th2;
                    it2 = it7;
                    while (it2.hasNext()) {
                        faa0Var6 = (faa0) it2.next();
                        this.L$0 = th3;
                        this.L$1 = it2;
                        this.label = 7;
                        if (op71.p(faa0Var6, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    throw th3;
                case 7:
                    it2 = (Iterator) this.L$1;
                    th3 = (Throwable) this.L$0;
                    hm5.M(obj);
                    while (it2.hasNext()) {
                        faa0Var6 = (faa0) it2.next();
                        this.L$0 = th3;
                        this.L$1 = it2;
                        this.label = 7;
                        if (op71.p(faa0Var6, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    throw th3;
                default:
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveCanvasSession$setRegion$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends hab0 implements Function0 {
        final /* synthetic */ Rect $region;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Rect rect) {
            super(0);
            this.$region = rect;
        }

        public final String invoke() {
            return "Render region has a 0 dimension: " + this.$region + "; clearing render state";
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveCanvasSession$setRegion$4, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00314 extends hab0 implements Function0 {
        final /* synthetic */ Rect $region;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00314(Rect rect) {
            super(0);
            this.$region = rect;
        }

        public final String invoke() {
            return "Updating render region to " + this.$region + "; recreating render buffer and unsettling state machine";
        }
    }

    private RiveCanvasSession(Context context, CommandQueue commandQueue, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RiveSemanticsMode riveSemanticsMode, Map<String, ViewModelInstance> map, rih1 rih1Var) {
        this.riveWorker = commandQueue;
        this.artboard = artboard;
        this.stateMachine = stateMachine;
        this.viewModelInstance = viewModelInstance;
        this.fit = fit;
        this.clearColor = i;
        Map<String, ViewModelInstance> mapU = sqg0.U(map);
        this.globalViewModelInstancesSnapshot = mapU;
        smc0 smc0VarN = k4p1.n();
        if (viewModelInstance != null) {
            smc0VarN.add(viewModelInstance);
        }
        smc0VarN.addAll(mapU.values());
        smc0 smc0VarK = k4p1.k(smc0VarN);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
        while (true) {
            rmc0 rmc0Var = rmc0VarListIterator;
            if (!rmc0Var.hasNext()) {
                break;
            }
            Object next = rmc0Var.next();
            if (hashSet.add(ViewModelInstanceHandle.m450boximpl(((ViewModelInstance) next).getInstanceHandle()))) {
                arrayList.add(next);
            }
        }
        this.boundViewModelInstances = arrayList;
        this.riveWorker.checkOpen$kotlin_release();
        this.artboard.checkOpen$kotlin_release();
        this.stateMachine.checkOpen$kotlin_release();
        ViewModelInstance viewModelInstance2 = this.viewModelInstance;
        if (viewModelInstance2 != null) {
            viewModelInstance2.checkOpen$kotlin_release();
        }
        Iterator<T> it = this.globalViewModelInstancesSnapshot.values().iterator();
        while (it.hasNext()) {
            ((ViewModelInstance) it.next()).checkOpen$kotlin_release();
        }
        this.artboard.requireOwnedBy$kotlin_release(this.riveWorker);
        this.stateMachine.requireFromArtboard$kotlin_release(this.artboard);
        ViewModelInstance viewModelInstance3 = this.viewModelInstance;
        if (viewModelInstance3 != null) {
            viewModelInstance3.requireOwnedBy$kotlin_release(this.riveWorker);
        }
        Iterator<T> it2 = this.globalViewModelInstancesSnapshot.values().iterator();
        while (it2.hasNext()) {
            ((ViewModelInstance) it2.next()).requireOwnedBy$kotlin_release(this.riveWorker);
        }
        if (!INSTANCE.isSupported()) {
            eg.m("RiveCanvasSession requires API 29+ hardware bitmap support");
            throw null;
        }
        RiveLog.INSTANCE.getLogger().d(TAG, new AnonymousClass4());
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.clearColor);
        this.clearPaint = paint;
        this.pointerDownFn = new RiveCanvasSession$pointerDownFn$1(this.riveWorker);
        this.pointerMoveFn = new RiveCanvasSession$pointerMoveFn$1(this.riveWorker);
        this.pointerUpFn = new RiveCanvasSession$pointerUpFn$1(this.riveWorker);
        this.pointerExitFn = new RiveCanvasSession$pointerExitFn$1(this.riveWorker);
        this.closeSignal = sap1.a();
        this.closer = new CloseOnce("RiveCanvasSession", new RiveCanvasSession$closer$1(this));
        this.renderBufferState = gio1.b((Object) null);
        dt71 dt71VarD = mgo1.d(0, 1, 2);
        this._frameAvailable = dt71VarD;
        this.frameAvailable = dt71VarD;
        this.renderRegion = new Rect();
        this.stateMachine.bindViewModels$kotlin_release(this.viewModelInstance, this.globalViewModelInstancesSnapshot);
        this.semanticsModeController = new RiveSemanticsModeController(riveSemanticsMode, new AndroidAccessibilityStateProvider(context.getApplicationContext()), new RiveCanvasSession$semanticsModeController$1(this));
    }

    public static /* synthetic */ Object beginPlaying$default(RiveCanvasSession riveCanvasSession, x8c0 x8c0Var, FrameTicker frameTicker, lnm lnmVar, int i, Object obj) {
        if ((i & 2) != 0) {
            frameTicker = FrameTickerKt.getChoreographerFrameTicker();
        }
        return riveCanvasSession.beginPlaying(x8c0Var, frameTicker, lnmVar);
    }

    public static /* synthetic */ void getSemantics$annotations() {
    }

    private static final boolean onTouchEvent$containsInRegion(RiveCanvasSession riveCanvasSession, float f, float f2) {
        Rect rect = riveCanvasSession.renderRegion;
        return f >= ((float) rect.left) && f < ((float) rect.right) && f2 >= ((float) rect.top) && f2 < ((float) rect.bottom);
    }

    private static final void onTouchEvent$dispatchPointer(MotionEvent motionEvent, RiveCanvasSession riveCanvasSession, float f, float f2, int i, ev30 ev30Var) {
        ev30Var.invoke(StateMachineHandle.m434boximpl(riveCanvasSession.stateMachine.getStateMachineHandle()), riveCanvasSession.fit, Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(motionEvent.getPointerId(i)), Float.valueOf(motionEvent.getX(i) - riveCanvasSession.renderRegion.left), Float.valueOf(motionEvent.getY(i) - riveCanvasSession.renderRegion.top));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSemanticsEnabled(boolean enabled) {
        if (this.semanticsEnabled == enabled) {
            return;
        }
        StateMachine stateMachine = this.stateMachine;
        if (enabled) {
            stateMachine.enableSemantics();
        } else {
            stateMachine.clearSemanticFocusForLifecycleCleanup$kotlin_release();
        }
        this.semanticsEnabled = enabled;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object beginPlaying(x8c0 x8c0Var, FrameTicker frameTicker, lnm<? super rih1> lnmVar) {
        AnonymousClass1 anonymousClass1;
        if (lnmVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) lnmVar;
            int i = anonymousClass1.label;
            if ((i & os00.INVALID_ID) != 0) {
                anonymousClass1.label = i - os00.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(lnmVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(lnmVar);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                this.closer.checkOpen();
                if (this.isPlaying) {
                    eg.m("beginPlaying() is already running for this RiveCanvasSession");
                    return null;
                }
                this.isPlaying = true;
                this.stateMachine.unsettle$kotlin_release();
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(x8c0Var, frameTicker, null);
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                Object objS = smo1.s(anonymousClass3, anonymousClass1);
                d9n d9nVar = d9n.a;
                if (objS == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = (RiveCanvasSession) anonymousClass1.L$0;
                hm5.M(obj);
            }
            this.isPlaying = false;
            this = rih1.a;
            return this;
        } catch (Throwable th) {
            this.isPlaying = false;
            throw th;
        }
    }

    @Override // app.p000rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.closer.close();
    }

    public final void draw(Canvas canvas) {
        this.closer.checkOpen();
        if (!canvas.isHardwareAccelerated()) {
            hhg1.n("RiveCanvasSession requires a hardware-accelerated canvas to draw hardware bitmaps");
            return;
        }
        if (this.renderRegion.isEmpty()) {
            return;
        }
        canvas.drawRect(this.renderRegion, this.clearPaint);
        if (this.latestBitmap == null) {
            return;
        }
        Trace.beginSection("Rive/Frame/Present/DrawBitmap");
        try {
            Bitmap bitmap = this.latestBitmap;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.renderRegion, (Paint) null);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // app.p000rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.closer.getClosed();
    }

    public final at71 getFrameAvailable() {
        return this.frameAvailable;
    }

    public final RiveSemanticsMode getSemantics() {
        return this.semanticsModeController.getMode();
    }

    public final boolean onTouchEvent(MotionEvent event) {
        RiveCanvasSession riveCanvasSession;
        this.closer.checkOpen();
        boolean z = false;
        if (this.renderRegion.isEmpty()) {
            return false;
        }
        float fWidth = this.renderRegion.width();
        float fHeight = this.renderRegion.height();
        Trace.beginSection("Rive/PointerInput");
        try {
            switch (event.getActionMasked()) {
                case 0:
                case 5:
                    riveCanvasSession = this;
                    if (onTouchEvent$containsInRegion(riveCanvasSession, event.getX(event.getActionIndex()), event.getY(event.getActionIndex()))) {
                        onTouchEvent$dispatchPointer(event, riveCanvasSession, fWidth, fHeight, event.getActionIndex(), riveCanvasSession.pointerDownFn);
                        z = true;
                    }
                    break;
                case 1:
                case 6:
                    riveCanvasSession = this;
                    onTouchEvent$dispatchPointer(event, riveCanvasSession, fWidth, fHeight, event.getActionIndex(), riveCanvasSession.pointerUpFn);
                    onTouchEvent$dispatchPointer(event, riveCanvasSession, fWidth, fHeight, event.getActionIndex(), riveCanvasSession.pointerExitFn);
                    z = true;
                    break;
                case 2:
                    riveCanvasSession = this;
                    int pointerCount = event.getPointerCount();
                    for (int i = 0; i < pointerCount; i++) {
                        onTouchEvent$dispatchPointer(event, riveCanvasSession, fWidth, fHeight, i, onTouchEvent$containsInRegion(riveCanvasSession, event.getX(i), event.getY(i)) ? riveCanvasSession.pointerMoveFn : riveCanvasSession.pointerExitFn);
                    }
                    z = true;
                    break;
                case 3:
                case 4:
                    int pointerCount2 = event.getPointerCount();
                    int i2 = 0;
                    while (i2 < pointerCount2) {
                        RiveCanvasSession riveCanvasSession2 = this;
                        MotionEvent motionEvent = event;
                        onTouchEvent$dispatchPointer(motionEvent, riveCanvasSession2, fWidth, fHeight, i2, this.pointerExitFn);
                        i2++;
                        event = motionEvent;
                        this = riveCanvasSession2;
                    }
                    riveCanvasSession = this;
                    z = true;
                    break;
                default:
                    riveCanvasSession = this;
                    break;
            }
            if (z) {
                riveCanvasSession.stateMachine.unsettle$kotlin_release();
            }
            return z;
        } finally {
            Trace.endSection();
        }
    }

    public final void setRegion(Rect region) {
        this.closer.checkOpen();
        if (region.width() < 0 || region.height() < 0) {
            bhn0.s(region, "Region must have non-negative dimensions: ");
            return;
        }
        int iWidth = region.width();
        int iHeight = region.height();
        if (iWidth == 0 || iHeight == 0) {
            if (u890.j(this.renderRegion, region) && this.renderBuffer == null && this.latestBitmap == null) {
                return;
            }
            RiveLog.INSTANCE.getLogger().v(TAG, new AnonymousClass2(region));
            this.renderRegion.set(region);
            this.renderBufferState.l((Object) null);
            HardwareRenderBuffer hardwareRenderBuffer = this.renderBuffer;
            this.renderBuffer = null;
            if (hardwareRenderBuffer != null) {
                hardwareRenderBuffer.close();
            }
            this.latestBitmap = null;
            this.stateMachine.unsettle$kotlin_release();
            return;
        }
        if (u890.j(this.renderRegion, region)) {
            return;
        }
        boolean z = (this.renderRegion.width() == iWidth && this.renderRegion.height() == iHeight) ? false : true;
        if (z) {
            RiveLog.INSTANCE.getLogger().i(TAG, new C00314(region));
        }
        HardwareRenderBuffer hardwareRenderBuffer2 = this.renderBuffer;
        HardwareRenderBuffer hardwareRenderBuffer3 = z ? new HardwareRenderBuffer(iWidth, iHeight, this.riveWorker) : hardwareRenderBuffer2;
        this.renderBuffer = hardwareRenderBuffer3;
        this.renderBufferState.l(hardwareRenderBuffer3);
        this.renderRegion.set(region);
        if (z) {
            if (this.fit instanceof Fit.Layout) {
                Trace.beginSection("Rive/Layout/ResizeArtboard");
                if (hardwareRenderBuffer3 != null) {
                    try {
                        this.artboard.resizeArtboard(hardwareRenderBuffer3.getSurface(), this.fit.getScaleFactor());
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.endSection();
            }
            this.stateMachine.unsettle$kotlin_release();
            this.latestBitmap = null;
        }
        if (hardwareRenderBuffer2 == null || hardwareRenderBuffer2 == hardwareRenderBuffer3) {
            return;
        }
        hardwareRenderBuffer2.close();
    }

    public final void setSemantics(RiveSemanticsMode riveSemanticsMode) {
        this.closer.checkOpen();
        this.semanticsModeController.setMode(riveSemanticsMode);
    }

    public /* synthetic */ RiveCanvasSession(Context context, CommandQueue commandQueue, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RiveSemanticsMode riveSemanticsMode, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, commandQueue, artboard, stateMachine, (i2 & 16) != 0 ? null : viewModelInstance, (i2 & 32) != 0 ? RenderingDefaults.INSTANCE.defaultFit() : fit, (i2 & 64) != 0 ? 0 : i, (i2 & SemanticState.Focused) != 0 ? RiveSemanticsMode.Off : riveSemanticsMode);
    }

    public RiveCanvasSession(Context context, CommandQueue commandQueue, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RiveSemanticsMode riveSemanticsMode) {
        this(context, commandQueue, artboard, stateMachine, viewModelInstance, fit, i, riveSemanticsMode, (Map<String, ViewModelInstance>) b7x.a, rih1.a);
    }

    public /* synthetic */ RiveCanvasSession(Context context, CommandQueue commandQueue, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RiveSemanticsMode riveSemanticsMode, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, commandQueue, artboard, stateMachine, (i2 & 16) != 0 ? null : viewModelInstance, (i2 & 32) != 0 ? RenderingDefaults.INSTANCE.defaultFit() : fit, (i2 & 64) != 0 ? 0 : i, (i2 & SemanticState.Focused) != 0 ? RiveSemanticsMode.Off : riveSemanticsMode, map);
    }

    public RiveCanvasSession(Context context, CommandQueue commandQueue, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RiveSemanticsMode riveSemanticsMode, Map<String, ViewModelInstance> map) {
        this(context, commandQueue, artboard, stateMachine, viewModelInstance, fit, i, riveSemanticsMode, map, rih1.a);
    }
}
