package app.p000rive.runtime.kotlin.core;

import android.graphics.RectF;
import app.p000rive.runtime.kotlin.core.errors.AnimationException;
import app.p000rive.runtime.kotlin.core.errors.StateMachineException;
import app.p000rive.runtime.kotlin.core.errors.StateMachineInputException;
import app.p000rive.runtime.kotlin.core.errors.TextValueRunException;
import app.p000rive.runtime.kotlin.core.errors.ViewModelException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.cy30;
import p.f4i1;
import p.gvg;
import p.hhg1;
import p.lr80;
import p.q7h;
import p.tr80;
import p.yoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010 \n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ8\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0095 ¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0096 ¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b\u001d\u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u0018H\u0017¢\u0006\u0004\b#\u0010$J\u0017\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b#\u0010%J\u001f\u0010(\u001a\u00020'2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001fH\u0017¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u001fH\u0017¢\u0006\u0004\b0\u00101J\u001f\u0010+\u001a\u00020*2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001fH\u0017¢\u0006\u0004\b+\u00102J!\u0010-\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001fH\u0017¢\u0006\u0004\b-\u00103J'\u00100\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001fH\u0017¢\u0006\u0004\b0\u00104J\u0017\u00108\u001a\u0002072\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u00020\u0010H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u0002H\u0017¢\u0006\u0004\b?\u0010\u0017J1\u0010?\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0012H\u0016¢\u0006\u0004\bA\u0010BJ\u0018\u0010C\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bC\u0010DJ \u0010E\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0018H\u0092 ¢\u0006\u0004\bE\u0010FJ \u0010G\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0092 ¢\u0006\u0004\bG\u0010HJ\u0018\u0010I\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bI\u0010JJ \u0010K\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0018H\u0092 ¢\u0006\u0004\bK\u0010LJ \u0010M\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0018H\u0092 ¢\u0006\u0004\bM\u0010FJ \u0010N\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0092 ¢\u0006\u0004\bN\u0010HJ\u0018\u0010O\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bO\u0010JJ \u0010P\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0018H\u0092 ¢\u0006\u0004\bP\u0010LJ(\u0010Q\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001fH\u0092 ¢\u0006\u0004\bQ\u0010RJ\u0018\u0010S\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bS\u0010TJ \u0010V\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010U\u001a\u00020\u0010H\u0092 ¢\u0006\u0004\bV\u0010WJ \u0010X\u001a\u00020;2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0010H\u0092 ¢\u0006\u0004\bX\u0010YJ \u0010Z\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0092 ¢\u0006\u0004\bZ\u0010HJ\"\u0010[\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0092 ¢\u0006\u0004\b[\u0010\\J(\u0010^\u001a\u00020;2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010]\u001a\u00020\u001fH\u0092 ¢\u0006\u0004\b^\u0010_J(\u0010`\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001fH\u0092 ¢\u0006\u0004\b`\u0010RJ*\u0010a\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001fH\u0092 ¢\u0006\u0004\ba\u0010bJ0\u0010c\u001a\u00020;2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010]\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u001fH\u0092 ¢\u0006\u0004\bc\u0010dJ \u0010e\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\be\u0010fJ\u0018\u0010h\u001a\u00020g2\u0006\u0010\n\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bh\u0010iJ\u0018\u0010j\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bj\u0010\u0017J\u0018\u0010k\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bk\u0010TJ \u0010m\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010l\u001a\u00020\u0010H\u0092 ¢\u0006\u0004\bm\u0010WJ\u0018\u0010n\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\bn\u0010TJ \u0010p\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010o\u001a\u00020\u0010H\u0092 ¢\u0006\u0004\bp\u0010WJ \u0010r\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010q\u001a\u00020\u0002H\u0092 ¢\u0006\u0004\br\u0010fJ\u0017\u0010s\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0012¢\u0006\u0004\bs\u0010tR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010uR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0007\u0010v\u001a\u0004\bw\u0010xR.\u0010z\u001a\u0004\u0018\u0001072\b\u0010y\u001a\u0004\u0018\u0001078\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0016\u0010 \u001a\u00020\u001f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001e\u0010\u0085\u0001\u001a\u00020\u001c8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b\u0084\u0001\u0010B\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u0010\u0088\u0001\u001a\u00020\"8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R(\u0010U\u001a\u00020\u00102\u0006\u0010y\u001a\u00020\u00108V@PX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001d\u0010\u008f\u0001\u001a\u00020\u00188VX\u0097\u0004¢\u0006\u000e\u0012\u0005\b\u008e\u0001\u0010B\u001a\u0005\b\u008d\u0001\u0010\u001aR\u001d\u0010\u0092\u0001\u001a\u00020\u00188VX\u0097\u0004¢\u0006\u000e\u0012\u0005\b\u0091\u0001\u0010B\u001a\u0005\b\u0090\u0001\u0010\u001aR\u0017\u0010\u0095\u0001\u001a\u00020g8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R(\u0010l\u001a\u00020\u00102\u0006\u0010y\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0096\u0001\u0010\u008a\u0001\"\u0006\b\u0097\u0001\u0010\u008c\u0001R(\u0010o\u001a\u00020\u00102\u0006\u0010y\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0098\u0001\u0010\u008a\u0001\"\u0006\b\u0099\u0001\u0010\u008c\u0001R%\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u00020\u001f0\u009a\u00018VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b\u009d\u0001\u0010B\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R%\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020\u001f0\u009a\u00018VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b \u0001\u0010B\u001a\u0006\b\u009f\u0001\u0010\u009c\u0001¨\u0006¢\u0001"}, d2 = {"Lapp/rive/runtime/kotlin/core/Artboard;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "", "unsafeCppPointer", "Ljava/util/concurrent/locks/ReentrantLock;", "fileLock", "Lapp/rive/runtime/kotlin/core/File;", "file", "<init>", "(JLjava/util/concurrent/locks/ReentrantLock;Lapp/rive/runtime/kotlin/core/File;)V", "cppPointer", "rendererPointer", "Lapp/rive/runtime/kotlin/core/Fit;", "fit", "Lapp/rive/runtime/kotlin/core/Alignment;", "alignment", "", "scaleFactor", "Lp/rih1;", "cppDrawAligned", "(JJLapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;F)V", "pointer", "cppDelete", "(J)V", "", "release", "()I", "index", "Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "animation", "(I)Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "", "name", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "stateMachine", "(I)Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "path", "Lapp/rive/runtime/kotlin/core/SMIInput;", "input", "(Ljava/lang/String;Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/SMIInput;", "Lapp/rive/runtime/kotlin/core/RiveTextValueRun;", "textRun", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/RiveTextValueRun;", "getTextRunValue", "(Ljava/lang/String;)Ljava/lang/String;", "textValue", "setTextRunValue", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/RiveTextValueRun;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lapp/rive/runtime/kotlin/core/ViewModelInstance$Transfer;", "transfer", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "receiveViewModelInstance", "(Lapp/rive/runtime/kotlin/core/ViewModelInstance$Transfer;)Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "elapsedTime", "", "advance", "(F)Z", "rendererAddress", "draw", "(JLapp/rive/runtime/kotlin/core/Fit;Lapp/rive/runtime/kotlin/core/Alignment;F)V", "resetArtboardSize", "()V", "cppName", "(J)Ljava/lang/String;", "cppAnimationByIndex", "(JI)J", "cppAnimationByName", "(JLjava/lang/String;)J", "cppAnimationCount", "(J)I", "cppAnimationNameByIndex", "(JI)Ljava/lang/String;", "cppStateMachineByIndex", "cppStateMachineByName", "cppStateMachineCount", "cppStateMachineNameByIndex", "cppInputByNameAtPath", "(JLjava/lang/String;Ljava/lang/String;)J", "cppGetVolume", "(J)F", "volume", "cppSetVolume", "(JF)V", "cppAdvance", "(JF)Z", "cppFindTextValueRun", "cppFindValueOfTextValueRun", "(JLjava/lang/String;)Ljava/lang/String;", "newText", "cppSetValueOfTextValueRun", "(JLjava/lang/String;Ljava/lang/String;)Z", "cppFindTextValueRunAtPath", "cppFindValueOfTextValueRunAtPath", "(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "cppSetValueOfTextValueRunAtPath", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "cppDraw", "(JJ)V", "Landroid/graphics/RectF;", "cppBounds", "(J)Landroid/graphics/RectF;", "cppResetArtboardSize", "cppGetArtboardWidth", "width", "cppSetArtboardWidth", "cppGetArtboardHeight", "height", "cppSetArtboardHeight", "instancePointer", "cppSetViewModelInstance", "convertInput", "(Lapp/rive/runtime/kotlin/core/SMIInput;)Lapp/rive/runtime/kotlin/core/SMIInput;", "Ljava/util/concurrent/locks/ReentrantLock;", "Lapp/rive/runtime/kotlin/core/File;", "getFile$kotlin_release", "()Lapp/rive/runtime/kotlin/core/File;", "value", "viewModelInstance", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "getViewModelInstance", "()Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "setViewModelInstance", "(Lapp/rive/runtime/kotlin/core/ViewModelInstance;)V", "getName", "()Ljava/lang/String;", "getFirstAnimation", "()Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "getFirstAnimation$annotations", "firstAnimation", "getFirstStateMachine", "()Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "firstStateMachine", "getVolume", "()F", "setVolume$kotlin_release", "(F)V", "getAnimationCount", "getAnimationCount$annotations", "animationCount", "getStateMachineCount", "getStateMachineCount$annotations", "stateMachineCount", "getBounds", "()Landroid/graphics/RectF;", "bounds", "getWidth", "setWidth", "getHeight", "setHeight", "", "getAnimationNames", "()Ljava/util/List;", "getAnimationNames$annotations", "animationNames", "getStateMachineNames", "getStateMachineNames$annotations", "stateMachineNames", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class Artboard extends NativeObject {
    public static final int $stable = 8;
    private final File file;
    private final ReentrantLock fileLock;
    private ViewModelInstance viewModelInstance;

    public /* synthetic */ Artboard(long j, ReentrantLock reentrantLock, File file, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, reentrantLock, (i & 4) != 0 ? null : file);
    }

    private SMIInput convertInput(SMIInput input) throws StateMachineInputException {
        if (input.isBoolean()) {
            return new SMIBoolean(input.getCppPointer(), this.fileLock);
        }
        if (input.isTrigger()) {
            return new SMITrigger(input.getCppPointer(), this.fileLock);
        }
        if (input.isNumber()) {
            return new SMINumber(input.getCppPointer(), this.fileLock);
        }
        throw new StateMachineInputException(f4i1.f("Unknown State Machine Input Instance for ", input.getName(), "."));
    }

    private native boolean cppAdvance(long cppPointer, float elapsedTime);

    private native long cppAnimationByIndex(long cppPointer, int index);

    private native long cppAnimationByName(long cppPointer, String name);

    private native int cppAnimationCount(long cppPointer);

    private native String cppAnimationNameByIndex(long cppPointer, int index);

    private native RectF cppBounds(long cppPointer);

    private native void cppDraw(long cppPointer, long rendererPointer);

    private native long cppFindTextValueRun(long cppPointer, String name);

    private native long cppFindTextValueRunAtPath(long cppPointer, String name, String path);

    private native String cppFindValueOfTextValueRun(long cppPointer, String name);

    private native String cppFindValueOfTextValueRunAtPath(long cppPointer, String name, String path);

    private native float cppGetArtboardHeight(long cppPointer);

    private native float cppGetArtboardWidth(long cppPointer);

    private native float cppGetVolume(long cppPointer);

    private native long cppInputByNameAtPath(long cppPointer, String name, String path);

    private native String cppName(long cppPointer);

    private native void cppResetArtboardSize(long cppPointer);

    private native void cppSetArtboardHeight(long cppPointer, float height);

    private native void cppSetArtboardWidth(long cppPointer, float width);

    private native boolean cppSetValueOfTextValueRun(long cppPointer, String name, String newText);

    private native boolean cppSetValueOfTextValueRunAtPath(long cppPointer, String name, String newText, String path);

    private native void cppSetViewModelInstance(long cppPointer, long instancePointer);

    private native void cppSetVolume(long cppPointer, float volume);

    private native long cppStateMachineByIndex(long cppPointer, int index);

    private native long cppStateMachineByName(long cppPointer, String name);

    private native int cppStateMachineCount(long cppPointer);

    private native String cppStateMachineNameByIndex(long cppPointer, int index);

    public static /* synthetic */ void draw$default(Artboard artboard, long j, Fit fit, Alignment alignment, float f, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: draw");
            return;
        }
        if ((i & 8) != 0) {
            f = 1.0f;
        }
        artboard.draw(j, fit, alignment, f);
    }

    @adt
    public static /* synthetic */ void getAnimationCount$annotations() {
    }

    @adt
    public static /* synthetic */ void getAnimationNames$annotations() {
    }

    @adt
    public static /* synthetic */ void getFirstAnimation$annotations() {
    }

    @adt
    public static /* synthetic */ void getStateMachineCount$annotations() {
    }

    @adt
    public static /* synthetic */ void getStateMachineNames$annotations() {
    }

    public boolean advance(float elapsedTime) {
        boolean zCppAdvance;
        synchronized (this.fileLock) {
            zCppAdvance = cppAdvance(getCppPointer(), elapsedTime);
        }
        return zCppAdvance;
    }

    @adt
    public LinearAnimationInstance animation(String name) throws AnimationException {
        long jCppAnimationByName = cppAnimationByName(getCppPointer(), name);
        if (jCppAnimationByName != 0) {
            LinearAnimationInstance linearAnimationInstance = new LinearAnimationInstance(jCppAnimationByName, this.fileLock, 0.0f, 4, null);
            getDependencies().add(linearAnimationInstance);
            return linearAnimationInstance;
        }
        List<String> animationNames = getAnimationNames();
        ArrayList arrayList = new ArrayList(q7h.U(animationNames, 10));
        Iterator<T> it = animationNames.iterator();
        while (it.hasNext()) {
            arrayList.add("\"" + ((String) it.next()) + "\"");
        }
        throw new AnimationException("Animation \"" + name + "\" not found. Available Animations: " + arrayList + "\"");
    }

    @Override // app.p000rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    public native void cppDrawAligned(long cppPointer, long rendererPointer, Fit fit, Alignment alignment, float scaleFactor);

    public void draw(long rendererAddress, Fit fit, Alignment alignment, float scaleFactor) {
        synchronized (this.fileLock) {
            if (getHasCppObject()) {
                cppDrawAligned(getCppPointer(), rendererAddress, fit, alignment, scaleFactor);
            }
        }
    }

    public int getAnimationCount() {
        return cppAnimationCount(getCppPointer());
    }

    public List<String> getAnimationNames() {
        tr80 tr80VarQ = yoi1.Q(0, getAnimationCount());
        ArrayList arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
        lr80 it = tr80VarQ.iterator();
        while (it.hasNext()) {
            arrayList.add(cppAnimationNameByIndex(getCppPointer(), it.nextInt()));
        }
        return arrayList;
    }

    public RectF getBounds() {
        return cppBounds(getCppPointer());
    }

    /* JADX INFO: renamed from: getFile$kotlin_release, reason: from getter */
    public File getFile() {
        return this.file;
    }

    public LinearAnimationInstance getFirstAnimation() {
        return animation(0);
    }

    public StateMachineInstance getFirstStateMachine() {
        return stateMachine(0);
    }

    public float getHeight() {
        return cppGetArtboardHeight(getCppPointer());
    }

    public String getName() {
        return cppName(getCppPointer());
    }

    public int getStateMachineCount() {
        return cppStateMachineCount(getCppPointer());
    }

    public List<String> getStateMachineNames() {
        tr80 tr80VarQ = yoi1.Q(0, getStateMachineCount());
        ArrayList arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
        lr80 it = tr80VarQ.iterator();
        while (it.hasNext()) {
            arrayList.add(cppStateMachineNameByIndex(getCppPointer(), it.nextInt()));
        }
        return arrayList;
    }

    @adt
    public String getTextRunValue(String name) {
        return cppFindValueOfTextValueRun(getCppPointer(), name);
    }

    public ViewModelInstance getViewModelInstance() {
        return this.viewModelInstance;
    }

    public float getVolume() {
        return cppGetVolume(getCppPointer());
    }

    public float getWidth() {
        return cppGetArtboardWidth(getCppPointer());
    }

    @adt
    public SMIInput input(String name, String path) {
        SMIInput sMIInputConvertInput;
        synchronized (this.fileLock) {
            long jCppInputByNameAtPath = cppInputByNameAtPath(getCppPointer(), name, path);
            if (jCppInputByNameAtPath == 0) {
                throw new StateMachineInputException("No StateMachineInput found with name \"" + name + "\" in nested artboard " + path + ".");
            }
            sMIInputConvertInput = convertInput(new SMIInput(jCppInputByNameAtPath, this.fileLock));
        }
        return sMIInputConvertInput;
    }

    public ViewModelInstance receiveViewModelInstance(ViewModelInstance.Transfer transfer) throws ViewModelException {
        ViewModelInstance viewModelInstanceEnd$kotlin_release = transfer.end$kotlin_release();
        getDependencies().add(viewModelInstanceEnd$kotlin_release);
        setViewModelInstance(viewModelInstanceEnd$kotlin_release);
        return viewModelInstanceEnd$kotlin_release;
    }

    @Override // app.p000rive.runtime.kotlin.core.NativeObject, app.p000rive.runtime.kotlin.core.RefCount
    public int release() {
        int iRelease;
        synchronized (this.fileLock) {
            iRelease = super.release();
        }
        return iRelease;
    }

    public void resetArtboardSize() {
        synchronized (this.fileLock) {
            cppResetArtboardSize(getCppPointer());
        }
    }

    public void setHeight(float f) {
        synchronized (this.fileLock) {
            cppSetArtboardHeight(getCppPointer(), f);
        }
    }

    @adt
    public void setTextRunValue(String name, String textValue, String path) throws TextValueRunException {
        boolean zCppSetValueOfTextValueRunAtPath;
        synchronized (this.fileLock) {
            zCppSetValueOfTextValueRunAtPath = cppSetValueOfTextValueRunAtPath(getCppPointer(), name, textValue, path);
        }
        if (!zCppSetValueOfTextValueRunAtPath) {
            throw new TextValueRunException(cy30.p("Could not set text run value at path. No Rive TextValueRun found with name \"", name, ".\" in nested artboard \"", path, ".\""));
        }
    }

    public void setViewModelInstance(ViewModelInstance viewModelInstance) {
        if (viewModelInstance != null) {
            viewModelInstance.updateFileLock$kotlin_release(this.fileLock);
            synchronized (this.fileLock) {
                cppSetViewModelInstance(getCppPointer(), viewModelInstance.getCppPointer());
                this.viewModelInstance = viewModelInstance;
            }
        }
    }

    public void setVolume$kotlin_release(float f) {
        synchronized (this.fileLock) {
            cppSetVolume(getCppPointer(), f);
        }
    }

    public void setWidth(float f) {
        synchronized (this.fileLock) {
            cppSetArtboardWidth(getCppPointer(), f);
        }
    }

    @adt
    public StateMachineInstance stateMachine(int index) throws StateMachineException {
        long jCppStateMachineByIndex = cppStateMachineByIndex(getCppPointer(), index);
        if (jCppStateMachineByIndex == 0) {
            throw new StateMachineException(gvg.e(index, "No StateMachine found at index ", "."));
        }
        StateMachineInstance stateMachineInstance = new StateMachineInstance(jCppStateMachineByIndex, this.fileLock);
        getDependencies().add(stateMachineInstance);
        return stateMachineInstance;
    }

    @adt
    public RiveTextValueRun textRun(String name) throws TextValueRunException {
        long jCppFindTextValueRun = cppFindTextValueRun(getCppPointer(), name);
        if (jCppFindTextValueRun == 0) {
            throw new TextValueRunException(f4i1.f("No Rive TextValueRun found with name \"", name, ".\""));
        }
        RiveTextValueRun riveTextValueRun = new RiveTextValueRun(jCppFindTextValueRun, this.fileLock);
        getDependencies().add(riveTextValueRun);
        return riveTextValueRun;
    }

    public Artboard(long j, ReentrantLock reentrantLock, File file) {
        super(j);
        this.fileLock = reentrantLock;
        this.file = file;
    }

    @adt
    public String getTextRunValue(String name, String path) {
        return cppFindValueOfTextValueRunAtPath(getCppPointer(), name, path);
    }

    public void draw(long rendererAddress) {
        synchronized (this.fileLock) {
            if (getHasCppObject()) {
                cppDraw(getCppPointer(), rendererAddress);
            }
        }
    }

    @adt
    public void setTextRunValue(String name, String textValue) throws TextValueRunException {
        boolean zCppSetValueOfTextValueRun;
        synchronized (this.fileLock) {
            zCppSetValueOfTextValueRun = cppSetValueOfTextValueRun(getCppPointer(), name, textValue);
        }
        if (!zCppSetValueOfTextValueRun) {
            throw new TextValueRunException(f4i1.f("Could not set text run. No Rive TextValueRun found with name \"", name, ".\""));
        }
    }

    @adt
    public StateMachineInstance stateMachine(String name) throws StateMachineException {
        long jCppStateMachineByName = cppStateMachineByName(getCppPointer(), name);
        if (jCppStateMachineByName != 0) {
            StateMachineInstance stateMachineInstance = new StateMachineInstance(jCppStateMachineByName, this.fileLock);
            getDependencies().add(stateMachineInstance);
            return stateMachineInstance;
        }
        throw new StateMachineException(f4i1.f("No StateMachine found with name ", name, "."));
    }

    @adt
    public RiveTextValueRun textRun(String name, String path) throws TextValueRunException {
        long jCppFindTextValueRunAtPath = cppFindTextValueRunAtPath(getCppPointer(), name, path);
        if (jCppFindTextValueRunAtPath != 0) {
            RiveTextValueRun riveTextValueRun = new RiveTextValueRun(jCppFindTextValueRunAtPath, this.fileLock);
            getDependencies().add(riveTextValueRun);
            return riveTextValueRun;
        }
        throw new TextValueRunException(gvg.h("No Rive TextValueRun found with name \"", name, ".\" in nested artboard ", path));
    }

    @adt
    public LinearAnimationInstance animation(int index) throws AnimationException {
        long jCppAnimationByIndex = cppAnimationByIndex(getCppPointer(), index);
        if (jCppAnimationByIndex != 0) {
            LinearAnimationInstance linearAnimationInstance = new LinearAnimationInstance(jCppAnimationByIndex, this.fileLock, 0.0f, 4, null);
            getDependencies().add(linearAnimationInstance);
            return linearAnimationInstance;
        }
        throw new AnimationException(gvg.e(index, "No Animation found at index ", "."));
    }
}
