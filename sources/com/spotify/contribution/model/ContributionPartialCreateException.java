package com.spotify.contribution.model;

import java.util.ArrayList;
import kotlin.Metadata;
import p.atm;
import p.cy30;
import p.jum;
import p.o7h;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/contribution/model/ContributionPartialCreateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "p/jum", "src_main_java_com_spotify_contribution_model-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContributionPartialCreateException extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public ContributionPartialCreateException(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        int size2 = arrayList2.size() + arrayList.size();
        String strY0 = o7h.y0(arrayList2, (CharSequence) null, (String) null, (String) null, atm.W0, 31);
        StringBuilder sbQ = cy30.q(size, size2, "Created ", " of ", " contributions; failed: ");
        sbQ.append(strY0);
        String string = sbQ.toString();
        jum jumVar = (jum) o7h.s0(arrayList2);
        super(string, jumVar != null ? jumVar.b : null);
    }
}
