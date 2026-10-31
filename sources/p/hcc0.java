package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hcc0 implements jvd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x9a b;

    public /* synthetic */ hcc0(x9a x9aVar, byte b) {
        this.a = b;
        this.b = x9aVar;
    }

    public final Observable g(List list, String str, mvd mvdVar) {
        byte b = this.a;
        x9a x9aVar = this.b;
        switch (b) {
            case 0:
                ejr0 ejr0Var = (ejr0) mvdVar;
                icc0 icc0Var = (icc0) x9aVar;
                return icc0Var.l(ejr0Var.b, icc0Var.g.c).map(new x390(ejr0Var, icc0Var, (byte) 25)).onErrorReturn(new hl00(ejr0Var, (byte) 26));
            default:
                ejr0 ejr0Var2 = (ejr0) mvdVar;
                hmm0 hmm0Var = (hmm0) x9aVar;
                return rqt0.F(o6x.a, new jme1(hmm0Var, ejr0Var2.b, hmm0Var.d.c, (lnm) null)).flatMap(new a1g1(hmm0Var, (byte) 15)).map((lfb) hmm0Var.h).map(new qpj1(ejr0Var2, hmm0Var, (byte) 25)).onErrorReturn(new owf1(ejr0Var2, (byte) 17)).toObservable();
        }
    }

    public final yrd l(mvd mvdVar) {
        byte b = this.a;
        x9a x9aVar = this.b;
        switch (b) {
            case 0:
                icc0 icc0Var = (icc0) x9aVar;
                String string = icc0Var.b.getString(2131952489);
                pud pudVar = icc0Var.k;
                String str = pudVar.a;
                ivd ivdVar = ((ejr0) mvdVar).a;
                return new yrd(string, (String) null, (String) null, str, pudVar, Collections.singletonList(new avd("items", null, null, new cvd(ivdVar.a))), ivdVar.b, new vtd(pudVar.a, ""), 0L, 524);
            default:
                hmm0 hmm0Var = (hmm0) x9aVar;
                String string2 = hmm0Var.c.getString(2131952493);
                pud pudVar2 = hmm0Var.e;
                String str2 = pudVar2.a;
                ivd ivdVar2 = ((ejr0) mvdVar).a;
                return new yrd(string2, (String) null, (String) null, str2, pudVar2, Collections.singletonList(new avd("items", null, null, new cvd(ivdVar2.a))), ivdVar2.b, new vtd(pudVar2.a, ""), 0L, 524);
        }
    }

    public final Observable n(String str, List list) {
        byte b = this.a;
        x9a x9aVar = this.b;
        switch (b) {
            case 0:
                icc0 icc0Var = (icc0) x9aVar;
                return icc0Var.l(0, icc0Var.g.e).map(new v6a0(icc0Var, list, (byte) 15)).onErrorReturn(qs10.t);
            default:
                hmm0 hmm0Var = (hmm0) x9aVar;
                return rqt0.F(o6x.a, new jme1(hmm0Var, 0, hmm0Var.d.e, (lnm) null)).flatMap(new a1g1(hmm0Var, (byte) 15)).map((lfb) hmm0Var.h).map(new frl1(hmm0Var, list, (byte) 6)).onErrorReturn(h2x0.Y0).toObservable();
        }
    }
}
