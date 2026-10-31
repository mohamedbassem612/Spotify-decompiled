package p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.agentstories.v1.GetStoriesResponse;
import com.spotify.agentstories.v1.StoryFrame;
import com.spotify.agentstories.v1.StorySource;
import com.spotify.base.java.logging.Logger;
import com.spotify.download.esperanto.proto.EsDownload$GetMediaHandleIdResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CacheState;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.prefs.esperanto.proto.EsPrefs;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromRunnable;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s321 implements Function, BiFunction, s2i1, xkb, jrn0, Predicate, luo {
    public final /* synthetic */ byte a;
    public static final s321 b = new s321(0);
    public static final s321 c = new s321(1);
    public static final s321 d = new s321(2);
    public static final s321 e = new s321(3);
    public static final s321 f = new s321(4);
    public static final s321 g = new s321(5);
    public static final s321 h = new s321(6);
    public static final s321 i = new s321(7);
    public static final s321 t = new s321(8);
    public static final s321 X = new s321(9);
    public static final s321 Y = new s321(10);
    public static final s321 Z = new s321(11);
    public static final s321 N0 = new s321(12);
    public static final s321 O0 = new s321(13);
    public static final s321 P0 = new s321(14);
    public static final s321 Q0 = new s321(15);
    public static final s321 R0 = new s321(16);
    public static final s321 S0 = new s321(17);
    public static final s321 T0 = new s321(18);
    public static final s321 U0 = new s321(20);
    public static final s321 V0 = new s321(21);
    public static final s321 W0 = new s321(22);
    public static final s321 X0 = new s321(23);
    public static final s321 Y0 = new s321(24);
    public static final s321 Z0 = new s321(25);
    public static final s321 a1 = new s321(26);
    public static final s321 b1 = new s321(27);
    public static final s321 c1 = new s321(28);
    public static final s321 d1 = new s321(29);

    public /* synthetic */ s321(byte b2) {
        this.a = b2;
    }

    public static final Bundle a(String str, List list, int i2) {
        String str2;
        if (!dhn.a.contains(s321.class)) {
            try {
                Bundle bundle = new Bundle();
                if (i2 == 1) {
                    str2 = "MOBILE_APP_INSTALL";
                } else {
                    if (i2 != 2) {
                        throw null;
                    }
                    str2 = "CUSTOM_APP_EVENTS";
                }
                bundle.putString("event", str2);
                bundle.putString("app_id", str);
                if (2 != i2) {
                    return bundle;
                }
                JSONArray jSONArrayB = b.b(str, list);
                if (jSONArrayB.length() != 0) {
                    bundle.putString("custom_events", jSONArrayB.toString());
                    return bundle;
                }
            } catch (Throwable th) {
                dhn.a(s321.class, th);
                return null;
            }
        }
        return null;
    }

    public static ArrayList c(String str, List list, String str2) {
        String string = ihc1.e1(str).toString();
        ArrayList<tan> arrayList = new ArrayList();
        for (Object obj : list) {
            tan tanVar = (tan) obj;
            if (ihc1.y0(string) || ihc1.h0(tanVar.b, string, true)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (tan tanVar2 : arrayList) {
            arrayList2.add(new kbn(tanVar2, u890.j(tanVar2.a, str2)));
        }
        return arrayList2;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return new uo(((oob1) obj) instanceof nlb1);
            case 2:
            case 3:
            case 4:
            case 11:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
            case 24:
            case 27:
            default:
                return new qif0(((Boolean) obj).booleanValue());
            case 5:
                return Boolean.valueOf(((ch4) obj).a);
            case 6:
                return ((Boolean) obj).booleanValue() ? k1l1.a : l1l1.a;
            case 7:
                return new x810(false, false);
            case 8:
                return new l910(false);
            case 9:
                return new CompletableFromRunnable(new s10((mmr0) obj, (byte) 12));
            case 10:
                return (ve9) ((mmr0) obj).a;
            case 15:
                return ((p0h) obj).a;
            case 18:
                h290<StoryFrame> h290VarN = ((GetStoriesResponse) obj).n();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
                for (StoryFrame storyFrame : h290VarN) {
                    String strP = storyFrame.p();
                    String strR = storyFrame.r();
                    c380 c380VarA = mqo1.A(storyFrame.n());
                    h290<StorySource> h290VarO = storyFrame.o();
                    ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, 10));
                    for (StorySource storySource : h290VarO) {
                        arrayList2.add(new dka1(storySource.getName(), storySource.getUrl(), storySource.getSubtitle()));
                    }
                    c380 c380VarA2 = mqo1.A(arrayList2);
                    int iOrdinal = storyFrame.q().ordinal();
                    int i2 = 2;
                    int i3 = 1;
                    if (iOrdinal == 1) {
                        i3 = i2;
                    } else if (iOrdinal == 2) {
                        i2 = 3;
                        i3 = i2;
                    }
                    arrayList.add(new l7c1(strP, strR, c380VarA, c380VarA2, i3));
                }
                return mqo1.A(arrayList);
            case 21:
                return (nnr) ((spq0) obj).b();
            case 22:
                Logger.e((Throwable) obj, "Failed to resolve list tracks for queue", new Object[0]);
                return zy1.f;
            case 23:
                return (l0l) ((spq0) obj).b();
            case 25:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsDownload$GetMediaHandleIdResponse.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.download.esperanto.proto.EsDownload.GetMediaHandleIdResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 26:
                Logger.e((Throwable) obj, "Error loading Spotify Checkout", new Object[0]);
                return wxz.a;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return Long.valueOf(((EsPrefs.Value) obj).p());
        }
    }

    public JSONArray b(String str, List list) {
        Set set = dhn.a;
        if (set.contains(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList<bm5> arrayList = new ArrayList(list);
            y900.b(arrayList);
            boolean zContains = set.contains(this);
            boolean z = false;
            if (!zContains) {
                try {
                    c120 c120VarK = g120.k(str, false);
                    if (c120VarK != null) {
                        z = c120VarK.a;
                    }
                } catch (Throwable th) {
                    dhn.a(this, th);
                }
            }
            for (bm5 bm5Var : arrayList) {
                boolean z2 = bm5Var.c;
                if (!z2 || (z2 && z)) {
                    jSONArray.put(bm5Var.a);
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            dhn.a(this, th2);
            return null;
        }
    }

    public Iterable e(Object obj) {
        int i2 = kht.a;
        Collection collectionL = ((tsi1) obj).l();
        ArrayList arrayList = new ArrayList(q7h.U(collectionL, 10));
        Iterator it = ((ArrayList) collectionL).iterator();
        while (it.hasNext()) {
            arrayList.add(((tsi1) it.next()).w1());
        }
        return arrayList;
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new l43(xkg0Var, str2, str);
    }

    public irn0 l(Intent intent, th61 th61Var) {
        String dataString = intent.getDataString();
        Set set = s4b1.f;
        String strB = pcf.b(uic.x(dataString));
        if (dataString == null || ihc1.y0(dataString) || strB == null || ihc1.y0(strB)) {
            return crn0.a;
        }
        Bundle extras = intent.getExtras();
        String string = extras != null ? extras.getString("tab_id") : null;
        Bundle extras2 = intent.getExtras();
        return new hrn0(nse.class, new sse(dataString, strB, string, extras2 != null ? extras2.getStringArrayList("requested_tab_ids") : null), new c6w0(2, true, (hd5) null, 12));
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 16:
                return ((String) obj).length() > 0;
            case 17:
                return !((th61) obj).c;
            default:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                return new mmr0((String) obj, (Restrictions) obj2);
            case 3:
                return new mmr0((PlayerState) obj, (b380) obj2);
            case 11:
                return new hza((cxc0) obj2, ((Boolean) obj).booleanValue());
            default:
                return Boolean.valueOf(((CacheState) obj) != CacheState.LOADING && ((Boolean) obj2).booleanValue());
        }
    }
}
