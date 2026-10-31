package com.spotify.eventsender.corebridge;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.eventsender.api.EventPersistedCallback;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.l1d;
import p.lc00;
import p.lny0;
import p.nb00;
import p.nne;
import p.xb00;
import p.xvy;
import p.y680;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/spotify/eventsender/corebridge/EventSenderCoreBridgeImpl;", "Lcom/spotify/eventsender/api/EventSenderCoreBridge;", "Lp/xb00;", "eventSender", "<init>", "(Lp/xb00;)V", "", "eventName", "payload", "overrideUserName", "Lcom/spotify/eventsender/api/EventPersistedCallback;", "callback", "", "send", "([B[B[BLcom/spotify/eventsender/api/EventPersistedCallback;)I", "Lp/rih1;", "queueMetricsDataSnapshotForSending", "([B[B)V", "Lp/xb00;", "Lp/nb00;", "eventPublisher", "Lp/nb00;", "Companion", "src_main_java_com_spotify_eventsender_corebridge-corebridge"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class EventSenderCoreBridgeImpl implements EventSenderCoreBridge {
    private static final Companion Companion = new Companion(null);
    private final nb00 eventPublisher;
    private final xb00 eventSender;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\t"}, d2 = {"Lcom/spotify/eventsender/corebridge/EventSenderCoreBridgeImpl$Companion;", "", "<init>", "()V", "decodeNullableUTF8", "", "buffer", "", "decodeUTF8", "src_main_java_com_spotify_eventsender_corebridge-corebridge"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String decodeNullableUTF8(byte[] buffer) {
            if (buffer != null) {
                return decodeUTF8(buffer);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String decodeUTF8(byte[] buffer) {
            return new String(buffer, nne.a);
        }

        private Companion() {
        }
    }

    public EventSenderCoreBridgeImpl(xb00 xb00Var) {
        this.eventSender = xb00Var;
        this.eventPublisher = ((lc00) xb00Var).H;
    }

    @Override // com.spotify.eventsender.api.EventSenderCoreBridge
    public void queueMetricsDataSnapshotForSending(byte[] eventName, byte[] payload) {
        String strDecodeUTF8 = Companion.decodeUTF8(eventName);
        y680 y680Var = (y680) ((lc00) this.eventSender).D.getValue();
        xvy xvyVar = new xvy(y680Var, strDecodeUTF8, y680Var.c.invoke(strDecodeUTF8, payload, y680Var.d.getBytes(nne.a)), (byte) 22);
        synchronized (y680Var.b) {
            xvyVar.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.spotify.eventsender.corebridge.EventSenderCoreBridgeImpl$send$result$1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.spotify.eventsender.api.EventSenderCoreBridge
    public int send(byte[] eventName, byte[] payload, byte[] overrideUserName, final EventPersistedCallback callback) {
        Companion companion = Companion;
        return l1d.C(this.eventPublisher.a(companion.decodeUTF8(eventName), payload, companion.decodeNullableUTF8(overrideUserName), new lny0() { // from class: com.spotify.eventsender.corebridge.EventSenderCoreBridgeImpl$send$result$1
            @Override // p.lny0
            public void onEventStored(int result) {
                EventPersistedCallback eventPersistedCallback = callback;
                if (eventPersistedCallback != null) {
                    eventPersistedCallback.invoke(result);
                }
                EventPersistedCallback eventPersistedCallback2 = callback;
                if (eventPersistedCallback2 != null) {
                    eventPersistedCallback2.destroy();
                }
            }
        }));
    }
}
