package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zlr extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bmr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zlr(bmr bmrVar, byte b) {
        super(1);
        this.a = b;
        this.b = bmrVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bmr bmrVar = this.b;
        switch (b) {
            case 0:
                mxr mxrVar = bmrVar.a;
                osf osfVar = ((psf) obj).a;
                if (osfVar instanceof lsf) {
                    return new huz(rba0.a, (byte) 10);
                }
                if (osfVar instanceof msf) {
                    msf msfVar = (msf) osfVar;
                    return mxrVar.H(msfVar.a, msfVar.b);
                }
                if (osfVar instanceof nsf) {
                    return rqt0.u(new qer(((c9c0) mxrVar.a).b.current(), ((nsf) osfVar).a, (byte) 21));
                }
                eg.o();
                return null;
            default:
                ((qtr) obj).b(new gz0(bmrVar, (lnm) null, (byte) 8));
                return rih1.a;
        }
    }
}
