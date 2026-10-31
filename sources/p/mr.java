package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class mr implements Function {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ mr(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public synchronized Single a(di8 di8Var, boolean z) {
        Single singleJust;
        if (z) {
            singleJust = ((wve0) this.b).a(pv.a(di8Var.c)).take(1L).map(qr.h).singleOrError();
            singleJust.getClass();
        } else {
            try {
                yqg yqgVar = (yqg) this.c;
                wd wdVar = di8Var.b;
                if (wdVar != null && yqgVar.d().getTimeInMillis() + 30000 <= wdVar.c.getTime()) {
                    singleJust = Single.just(new ii8(di8Var));
                    singleJust.getClass();
                } else {
                    singleJust = ((wve0) this.b).a(pv.a(di8Var.c)).take(1L).map(qr.h).singleOrError();
                    singleJust.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return singleJust;
    }

    public Object apply(Object obj) {
        Single map;
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                q941 q941Var = (q941) obj;
                if (q941Var.equals(k941.a)) {
                    Single singleJust = Single.just(Boolean.FALSE);
                    singleJust.getClass();
                    return singleJust;
                }
                if (q941Var instanceof m941) {
                    return ((cs) obj3).e.firstOrError().flatMap(new sr((yg8) obj2));
                }
                if (!q941Var.equals(o941.a)) {
                    eg.o();
                    return null;
                }
                Single singleJust2 = Single.just(Boolean.TRUE);
                singleJust2.getClass();
                return singleJust2;
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    return Single.zip((ArrayList) obj2, new qr((cs) obj3)).onErrorReturn(qr.d);
                }
                Single singleJust3 = Single.just(z6x.a);
                singleJust3.getClass();
                return singleJust3;
            case 2:
                q941 q941Var2 = (q941) obj;
                cs csVar = (cs) obj3;
                if (q941Var2 instanceof m941) {
                    lw lwVarO = csVar.o(((mi8) obj2).a.a);
                    return (lwVarO == null || (map = csVar.p(lwVarO).map(new tr((byte) 3, csVar, lwVarO))) == null) ? Single.just(q941Var2) : map;
                }
                Single singleJust4 = Single.just(q941Var2);
                singleJust4.getClass();
                return singleJust4;
            case 3:
            default:
                return new CompletableFromAction(new uv((vv) obj3, (rad1) obj2, (qtt) obj, (byte) 2));
            case 4:
                return new CompletableFromAction(new uv((vv) obj3, (o71) obj2, (qtt) obj, (byte) 0));
            case 5:
                return new CompletableFromAction(new uv((vv) obj3, (t521) obj2, (qtt) obj, (byte) 1));
        }
    }
}
