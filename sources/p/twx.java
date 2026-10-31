package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class twx extends hab0 implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twx(iu30 iu30Var, ven0 ven0Var, boolean z) {
        super(1);
        this.a = z;
        this.b = iu30Var;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        if (this.a || guo1.C(this.c)) {
            this.b.invoke(Float.valueOf(fFloatValue));
        }
        return rih1.a;
    }
}
