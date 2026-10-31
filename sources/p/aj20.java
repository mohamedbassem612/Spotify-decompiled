package p;

import android.view.View;
import com.google.protobuf.Timestamp;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.karaoke.esperanto.proto.KaraokePostStatusResponse;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class aj20 implements v0i, Predicate, BiFunction, Function, aad0, dui0, Function3, s2i1 {
    public final /* synthetic */ byte a;
    public static final aj20 b = new aj20(0);
    public static final aj20 c = new aj20(1);
    public static final aj20 d = new aj20(2);
    public static final aj20 e = new aj20(3);
    public static final aj20 f = new aj20(4);
    public static final aj20 g = new aj20(5);
    public static final aj20 h = new aj20(6);
    public static final aj20 i = new aj20(7);
    public static final aj20 t = new aj20(8);
    public static final aj20 X = new aj20(9);
    public static final aj20 Y = new aj20(10);
    public static final aj20 Z = new aj20(11);
    public static final aj20 N0 = new aj20(12);
    public static final aj20 O0 = new aj20(13);
    public static final aj20 P0 = new aj20(14);
    public static final aj20 Q0 = new aj20(15);
    public static final aj20 R0 = new aj20(16);
    public static final aj20 S0 = new aj20(17);
    public static final aj20 T0 = new aj20(18);
    public static final aj20 U0 = new aj20(19);
    public static final aj20 V0 = new aj20(20);
    public static final aj20 W0 = new aj20(21);
    public static final aj20 X0 = new aj20(22);
    public static final aj20 Y0 = new aj20(23);
    public static final aj20 Z0 = new aj20(24);
    public static final aj20 a1 = new aj20(25);
    public static final aj20 b1 = new aj20(26);
    public static final aj20 c1 = new aj20(27);
    public static final aj20 d1 = new aj20(28);
    public static final aj20 e1 = new aj20(29);

    public /* synthetic */ aj20(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj) {
        z6x z6xVarC = null;
        switch (this.a) {
            case 3:
                jo70 jo70VarA = ((i1z) obj).D.a(jo70.class);
                z6xVarC = jo70VarA != null ? jzn1.C(jo70VarA) : null;
                if (z6xVarC == null) {
                    z6xVarC = z6x.a;
                }
                return new n4g(z6xVarC);
            case 4:
            case 8:
            case 10:
            case 13:
            case 14:
            case 15:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
            case 24:
            case 26:
            default:
                return Boolean.FALSE;
            case 5:
                return Boolean.valueOf(((PlayerState) obj).track().c());
            case 6:
                byte[] bArr = (byte[]) obj;
                try {
                    return KaraokePostStatusResponse.n(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.karaoke.esperanto.proto.KaraokePostStatusResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 7:
                n57.e("[Puffin] Leave ProcessingEnvironment failed: " + ((Throwable) obj));
                return Completable.j(q9n.a);
            case 9:
                return Boolean.valueOf(((il51) obj).b);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                PlayerState playerState = (PlayerState) obj;
                return new tif0((ContextTrack) playerState.track().b(), (String) playerState.playbackId().e("absent"), true);
            case grn1.d /* 12 */:
                return ((ttg0) obj).b;
            case 16:
                return new zzo0((cam) obj);
            case 17:
                l560 l560Var = (l560) ((spq0) obj).h();
                if (l560Var == null) {
                    l560Var = new l560("Wired");
                }
                return new sb0(l560Var);
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsOffline.Error.o(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.Error: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 19:
                EsOffline.DevicesWithContextResponse devicesWithContextResponse = (EsOffline.DevicesWithContextResponse) obj;
                if (devicesWithContextResponse.o() > 0) {
                    return new o0u(new RuntimeException(String.valueOf(devicesWithContextResponse.o())));
                }
                h290<EsOffline.DevicesWithContextResponse.DeviceWithContext> h290VarN = devicesWithContextResponse.n();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
                for (EsOffline.DevicesWithContextResponse.DeviceWithContext deviceWithContext : h290VarN) {
                    boolean zP = deviceWithContext.p();
                    boolean zO = deviceWithContext.o().o().o();
                    ept eptVarA = cqg0.a(deviceWithContext.o());
                    rw21 rw21VarC = cqg0.c(deviceWithContext.n());
                    boolean zR = deviceWithContext.o().r();
                    boolean isLocal = deviceWithContext.o().getIsLocal();
                    Timestamp timestampQ = deviceWithContext.o().q();
                    arrayList.add(new m0u(zP, zO, eptVarA, rw21VarC, zR, isLocal, (timestampQ.q() * 1000) + ((long) (timestampQ.p() / 1000000))));
                }
                return new p0u(arrayList);
            case 21:
                xew xewVar = (xew) obj;
                return new z200(xewVar.a, xewVar.b);
            case 22:
                return new yat0((lbt0) obj);
            case 23:
                if (((c6u0) obj).equals(c6u0.a)) {
                    return Flowable.I(j5.a);
                }
                eg.o();
                return null;
            case 25:
                List list = ((sx60) obj).a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    URL url = new URL(l1d.m("https://", (String) it.next()));
                    int port = url.getPort();
                    Integer numValueOf = Integer.valueOf(port);
                    if (port == -1) {
                        numValueOf = null;
                    }
                    String host = url.getHost();
                    mmr0 mmr0Var = host != null ? new mmr0(host, numValueOf) : null;
                    if (mmr0Var != null) {
                        arrayList2.add(mmr0Var);
                    }
                }
                return arrayList2;
            case 27:
                ContextTrack contextTrack = (ContextTrack) ((spq0) obj).h();
                if (contextTrack != null) {
                    z6x z6xVar = (String) contextTrack.metadata().get("parent_episode.uri");
                    z6xVarC = (z6xVar == null || z6xVar.length() <= 0) ? contextTrack.uri() : z6xVar;
                }
                return spq0.a(z6xVarC);
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new iyu0(xkg0Var, str2, str);
    }

    public Object m(dxy dxyVar) {
        return qgo1.q((Executor) dxyVar.d(new lzy0(g8b.class, Executor.class)));
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue() && !((Boolean) obj3).booleanValue());
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return ((Boolean) obj).booleanValue();
            case 14:
                return !((uv00) obj).f;
            default:
                return !((uv00) obj).f;
        }
    }

    public void a(View view) {
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                Object obj3 = ((e331) obj).a;
                Object obj4 = ((e331) obj2).a;
                if (e331.a(obj3) == null) {
                    List list = (List) obj3;
                    if (!list.isEmpty()) {
                        if (e331.a(obj4) == null) {
                            List list2 = (List) obj4;
                            List<wab0> list3 = list;
                            ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                            for (wab0 wab0Var : list3) {
                                arrayList.add(new kcb0(wab0Var, list2.contains(new zab0(wab0Var.b))));
                            }
                            return new e331(arrayList);
                        }
                        eg.m("[Invalid Data] Missing language selections");
                        return null;
                    }
                    eg.m("[Invalid Data] Missing language definitions");
                    return null;
                }
                eg.m("[Invalid Data] Missing language definitions");
                return null;
            case 15:
                return (Integer) obj;
            default:
                return new mmr0((vov0) obj, (Boolean) obj2);
        }
    }
}
