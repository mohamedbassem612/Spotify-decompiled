package p;

import android.os.Parcelable;
import com.spotify.searchview.proto.BannerContent;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Filter;
import com.spotify.searchview.proto.FilterOption;
import com.spotify.searchview.proto.MainViewResponse;
import com.spotify.searchview.proto.Recommendations;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n851 {
    public final uy41 a;

    public n851(uy41 uy41Var, a0b a0bVar, lqc lqcVar) {
        this.a = uy41Var;
    }

    public static o5a a(BannerContent bannerContent) {
        return new o5a(bannerContent.getId(), bannerContent.getTitle(), bannerContent.getDescription(), bannerContent.n(), bannerContent.p());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [p.uo20] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [p.wo20] */
    /* JADX WARN: Type inference failed for: r10v9 */
    public final z2g0 b(MainViewResponse mainViewResponse) {
        uy41 uy41Var;
        xy01 xy01Var;
        f820 f820Var;
        yo20 yo20Var;
        f820 f820Var2;
        Parcelable xo20Var;
        ?? uo20Var;
        Parcelable to20Var;
        int i;
        int i2;
        int i3;
        h290 h290VarQ = mainViewResponse.q();
        ArrayList arrayList = new ArrayList();
        Iterator it = h290VarQ.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            uy41Var = this.a;
            if (!zHasNext) {
                break;
            }
            lby lbyVarB = uy41Var.b((Entity) it.next());
            if (lbyVarB != null) {
                arrayList.add(lbyVarB);
            }
        }
        String nextPageToken = mainViewResponse.getNextPageToken();
        f820 f820Var3 = null;
        if (mainViewResponse.v()) {
            Recommendations recommendationsR = mainViewResponse.r();
            switch (recommendationsR.p()) {
                case RECOMMENDATIONS_TYPE_UNKNOWN:
                    i3 = 1;
                    break;
                case RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_ARTIST:
                    i3 = 2;
                    break;
                case RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_GENRE:
                    i3 = 3;
                    break;
                case RECOMMENDATIONS_TYPE_PODCASTS_FOR_CATEGORY:
                    i3 = 4;
                    break;
                case RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_TRACK:
                    i3 = 5;
                    break;
                case RECOMMENDATIONS_TYPE_PERSONALIZED_PODCASTS_FOR_CATEGORY:
                    i3 = 7;
                    break;
                case UNRECOGNIZED:
                    i3 = 8;
                    break;
                default:
                    eg.o();
                    return null;
            }
            h290 h290VarO = recommendationsR.o();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = h290VarO.iterator();
            while (it2.hasNext()) {
                lby lbyVarB2 = uy41Var.b((Entity) it2.next());
                if (lbyVarB2 != null) {
                    arrayList2.add(lbyVarB2);
                }
            }
            xy01Var = new xy01(i3, arrayList2);
        } else {
            xy01Var = null;
        }
        o5a o5aVarA = mainViewResponse.s() ? a(mainViewResponse.n()) : null;
        if (mainViewResponse.u()) {
            h290<Filter> h290VarO2 = mainViewResponse.p().o();
            ArrayList arrayList3 = new ArrayList();
            for (Filter filter : h290VarO2) {
                String id = filter.getId();
                int iP = filter.p();
                int i4 = iP == 0 ? -1 : zo20.a[l1d.C(iP)];
                if (i4 != -1 && i4 != 1) {
                    if (i4 == 2) {
                        int i5 = zo20.b[filter.n().o().ordinal()];
                        if (i5 != -1) {
                            if (i5 == 1) {
                                i = 1;
                            } else if (i5 == 2) {
                                i = 2;
                            } else if (i5 == 3) {
                                i = 3;
                            } else if (i5 != 4 && i5 != 5) {
                                eg.o();
                                return f820Var3;
                            }
                            to20Var = new to20(i);
                            uo20Var = to20Var;
                        }
                    } else if (i4 == 3) {
                        int i6 = zo20.c[filter.q().o().ordinal()];
                        if (i6 != -1) {
                            if (i6 == 1) {
                                to20Var = new vo20(1);
                                uo20Var = to20Var;
                            } else if (i6 != 2 && i6 != 3) {
                                eg.o();
                                return f820Var3;
                            }
                        }
                    } else {
                        if (i4 != 4) {
                            eg.o();
                            return f820Var3;
                        }
                        switch (filter.o().o()) {
                            case ENTITY_FILTER_TYPE_UNKNOWN:
                            case UNRECOGNIZED:
                                uo20Var = f820Var3;
                                break;
                            case ENTITY_FILTER_TYPE_ARTIST:
                                i2 = 2;
                                uo20Var = new uo20(i2);
                                break;
                            case ENTITY_FILTER_TYPE_TRACK:
                                i2 = 7;
                                uo20Var = new uo20(i2);
                                break;
                            case ENTITY_FILTER_TYPE_ALBUM:
                                i2 = 1;
                                uo20Var = new uo20(i2);
                                break;
                            case ENTITY_FILTER_TYPE_PLAYLIST:
                                i2 = 5;
                                uo20Var = new uo20(i2);
                                break;
                            case ENTITY_FILTER_TYPE_GENRE:
                                i2 = 4;
                                uo20Var = new uo20(i2);
                                break;
                            case ENTITY_FILTER_TYPE_PROFILE:
                                i2 = 6;
                                uo20Var = new uo20(i2);
                                break;
                            case ENTITY_FILTER_TYPE_AUDIOBOOK:
                                i2 = 3;
                                uo20Var = new uo20(i2);
                                break;
                            default:
                                eg.o();
                                return f820Var3;
                        }
                    }
                }
                if (uo20Var == 0) {
                    uo20Var = f820Var3;
                    uo20Var = f820Var3;
                    uo20Var = f820Var3;
                    uo20Var = f820Var3;
                    uo20Var = f820Var3;
                    uo20Var = f820Var3;
                    uo20Var = f820Var3;
                    uo20Var = f820Var3;
                    xo20Var = f820Var3;
                } else {
                    uo20Var = f820Var3;
                    uo20Var = f820Var3;
                    uo20Var = f820Var3;
                    uo20Var = f820Var3;
                    uo20Var = f820Var3;
                    uo20Var = f820Var3;
                    uo20Var = f820Var3;
                    uo20Var = f820Var3;
                    xo20Var = new xo20(id, uo20Var);
                }
                if (xo20Var != null) {
                    arrayList3.add(xo20Var);
                }
                f820Var3 = f820Var3;
            }
            f820Var = f820Var3;
            yo20Var = new yo20(arrayList3);
        } else {
            f820Var = null;
            yo20Var = null;
        }
        if (mainViewResponse.t()) {
            h290<FilterOption> h290VarO3 = mainViewResponse.o().o();
            ArrayList arrayList4 = new ArrayList(q7h.U(h290VarO3, 10));
            for (FilterOption filterOption : h290VarO3) {
                arrayList4.add(new db20(filterOption.n(), filterOption.getDisplayName(), filterOption.o()));
            }
            f820Var2 = new f820(arrayList4);
        } else {
            f820Var2 = f820Var;
        }
        return new z2g0(arrayList, nextPageToken, xy01Var, o5aVarA, yo20Var, f820Var2);
    }
}
