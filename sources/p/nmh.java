package p;

import com.spotify.userinteractivityservice.usercomments.v1.proto.GetReactionsCountResponse;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ListReactionsResponse;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ReactionCount;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ReactionListDisplay;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ReactionShowAuthorMetadata;
import com.spotify.userinteractivityservice.usercomments.v1.proto.ReactionUserAuthorMetadata;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nmh implements sxz0 {
    public final tjh a;
    public final boolean b;
    public final c9 c;

    public nmh(tjh tjhVar, by4 by4Var) {
        this.a = tjhVar;
        this.b = by4Var.a();
        mmv0.a.getClass();
        this.c = lmv0.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.sxz0
    public final Object a(frd1 frd1Var, String str, String str2, onm onmVar) {
        lmh lmhVar;
        lfi1 lfi1Var;
        if (onmVar instanceof lmh) {
            lmhVar = (lmh) onmVar;
            int i = lmhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lmhVar.c = i - Integer.MIN_VALUE;
            } else {
                lmhVar = new lmh(this, onmVar);
            }
        } else {
            lmhVar = new lmh(this, onmVar);
        }
        Object objJ = lmhVar.a;
        int i2 = lmhVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleR = this.a.c.r(frd1Var.b(), str, str2);
            lmhVar.c = 1;
            objJ = fc11.j(singleR, lmhVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        ListReactionsResponse listReactionsResponse = (ListReactionsResponse) objJ;
        h290<ReactionListDisplay> h290VarN = listReactionsResponse.n();
        ArrayList arrayList = new ArrayList();
        for (ReactionListDisplay reactionListDisplay : h290VarN) {
            if (reactionListDisplay.t()) {
                ReactionUserAuthorMetadata reactionUserAuthorMetadataR = reactionListDisplay.r();
                lfi1Var = new lfi1(new ifi1(reactionUserAuthorMetadataR.p(), reactionUserAuthorMetadataR.getUsername(), reactionUserAuthorMetadataR.o()), reactionListDisplay.p(), reactionListDisplay.o());
            } else if (reactionListDisplay.s()) {
                ReactionShowAuthorMetadata reactionShowAuthorMetadataQ = reactionListDisplay.q();
                lfi1Var = new lfi1(new hfi1(reactionShowAuthorMetadataQ.p(), reactionShowAuthorMetadataQ.q(), reactionShowAuthorMetadataQ.o()), reactionListDisplay.p(), reactionListDisplay.o());
            } else {
                lfi1Var = null;
            }
            if (lfi1Var != null) {
                arrayList.add(lfi1Var);
            }
        }
        return new blr0(arrayList, listReactionsResponse.getNextPageToken());
    }

    @Override // p.sxz0
    public final Object b(frd1 frd1Var, String str, a8d1 a8d1Var) {
        String strA = frd1Var.a();
        String strB = frd1Var.b();
        tjh tjhVar = this.a;
        Object objI = fc11.i(tjhVar.c.h(strB, str).g(new lig(tjhVar, strB, str, strA, (byte) 1)), a8d1Var);
        return objI == d9n.a ? objI : rih1.a;
    }

    @Override // p.sxz0
    public final boolean c() {
        return this.b;
    }

    @Override // p.sxz0
    public final Object d(frd1 frd1Var, lnm lnmVar) {
        String strA = frd1Var.a();
        String strB = frd1Var.b();
        tjh tjhVar = this.a;
        Object objI = fc11.i(tjhVar.c.y(strB).g(new sjh(tjhVar, strB, strA)), lnmVar);
        return objI == d9n.a ? objI : rih1.a;
    }

    @Override // p.sxz0
    public final List e() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.sxz0
    public final Serializable f(frd1 frd1Var, onm onmVar) {
        mmh mmhVar;
        if (onmVar instanceof mmh) {
            mmhVar = (mmh) onmVar;
            int i = mmhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mmhVar.c = i - Integer.MIN_VALUE;
            } else {
                mmhVar = new mmh(this, onmVar);
            }
        } else {
            mmhVar = new mmh(this, onmVar);
        }
        Object objJ = mmhVar.a;
        int i2 = mmhVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleQ = this.a.c.q(frd1Var.b());
            mmhVar.c = 1;
            objJ = fc11.j(singleQ, mmhVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        h290<ReactionCount> h290VarN = ((GetReactionsCountResponse) objJ).n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (ReactionCount reactionCount : h290VarN) {
            arrayList.add(new pxz0(reactionCount.o(), reactionCount.n()));
        }
        return arrayList;
    }

    @Override // p.sxz0
    public final v060 g(frd1 frd1Var, a601 a601Var) {
        return null;
    }

    @Override // p.sxz0
    public final boolean h(frd1 frd1Var) {
        y6b1 m231Var;
        y6b1 m231Var2;
        try {
            m231Var = new y6b1(frd1Var.b(), false);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        y6b1 y6b1Var = m231Var;
        if ((y6b1Var != null ? y6b1Var.c : null) != v6b1.p3) {
            return false;
        }
        try {
            m231Var2 = new y6b1(frd1Var.a(), false);
        } catch (Throwable th2) {
            m231Var2 = new m231(th2);
        }
        if (m231Var2 instanceof m231) {
            m231Var2 = null;
        }
        y6b1 y6b1Var2 = m231Var2;
        return (y6b1Var2 != null ? y6b1Var2.c : null) == v6b1.I1;
    }
}
