package p;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p6r0 implements n6r0, Serializable, Comparable {
    public static final AtomicReferenceArray e = new AtomicReferenceArray(2279);
    public final String a;
    public final short b;
    public final String c;
    public final String d;

    /* JADX WARN: Multi-variable type inference failed */
    public p6r0(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    private final Object readResolve() {
        return yon1.M5(this.a);
    }

    @Override // p.n6r0
    public final String a() {
        return this.d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return u890.q(this.b, ((p6r0) obj).b);
    }

    @Override // p.n6r0
    public final String path() {
        return this.c;
    }

    public final String toString() {
        return f4i1.f("{pageIdentifier='", this.c, "'}");
    }
}
