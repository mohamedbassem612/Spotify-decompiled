package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sza1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s24 b;
    public final /* synthetic */ wat c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sza1(s24 s24Var, wat watVar, byte b) {
        super(1);
        this.a = b;
        this.b = s24Var;
        this.c = watVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wat watVar = this.c;
        s24 s24Var = this.b;
        switch (b) {
            case 0:
                ((hrr0) s24Var.t).setValue(new p3v(watVar.M0((int) (((elb0) obj).b() >> 32))));
                break;
            case 1:
                ((hrr0) s24Var.Y).setValue(new p3v(watVar.M0((int) (((elb0) obj).b() & 4294967295L))));
                break;
            default:
                ((hrr0) s24Var.Z).setValue(new p3v(watVar.M0((int) (((elb0) obj).b() & 4294967295L))));
                break;
        }
        return rih1Var;
    }
}
