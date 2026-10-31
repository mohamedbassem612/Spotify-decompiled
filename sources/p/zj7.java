package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zj7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vex b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zj7(vex vexVar, byte b) {
        super(2);
        this.a = b;
        this.b = vexVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        vex vexVar = this.b;
        switch (b) {
            case 0:
                return new u7h(vexVar.j);
            default:
                return new u7h(vexVar.m);
        }
    }
}
