package p;

import android.content.Context;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nm3 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public static final nm3 b = new nm3(0);
    public static final nm3 c = new nm3(1);
    public static final nm3 d = new nm3(2);
    public static final nm3 e = new nm3(3);
    public static final nm3 f = new nm3(4);
    public static final nm3 g = new nm3(5);
    public static final nm3 h = new nm3(6);
    public static final nm3 i = new nm3(7);
    public static final nm3 t = new nm3(8);
    public static final nm3 X = new nm3(9);
    public static final nm3 Y = new nm3(10);
    public static final nm3 Z = new nm3(11);
    public static final nm3 N0 = new nm3(12);
    public static final nm3 O0 = new nm3(13);
    public static final nm3 P0 = new nm3(14);
    public static final nm3 Q0 = new nm3(15);
    public static final nm3 R0 = new nm3(16);

    public nm3(Context context, kt91 kt91Var) {
        this.a = (byte) 17;
    }

    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case 0:
                return observable.flatMap(xbp1.f);
            case 1:
                return observable;
            case 2:
                return observable.map(s9w.T0);
            case 3:
                return observable.flatMap(fj10.U0);
            case 4:
                return observable.flatMap(ta20.W0);
            case 5:
                return observable.flatMap(ud20.V0);
            case 6:
                return observable.flatMap(xi20.X0);
            case 7:
                return observable.flatMap(zi20.T0);
            case 8:
                return observable.flatMap(bj20.W0);
            case 9:
            case 10:
                return observable;
            case 11:
                return observable.flatMapSingle(ak20.a1);
            case 12:
                return observable.map(gex0.b);
            case 13:
                return observable.map(i2x0.e);
            case 14:
                return observable.map(i5x0.T0);
            case 15:
                return observable.map(p5x0.U0);
            case 16:
                return observable.map(r5x0.W0);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return observable.flatMap(new khc((byte) 17));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return observable.flatMap(new lhc((byte) 17));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return observable.switchMap(new ubc(this, (byte) 22));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return observable.switchMap(jcx0.h);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return observable.switchMap(new rtw0((byte) 19));
            default:
                return observable.switchMap(new ulc((byte) 26));
        }
    }

    public /* synthetic */ nm3(byte b2) {
        this.a = b2;
    }

    public nm3(Context context, kt91 kt91Var, Scheduler scheduler) {
        this.a = (byte) 18;
    }
}
