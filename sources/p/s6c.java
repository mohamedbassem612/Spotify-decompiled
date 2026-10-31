package p;

import com.spotify.browse.clientnative.mobius.BrowseState;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class s6c {
    public static final void a(BrowseState.Content content, p1d0 p1d0Var, rnc0 rnc0Var, xpw xpwVar, g9c g9cVar, qim0 qim0Var, int i, b0k b0kVar, int i2) {
        BrowseState.Content content2;
        b0k b0kVar2;
        Object p6cVar;
        int i3;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(154197758);
        int i4 = i2 | (b0kVar3.i(content) ? 4 : 2) | (b0kVar3.i(p1d0Var) ? 32 : 16) | (b0kVar3.i(rnc0Var) ? 256 : 128) | (b0kVar3.i(xpwVar) ? 2048 : 1024) | (b0kVar3.i(g9cVar) ? 16384 : 8192) | (b0kVar3.i(qim0Var) ? 131072 : 65536) | (b0kVar3.e(i) ? 1048576 : 524288);
        if (b0kVar3.Y(i4 & 1, (599187 & i4) != 599186)) {
            wat watVar = (wat) b0kVar3.k(t4k.h);
            u85 u85Var = (erl1) b0kVar3.k(szf0.b);
            if (u85Var == null) {
                b0kVar3.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(b0kVar3).g;
            } else {
                b0kVar3.i0(-241885792);
            }
            b0kVar3.r(false);
            int iD = u85Var.d(watVar);
            iac0 iac0Var = (iac0) b0kVar3.k(jfe0.a);
            boolean zE = ((i4 & 57344) == 16384 || b0kVar3.i(g9cVar)) | b0kVar3.e(iD) | b0kVar3.i(content) | b0kVar3.i(p1d0Var) | b0kVar3.i(xpwVar) | b0kVar3.i(iac0Var) | ((i4 & 3670016) == 1048576);
            Object objT = b0kVar3.T();
            if (zE || objT == m4cVar) {
                i3 = iD;
                p6cVar = new p6c(i3, content, p1d0Var, xpwVar, g9cVar, iac0Var, i);
                content2 = content;
                b0kVar3.s0(p6cVar);
            } else {
                p6cVar = objT;
                content2 = content;
                i3 = iD;
            }
            iu30 iu30Var = (iu30) p6cVar;
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            WeakHashMap weakHashMap2 = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(b0kVar3).f, 16, qim0VarD);
            boolean zE2 = b0kVar3.e(i3) | b0kVar3.i(rnc0Var) | b0kVar3.i(content2);
            Object objT2 = b0kVar3.T();
            if (zE2 || objT2 == m4cVar) {
                objT2 = new q6c(i3, rnc0Var, content2);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            dm5.a(iu30Var, qim0VarP, (iu30) objT2, b0kVar2, 0, 0);
        } else {
            content2 = content;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new r6c(content2, p1d0Var, rnc0Var, xpwVar, g9cVar, qim0Var, i, i2);
        }
    }
}
