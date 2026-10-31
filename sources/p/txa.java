package p;

import android.net.Uri;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class txa {
    public static final String a(String str) {
        Uri uri = Uri.parse(str);
        return uri.getScheme() + "://" + uri.getAuthority() + uri.getPath();
    }

    public static final List b(WidgetState widgetState) {
        if (widgetState instanceof WidgetState.ActiveSession) {
            WidgetState.ActiveSession activeSession = (WidgetState.ActiveSession) widgetState;
            List listX = k4p1.x(oqn1.n(activeSession.getMetadata().getArtwork(), activeSession.getMetadata().getDownloadableUrl()));
            List<u011> recommendations = activeSession.getRecommendations();
            ArrayList arrayList = new ArrayList(q7h.U(recommendations, 10));
            for (u011 u011Var : recommendations) {
                arrayList.add(oqn1.n(u011Var.b(), u011Var.g()));
            }
            return o7h.N0(arrayList, listX);
        }
        if (widgetState instanceof WidgetState.InactiveSession) {
            WidgetState.InactiveSession inactiveSession = (WidgetState.InactiveSession) widgetState;
            List listX2 = k4p1.x(oqn1.n(inactiveSession.getMetadata().a(), inactiveSession.getMetadata().b()));
            List<u011> recommendations2 = inactiveSession.getRecommendations();
            ArrayList arrayList2 = new ArrayList(q7h.U(recommendations2, 10));
            for (u011 u011Var2 : recommendations2) {
                arrayList2.add(oqn1.n(u011Var2.b(), u011Var2.g()));
            }
            return o7h.N0(arrayList2, listX2);
        }
        if (!(widgetState instanceof WidgetState.Unauthenticated)) {
            return z6x.a;
        }
        List<u011> recommendations3 = ((WidgetState.Unauthenticated) widgetState).getRecommendations();
        ArrayList arrayList3 = new ArrayList(q7h.U(recommendations3, 10));
        for (u011 u011Var3 : recommendations3) {
            arrayList3.add(oqn1.n(u011Var3.b(), u011Var3.g()));
        }
        return arrayList3;
    }
}
