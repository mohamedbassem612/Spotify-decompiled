package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dqt extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ldo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dqt(ldo ldoVar, byte b) {
        super(1);
        this.a = b;
        this.b = ldoVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ldo ldoVar = this.b;
        switch (b) {
            case 0:
                aqt aqtVar = (aqt) obj;
                eqr eqrVar = (eqr) ((ynb0) ldoVar.d).get();
                ypt yptVar = aqtVar.a;
                gpt gptVar = new gpt(yptVar.a, yptVar.f ? 1 : 2);
                List<lhm> listA1 = o7h.a1((Iterable) eqrVar.a.get(), new xvd(eqrVar, (byte) 8));
                ArrayList arrayList = new ArrayList(q7h.U(listA1, 10));
                for (lhm lhmVar : listA1) {
                    arrayList.add(new qer(lhmVar.a(gptVar), lhmVar, (byte) 10));
                }
                return new pzs(new wa3((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 6), aqtVar, (byte) 2);
            default:
                ((qtr) obj).b(new kr(ldoVar, (lnm) null, (byte) 12));
                return rih1.a;
        }
    }
}
