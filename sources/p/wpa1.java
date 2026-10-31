package p;

import spotify.campfire.v1.TasteMatchCard;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wpa1 implements ov00 {
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    public final ez00 a(byte[] bArr) {
        String sharedTrackUris;
        TasteMatchCard tasteMatchCardP = TasteMatchCard.p(bArr);
        int iO = tasteMatchCardP.o();
        int i = iO == 0 ? -1 : vpa1.a[l1d.C(iO)];
        tpa1 spa1Var = rpa1.a;
        if (i != -1) {
            String str = null;
            if (i == 1) {
                TasteMatchCard.TasteMatchResult tasteMatchResultN = tasteMatchCardP.n();
                if (!tasteMatchResultN.hasMatchPercentage()) {
                    return new upa1(spa1Var);
                }
                if (tasteMatchResultN.hasTasteMatch()) {
                    sharedTrackUris = tasteMatchResultN.o().getSharedTrackUris();
                    sharedTrackUris.getClass();
                    if (sharedTrackUris.length() <= 0) {
                        sharedTrackUris = null;
                    }
                } else {
                    sharedTrackUris = null;
                }
                if (tasteMatchResultN.hasTasteMatch()) {
                    String sharedArtistUris = tasteMatchResultN.o().getSharedArtistUris();
                    sharedArtistUris.getClass();
                    if (sharedArtistUris.length() > 0) {
                        str = sharedArtistUris;
                    }
                }
                spa1Var = new spa1((int) yoi1.r(((long) tasteMatchResultN.getMatchPercentage()) & 4294967295L, 0L, 100L), sharedTrackUris, str);
            } else if (i != 2 && i != 3) {
                eg.o();
                return null;
            }
        }
        return new upa1(spa1Var);
    }

    public final int b() {
        return 276;
    }

    public final Class type() {
        return upa1.class;
    }
}
