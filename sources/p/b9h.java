package p;

import com.spotify.lyrics.serviceretrofit.proto.ColorLyricsResponse;
import com.spotify.lyrics.serviceretrofit.proto.LyricsResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class b9h {
    public static final a9h a(ColorLyricsResponse colorLyricsResponse) {
        int i;
        h290<LyricsResponse.LyricsLine> h290VarR = colorLyricsResponse.p().r();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarR, 10));
        for (LyricsResponse.LyricsLine lyricsLine : h290VarR) {
            long jN = lyricsLine.n();
            String strP = lyricsLine.p();
            h290<LyricsResponse.LyricsLine.Syllable> h290VarO = lyricsLine.o();
            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, 10));
            for (LyricsResponse.LyricsLine.Syllable syllable : h290VarO) {
                arrayList2.add(new cef0((int) syllable.o(), (int) syllable.n()));
            }
            arrayList.add(new aef0(jN, strP, arrayList2));
        }
        int iOrdinal = colorLyricsResponse.p().v().ordinal();
        int i2 = 3;
        if (iOrdinal == 0) {
            i = 1;
        } else if (iOrdinal == 1) {
            i = 2;
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                eg.o();
                return null;
            }
            i = 1;
        } else {
            i = 3;
        }
        h290<LyricsResponse.Alternative> h290VarN = colorLyricsResponse.p().n();
        ArrayList arrayList3 = new ArrayList(q7h.U(h290VarN, 10));
        for (LyricsResponse.Alternative alternative : h290VarN) {
            arrayList3.add(new def0(alternative.getLanguage(), alternative.o(), alternative.n()));
        }
        String language = colorLyricsResponse.p().getLanguage();
        boolean zQ = colorLyricsResponse.p().q();
        bef0 bef0Var = new bef0(colorLyricsResponse.p().u(), colorLyricsResponse.p().s(), colorLyricsResponse.p().t());
        eef0 eef0Var = new eef0(colorLyricsResponse.o());
        int iOrdinal2 = colorLyricsResponse.p().o().ordinal();
        if (iOrdinal2 == 0) {
            i2 = 1;
        } else if (iOrdinal2 == 1) {
            i2 = 2;
        } else if (iOrdinal2 != 2) {
            if (iOrdinal2 != 3) {
                eg.o();
                return null;
            }
            i2 = 1;
        }
        h290 h290VarW = colorLyricsResponse.p().w();
        int iN = colorLyricsResponse.n().n();
        int iQ = colorLyricsResponse.n().q();
        int iP = colorLyricsResponse.n().p();
        return new a9h((List) arrayList, i, (List) arrayList3, language, zQ, bef0Var, eef0Var, i2, (List) h290VarW, new bff0(iN, iN, iP, iQ, iP, false));
    }
}
