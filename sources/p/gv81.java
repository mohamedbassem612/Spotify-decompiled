package p;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gv81 extends x9a implements isd {
    public final yqg b;
    public final Context c;
    public final o411 d;
    public final gid e;
    public final em3 f;
    public final r87 g;
    public Set h;
    public final nl51 i;
    public final pud j;

    public gv81(yqg yqgVar, Context context, o411 o411Var, gid gidVar, em3 em3Var, fjb fjbVar, r87 r87Var) {
        super(fjbVar);
        this.b = yqgVar;
        this.c = context;
        this.d = o411Var;
        this.e = gidVar;
        this.f = em3Var;
        this.g = r87Var;
        this.h = w7x.a;
        this.i = new nl51(this, (byte) 13);
        this.j = pud.SIMILAR_TO;
    }

    public final void c(i iVar, ArrayList arrayList) {
        d().c.onNext(new bsd(iVar, arrayList));
    }

    @Override // p.x9a
    public final pud e() {
        return this.j;
    }

    @Override // p.x9a
    public final jvd f() {
        return this.i;
    }

    @Override // p.x9a
    public final boolean g(List list) {
        return !this.h.isEmpty();
    }

    @Override // p.x9a
    public final void i(Bundle bundle) {
        ArrayList parcelableArrayList;
        this.h = (bundle == null || (parcelableArrayList = bundle.getParcelableArrayList(this.j.a)) == null) ? w7x.a : o7h.p1(parcelableArrayList);
    }

    @Override // p.x9a
    public final void j(Bundle bundle) {
        bundle.putParcelableArrayList(this.j.a, new ArrayList<>(this.h));
    }

    public final String l(String str) {
        return f4i1.f(this.j.a, "/", str);
    }
}
