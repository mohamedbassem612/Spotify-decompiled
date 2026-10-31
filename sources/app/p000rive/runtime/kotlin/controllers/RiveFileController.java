package app.p000rive.runtime.kotlin.controllers;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Trace;
import app.p000rive.RiveLog;
import app.p000rive.runtime.kotlin.ChangedInput;
import app.p000rive.runtime.kotlin.Observable;
import app.p000rive.runtime.kotlin.RiveAnimationView;
import app.p000rive.runtime.kotlin.core.AdvanceResult;
import app.p000rive.runtime.kotlin.core.Alignment;
import app.p000rive.runtime.kotlin.core.Artboard;
import app.p000rive.runtime.kotlin.core.Direction;
import app.p000rive.runtime.kotlin.core.File;
import app.p000rive.runtime.kotlin.core.Fit;
import app.p000rive.runtime.kotlin.core.Helpers;
import app.p000rive.runtime.kotlin.core.LayerState;
import app.p000rive.runtime.kotlin.core.LinearAnimationInstance;
import app.p000rive.runtime.kotlin.core.Loop;
import app.p000rive.runtime.kotlin.core.PlayableInstance;
import app.p000rive.runtime.kotlin.core.RefCount;
import app.p000rive.runtime.kotlin.core.RiveEvent;
import app.p000rive.runtime.kotlin.core.SMIBoolean;
import app.p000rive.runtime.kotlin.core.SMIInput;
import app.p000rive.runtime.kotlin.core.SMINumber;
import app.p000rive.runtime.kotlin.core.SMITrigger;
import app.p000rive.runtime.kotlin.core.StateMachineInstance;
import app.p000rive.runtime.kotlin.core.ViewModelInstance;
import app.p000rive.runtime.kotlin.core.errors.ArtboardException;
import app.p000rive.runtime.kotlin.core.errors.StateMachineException;
import app.p000rive.runtime.kotlin.core.errors.TextValueRunException;
import app.p000rive.runtime.kotlin.core.errors.ViewModelException;
import app.p000rive.runtime.kotlin.renderers.PointerEvents;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.cy30;
import p.f46;
import p.hab0;
import p.hhg1;
import p.o7h;
import p.rih1;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@adt
@Metadata(d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0017\u0018\u0000 \u0099\u00022\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006\u0099\u0002\u009a\u0002\u009b\u0002B]\b\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0004\u0018\u0001`\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014BM\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0013\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010\u0007\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0007\u0010'J\u0017\u0010,\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0010¢\u0006\u0004\b*\u0010+JE\u00103\u001a\u00020\r2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020 0-2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u00104J?\u00103\u001a\u00020\r2\u0006\u00105\u001a\u00020 2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00106\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u00107J-\u00103\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b3\u00108J\u000f\u00109\u001a\u00020\rH\u0016¢\u0006\u0004\b9\u0010'J'\u00109\u001a\u00020\r2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020 0-2\b\b\u0002\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010:J!\u00109\u001a\u00020\r2\u0006\u00105\u001a\u00020 2\b\b\u0002\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010;J\u000f\u0010<\u001a\u00020\rH\u0016¢\u0006\u0004\b<\u0010'J'\u0010<\u001a\u00020\r2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020 0-2\b\b\u0002\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010:J!\u0010<\u001a\u00020\r2\u0006\u00105\u001a\u00020 2\b\b\u0002\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010;J#\u0010A\u001a\u00020\r2\u0012\u0010>\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110=\"\u00020\u0011H\u0011¢\u0006\u0004\b?\u0010@J+\u0010E\u001a\u00020\r2\u0006\u0010B\u001a\u00020 2\u0006\u0010C\u001a\u00020 2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010 H\u0017¢\u0006\u0004\bE\u0010FJ3\u0010H\u001a\u00020\r2\u0006\u0010B\u001a\u00020 2\u0006\u0010C\u001a\u00020 2\u0006\u0010G\u001a\u00020\u00062\n\b\u0002\u0010D\u001a\u0004\u0018\u00010 H\u0017¢\u0006\u0004\bH\u0010IJ3\u0010J\u001a\u00020\r2\u0006\u0010B\u001a\u00020 2\u0006\u0010C\u001a\u00020 2\u0006\u0010G\u001a\u00020\u001c2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010 H\u0017¢\u0006\u0004\bJ\u0010KJ\u001f\u0010L\u001a\u00020\r2\u0006\u0010C\u001a\u00020 2\u0006\u0010D\u001a\u00020 H\u0017¢\u0006\u0004\bL\u0010MJ'\u0010N\u001a\u00020\r2\u0006\u0010C\u001a\u00020 2\u0006\u0010G\u001a\u00020\u00062\u0006\u0010D\u001a\u00020 H\u0017¢\u0006\u0004\bN\u0010OJ'\u0010P\u001a\u00020\r2\u0006\u0010C\u001a\u00020 2\u0006\u0010G\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020 H\u0017¢\u0006\u0004\bP\u0010QJ\u0019\u0010S\u001a\u0004\u0018\u00010 2\u0006\u0010R\u001a\u00020 H\u0017¢\u0006\u0004\bS\u0010TJ!\u0010S\u001a\u0004\u0018\u00010 2\u0006\u0010R\u001a\u00020 2\u0006\u0010D\u001a\u00020 H\u0017¢\u0006\u0004\bS\u0010UJ\u001f\u0010W\u001a\u00020\r2\u0006\u0010R\u001a\u00020 2\u0006\u0010V\u001a\u00020 H\u0017¢\u0006\u0004\bW\u0010MJ'\u0010W\u001a\u00020\r2\u0006\u0010R\u001a\u00020 2\u0006\u0010V\u001a\u00020 2\u0006\u0010D\u001a\u00020 H\u0017¢\u0006\u0004\bW\u0010FJ\u0011\u0010X\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\r2\u0006\u0010G\u001a\u00020\u001cH\u0016¢\u0006\u0004\bZ\u0010\u001fJ\u001f\u0010_\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020[2\u0006\u0010\u001d\u001a\u00020\u001cH\u0010¢\u0006\u0004\b]\u0010^J!\u00103\u001a\u00020\r2\u0006\u0010\\\u001a\u00020[2\b\b\u0002\u0010`\u001a\u00020\u0006H\u0010¢\u0006\u0004\ba\u0010bJ'\u00103\u001a\u00020\r2\u0006\u0010d\u001a\u00020c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020/H\u0010¢\u0006\u0004\ba\u0010eJ/\u0010l\u001a\u00020\r2\u0006\u0010g\u001a\u00020f2\u0006\u0010i\u001a\u00020h2\u0006\u0010j\u001a\u00020\u001c2\u0006\u0010k\u001a\u00020\u001cH\u0016¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\r2\u0006\u0010n\u001a\u00020\u0002H\u0017¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\r2\u0006\u0010n\u001a\u00020\u0002H\u0017¢\u0006\u0004\bq\u0010pJ\u0017\u0010s\u001a\u00020\r2\u0006\u0010n\u001a\u00020rH\u0017¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020\r2\u0006\u0010n\u001a\u00020rH\u0017¢\u0006\u0004\bu\u0010tJ\u000f\u0010w\u001a\u00020\rH\u0010¢\u0006\u0004\bv\u0010'J\u000f\u0010x\u001a\u00020hH\u0016¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020\r2\u0006\u0010z\u001a\u00020\nH\u0012¢\u0006\u0004\b{\u0010|J7\u0010~\u001a\u00020\r2\u0006\u0010B\u001a\u00020 2\u0006\u0010C\u001a\u00020 2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010}2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010 H\u0012¢\u0006\u0004\b~\u0010\u007fJ\u0011\u0010\u0080\u0001\u001a\u00020\rH\u0013¢\u0006\u0005\b\u0080\u0001\u0010'J \u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020c0-2\u0006\u00105\u001a\u00020 H\u0012¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J \u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020[0-2\u0006\u00105\u001a\u00020 H\u0012¢\u0006\u0006\b\u0083\u0001\u0010\u0082\u0001J'\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020c0-2\r\u0010.\u001a\t\u0012\u0004\u0012\u00020 0\u0084\u0001H\u0012¢\u0006\u0006\b\u0081\u0001\u0010\u0085\u0001J'\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020[0-2\r\u0010.\u001a\t\u0012\u0004\u0012\u00020 0\u0084\u0001H\u0012¢\u0006\u0006\b\u0083\u0001\u0010\u0085\u0001J \u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020[0-2\u0006\u00105\u001a\u00020 H\u0012¢\u0006\u0006\b\u0086\u0001\u0010\u0082\u0001JA\u0010\u0087\u0001\u001a\u00020\r2\u0006\u00105\u001a\u00020 2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00106\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006H\u0012¢\u0006\u0005\b\u0087\u0001\u00107J\u0019\u00109\u001a\u00020\r2\u0007\u0010\u0088\u0001\u001a\u00020cH\u0012¢\u0006\u0005\b9\u0010\u0089\u0001J\u0019\u00109\u001a\u00020\r2\u0007\u0010\u008a\u0001\u001a\u00020[H\u0012¢\u0006\u0005\b9\u0010\u008b\u0001J\u001b\u0010\u008c\u0001\u001a\u00020\r2\u0007\u0010\u0088\u0001\u001a\u00020cH\u0012¢\u0006\u0006\b\u008c\u0001\u0010\u0089\u0001J\u001b\u0010\u008c\u0001\u001a\u00020\r2\u0007\u0010\u008a\u0001\u001a\u00020[H\u0012¢\u0006\u0006\b\u008c\u0001\u0010\u008b\u0001J\u001c\u0010\u008f\u0001\u001a\u00020\r2\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0012¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001c\u0010\u0091\u0001\u001a\u00020\r2\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0012¢\u0006\u0006\b\u0091\u0001\u0010\u0090\u0001J\u001c\u0010\u0092\u0001\u001a\u00020\r2\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0012¢\u0006\u0006\b\u0092\u0001\u0010\u0090\u0001J\u001c\u0010\u0093\u0001\u001a\u00020\r2\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0012¢\u0006\u0006\b\u0093\u0001\u0010\u0090\u0001J\u0019\u0010\u0094\u0001\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0013¢\u0006\u0005\b\u0094\u0001\u0010\u001fJ$\u0010\u0096\u0001\u001a\u00020\r2\u0007\u0010\u008a\u0001\u001a\u00020[2\u0007\u0010\u0019\u001a\u00030\u0095\u0001H\u0012¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001c\u0010\u009a\u0001\u001a\u00020\r2\b\u0010\u0099\u0001\u001a\u00030\u0098\u0001H\u0012¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001R.\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u001e\n\u0005\b\u0005\u0010\u009c\u0001\u0012\u0005\b¡\u0001\u0010'\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R'\u0010\u0007\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\b\u0007\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R5\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0004\u0018\u0001`\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\b\u000f\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0011X\u0091\u0004¢\u0006\u0016\n\u0005\b\u0012\u0010¬\u0001\u0012\u0005\b¯\u0001\u0010'\u001a\u0006\b\u00ad\u0001\u0010®\u0001R*\u0010±\u0001\u001a\u00030°\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R)\u0010·\u0001\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010¢\u0001\u001a\u0006\b·\u0001\u0010¤\u0001\"\u0006\b¸\u0001\u0010¦\u0001R*\u0010º\u0001\u001a\u00030¹\u00018\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R3\u0010Á\u0001\u001a\u00030À\u00012\u0007\u0010G\u001a\u00030À\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R3\u0010È\u0001\u001a\u00030Ç\u00012\u0007\u0010G\u001a\u00030Ç\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R4\u0010Î\u0001\u001a\u0004\u0018\u00010\u001c2\b\u0010G\u001a\u0004\u0018\u00010\u001c8\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0005\bÐ\u0001\u0010Y\"\u0006\bÑ\u0001\u0010Ò\u0001R0\u0010Ó\u0001\u001a\u00020\u001c2\u0006\u0010G\u001a\u00020\u001c8\u0016@PX\u0096\u000e¢\u0006\u0017\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0005\b×\u0001\u0010\u001fR3\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010G\u001a\u0004\u0018\u00010\b8\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b\t\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R2\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010G\u001a\u0004\u0018\u00010\n8\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0005\b\u000b\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0005\bà\u0001\u0010|RA\u0010ã\u0001\u001a*\u0012\r\u0012\u000b â\u0001*\u0004\u0018\u00010c0c â\u0001*\u0013\u0012\r\u0012\u000b â\u0001*\u0004\u0018\u00010c0c\u0018\u00010-0á\u00018\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001RA\u0010å\u0001\u001a*\u0012\r\u0012\u000b â\u0001*\u0004\u0018\u00010[0[ â\u0001*\u0013\u0012\r\u0012\u000b â\u0001*\u0004\u0018\u00010[0[\u0018\u00010-0á\u00018\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bå\u0001\u0010ä\u0001RB\u0010è\u0001\u001a+\u0012\r\u0012\u000b â\u0001*\u0004\u0018\u00010c0c â\u0001*\u0014\u0012\r\u0012\u000b â\u0001*\u0004\u0018\u00010c0c\u0018\u00010ç\u00010æ\u00018\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001RB\u0010ê\u0001\u001a+\u0012\r\u0012\u000b â\u0001*\u0004\u0018\u00010[0[ â\u0001*\u0014\u0012\r\u0012\u000b â\u0001*\u0004\u0018\u00010[0[\u0018\u00010ç\u00010æ\u00018\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bê\u0001\u0010é\u0001R \u0010ì\u0001\u001a\u00030ë\u00018\u0010X\u0090\u0004¢\u0006\u0010\n\u0006\bì\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001R*\u0010ñ\u0001\u001a\u00030ð\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\bñ\u0001\u0010ò\u0001\u001a\u0006\bó\u0001\u0010ô\u0001\"\u0006\bõ\u0001\u0010ö\u0001R\u001b\u0010÷\u0001\u001a\u0004\u0018\u00010\u001c8\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010Ï\u0001R \u0010ø\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020æ\u00018\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bø\u0001\u0010é\u0001R \u0010ù\u0001\u001a\t\u0012\u0004\u0012\u00020r0æ\u00018\u0012@\u0012X\u0092\u000e¢\u0006\b\n\u0006\bù\u0001\u0010é\u0001R\u0017\u0010û\u0001\u001a\u00020\u001c8PX\u0090\u0004¢\u0006\b\u001a\u0006\bú\u0001\u0010Ö\u0001R$\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020c0-8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bþ\u0001\u0010'\u001a\u0006\bü\u0001\u0010ý\u0001R$\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020[0-8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b\u0080\u0002\u0010'\u001a\u0006\bÿ\u0001\u0010ý\u0001R0\u0010\u0086\u0002\u001a\u0014\u0012\u0004\u0012\u00020c0\u0081\u0002j\t\u0012\u0004\u0012\u00020c`\u0082\u00028VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b\u0085\u0002\u0010'\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002R0\u0010\u0089\u0002\u001a\u0014\u0012\u0004\u0012\u00020[0\u0081\u0002j\t\u0012\u0004\u0012\u00020[`\u0082\u00028VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b\u0088\u0002\u0010'\u001a\u0006\b\u0087\u0002\u0010\u0084\u0002R%\u0010\u008d\u0002\u001a\t\u0012\u0004\u0012\u00020c0ç\u00018VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b\u008c\u0002\u0010'\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002R\u001e\u0010\u008f\u0002\u001a\t\u0012\u0004\u0012\u00020[0ç\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u008b\u0002R\u0017\u0010\u0090\u0002\u001a\u00020\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0090\u0002\u0010¤\u0001R\u0018\u0010\u0092\u0002\u001a\u00030ð\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010ô\u0001R0\u0010\u0095\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u00020\u0081\u0002j\t\u0012\u0004\u0012\u00020\u0002`\u0082\u00028VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b\u0094\u0002\u0010'\u001a\u0006\b\u0093\u0002\u0010\u0084\u0002R0\u0010\u0098\u0002\u001a\u0014\u0012\u0004\u0012\u00020r0\u0081\u0002j\t\u0012\u0004\u0012\u00020r`\u0082\u00028VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b\u0097\u0002\u0010'\u001a\u0006\b\u0096\u0002\u0010\u0084\u0002¨\u0006\u009c\u0002"}, d2 = {"Lapp/rive/runtime/kotlin/controllers/RiveFileController;", "Lapp/rive/runtime/kotlin/Observable;", "Lapp/rive/runtime/kotlin/controllers/RiveFileController$Listener;", "Lapp/rive/runtime/kotlin/core/RefCount;", "Lapp/rive/runtime/kotlin/core/Loop;", "loop", "", "autoplay", "Lapp/rive/runtime/kotlin/core/File;", "file", "Lapp/rive/runtime/kotlin/core/Artboard;", "activeArtboard", "Lkotlin/Function0;", "Lp/rih1;", "Lapp/rive/runtime/kotlin/controllers/OnStartCallback;", "onStart", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lapp/rive/runtime/kotlin/ChangedInput;", "changedInputs", "<init>", "(Lapp/rive/runtime/kotlin/core/Loop;ZLapp/rive/runtime/kotlin/core/File;Lapp/rive/runtime/kotlin/core/Artboard;Lkotlin/jvm/functions/Function0;Ljava/util/concurrent/ConcurrentLinkedQueue;)V", "(Lapp/rive/runtime/kotlin/core/Loop;ZLapp/rive/runtime/kotlin/core/File;Lapp/rive/runtime/kotlin/core/Artboard;Lkotlin/jvm/functions/Function0;)V", "Lapp/rive/runtime/kotlin/controllers/ControllerState;", "saveControllerState", "()Lapp/rive/runtime/kotlin/controllers/ControllerState;", "state", "restoreControllerState", "(Lapp/rive/runtime/kotlin/controllers/ControllerState;)V", "", "elapsed", "advance", "(F)V", "", "artboardName", "setRiveFile", "(Lapp/rive/runtime/kotlin/core/File;Ljava/lang/String;)V", "name", "selectArtboard", "(Ljava/lang/String;)V", "()V", "Lapp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes;", "rendererAttributes", "setupScene$kotlin_release", "(Lapp/rive/runtime/kotlin/RiveAnimationView$RendererAttributes;)V", "setupScene", "", "animationNames", "Lapp/rive/runtime/kotlin/core/Direction;", "direction", "areStateMachines", "settleInitialState", "play", "(Ljava/util/List;Lapp/rive/runtime/kotlin/core/Loop;Lapp/rive/runtime/kotlin/core/Direction;ZZ)V", "animationName", "isStateMachine", "(Ljava/lang/String;Lapp/rive/runtime/kotlin/core/Loop;Lapp/rive/runtime/kotlin/core/Direction;ZZ)V", "(Lapp/rive/runtime/kotlin/core/Loop;Lapp/rive/runtime/kotlin/core/Direction;Z)V", "pause", "(Ljava/util/List;Z)V", "(Ljava/lang/String;Z)V", "stopAnimations", "", "inputs", "queueInputs$kotlin_release", "([Lapp/rive/runtime/kotlin/ChangedInput;)V", "queueInputs", "stateMachineName", "inputName", "path", "fireState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "value", "setBooleanState", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "setNumberState", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;)V", "fireStateAtPath", "(Ljava/lang/String;Ljava/lang/String;)V", "setBooleanStateAtPath", "(Ljava/lang/String;ZLjava/lang/String;)V", "setNumberStateAtPath", "(Ljava/lang/String;FLjava/lang/String;)V", "textRunName", "getTextRunValue", "(Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "textValue", "setTextRunValue", "getVolume", "()Ljava/lang/Float;", "setVolume", "Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "stateMachineInstance", "resolveStateMachineAdvance$kotlin_release", "(Lapp/rive/runtime/kotlin/core/StateMachineInstance;F)Z", "resolveStateMachineAdvance", "settleStateMachineState", "play$kotlin_release", "(Lapp/rive/runtime/kotlin/core/StateMachineInstance;Z)V", "Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "animationInstance", "(Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;Lapp/rive/runtime/kotlin/core/Loop;Lapp/rive/runtime/kotlin/core/Direction;)V", "Lapp/rive/runtime/kotlin/renderers/PointerEvents;", "eventType", "", "pointerID", "x", "y", "pointerEvent", "(Lapp/rive/runtime/kotlin/renderers/PointerEvents;IFF)V", "listener", "registerListener", "(Lapp/rive/runtime/kotlin/controllers/RiveFileController$Listener;)V", "unregisterListener", "Lapp/rive/runtime/kotlin/controllers/RiveFileController$RiveEventListener;", "addEventListener", "(Lapp/rive/runtime/kotlin/controllers/RiveFileController$RiveEventListener;)V", "removeEventListener", "reset$kotlin_release", "reset", "release", "()I", "ab", "setArtboard", "(Lapp/rive/runtime/kotlin/core/Artboard;)V", "", "queueInput", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "processAllInputs", "animations", "(Ljava/lang/String;)Ljava/util/List;", "stateMachines", "", "(Ljava/util/Collection;)Ljava/util/List;", "getOrCreateStateMachines", "playAnimation", "animation", "(Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;)V", "stateMachine", "(Lapp/rive/runtime/kotlin/core/StateMachineInstance;)V", "stop", "Lapp/rive/runtime/kotlin/core/PlayableInstance;", "playableInstance", "notifyPlay", "(Lapp/rive/runtime/kotlin/core/PlayableInstance;)V", "notifyPause", "notifyStop", "notifyLoop", "notifyAdvance", "Lapp/rive/runtime/kotlin/core/LayerState;", "notifyStateChanged", "(Lapp/rive/runtime/kotlin/core/StateMachineInstance;Lapp/rive/runtime/kotlin/core/LayerState;)V", "Lapp/rive/runtime/kotlin/core/RiveEvent;", "event", "notifyEvent", "(Lapp/rive/runtime/kotlin/core/RiveEvent;)V", "Lapp/rive/runtime/kotlin/core/Loop;", "getLoop", "()Lapp/rive/runtime/kotlin/core/Loop;", "setLoop", "(Lapp/rive/runtime/kotlin/core/Loop;)V", "getLoop$annotations", "Z", "getAutoplay", "()Z", "setAutoplay", "(Z)V", "Lkotlin/jvm/functions/Function0;", "getOnStart", "()Lkotlin/jvm/functions/Function0;", "setOnStart", "(Lkotlin/jvm/functions/Function0;)V", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "getChangedInputs$kotlin_release", "()Ljava/util/concurrent/ConcurrentLinkedQueue;", "getChangedInputs$kotlin_release$annotations", "Ljava/util/concurrent/atomic/AtomicInteger;", "refs", "Ljava/util/concurrent/atomic/AtomicInteger;", "getRefs", "()Ljava/util/concurrent/atomic/AtomicInteger;", "setRefs", "(Ljava/util/concurrent/atomic/AtomicInteger;)V", "isActive", "setActive", "Ljava/util/concurrent/atomic/AtomicBoolean;", "requireArtboardResize", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getRequireArtboardResize$kotlin_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setRequireArtboardResize$kotlin_release", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "Lapp/rive/runtime/kotlin/core/Fit;", "fit", "Lapp/rive/runtime/kotlin/core/Fit;", "getFit", "()Lapp/rive/runtime/kotlin/core/Fit;", "setFit", "(Lapp/rive/runtime/kotlin/core/Fit;)V", "Lapp/rive/runtime/kotlin/core/Alignment;", "alignment", "Lapp/rive/runtime/kotlin/core/Alignment;", "getAlignment", "()Lapp/rive/runtime/kotlin/core/Alignment;", "setAlignment", "(Lapp/rive/runtime/kotlin/core/Alignment;)V", "layoutScaleFactor", "Ljava/lang/Float;", "getLayoutScaleFactor", "setLayoutScaleFactor", "(Ljava/lang/Float;)V", "layoutScaleFactorAutomatic", "F", "getLayoutScaleFactorAutomatic", "()F", "setLayoutScaleFactorAutomatic$kotlin_release", "Lapp/rive/runtime/kotlin/core/File;", "getFile", "()Lapp/rive/runtime/kotlin/core/File;", "setFile", "(Lapp/rive/runtime/kotlin/core/File;)V", "Lapp/rive/runtime/kotlin/core/Artboard;", "getActiveArtboard", "()Lapp/rive/runtime/kotlin/core/Artboard;", "setActiveArtboard", "", "kotlin.jvm.PlatformType", "animationList", "Ljava/util/List;", "stateMachineList", "", "", "playingAnimationSet", "Ljava/util/Set;", "playingStateMachineSet", "Ljava/util/concurrent/locks/ReentrantLock;", "startStopLock", "Ljava/util/concurrent/locks/ReentrantLock;", "getStartStopLock$kotlin_release", "()Ljava/util/concurrent/locks/ReentrantLock;", "Landroid/graphics/RectF;", "targetBounds", "Landroid/graphics/RectF;", "getTargetBounds", "()Landroid/graphics/RectF;", "setTargetBounds", "(Landroid/graphics/RectF;)V", "userSetVolume", "_listeners", "_eventListeners", "getLayoutScaleFactorActive$kotlin_release", "layoutScaleFactorActive", "getAnimations", "()Ljava/util/List;", "getAnimations$annotations", "getStateMachines", "getStateMachines$annotations", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getPlayingAnimations", "()Ljava/util/HashSet;", "getPlayingAnimations$annotations", "playingAnimations", "getPlayingStateMachines", "getPlayingStateMachines$annotations", "playingStateMachines", "getPausedAnimations", "()Ljava/util/Set;", "getPausedAnimations$annotations", "pausedAnimations", "getPausedStateMachines", "pausedStateMachines", "isAdvancing", "getArtboardBounds", "artboardBounds", "getListeners", "getListeners$annotations", "listeners", "getEventListeners", "getEventListeners$annotations", "eventListeners", "Companion", "Listener", "RiveEventListener", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class RiveFileController implements Observable<Listener>, RefCount {
    public static final String TAG = "RiveL/RiveFileController";
    private Set<RiveEventListener> _eventListeners;
    private Set<Listener> _listeners;
    private Artboard activeArtboard;
    private Alignment alignment;
    private List<LinearAnimationInstance> animationList;
    private boolean autoplay;
    private final ConcurrentLinkedQueue<ChangedInput> changedInputs;
    private File file;
    private Fit fit;
    private boolean isActive;
    private Float layoutScaleFactor;
    private float layoutScaleFactorAutomatic;
    private Loop loop;
    private Function0 onStart;
    private Set<LinearAnimationInstance> playingAnimationSet;
    private Set<StateMachineInstance> playingStateMachineSet;
    private AtomicInteger refs;
    private AtomicBoolean requireArtboardResize;
    private final ReentrantLock startStopLock;
    private List<StateMachineInstance> stateMachineList;
    private RectF targetBounds;
    private Float userSetVolume;
    public static final int $stable = 8;

    @adt
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0006J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lapp/rive/runtime/kotlin/controllers/RiveFileController$Listener;", "", "Lapp/rive/runtime/kotlin/core/PlayableInstance;", "animation", "Lp/rih1;", "notifyPlay", "(Lapp/rive/runtime/kotlin/core/PlayableInstance;)V", "notifyPause", "notifyStop", "notifyLoop", "", "stateMachineName", "stateName", "notifyStateChanged", "(Ljava/lang/String;Ljava/lang/String;)V", "", "elapsed", "notifyAdvance", "(F)V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Listener {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void notifyAdvance(Listener listener, float f) {
            }
        }

        void notifyAdvance(float elapsed);

        @adt
        void notifyLoop(PlayableInstance animation);

        void notifyPause(PlayableInstance animation);

        void notifyPlay(PlayableInstance animation);

        void notifyStateChanged(String stateMachineName, String stateName);

        void notifyStop(PlayableInstance animation);
    }

    @adt
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/controllers/RiveFileController$RiveEventListener;", "", "Lapp/rive/runtime/kotlin/core/RiveEvent;", "event", "Lp/rih1;", "notifyEvent", "(Lapp/rive/runtime/kotlin/core/RiveEvent;)V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RiveEventListener {
        void notifyEvent(RiveEvent event);
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AdvanceResult.values().length];
            try {
                iArr[AdvanceResult.ONESHOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvanceResult.LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvanceResult.PINGPONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvanceResult.ADVANCED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvanceResult.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PointerEvents.values().length];
            try {
                iArr2[PointerEvents.POINTER_DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PointerEvents.POINTER_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PointerEvents.POINTER_MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PointerEvents.POINTER_EXIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.controllers.RiveFileController$release$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01021 extends hab0 implements Function0 {
        final /* synthetic */ int $old;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01021(int i) {
            super(0);
            this.$old = i;
        }

        public final String invoke() {
            int i = this.$old;
            return cy30.i(i, "Releasing. Old: ", i - 1, "; New: ");
        }
    }

    public RiveFileController(Loop loop, boolean z, File file, Artboard artboard, Function0 function0, ConcurrentLinkedQueue<ChangedInput> concurrentLinkedQueue) {
        this.loop = loop;
        this.autoplay = z;
        this.onStart = function0;
        this.changedInputs = concurrentLinkedQueue;
        RiveLog.INSTANCE.getLogger().d(TAG, AnonymousClass1.INSTANCE);
        this.refs = new AtomicInteger(1);
        this.requireArtboardResize = new AtomicBoolean(false);
        this.fit = Fit.CONTAIN;
        this.alignment = Alignment.CENTER;
        this.layoutScaleFactorAutomatic = 1.0f;
        this.file = file;
        this.activeArtboard = artboard;
        this.animationList = Collections.synchronizedList(new ArrayList());
        this.stateMachineList = Collections.synchronizedList(new ArrayList());
        this.playingAnimationSet = Collections.synchronizedSet(new HashSet());
        this.playingStateMachineSet = Collections.synchronizedSet(new HashSet());
        this.startStopLock = new ReentrantLock();
        this.targetBounds = new RectF();
        this._listeners = Collections.synchronizedSet(new HashSet());
        this._eventListeners = Collections.synchronizedSet(new HashSet());
    }

    private List<LinearAnimationInstance> animations(Collection<String> animationNames) {
        List<LinearAnimationInstance> animations = getAnimations();
        ArrayList arrayList = new ArrayList();
        for (Object obj : animations) {
            if (animationNames.contains(((LinearAnimationInstance) obj).getName())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void fireState$default(RiveFileController riveFileController, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: fireState");
            return;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        riveFileController.fireState(str, str2, str3);
    }

    @adt
    public static /* synthetic */ void getAnimations$annotations() {
    }

    @adt
    public static /* synthetic */ void getChangedInputs$kotlin_release$annotations() {
    }

    @adt
    public static /* synthetic */ void getEventListeners$annotations() {
    }

    @adt
    public static /* synthetic */ void getListeners$annotations() {
    }

    @adt
    public static /* synthetic */ void getLoop$annotations() {
    }

    private List<StateMachineInstance> getOrCreateStateMachines(String animationName) throws StateMachineException {
        Artboard activeArtboard;
        List<StateMachineInstance> listStateMachines = stateMachines(animationName);
        if (!listStateMachines.isEmpty() || (activeArtboard = getActiveArtboard()) == null) {
            return listStateMachines;
        }
        StateMachineInstance stateMachineInstanceStateMachine = activeArtboard.stateMachine(animationName);
        this.stateMachineList.add(stateMachineInstanceStateMachine);
        return Collections.singletonList(stateMachineInstanceStateMachine);
    }

    @adt
    public static /* synthetic */ void getPausedAnimations$annotations() {
    }

    @adt
    public static /* synthetic */ void getPlayingAnimations$annotations() {
    }

    @adt
    public static /* synthetic */ void getPlayingStateMachines$annotations() {
    }

    @adt
    public static /* synthetic */ void getStateMachines$annotations() {
    }

    private void notifyAdvance(float elapsed) {
        Iterator it = o7h.l1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyAdvance(elapsed);
        }
    }

    private void notifyEvent(RiveEvent event) {
        Iterator it = o7h.l1(getEventListeners()).iterator();
        while (it.hasNext()) {
            ((RiveEventListener) it.next()).notifyEvent(event);
        }
    }

    private void notifyLoop(PlayableInstance playableInstance) {
        Iterator it = o7h.l1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyLoop(playableInstance);
        }
    }

    private void notifyPause(PlayableInstance playableInstance) {
        Iterator it = o7h.l1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyPause(playableInstance);
        }
    }

    private void notifyPlay(PlayableInstance playableInstance) {
        Iterator it = o7h.l1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyPlay(playableInstance);
        }
    }

    private void notifyStateChanged(StateMachineInstance stateMachine, LayerState state) {
        Iterator it = o7h.l1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyStateChanged(stateMachine.getName(), state.toString());
        }
    }

    private void notifyStop(PlayableInstance playableInstance) {
        Iterator it = o7h.l1(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyStop(playableInstance);
        }
    }

    public static /* synthetic */ void pause$default(RiveFileController riveFileController, List list, boolean z, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: pause");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        riveFileController.pause((List<String>) list, z);
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, List list, Loop loop, Direction direction, boolean z, boolean z2, int i, Object obj) {
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
        riveFileController.play((List<String>) list, loop2, direction2, z3, z2);
    }

    public static /* synthetic */ void play$kotlin_release$default(RiveFileController riveFileController, StateMachineInstance stateMachineInstance, boolean z, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: play");
            return;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        riveFileController.play$kotlin_release(stateMachineInstance, z);
    }

    private void playAnimation(String animationName, Loop loop, Direction direction, boolean isStateMachine, boolean settleInitialState) {
        Artboard activeArtboard;
        if (isStateMachine) {
            Iterator<T> it = getOrCreateStateMachines(animationName).iterator();
            while (it.hasNext()) {
                play$kotlin_release((StateMachineInstance) it.next(), settleInitialState);
            }
            return;
        }
        List<LinearAnimationInstance> listAnimations = animations(animationName);
        Iterator<T> it2 = listAnimations.iterator();
        while (it2.hasNext()) {
            play$kotlin_release((LinearAnimationInstance) it2.next(), loop, direction);
        }
        if (!listAnimations.isEmpty() || (activeArtboard = getActiveArtboard()) == null) {
            return;
        }
        play$kotlin_release(activeArtboard.animation(animationName), loop, direction);
    }

    public static /* synthetic */ void playAnimation$default(RiveFileController riveFileController, String str, Loop loop, Direction direction, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: playAnimation");
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
        riveFileController.playAnimation(str, loop2, direction2, z3, z2);
    }

    private void processAllInputs() {
        ChangedInput changedInputPoll;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (!getChangedInputs$kotlin_release().isEmpty() && (changedInputPoll = getChangedInputs$kotlin_release().poll()) != null) {
            if (changedInputPoll.getNestedArtboardPath() == null) {
                for (StateMachineInstance stateMachineInstance : getOrCreateStateMachines(changedInputPoll.getStateMachineName())) {
                    linkedHashSet.add(stateMachineInstance);
                    SMIInput sMIInputInput = stateMachineInstance.input(changedInputPoll.getName());
                    if (sMIInputInput instanceof SMITrigger) {
                        ((SMITrigger) sMIInputInput).fire$kotlin_release();
                    } else if (sMIInputInput instanceof SMIBoolean) {
                        ((SMIBoolean) sMIInputInput).setValue$kotlin_release(((Boolean) changedInputPoll.getValue()).booleanValue());
                    } else if (sMIInputInput instanceof SMINumber) {
                        ((SMINumber) sMIInputInput).setValue$kotlin_release(((Float) changedInputPoll.getValue()).floatValue());
                    }
                }
            } else {
                Artboard activeArtboard = getActiveArtboard();
                SMIInput sMIInputInput2 = activeArtboard != null ? activeArtboard.input(changedInputPoll.getName(), changedInputPoll.getNestedArtboardPath()) : null;
                if (sMIInputInput2 instanceof SMITrigger) {
                    ((SMITrigger) sMIInputInput2).fire$kotlin_release();
                } else if (sMIInputInput2 instanceof SMIBoolean) {
                    ((SMIBoolean) sMIInputInput2).setValue$kotlin_release(((Boolean) changedInputPoll.getValue()).booleanValue());
                } else if (sMIInputInput2 instanceof SMINumber) {
                    ((SMINumber) sMIInputInput2).setValue$kotlin_release(((Float) changedInputPoll.getValue()).floatValue());
                }
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            play$kotlin_release((StateMachineInstance) it.next(), false);
        }
    }

    private void queueInput(String stateMachineName, String inputName, Object value, String path) {
        queueInputs$kotlin_release(new ChangedInput(stateMachineName, inputName, value, path));
    }

    public static /* synthetic */ void queueInput$default(RiveFileController riveFileController, String str, String str2, Object obj, String str3, int i, Object obj2) {
        if (obj2 != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: queueInput");
            return;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        riveFileController.queueInput(str, str2, obj, str3);
    }

    public static /* synthetic */ void selectArtboard$default(RiveFileController riveFileController, String str, int i, Object obj) throws ArtboardException {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: selectArtboard");
            return;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        riveFileController.selectArtboard(str);
    }

    private void setArtboard(Artboard ab) {
        if (u890.j(ab, getActiveArtboard())) {
            return;
        }
        stopAnimations();
        setActiveArtboard(ab);
        autoplay();
    }

    public static /* synthetic */ void setBooleanState$default(RiveFileController riveFileController, String str, String str2, boolean z, String str3, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: setBooleanState");
            return;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        riveFileController.setBooleanState(str, str2, z, str3);
    }

    public static /* synthetic */ void setNumberState$default(RiveFileController riveFileController, String str, String str2, float f, String str3, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: setNumberState");
            return;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        riveFileController.setNumberState(str, str2, f, str3);
    }

    public static /* synthetic */ void setRiveFile$default(RiveFileController riveFileController, File file, String str, int i, Object obj) throws ArtboardException {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: setRiveFile");
            return;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        riveFileController.setRiveFile(file, str);
    }

    private List<StateMachineInstance> stateMachines(Collection<String> animationNames) {
        List<StateMachineInstance> stateMachines = getStateMachines();
        ArrayList arrayList = new ArrayList();
        for (Object obj : stateMachines) {
            if (animationNames.contains(((StateMachineInstance) obj).getName())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private void stop(LinearAnimationInstance animation) {
        this.playingAnimationSet.remove(animation);
        if (this.animationList.remove(animation)) {
            notifyStop(animation);
        }
    }

    public static /* synthetic */ void stopAnimations$default(RiveFileController riveFileController, List list, boolean z, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: stopAnimations");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        riveFileController.stopAnimations((List<String>) list, z);
    }

    @Override // app.p000rive.runtime.kotlin.core.RefCount
    public int acquire() {
        return RefCount.DefaultImpls.acquire(this);
    }

    @adt
    public void addEventListener(RiveEventListener listener) {
        synchronized (getStartStopLock()) {
            this._eventListeners.add(listener);
        }
    }

    public void advance(float elapsed) {
        File file = getFile();
        if (file == null) {
            return;
        }
        synchronized (file.getFileLock()) {
            try {
                if (getFile() != file) {
                    return;
                }
                Artboard activeArtboard = getActiveArtboard();
                if (activeArtboard != null) {
                    Trace.beginSection("Rive/Frame/Advance/ProcessInputs");
                    try {
                        processAllInputs();
                        Trace.endSection();
                        Trace.beginSection("Rive/Frame/Advance/Animations");
                        try {
                            boolean zIsEmpty = false;
                            for (LinearAnimationInstance linearAnimationInstance : getAnimations()) {
                                if (getPlayingAnimations().contains(linearAnimationInstance)) {
                                    AdvanceResult advanceResultAdvanceAndGetResult = linearAnimationInstance.advanceAndGetResult(elapsed);
                                    linearAnimationInstance.apply();
                                    int i = WhenMappings.$EnumSwitchMapping$0[advanceResultAdvanceAndGetResult.ordinal()];
                                    if (i == 1) {
                                        stop(linearAnimationInstance);
                                    } else if (i == 2 || i == 3) {
                                        notifyLoop(linearAnimationInstance);
                                    } else if (i == 4) {
                                        zIsEmpty = getPlayingStateMachines().isEmpty();
                                    }
                                }
                            }
                            if (zIsEmpty) {
                                activeArtboard.advance(elapsed);
                            }
                            Trace.endSection();
                            ArrayList arrayList = new ArrayList();
                            Trace.beginSection("Rive/Frame/Advance/StateMachines");
                            try {
                                for (StateMachineInstance stateMachineInstance : getStateMachines()) {
                                    if (getPlayingStateMachines().contains(stateMachineInstance) && !resolveStateMachineAdvance$kotlin_release(stateMachineInstance, elapsed)) {
                                        arrayList.add(stateMachineInstance);
                                    }
                                }
                                if (elapsed > 0.0d) {
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        pause((StateMachineInstance) it.next());
                                    }
                                }
                                Trace.endSection();
                                Trace.beginSection("Rive/Frame/Advance/PollViewModelChanges");
                                try {
                                    HashSet<StateMachineInstance> playingStateMachines = getPlayingStateMachines();
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<T> it2 = playingStateMachines.iterator();
                                    while (it2.hasNext()) {
                                        ViewModelInstance viewModelInstance = ((StateMachineInstance) it2.next()).getViewModelInstance();
                                        if (viewModelInstance != null) {
                                            arrayList2.add(viewModelInstance);
                                        }
                                    }
                                    Iterator it3 = arrayList2.iterator();
                                    while (it3.hasNext()) {
                                        ((ViewModelInstance) it3.next()).pollChanges$kotlin_release();
                                    }
                                    Trace.endSection();
                                    notifyAdvance(elapsed);
                                } catch (Throwable th) {
                                    Trace.endSection();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                Trace.endSection();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public void autoplay() {
        if (getAutoplay()) {
            RiveLog.INSTANCE.getLogger().d(TAG, C01011.INSTANCE);
            play$default(this, null, null, true, 3, null);
            return;
        }
        RiveLog.INSTANCE.getLogger().d(TAG, AnonymousClass2.INSTANCE);
        Artboard activeArtboard = getActiveArtboard();
        if (activeArtboard != null) {
            activeArtboard.advance(0.0f);
        }
        synchronized (getStartStopLock()) {
            Function0 onStart = getOnStart();
            if (onStart != null) {
                onStart.invoke();
            }
        }
    }

    @adt
    public void fireState(String stateMachineName, String inputName, String path) {
        queueInput$default(this, stateMachineName, inputName, null, path, 4, null);
    }

    @adt
    public void fireStateAtPath(String inputName, String path) {
        queueInput$default(this, "", inputName, null, path, 4, null);
    }

    public Artboard getActiveArtboard() {
        return this.activeArtboard;
    }

    public Alignment getAlignment() {
        return this.alignment;
    }

    public List<LinearAnimationInstance> getAnimations() {
        List<LinearAnimationInstance> listL1;
        synchronized (this.animationList) {
            listL1 = o7h.l1(this.animationList);
        }
        return listL1;
    }

    public RectF getArtboardBounds() {
        RectF bounds;
        Artboard activeArtboard = getActiveArtboard();
        return (activeArtboard == null || (bounds = activeArtboard.getBounds()) == null) ? new RectF() : bounds;
    }

    public boolean getAutoplay() {
        return this.autoplay;
    }

    public ConcurrentLinkedQueue<ChangedInput> getChangedInputs$kotlin_release() {
        return this.changedInputs;
    }

    public HashSet<RiveEventListener> getEventListeners() {
        HashSet<RiveEventListener> hashSetJ1;
        synchronized (this._eventListeners) {
            hashSetJ1 = o7h.j1(this._eventListeners);
        }
        return hashSetJ1;
    }

    public File getFile() {
        return this.file;
    }

    public Fit getFit() {
        return this.fit;
    }

    public Float getLayoutScaleFactor() {
        return this.layoutScaleFactor;
    }

    public float getLayoutScaleFactorActive$kotlin_release() {
        Float layoutScaleFactor = getLayoutScaleFactor();
        return layoutScaleFactor != null ? layoutScaleFactor.floatValue() : getLayoutScaleFactorAutomatic();
    }

    public float getLayoutScaleFactorAutomatic() {
        return this.layoutScaleFactorAutomatic;
    }

    public HashSet<Listener> getListeners() {
        HashSet<Listener> hashSetJ1;
        synchronized (this._listeners) {
            hashSetJ1 = o7h.j1(this._listeners);
        }
        return hashSetJ1;
    }

    public Loop getLoop() {
        return this.loop;
    }

    public Function0 getOnStart() {
        return this.onStart;
    }

    public Set<LinearAnimationInstance> getPausedAnimations() {
        return o7h.b1(getAnimations(), getPlayingAnimations());
    }

    public Set<StateMachineInstance> getPausedStateMachines() {
        return o7h.b1(getStateMachines(), getPlayingStateMachines());
    }

    public HashSet<LinearAnimationInstance> getPlayingAnimations() {
        HashSet<LinearAnimationInstance> hashSetJ1;
        synchronized (this.playingAnimationSet) {
            hashSetJ1 = o7h.j1(this.playingAnimationSet);
        }
        return hashSetJ1;
    }

    public HashSet<StateMachineInstance> getPlayingStateMachines() {
        HashSet<StateMachineInstance> hashSetJ1;
        synchronized (this.playingStateMachineSet) {
            hashSetJ1 = o7h.j1(this.playingStateMachineSet);
        }
        return hashSetJ1;
    }

    @Override // app.p000rive.runtime.kotlin.core.RefCount
    public int getRefCount() {
        return RefCount.DefaultImpls.getRefCount(this);
    }

    @Override // app.p000rive.runtime.kotlin.core.RefCount
    public AtomicInteger getRefs() {
        return this.refs;
    }

    /* JADX INFO: renamed from: getRequireArtboardResize$kotlin_release, reason: from getter */
    public AtomicBoolean getRequireArtboardResize() {
        return this.requireArtboardResize;
    }

    /* JADX INFO: renamed from: getStartStopLock$kotlin_release, reason: from getter */
    public ReentrantLock getStartStopLock() {
        return this.startStopLock;
    }

    public List<StateMachineInstance> getStateMachines() {
        List<StateMachineInstance> listL1;
        synchronized (this.stateMachineList) {
            listL1 = o7h.l1(this.stateMachineList);
        }
        return listL1;
    }

    public RectF getTargetBounds() {
        return this.targetBounds;
    }

    @adt
    public String getTextRunValue(String textRunName) {
        Artboard activeArtboard = getActiveArtboard();
        if (activeArtboard != null) {
            return activeArtboard.getTextRunValue(textRunName);
        }
        return null;
    }

    public Float getVolume() {
        Artboard activeArtboard = getActiveArtboard();
        if (activeArtboard != null) {
            return Float.valueOf(activeArtboard.getVolume());
        }
        return null;
    }

    /* JADX INFO: renamed from: isActive, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }

    public boolean isAdvancing() {
        return (this.playingAnimationSet.isEmpty() && this.playingStateMachineSet.isEmpty() && getChangedInputs$kotlin_release().isEmpty()) ? false : true;
    }

    public void pause(List<String> animationNames, boolean areStateMachines) {
        if (areStateMachines) {
            Iterator<T> it = stateMachines(animationNames).iterator();
            while (it.hasNext()) {
                pause((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationNames).iterator();
            while (it2.hasNext()) {
                pause((LinearAnimationInstance) it2.next());
            }
        }
    }

    public void play(Loop loop, Direction direction, boolean settleInitialState) {
        Artboard activeArtboard = getActiveArtboard();
        if (activeArtboard != null) {
            if (!getPausedAnimations().isEmpty() || !getPausedStateMachines().isEmpty()) {
                Iterator<T> it = getAnimations().iterator();
                while (it.hasNext()) {
                    play$kotlin_release((LinearAnimationInstance) it.next(), loop, direction);
                }
                Iterator<T> it2 = getStateMachines().iterator();
                while (it2.hasNext()) {
                    play$kotlin_release((StateMachineInstance) it2.next(), settleInitialState);
                }
                return;
            }
            List<String> animationNames = activeArtboard.getAnimationNames();
            if (!animationNames.isEmpty()) {
                playAnimation$default(this, (String) o7h.q0(animationNames), loop, direction, false, false, 24, null);
            }
            List<String> stateMachineNames = activeArtboard.getStateMachineNames();
            if (stateMachineNames.isEmpty()) {
                return;
            }
            playAnimation((String) o7h.q0(stateMachineNames), loop, direction, true, settleInitialState);
        }
    }

    public void play$kotlin_release(LinearAnimationInstance animationInstance, Loop loop, Direction direction) {
        Loop loop2 = Loop.AUTO;
        if (loop == loop2) {
            loop = getLoop();
        }
        if (loop != loop2) {
            animationInstance.setLoop(loop);
        }
        if (!this.animationList.contains(animationInstance)) {
            if (direction == Direction.BACKWARDS) {
                animationInstance.time(animationInstance.getEndTime());
            }
            this.animationList.add(animationInstance);
        }
        if (direction != Direction.AUTO) {
            animationInstance.setDirection(direction);
        }
        synchronized (getStartStopLock()) {
            this.playingAnimationSet.add(animationInstance);
            Function0 onStart = getOnStart();
            if (onStart != null) {
                onStart.invoke();
            }
        }
        notifyPlay(animationInstance);
    }

    public void pointerEvent(PointerEvents eventType, int pointerID, float x, float y) {
        RectF rectF;
        boolean zPointerDown;
        File file = getFile();
        if (file == null) {
            return;
        }
        synchronized (file.getFileLock()) {
            if (getFile() == file) {
                Trace.beginSection("Rive/PointerInput");
                try {
                    Helpers helpers = Helpers.INSTANCE;
                    RectF targetBounds = getTargetBounds();
                    PointF pointF = new PointF(x, y);
                    Fit fit = getFit();
                    Alignment alignment = getAlignment();
                    Artboard activeArtboard = getActiveArtboard();
                    if (activeArtboard == null || (rectF = activeArtboard.getBounds()) == null) {
                        rectF = new RectF();
                    }
                    PointF pointFConvertToArtboardSpace = helpers.convertToArtboardSpace(targetBounds, pointF, fit, alignment, rectF, getLayoutScaleFactorActive$kotlin_release());
                    for (StateMachineInstance stateMachineInstance : getStateMachines()) {
                        int i = WhenMappings.$EnumSwitchMapping$1[eventType.ordinal()];
                        if (i == 1) {
                            zPointerDown = stateMachineInstance.pointerDown(pointerID, pointFConvertToArtboardSpace.x, pointFConvertToArtboardSpace.y);
                        } else if (i != 2) {
                            if (i == 3) {
                                stateMachineInstance.pointerMove(pointerID, pointFConvertToArtboardSpace.x, pointFConvertToArtboardSpace.y);
                            } else {
                                if (i != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                stateMachineInstance.pointerExit(pointerID, pointFConvertToArtboardSpace.x, pointFConvertToArtboardSpace.y);
                            }
                            zPointerDown = false;
                        } else {
                            zPointerDown = stateMachineInstance.pointerUp(pointerID, pointFConvertToArtboardSpace.x, pointFConvertToArtboardSpace.y);
                        }
                        play$kotlin_release(stateMachineInstance, false);
                        if (zPointerDown) {
                            resolveStateMachineAdvance$kotlin_release(stateMachineInstance, 0.0f);
                            ViewModelInstance viewModelInstance = stateMachineInstance.getViewModelInstance();
                            if (viewModelInstance != null) {
                                viewModelInstance.pollChanges$kotlin_release();
                            }
                        }
                    }
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
        }
    }

    @adt
    public void queueInputs$kotlin_release(ChangedInput... inputs) {
        synchronized (getStartStopLock()) {
            getChangedInputs$kotlin_release().addAll(f46.H(inputs));
            Function0 onStart = getOnStart();
            if (onStart != null) {
                onStart.invoke();
            }
        }
    }

    @Override // app.p000rive.runtime.kotlin.Observable
    @adt
    public void registerListener(Listener listener) {
        synchronized (getStartStopLock()) {
            this._listeners.add(listener);
        }
    }

    @Override // app.p000rive.runtime.kotlin.core.RefCount
    public int release() {
        C01021 c01021 = new C01021(getRefs().get());
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d(TAG, c01021);
        int iRelease = RefCount.DefaultImpls.release(this);
        if (iRelease < 0) {
            hhg1.n("Failed requirement.");
            return 0;
        }
        if (iRelease != 0) {
            return iRelease;
        }
        if (getIsActive()) {
            hhg1.n("Failed requirement.");
            return 0;
        }
        riveLog.getLogger().d(TAG, C01032.INSTANCE);
        setFile(null);
        return iRelease;
    }

    @adt
    public void removeEventListener(RiveEventListener listener) {
        synchronized (getStartStopLock()) {
            this._eventListeners.remove(listener);
        }
    }

    public void reset$kotlin_release() {
        RiveLog.INSTANCE.getLogger().d(TAG, RiveFileController$reset$1.INSTANCE);
        this.playingAnimationSet.clear();
        this.animationList.clear();
        this.playingStateMachineSet.clear();
        this.stateMachineList.clear();
        getChangedInputs$kotlin_release().clear();
        setActiveArtboard(null);
    }

    public boolean resolveStateMachineAdvance$kotlin_release(StateMachineInstance stateMachineInstance, float elapsed) {
        File file = getFile();
        boolean zAdvance = false;
        if (file == null) {
            return false;
        }
        synchronized (file.getFileLock()) {
            try {
                if (getFile() == file) {
                    if (!getEventListeners().isEmpty()) {
                        Iterator<T> it = stateMachineInstance.getEventsReported().iterator();
                        while (it.hasNext()) {
                            notifyEvent((RiveEvent) it.next());
                        }
                    }
                    zAdvance = stateMachineInstance.advance(elapsed);
                    if (!getListeners().isEmpty()) {
                        Iterator<T> it2 = stateMachineInstance.getStatesChanged().iterator();
                        while (it2.hasNext()) {
                            notifyStateChanged(stateMachineInstance, (LayerState) it2.next());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zAdvance;
    }

    public void restoreControllerState(ControllerState state) {
        Object fileLock;
        File file = getFile();
        if (file == null || (fileLock = file.getFileLock()) == null) {
            fileLock = this;
        }
        synchronized (fileLock) {
            try {
                reset$kotlin_release();
                setFile(state.getFile());
                setActiveArtboard(state.getActiveArtboard());
                Iterator<T> it = state.getAnimations().iterator();
                while (it.hasNext()) {
                    this.animationList.add((LinearAnimationInstance) it.next());
                }
                Iterator<T> it2 = state.getStateMachines().iterator();
                while (it2.hasNext()) {
                    this.stateMachineList.add((StateMachineInstance) it2.next());
                }
                for (LinearAnimationInstance linearAnimationInstance : state.getPlayingAnimations()) {
                    play$kotlin_release(linearAnimationInstance, linearAnimationInstance.getLoop(), linearAnimationInstance.getDirection());
                }
                Iterator<T> it3 = state.getPlayingStateMachines().iterator();
                while (it3.hasNext()) {
                    play$kotlin_release$default(this, (StateMachineInstance) it3.next(), false, 2, null);
                }
                setActive(state.getIsActive());
                state.dispose();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ControllerState saveControllerState() {
        Artboard activeArtboard;
        File file = getFile();
        if (file == null || (activeArtboard = getActiveArtboard()) == null) {
            return null;
        }
        synchronized (file.getFileLock()) {
            if (!file.getHasCppObject()) {
                return null;
            }
            file.acquire();
            activeArtboard.acquire();
            return new ControllerState(file, activeArtboard, o7h.l1(this.animationList), o7h.j1(getPlayingAnimations()), o7h.l1(this.stateMachineList), o7h.j1(getPlayingStateMachines()), getIsActive());
        }
    }

    public void selectArtboard(String name) throws ArtboardException {
        rih1 rih1Var;
        Artboard firstArtboard;
        File file = getFile();
        if (file != null) {
            if (name != null) {
                RiveLog.INSTANCE.getLogger().d(TAG, new RiveFileController$selectArtboard$1$artboard$1(name));
                firstArtboard = file.artboard(name);
            } else {
                RiveLog.INSTANCE.getLogger().d(TAG, RiveFileController$selectArtboard$1$artboard$2.INSTANCE);
                firstArtboard = file.getFirstArtboard();
            }
            setArtboard(firstArtboard);
            rih1Var = rih1.a;
        } else {
            rih1Var = null;
        }
        if (rih1Var == null) {
            RiveLog.INSTANCE.getLogger().w(TAG, RiveFileController$selectArtboard$2$1.INSTANCE);
        }
    }

    public void setActive(boolean z) {
        this.isActive = z;
    }

    public void setActiveArtboard(Artboard artboard) {
        Object fileLock;
        if (u890.j(artboard, this.activeArtboard)) {
            return;
        }
        File file = getFile();
        if (file == null || (fileLock = file.getFileLock()) == null) {
            fileLock = this;
        }
        synchronized (fileLock) {
            try {
                RiveFileController$activeArtboard$1$1 riveFileController$activeArtboard$1$1 = new RiveFileController$activeArtboard$1$1(this);
                RiveLog riveLog = RiveLog.INSTANCE;
                riveLog.getLogger().d(TAG, riveFileController$activeArtboard$1$1);
                Artboard artboard2 = this.activeArtboard;
                if (artboard2 != null) {
                    artboard2.release();
                }
                this.activeArtboard = artboard;
                riveLog.getLogger().d(TAG, new RiveFileController$activeArtboard$1$2(this));
                Artboard artboard3 = this.activeArtboard;
                if (artboard3 != null) {
                    artboard3.acquire();
                }
                Float f = this.userSetVolume;
                if (f != null) {
                    float fFloatValue = f.floatValue();
                    Artboard activeArtboard = getActiveArtboard();
                    if (activeArtboard != null) {
                        activeArtboard.setVolume$kotlin_release(fFloatValue);
                    }
                }
                if (artboard != null) {
                    getRequireArtboardResize().set(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
        synchronized (getStartStopLock()) {
            Function0 onStart = getOnStart();
            if (onStart != null) {
                onStart.invoke();
            }
        }
    }

    public void setAutoplay(boolean z) {
        this.autoplay = z;
    }

    @adt
    public void setBooleanState(String stateMachineName, String inputName, boolean value, String path) {
        queueInput(stateMachineName, inputName, Boolean.valueOf(value), path);
    }

    @adt
    public void setBooleanStateAtPath(String inputName, boolean value, String path) {
        queueInput("", inputName, Boolean.valueOf(value), path);
    }

    public void setFile(File file) {
        Object fileLock;
        if (u890.j(file, this.file)) {
            RiveLog.INSTANCE.getLogger().w(TAG, RiveFileController$file$1.INSTANCE);
            return;
        }
        File file2 = this.file;
        if (file2 == null || (fileLock = file2.getFileLock()) == null) {
            fileLock = this;
        }
        synchronized (fileLock) {
            try {
                File file3 = this.file;
                if (file3 != null) {
                    RiveLog.INSTANCE.getLogger().d(TAG, new RiveFileController$file$2$1$1(file3));
                    reset$kotlin_release();
                    file3.release();
                }
                this.file = file;
                RiveLog.INSTANCE.getLogger().d(TAG, new RiveFileController$file$2$2(file));
                File file4 = this.file;
                if (file4 != null) {
                    file4.acquire();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setFit(Fit fit) {
        this.fit = fit;
        getRequireArtboardResize().set(true);
        synchronized (getStartStopLock()) {
            Function0 onStart = getOnStart();
            if (onStart != null) {
                onStart.invoke();
            }
        }
    }

    public void setLayoutScaleFactor(Float f) {
        this.layoutScaleFactor = f;
        getRequireArtboardResize().set(true);
        synchronized (getStartStopLock()) {
            Function0 onStart = getOnStart();
            if (onStart != null) {
                onStart.invoke();
            }
        }
    }

    public void setLayoutScaleFactorAutomatic$kotlin_release(float f) {
        if (this.layoutScaleFactorAutomatic == f) {
            return;
        }
        this.layoutScaleFactorAutomatic = f;
        getRequireArtboardResize().set(true);
        synchronized (getStartStopLock()) {
            Function0 onStart = getOnStart();
            if (onStart != null) {
                onStart.invoke();
            }
        }
    }

    public void setLoop(Loop loop) {
        this.loop = loop;
    }

    @adt
    public void setNumberState(String stateMachineName, String inputName, float value, String path) {
        queueInput(stateMachineName, inputName, Float.valueOf(value), path);
    }

    @adt
    public void setNumberStateAtPath(String inputName, float value, String path) {
        queueInput("", inputName, Float.valueOf(value), path);
    }

    public void setOnStart(Function0 function0) {
        this.onStart = function0;
    }

    @Override // app.p000rive.runtime.kotlin.core.RefCount
    public void setRefs(AtomicInteger atomicInteger) {
        this.refs = atomicInteger;
    }

    public void setRequireArtboardResize$kotlin_release(AtomicBoolean atomicBoolean) {
        this.requireArtboardResize = atomicBoolean;
    }

    public void setRiveFile(File file, String artboardName) throws ArtboardException {
        if (file.equals(getFile())) {
            return;
        }
        setFile(file);
        selectArtboard(artboardName);
    }

    public void setTargetBounds(RectF rectF) {
        this.targetBounds = rectF;
    }

    @adt
    public void setTextRunValue(String textRunName, String textValue) throws TextValueRunException {
        Artboard activeArtboard = getActiveArtboard();
        if (activeArtboard != null) {
            activeArtboard.setTextRunValue(textRunName, textValue);
        }
        Iterator<T> it = getStateMachines().iterator();
        while (it.hasNext()) {
            play$kotlin_release((StateMachineInstance) it.next(), false);
        }
    }

    public void setVolume(float value) {
        this.userSetVolume = Float.valueOf(value);
        Artboard activeArtboard = getActiveArtboard();
        if (activeArtboard == null) {
            return;
        }
        activeArtboard.setVolume$kotlin_release(value);
    }

    public void setupScene$kotlin_release(RiveAnimationView.RendererAttributes rendererAttributes) throws StateMachineException {
        ViewModelInstance viewModelInstanceCreateDefaultInstance;
        RiveFileController$setupScene$1 riveFileController$setupScene$1 = RiveFileController$setupScene$1.INSTANCE;
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d(TAG, riveFileController$setupScene$1);
        File file = getFile();
        if (file == null) {
            riveLog.getLogger().w(TAG, RiveFileController$setupScene$2.INSTANCE);
            return;
        }
        reset$kotlin_release();
        setAutoplay(rendererAttributes.getAutoplay());
        setAlignment(rendererAttributes.getAlignment());
        setFit(rendererAttributes.getFit());
        setLoop(rendererAttributes.getLoop());
        String artboardName = rendererAttributes.getArtboardName();
        setActiveArtboard(artboardName != null ? file.artboard(artboardName) : file.getFirstArtboard());
        if (rendererAttributes.getAutoBind() && getActiveArtboard() != null) {
            riveLog.getLogger().d(TAG, RiveFileController$setupScene$3.INSTANCE);
            Artboard activeArtboard = getActiveArtboard();
            activeArtboard.getClass();
            try {
                viewModelInstanceCreateDefaultInstance = file.defaultViewModelForArtboard(activeArtboard).createDefaultInstance();
            } catch (ViewModelException e) {
                RiveLog.INSTANCE.getLogger().e(TAG, e, new RiveFileController$setupScene$defaultInstance$1(activeArtboard, e));
                viewModelInstanceCreateDefaultInstance = null;
            }
            if (viewModelInstanceCreateDefaultInstance != null) {
                activeArtboard.setViewModelInstance(viewModelInstanceCreateDefaultInstance);
                String stateMachineName = rendererAttributes.getStateMachineName();
                if (stateMachineName == null) {
                    stateMachineName = (String) o7h.s0(activeArtboard.getStateMachineNames());
                }
                if (stateMachineName != null) {
                    getOrCreateStateMachines(stateMachineName);
                }
                Iterator<T> it = getStateMachines().iterator();
                while (it.hasNext()) {
                    ((StateMachineInstance) it.next()).setViewModelInstance(viewModelInstanceCreateDefaultInstance);
                }
            }
        }
        if (!getAutoplay()) {
            RiveLog.INSTANCE.getLogger().d(TAG, RiveFileController$setupScene$9.INSTANCE);
            Artboard activeArtboard2 = getActiveArtboard();
            if (activeArtboard2 != null) {
                activeArtboard2.advance(0.0f);
            }
            synchronized (getStartStopLock()) {
                Function0 onStart = getOnStart();
                if (onStart != null) {
                    onStart.invoke();
                }
            }
            return;
        }
        String animationName = rendererAttributes.getAnimationName();
        String stateMachineName2 = rendererAttributes.getStateMachineName();
        if (animationName != null) {
            RiveLog.INSTANCE.getLogger().d(TAG, new RiveFileController$setupScene$6(animationName));
            play$default(this, animationName, (Loop) null, (Direction) null, false, false, 30, (Object) null);
        } else if (stateMachineName2 != null) {
            RiveLog.INSTANCE.getLogger().d(TAG, new RiveFileController$setupScene$7(stateMachineName2));
            play$default(this, stateMachineName2, (Loop) null, (Direction) null, true, true, 6, (Object) null);
        } else {
            RiveLog.INSTANCE.getLogger().d(TAG, RiveFileController$setupScene$8.INSTANCE);
            play$default(this, null, null, true, 3, null);
        }
    }

    public void stopAnimations() {
        if (!this.animationList.isEmpty()) {
            Iterator<T> it = getAnimations().iterator();
            while (it.hasNext()) {
                stop((LinearAnimationInstance) it.next());
            }
        }
        if (this.stateMachineList.isEmpty()) {
            return;
        }
        Iterator<T> it2 = getStateMachines().iterator();
        while (it2.hasNext()) {
            stop((StateMachineInstance) it2.next());
        }
    }

    @Override // app.p000rive.runtime.kotlin.Observable
    @adt
    public void unregisterListener(Listener listener) {
        synchronized (getStartStopLock()) {
            this._listeners.remove(listener);
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.controllers.RiveFileController$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        public final String invoke() {
            return "Initializing.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.controllers.RiveFileController$autoplay$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01011 extends hab0 implements Function0 {
        public static final C01011 INSTANCE = new C01011();

        public C01011() {
            super(0);
        }

        public final String invoke() {
            return "autoplay() with autoplay enabled. Playing all state machines and animations.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.controllers.RiveFileController$autoplay$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends hab0 implements Function0 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        public final String invoke() {
            return "autoplay() with autoplay disabled. Advancing the artboard by 0.";
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.controllers.RiveFileController$release$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01032 extends hab0 implements Function0 {
        public static final C01032 INSTANCE = new C01032();

        public C01032() {
            super(0);
        }

        public final String invoke() {
            return "Final count is 0. Setting file to null.";
        }
    }

    @adt
    public String getTextRunValue(String textRunName, String path) {
        Artboard activeArtboard = getActiveArtboard();
        if (activeArtboard != null) {
            return activeArtboard.getTextRunValue(textRunName, path);
        }
        return null;
    }

    public static /* synthetic */ void pause$default(RiveFileController riveFileController, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: pause");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        riveFileController.pause(str, z);
    }

    private void stop(StateMachineInstance stateMachine) {
        this.playingStateMachineSet.remove(stateMachine);
        if (this.stateMachineList.remove(stateMachine)) {
            notifyStop(stateMachine);
        }
    }

    public static /* synthetic */ void stopAnimations$default(RiveFileController riveFileController, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: stopAnimations");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        riveFileController.stopAnimations(str, z);
    }

    @adt
    public void setTextRunValue(String textRunName, String textValue, String path) throws TextValueRunException {
        Artboard activeArtboard = getActiveArtboard();
        if (activeArtboard != null) {
            activeArtboard.setTextRunValue(textRunName, textValue, path);
        }
        Iterator<T> it = getStateMachines().iterator();
        while (it.hasNext()) {
            play$kotlin_release((StateMachineInstance) it.next(), false);
        }
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, String str, Loop loop, Direction direction, boolean z, boolean z2, int i, Object obj) {
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
        riveFileController.play(str, loop2, direction2, z3, z2);
    }

    private List<LinearAnimationInstance> animations(String animationName) {
        return animations(Collections.singletonList(animationName));
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, Loop loop, Direction direction, boolean z, int i, Object obj) {
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
        riveFileController.play(loop, direction, z);
    }

    private List<StateMachineInstance> stateMachines(String animationName) {
        return stateMachines(Collections.singletonList(animationName));
    }

    public void pause() {
        Iterator<T> it = getPlayingAnimations().iterator();
        while (it.hasNext()) {
            pause((LinearAnimationInstance) it.next());
        }
        Iterator<T> it2 = getPlayingStateMachines().iterator();
        while (it2.hasNext()) {
            pause((StateMachineInstance) it2.next());
        }
    }

    public void pause(String animationName, boolean isStateMachine) {
        if (isStateMachine) {
            Iterator<T> it = stateMachines(animationName).iterator();
            while (it.hasNext()) {
                pause((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationName).iterator();
            while (it2.hasNext()) {
                pause((LinearAnimationInstance) it2.next());
            }
        }
    }

    private void pause(LinearAnimationInstance animation) {
        if (this.playingAnimationSet.remove(animation)) {
            notifyPause(animation);
        }
    }

    private void pause(StateMachineInstance stateMachine) {
        if (this.playingStateMachineSet.remove(stateMachine)) {
            notifyPause(stateMachine);
        }
    }

    public void play$kotlin_release(StateMachineInstance stateMachineInstance, boolean settleStateMachineState) {
        if (!this.stateMachineList.contains(stateMachineInstance)) {
            this.stateMachineList.add(stateMachineInstance);
        }
        if (settleStateMachineState) {
            resolveStateMachineAdvance$kotlin_release(stateMachineInstance, 0.0f);
        }
        synchronized (getStartStopLock()) {
            this.playingStateMachineSet.add(stateMachineInstance);
            Function0 onStart = getOnStart();
            if (onStart != null) {
                onStart.invoke();
            }
        }
        notifyPlay(stateMachineInstance);
    }

    public void stopAnimations(List<String> animationNames, boolean areStateMachines) {
        if (areStateMachines) {
            Iterator<T> it = stateMachines(animationNames).iterator();
            while (it.hasNext()) {
                stop((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationNames).iterator();
            while (it2.hasNext()) {
                stop((LinearAnimationInstance) it2.next());
            }
        }
    }

    public void stopAnimations(String animationName, boolean isStateMachine) {
        if (isStateMachine) {
            Iterator<T> it = stateMachines(animationName).iterator();
            while (it.hasNext()) {
                stop((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationName).iterator();
            while (it2.hasNext()) {
                stop((LinearAnimationInstance) it2.next());
            }
        }
    }

    public RiveFileController() {
        this(null, false, null, null, null, null, 63, null);
    }

    public /* synthetic */ RiveFileController(Loop loop, boolean z, File file, Artboard artboard, Function0 function0, ConcurrentLinkedQueue concurrentLinkedQueue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Loop.AUTO : loop, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : file, (i & 8) != 0 ? null : artboard, (i & 16) != 0 ? null : function0, (i & 32) != 0 ? new ConcurrentLinkedQueue() : concurrentLinkedQueue);
    }

    public /* synthetic */ RiveFileController(Loop loop, boolean z, File file, Artboard artboard, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Loop.AUTO : loop, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : file, (i & 8) != 0 ? null : artboard, (i & 16) != 0 ? null : function0);
    }

    public RiveFileController(Loop loop, boolean z, File file, Artboard artboard, Function0 function0) {
        this(loop, z, file, artboard, function0, new ConcurrentLinkedQueue());
    }

    public void play(String animationName, Loop loop, Direction direction, boolean isStateMachine, boolean settleInitialState) {
        playAnimation(animationName, loop, direction, isStateMachine, settleInitialState);
    }

    public void play(List<String> animationNames, Loop loop, Direction direction, boolean areStateMachines, boolean settleInitialState) {
        Iterator<T> it = animationNames.iterator();
        while (it.hasNext()) {
            playAnimation((String) it.next(), loop, direction, areStateMachines, settleInitialState);
        }
    }
}
