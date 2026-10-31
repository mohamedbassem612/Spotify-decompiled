package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.voting.proto.v1.GetVotingRootResponse;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gvk1 {
    public final jxk1 a;

    public gvk1(jxk1 jxk1Var) {
        this.a = jxk1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(String str, String str2, onm onmVar) {
        evk1 evk1Var;
        String str3;
        String str4 = str;
        if (onmVar instanceof evk1) {
            evk1Var = (evk1) onmVar;
            int i = evk1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                evk1Var.e = i - Integer.MIN_VALUE;
            } else {
                evk1Var = new evk1(this, onmVar);
            }
        } else {
            evk1Var = new evk1(this, onmVar);
        }
        Object obj = evk1Var.c;
        int i2 = evk1Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            evk1Var.a = str4;
            evk1Var.b = str2;
            evk1Var.e = 1;
            Object objC = this.a.c(str4, evk1Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
            str3 = str2;
            obj = objC;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str5 = evk1Var.b;
            str4 = evk1Var.a;
            hm5.M(obj);
            str3 = str5;
        }
        GetVotingRootResponse getVotingRootResponse = (GetVotingRootResponse) obj;
        if (getVotingRootResponse.r() == lyk1.VOTING_STATE_TYPE_RESULTS) {
            if (!ihc1.y0(getVotingRootResponse.p())) {
                return new awk1(getVotingRootResponse.p());
            }
            Logger.d("VotingRoot: Results state without redirect_uri for %s", new Object[]{str4});
            return zvk1.a;
        }
        Set set = s4b1.f;
        String strJ = uic.x(str3).j();
        if (strJ == null) {
            strJ = "";
        }
        s4b1 s4b1VarX = uic.x(str4);
        String strO = s4b1VarX.o(2);
        String str6 = strO == null ? "" : strO;
        String strO2 = s4b1VarX.o(3);
        String str7 = strO2 == null ? "" : strO2;
        String title = getVotingRootResponse.getTitle();
        int iV = getVotingRootResponse.q().v();
        GetVotingRootResponse.VotingSection votingSectionQ = getVotingRootResponse.q();
        i260 i260Var = new i260(votingSectionQ.getTitle(), votingSectionQ.getSubtitle(), votingSectionQ.q(), mqo1.A(votingSectionQ.w()), votingSectionQ.u(), votingSectionQ.t(), mqo1.A(votingSectionQ.r()), votingSectionQ.o(), votingSectionQ.n());
        h290<GetVotingRootResponse.Nominee> h290VarS = getVotingRootResponse.q().s();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarS, 10));
        for (GetVotingRootResponse.Nominee nominee : h290VarS) {
            arrayList.add(new wdo0(0, nominee.o(), nominee.n(), nominee.getTitle(), nominee.getSubtitle()));
        }
        GetVotingRootResponse.BottomSheet bottomSheetN = getVotingRootResponse.n();
        lvb lvbVar = new lvb(bottomSheetN.u(), bottomSheetN.o(), bottomSheetN.q(), bottomSheetN.p(), bottomSheetN.s(), bottomSheetN.n(), bottomSheetN.t());
        GetVotingRootResponse.ErrorMessage errorMessageO = getVotingRootResponse.o();
        return new bwk1(new fwk1(strJ, str3, title, iV, i260Var, arrayList, lvbVar, new xhz(errorMessageO.getTitle(), errorMessageO.getSubtitle(), errorMessageO.o(), errorMessageO.p(), false), false, str6, str7));
    }
}
