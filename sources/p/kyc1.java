package p;

import android.os.Build;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kyc1 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ SceneTemplate.SummaryShare c;
    public final /* synthetic */ bju d;
    public final /* synthetic */ gw70 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyc1(SceneTemplate.SummaryShare summaryShare, bju bjuVar, gw70 gw70Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = summaryShare;
        this.d = bjuVar;
        this.e = gw70Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        kyc1 kyc1Var = new kyc1(this.c, this.d, this.e, lnmVar);
        kyc1Var.b = obj;
        return kyc1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        c9n c9nVar = (c9n) this.b;
        boolean z = this.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        boolean z2 = Build.VERSION.SDK_INT < 29;
        SceneTemplate.SummaryShare summaryShare = this.c;
        h290 h290VarO = summaryShare.o();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : h290VarO) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            SceneTemplate.SummaryShare.Card card = (SceneTemplate.SummaryShare.Card) obj2;
            if (!card.B()) {
                card = null;
            }
            aa80 aa80Var = card != null ? new aa80(i, card.p().getUrl()) : null;
            if (aa80Var != null) {
                arrayList.add(aa80Var);
            }
            i = i2;
        }
        HashSet hashSet = new HashSet();
        ArrayList<aa80> arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (hashSet.add((String) ((aa80) obj3).b)) {
                arrayList2.add(obj3);
            }
        }
        int iS = zno1.s(q7h.U(arrayList2, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (aa80 aa80Var2 : arrayList2) {
            int i3 = aa80Var2.a;
            String str = (String) aa80Var2.b;
            linkedHashMap.put(str, fn31.q(c9nVar, (o8n) null, 0, new bp70(this.d, i3, str, this.e, z2, (lnm) null), 3));
        }
        bj81 bj81Var = new bj81(summaryShare.o(), (lnm) null, this.e, this.d, linkedHashMap);
        this.b = null;
        this.a = true;
        Object objS = smo1.s(bj81Var, this);
        d9n d9nVar = d9n.a;
        return objS == d9nVar ? d9nVar : objS;
    }
}
