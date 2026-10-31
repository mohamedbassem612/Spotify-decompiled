package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ic3 {
    public final /* synthetic */ byte a;
    public final p6r0 b;

    public ic3(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                this.b = yon1.G1("ARTIST_MUSIC_VIDEOS", "artist/music-videos", 170, "artist");
                break;
            case 2:
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                this.b = yon1.c0();
                break;
            case 3:
                AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                this.b = yon1.G1("COLLECTION_SONGS", "collection/songs", 367, "collection");
                break;
            case 4:
                AtomicReferenceArray atomicReferenceArray4 = p6r0.e;
                this.b = yon1.G1("COLLECTION_PODCASTS_EPISODES_LISTENLATER", "collection/podcasts/episodes/listenlater", 358, "collection");
                break;
            case 5:
                AtomicReferenceArray atomicReferenceArray5 = p6r0.e;
                this.b = yon1.G1("LOCALFILES", "localfiles", 935, "localfiles");
                break;
            case 6:
                AtomicReferenceArray atomicReferenceArray6 = p6r0.e;
                this.b = yon1.n0();
                break;
            case 7:
                AtomicReferenceArray atomicReferenceArray7 = p6r0.e;
                this.b = yon1.G1("OFFLINE_PLAYABLE_ARTIST", "offline-playable-artist", 1374, "offline-playable-artist");
                break;
            case 8:
                AtomicReferenceArray atomicReferenceArray8 = p6r0.e;
                this.b = yon1.G1("RECOMMENDED_MUSIC_VIDEOS", "recommended-music-videos", 1632, "recommended-music-videos");
                break;
            case 9:
            default:
                AtomicReferenceArray atomicReferenceArray9 = p6r0.e;
                this.b = yon1.K();
                break;
            case 10:
                AtomicReferenceArray atomicReferenceArray10 = p6r0.e;
                this.b = yon1.G1("STS_KUNGSHOLMEN", "sts/kungsholmen", 1986, "sts");
                break;
        }
    }

    public ic3(c8c0 c8c0Var) {
        p6r0 p6r0VarA3;
        this.a = (byte) 9;
        if (zro1.v(c8c0Var)) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0VarA3 = yon1.G1("PLAYLIST_ONDEMAND", "playlist/ondemand", 1469, "playlist");
        } else {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            p6r0VarA3 = yon1.A3();
        }
        this.b = p6r0VarA3;
    }
}
