package p;

import com.spotify.searchview.v1.GatingDecision;
import com.spotify.searchview.v1.SearchGenreMetadata;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v351 implements ov00 {
    public final ez00 a(byte[] bArr) {
        int i;
        r351 r351Var;
        o351 m351Var;
        SearchGenreMetadata searchGenreMetadataR = SearchGenreMetadata.r(bArr);
        String name = searchGenreMetadataR.getName();
        String imageUrl = searchGenreMetadataR.getImageUrl();
        imageUrl.getClass();
        if (imageUrl.length() > 0) {
            try {
                new URI(imageUrl);
            } catch (URISyntaxException unused) {
                imageUrl = null;
            }
        } else {
            imageUrl = null;
        }
        int i2 = 2;
        if (u351.a[searchGenreMetadataR.p().ordinal()] == 1) {
            i = 1;
        } else {
            i2 = 1;
            i = 1;
        }
        boolean zO = searchGenreMetadataR.o();
        if (searchGenreMetadataR.q()) {
            GatingDecision gatingDecisionN = searchGenreMetadataR.n();
            int iR = gatingDecisionN.r();
            int i3 = iR == 0 ? -1 : u351.c[l1d.C(iR)];
            if (i3 == i) {
                m351Var = n351.a;
            } else if (i3 != 2) {
                m351Var = null;
            } else {
                List listO = gatingDecisionN.o().o();
                ArrayList arrayList = new ArrayList(q7h.U(listO, 10));
                for (g940 g940Var : (AbstractList) listO) {
                    arrayList.add((g940Var == null ? -1 : u351.b[g940Var.ordinal()]) == i ? q351.b : q351.a);
                }
                m351Var = new m351(arrayList);
            }
            r351Var = new r351(m351Var, u351.d[gatingDecisionN.q().ordinal()] != i ? i : 2, gatingDecisionN.s() ? new p351(gatingDecisionN.p().p(), gatingDecisionN.p().n()) : null);
        } else {
            r351Var = null;
        }
        return new t351(name, imageUrl, i2, zO, r351Var);
    }

    public final int b() {
        return 280;
    }

    public final Class type() {
        return t351.class;
    }
}
