package p;

import android.util.Base64;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.betamax.contextplayercoordinatorimpl.model.VideoPlayerCommand;
import com.spotify.cosmos.cosmosmodels.ContextTrackSerializer;
import com.spotify.performancesdk.timekeeper.proto.TimeMeasurementBuilderSnapshot;
import com.spotify.performancesdk.timekeeper.proto.TimeMeasurementBuilderSnapshotCapturedPoint;
import com.spotify.performancesdk.timekeeper.proto.TimeMeasurementBuilderSnapshotCapturedPointEnd;
import com.spotify.performancesdk.timekeeper.proto.TimeMeasurementBuilderSnapshotCapturedPointStart;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jrj1 implements nma0 {
    public static final jrj1 a = new jrj1();
    public static final v811 b;
    public static final v811 c;
    public static final v811 d;
    public static final j661 e;

    static {
        nma0 nma0VarZ = m5n1.z(r2g1.a);
        jd11 jd11Var = rc11.a;
        b = new v811(jd11Var.b(q2g1.class), nma0VarZ);
        c = new v811(jd11Var.b(ContextTrack.class), m5n1.z(ContextTrackSerializer.INSTANCE));
        d = new v811(jd11Var.b(grj1.class), irj1.a);
        e = omo1.i("VideoPlayerCommand", new h661[0], jmj1.b1);
    }

    public final Object deserialize(dar darVar) {
        long jLongValue;
        j661 j661Var = e;
        x1k x1kVarB = darVar.b(j661Var);
        hrj1 hrj1Var = hrj1.a;
        sne1 sne1Var = null;
        Object objA = null;
        Object objA2 = null;
        Object objA3 = null;
        Object objA4 = null;
        Object objB = null;
        Object objB2 = null;
        Object objB3 = null;
        Object objB4 = null;
        Object objB5 = null;
        Object objB6 = null;
        Object objA5 = null;
        Object objA6 = null;
        Object objA7 = null;
        Object objA8 = null;
        Object objA9 = null;
        Object objB7 = null;
        boolean zBooleanValue = true;
        boolean zBooleanValue2 = false;
        boolean zBooleanValue3 = false;
        boolean zBooleanValue4 = false;
        boolean zBooleanValue5 = false;
        Object objA10 = "unknown";
        while (true) {
            hrj1 m231Var = hrj1Var;
            while (true) {
                int iP = x1kVarB.p(j661Var);
                switch (iP) {
                    case -1:
                        x1kVarB.a(j661Var);
                        hrj1 hrj1Var2 = m231Var;
                        Long l = (Long) objA;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            Long l2 = (Long) objA2;
                            jLongValue = l2 != null ? l2.longValue() : 0L;
                        }
                        Long l3 = (Long) objA3;
                        Long l4 = (Long) objA4;
                        q2g1 q2g1Var = (q2g1) objB;
                        q2g1[] q2g1VarArr = (q2g1[]) objB2;
                        wkm wkmVar = (wkm) objB3;
                        String str = (String) objA10;
                        LoggingParams loggingParams = (LoggingParams) objB4;
                        ContextTrack[] contextTrackArr = (ContextTrack[]) objB5;
                        vjm vjmVar = (vjm) objB6;
                        Long l5 = (Long) objA5;
                        String str2 = (String) objA6;
                        String str3 = (String) objA7;
                        if (str3 != null) {
                            TimeMeasurementBuilderSnapshot timeMeasurementBuilderSnapshotU = TimeMeasurementBuilderSnapshot.u(Base64.decode(str3, 0));
                            timeMeasurementBuilderSnapshotU.getClass();
                            h290<TimeMeasurementBuilderSnapshotCapturedPointStart> h290VarO = timeMeasurementBuilderSnapshotU.o();
                            ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
                            for (TimeMeasurementBuilderSnapshotCapturedPointStart timeMeasurementBuilderSnapshotCapturedPointStart : h290VarO) {
                                arrayList.add(new pod(timeMeasurementBuilderSnapshotCapturedPointStart.getTimestamp(), timeMeasurementBuilderSnapshotCapturedPointStart.o(), timeMeasurementBuilderSnapshotCapturedPointStart.n(), timeMeasurementBuilderSnapshotCapturedPointStart.p()));
                            }
                            h290 h290VarN = timeMeasurementBuilderSnapshotU.n();
                            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN, 10));
                            for (Iterator it = h290VarN.iterator(); it.hasNext(); it = it) {
                                TimeMeasurementBuilderSnapshotCapturedPointEnd timeMeasurementBuilderSnapshotCapturedPointEnd = (TimeMeasurementBuilderSnapshotCapturedPointEnd) it.next();
                                arrayList2.add(new ood(timeMeasurementBuilderSnapshotCapturedPointEnd.n(), timeMeasurementBuilderSnapshotCapturedPointEnd.getTimestamp()));
                            }
                            h290 h290VarP = timeMeasurementBuilderSnapshotU.p();
                            ArrayList arrayList3 = new ArrayList(q7h.U(h290VarP, 10));
                            Iterator it2 = h290VarP.iterator();
                            while (it2.hasNext()) {
                                TimeMeasurementBuilderSnapshotCapturedPoint timeMeasurementBuilderSnapshotCapturedPoint = (TimeMeasurementBuilderSnapshotCapturedPoint) it2.next();
                                arrayList3.add(new nod(timeMeasurementBuilderSnapshotCapturedPoint.p(), timeMeasurementBuilderSnapshotCapturedPoint.o(), Long.valueOf(timeMeasurementBuilderSnapshotCapturedPoint.getTimestamp()), Long.valueOf(timeMeasurementBuilderSnapshotCapturedPoint.n())));
                                it2 = it2;
                                timeMeasurementBuilderSnapshotU = timeMeasurementBuilderSnapshotU;
                                arrayList2 = arrayList2;
                            }
                            TimeMeasurementBuilderSnapshot timeMeasurementBuilderSnapshot = timeMeasurementBuilderSnapshotU;
                            sne1Var = new sne1(timeMeasurementBuilderSnapshot.q(), arrayList, arrayList2, arrayList3, timeMeasurementBuilderSnapshot.t() ? Long.valueOf(timeMeasurementBuilderSnapshot.s()) : null, timeMeasurementBuilderSnapshot.r(), timeMeasurementBuilderSnapshot.getMetadataMap());
                        }
                        return new VideoPlayerCommand(hrj1Var2, jLongValue, l3, l4, q2g1Var, q2g1VarArr, wkmVar, zBooleanValue2, zBooleanValue3, zBooleanValue4, str, loggingParams, contextTrackArr, vjmVar, l5, str2, sne1Var, (Long) objA8, (Long) objA9, (grj1[]) objB7, zBooleanValue5, zBooleanValue);
                    case 0:
                        try {
                            m231Var = hrj1.valueOf(((String) x1kVarB.A(j661Var, iP, pma.a, (Object) null)).toUpperCase(Locale.US));
                        } catch (Throwable th) {
                            m231Var = new m231(th);
                        }
                        if (m231Var instanceof m231) {
                        }
                        break;
                        break;
                    case 1:
                        objA2 = x1kVarB.A(j661Var, iP, oma.a, (Object) null);
                        m231Var = m231Var;
                        break;
                    case 2:
                        objA3 = x1kVarB.A(j661Var, iP, oma.a, (Object) null);
                        m231Var = m231Var;
                        break;
                    case 3:
                        objA4 = x1kVarB.A(j661Var, iP, oma.a, (Object) null);
                        m231Var = m231Var;
                        break;
                    case 4:
                        objB = x1kVarB.B(j661Var, iP, m5n1.z(r2g1.a), (Object) null);
                        m231Var = m231Var;
                        break;
                    case 5:
                        objB2 = x1kVarB.B(j661Var, iP, m5n1.z(b), (Object) null);
                        m231Var = m231Var;
                        break;
                    case 6:
                        objB3 = x1kVarB.B(j661Var, iP, m5n1.z(wkm.Companion.serializer()), (Object) null);
                        m231Var = m231Var;
                        break;
                    case 7:
                        zBooleanValue2 = ((Boolean) x1kVarB.A(j661Var, iP, hma.a, (Object) null)).booleanValue();
                        m231Var = m231Var;
                        break;
                    case 8:
                        zBooleanValue3 = ((Boolean) x1kVarB.A(j661Var, iP, hma.a, (Object) null)).booleanValue();
                        m231Var = m231Var;
                        break;
                    case 9:
                        zBooleanValue4 = ((Boolean) x1kVarB.A(j661Var, iP, hma.a, (Object) null)).booleanValue();
                        m231Var = m231Var;
                        break;
                    case 10:
                        objA10 = x1kVarB.A(j661Var, iP, pma.a, (Object) null);
                        m231Var = m231Var;
                        break;
                    case 11:
                        objA6 = x1kVarB.A(j661Var, iP, pma.a, (Object) null);
                        m231Var = m231Var;
                        break;
                    case 12:
                        objB4 = x1kVarB.B(j661Var, iP, m5n1.z(dve0.a), (Object) null);
                        m231Var = m231Var;
                        break;
                    case 13:
                        objA5 = x1kVarB.A(j661Var, iP, oma.a, (Object) null);
                        m231Var = m231Var;
                        break;
                    case 14:
                        objB5 = x1kVarB.B(j661Var, iP, m5n1.z(c), (Object) null);
                        m231Var = m231Var;
                        break;
                    case 15:
                        objB6 = x1kVarB.B(j661Var, iP, m5n1.z(xjm.a), (Object) null);
                        m231Var = m231Var;
                        break;
                    case 16:
                        objA = x1kVarB.A(j661Var, iP, oma.a, (Object) null);
                        m231Var = m231Var;
                        break;
                    case 17:
                        objA7 = x1kVarB.A(j661Var, iP, pma.a, (Object) null);
                        m231Var = m231Var;
                        break;
                    case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                        objA8 = x1kVarB.A(j661Var, iP, oma.a, (Object) null);
                        m231Var = m231Var;
                        break;
                    case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                        objA9 = x1kVarB.A(j661Var, iP, oma.a, (Object) null);
                        m231Var = m231Var;
                        break;
                    case 20:
                        objB7 = x1kVarB.B(j661Var, iP, m5n1.z(d), (Object) null);
                        m231Var = m231Var;
                        break;
                    case 21:
                        zBooleanValue5 = ((Boolean) x1kVarB.A(j661Var, iP, hma.a, (Object) null)).booleanValue();
                        m231Var = m231Var;
                        break;
                    case 22:
                        zBooleanValue = ((Boolean) x1kVarB.A(j661Var, iP, hma.a, (Object) null)).booleanValue();
                        m231Var = m231Var;
                        break;
                    default:
                        uh61.j(f4i1.c(iP, "Unexpected VideoPlayerCommand field index "));
                        return null;
                }
            }
        }
    }

    public final h661 getDescriptor() {
        return e;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final void serialize(uax uaxVar, Object obj) throws SerializationException {
        throw new SerializationException("Serializing VideoPlayerCommand is not supported");
    }
}
