package p;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sri1 {
    public final Collection a;
    public final Collection b;
    public final Collection c;
    public final Map d;

    public sri1(ConcurrentLinkedQueue concurrentLinkedQueue, ConcurrentLinkedQueue concurrentLinkedQueue2, ConcurrentLinkedQueue concurrentLinkedQueue3, ConcurrentHashMap concurrentHashMap) {
        this.a = concurrentLinkedQueue;
        this.b = concurrentLinkedQueue2;
        this.c = concurrentLinkedQueue3;
        this.d = concurrentHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sri1)) {
            return false;
        }
        sri1 sri1Var = (sri1) obj;
        return this.a.equals(sri1Var.a) && this.b.equals(sri1Var.b) && this.c.equals(sri1Var.c) && this.d.equals(sri1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
