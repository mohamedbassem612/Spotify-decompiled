package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Single;
import java.util.AbstractSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class miq0 implements m710 {
    public final n710 a;

    public miq0(n710 n710Var) {
        this.a = n710Var;
    }

    @Override // p.m710
    public final Single a(String str, Bundle bundle, m210 m210Var, AbstractSet abstractSet) {
        int length = str.length();
        n710 n710Var = this.a;
        if (length != 0) {
            return n710Var.b.switchMapSingle(new sp00(n710Var, str, abstractSet, m210Var, (byte) 7)).take(1L).singleOrError().doOnError(dxu.V0);
        }
        n710Var.getClass();
        return Single.error(new Exception("Query cannot be empty"));
    }
}
