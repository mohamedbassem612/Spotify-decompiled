package p;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ba80 implements Iterable, ola0 {
    public final Function0 a;

    public ba80(Function0 function0) {
        this.a = function0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ca80((Iterator) this.a.invoke(), (byte) 0);
    }
}
