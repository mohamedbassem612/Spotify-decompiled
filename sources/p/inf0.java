package p;

import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class inf0 implements Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public inf0(String str, li91 li91Var, il91 il91Var) {
        this.a = (byte) 2;
        this.b = il91Var;
        this.d = str;
        this.c = li91Var;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                lnf0 lnf0Var = (lnf0) obj3;
                String strConcat = "android-lyrics-".concat(((dhf0) obj).a);
                String str = (String) obj2;
                return lnf0Var.a.b(new oi(strConcat, false, new z9b0(str, (byte) 23))).filter(bk20.Y).map(new gap1((byte) 10, lnf0Var, str)).first(new bff0(a860.e("FF353535"), a860.e("FF565656"), a860.e("FFFFFFFF"), a860.e("FFCDCDCD"), a860.e("FF1ED760"), true));
            case 1:
                ngz0 ngz0Var = ngz0.a;
                ((lgz0) obj3).b((LoggingParams) obj, (PlayOrigin) obj2, ngz0Var, 1);
                return ngz0Var;
            default:
                il91 il91Var = (il91) obj3;
                jj91 jj91Var = il91Var.d;
                String str2 = (String) obj2;
                int andIncrement = jj91Var.a.getAndIncrement();
                Subject subjectC = new PublishSubject().c();
                rig rigVar = new rig(str2, andIncrement, subjectC);
                jj91Var.b.put(Integer.valueOf(andIncrement), rigVar);
                return Observable.combineLatest((Observable) il91Var.Z.getValue(), subjectC.map(bjx0.N0).concatMap(djx0.N0).startWithItem(z6x.a), new n381(il91Var, rigVar, str2)).subscribeOn(il91Var.g).doOnSubscribe(new fks0(il91Var, rigVar, str2, (li91) obj)).doFinally(new tt60(il91Var, rigVar, (byte) 27));
        }
    }

    public /* synthetic */ inf0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
