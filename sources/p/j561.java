package p;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.navigation.model.Maneuver;
import com.spotify.download.esperanto.proto.EsDownload;
import com.spotify.player.model.Restrictions;
import com.spotify.prefs.esperanto.proto.EsPrefs;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import spotify.autodownload.esperanto.proto.EnabledShowsCountResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j561 implements Predicate, Function3, Function, s2i1, iob, k1q0, yu30 {
    public final /* synthetic */ byte a;
    public static final j561 b = new j561(0);
    public static final j561 c = new j561(1);
    public static final j561 d = new j561(2);
    public static final j561 e = new j561(3);
    public static final j561 f = new j561(4);
    public static final j561 g = new j561(5);
    public static final j561 h = new j561(6);
    public static final j561 i = new j561(7);
    public static final j561 t = new j561(8);
    public static final j561 X = new j561(9);
    public static final j561 Y = new j561(10);
    public static final j561 Z = new j561(11);
    public static final j561 N0 = new j561(12);
    public static final j561 O0 = new j561(13);
    public static final j561 P0 = new j561(14);
    public static final j561 Q0 = new j561(15);
    public static final j561 R0 = new j561(16);
    public static final j561 S0 = new j561(17);
    public static final j561 T0 = new j561(18);
    public static final j561 U0 = new j561(19);
    public static final j561 V0 = new j561(20);
    public static final j561 W0 = new j561(21);
    public static final j561 X0 = new j561(22);
    public static final j561 Y0 = new j561(23);
    public static final j561 Z0 = new j561(24);
    public static final j561 a1 = new j561(25);
    public static final j561 b1 = new j561(27);
    public static final j561 c1 = new j561(28);
    public static final j561 d1 = new j561(29);

    public /* synthetic */ j561(byte b2) {
        this.a = b2;
    }

    public static boolean a(ge4 ge4Var) {
        return ge4Var.a();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005a A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #1 {all -> 0x00c1, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:30:0x005a, B:39:0x0073, B:48:0x008b, B:62:0x00ba, B:47:0x0088, B:38:0x0070, B:29:0x0057, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:24:0x004c, B:42:0x007f, B:51:0x0097, B:54:0x00a1, B:56:0x00a7, B:59:0x00ae, B:33:0x0066), top: B:74:0x000f, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0073 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #1 {all -> 0x00c1, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:30:0x005a, B:39:0x0073, B:48:0x008b, B:62:0x00ba, B:47:0x0088, B:38:0x0070, B:29:0x0057, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:24:0x004c, B:42:0x007f, B:51:0x0097, B:54:0x00a1, B:56:0x00a7, B:59:0x00ae, B:33:0x0066), top: B:74:0x000f, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x008b A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #1 {all -> 0x00c1, blocks: (B:5:0x000f, B:7:0x0013, B:19:0x0037, B:21:0x0040, B:30:0x005a, B:39:0x0073, B:48:0x008b, B:62:0x00ba, B:47:0x0088, B:38:0x0070, B:29:0x0057, B:17:0x0031, B:11:0x001f, B:14:0x0029, B:24:0x004c, B:42:0x007f, B:51:0x0097, B:54:0x00a1, B:56:0x00a7, B:59:0x00ae, B:33:0x0066), top: B:74:0x000f, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1 A[Catch: all -> 0x00b9, TryCatch #4 {all -> 0x00b9, blocks: (B:51:0x0097, B:54:0x00a1, B:56:0x00a7, B:59:0x00ae), top: B:79:0x0097, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7 A[Catch: all -> 0x00b9, TryCatch #4 {all -> 0x00b9, blocks: (B:51:0x0097, B:54:0x00a1, B:56:0x00a7, B:59:0x00ae), top: B:79:0x0097, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final boolean c(View view) {
        boolean z;
        TextView textView;
        TextView textView2;
        TextView textView3;
        String strJ;
        boolean zMatches;
        j561 j561Var = b;
        Set set = dhn.a;
        if (set.contains(j561.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            TextView textView4 = (TextView) view;
            if (set.contains(j561Var)) {
                z = false;
            } else {
                try {
                    z = textView4.getInputType() == 128 ? true : textView4.getTransformationMethod() instanceof PasswordTransformationMethod;
                } catch (Throwable th) {
                    dhn.a(j561Var, th);
                    z = false;
                }
            }
            if (!z && !j561Var.b((TextView) view)) {
                TextView textView5 = (TextView) view;
                if (dhn.a.contains(j561Var)) {
                    textView = (TextView) view;
                    if (dhn.a.contains(j561Var)) {
                        textView2 = (TextView) view;
                        if (dhn.a.contains(j561Var)) {
                            textView3 = (TextView) view;
                            if (dhn.a.contains(j561Var)) {
                                zMatches = false;
                            } else {
                                try {
                                    if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strJ = ibk1.j(textView3);
                                        if (strJ != null || strJ.length() == 0) {
                                            zMatches = false;
                                        } else {
                                            zMatches = Patterns.EMAIL_ADDRESS.matcher(strJ).matches();
                                        }
                                    }
                                } catch (Throwable th2) {
                                    dhn.a(j561Var, th2);
                                }
                            }
                            if (!zMatches) {
                                return false;
                            }
                        } else {
                            try {
                                if (textView2.getInputType() != 3) {
                                    textView3 = (TextView) view;
                                    if (dhn.a.contains(j561Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strJ = ibk1.j(textView3);
                                        if (strJ != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                }
                            } catch (Throwable th3) {
                                dhn.a(j561Var, th3);
                            }
                        }
                    } else {
                        try {
                            if (textView.getInputType() != 112) {
                                textView2 = (TextView) view;
                                if (dhn.a.contains(j561Var)) {
                                    textView3 = (TextView) view;
                                    if (dhn.a.contains(j561Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strJ = ibk1.j(textView3);
                                        if (strJ != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                } else if (textView2.getInputType() != 3) {
                                    textView3 = (TextView) view;
                                    if (dhn.a.contains(j561Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strJ = ibk1.j(textView3);
                                        if (strJ != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            dhn.a(j561Var, th4);
                        }
                    }
                } else {
                    try {
                        if (textView5.getInputType() != 96) {
                            textView = (TextView) view;
                            if (dhn.a.contains(j561Var)) {
                                textView2 = (TextView) view;
                                if (dhn.a.contains(j561Var)) {
                                    textView3 = (TextView) view;
                                    if (dhn.a.contains(j561Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strJ = ibk1.j(textView3);
                                        if (strJ != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                } else if (textView2.getInputType() != 3) {
                                    textView3 = (TextView) view;
                                    if (dhn.a.contains(j561Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strJ = ibk1.j(textView3);
                                        if (strJ != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                }
                            } else if (textView.getInputType() != 112) {
                                textView2 = (TextView) view;
                                if (dhn.a.contains(j561Var)) {
                                    textView3 = (TextView) view;
                                    if (dhn.a.contains(j561Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strJ = ibk1.j(textView3);
                                        if (strJ != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                } else if (textView2.getInputType() != 3) {
                                    textView3 = (TextView) view;
                                    if (dhn.a.contains(j561Var)) {
                                        zMatches = false;
                                    } else if (textView3.getInputType() == 32) {
                                        zMatches = true;
                                    } else {
                                        strJ = ibk1.j(textView3);
                                        if (strJ != null) {
                                            zMatches = false;
                                        } else {
                                            zMatches = false;
                                        }
                                    }
                                    if (!zMatches) {
                                        return false;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        dhn.a(j561Var, th5);
                    }
                }
            }
            return true;
        } catch (Throwable th6) {
            dhn.a(j561.class, th6);
            return false;
        }
    }

    public Object apply(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 4:
                return Boolean.valueOf(((Map) obj).values().contains(Boolean.TRUE));
            case 5:
                return Boolean.valueOf(((ck4) obj).a);
            case 6:
                return ((a26) obj).a;
            case 7:
            case 8:
            case 10:
            case 12:
            case 13:
            case 14:
            case 17:
            case 19:
            case 26:
            default:
                return ((EsPrefs.Value) obj).q();
            case 9:
                EnabledShowsCountResponse enabledShowsCountResponse = (EnabledShowsCountResponse) obj;
                return enabledShowsCountResponse.n() == 0 ? ot8.a : new pt8(enabledShowsCountResponse.n());
            case 11:
                return bjo.a;
            case 15:
                return Boolean.valueOf(((sp91) obj).a != rp91.a);
            case 16:
                ry21 ry21Var = ((sy21) obj).a;
                if (ry21Var.Q0) {
                    return rih1Var;
                }
                eg.m(f4i1.c(ry21Var.d, "Failed to remove reaction - Status: "));
                return null;
            case 18:
                return Boolean.valueOf(yto.j((String) obj));
            case 20:
                return (pr11) o7h.q0((List) obj);
            case 21:
                return z231.a;
            case 22:
                return rih1Var;
            case 23:
                return u991.a;
            case 24:
                qxc0 qxc0Var = (qxc0) obj;
                return new blt(qxc0Var.a, new zkt(qxc0Var.b.a(1)));
            case 25:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsDownload.RequestDataResponse.t(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.download.esperanto.proto.EsDownload.RequestDataResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((th61) obj).a;
        }
    }

    public boolean b(TextView textView) {
        if (!dhn.a.contains(this)) {
            try {
                String strReplaceAll = Pattern.compile("\\s").matcher(ibk1.j(textView)).replaceAll("");
                int length = strReplaceAll.length();
                if (length >= 12 && length <= 19) {
                    int i2 = 0;
                    boolean z = false;
                    for (int i3 = length - 1; -1 < i3; i3--) {
                        char cCharAt = strReplaceAll.charAt(i3);
                        if (Character.isDigit(cCharAt)) {
                            int iN = eth.n(cCharAt);
                            if (z && (iN = iN * 2) > 9) {
                                iN = (iN % 10) + 1;
                            }
                            i2 += iN;
                            z = !z;
                        }
                    }
                    if (i2 % 10 == 0) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                dhn.a(this, th);
                return false;
            }
        }
        return false;
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        switch (this.a) {
            case 7:
                String str4 = (String) linkedHashMap.get("artist_id");
                if (str4 == null || str4.length() != 22) {
                    return null;
                }
                int length = str4.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = str4.charAt(i2);
                    if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                        return null;
                    }
                }
                String str5 = (String) linkedHashMap.get("category");
                if (str5 == null) {
                    return null;
                }
                return new qy6(str4, str5, str2, str, xkg0Var);
            case 8:
                String str6 = (String) linkedHashMap.get("book_id");
                if (str6 != null && gho1.n(str6) && (str3 = (String) linkedHashMap.get("chapter_id")) != null && gho1.n(str3)) {
                    return new ed8(str6, str3, xkg0Var, str2, str);
                }
                return null;
            case 14:
                return new pwe(xkg0Var, str2, str);
            case 17:
                return new n7l(xkg0Var, str2, str);
            default:
                return new ynn(xkg0Var, str2, str);
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new yvg1((String) obj, (Restrictions) obj2, (fvf1) obj3);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return ((oob1) obj) instanceof knb1;
            case 3:
                return ((spq0) obj).c();
            case 10:
                return ((ye9) obj).a != null;
            default:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        esl1 esl1Var = hsl1Var.a;
        view.setPadding(view.getPaddingLeft(), esl1Var.i(519).b, view.getPaddingRight(), esl1Var.i(519).d);
        return hsl1.b;
    }
}
