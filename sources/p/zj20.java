package p;

import android.graphics.Bitmap;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.work.OverwritingInputMerger;
import com.google.mlkit.common.MlKitException;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zj20 implements Function, Function4, jy50, Predicate, Init, c611, np80, s2i1, tbt0, BiFunction {
    public final /* synthetic */ byte a;
    public static final zj20 b = new zj20(0);
    public static final zj20 c = new zj20(1);
    public static final zj20 d = new zj20(2);
    public static final zj20 e = new zj20(3);
    public static final zj20 f = new zj20(5);
    public static final zj20 g = new zj20(6);
    public static final zj20 h = new zj20(7);
    public static final zj20 i = new zj20(8);
    public static final zj20 t = new zj20(9);
    public static final zj20 X = new zj20(10);
    public static final zj20 Y = new zj20(11);
    public static final zj20 Z = new zj20(12);
    public static final zj20 N0 = new zj20(14);
    public static final zj20 O0 = new zj20(16);
    public static final zj20 P0 = new zj20(17);
    public static final zj20 Q0 = new zj20(18);
    public static final zj20 R0 = new zj20(19);
    public static final zj20 S0 = new zj20(20);
    public static final zj20 T0 = new zj20(21);
    public static final zj20 U0 = new zj20(22);
    public static final zj20 V0 = new zj20(23);
    public static final zj20 W0 = new zj20(24);
    public static final zj20 X0 = new zj20(25);
    public static final zj20 Y0 = new zj20(26);
    public static final zj20 Z0 = new zj20(27);
    public static final zj20 a1 = new zj20(28);
    public static final zj20 b1 = new zj20(29);

    public /* synthetic */ zj20(byte b2) {
        this.a = b2;
    }

    public static OverwritingInputMerger a(String str) {
        int i2 = nj80.a;
        try {
            return (OverwritingInputMerger) Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            qs10.a().getClass();
            return null;
        }
    }

    public static m0n0 b(View view) {
        Object tag = view.getTag(2131429970);
        m0n0 m0n0Var = tag instanceof m0n0 ? (m0n0) tag : null;
        if (m0n0Var != null) {
            return m0n0Var;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            return b(viewGroup);
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.mlkit.common.MlKitException */
    public static qfp0 c(mj80 mj80Var) throws MlKitException {
        int i2 = mj80Var.g;
        if (i2 == -1) {
            Bitmap bitmap = mj80Var.a;
            zod.s(bitmap);
            return new qfp0(bitmap);
        }
        if (i2 != 17) {
            if (i2 == 35) {
                return new qfp0(mj80Var.c == null ? null : (Image) mj80Var.c.a);
            }
            if (i2 != 842094169) {
                throw new MlKitException(f4i1.c(mj80Var.g, "Unsupported image format: "), 3);
            }
        }
        ByteBuffer byteBuffer = mj80Var.b;
        zod.s(byteBuffer);
        return new qfp0(byteBuffer);
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue() && ((Boolean) obj3).booleanValue() && ((Boolean) obj4).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    public Object apply(Object obj) {
        boolean z;
        Set set;
        switch (this.a) {
            case 0:
                return new ebe0((Boolean) obj);
            case 1:
                j8x0 j8x0Var = (j8x0) obj;
                List list = j8x0Var.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof obx0) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(obx0.a((obx0) it.next(), fbx0.a, (String) null, (String) null, (String) null, (q730) null, (Integer) null, 0, 4094));
                }
                return j8x0.a(j8x0Var, 0, arrayList2, (String) null, false, false, 0, 0, 125);
            case 7:
                o6c0 o6c0Var = (o6c0) obj;
                if (o6c0Var instanceof n6c0) {
                    return Collections.singletonList(new dhy("library_import_match_result", (n6c0) o6c0Var));
                }
                if (o6c0Var instanceof m6c0) {
                    return z6x.a;
                }
                eg.o();
                return null;
            case 8:
                return ((oha) obj).b;
            case 9:
                return new p1w0((Map) obj);
            case 10:
                twz0 twz0Var = (uwz0) obj;
                if ((twz0Var instanceof twz0) && (set = twz0Var.a) != null) {
                    z = set.contains(a7o0.b);
                }
                return Boolean.valueOf(z);
            case 11:
                return new mxo0((gef0) obj);
            case 12:
                return Double.valueOf(((k0u) ((spq0) obj).b()).a);
            case 16:
                return f46.Q0((Object[]) obj);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                h290 h290VarO = ((EsOffline.ContextsProgressResponse) obj).o();
                int iS = zno1.s(q7h.U(h290VarO, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj3 : h290VarO) {
                    linkedHashMap.put(((EsOffline.ContextProgress) obj3).getUri(), obj3);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), ((EsOffline.ContextProgress) entry.getValue()).n());
                }
                return linkedHashMap2;
            case 23:
                byte[] bArr = (byte[]) obj;
                try {
                    return PlaybackSettingsEsperantoService.StatusResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.playback_settings.esperanto.proto.PlaybackSettingsEsperantoService.StatusResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return o4p1.o((PlayerState) obj);
            case 27:
                return Boolean.valueOf(y7y0.t("has-podcasts-available", (Map) obj));
            case 28:
                return new kuv0((mvv0) obj);
            default:
                return l2x0.a;
        }
    }

    public int d(int i2, int i3) {
        return (i2 - 1) - i3;
    }

    public First e0(Object obj) {
        return First.b((hxa0) obj);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        switch (this.a) {
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new hks0(xkg0Var, str2, str);
            default:
                String str4 = (String) linkedHashMap.get("user_name");
                if (str4 == null || (str3 = (String) linkedHashMap.get("folder_id")) == null) {
                    return null;
                }
                return new bzu0(str4, str3, xkg0Var, str2, str);
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 5:
                return foo1.x(((ie9) obj).d);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return ((spq0) obj).c();
            default:
                return ((spq0) obj).c();
        }
    }

    public Object apply(Object obj, Object obj2) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() && !((Boolean) obj2).booleanValue());
    }
}
