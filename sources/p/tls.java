package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tls implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ ams c;
    public final /* synthetic */ String d;

    public /* synthetic */ tls(vr20 vr20Var, ams amsVar, String str, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = amsVar;
        this.d = str;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    public final Object emit(Object obj, lnm lnmVar) {
        sls slsVar;
        nls nlsVar;
        vls vlsVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ams amsVar = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        nls nlsVar2 = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof sls) {
                    slsVar = (sls) lnmVar;
                    int i = slsVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        slsVar.b = i - Integer.MIN_VALUE;
                    } else {
                        slsVar = new sls(this, lnmVar);
                    }
                } else {
                    slsVar = new sls(this, lnmVar);
                }
                Object obj2 = slsVar.a;
                int i2 = slsVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                i1r i1rVar = (k1r) obj;
                if (i1rVar instanceof i1r) {
                    nlsVar2 = (nls) i1rVar.a;
                } else if (i1rVar instanceof h1r) {
                    zwm1 zwm1Var = amsVar.c;
                    String str = this.d;
                    if (u890.j(str, "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ")) {
                        nlsVar = new nls(zwm1Var.c(), "https://misc.scdn.co/liked-songs/liked-songs-300.png");
                    } else {
                        nlsVar = xrm1.a(str) ? new nls(zwm1Var.h(), "https://misc.spotifycdn.com/your-episodes/SE-300.png") : new nls("", null);
                    }
                    nlsVar2 = nlsVar;
                }
                if (nlsVar2 == null) {
                    return rih1Var;
                }
                slsVar.b = 1;
                return vr20Var.emit(nlsVar2, slsVar) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof vls) {
                    vlsVar = (vls) lnmVar;
                    int i3 = vlsVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        vlsVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        vlsVar = new vls(this, lnmVar);
                    }
                } else {
                    vlsVar = new vls(this, lnmVar);
                }
                Object obj3 = vlsVar.a;
                int i4 = vlsVar.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    jls jlsVar = new jls(amsVar.c.i(), ((Boolean) obj).booleanValue(), this.d, null, fls.a);
                    vlsVar.b = 1;
                    return vr20Var.emit(jlsVar, vlsVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
