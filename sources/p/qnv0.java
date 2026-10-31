package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qnv0 {
    public final pnv0 a;
    public final oto0 b;
    public final kly0 c;
    public final kly0 d;
    public final PublishSubject e = new PublishSubject();

    public qnv0(pnv0 pnv0Var, oto0 oto0Var, caq caqVar, caq caqVar2) {
        this.a = pnv0Var;
        this.b = oto0Var;
        this.c = caqVar;
        this.d = caqVar2;
    }

    public static ArrayList b(mh90 mh90Var) {
        Iterable iterableB;
        List<mh90> list = mh90Var.f;
        ArrayList arrayList = new ArrayList();
        for (mh90 mh90Var2 : list) {
            if (mh90Var2 instanceof rh90) {
                iterableB = Collections.singletonList(mh90Var2);
            } else {
                if (!(mh90Var2 instanceof mh90)) {
                    eg.o();
                    return null;
                }
                iterableB = b(mh90Var2);
            }
            r7h.W(iterableB, arrayList);
        }
        return arrayList;
    }

    public final CompletableOnErrorComplete a(gfe gfeVar, int i, String str) {
        String strName;
        String lowerCase = null;
        gfe gfeVar2 = gfeVar == gfe.c ? null : gfeVar;
        if (gfeVar2 != null && (strName = gfeVar2.name()) != null) {
            lowerCase = strName.toLowerCase(Locale.ROOT);
        }
        return this.a.a(lowerCase, jup0.f(i), str).g(new tt60(this, gfeVar, (byte) 12)).o(Functions.h);
    }

    public final Single c(mmq0 mmq0Var, int i, String str) {
        List listSingletonList = Collections.singletonList(mmq0Var);
        return this.a.d(upn1.m(), jup0.f(i), str, this.b.a.g()).map(new xq60(this, listSingletonList)).map(new ewn0((Object) mmq0Var, (byte) 29));
    }

    public final Completable d(smq0[] smq0VarArr, int i, String str, boolean z, dg30 dg30Var) {
        if (smq0VarArr.length == 0) {
            return CompletableEmpty.a;
        }
        boolean z2 = z && dg30Var != null;
        ArrayList arrayList = new ArrayList(smq0VarArr.length);
        for (smq0 smq0Var : smq0VarArr) {
            arrayList.add(new xmq0(smq0Var.b.a, smq0Var.a.name().toLowerCase(Locale.ROOT), smq0Var.c));
        }
        return this.a.b(arrayList, jup0.f(i), str).g(new tt60(smq0VarArr, this, (byte) 13)).c(z2 ? new CompletableFromAction(new afe(this, dg30Var, i)).s((Scheduler) this.d.get()).o(Functions.h) : CompletableEmpty.a);
    }
}
