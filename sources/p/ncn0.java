package p;

import androidx.car.app.navigation.model.Maneuver;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ncn0 implements BiFunction, Function, Function3, com.spotify.mobius.functions.Function {
    public final /* synthetic */ byte a;

    public static /* synthetic */ void d(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    public static /* synthetic */ void f(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void g(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public Object a(Object obj, Object obj2) {
        qop qopVar = (qop) obj;
        switch (this.a) {
            case 0:
                qopVar.getClass();
                ((pbt) obj2).getClass();
                return new q93((byte) 1);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                qopVar.getClass();
                ((gzu0) obj2).getClass();
                return new xne((byte) 4);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                qopVar.getClass();
                ((gl90) obj2).getClass();
                return new doe((byte) 2);
            default:
                qopVar.getClass();
                ((gl90) obj2).getClass();
                return new foe((byte) 1);
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 6:
                return sih1.a;
            case 7:
            default:
                qal qalVar = (tal) obj;
                if (qalVar instanceof sal) {
                    return Boolean.FALSE;
                }
                if (qalVar instanceof qal) {
                    return Boolean.valueOf(qalVar.a == 1);
                }
                return Boolean.FALSE;
            case 8:
                dj20.p();
                return Single.just(k5e0.a);
            case 9:
                dj20.l();
                return Single.just(h5e0.a);
            case 10:
                return Single.just(new f5e0(((f5e0) obj).a));
            case 11:
                dj20.o();
                return Single.just(j5e0.a);
            case 12:
                return Single.just(new c5e0(((c5e0) obj).a));
            case 13:
                l5e0 l5e0Var = (l5e0) obj;
                return Single.just(new l5e0(l5e0Var.a, l5e0Var.b));
            case 14:
                return Single.just(new m5e0(((m5e0) obj).a));
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        Boolean bool2 = (Boolean) obj3;
        if (((Boolean) obj).booleanValue()) {
            return g7o0.a;
        }
        if (!bool.booleanValue() || bool2.booleanValue()) {
            return !bool2.booleanValue() ? g7o0.c : g7o0.d;
        }
        return g7o0.b;
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 5:
                Boolean bool = (Boolean) obj2;
                if (!((Boolean) obj).booleanValue() && bool.booleanValue()) {
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 16:
                qal qalVar = (tal) obj;
                Boolean bool2 = (Boolean) obj2;
                return ((qalVar instanceof qal) && qalVar.a == 1) ? Boolean.FALSE : bool2;
            default:
                return new nmr0((Throwable) obj, (Integer) obj2);
        }
    }
}
