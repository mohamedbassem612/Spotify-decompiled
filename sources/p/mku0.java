package p;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mku0 implements y371 {
    public final gqg a;
    public final aru0 b;

    public mku0(gqg gqgVar, aru0 aru0Var) {
        this.a = gqgVar;
        this.b = aru0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p.y371
    public final Object a(ywy ywyVar, o571 o571Var, List list, Uri uri, lnm lnmVar) {
        lku0 lku0Var;
        if (lnmVar instanceof lku0) {
            lku0Var = (lku0) lnmVar;
            int i = lku0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                lku0Var.g = i - Integer.MIN_VALUE;
            } else {
                lku0Var = new lku0(this, (onm) lnmVar);
            }
        } else {
            lku0Var = new lku0(this, (onm) lnmVar);
        }
        lku0 lku0Var2 = lku0Var;
        Object objQ = lku0Var2.e;
        int i2 = lku0Var2.g;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objQ);
            wa71 wa71Var = ywyVar.a().a.a;
            cuu0 cuu0Var = ywyVar instanceof wwy ? ((wwy) ywyVar).e : ((exy) ywyVar.a().b()).g;
            if (cuu0Var == null) {
                hhg1.n("playlistSharingConfiguration is required when providing share data for a playlist");
                return null;
            }
            lku0Var2.a = ywyVar;
            lku0Var2.b = o571Var;
            lku0Var2.c = list;
            lku0Var2.d = uri;
            lku0Var2.g = 1;
            objQ = this.b.q(wa71Var, cuu0Var, lku0Var2);
            if (objQ != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list2 = lku0Var2.c;
            hm5.M(objQ);
            return objQ;
        }
        uri = lku0Var2.d;
        list = lku0Var2.c;
        o571Var = lku0Var2.b;
        ywyVar = lku0Var2.a;
        hm5.M(objQ);
        Uri uri2 = uri;
        wa71 wa71Var2 = (wa71) objQ;
        wwy wwyVar = ywyVar instanceof wwy ? (wwy) ywyVar : null;
        vmt vmtVarA = this.a.a(o571Var, list, new dmt(3));
        llw0 llw0Var = wwyVar != null ? wwyVar.f : null;
        jlw0 jlw0VarH = wwyVar != null ? wwyVar.h() : null;
        lku0Var2.a = null;
        lku0Var2.b = null;
        lku0Var2.c = null;
        lku0Var2.d = null;
        lku0Var2.g = 2;
        Object objA = vmtVarA.a(wa71Var2, llw0Var, jlw0VarH, uri2, lku0Var2);
        return objA == d9nVar ? d9nVar : objA;
    }
}
