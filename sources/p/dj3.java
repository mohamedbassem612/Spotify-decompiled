package p;

import android.content.Intent;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dj3 implements qhv0 {
    public final Completable a;

    public dj3(Intent intent, String str, ej3 ej3Var) {
        CompletableOnErrorComplete completableOnErrorCompleteO;
        Set set = s4b1.f;
        String strA = uic.x(intent.getDataString()).a();
        if (strA == null || strA.length() == 0) {
            completableOnErrorCompleteO = CompletableEmpty.a;
        } else {
            Completable completableIgnoreElement = ej3Var.a(str, strA).timeout(1200L, TimeUnit.MILLISECONDS, Single.error(new TimeoutException())).ignoreElement();
            completableIgnoreElement.getClass();
            completableOnErrorCompleteO = completableIgnoreElement.o(Functions.h);
        }
        completableOnErrorCompleteO.getClass();
        this.a = completableOnErrorCompleteO;
    }

    public final Object a(lnm lnmVar) {
        Object objI = fc11.i(this.a, lnmVar);
        return objI == d9n.a ? objI : rih1.a;
    }
}
