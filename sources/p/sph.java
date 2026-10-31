package p;

import com.spotify.podcastinteractivity.commentssheetimpl.page.LaunchActionParams;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sph implements hyf0 {
    public final /* synthetic */ uph a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ lik1 d;

    public sph(uph uphVar, String str, String str2, lik1 lik1Var) {
        this.a = uphVar;
        this.b = str;
        this.c = str2;
        this.d = lik1Var;
    }

    public final Object a(lnm lnmVar) {
        lph lphVar = (tmh) this.a.b;
        th30 th30Var = lphVar.b;
        boolean zC = lphVar.f.c();
        String str = this.b;
        String str2 = this.c;
        lik1 lik1Var = this.d;
        if (zC) {
            lph.c(lphVar, lik1Var, str, false, false, new LaunchActionParams.ShowSingleCommentThread(str2), (tv80) null, 44);
        } else {
            kph kphVarG = th30Var.G("comments-sheet-fragment");
            kph kphVar = kphVarG instanceof kph ? kphVarG : null;
            if (kphVar == null || !kphVar.i1().equals(str)) {
                if (kphVar != null) {
                    kphVar.dismiss();
                }
                kph kphVarA = lphVar.c.a();
                kphVarA.f2 = str;
                kphVarA.g2 = lik1Var;
                kphVarA.i2 = new hjb0(str2);
                if (!kphVarA.q0()) {
                    kphVarA.g1(th30Var, "comments-sheet-fragment");
                }
            } else {
                kphVar.f2 = str;
                kphVar.g2 = lik1Var;
                kphVar.i2 = new hjb0(str2);
                if (!kphVar.q0()) {
                    kphVar.g1(th30Var, "comments-sheet-fragment");
                }
            }
        }
        return rih1.a;
    }
}
