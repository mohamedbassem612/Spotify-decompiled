package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tma1 implements rhh0 {
    public final yt91 a;
    public final ypa b;
    public final v191 c;
    public final myy d;

    public tma1(yt91 yt91Var, uma1 uma1Var, ypa ypaVar, v191 v191Var, myy myyVar) {
        this.a = yt91Var;
        this.b = ypaVar;
        this.c = v191Var;
        this.d = myyVar;
    }

    @Override // p.w310
    public final Single b(r9c r9cVar) {
        String[] strArrSplit = r9cVar.e().split(":");
        n57.i(strArrSplit.length == 4, "The identifier [%s] should be a spaces identifier", r9cVar.e());
        String strM = l1d.m("spotify:space_item:", strArrSplit[2]);
        q9c q9cVarM = r9cVar.m();
        q9cVarM.b(strM);
        q9cVarM.c();
        r9c r9cVarA = q9cVarM.a();
        String[] strArrSplit2 = r9cVar.e().split(":");
        n57.i(strArrSplit2.length == 4, "The identifier [%s] should be a spaces identifier", r9cVar.e());
        return this.a.h(r9cVarA).map(new ubc(this.b, (byte) 25)).compose(this.c).map(new yt91(this, strArrSplit2[3], r9cVar, (byte) 10));
    }
}
