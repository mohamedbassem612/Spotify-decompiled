package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class do0 implements nyc {
    public final /* synthetic */ SingleEmitter a;

    public void a(iua iuaVar, f1z0 f1z0Var) {
        List list = f1z0Var.a;
        int i = iuaVar.a;
        String str = iuaVar.c;
        List list2 = f1z0Var.b;
        if (!list2.isEmpty()) {
            Logger.d("productDetailsResult.unfetchedProductList -> " + list2, new Object[0]);
        }
        SingleEmitter singleEmitter = this.a;
        if (i != 0) {
            Logger.d(ab80.n("queryProductDetailsAsync() - responseCode:", ", debugMessage:", i, str), new Object[0]);
            singleEmitter.onSuccess(new b231(5, i, str));
            return;
        }
        List list3 = list;
        if (list3 == null || list3.isEmpty()) {
            Logger.d("Found null or empty ProductDetails. Check to see if the Products you requested are correctly published in the Google Play Console.", new Object[0]);
            singleEmitter.onSuccess(e231.a);
            return;
        }
        List<etw0> list4 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list4, 10));
        for (etw0 etw0Var : list4) {
            arrayList.add(new afm1(etw0Var.c, etw0Var));
        }
        singleEmitter.onSuccess(new v231(arrayList));
    }

    public void k(jf01 jf01Var, IOException iOException) {
        String message = iOException.getMessage();
        if (message == null) {
            message = "Http request failed";
        }
        this.a.onSuccess(new w3i1((Long) null, message));
    }

    public void n(jf01 jf01Var, ry21 ry21Var) {
        x3i1 w3i1Var;
        uz21 uz21Var = ry21Var.g;
        int i = ry21Var.d;
        if (200 > i || i >= 300) {
            w3i1Var = new w3i1(Long.valueOf(i), uz21Var.toString());
        } else {
            w3i1Var = x3i1.a;
        }
        this.a.onSuccess(w3i1Var);
        try {
            uz21Var.close();
        } catch (Throwable unused) {
        }
    }
}
