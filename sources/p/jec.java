package p;

import com.spotify.wrapped.v1.proto.ButtonConfiguration;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public interface jec {
    static iec a(zxl1 zxl1Var, ButtonConfiguration buttonConfiguration, q8m1 q8m1Var, String str, int i) {
        iec iecVar;
        iec iecVar2;
        byte b = 1;
        int i2 = (i & 16) != 0 ? 1 : 2;
        rec recVar = (rec) zxl1Var.b;
        int iN = buttonConfiguration.n().n();
        byte b2 = 0;
        switch (iN == 0 ? -1 : kec.a[l1d.C(iN)]) {
            case 1:
                cik1 cik1Var = recVar.b;
                gec gecVar = q8m1Var.c;
                iecVar = new iec((15 & 1) != 0 ? gecVar : null, (15 & 2) != 0 ? gecVar : null, new huz(Boolean.TRUE, (byte) 10), 1, (15 & 16) != 0 ? new s8m1(q8m1Var, cik1Var, b2) : new mec(recVar, str, q8m1Var, b));
                break;
            case 2:
                String playlistUri = buttonConfiguration.n().q().getPlaylistUri();
                if (playlistUri == null || ihc1.y0(playlistUri)) {
                    eg.m("Missing playlist URI");
                    iecVar = null;
                } else {
                    String playlistUri2 = buttonConfiguration.n().q().getPlaylistUri();
                    gec gecVarC = rec.c(buttonConfiguration.q());
                    gec gecVarC2 = rec.c(buttonConfiguration.p());
                    qec qecVar = new qec(buttonConfiguration.n(), 1, recVar, str);
                    vwm1 vwm1Var = recVar.f;
                    ssm1 ssm1VarQ = YourLibraryContainsRequest.q();
                    ssm1VarQ.q(playlistUri2);
                    iecVar = new iec(gecVarC, gecVarC2, new ik(new uji1(vwm1Var.callStream("spotify.your_library_esperanto.proto.YourLibraryService", "StreamContains", ssm1VarQ.build()), (byte) 13), (byte) 21), 2, qecVar);
                }
                break;
            case 3:
                String strO = buttonConfiguration.n().r().o();
                Set set = s4b1.f;
                if (uic.x(strO).c != blc0.ti) {
                    hhg1.f(l1d.m("Invalid Spotify track URI: ", strO));
                    iecVar = null;
                } else {
                    gec gecVarC3 = rec.c(buttonConfiguration.q());
                    gec gecVarC4 = rec.c(buttonConfiguration.p());
                    mec mecVar = new mec(recVar, str, strO, b2);
                    hce1 hce1Var = recVar.i;
                    strO.getClass();
                    iecVar2 = new iec(gecVarC3, gecVarC4, new nf(hce1Var.z(strO), (byte) 28), buttonConfiguration.r() ? 2 : 0, mecVar);
                    iecVar = iecVar2;
                }
                break;
            case 4:
            case 5:
            case 6:
                gec gecVarC5 = rec.c(buttonConfiguration.q());
                iecVar2 = new iec(gecVarC5, gecVarC5, new huz(Boolean.TRUE, (byte) 10), buttonConfiguration.r() ? 2 : 0, new qec(buttonConfiguration.n(), i2, recVar, str));
                iecVar = iecVar2;
                break;
            default:
                k220.f("Unexpected action type: ".concat(x0d.y(buttonConfiguration.n().n())));
                iecVar = null;
                break;
        }
        return iec.a(iecVar, null, null, new s8m1((obm1) zxl1Var.c, iecVar.e, b), 15);
    }
}
