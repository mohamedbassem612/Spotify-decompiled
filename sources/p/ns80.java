package p;

import android.bluetooth.BluetoothDevice;
import com.comscore.streaming.ContentMediaFormat;
import com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.pending_events.esperanto.proto.CommitPendingEventResponse;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ns80 implements Function, BiFunction, Predicate, Init, Function3, np80, au11, BiPredicate {
    public static boolean c;
    public static boolean d;
    public final /* synthetic */ byte a;
    public static final ns80 b = new ns80(0);
    public static final ns80 e = new ns80(1);
    public static final ns80 f = new ns80(2);
    public static final ns80 g = new ns80(3);
    public static final ns80 h = new ns80(4);
    public static final ns80 i = new ns80(5);
    public static final ns80 t = new ns80(6);
    public static final ns80 X = new ns80(7);
    public static final ns80 Y = new ns80(8);
    public static final ns80 Z = new ns80(9);
    public static final ns80 N0 = new ns80(10);
    public static final ns80 O0 = new ns80(11);
    public static final ns80 P0 = new ns80(12);
    public static final ns80 Q0 = new ns80(13);
    public static final ns80 R0 = new ns80(14);
    public static final ns80 S0 = new ns80(15);
    public static final ns80 T0 = new ns80(16);
    public static final ns80 U0 = new ns80(17);
    public static final ns80 V0 = new ns80(18);
    public static final ns80 W0 = new ns80(19);
    public static final ns80 X0 = new ns80(20);
    public static final ns80 Y0 = new ns80(21);
    public static final ns80 Z0 = new ns80(22);
    public static final ns80 a1 = new ns80(23);
    public static final ns80 b1 = new ns80(24);
    public static final ns80 c1 = new ns80(25);
    public static final ns80 d1 = new ns80(26);
    public static final ns80 e1 = new ns80(27);
    public static final ns80 f1 = new ns80(28);
    public static final ns80 g1 = new ns80(29);

    public /* synthetic */ ns80(byte b2) {
        this.a = b2;
    }

    public static final void a() {
        if (dhn.a.contains(ns80.class)) {
            return;
        }
        try {
            c = true;
            d = b120.b("FBSDKFeatureIntegritySample", wf10.b(), false);
        } catch (Throwable th) {
            dhn.a(ns80.class, th);
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                List<ev> list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (ev evVar : list) {
                    arrayList.add(new c5i1(evVar.a, evVar.b, evVar.c));
                }
                return new mn(arrayList);
            case 2:
            case 3:
            case 5:
            case 12:
            case 14:
            case 15:
            case 16:
            case 20:
            case 22:
            default:
                ly21 ly21Var = (py21) obj;
                if (ly21Var instanceof ly21) {
                    return Single.error(new Throwable("Failed to get playlist: " + ly21Var.a));
                }
                if (ly21Var instanceof oy21) {
                    return Single.just(((qxc0) ((oy21) ly21Var).a).a);
                }
                eg.o();
                return null;
            case 4:
                return Boolean.valueOf(y7y0.t("is-euterpe", (Map) obj));
            case 6:
                return Boolean.valueOf(((mx4) obj).a);
            case 7:
                return (hi90) obj;
            case 8:
                byte[] bArr = (byte[]) obj;
                try {
                    return AudioSinkChainWrapperEsperanto.ReadResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto.ReadResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 9:
                return crn0.a;
            case 10:
                String strContextUri = ((PlayerState) obj).contextUri();
                return strContextUri == null ? "" : strContextUri;
            case 11:
                CommitPendingEventResponse commitPendingEventResponse = (CommitPendingEventResponse) obj;
                return commitPendingEventResponse.o() ? CompletableEmpty.a : Completable.j(new m9("Can't commit pending event", commitPendingEventResponse.n()));
            case 13:
                mmr0 mmr0Var = (mmr0) obj;
                gmc gmcVar = (gmc) mmr0Var.a;
                return gmc.a(gmcVar, gmcVar.d.length() > 0 ? gmcVar.d : (String) mmr0Var.b, (d3j0) null, ContentMediaFormat.PARTIAL_CONTENT_PODCAST);
            case 17:
                for (l0l l0lVar : (List) obj) {
                    if (l0lVar.l()) {
                        return l0lVar;
                    }
                }
                bhn0.t("Collection contains no element matching the predicate.");
                return null;
            case 18:
                return Boolean.valueOf(y7y0.t("disable-blocked-content", (Map) obj));
            case 19:
                return new u5n((eww0) obj);
            case 21:
                return ((e1l) obj).c;
            case 23:
                Double d2 = ((z7l) obj).c;
                d2.getClass();
                return d2;
            case 24:
                return ((tr3) obj).b.a.d;
        }
    }

    public boolean b(String str) {
        Set set = dhn.a;
        if (set.contains(this)) {
            return false;
        }
        try {
            String str2 = null;
            if (!set.contains(this)) {
                try {
                    float[] fArr = new float[30];
                    for (int i2 = 0; i2 < 30; i2++) {
                        fArr[i2] = 0.0f;
                    }
                    String[] strArrF = dim0.f(1, new float[][]{fArr}, new String[]{str});
                    if (strArrF == null || (str2 = strArrF[0]) == null) {
                        str2 = "none";
                    }
                } catch (Throwable th) {
                    dhn.a(this, th);
                }
            }
            return !"none".equals(str2);
        } catch (Throwable th2) {
            dhn.a(this, th2);
            return false;
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 14:
                return First.b((rde) obj);
            default:
                etu etuVar = (etu) obj;
                Set setSingleton = Collections.singleton(asu.a);
                Set set = etuVar.d;
                ArrayList arrayList = new ArrayList(q7h.U(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(new esu((String) it.next()));
                }
                return First.c(etuVar, dm61.y0(setSingleton, arrayList));
        }
    }

    public lu11 k(fe00 fe00Var, unb1 unb1Var) {
        if (fe00Var.equals(be00.a)) {
            return gu11.a;
        }
        return null;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        Object objInvoke;
        atq0 atq0Var = (atq0) obj;
        w9f w9fVar = new w9f((Boolean) obj2, (n131) obj3, (byte) 21);
        if (atq0Var instanceof zsq0) {
            objInvoke = w9fVar.invoke(atq0Var);
        } else {
            if (!(atq0Var instanceof xsq0)) {
                eg.o();
                return null;
            }
            objInvoke = (xsq0) atq0Var;
        }
        return (atq0) objInvoke;
    }

    public boolean test(Object obj) {
        String strJ;
        String str;
        switch (this.a) {
            case 3:
                return ((uv00) obj).c();
            case 15:
                return !((uv00) obj).f;
            default:
                String strContextUri = ((PlayerError) obj).contextUri();
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(strContextUri);
                String str2 = null;
                if (s4b1VarX.c != blc0.ea) {
                    s4b1VarX = null;
                }
                if (s4b1VarX == null || (strJ = s4b1VarX.j()) == null) {
                    strJ = null;
                }
                if (strJ == null) {
                    jxu0 jxu0VarC = oxu0.a.c(strContextUri);
                    jxu0 jxu0Var = jxu0VarC instanceof jxu0 ? jxu0VarC : null;
                    if (jxu0Var != null) {
                        if (!u890.j(jxu0Var.a, "listening-party") || !cmd0.a.e(jxu0Var.b)) {
                            jxu0Var = null;
                        }
                        if (jxu0Var != null && (str = jxu0Var.b) != null) {
                            str2 = str;
                        }
                    }
                } else {
                    str2 = strJ;
                }
                return str2 != null;
        }
    }

    public boolean test(Object obj, Object obj2) {
        return u890.j(((vn90) obj).getItems(), ((vn90) obj2).getItems());
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                return new ept0((String) obj, ((Boolean) obj2).booleanValue(), (ipt0) null, 60);
            case 5:
                ArrayList arrayListN0 = o7h.N0((List) obj2, (List) obj);
                ArrayList arrayList = new ArrayList(q7h.U(arrayListN0, 10));
                Iterator it = arrayListN0.iterator();
                while (it.hasNext()) {
                    arrayList.add(new zfb((BluetoothDevice) it.next()));
                }
                return arrayList;
            case 12:
                return new mmr0((ug41) obj, (Set) obj2);
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue());
        }
    }
}
