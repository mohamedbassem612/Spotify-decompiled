package p;

import com.spotify.deeplinkimpl.events.proto.ShortlinkOpenAttempt;
import com.spotify.deeplinkimpl.events.proto.ShortlinkOpenResult;
import com.spotify.devicepredictability.proximitydetector.events.proto.DevicePredictabilityProximityDetection;
import com.spotify.voiceassistants.playermodels.ParsedQueryKt;
import com.spotify.widget.eventloggerimpl.events.proto.WidgetLifecycleEvent;
import com.spotify.widgets.recommendationswidget.events.proto.NpvRecommendationsWidgetErrorEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ae5 {
    public final t2j0 a;

    public void a(String str, String str2, Throwable th) {
        h9p0 h9p0VarN = NpvRecommendationsWidgetErrorEvent.n();
        h9p0VarN.n("COLOR_EXTRACTION_ERROR");
        h9p0VarN.s(str);
        h9p0VarN.r(j2h1.I(th));
        h9p0VarN.q(str2);
        this.a.a(h9p0VarN.build());
    }

    public void b(String str, fi9 fi9Var, Set set, String str2, boolean z, boolean z2) {
        String str3;
        mut mutVarO = DevicePredictabilityProximityDetection.o();
        mutVarO.t(str);
        mutVarO.u(fi9Var.a());
        List listA1 = o7h.a1(set, new cvt((byte) 0));
        ArrayList arrayList = new ArrayList(q7h.U(listA1, 10));
        Iterator it = listA1.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((di9) it.next()).ordinal();
            if (iOrdinal == 0) {
                str3 = "IMMEDIATE";
            } else if (iOrdinal == 1) {
                str3 = "CLOSE";
            } else if (iOrdinal == 2) {
                str3 = "FAR";
            } else {
                if (iOrdinal != 3) {
                    eg.o();
                    return;
                }
                str3 = "UNKNOWN";
            }
            arrayList.add(str3);
        }
        mutVarO.n(arrayList);
        mutVarO.s(str2);
        mutVarO.q(z);
        mutVarO.r(z2);
        this.a.a(mutVarO.build());
    }

    public void c(int i, String str, String str2) {
        String str3;
        h9p0 h9p0VarN = NpvRecommendationsWidgetErrorEvent.n();
        h9p0VarN.n("PLAYBACK_ERROR");
        h9p0VarN.s(str);
        h9p0VarN.r(str2);
        switch (i) {
            case 1:
                str3 = "PLAY_URI";
                break;
            case 2:
                str3 = ParsedQueryKt.INTENT_PLAY;
                break;
            case 3:
                str3 = "PAUSE";
                break;
            case 4:
                str3 = "SKIP_NEXT";
                break;
            case 5:
                str3 = "SKIP_PREVIOUS";
                break;
            case 6:
                str3 = "SEEK_FWD_15";
                break;
            case 7:
                str3 = "SEEK_BACK_15";
                break;
            default:
                throw null;
        }
        h9p0VarN.q(str3);
        this.a.a(h9p0VarN.build());
    }

    public void d(int i, String str) {
        h9p0 h9p0VarN = NpvRecommendationsWidgetErrorEvent.n();
        h9p0VarN.n("RECOMMENDATIONS_EMPTY");
        h9p0VarN.s(str);
        h9p0VarN.q(lzu0.i(i));
        this.a.a(h9p0VarN.build());
    }

    public void e(String str, int i, Throwable th) {
        h9p0 h9p0VarN = NpvRecommendationsWidgetErrorEvent.n();
        h9p0VarN.n("RECOMMENDATIONS_ERROR");
        h9p0VarN.s(str);
        h9p0VarN.r(j2h1.I(th));
        h9p0VarN.q(lzu0.i(i));
        this.a.a(h9p0VarN.build());
    }

    public void f(String str, String str2) {
        k181 k181VarN = ShortlinkOpenAttempt.n();
        k181VarN.q(str);
        k181VarN.n(str2);
        ShortlinkOpenAttempt shortlinkOpenAttemptBuild = k181VarN.build();
        shortlinkOpenAttemptBuild.getClass();
        this.a.a(shortlinkOpenAttemptBuild);
        shortlinkOpenAttemptBuild.toString();
    }

    public void g(int i, String str, String str2) {
        l181 l181VarN = ShortlinkOpenResult.n();
        l181VarN.t(str);
        l181VarN.n(i);
        l181VarN.q(str2);
        l181VarN.u(false);
        ShortlinkOpenResult shortlinkOpenResultBuild = l181VarN.build();
        shortlinkOpenResultBuild.getClass();
        this.a.a(shortlinkOpenResultBuild);
        shortlinkOpenResultBuild.toString();
    }

    public void h(String str, String str2, String str3) {
        l181 l181VarN = ShortlinkOpenResult.n();
        l181VarN.t(str);
        l181VarN.s(str2);
        l181VarN.r(str3);
        l181VarN.u(true);
        ShortlinkOpenResult shortlinkOpenResultBuild = l181VarN.build();
        shortlinkOpenResultBuild.getClass();
        this.a.a(shortlinkOpenResultBuild);
        shortlinkOpenResultBuild.toString();
    }

    public void i(String str, int i, TimeoutException timeoutException) {
        String str2;
        h9p0 h9p0VarN = NpvRecommendationsWidgetErrorEvent.n();
        h9p0VarN.n("TIMEOUT");
        h9p0VarN.s(str);
        if (i == 1) {
            str2 = "Media Browser Service";
        } else if (i == 2) {
            str2 = "Session State";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "Unclear";
        }
        h9p0VarN.q(str2);
        h9p0VarN.r(j2h1.I(timeoutException));
        this.a.a(h9p0VarN.build());
    }

    public void j() {
        cpl1 cpl1VarN = WidgetLifecycleEvent.n();
        cpl1VarN.n(bb00.b(1));
        this.a.a(cpl1VarN.build());
    }

    public void k(int[] iArr) {
        for (int i : iArr) {
            cpl1 cpl1VarN = WidgetLifecycleEvent.n();
            cpl1VarN.n(bb00.b(2));
            cpl1VarN.q(i);
            this.a.a(cpl1VarN.build());
        }
    }
}
