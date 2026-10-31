package app.p000rive.core;

import app.p000rive.RiveFocusState;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.bhn0;
import p.bpb1;
import p.d5p1;
import p.gio1;
import p.l1d;
import p.wen0;
import p.zob1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001.B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00152\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0018J \u0010\u001f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010\u000fJ0\u0010'\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0014\u0010)\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Lapp/rive/core/FocusStateStore;", "", "Lkotlin/Function0;", "", "reserveNextRequestID", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lapp/rive/core/StateMachineHandle;", "stateMachineHandle", "Lapp/rive/core/FocusStateStore$Slot;", "requireSlot-AkTCgDQ", "(J)Lapp/rive/core/FocusStateStore$Slot;", "requireSlot", "Lp/rih1;", "register-AkTCgDQ", "(J)V", "register", "unregister-AkTCgDQ", "unregister", "clear", "()V", "Lp/zob1;", "Lapp/rive/RiveFocusState;", "focusState-AkTCgDQ", "(J)Lp/zob1;", "focusState", "", "hasFocusNodes-AkTCgDQ", "hasFocusNodes", "applyHasFocusNodes-OFH3VyA", "(JZ)V", "applyHasFocusNodes", "invalidate-AkTCgDQ", "invalidate", "requestID", "hasFocus", "expectsKeyboardInput", "applyFocusState-2VxROKE", "(JJZZ)V", "applyFocusState", "Lkotlin/jvm/functions/Function0;", "lock", "Ljava/lang/Object;", "", "slots", "Ljava/util/Map;", "Slot", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FocusStateStore {
    public static final int $stable = 8;
    private final Function0 reserveNextRequestID;
    private final Object lock = new Object();
    private final Map<StateMachineHandle, Slot> slots = new LinkedHashMap();

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0005R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\r8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00138\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017¨\u0006\u001d"}, d2 = {"Lapp/rive/core/FocusStateStore$Slot;", "", "", "requestIDBoundary", "<init>", "(J)V", "Lp/rih1;", "publishTerminalState", "()V", "J", "getRequestIDBoundary", "()J", "setRequestIDBoundary", "Lp/wen0;", "Lapp/rive/RiveFocusState;", "mutableFocusState", "Lp/wen0;", "getMutableFocusState", "()Lp/wen0;", "Lp/zob1;", "focusState", "Lp/zob1;", "getFocusState", "()Lp/zob1;", "", "mutableHasFocusNodes", "getMutableHasFocusNodes", "hasFocusNodes", "getHasFocusNodes", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Slot {
        private final zob1 focusState;
        private final zob1 hasFocusNodes;
        private final wen0 mutableFocusState;
        private final wen0 mutableHasFocusNodes;
        private long requestIDBoundary;

        public Slot(long j) {
            this.requestIDBoundary = j;
            bpb1 bpb1VarB = gio1.b(new RiveFocusState(false, false, 3, null));
            this.mutableFocusState = bpb1VarB;
            this.focusState = d5p1.h(bpb1VarB);
            bpb1 bpb1VarB2 = gio1.b(Boolean.FALSE);
            this.mutableHasFocusNodes = bpb1VarB2;
            this.hasFocusNodes = d5p1.h(bpb1VarB2);
        }

        public final zob1 getFocusState() {
            return this.focusState;
        }

        public final zob1 getHasFocusNodes() {
            return this.hasFocusNodes;
        }

        public final wen0 getMutableFocusState() {
            return this.mutableFocusState;
        }

        public final wen0 getMutableHasFocusNodes() {
            return this.mutableHasFocusNodes;
        }

        public final long getRequestIDBoundary() {
            return this.requestIDBoundary;
        }

        public final void publishTerminalState() {
            bpb1 bpb1Var = this.mutableFocusState;
            RiveFocusState riveFocusState = new RiveFocusState(false, false, 3, null);
            bpb1 bpb1Var2 = bpb1Var;
            bpb1Var2.getClass();
            bpb1Var2.m((Object) null, riveFocusState);
            bpb1 bpb1Var3 = this.mutableHasFocusNodes;
            Boolean bool = Boolean.FALSE;
            bpb1 bpb1Var4 = bpb1Var3;
            bpb1Var4.getClass();
            bpb1Var4.m((Object) null, bool);
        }

        public final void setRequestIDBoundary(long j) {
            this.requestIDBoundary = j;
        }
    }

    public FocusStateStore(Function0 function0) {
        this.reserveNextRequestID = function0;
    }

    /* JADX INFO: renamed from: requireSlot-AkTCgDQ, reason: not valid java name */
    private final Slot m374requireSlotAkTCgDQ(long stateMachineHandle) {
        Slot slot = this.slots.get(StateMachineHandle.m434boximpl(stateMachineHandle));
        if (slot != null) {
            return slot;
        }
        bhn0.f(l1d.m("No focus state is registered for ", StateMachineHandle.m439toStringimpl(stateMachineHandle)));
        return null;
    }

    /* JADX INFO: renamed from: applyFocusState-2VxROKE, reason: not valid java name */
    public final void m375applyFocusState2VxROKE(long requestID, long stateMachineHandle, boolean hasFocus, boolean expectsKeyboardInput) {
        synchronized (this.lock) {
            Slot slot = this.slots.get(StateMachineHandle.m434boximpl(stateMachineHandle));
            if (slot != null && requestID > slot.getRequestIDBoundary()) {
                bpb1 mutableFocusState = slot.getMutableFocusState();
                RiveFocusState riveFocusState = new RiveFocusState(hasFocus, expectsKeyboardInput);
                bpb1 bpb1Var = mutableFocusState;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, riveFocusState);
            }
        }
    }

    /* JADX INFO: renamed from: applyHasFocusNodes-OFH3VyA, reason: not valid java name */
    public final void m376applyHasFocusNodesOFH3VyA(long stateMachineHandle, boolean hasFocusNodes) {
        synchronized (this.lock) {
            Slot slot = this.slots.get(StateMachineHandle.m434boximpl(stateMachineHandle));
            if (slot != null) {
                bpb1 mutableHasFocusNodes = slot.getMutableHasFocusNodes();
                Boolean boolValueOf = Boolean.valueOf(hasFocusNodes);
                bpb1 bpb1Var = mutableHasFocusNodes;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, boolValueOf);
            }
        }
    }

    public final void clear() {
        synchronized (this.lock) {
            try {
                Iterator<T> it = this.slots.values().iterator();
                while (it.hasNext()) {
                    ((Slot) it.next()).publishTerminalState();
                }
                this.slots.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: focusState-AkTCgDQ, reason: not valid java name */
    public final zob1 m377focusStateAkTCgDQ(long stateMachineHandle) {
        zob1 focusState;
        synchronized (this.lock) {
            focusState = m374requireSlotAkTCgDQ(stateMachineHandle).getFocusState();
        }
        return focusState;
    }

    /* JADX INFO: renamed from: hasFocusNodes-AkTCgDQ, reason: not valid java name */
    public final zob1 m378hasFocusNodesAkTCgDQ(long stateMachineHandle) {
        zob1 hasFocusNodes;
        synchronized (this.lock) {
            hasFocusNodes = m374requireSlotAkTCgDQ(stateMachineHandle).getHasFocusNodes();
        }
        return hasFocusNodes;
    }

    /* JADX INFO: renamed from: invalidate-AkTCgDQ, reason: not valid java name */
    public final void m379invalidateAkTCgDQ(long stateMachineHandle) {
        synchronized (this.lock) {
            Slot slot = this.slots.get(StateMachineHandle.m434boximpl(stateMachineHandle));
            if (slot != null) {
                slot.setRequestIDBoundary(((Number) this.reserveNextRequestID.invoke()).longValue());
            }
        }
    }

    /* JADX INFO: renamed from: register-AkTCgDQ, reason: not valid java name */
    public final void m380registerAkTCgDQ(long stateMachineHandle) {
        synchronized (this.lock) {
            if (this.slots.containsKey(StateMachineHandle.m434boximpl(stateMachineHandle))) {
                throw new IllegalStateException(("Focus state is already registered for " + StateMachineHandle.m439toStringimpl(stateMachineHandle)).toString());
            }
            this.slots.put(StateMachineHandle.m434boximpl(stateMachineHandle), new Slot(((Number) this.reserveNextRequestID.invoke()).longValue()));
        }
    }

    /* JADX INFO: renamed from: unregister-AkTCgDQ, reason: not valid java name */
    public final void m381unregisterAkTCgDQ(long stateMachineHandle) {
        synchronized (this.lock) {
            Slot slotRemove = this.slots.remove(StateMachineHandle.m434boximpl(stateMachineHandle));
            if (slotRemove != null) {
                slotRemove.publishTerminalState();
            }
        }
    }
}
