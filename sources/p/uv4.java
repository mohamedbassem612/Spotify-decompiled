package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.playbacknative.AudioDriver;
import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uv4 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv4(bxh bxhVar, int i) {
        super(1);
        this.a = (byte) 9;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = 1;
        rih1 rih1Var = rih1.a;
        int i2 = this.b;
        switch (b) {
            case 0:
                ((ObservableEmitter) obj).onError(new RuntimeException(f4i1.c(i2, "mDNS service registration failed with code ")));
                return rih1Var;
            case 1:
                ((ObservableEmitter) obj).onError(new RuntimeException(f4i1.c(i2, "mDNS service unregistration failed with code ")));
                return rih1Var;
            case 2:
                ((Number) obj).intValue();
                return Integer.valueOf(i2);
            case 3:
                AudioDriver.stopDuckingAudioSession(((Number) obj).intValue(), i2);
                return rih1Var;
            case 4:
                return new k3h1(i2);
            case 5:
                b261.l((e261) obj, new f4h(i2, 0));
                return rih1Var;
            case 6:
                return new k3h1(i2);
            case 7:
                b261.l((e261) obj, new f4h(i2, 0));
                return rih1Var;
            case 8:
                return new k3h1(i2);
            case 9:
                rzh rzhVar = (rzh) obj;
                int i3 = rzhVar.a;
                Integer num = rzhVar.b;
                if (i2 <= ((rr80) new tr80(i3, num != null ? num.intValue() : Integer.MAX_VALUE, 1)).b && i3 <= i2) {
                    i = 0;
                } else if (i2 >= i3) {
                    i = -1;
                }
                return Integer.valueOf(i);
            case 10:
                return new k3h1(i2);
            case 11:
                return new k3h1(i2);
            case 12:
                return new k3h1(i2);
            case 13:
                b261.l((e261) obj, new f4h(i2, 0));
                return rih1Var;
            case 14:
                return new mmr0(Integer.valueOf(i2), ((iwm) obj).a);
            case 15:
                ((Number) obj).intValue();
                return Integer.valueOf(i2);
            case 16:
                ((Number) obj).intValue();
                return Integer.valueOf(i2);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new k3h1(i2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return f4i1.c(i2 + ((Number) obj).intValue(), "section_");
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new k3h1(i2);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new k3h1(i2);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new k3h1(i2);
            case 22:
                return new k3h1(i2);
            case 23:
                return new k3h1(i2);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((Number) obj).intValue();
                return Integer.valueOf(-i2);
            case 25:
                ((Number) obj).intValue();
                return Integer.valueOf(-i2);
            case 26:
                ((e261) obj).b(xdy.b, Integer.valueOf(i2));
                return rih1Var;
            case 27:
                return Boolean.valueOf(((Number) obj).intValue() >= i2);
            case 28:
                return Boolean.valueOf(((kdi1) obj).a == i2);
            default:
                return new k3h1(i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uv4(int i, byte b) {
        super(1);
        this.a = b;
        this.b = i;
    }
}
