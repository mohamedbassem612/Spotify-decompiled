package p;

import com.spotify.lyrics.serviceretrofit.proto.v3.LyricsV3Response;
import com.spotify.lyrics.serviceretrofit.proto.v3.LyricsWrapperResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class rtf0 {
    public static final a9h a(LyricsWrapperResponse lyricsWrapperResponse) {
        int i;
        h290<LyricsV3Response.LyricsLine> h290VarQ = lyricsWrapperResponse.o().q();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarQ, 10));
        for (LyricsV3Response.LyricsLine lyricsLine : h290VarQ) {
            long jN = lyricsLine.n();
            String strP = lyricsLine.p();
            h290<LyricsV3Response.LyricsLine.SyncData> h290VarO = lyricsLine.o();
            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, 10));
            for (LyricsV3Response.LyricsLine.SyncData syncData : h290VarO) {
                arrayList2.add(new cef0((int) syncData.o(), (int) syncData.n()));
            }
            arrayList.add(new aef0(jN, strP, arrayList2));
        }
        int iOrdinal = lyricsWrapperResponse.o().s().ordinal();
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
        LyricsV3Response.Translation translationT = lyricsWrapperResponse.o().t();
        z6x z6xVarSingletonList = translationT.equals(LyricsV3Response.Translation.n()) ? z6x.a : Collections.singletonList(new def0(translationT.o().n(), translationT.p(), translationT.o().p()));
        String strN = lyricsWrapperResponse.o().p().n();
        boolean zP = lyricsWrapperResponse.o().p().p();
        bef0 bef0Var = new bef0(lyricsWrapperResponse.o().r().o(), lyricsWrapperResponse.o().r().getName(), lyricsWrapperResponse.o().r().getDisplayName());
        z6x z6xVar = z6xVarSingletonList;
        eef0 eef0Var = new eef0(lyricsWrapperResponse.n());
        int iOrdinal2 = lyricsWrapperResponse.o().n().ordinal();
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
        return new a9h(arrayList, i, (List) z6xVar, strN, zP, bef0Var, eef0Var, i2, new bff0(a860.e("FF353535"), a860.e("FF565656"), a860.e("FFFFFFFF"), a860.e("FFCDCDCD"), a860.e("FF1ED760"), true), 256);
    }
}
