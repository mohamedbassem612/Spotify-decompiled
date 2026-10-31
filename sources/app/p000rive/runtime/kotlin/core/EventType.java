package app.p000rive.runtime.kotlin.core;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.adt;
import p.q7h;
import p.r0z;
import p.t0z;
import p.zno1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@adt
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\n\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lapp/rive/runtime/kotlin/core/EventType;", "", "value", "", "(Ljava/lang/String;IS)V", "getValue", "()S", "OpenURLEvent", "GeneralEvent", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum EventType {
    OpenURLEvent(131),
    GeneralEvent(128);

    private static final Map<Short, EventType> map;
    private final short value;
    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lapp/rive/runtime/kotlin/core/EventType$Companion;", "", "()V", "map", "", "", "Lapp/rive/runtime/kotlin/core/EventType;", "fromInt", "type", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EventType fromInt(short type) {
            return (EventType) EventType.map.get(Short.valueOf(type));
        }

        private Companion() {
        }
    }

    static {
        r0z entries = getEntries();
        int iS = zno1.s(q7h.U(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (Object obj : entries) {
            linkedHashMap.put(Short.valueOf(((EventType) obj).value), obj);
        }
        map = linkedHashMap;
    }

    EventType(short s) {
        this.value = s;
    }

    public static r0z getEntries() {
        return $ENTRIES;
    }

    public final short getValue() {
        return this.value;
    }
}
