package app.p000rive;

import android.os.Trace;
import app.p000rive.core.ArtboardHandle;
import app.p000rive.core.CommandQueue;
import app.p000rive.core.RebuggerWrapperKt;
import app.p000rive.core.RenderingDefaults;
import app.p000rive.core.RiveSurface;
import app.p000rive.core.StateMachineHandle;
import app.p000rive.core.ViewModelInstanceHandle;
import app.p000rive.semantics.AccessibilityKt;
import app.p000rive.semantics.SemanticAccessibilityFocusTransition;
import app.p000rive.semantics.SemanticActionType;
import app.p000rive.semantics.SemanticState;
import app.p000rive.semantics.SemanticTreeModel;
import com.comscore.streaming.ContentType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.a8d1;
import p.afh0;
import p.b0k;
import p.b7x;
import p.bb00;
import p.c9n;
import p.czo1;
import p.d9n;
import p.dm5;
import p.eg;
import p.err0;
import p.f4i1;
import p.fdg1;
import p.fkj0;
import p.fn31;
import p.gfh0;
import p.gvg;
import p.h311;
import p.hab0;
import p.hdn0;
import p.hfh0;
import p.hm5;
import p.hmb0;
import p.hzj;
import p.iac0;
import p.ifh0;
import p.iu30;
import p.jah;
import p.jfe0;
import p.jfv;
import p.k4p1;
import p.llj;
import p.lnm;
import p.m4c;
import p.mmr0;
import p.ngv;
import p.nim0;
import p.nko1;
import p.nku;
import p.o7h;
import p.oku;
import p.p5t0;
import p.p890;
import p.q5t0;
import p.q8r;
import p.qim0;
import p.qxd0;
import p.rih1;
import p.rmc0;
import p.rwq;
import p.smc0;
import p.sqg0;
import p.tgp1;
import p.tob1;
import p.u890;
import p.v8r;
import p.ven0;
import p.vr20;
import p.vu30;
import p.w8c0;
import p.x340;
import p.x8c0;
import p.xos0;
import p.y580;
import p.ytw0;
import p.z5c;
import p.z8p1;
import p.zob1;
import p.zr7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u001aI\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a£\u0001\u0010!\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2 \b\u0002\u0010 \u001a\u001a\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001e0\u001dj\u0002`\u001f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001cH\u0007¢\u0006\u0004\b!\u0010\"\u001a·\u0001\u0010!\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2 \b\u0002\u0010 \u001a\u001a\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001e0\u001dj\u0002`\u001f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0007¢\u0006\u0004\b!\u0010#\u001a¡\u0001\u0010$\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u001e\u0010 \u001a\u001a\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001e0\u001dj\u0002`\u001f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0003¢\u0006\u0004\b$\u0010%\u001a-\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b'\u0010(\u001a\u000f\u0010*\u001a\u00020)H\u0003¢\u0006\u0004\b*\u0010+\u001aW\u00102\u001a\u00020\u000e*\u00020\u000e2\n\u0010.\u001a\u00060,j\u0002`-2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001dH\u0002¢\u0006\u0004\b2\u00103\u001a\u0083\u0001\u00106\u001a\u00020\u000b2\n\u0010.\u001a\u00060,j\u0002`-2\u0006\u00104\u001a\u00020)2\b\u00105\u001a\u0004\u0018\u00010&2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u001e\u0010 \u001a\u001a\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001e0\u001dj\u0002`\u001f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001dH\u0003¢\u0006\u0004\b6\u00107\u001a«\u0001\u0010@\u001a\u00020\u000b2\n\u0010.\u001a\u00060,j\u0002`-2\u0006\u00105\u001a\u00020&2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00109\u001a\u0002082\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u00142\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d2\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010?\u001a\u00020\u0010H\u0003¢\u0006\u0004\b@\u0010A\u001a7\u0010B\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010?\u001a\u00020\u00102\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001dH\u0003¢\u0006\u0004\bB\u0010C\u001aO\u0010D\u001a\u00020\u000b2\n\u0010.\u001a\u00060,j\u0002`-2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001dH\u0003¢\u0006\u0004\bD\u0010E\u001a3\u0010F\u001a\u00020\u000b2\n\u0010.\u001a\u00060,j\u0002`-2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\bF\u0010G\u001a+\u0010H\u001a\u00020\u000b2\n\u0010.\u001a\u00060,j\u0002`-2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\bH\u0010I\u001aM\u0010J\u001a\u00020\u000b2\n\u0010.\u001a\u00060,j\u0002`-2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u0014H\u0003¢\u0006\u0004\bJ\u0010K\u001a\u009b\u0001\u0010L\u001a\u00020\u000b2\n\u0010.\u001a\u00060,j\u0002`-2\u0006\u00109\u001a\u0002082\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0010H\u0003¢\u0006\u0004\bL\u0010M\"\u0014\u0010N\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010O\"\u0014\u0010P\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bP\u0010O\"\u0014\u0010Q\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u0010O*\u0016\u0010R\"\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\u0012\u0004\u0012\u00020\u001e0\u001d¨\u0006V²\u0006\u000e\u0010<\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\f\u0010S\u001a\u00020\u00108\nX\u008a\u0084\u0002²\u0006$\u0010T\u001a\u001a\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001e0\u001dj\u0002`\u001f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c8\nX\u008a\u0084\u0002²\u0006\u000e\u0010U\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/rive/RiveFile;", "file", "Lapp/rive/Artboard;", "artboard", "Lapp/rive/StateMachine;", "stateMachine", "Lapp/rive/ViewModelInstance;", "viewModelInstance", "", "", "globalViewModelInstances", "Lp/rih1;", "validateRiveResourceArguments", "(Lapp/rive/RiveFile;Lapp/rive/Artboard;Lapp/rive/StateMachine;Lapp/rive/ViewModelInstance;Ljava/util/Map;)V", "Lp/qim0;", "modifier", "", "playing", "Lapp/rive/Fit;", "fit", "", "backgroundColor", "Lapp/rive/RivePointerInputMode;", "pointerInputMode", "Lapp/rive/RiveFrameRate;", "frameRate", "Lapp/rive/RiveSemanticsMode;", "semantics", "Lkotlin/Function1;", "Lkotlin/Function0;", "Landroid/graphics/Bitmap;", "Lapp/rive/GetBitmapFun;", "onBitmapAvailable", "Rive", "(Lapp/rive/RiveFile;Lp/qim0;ZLapp/rive/Artboard;Lapp/rive/StateMachine;Lapp/rive/ViewModelInstance;Lapp/rive/Fit;ILapp/rive/RivePointerInputMode;Lapp/rive/RiveFrameRate;Lapp/rive/RiveSemanticsMode;Lp/iu30;Lp/b0k;III)V", "(Lapp/rive/RiveFile;Lp/qim0;ZLapp/rive/Artboard;Lapp/rive/StateMachine;Lapp/rive/ViewModelInstance;Lapp/rive/Fit;ILapp/rive/RivePointerInputMode;Lapp/rive/RiveFrameRate;Lapp/rive/RiveSemanticsMode;Lp/iu30;Ljava/util/Map;Lp/b0k;III)V", "RiveImpl", "(Lapp/rive/RiveFile;Lp/qim0;ZLapp/rive/Artboard;Lapp/rive/StateMachine;Lapp/rive/ViewModelInstance;Lapp/rive/Fit;ILapp/rive/RivePointerInputMode;Lapp/rive/RiveFrameRate;Lapp/rive/RiveSemanticsMode;Lp/iu30;Ljava/util/Map;Lp/b0k;II)V", "Lapp/rive/ReadyResources;", "rememberReadyResources", "(Lapp/rive/RiveFile;Lapp/rive/Artboard;Lapp/rive/StateMachine;Lp/b0k;I)Lapp/rive/ReadyResources;", "Lapp/rive/RiveSurfaceState;", "rememberRiveSurfaceState", "(Lp/b0k;I)Lapp/rive/RiveSurfaceState;", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "riveWorker", "surfaceWidth", "surfaceHeight", "requestPausedFrame", "rivePointerInput", "(Lp/qim0;Lapp/rive/core/CommandQueue;Lapp/rive/StateMachine;Lapp/rive/Fit;IILapp/rive/RivePointerInputMode;Lkotlin/jvm/functions/Function0;)Lp/qim0;", "surfaceState", "resources", "RiveSurfaceHost", "(Lapp/rive/core/CommandQueue;Lapp/rive/RiveSurfaceState;Lapp/rive/ReadyResources;Lp/qim0;Lapp/rive/Fit;Lapp/rive/RivePointerInputMode;Lapp/rive/RiveFrameRate;ZLp/iu30;Lkotlin/jvm/functions/Function0;Lp/b0k;I)V", "Lp/iac0;", "lifecycleOwner", "Lapp/rive/core/RiveSurface;", "surface", "pausedFrameGeneration", "Lapp/rive/RiveTextureView;", "textureView", "semanticsEnabled", "RiveResourceEffects", "(Lapp/rive/core/CommandQueue;Lapp/rive/ReadyResources;Lapp/rive/ViewModelInstance;Ljava/util/Map;Lapp/rive/Fit;IZLapp/rive/RiveFrameRate;Lp/iac0;Lapp/rive/core/RiveSurface;IIILkotlin/jvm/functions/Function0;Lapp/rive/RiveTextureView;ZLp/b0k;II)V", "RiveSemanticsEffects", "(Lapp/rive/StateMachine;Lapp/rive/RiveTextureView;ZLkotlin/jvm/functions/Function0;Lp/b0k;I)V", "BindViewModelInstancesEffect", "(Lapp/rive/core/CommandQueue;Lapp/rive/StateMachine;Lapp/rive/ViewModelInstance;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lp/b0k;I)V", "UnsettleOnPresentationChangeEffect", "(Lapp/rive/core/CommandQueue;Lapp/rive/StateMachine;Lapp/rive/Fit;ILp/b0k;I)V", "UnsettleOnPlaybackStartEffect", "(Lapp/rive/core/CommandQueue;Lapp/rive/StateMachine;ZLp/b0k;I)V", "UpdateArtboardLayoutEffect", "(Lapp/rive/core/CommandQueue;Lapp/rive/Artboard;Lapp/rive/StateMachine;Lapp/rive/Fit;Lapp/rive/core/RiveSurface;IILp/b0k;I)V", "DrawRiveFramesEffect", "(Lapp/rive/core/CommandQueue;Lp/iac0;Lapp/rive/core/RiveSurface;Lapp/rive/Artboard;Lapp/rive/StateMachine;Lapp/rive/ViewModelInstance;Ljava/util/Map;Lapp/rive/Fit;IZLapp/rive/RiveFrameRate;IIIZLp/b0k;II)V", "GENERAL_TAG", "Ljava/lang/String;", "STATE_MACHINE_TAG", "DRAW_TAG", "GetBitmapFun", "currentPlaying", "currentOnBitmapAvailable", "bitmapCallbackSent", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RiveKt {
    private static final String DRAW_TAG = "Rive/UI/Draw";
    private static final String GENERAL_TAG = "Rive/UI";
    private static final String STATE_MACHINE_TAG = "Rive/UI/SM";

    /* JADX INFO: renamed from: app.rive.RiveKt$BindViewModelInstancesEffect$1, reason: invalid class name */
    @q8r(c = "app.rive.RiveKt$BindViewModelInstancesEffect$1", f = "Rive.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends a8d1 implements vu30 {
        final /* synthetic */ Map<String, ViewModelInstance> $globalViewModelInstances;
        final /* synthetic */ Function0 $requestPausedFrame;
        final /* synthetic */ StateMachine $stateMachine;
        final /* synthetic */ long $stateMachineHandle;
        final /* synthetic */ ViewModelInstance $viewModelInstance;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StateMachine stateMachine, ViewModelInstance viewModelInstance, Map<String, ViewModelInstance> map, Function0 function0, long j, lnm<? super AnonymousClass1> lnmVar) {
            super(2, lnmVar);
            this.$stateMachine = stateMachine;
            this.$viewModelInstance = viewModelInstance;
            this.$globalViewModelInstances = map;
            this.$requestPausedFrame = function0;
            this.$stateMachineHandle = j;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$stateMachine, this.$viewModelInstance, this.$globalViewModelInstances, this.$requestPausedFrame, this.$stateMachineHandle, lnmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
            return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            c9n c9nVar = (c9n) this.L$0;
            this.$stateMachine.bindViewModels$kotlin_release(this.$viewModelInstance, this.$globalViewModelInstances);
            ViewModelInstance viewModelInstance = this.$viewModelInstance;
            Map<String, ViewModelInstance> map = this.$globalViewModelInstances;
            smc0 smc0VarN = k4p1.n();
            if (viewModelInstance != null) {
                smc0VarN.add(viewModelInstance);
            }
            smc0VarN.addAll(map.values());
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
            StateMachine stateMachine = this.$stateMachine;
            Function0 function0 = this.$requestPausedFrame;
            long j = this.$stateMachineHandle;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fn31.T(c9nVar, null, 0, new RiveKt$BindViewModelInstancesEffect$1$1$1((ViewModelInstance) it.next(), stateMachine, function0, j, null), 3);
            }
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$RiveSemanticsEffects$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/oku;", "Lp/nku;", "invoke", "(Lp/oku;)Lp/nku;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C00391 extends hab0 implements iu30 {
        final /* synthetic */ boolean $semanticsEnabled;
        final /* synthetic */ StateMachine $stateMachine;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00391(boolean z, StateMachine stateMachine) {
            super(1);
            this.$semanticsEnabled = z;
            this.$stateMachine = stateMachine;
        }

        public final nku invoke(oku okuVar) {
            if (this.$semanticsEnabled) {
                this.$stateMachine.enableSemantics();
            }
            final boolean z = this.$semanticsEnabled;
            final StateMachine stateMachine = this.$stateMachine;
            return new nku() { // from class: app.rive.RiveKt$RiveSemanticsEffects$1$invoke$$inlined$onDispose$1
                public void dispose() {
                    if (z) {
                        stateMachine.clearSemanticFocusForLifecycleCleanup$kotlin_release();
                    }
                }
            };
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$RiveSemanticsEffects$3, reason: invalid class name */
    @q8r(c = "app.rive.RiveKt$RiveSemanticsEffects$3", f = "Rive.kt", l = {856}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass3 extends a8d1 implements vu30 {
        final /* synthetic */ SemanticTreeModel $semanticTree;
        final /* synthetic */ boolean $semanticsEnabled;
        final /* synthetic */ RiveTextureView $textureView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RiveTextureView riveTextureView, boolean z, SemanticTreeModel semanticTreeModel, lnm<? super AnonymousClass3> lnmVar) {
            super(2, lnmVar);
            this.$textureView = riveTextureView;
            this.$semanticsEnabled = z;
            this.$semanticTree = semanticTreeModel;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            return new AnonymousClass3(this.$textureView, this.$semanticsEnabled, this.$semanticTree, lnmVar);
        }

        public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
            return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
        }

        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                hm5.M(obj);
                final RiveTextureView riveTextureView = this.$textureView;
                rih1 rih1Var = rih1.a;
                if (riveTextureView == null || !this.$semanticsEnabled) {
                    return rih1Var;
                }
                zob1 versionFlow = this.$semanticTree.getVersionFlow();
                vr20 vr20Var = new vr20() { // from class: app.rive.RiveKt.RiveSemanticsEffects.3.1
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, lnm lnmVar) {
                        return emit(((Number) obj2).intValue(), (lnm<? super rih1>) lnmVar);
                    }

                    public final Object emit(int i2, lnm<? super rih1> lnmVar) {
                        riveTextureView.synchronizeSemantics();
                        return rih1.a;
                    }
                };
                this.label = 1;
                Object objCollect = versionFlow.collect(vr20Var, this);
                d9n d9nVar = d9n.a;
                if (objCollect == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            jah.d();
            return null;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$RiveSurfaceHost$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/oku;", "Lp/nku;", "invoke", "(Lp/oku;)Lp/nku;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C00411 extends hab0 implements iu30 {
        final /* synthetic */ RiveSurface $activeSurface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00411(RiveSurface riveSurface) {
            super(1);
            this.$activeSurface = riveSurface;
        }

        public final nku invoke(oku okuVar) {
            final RiveSurface riveSurface = this.$activeSurface;
            return riveSurface == null ? new nku() { // from class: app.rive.RiveKt$RiveSurfaceHost$1$invoke$$inlined$onDispose$1
                public void dispose() {
                }
            } : new nku() { // from class: app.rive.RiveKt$RiveSurfaceHost$1$invoke$$inlined$onDispose$2
                public void dispose() {
                    riveSurface.close();
                }
            };
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$RiveSurfaceHost$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/oku;", "Lp/nku;", "invoke", "(Lp/oku;)Lp/nku;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C00422 extends hab0 implements iu30 {
        final /* synthetic */ RiveSurfaceState $surfaceState;
        final /* synthetic */ RiveTextureView $textureView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00422(RiveSurfaceState riveSurfaceState, RiveTextureView riveTextureView) {
            super(1);
            this.$surfaceState = riveSurfaceState;
            this.$textureView = riveTextureView;
        }

        public final nku invoke(oku okuVar) {
            final RiveSurfaceState riveSurfaceState = this.$surfaceState;
            final RiveTextureView riveTextureView = this.$textureView;
            return new nku() { // from class: app.rive.RiveKt$RiveSurfaceHost$2$invoke$$inlined$onDispose$1
                public void dispose() {
                    if (riveSurfaceState.getTextureView() == riveTextureView) {
                        riveSurfaceState.setTextureView(null);
                    }
                }
            };
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$UnsettleOnPlaybackStartEffect$1, reason: invalid class name and case insensitive filesystem */
    @q8r(c = "app.rive.RiveKt$UnsettleOnPlaybackStartEffect$1", f = "Rive.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
    public static final class C00441 extends a8d1 implements vu30 {
        final /* synthetic */ boolean $playing;
        final /* synthetic */ StateMachine $stateMachine;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00441(boolean z, StateMachine stateMachine, lnm<? super C00441> lnmVar) {
            super(2, lnmVar);
            this.$playing = z;
            this.$stateMachine = stateMachine;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            return new C00441(this.$playing, this.$stateMachine, lnmVar);
        }

        public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
            return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            if (this.$playing) {
                this.$stateMachine.unsettle$kotlin_release();
            }
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$UnsettleOnPresentationChangeEffect$1, reason: invalid class name and case insensitive filesystem */
    @q8r(c = "app.rive.RiveKt$UnsettleOnPresentationChangeEffect$1", f = "Rive.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
    public static final class C00461 extends a8d1 implements vu30 {
        final /* synthetic */ StateMachine $stateMachine;
        final /* synthetic */ long $stateMachineHandle;
        int label;

        /* JADX INFO: renamed from: app.rive.RiveKt$UnsettleOnPresentationChangeEffect$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C00091 extends hab0 implements Function0 {
            final /* synthetic */ long $stateMachineHandle;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00091(long j) {
                super(0);
                this.$stateMachineHandle = j;
            }

            public final String invoke() {
                return f4i1.f("State machine ", StateMachineHandle.m439toStringimpl(this.$stateMachineHandle), " unsettled due to parameter change");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00461(StateMachine stateMachine, long j, lnm<? super C00461> lnmVar) {
            super(2, lnmVar);
            this.$stateMachine = stateMachine;
            this.$stateMachineHandle = j;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            return new C00461(this.$stateMachine, this.$stateMachineHandle, lnmVar);
        }

        public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
            return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            RiveLog.INSTANCE.getLogger().d(RiveKt.STATE_MACHINE_TAG, new C00091(this.$stateMachineHandle));
            this.$stateMachine.unsettle$kotlin_release();
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$UpdateArtboardLayoutEffect$1, reason: invalid class name and case insensitive filesystem */
    @q8r(c = "app.rive.RiveKt$UpdateArtboardLayoutEffect$1", f = "Rive.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
    public static final class C00481 extends a8d1 implements vu30 {
        final /* synthetic */ Artboard $artboard;
        final /* synthetic */ Fit $fit;
        final /* synthetic */ StateMachine $stateMachine;
        final /* synthetic */ RiveSurface $surface;
        final /* synthetic */ int $surfaceHeight;
        final /* synthetic */ int $surfaceWidth;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00481(RiveSurface riveSurface, Fit fit, StateMachine stateMachine, Artboard artboard, int i, int i2, lnm<? super C00481> lnmVar) {
            super(2, lnmVar);
            this.$surface = riveSurface;
            this.$fit = fit;
            this.$stateMachine = stateMachine;
            this.$artboard = artboard;
            this.$surfaceWidth = i;
            this.$surfaceHeight = i2;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            return new C00481(this.$surface, this.$fit, this.$stateMachine, this.$artboard, this.$surfaceWidth, this.$surfaceHeight, lnmVar);
        }

        public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
            return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            RiveSurface riveSurface = this.$surface;
            rih1 rih1Var = rih1.a;
            if (riveSurface == null) {
                return rih1Var;
            }
            Fit fit = this.$fit;
            boolean z = fit instanceof Fit.Layout;
            Artboard artboard = this.$artboard;
            if (z) {
                int i = this.$surfaceWidth;
                int i2 = this.$surfaceHeight;
                Trace.beginSection("Rive/Layout/ResizeArtboard");
                try {
                    RiveLog.INSTANCE.getLogger().d(RiveKt.GENERAL_TAG, new RiveKt$UpdateArtboardLayoutEffect$1$1$1(i, i2));
                    artboard.resizeArtboard(riveSurface, fit.getScaleFactor());
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                Trace.beginSection("Rive/Layout/ResetArtboardSize");
                try {
                    RiveLog.INSTANCE.getLogger().d(RiveKt.GENERAL_TAG, RiveKt$UpdateArtboardLayoutEffect$1$2$1.INSTANCE);
                    artboard.resetArtboardSize();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            this.$stateMachine.unsettle$kotlin_release();
            return rih1Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BindViewModelInstancesEffect(CommandQueue commandQueue, StateMachine stateMachine, ViewModelInstance viewModelInstance, Map<String, ViewModelInstance> map, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2111108358);
        qxd0.u(new Object[]{commandQueue, stateMachine, viewModelInstance, map}, new AnonymousClass1(stateMachine, viewModelInstance, map, function0, stateMachine.getStateMachineHandle(), null), x340Var);
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new AnonymousClass2(commandQueue, stateMachine, viewModelInstance, map, function0, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DrawRiveFramesEffect(CommandQueue commandQueue, iac0 iac0Var, RiveSurface riveSurface, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Map<String, ViewModelInstance> map, Fit fit, int i, boolean z, RiveFrameRate riveFrameRate, int i2, int i3, int i4, boolean z2, b0k b0kVar, int i5, int i6) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(623382548);
        qxd0.u(new Object[]{commandQueue, iac0Var, riveSurface, artboard, stateMachine, viewModelInstance, map, fit, Integer.valueOf(i), Boolean.valueOf(z), riveFrameRate, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(z2)}, new C00321(riveSurface, z, iac0Var, z2, i3, i4, stateMachine, fit, commandQueue, artboard.getArtboardHandle(), stateMachine.getStateMachineHandle(), i, riveFrameRate, null), x340Var);
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new C00332(commandQueue, iac0Var, riveSurface, artboard, stateMachine, viewModelInstance, map, fit, i, z, riveFrameRate, i2, i3, i4, z2, i5, i6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:102:0x012c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0136  */
    /* JADX WARN: Code duplicated, block: B:105:0x0139  */
    /* JADX WARN: Code duplicated, block: B:109:0x0145  */
    /* JADX WARN: Code duplicated, block: B:117:0x0172  */
    /* JADX WARN: Code duplicated, block: B:119:0x017c  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:137:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:138:0x01be  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:150:0x01db  */
    /* JADX WARN: Code duplicated, block: B:152:0x01df  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:160:0x0208  */
    /* JADX WARN: Code duplicated, block: B:164:0x0259  */
    /* JADX WARN: Code duplicated, block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x0121  */
    public static final void Rive(RiveFile riveFile, qim0 qim0Var, boolean z, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RivePointerInputMode rivePointerInputMode, RiveFrameRate riveFrameRate, RiveSemanticsMode riveSemanticsMode, iu30 iu30Var, b0k b0kVar, int i2, int i3, int i4) {
        int i5;
        qim0 qim0Var2;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        Fit fitDefaultFit;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        qim0 qim0Var3;
        boolean z3;
        Artboard artboard2;
        StateMachine stateMachine2;
        ViewModelInstance viewModelInstance2;
        int i23;
        RivePointerInputMode rivePointerInputMode2;
        RiveFrameRate riveFrameRate2;
        RiveSemanticsMode riveSemanticsMode2;
        iu30 iu30Var2;
        Artboard artboard3;
        StateMachine stateMachine3;
        Fit fit2;
        boolean z4;
        ViewModelInstance viewModelInstance3;
        qim0 qim0Var4;
        boolean z5;
        Artboard artboard4;
        StateMachine stateMachine4;
        ViewModelInstance viewModelInstance4;
        Fit fit3;
        int i24;
        RivePointerInputMode rivePointerInputMode3;
        RiveFrameRate riveFrameRate3;
        RiveSemanticsMode riveSemanticsMode3;
        iu30 iu30Var3;
        h311 h311VarV;
        int i25;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-955262878);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (x340Var.g(riveFile) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i26 = i4 & 2;
        if (i26 == 0) {
            if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                qim0Var2 = qim0Var;
                i5 |= x340Var.g(qim0Var2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i2 & 896) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i7 = SemanticState.Hidden;
                    } else {
                        i7 = SemanticState.Focused;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                if (i8 != 0) {
                    i5 |= SemanticState.ReadOnly;
                }
                i9 = i4 & 16;
                if (i9 != 0) {
                    i5 |= SemanticState.Multiline;
                }
                i10 = i4 & 32;
                if (i10 != 0) {
                    i5 |= 65536;
                }
                if ((i2 & 3670016) == 0) {
                    fitDefaultFit = fit;
                    if ((i4 & 64) == 0 || !x340Var.g(fitDefaultFit)) {
                        i25 = 524288;
                    } else {
                        i25 = 1048576;
                    }
                    i5 |= i25;
                } else {
                    fitDefaultFit = fit;
                }
                i11 = i4 & SemanticState.Focused;
                if (i11 != 0) {
                    i5 |= 12582912;
                    i12 = i;
                } else {
                    i12 = i;
                    if ((i2 & 29360128) == 0) {
                        if (x340Var.e(i12)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i5 |= i13;
                    }
                }
                i14 = i4 & SemanticState.Hidden;
                if (i14 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    if (x340Var.g(rivePointerInputMode)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i5 |= i15;
                }
                i16 = i4 & 512;
                if (i16 != 0) {
                    if ((i2 & 1879048192) == 0) {
                        if (x340Var.g(riveFrameRate)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i5 |= i17;
                    }
                    i18 = i4 & SemanticState.ReadOnly;
                    if (i18 != 0) {
                        i19 = i3 | 6;
                    } else if ((i3 & 14) == 0) {
                        if (x340Var.g(riveSemanticsMode)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        i19 = i3 | i20;
                    } else {
                        i19 = i3;
                    }
                    i21 = i4 & SemanticState.Modal;
                    if (i21 != 0) {
                        if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                            if (x340Var.i(iu30Var)) {
                                i22 = 32;
                            } else {
                                i22 = 16;
                            }
                            i19 |= i22;
                        }
                        if ((i4 & 56) != 56 && (1533916891 & i5) == 306783378 && (i19 & 91) == 18 && x340Var.H()) {
                            x340Var.b0();
                            artboard4 = artboard;
                            stateMachine4 = stateMachine;
                            rivePointerInputMode3 = rivePointerInputMode;
                            riveSemanticsMode3 = riveSemanticsMode;
                            iu30Var3 = iu30Var;
                            fit3 = fitDefaultFit;
                            qim0Var4 = qim0Var2;
                            z5 = z2;
                            riveFrameRate3 = riveFrameRate;
                            i24 = i12;
                            viewModelInstance4 = viewModelInstance;
                        } else {
                            x340Var.d0();
                            if ((i2 & 1) != 0 || x340Var.E()) {
                                if (i26 != 0) {
                                    qim0Var3 = nim0.a;
                                } else {
                                    qim0Var3 = qim0Var2;
                                }
                                if (i6 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = z2;
                                }
                                if (i8 != 0) {
                                    artboard2 = null;
                                } else {
                                    artboard2 = artboard;
                                }
                                if (i9 != 0) {
                                    stateMachine2 = null;
                                } else {
                                    stateMachine2 = stateMachine;
                                }
                                if (i10 != 0) {
                                    viewModelInstance2 = null;
                                } else {
                                    viewModelInstance2 = viewModelInstance;
                                }
                                if ((i4 & 64) != 0) {
                                    fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                                    i5 &= -3670017;
                                }
                                if (i11 != 0) {
                                    i23 = 0;
                                } else {
                                    i23 = i12;
                                }
                                if (i14 != 0) {
                                    rivePointerInputMode2 = RivePointerInputMode.Consume;
                                } else {
                                    rivePointerInputMode2 = rivePointerInputMode;
                                }
                                if (i16 != 0) {
                                    riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                                } else {
                                    riveFrameRate2 = riveFrameRate;
                                }
                                if (i18 != 0) {
                                    riveSemanticsMode2 = RiveSemanticsMode.Off;
                                } else {
                                    riveSemanticsMode2 = riveSemanticsMode;
                                }
                                if (i21 != 0) {
                                    iu30Var2 = null;
                                } else {
                                    iu30Var2 = iu30Var;
                                }
                                artboard3 = artboard2;
                                stateMachine3 = stateMachine2;
                                fit2 = fitDefaultFit;
                                z4 = z3;
                                viewModelInstance3 = viewModelInstance2;
                            } else {
                                x340Var.b0();
                                if ((i4 & 64) != 0) {
                                    i5 &= -3670017;
                                }
                                artboard3 = artboard;
                                stateMachine3 = stateMachine;
                                rivePointerInputMode2 = rivePointerInputMode;
                                riveFrameRate2 = riveFrameRate;
                                riveSemanticsMode2 = riveSemanticsMode;
                                iu30Var2 = iu30Var;
                                i23 = i12;
                                qim0Var3 = qim0Var2;
                                fit2 = fitDefaultFit;
                                z4 = z2;
                                viewModelInstance3 = viewModelInstance;
                            }
                            x340Var.s();
                            int i27 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                            int i28 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                            qim0 qim0Var5 = qim0Var3;
                            RiveImpl(riveFile, qim0Var5, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i27, i28);
                            qim0Var4 = qim0Var5;
                            z5 = z4;
                            artboard4 = artboard3;
                            stateMachine4 = stateMachine3;
                            viewModelInstance4 = viewModelInstance3;
                            fit3 = fit2;
                            i24 = i23;
                            rivePointerInputMode3 = rivePointerInputMode2;
                            riveFrameRate3 = riveFrameRate2;
                            riveSemanticsMode3 = riveSemanticsMode2;
                            iu30Var3 = iu30Var2;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new C00341(riveFile, qim0Var4, z5, artboard4, stateMachine4, viewModelInstance4, fit3, i24, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var3, i2, i3, i4);
                        }
                    }
                    i19 |= 48;
                    if ((i4 & 56) != 56) {
                        x340Var.d0();
                        if ((i2 & 1) != 0) {
                            if (i26 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                artboard2 = null;
                            } else {
                                artboard2 = artboard;
                            }
                            if (i9 != 0) {
                                stateMachine2 = null;
                            } else {
                                stateMachine2 = stateMachine;
                            }
                            if (i10 != 0) {
                                viewModelInstance2 = null;
                            } else {
                                viewModelInstance2 = viewModelInstance;
                            }
                            if ((i4 & 64) != 0) {
                                fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                                i5 &= -3670017;
                            }
                            if (i11 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i12;
                            }
                            if (i14 != 0) {
                                rivePointerInputMode2 = RivePointerInputMode.Consume;
                            } else {
                                rivePointerInputMode2 = rivePointerInputMode;
                            }
                            if (i16 != 0) {
                                riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                            } else {
                                riveFrameRate2 = riveFrameRate;
                            }
                            if (i18 != 0) {
                                riveSemanticsMode2 = RiveSemanticsMode.Off;
                            } else {
                                riveSemanticsMode2 = riveSemanticsMode;
                            }
                            if (i21 != 0) {
                                iu30Var2 = null;
                            } else {
                                iu30Var2 = iu30Var;
                            }
                            artboard3 = artboard2;
                            stateMachine3 = stateMachine2;
                            fit2 = fitDefaultFit;
                            z4 = z3;
                            viewModelInstance3 = viewModelInstance2;
                        } else {
                            if (i26 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                artboard2 = null;
                            } else {
                                artboard2 = artboard;
                            }
                            if (i9 != 0) {
                                stateMachine2 = null;
                            } else {
                                stateMachine2 = stateMachine;
                            }
                            if (i10 != 0) {
                                viewModelInstance2 = null;
                            } else {
                                viewModelInstance2 = viewModelInstance;
                            }
                            if ((i4 & 64) != 0) {
                                fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                                i5 &= -3670017;
                            }
                            if (i11 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i12;
                            }
                            if (i14 != 0) {
                                rivePointerInputMode2 = RivePointerInputMode.Consume;
                            } else {
                                rivePointerInputMode2 = rivePointerInputMode;
                            }
                            if (i16 != 0) {
                                riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                            } else {
                                riveFrameRate2 = riveFrameRate;
                            }
                            if (i18 != 0) {
                                riveSemanticsMode2 = RiveSemanticsMode.Off;
                            } else {
                                riveSemanticsMode2 = riveSemanticsMode;
                            }
                            if (i21 != 0) {
                                iu30Var2 = null;
                            } else {
                                iu30Var2 = iu30Var;
                            }
                            artboard3 = artboard2;
                            stateMachine3 = stateMachine2;
                            fit2 = fitDefaultFit;
                            z4 = z3;
                            viewModelInstance3 = viewModelInstance2;
                        }
                        x340Var.s();
                        int i29 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                        int i210 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                        qim0 qim0Var6 = qim0Var3;
                        RiveImpl(riveFile, qim0Var6, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i29, i210);
                        qim0Var4 = qim0Var6;
                        z5 = z4;
                        artboard4 = artboard3;
                        stateMachine4 = stateMachine3;
                        viewModelInstance4 = viewModelInstance3;
                        fit3 = fit2;
                        i24 = i23;
                        rivePointerInputMode3 = rivePointerInputMode2;
                        riveFrameRate3 = riveFrameRate2;
                        riveSemanticsMode3 = riveSemanticsMode2;
                        iu30Var3 = iu30Var2;
                    } else {
                        x340Var.d0();
                        if ((i2 & 1) != 0) {
                            if (i26 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                artboard2 = null;
                            } else {
                                artboard2 = artboard;
                            }
                            if (i9 != 0) {
                                stateMachine2 = null;
                            } else {
                                stateMachine2 = stateMachine;
                            }
                            if (i10 != 0) {
                                viewModelInstance2 = null;
                            } else {
                                viewModelInstance2 = viewModelInstance;
                            }
                            if ((i4 & 64) != 0) {
                                fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                                i5 &= -3670017;
                            }
                            if (i11 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i12;
                            }
                            if (i14 != 0) {
                                rivePointerInputMode2 = RivePointerInputMode.Consume;
                            } else {
                                rivePointerInputMode2 = rivePointerInputMode;
                            }
                            if (i16 != 0) {
                                riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                            } else {
                                riveFrameRate2 = riveFrameRate;
                            }
                            if (i18 != 0) {
                                riveSemanticsMode2 = RiveSemanticsMode.Off;
                            } else {
                                riveSemanticsMode2 = riveSemanticsMode;
                            }
                            if (i21 != 0) {
                                iu30Var2 = null;
                            } else {
                                iu30Var2 = iu30Var;
                            }
                            artboard3 = artboard2;
                            stateMachine3 = stateMachine2;
                            fit2 = fitDefaultFit;
                            z4 = z3;
                            viewModelInstance3 = viewModelInstance2;
                        } else {
                            if (i26 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                artboard2 = null;
                            } else {
                                artboard2 = artboard;
                            }
                            if (i9 != 0) {
                                stateMachine2 = null;
                            } else {
                                stateMachine2 = stateMachine;
                            }
                            if (i10 != 0) {
                                viewModelInstance2 = null;
                            } else {
                                viewModelInstance2 = viewModelInstance;
                            }
                            if ((i4 & 64) != 0) {
                                fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                                i5 &= -3670017;
                            }
                            if (i11 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i12;
                            }
                            if (i14 != 0) {
                                rivePointerInputMode2 = RivePointerInputMode.Consume;
                            } else {
                                rivePointerInputMode2 = rivePointerInputMode;
                            }
                            if (i16 != 0) {
                                riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                            } else {
                                riveFrameRate2 = riveFrameRate;
                            }
                            if (i18 != 0) {
                                riveSemanticsMode2 = RiveSemanticsMode.Off;
                            } else {
                                riveSemanticsMode2 = riveSemanticsMode;
                            }
                            if (i21 != 0) {
                                iu30Var2 = null;
                            } else {
                                iu30Var2 = iu30Var;
                            }
                            artboard3 = artboard2;
                            stateMachine3 = stateMachine2;
                            fit2 = fitDefaultFit;
                            z4 = z3;
                            viewModelInstance3 = viewModelInstance2;
                        }
                        x340Var.s();
                        int i211 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                        int i212 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                        qim0 qim0Var7 = qim0Var3;
                        RiveImpl(riveFile, qim0Var7, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i211, i212);
                        qim0Var4 = qim0Var7;
                        z5 = z4;
                        artboard4 = artboard3;
                        stateMachine4 = stateMachine3;
                        viewModelInstance4 = viewModelInstance3;
                        fit3 = fit2;
                        i24 = i23;
                        rivePointerInputMode3 = rivePointerInputMode2;
                        riveFrameRate3 = riveFrameRate2;
                        riveSemanticsMode3 = riveSemanticsMode2;
                        iu30Var3 = iu30Var2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new C00341(riveFile, qim0Var4, z5, artboard4, stateMachine4, viewModelInstance4, fit3, i24, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var3, i2, i3, i4);
                    }
                }
                i5 |= 805306368;
                i18 = i4 & SemanticState.ReadOnly;
                if (i18 != 0) {
                    i19 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    if (x340Var.g(riveSemanticsMode)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i19 = i3 | i20;
                } else {
                    i19 = i3;
                }
                i21 = i4 & SemanticState.Modal;
                if (i21 != 0) {
                    if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                        if (x340Var.i(iu30Var)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i19 |= i22;
                    }
                    if ((i4 & 56) != 56) {
                        x340Var.d0();
                        if ((i2 & 1) != 0) {
                            if (i26 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                artboard2 = null;
                            } else {
                                artboard2 = artboard;
                            }
                            if (i9 != 0) {
                                stateMachine2 = null;
                            } else {
                                stateMachine2 = stateMachine;
                            }
                            if (i10 != 0) {
                                viewModelInstance2 = null;
                            } else {
                                viewModelInstance2 = viewModelInstance;
                            }
                            if ((i4 & 64) != 0) {
                                fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                                i5 &= -3670017;
                            }
                            if (i11 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i12;
                            }
                            if (i14 != 0) {
                                rivePointerInputMode2 = RivePointerInputMode.Consume;
                            } else {
                                rivePointerInputMode2 = rivePointerInputMode;
                            }
                            if (i16 != 0) {
                                riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                            } else {
                                riveFrameRate2 = riveFrameRate;
                            }
                            if (i18 != 0) {
                                riveSemanticsMode2 = RiveSemanticsMode.Off;
                            } else {
                                riveSemanticsMode2 = riveSemanticsMode;
                            }
                            if (i21 != 0) {
                                iu30Var2 = null;
                            } else {
                                iu30Var2 = iu30Var;
                            }
                            artboard3 = artboard2;
                            stateMachine3 = stateMachine2;
                            fit2 = fitDefaultFit;
                            z4 = z3;
                            viewModelInstance3 = viewModelInstance2;
                        } else {
                            if (i26 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                artboard2 = null;
                            } else {
                                artboard2 = artboard;
                            }
                            if (i9 != 0) {
                                stateMachine2 = null;
                            } else {
                                stateMachine2 = stateMachine;
                            }
                            if (i10 != 0) {
                                viewModelInstance2 = null;
                            } else {
                                viewModelInstance2 = viewModelInstance;
                            }
                            if ((i4 & 64) != 0) {
                                fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                                i5 &= -3670017;
                            }
                            if (i11 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i12;
                            }
                            if (i14 != 0) {
                                rivePointerInputMode2 = RivePointerInputMode.Consume;
                            } else {
                                rivePointerInputMode2 = rivePointerInputMode;
                            }
                            if (i16 != 0) {
                                riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                            } else {
                                riveFrameRate2 = riveFrameRate;
                            }
                            if (i18 != 0) {
                                riveSemanticsMode2 = RiveSemanticsMode.Off;
                            } else {
                                riveSemanticsMode2 = riveSemanticsMode;
                            }
                            if (i21 != 0) {
                                iu30Var2 = null;
                            } else {
                                iu30Var2 = iu30Var;
                            }
                            artboard3 = artboard2;
                            stateMachine3 = stateMachine2;
                            fit2 = fitDefaultFit;
                            z4 = z3;
                            viewModelInstance3 = viewModelInstance2;
                        }
                        x340Var.s();
                        int i213 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                        int i214 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                        qim0 qim0Var8 = qim0Var3;
                        RiveImpl(riveFile, qim0Var8, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i213, i214);
                        qim0Var4 = qim0Var8;
                        z5 = z4;
                        artboard4 = artboard3;
                        stateMachine4 = stateMachine3;
                        viewModelInstance4 = viewModelInstance3;
                        fit3 = fit2;
                        i24 = i23;
                        rivePointerInputMode3 = rivePointerInputMode2;
                        riveFrameRate3 = riveFrameRate2;
                        riveSemanticsMode3 = riveSemanticsMode2;
                        iu30Var3 = iu30Var2;
                    } else {
                        x340Var.d0();
                        if ((i2 & 1) != 0) {
                            if (i26 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                artboard2 = null;
                            } else {
                                artboard2 = artboard;
                            }
                            if (i9 != 0) {
                                stateMachine2 = null;
                            } else {
                                stateMachine2 = stateMachine;
                            }
                            if (i10 != 0) {
                                viewModelInstance2 = null;
                            } else {
                                viewModelInstance2 = viewModelInstance;
                            }
                            if ((i4 & 64) != 0) {
                                fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                                i5 &= -3670017;
                            }
                            if (i11 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i12;
                            }
                            if (i14 != 0) {
                                rivePointerInputMode2 = RivePointerInputMode.Consume;
                            } else {
                                rivePointerInputMode2 = rivePointerInputMode;
                            }
                            if (i16 != 0) {
                                riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                            } else {
                                riveFrameRate2 = riveFrameRate;
                            }
                            if (i18 != 0) {
                                riveSemanticsMode2 = RiveSemanticsMode.Off;
                            } else {
                                riveSemanticsMode2 = riveSemanticsMode;
                            }
                            if (i21 != 0) {
                                iu30Var2 = null;
                            } else {
                                iu30Var2 = iu30Var;
                            }
                            artboard3 = artboard2;
                            stateMachine3 = stateMachine2;
                            fit2 = fitDefaultFit;
                            z4 = z3;
                            viewModelInstance3 = viewModelInstance2;
                        } else {
                            if (i26 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                artboard2 = null;
                            } else {
                                artboard2 = artboard;
                            }
                            if (i9 != 0) {
                                stateMachine2 = null;
                            } else {
                                stateMachine2 = stateMachine;
                            }
                            if (i10 != 0) {
                                viewModelInstance2 = null;
                            } else {
                                viewModelInstance2 = viewModelInstance;
                            }
                            if ((i4 & 64) != 0) {
                                fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                                i5 &= -3670017;
                            }
                            if (i11 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i12;
                            }
                            if (i14 != 0) {
                                rivePointerInputMode2 = RivePointerInputMode.Consume;
                            } else {
                                rivePointerInputMode2 = rivePointerInputMode;
                            }
                            if (i16 != 0) {
                                riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                            } else {
                                riveFrameRate2 = riveFrameRate;
                            }
                            if (i18 != 0) {
                                riveSemanticsMode2 = RiveSemanticsMode.Off;
                            } else {
                                riveSemanticsMode2 = riveSemanticsMode;
                            }
                            if (i21 != 0) {
                                iu30Var2 = null;
                            } else {
                                iu30Var2 = iu30Var;
                            }
                            artboard3 = artboard2;
                            stateMachine3 = stateMachine2;
                            fit2 = fitDefaultFit;
                            z4 = z3;
                            viewModelInstance3 = viewModelInstance2;
                        }
                        x340Var.s();
                        int i215 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                        int i216 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                        qim0 qim0Var9 = qim0Var3;
                        RiveImpl(riveFile, qim0Var9, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i215, i216);
                        qim0Var4 = qim0Var9;
                        z5 = z4;
                        artboard4 = artboard3;
                        stateMachine4 = stateMachine3;
                        viewModelInstance4 = viewModelInstance3;
                        fit3 = fit2;
                        i24 = i23;
                        rivePointerInputMode3 = rivePointerInputMode2;
                        riveFrameRate3 = riveFrameRate2;
                        riveSemanticsMode3 = riveSemanticsMode2;
                        iu30Var3 = iu30Var2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new C00341(riveFile, qim0Var4, z5, artboard4, stateMachine4, viewModelInstance4, fit3, i24, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var3, i2, i3, i4);
                    }
                }
                i19 |= 48;
                if ((i4 & 56) != 56) {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    } else {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    }
                    x340Var.s();
                    int i217 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                    int i218 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                    qim0 qim0Var10 = qim0Var3;
                    RiveImpl(riveFile, qim0Var10, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i217, i218);
                    qim0Var4 = qim0Var10;
                    z5 = z4;
                    artboard4 = artboard3;
                    stateMachine4 = stateMachine3;
                    viewModelInstance4 = viewModelInstance3;
                    fit3 = fit2;
                    i24 = i23;
                    rivePointerInputMode3 = rivePointerInputMode2;
                    riveFrameRate3 = riveFrameRate2;
                    riveSemanticsMode3 = riveSemanticsMode2;
                    iu30Var3 = iu30Var2;
                } else {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    } else {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    }
                    x340Var.s();
                    int i219 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                    int i2110 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                    qim0 qim0Var11 = qim0Var3;
                    RiveImpl(riveFile, qim0Var11, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i219, i2110);
                    qim0Var4 = qim0Var11;
                    z5 = z4;
                    artboard4 = artboard3;
                    stateMachine4 = stateMachine3;
                    viewModelInstance4 = viewModelInstance3;
                    fit3 = fit2;
                    i24 = i23;
                    rivePointerInputMode3 = rivePointerInputMode2;
                    riveFrameRate3 = riveFrameRate2;
                    riveSemanticsMode3 = riveSemanticsMode2;
                    iu30Var3 = iu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new C00341(riveFile, qim0Var4, z5, artboard4, stateMachine4, viewModelInstance4, fit3, i24, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var3, i2, i3, i4);
                }
            }
            i5 |= 384;
            z2 = z;
            i8 = i4 & 8;
            if (i8 != 0) {
                i5 |= SemanticState.ReadOnly;
            }
            i9 = i4 & 16;
            if (i9 != 0) {
                i5 |= SemanticState.Multiline;
            }
            i10 = i4 & 32;
            if (i10 != 0) {
                i5 |= 65536;
            }
            if ((i2 & 3670016) == 0) {
                fitDefaultFit = fit;
                if ((i4 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i5 |= i25;
            } else {
                fitDefaultFit = fit;
            }
            i11 = i4 & SemanticState.Focused;
            if (i11 != 0) {
                i5 |= 12582912;
                i12 = i;
            } else {
                i12 = i;
                if ((i2 & 29360128) == 0) {
                    if (x340Var.e(i12)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i5 |= i13;
                }
            }
            i14 = i4 & SemanticState.Hidden;
            if (i14 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                if (x340Var.g(rivePointerInputMode)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i5 |= i15;
            }
            i16 = i4 & 512;
            if (i16 != 0) {
                if ((i2 & 1879048192) == 0) {
                    if (x340Var.g(riveFrameRate)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i5 |= i17;
                }
                i18 = i4 & SemanticState.ReadOnly;
                if (i18 != 0) {
                    i19 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    if (x340Var.g(riveSemanticsMode)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i19 = i3 | i20;
                } else {
                    i19 = i3;
                }
                i21 = i4 & SemanticState.Modal;
                if (i21 != 0) {
                    if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                        if (x340Var.i(iu30Var)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i19 |= i22;
                    }
                    if ((i4 & 56) != 56) {
                        x340Var.d0();
                        if ((i2 & 1) != 0) {
                            if (i26 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                artboard2 = null;
                            } else {
                                artboard2 = artboard;
                            }
                            if (i9 != 0) {
                                stateMachine2 = null;
                            } else {
                                stateMachine2 = stateMachine;
                            }
                            if (i10 != 0) {
                                viewModelInstance2 = null;
                            } else {
                                viewModelInstance2 = viewModelInstance;
                            }
                            if ((i4 & 64) != 0) {
                                fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                                i5 &= -3670017;
                            }
                            if (i11 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i12;
                            }
                            if (i14 != 0) {
                                rivePointerInputMode2 = RivePointerInputMode.Consume;
                            } else {
                                rivePointerInputMode2 = rivePointerInputMode;
                            }
                            if (i16 != 0) {
                                riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                            } else {
                                riveFrameRate2 = riveFrameRate;
                            }
                            if (i18 != 0) {
                                riveSemanticsMode2 = RiveSemanticsMode.Off;
                            } else {
                                riveSemanticsMode2 = riveSemanticsMode;
                            }
                            if (i21 != 0) {
                                iu30Var2 = null;
                            } else {
                                iu30Var2 = iu30Var;
                            }
                            artboard3 = artboard2;
                            stateMachine3 = stateMachine2;
                            fit2 = fitDefaultFit;
                            z4 = z3;
                            viewModelInstance3 = viewModelInstance2;
                        } else {
                            if (i26 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                artboard2 = null;
                            } else {
                                artboard2 = artboard;
                            }
                            if (i9 != 0) {
                                stateMachine2 = null;
                            } else {
                                stateMachine2 = stateMachine;
                            }
                            if (i10 != 0) {
                                viewModelInstance2 = null;
                            } else {
                                viewModelInstance2 = viewModelInstance;
                            }
                            if ((i4 & 64) != 0) {
                                fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                                i5 &= -3670017;
                            }
                            if (i11 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i12;
                            }
                            if (i14 != 0) {
                                rivePointerInputMode2 = RivePointerInputMode.Consume;
                            } else {
                                rivePointerInputMode2 = rivePointerInputMode;
                            }
                            if (i16 != 0) {
                                riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                            } else {
                                riveFrameRate2 = riveFrameRate;
                            }
                            if (i18 != 0) {
                                riveSemanticsMode2 = RiveSemanticsMode.Off;
                            } else {
                                riveSemanticsMode2 = riveSemanticsMode;
                            }
                            if (i21 != 0) {
                                iu30Var2 = null;
                            } else {
                                iu30Var2 = iu30Var;
                            }
                            artboard3 = artboard2;
                            stateMachine3 = stateMachine2;
                            fit2 = fitDefaultFit;
                            z4 = z3;
                            viewModelInstance3 = viewModelInstance2;
                        }
                        x340Var.s();
                        int i2111 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                        int i2112 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                        qim0 qim0Var12 = qim0Var3;
                        RiveImpl(riveFile, qim0Var12, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i2111, i2112);
                        qim0Var4 = qim0Var12;
                        z5 = z4;
                        artboard4 = artboard3;
                        stateMachine4 = stateMachine3;
                        viewModelInstance4 = viewModelInstance3;
                        fit3 = fit2;
                        i24 = i23;
                        rivePointerInputMode3 = rivePointerInputMode2;
                        riveFrameRate3 = riveFrameRate2;
                        riveSemanticsMode3 = riveSemanticsMode2;
                        iu30Var3 = iu30Var2;
                    } else {
                        x340Var.d0();
                        if ((i2 & 1) != 0) {
                            if (i26 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                artboard2 = null;
                            } else {
                                artboard2 = artboard;
                            }
                            if (i9 != 0) {
                                stateMachine2 = null;
                            } else {
                                stateMachine2 = stateMachine;
                            }
                            if (i10 != 0) {
                                viewModelInstance2 = null;
                            } else {
                                viewModelInstance2 = viewModelInstance;
                            }
                            if ((i4 & 64) != 0) {
                                fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                                i5 &= -3670017;
                            }
                            if (i11 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i12;
                            }
                            if (i14 != 0) {
                                rivePointerInputMode2 = RivePointerInputMode.Consume;
                            } else {
                                rivePointerInputMode2 = rivePointerInputMode;
                            }
                            if (i16 != 0) {
                                riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                            } else {
                                riveFrameRate2 = riveFrameRate;
                            }
                            if (i18 != 0) {
                                riveSemanticsMode2 = RiveSemanticsMode.Off;
                            } else {
                                riveSemanticsMode2 = riveSemanticsMode;
                            }
                            if (i21 != 0) {
                                iu30Var2 = null;
                            } else {
                                iu30Var2 = iu30Var;
                            }
                            artboard3 = artboard2;
                            stateMachine3 = stateMachine2;
                            fit2 = fitDefaultFit;
                            z4 = z3;
                            viewModelInstance3 = viewModelInstance2;
                        } else {
                            if (i26 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                artboard2 = null;
                            } else {
                                artboard2 = artboard;
                            }
                            if (i9 != 0) {
                                stateMachine2 = null;
                            } else {
                                stateMachine2 = stateMachine;
                            }
                            if (i10 != 0) {
                                viewModelInstance2 = null;
                            } else {
                                viewModelInstance2 = viewModelInstance;
                            }
                            if ((i4 & 64) != 0) {
                                fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                                i5 &= -3670017;
                            }
                            if (i11 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i12;
                            }
                            if (i14 != 0) {
                                rivePointerInputMode2 = RivePointerInputMode.Consume;
                            } else {
                                rivePointerInputMode2 = rivePointerInputMode;
                            }
                            if (i16 != 0) {
                                riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                            } else {
                                riveFrameRate2 = riveFrameRate;
                            }
                            if (i18 != 0) {
                                riveSemanticsMode2 = RiveSemanticsMode.Off;
                            } else {
                                riveSemanticsMode2 = riveSemanticsMode;
                            }
                            if (i21 != 0) {
                                iu30Var2 = null;
                            } else {
                                iu30Var2 = iu30Var;
                            }
                            artboard3 = artboard2;
                            stateMachine3 = stateMachine2;
                            fit2 = fitDefaultFit;
                            z4 = z3;
                            viewModelInstance3 = viewModelInstance2;
                        }
                        x340Var.s();
                        int i2113 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                        int i2114 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                        qim0 qim0Var13 = qim0Var3;
                        RiveImpl(riveFile, qim0Var13, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i2113, i2114);
                        qim0Var4 = qim0Var13;
                        z5 = z4;
                        artboard4 = artboard3;
                        stateMachine4 = stateMachine3;
                        viewModelInstance4 = viewModelInstance3;
                        fit3 = fit2;
                        i24 = i23;
                        rivePointerInputMode3 = rivePointerInputMode2;
                        riveFrameRate3 = riveFrameRate2;
                        riveSemanticsMode3 = riveSemanticsMode2;
                        iu30Var3 = iu30Var2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new C00341(riveFile, qim0Var4, z5, artboard4, stateMachine4, viewModelInstance4, fit3, i24, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var3, i2, i3, i4);
                    }
                }
                i19 |= 48;
                if ((i4 & 56) != 56) {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    } else {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    }
                    x340Var.s();
                    int i2115 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                    int i2116 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                    qim0 qim0Var14 = qim0Var3;
                    RiveImpl(riveFile, qim0Var14, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i2115, i2116);
                    qim0Var4 = qim0Var14;
                    z5 = z4;
                    artboard4 = artboard3;
                    stateMachine4 = stateMachine3;
                    viewModelInstance4 = viewModelInstance3;
                    fit3 = fit2;
                    i24 = i23;
                    rivePointerInputMode3 = rivePointerInputMode2;
                    riveFrameRate3 = riveFrameRate2;
                    riveSemanticsMode3 = riveSemanticsMode2;
                    iu30Var3 = iu30Var2;
                } else {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    } else {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    }
                    x340Var.s();
                    int i2117 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                    int i2118 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                    qim0 qim0Var15 = qim0Var3;
                    RiveImpl(riveFile, qim0Var15, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i2117, i2118);
                    qim0Var4 = qim0Var15;
                    z5 = z4;
                    artboard4 = artboard3;
                    stateMachine4 = stateMachine3;
                    viewModelInstance4 = viewModelInstance3;
                    fit3 = fit2;
                    i24 = i23;
                    rivePointerInputMode3 = rivePointerInputMode2;
                    riveFrameRate3 = riveFrameRate2;
                    riveSemanticsMode3 = riveSemanticsMode2;
                    iu30Var3 = iu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new C00341(riveFile, qim0Var4, z5, artboard4, stateMachine4, viewModelInstance4, fit3, i24, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var3, i2, i3, i4);
                }
            }
            i5 |= 805306368;
            i18 = i4 & SemanticState.ReadOnly;
            if (i18 != 0) {
                i19 = i3 | 6;
            } else if ((i3 & 14) == 0) {
                if (x340Var.g(riveSemanticsMode)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i19 = i3 | i20;
            } else {
                i19 = i3;
            }
            i21 = i4 & SemanticState.Modal;
            if (i21 != 0) {
                if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                    if (x340Var.i(iu30Var)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i19 |= i22;
                }
                if ((i4 & 56) != 56) {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    } else {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    }
                    x340Var.s();
                    int i2119 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                    int i21110 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                    qim0 qim0Var16 = qim0Var3;
                    RiveImpl(riveFile, qim0Var16, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i2119, i21110);
                    qim0Var4 = qim0Var16;
                    z5 = z4;
                    artboard4 = artboard3;
                    stateMachine4 = stateMachine3;
                    viewModelInstance4 = viewModelInstance3;
                    fit3 = fit2;
                    i24 = i23;
                    rivePointerInputMode3 = rivePointerInputMode2;
                    riveFrameRate3 = riveFrameRate2;
                    riveSemanticsMode3 = riveSemanticsMode2;
                    iu30Var3 = iu30Var2;
                } else {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    } else {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    }
                    x340Var.s();
                    int i21111 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                    int i21112 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                    qim0 qim0Var17 = qim0Var3;
                    RiveImpl(riveFile, qim0Var17, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i21111, i21112);
                    qim0Var4 = qim0Var17;
                    z5 = z4;
                    artboard4 = artboard3;
                    stateMachine4 = stateMachine3;
                    viewModelInstance4 = viewModelInstance3;
                    fit3 = fit2;
                    i24 = i23;
                    rivePointerInputMode3 = rivePointerInputMode2;
                    riveFrameRate3 = riveFrameRate2;
                    riveSemanticsMode3 = riveSemanticsMode2;
                    iu30Var3 = iu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new C00341(riveFile, qim0Var4, z5, artboard4, stateMachine4, viewModelInstance4, fit3, i24, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var3, i2, i3, i4);
                }
            }
            i19 |= 48;
            if ((i4 & 56) != 56) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i26 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i9 != 0) {
                        stateMachine2 = null;
                    } else {
                        stateMachine2 = stateMachine;
                    }
                    if (i10 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if ((i4 & 64) != 0) {
                        fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                        i5 &= -3670017;
                    }
                    if (i11 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i12;
                    }
                    if (i14 != 0) {
                        rivePointerInputMode2 = RivePointerInputMode.Consume;
                    } else {
                        rivePointerInputMode2 = rivePointerInputMode;
                    }
                    if (i16 != 0) {
                        riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                    } else {
                        riveFrameRate2 = riveFrameRate;
                    }
                    if (i18 != 0) {
                        riveSemanticsMode2 = RiveSemanticsMode.Off;
                    } else {
                        riveSemanticsMode2 = riveSemanticsMode;
                    }
                    if (i21 != 0) {
                        iu30Var2 = null;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    artboard3 = artboard2;
                    stateMachine3 = stateMachine2;
                    fit2 = fitDefaultFit;
                    z4 = z3;
                    viewModelInstance3 = viewModelInstance2;
                } else {
                    if (i26 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i9 != 0) {
                        stateMachine2 = null;
                    } else {
                        stateMachine2 = stateMachine;
                    }
                    if (i10 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if ((i4 & 64) != 0) {
                        fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                        i5 &= -3670017;
                    }
                    if (i11 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i12;
                    }
                    if (i14 != 0) {
                        rivePointerInputMode2 = RivePointerInputMode.Consume;
                    } else {
                        rivePointerInputMode2 = rivePointerInputMode;
                    }
                    if (i16 != 0) {
                        riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                    } else {
                        riveFrameRate2 = riveFrameRate;
                    }
                    if (i18 != 0) {
                        riveSemanticsMode2 = RiveSemanticsMode.Off;
                    } else {
                        riveSemanticsMode2 = riveSemanticsMode;
                    }
                    if (i21 != 0) {
                        iu30Var2 = null;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    artboard3 = artboard2;
                    stateMachine3 = stateMachine2;
                    fit2 = fitDefaultFit;
                    z4 = z3;
                    viewModelInstance3 = viewModelInstance2;
                }
                x340Var.s();
                int i21113 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                int i21114 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                qim0 qim0Var18 = qim0Var3;
                RiveImpl(riveFile, qim0Var18, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i21113, i21114);
                qim0Var4 = qim0Var18;
                z5 = z4;
                artboard4 = artboard3;
                stateMachine4 = stateMachine3;
                viewModelInstance4 = viewModelInstance3;
                fit3 = fit2;
                i24 = i23;
                rivePointerInputMode3 = rivePointerInputMode2;
                riveFrameRate3 = riveFrameRate2;
                riveSemanticsMode3 = riveSemanticsMode2;
                iu30Var3 = iu30Var2;
            } else {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i26 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i9 != 0) {
                        stateMachine2 = null;
                    } else {
                        stateMachine2 = stateMachine;
                    }
                    if (i10 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if ((i4 & 64) != 0) {
                        fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                        i5 &= -3670017;
                    }
                    if (i11 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i12;
                    }
                    if (i14 != 0) {
                        rivePointerInputMode2 = RivePointerInputMode.Consume;
                    } else {
                        rivePointerInputMode2 = rivePointerInputMode;
                    }
                    if (i16 != 0) {
                        riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                    } else {
                        riveFrameRate2 = riveFrameRate;
                    }
                    if (i18 != 0) {
                        riveSemanticsMode2 = RiveSemanticsMode.Off;
                    } else {
                        riveSemanticsMode2 = riveSemanticsMode;
                    }
                    if (i21 != 0) {
                        iu30Var2 = null;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    artboard3 = artboard2;
                    stateMachine3 = stateMachine2;
                    fit2 = fitDefaultFit;
                    z4 = z3;
                    viewModelInstance3 = viewModelInstance2;
                } else {
                    if (i26 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i9 != 0) {
                        stateMachine2 = null;
                    } else {
                        stateMachine2 = stateMachine;
                    }
                    if (i10 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if ((i4 & 64) != 0) {
                        fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                        i5 &= -3670017;
                    }
                    if (i11 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i12;
                    }
                    if (i14 != 0) {
                        rivePointerInputMode2 = RivePointerInputMode.Consume;
                    } else {
                        rivePointerInputMode2 = rivePointerInputMode;
                    }
                    if (i16 != 0) {
                        riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                    } else {
                        riveFrameRate2 = riveFrameRate;
                    }
                    if (i18 != 0) {
                        riveSemanticsMode2 = RiveSemanticsMode.Off;
                    } else {
                        riveSemanticsMode2 = riveSemanticsMode;
                    }
                    if (i21 != 0) {
                        iu30Var2 = null;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    artboard3 = artboard2;
                    stateMachine3 = stateMachine2;
                    fit2 = fitDefaultFit;
                    z4 = z3;
                    viewModelInstance3 = viewModelInstance2;
                }
                x340Var.s();
                int i21115 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                int i21116 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                qim0 qim0Var19 = qim0Var3;
                RiveImpl(riveFile, qim0Var19, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i21115, i21116);
                qim0Var4 = qim0Var19;
                z5 = z4;
                artboard4 = artboard3;
                stateMachine4 = stateMachine3;
                viewModelInstance4 = viewModelInstance3;
                fit3 = fit2;
                i24 = i23;
                rivePointerInputMode3 = rivePointerInputMode2;
                riveFrameRate3 = riveFrameRate2;
                riveSemanticsMode3 = riveSemanticsMode2;
                iu30Var3 = iu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new C00341(riveFile, qim0Var4, z5, artboard4, stateMachine4, viewModelInstance4, fit3, i24, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var3, i2, i3, i4);
            }
        }
        i5 |= 48;
        qim0Var2 = qim0Var;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i2 & 896) == 0) {
                z2 = z;
                if (x340Var.h(z2)) {
                    i7 = SemanticState.Hidden;
                } else {
                    i7 = SemanticState.Focused;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            if (i8 != 0) {
                i5 |= SemanticState.ReadOnly;
            }
            i9 = i4 & 16;
            if (i9 != 0) {
                i5 |= SemanticState.Multiline;
            }
            i10 = i4 & 32;
            if (i10 != 0) {
                i5 |= 65536;
            }
            if ((i2 & 3670016) == 0) {
                fitDefaultFit = fit;
                if ((i4 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i5 |= i25;
            } else {
                fitDefaultFit = fit;
            }
            i11 = i4 & SemanticState.Focused;
            if (i11 != 0) {
                i5 |= 12582912;
                i12 = i;
            } else {
                i12 = i;
                if ((i2 & 29360128) == 0) {
                    if (x340Var.e(i12)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i5 |= i13;
                }
            }
            i14 = i4 & SemanticState.Hidden;
            if (i14 != 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                if (x340Var.g(rivePointerInputMode)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i5 |= i15;
            }
            i16 = i4 & 512;
            if (i16 != 0) {
                if ((i2 & 1879048192) == 0) {
                    if (x340Var.g(riveFrameRate)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i5 |= i17;
                }
                i18 = i4 & SemanticState.ReadOnly;
                if (i18 != 0) {
                    i19 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    if (x340Var.g(riveSemanticsMode)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i19 = i3 | i20;
                } else {
                    i19 = i3;
                }
                i21 = i4 & SemanticState.Modal;
                if (i21 != 0) {
                    if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                        if (x340Var.i(iu30Var)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i19 |= i22;
                    }
                    if ((i4 & 56) != 56) {
                        x340Var.d0();
                        if ((i2 & 1) != 0) {
                            if (i26 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                artboard2 = null;
                            } else {
                                artboard2 = artboard;
                            }
                            if (i9 != 0) {
                                stateMachine2 = null;
                            } else {
                                stateMachine2 = stateMachine;
                            }
                            if (i10 != 0) {
                                viewModelInstance2 = null;
                            } else {
                                viewModelInstance2 = viewModelInstance;
                            }
                            if ((i4 & 64) != 0) {
                                fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                                i5 &= -3670017;
                            }
                            if (i11 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i12;
                            }
                            if (i14 != 0) {
                                rivePointerInputMode2 = RivePointerInputMode.Consume;
                            } else {
                                rivePointerInputMode2 = rivePointerInputMode;
                            }
                            if (i16 != 0) {
                                riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                            } else {
                                riveFrameRate2 = riveFrameRate;
                            }
                            if (i18 != 0) {
                                riveSemanticsMode2 = RiveSemanticsMode.Off;
                            } else {
                                riveSemanticsMode2 = riveSemanticsMode;
                            }
                            if (i21 != 0) {
                                iu30Var2 = null;
                            } else {
                                iu30Var2 = iu30Var;
                            }
                            artboard3 = artboard2;
                            stateMachine3 = stateMachine2;
                            fit2 = fitDefaultFit;
                            z4 = z3;
                            viewModelInstance3 = viewModelInstance2;
                        } else {
                            if (i26 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                artboard2 = null;
                            } else {
                                artboard2 = artboard;
                            }
                            if (i9 != 0) {
                                stateMachine2 = null;
                            } else {
                                stateMachine2 = stateMachine;
                            }
                            if (i10 != 0) {
                                viewModelInstance2 = null;
                            } else {
                                viewModelInstance2 = viewModelInstance;
                            }
                            if ((i4 & 64) != 0) {
                                fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                                i5 &= -3670017;
                            }
                            if (i11 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i12;
                            }
                            if (i14 != 0) {
                                rivePointerInputMode2 = RivePointerInputMode.Consume;
                            } else {
                                rivePointerInputMode2 = rivePointerInputMode;
                            }
                            if (i16 != 0) {
                                riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                            } else {
                                riveFrameRate2 = riveFrameRate;
                            }
                            if (i18 != 0) {
                                riveSemanticsMode2 = RiveSemanticsMode.Off;
                            } else {
                                riveSemanticsMode2 = riveSemanticsMode;
                            }
                            if (i21 != 0) {
                                iu30Var2 = null;
                            } else {
                                iu30Var2 = iu30Var;
                            }
                            artboard3 = artboard2;
                            stateMachine3 = stateMachine2;
                            fit2 = fitDefaultFit;
                            z4 = z3;
                            viewModelInstance3 = viewModelInstance2;
                        }
                        x340Var.s();
                        int i21117 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                        int i21118 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                        qim0 qim0Var110 = qim0Var3;
                        RiveImpl(riveFile, qim0Var110, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i21117, i21118);
                        qim0Var4 = qim0Var110;
                        z5 = z4;
                        artboard4 = artboard3;
                        stateMachine4 = stateMachine3;
                        viewModelInstance4 = viewModelInstance3;
                        fit3 = fit2;
                        i24 = i23;
                        rivePointerInputMode3 = rivePointerInputMode2;
                        riveFrameRate3 = riveFrameRate2;
                        riveSemanticsMode3 = riveSemanticsMode2;
                        iu30Var3 = iu30Var2;
                    } else {
                        x340Var.d0();
                        if ((i2 & 1) != 0) {
                            if (i26 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                artboard2 = null;
                            } else {
                                artboard2 = artboard;
                            }
                            if (i9 != 0) {
                                stateMachine2 = null;
                            } else {
                                stateMachine2 = stateMachine;
                            }
                            if (i10 != 0) {
                                viewModelInstance2 = null;
                            } else {
                                viewModelInstance2 = viewModelInstance;
                            }
                            if ((i4 & 64) != 0) {
                                fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                                i5 &= -3670017;
                            }
                            if (i11 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i12;
                            }
                            if (i14 != 0) {
                                rivePointerInputMode2 = RivePointerInputMode.Consume;
                            } else {
                                rivePointerInputMode2 = rivePointerInputMode;
                            }
                            if (i16 != 0) {
                                riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                            } else {
                                riveFrameRate2 = riveFrameRate;
                            }
                            if (i18 != 0) {
                                riveSemanticsMode2 = RiveSemanticsMode.Off;
                            } else {
                                riveSemanticsMode2 = riveSemanticsMode;
                            }
                            if (i21 != 0) {
                                iu30Var2 = null;
                            } else {
                                iu30Var2 = iu30Var;
                            }
                            artboard3 = artboard2;
                            stateMachine3 = stateMachine2;
                            fit2 = fitDefaultFit;
                            z4 = z3;
                            viewModelInstance3 = viewModelInstance2;
                        } else {
                            if (i26 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var2;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            } else {
                                z3 = z2;
                            }
                            if (i8 != 0) {
                                artboard2 = null;
                            } else {
                                artboard2 = artboard;
                            }
                            if (i9 != 0) {
                                stateMachine2 = null;
                            } else {
                                stateMachine2 = stateMachine;
                            }
                            if (i10 != 0) {
                                viewModelInstance2 = null;
                            } else {
                                viewModelInstance2 = viewModelInstance;
                            }
                            if ((i4 & 64) != 0) {
                                fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                                i5 &= -3670017;
                            }
                            if (i11 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i12;
                            }
                            if (i14 != 0) {
                                rivePointerInputMode2 = RivePointerInputMode.Consume;
                            } else {
                                rivePointerInputMode2 = rivePointerInputMode;
                            }
                            if (i16 != 0) {
                                riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                            } else {
                                riveFrameRate2 = riveFrameRate;
                            }
                            if (i18 != 0) {
                                riveSemanticsMode2 = RiveSemanticsMode.Off;
                            } else {
                                riveSemanticsMode2 = riveSemanticsMode;
                            }
                            if (i21 != 0) {
                                iu30Var2 = null;
                            } else {
                                iu30Var2 = iu30Var;
                            }
                            artboard3 = artboard2;
                            stateMachine3 = stateMachine2;
                            fit2 = fitDefaultFit;
                            z4 = z3;
                            viewModelInstance3 = viewModelInstance2;
                        }
                        x340Var.s();
                        int i21119 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                        int i211110 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                        qim0 qim0Var111 = qim0Var3;
                        RiveImpl(riveFile, qim0Var111, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i21119, i211110);
                        qim0Var4 = qim0Var111;
                        z5 = z4;
                        artboard4 = artboard3;
                        stateMachine4 = stateMachine3;
                        viewModelInstance4 = viewModelInstance3;
                        fit3 = fit2;
                        i24 = i23;
                        rivePointerInputMode3 = rivePointerInputMode2;
                        riveFrameRate3 = riveFrameRate2;
                        riveSemanticsMode3 = riveSemanticsMode2;
                        iu30Var3 = iu30Var2;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new C00341(riveFile, qim0Var4, z5, artboard4, stateMachine4, viewModelInstance4, fit3, i24, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var3, i2, i3, i4);
                    }
                }
                i19 |= 48;
                if ((i4 & 56) != 56) {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    } else {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    }
                    x340Var.s();
                    int i211111 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                    int i211112 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                    qim0 qim0Var112 = qim0Var3;
                    RiveImpl(riveFile, qim0Var112, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i211111, i211112);
                    qim0Var4 = qim0Var112;
                    z5 = z4;
                    artboard4 = artboard3;
                    stateMachine4 = stateMachine3;
                    viewModelInstance4 = viewModelInstance3;
                    fit3 = fit2;
                    i24 = i23;
                    rivePointerInputMode3 = rivePointerInputMode2;
                    riveFrameRate3 = riveFrameRate2;
                    riveSemanticsMode3 = riveSemanticsMode2;
                    iu30Var3 = iu30Var2;
                } else {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    } else {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    }
                    x340Var.s();
                    int i211113 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                    int i211114 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                    qim0 qim0Var113 = qim0Var3;
                    RiveImpl(riveFile, qim0Var113, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i211113, i211114);
                    qim0Var4 = qim0Var113;
                    z5 = z4;
                    artboard4 = artboard3;
                    stateMachine4 = stateMachine3;
                    viewModelInstance4 = viewModelInstance3;
                    fit3 = fit2;
                    i24 = i23;
                    rivePointerInputMode3 = rivePointerInputMode2;
                    riveFrameRate3 = riveFrameRate2;
                    riveSemanticsMode3 = riveSemanticsMode2;
                    iu30Var3 = iu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new C00341(riveFile, qim0Var4, z5, artboard4, stateMachine4, viewModelInstance4, fit3, i24, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var3, i2, i3, i4);
                }
            }
            i5 |= 805306368;
            i18 = i4 & SemanticState.ReadOnly;
            if (i18 != 0) {
                i19 = i3 | 6;
            } else if ((i3 & 14) == 0) {
                if (x340Var.g(riveSemanticsMode)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i19 = i3 | i20;
            } else {
                i19 = i3;
            }
            i21 = i4 & SemanticState.Modal;
            if (i21 != 0) {
                if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                    if (x340Var.i(iu30Var)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i19 |= i22;
                }
                if ((i4 & 56) != 56) {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    } else {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    }
                    x340Var.s();
                    int i211115 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                    int i211116 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                    qim0 qim0Var114 = qim0Var3;
                    RiveImpl(riveFile, qim0Var114, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i211115, i211116);
                    qim0Var4 = qim0Var114;
                    z5 = z4;
                    artboard4 = artboard3;
                    stateMachine4 = stateMachine3;
                    viewModelInstance4 = viewModelInstance3;
                    fit3 = fit2;
                    i24 = i23;
                    rivePointerInputMode3 = rivePointerInputMode2;
                    riveFrameRate3 = riveFrameRate2;
                    riveSemanticsMode3 = riveSemanticsMode2;
                    iu30Var3 = iu30Var2;
                } else {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    } else {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    }
                    x340Var.s();
                    int i211117 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                    int i211118 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                    qim0 qim0Var115 = qim0Var3;
                    RiveImpl(riveFile, qim0Var115, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i211117, i211118);
                    qim0Var4 = qim0Var115;
                    z5 = z4;
                    artboard4 = artboard3;
                    stateMachine4 = stateMachine3;
                    viewModelInstance4 = viewModelInstance3;
                    fit3 = fit2;
                    i24 = i23;
                    rivePointerInputMode3 = rivePointerInputMode2;
                    riveFrameRate3 = riveFrameRate2;
                    riveSemanticsMode3 = riveSemanticsMode2;
                    iu30Var3 = iu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new C00341(riveFile, qim0Var4, z5, artboard4, stateMachine4, viewModelInstance4, fit3, i24, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var3, i2, i3, i4);
                }
            }
            i19 |= 48;
            if ((i4 & 56) != 56) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i26 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i9 != 0) {
                        stateMachine2 = null;
                    } else {
                        stateMachine2 = stateMachine;
                    }
                    if (i10 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if ((i4 & 64) != 0) {
                        fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                        i5 &= -3670017;
                    }
                    if (i11 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i12;
                    }
                    if (i14 != 0) {
                        rivePointerInputMode2 = RivePointerInputMode.Consume;
                    } else {
                        rivePointerInputMode2 = rivePointerInputMode;
                    }
                    if (i16 != 0) {
                        riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                    } else {
                        riveFrameRate2 = riveFrameRate;
                    }
                    if (i18 != 0) {
                        riveSemanticsMode2 = RiveSemanticsMode.Off;
                    } else {
                        riveSemanticsMode2 = riveSemanticsMode;
                    }
                    if (i21 != 0) {
                        iu30Var2 = null;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    artboard3 = artboard2;
                    stateMachine3 = stateMachine2;
                    fit2 = fitDefaultFit;
                    z4 = z3;
                    viewModelInstance3 = viewModelInstance2;
                } else {
                    if (i26 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i9 != 0) {
                        stateMachine2 = null;
                    } else {
                        stateMachine2 = stateMachine;
                    }
                    if (i10 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if ((i4 & 64) != 0) {
                        fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                        i5 &= -3670017;
                    }
                    if (i11 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i12;
                    }
                    if (i14 != 0) {
                        rivePointerInputMode2 = RivePointerInputMode.Consume;
                    } else {
                        rivePointerInputMode2 = rivePointerInputMode;
                    }
                    if (i16 != 0) {
                        riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                    } else {
                        riveFrameRate2 = riveFrameRate;
                    }
                    if (i18 != 0) {
                        riveSemanticsMode2 = RiveSemanticsMode.Off;
                    } else {
                        riveSemanticsMode2 = riveSemanticsMode;
                    }
                    if (i21 != 0) {
                        iu30Var2 = null;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    artboard3 = artboard2;
                    stateMachine3 = stateMachine2;
                    fit2 = fitDefaultFit;
                    z4 = z3;
                    viewModelInstance3 = viewModelInstance2;
                }
                x340Var.s();
                int i211119 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                int i2111110 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                qim0 qim0Var116 = qim0Var3;
                RiveImpl(riveFile, qim0Var116, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i211119, i2111110);
                qim0Var4 = qim0Var116;
                z5 = z4;
                artboard4 = artboard3;
                stateMachine4 = stateMachine3;
                viewModelInstance4 = viewModelInstance3;
                fit3 = fit2;
                i24 = i23;
                rivePointerInputMode3 = rivePointerInputMode2;
                riveFrameRate3 = riveFrameRate2;
                riveSemanticsMode3 = riveSemanticsMode2;
                iu30Var3 = iu30Var2;
            } else {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i26 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i9 != 0) {
                        stateMachine2 = null;
                    } else {
                        stateMachine2 = stateMachine;
                    }
                    if (i10 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if ((i4 & 64) != 0) {
                        fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                        i5 &= -3670017;
                    }
                    if (i11 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i12;
                    }
                    if (i14 != 0) {
                        rivePointerInputMode2 = RivePointerInputMode.Consume;
                    } else {
                        rivePointerInputMode2 = rivePointerInputMode;
                    }
                    if (i16 != 0) {
                        riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                    } else {
                        riveFrameRate2 = riveFrameRate;
                    }
                    if (i18 != 0) {
                        riveSemanticsMode2 = RiveSemanticsMode.Off;
                    } else {
                        riveSemanticsMode2 = riveSemanticsMode;
                    }
                    if (i21 != 0) {
                        iu30Var2 = null;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    artboard3 = artboard2;
                    stateMachine3 = stateMachine2;
                    fit2 = fitDefaultFit;
                    z4 = z3;
                    viewModelInstance3 = viewModelInstance2;
                } else {
                    if (i26 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i9 != 0) {
                        stateMachine2 = null;
                    } else {
                        stateMachine2 = stateMachine;
                    }
                    if (i10 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if ((i4 & 64) != 0) {
                        fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                        i5 &= -3670017;
                    }
                    if (i11 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i12;
                    }
                    if (i14 != 0) {
                        rivePointerInputMode2 = RivePointerInputMode.Consume;
                    } else {
                        rivePointerInputMode2 = rivePointerInputMode;
                    }
                    if (i16 != 0) {
                        riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                    } else {
                        riveFrameRate2 = riveFrameRate;
                    }
                    if (i18 != 0) {
                        riveSemanticsMode2 = RiveSemanticsMode.Off;
                    } else {
                        riveSemanticsMode2 = riveSemanticsMode;
                    }
                    if (i21 != 0) {
                        iu30Var2 = null;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    artboard3 = artboard2;
                    stateMachine3 = stateMachine2;
                    fit2 = fitDefaultFit;
                    z4 = z3;
                    viewModelInstance3 = viewModelInstance2;
                }
                x340Var.s();
                int i2111111 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                int i2111112 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                qim0 qim0Var117 = qim0Var3;
                RiveImpl(riveFile, qim0Var117, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i2111111, i2111112);
                qim0Var4 = qim0Var117;
                z5 = z4;
                artboard4 = artboard3;
                stateMachine4 = stateMachine3;
                viewModelInstance4 = viewModelInstance3;
                fit3 = fit2;
                i24 = i23;
                rivePointerInputMode3 = rivePointerInputMode2;
                riveFrameRate3 = riveFrameRate2;
                riveSemanticsMode3 = riveSemanticsMode2;
                iu30Var3 = iu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new C00341(riveFile, qim0Var4, z5, artboard4, stateMachine4, viewModelInstance4, fit3, i24, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var3, i2, i3, i4);
            }
        }
        i5 |= 384;
        z2 = z;
        i8 = i4 & 8;
        if (i8 != 0) {
            i5 |= SemanticState.ReadOnly;
        }
        i9 = i4 & 16;
        if (i9 != 0) {
            i5 |= SemanticState.Multiline;
        }
        i10 = i4 & 32;
        if (i10 != 0) {
            i5 |= 65536;
        }
        if ((i2 & 3670016) == 0) {
            fitDefaultFit = fit;
            if ((i4 & 64) == 0) {
                i25 = 524288;
            } else {
                i25 = 524288;
            }
            i5 |= i25;
        } else {
            fitDefaultFit = fit;
        }
        i11 = i4 & SemanticState.Focused;
        if (i11 != 0) {
            i5 |= 12582912;
            i12 = i;
        } else {
            i12 = i;
            if ((i2 & 29360128) == 0) {
                if (x340Var.e(i12)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i5 |= i13;
            }
        }
        i14 = i4 & SemanticState.Hidden;
        if (i14 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 234881024) == 0) {
            if (x340Var.g(rivePointerInputMode)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i5 |= i15;
        }
        i16 = i4 & 512;
        if (i16 != 0) {
            if ((i2 & 1879048192) == 0) {
                if (x340Var.g(riveFrameRate)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i5 |= i17;
            }
            i18 = i4 & SemanticState.ReadOnly;
            if (i18 != 0) {
                i19 = i3 | 6;
            } else if ((i3 & 14) == 0) {
                if (x340Var.g(riveSemanticsMode)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i19 = i3 | i20;
            } else {
                i19 = i3;
            }
            i21 = i4 & SemanticState.Modal;
            if (i21 != 0) {
                if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                    if (x340Var.i(iu30Var)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i19 |= i22;
                }
                if ((i4 & 56) != 56) {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    } else {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    }
                    x340Var.s();
                    int i2111113 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                    int i2111114 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                    qim0 qim0Var118 = qim0Var3;
                    RiveImpl(riveFile, qim0Var118, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i2111113, i2111114);
                    qim0Var4 = qim0Var118;
                    z5 = z4;
                    artboard4 = artboard3;
                    stateMachine4 = stateMachine3;
                    viewModelInstance4 = viewModelInstance3;
                    fit3 = fit2;
                    i24 = i23;
                    rivePointerInputMode3 = rivePointerInputMode2;
                    riveFrameRate3 = riveFrameRate2;
                    riveSemanticsMode3 = riveSemanticsMode2;
                    iu30Var3 = iu30Var2;
                } else {
                    x340Var.d0();
                    if ((i2 & 1) != 0) {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    } else {
                        if (i26 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var2;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        } else {
                            z3 = z2;
                        }
                        if (i8 != 0) {
                            artboard2 = null;
                        } else {
                            artboard2 = artboard;
                        }
                        if (i9 != 0) {
                            stateMachine2 = null;
                        } else {
                            stateMachine2 = stateMachine;
                        }
                        if (i10 != 0) {
                            viewModelInstance2 = null;
                        } else {
                            viewModelInstance2 = viewModelInstance;
                        }
                        if ((i4 & 64) != 0) {
                            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                            i5 &= -3670017;
                        }
                        if (i11 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i12;
                        }
                        if (i14 != 0) {
                            rivePointerInputMode2 = RivePointerInputMode.Consume;
                        } else {
                            rivePointerInputMode2 = rivePointerInputMode;
                        }
                        if (i16 != 0) {
                            riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                        } else {
                            riveFrameRate2 = riveFrameRate;
                        }
                        if (i18 != 0) {
                            riveSemanticsMode2 = RiveSemanticsMode.Off;
                        } else {
                            riveSemanticsMode2 = riveSemanticsMode;
                        }
                        if (i21 != 0) {
                            iu30Var2 = null;
                        } else {
                            iu30Var2 = iu30Var;
                        }
                        artboard3 = artboard2;
                        stateMachine3 = stateMachine2;
                        fit2 = fitDefaultFit;
                        z4 = z3;
                        viewModelInstance3 = viewModelInstance2;
                    }
                    x340Var.s();
                    int i2111115 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                    int i2111116 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                    qim0 qim0Var119 = qim0Var3;
                    RiveImpl(riveFile, qim0Var119, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i2111115, i2111116);
                    qim0Var4 = qim0Var119;
                    z5 = z4;
                    artboard4 = artboard3;
                    stateMachine4 = stateMachine3;
                    viewModelInstance4 = viewModelInstance3;
                    fit3 = fit2;
                    i24 = i23;
                    rivePointerInputMode3 = rivePointerInputMode2;
                    riveFrameRate3 = riveFrameRate2;
                    riveSemanticsMode3 = riveSemanticsMode2;
                    iu30Var3 = iu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new C00341(riveFile, qim0Var4, z5, artboard4, stateMachine4, viewModelInstance4, fit3, i24, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var3, i2, i3, i4);
                }
            }
            i19 |= 48;
            if ((i4 & 56) != 56) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i26 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i9 != 0) {
                        stateMachine2 = null;
                    } else {
                        stateMachine2 = stateMachine;
                    }
                    if (i10 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if ((i4 & 64) != 0) {
                        fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                        i5 &= -3670017;
                    }
                    if (i11 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i12;
                    }
                    if (i14 != 0) {
                        rivePointerInputMode2 = RivePointerInputMode.Consume;
                    } else {
                        rivePointerInputMode2 = rivePointerInputMode;
                    }
                    if (i16 != 0) {
                        riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                    } else {
                        riveFrameRate2 = riveFrameRate;
                    }
                    if (i18 != 0) {
                        riveSemanticsMode2 = RiveSemanticsMode.Off;
                    } else {
                        riveSemanticsMode2 = riveSemanticsMode;
                    }
                    if (i21 != 0) {
                        iu30Var2 = null;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    artboard3 = artboard2;
                    stateMachine3 = stateMachine2;
                    fit2 = fitDefaultFit;
                    z4 = z3;
                    viewModelInstance3 = viewModelInstance2;
                } else {
                    if (i26 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i9 != 0) {
                        stateMachine2 = null;
                    } else {
                        stateMachine2 = stateMachine;
                    }
                    if (i10 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if ((i4 & 64) != 0) {
                        fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                        i5 &= -3670017;
                    }
                    if (i11 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i12;
                    }
                    if (i14 != 0) {
                        rivePointerInputMode2 = RivePointerInputMode.Consume;
                    } else {
                        rivePointerInputMode2 = rivePointerInputMode;
                    }
                    if (i16 != 0) {
                        riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                    } else {
                        riveFrameRate2 = riveFrameRate;
                    }
                    if (i18 != 0) {
                        riveSemanticsMode2 = RiveSemanticsMode.Off;
                    } else {
                        riveSemanticsMode2 = riveSemanticsMode;
                    }
                    if (i21 != 0) {
                        iu30Var2 = null;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    artboard3 = artboard2;
                    stateMachine3 = stateMachine2;
                    fit2 = fitDefaultFit;
                    z4 = z3;
                    viewModelInstance3 = viewModelInstance2;
                }
                x340Var.s();
                int i2111117 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                int i2111118 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                qim0 qim0Var1110 = qim0Var3;
                RiveImpl(riveFile, qim0Var1110, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i2111117, i2111118);
                qim0Var4 = qim0Var1110;
                z5 = z4;
                artboard4 = artboard3;
                stateMachine4 = stateMachine3;
                viewModelInstance4 = viewModelInstance3;
                fit3 = fit2;
                i24 = i23;
                rivePointerInputMode3 = rivePointerInputMode2;
                riveFrameRate3 = riveFrameRate2;
                riveSemanticsMode3 = riveSemanticsMode2;
                iu30Var3 = iu30Var2;
            } else {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i26 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i9 != 0) {
                        stateMachine2 = null;
                    } else {
                        stateMachine2 = stateMachine;
                    }
                    if (i10 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if ((i4 & 64) != 0) {
                        fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                        i5 &= -3670017;
                    }
                    if (i11 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i12;
                    }
                    if (i14 != 0) {
                        rivePointerInputMode2 = RivePointerInputMode.Consume;
                    } else {
                        rivePointerInputMode2 = rivePointerInputMode;
                    }
                    if (i16 != 0) {
                        riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                    } else {
                        riveFrameRate2 = riveFrameRate;
                    }
                    if (i18 != 0) {
                        riveSemanticsMode2 = RiveSemanticsMode.Off;
                    } else {
                        riveSemanticsMode2 = riveSemanticsMode;
                    }
                    if (i21 != 0) {
                        iu30Var2 = null;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    artboard3 = artboard2;
                    stateMachine3 = stateMachine2;
                    fit2 = fitDefaultFit;
                    z4 = z3;
                    viewModelInstance3 = viewModelInstance2;
                } else {
                    if (i26 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i9 != 0) {
                        stateMachine2 = null;
                    } else {
                        stateMachine2 = stateMachine;
                    }
                    if (i10 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if ((i4 & 64) != 0) {
                        fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                        i5 &= -3670017;
                    }
                    if (i11 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i12;
                    }
                    if (i14 != 0) {
                        rivePointerInputMode2 = RivePointerInputMode.Consume;
                    } else {
                        rivePointerInputMode2 = rivePointerInputMode;
                    }
                    if (i16 != 0) {
                        riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                    } else {
                        riveFrameRate2 = riveFrameRate;
                    }
                    if (i18 != 0) {
                        riveSemanticsMode2 = RiveSemanticsMode.Off;
                    } else {
                        riveSemanticsMode2 = riveSemanticsMode;
                    }
                    if (i21 != 0) {
                        iu30Var2 = null;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    artboard3 = artboard2;
                    stateMachine3 = stateMachine2;
                    fit2 = fitDefaultFit;
                    z4 = z3;
                    viewModelInstance3 = viewModelInstance2;
                }
                x340Var.s();
                int i2111119 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                int i21111110 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                qim0 qim0Var1111 = qim0Var3;
                RiveImpl(riveFile, qim0Var1111, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i2111119, i21111110);
                qim0Var4 = qim0Var1111;
                z5 = z4;
                artboard4 = artboard3;
                stateMachine4 = stateMachine3;
                viewModelInstance4 = viewModelInstance3;
                fit3 = fit2;
                i24 = i23;
                rivePointerInputMode3 = rivePointerInputMode2;
                riveFrameRate3 = riveFrameRate2;
                riveSemanticsMode3 = riveSemanticsMode2;
                iu30Var3 = iu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new C00341(riveFile, qim0Var4, z5, artboard4, stateMachine4, viewModelInstance4, fit3, i24, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var3, i2, i3, i4);
            }
        }
        i5 |= 805306368;
        i18 = i4 & SemanticState.ReadOnly;
        if (i18 != 0) {
            i19 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            if (x340Var.g(riveSemanticsMode)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i19 = i3 | i20;
        } else {
            i19 = i3;
        }
        i21 = i4 & SemanticState.Modal;
        if (i21 != 0) {
            if ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                if (x340Var.i(iu30Var)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i19 |= i22;
            }
            if ((i4 & 56) != 56) {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i26 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i9 != 0) {
                        stateMachine2 = null;
                    } else {
                        stateMachine2 = stateMachine;
                    }
                    if (i10 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if ((i4 & 64) != 0) {
                        fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                        i5 &= -3670017;
                    }
                    if (i11 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i12;
                    }
                    if (i14 != 0) {
                        rivePointerInputMode2 = RivePointerInputMode.Consume;
                    } else {
                        rivePointerInputMode2 = rivePointerInputMode;
                    }
                    if (i16 != 0) {
                        riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                    } else {
                        riveFrameRate2 = riveFrameRate;
                    }
                    if (i18 != 0) {
                        riveSemanticsMode2 = RiveSemanticsMode.Off;
                    } else {
                        riveSemanticsMode2 = riveSemanticsMode;
                    }
                    if (i21 != 0) {
                        iu30Var2 = null;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    artboard3 = artboard2;
                    stateMachine3 = stateMachine2;
                    fit2 = fitDefaultFit;
                    z4 = z3;
                    viewModelInstance3 = viewModelInstance2;
                } else {
                    if (i26 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i9 != 0) {
                        stateMachine2 = null;
                    } else {
                        stateMachine2 = stateMachine;
                    }
                    if (i10 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if ((i4 & 64) != 0) {
                        fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                        i5 &= -3670017;
                    }
                    if (i11 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i12;
                    }
                    if (i14 != 0) {
                        rivePointerInputMode2 = RivePointerInputMode.Consume;
                    } else {
                        rivePointerInputMode2 = rivePointerInputMode;
                    }
                    if (i16 != 0) {
                        riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                    } else {
                        riveFrameRate2 = riveFrameRate;
                    }
                    if (i18 != 0) {
                        riveSemanticsMode2 = RiveSemanticsMode.Off;
                    } else {
                        riveSemanticsMode2 = riveSemanticsMode;
                    }
                    if (i21 != 0) {
                        iu30Var2 = null;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    artboard3 = artboard2;
                    stateMachine3 = stateMachine2;
                    fit2 = fitDefaultFit;
                    z4 = z3;
                    viewModelInstance3 = viewModelInstance2;
                }
                x340Var.s();
                int i21111111 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                int i21111112 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                qim0 qim0Var1112 = qim0Var3;
                RiveImpl(riveFile, qim0Var1112, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i21111111, i21111112);
                qim0Var4 = qim0Var1112;
                z5 = z4;
                artboard4 = artboard3;
                stateMachine4 = stateMachine3;
                viewModelInstance4 = viewModelInstance3;
                fit3 = fit2;
                i24 = i23;
                rivePointerInputMode3 = rivePointerInputMode2;
                riveFrameRate3 = riveFrameRate2;
                riveSemanticsMode3 = riveSemanticsMode2;
                iu30Var3 = iu30Var2;
            } else {
                x340Var.d0();
                if ((i2 & 1) != 0) {
                    if (i26 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i9 != 0) {
                        stateMachine2 = null;
                    } else {
                        stateMachine2 = stateMachine;
                    }
                    if (i10 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if ((i4 & 64) != 0) {
                        fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                        i5 &= -3670017;
                    }
                    if (i11 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i12;
                    }
                    if (i14 != 0) {
                        rivePointerInputMode2 = RivePointerInputMode.Consume;
                    } else {
                        rivePointerInputMode2 = rivePointerInputMode;
                    }
                    if (i16 != 0) {
                        riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                    } else {
                        riveFrameRate2 = riveFrameRate;
                    }
                    if (i18 != 0) {
                        riveSemanticsMode2 = RiveSemanticsMode.Off;
                    } else {
                        riveSemanticsMode2 = riveSemanticsMode;
                    }
                    if (i21 != 0) {
                        iu30Var2 = null;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    artboard3 = artboard2;
                    stateMachine3 = stateMachine2;
                    fit2 = fitDefaultFit;
                    z4 = z3;
                    viewModelInstance3 = viewModelInstance2;
                } else {
                    if (i26 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i8 != 0) {
                        artboard2 = null;
                    } else {
                        artboard2 = artboard;
                    }
                    if (i9 != 0) {
                        stateMachine2 = null;
                    } else {
                        stateMachine2 = stateMachine;
                    }
                    if (i10 != 0) {
                        viewModelInstance2 = null;
                    } else {
                        viewModelInstance2 = viewModelInstance;
                    }
                    if ((i4 & 64) != 0) {
                        fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                        i5 &= -3670017;
                    }
                    if (i11 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i12;
                    }
                    if (i14 != 0) {
                        rivePointerInputMode2 = RivePointerInputMode.Consume;
                    } else {
                        rivePointerInputMode2 = rivePointerInputMode;
                    }
                    if (i16 != 0) {
                        riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                    } else {
                        riveFrameRate2 = riveFrameRate;
                    }
                    if (i18 != 0) {
                        riveSemanticsMode2 = RiveSemanticsMode.Off;
                    } else {
                        riveSemanticsMode2 = riveSemanticsMode;
                    }
                    if (i21 != 0) {
                        iu30Var2 = null;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    artboard3 = artboard2;
                    stateMachine3 = stateMachine2;
                    fit2 = fitDefaultFit;
                    z4 = z3;
                    viewModelInstance3 = viewModelInstance2;
                }
                x340Var.s();
                int i21111113 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
                int i21111114 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
                qim0 qim0Var1113 = qim0Var3;
                RiveImpl(riveFile, qim0Var1113, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i21111113, i21111114);
                qim0Var4 = qim0Var1113;
                z5 = z4;
                artboard4 = artboard3;
                stateMachine4 = stateMachine3;
                viewModelInstance4 = viewModelInstance3;
                fit3 = fit2;
                i24 = i23;
                rivePointerInputMode3 = rivePointerInputMode2;
                riveFrameRate3 = riveFrameRate2;
                riveSemanticsMode3 = riveSemanticsMode2;
                iu30Var3 = iu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new C00341(riveFile, qim0Var4, z5, artboard4, stateMachine4, viewModelInstance4, fit3, i24, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var3, i2, i3, i4);
            }
        }
        i19 |= 48;
        if ((i4 & 56) != 56) {
            x340Var.d0();
            if ((i2 & 1) != 0) {
                if (i26 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    artboard2 = null;
                } else {
                    artboard2 = artboard;
                }
                if (i9 != 0) {
                    stateMachine2 = null;
                } else {
                    stateMachine2 = stateMachine;
                }
                if (i10 != 0) {
                    viewModelInstance2 = null;
                } else {
                    viewModelInstance2 = viewModelInstance;
                }
                if ((i4 & 64) != 0) {
                    fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                    i5 &= -3670017;
                }
                if (i11 != 0) {
                    i23 = 0;
                } else {
                    i23 = i12;
                }
                if (i14 != 0) {
                    rivePointerInputMode2 = RivePointerInputMode.Consume;
                } else {
                    rivePointerInputMode2 = rivePointerInputMode;
                }
                if (i16 != 0) {
                    riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                } else {
                    riveFrameRate2 = riveFrameRate;
                }
                if (i18 != 0) {
                    riveSemanticsMode2 = RiveSemanticsMode.Off;
                } else {
                    riveSemanticsMode2 = riveSemanticsMode;
                }
                if (i21 != 0) {
                    iu30Var2 = null;
                } else {
                    iu30Var2 = iu30Var;
                }
                artboard3 = artboard2;
                stateMachine3 = stateMachine2;
                fit2 = fitDefaultFit;
                z4 = z3;
                viewModelInstance3 = viewModelInstance2;
            } else {
                if (i26 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    artboard2 = null;
                } else {
                    artboard2 = artboard;
                }
                if (i9 != 0) {
                    stateMachine2 = null;
                } else {
                    stateMachine2 = stateMachine;
                }
                if (i10 != 0) {
                    viewModelInstance2 = null;
                } else {
                    viewModelInstance2 = viewModelInstance;
                }
                if ((i4 & 64) != 0) {
                    fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                    i5 &= -3670017;
                }
                if (i11 != 0) {
                    i23 = 0;
                } else {
                    i23 = i12;
                }
                if (i14 != 0) {
                    rivePointerInputMode2 = RivePointerInputMode.Consume;
                } else {
                    rivePointerInputMode2 = rivePointerInputMode;
                }
                if (i16 != 0) {
                    riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                } else {
                    riveFrameRate2 = riveFrameRate;
                }
                if (i18 != 0) {
                    riveSemanticsMode2 = RiveSemanticsMode.Off;
                } else {
                    riveSemanticsMode2 = riveSemanticsMode;
                }
                if (i21 != 0) {
                    iu30Var2 = null;
                } else {
                    iu30Var2 = iu30Var;
                }
                artboard3 = artboard2;
                stateMachine3 = stateMachine2;
                fit2 = fitDefaultFit;
                z4 = z3;
                viewModelInstance3 = viewModelInstance2;
            }
            x340Var.s();
            int i21111115 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
            int i21111116 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
            qim0 qim0Var1114 = qim0Var3;
            RiveImpl(riveFile, qim0Var1114, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i21111115, i21111116);
            qim0Var4 = qim0Var1114;
            z5 = z4;
            artboard4 = artboard3;
            stateMachine4 = stateMachine3;
            viewModelInstance4 = viewModelInstance3;
            fit3 = fit2;
            i24 = i23;
            rivePointerInputMode3 = rivePointerInputMode2;
            riveFrameRate3 = riveFrameRate2;
            riveSemanticsMode3 = riveSemanticsMode2;
            iu30Var3 = iu30Var2;
        } else {
            x340Var.d0();
            if ((i2 & 1) != 0) {
                if (i26 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    artboard2 = null;
                } else {
                    artboard2 = artboard;
                }
                if (i9 != 0) {
                    stateMachine2 = null;
                } else {
                    stateMachine2 = stateMachine;
                }
                if (i10 != 0) {
                    viewModelInstance2 = null;
                } else {
                    viewModelInstance2 = viewModelInstance;
                }
                if ((i4 & 64) != 0) {
                    fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                    i5 &= -3670017;
                }
                if (i11 != 0) {
                    i23 = 0;
                } else {
                    i23 = i12;
                }
                if (i14 != 0) {
                    rivePointerInputMode2 = RivePointerInputMode.Consume;
                } else {
                    rivePointerInputMode2 = rivePointerInputMode;
                }
                if (i16 != 0) {
                    riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                } else {
                    riveFrameRate2 = riveFrameRate;
                }
                if (i18 != 0) {
                    riveSemanticsMode2 = RiveSemanticsMode.Off;
                } else {
                    riveSemanticsMode2 = riveSemanticsMode;
                }
                if (i21 != 0) {
                    iu30Var2 = null;
                } else {
                    iu30Var2 = iu30Var;
                }
                artboard3 = artboard2;
                stateMachine3 = stateMachine2;
                fit2 = fitDefaultFit;
                z4 = z3;
                viewModelInstance3 = viewModelInstance2;
            } else {
                if (i26 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (i8 != 0) {
                    artboard2 = null;
                } else {
                    artboard2 = artboard;
                }
                if (i9 != 0) {
                    stateMachine2 = null;
                } else {
                    stateMachine2 = stateMachine;
                }
                if (i10 != 0) {
                    viewModelInstance2 = null;
                } else {
                    viewModelInstance2 = viewModelInstance;
                }
                if ((i4 & 64) != 0) {
                    fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
                    i5 &= -3670017;
                }
                if (i11 != 0) {
                    i23 = 0;
                } else {
                    i23 = i12;
                }
                if (i14 != 0) {
                    rivePointerInputMode2 = RivePointerInputMode.Consume;
                } else {
                    rivePointerInputMode2 = rivePointerInputMode;
                }
                if (i16 != 0) {
                    riveFrameRate2 = RiveFrameRate.Unbounded.INSTANCE;
                } else {
                    riveFrameRate2 = riveFrameRate;
                }
                if (i18 != 0) {
                    riveSemanticsMode2 = RiveSemanticsMode.Off;
                } else {
                    riveSemanticsMode2 = riveSemanticsMode;
                }
                if (i21 != 0) {
                    iu30Var2 = null;
                } else {
                    iu30Var2 = iu30Var;
                }
                artboard3 = artboard2;
                stateMachine3 = stateMachine2;
                fit2 = fitDefaultFit;
                z4 = z3;
                viewModelInstance3 = viewModelInstance2;
            }
            x340Var.s();
            int i21111117 = (234881024 & i5) | (29360128 & i5) | (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (i5 & 3670016) | (1879048192 & i5);
            int i21111118 = (i19 & 14) | 384 | (i19 & ContentType.LONG_FORM_ON_DEMAND);
            qim0 qim0Var1115 = qim0Var3;
            RiveImpl(riveFile, qim0Var1115, z4, artboard3, stateMachine3, viewModelInstance3, fit2, i23, rivePointerInputMode2, riveFrameRate2, riveSemanticsMode2, iu30Var2, b7x.a, x340Var, i21111117, i21111118);
            qim0Var4 = qim0Var1115;
            z5 = z4;
            artboard4 = artboard3;
            stateMachine4 = stateMachine3;
            viewModelInstance4 = viewModelInstance3;
            fit3 = fit2;
            i24 = i23;
            rivePointerInputMode3 = rivePointerInputMode2;
            riveFrameRate3 = riveFrameRate2;
            riveSemanticsMode3 = riveSemanticsMode2;
            iu30Var3 = iu30Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new C00341(riveFile, qim0Var4, z5, artboard4, stateMachine4, viewModelInstance4, fit3, i24, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var3, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RiveImpl(RiveFile riveFile, qim0 qim0Var, boolean z, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RivePointerInputMode rivePointerInputMode, RiveFrameRate riveFrameRate, RiveSemanticsMode riveSemanticsMode, iu30 iu30Var, Map<String, ViewModelInstance> map, b0k b0kVar, int i2, int i3) {
        x340 x340Var;
        StateMachine stateMachine2;
        Artboard artboard2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-53442414);
        Map mapU = sqg0.U(map);
        validateRiveResourceArguments(riveFile, artboard, stateMachine, viewModelInstance, mapU);
        RiveLog.INSTANCE.getLogger().v(GENERAL_TAG, C00361.INSTANCE);
        iac0 iac0Var = (iac0) x340Var2.k(jfe0.a);
        boolean zRememberRiveSemanticsEnabled = AccessibilityKt.rememberRiveSemanticsEnabled(riveSemanticsMode, x340Var2, i3 & 14);
        CommandQueue riveWorker = riveFile.getRiveWorker();
        ReadyResources readyResourcesRememberReadyResources = rememberReadyResources(riveFile, artboard, stateMachine, x340Var2, (i2 & 14) | 576);
        x340Var2.f0(1966083608, riveWorker);
        RebuggerWrapperKt.RebuggerWrapper(sqg0.J(new mmr0[]{new mmr0("file", riveFile), new mmr0("playing", Boolean.valueOf(z)), new mmr0("frameRate", riveFrameRate), new mmr0("artboard", artboard), new mmr0("artboardHandle", (readyResourcesRememberReadyResources == null || (artboard2 = readyResourcesRememberReadyResources.getArtboard()) == null) ? null : ArtboardHandle.m178boximpl(artboard2.getArtboardHandle())), new mmr0("stateMachine", stateMachine), new mmr0("stateMachineHandle", (readyResourcesRememberReadyResources == null || (stateMachine2 = readyResourcesRememberReadyResources.getStateMachine()) == null) ? null : StateMachineHandle.m434boximpl(stateMachine2.getStateMachineHandle())), new mmr0("viewModelInstance", viewModelInstance), new mmr0("globalViewModelInstances", mapU), new mmr0("fit", fit), new mmr0("backgroundColor", Integer.valueOf(i)), new mmr0("semantics", riveSemanticsMode), new mmr0("semanticsEnabled", Boolean.valueOf(zRememberRiveSemanticsEnabled)), new mmr0("lifecycleOwner", iac0Var)}), x340Var2, 8);
        RiveSurfaceState riveSurfaceStateRememberRiveSurfaceState = rememberRiveSurfaceState(x340Var2, 0);
        x340Var2.i0(1966112930);
        Object objT = x340Var2.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = bb00.h(0, x340Var2);
        }
        hdn0 hdn0Var = (hdn0) objT;
        x340Var2.r(false);
        int i4 = i2 >> 6;
        ven0 ven0VarS = v8r.s(Boolean.valueOf(z), x340Var2);
        x340Var2.i0(1966117061);
        boolean zG = x340Var2.g(ven0VarS);
        Object objT2 = x340Var2.T();
        if (zG || objT2 == m4cVar) {
            objT2 = new RiveKt$RiveImpl$requestPausedFrame$1$1(ven0VarS, hdn0Var);
            x340Var2.s0(objT2);
        }
        Function0 function0 = (Function0) objT2;
        x340Var2.r(false);
        int i5 = i4 & 57344;
        int i6 = i2 >> 9;
        RiveSurfaceHost(riveWorker, riveSurfaceStateRememberRiveSurfaceState, readyResourcesRememberReadyResources, qim0Var, fit, rivePointerInputMode, riveFrameRate, z, iu30Var, function0, x340Var2, ((i2 << 6) & 7168) | 520 | i5 | (i6 & 458752) | (i6 & 3670016) | ((i2 << 15) & 29360128) | ((i3 << 21) & 234881024));
        if (readyResourcesRememberReadyResources != null) {
            RiveResourceEffects(riveWorker, readyResourcesRememberReadyResources, viewModelInstance, mapU, fit, i, z, riveFrameRate, iac0Var, riveSurfaceStateRememberRiveSurfaceState.getSurface(), riveSurfaceStateRememberRiveSurfaceState.getWidth(), riveSurfaceStateRememberRiveSurfaceState.getHeight(), RiveImpl$lambda$2(hdn0Var), function0, riveSurfaceStateRememberRiveSurfaceState.getTextureView(), zRememberRiveSemanticsEnabled, x340Var2, (i4 & 458752) | i5 | 1207964232 | ((i2 << 12) & 3670016) | (i4 & 29360128), 32768);
            x340Var = x340Var2;
        } else {
            x340Var = x340Var2;
        }
        x340Var.r(false);
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new C00372(riveFile, qim0Var, z, artboard, stateMachine, viewModelInstance, fit, i, rivePointerInputMode, riveFrameRate, riveSemanticsMode, iu30Var, map, i2, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RiveImpl$lambda$2(hdn0 hdn0Var) {
        return ((err0) hdn0Var).s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RiveImpl$lambda$3(hdn0 hdn0Var, int i) {
        ((err0) hdn0Var).t(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RiveImpl$lambda$4(tob1 tob1Var) {
        return ((Boolean) tob1Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RiveResourceEffects(CommandQueue commandQueue, ReadyResources readyResources, ViewModelInstance viewModelInstance, Map<String, ViewModelInstance> map, Fit fit, int i, boolean z, RiveFrameRate riveFrameRate, iac0 iac0Var, RiveSurface riveSurface, int i2, int i3, int i4, Function0 function0, RiveTextureView riveTextureView, boolean z2, b0k b0kVar, int i5, int i6) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1197045338);
        Artboard artboard = readyResources.getArtboard();
        StateMachine stateMachine = readyResources.getStateMachine();
        BindViewModelInstancesEffect(commandQueue, stateMachine, viewModelInstance, map, function0, x340Var, ((i6 << 3) & 57344) | 4680);
        RiveSemanticsEffects(stateMachine, riveTextureView, z2, function0, x340Var, ((i6 >> 9) & 896) | 72 | (i6 & 7168));
        int i7 = i5 >> 6;
        UnsettleOnPresentationChangeEffect(commandQueue, stateMachine, fit, i, x340Var, (i7 & 896) | 72 | (i7 & 7168));
        UnsettleOnPlaybackStartEffect(commandQueue, stateMachine, z, x340Var, ((i5 >> 12) & 896) | 72);
        int i8 = i6 << 15;
        UpdateArtboardLayoutEffect(commandQueue, artboard, stateMachine, fit, riveSurface, i2, i3, x340Var, ((i5 >> 3) & 7168) | 33352 | (458752 & i8) | (i8 & 3670016));
        int i9 = i5 << 9;
        int i10 = i6 >> 3;
        int i11 = i6 << 6;
        DrawRiveFramesEffect(commandQueue, iac0Var, riveSurface, artboard, stateMachine, viewModelInstance, map, fit, i, z, riveFrameRate, i4, i2, i3, z2, x340Var, (29360128 & i9) | 2396744 | (234881024 & i9) | (i9 & 1879048192), ((i5 >> 21) & 14) | (i10 & ContentType.LONG_FORM_ON_DEMAND) | (i11 & 896) | (i11 & 7168) | (i10 & 57344));
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new C00381(commandQueue, readyResources, viewModelInstance, map, fit, i, z, riveFrameRate, iac0Var, riveSurface, i2, i3, i4, function0, riveTextureView, z2, i5, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RiveSemanticsEffects(StateMachine stateMachine, RiveTextureView riveTextureView, boolean z, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-444424114);
        x340Var.i0(305065514);
        boolean zG = x340Var.g(stateMachine);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = stateMachine.getSemanticTree();
            x340Var.s0(objT);
        }
        SemanticTreeModel semanticTreeModel = (SemanticTreeModel) objT;
        x340Var.r(false);
        qxd0.h(stateMachine, Boolean.valueOf(z), new C00391(z, stateMachine), x340Var);
        qxd0.j(new Object[]{riveTextureView, stateMachine, semanticTreeModel, Boolean.valueOf(z)}, new C00402(riveTextureView, z, semanticTreeModel, stateMachine, function0), x340Var);
        qxd0.r(riveTextureView, semanticTreeModel, Boolean.valueOf(z), new AnonymousClass3(riveTextureView, z, semanticTreeModel, null), x340Var);
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new AnonymousClass4(stateMachine, riveTextureView, z, function0, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RiveSurfaceHost(CommandQueue commandQueue, RiveSurfaceState riveSurfaceState, ReadyResources readyResources, qim0 qim0Var, Fit fit, RivePointerInputMode rivePointerInputMode, RiveFrameRate riveFrameRate, boolean z, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) {
        StateMachine stateMachine;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(288118154);
        RiveSurface surface = riveSurfaceState.getSurface();
        int width = riveSurfaceState.getWidth();
        int height = riveSurfaceState.getHeight();
        zob1 settled$kotlin_release = (readyResources == null || (stateMachine = readyResources.getStateMachine()) == null) ? null : stateMachine.getSettled();
        x340Var.i0(-2078310556);
        tob1 tob1VarH = settled$kotlin_release == null ? null : rwq.h(settled$kotlin_release, x340Var, 8);
        x340Var.r(false);
        boolean zBooleanValue = tob1VarH != null ? ((Boolean) tob1VarH.getValue()).booleanValue() : true;
        qxd0.i(surface, new C00411(surface), x340Var);
        ven0 ven0VarS = v8r.s(iu30Var, x340Var);
        x340Var.i0(-2078297642);
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = v8r.q(Boolean.FALSE);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        x340Var.r(false);
        RiveTextureView textureView = riveSurfaceState.getTextureView();
        qxd0.i(textureView, new C00422(riveSurfaceState, textureView), x340Var);
        qim0 qim0VarRivePointerInput = rivePointerInput(qim0Var, commandQueue, readyResources != null ? readyResources.getStateMachine() : null, fit, width, height, rivePointerInputMode, function0);
        C00434 c00434 = new gfh0() { // from class: app.rive.RiveKt.RiveSurfaceHost.4
            public /* bridge */ /* synthetic */ int maxIntrinsicHeight(p890 p890Var, List list, int i2) {
                return super.maxIntrinsicHeight(p890Var, list, i2);
            }

            public /* bridge */ /* synthetic */ int maxIntrinsicWidth(p890 p890Var, List list, int i2) {
                return super.maxIntrinsicWidth(p890Var, list, i2);
            }

            /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
            public final hfh0 m81measure3p2s80s(ifh0 ifh0Var, List<? extends afh0> list, long j) {
                q5t0 q5t0VarH = ((afh0) o7h.V0(list)).H(j);
                return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new AnonymousClass1(q5t0VarH));
            }

            public /* bridge */ /* synthetic */ int minIntrinsicHeight(p890 p890Var, List list, int i2) {
                return super.minIntrinsicHeight(p890Var, list, i2);
            }

            public /* bridge */ /* synthetic */ int minIntrinsicWidth(p890 p890Var, List list, int i2) {
                return super.minIntrinsicWidth(p890Var, list, i2);
            }

            /* JADX INFO: renamed from: app.rive.RiveKt$RiveSurfaceHost$4$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/p5t0;", "Lp/rih1;", "invoke", "(Lp/p5t0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass1 extends hab0 implements iu30 {
                final /* synthetic */ q5t0 $placeable;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(q5t0 q5t0Var) {
                    super(1);
                    this.$placeable = q5t0Var;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((p5t0) obj);
                    return rih1.a;
                }

                public final void invoke(p5t0 p5t0Var) {
                    p5t0Var.f(this.$placeable, 0, 0, 0.0f);
                }
            }
        };
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarRivePointerInput);
        hzj.A.getClass();
        if (x340Var.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var.m0();
        if (x340Var.S) {
            x340Var.l(hmb0.t1);
        } else {
            x340Var.v0();
        }
        nko1.H(c00434, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        llj lljVar = y580.R0;
        if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iHashCode))) {
            z5c.f(iHashCode, x340Var, iHashCode, lljVar);
        }
        nko1.H(qim0VarE, x340Var, y580.Y);
        dm5.a(new RiveKt$RiveSurfaceHost$3$1(riveSurfaceState, commandQueue, ven0Var, ven0VarS), (qim0) null, new RiveKt$RiveSurfaceHost$3$2(riveFrameRate, z, zBooleanValue), x340Var, 0, 2);
        x340Var.r(true);
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new AnonymousClass5(commandQueue, riveSurfaceState, readyResources, qim0Var, fit, rivePointerInputMode, riveFrameRate, z, iu30Var, function0, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RiveSurfaceHost$lambda$11(ven0 ven0Var) {
        return ((Boolean) ven0Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RiveSurfaceHost$lambda$12(ven0 ven0Var, boolean z) {
        ven0Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iu30 RiveSurfaceHost$lambda$9(tob1 tob1Var) {
        return (iu30) tob1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UnsettleOnPlaybackStartEffect(CommandQueue commandQueue, StateMachine stateMachine, boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2090632862);
        qxd0.r(commandQueue, stateMachine, Boolean.valueOf(z), new C00441(z, stateMachine, null), x340Var);
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new C00452(commandQueue, stateMachine, z, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UnsettleOnPresentationChangeEffect(CommandQueue commandQueue, StateMachine stateMachine, Fit fit, int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-612287663);
        qxd0.u(new Object[]{commandQueue, stateMachine, fit, Integer.valueOf(i)}, new C00461(stateMachine, stateMachine.getStateMachineHandle(), null), x340Var);
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new C00472(commandQueue, stateMachine, fit, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UpdateArtboardLayoutEffect(CommandQueue commandQueue, Artboard artboard, StateMachine stateMachine, Fit fit, RiveSurface riveSurface, int i, int i2, b0k b0kVar, int i3) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1024631385);
        qxd0.u(new Object[]{commandQueue, artboard, stateMachine, fit, riveSurface, Integer.valueOf(i), Integer.valueOf(i2)}, new C00481(riveSurface, fit, stateMachine, artboard, i, i2, null), x340Var);
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new C00492(commandQueue, artboard, stateMachine, fit, riveSurface, i, i2, i3);
        }
    }

    private static final ReadyResources rememberReadyResources(RiveFile riveFile, Artboard artboard, StateMachine stateMachine, b0k b0kVar, int i) {
        Artboard artboard2;
        StateMachine stateMachine2;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-316167209);
        Result<Artboard> success = artboard != null ? new Result.Success<>(artboard) : null;
        x340Var.i0(-248131762);
        if (success == null) {
            success = ArtboardKt.rememberArtboardResult(riveFile, null, x340Var, i & 14, 2);
        }
        x340Var.r(false);
        Result.Success success2 = success instanceof Result.Success ? (Result.Success) success : null;
        if (success2 == null || (artboard2 = (Artboard) success2.getValue()) == null) {
            x340Var.r(false);
            return null;
        }
        Result<StateMachine> success3 = stateMachine != null ? new Result.Success<>(stateMachine) : null;
        if (success3 == null) {
            success3 = StateMachineKt.rememberStateMachineResult(artboard2, null, x340Var, 8, 2);
        }
        Result.Success success4 = success3 instanceof Result.Success ? (Result.Success) success3 : null;
        if (success4 == null || (stateMachine2 = (StateMachine) success4.getValue()) == null) {
            x340Var.r(false);
            return null;
        }
        ReadyResources readyResources = new ReadyResources(artboard2, stateMachine2);
        x340Var.r(false);
        return readyResources;
    }

    private static final RiveSurfaceState rememberRiveSurfaceState(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1554919004);
        x340Var.i0(373157809);
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = new RiveSurfaceState();
            x340Var.s0(objT);
        }
        RiveSurfaceState riveSurfaceState = (RiveSurfaceState) objT;
        x340Var.r(false);
        x340Var.r(false);
        return riveSurfaceState;
    }

    private static final qim0 rivePointerInput(qim0 qim0Var, CommandQueue commandQueue, StateMachine stateMachine, Fit fit, int i, int i2, RivePointerInputMode rivePointerInputMode, Function0 function0) {
        return stateMachine == null ? qim0Var : qim0Var.then(new rivePointerInput.1(rivePointerInputMode, stateMachine, commandQueue, function0, stateMachine.getStateMachineHandle(), fit, i, i2));
    }

    public static final void validateRiveResourceArguments(RiveFile riveFile, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Map<String, ViewModelInstance> map) {
        riveFile.checkOpen$kotlin_release();
        if (artboard != null) {
            artboard.checkOpen$kotlin_release();
        }
        if (stateMachine != null) {
            stateMachine.checkOpen$kotlin_release();
        }
        if (viewModelInstance != null) {
            viewModelInstance.checkOpen$kotlin_release();
        }
        Iterator<T> it = map.values().iterator();
        while (it.hasNext()) {
            ((ViewModelInstance) it.next()).checkOpen$kotlin_release();
        }
        if (artboard != null) {
            artboard.requireFromFile$kotlin_release(riveFile);
        }
        if (stateMachine != null) {
            if (artboard == null) {
                throw new RiveIncompatibleResourceException(f4i1.f("StateMachine ", StateMachineHandle.m439toStringimpl(stateMachine.getStateMachineHandle()), " requires its originating Artboard"));
            }
            stateMachine.requireFromArtboard$kotlin_release(artboard);
        }
        if (viewModelInstance != null) {
            viewModelInstance.requireOwnedBy$kotlin_release(riveFile.getRiveWorker());
        }
        Iterator<T> it2 = map.values().iterator();
        while (it2.hasNext()) {
            ((ViewModelInstance) it2.next()).requireOwnedBy$kotlin_release(riveFile.getRiveWorker());
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$DrawRiveFramesEffect$1, reason: invalid class name and case insensitive filesystem */
    @q8r(c = "app.rive.RiveKt$DrawRiveFramesEffect$1", f = "Rive.kt", l = {1089}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
    public static final class C00321 extends a8d1 implements vu30 {
        final /* synthetic */ long $artboardHandle;
        final /* synthetic */ int $backgroundColor;
        final /* synthetic */ Fit $fit;
        final /* synthetic */ RiveFrameRate $frameRate;
        final /* synthetic */ iac0 $lifecycleOwner;
        final /* synthetic */ boolean $playing;
        final /* synthetic */ CommandQueue $riveWorker;
        final /* synthetic */ boolean $semanticsEnabled;
        final /* synthetic */ StateMachine $stateMachine;
        final /* synthetic */ long $stateMachineHandle;
        final /* synthetic */ RiveSurface $surface;
        final /* synthetic */ int $surfaceHeight;
        final /* synthetic */ int $surfaceWidth;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00321(RiveSurface riveSurface, boolean z, iac0 iac0Var, boolean z2, int i, int i2, StateMachine stateMachine, Fit fit, CommandQueue commandQueue, long j, long j2, int i3, RiveFrameRate riveFrameRate, lnm<? super C00321> lnmVar) {
            super(2, lnmVar);
            this.$surface = riveSurface;
            this.$playing = z;
            this.$lifecycleOwner = iac0Var;
            this.$semanticsEnabled = z2;
            this.$surfaceWidth = i;
            this.$surfaceHeight = i2;
            this.$stateMachine = stateMachine;
            this.$fit = fit;
            this.$riveWorker = commandQueue;
            this.$artboardHandle = j;
            this.$stateMachineHandle = j2;
            this.$backgroundColor = i3;
            this.$frameRate = riveFrameRate;
        }

        public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
            C00321 c00321 = new C00321(this.$surface, this.$playing, this.$lifecycleOwner, this.$semanticsEnabled, this.$surfaceWidth, this.$surfaceHeight, this.$stateMachine, this.$fit, this.$riveWorker, this.$artboardHandle, this.$stateMachineHandle, this.$backgroundColor, this.$frameRate, lnmVar);
            c00321.L$0 = obj;
            return c00321;
        }

        public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
            return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
        }

        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            rih1 rih1Var = rih1.a;
            if (i == 0) {
                hm5.M(obj);
                RiveSurface riveSurface = this.$surface;
                if (riveSurface == null) {
                    RiveLog.INSTANCE.getLogger().d(RiveKt.DRAW_TAG, RiveKt$DrawRiveFramesEffect$1$activeSurface$1$1.INSTANCE);
                    return rih1Var;
                }
                if (riveSurface.getClosed()) {
                    RiveLog.INSTANCE.getLogger().d(RiveKt.DRAW_TAG, C00061.INSTANCE);
                    return rih1Var;
                }
                if (!this.$playing) {
                    RiveLog.INSTANCE.getLogger().d(RiveKt.DRAW_TAG, AnonymousClass2.INSTANCE);
                    boolean z = this.$semanticsEnabled;
                    int i2 = this.$surfaceWidth;
                    int i3 = this.$surfaceHeight;
                    StateMachine stateMachine = this.$stateMachine;
                    Fit fit = this.$fit;
                    CommandQueue commandQueue = this.$riveWorker;
                    long j = this.$artboardHandle;
                    long j2 = this.$stateMachineHandle;
                    int i4 = this.$backgroundColor;
                    Trace.beginSection("Rive/Frame");
                    try {
                        Trace.beginSection("Rive/Frame/Advance");
                        try {
                            ytw0 ytw0Var = jfv.b;
                            stateMachine.m100advanceLRDsOJo(fdg1.k0(0, ngv.b));
                            Trace.endSection();
                            if (z && i2 > 0 && i3 > 0) {
                                stateMachine.drainSemanticsDiff(fit, i2, i3);
                            }
                            Trace.beginSection("Rive/Frame/Draw");
                            try {
                                commandQueue.m232drawOcc3x_Y(j, j2, riveSurface, fit, i4);
                                Trace.endSection();
                                return rih1Var;
                            } finally {
                                Trace.endSection();
                            }
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                x8c0 lifecycle = this.$lifecycleOwner.getLifecycle();
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$frameRate, this.$stateMachine, riveSurface, this.$artboardHandle, this.$stateMachineHandle, this.$semanticsEnabled, this.$surfaceWidth, this.$surfaceHeight, this.$riveWorker, this.$fit, this.$backgroundColor, null);
                this.label = 1;
                Object objT = z8p1.t(lifecycle, w8c0.e, anonymousClass4, this);
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
            return rih1Var;
        }

        /* JADX INFO: renamed from: app.rive.RiveKt$DrawRiveFramesEffect$1$4, reason: invalid class name */
        @q8r(c = "app.rive.RiveKt$DrawRiveFramesEffect$1$4", f = "Rive.kt", l = {1098, 1107, 1113}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/c9n;", "Lp/rih1;", "<anonymous>", "(Lp/c9n;)V"}, k = 3, mv = {1, 9, 0})
        public static final class AnonymousClass4 extends a8d1 implements vu30 {
            final /* synthetic */ RiveSurface $activeSurface;
            final /* synthetic */ long $artboardHandle;
            final /* synthetic */ int $backgroundColor;
            final /* synthetic */ Fit $fit;
            final /* synthetic */ RiveFrameRate $frameRate;
            final /* synthetic */ CommandQueue $riveWorker;
            final /* synthetic */ boolean $semanticsEnabled;
            final /* synthetic */ StateMachine $stateMachine;
            final /* synthetic */ long $stateMachineHandle;
            final /* synthetic */ int $surfaceHeight;
            final /* synthetic */ int $surfaceWidth;
            long J$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX INFO: renamed from: app.rive.RiveKt$DrawRiveFramesEffect$1$4$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C00071 extends hab0 implements Function0 {
                final /* synthetic */ long $artboardHandle;
                final /* synthetic */ long $stateMachineHandle;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00071(long j, long j2) {
                    super(0);
                    this.$artboardHandle = j;
                    this.$stateMachineHandle = j2;
                }

                public final String invoke() {
                    return gvg.h("Starting drawing with ", ArtboardHandle.m183toStringimpl(this.$artboardHandle), " and ", StateMachineHandle.m439toStringimpl(this.$stateMachineHandle));
                }
            }

            /* JADX INFO: renamed from: app.rive.RiveKt$DrawRiveFramesEffect$1$4$5, reason: invalid class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class AnonymousClass5 extends hab0 implements Function0 {
                final /* synthetic */ long $artboardHandle;
                final /* synthetic */ long $stateMachineHandle;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(long j, long j2) {
                    super(0);
                    this.$artboardHandle = j;
                    this.$stateMachineHandle = j2;
                }

                public final String invoke() {
                    return gvg.h("Ending drawing with ", ArtboardHandle.m183toStringimpl(this.$artboardHandle), " and ", StateMachineHandle.m439toStringimpl(this.$stateMachineHandle));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(RiveFrameRate riveFrameRate, StateMachine stateMachine, RiveSurface riveSurface, long j, long j2, boolean z, int i, int i2, CommandQueue commandQueue, Fit fit, int i3, lnm<? super AnonymousClass4> lnmVar) {
                super(2, lnmVar);
                this.$frameRate = riveFrameRate;
                this.$stateMachine = stateMachine;
                this.$activeSurface = riveSurface;
                this.$artboardHandle = j;
                this.$stateMachineHandle = j2;
                this.$semanticsEnabled = z;
                this.$surfaceWidth = i;
                this.$surfaceHeight = i2;
                this.$riveWorker = commandQueue;
                this.$fit = fit;
                this.$backgroundColor = i3;
            }

            public final lnm<rih1> create(Object obj, lnm<?> lnmVar) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$frameRate, this.$stateMachine, this.$activeSurface, this.$artboardHandle, this.$stateMachineHandle, this.$semanticsEnabled, this.$surfaceWidth, this.$surfaceHeight, this.$riveWorker, this.$fit, this.$backgroundColor, lnmVar);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(c9n c9nVar, lnm<? super rih1> lnmVar) {
                return create(c9nVar, lnmVar).invokeSuspend(rih1.a);
            }

            /* JADX WARN: Code duplicated, block: B:18:0x007d  */
            /* JADX WARN: Code duplicated, block: B:20:0x008f  */
            /* JADX WARN: Code duplicated, block: B:23:0x00ab  */
            /* JADX WARN: Code duplicated, block: B:24:0x00ac A[Catch: all -> 0x00b8, PHI: r1 r2 r4 r5 r6 r8 r11 r13
              0x00ac: PHI (r1v5 app.rive.RiveFramePacer) = (r1v6 app.rive.RiveFramePacer), (r1v16 app.rive.RiveFramePacer) binds: [B:22:0x00a9, B:13:0x0049] A[DONT_GENERATE, DONT_INLINE]
              0x00ac: PHI (r2v2 p.lnm) = (r2v3 p.lnm), (r2v0 p.lnm) binds: [B:22:0x00a9, B:13:0x0049] A[DONT_GENERATE, DONT_INLINE]
              0x00ac: PHI (r4v2 int) = (r4v3 int), (r4v0 int) binds: [B:22:0x00a9, B:13:0x0049] A[DONT_GENERATE, DONT_INLINE]
              0x00ac: PHI (r5v2 int) = (r5v3 int), (r5v0 int) binds: [B:22:0x00a9, B:13:0x0049] A[DONT_GENERATE, DONT_INLINE]
              0x00ac: PHI (r6v2 int) = (r6v3 int), (r6v0 int) binds: [B:22:0x00a9, B:13:0x0049] A[DONT_GENERATE, DONT_INLINE]
              0x00ac: PHI (r8v2 long) = (r8v3 long), (r8v0 long) binds: [B:22:0x00a9, B:13:0x0049] A[DONT_GENERATE, DONT_INLINE]
              0x00ac: PHI (r11v4 java.lang.Object) = (r11v10 java.lang.Object), (r11v19 java.lang.Object) binds: [B:22:0x00a9, B:13:0x0049] A[DONT_GENERATE, DONT_INLINE]
              0x00ac: PHI (r13v3 p.c9n) = (r13v4 p.c9n), (r13v6 p.c9n) binds: [B:22:0x00a9, B:13:0x0049] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x00b8, blocks: (B:21:0x0096, B:24:0x00ac, B:12:0x0046), top: B:81:0x0046 }] */
            /* JADX WARN: Code duplicated, block: B:77:0x01c4  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ea -> B:16:0x0077). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0103 -> B:40:0x0106). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            public final java.lang.Object invokeSuspend(java.lang.Object r30) {
                /*
                    Method dump skipped, instruction units count: 471
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: app.p000rive.RiveKt.C00321.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX INFO: renamed from: app.rive.RiveKt$DrawRiveFramesEffect$1$4$3, reason: invalid class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class AnonymousClass3 extends hab0 implements Function0 {
                public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

                public AnonymousClass3() {
                    super(0);
                }

                public final String invoke() {
                    return "Surface was released, stopping draw loop";
                }
            }
        }

        /* JADX INFO: renamed from: app.rive.RiveKt$DrawRiveFramesEffect$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C00061 extends hab0 implements Function0 {
            public static final C00061 INSTANCE = new C00061();

            public C00061() {
                super(0);
            }

            public final String invoke() {
                return "Surface is closed, skipping drawing";
            }
        }

        /* JADX INFO: renamed from: app.rive.RiveKt$DrawRiveFramesEffect$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass2 extends hab0 implements Function0 {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            public AnonymousClass2() {
                super(0);
            }

            public final String invoke() {
                return "Playing is false. Advancing by 0, drawing once, and skipping advancement loop.";
            }
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$RiveImpl$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00361 extends hab0 implements Function0 {
        public static final C00361 INSTANCE = new C00361();

        public C00361() {
            super(0);
        }

        public final String invoke() {
            return "Rive Recomposing";
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$RiveSemanticsEffects$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp/oku;", "Lp/nku;", "invoke", "(Lp/oku;)Lp/nku;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C00402 extends hab0 implements iu30 {
        final /* synthetic */ Function0 $requestPausedFrame;
        final /* synthetic */ SemanticTreeModel $semanticTree;
        final /* synthetic */ boolean $semanticsEnabled;
        final /* synthetic */ StateMachine $stateMachine;
        final /* synthetic */ RiveTextureView $textureView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00402(RiveTextureView riveTextureView, boolean z, SemanticTreeModel semanticTreeModel, StateMachine stateMachine, Function0 function0) {
            super(1);
            this.$textureView = riveTextureView;
            this.$semanticsEnabled = z;
            this.$semanticTree = semanticTreeModel;
            this.$stateMachine = stateMachine;
            this.$requestPausedFrame = function0;
        }

        public final nku invoke(oku okuVar) {
            final RiveTextureView riveTextureView = this.$textureView;
            if (riveTextureView != null && this.$semanticsEnabled) {
                riveTextureView.installSemantics(this.$semanticTree, new C00082(this.$stateMachine, this.$requestPausedFrame), AnonymousClass3.INSTANCE, new AnonymousClass4(this.$stateMachine, this.$requestPausedFrame), new AnonymousClass5(this.$stateMachine, this.$requestPausedFrame));
                return new nku() { // from class: app.rive.RiveKt$RiveSemanticsEffects$2$invoke$$inlined$onDispose$2
                    public void dispose() {
                        riveTextureView.clearSemantics();
                    }
                };
            }
            if (riveTextureView != null) {
                riveTextureView.clearSemantics();
            }
            return new nku() { // from class: app.rive.RiveKt$RiveSemanticsEffects$2$invoke$$inlined$onDispose$1
                public void dispose() {
                }
            };
        }

        /* JADX INFO: renamed from: app.rive.RiveKt$RiveSemanticsEffects$2$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lapp/rive/semantics/SemanticAccessibilityFocusTransition;", "it", "Lp/rih1;", "invoke", "(Lapp/rive/semantics/SemanticAccessibilityFocusTransition;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class AnonymousClass3 extends hab0 implements iu30 {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticAccessibilityFocusTransition) obj);
                return rih1.a;
            }

            public final void invoke(SemanticAccessibilityFocusTransition semanticAccessibilityFocusTransition) {
            }
        }

        /* JADX INFO: renamed from: app.rive.RiveKt$RiveSemanticsEffects$2$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class AnonymousClass5 extends hab0 implements Function0 {
            final /* synthetic */ Function0 $requestPausedFrame;
            final /* synthetic */ StateMachine $stateMachine;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(StateMachine stateMachine, Function0 function0) {
                super(0);
                this.$stateMachine = stateMachine;
                this.$requestPausedFrame = function0;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m76invoke() {
                this.$stateMachine.clearSemanticFocusForLifecycleCleanup$kotlin_release();
                this.$requestPausedFrame.invoke();
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m76invoke();
                return rih1.a;
            }
        }

        /* JADX INFO: renamed from: app.rive.RiveKt$RiveSemanticsEffects$2$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "nodeId", "Lp/rih1;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class AnonymousClass4 extends hab0 implements iu30 {
            final /* synthetic */ Function0 $requestPausedFrame;
            final /* synthetic */ StateMachine $stateMachine;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(StateMachine stateMachine, Function0 function0) {
                super(1);
                this.$stateMachine = stateMachine;
                this.$requestPausedFrame = function0;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return rih1.a;
            }

            public final void invoke(int i) {
                this.$stateMachine.requestSemanticFocus(i);
                this.$requestPausedFrame.invoke();
            }
        }

        /* JADX INFO: renamed from: app.rive.RiveKt$RiveSemanticsEffects$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "nodeId", "Lapp/rive/semantics/SemanticActionType;", "action", "Lp/rih1;", "invoke", "(ILapp/rive/semantics/SemanticActionType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class C00082 extends hab0 implements vu30 {
            final /* synthetic */ Function0 $requestPausedFrame;
            final /* synthetic */ StateMachine $stateMachine;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00082(StateMachine stateMachine, Function0 function0) {
                super(2);
                this.$stateMachine = stateMachine;
                this.$requestPausedFrame = function0;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Number) obj).intValue(), (SemanticActionType) obj2);
                return rih1.a;
            }

            public final void invoke(int i, SemanticActionType semanticActionType) {
                this.$stateMachine.fireSemanticAction(i, semanticActionType);
                this.$requestPausedFrame.invoke();
            }
        }
    }

    public static final void Rive(RiveFile riveFile, qim0 qim0Var, boolean z, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RivePointerInputMode rivePointerInputMode, RiveFrameRate riveFrameRate, RiveSemanticsMode riveSemanticsMode, iu30 iu30Var, Map<String, ViewModelInstance> map, b0k b0kVar, int i2, int i3, int i4) {
        Fit fitDefaultFit;
        int i5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1439916974);
        qim0 qim0Var2 = (i4 & 2) != 0 ? nim0.a : qim0Var;
        boolean z2 = (i4 & 4) != 0 ? true : z;
        Artboard artboard2 = (i4 & 8) != 0 ? null : artboard;
        StateMachine stateMachine2 = (i4 & 16) != 0 ? null : stateMachine;
        ViewModelInstance viewModelInstance2 = (i4 & 32) != 0 ? null : viewModelInstance;
        if ((i4 & 64) != 0) {
            fitDefaultFit = RenderingDefaults.INSTANCE.defaultFit();
            i5 = i2 & (-3670017);
        } else {
            fitDefaultFit = fit;
            i5 = i2;
        }
        int i6 = (i4 & SemanticState.Focused) != 0 ? 0 : i;
        RivePointerInputMode rivePointerInputMode2 = (i4 & SemanticState.Hidden) != 0 ? RivePointerInputMode.Consume : rivePointerInputMode;
        RiveFrameRate riveFrameRate2 = (i4 & 512) != 0 ? RiveFrameRate.Unbounded.INSTANCE : riveFrameRate;
        RiveSemanticsMode riveSemanticsMode2 = (i4 & SemanticState.ReadOnly) != 0 ? RiveSemanticsMode.Off : riveSemanticsMode;
        int i7 = i6;
        RivePointerInputMode rivePointerInputMode3 = rivePointerInputMode2;
        RiveFrameRate riveFrameRate3 = riveFrameRate2;
        RiveSemanticsMode riveSemanticsMode3 = riveSemanticsMode2;
        iu30 iu30Var2 = (i4 & SemanticState.Modal) == 0 ? iu30Var : null;
        Artboard artboard3 = artboard2;
        RiveImpl(riveFile, qim0Var2, z2, artboard3, stateMachine2, viewModelInstance2, fitDefaultFit, i7, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var2, map, x340Var, (i5 & 14) | 299008 | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (i5 & 896) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), (i3 & 14) | 512 | (i3 & ContentType.LONG_FORM_ON_DEMAND));
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new C00352(riveFile, qim0Var2, z2, artboard3, stateMachine2, viewModelInstance2, fitDefaultFit, i7, rivePointerInputMode3, riveFrameRate3, riveSemanticsMode3, iu30Var2, map, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$UnsettleOnPlaybackStartEffect$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00452 extends hab0 implements vu30 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $playing;
        final /* synthetic */ CommandQueue $riveWorker;
        final /* synthetic */ StateMachine $stateMachine;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00452(CommandQueue commandQueue, StateMachine stateMachine, boolean z, int i) {
            super(2);
            this.$riveWorker = commandQueue;
            this.$stateMachine = stateMachine;
            this.$playing = z;
            this.$$changed = i;
        }

        public final void invoke(b0k b0kVar, int i) {
            RiveKt.UnsettleOnPlaybackStartEffect(this.$riveWorker, this.$stateMachine, this.$playing, b0kVar, czo1.p(this.$$changed | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0k) obj, ((Number) obj2).intValue());
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$RiveSemanticsEffects$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass4 extends hab0 implements vu30 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function0 $requestPausedFrame;
        final /* synthetic */ boolean $semanticsEnabled;
        final /* synthetic */ StateMachine $stateMachine;
        final /* synthetic */ RiveTextureView $textureView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(StateMachine stateMachine, RiveTextureView riveTextureView, boolean z, Function0 function0, int i) {
            super(2);
            this.$stateMachine = stateMachine;
            this.$textureView = riveTextureView;
            this.$semanticsEnabled = z;
            this.$requestPausedFrame = function0;
            this.$$changed = i;
        }

        public final void invoke(b0k b0kVar, int i) {
            RiveKt.RiveSemanticsEffects(this.$stateMachine, this.$textureView, this.$semanticsEnabled, this.$requestPausedFrame, b0kVar, czo1.p(this.$$changed | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0k) obj, ((Number) obj2).intValue());
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$UnsettleOnPresentationChangeEffect$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00472 extends hab0 implements vu30 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $backgroundColor;
        final /* synthetic */ Fit $fit;
        final /* synthetic */ CommandQueue $riveWorker;
        final /* synthetic */ StateMachine $stateMachine;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00472(CommandQueue commandQueue, StateMachine stateMachine, Fit fit, int i, int i2) {
            super(2);
            this.$riveWorker = commandQueue;
            this.$stateMachine = stateMachine;
            this.$fit = fit;
            this.$backgroundColor = i;
            this.$$changed = i2;
        }

        public final void invoke(b0k b0kVar, int i) {
            RiveKt.UnsettleOnPresentationChangeEffect(this.$riveWorker, this.$stateMachine, this.$fit, this.$backgroundColor, b0kVar, czo1.p(this.$$changed | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0k) obj, ((Number) obj2).intValue());
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$BindViewModelInstancesEffect$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends hab0 implements vu30 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Map<String, ViewModelInstance> $globalViewModelInstances;
        final /* synthetic */ Function0 $requestPausedFrame;
        final /* synthetic */ CommandQueue $riveWorker;
        final /* synthetic */ StateMachine $stateMachine;
        final /* synthetic */ ViewModelInstance $viewModelInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CommandQueue commandQueue, StateMachine stateMachine, ViewModelInstance viewModelInstance, Map<String, ViewModelInstance> map, Function0 function0, int i) {
            super(2);
            this.$riveWorker = commandQueue;
            this.$stateMachine = stateMachine;
            this.$viewModelInstance = viewModelInstance;
            this.$globalViewModelInstances = map;
            this.$requestPausedFrame = function0;
            this.$$changed = i;
        }

        public final void invoke(b0k b0kVar, int i) {
            RiveKt.BindViewModelInstancesEffect(this.$riveWorker, this.$stateMachine, this.$viewModelInstance, this.$globalViewModelInstances, this.$requestPausedFrame, b0kVar, czo1.p(this.$$changed | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0k) obj, ((Number) obj2).intValue());
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$UpdateArtboardLayoutEffect$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00492 extends hab0 implements vu30 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Artboard $artboard;
        final /* synthetic */ Fit $fit;
        final /* synthetic */ CommandQueue $riveWorker;
        final /* synthetic */ StateMachine $stateMachine;
        final /* synthetic */ RiveSurface $surface;
        final /* synthetic */ int $surfaceHeight;
        final /* synthetic */ int $surfaceWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00492(CommandQueue commandQueue, Artboard artboard, StateMachine stateMachine, Fit fit, RiveSurface riveSurface, int i, int i2, int i3) {
            super(2);
            this.$riveWorker = commandQueue;
            this.$artboard = artboard;
            this.$stateMachine = stateMachine;
            this.$fit = fit;
            this.$surface = riveSurface;
            this.$surfaceWidth = i;
            this.$surfaceHeight = i2;
            this.$$changed = i3;
        }

        public final void invoke(b0k b0kVar, int i) {
            RiveKt.UpdateArtboardLayoutEffect(this.$riveWorker, this.$artboard, this.$stateMachine, this.$fit, this.$surface, this.$surfaceWidth, this.$surfaceHeight, b0kVar, czo1.p(this.$$changed | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0k) obj, ((Number) obj2).intValue());
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$RiveSurfaceHost$5, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass5 extends hab0 implements vu30 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Fit $fit;
        final /* synthetic */ RiveFrameRate $frameRate;
        final /* synthetic */ qim0 $modifier;
        final /* synthetic */ iu30 $onBitmapAvailable;
        final /* synthetic */ boolean $playing;
        final /* synthetic */ RivePointerInputMode $pointerInputMode;
        final /* synthetic */ Function0 $requestPausedFrame;
        final /* synthetic */ ReadyResources $resources;
        final /* synthetic */ CommandQueue $riveWorker;
        final /* synthetic */ RiveSurfaceState $surfaceState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(CommandQueue commandQueue, RiveSurfaceState riveSurfaceState, ReadyResources readyResources, qim0 qim0Var, Fit fit, RivePointerInputMode rivePointerInputMode, RiveFrameRate riveFrameRate, boolean z, iu30 iu30Var, Function0 function0, int i) {
            super(2);
            this.$riveWorker = commandQueue;
            this.$surfaceState = riveSurfaceState;
            this.$resources = readyResources;
            this.$modifier = qim0Var;
            this.$fit = fit;
            this.$pointerInputMode = rivePointerInputMode;
            this.$frameRate = riveFrameRate;
            this.$playing = z;
            this.$onBitmapAvailable = iu30Var;
            this.$requestPausedFrame = function0;
            this.$$changed = i;
        }

        public final void invoke(b0k b0kVar, int i) {
            RiveKt.RiveSurfaceHost(this.$riveWorker, this.$surfaceState, this.$resources, this.$modifier, this.$fit, this.$pointerInputMode, this.$frameRate, this.$playing, this.$onBitmapAvailable, this.$requestPausedFrame, b0kVar, czo1.p(this.$$changed | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0k) obj, ((Number) obj2).intValue());
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$Rive$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00341 extends hab0 implements vu30 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ Artboard $artboard;
        final /* synthetic */ int $backgroundColor;
        final /* synthetic */ RiveFile $file;
        final /* synthetic */ Fit $fit;
        final /* synthetic */ RiveFrameRate $frameRate;
        final /* synthetic */ qim0 $modifier;
        final /* synthetic */ iu30 $onBitmapAvailable;
        final /* synthetic */ boolean $playing;
        final /* synthetic */ RivePointerInputMode $pointerInputMode;
        final /* synthetic */ RiveSemanticsMode $semantics;
        final /* synthetic */ StateMachine $stateMachine;
        final /* synthetic */ ViewModelInstance $viewModelInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00341(RiveFile riveFile, qim0 qim0Var, boolean z, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RivePointerInputMode rivePointerInputMode, RiveFrameRate riveFrameRate, RiveSemanticsMode riveSemanticsMode, iu30 iu30Var, int i2, int i3, int i4) {
            super(2);
            this.$file = riveFile;
            this.$modifier = qim0Var;
            this.$playing = z;
            this.$artboard = artboard;
            this.$stateMachine = stateMachine;
            this.$viewModelInstance = viewModelInstance;
            this.$fit = fit;
            this.$backgroundColor = i;
            this.$pointerInputMode = rivePointerInputMode;
            this.$frameRate = riveFrameRate;
            this.$semantics = riveSemanticsMode;
            this.$onBitmapAvailable = iu30Var;
            this.$$changed = i2;
            this.$$changed1 = i3;
            this.$$default = i4;
        }

        public final void invoke(b0k b0kVar, int i) {
            RiveKt.Rive(this.$file, this.$modifier, this.$playing, this.$artboard, this.$stateMachine, this.$viewModelInstance, this.$fit, this.$backgroundColor, this.$pointerInputMode, this.$frameRate, this.$semantics, this.$onBitmapAvailable, b0kVar, czo1.p(this.$$changed | 1), czo1.p(this.$$changed1), this.$$default);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0k) obj, ((Number) obj2).intValue());
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$RiveImpl$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00372 extends hab0 implements vu30 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ Artboard $artboard;
        final /* synthetic */ int $backgroundColor;
        final /* synthetic */ RiveFile $file;
        final /* synthetic */ Fit $fit;
        final /* synthetic */ RiveFrameRate $frameRate;
        final /* synthetic */ Map<String, ViewModelInstance> $globalViewModelInstances;
        final /* synthetic */ qim0 $modifier;
        final /* synthetic */ iu30 $onBitmapAvailable;
        final /* synthetic */ boolean $playing;
        final /* synthetic */ RivePointerInputMode $pointerInputMode;
        final /* synthetic */ RiveSemanticsMode $semantics;
        final /* synthetic */ StateMachine $stateMachine;
        final /* synthetic */ ViewModelInstance $viewModelInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00372(RiveFile riveFile, qim0 qim0Var, boolean z, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RivePointerInputMode rivePointerInputMode, RiveFrameRate riveFrameRate, RiveSemanticsMode riveSemanticsMode, iu30 iu30Var, Map<String, ViewModelInstance> map, int i2, int i3) {
            super(2);
            this.$file = riveFile;
            this.$modifier = qim0Var;
            this.$playing = z;
            this.$artboard = artboard;
            this.$stateMachine = stateMachine;
            this.$viewModelInstance = viewModelInstance;
            this.$fit = fit;
            this.$backgroundColor = i;
            this.$pointerInputMode = rivePointerInputMode;
            this.$frameRate = riveFrameRate;
            this.$semantics = riveSemanticsMode;
            this.$onBitmapAvailable = iu30Var;
            this.$globalViewModelInstances = map;
            this.$$changed = i2;
            this.$$changed1 = i3;
        }

        public final void invoke(b0k b0kVar, int i) {
            RiveKt.RiveImpl(this.$file, this.$modifier, this.$playing, this.$artboard, this.$stateMachine, this.$viewModelInstance, this.$fit, this.$backgroundColor, this.$pointerInputMode, this.$frameRate, this.$semantics, this.$onBitmapAvailable, this.$globalViewModelInstances, b0kVar, czo1.p(this.$$changed | 1), czo1.p(this.$$changed1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0k) obj, ((Number) obj2).intValue());
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$Rive$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00352 extends hab0 implements vu30 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ Artboard $artboard;
        final /* synthetic */ int $backgroundColor;
        final /* synthetic */ RiveFile $file;
        final /* synthetic */ Fit $fit;
        final /* synthetic */ RiveFrameRate $frameRate;
        final /* synthetic */ Map<String, ViewModelInstance> $globalViewModelInstances;
        final /* synthetic */ qim0 $modifier;
        final /* synthetic */ iu30 $onBitmapAvailable;
        final /* synthetic */ boolean $playing;
        final /* synthetic */ RivePointerInputMode $pointerInputMode;
        final /* synthetic */ RiveSemanticsMode $semantics;
        final /* synthetic */ StateMachine $stateMachine;
        final /* synthetic */ ViewModelInstance $viewModelInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00352(RiveFile riveFile, qim0 qim0Var, boolean z, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Fit fit, int i, RivePointerInputMode rivePointerInputMode, RiveFrameRate riveFrameRate, RiveSemanticsMode riveSemanticsMode, iu30 iu30Var, Map<String, ViewModelInstance> map, int i2, int i3, int i4) {
            super(2);
            this.$file = riveFile;
            this.$modifier = qim0Var;
            this.$playing = z;
            this.$artboard = artboard;
            this.$stateMachine = stateMachine;
            this.$viewModelInstance = viewModelInstance;
            this.$fit = fit;
            this.$backgroundColor = i;
            this.$pointerInputMode = rivePointerInputMode;
            this.$frameRate = riveFrameRate;
            this.$semantics = riveSemanticsMode;
            this.$onBitmapAvailable = iu30Var;
            this.$globalViewModelInstances = map;
            this.$$changed = i2;
            this.$$changed1 = i3;
            this.$$default = i4;
        }

        public final void invoke(b0k b0kVar, int i) {
            RiveKt.Rive(this.$file, this.$modifier, this.$playing, this.$artboard, this.$stateMachine, this.$viewModelInstance, this.$fit, this.$backgroundColor, this.$pointerInputMode, this.$frameRate, this.$semantics, this.$onBitmapAvailable, this.$globalViewModelInstances, b0kVar, czo1.p(this.$$changed | 1), czo1.p(this.$$changed1), this.$$default);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0k) obj, ((Number) obj2).intValue());
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$DrawRiveFramesEffect$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00332 extends hab0 implements vu30 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ Artboard $artboard;
        final /* synthetic */ int $backgroundColor;
        final /* synthetic */ Fit $fit;
        final /* synthetic */ RiveFrameRate $frameRate;
        final /* synthetic */ Map<String, ViewModelInstance> $globalViewModelInstances;
        final /* synthetic */ iac0 $lifecycleOwner;
        final /* synthetic */ int $pausedFrameGeneration;
        final /* synthetic */ boolean $playing;
        final /* synthetic */ CommandQueue $riveWorker;
        final /* synthetic */ boolean $semanticsEnabled;
        final /* synthetic */ StateMachine $stateMachine;
        final /* synthetic */ RiveSurface $surface;
        final /* synthetic */ int $surfaceHeight;
        final /* synthetic */ int $surfaceWidth;
        final /* synthetic */ ViewModelInstance $viewModelInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00332(CommandQueue commandQueue, iac0 iac0Var, RiveSurface riveSurface, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance, Map<String, ViewModelInstance> map, Fit fit, int i, boolean z, RiveFrameRate riveFrameRate, int i2, int i3, int i4, boolean z2, int i5, int i6) {
            super(2);
            this.$riveWorker = commandQueue;
            this.$lifecycleOwner = iac0Var;
            this.$surface = riveSurface;
            this.$artboard = artboard;
            this.$stateMachine = stateMachine;
            this.$viewModelInstance = viewModelInstance;
            this.$globalViewModelInstances = map;
            this.$fit = fit;
            this.$backgroundColor = i;
            this.$playing = z;
            this.$frameRate = riveFrameRate;
            this.$pausedFrameGeneration = i2;
            this.$surfaceWidth = i3;
            this.$surfaceHeight = i4;
            this.$semanticsEnabled = z2;
            this.$$changed = i5;
            this.$$changed1 = i6;
        }

        public final void invoke(b0k b0kVar, int i) {
            RiveKt.DrawRiveFramesEffect(this.$riveWorker, this.$lifecycleOwner, this.$surface, this.$artboard, this.$stateMachine, this.$viewModelInstance, this.$globalViewModelInstances, this.$fit, this.$backgroundColor, this.$playing, this.$frameRate, this.$pausedFrameGeneration, this.$surfaceWidth, this.$surfaceHeight, this.$semanticsEnabled, b0kVar, czo1.p(this.$$changed | 1), czo1.p(this.$$changed1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0k) obj, ((Number) obj2).intValue());
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.RiveKt$RiveResourceEffects$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00381 extends hab0 implements vu30 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $backgroundColor;
        final /* synthetic */ Fit $fit;
        final /* synthetic */ RiveFrameRate $frameRate;
        final /* synthetic */ Map<String, ViewModelInstance> $globalViewModelInstances;
        final /* synthetic */ iac0 $lifecycleOwner;
        final /* synthetic */ int $pausedFrameGeneration;
        final /* synthetic */ boolean $playing;
        final /* synthetic */ Function0 $requestPausedFrame;
        final /* synthetic */ ReadyResources $resources;
        final /* synthetic */ CommandQueue $riveWorker;
        final /* synthetic */ boolean $semanticsEnabled;
        final /* synthetic */ RiveSurface $surface;
        final /* synthetic */ int $surfaceHeight;
        final /* synthetic */ int $surfaceWidth;
        final /* synthetic */ RiveTextureView $textureView;
        final /* synthetic */ ViewModelInstance $viewModelInstance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00381(CommandQueue commandQueue, ReadyResources readyResources, ViewModelInstance viewModelInstance, Map<String, ViewModelInstance> map, Fit fit, int i, boolean z, RiveFrameRate riveFrameRate, iac0 iac0Var, RiveSurface riveSurface, int i2, int i3, int i4, Function0 function0, RiveTextureView riveTextureView, boolean z2, int i5, int i6) {
            super(2);
            this.$riveWorker = commandQueue;
            this.$resources = readyResources;
            this.$viewModelInstance = viewModelInstance;
            this.$globalViewModelInstances = map;
            this.$fit = fit;
            this.$backgroundColor = i;
            this.$playing = z;
            this.$frameRate = riveFrameRate;
            this.$lifecycleOwner = iac0Var;
            this.$surface = riveSurface;
            this.$surfaceWidth = i2;
            this.$surfaceHeight = i3;
            this.$pausedFrameGeneration = i4;
            this.$requestPausedFrame = function0;
            this.$textureView = riveTextureView;
            this.$semanticsEnabled = z2;
            this.$$changed = i5;
            this.$$changed1 = i6;
        }

        public final void invoke(b0k b0kVar, int i) {
            RiveKt.RiveResourceEffects(this.$riveWorker, this.$resources, this.$viewModelInstance, this.$globalViewModelInstances, this.$fit, this.$backgroundColor, this.$playing, this.$frameRate, this.$lifecycleOwner, this.$surface, this.$surfaceWidth, this.$surfaceHeight, this.$pausedFrameGeneration, this.$requestPausedFrame, this.$textureView, this.$semanticsEnabled, b0kVar, czo1.p(this.$$changed | 1), czo1.p(this.$$changed1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0k) obj, ((Number) obj2).intValue());
            return rih1.a;
        }
    }
}
