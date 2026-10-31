package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h30 implements lj00 {
    public final /* synthetic */ byte a;
    public final Map b;

    public h30(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = Collections.singletonMap(1, Collections.singleton(new zp21(z081.class)));
                break;
            case 2:
                this.b = sqg0.J(new mmr0[]{new mmr0(1, l1d.u(nbw0.class)), new mmr0(2, f46.S0(new yp21[]{new yp21(pjw0.class), new yp21(w281.class), new yp21(e2k1.class)}))});
                break;
            case 3:
                this.b = Collections.singletonMap(1, f46.S0(new aq21[]{new zp21(gw81.class), new yp21(w281.class)}));
                break;
            case 4:
                this.b = Collections.singletonMap(1, f46.S0(new zp21[]{new zp21(j6k.class), new zp21(lhe0.class), new zp21(jfk.class)}));
                break;
            case 5:
            case 6:
            case 9:
            case 10:
            case 13:
            case 14:
            case 15:
            case 16:
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
            default:
                this.b = sqg0.J(new mmr0[]{new mmr0(1, f46.S0(new aq21[]{new zp21(gw81.class), new yp21(xkk1.class)})), new mmr0(2, l1d.u(gw81.class))});
                break;
            case 7:
                this.b = sqg0.J(new mmr0[]{new mmr0(1, f46.S0(new aq21[]{new yp21(xkk1.class), new zp21(nbw0.class), new zp21(yo60.class)})), new mmr0(2, f46.S0(new aq21[]{new zp21(jo70.class), new yp21(zoy0.class), new yp21(prl.class)}))});
                break;
            case 8:
                this.b = sqg0.J(new mmr0[]{new mmr0(1, l1d.u(nbw0.class)), new mmr0(2, f46.S0(new yp21[]{new yp21(pjw0.class), new yp21(w281.class), new yp21(e2k1.class)}))});
                break;
            case 11:
                this.b = sqg0.J(new mmr0[]{new mmr0(1, f46.S0(new aq21[]{new yp21(xkk1.class), new zp21(nbw0.class)})), new mmr0(2, f46.S0(new aq21[]{new zp21(yo60.class), new zp21(jo70.class), new yp21(prl.class)}))});
                break;
            case 12:
                nmt0.g0.getClass();
                this.b = Collections.singletonMap(1, mmt0.b);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                this.b = Collections.singletonMap(1, f46.S0(new aq21[]{new zp21(pnx0.class), new yp21(w281.class)}));
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                this.b = Collections.singletonMap(1, Collections.singleton(new zp21(oox0.class)));
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                this.b = Collections.singletonMap(1, f46.S0(new zp21[]{new zp21(xkk1.class), new zp21(jo70.class)}));
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                this.b = sqg0.J(new mmr0[]{new mmr0(1, f46.S0(new aq21[]{new zp21(z081.class), new yp21(xkk1.class)})), new mmr0(2, f46.S0(new aq21[]{new zp21(z081.class), new yp21(xkk1.class)}))});
                break;
            case 22:
                this.b = Collections.singletonMap(1, f46.S0(new zp21[]{new zp21(jo70.class), new zp21(pnx0.class), new zp21(xkk1.class)}));
                break;
            case 23:
                this.b = Collections.singletonMap(1, Collections.singleton(new zp21(m8a.class)));
                break;
        }
    }

    public final Map a() {
        byte b = this.a;
        return this.b;
    }

    public final Integer b() {
        switch (this.a) {
            case 0:
                return 15;
            case 1:
                return 7;
            case 2:
                return 36;
            case 3:
                return 23;
            case 4:
                return 16;
            case 5:
                return 8;
            case 6:
                return 3;
            case 7:
                return 27;
            case 8:
                return 33;
            case 9:
                return 25;
            case 10:
                return 18;
            case 11:
                return 6;
            case 12:
                return 35;
            case 13:
                return 43;
            case 14:
                return 44;
            case 15:
                return 4;
            case 16:
                return 37;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return 39;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return 12;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return 13;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return 41;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return 2;
            case 22:
                return 17;
            default:
                return 28;
        }
    }

    public h30(w25 w25Var, byte b) {
        Map mapSingletonMap;
        this.a = b;
        switch (b) {
            case 6:
                if (w25Var.n()) {
                    mapSingletonMap = Collections.singletonMap(1, Collections.singleton(new zp21(gw81.class)));
                } else {
                    mapSingletonMap = b7x.a;
                }
                this.b = mapSingletonMap;
                break;
            default:
                this.b = Collections.singletonMap(1, (Set) dem1.U(w25Var.a(), true, false, false, 0L, false, false, yzj.Z0).b);
                break;
        }
    }

    public h30(hl00 hl00Var, byte b) {
        this.a = b;
        switch (b) {
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                this.b = sqg0.J(new mmr0[]{new mmr0(1, l1d.u(nbw0.class)), new mmr0(2, een.c(hl00Var.q(), false))});
                break;
            default:
                this.b = sqg0.J(new mmr0[]{new mmr0(1, l1d.u(nbw0.class)), new mmr0(2, een.c(hl00Var.q(), false))});
                break;
        }
    }

    public h30(hl00 hl00Var, yy4 yy4Var, byte b) {
        this.a = b;
        switch (b) {
            case 13:
                this.b = sqg0.J(new mmr0[]{new mmr0(1, sl10.b()), new mmr0(2, sl10.a(hl00Var.q(), yy4Var.b()))});
                break;
            case 14:
                this.b = sqg0.J(new mmr0[]{new mmr0(1, c13.i(w281.class)), new mmr0(2, as10.e(hl00Var.q(), false, true, yy4Var.b()))});
                break;
            case 15:
                this.b = sqg0.J(new mmr0[]{new mmr0(1, c13.i(w281.class)), new mmr0(2, as10.f(6, hl00Var.q(), false, false, yy4Var.b()))});
                break;
            case 16:
                this.b = sqg0.J(new mmr0[]{new mmr0(1, sl10.b()), new mmr0(2, sl10.a(hl00Var.q(), yy4Var.b()))});
                break;
            default:
                this.b = sqg0.J(new mmr0[]{new mmr0(1, sl10.b()), new mmr0(2, sl10.a(hl00Var.q(), yy4Var.b()))});
                break;
        }
    }
}
