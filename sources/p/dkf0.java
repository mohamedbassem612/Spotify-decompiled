package p;

import android.icu.text.BreakIterator;
import com.spotify.lyrics.fullscreenview.events.proto.LyricsErrorReportingEventV3;
import com.spotify.lyrics.fullscreenview.events.proto.a;
import com.spotify.lyrics.fullscreenview.events.proto.b;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dkf0 implements Consumer {
    public final /* synthetic */ t2j0 a;

    public dkf0(t2j0 t2j0Var) {
        this.a = t2j0Var;
    }

    public final void accept(Object obj) {
        uhf0 uhf0Var = (uhf0) obj;
        a aVarO = LyricsErrorReportingEventV3.o();
        aVarO.u(uhf0Var.b);
        aVarO.r(uhf0Var.c);
        aVarO.s(uhf0Var.d);
        aVarO.q(uhf0Var.a);
        xdi1 xdi1Var = uhf0Var.e;
        if (!xdi1Var.equals(vdi1.a)) {
            if (xdi1Var instanceof wdi1) {
                ArrayList<ydi1> arrayList = ((wdi1) xdi1Var).a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (ydi1 ydi1Var : arrayList) {
                    b bVarN = LyricsErrorReportingEventV3.ReportedCorrections.n();
                    bVarN.q(ydi1Var.a);
                    String str = ydi1Var.b;
                    if (str != null) {
                        bVarN.n(str);
                    }
                    arrayList2.add((LyricsErrorReportingEventV3.ReportedCorrections) bVarN.build());
                }
                aVarO.n(arrayList2);
            } else {
                if (!(xdi1Var instanceof udi1)) {
                    eg.o();
                    return;
                }
                String strSubstring = ((udi1) xdi1Var).a;
                BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.ROOT);
                characterInstance.setText(strSubstring);
                int i = 0;
                int next = 0;
                while (true) {
                    if (i >= 3000) {
                        strSubstring = strSubstring.substring(0, next);
                        break;
                    }
                    next = characterInstance.next();
                    if (next == -1) {
                        break;
                    } else {
                        i++;
                    }
                }
                aVarO.t(strSubstring);
            }
        }
        this.a.a(aVarO.build());
    }
}
