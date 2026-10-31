package p;

import com.google.protobuf.h;
import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import spotify.your_library.esperanto.proto.YourLibraryDecorateRequest;
import spotify.your_library.proto.YourLibraryConfig;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class go31 implements epc0 {
    public final /* synthetic */ byte a;
    public final cik1 b;
    public final r7c0 c;

    public /* synthetic */ go31(cik1 cik1Var, r7c0 r7c0Var, byte b) {
        this.a = b;
        this.b = cik1Var;
        this.c = r7c0Var;
    }

    public final Object invoke(Object obj) {
        YourLibraryConfig$YourLibraryPredefinedPlaylistConfig yourLibraryConfig$YourLibraryPredefinedPlaylistConfigN;
        byte b = this.a;
        r7c0 r7c0Var = this.c;
        cik1 cik1Var = this.b;
        switch (b) {
            case 0:
                voc0 voc0Var = (voc0) obj;
                mml mmlVar = voc0Var.d;
                if (mmlVar instanceof jml) {
                    return cik1Var.o((p7c0) r7c0Var.invoke(new q7c0(voc0Var.b, voc0Var.c, (jml) mmlVar, voc0Var.e, voc0Var.g, voc0Var.h, voc0Var.i, voc0Var.j, voc0Var.k)));
                }
                n57.e("All requires a Root container");
                return Observable.just(new svc0(14, new a7x()));
            case 1:
                voc0 voc0Var2 = (voc0) obj;
                mml mmlVar2 = voc0Var2.d;
                if ((mmlVar2 instanceof jml) || (mmlVar2 instanceof lml)) {
                    return cik1Var.o((p7c0) r7c0Var.invoke(new q7c0(voc0Var2.b, voc0Var2.c, mmlVar2, voc0Var2.e, voc0Var2.g, voc0Var2.h, voc0Var2.i, voc0Var2.j, voc0Var2.k)));
                }
                n57.e("All requires a Root or Tag container");
                return Observable.just(new svc0(14, new a7x()));
            default:
                voc0 voc0Var3 = (voc0) obj;
                boolean z = voc0Var3.k;
                fab0 fab0Var = voc0Var3.b;
                List list = voc0Var3.f;
                mml mmlVar3 = voc0Var3.d;
                if (!(mmlVar3 instanceof kml)) {
                    n57.e("SearchListEffectUseCase only supports Search Container");
                    Observable observableJust = Observable.just(j551.a);
                    observableJust.getClass();
                    return observableJust;
                }
                kml kmlVar = (kml) mmlVar3;
                String str = kmlVar.a;
                if (str != null && str.length() != 0) {
                    tr80 tr80Var = voc0Var3.c;
                    boolean z2 = voc0Var3.h;
                    fo31 fo31Var = (fo31) r7c0Var;
                    if ((128 & 256) != 0) {
                        z = false;
                    }
                    int i = ((rr80) tr80Var).a;
                    int i2 = (((rr80) tr80Var).b + 1) - i;
                    evm1 evm1Var = fo31Var.b;
                    boolean zL = evm1Var.l();
                    boolean zH = evm1Var.h();
                    dia1 dia1Var = dia1.RECENTLY_PLAYED_OR_ADDED;
                    z6x z6xVar = z6x.a;
                    return cik1Var.o(new p7c0(i, i2, fab0Var, zL, zH, dia1Var, z2, true, false, kmlVar, z6xVar, z6xVar, z));
                }
                if (list != null && list.isEmpty()) {
                    return Observable.just(j551.a);
                }
                if (list == null) {
                    n57.e("Search requires recent searches enabled or a textFilter " + voc0Var3);
                    Observable observableJust2 = Observable.just(j551.a);
                    observableJust2.getClass();
                    return observableJust2;
                }
                boolean z3 = voc0Var3.h;
                mwm1 mwm1Var = (mwm1) cik1Var.b;
                if (z3) {
                    nsm1 nsm1VarO = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.o();
                    nsm1VarO.q(osm1.INCLUDE_ALWAYS);
                    h hVarBuild = nsm1VarO.build();
                    hVarBuild.getClass();
                    yourLibraryConfig$YourLibraryPredefinedPlaylistConfigN = (YourLibraryConfig$YourLibraryPredefinedPlaylistConfig) hVarBuild;
                } else {
                    yourLibraryConfig$YourLibraryPredefinedPlaylistConfigN = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.n();
                    yourLibraryConfig$YourLibraryPredefinedPlaylistConfigN.getClass();
                }
                psm1 psm1Var = (psm1) mqn1.J(fab0Var).toBuilder();
                psm1Var.q(yourLibraryConfig$YourLibraryPredefinedPlaylistConfigN);
                nsm1 nsm1VarO2 = YourLibraryConfig$YourLibraryPredefinedPlaylistConfig.o();
                nsm1VarO2.q(z ? osm1.INCLUDE_IF_NOT_EMPTY : osm1.EXCLUDE);
                psm1Var.x((YourLibraryConfig$YourLibraryPredefinedPlaylistConfig) nsm1VarO2.build());
                YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs yourLibraryPredefinedPlaylistConfigsBuild = psm1Var.build();
                zsm1 zsm1VarP = YourLibraryDecorateRequest.p();
                zsm1VarP.n(list);
                zsm1VarP.r(yourLibraryPredefinedPlaylistConfigsBuild);
                zsm1VarP.s();
                return mwm1Var.c((YourLibraryDecorateRequest) zsm1VarP.build()).map(new dmj1(cik1Var, (byte) 10));
        }
    }
}
