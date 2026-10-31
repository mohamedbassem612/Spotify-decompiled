package p;

import com.spotify.carmobile.waze.WazeReturnActivity;
import com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService;
import com.spotify.widgets.npvwidget.WidgetsProxyActivity;
import com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider;
import com.spotify.xrprojected.ui.XrProjectedActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pjq implements cl4 {
    public final /* synthetic */ byte a;
    public final daq b;

    public /* synthetic */ pjq(daq daqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }

    public final dl4 a(Object obj) {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 0:
                return new ojq(daqVar, (SpotifyMediaLibraryService) obj);
            case 1:
                return new n0q(daqVar, (byte) 4);
            case 2:
                return new p0q(daqVar, (byte) 6);
            case 3:
                return new f9p(daqVar, (TranssionCardWidgetProvider) obj);
            case 4:
                return new tjq(daqVar, (WazeReturnActivity) obj);
            case 5:
                return new b1q(daqVar, (byte) 9);
            case 6:
                return new jzp(daqVar, (byte) 3);
            case 7:
                return new pbq(daqVar, (WidgetsProxyActivity) obj);
            default:
                return new ip31(daqVar, (XrProjectedActivity) obj);
        }
    }
}
