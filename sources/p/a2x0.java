package p;

import com.spotify.metadata.proto.Metadata$Track;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.ai.creation.v2.ReportProblemResponse;
import com.spotify.profile.socialgraphimpl.proto.ContainsSingleRelationResponseOuterClass;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.ObjectHelper;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMapMaybe;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableZip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a2x0 implements Function, av30, Predicate, s2i1, np80, weo1 {
    public final /* synthetic */ byte a;
    public static final a2x0 b = new a2x0(0);
    public static final a2x0 c = new a2x0(1);
    public static final a2x0 d = new a2x0(2);
    public static final a2x0 e = new a2x0(3);
    public static final a2x0 f = new a2x0(4);
    public static final a2x0 g = new a2x0(5);
    public static final a2x0 h = new a2x0(6);
    public static final a2x0 i = new a2x0(7);
    public static final a2x0 t = new a2x0(8);
    public static final a2x0 X = new a2x0(9);
    public static final a2x0 Y = new a2x0(10);
    public static final a2x0 Z = new a2x0(11);
    public static final a2x0 N0 = new a2x0(12);
    public static final a2x0 O0 = new a2x0(13);
    public static final a2x0 P0 = new a2x0(14);
    public static final a2x0 Q0 = new a2x0(15);
    public static final a2x0 R0 = new a2x0(16);
    public static final a2x0 S0 = new a2x0(17);
    public static final a2x0 T0 = new a2x0(18);
    public static final a2x0 U0 = new a2x0(19);
    public static final a2x0 V0 = new a2x0(20);
    public static final a2x0 W0 = new a2x0(21);
    public static final a2x0 X0 = new a2x0(22);
    public static final a2x0 Y0 = new a2x0(23);
    public static final dtl1 Z0 = new dtl1();
    public static final a2x0 a1 = new a2x0(25);
    public static final a2x0 b1 = new a2x0(26);
    public static final a2x0 c1 = new a2x0(27);

    public /* synthetic */ a2x0(byte b2) {
        this.a = b2;
    }

    public static void a(a2x0 a2x0Var) {
        if (a2x0Var != null) {
            return;
        }
        k220.r("SecretKeyAccess is required");
    }

    public Object apply(Object obj) {
        ContainsSingleRelationResponseOuterClass.ContainsSingleRelationResponse containsSingleRelationResponse;
        List list;
        switch (this.a) {
            case 0:
                sy21 sy21Var = (sy21) obj;
                return new q2x0(sy21Var.a.Q0 && (containsSingleRelationResponse = (ContainsSingleRelationResponseOuterClass.ContainsSingleRelationResponse) sy21Var.b) != null && containsSingleRelationResponse.n());
            case 1:
                return ((ReportProblemResponse) obj).getMessageAcknowledgement();
            case 2:
                return new l8z0((Map) obj);
            case 3:
                ccg1 ccg1Var = (ccg1) obj;
                return new i1d0(ccg1Var.c, ccg1Var.e, ccg1Var.o, ccg1Var.d);
            case 4:
            case 5:
            case 10:
            case 20:
            default:
                return j5.a;
            case 6:
                return new z0n1(((Boolean) obj).booleanValue());
            case 7:
                Set set = s4b1.f;
                return Boolean.valueOf(uic.x(((ContextTrack) ((PlayerState) obj).track().b()).uri()).c == blc0.Pg);
            case 8:
                List<tv00> listB = ((uv00) obj).b(hll.class);
                int iS = zno1.s(q7h.U(listB, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (tv00 tv00Var : listB) {
                    hll hllVar = tv00Var.b;
                    if (hllVar == null || (list = hllVar.b) == null) {
                        list = z6x.a;
                    }
                    linkedHashMap.put(tv00Var.a, new mw41(list.contains(ell.b), list.contains(ell.d)));
                }
                return linkedHashMap;
            case 9:
                b061 b061Var = (b061) obj;
                return new hw31(b061Var.a, b061Var.g, b061Var.e, b061Var.f, b061Var.d);
            case 11:
                return spq0.a(((gnm) obj).a);
            case 12:
                return new bq81((vov0) obj);
            case 13:
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new vi91((tl91) it.next()));
                }
                return Observable.fromIterable(arrayList);
            case 14:
                return ((Single) ((ixe0) obj).a.h.invoke()).map(w1x0.T0).onErrorReturn(y1x0.O0);
            case 15:
                FlowableZip flowableZipC0 = ((Flowable) obj).c0(Flowable.O(1, 3), w1x0.U0);
                ObjectHelper.a(Integer.MAX_VALUE, "maxConcurrency");
                return new FlowableFlatMapMaybe(flowableZipC0);
            case 16:
                v8i0.j("LP stop effect failed: ", ((feh) obj).a);
                return rih1.a;
            case 17:
                return Boolean.valueOf(yto.j((String) obj));
            case 18:
                mmr0 mmr0Var = (mmr0) obj;
                return new dkf1((PlayerState) mmr0Var.a, ((Boolean) mmr0Var.b).booleanValue(), false);
            case 19:
                Metadata$Track metadata$Track = (Metadata$Track) obj;
                String strA = f9a.a(metadata$Track.r().t());
                String strA2 = f9a.a(metadata$Track.n().q().t());
                Set set2 = s4b1.f;
                if (strA2.length() != 22) {
                    hhg1.n("Failed requirement.");
                    return null;
                }
                if (strA.length() != 22) {
                    hhg1.n("Failed requirement.");
                    return null;
                }
                return uic.x("spotify:album:" + strA2 + ":play:" + strA);
            case 21:
                return ((th61) obj).a;
            case 22:
                return ((Optional) obj).map(jvw0.c);
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3 = (String) linkedHashMap.get(ContextTrack$Metadata.KEY_ENTITY_URI);
        if (str3 == null) {
            return null;
        }
        return new pj11(str3, xkg0Var, str2, str);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 4:
                return ((th61) obj).b;
            default:
                return ((cma1) obj).b == 1;
        }
    }

    @Override // p.weo1
    public ogo1 zzb(Class cls) {
        if (!iao1.class.isAssignableFrom(cls)) {
            hhg1.n("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (ogo1) iao1.m(cls.asSubclass(iao1.class)).j(3);
        } catch (Exception e2) {
            bhn0.o("Unable to get message info for ".concat(cls.getName()), e2);
            return null;
        }
    }

    @Override // p.weo1
    public boolean zzc(Class cls) {
        return iao1.class.isAssignableFrom(cls);
    }
}
