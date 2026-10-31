package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oto extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pto b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oto(pto ptoVar, byte b) {
        super(1);
        this.a = b;
        this.b = ptoVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pto ptoVar = this.b;
        switch (b) {
            case 0:
                ax50 ax50Var = new ax50(ptoVar.a.getResources().getDimensionPixelSize(2131165904));
                nto ntoVar = new nto(ptoVar, (byte) 0);
                nto ntoVar2 = new nto(ptoVar, (byte) 1);
                nto ntoVar3 = new nto(ptoVar, (byte) 2);
                boolean z = ptoVar.s;
                return new fx50(new yw50(ax50Var, ntoVar, ntoVar2, ntoVar3, z ? null : new nto(ptoVar, (byte) 3), (vu30) null, 32), new dx50(new ey50(true, new nto(ptoVar, (byte) 4)), (jjk) null), z ? new nto(ptoVar, (byte) 5) : null);
            default:
                return ggo1.B(ptoVar.o, ptoVar.f53p, false, ptoVar.t, 4);
        }
    }
}
