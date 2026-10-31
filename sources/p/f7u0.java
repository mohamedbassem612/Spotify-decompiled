package p;

import com.google.protobuf.Duration;
import com.spotify.contentagnostic.v2.AudioPlayback;
import com.spotify.contentagnostic.v2.PlaybackOffsets;
import com.spotify.contentagnostic.v2.PlaybackTrait;
import com.spotify.contentagnostic.v2.VideoPlayback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f7u0 implements ov00 {
    /* JADX WARN: Code duplicated, block: B:21:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00de  */
    /* JADX WARN: Code duplicated, block: B:43:0x0158  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:9:0x0038  */
    public final ez00 a(byte[] bArr) {
        ngv ngvVar;
        ngv ngvVar2;
        tqj1 tqj1Var;
        String strZ;
        z1u0 z1u0Var;
        my7 my7Var;
        String strO;
        my7 my7Var2;
        z1u0 z1u0Var2;
        String strZ2;
        z1u0 z1u0Var3;
        PlaybackTrait playbackTraitO = PlaybackTrait.o(bArr);
        h290 h290VarN = playbackTraitO.n();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = h290VarN.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ngvVar = ngv.b;
            ngvVar2 = ngv.e;
            if (!zHasNext) {
                break;
            }
            PlaybackTrait.AudioMapEntry audioMapEntry = (PlaybackTrait.AudioMapEntry) it.next();
            audioMapEntry.getClass();
            AudioPlayback audioPlaybackN = audioMapEntry.n();
            if (audioPlaybackN.s()) {
                if (audioMapEntry.n().s()) {
                    byte[] bArrT = audioMapEntry.n().o().n().t();
                    bArrT.getClass();
                    if (bArrT.length == 0) {
                        strZ2 = null;
                    } else {
                        strZ2 = zno1.z(bArrT);
                    }
                } else {
                    strZ2 = null;
                }
                if (strZ2 != null) {
                    b58 b58Var = new b58(strZ2);
                    String strR = audioPlaybackN.r();
                    if (audioPlaybackN.t()) {
                        PlaybackOffsets playbackOffsetsP = audioPlaybackN.p();
                        Duration durationP = playbackOffsetsP.p();
                        ytw0 ytw0Var = jfv.b;
                        long jQ = jfv.q(fdg1.l0(durationP.p(), ngvVar2), fdg1.k0(durationP.o(), ngvVar));
                        Duration durationO = playbackOffsetsP.o();
                        z1u0Var3 = new z1u0(jQ, jfv.q(fdg1.l0(durationO.p(), ngvVar2), fdg1.k0(durationO.o(), ngvVar)));
                    } else {
                        z1u0Var3 = null;
                    }
                    my7Var2 = new my7(b58Var, strR, z1u0Var3);
                } else {
                    if (audioPlaybackN.u()) {
                        strO = audioPlaybackN.q().o().o();
                        strO.getClass();
                        if (strO.length() <= 0) {
                            strO = null;
                        }
                        if (strO != null) {
                            c58 c58Var = new c58(strO);
                            String strR2 = audioPlaybackN.r();
                            if (audioPlaybackN.t()) {
                                PlaybackOffsets playbackOffsetsP2 = audioPlaybackN.p();
                                Duration durationP2 = playbackOffsetsP2.p();
                                ytw0 ytw0Var2 = jfv.b;
                                long jQ2 = jfv.q(fdg1.l0(durationP2.p(), ngvVar2), fdg1.k0(durationP2.o(), ngvVar));
                                Duration durationO2 = playbackOffsetsP2.o();
                                z1u0Var2 = new z1u0(jQ2, jfv.q(fdg1.l0(durationO2.p(), ngvVar2), fdg1.k0(durationO2.o(), ngvVar)));
                            } else {
                                z1u0Var2 = null;
                            }
                            my7Var2 = new my7(c58Var, strR2, z1u0Var2);
                        }
                    }
                    my7Var = null;
                }
                my7Var = my7Var2;
            } else {
                if (audioPlaybackN.u()) {
                    strO = audioPlaybackN.q().o().o();
                    strO.getClass();
                    if (strO.length() <= 0) {
                        strO = null;
                    }
                    if (strO != null) {
                        c58 c58Var2 = new c58(strO);
                        String strR3 = audioPlaybackN.r();
                        if (audioPlaybackN.t()) {
                            z1u0Var2 = null;
                        } else {
                            PlaybackOffsets playbackOffsetsP3 = audioPlaybackN.p();
                            Duration durationP3 = playbackOffsetsP3.p();
                            ytw0 ytw0Var3 = jfv.b;
                            long jQ3 = jfv.q(fdg1.l0(durationP3.p(), ngvVar2), fdg1.k0(durationP3.o(), ngvVar));
                            Duration durationO3 = playbackOffsetsP3.o();
                            z1u0Var2 = new z1u0(jQ3, jfv.q(fdg1.l0(durationO3.p(), ngvVar2), fdg1.k0(durationO3.o(), ngvVar)));
                        }
                        my7Var2 = new my7(c58Var2, strR3, z1u0Var2);
                        my7Var = my7Var2;
                    }
                }
                my7Var = null;
            }
            if (my7Var != null) {
                arrayList.add(my7Var);
            }
        }
        List videoList = playbackTraitO.getVideoList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = videoList.iterator();
        while (it2.hasNext()) {
            PlaybackTrait.VideoMapEntry videoMapEntry = (PlaybackTrait.VideoMapEntry) it2.next();
            videoMapEntry.getClass();
            VideoPlayback videoPlaybackO = videoMapEntry.o();
            if (videoPlaybackO.r()) {
                if (videoMapEntry.o().r()) {
                    byte[] bArrT2 = videoMapEntry.o().o().o().t();
                    bArrT2.getClass();
                    if (bArrT2.length == 0) {
                        strZ = null;
                    } else {
                        strZ = zno1.z(bArrT2);
                    }
                } else {
                    strZ = null;
                }
                if (strZ != null) {
                    int i = e7u0.a[videoMapEntry.n().ordinal()] == 1 ? 2 : 1;
                    f2k1 f2k1Var = new f2k1(strZ);
                    String strQ = videoPlaybackO.q();
                    if (videoPlaybackO.s()) {
                        PlaybackOffsets playbackOffsetsP4 = videoPlaybackO.p();
                        Duration durationP4 = playbackOffsetsP4.p();
                        ytw0 ytw0Var4 = jfv.b;
                        long jQ4 = jfv.q(fdg1.l0(durationP4.p(), ngvVar2), fdg1.k0(durationP4.o(), ngvVar));
                        Duration durationO4 = playbackOffsetsP4.o();
                        z1u0Var = new z1u0(jQ4, jfv.q(fdg1.l0(durationO4.p(), ngvVar2), fdg1.k0(durationO4.o(), ngvVar)));
                    } else {
                        z1u0Var = null;
                    }
                    tqj1Var = new tqj1(i, f2k1Var, strQ, z1u0Var);
                } else {
                    it2 = it2;
                    arrayList2 = arrayList2;
                    tqj1Var = null;
                }
            } else {
                it2 = it2;
                arrayList2 = arrayList2;
                tqj1Var = null;
            }
            ArrayList arrayList3 = arrayList2;
            if (tqj1Var != null) {
                arrayList3.add(tqj1Var);
            }
            arrayList2 = arrayList3;
            it2 = it2;
        }
        return new d7u0(arrayList, arrayList2);
    }

    public final int b() {
        return 212;
    }

    public final Class type() {
        return d7u0.class;
    }
}
