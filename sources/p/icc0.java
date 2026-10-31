package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class icc0 extends x9a {
    public final Context b;
    public final b7n c;
    public final xrc0 d;
    public final sjj0 e;
    public final pob f;
    public final r87 g;
    public final agc0 h;
    public final lfb i;
    public final hcc0 j;
    public final pud k;

    public icc0(Context context, b7n b7nVar, xrc0 xrc0Var, String str, fjb fjbVar, sjj0 sjj0Var, pob pobVar, r87 r87Var, agc0 agc0Var, lfb lfbVar) {
        super(fjbVar);
        this.b = context;
        this.c = b7nVar;
        this.d = xrc0Var;
        this.e = sjj0Var;
        this.f = pobVar;
        this.g = r87Var;
        this.h = agc0Var;
        this.i = lfbVar;
        this.j = new hcc0(this, (byte) 0);
        this.k = pud.LIKED_SONGS;
    }

    @Override // p.x9a
    public final pud e() {
        return this.k;
    }

    @Override // p.x9a
    public final jvd f() {
        return this.j;
    }

    public final Observable l(int i, int i2) {
        this.h.getClass();
        return rqt0.F(o6x.a, new gcc0(this, i, i2, null)).flatMap(new eb80(this, (byte) 9)).toObservable();
    }

    @Override // p.x9a
    public final void b(String str, i iVar, ArrayList arrayList) {
    }
}
