package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cb80 implements tob1 {
    public Number a;
    public Number b;
    public final tzg1 c;
    public final hrr0 d;
    public hrd1 e;
    public boolean f;
    public boolean g;
    public long h;
    public final /* synthetic */ db80 i;

    public cb80(db80 db80Var, Number number, Number number2, tzg1 tzg1Var, bb80 bb80Var) {
        this.i = db80Var;
        this.a = number;
        this.b = number2;
        this.c = tzg1Var;
        this.d = v8r.q(number);
        this.e = new hrd1(bb80Var, tzg1Var, this.a, this.b, (oe5) null);
    }

    public final Object getValue() {
        return this.d.getValue();
    }
}
