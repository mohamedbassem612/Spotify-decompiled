package p;

import android.content.Intent;
import android.graphics.Insets;
import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class mna0 implements n181, Function, akl, Predicate, BiPredicate, BiFunction, jrn0 {
    public final /* synthetic */ byte a;

    public /* synthetic */ mna0(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ Insets b(Object obj) {
        return (Insets) obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public static /* synthetic */ void d(Object obj, String str) throws i9n {
        throw new i9n(str + obj);
    }

    public static /* synthetic */ void e(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public Object a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                gl90 gl90Var = (gl90) obj2;
                ((qop) obj).getClass();
                gl90Var.getClass();
                return new lna0((ykp) ((jly0) new b6p(gl90Var).c).get());
            case 1:
            case 2:
            case 3:
            case 8:
            case 9:
            case 10:
            case 15:
            default:
                ((sq21) obj).getClass();
                ((jq21) obj2).getClass();
                return new ufc0();
            case 4:
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                return new xne((byte) 2);
            case 5:
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                return new kfc0((byte) 0);
            case 6:
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                return new uo7((byte) 3);
            case 7:
                ((c8c0) obj).getClass();
                ((izu0) obj2).getClass();
                return new ic3((byte) 3);
            case 11:
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                return new kfc0((byte) 1);
            case 12:
                ((c8c0) obj).getClass();
                ((izu0) obj2).getClass();
                return new ic3((byte) 4);
            case 13:
                ((sq21) obj).getClass();
                ((jq21) obj2).getClass();
                return new j1y();
            case 14:
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                return new ymm((byte) 1);
            case 16:
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                return new xne((byte) 3);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                return new kfc0((byte) 2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((qop) obj).getClass();
                ((gl90) obj2).getClass();
                return new doe((byte) 1);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((c8c0) obj).getClass();
                ((izu0) obj2).getClass();
                return new ic3((byte) 5);
        }
    }

    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 8:
                return CompletableEmpty.a;
            case 9:
                return ((sp91) obj).b;
            case 10:
                return CompletableEmpty.a;
            case 22:
                return Boolean.valueOf(((th61) obj).h);
            case 25:
                return new zuf0((re70) obj, (Throwable) null);
            default:
                return new zuf0((re70) null, (Throwable) obj);
        }
    }

    public boolean c() {
        return false;
    }

    public irn0 l(Intent intent, th61 th61Var) {
        switch (this.a) {
            case 27:
                return crn0.a;
            default:
                return new frn0(new Bundle(), quf0.class);
        }
    }

    public boolean test(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        return ((Boolean) obj2).equals(bool) || bool.booleanValue();
    }

    public boolean test(Object obj) {
        return ((Long) obj).longValue() > 0;
    }

    public Object apply(Object obj, Object obj2) {
        return new nmr0((Boolean) obj, (re70) obj2);
    }
}
