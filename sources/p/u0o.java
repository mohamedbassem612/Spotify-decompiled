package p;

import com.google.protobuf.Any;
import com.spotify.watchfeed.component.item.v1.CreatorFollowRowComponent;
import com.spotify.watchfeed.component.model.v1.proto.Artwork;
import com.spotify.watchfeed.component.model.v1.proto.LabeledCircle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u0o implements j0i {
    public final kly0 a;

    public u0o(jly0 jly0Var) {
        this.a = jly0Var;
    }

    @Override // p.j0i
    public final z0i a(Any any) {
        p0o p0oVar;
        CreatorFollowRowComponent creatorFollowRowComponentR = CreatorFollowRowComponent.r(any.q());
        String strO = creatorFollowRowComponentR.o();
        String strP = creatorFollowRowComponentR.q().p();
        Artwork artworkN = creatorFollowRowComponentR.q().n();
        if (artworkN != null) {
            String uri = artworkN.getUri();
            String strName = artworkN.n().name();
            int i = 0;
            if (strName == null) {
                bhn0.i("Name is null");
            } else if (strName.equals("DEFAULT")) {
                i = 1;
            } else if (strName.equals("ARTIST")) {
                i = 2;
            } else if (strName.equals("SHOW")) {
                i = 3;
            } else if (strName.equals("USER")) {
                i = 4;
            } else {
                hhg1.n("No enum constant com.spotify.watchfeed.components.creatorfollowrowcomponent.CreatorFollowRowComponent.ArtworkType.".concat(strName));
            }
            p0oVar = new p0o(uri, i);
        } else {
            p0oVar = null;
        }
        LabeledCircle labeledCircleQ = creatorFollowRowComponentR.q().q();
        return new t0o(strO, new s0o(strP, p0oVar, labeledCircleQ != null ? new r0o(labeledCircleQ.p(), labeledCircleQ.n()) : null), creatorFollowRowComponentR.getTitle(), creatorFollowRowComponentR.getSubtitle(), new q0o(creatorFollowRowComponentR.p().p(), creatorFollowRowComponentR.p().r(), creatorFollowRowComponentR.p().o(), creatorFollowRowComponentR.p().q()), creatorFollowRowComponentR.n());
    }

    @Override // p.j0i
    public final Class b() {
        return t0o.class;
    }

    @Override // p.j0i
    public final o1i c() {
        return (o1i) this.a.get();
    }
}
