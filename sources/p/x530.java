package p;

import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x530 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a630 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x530(a630 a630Var, byte b) {
        super(1);
        this.a = b;
        this.b = a630Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        a630 a630Var = this.b;
        switch (b) {
            case 0:
                Set set = (Set) obj;
                a630Var.X.a(set);
                MobiusLoop mobiusLoop = a630Var.Y.b;
                if (mobiusLoop == null) {
                    u890.C("loop");
                    throw null;
                }
                mobiusLoop.a(new ewu(set, false));
                MobiusLoop mobiusLoop2 = a630Var.Z.b;
                if (mobiusLoop2 == null) {
                    u890.C("loop");
                    throw null;
                }
                mobiusLoop2.a(new kae(set));
                MobiusLoop mobiusLoop3 = a630Var.O0.b;
                if (mobiusLoop3 == null) {
                    u890.C("loop");
                    throw null;
                }
                mobiusLoop3.a(new g9v0(set));
                MobiusLoop mobiusLoop4 = a630Var.P0.b;
                if (mobiusLoop4 == null) {
                    u890.C("loop");
                    throw null;
                }
                mobiusLoop4.a(new z421(set));
                MobiusLoop mobiusLoop5 = a630Var.Q0.c;
                if (mobiusLoop5 == null) {
                    u890.C("loop");
                    throw null;
                }
                mobiusLoop5.a(new ygx0(set));
                boolean zD = a630Var.S0.d();
                mwn mwnVar = a630Var.t;
                if (zD) {
                    List listSingletonList = Collections.singletonList("include-prompted-playlists");
                    mwnVar.f = "spotify:list:whats-new:podcasts";
                    mwnVar.g = listSingletonList;
                } else {
                    mwnVar.f = "spotify:list:whats-new:podcasts";
                    mwnVar.g = z6x.a;
                }
                a630Var.R0.c.a(new vc2(o7h.l1(set)));
                return rih1Var;
            case 1:
                p410 p410Var = a630Var.g;
                s530 s530Var = a630Var.i;
                xj61 xj61VarB = s530Var.b();
                g3d0 g3d0VarC = s530Var.c();
                bpb1 bpb1Var = (bpb1) p410Var.h;
                bpb1Var.m((Object) null, new o530(xj61VarB, g3d0VarC));
                gvm1 gvm1VarO = YourLibraryRequest.o();
                hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
                hvm1VarQ.C(50);
                jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
                jsm1VarR.q(ksm1.e);
                hvm1VarQ.u(jsm1VarR.build());
                qsm1 qsm1VarN = YourLibraryConfig.YourLibrarySortOrder.n();
                qsm1VarN.n(rsm1.c);
                hvm1VarQ.I(qsm1VarN.build());
                gvm1VarO.q(hvm1VarQ.build());
                YourLibraryRequest yourLibraryRequestBuild = gvm1VarO.build();
                mwm1 mwm1Var = (mwm1) p410Var.b;
                yourLibraryRequestBuild.getClass();
                Observable map = mwm1Var.b(yourLibraryRequestBuild).map(new ekb(p410Var, (byte) 11));
                Disposable disposableSubscribe = map.map(ta20.c).distinctUntilChanged().flatMapCompletable(new fey(p410Var, (byte) 11)).subscribe();
                vku vkuVar = (vku) p410Var.g;
                disposableSubscribe.getClass();
                vkuVar.a(disposableSubscribe);
                Disposable disposableSubscribe2 = map.map(ua20.c).distinctUntilChanged().subscribe(new q530(p410Var, (byte) 1));
                disposableSubscribe2.getClass();
                vkuVar.a(disposableSubscribe2);
                Disposable disposableSubscribe3 = yoi1.i(hu20.e(bpb1Var, new uls((lnm) null, p410Var, (byte) 19)), o6x.a).map(new laz(p410Var, (byte) 9)).subscribe(new q530(p410Var, (byte) 0));
                disposableSubscribe3.getClass();
                vkuVar.a(disposableSubscribe3);
                return new evz(new fu20(new mt((bpb1) p410Var.f, (byte) 14), new h210(a630Var, (lnm) null, (byte) 11), (byte) 1), a630Var, (byte) 19);
            default:
                vgr vgrVar = a630Var.e;
                n530 n530Var = new n530(vgrVar, (byte) 3);
                i330 i330Var = i330.U0;
                wo10 wo10Var = wo10.Z0;
                LinkedHashMap linkedHashMap = ((ji50) obj).b;
                fc3 fc3Var = new fc3(n530Var, (byte) 5);
                b7x b7xVar = b7x.a;
                linkedHashMap.put(xvu0.class, new vw21(i330Var, b7xVar, fc3Var, wo10Var, (vu30) null));
                n530 n530Var2 = new n530(vgrVar, (byte) 4);
                linkedHashMap.put(n460.class, new vw21(i330.V0, b7xVar, new fc3(n530Var2, (byte) 5), wo10.a1, (vu30) null));
                n530 n530Var3 = new n530(vgrVar, (byte) 5);
                linkedHashMap.put(h720.class, new vw21(i330.W0, b7xVar, new fc3(n530Var3, (byte) 5), wo10.b1, (vu30) null));
                n530 n530Var4 = new n530(vgrVar, (byte) 0);
                boolean z = vgrVar.a;
                Map mapJ = sqg0.J(new mmr0[]{new mmr0(0, dm61.B0(new yp21[]{new yp21(den.class), null})), new mmr0(1, dm61.x0(new yp21(vn71.class), kqn1.s(false, z)))});
                linkedHashMap.put(vo11.class, new vw21(ou11.b, mapJ, new fc3(n530Var4, (byte) 5), wo10.W0, (vu30) null));
                n530 n530Var5 = new n530(vgrVar, (byte) 1);
                linkedHashMap.put(se31.class, new vw21(i330.S0, b7xVar, new fc3(n530Var5, (byte) 5), wo10.X0, (vu30) null));
                n530 n530Var6 = new n530(vgrVar, (byte) 2);
                linkedHashMap.put(jd5.class, new vw21(i330.T0, b7xVar, new fc3(n530Var6, (byte) 5), wo10.Y0, (vu30) null));
                return rih1Var;
        }
    }
}
