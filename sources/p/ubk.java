package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ubk implements wgy {
    @Override // p.wgy
    public final String a(ttm1 ttm1Var) {
        bbk bbkVar;
        aey aeyVar = ttm1Var.e;
        aey aeyVar2 = aey.Z;
        if (aeyVar2 != aeyVar) {
            n57.e("This decorator is meant to be used with " + aeyVar2 + " entities, and was used with " + aeyVar + ", this should not happen");
            return null;
        }
        if (u890.j(ttm1.i.get(aeyVar), bbk.class)) {
            nb10 nb10Var = ttm1Var.g;
            if (nb10Var == null) {
                bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.ConcertCampaignExtraInfo");
                return null;
            }
            bbkVar = (bbk) nb10Var;
        } else {
            bbkVar = null;
        }
        if (bbkVar != null) {
            switch (l1d.C(bbkVar.a)) {
                case 0:
                case 5:
                    break;
                case 1:
                    return "reserved";
                case 2:
                    return "fcfs";
                case 3:
                    return "waitlisted";
                case 4:
                    return "purchased";
                case 6:
                    return "sold_out";
                case 7:
                    return "cancelled";
                case 8:
                    return "sale_ended";
                default:
                    eg.o();
                    return null;
            }
        }
        return null;
    }
}
