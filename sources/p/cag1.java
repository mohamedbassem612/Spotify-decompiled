package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cag1 extends hab0 implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cag1(boolean z, int i, long j, ven0 ven0Var) {
        super(1);
        this.a = z;
        this.b = i;
        this.c = j;
        this.d = ven0Var;
    }

    public final Object invoke(Object obj) {
        lsl lslVar = (lsl) obj;
        lslVar.s1();
        if (!this.a) {
            nb51.v(lslVar, (y9e1) this.d.getValue(), this.b, this.c);
        }
        return rih1.a;
    }
}
