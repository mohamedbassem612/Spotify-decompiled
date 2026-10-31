package app.p000rive;

import kotlin.Metadata;
import p.r0z;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lapp/rive/Alignment;", "", "nativeMapping", "", "(Ljava/lang/String;IB)V", "getNativeMapping$kotlin_release", "()B", "TopLeft", "TopCenter", "TopRight", "CenterLeft", "Center", "CenterRight", "BottomLeft", "BottomCenter", "BottomRight", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum Alignment {
    TopLeft((byte) 0),
    TopCenter((byte) 1),
    TopRight((byte) 2),
    CenterLeft((byte) 3),
    Center((byte) 4),
    CenterRight((byte) 5),
    BottomLeft((byte) 6),
    BottomCenter((byte) 7),
    BottomRight((byte) 8);

    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());
    private final byte nativeMapping;

    Alignment(byte b) {
        this.nativeMapping = b;
    }

    public static r0z getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: renamed from: getNativeMapping$kotlin_release, reason: from getter */
    public final byte getNativeMapping() {
        return this.nativeMapping;
    }
}
