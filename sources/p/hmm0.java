package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hmm0 extends x9a {
    public final /* synthetic */ byte b = 1;
    public final Context c;
    public final r87 d;
    public final pud e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final jvd i;

    public hmm0(Context context, o411 o411Var, String str, fjb fjbVar, r87 r87Var, uw0 uw0Var) {
        super(fjbVar);
        this.c = context;
        this.f = o411Var;
        this.g = str;
        this.d = r87Var;
        this.h = uw0Var;
        this.i = new v4c(this, (byte) 3);
        this.e = pud.SUGGESTED_SONGS;
    }

    public static String n(String str, List list) {
        Set set = s4b1.f;
        if (!uic.j(str, nyu0.e)) {
            str = null;
        }
        if (!list.isEmpty()) {
            List<String> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (String str2 : list2) {
                    Set set2 = s4b1.f;
                    s4b1 s4b1VarX = uic.x(str2);
                    if (s4b1VarX.c != blc0.ti || s4b1VarX.u()) {
                        return null;
                    }
                }
            }
        }
        return str;
    }

    @Override // p.x9a
    public List a() {
        switch (this.b) {
            case 2:
                return Collections.singletonList(gn90.b);
            default:
                return super.a();
        }
    }

    @Override // p.x9a
    public void b(String str, i iVar, ArrayList arrayList) {
        switch (this.b) {
            case 2:
                break;
            default:
                super.b(str, iVar, arrayList);
                break;
        }
    }

    @Override // p.x9a
    public final pud e() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.e;
    }

    @Override // p.x9a
    public final jvd f() {
        switch (this.b) {
            case 0:
                return (gmm0) this.i;
            case 1:
                return (v4c) this.i;
            default:
                return (hcc0) this.i;
        }
    }

    @Override // p.x9a
    public boolean g(List list) {
        switch (this.b) {
            case 1:
                return true;
            default:
                return super.g(list);
        }
    }

    @Override // p.x9a
    public Observable h(il51 il51Var) {
        switch (this.b) {
            case 1:
                Observable observableH = super.h(il51Var);
                uw0 uw0Var = (uw0) this.h;
                uw0Var.getClass();
                return Observable.combineLatest(observableH, yoi1.i(new m441(new q721(uw0Var, il51Var, (lnm) null, (byte) 15)), o6x.a), new dn81(this, (byte) 16));
            default:
                return super.h(il51Var);
        }
    }

    @Override // p.x9a
    public boolean k(il51 il51Var) {
        switch (this.b) {
            case 2:
                return !il51Var.b;
            default:
                return super.k(il51Var);
        }
    }

    public Set m(ArrayList arrayList) {
        Set set = s4b1.f;
        v5b1 v5b1Var = uic.x((String) this.g).d;
        return u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e) ? o7h.p1(o7h.e1(10, arrayList)) : o7h.p1(arrayList);
    }

    public hmm0(Context context, sjj0 sjj0Var, fjb fjbVar, fmm0 fmm0Var, r87 r87Var, lfb lfbVar) {
        super(fjbVar);
        this.c = context;
        this.f = sjj0Var;
        this.g = fmm0Var;
        this.d = r87Var;
        this.h = lfbVar;
        this.i = new gmm0(this, (byte) 0);
        this.e = pud.MOST_PLAYED_SONGS;
    }

    public hmm0(Context context, xrc0 xrc0Var, fjb fjbVar, sjj0 sjj0Var, r87 r87Var, lfb lfbVar) {
        super(fjbVar);
        this.c = context;
        this.g = xrc0Var;
        this.f = sjj0Var;
        this.d = r87Var;
        this.h = lfbVar;
        this.i = new hcc0(this, (byte) 1);
        this.e = pud.YOUR_EPISODES;
    }

    private final void l(String str, i iVar, ArrayList arrayList) {
    }
}
