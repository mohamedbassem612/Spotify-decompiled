package p;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.authentication.login5esperanto.EsCodeRequired;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformContextItemsResponse;
import com.spotify.download.esperanto.proto.EsDownload$VideoBandwidthResponse;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkShadow;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.player.model.PlayerState;
import com.spotify.your_library_esperanto.proto.AlsoAvailableOfflineResponse;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zhm0 implements Function, Init, au11, cl6, ze, Predicate, BiFunction {
    public final /* synthetic */ byte a;
    public static final zhm0 b = new zhm0(2);
    public static final zhm0 c = new zhm0(3);
    public static final zhm0 d = new zhm0(4);
    public static final zhm0 e = new zhm0(5);
    public static final zhm0 f = new zhm0(6);
    public static final zhm0 g = new zhm0(7);
    public static final zhm0 h = new zhm0(8);
    public static final zhm0 i = new zhm0(9);
    public static final zhm0 t = new zhm0(10);
    public static final zhm0 X = new zhm0(11);
    public static final zhm0 Y = new zhm0(12);
    public static final zhm0 Z = new zhm0(13);
    public static final zhm0 N0 = new zhm0(15);
    public static final zhm0 O0 = new zhm0(16);
    public static final zhm0 P0 = new zhm0(17);
    public static final zhm0 Q0 = new zhm0(18);
    public static final zhm0 R0 = new zhm0(19);
    public static final zhm0 S0 = new zhm0(20);
    public static final zhm0 T0 = new zhm0(21);
    public static final zhm0 U0 = new zhm0(22);
    public static final zhm0 V0 = new zhm0(23);
    public static final zhm0 W0 = new zhm0(24);
    public static final zhm0 X0 = new zhm0(25);
    public static final zhm0 Y0 = new zhm0(26);
    public static final zhm0 Z0 = new zhm0(27);
    public static final zhm0 a1 = new zhm0(28);
    public static final zhm0 b1 = new zhm0(29);

    public /* synthetic */ zhm0(byte b2) {
        this.a = b2;
    }

    public static void b(View view, String str) {
        int iFloor;
        int color = view.getContext().getColor(2131101503);
        GradientDrawable.Orientation orientation = bno1.s(view.getContext()) ? GradientDrawable.Orientation.TR_BL : GradientDrawable.Orientation.TL_BR;
        Pattern patternCompile = Pattern.compile("^#[a-fA-F0-9]{6}$");
        if (str.length() <= 0 || ihc1.p0(str) != '#') {
            str = "#".concat(str);
        }
        if (patternCompile.matcher(str).find()) {
            color = Color.parseColor(str);
        }
        boolean zContains = p7h.M(new GradientDrawable.Orientation[]{GradientDrawable.Orientation.BL_TR, GradientDrawable.Orientation.BR_TL, GradientDrawable.Orientation.TL_BR, GradientDrawable.Orientation.TR_BL}).contains(orientation);
        ArrayList arrayList = new ArrayList();
        double dSqrt = (500.0d - Math.sqrt(250000.0d)) / 490.0d;
        while (true) {
            if (dSqrt >= 1.0d && Math.copySign(dSqrt - 1.0d, 1.0d) > 0.001d && dSqrt != 1.0d && (!Double.isNaN(dSqrt) || !Double.isNaN(1.0d))) {
                break;
            }
            if (zContains) {
                iFloor = Math.max((int) Math.floor(255.0d - (((double) ((float) dSqrt)) * 510.0d)), 0);
            } else {
                float f2 = (float) dSqrt;
                iFloor = (int) Math.floor(((245.0f * ((float) Math.pow(f2, 2.0d))) - (500.0f * f2)) + 255.0f);
            }
            arrayList.add(Integer.valueOf(uah.l(color, iFloor)));
            dSqrt += 0.05d;
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, o7h.k1(arrayList));
        gradientDrawable.setAlpha(204);
        view.setBackground(gradientDrawable);
    }

    public static hvf c(dah dahVar) {
        hvf hvfVar = dahVar.a0;
        if (hvfVar != null) {
            return hvfVar;
        }
        long jD = eah.d(dahVar, nvf.d);
        long j = u7h.j;
        int i2 = nvf.b;
        long jD2 = eah.d(dahVar, i2);
        int i3 = nvf.c;
        hvf hvfVar2 = new hvf(jD, j, jD2, j, u7h.b(eah.d(dahVar, i3), 0.38f, 0.0f, 0.0f, 0.0f, 14), j, u7h.b(eah.d(dahVar, i3), 0.38f, 0.0f, 0.0f, 0.0f, 14), eah.d(dahVar, i2), eah.d(dahVar, nvf.f), u7h.b(eah.d(dahVar, i3), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, nvf.e), 0.38f, 0.0f, 0.0f, 0.0f, 14), u7h.b(eah.d(dahVar, i3), 0.38f, 0.0f, 0.0f, 0.0f, 14));
        dahVar.a0 = hvfVar2;
        return hvfVar2;
    }

    public static void d(ViewGroup viewGroup, ArtworkView[] artworkViewArr, ConstraintLayout constraintLayout, ArtworkShadow artworkShadow, gw70 gw70Var, TextView[] textViewArr) {
        viewGroup.setLayoutParams(new qhl(-1, -2));
        int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(2131165280);
        viewGroup.setPaddingRelative(dimensionPixelSize, viewGroup.getPaddingTop(), dimensionPixelSize, viewGroup.getPaddingBottom());
        for (ArtworkView artworkView : artworkViewArr) {
            artworkView.setViewContext(new f47(gw70Var));
        }
        ArtworkView artworkView2 = artworkViewArr.length == 0 ? null : (ArtworkView) f46.j0(artworkViewArr);
        if (artworkView2 != null) {
            artworkShadow.b(artworkView2, true);
        }
        if (constraintLayout != null) {
            lvx.t(constraintLayout, viewGroup.getResources().getDimensionPixelSize(2131166479));
        }
        lvx.t(viewGroup, viewGroup.getResources().getDimensionPixelSize(2131166484));
        v9w0 v9w0VarP = b2u.p(viewGroup);
        Collections.addAll(v9w0VarP.d, (View[]) Arrays.copyOf(artworkViewArr, artworkViewArr.length));
        Collections.addAll(v9w0VarP.c, (View[]) Arrays.copyOf(textViewArr, textViewArr.length));
        v9w0VarP.a();
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                return new oxe0((cw80) obj);
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
            case grn1.d /* 12 */:
            case 13:
            case 14:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
            case 26:
            default:
                return (Single) obj;
            case 5:
                return ((PlayerState) obj).track();
            case 10:
                return ((zib) obj) instanceof yib ? qj9.a : rj9.a;
            case 15:
                byte[] bArr = (byte[]) obj;
                try {
                    return CollectionPlatformContextItemsResponse.n(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.collection_platform.esperanto.proto.CollectionPlatformContextItemsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 16:
                return new moh((ace0) obj);
            case 17:
                return new gxz(((Boolean) obj).booleanValue());
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsResponseWithReasons.ResponseWithReasons.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 19:
                return new ygx0(Collections.singleton((String) obj));
            case 21:
                return ((Observable) obj).delay(5L, TimeUnit.SECONDS);
            case 22:
                int i2 = ((ywp0) obj).a;
                return Boolean.valueOf(i2 == 2 || i2 == 3);
            case 23:
                return Integer.valueOf((int) ((Number) obj).longValue());
            case 24:
                n57.e("[Puffin] DisableProcessingUseCase failed: " + ((Throwable) obj));
                return Completable.j(o9n.a);
            case 25:
                return new udj1(((EsDownload$VideoBandwidthResponse) obj).n());
            case 27:
                return Boolean.FALSE;
            case 28:
                return m6p1.q((EsResponseWithReasons.ResponseWithReasons) obj);
        }
    }

    public First e0(Object obj) {
        return First.b((ahm0) obj);
    }

    public lu11 k(fe00 fe00Var, unb1 unb1Var) {
        if (fe00Var.equals(be00.a)) {
            return gu11.a;
        }
        return null;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 8:
                return ((EsCodeRequired.CodeRequiredProceedResult) obj).o();
            case 9:
                return !((uv00) obj).f;
            case 10:
            case grn1.d /* 12 */:
            default:
                return ((AlsoAvailableOfflineResponse) obj).hasData();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return ((sy21) obj).a.Q0;
            case 13:
                return ((j380) ((PlayerState) obj).track().i(bx8.e).e(gg11.g)).containsKey("canvas.id");
        }
    }

    public void a(String str) {
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case grn1.d /* 12 */:
                return new mmr0((Map) obj, (Boolean) obj2);
            default:
                return new szx((PlayerState) obj, (e090) obj2);
        }
    }
}
