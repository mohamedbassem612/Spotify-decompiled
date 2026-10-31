package p;

import android.content.ClipData;
import android.content.Intent;
import com.spotify.kidsaccount.api.v2.proto.Child;
import com.spotify.kidsaccount.api.v2.proto.GetChildrenResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b610 implements Function, Init, pmv0, qjl1, Predicate, jrn0, au11, av30, BiFunction, b2i, s2i1 {
    public final /* synthetic */ byte a;
    public static final b610 b = new b610(0);
    public static final b610 c = new b610(1);
    public static final b610 d = new b610(2);
    public static final b610 e = new b610(4);
    public static final String[] f = new String[0];
    public static final b610 g = new b610(6);
    public static final b610 h = new b610(7);
    public static final b610 i = new b610(8);
    public static final b610 t = new b610(9);
    public static final b610 X = new b610(10);
    public static final b610 Y = new b610(11);
    public static final b610 Z = new b610(12);
    public static final b610 N0 = new b610(13);
    public static final b610 O0 = new b610(14);
    public static final b610 P0 = new b610(15);
    public static final b610 Q0 = new b610(16);
    public static final b610 R0 = new b610(17);
    public static final b610 S0 = new b610(18);
    public static final b610 T0 = new b610(19);
    public static final b610 U0 = new b610(20);
    public static final b610 V0 = new b610(21);
    public static final b610 W0 = new b610(22);
    public static final b610 X0 = new b610(23);
    public static final b610 Y0 = new b610(24);
    public static final b610 Z0 = new b610(25);
    public static final b610 a1 = new b610(26);
    public static final b610 b1 = new b610(27);
    public static final b610 c1 = new b610(28);
    public static final b610 d1 = new b610(29);

    public /* synthetic */ b610(byte b2) {
        this.a = b2;
    }

    public static Next e(g150 g150Var, x150 x150Var) {
        return Next.h(g150.a(g150Var, false, b150.a, x150Var, 3));
    }

    public void a(sjl1 sjl1Var, qpj1 qpj1Var) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((u510) ((w510) obj)).a);
            case 1:
                cma1 cma1Var = (cma1) obj;
                return Boolean.valueOf(cma1Var.b == 1 && u890.j(cma1Var.a, Boolean.TRUE));
            case 2:
            case 3:
            case 4:
            case 5:
            case 9:
            case 13:
            case 16:
            case 21:
            case 22:
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
            case 26:
            case 27:
            default:
                return new ouv0((mvv0) obj);
            case 6:
                return new n3a0((Set) obj);
            case 7:
                List childrenList = ((GetChildrenResponse) obj).getChildrenList();
                ArrayList<Child> arrayList = new ArrayList();
                for (Object obj2 : childrenList) {
                    if (((Child) obj2).n().getAllowedInMusicApp()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (Child child : arrayList) {
                    arrayList2.add(new gzf(Integer.valueOf(child.n().getColor().getValue()), child.getChildId(), child.n().getName(), child.getImageUri().getValue(), child.n().getDateOfBirth(), false, false));
                }
                return arrayList2;
            case 8:
                return Boolean.valueOf(y7y0.G((Map) obj));
            case 10:
                return Observable.empty();
            case 11:
                return new daf0(((Boolean) obj).booleanValue());
            case 12:
                String str = (String) ((PlayerState) obj).playbackId().h();
                return str == null ? "absent" : str;
            case 14:
                return rih1.a;
            case 15:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (yvg1 yvg1Var : (List) obj) {
                    String str2 = (String) yvg1Var.a;
                    Class cls = (Class) yvg1Var.b;
                    hoj0 hoj0Var = (hoj0) yvg1Var.c;
                    if (hoj0Var != null) {
                        Object linkedHashMap2 = linkedHashMap.get(str2);
                        if (linkedHashMap2 == null) {
                            linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap.put(str2, linkedHashMap2);
                        }
                        ((Map) linkedHashMap2).put(cls, hoj0Var);
                    }
                }
                return new mjj0(new ioj0(sqg0.U(linkedHashMap)));
            case 17:
                return Boolean.valueOf(((e2p0) obj).j);
            case 18:
                return new jk91((Map) obj);
            case 19:
                Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
                int iS = zno1.s(q7h.U(setEntrySet, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS);
                for (Map.Entry entry : setEntrySet) {
                    linkedHashMap3.put(new a2v((String) entry.getKey(), 1), (h2v) entry.getValue());
                }
                return linkedHashMap3;
            case 20:
                return new ok91(((Boolean) obj).booleanValue());
            case 24:
                byte[] bArr = (byte[]) obj;
                try {
                    return PlaybackSettingsEsperantoService.StreamSettingChange.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService.StreamSettingChange: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                rzh rzhVar = (rzh) obj;
                return rzhVar.c instanceof zkb ? j5.a : new i5w0(rzhVar);
            case 28:
                return pbv0.a;
        }
    }

    public boolean b(ClipData.Item item) {
        return item.getText() != null;
    }

    public void c(sjl1 sjl1Var, iyh1 iyh1Var) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public First e0(Object obj) {
        e340 e340Var = (e340) obj;
        e340Var.getClass();
        return e340Var.e == 1 ? First.b(e340Var) : First.c(e340Var, f46.S0(new i240[]{new d240(e340Var.b().b), new g240(e340Var.h, e340Var.d)}));
    }

    public af5 h(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(224448670);
        af5 af5VarK = bro1.k(cwl1.o0(x340Var, 2131961936), cwl1.o0(x340Var, 2131961933), x340Var);
        x340Var.r(false);
        return af5VarK;
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3 = (String) linkedHashMap.get("playlist_id");
        if (str3 == null || str3.length() != 22) {
            return null;
        }
        int length = str3.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str3.charAt(i2);
            if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                return null;
            }
        }
        return new wxu0(str3, xkg0Var, str2, str);
    }

    public String[] j() {
        return f;
    }

    public /* bridge */ /* synthetic */ lu11 k(fe00 fe00Var, unb1 unb1Var) {
        return null;
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Integer numC0;
        Set set = s4b1.f;
        String strN = uic.x(intent.getDataString()).n("banner_type");
        return new hrn0(qah0.class, new sah0((strN == null || (numC0 = nhc1.c0(strN)) == null) ? null : f8a.a(numC0.intValue())), new c6w0(1, true, (hd5) null, 12));
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 9:
                return !((uv00) obj).f;
            default:
                mmr0 mmr0Var = (mmr0) obj;
                return ((spq0) mmr0Var.a).c() || ((spq0) mmr0Var.b).c();
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 21:
                f6r0 f6r0Var = (f6r0) obj2;
                return !f6r0Var.equals(ukg.a) ? f6r0Var : (f6r0) obj;
            default:
                return new mmr0(((mmr0) obj).b, (Set) obj2);
        }
    }
}
