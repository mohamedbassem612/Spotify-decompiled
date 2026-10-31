package p;

import com.google.protobuf.Any;
import com.spotify.watchfeed.component.item.v1.CreatorRowComponent;
import com.spotify.watchfeed.component.model.v1.proto.Artwork;
import com.spotify.watchfeed.component.model.v1.proto.LabeledCircle;
import com.spotify.watchfeed.component.model.v1.proto.Visual;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f3o implements j0i {
    public final kly0 a;
    public final l6l1 b;

    public f3o(jly0 jly0Var, l6l1 l6l1Var) {
        this.a = jly0Var;
        this.b = l6l1Var;
    }

    @Override // p.j0i
    public final z0i a(Any any) {
        z2o z2oVar;
        CreatorRowComponent creatorRowComponentT = CreatorRowComponent.t(any.q());
        h290 h290VarO = creatorRowComponentT.o();
        h290 h290VarR = creatorRowComponentT.r();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarR, 10));
        Iterator it = h290VarR.iterator();
        while (true) {
            b3o b3oVar = null;
            if (!it.hasNext()) {
                break;
            }
            Visual visual = (Visual) it.next();
            String strP = visual.s() ? visual.p() : null;
            Artwork artworkN = visual.n();
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
                    hhg1.n("No enum constant com.spotify.watchfeed.components.creatorrowcomponent.CreatorRowComponent.ArtworkType.".concat(strName));
                }
                z2oVar = new z2o(uri, i);
            } else {
                z2oVar = null;
            }
            LabeledCircle labeledCircleQ = visual.q();
            if (labeledCircleQ != null) {
                b3oVar = new b3o(labeledCircleQ.p(), labeledCircleQ.n());
            }
            arrayList.add(new d3o(strP, z2oVar, b3oVar));
        }
        String title = creatorRowComponentT.getTitle();
        String subtitle = creatorRowComponentT.getSubtitle();
        a3o a3oVar = creatorRowComponentT.s() ? new a3o(creatorRowComponentT.p().q(), creatorRowComponentT.p().p(), creatorRowComponentT.p().s(), creatorRowComponentT.p().o(), creatorRowComponentT.p().r()) : null;
        String strO = creatorRowComponentT.q().o();
        Any anyP = creatorRowComponentT.q().p();
        return new e3o(h290VarO, arrayList, title, subtitle, a3oVar, new c3o(strO, anyP != null ? this.b.b(anyP) : null), creatorRowComponentT.n());
    }

    @Override // p.j0i
    public final Class b() {
        return e3o.class;
    }

    @Override // p.j0i
    public final o1i c() {
        return (o1i) this.a.get();
    }
}
