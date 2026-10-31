package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bu2 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bu2(tob1 tob1Var, byte b) {
        super(0);
        this.a = b;
        this.b = tob1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        tob1 tob1Var = this.b;
        switch (b) {
            case 0:
                return (Float) tob1Var.getValue();
            case 1:
                return Boolean.valueOf(!(((Number) tob1Var.getValue()).floatValue() == 1.0f));
            case 2:
                return Float.valueOf(((Number) tob1Var.getValue()).floatValue());
            case 3:
                return (Float) tob1Var.getValue();
            case 4:
                return tob1Var.getValue();
            case 5:
                return Float.valueOf(((Number) tob1Var.getValue()).floatValue());
            case 6:
                zje1 zje1Var = (zje1) tob1Var.getValue();
                return new zje1(z47.q(zje1Var.a), z47.q(zje1Var.b));
            case 7:
                return Integer.valueOf(((ptb0) tob1Var.getValue()).o);
            case 8:
                return Boolean.valueOf(((Number) tob1Var.getValue()).floatValue() >= 0.9f);
            case 9:
                return (Float) tob1Var.getValue();
            case 10:
                p3v p3vVar = (p3v) tob1Var.getValue();
                float f = p3vVar.a;
                return p3vVar;
            case 11:
                return (Float) tob1Var.getValue();
            case 12:
                return Boolean.valueOf(tob1Var.getValue() != null);
            case 13:
                return Boolean.valueOf(p3v.c(((p3v) tob1Var.getValue()).a, 0.0f));
            case 14:
                return Integer.valueOf(z4p1.G(((u7h) tob1Var.getValue()).a));
            case 15:
                return Boolean.valueOf(((Number) tob1Var.getValue()).floatValue() > 0.0f);
            case 16:
                return Float.valueOf(((Number) tob1Var.getValue()).floatValue());
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return Boolean.valueOf(((w8c0) tob1Var.getValue()).a(w8c0.e));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (Boolean) tob1Var.getValue();
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return Float.valueOf(((Number) tob1Var.getValue()).floatValue());
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                Boolean bool = (Boolean) tob1Var.getValue();
                bool.booleanValue();
                return v8r.q(bool);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (Float) tob1Var.getValue();
            case 22:
                return Boolean.valueOf(!(((Number) tob1Var.getValue()).floatValue() == 1.0f));
            case 23:
                return Float.valueOf(((int) (((yr80) tob1Var.getValue()).a >> 32)) / 2.0f);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return Float.valueOf(1.0f - ((Number) tob1Var.getValue()).floatValue());
            case 25:
                return Boolean.valueOf(((Number) tob1Var.getValue()).floatValue() > 0.0f);
            case 26:
                return Boolean.valueOf(((Number) tob1Var.getValue()).floatValue() >= 0.5f);
            case 27:
                return Float.valueOf(((Number) tob1Var.getValue()).floatValue());
            case 28:
                return Boolean.valueOf(((Number) tob1Var.getValue()).floatValue() == 1.0f);
            default:
                return Float.valueOf(yoi1.o(1.0f - (tob1Var != null ? ((Number) tob1Var.getValue()).floatValue() : 1.0f), 0.0f, 1.0f));
        }
    }
}
