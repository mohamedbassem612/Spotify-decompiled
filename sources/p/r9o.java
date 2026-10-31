package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r9o extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ihl b;
    public final /* synthetic */ ihl c;
    public final /* synthetic */ ihl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r9o(ihl ihlVar, ihl ihlVar2, ihl ihlVar3, byte b) {
        super(1);
        this.a = b;
        this.b = ihlVar;
        this.c = ihlVar2;
        this.d = ihlVar3;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ihl ihlVar = this.d;
        ihl ihlVar2 = this.c;
        ihl ihlVar3 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                dhl dhlVar = (dhl) obj;
                yf.p(dhlVar.e, ihlVar3.g, 0.0f, 6);
                yf.p(dhlVar.g, dhlVar.c.g, 0.0f, 6);
                xid.r(dhlVar.d, ihlVar2.f, 0.0f, 6);
                xid.r(dhlVar.f, ihlVar.d, 0.0f, 6);
                dhlVar.g(new e5u((p3v) null, "spread"));
                break;
            default:
                dhl dhlVar2 = (dhl) obj;
                xid.r(dhlVar2.d, ihlVar3.f, 0.0f, 6);
                xid.r(dhlVar2.f, ihlVar2.d, 0.0f, 6);
                yf.p(dhlVar2.e, ihlVar.g, 0.0f, 6);
                yf.p(dhlVar2.g, dhlVar2.c.g, 0.0f, 6);
                dhlVar2.g(new e5u((p3v) null, "spread"));
                break;
        }
        return rih1Var;
    }
}
