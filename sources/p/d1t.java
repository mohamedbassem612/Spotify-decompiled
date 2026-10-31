package p;

import java.util.ArrayList;
import java.util.List;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.esperanto.proto.YourLibraryResponseHeader;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d1t implements vu30 {
    public final e6c0 a;
    public final wnl b;
    public final a130 c;
    public final z0t d;

    public d1t(e6c0 e6c0Var, wnl wnlVar, a130 a130Var, z0t z0tVar) {
        this.a = e6c0Var;
        this.b = wnlVar;
        this.c = a130Var;
        this.d = z0tVar;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x016a  */
    public final Object invoke(Object obj, Object obj2) {
        mmr0 mmr0Var;
        String uri;
        YourLibraryResponse yourLibraryResponse = (YourLibraryResponse) obj;
        ivm1 ivm1Var = (ivm1) obj2;
        mml mmlVar = ivm1Var.c;
        Integer num = ivm1Var.b;
        if (mmlVar == null) {
            hhg1.n("YourLibraryResponseListUpdateMapper requires First, container values to be passed");
            return null;
        }
        int iIntValue = num.intValue();
        of20 of20Var = ivm1Var.a;
        boolean zBooleanValue = ((Boolean) this.c.invoke(yourLibraryResponse)).booleanValue();
        tr80 tr80VarQ = zBooleanValue ? tr80.d : yoi1.Q(iIntValue, yourLibraryResponse.a() + iIntValue);
        i8e0 i8e0Var = new i8e0(zBooleanValue ? 0 : yourLibraryResponse.q().v(), tr80VarQ, u1p1.F(yourLibraryResponse.n()), u1p1.F(yourLibraryResponse.r()), this.a.b(mmlVar instanceof iml, zBooleanValue && yourLibraryResponse.r().isEmpty(), yourLibraryResponse.q(), of20Var.b, of20Var.a), yourLibraryResponse.q().r(), yourLibraryResponse.q().s());
        YourLibraryResponseHeader yourLibraryResponseHeaderQ = yourLibraryResponse.q();
        if (this.d.a.g()) {
            h290<YourLibraryConfig$YourLibraryFilters2.AvailableFilter> h290VarN = yourLibraryResponseHeaderQ.o().n();
            h290VarN.getClass();
            ArrayList<YourLibraryConfig$YourLibraryFilters2.AvailableFilter> arrayList = new ArrayList();
            for (Object obj3 : h290VarN) {
                YourLibraryConfig$YourLibraryFilters2.AvailableFilter availableFilter = (YourLibraryConfig$YourLibraryFilters2.AvailableFilter) obj3;
                if (availableFilter.p() && !ihc1.y0(availableFilter.n())) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (YourLibraryConfig$YourLibraryFilters2.AvailableFilter availableFilter2 : arrayList) {
                arrayList2.add(new vod1(0, availableFilter2.getUri(), availableFilter2.n()));
            }
            ArrayList arrayList3 = new ArrayList();
            for (YourLibraryConfig$YourLibraryFilters2.AvailableFilter availableFilter3 : h290VarN) {
                if (availableFilter3.p() && !ihc1.y0(availableFilter3.n())) {
                    uri = availableFilter3.getUri();
                } else if (availableFilter3.hasFilter()) {
                    switch (availableFilter3.o().ordinal()) {
                        case 1:
                            uri = "playlists";
                            break;
                        case 2:
                            uri = "podcasts";
                            break;
                        case 3:
                            uri = "books";
                            break;
                        case 4:
                            uri = "albums";
                            break;
                        case 5:
                            uri = "artists";
                            break;
                        case 6:
                            uri = "authors";
                            break;
                        case 7:
                            uri = "events";
                            break;
                        case 8:
                        case 11:
                        case 14:
                        case 15:
                        case 16:
                        default:
                            uri = null;
                            break;
                        case 9:
                            uri = "all_by_you";
                            break;
                        case 10:
                            uri = "all_by_spotify";
                            break;
                        case 12:
                            uri = "all_mixed";
                            break;
                        case 13:
                            uri = "all_folders";
                            break;
                        case 17:
                            uri = "in_progress";
                            break;
                        case 18:
                            uri = "unplayed";
                            break;
                        case 19:
                            uri = "finished";
                            break;
                        case 20:
                            uri = "upcoming";
                            break;
                        case 21:
                            uri = "venue";
                            break;
                        case 22:
                            uri = "past";
                            break;
                        case 23:
                            uri = "all_downloaded";
                            break;
                    }
                } else {
                    uri = null;
                }
                if (uri != null) {
                    arrayList3.add(uri);
                }
            }
            mmr0Var = new mmr0(arrayList2, arrayList3);
        } else {
            z6x z6xVar = z6x.a;
            mmr0Var = new mmr0(z6xVar, z6xVar);
        }
        return new svc0(i8e0Var, (unl) this.b.invoke(new vnl(zBooleanValue, mmlVar, yourLibraryResponse.q())), (List) mmr0Var.a, (List) mmr0Var.b);
    }
}
