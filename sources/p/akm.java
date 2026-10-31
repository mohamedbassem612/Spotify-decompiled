package p;

import com.spotify.betamax.contextplayercoordinatorimpl.model.VideoPlayerCommand;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class akm {
    public final v1k a;
    public apa b;
    public final utg0 c;
    public final boolean d;
    public final yjj1 e;
    public boolean g;
    public VideoPlayerCommand i;
    public int f = 640000;
    public final vku h = new vku();

    public akm(v1k v1kVar, apa apaVar, v290 v290Var, Observable observable, Observable observable2, Observable observable3, Scheduler scheduler, BehaviorSubject behaviorSubject, utg0 utg0Var, boolean z, yjj1 yjj1Var) {
        this.a = v1kVar;
        this.b = apaVar;
        this.c = utg0Var;
        this.d = z;
        this.e = yjj1Var;
    }

    public static oot0 a(VideoPlayerCommand videoPlayerCommand, boolean z) {
        boolean z2 = !videoPlayerCommand.getInitiallyPaused();
        long j = 0;
        long jMax = Math.max(videoPlayerCommand.getSeekToInMs(), 0L);
        Long endPositionInMs = videoPlayerCommand.getEndPositionInMs();
        long jLongValue = endPositionInMs != null ? endPositionInMs.longValue() : 0L;
        if (z && videoPlayerCommand.getAutomaticallySyncToLiveHead()) {
            jLongValue = 0;
        } else {
            j = jMax;
        }
        sne1 timeMeasurementBuilderSnapshot = videoPlayerCommand.getTimeMeasurementBuilderSnapshot();
        return new oot0(j, jLongValue, z2, false, null, timeMeasurementBuilderSnapshot != null ? new tne1(timeMeasurementBuilderSnapshot) : null, videoPlayerCommand.getAutomaticallySyncToLiveHead(), 56);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    public final o2u0 b(VideoPlayerCommand videoPlayerCommand) {
        String strN;
        int iAbs;
        q2g1 trackWithPlayOrigin = videoPlayerCommand.getTrackWithPlayOrigin();
        ContextTrack contextTrack = trackWithPlayOrigin != null ? trackWithPlayOrigin.a : null;
        if (contextTrack != null) {
            j380 j380VarMetadata = contextTrack.metadata();
            String str = (String) j380VarMetadata.get("media.manifest_id");
            String str2 = (String) j380VarMetadata.get("media.manifest");
            if (str2 != null) {
                int i = Integer.MAX_VALUE;
                pqj1 pqj1Var = null;
                for (pqj1 pqj1Var2 : n3p1.l(str2)) {
                    if (o7h.i0(bkm.a(), pqj1Var2.b()) && pqj1Var2.a() > 0 && (iAbs = Math.abs(this.f - pqj1Var2.a())) <= i) {
                        pqj1Var = pqj1Var2;
                        i = iAbs;
                    }
                }
                if (pqj1Var != null) {
                    strN = pqj1Var.c();
                } else {
                    strN = null;
                }
            } else {
                strN = null;
            }
            String str3 = (String) j380VarMetadata.get("media.external_url");
            if (str != null && str.length() != 0) {
                strN = wqn1.n(str);
            } else if (strN == null || strN.length() == 0) {
                strN = (str3 == null || str3.length() == 0) ? null : str3;
            }
            if (strN != null) {
                boolean zV = c2p1.v(contextTrack);
                boolean zE = l4o1.E(contextTrack);
                LinkedHashMap linkedHashMapX = sqg0.X(x1p1.g(videoPlayerCommand));
                linkedHashMapX.put("metadata_keys.internal.is_royalty_media", String.valueOf(!zE));
                return new o2u0(strN, zV, (zE || videoPlayerCommand.getIsListPlayer()) ? false : true, linkedHashMapX);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    public final void c(VideoPlayerCommand videoPlayerCommand) {
        String str;
        ArrayList arrayList;
        long jL0;
        mtg0 mtg0Var;
        q2g1 trackWithPlayOrigin = videoPlayerCommand.getTrackWithPlayOrigin();
        if (trackWithPlayOrigin == null || (str = trackWithPlayOrigin.c) == null) {
            str = "";
        }
        grj1[] markers = videoPlayerCommand.getMarkers();
        ngv ngvVar = ngv.d;
        if (markers != null) {
            arrayList = new ArrayList();
            for (grj1 grj1Var : markers) {
                if (grj1Var != null) {
                    Integer numA = grj1Var.a();
                    int iIntValue = numA != null ? numA.intValue() : 0;
                    if (iIntValue < 0 || iIntValue > 100) {
                        mtg0Var = null;
                    } else {
                        Integer numC = grj1Var.c();
                        int iIntValue2 = numC != null ? numC.intValue() : 0;
                        if (grj1Var.d() == null || grj1Var.d().intValue() >= 1000) {
                            String strB = grj1Var.b();
                            ytw0 ytw0Var = jfv.b;
                            long jK0 = fdg1.k0(iIntValue2, ngvVar);
                            Integer numD = grj1Var.d();
                            mtg0Var = new mtg0(strB, iIntValue, jK0, numD != null ? new jfv(fdg1.k0(numD.intValue(), ngvVar)) : null);
                        } else {
                            mtg0Var = null;
                        }
                    }
                } else {
                    mtg0Var = null;
                }
                if (mtg0Var != null) {
                    arrayList.add(mtg0Var);
                }
            }
        } else {
            arrayList = z6x.a;
        }
        Long markerBoundaryStartInMs = videoPlayerCommand.getMarkerBoundaryStartInMs();
        if (markerBoundaryStartInMs != null) {
            ytw0 ytw0Var2 = jfv.b;
            jL0 = fdg1.l0(markerBoundaryStartInMs.longValue(), ngvVar);
        } else {
            ytw0 ytw0Var3 = jfv.b;
            jL0 = 0;
        }
        Long markerBoundaryEndInMs = videoPlayerCommand.getMarkerBoundaryEndInMs();
        jfv jfvVar = markerBoundaryEndInMs != null ? new jfv(fdg1.l0(markerBoundaryEndInMs.longValue(), ngvVar)) : null;
        utg0 utg0Var = this.c;
        utg0Var.c.put(str, new stg0(arrayList, jL0, jfvVar));
        LinkedHashMap linkedHashMap = utg0Var.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (u890.j(((m0u0) entry.getKey()).b().get("playback_id"), str)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            ((rtg0) ((Map.Entry) it.next()).getValue()).q(arrayList, jL0, jfvVar);
        }
    }
}
