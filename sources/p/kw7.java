package p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorSpace;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.icu.text.ListFormatter;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textclassifier.TextClassification;
import android.webkit.WebView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class kw7 {
    public static AudioManager a;
    public static final kcg b = new kcg();
    public static final fr31 c = new fr31((Integer) null);

    public static long A(Animator animator) {
        return animator.getTotalDuration();
    }

    public static void B(ha4 ha4Var) {
        ViewParent parent = ha4Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(ha4Var, ha4Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.jgo0 */
    public static final void C(l74 l74Var, SparseArray sparseArray) throws jgo0 {
        h69 h69Var = l74Var.b;
        if (h69Var.a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueH = c9r.h(sparseArray.get(iKeyAt));
            if (autofillValueH.isText()) {
                autofillValueH.getTextValue().toString();
                if (h69Var.a.get(Integer.valueOf(iKeyAt)) != null) {
                    bhn0.d();
                    return;
                }
            } else {
                if (autofillValueH.isDate()) {
                    throw new jgo0("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValueH.isList()) {
                    throw new jgo0("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValueH.isToggle()) {
                    throw new jgo0("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void D(l74 l74Var, ViewStructure viewStructure) {
        h69 h69Var = l74Var.b;
        if (h69Var.a.isEmpty()) {
            return;
        }
        int iAddChildCount = viewStructure.addChildCount(h69Var.a.size());
        Iterator it = h69Var.a.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            if (entry.getValue() != null) {
                bhn0.d();
                return;
            }
            ViewStructure viewStructureNewChild = viewStructure.newChild(iAddChildCount);
            no80.I(viewStructureNewChild, l74Var.c, iIntValue);
            viewStructureNewChild.setId(iIntValue, l74Var.a.getContext().getPackageName(), null, null);
            no80.J(viewStructureNewChild, 1);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public static int E(AudioManager audioManager, zu7 zu7Var) {
        int volumeControlStream;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            Object obj = zu7Var.f;
            obj.getClass();
            return audioManager.requestAudioFocus((AudioFocusRequest) obj);
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = zu7Var.b;
        po7 po7Var = zu7Var.d;
        po7Var.getClass();
        if (i < 26) {
            if ((po7Var.b & 1) != 1) {
                switch (po7Var.c) {
                    case 2:
                        volumeControlStream = 0;
                        break;
                    case 3:
                        volumeControlStream = 8;
                        break;
                    case 4:
                        volumeControlStream = 4;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        volumeControlStream = 5;
                        break;
                    case 6:
                        volumeControlStream = 2;
                        break;
                    case 11:
                        volumeControlStream = 10;
                        break;
                    case 12:
                    default:
                        volumeControlStream = 3;
                        break;
                    case 13:
                        volumeControlStream = 1;
                        break;
                }
            } else {
                volumeControlStream = 1;
            }
        } else {
            try {
                volumeControlStream = po7Var.c().getVolumeControlStream();
                if (volumeControlStream == Integer.MIN_VALUE) {
                    volumeControlStream = 3;
                }
            } catch (RuntimeException unused) {
            }
        }
        return audioManager.requestAudioFocus(onAudioFocusChangeListener, volumeControlStream, zu7Var.a);
    }

    public static void F(AnimatorSet animatorSet) {
        animatorSet.reverse();
    }

    public static void G(Context context, TextClassification textClassification) throws PendingIntent.CanceledException {
        String text = textClassification.getText();
        PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
        if (Build.VERSION.SDK_INT >= 34) {
            sf.H(activity);
        } else {
            activity.send();
        }
    }

    public static void H(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }

    public static void I(AnimatorSet animatorSet, long j) {
        animatorSet.setCurrentPlayTime(j);
    }

    public static void J(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    public static final void a(fk11 fk11Var, j2i j2iVar, gbx gbxVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        String strConcat;
        j2i j2iVarR;
        jfv jfvVar = fk11Var.g;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(712479297);
        int i2 = i | (b0kVar3.g(fk11Var) ? 4 : 2) | (b0kVar3.i(gbxVar) ? SemanticState.Hidden : SemanticState.Focused);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            Resources resources = ((Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b)).getResources();
            boolean zG = b0kVar3.g(resources) | b0kVar3.g(jfvVar);
            Object objT = b0kVar3.T();
            xu30 xu30VarR = null;
            if (zG || objT == fkj0.X) {
                if (jfvVar != null) {
                    resources.getClass();
                    objT = ((rle1) new ogv(resources, (byte) 1).invoke(jfvVar)).a;
                } else {
                    objT = null;
                }
                b0kVar3.s0(objT);
            }
            String str = (String) objT;
            Double d = fk11Var.e;
            String str2 = fk11Var.f;
            if (d != null) {
                strConcat = "★ ".concat(String.format(Locale.ROOT, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d.doubleValue())}, 1)));
            } else {
                strConcat = null;
            }
            List listI0 = f46.i0(new String[]{strConcat, str2, str});
            qim0 qim0VarN = anm1.N("related_content_discovery_row", nim0.a);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(0, (pgx) null, 4, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 499);
            String str3 = fk11Var.i;
            Uri uri = str3 != null ? Uri.parse(str3) : null;
            if (uri == null) {
                b0kVar3.i0(-256786846);
                b0kVar3.r(false);
                j2iVarR = null;
            } else {
                b0kVar3.i0(-256786845);
                j2iVarR = apo.r(1344778582, new k0c0(uri, (byte) 1), b0kVar3);
                b0kVar3.r(false);
            }
            if (listI0.isEmpty()) {
                listI0 = null;
            }
            if (listI0 == null) {
                b0kVar3.i0(-255636932);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-255636931);
                xu30VarR = apo.r(-1061421248, new xhf(listI0, (byte) 3), b0kVar3);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, (xu30) null, j2iVarR, (xu30) null, apo.r(1703610745, new jk11(fk11Var, (byte) 0), b0kVar3), j2iVar, apo.r(-264194181, new jk11(fk11Var, (byte) 1), b0kVar3), xu30VarR, apo.r(2062968189, new jk11(fk11Var, (byte) 2), b0kVar3), b0kVar2, 64 | ((i2 << 12) & 3670016), 200112, 1468);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0(fk11Var, j2iVar, gbxVar, i, (byte) 28);
        }
    }

    public static final void b(b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(337909187);
        if (b0kVar3.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b((qim0) null, new uvx(0, (pgx) null, 4, new zzq0(16.0f, 8.0f, 16.0f, 8.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 499), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(-774877510, new ac8(3, (byte) 28), b0kVar3), (xu30) null, apo.r(1168258811, new ac8(3, (byte) 29), b0kVar3), (xu30) null, apo.r(1666815613, new kk11(3, (byte) 0), b0kVar3), (xu30) null, apo.r(-2129594881, new kk11(3, (byte) 1), b0kVar3), b0kVar2, 806879296, 199728, 21949);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new fk01(i, (byte) 6);
        }
    }

    public static final void c(f070 f070Var, iu30 iu30Var, yqg yqgVar, bju bjuVar, qim0 qim0Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(866120054);
        int i2 = i | (x340Var.i(f070Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(yqgVar) ? 256 : SemanticState.Focused) | (x340Var.g(bjuVar) ? 2048 : SemanticState.ReadOnly) | (x340Var.i(qim0Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zI = ((i2 & 7168) == 2048) | x340Var.i(f070Var) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                lhx lhxVar = new lhx(bjuVar, f070Var, iu30Var, yqgVar, (byte) 18);
                x340Var.s0(lhxVar);
                objT = lhxVar;
            }
            iu30 iu30Var2 = (iu30) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = hh60.S0;
                x340Var.s0(objT2);
            }
            dm5.b(iu30Var2, qim0Var, (iu30) null, (iu30) objT2, (iu30) null, x340Var, ((i2 >> 9) & ContentType.LONG_FORM_ON_DEMAND) | 3072, 20);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20((byte) 10, i, f070Var, iu30Var, yqgVar, bjuVar, qim0Var);
        }
    }

    public static final void d(float f, int i, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-41466837);
        int i2 = (x340Var.d(f) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = er31.b(f);
                x340Var.s0(objT);
            }
            cr31 cr31Var = (cr31) objT;
            qim0 qim0VarQ = i1p1.q(qim0Var, cr31Var);
            uwr uwrVar = cbx.a;
            t1c.a(cwl1.l0(dug.f(qim0VarQ, cbx.a(x340Var).a.b.a(), cr31Var), 0L, (hw61) null, 15), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ou(f, qim0Var, i, (byte) 7);
        }
    }

    public static void e(AudioManager audioManager, zu7 zu7Var) {
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(zu7Var.b);
            return;
        }
        Object obj = zu7Var.f;
        obj.getClass();
        audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
    }

    public static final AudioFocusRequest f(av7 av7Var, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        AudioFocusRequest.Builder builderF = wu7.f(av7Var.a);
        Boolean bool = (Boolean) av7Var.c;
        if (bool != null) {
            builderF.setAcceptsDelayedFocusGain(bool.booleanValue());
        }
        ow3 ow3Var = (ow3) av7Var.e;
        if (ow3Var != null) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            Integer num = (Integer) ow3Var.b;
            if (num != null) {
                builder.setContentType(num.intValue());
            }
            Integer num2 = (Integer) ow3Var.c;
            if (num2 != null) {
                builder.setUsage(num2.intValue());
            }
            builderF.setAudioAttributes(builder.build());
        }
        Handler handler = (Handler) av7Var.g;
        if (handler != null) {
            builderF.setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler);
        } else {
            builderF.setOnAudioFocusChangeListener(onAudioFocusChangeListener);
        }
        Boolean bool2 = (Boolean) av7Var.d;
        if (bool2 != null) {
            builderF.setWillPauseWhenDucked(bool2.booleanValue());
        }
        return builderF.build();
    }

    public static final Bitmap g(String str, Bitmap bitmap) {
        Bitmap bitmapCopy;
        if (str == null) {
            return bitmap;
        }
        if (Build.VERSION.SDK_INT < 26 || bitmap.getConfig() != eg.k()) {
            bitmapCopy = bitmap;
        } else {
            bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            bitmapCopy.getClass();
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (upperCase.equals("CIRCULAR")) {
            Bitmap bitmapA = b.a(bitmapCopy, (Integer) null, (Integer) null);
            if (!bitmapCopy.equals(bitmap)) {
                bitmapCopy.recycle();
            }
            return bitmapA;
        }
        if (!upperCase.equals("ROUNDED_CORNER")) {
            return bitmapCopy;
        }
        Bitmap bitmapA2 = c.a(bitmapCopy, (Integer) null, (Integer) null);
        if (!bitmapCopy.equals(bitmap)) {
            bitmapCopy.recycle();
        }
        return bitmapA2;
    }

    public static final String h(String str, c380 c380Var, b0k b0kVar) {
        String strY0;
        if (ihc1.y0(str)) {
            str = null;
        }
        Object obj = fkj0.X;
        if (Build.VERSION.SDK_INT >= 26) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-464309553);
            Locale locale = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).getLocales().get(0);
            boolean zG = x340Var.g(locale);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = ListFormatter.getInstance(locale);
                x340Var.s0(objT);
            }
            ListFormatter listFormatter = (ListFormatter) objT;
            boolean zG2 = x340Var.g(listFormatter) | x340Var.g(c380Var);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == obj) {
                objT2 = listFormatter.format((Collection<?>) c380Var);
                x340Var.s0(objT2);
            }
            objT2.getClass();
            strY0 = (String) objT2;
            x340Var.r(false);
        } else {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(-1508487142);
            x340Var2.r(false);
            strY0 = o7h.y0(c380Var, ", ", (String) null, (String) null, (iu30) null, 62);
        }
        return o7h.y0(f46.i0(new String[]{str, ihc1.y0(strY0) ? null : strY0}), " • ", (String) null, (String) null, (iu30) null, 62);
    }

    public static boolean i(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public static boolean j(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    public static boolean k(Canvas canvas, int i, int i2, int i3, int i4) {
        return canvas.clipOutRect(i, i2, i3, i4);
    }

    public static boolean l(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public static boolean m(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    public static quc0 n(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? new to4(context, ListFormatter.getInstance(new Locale(upn1.n(context)))) : new s5s(context);
    }

    public static final Bitmap o(int i, int i2, int i3, hah hahVar) {
        ColorSpace rgb;
        ColorSpace rgb2;
        ColorSpace colorSpaceH;
        ColorSpace colorSpaceB;
        ColorSpace colorSpace;
        Bitmap.Config configV = no80.V(i3);
        if (u890.j(hahVar, kah.e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (u890.j(hahVar, kah.q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (u890.j(hahVar, kah.r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (u890.j(hahVar, kah.o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (u890.j(hahVar, kah.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (u890.j(hahVar, kah.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (u890.j(hahVar, kah.t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (u890.j(hahVar, kah.s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (u890.j(hahVar, kah.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (u890.j(hahVar, kah.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (u890.j(hahVar, kah.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (u890.j(hahVar, kah.h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (u890.j(hahVar, kah.f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (u890.j(hahVar, kah.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else {
            if (!u890.j(hahVar, kah.p)) {
                if (u890.j(hahVar, kah.n)) {
                    colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
                } else {
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 34 && (colorSpaceB = sf.B(hahVar)) != null) {
                        rgb2 = colorSpaceB;
                    } else if (i4 < 36 || (colorSpaceH = hg.h(hahVar)) == null) {
                        if (hahVar instanceof je31) {
                            String str = hahVar.a;
                            je31 je31Var = (je31) hahVar;
                            float[] fArrA = je31Var.d.a();
                            zeg1 zeg1Var = je31Var.g;
                            ColorSpace.Rgb.TransferParameters transferParameters = zeg1Var != null ? new ColorSpace.Rgb.TransferParameters(zeg1Var.b, zeg1Var.c, zeg1Var.d, zeg1Var.e, zeg1Var.f, zeg1Var.g, zeg1Var.a) : null;
                            float[] fArr = je31Var.i;
                            final byte b2 = 0;
                            if (transferParameters != null) {
                                wu7.i();
                                ColorSpace.Rgb rgb3 = new ColorSpace.Rgb(str, je31Var.h, fArrA, transferParameters);
                                if (Float.isNaN(fArr[0]) || Arrays.equals(rgb3.getTransform(), fArr)) {
                                    rgb2 = rgb3;
                                } else {
                                    wu7.i();
                                    rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                                }
                            } else {
                                wu7.i();
                                float[] fArr2 = je31Var.h;
                                final zw11 zw11Var = je31Var.l;
                                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: p.iah
                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d) {
                                        byte b3 = b2;
                                        iu30 iu30Var = zw11Var;
                                        switch (b3) {
                                            case 0:
                                                break;
                                        }
                                        return ((Number) iu30Var.invoke(Double.valueOf(d))).doubleValue();
                                    }
                                };
                                final hbz0 hbz0Var = je31Var.o;
                                final byte b3 = 1;
                                rgb2 = new ColorSpace.Rgb(str, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: p.iah
                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d) {
                                        byte b4 = b3;
                                        iu30 iu30Var = hbz0Var;
                                        switch (b4) {
                                            case 0:
                                                break;
                                        }
                                        return ((Number) iu30Var.invoke(Double.valueOf(d))).doubleValue();
                                    }
                                }, je31Var.e, je31Var.f);
                            }
                        } else {
                            configV = configV;
                            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                        }
                        rgb2 = rgb;
                    } else {
                        rgb2 = colorSpaceH;
                    }
                    configV = configV;
                }
                return Bitmap.createBitmap((DisplayMetrics) null, i, i2, configV, true, rgb2);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        rgb2 = colorSpace;
        configV = configV;
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, configV, true, rgb2);
    }

    public static final WebView p(Context context, iu30 iu30Var, bz60 bz60Var, bju bjuVar) {
        WebView webView = new WebView(context);
        webView.setBackgroundColor(0);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.setOnTouchListener(new lgs(bz60Var, (byte) 4));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(true);
        webView.getSettings().setSupportMultipleWindows(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        webView.getSettings().setAllowContentAccess(false);
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowFileAccessFromFileURLs(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
        webView.getSettings().setGeolocationEnabled(false);
        if (Build.VERSION.SDK_INT >= 26) {
            webView.getSettings().setSafeBrowsingEnabled(true);
        }
        webView.getSettings().setMixedContentMode(1);
        webView.getSettings().setCacheMode(2);
        Set set = v070.a;
        webView.setWebViewClient(new u070(bz60Var, bjuVar, iu30Var));
        webView.setWebChromeClient(new t070(bz60Var, iu30Var));
        return webView;
    }

    public static void q(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static void r(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannel(str);
    }

    public static boolean s(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i : hdrCapabilities.getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public static void t(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i = configuration.colorMode & 3;
        int i2 = configuration2.colorMode & 3;
        if (i != i2) {
            configuration3.colorMode |= i2;
        }
        int i3 = configuration.colorMode & 12;
        int i4 = configuration2.colorMode & 12;
        if (i3 != i4) {
            configuration3.colorMode |= i4;
        }
    }

    public static synchronized AudioManager u(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                a = null;
            }
            AudioManager audioManager = a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                hsk hskVar = new hsk();
                tx9.n().execute(new ny2((Object) applicationContext, (Object) hskVar, (byte) 11));
                hskVar.b();
                AudioManager audioManager2 = a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static AutofillId v(View view) {
        return view.getAutofillId();
    }

    public static float[] w(ColorMatrixColorFilter colorMatrixColorFilter) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return colorMatrix.getArray();
    }

    public static bd30 x(Context context, NotificationManager notificationManager) {
        String string = context.getString(2131955196);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            wu7.m();
            notificationManager.createNotificationChannel(new NotificationChannel("set_playlist_picture_channel", context.getString(2131955195), 2));
        }
        dko0 dko0Var = new dko0(context, "set_playlist_picture_channel");
        dko0Var.e = dko0.d(string);
        dko0Var.s(string);
        dko0Var.D.icon = 2131233418;
        dko0Var.l(2, true);
        Notification notificationC = dko0Var.c();
        return i >= 29 ? new bd30(147, notificationC, 1) : new bd30(147, notificationC, 0);
    }

    public static float y(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float z(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }
}
