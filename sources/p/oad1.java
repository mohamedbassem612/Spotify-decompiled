package p;

import android.graphics.Color;
import com.google.protobuf.Any;
import com.spotify.watchfeed.component.content.v1.TrackPreviewContent;
import com.spotify.watchfeed.component.content.v1.VideoContent;
import com.spotify.watchfeed.component.item.v1.SwipeUpHintRowComponent;
import com.spotify.watchfeed.component.item.v1.TextHeaderBodyComponent;
import com.spotify.watchfeed.component.item.v1.TranscriptRowComponent;
import com.spotify.watchfeed.component.item.v1.proto.TrackContextMenuButtonComponent;
import com.spotify.watchfeed.component.model.v1.proto.Album;
import com.spotify.watchfeed.component.model.v1.proto.Artist;
import com.spotify.watchfeed.component.model.v1.proto.Track;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oad1 implements j0i {
    public final /* synthetic */ byte a;
    public final kly0 b;

    public /* synthetic */ oad1(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.j0i
    public final z0i a(Any any) {
        idg1 idg1VarValueOf = null;
        switch (this.a) {
            case 0:
                SwipeUpHintRowComponent swipeUpHintRowComponentR = SwipeUpHintRowComponent.r(any.q());
                String strP = swipeUpHintRowComponentR.p();
                long jN = swipeUpHintRowComponentR.n();
                long jO = swipeUpHintRowComponentR.o();
                try {
                    idg1VarValueOf = Integer.valueOf(Color.parseColor(swipeUpHintRowComponentR.q()));
                    break;
                } catch (Exception unused) {
                }
                return new mad1(strP, jN, jO, idg1VarValueOf);
            case 1:
                TextHeaderBodyComponent textHeaderBodyComponentQ = TextHeaderBodyComponent.q(any.q());
                return new k8e1(textHeaderBodyComponentQ.p(), textHeaderBodyComponentQ.getTitle(), textHeaderBodyComponentQ.getSubtitle(), textHeaderBodyComponentQ.o(), textHeaderBodyComponentQ.n());
            case 2:
                TrackContextMenuButtonComponent trackContextMenuButtonComponentR = TrackContextMenuButtonComponent.r(any.q());
                Track trackQ = trackContextMenuButtonComponentR.q();
                Album albumO = trackContextMenuButtonComponentR.o();
                cjm cjmVar = new cjm(trackQ.getUri(), trackQ.getName());
                dcm dcmVar = new dcm(albumO.getUri(), albumO.getName(), new dq70(albumO.n().getUrl(), albumO.n().o()));
                List<Artist> artistsList = trackContextMenuButtonComponentR.getArtistsList();
                ArrayList arrayList = new ArrayList(q7h.U(artistsList, 10));
                for (Artist artist : artistsList) {
                    arrayList.add(new ecm(artist.getUri(), artist.getName()));
                }
                return new zlf1(cjmVar, dcmVar, arrayList, trackContextMenuButtonComponentR.p(), trackContextMenuButtonComponentR.n());
            case 3:
                TrackPreviewContent trackPreviewContentW = TrackPreviewContent.w(any.q());
                return new vtf1(trackPreviewContentW.getEntityUri(), qmo1.A(trackPreviewContentW.o()), qmo1.y(trackPreviewContentW.u()), trackPreviewContentW.n(), trackPreviewContentW.t(), trackPreviewContentW.r(), trackPreviewContentW.q(), trackPreviewContentW.p(), trackPreviewContentW.v() ? qmo1.z(trackPreviewContentW.s()) : null);
            case 4:
                TranscriptRowComponent transcriptRowComponentO = TranscriptRowComponent.o(any.q());
                return new idg1(new hdg1(transcriptRowComponentO.n().p(), transcriptRowComponentO.n().o(), transcriptRowComponentO.n().getUrl()), false);
            case 5:
                VideoContent videoContentZ = VideoContent.z(any.q());
                String strW = videoContentZ.w();
                clj1 clj1VarB = qmo1.B(videoContentZ.v());
                dq70 dq70VarY = qmo1.y(videoContentZ.t());
                boolean zS = videoContentZ.s();
                String strN = videoContentZ.n();
                boolean zQ = videoContentZ.q();
                boolean zP = videoContentZ.p();
                return new gij1(strW, clj1VarB, dq70VarY, zS, videoContentZ.getTitle(), zQ, zP, videoContentZ.y() ? new idg1(new hdg1(videoContentZ.u().p(), videoContentZ.u().o(), videoContentZ.u().getUrl()), true) : null, videoContentZ.o(), strN, videoContentZ.x() ? qmo1.z(videoContentZ.r()) : null);
            default:
                return tam1.a;
        }
    }

    @Override // p.j0i
    public final Class b() {
        switch (this.a) {
            case 0:
                return mad1.class;
            case 1:
                return k8e1.class;
            case 2:
                return zlf1.class;
            case 3:
                return vtf1.class;
            case 4:
                return idg1.class;
            case 5:
                return gij1.class;
            default:
                return tam1.class;
        }
    }

    @Override // p.j0i
    public final o1i c() {
        byte b = this.a;
        kly0 kly0Var = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return (o1i) kly0Var.get();
    }
}
