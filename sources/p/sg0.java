package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sg0 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg0() {
        super(1, (lnm) null);
        this.a = (byte) 6;
    }

    public final lnm create(lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new sg0(1, lnmVar, (byte) 0);
            case 1:
                return new sg0(1, lnmVar, (byte) 1);
            case 2:
                return new sg0(1, lnmVar, (byte) 2);
            case 3:
                return new sg0(1, lnmVar, (byte) 3);
            case 4:
                return new sg0(1, lnmVar, (byte) 4);
            case 5:
                return new sg0(1, lnmVar, (byte) 5);
            case 6:
                return new sg0(1, lnmVar, (byte) 6);
            case 7:
                return new sg0(1, lnmVar, (byte) 7);
            case 8:
                return new sg0(1, lnmVar, (byte) 8);
            case 9:
                return new sg0(1, lnmVar, (byte) 9);
            case 10:
                return new sg0(1, lnmVar, (byte) 10);
            case 11:
                return new sg0(1, lnmVar, (byte) 11);
            case 12:
                return new sg0(1, lnmVar, (byte) 12);
            case 13:
                return new sg0(1, lnmVar, (byte) 13);
            case 14:
                return new sg0(1, lnmVar, (byte) 14);
            case 15:
                return new sg0(1, lnmVar, (byte) 15);
            case 16:
                return new sg0(1, lnmVar, (byte) 16);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new sg0(1, lnmVar, (byte) 17);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new sg0(1, lnmVar, (byte) 18);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new sg0(1, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new sg0(1, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new sg0(1, lnmVar, (byte) 21);
            case 22:
                return new sg0(1, lnmVar, (byte) 22);
            case 23:
                return new sg0(1, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new sg0(1, lnmVar, (byte) 24);
            case 25:
                return new sg0(1, lnmVar, (byte) 25);
            case 26:
                return new sg0(1, lnmVar, (byte) 26);
            case 27:
                return new sg0(1, lnmVar, (byte) 27);
            case 28:
                return new sg0(1, lnmVar, (byte) 28);
            default:
                return new sg0(1, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                create(lnmVar).invokeSuspend(rih1Var);
                return Boolean.FALSE;
            case 1:
                create(lnmVar);
                hm5.M(rih1Var);
                return null;
            case 2:
                create(lnmVar);
                hm5.M(rih1Var);
                return null;
            case 3:
                create(lnmVar);
                hm5.M(rih1Var);
                return null;
            case 4:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 5:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create(lnmVar).invokeSuspend(rih1Var);
                return "https://c.spotify.com";
            case 8:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 9:
                create(lnmVar);
                hm5.M(rih1Var);
                return null;
            case 10:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create(lnmVar);
                hm5.M(rih1Var);
                return null;
            case 14:
                create(lnmVar);
                hm5.M(rih1Var);
                return null;
            case 15:
                create(lnmVar).invokeSuspend(rih1Var);
                return "spotify:presents:import-music";
            case 16:
                create(lnmVar).invokeSuspend(rih1Var);
                return "https://www.spotify.com/account/login-methods-v2-mobile/";
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                create(lnmVar);
                hm5.M(rih1Var);
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                create(lnmVar);
                hm5.M(rih1Var);
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                create(lnmVar);
                hm5.M(rih1Var);
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                create(lnmVar);
                hm5.M(rih1Var);
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                create(lnmVar);
                hm5.M(rih1Var);
                return null;
            case 22:
                create(lnmVar);
                hm5.M(rih1Var);
                return null;
            case 23:
                create(lnmVar).invokeSuspend(rih1Var);
                return z6x.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                create(lnmVar);
                hm5.M(rih1Var);
                return null;
            case 25:
                create(lnmVar);
                hm5.M(rih1Var);
                return null;
            case 26:
                return create(lnmVar).invokeSuspend(rih1Var);
            case 27:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create(lnmVar);
                hm5.M(rih1Var);
                return null;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                return Boolean.FALSE;
            case 1:
                hm5.M(obj);
                return null;
            case 2:
                hm5.M(obj);
                return null;
            case 3:
                hm5.M(obj);
                return null;
            case 4:
                hm5.M(obj);
                return LocalDate.of(2026, 10, 9);
            case 5:
                hm5.M(obj);
                return rih1Var;
            case 6:
                hm5.M(obj);
                return rih1Var;
            case 7:
                hm5.M(obj);
                return "https://c.spotify.com";
            case 8:
                hm5.M(obj);
                return new huz(pu90.a, (byte) 10);
            case 9:
                hm5.M(obj);
                return null;
            case 10:
                hm5.M(obj);
                return rih1Var;
            case 11:
                hm5.M(obj);
                return rih1Var;
            case 12:
                hm5.M(obj);
                return rih1Var;
            case 13:
                hm5.M(obj);
                return null;
            case 14:
                hm5.M(obj);
                return null;
            case 15:
                hm5.M(obj);
                return "spotify:presents:import-music";
            case 16:
                hm5.M(obj);
                return "https://www.spotify.com/account/login-methods-v2-mobile/";
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                hm5.M(obj);
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                hm5.M(obj);
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                hm5.M(obj);
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                hm5.M(obj);
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                hm5.M(obj);
                return null;
            case 22:
                hm5.M(obj);
                return null;
            case 23:
                hm5.M(obj);
                return z6x.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                hm5.M(obj);
                return null;
            case 25:
                hm5.M(obj);
                return null;
            case 26:
                hm5.M(obj);
                return nik1.J5.a;
            case 27:
                hm5.M(obj);
                return rih1Var;
            case 28:
                hm5.M(obj);
                return rih1Var;
            default:
                hm5.M(obj);
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
