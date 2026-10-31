package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.media.Image;
import android.media.ImageReader;
import android.os.Looper;
import android.view.Surface;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.productstate.ConvertProductStateValueException;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.offline_esperanto.proto.EsOffline$PrepareResourceResponse;
import com.spotify.player.model.PlayerState;
import com.spotify.profile.profile.proto.ProfilelistResponse;
import com.spotify.signup.signup.v2.proto.GetSignupFlagsResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rh20 implements hsg0, Function, Predicate, ukb0, Init, BiFunction, mog0, Producer, s2i1 {
    public final /* synthetic */ byte a;
    public static final rh20 b = new rh20(0);
    public static final rh20 c = new rh20(1);
    public static final rh20 d = new rh20(2);
    public static final rh20 e = new rh20(3);
    public static final rh20 f = new rh20(4);
    public static final rh20 g = new rh20(5);
    public static final rh20 h = new rh20(6);
    public static final rh20 i = new rh20(7);
    public static final rh20 t = new rh20(8);
    public static final rh20 X = new rh20(9);
    public static final rh20 Y = new rh20(10);
    public static final rh20 Z = new rh20(11);
    public static final rh20 N0 = new rh20(12);
    public static final /* synthetic */ rh20 O0 = new rh20(13);
    public static final rh20 P0 = new rh20(14);
    public static final rh20 Q0 = new rh20(15);
    public static final rh20 R0 = new rh20(16);
    public static final rh20 S0 = new rh20(17);
    public static final rh20 T0 = new rh20(18);
    public static final rh20 U0 = new rh20(19);
    public static final rh20 V0 = new rh20(20);
    public static final rh20 W0 = new rh20(21);
    public static final rh20 X0 = new rh20(22);
    public static final rh20 Y0 = new rh20(23);
    public static final rh20 Z0 = new rh20(24);
    public static final rh20 a1 = new rh20(25);
    public static final rh20 b1 = new rh20(26);
    public static final rh20 c1 = new rh20(27);
    public static final rh20 d1 = new rh20(28);
    public static final rh20 e1 = new rh20(29);

    public /* synthetic */ rh20(byte b2) {
        this.a = b2;
    }

    public void a(nog0 nog0Var, log0 log0Var, Object obj) {
        wog0 wog0Var = (wog0) log0Var;
        fpg0 fpg0Var = wog0Var.c;
        wog0Var.c = new gpg0(((xog0) nog0Var).h, obj, wog0Var);
        fpg0Var.clear();
    }

    public Object apply(Object obj) {
        boolean zJ = true;
        switch (this.a) {
            case 1:
                ProfilelistResponse.SmallProfileList smallProfileList = (ProfilelistResponse.SmallProfileList) ((sy21) obj).b;
                return smallProfileList == null ? ProfilelistResponse.SmallProfileList.n() : smallProfileList;
            case 2:
                Throwable th = (Throwable) obj;
                Logger.e(th, "Assisted Curation Genres Loader: failed to load genres: %s", new Object[]{th.getMessage()});
                return new bj40();
            case 3:
                return ((feh) obj) instanceof ceh ? bjo.a : new ajo(3);
            case 4:
                hj70 hj70Var = (hj70) obj;
                Observable observableJust = Observable.just(hj70Var);
                return hj70Var instanceof oi70 ? observableJust.delay(500L, TimeUnit.MILLISECONDS) : observableJust;
            case 5:
                return Boolean.valueOf(((fkb) obj) == fkb.c);
            case 6:
            case 7:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 16:
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
            case 23:
            case 26:
            default:
                try {
                    zJ = yto.j((String) obj);
                    break;
                } catch (ConvertProductStateValueException e2) {
                    Logger.e(e2, "Unable to extract product state", new Object[0]);
                }
                return Boolean.valueOf(zJ);
            case 8:
                return Boolean.valueOf(y7y0.t("disable-blocked-content", (Map) obj));
            case 9:
                return new dw11(new qx11((Throwable) obj));
            case 15:
                return ((th61) obj).a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsOffline.Progress.C(bArr);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.Progress: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e3);
                    return null;
                }
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf(((EsOffline$PrepareResourceResponse) obj).n());
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return xap1.A((ei30) obj);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                sfw sfwVar = (sfw) obj;
                return new i500(sfwVar.b, sfwVar.c);
            case 22:
                nma0 nma0Var = aus0.d;
                return zts0.a((GetSignupFlagsResponse) obj);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new ebe0((kmh) obj);
            case 25:
                return (String) ((spq0) obj).b();
            case 27:
                return Boolean.valueOf(y7y0.F((Map) obj));
            case 28:
                Logger.e((Throwable) obj, "Error loading the premium checkout", new Object[0]);
                return crv0.a;
        }
    }

    public rog0 b() {
        return rog0.b;
    }

    public log0 c(nog0 nog0Var, Object obj, int i2, log0 log0Var) {
        wog0 wog0Var = (wog0) log0Var;
        return wog0Var == null ? new wog0(obj, i2) : new vog0(obj, i2, wog0Var);
    }

    public log0 d(nog0 nog0Var, log0 log0Var, log0 log0Var2) {
        xog0 xog0Var = (xog0) nog0Var;
        wog0 wog0Var = (wog0) log0Var;
        wog0 wog0Var2 = (wog0) log0Var2;
        int i2 = nog0.g;
        if (wog0Var.getValue() == null) {
            return null;
        }
        Object obj = wog0Var.a;
        int i3 = wog0Var.b;
        wog0 wog0Var3 = wog0Var2 == null ? new wog0(obj, i3) : new vog0(obj, i3, wog0Var2);
        wog0Var3.c = wog0Var.c.b(xog0Var.h, wog0Var3);
        return wog0Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(be50 be50Var, lnm lnmVar) {
        vkb0 vkb0Var;
        ImageReader imageReader;
        if (lnmVar instanceof vkb0) {
            vkb0Var = (vkb0) lnmVar;
            int i2 = vkb0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vkb0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                vkb0Var = new vkb0(this, (onm) lnmVar);
            }
        } else {
            vkb0Var = new vkb0(this, (onm) lnmVar);
        }
        Object objR = vkb0Var.b;
        int i3 = vkb0Var.d;
        if (i3 == 0) {
            hm5.M(objR);
            long j = be50Var.u;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            ImageReader imageReaderNewInstance = ImageReader.newInstance((int) (j >> 32), (int) (j & 4294967295L), 1, 1);
            try {
                vkb0Var.a = imageReaderNewInstance;
                vkb0Var.d = 1;
                ohd ohdVar = new ohd(1, aym.t(vkb0Var));
                ohdVar.t();
                imageReaderNewInstance.setOnImageAvailableListener(new wkb0(ohdVar), zno1.g(looperMyLooper));
                Surface surface = imageReaderNewInstance.getSurface();
                Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
                try {
                    canvasLockHardwareCanvas.drawColor(z4p1.G(u7h.b), PorterDuff.Mode.CLEAR);
                    Canvas canvas = v84.a;
                    u84 u84Var = new u84();
                    u84Var.a = canvasLockHardwareCanvas;
                    be50Var.c(u84Var, (be50) null);
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    objR = ohdVar.r();
                    d9n d9nVar = d9n.a;
                    if (objR == d9nVar) {
                        return d9nVar;
                    }
                    imageReader = imageReaderNewInstance;
                } catch (Throwable th) {
                    surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                imageReader = imageReaderNewInstance;
                throw th;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            imageReader = vkb0Var.a;
            try {
                hm5.M(objR);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    o0c.v(imageReader, th);
                    throw th4;
                }
            }
        }
        Bitmap bitmapP = gho1.p((Image) objR);
        o0c.v(imageReader, (Throwable) null);
        return bitmapP;
    }

    public First e0(Object obj) {
        return First.b((r0f0) obj);
    }

    public rog0 f() {
        return rog0.a;
    }

    public Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
        return new ImmediateWorkRunner();
    }

    public nog0 h(ipg0 ipg0Var, int i2) {
        return new xog0(ipg0Var, i2);
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
        return new lyu0(str3, xkg0Var, str2, str);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 6:
                return ((Boolean) obj).booleanValue();
            case 14:
                return u890.j((Boolean) obj, Boolean.TRUE);
            case 16:
                return ((PlayerState) obj).track().c();
            default:
                return ((PlayerState) obj).track().c();
        }
    }

    public void g(String str) {
    }

    public Object apply(Object obj, Object obj2) {
        return (vng1) obj;
    }
}
