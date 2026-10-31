package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jqn0 implements wqn0 {
    public final String a;
    public final String b;

    public jqn0(String str) {
        this.a = str;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = yon1.G1("PODCAST", "podcast", 1477, "podcast").c;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jqn0) && u890.j(this.a, ((jqn0) obj).a);
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
