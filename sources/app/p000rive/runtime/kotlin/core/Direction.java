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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lapp/rive/runtime/kotlin/core/Direction;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "BACKWARDS", "FORWARDS", "AUTO", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum Direction {
    BACKWARDS(-1),
    FORWARDS(1),
    AUTO(0);

    private static final Map<Integer, Direction> map;
    private final int value;
    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lapp/rive/runtime/kotlin/core/Direction$Companion;", "", "()V", "map", "", "", "Lapp/rive/runtime/kotlin/core/Direction;", "fromInt", "type", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Direction fromInt(int type) {
            return (Direction) Direction.map.get(Integer.valueOf(type));
        }

        private Companion() {
        }
    }

    static {
        r0z entries = getEntries();
        int iS = zno1.s(q7h.U(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (Object obj : entries) {
            linkedHashMap.put(Integer.valueOf(((Direction) obj).value), obj);
        }
        map = linkedHashMap;
    }

    Direction(int i) {
        this.value = i;
    }

    public static r0z getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
