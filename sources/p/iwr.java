package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iwr extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iwr(ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 1:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 2:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 3:
                ((iu30) ven0Var.getValue()).invoke(new kp3((tv80) null));
                return rih1Var;
            case 4:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 5:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 6:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 7:
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
            case 8:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 9:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 10:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 11:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 12:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 13:
                Function0 function0 = (Function0) ven0Var.getValue();
                if (function0 != null) {
                    function0.invoke();
                }
                return rih1Var;
            case 14:
                Function0 function1 = (Function0) ven0Var.getValue();
                if (function1 != null) {
                    function1.invoke();
                }
                return rih1Var;
            case 15:
                Boolean bool = (Boolean) ven0Var.getValue();
                bool.getClass();
                return bool;
            case 16:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                wm5.h(ven0Var, true);
                return Boolean.TRUE;
            case 22:
                wm5.h(ven0Var, true);
                return rih1Var;
            case 23:
                wm5.h(ven0Var, true);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                wm5.h(ven0Var, true);
                return rih1Var;
            case 25:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 26:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 27:
                ven0Var.setValue(u8w.b);
                return rih1Var;
            case 28:
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
            default:
                return (m8d1) ven0Var.getValue();
        }
    }
}
