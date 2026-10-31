package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nqn0 implements wqn0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public nqn0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = yon1.O1().c;
    }

    @Override // p.wqn0
    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqn0)) {
            return false;
        }
        nqn0 nqn0Var = (nqn0) obj;
        return u890.j(this.a, nqn0Var.a) && u890.j(this.b, nqn0Var.b) && u890.j(this.c, nqn0Var.c);
    }

    @Override // p.wqn0
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
