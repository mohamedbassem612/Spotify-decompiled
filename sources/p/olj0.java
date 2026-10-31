package p;

import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.spotify.aiplaylistcoverart.proto.AiPlaylistCoverArtProto;
import com.spotify.download.esperanto.proto.EsDownload$SegmentFileStreamerId;
import com.spotify.mobius.Next;
import com.spotify.stream_reporting_debug_tracer_esperanto.proto.DebugTracerResponse;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class olj0 implements Function, BiFunction, Predicate, BiPredicate, jrn0, n8n, q4t {
    public final /* synthetic */ byte a;
    public static final olj0 b = new olj0(0);
    public static final olj0 c = new olj0(1);
    public static final olj0 d = new olj0(2);
    public static final olj0 e = new olj0(3);
    public static final olj0 f = new olj0(4);
    public static final olj0 g = new olj0(5);
    public static final olj0 h = new olj0(6);
    public static final olj0 i = new olj0(7);
    public static final olj0 t = new olj0(8);
    public static final olj0 X = new olj0(9);
    public static final olj0 Y = new olj0(11);
    public static final olj0 Z = new olj0(12);
    public static final olj0 N0 = new olj0(13);
    public static final olj0 O0 = new olj0(14);
    public static final olj0 P0 = new olj0(15);
    public static final olj0 Q0 = new olj0(16);
    public static final olj0 R0 = new olj0(17);
    public static final olj0 S0 = new olj0(18);
    public static final /* synthetic */ olj0 T0 = new olj0(19);
    public static final olj0 U0 = new olj0(20);
    public static final olj0 V0 = new olj0(21);
    public static final olj0 W0 = new olj0(22);
    public static final olj0 X0 = new olj0(23);
    public static final olj0 Y0 = new olj0(24);
    public static final olj0 Z0 = new olj0(25);
    public static final olj0 a1 = new olj0(26);
    public static final olj0 b1 = new olj0(27);
    public static final olj0 c1 = new olj0(28);
    public static final olj0 d1 = new olj0(29);

    public /* synthetic */ olj0(byte b2) {
        this.a = b2;
    }

    public static final ArrayList b(View view) {
        if (dhn.a.contains(olj0.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroupI = ibk1.i(view);
            if (viewGroupI != null) {
                for (View view2 : ibk1.b(viewGroupI)) {
                    if (view != view2) {
                        arrayList.addAll(b.d(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            dhn.a(olj0.class, th);
            return null;
        }
    }

    public static final ArrayList c(View view) {
        List listX;
        if (dhn.a.contains(olj0.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(ibk1.h(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    Pattern patternCompile = Pattern.compile("/");
                    ihc1.N0(0);
                    Matcher matcher = patternCompile.matcher(resourceName);
                    if (matcher.find()) {
                        ArrayList arrayList2 = new ArrayList(10);
                        int iEnd = 0;
                        do {
                            arrayList2.add(resourceName.subSequence(iEnd, matcher.start()).toString());
                            iEnd = matcher.end();
                        } while (matcher.find());
                        arrayList2.add(resourceName.subSequence(iEnd, resourceName.length()).toString());
                        listX = arrayList2;
                    } else {
                        listX = k4p1.x(resourceName.toString());
                    }
                    String[] strArr = (String[]) listX.toArray(new String[0]);
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList3 = new ArrayList();
            for (String str : arrayList) {
                if (str.length() > 0 && str.length() <= 100) {
                    arrayList3.add(str.toLowerCase());
                }
            }
            return arrayList3;
        } catch (Throwable th) {
            dhn.a(olj0.class, th);
            return null;
        }
    }

    public static final boolean e(ArrayList arrayList, ArrayList arrayList2) {
        if (!dhn.a.contains(olj0.class)) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    olj0 olj0Var = b;
                    if (!dhn.a.contains(olj0Var)) {
                        try {
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                if (ihc1.h0(str, (String) it2.next(), false)) {
                                    return true;
                                }
                            }
                        } catch (Throwable th) {
                            dhn.a(olj0Var, th);
                        }
                    }
                }
            } catch (Throwable th2) {
                dhn.a(olj0.class, th2);
                return false;
            }
        }
        return false;
    }

    public static Next f(aa9 aa9Var, int i2, boolean z, boolean z2) {
        return Next.a(Collections.singleton(new h99(z ? (s2c1) aa9Var.b.get(i2) : (s2c1) aa9Var.a.get(i2), z, i2, z2)));
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return xo.a;
            case 2:
                return new e331(new m231((Throwable) obj));
            case 3:
            case 8:
            case 10:
            case 12:
            case 13:
            case 14:
            case 17:
            case 19:
            case 21:
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
            case 24:
            case 27:
            default:
                return dxz.a;
            case 4:
                return o7h.y0(((AiPlaylistCoverArtProto.GetPlaylistImageBackgroundResponse) obj).getPictureId(), "", (String) null, (String) null, b03.d, 30);
            case 5:
                return ((n84) obj).a;
            case 6:
                return Boolean.valueOf(((z15) obj).a);
            case 7:
                CollectionDecorateResponse collectionDecorateResponse = (CollectionDecorateResponse) obj;
                if (collectionDecorateResponse.getArtistCount() != 0) {
                    return collectionDecorateResponse.o();
                }
                hhg1.n("We should have an Artist Model");
                return null;
            case 9:
                return Boolean.valueOf(((String) obj).equals("1"));
            case 11:
                return new yoc1((j331) obj);
            case 15:
                return Boolean.valueOf(y7y0.t("apply-child-content-restrictions", (Map) obj));
            case 16:
                return new qfh((bce0) obj);
            case 18:
                return Boolean.valueOf(y7y0.t("obfuscate-restricted-tracks", (Map) obj));
            case 20:
                byte[] bArr = (byte[]) obj;
                try {
                    return DebugTracerResponse.n(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.stream_reporting_debug_tracer_esperanto.proto.DebugTracerResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 22:
                return lrg0.a;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsDownload$SegmentFileStreamerId.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.download.esperanto.proto.EsDownload.SegmentFileStreamerId: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 26:
                return new fzz((List) obj);
            case 28:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "Unknown Error";
                }
                return new vdz(message);
        }
    }

    public ArrayList d(View view) {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String string = ((TextView) view).getText().toString();
                if (string.length() > 0 && string.length() < 100) {
                    arrayList.add(string.toLowerCase());
                    return arrayList;
                }
            } else {
                Iterator it = ibk1.b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(d((View) it.next()));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    public irn0 l(Intent intent, th61 th61Var) {
        String stringExtra = intent.getStringExtra("pronouns");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new hrn0(mee.class, new nee(stringExtra), new c6w0(1, false, ed5.c, 10));
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 8:
                return ((Boolean) obj).booleanValue();
            case 13:
                return ((Boolean) obj).booleanValue();
            case 21:
                return ((h06) obj) == h06.a;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return ((bp90) obj).a;
            default:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
        }
    }

    public void a() {
    }

    public boolean test(Object obj, Object obj2) {
        zib zibVar = (zib) obj;
        zib zibVar2 = (zib) obj2;
        yib yibVar = yib.a;
        if (zibVar.equals(yibVar) && zibVar2.equals(yibVar)) {
            return true;
        }
        xib xibVar = xib.a;
        return zibVar.equals(xibVar) && zibVar2.equals(xibVar);
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 3:
                return new mmr0((l62) obj, (Long) obj2);
            default:
                l0l l0lVar = (l0l) ((spq0) obj).h();
                l0l l0lVar2 = (l0l) ((spq0) obj2).h();
                if (l0lVar == null || (l0lVar2 != null && l0lVar.l())) {
                    l0lVar = l0lVar2;
                }
                return spq0.a(l0lVar);
        }
    }
}
