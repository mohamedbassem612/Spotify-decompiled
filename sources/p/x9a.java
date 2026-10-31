package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class x9a {
    public final idd1 a;

    public x9a(fjb fjbVar) {
        this.a = new idd1(new z77(fjbVar, this, (byte) 25));
    }

    public List a() {
        return Collections.singletonList(gn90.a);
    }

    public void b(String str, i iVar, ArrayList arrayList) {
        d().c.onNext(new dsd(str, iVar, arrayList));
    }

    public final kvd d() {
        return (kvd) this.a.getValue();
    }

    public abstract pud e();

    public abstract jvd f();

    public boolean g(List list) {
        return false;
    }

    public Observable h(il51 il51Var) {
        kvd kvdVarD = d();
        List list = il51Var.a;
        return kvdVarD.c.startWithItem(kvdVarD.b).concatMap(new cab((Object) kvdVarD, (Object) list, (Object) il51Var.c, (byte) 23)).map(new aod(kvdVarD, list, (byte) 2));
    }

    public boolean k(il51 il51Var) {
        return true;
    }

    public void i(Bundle bundle) {
    }

    public void j(Bundle bundle) {
    }
}
