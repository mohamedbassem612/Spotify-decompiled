package app.p000rive.runtime.kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import app.p000rive.RiveLog;
import app.p000rive.runtime.kotlin.controllers.ControllerState;
import app.p000rive.runtime.kotlin.controllers.RiveFileController;
import app.p000rive.runtime.kotlin.core.Alignment;
import app.p000rive.runtime.kotlin.core.Artboard;
import app.p000rive.runtime.kotlin.core.ContextAssetLoader;
import app.p000rive.runtime.kotlin.core.Direction;
import app.p000rive.runtime.kotlin.core.FallbackAssetLoader;
import app.p000rive.runtime.kotlin.core.File;
import app.p000rive.runtime.kotlin.core.FileAssetLoader;
import app.p000rive.runtime.kotlin.core.Fit;
import app.p000rive.runtime.kotlin.core.LinearAnimationInstance;
import app.p000rive.runtime.kotlin.core.Loop;
import app.p000rive.runtime.kotlin.core.RefCount;
import app.p000rive.runtime.kotlin.core.RendererType;
import app.p000rive.runtime.kotlin.core.Rive;
import app.p000rive.runtime.kotlin.core.StateMachineInstance;
import app.p000rive.runtime.kotlin.core.errors.ArtboardException;
import app.p000rive.runtime.kotlin.core.errors.RiveException;
import app.p000rive.runtime.kotlin.core.errors.StateMachineException;
import app.p000rive.runtime.kotlin.core.errors.TextValueRunException;
import app.p000rive.runtime.kotlin.renderers.PointerEvents;
import app.p000rive.runtime.kotlin.renderers.Renderer;
import app.p000rive.runtime.kotlin.renderers.RendererMetrics;
import app.p000rive.runtime.kotlin.renderers.RiveArtboardRenderer;
import app.p000rive.semantics.SemanticState;
import app.rive.runtime.kotlin.RiveViewLifecycleObserver;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.c8o;
import p.f46;
import p.f4i1;
import p.gvg;
import p.hab0;
import p.hac0;
import p.hfr;
import p.hhg1;
import p.iac0;
import p.iu30;
import p.l1d;
import p.mi31;
import p.o0c;
import p.rih1;
import p.u890;
import p.x0d;
import p.x8c0;
import p.x9p1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@adt
@Metadata(d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u0000 ã\u00012\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0006ä\u0001ã\u0001å\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0017\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u0017\u0010\u001eJ\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001c¢\u0006\u0004\b\u0017\u0010!J\r\u0010\"\u001a\u00020\u0012¢\u0006\u0004\b\"\u0010\u0018J%\u0010\"\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001c¢\u0006\u0004\b\"\u0010!J+\u0010(\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u001c¢\u0006\u0004\b(\u0010)JC\u0010(\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010'\u001a\u00020\u001c¢\u0006\u0004\b(\u0010*J=\u0010(\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010'\u001a\u00020\u001c¢\u0006\u0004\b(\u0010+J\r\u0010,\u001a\u00020\u0012¢\u0006\u0004\b,\u0010\u0018J\u001f\u0010/\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001aH\u0007¢\u0006\u0004\b/\u00100J'\u00102\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u001cH\u0007¢\u0006\u0004\b2\u00103J'\u00105\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u00101\u001a\u000204H\u0007¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001aH\u0007¢\u0006\u0004\b8\u00100J'\u00109\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u001aH\u0007¢\u0006\u0004\b9\u0010:J'\u0010;\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u001a2\u0006\u00101\u001a\u0002042\u0006\u00107\u001a\u00020\u001aH\u0007¢\u0006\u0004\b;\u0010<J#\u0010@\u001a\u00020\u00122\u0012\u0010?\u001a\n\u0012\u0006\b\u0001\u0012\u00020>0=\"\u00020>H\u0007¢\u0006\u0004\b@\u0010AJ\u0019\u0010C\u001a\u0004\u0018\u00010\u001a2\u0006\u0010B\u001a\u00020\u001aH\u0007¢\u0006\u0004\bC\u0010DJ!\u0010C\u001a\u0004\u0018\u00010\u001a2\u0006\u0010B\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001aH\u0007¢\u0006\u0004\bC\u0010EJ\u001f\u0010G\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020\u001aH\u0007¢\u0006\u0004\bG\u00100J'\u0010G\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001aH\u0007¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u0004\u0018\u000104¢\u0006\u0004\bI\u0010JJ\u0015\u0010K\u001a\u00020\u00122\u0006\u00101\u001a\u000204¢\u0006\u0004\bK\u0010LJm\u0010U\u001a\u00020\u00122\b\b\u0001\u0010M\u001a\u00020\u000f2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010O\u001a\u00020\u001c2\b\b\u0002\u0010P\u001a\u00020\u001c2\b\b\u0002\u0010R\u001a\u00020Q2\b\b\u0002\u0010T\u001a\u00020S2\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\bU\u0010VJk\u0010Y\u001a\u00020\u00122\u0006\u0010X\u001a\u00020W2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010O\u001a\u00020\u001c2\b\b\u0002\u0010P\u001a\u00020\u001c2\b\b\u0002\u0010R\u001a\u00020Q2\b\b\u0002\u0010T\u001a\u00020S2\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\bY\u0010ZJk\u0010]\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020[2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010O\u001a\u00020\u001c2\b\b\u0002\u0010P\u001a\u00020\u001c2\b\b\u0002\u0010R\u001a\u00020Q2\b\b\u0002\u0010T\u001a\u00020S2\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b]\u0010^J\u0017\u0010a\u001a\u00020\u00122\b\u0010`\u001a\u0004\u0018\u00010_¢\u0006\u0004\ba\u0010bJ\u000f\u0010d\u001a\u00020cH\u0014¢\u0006\u0004\bd\u0010eJ\u000f\u0010g\u001a\u00020fH\u0014¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u0012H\u0014¢\u0006\u0004\bi\u0010\u0018J\u000f\u0010j\u001a\u00020\u0012H\u0014¢\u0006\u0004\bj\u0010\u0018J\u0011\u0010l\u001a\u0004\u0018\u00010kH\u0007¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\u00122\u0006\u0010n\u001a\u00020kH\u0007¢\u0006\u0004\bo\u0010pJ\u001f\u0010s\u001a\u00020\u00122\u0006\u0010q\u001a\u00020\u000f2\u0006\u0010r\u001a\u00020\u000fH\u0014¢\u0006\u0004\bs\u0010tJ\u0017\u0010v\u001a\u00020\u00122\u0006\u0010u\u001a\u00020\u0003H\u0017¢\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020\u00122\u0006\u0010u\u001a\u00020\u0003H\u0017¢\u0006\u0004\bx\u0010wJ\u0017\u0010z\u001a\u00020\u00122\u0006\u0010u\u001a\u00020yH\u0007¢\u0006\u0004\bz\u0010{J\u0017\u0010|\u001a\u00020\u00122\u0006\u0010u\u001a\u00020yH\u0007¢\u0006\u0004\b|\u0010{J\u0018\u0010\u007f\u001a\u00020\u001c2\u0006\u0010~\u001a\u00020}H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J(\u0010\u0083\u0001\u001a\u00020\u00122\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\u00120\u0081\u0001H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J1\u0010\u0086\u0001\u001a\u00020\u00122\u0007\u0010\u0085\u0001\u001a\u00020\u001a2\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\u00120\u0081\u0001H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0011\u0010\u0088\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0088\u0001\u0010\u0018J\u0011\u0010\u0089\u0001\u001a\u00020\u0012H\u0003¢\u0006\u0005\b\u0089\u0001\u0010\u0018J\u0011\u0010\u008a\u0001\u001a\u00020\u0012H\u0003¢\u0006\u0005\b\u008a\u0001\u0010\u0018J$\u0010\u008d\u0001\u001a\u00020\u001c2\u0007\u0010\u008b\u0001\u001a\u0002042\u0007\u0010\u008c\u0001\u001a\u000204H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001f\u0010\u008f\u0001\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R*\u0010\u0094\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R'\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u0012\u0005\b\u009f\u0001\u0010\u0018\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001c\u0010¡\u0001\u001a\u0005\u0018\u00010 \u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010¤\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001c\u0010§\u0001\u001a\u0005\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R)\u0010©\u0001\u001a\u00020\u001c8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010\u0090\u0001\u001a\u0006\bª\u0001\u0010\u0092\u0001\"\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010®\u0001\u001a\u00030\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R1\u0010°\u0001\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u001c8\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010\u0090\u0001\u001a\u0006\b±\u0001\u0010\u0092\u0001\"\u0006\b²\u0001\u0010¬\u0001R\u0017\u0010¶\u0001\u001a\u0005\u0018\u00010³\u00018F¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R(\u0010R\u001a\u00020Q2\u0006\u00101\u001a\u00020Q8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R(\u0010T\u001a\u00020S2\u0006\u00101\u001a\u00020S8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R,\u0010Â\u0001\u001a\u0004\u0018\u0001042\b\u00101\u001a\u0004\u0018\u0001048F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b¿\u0001\u0010J\"\u0006\bÀ\u0001\u0010Á\u0001R(\u0010Æ\u0001\u001a\u0002042\u0006\u00101\u001a\u0002048F@@X\u0086\u000e¢\u0006\u000f\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0005\bÅ\u0001\u0010LR\u0015\u0010\\\u001a\u0004\u0018\u00010[8F¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001R-\u0010N\u001a\u0004\u0018\u00010\u001a2\t\u0010É\u0001\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R(\u0010O\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\bÎ\u0001\u0010\u0092\u0001\"\u0006\bÏ\u0001\u0010¬\u0001R%\u0010Ô\u0001\u001a\t\u0012\u0005\u0012\u00030Ð\u00010\u00198FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bÓ\u0001\u0010\u0018\u001a\u0006\bÑ\u0001\u0010Ò\u0001R%\u0010Ø\u0001\u001a\t\u0012\u0005\u0012\u00030Õ\u00010\u00198FX\u0087\u0004¢\u0006\u000f\u0012\u0005\b×\u0001\u0010\u0018\u001a\u0006\bÖ\u0001\u0010Ò\u0001R2\u0010Þ\u0001\u001a\u0016\u0012\u0005\u0012\u00030Ð\u00010Ù\u0001j\n\u0012\u0005\u0012\u00030Ð\u0001`Ú\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bÝ\u0001\u0010\u0018\u001a\u0006\bÛ\u0001\u0010Ü\u0001R2\u0010á\u0001\u001a\u0016\u0012\u0005\u0012\u00030Õ\u00010Ù\u0001j\n\u0012\u0005\u0012\u00030Õ\u0001`Ú\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bà\u0001\u0010\u0018\u001a\u0006\bß\u0001\u0010Ü\u0001R\u0014\u0010â\u0001\u001a\u00020\u001c8F¢\u0006\b\u001a\u0006\bâ\u0001\u0010\u0092\u0001¨\u0006æ\u0001"}, d2 = {"Lapp/rive/runtime/kotlin/RiveAnimationView;", "Lapp/rive/runtime/kotlin/RiveTextureView;", "Lapp/rive/runtime/kotlin/Observable;", "Lapp/rive/runtime/kotlin/controllers/RiveFileController$Listener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lapp/rive/runtime/kotlin/RiveAnimationView$Builder;", "builder", "(Lapp/rive/runtime/kotlin/RiveAnimationView$Builder;)V", "Landroid/graphics/SurfaceTexture;", "surface", "", "width", "height", "Lp/rih1;", "onSurfaceTextureSizeChanged", "(Landroid/graphics/SurfaceTexture;II)V", "surfaceTexture", "onSurfaceTextureAvailable", "pause", "()V", "", "", "animationNames", "", "areStateMachines", "(Ljava/util/List;Z)V", "animationName", "isStateMachine", "(Ljava/lang/String;Z)V", "stop", "Lapp/rive/runtime/kotlin/core/Loop;", "loop", "Lapp/rive/runtime/kotlin/core/Direction;", "direction", "settleInitialState", "play", "(Lapp/rive/runtime/kotlin/core/Loop;Lapp/rive/runtime/kotlin/core/Direction;Z)V", "(Ljava/util/List;Lapp/rive/runtime/kotlin/core/Loop;Lapp/rive/runtime/kotlin/core/Direction;ZZ)V", "(Ljava/lang/String;Lapp/rive/runtime/kotlin/core/Loop;Lapp/rive/runtime/kotlin/core/Direction;ZZ)V", "reset", "stateMachineName", "inputName", "fireState", "(Ljava/lang/String;Ljava/lang/String;)V", "value", "setBooleanState", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "setNumberState", "(Ljava/lang/String;Ljava/lang/String;F)V", "path", "fireStateAtPath", "setBooleanStateAtPath", "(Ljava/lang/String;ZLjava/lang/String;)V", "setNumberStateAtPath", "(Ljava/lang/String;FLjava/lang/String;)V", "", "Lapp/rive/runtime/kotlin/ChangedInput;", "inputs", "setMultipleStates", "([Lapp/rive/runtime/kotlin/ChangedInput;)V", "textRunName", "getTextRunValue", "(Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "textValue", "setTextRunValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVolume", "()Ljava/lang/Float;", "setVolume", "(F)V", "resId", "artboardName", "autoplay", "autoBind", "Lapp/rive/runtime/kotlin/core/Fit;", "fit", "Lapp/rive/runtime/kotlin/core/Alignment;", "alignment", "setRiveResource", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;Lapp/rive/runtime/kotlin/core/Loop;)V", "", "bytes", "setRiveBytes", "([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;Lapp/rive/runtime/kotlin/core/Loop;)V", "Lapp/rive/runtime/kotlin/core/File;", "file", "setRiveFile", "(Lapp/rive/runtime/kotlin/core/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;Lapp/rive/runtime/kotlin/core/Loop;)V", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "assetLoader", "setAssetLoader", "(Lapp/rive/runtime/kotlin/core/FileAssetLoader;)V", "Lapp/rive/runtime/kotlin/renderers/Renderer;", "createRenderer", "()Lapp/rive/runtime/kotlin/renderers/Renderer;", "Lp/hac0;", "createObserver", "()Lp/hac0;", "onAttachedToWindow", "onDetachedFromWindow", "Lapp/rive/runtime/kotlin/controllers/ControllerState;", "saveControllerState", "()Lapp/rive/runtime/kotlin/controllers/ControllerState;", "state", "restoreControllerState", "(Lapp/rive/runtime/kotlin/controllers/ControllerState;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "listener", "registerListener", "(Lapp/rive/runtime/kotlin/controllers/RiveFileController$Listener;)V", "unregisterListener", "Lapp/rive/runtime/kotlin/controllers/RiveFileController$RiveEventListener;", "addEventListener", "(Lapp/rive/runtime/kotlin/controllers/RiveFileController$RiveEventListener;)V", "removeEventListener", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lkotlin/Function1;", "onComplete", "loadFileFromResource", "(Lp/iu30;)V", "url", "loadFromNetwork", "(Ljava/lang/String;Lp/iu30;)V", "validateLifecycleOwner", "startFrameMetrics", "stopFrameMetrics", "x", "y", "inBounds", "(FF)Z", "defaultAutoplay", "Z", "getDefaultAutoplay", "()Z", "Lapp/rive/runtime/kotlin/controllers/RiveFileController;", "controller", "Lapp/rive/runtime/kotlin/controllers/RiveFileController;", "getController", "()Lapp/rive/runtime/kotlin/controllers/RiveFileController;", "setController", "(Lapp/rive/runtime/kotlin/controllers/RiveFileController;)V", "Lapp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes;", "rendererAttributes", "Lapp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes;", "getRendererAttributes", "()Lapp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes;", "getRendererAttributes$annotations", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "frameMetricsListener", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "Landroid/graphics/RectF;", "bounds", "Landroid/graphics/RectF;", "Lp/iac0;", "lifecycleOwner", "Lp/iac0;", "touchPassThrough", "getTouchPassThrough", "setTouchPassThrough", "(Z)V", "Landroid/util/SparseBooleanArray;", "pointersInsideView", "Landroid/util/SparseBooleanArray;", "multiTouchEnabled", "getMultiTouchEnabled", "setMultiTouchEnabled", "Lapp/rive/runtime/kotlin/renderers/RiveArtboardRenderer;", "getArtboardRenderer", "()Lapp/rive/runtime/kotlin/renderers/RiveArtboardRenderer;", "artboardRenderer", "getFit", "()Lapp/rive/runtime/kotlin/core/Fit;", "setFit", "(Lapp/rive/runtime/kotlin/core/Fit;)V", "getAlignment", "()Lapp/rive/runtime/kotlin/core/Alignment;", "setAlignment", "(Lapp/rive/runtime/kotlin/core/Alignment;)V", "getLayoutScaleFactor", "setLayoutScaleFactor", "(Ljava/lang/Float;)V", "layoutScaleFactor", "getLayoutScaleFactorAutomatic", "()F", "setLayoutScaleFactorAutomatic$kotlin_release", "layoutScaleFactorAutomatic", "getFile", "()Lapp/rive/runtime/kotlin/core/File;", "name", "getArtboardName", "()Ljava/lang/String;", "setArtboardName", "(Ljava/lang/String;)V", "getAutoplay", "setAutoplay", "Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "getAnimations", "()Ljava/util/List;", "getAnimations$annotations", "animations", "Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "getStateMachines", "getStateMachines$annotations", "stateMachines", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getPlayingAnimations", "()Ljava/util/HashSet;", "getPlayingAnimations$annotations", "playingAnimations", "getPlayingStateMachines", "getPlayingStateMachines$annotations", "playingStateMachines", "isPlaying", "Companion", "Builder", "RendererAttributes", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class RiveAnimationView extends RiveTextureView implements Observable<RiveFileController.Listener> {
    public static final int SINGLE_TOUCH_ID = 0;
    public static final String TAG = "RiveL/RiveAnimationView";
    public static final boolean shouldLoadCDNAssetsDefault = true;
    public static final boolean traceAnimationsDefault = false;
    private final RectF bounds;
    private RiveFileController controller;
    private final boolean defaultAutoplay;
    private Window.OnFrameMetricsAvailableListener frameMetricsListener;
    private iac0 lifecycleOwner;
    private boolean multiTouchEnabled;
    private final SparseBooleanArray pointersInsideView;
    private final RendererAttributes rendererAttributes;
    private boolean touchPassThrough;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int alignmentIndexDefault = Alignment.CENTER.ordinal();
    private static final int fitIndexDefault = Fit.CONTAIN.ordinal();
    private static final int loopIndexDefault = Loop.AUTO.ordinal();
    private static final int rendererIndexDefault = Rive.INSTANCE.getDefaultRendererType().getValue();

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010T\u001a\u00020UJ\u000e\u0010V\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u0006J\u0010\u0010X\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\fH\u0007J\u000e\u0010Y\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\fJ\u000e\u0010Z\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u0015J\u000e\u0010[\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u001bJ\u000e\u0010\\\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u001bJ\u000e\u0010]\u001a\u00020\u00002\u0006\u0010W\u001a\u00020)J\u0010\u0010^\u001a\u00020\u00002\u0006\u0010W\u001a\u00020/H\u0007J\u000e\u0010_\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u001bJ\u000e\u0010`\u001a\u00020\u00002\u0006\u0010W\u001a\u000208J\u000e\u0010a\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u0001J\u000e\u0010b\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u001bJ\u000e\u0010c\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\fJ\u000e\u0010d\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u001bJ\u000e\u0010e\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u0004\u0018\u00010\u001bX\u0080\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001d\"\u0004\b6\u0010\u001fR\u001c\u00107\u001a\u0004\u0018\u000108X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010=\u001a\u0004\u0018\u00010\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010B\u001a\u0004\u0018\u00010CX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001d\"\u0004\bJ\u0010\u001fR\u001c\u0010K\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u000e\"\u0004\bM\u0010\u0010R\u001a\u0010N\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u001d\"\u0004\bP\u0010\u001fR\u001e\u0010Q\u001a\u0004\u0018\u00010\u001bX\u0080\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\bR\u0010\"\"\u0004\bS\u0010$¨\u0006f"}, d2 = {"Lapp/rive/runtime/kotlin/RiveAnimationView$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "alignment", "Lapp/rive/runtime/kotlin/core/Alignment;", "getAlignment$kotlin_release", "()Lapp/rive/runtime/kotlin/core/Alignment;", "setAlignment$kotlin_release", "(Lapp/rive/runtime/kotlin/core/Alignment;)V", "animationName", "", "getAnimationName$kotlin_release", "()Ljava/lang/String;", "setAnimationName$kotlin_release", "(Ljava/lang/String;)V", "artboardName", "getArtboardName$kotlin_release", "setArtboardName$kotlin_release", "assetLoader", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "getAssetLoader$kotlin_release", "()Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "setAssetLoader$kotlin_release", "(Lapp/rive/runtime/kotlin/core/FileAssetLoader;)V", "autoBind", "", "getAutoBind$kotlin_release", "()Z", "setAutoBind$kotlin_release", "(Z)V", "autoplay", "getAutoplay$kotlin_release", "()Ljava/lang/Boolean;", "setAutoplay$kotlin_release", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getContext$kotlin_release", "()Landroid/content/Context;", "fit", "Lapp/rive/runtime/kotlin/core/Fit;", "getFit$kotlin_release", "()Lapp/rive/runtime/kotlin/core/Fit;", "setFit$kotlin_release", "(Lapp/rive/runtime/kotlin/core/Fit;)V", "loop", "Lapp/rive/runtime/kotlin/core/Loop;", "getLoop$kotlin_release", "()Lapp/rive/runtime/kotlin/core/Loop;", "setLoop$kotlin_release", "(Lapp/rive/runtime/kotlin/core/Loop;)V", "multiTouchEnabled", "getMultiTouchEnabled$kotlin_release", "setMultiTouchEnabled$kotlin_release", "rendererType", "Lapp/rive/runtime/kotlin/core/RendererType;", "getRendererType$kotlin_release", "()Lapp/rive/runtime/kotlin/core/RendererType;", "setRendererType$kotlin_release", "(Lapp/rive/runtime/kotlin/core/RendererType;)V", "resource", "getResource$kotlin_release", "()Ljava/lang/Object;", "setResource$kotlin_release", "(Ljava/lang/Object;)V", "resourceType", "Lapp/rive/runtime/kotlin/ResourceType;", "getResourceType$kotlin_release", "()Lapp/rive/runtime/kotlin/ResourceType;", "setResourceType$kotlin_release", "(Lapp/rive/runtime/kotlin/ResourceType;)V", "shouldLoadCDNAssets", "getShouldLoadCDNAssets$kotlin_release", "setShouldLoadCDNAssets$kotlin_release", "stateMachineName", "getStateMachineName$kotlin_release", "setStateMachineName$kotlin_release", "touchPassThrough", "getTouchPassThrough$kotlin_release", "setTouchPassThrough$kotlin_release", "traceAnimations", "getTraceAnimations$kotlin_release", "setTraceAnimations$kotlin_release", "build", "Lapp/rive/runtime/kotlin/RiveAnimationView;", "setAlignment", "value", "setAnimationName", "setArtboardName", "setAssetLoader", "setAutoBind", "setAutoplay", "setFit", "setLoop", "setMultiTouchEnabled", "setRendererType", "setResource", "setShouldLoadCDNAssets", "setStateMachineName", "setTouchPassThrough", "setTraceAnimations", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Alignment alignment;
        private String animationName;
        private String artboardName;
        private FileAssetLoader assetLoader;
        private boolean autoBind;
        private Boolean autoplay;
        private final Context context;
        private Fit fit;
        private Loop loop;
        private boolean multiTouchEnabled;
        private RendererType rendererType;
        private Object resource;
        private ResourceType resourceType;
        private boolean shouldLoadCDNAssets = true;
        private String stateMachineName;
        private boolean touchPassThrough;
        private Boolean traceAnimations;

        public Builder(Context context) {
            this.context = context;
        }

        public final RiveAnimationView build() {
            return new RiveAnimationView(this);
        }

        /* JADX INFO: renamed from: getAlignment$kotlin_release, reason: from getter */
        public final Alignment getAlignment() {
            return this.alignment;
        }

        /* JADX INFO: renamed from: getAnimationName$kotlin_release, reason: from getter */
        public final String getAnimationName() {
            return this.animationName;
        }

        /* JADX INFO: renamed from: getArtboardName$kotlin_release, reason: from getter */
        public final String getArtboardName() {
            return this.artboardName;
        }

        /* JADX INFO: renamed from: getAssetLoader$kotlin_release, reason: from getter */
        public final FileAssetLoader getAssetLoader() {
            return this.assetLoader;
        }

        /* JADX INFO: renamed from: getAutoBind$kotlin_release, reason: from getter */
        public final boolean getAutoBind() {
            return this.autoBind;
        }

        /* JADX INFO: renamed from: getAutoplay$kotlin_release, reason: from getter */
        public final Boolean getAutoplay() {
            return this.autoplay;
        }

        /* JADX INFO: renamed from: getContext$kotlin_release, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        /* JADX INFO: renamed from: getFit$kotlin_release, reason: from getter */
        public final Fit getFit() {
            return this.fit;
        }

        /* JADX INFO: renamed from: getLoop$kotlin_release, reason: from getter */
        public final Loop getLoop() {
            return this.loop;
        }

        /* JADX INFO: renamed from: getMultiTouchEnabled$kotlin_release, reason: from getter */
        public final boolean getMultiTouchEnabled() {
            return this.multiTouchEnabled;
        }

        /* JADX INFO: renamed from: getRendererType$kotlin_release, reason: from getter */
        public final RendererType getRendererType() {
            return this.rendererType;
        }

        /* JADX INFO: renamed from: getResource$kotlin_release, reason: from getter */
        public final Object getResource() {
            return this.resource;
        }

        /* JADX INFO: renamed from: getResourceType$kotlin_release, reason: from getter */
        public final ResourceType getResourceType() {
            return this.resourceType;
        }

        /* JADX INFO: renamed from: getShouldLoadCDNAssets$kotlin_release, reason: from getter */
        public final boolean getShouldLoadCDNAssets() {
            return this.shouldLoadCDNAssets;
        }

        /* JADX INFO: renamed from: getStateMachineName$kotlin_release, reason: from getter */
        public final String getStateMachineName() {
            return this.stateMachineName;
        }

        /* JADX INFO: renamed from: getTouchPassThrough$kotlin_release, reason: from getter */
        public final boolean getTouchPassThrough() {
            return this.touchPassThrough;
        }

        /* JADX INFO: renamed from: getTraceAnimations$kotlin_release, reason: from getter */
        public final Boolean getTraceAnimations() {
            return this.traceAnimations;
        }

        public final Builder setAlignment(Alignment value) {
            this.alignment = value;
            return this;
        }

        public final void setAlignment$kotlin_release(Alignment alignment) {
            this.alignment = alignment;
        }

        @adt
        public final Builder setAnimationName(String value) {
            this.animationName = value;
            return this;
        }

        public final void setAnimationName$kotlin_release(String str) {
            this.animationName = str;
        }

        public final Builder setArtboardName(String value) {
            this.artboardName = value;
            return this;
        }

        public final void setArtboardName$kotlin_release(String str) {
            this.artboardName = str;
        }

        public final Builder setAssetLoader(FileAssetLoader value) {
            this.assetLoader = value;
            return this;
        }

        public final void setAssetLoader$kotlin_release(FileAssetLoader fileAssetLoader) {
            this.assetLoader = fileAssetLoader;
        }

        public final Builder setAutoBind(boolean value) {
            this.autoBind = value;
            return this;
        }

        public final void setAutoBind$kotlin_release(boolean z) {
            this.autoBind = z;
        }

        public final Builder setAutoplay(boolean value) {
            this.autoplay = Boolean.valueOf(value);
            return this;
        }

        public final void setAutoplay$kotlin_release(Boolean bool) {
            this.autoplay = bool;
        }

        public final Builder setFit(Fit value) {
            this.fit = value;
            return this;
        }

        public final void setFit$kotlin_release(Fit fit) {
            this.fit = fit;
        }

        @adt
        public final Builder setLoop(Loop value) {
            this.loop = value;
            return this;
        }

        public final void setLoop$kotlin_release(Loop loop) {
            this.loop = loop;
        }

        public final Builder setMultiTouchEnabled(boolean value) {
            this.multiTouchEnabled = value;
            return this;
        }

        public final void setMultiTouchEnabled$kotlin_release(boolean z) {
            this.multiTouchEnabled = z;
        }

        public final Builder setRendererType(RendererType value) {
            this.rendererType = value;
            return this;
        }

        public final void setRendererType$kotlin_release(RendererType rendererType) {
            this.rendererType = rendererType;
        }

        public final Builder setResource(Object value) {
            this.resourceType = ResourceType.INSTANCE.makeMaybeResource(value);
            this.resource = value;
            return this;
        }

        public final void setResource$kotlin_release(Object obj) {
            this.resource = obj;
        }

        public final void setResourceType$kotlin_release(ResourceType resourceType) {
            this.resourceType = resourceType;
        }

        public final Builder setShouldLoadCDNAssets(boolean value) {
            this.shouldLoadCDNAssets = value;
            return this;
        }

        public final void setShouldLoadCDNAssets$kotlin_release(boolean z) {
            this.shouldLoadCDNAssets = z;
        }

        public final Builder setStateMachineName(String value) {
            this.stateMachineName = value;
            return this;
        }

        public final void setStateMachineName$kotlin_release(String str) {
            this.stateMachineName = str;
        }

        public final Builder setTouchPassThrough(boolean value) {
            this.touchPassThrough = value;
            return this;
        }

        public final void setTouchPassThrough$kotlin_release(boolean z) {
            this.touchPassThrough = z;
        }

        public final Builder setTraceAnimations(boolean value) {
            this.traceAnimations = Boolean.valueOf(value);
            return this;
        }

        public final void setTraceAnimations$kotlin_release(Boolean bool) {
            this.traceAnimations = bool;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\tR\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u000e\u0010\u0011\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lapp/rive/runtime/kotlin/RiveAnimationView$Companion;", "", "()V", "SINGLE_TOUCH_ID", "", "TAG", "", "alignmentIndexDefault", "getAlignmentIndexDefault", "()I", "fitIndexDefault", "getFitIndexDefault", "loopIndexDefault", "getLoopIndexDefault$annotations", "getLoopIndexDefault", "rendererIndexDefault", "getRendererIndexDefault", "shouldLoadCDNAssetsDefault", "", "traceAnimationsDefault", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @adt
        public static /* synthetic */ void getLoopIndexDefault$annotations() {
        }

        public final int getAlignmentIndexDefault() {
            return RiveAnimationView.alignmentIndexDefault;
        }

        public final int getFitIndexDefault() {
            return RiveAnimationView.fitIndexDefault;
        }

        public final int getLoopIndexDefault() {
            return RiveAnimationView.loopIndexDefault;
        }

        public final int getRendererIndexDefault() {
            return RiveAnimationView.rendererIndexDefault;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$loadFileFromResource$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends hab0 implements Function0 {
        final /* synthetic */ ResourceType $resource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ResourceType resourceType) {
            super(0);
            this.$resource = resourceType;
        }

        public final String invoke() {
            return f4i1.c(((ResourceType.ResourceBytes) this.$resource).getBytes().length, "Loading Rive file from bytes with length: ");
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$loadFileFromResource$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass4 extends hab0 implements Function0 {
        final /* synthetic */ ResourceType $resource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ResourceType resourceType) {
            super(0);
            this.$resource = resourceType;
        }

        public final String invoke() {
            return f4i1.c(((ResourceType.ResourceId) this.$resource).getId(), "Loading Rive file from resource ID: ");
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$loadFromNetwork$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00841 extends hab0 implements Function0 {
        final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00841(String str) {
            super(0);
            this.$url = str;
        }

        public final String invoke() {
            return l1d.m("Loading Rive file from network: ", this.$url);
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J,\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"app/rive/runtime/kotlin/RiveAnimationView$onTouchEvent$PointerInfo", "", "id", "", "x", "", "y", "(IFF)V", "getId", "()I", "getX", "()F", "getY", "component1", "component2", "component3", "copy", "(IFF)Lapp/rive/runtime/kotlin/RiveAnimationView$onTouchEvent$PointerInfo;", "equals", "", "other", "hashCode", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PointerInfo {
        private final int id;
        private final float x;
        private final float y;

        public PointerInfo(int i, float f, float f2) {
            this.id = i;
            this.x = f;
            this.y = f2;
        }

        public static /* synthetic */ PointerInfo copy$default(PointerInfo pointerInfo, int i, float f, float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pointerInfo.id;
            }
            if ((i2 & 2) != 0) {
                f = pointerInfo.x;
            }
            if ((i2 & 4) != 0) {
                f2 = pointerInfo.y;
            }
            return pointerInfo.copy(i, f, f2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getY() {
            return this.y;
        }

        public final PointerInfo copy(int id, float x, float y) {
            return new PointerInfo(id, x, y);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PointerInfo)) {
                return false;
            }
            PointerInfo pointerInfo = (PointerInfo) other;
            return this.id == pointerInfo.id && Float.compare(this.x, pointerInfo.x) == 0 && Float.compare(this.y, pointerInfo.y) == 0;
        }

        public final int getId() {
            return this.id;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return Float.hashCode(this.y) + x0d.f(Integer.hashCode(this.id) * 31, 31, this.x);
        }

        public String toString() {
            return "PointerInfo(id=" + this.id + ", x=" + this.x + ", y=" + this.y + ")";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$setAssetLoader$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00881 extends hab0 implements Function0 {
        final /* synthetic */ FileAssetLoader $assetLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00881(FileAssetLoader fileAssetLoader) {
            super(0);
            this.$assetLoader = fileAssetLoader;
        }

        public final String invoke() {
            return "setAssetLoader: assetLoader is already set to " + this.$assetLoader;
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$setAssetLoader$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00892 extends hab0 implements Function0 {
        final /* synthetic */ FileAssetLoader $assetLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00892(FileAssetLoader fileAssetLoader) {
            super(0);
            this.$assetLoader = fileAssetLoader;
        }

        public final String invoke() {
            return "setAssetLoader: " + this.$assetLoader;
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$setRiveBytes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00901 extends hab0 implements Function0 {
        final /* synthetic */ byte[] $bytes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00901(byte[] bArr) {
            super(0);
            this.$bytes = bArr;
        }

        public final String invoke() {
            return f4i1.c(this.$bytes.length, "setRiveBytes with bytes length: ");
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$setRiveFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00921 extends hab0 implements Function0 {
        final /* synthetic */ File $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00921(File file) {
            super(0);
            this.$file = file;
        }

        public final String invoke() {
            return "setRiveFile with file: " + this.$file;
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$setRiveResource$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00931 extends hab0 implements Function0 {
        final /* synthetic */ int $resId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00931(int i) {
            super(0);
            this.$resId = i;
        }

        public final String invoke() {
            return f4i1.c(this.$resId, "setRiveResource with resId: ");
        }
    }

    public RiveAnimationView(Context context, AttributeSet attributeSet) {
        x8c0 lifecycle;
        super(context, attributeSet);
        this.defaultAutoplay = true;
        this.bounds = new RectF();
        Context context2 = getContext();
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                context2 = null;
                break;
            } else if (context2 instanceof iac0) {
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        this.lifecycleOwner = (iac0) context2;
        this.pointersInsideView = new SparseBooleanArray();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d(TAG, anonymousClass1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.RiveAnimationView, 0, 0);
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.RiveAnimationView_riveResource, -1);
            Object string = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveUrl);
            ResourceType.Companion companion = ResourceType.INSTANCE;
            if (resourceId != -1) {
                string = Integer.valueOf(resourceId);
            }
            ResourceType resourceTypeMakeMaybeResource = companion.makeMaybeResource(string);
            FileAssetLoader fileAssetLoaderAssetLoaderFrom = RendererAttributes.INSTANCE.assetLoaderFrom(typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveAssetLoaderClass), context.getApplicationContext());
            boolean z = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveShouldLoadCDNAssets, true);
            setTouchPassThrough(typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveTouchPassThrough, false));
            setMultiTouchEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveMultiTouchEnabled, false));
            int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.RiveAnimationView_riveAlignment, alignmentIndexDefault);
            int integer2 = typedArrayObtainStyledAttributes.getInteger(R.styleable.RiveAnimationView_riveFit, fitIndexDefault);
            int integer3 = typedArrayObtainStyledAttributes.getInteger(R.styleable.RiveAnimationView_riveLoop, loopIndexDefault);
            boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveAutoPlay, getDefaultAutoplay());
            boolean z3 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveAutoBind, false);
            boolean z4 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RiveAnimationView_riveTraceAnimations, false);
            String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveArtboard);
            String string3 = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveAnimation);
            String string4 = typedArrayObtainStyledAttributes.getString(R.styleable.RiveAnimationView_riveStateMachine);
            int integer4 = typedArrayObtainStyledAttributes.getInteger(R.styleable.RiveAnimationView_riveRenderer, rendererIndexDefault);
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            RendererAttributes rendererAttributes = new RendererAttributes(integer, integer2, integer3, integer4, z2, z3, z4, string2, string3, string4, resourceTypeMakeMaybeResource, new FallbackAssetLoader(applicationContext, z, fileAssetLoaderAssetLoaderFrom));
            this.rendererAttributes = rendererAttributes;
            this.controller = new RiveFileController(rendererAttributes.getLoop(), rendererAttributes.getAutoplay(), null, null, null, 28, null);
            iac0 iac0Var = this.lifecycleOwner;
            if (iac0Var != null && (lifecycle = iac0Var.getLifecycle()) != null) {
                lifecycle.a(getLifecycleObserver());
            }
            if (resourceTypeMakeMaybeResource != null) {
                riveLog.getLogger().d(TAG, RiveAnimationView$2$1$1.INSTANCE);
                loadFileFromResource(new RiveAnimationView$2$1$2(this));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @adt
    public static /* synthetic */ void getAnimations$annotations() {
    }

    @adt
    public static /* synthetic */ void getPlayingAnimations$annotations() {
    }

    @adt
    public static /* synthetic */ void getPlayingStateMachines$annotations() {
    }

    public static /* synthetic */ void getRendererAttributes$annotations() {
    }

    @adt
    public static /* synthetic */ void getStateMachines$annotations() {
    }

    private final boolean inBounds(float x, float y) {
        return x >= 0.0f && y >= 0.0f && x < ((float) getWidth()) && y < ((float) getHeight());
    }

    private final void loadFileFromResource(iu30 onComplete) {
        ResourceType resource = this.rendererAttributes.getResource();
        if (resource == null) {
            RiveLog.INSTANCE.getLogger().w(TAG, C00831.INSTANCE);
            return;
        }
        if (resource instanceof ResourceType.ResourceRiveFile) {
            RiveLog.INSTANCE.getLogger().d(TAG, AnonymousClass2.INSTANCE);
            onComplete.invoke(((ResourceType.ResourceRiveFile) resource).getFile());
            return;
        }
        if (resource instanceof ResourceType.ResourceUrl) {
            loadFromNetwork(((ResourceType.ResourceUrl) resource).getUrl(), onComplete);
            return;
        }
        if (resource instanceof ResourceType.ResourceBytes) {
            RiveLog.INSTANCE.getLogger().d(TAG, new AnonymousClass3(resource));
            File file = new File(((ResourceType.ResourceBytes) resource).getBytes(), this.rendererAttributes.getRendererType(), this.rendererAttributes.getAssetLoader());
            onComplete.invoke(file);
            file.release();
            return;
        }
        if (resource instanceof ResourceType.ResourceId) {
            RiveLog.INSTANCE.getLogger().d(TAG, new AnonymousClass4(resource));
            InputStream inputStreamOpenRawResource = getResources().openRawResource(((ResourceType.ResourceId) resource).getId());
            try {
                inputStreamOpenRawResource.getClass();
                File file2 = new File(o0c.K(inputStreamOpenRawResource), this.rendererAttributes.getRendererType(), this.rendererAttributes.getAssetLoader());
                onComplete.invoke(file2);
                file2.release();
                u890.p(inputStreamOpenRawResource, (Throwable) null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(inputStreamOpenRawResource, th);
                    throw th2;
                }
            }
        }
    }

    private final void loadFromNetwork(String url, iu30 onComplete) {
        RiveLog.INSTANCE.getLogger().d(TAG, new C00841(url));
        c8o.u(getContext().getApplicationContext()).a(new RiveFileRequest(url, this.rendererAttributes.getRendererType(), new mi31(onComplete), new hfr(url, (byte) 15), this.rendererAttributes.getAssetLoader()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadFromNetwork$lambda$4(iu30 iu30Var, File file) {
        file.getClass();
        iu30Var.invoke(file);
        file.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadFromNetwork$lambda$5(String str, VolleyError volleyError) throws IOException {
        throw new IOException("Unable to download Rive file ".concat(str), volleyError);
    }

    private static final PointerInfo onTouchEvent$pointerInfoAt(RiveAnimationView riveAnimationView, MotionEvent motionEvent, int i) {
        return new PointerInfo(riveAnimationView.getMultiTouchEnabled() ? motionEvent.getPointerId(i) : 0, motionEvent.getX(i), motionEvent.getY(i));
    }

    public static /* synthetic */ void pause$default(RiveAnimationView riveAnimationView, List list, boolean z, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: pause");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        riveAnimationView.pause((List<String>) list, z);
    }

    public static /* synthetic */ void play$default(RiveAnimationView riveAnimationView, List list, Loop loop, Direction direction, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: play");
            return;
        }
        if ((i & 2) != 0) {
            loop = Loop.AUTO;
        }
        Loop loop2 = loop;
        if ((i & 4) != 0) {
            direction = Direction.AUTO;
        }
        Direction direction2 = direction;
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = true;
        }
        riveAnimationView.play((List<String>) list, loop2, direction2, z3, z2);
    }

    public static /* synthetic */ void setRiveBytes$default(RiveAnimationView riveAnimationView, byte[] bArr, String str, String str2, String str3, boolean z, boolean z2, Fit fit, Alignment alignment, Loop loop, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: setRiveBytes");
            return;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            z = riveAnimationView.controller.getAutoplay();
        }
        if ((i & 32) != 0) {
            z2 = false;
        }
        if ((i & 64) != 0) {
            fit = Fit.INSTANCE.fromIndex(fitIndexDefault);
        }
        if ((i & SemanticState.Focused) != 0) {
            alignment = Alignment.INSTANCE.fromIndex(alignmentIndexDefault);
        }
        if ((i & SemanticState.Hidden) != 0) {
            loop = Loop.INSTANCE.fromIndex(loopIndexDefault);
        }
        riveAnimationView.setRiveBytes(bArr, str, str2, str3, z, z2, fit, alignment, loop);
    }

    public static /* synthetic */ void setRiveFile$default(RiveAnimationView riveAnimationView, File file, String str, String str2, String str3, boolean z, boolean z2, Fit fit, Alignment alignment, Loop loop, int i, Object obj) throws RiveException {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: setRiveFile");
            return;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            z = riveAnimationView.controller.getAutoplay();
        }
        if ((i & 32) != 0) {
            z2 = false;
        }
        if ((i & 64) != 0) {
            fit = Fit.INSTANCE.fromIndex(fitIndexDefault);
        }
        if ((i & SemanticState.Focused) != 0) {
            alignment = Alignment.INSTANCE.fromIndex(alignmentIndexDefault);
        }
        if ((i & SemanticState.Hidden) != 0) {
            loop = Loop.INSTANCE.fromIndex(loopIndexDefault);
        }
        riveAnimationView.setRiveFile(file, str, str2, str3, z, z2, fit, alignment, loop);
    }

    public static /* synthetic */ void setRiveResource$default(RiveAnimationView riveAnimationView, int i, String str, String str2, String str3, boolean z, boolean z2, Fit fit, Alignment alignment, Loop loop, int i2, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: setRiveResource");
            return;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            str3 = null;
        }
        if ((i2 & 16) != 0) {
            z = riveAnimationView.controller.getAutoplay();
        }
        if ((i2 & 32) != 0) {
            z2 = false;
        }
        if ((i2 & 64) != 0) {
            fit = Fit.INSTANCE.fromIndex(fitIndexDefault);
        }
        if ((i2 & SemanticState.Focused) != 0) {
            alignment = Alignment.INSTANCE.fromIndex(alignmentIndexDefault);
        }
        if ((i2 & SemanticState.Hidden) != 0) {
            loop = Loop.INSTANCE.fromIndex(loopIndexDefault);
        }
        riveAnimationView.setRiveResource(i, str, str2, str3, z, z2, fit, alignment, loop);
    }

    private final void startFrameMetrics() {
        RendererMetrics rendererMetrics = new RendererMetrics(getActivity());
        getActivity().getWindow().addOnFrameMetricsAvailableListener(rendererMetrics, new Handler(Looper.getMainLooper()));
        this.frameMetricsListener = rendererMetrics;
    }

    public static /* synthetic */ void stop$default(RiveAnimationView riveAnimationView, List list, boolean z, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: stop");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        riveAnimationView.stop((List<String>) list, z);
    }

    private final void stopFrameMetrics() {
        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = this.frameMetricsListener;
        if (onFrameMetricsAvailableListener != null) {
            getActivity().getWindow().removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    private final void validateLifecycleOwner() {
        x8c0 lifecycle;
        iac0 iac0VarH = x9p1.h(this);
        if (iac0VarH == null || iac0VarH.equals(this.lifecycleOwner)) {
            return;
        }
        iac0 iac0Var = this.lifecycleOwner;
        if (iac0Var != null && (lifecycle = iac0Var.getLifecycle()) != null) {
            lifecycle.d(getLifecycleObserver());
        }
        this.lifecycleOwner = iac0VarH;
        x8c0 lifecycle2 = iac0VarH.getLifecycle();
        if (lifecycle2 != null) {
            lifecycle2.a(getLifecycleObserver());
        }
    }

    @adt
    public final void addEventListener(RiveFileController.RiveEventListener listener) {
        this.controller.addEventListener(listener);
    }

    @Override // app.p000rive.runtime.kotlin.RiveTextureView
    public hac0 createObserver() {
        RiveLog.INSTANCE.getLogger().d(TAG, C00811.INSTANCE);
        return new RiveViewLifecycleObserver(new ArrayList(f46.i0(new RefCount[]{this.controller, this.rendererAttributes.getAssetLoader()})));
    }

    @Override // app.p000rive.runtime.kotlin.RiveTextureView
    public Renderer createRenderer() {
        RiveLog.INSTANCE.getLogger().d(TAG, C00821.INSTANCE);
        return new RiveArtboardRenderer(this.rendererAttributes.getRiveTraceAnimations(), this.rendererAttributes.getRendererType(), this.controller);
    }

    @adt
    public final void fireState(String stateMachineName, String inputName) {
        RiveFileController.fireState$default(this.controller, stateMachineName, inputName, null, 4, null);
    }

    @adt
    public final void fireStateAtPath(String inputName, String path) {
        this.controller.fireStateAtPath(inputName, path);
    }

    public final Alignment getAlignment() {
        return this.controller.getAlignment();
    }

    public final List<LinearAnimationInstance> getAnimations() {
        return this.controller.getAnimations();
    }

    public final String getArtboardName() {
        Artboard activeArtboard = this.controller.getActiveArtboard();
        if (activeArtboard != null) {
            return activeArtboard.getName();
        }
        return null;
    }

    public final RiveArtboardRenderer getArtboardRenderer() {
        Renderer renderer = getRenderer();
        if (renderer == null ? true : renderer instanceof RiveArtboardRenderer) {
            return (RiveArtboardRenderer) getRenderer();
        }
        Renderer renderer2 = getRenderer();
        String simpleName = renderer2 != null ? renderer2.getClass().getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "NULL";
        }
        throw new TypeCastException("Expected RiveArtboardRenderer but got ".concat(simpleName));
    }

    public final boolean getAutoplay() {
        return this.controller.getAutoplay();
    }

    public final RiveFileController getController() {
        return this.controller;
    }

    public boolean getDefaultAutoplay() {
        return this.defaultAutoplay;
    }

    public final File getFile() {
        return this.controller.getFile();
    }

    public final Fit getFit() {
        return this.controller.getFit();
    }

    public final Float getLayoutScaleFactor() {
        return this.controller.getLayoutScaleFactor();
    }

    public final float getLayoutScaleFactorAutomatic() {
        return this.controller.getLayoutScaleFactorAutomatic();
    }

    public boolean getMultiTouchEnabled() {
        return this.multiTouchEnabled;
    }

    public final HashSet<LinearAnimationInstance> getPlayingAnimations() {
        return this.controller.getPlayingAnimations();
    }

    public final HashSet<StateMachineInstance> getPlayingStateMachines() {
        return this.controller.getPlayingStateMachines();
    }

    public final RendererAttributes getRendererAttributes() {
        return this.rendererAttributes;
    }

    public final List<StateMachineInstance> getStateMachines() {
        return this.controller.getStateMachines();
    }

    @adt
    public final String getTextRunValue(String textRunName) {
        return this.controller.getTextRunValue(textRunName);
    }

    public boolean getTouchPassThrough() {
        return this.touchPassThrough;
    }

    public final Float getVolume() {
        return this.controller.getVolume();
    }

    public final boolean isPlaying() {
        Renderer renderer = getRenderer();
        return renderer != null && renderer.getIsPlaying();
    }

    @Override // app.p000rive.runtime.kotlin.RiveTextureView, android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        validateLifecycleOwner();
        if (this.controller.getFile() == null) {
            loadFileFromResource(new C00851());
        }
        Renderer renderer = getRenderer();
        renderer.getClass();
        if (renderer.getTrace()) {
            startFrameMetrics();
        }
        this.controller.setActive(true);
        Renderer renderer2 = getRenderer();
        renderer2.getClass();
        renderer2.start();
    }

    @Override // app.p000rive.runtime.kotlin.RiveTextureView, android.view.View
    public void onDetachedFromWindow() {
        this.controller.setActive(false);
        stopFrameMetrics();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (getRenderer() == null) {
            RiveLog.INSTANCE.getLogger().w(TAG, C00861.INSTANCE);
            return;
        }
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int iWidth = mode == 0 ? (int) this.controller.getArtboardBounds().width() : View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int iHeight = mode2 == 0 ? (int) this.controller.getArtboardBounds().height() : View.MeasureSpec.getSize(heightMeasureSpec);
        this.controller.setLayoutScaleFactorAutomatic$kotlin_release(getResources().getDisplayMetrics().density);
        this.bounds.set(0.0f, 0.0f, iWidth, iHeight);
        RectF rectFCalculateRequiredBounds = Rive.INSTANCE.calculateRequiredBounds(this.controller.getFit(), this.controller.getAlignment(), this.bounds, this.controller.getArtboardBounds(), this.controller.getLayoutScaleFactorActive$kotlin_release());
        if (mode == Integer.MIN_VALUE) {
            iWidth = Math.min((int) rectFCalculateRequiredBounds.width(), iWidth);
        } else if (mode != 1073741824) {
            iWidth = (int) rectFCalculateRequiredBounds.width();
        }
        if (mode2 == Integer.MIN_VALUE) {
            iHeight = Math.min((int) rectFCalculateRequiredBounds.height(), iHeight);
        } else if (mode2 != 1073741824) {
            iHeight = (int) rectFCalculateRequiredBounds.height();
        }
        setMeasuredDimension(iWidth, iHeight);
    }

    @Override // app.p000rive.runtime.kotlin.RiveTextureView, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int width, int height) {
        super.onSurfaceTextureAvailable(surfaceTexture, width, height);
        this.controller.setTargetBounds(new RectF(0.0f, 0.0f, width, height));
        this.controller.getRequireArtboardResize().set(true);
    }

    @Override // app.p000rive.runtime.kotlin.RiveTextureView, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
        super.onSurfaceTextureSizeChanged(surface, width, height);
        this.controller.setTargetBounds(new RectF(0.0f, 0.0f, width, height));
        this.controller.getRequireArtboardResize().set(true);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        boolean z = !getTouchPassThrough();
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            PointerInfo pointerInfoOnTouchEvent$pointerInfoAt = onTouchEvent$pointerInfoAt(this, event, event.getActionIndex());
            int id = pointerInfoOnTouchEvent$pointerInfoAt.getId();
            float x = pointerInfoOnTouchEvent$pointerInfoAt.getX();
            float y = pointerInfoOnTouchEvent$pointerInfoAt.getY();
            this.pointersInsideView.put(id, inBounds(x, y));
            this.controller.pointerEvent(PointerEvents.POINTER_DOWN, id, x, y);
            return z;
        }
        if (actionMasked == 1) {
            PointerInfo pointerInfoOnTouchEvent$pointerInfoAt2 = onTouchEvent$pointerInfoAt(this, event, event.getActionIndex());
            int id2 = pointerInfoOnTouchEvent$pointerInfoAt2.getId();
            float x2 = pointerInfoOnTouchEvent$pointerInfoAt2.getX();
            float y2 = pointerInfoOnTouchEvent$pointerInfoAt2.getY();
            this.controller.pointerEvent(PointerEvents.POINTER_UP, id2, x2, y2);
            this.controller.pointerEvent(PointerEvents.POINTER_EXIT, id2, x2, y2);
            if (this.pointersInsideView.get(id2)) {
                performClick();
            }
            this.pointersInsideView.clear();
            return z;
        }
        if (actionMasked == 2) {
            int pointerCount = getMultiTouchEnabled() ? event.getPointerCount() : 1;
            for (int i = 0; i < pointerCount; i++) {
                PointerInfo pointerInfoOnTouchEvent$pointerInfoAt3 = onTouchEvent$pointerInfoAt(this, event, i);
                int id3 = pointerInfoOnTouchEvent$pointerInfoAt3.getId();
                float x3 = pointerInfoOnTouchEvent$pointerInfoAt3.getX();
                float y3 = pointerInfoOnTouchEvent$pointerInfoAt3.getY();
                boolean z2 = this.pointersInsideView.get(id3);
                boolean zInBounds = inBounds(x3, y3);
                if (z2 && !zInBounds) {
                    this.controller.pointerEvent(PointerEvents.POINTER_EXIT, id3, x3, y3);
                }
                this.pointersInsideView.put(id3, zInBounds);
                this.controller.pointerEvent(PointerEvents.POINTER_MOVE, id3, x3, y3);
            }
        } else if (actionMasked == 3) {
            SparseBooleanArray sparseBooleanArray = this.pointersInsideView;
            int i2 = 0;
            while (true) {
                if (!(i2 < sparseBooleanArray.size())) {
                    this.pointersInsideView.clear();
                    return z;
                }
                int i3 = i2 + 1;
                int iKeyAt = sparseBooleanArray.keyAt(i2);
                this.controller.pointerEvent(PointerEvents.POINTER_UP, iKeyAt, -1.0f, -1.0f);
                this.controller.pointerEvent(PointerEvents.POINTER_EXIT, iKeyAt, -1.0f, -1.0f);
                i2 = i3;
            }
        } else if (actionMasked != 5) {
            if (actionMasked != 6) {
                RiveLog.INSTANCE.getLogger().w(TAG, C00871.INSTANCE);
                return z;
            }
            if (getMultiTouchEnabled()) {
                PointerInfo pointerInfoOnTouchEvent$pointerInfoAt4 = onTouchEvent$pointerInfoAt(this, event, event.getActionIndex());
                int id4 = pointerInfoOnTouchEvent$pointerInfoAt4.getId();
                float x4 = pointerInfoOnTouchEvent$pointerInfoAt4.getX();
                float y4 = pointerInfoOnTouchEvent$pointerInfoAt4.getY();
                this.controller.pointerEvent(PointerEvents.POINTER_UP, id4, x4, y4);
                this.controller.pointerEvent(PointerEvents.POINTER_EXIT, id4, x4, y4);
                if (this.pointersInsideView.get(id4)) {
                    performClick();
                }
                this.pointersInsideView.delete(id4);
                return z;
            }
        } else if (getMultiTouchEnabled()) {
            PointerInfo pointerInfoOnTouchEvent$pointerInfoAt5 = onTouchEvent$pointerInfoAt(this, event, event.getActionIndex());
            int id5 = pointerInfoOnTouchEvent$pointerInfoAt5.getId();
            float x5 = pointerInfoOnTouchEvent$pointerInfoAt5.getX();
            float y5 = pointerInfoOnTouchEvent$pointerInfoAt5.getY();
            this.pointersInsideView.put(id5, inBounds(x5, y5));
            this.controller.pointerEvent(PointerEvents.POINTER_DOWN, id5, x5, y5);
            return z;
        }
        return z;
    }

    public final void pause() {
        RiveArtboardRenderer artboardRenderer = getArtboardRenderer();
        if (artboardRenderer != null) {
            artboardRenderer.stop();
        }
        this.controller.pause();
        stopFrameMetrics();
    }

    public final void play(String animationName, Loop loop, Direction direction, boolean isStateMachine, boolean settleInitialState) {
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setAnimationName(isStateMachine ? null : animationName);
        rendererAttributes.setStateMachineName(isStateMachine ? animationName : null);
        rendererAttributes.setLoop(loop);
        this.controller.play(animationName, loop, direction, isStateMachine, settleInitialState);
    }

    @adt
    public final void removeEventListener(RiveFileController.RiveEventListener listener) {
        this.controller.removeEventListener(listener);
    }

    public final void reset() {
        RiveArtboardRenderer artboardRenderer = getArtboardRenderer();
        if (artboardRenderer != null) {
            artboardRenderer.reset();
        }
    }

    public final void restoreControllerState(ControllerState state) {
        this.controller.restoreControllerState(state);
    }

    public final ControllerState saveControllerState() {
        this.rendererAttributes.setResource(null);
        return this.controller.saveControllerState();
    }

    public final void setAlignment(Alignment alignment) {
        this.controller.setAlignment(alignment);
    }

    public final void setArtboardName(String str) throws ArtboardException {
        this.controller.selectArtboard(str);
    }

    public final void setAssetLoader(FileAssetLoader assetLoader) {
        if (u890.j(assetLoader, this.rendererAttributes.getAssetLoader())) {
            RiveLog.INSTANCE.getLogger().w(TAG, new C00881(assetLoader));
            return;
        }
        RiveLog.INSTANCE.getLogger().d(TAG, new C00892(assetLoader));
        FileAssetLoader assetLoader2 = this.rendererAttributes.getAssetLoader();
        this.rendererAttributes.setAssetLoader(assetLoader);
        if (assetLoader != null) {
            assetLoader.acquire();
        }
        if (assetLoader2 != null) {
            assetLoader2.release();
        }
        RiveViewLifecycleObserver lifecycleObserver = getLifecycleObserver();
        RiveViewLifecycleObserver riveViewLifecycleObserver = lifecycleObserver instanceof RiveViewLifecycleObserver ? lifecycleObserver : null;
        if (riveViewLifecycleObserver != null) {
            if (assetLoader2 != null) {
                riveViewLifecycleObserver.remove(assetLoader2);
            }
            if (assetLoader != null) {
                riveViewLifecycleObserver.insert(assetLoader);
            }
        }
    }

    public final void setAutoplay(boolean z) {
        this.controller.setAutoplay(z);
    }

    @adt
    public final void setBooleanState(String stateMachineName, String inputName, boolean value) {
        RiveFileController.setBooleanState$default(this.controller, stateMachineName, inputName, value, null, 8, null);
    }

    @adt
    public final void setBooleanStateAtPath(String inputName, boolean value, String path) {
        this.controller.setBooleanStateAtPath(inputName, value, path);
    }

    public final void setController(RiveFileController riveFileController) {
        this.controller = riveFileController;
    }

    public final void setFit(Fit fit) {
        this.controller.setFit(fit);
    }

    public final void setLayoutScaleFactor(Float f) {
        this.controller.setLayoutScaleFactor(f);
    }

    public final void setLayoutScaleFactorAutomatic$kotlin_release(float f) {
        this.controller.setLayoutScaleFactorAutomatic$kotlin_release(f);
    }

    public void setMultiTouchEnabled(boolean z) {
        this.multiTouchEnabled = z;
        if (z) {
            return;
        }
        SparseBooleanArray sparseBooleanArray = this.pointersInsideView;
        int i = 0;
        while (true) {
            if (!(i < sparseBooleanArray.size())) {
                return;
            }
            int i2 = i + 1;
            int iKeyAt = sparseBooleanArray.keyAt(i);
            if (iKeyAt != 0) {
                this.controller.pointerEvent(PointerEvents.POINTER_UP, iKeyAt, -1.0f, -1.0f);
                this.controller.pointerEvent(PointerEvents.POINTER_EXIT, iKeyAt, -1.0f, -1.0f);
                this.pointersInsideView.delete(iKeyAt);
            }
            i = i2;
        }
    }

    @adt
    public final void setMultipleStates(ChangedInput... inputs) {
        this.controller.queueInputs$kotlin_release((ChangedInput[]) Arrays.copyOf(inputs, inputs.length));
    }

    @adt
    public final void setNumberState(String stateMachineName, String inputName, float value) {
        RiveFileController.setNumberState$default(this.controller, stateMachineName, inputName, value, null, 8, null);
    }

    @adt
    public final void setNumberStateAtPath(String inputName, float value, String path) {
        this.controller.setNumberStateAtPath(inputName, value, path);
    }

    public final void setRiveBytes(byte[] bytes, String artboardName, String animationName, String stateMachineName, boolean autoplay, boolean autoBind, Fit fit, Alignment alignment, Loop loop) {
        RiveLog.INSTANCE.getLogger().d(TAG, new C00901(bytes));
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setArtboardName(artboardName);
        rendererAttributes.setAnimationName(animationName);
        rendererAttributes.setStateMachineName(stateMachineName);
        rendererAttributes.setAutoplay(autoplay);
        rendererAttributes.setAutoBind(autoBind);
        rendererAttributes.setFit(fit);
        rendererAttributes.setAlignment(alignment);
        rendererAttributes.setLoop(loop);
        rendererAttributes.setResource(ResourceType.INSTANCE.makeMaybeResource(bytes));
        loadFileFromResource(new C00913());
    }

    public final void setRiveFile(File file, String artboardName, String animationName, String stateMachineName, boolean autoplay, boolean autoBind, Fit fit, Alignment alignment, Loop loop) throws RiveException {
        if (file.getRendererType() != this.rendererAttributes.getRendererType()) {
            throw new RiveException(gvg.h("Incompatible Renderer types: file initialized with ", file.getRendererType().name(), " but View is set up for ", this.rendererAttributes.getRendererType().name()));
        }
        RiveLog.INSTANCE.getLogger().d(TAG, new C00921(file));
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setArtboardName(artboardName);
        rendererAttributes.setAnimationName(animationName);
        rendererAttributes.setStateMachineName(stateMachineName);
        rendererAttributes.setAutoplay(autoplay);
        rendererAttributes.setAutoBind(autoBind);
        rendererAttributes.setFit(fit);
        rendererAttributes.setAlignment(alignment);
        rendererAttributes.setLoop(loop);
        rendererAttributes.setResource(ResourceType.INSTANCE.makeMaybeResource(file));
        this.controller.setFile(file);
        this.controller.setupScene$kotlin_release(this.rendererAttributes);
    }

    public final void setRiveResource(int resId, String artboardName, String animationName, String stateMachineName, boolean autoplay, boolean autoBind, Fit fit, Alignment alignment, Loop loop) {
        RiveLog.INSTANCE.getLogger().d(TAG, new C00931(resId));
        RendererAttributes rendererAttributes = this.rendererAttributes;
        rendererAttributes.setArtboardName(artboardName);
        rendererAttributes.setAnimationName(animationName);
        rendererAttributes.setStateMachineName(stateMachineName);
        rendererAttributes.setAutoplay(autoplay);
        rendererAttributes.setAutoBind(autoBind);
        rendererAttributes.setFit(fit);
        rendererAttributes.setAlignment(alignment);
        rendererAttributes.setLoop(loop);
        rendererAttributes.setResource(ResourceType.INSTANCE.makeMaybeResource(Integer.valueOf(resId)));
        loadFileFromResource(new C00943());
    }

    @adt
    public final void setTextRunValue(String textRunName, String textValue) throws TextValueRunException {
        this.controller.setTextRunValue(textRunName, textValue);
    }

    public void setTouchPassThrough(boolean z) {
        this.touchPassThrough = z;
    }

    public final void setVolume(float value) {
        this.controller.setVolume(value);
    }

    public final void stop() {
        this.controller.stopAnimations();
        stopFrameMetrics();
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        public final String invoke() {
            return "Creating RiveAnimationView.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$createObserver$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00811 extends hab0 implements Function0 {
        public static final C00811 INSTANCE = new C00811();

        public C00811() {
            super(0);
        }

        public final String invoke() {
            return "Creating lifecycle observer.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$createRenderer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00821 extends hab0 implements Function0 {
        public static final C00821 INSTANCE = new C00821();

        public C00821() {
            super(0);
        }

        public final String invoke() {
            return "Creating RiveArtboardRenderer.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$loadFileFromResource$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00831 extends hab0 implements Function0 {
        public static final C00831 INSTANCE = new C00831();

        public C00831() {
            super(0);
        }

        public final String invoke() {
            return "loadResource: no resource to load";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$loadFileFromResource$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends hab0 implements Function0 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        public final String invoke() {
            return "Loading Rive file from existing Rive File. No extra work required.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$onMeasure$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00861 extends hab0 implements Function0 {
        public static final C00861 INSTANCE = new C00861();

        public C00861() {
            super(0);
        }

        public final String invoke() {
            return "onMeasure(): Renderer not instantiated yet.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$onTouchEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00871 extends hab0 implements Function0 {
        public static final C00871 INSTANCE = new C00871();

        public C00871() {
            super(0);
        }

        public final String invoke() {
            return "onTouchEvent(): Renderer not instantiated yet.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$startFrameMetrics$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C00952 extends hab0 implements Function0 {
        public static final C00952 INSTANCE = new C00952();

        public C00952() {
            super(0);
        }

        public final String invoke() {
            return "FrameMetrics is available with Android SDK 24 (Nougat) and higher";
        }
    }

    @Override // app.p000rive.runtime.kotlin.Observable
    @adt
    public void registerListener(RiveFileController.Listener listener) {
        this.controller.registerListener(listener);
    }

    @adt
    public final void setTextRunValue(String textRunName, String textValue, String path) throws TextValueRunException {
        this.controller.setTextRunValue(textRunName, textValue, path);
    }

    @Override // app.p000rive.runtime.kotlin.Observable
    @adt
    public void unregisterListener(RiveFileController.Listener listener) {
        this.controller.unregisterListener(listener);
    }

    @adt
    public final String getTextRunValue(String textRunName, String path) {
        return this.controller.getTextRunValue(textRunName, path);
    }

    public final void stop(List<String> animationNames, boolean areStateMachines) {
        this.controller.stopAnimations(animationNames, areStateMachines);
    }

    public final void stop(String animationName, boolean isStateMachine) {
        this.controller.stopAnimations(animationName, isStateMachine);
    }

    public static /* synthetic */ void pause$default(RiveAnimationView riveAnimationView, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: pause");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        riveAnimationView.pause(str, z);
    }

    public static /* synthetic */ void stop$default(RiveAnimationView riveAnimationView, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: stop");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        riveAnimationView.stop(str, z);
    }

    public final void pause(List<String> animationNames, boolean areStateMachines) {
        this.controller.pause(animationNames, areStateMachines);
    }

    public final void pause(String animationName, boolean isStateMachine) {
        this.controller.pause(animationName, isStateMachine);
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$onAttachedToWindow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lapp/rive/runtime/kotlin/core/File;", "it", "Lp/rih1;", "invoke", "(Lapp/rive/runtime/kotlin/core/File;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C00851 extends hab0 implements iu30 {
        public C00851() {
            super(1);
        }

        public final void invoke(File file) throws StateMachineException {
            RiveAnimationView.this.getController().setFile(file);
            RiveAnimationView.this.getController().setupScene$kotlin_release(RiveAnimationView.this.getRendererAttributes());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws StateMachineException {
            invoke((File) obj);
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$setRiveBytes$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lapp/rive/runtime/kotlin/core/File;", "it", "Lp/rih1;", "invoke", "(Lapp/rive/runtime/kotlin/core/File;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C00913 extends hab0 implements iu30 {
        public C00913() {
            super(1);
        }

        public final void invoke(File file) throws StateMachineException {
            RiveAnimationView.this.getController().setFile(file);
            RiveAnimationView.this.getController().setupScene$kotlin_release(RiveAnimationView.this.getRendererAttributes());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws StateMachineException {
            invoke((File) obj);
            return rih1.a;
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.RiveAnimationView$setRiveResource$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lapp/rive/runtime/kotlin/core/File;", "it", "Lp/rih1;", "invoke", "(Lapp/rive/runtime/kotlin/core/File;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C00943 extends hab0 implements iu30 {
        public C00943() {
            super(1);
        }

        public final void invoke(File file) throws StateMachineException {
            RiveAnimationView.this.getController().setFile(file);
            RiveAnimationView.this.getController().setupScene$kotlin_release(RiveAnimationView.this.getRendererAttributes());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws StateMachineException {
            invoke((File) obj);
            return rih1.a;
        }
    }

    public final void play(List<String> animationNames, Loop loop, Direction direction, boolean areStateMachines, boolean settleInitialState) {
        this.rendererAttributes.setLoop(loop);
        this.controller.play(animationNames, loop, direction, areStateMachines, settleInitialState);
    }

    public final void play(Loop loop, Direction direction, boolean settleInitialState) {
        this.rendererAttributes.setLoop(loop);
        this.controller.play(loop, direction, settleInitialState);
    }

    public static /* synthetic */ void play$default(RiveAnimationView riveAnimationView, Loop loop, Direction direction, boolean z, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: play");
            return;
        }
        if ((i & 1) != 0) {
            loop = Loop.AUTO;
        }
        if ((i & 2) != 0) {
            direction = Direction.AUTO;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        riveAnimationView.play(loop, direction, z);
    }

    public static /* synthetic */ void play$default(RiveAnimationView riveAnimationView, String str, Loop loop, Direction direction, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: play");
            return;
        }
        if ((i & 2) != 0) {
            loop = Loop.AUTO;
        }
        Loop loop2 = loop;
        if ((i & 4) != 0) {
            direction = Direction.AUTO;
        }
        Direction direction2 = direction;
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = true;
        }
        riveAnimationView.play(str, loop2, direction2, z3, z2);
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001GB}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R&\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\u001a\u0010,\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00102\u001a\u0002038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b4\u0010\u001b\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010'\"\u0004\bD\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001d\"\u0004\bF\u0010\u001f¨\u0006H"}, d2 = {"Lapp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes;", "", "alignmentIndex", "", "fitIndex", "loopIndex", "rendererIndex", "autoplay", "", "autoBind", "riveTraceAnimations", "artboardName", "", "animationName", "stateMachineName", "resource", "Lapp/rive/runtime/kotlin/ResourceType;", "assetLoader", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "(IIIIZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/rive/runtime/kotlin/ResourceType;Lapp/rive/runtime/kotlin/core/FileAssetLoader;)V", "alignment", "Lapp/rive/runtime/kotlin/core/Alignment;", "getAlignment", "()Lapp/rive/runtime/kotlin/core/Alignment;", "setAlignment", "(Lapp/rive/runtime/kotlin/core/Alignment;)V", "getAnimationName$annotations", "()V", "getAnimationName", "()Ljava/lang/String;", "setAnimationName", "(Ljava/lang/String;)V", "getArtboardName", "setArtboardName", "getAssetLoader", "()Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "setAssetLoader", "(Lapp/rive/runtime/kotlin/core/FileAssetLoader;)V", "getAutoBind", "()Z", "setAutoBind", "(Z)V", "getAutoplay", "setAutoplay", "fit", "Lapp/rive/runtime/kotlin/core/Fit;", "getFit", "()Lapp/rive/runtime/kotlin/core/Fit;", "setFit", "(Lapp/rive/runtime/kotlin/core/Fit;)V", "loop", "Lapp/rive/runtime/kotlin/core/Loop;", "getLoop$annotations", "getLoop", "()Lapp/rive/runtime/kotlin/core/Loop;", "setLoop", "(Lapp/rive/runtime/kotlin/core/Loop;)V", "rendererType", "Lapp/rive/runtime/kotlin/core/RendererType;", "getRendererType", "()Lapp/rive/runtime/kotlin/core/RendererType;", "setRendererType", "(Lapp/rive/runtime/kotlin/core/RendererType;)V", "getResource", "()Lapp/rive/runtime/kotlin/ResourceType;", "setResource", "(Lapp/rive/runtime/kotlin/ResourceType;)V", "getRiveTraceAnimations", "setRiveTraceAnimations", "getStateMachineName", "setStateMachineName", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RendererAttributes {
        private Alignment alignment;
        private String animationName;
        private String artboardName;
        private FileAssetLoader assetLoader;
        private boolean autoBind;
        private boolean autoplay;
        private Fit fit;
        private Loop loop;
        private RendererType rendererType;
        private ResourceType resource;
        private boolean riveTraceAnimations;
        private String stateMachineName;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lapp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes$Companion;", "", "()V", "assetLoaderFrom", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "name", "", "context", "Landroid/content/Context;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FileAssetLoader assetLoaderFrom(String name, Context context) {
                Constructor<?> constructor;
                Constructor<?> constructor2;
                Object objNewInstance;
                Object objNewInstance2;
                if (name != null && name.length() != 0) {
                    try {
                        Class<?> cls = Class.forName(name);
                        Constructor<?>[] constructors = cls.getConstructors();
                        int length = constructors.length;
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                constructor = null;
                                break;
                            }
                            constructor = constructors[i2];
                            if (constructor.getParameterTypes().length == 1 && u890.j(constructor.getParameterTypes()[0], Context.class)) {
                                break;
                            }
                            i2++;
                        }
                        if (constructor != null && (objNewInstance2 = constructor.newInstance(context.getApplicationContext())) != null && (objNewInstance2 instanceof ContextAssetLoader)) {
                            return (FileAssetLoader) objNewInstance2;
                        }
                        Constructor<?>[] constructors2 = cls.getConstructors();
                        int length2 = constructors2.length;
                        while (true) {
                            if (i >= length2) {
                                constructor2 = null;
                                break;
                            }
                            constructor2 = constructors2[i];
                            if (constructor2.getParameterTypes().length == 0) {
                                break;
                            }
                            i++;
                        }
                        if (constructor2 != null && (objNewInstance = constructor2.newInstance(null)) != null && (objNewInstance instanceof FileAssetLoader)) {
                            return (FileAssetLoader) objNewInstance;
                        }
                        RiveLog.INSTANCE.getLogger().e(RiveAnimationView.TAG, null, new RiveAnimationView$RendererAttributes$Companion$assetLoaderFrom$3(name));
                        return null;
                    } catch (Exception e) {
                        RiveLog.INSTANCE.getLogger().e(RiveAnimationView.TAG, null, new RiveAnimationView$RendererAttributes$Companion$assetLoaderFrom$4(name, e));
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        public /* synthetic */ RendererAttributes(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, String str, String str2, String str3, ResourceType resourceType, FileAssetLoader fileAssetLoader, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? RiveAnimationView.INSTANCE.getAlignmentIndexDefault() : i, (i5 & 2) != 0 ? RiveAnimationView.INSTANCE.getFitIndexDefault() : i2, (i5 & 4) != 0 ? RiveAnimationView.INSTANCE.getLoopIndexDefault() : i3, (i5 & 8) != 0 ? RiveAnimationView.INSTANCE.getRendererIndexDefault() : i4, z, (i5 & 32) != 0 ? false : z2, (i5 & 64) != 0 ? false : z3, str, str2, str3, resourceType, (i5 & SemanticState.Modal) != 0 ? null : fileAssetLoader);
        }

        @adt
        public static /* synthetic */ void getAnimationName$annotations() {
        }

        @adt
        public static /* synthetic */ void getLoop$annotations() {
        }

        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final String getAnimationName() {
            return this.animationName;
        }

        public final String getArtboardName() {
            return this.artboardName;
        }

        public final FileAssetLoader getAssetLoader() {
            return this.assetLoader;
        }

        public final boolean getAutoBind() {
            return this.autoBind;
        }

        public final boolean getAutoplay() {
            return this.autoplay;
        }

        public final Fit getFit() {
            return this.fit;
        }

        public final Loop getLoop() {
            return this.loop;
        }

        public final RendererType getRendererType() {
            return this.rendererType;
        }

        public final ResourceType getResource() {
            return this.resource;
        }

        public final boolean getRiveTraceAnimations() {
            return this.riveTraceAnimations;
        }

        public final String getStateMachineName() {
            return this.stateMachineName;
        }

        public final void setAlignment(Alignment alignment) {
            this.alignment = alignment;
        }

        public final void setAnimationName(String str) {
            this.animationName = str;
        }

        public final void setArtboardName(String str) {
            this.artboardName = str;
        }

        public final void setAssetLoader(FileAssetLoader fileAssetLoader) {
            this.assetLoader = fileAssetLoader;
        }

        public final void setAutoBind(boolean z) {
            this.autoBind = z;
        }

        public final void setAutoplay(boolean z) {
            this.autoplay = z;
        }

        public final void setFit(Fit fit) {
            this.fit = fit;
        }

        public final void setLoop(Loop loop) {
            this.loop = loop;
        }

        public final void setRendererType(RendererType rendererType) {
            this.rendererType = rendererType;
        }

        public final void setResource(ResourceType resourceType) {
            this.resource = resourceType;
        }

        public final void setRiveTraceAnimations(boolean z) {
            this.riveTraceAnimations = z;
        }

        public final void setStateMachineName(String str) {
            this.stateMachineName = str;
        }

        public RendererAttributes(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, String str, String str2, String str3, ResourceType resourceType, FileAssetLoader fileAssetLoader) {
            this.autoplay = z;
            this.autoBind = z2;
            this.riveTraceAnimations = z3;
            this.artboardName = str;
            this.animationName = str2;
            this.stateMachineName = str3;
            this.resource = resourceType;
            this.assetLoader = fileAssetLoader;
            this.alignment = Alignment.INSTANCE.fromIndex(i);
            this.fit = Fit.INSTANCE.fromIndex(i2);
            this.loop = Loop.INSTANCE.fromIndex(i3);
            this.rendererType = RendererType.INSTANCE.fromIndex(i4);
        }
    }

    public /* synthetic */ RiveAnimationView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RiveAnimationView(Builder builder) {
        AttributeSet attributeSet = null;
        this(builder.getContext(), attributeSet, 2, attributeSet);
        if (getArtboardRenderer() == null) {
            RendererAttributes rendererAttributes = this.rendererAttributes;
            RendererType rendererType = builder.getRendererType();
            rendererAttributes.setRendererType(rendererType == null ? RendererType.INSTANCE.fromIndex(rendererIndexDefault) : rendererType);
            Boolean autoplay = builder.getAutoplay();
            rendererAttributes.setAutoplay(autoplay != null ? autoplay.booleanValue() : getDefaultAutoplay());
            rendererAttributes.setAutoBind(builder.getAutoBind());
            Boolean traceAnimations = builder.getTraceAnimations();
            rendererAttributes.setRiveTraceAnimations(traceAnimations != null ? traceAnimations.booleanValue() : false);
            rendererAttributes.setArtboardName(builder.getArtboardName());
            rendererAttributes.setAnimationName(builder.getAnimationName());
            rendererAttributes.setStateMachineName(builder.getStateMachineName());
            rendererAttributes.setResource(builder.getResourceType());
            ((FallbackAssetLoader) rendererAttributes.getAssetLoader()).resetWith$kotlin_release(builder);
            Alignment alignment = builder.getAlignment();
            rendererAttributes.setAlignment(alignment == null ? rendererAttributes.getAlignment() : alignment);
            Fit fit = builder.getFit();
            rendererAttributes.setFit(fit == null ? rendererAttributes.getFit() : fit);
            Loop loop = builder.getLoop();
            rendererAttributes.setLoop(loop == null ? rendererAttributes.getLoop() : loop);
            setTouchPassThrough(builder.getTouchPassThrough());
            setMultiTouchEnabled(builder.getMultiTouchEnabled());
            return;
        }
        hhg1.n("Failed requirement.");
        throw null;
    }
}
