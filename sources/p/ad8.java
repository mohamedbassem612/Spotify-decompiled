package p;

import com.spotify.extendedmetadata.extensions.audiobookspecificsimpl.proto.AudiobookSpecifics;
import com.spotify.extendedmetadata.extensions.audiobookspecificsimpl.proto.Credits;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ad8 implements ov00 {
    public final ez00 a(byte[] bArr) {
        AudiobookSpecifics audiobookSpecificsV = AudiobookSpecifics.v(bArr);
        String uri = audiobookSpecificsV.getUri();
        String strQ = audiobookSpecificsV.q();
        Credits creditsN = audiobookSpecificsV.n();
        h290<Credits.Author> h290VarN = creditsN.n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (Credits.Author author : h290VarN) {
            author.getClass();
            arrayList.add(new l6o(author.getName()));
        }
        h290<Credits.Narrator> h290VarP = creditsN.p();
        ArrayList arrayList2 = new ArrayList(q7h.U(h290VarP, 10));
        for (Credits.Narrator narrator : h290VarP) {
            narrator.getClass();
            arrayList2.add(new n6o(narrator.getName()));
        }
        h290<Credits.Publisher> h290VarQ = creditsN.q();
        ArrayList arrayList3 = new ArrayList(q7h.U(h290VarQ, 10));
        for (Credits.Publisher publisher : h290VarQ) {
            publisher.getClass();
            arrayList3.add(new o6o(publisher.getName()));
        }
        return new zc8(uri, strQ, new p6o(arrayList, arrayList2, arrayList3), audiobookSpecificsV.p(), audiobookSpecificsV.o(), audiobookSpecificsV.r().q(), audiobookSpecificsV.t(), audiobookSpecificsV.s(), audiobookSpecificsV.u());
    }

    public final int b() {
        return 52;
    }

    public final Class type() {
        return zc8.class;
    }
}
