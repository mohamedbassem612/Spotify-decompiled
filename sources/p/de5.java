package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class de5 {
    public final tzg1 a;
    public final Object b;
    public final long c;
    public final Function0 d;
    public final hrr0 e;
    public oe5 f;
    public long g;
    public long h = Long.MIN_VALUE;
    public final hrr0 i = xto.t(Boolean.TRUE);

    public de5(Object obj, tzg1 tzg1Var, oe5 oe5Var, long j, Object obj2, long j2, Function0 function0) {
        this.a = tzg1Var;
        this.b = obj2;
        this.c = j2;
        this.d = function0;
        this.e = xto.t(obj);
        this.f = rrn1.y(oe5Var);
        this.g = j;
    }

    public final void a() {
        this.i.setValue(Boolean.FALSE);
        this.d.invoke();
    }

    public final Object b() {
        return this.a.b.invoke(this.f);
    }
}
