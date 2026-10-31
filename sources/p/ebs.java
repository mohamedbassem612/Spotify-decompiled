package p;

import spotify.your_library.esperanto.proto.YourLibraryDecorateRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ebs extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uwl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ebs(uwl uwlVar, byte b) {
        super(1);
        this.a = b;
        this.b = uwlVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        uwl uwlVar = this.b;
        switch (b) {
            case 0:
                vwm1 vwm1Var = (vwm1) uwlVar.Z;
                zsm1 zsm1VarP = YourLibraryDecorateRequest.p();
                zsm1VarP.n(((yom0) obj).a);
                dbs dbsVar = new dbs(vwm1Var.e(zsm1VarP.build()), (byte) 0);
                bpb1 bpb1Var = (bpb1) uwlVar.O0;
                return h5p1.s(dbsVar, bpb1Var, hu20.e(bpb1Var, new b7c((lnm) null, uwlVar, (byte) 27)), new vd2(4, lnmVar, (byte) 13));
            default:
                ((qtr) obj).b(new u08(uwlVar, lnmVar, (byte) 5));
                return rih1.a;
        }
    }
}
