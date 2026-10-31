package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ugd0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s880 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ugd0(s880 s880Var, byte b) {
        super(1);
        this.a = b;
        this.b = s880Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        s880 s880Var = this.b;
        switch (b) {
            case 0:
                if (((String) obj).equals("1")) {
                    return ((hgd0) s880Var.b).r() ? ((ov20) s880Var.d).a("view-listening-activity", true) : new huz(Boolean.TRUE, (byte) 10);
                }
                return new huz(Boolean.FALSE, (byte) 10);
            default:
                return new vm61(2131957398, 2131957397, 2131957399, new vv70(s880Var, (lnm) null, (byte) 13), new um61(new sl11(9, (byte) 7), new n601(ecd0.V0, (byte) 28), fft0.Z0));
        }
    }
}
