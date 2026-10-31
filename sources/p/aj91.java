package p;

import androidx.work.WorkerParameters;
import com.spotify.androidx.workmanager.SpotifyRxWorker;
import com.spotify.player.esperanto.proto.EsGetStateRequest;
import com.spotify.player.esperanto.proto.EsOptional;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfig;
import spotify.your_library.proto.YourLibraryConfig$YourLibrarySortOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aj91 implements Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aj91(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        List listL1;
        ksm1 ksm1Var;
        switch (this.a) {
            case 0:
                r961 r961Var = (r961) this.b;
                synchronized (r961Var.c) {
                    listL1 = o7h.l1((ArrayList) r961Var.d);
                    ((ArrayList) r961Var.d).clear();
                }
                return ((Subject) ((r961) this.b).b).startWithIterable(listL1);
            case 1:
                ujm ujmVar = (ujm) this.b;
                pnz pnzVarO = EsGetStateRequest.GetStateRequest.o();
                qpz qpzVarP = EsOptional.OptionalInt64.p();
                qpzVarP.n(0L);
                pnzVarO.r(qpzVarP.build());
                qpz qpzVarP2 = EsOptional.OptionalInt64.p();
                qpzVarP2.n(1L);
                pnzVarO.n(qpzVarP2.build());
                return ujmVar.callStream("spotify.player.esperanto.proto.ContextPlayer", "GetState", pnzVarO.build()).map(qz70.S0);
            case 2:
                SpotifyRxWorker spotifyRxWorker = (SpotifyRxWorker) this.b;
                zvl1 zvl1Var = spotifyRxWorker.g;
                String simpleName = spotifyRxWorker.getClass().getSimpleName();
                String name = spotifyRxWorker.getClass().getName();
                WorkerParameters workerParameters = spotifyRxWorker.f;
                zvl1Var.f(simpleName, name, workerParameters.c, workerParameters.a.toString());
                return spotifyRxWorker.g();
            case 3:
                return new bbc1(((jac1) this.b).c);
            case 4:
                qsm1 qsm1VarN = YourLibraryConfig$YourLibrarySortOrder.n();
                qsm1VarN.n(rsm1.RECENTLY_PLAYED_OR_ADDED);
                YourLibraryConfig$YourLibrarySortOrder yourLibraryConfig$YourLibrarySortOrder = (YourLibraryConfig$YourLibrarySortOrder) qsm1VarN.build();
                jsm1 jsm1VarR = YourLibraryConfig$YourLibraryFilters.r();
                jsm1VarR.q(ksm1.DOWNLOADED);
                jsm1VarR.q(ksm1.PLAYLIST);
                jsm1VarR.q(ksm1.ALBUM);
                YourLibraryConfig$YourLibraryFilters yourLibraryConfig$YourLibraryFilters = (YourLibraryConfig$YourLibraryFilters) jsm1VarR.build();
                hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
                hvm1VarQ.I(yourLibraryConfig$YourLibrarySortOrder);
                hvm1VarQ.u(yourLibraryConfig$YourLibraryFilters);
                hvm1VarQ.q(true);
                hvm1VarQ.C(50);
                YourLibraryRequestHeader yourLibraryRequestHeader = (YourLibraryRequestHeader) hvm1VarQ.build();
                gvm1 gvm1VarO = YourLibraryRequest.o();
                gvm1VarO.q(yourLibraryRequestHeader);
                i2i1 i2i1Var = (i2i1) this.b;
                psm1 psm1VarP = YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.p();
                nsm1 nsm1VarO = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.o();
                nsm1VarO.q(osm1.INCLUDE_IF_NOT_EMPTY);
                psm1VarP.v((YourLibraryConfig$YourLibraryPredefinedPlaylistConfig) nsm1VarO.build());
                gvm1VarO.s((YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs) psm1VarP.build());
                gvm1VarO.t(1000);
                YourLibraryRequest yourLibraryRequest = (YourLibraryRequest) gvm1VarO.build();
                mwm1 mwm1Var = (mwm1) i2i1Var.b;
                yourLibraryRequest.getClass();
                return mwm1Var.b(yourLibraryRequest).takeUntil(i5x0.X0).map(new kum1(i2i1Var));
            default:
                qsm1 qsm1VarN2 = YourLibraryConfig$YourLibrarySortOrder.n();
                qsm1VarN2.n(rsm1.RECENTLY_PLAYED_OR_ADDED);
                YourLibraryConfig$YourLibrarySortOrder yourLibraryConfig$YourLibrarySortOrder2 = (YourLibraryConfig$YourLibrarySortOrder) qsm1VarN2.build();
                jsm1 jsm1VarR2 = YourLibraryConfig$YourLibraryFilters.r();
                lum1 lum1Var = (lum1) this.b;
                jsm1VarR2.q(ksm1.DOWNLOADED);
                ium1 ium1Var = lum1Var.a;
                Set set = ium1Var.a;
                ArrayList arrayList = new ArrayList();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int iOrdinal = ((jum1) it.next()).ordinal();
                    if (iOrdinal == 0) {
                        ksm1Var = ksm1.ALBUM;
                    } else if (iOrdinal != 1) {
                        ksm1Var = iOrdinal != 3 ? null : ksm1.PLAYLIST;
                    } else {
                        ksm1Var = ksm1.BOOK;
                    }
                    if (ksm1Var != null) {
                        arrayList.add(ksm1Var);
                    }
                }
                Iterator it2 = o7h.p1(arrayList).iterator();
                while (it2.hasNext()) {
                    jsm1VarR2.q((ksm1) it2.next());
                }
                YourLibraryConfig$YourLibraryFilters yourLibraryConfig$YourLibraryFilters2 = (YourLibraryConfig$YourLibraryFilters) jsm1VarR2.build();
                hvm1 hvm1VarQ2 = YourLibraryRequestHeader.q();
                hvm1VarQ2.I(yourLibraryConfig$YourLibrarySortOrder2);
                hvm1VarQ2.u(yourLibraryConfig$YourLibraryFilters2);
                hvm1VarQ2.q(true);
                hvm1VarQ2.L();
                hvm1VarQ2.C(20);
                YourLibraryRequestHeader yourLibraryRequestHeader2 = (YourLibraryRequestHeader) hvm1VarQ2.build();
                gvm1 gvm1VarO2 = YourLibraryRequest.o();
                gvm1VarO2.q(yourLibraryRequestHeader2);
                gvm1VarO2.t(1000);
                if (ium1Var.a.contains(jum1.c)) {
                    psm1 psm1VarP2 = YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.p();
                    nsm1 nsm1VarO2 = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.o();
                    nsm1VarO2.q(osm1.INCLUDE_IF_NOT_EMPTY);
                    psm1VarP2.v((YourLibraryConfig$YourLibraryPredefinedPlaylistConfig) nsm1VarO2.build());
                    gvm1VarO2.s((YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs) psm1VarP2.build());
                }
                YourLibraryRequest yourLibraryRequest2 = (YourLibraryRequest) gvm1VarO2.build();
                mwm1 mwm1Var2 = lum1Var.b;
                yourLibraryRequest2.getClass();
                return mwm1Var2.b(yourLibraryRequest2).observeOn(lum1Var.d).map(p5x0.Y0).flatMap(new csj1(lum1Var, (byte) 9)).onErrorReturnItem(z6x.a);
        }
    }
}
