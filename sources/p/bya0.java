package p;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto;
import com.spotify.metadata.esperanto.proto.GetEntityResponse;
import com.spotify.mobius.Next;
import com.spotify.player.model.PlayerError;
import com.spotify.playlist.ai.creation.v2.CreateSessionResponse;
import com.spotify.stream_reporting_debug_tracer_esperanto.proto.DebugTracerResponse;
import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentCardResponse;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import j$.util.Base64;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import spotify.autodownload.esperanto.proto.EnabledShowsCountResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bya0 implements k1q0, BiFunction, Function, Predicate, s2i1, au11, Function5 {
    public final /* synthetic */ byte a;
    public static final bya0 b = new bya0(0);
    public static final bya0 c = new bya0(1);
    public static final bya0 d = new bya0(2);
    public static final bya0 e = new bya0(3);
    public static final bya0 f = new bya0(4);
    public static final bya0 g = new bya0(5);
    public static final bya0 h = new bya0(7);
    public static final bya0 i = new bya0(8);
    public static final bya0 t = new bya0(9);
    public static final bya0 X = new bya0(10);
    public static final bya0 Y = new bya0(11);
    public static final bya0 Z = new bya0(12);
    public static final bya0 N0 = new bya0(13);
    public static final bya0 O0 = new bya0(14);
    public static final bya0 P0 = new bya0(15);
    public static final bya0 Q0 = new bya0(16);
    public static final bya0 R0 = new bya0(18);
    public static final bya0 S0 = new bya0(19);
    public static final bya0 T0 = new bya0(20);
    public static final bya0 U0 = new bya0(21);
    public static final bya0 V0 = new bya0(22);
    public static final bya0 W0 = new bya0(23);
    public static final bya0 X0 = new bya0(24);
    public static final bya0 Y0 = new bya0(25);
    public static final bya0 Z0 = new bya0(26);
    public static final bya0 a1 = new bya0(27);
    public static final bya0 b1 = new bya0(28);
    public static final bya0 c1 = new bya0(29);

    public /* synthetic */ bya0(byte b2) {
        this.a = b2;
    }

    public static void a() {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    public static Typeface b(Context context, dj4 dj4Var) {
        if (!(dj4Var instanceof dj4)) {
            dj4Var = null;
        }
        if (dj4Var == null) {
            return null;
        }
        if (!dj4Var.c && dj4Var.d == null) {
            int i2 = Build.VERSION.SDK_INT;
            File file = dj4Var.e;
            dj4Var.d = i2 >= 26 ? no80.q(file, context, dj4Var.a) : Typeface.createFromFile(file);
        }
        dj4Var.c = true;
        return dj4Var.d;
    }

    public static Next c(d1l d1lVar, p0l p0lVar) {
        if (p0lVar instanceof m0l) {
            return Next.h(d1l.a(d1lVar, ((m0l) p0lVar).a, false, (ArrayList) null, (List) null, 14));
        }
        if (p0lVar instanceof n0l) {
            c7l c7lVar = ((n0l) p0lVar).a;
            return Next.h(d1l.a(d1l.a(d1l.a(d1lVar, (ArrayList) null, false, (ArrayList) null, (List) null, 15), (ArrayList) null, c7lVar.e, (ArrayList) null, (List) null, 13), (ArrayList) null, false, c7lVar.c, (List) null, 11));
        }
        if (p0lVar instanceof o0l) {
            return Next.h(d1l.a(d1lVar, (ArrayList) null, false, (ArrayList) null, ((o0l) p0lVar).a, 7));
        }
        eg.o();
        return null;
    }

    public Object apply(Object obj) {
        wrd1 wrd1Var;
        switch (this.a) {
            case 3:
                Object obj2 = ((e331) obj).a;
                if (e331.a(obj2) != null) {
                    return x42.a;
                }
                yav yavVar = (yav) obj2;
                List<String> list = yavVar.a;
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    wrd1.c.getClass();
                    wrd1[] wrd1VarArrValues = wrd1.values();
                    int length = wrd1VarArrValues.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            wrd1Var = wrd1VarArrValues[i2];
                            if (!u890.j(wrd1Var.name(), str)) {
                                i2++;
                            }
                        } else {
                            wrd1Var = null;
                        }
                    }
                    if (wrd1Var != null) {
                        arrayList.add(wrd1Var);
                    }
                }
                return new y42(yavVar.b, arrayList, yavVar.c);
            case 4:
                CreateSessionResponse createSessionResponse = (CreateSessionResponse) obj;
                return new da61(createSessionResponse.getSessionId(), createSessionResponse.getSuggestedPromptsList(), z6x.a, (String) null);
            case 5:
                List list2 = (List) obj;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new zfb((BluetoothDevice) it.next()));
                }
                return arrayList2;
            case 6:
            case 13:
            case 14:
            case 17:
            case 19:
            case 22:
            case 25:
            case 26:
            default:
                return new dyt0((PlayerError) obj);
            case 7:
                return ((xh90) o7h.q0(((hi90) obj).X)).a;
            case 8:
                byte[] bArr = (byte[]) obj;
                try {
                    return AudioSinkChainWrapperEsperanto.WriteResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.audio_sink_chain_wrapper_esperanto.proto.AudioSinkChainWrapperEsperanto.WriteResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 9:
                return Boolean.valueOf(((EnabledShowsCountResponse) obj).n() > 0);
            case 10:
                List<d321> list3 = (List) obj;
                ArrayList arrayList3 = new ArrayList(q7h.U(list3, 10));
                for (d321 d321Var : list3) {
                    arrayList3.add(new wab0(d321Var.a, d321Var.c));
                }
                return new e331(arrayList3);
            case 11:
                return CompletableEmpty.a;
            case 12:
                return (ug41) ((mmr0) obj).a;
            case 15:
                return (zsx0) obj;
            case 16:
                return new pfh((GetCommentCardResponse) obj);
            case 18:
                return Boolean.valueOf(y7y0.t("obfuscate-restricted-tracks", (Map) obj));
            case 20:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return DebugTracerResponse.n(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.stream_reporting_debug_tracer_esperanto.proto.DebugTracerResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 21:
                return ((e1l) obj).d;
            case 23:
                n57.g("Failed in YourLibraryServiceClient.Contains", (Throwable) obj);
                return CompletableEmpty.a;
            case 24:
                return ((tr3) obj).b.a.e;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((GetEntityResponse) obj).n().s().getName();
        }
    }

    public Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new o9v0((vn90) obj, y7y0.G((Map) obj2), (n6v0) obj3, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue());
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new ltu(xkg0Var, str2, str);
    }

    public lu11 k(fe00 fe00Var, unb1 unb1Var) {
        if (fe00Var.equals(be00.a)) {
            return gu11.a;
        }
        return null;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 13:
                return ((Boolean) obj).booleanValue();
            case 14:
                return ((sy21) obj).a.Q0;
            default:
                return ((e2l) obj).a;
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(647);
        view.setPadding(nk80VarI.a, view.getPaddingTop(), nk80VarI.c, view.getPaddingBottom());
        return hsl1Var;
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                return new ept0((String) obj, ((Boolean) obj2).booleanValue(), (ipt0) null, 60);
            default:
                return new mmr0((u5n) obj, (Boolean) obj2);
        }
    }
}
