package p;

import com.spotify.paragraph.v1.proto.Paragraph;
import com.spotify.wrapped.v1.proto.a0;
import com.spotify.wrapped.v1.proto.e0;
import com.spotify.wrapped.v1.proto.v;
import com.spotify.wrapped.v1.proto.z;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class b761 {
    public static d761 a(Paragraph paragraph) {
        com.spotify.wrapped.v1.proto.Paragraph paragraph2;
        e0 e0VarY = com.spotify.wrapped.v1.proto.Paragraph.TextStyle.y();
        e0VarY.q(paragraph.o().p());
        e0VarY.r(paragraph.o().q());
        e0VarY.n(bpr0.f(paragraph.o().o()));
        com.spotify.wrapped.v1.proto.Paragraph.TextStyle textStyle = (com.spotify.wrapped.v1.proto.Paragraph.TextStyle) e0VarY.build();
        if (paragraph.p() == 0) {
            v vVarV = com.spotify.wrapped.v1.proto.Paragraph.v();
            a0 a0VarX = com.spotify.wrapped.v1.proto.Paragraph.Single.x();
            a0VarX.n(textStyle);
            vVarV.t((com.spotify.wrapped.v1.proto.Paragraph.Single) a0VarX.build());
            paragraph2 = (com.spotify.wrapped.v1.proto.Paragraph) vVarV.build();
        } else {
            v vVarV2 = com.spotify.wrapped.v1.proto.Paragraph.v();
            z zVarX = com.spotify.wrapped.v1.proto.Paragraph.Multi.x();
            zVarX.q(textStyle);
            h290<Paragraph.TextStyle> h290VarQ = paragraph.q();
            ArrayList arrayList = new ArrayList(q7h.U(h290VarQ, 10));
            for (Paragraph.TextStyle textStyle2 : h290VarQ) {
                e0 e0VarY2 = com.spotify.wrapped.v1.proto.Paragraph.TextStyle.y();
                e0VarY2.q(textStyle2.p());
                e0VarY2.r(textStyle2.q());
                e0VarY2.n(bpr0.f(textStyle2.o()));
                arrayList.add((com.spotify.wrapped.v1.proto.Paragraph.TextStyle) e0VarY2.build());
            }
            zVarX.n(arrayList);
            vVarV2.r((com.spotify.wrapped.v1.proto.Paragraph.Multi) zVarX.build());
            paragraph2 = (com.spotify.wrapped.v1.proto.Paragraph) vVarV2.build();
        }
        return new d761(paragraph2.toByteArray());
    }
}
