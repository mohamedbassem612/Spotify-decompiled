package app.p000rive.core;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.at71;
import p.bhn0;
import p.bpb1;
import p.d5p1;
import p.dt71;
import p.gio1;
import p.l1d;
import p.mgo1;
import p.sen0;
import p.wen0;
import p.zob1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001.B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000fJ \u0010\u001f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0014\u0010!\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Lapp/rive/core/StateMachineSettlingStore;", "", "Lkotlin/Function0;", "", "reserveNextRequestID", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Lapp/rive/core/StateMachineHandle;", "stateMachineHandle", "Lapp/rive/core/StateMachineSettlingStore$Slot;", "requireSlot-AkTCgDQ", "(J)Lapp/rive/core/StateMachineSettlingStore$Slot;", "requireSlot", "Lp/rih1;", "register-AkTCgDQ", "(J)V", "register", "unregister-AkTCgDQ", "unregister", "clear", "()V", "Lp/zob1;", "", "settled-AkTCgDQ", "(J)Lp/zob1;", "settled", "unsettle-AkTCgDQ", "unsettle", "requestID", "settle-S2xOzgc", "(JJ)V", "settle", "Lkotlin/jvm/functions/Function0;", "lock", "Ljava/lang/Object;", "", "slots", "Ljava/util/Map;", "Lp/sen0;", "_acceptedSettlements", "Lp/sen0;", "Lp/at71;", "acceptedSettlements", "Lp/at71;", "getAcceptedSettlements", "()Lp/at71;", "Slot", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StateMachineSettlingStore {
    public static final int $stable = 8;
    private final sen0 _acceptedSettlements;
    private final at71 acceptedSettlements;
    private final Function0 reserveNextRequestID;
    private final Object lock = new Object();
    private final Map<StateMachineHandle, Slot> slots = new LinkedHashMap();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lapp/rive/core/StateMachineSettlingStore$Slot;", "", "", "requestIDBoundary", "<init>", "(J)V", "J", "getRequestIDBoundary", "()J", "setRequestIDBoundary", "Lp/wen0;", "", "mutableSettled", "Lp/wen0;", "getMutableSettled", "()Lp/wen0;", "Lp/zob1;", "settled", "Lp/zob1;", "getSettled", "()Lp/zob1;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Slot {
        private final wen0 mutableSettled;
        private long requestIDBoundary;
        private final zob1 settled;

        public Slot(long j) {
            this.requestIDBoundary = j;
            bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
            this.mutableSettled = bpb1VarB;
            this.settled = d5p1.h(bpb1VarB);
        }

        public final wen0 getMutableSettled() {
            return this.mutableSettled;
        }

        public final long getRequestIDBoundary() {
            return this.requestIDBoundary;
        }

        public final zob1 getSettled() {
            return this.settled;
        }

        public final void setRequestIDBoundary(long j) {
            this.requestIDBoundary = j;
        }
    }

    public StateMachineSettlingStore(Function0 function0) {
        this.reserveNextRequestID = function0;
        dt71 dt71VarD = mgo1.d(0, 32, 2);
        this._acceptedSettlements = dt71VarD;
        this.acceptedSettlements = dt71VarD;
    }

    /* JADX INFO: renamed from: requireSlot-AkTCgDQ, reason: not valid java name */
    private final Slot m441requireSlotAkTCgDQ(long stateMachineHandle) {
        Slot slot = this.slots.get(StateMachineHandle.m434boximpl(stateMachineHandle));
        if (slot != null) {
            return slot;
        }
        bhn0.f(l1d.m("No settled state is registered for ", StateMachineHandle.m439toStringimpl(stateMachineHandle)));
        return null;
    }

    public final void clear() {
        synchronized (this.lock) {
            try {
                Iterator<T> it = this.slots.values().iterator();
                while (it.hasNext()) {
                    bpb1 mutableSettled = ((Slot) it.next()).getMutableSettled();
                    Boolean bool = Boolean.TRUE;
                    bpb1 bpb1Var = mutableSettled;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool);
                }
                this.slots.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final at71 getAcceptedSettlements() {
        return this.acceptedSettlements;
    }

    /* JADX INFO: renamed from: register-AkTCgDQ, reason: not valid java name */
    public final void m442registerAkTCgDQ(long stateMachineHandle) {
        synchronized (this.lock) {
            if (this.slots.containsKey(StateMachineHandle.m434boximpl(stateMachineHandle))) {
                throw new IllegalStateException(("Settled state is already registered for " + StateMachineHandle.m439toStringimpl(stateMachineHandle)).toString());
            }
            this.slots.put(StateMachineHandle.m434boximpl(stateMachineHandle), new Slot(((Number) this.reserveNextRequestID.invoke()).longValue()));
        }
    }

    /* JADX INFO: renamed from: settle-S2xOzgc, reason: not valid java name */
    public final void m443settleS2xOzgc(long requestID, long stateMachineHandle) {
        synchronized (this.lock) {
            Slot slot = this.slots.get(StateMachineHandle.m434boximpl(stateMachineHandle));
            if (slot == null) {
                return;
            }
            if (requestID > slot.getRequestIDBoundary() && !((Boolean) slot.getMutableSettled().getValue()).booleanValue()) {
                bpb1 mutableSettled = slot.getMutableSettled();
                Boolean bool = Boolean.TRUE;
                bpb1 bpb1Var = mutableSettled;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool);
                this._acceptedSettlements.a(StateMachineHandle.m434boximpl(stateMachineHandle));
            }
        }
    }

    /* JADX INFO: renamed from: settled-AkTCgDQ, reason: not valid java name */
    public final zob1 m444settledAkTCgDQ(long stateMachineHandle) {
        zob1 settled;
        synchronized (this.lock) {
            settled = m441requireSlotAkTCgDQ(stateMachineHandle).getSettled();
        }
        return settled;
    }

    /* JADX INFO: renamed from: unregister-AkTCgDQ, reason: not valid java name */
    public final void m445unregisterAkTCgDQ(long stateMachineHandle) {
        synchronized (this.lock) {
            try {
                Slot slot = this.slots.get(StateMachineHandle.m434boximpl(stateMachineHandle));
                wen0 mutableSettled = slot != null ? slot.getMutableSettled() : null;
                if (mutableSettled != null) {
                    ((bpb1) mutableSettled).m((Object) null, Boolean.TRUE);
                }
                this.slots.remove(StateMachineHandle.m434boximpl(stateMachineHandle));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: unsettle-AkTCgDQ, reason: not valid java name */
    public final void m446unsettleAkTCgDQ(long stateMachineHandle) {
        synchronized (this.lock) {
            Slot slotM441requireSlotAkTCgDQ = m441requireSlotAkTCgDQ(stateMachineHandle);
            slotM441requireSlotAkTCgDQ.setRequestIDBoundary(((Number) this.reserveNextRequestID.invoke()).longValue());
            bpb1 mutableSettled = slotM441requireSlotAkTCgDQ.getMutableSettled();
            Boolean bool = Boolean.FALSE;
            bpb1 bpb1Var = mutableSettled;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, bool);
        }
    }
}
