package app.p000rive.runtime.kotlin.core;

import app.p000rive.runtime.kotlin.core.errors.RiveEventException;
import app.p000rive.runtime.kotlin.core.errors.StateMachineInputException;
import app.p000rive.runtime.kotlin.core.errors.ViewModelException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import p.adt;
import p.f4i1;
import p.lr80;
import p.q7h;
import p.tr80;
import p.u890;
import p.yoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010 \n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0096 ¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001cJ%\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0017H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010#\u001a\u00020\"2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b#\u0010'J\u0015\u0010)\u001a\u00020(2\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010!\u001a\u00020\u0017H\u0007¢\u0006\u0004\b,\u0010-J \u0010/\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b/\u00100J\u0018\u00102\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b2\u00103J \u00104\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0017H\u0082 ¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b6\u00103J \u00107\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0017H\u0082 ¢\u0006\u0004\b7\u00105J\u0018\u00108\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b8\u00103J \u0010:\u001a\u0002092\u0006\u00101\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0017H\u0082 ¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\u00020%2\u0006\u00101\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b>\u00103J0\u0010?\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\b?\u0010@J0\u0010A\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\bA\u0010@J0\u0010B\u001a\u00020\n2\u0006\u00101\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\bB\u0010CJ0\u0010D\u001a\u00020\n2\u0006\u00101\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H\u0082 ¢\u0006\u0004\bD\u0010CJ \u0010F\u001a\u00020\n2\u0006\u00101\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020(2\u0006\u0010J\u001a\u00020(H\u0002¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010MR.\u0010O\u001a\u0004\u0018\u00010\u000f2\b\u0010N\u001a\u0004\u0018\u00010\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010&\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0011\u0010Y\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u001a\u0010]\u001a\u00020\u00178FX\u0087\u0004¢\u0006\f\u0012\u0004\b[\u0010\\\u001a\u0004\bZ\u0010XR \u0010b\u001a\b\u0012\u0004\u0012\u00020\"0^8FX\u0087\u0004¢\u0006\f\u0012\u0004\ba\u0010\\\u001a\u0004\b_\u0010`R \u0010e\u001a\b\u0012\u0004\u0012\u00020%0^8FX\u0087\u0004¢\u0006\f\u0012\u0004\bd\u0010\\\u001a\u0004\bc\u0010`R\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020(0^8F¢\u0006\u0006\u001a\u0004\bf\u0010`R \u0010j\u001a\b\u0012\u0004\u0012\u00020+0^8FX\u0087\u0004¢\u0006\f\u0012\u0004\bi\u0010\\\u001a\u0004\bh\u0010`R\u0014\u0010l\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010XR\u0014\u0010n\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010X¨\u0006o"}, d2 = {"Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "Lapp/rive/runtime/kotlin/core/PlayableInstance;", "", "unsafeCppPointer", "Ljava/util/concurrent/locks/ReentrantLock;", "fileLock", "<init>", "(JLjava/util/concurrent/locks/ReentrantLock;)V", "pointer", "Lp/rih1;", "cppDelete", "(J)V", "Lapp/rive/runtime/kotlin/core/ViewModelInstance$Transfer;", "transfer", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "receiveViewModelInstance", "(Lapp/rive/runtime/kotlin/core/ViewModelInstance$Transfer;)Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "", "elapsed", "", "advance", "(F)Z", "", "pointerID", "x", "y", "pointerDown", "(IFF)Z", "pointerUp", "pointerMove", "(IFF)V", "pointerExit", "index", "Lapp/rive/runtime/kotlin/core/SMIInput;", "input", "(I)Lapp/rive/runtime/kotlin/core/SMIInput;", "", "name", "(Ljava/lang/String;)Lapp/rive/runtime/kotlin/core/SMIInput;", "Lapp/rive/runtime/kotlin/core/LayerState;", "stateChanged", "(I)Lapp/rive/runtime/kotlin/core/LayerState;", "Lapp/rive/runtime/kotlin/core/RiveEvent;", "eventAt", "(I)Lapp/rive/runtime/kotlin/core/RiveEvent;", "elapsedTime", "cppAdvance", "(JF)Z", "cppPointer", "cppInputCount", "(J)I", "cppSMIInputByIndex", "(JI)J", "cppStateChangedCount", "cppStateChangedByIndex", "cppReportedEventCount", "Lapp/rive/runtime/kotlin/core/RiveEventReport;", "cppReportedEventAt", "(JI)Lapp/rive/runtime/kotlin/core/RiveEventReport;", "cppName", "(J)Ljava/lang/String;", "cppLayerCount", "cppPointerDown", "(JIFF)Z", "cppPointerUp", "cppPointerMove", "(JIFF)V", "cppPointerExit", "viewModel", "cppSetViewModelInstance", "(JJ)V", "convertInput", "(Lapp/rive/runtime/kotlin/core/SMIInput;)Lapp/rive/runtime/kotlin/core/SMIInput;", "state", "convertLayerState", "(Lapp/rive/runtime/kotlin/core/LayerState;)Lapp/rive/runtime/kotlin/core/LayerState;", "Ljava/util/concurrent/locks/ReentrantLock;", "value", "viewModelInstance", "Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "getViewModelInstance", "()Lapp/rive/runtime/kotlin/core/ViewModelInstance;", "setViewModelInstance", "(Lapp/rive/runtime/kotlin/core/ViewModelInstance;)V", "getName", "()Ljava/lang/String;", "getLayerCount", "()I", "layerCount", "getInputCount", "getInputCount$annotations", "()V", "inputCount", "", "getInputs", "()Ljava/util/List;", "getInputs$annotations", "inputs", "getInputNames", "getInputNames$annotations", "inputNames", "getStatesChanged", "statesChanged", "getEventsReported", "getEventsReported$annotations", "eventsReported", "getStateChangedCount", "stateChangedCount", "getReportedEventCount", "reportedEventCount", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StateMachineInstance extends NativeObject implements PlayableInstance {
    public static final int $stable = 8;
    private final ReentrantLock fileLock;
    private ViewModelInstance viewModelInstance;

    public StateMachineInstance(long j, ReentrantLock reentrantLock) {
        super(j);
        this.fileLock = reentrantLock;
    }

    private final SMIInput convertInput(SMIInput input) throws StateMachineInputException {
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

    private final LayerState convertLayerState(LayerState state) throws StateMachineInputException {
        if (state.isAnimationState()) {
            return new AnimationState(state.getCppPointer());
        }
        if (state.isAnyState()) {
            return new AnyState(state.getCppPointer());
        }
        if (state.isEntryState()) {
            return new EntryState(state.getCppPointer());
        }
        if (state.isExitState()) {
            return new ExitState(state.getCppPointer());
        }
        if (state.isBlendState()) {
            return new BlendState(state.getCppPointer());
        }
        throw new StateMachineInputException("Unknown Layer State for " + state + ".");
    }

    private final native boolean cppAdvance(long pointer, float elapsedTime);

    private final native int cppInputCount(long cppPointer);

    private final native int cppLayerCount(long cppPointer);

    private final native String cppName(long cppPointer);

    private final native boolean cppPointerDown(long cppPointer, int pointerID, float x, float y);

    private final native void cppPointerExit(long cppPointer, int pointerID, float x, float y);

    private final native void cppPointerMove(long cppPointer, int pointerID, float x, float y);

    private final native boolean cppPointerUp(long cppPointer, int pointerID, float x, float y);

    private final native RiveEventReport cppReportedEventAt(long cppPointer, int index);

    private final native int cppReportedEventCount(long cppPointer);

    private final native long cppSMIInputByIndex(long cppPointer, int index);

    private final native void cppSetViewModelInstance(long cppPointer, long viewModel);

    private final native long cppStateChangedByIndex(long cppPointer, int index);

    private final native int cppStateChangedCount(long cppPointer);

    @adt
    public static /* synthetic */ void getEventsReported$annotations() {
    }

    @adt
    public static /* synthetic */ void getInputCount$annotations() {
    }

    @adt
    public static /* synthetic */ void getInputNames$annotations() {
    }

    @adt
    public static /* synthetic */ void getInputs$annotations() {
    }

    private final int getReportedEventCount() {
        return cppReportedEventCount(getCppPointer());
    }

    private final int getStateChangedCount() {
        return cppStateChangedCount(getCppPointer());
    }

    public final boolean advance(float elapsed) {
        boolean zCppAdvance;
        synchronized (this.fileLock) {
            zCppAdvance = cppAdvance(getCppPointer(), elapsed);
        }
        return zCppAdvance;
    }

    @Override // app.p000rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    @adt
    public final RiveEvent eventAt(int index) {
        RiveEvent event;
        synchronized (this.fileLock) {
            RiveEventReport riveEventReportCppReportedEventAt = cppReportedEventAt(getCppPointer(), index);
            if (riveEventReportCppReportedEventAt.getUnsafeCppPointer() == 0) {
                throw new RiveEventException("No Rive Event found at index " + index + ".");
            }
            event = riveEventReportCppReportedEventAt.getEvent();
        }
        return event;
    }

    public final List<RiveEvent> getEventsReported() {
        ArrayList arrayList;
        synchronized (this.fileLock) {
            tr80 tr80VarQ = yoi1.Q(0, getReportedEventCount());
            arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
            lr80 it = tr80VarQ.iterator();
            while (it.hasNext()) {
                arrayList.add(eventAt(it.nextInt()));
            }
        }
        return arrayList;
    }

    public final int getInputCount() {
        int iCppInputCount;
        synchronized (this.fileLock) {
            iCppInputCount = cppInputCount(getCppPointer());
        }
        return iCppInputCount;
    }

    public final List<String> getInputNames() {
        ArrayList arrayList;
        synchronized (this.fileLock) {
            tr80 tr80VarQ = yoi1.Q(0, getInputCount());
            arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
            lr80 it = tr80VarQ.iterator();
            while (it.hasNext()) {
                arrayList.add(input(it.nextInt()).getName());
            }
        }
        return arrayList;
    }

    public final List<SMIInput> getInputs() {
        ArrayList arrayList;
        synchronized (this.fileLock) {
            tr80 tr80VarQ = yoi1.Q(0, getInputCount());
            arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
            lr80 it = tr80VarQ.iterator();
            while (it.hasNext()) {
                arrayList.add(input(it.nextInt()));
            }
        }
        return arrayList;
    }

    public final int getLayerCount() {
        return cppLayerCount(getCppPointer());
    }

    @Override // app.p000rive.runtime.kotlin.core.PlayableInstance
    public String getName() {
        return cppName(getCppPointer());
    }

    public final List<LayerState> getStatesChanged() {
        ArrayList arrayList;
        synchronized (this.fileLock) {
            tr80 tr80VarQ = yoi1.Q(0, getStateChangedCount());
            arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
            lr80 it = tr80VarQ.iterator();
            while (it.hasNext()) {
                arrayList.add(stateChanged(it.nextInt()));
            }
        }
        return arrayList;
    }

    public final ViewModelInstance getViewModelInstance() {
        return this.viewModelInstance;
    }

    @adt
    public final SMIInput input(String name) {
        SMIInput sMIInputInput;
        synchronized (this.fileLock) {
            int inputCount = getInputCount();
            for (int i = 0; i < inputCount; i++) {
                sMIInputInput = input(i);
                if (!u890.j(sMIInputInput.getName(), name)) {
                }
            }
            throw new StateMachineInputException("No StateMachineInput found with name " + name + ".");
        }
        return sMIInputInput;
    }

    public final boolean pointerDown(int pointerID, float x, float y) {
        boolean zCppPointerDown;
        synchronized (this.fileLock) {
            zCppPointerDown = cppPointerDown(getCppPointer(), pointerID, x, y);
        }
        return zCppPointerDown;
    }

    public final void pointerExit(int pointerID, float x, float y) {
        synchronized (this.fileLock) {
            cppPointerExit(getCppPointer(), pointerID, x, y);
        }
    }

    public final void pointerMove(int pointerID, float x, float y) {
        synchronized (this.fileLock) {
            cppPointerMove(getCppPointer(), pointerID, x, y);
        }
    }

    public final boolean pointerUp(int pointerID, float x, float y) {
        boolean zCppPointerUp;
        synchronized (this.fileLock) {
            zCppPointerUp = cppPointerUp(getCppPointer(), pointerID, x, y);
        }
        return zCppPointerUp;
    }

    public final ViewModelInstance receiveViewModelInstance(ViewModelInstance.Transfer transfer) throws ViewModelException {
        ViewModelInstance viewModelInstanceEnd$kotlin_release = transfer.end$kotlin_release();
        getDependencies().add(viewModelInstanceEnd$kotlin_release);
        setViewModelInstance(viewModelInstanceEnd$kotlin_release);
        return viewModelInstanceEnd$kotlin_release;
    }

    public final void setViewModelInstance(ViewModelInstance viewModelInstance) {
        if (viewModelInstance != null) {
            viewModelInstance.updateFileLock$kotlin_release(this.fileLock);
        }
        synchronized (this.fileLock) {
            if (viewModelInstance != null) {
                try {
                    cppSetViewModelInstance(getCppPointer(), viewModelInstance.getCppPointer());
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.viewModelInstance = viewModelInstance;
        }
    }

    public final LayerState stateChanged(int index) {
        LayerState layerStateConvertLayerState;
        synchronized (this.fileLock) {
            long jCppStateChangedByIndex = cppStateChangedByIndex(getCppPointer(), index);
            if (jCppStateChangedByIndex == 0) {
                throw new StateMachineInputException("No LayerState found at index " + index + ".");
            }
            layerStateConvertLayerState = convertLayerState(new LayerState(jCppStateChangedByIndex));
        }
        return layerStateConvertLayerState;
    }

    @adt
    public final SMIInput input(int index) {
        SMIInput sMIInputConvertInput;
        synchronized (this.fileLock) {
            long jCppSMIInputByIndex = cppSMIInputByIndex(getCppPointer(), index);
            if (jCppSMIInputByIndex == 0) {
                throw new StateMachineInputException("No StateMachineInput found at index " + index + ".");
            }
            sMIInputConvertInput = convertInput(new SMIInput(jCppSMIInputByIndex, this.fileLock));
        }
        return sMIInputConvertInput;
    }
}
