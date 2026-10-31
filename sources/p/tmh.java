package p;

import com.spotify.podcastinteractivity.commentssheetimpl.page.LaunchActionParams;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public interface tmh {
    static void a(tmh tmhVar, String str, lik1 lik1Var, boolean z, boolean z2, int i) {
        boolean z3 = (i & 4) != 0 ? false : z;
        boolean z4 = (i & 8) != 0 ? false : z2;
        lph lphVar = (lph) tmhVar;
        th30 th30Var = lphVar.b;
        if (lphVar.f.c()) {
            lph.c(lphVar, lik1Var, str, z4, z3, (LaunchActionParams) null, (tv80) null, 48);
            return;
        }
        kph kphVarG = th30Var.G("comments-sheet-fragment");
        kph kphVar = kphVarG instanceof kph ? kphVarG : null;
        if (kphVar != null && kphVar.i1().equals(str)) {
            kphVar.k2.onNext(rih1.a);
            lphVar.b(str, kphVar);
            return;
        }
        if (kphVar != null) {
            kphVar.dismiss();
        }
        kph kphVarA = lphVar.c.a();
        kphVarA.f2 = str;
        kphVarA.g2 = lik1Var;
        kphVarA.j2 = z3;
        kphVarA.h2 = z4;
        if (!kphVarA.q0()) {
            kphVarA.g1(th30Var, "comments-sheet-fragment");
        }
        lphVar.b(str, kphVarA);
    }
}
