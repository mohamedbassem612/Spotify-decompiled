package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class etw extends hab0 implements iu30 {
    public final /* synthetic */ q811 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etw(q811 q811Var, String str, String str2, int i) {
        super(1);
        this.a = q811Var;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final Object invoke(Object obj) {
        return new sg(this.a, this.b, this.c, this.d);
    }
}
