package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eg11 extends t380 {
    public final transient j380 d;
    public final transient fg11 e;

    public eg11(j380 j380Var, fg11 fg11Var) {
        this.d = j380Var;
        this.e = fg11Var;
    }

    public final b380 b() {
        return this.e;
    }

    public final int c(int i, Object[] objArr) {
        return this.e.c(i, objArr);
    }

    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    public final boolean i() {
        return true;
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final mjh1 iterator() {
        return this.e.r(0);
    }

    public final int size() {
        return this.d.size();
    }

    public Object writeReplace() {
        return super.writeReplace();
    }
}
