package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Single;
import java.util.AbstractSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qcl implements m710 {
    public final dxz0 a;
    public final miq0 b;
    public final esp0 c;

    public qcl(dxz0 dxz0Var, miq0 miq0Var, esp0 esp0Var) {
        this.a = dxz0Var;
        this.b = miq0Var;
        this.c = esp0Var;
    }

    @Override // p.m710
    public final Single a(String str, Bundle bundle, m210 m210Var, AbstractSet abstractSet) {
        return this.a.e().flatMapSingle(new c21(this, str, bundle, m210Var, abstractSet, str, bundle, m210Var, abstractSet, (byte) 9)).take(1L).singleOrError();
    }
}
