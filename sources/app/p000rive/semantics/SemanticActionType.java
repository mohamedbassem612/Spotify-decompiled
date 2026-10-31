package app.p000rive.semantics;

import kotlin.Metadata;
import p.r0z;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lapp/rive/semantics/SemanticActionType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue$kotlin_release", "()I", "Tap", "Increase", "Decrease", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum SemanticActionType {
    Tap(0),
    Increase(1),
    Decrease(2);

    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());
    private final int value;

    SemanticActionType(int i) {
        this.value = i;
    }

    public static r0z getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: renamed from: getValue$kotlin_release, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
