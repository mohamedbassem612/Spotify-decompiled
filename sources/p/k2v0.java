package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k2v0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l2v0 b;
    public final /* synthetic */ ohd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2v0(l2v0 l2v0Var, ohd ohdVar, byte b) {
        super(0);
        this.a = b;
        this.b = l2v0Var;
        this.c = ohdVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ohd ohdVar = this.c;
        l2v0 l2v0Var = this.b;
        switch (b) {
            case 0:
                ((z5h1) l2v0Var.f).a(dx7.b);
                ohdVar.resumeWith(Boolean.FALSE);
                break;
            case 1:
                ((b2v0) l2v0Var.g).e();
                ((z5h1) l2v0Var.f).a(ex7.b);
                ohdVar.resumeWith(Boolean.TRUE);
                break;
            default:
                ((b2v0) l2v0Var.g).e();
                String strT = pro1.t("videoPodcastsDownloadAudioOnly");
                ((z5h1) l2v0Var.f).a(new fx7(strT));
                ((lzn0) l2v0Var.e).h(strT);
                ohdVar.resumeWith(Boolean.FALSE);
                break;
        }
        return rih1Var;
    }
}
