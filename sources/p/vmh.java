package p;

import com.spotify.podcastinteractivity.commentssheetimpl.page.CommentsSheetPageParameters;
import com.spotify.podcastinteractivity.commentssheetimpl.page.LaunchActionParams;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vmh extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xmh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vmh(xmh xmhVar, byte b) {
        super(1);
        this.a = b;
        this.b = xmhVar;
    }

    public final Object invoke(Object obj) {
        rph rphVar;
        byte b = this.a;
        xmh xmhVar = this.b;
        switch (b) {
            case 0:
                umh umhVar = (umh) obj;
                CommentsSheetPageParameters commentsSheetPageParameters = new CommentsSheetPageParameters(xmhVar.Z.a, xmhVar.Y, umhVar.a, xmhVar.N0, null, 16, null);
                bqh bqhVar = (bqh) ((wph) ((em0) xmhVar.f.a.c).b).z.get();
                c8o.l(bqhVar);
                boolean z = umhVar.c;
                if (z) {
                    rph rphVarB = bqhVar.b(commentsSheetPageParameters.getEntityUri());
                    if (rphVarB != null) {
                        rphVar = rph.a(rphVarB, null, null, null, null, null, null, null, null, false, null, null, null, rphVarB.n || commentsSheetPageParameters.getShowSensitiveComments(), null, null, null, null, false, 516095);
                    } else {
                        String entityUri = commentsSheetPageParameters.getEntityUri();
                        LaunchActionParams launchAction = commentsSheetPageParameters.getLaunchAction();
                        rphVar = new rph(entityUri, launchAction != null ? launchAction.toDomainLaunchAction() : null, commentsSheetPageParameters.getShowSensitiveComments());
                    }
                } else {
                    bqhVar.a();
                    String entityUri2 = commentsSheetPageParameters.getEntityUri();
                    LaunchActionParams launchAction2 = commentsSheetPageParameters.getLaunchAction();
                    rphVar = new rph(entityUri2, launchAction2 != null ? launchAction2.toDomainLaunchAction() : null, commentsSheetPageParameters.getShowSensitiveComments());
                }
                rph rphVar2 = rphVar;
                String str = (String) xmhVar.g.f.get(xmhVar.Y);
                if (str == null) {
                    str = "";
                }
                return rph.a(rphVar2, null, null, null, null, null, z ? rphVar2.g : umhVar.b, null, str, false, null, null, null, false, null, null, null, null, false, 523967);
            default:
                cas casVar = (a7m0) obj;
                casVar.a = rng.b1;
                casVar.b = xmhVar.P0.x(xmhVar.Y);
                return rih1.a;
        }
    }
}
