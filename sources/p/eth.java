package p;

import android.R;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.os.Build;
import android.os.Debug;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import io.reactivex.rxjava3.core.Observable;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.RoundingMode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.WeakHashMap;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class eth {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final int[] b = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] c = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] d = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] e = {R.attr.name, R.attr.pathData};
    public static final char[] f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final pl10 g;
    public static final pl10[] h;
    public static b180 i;
    public static Field j;
    public static boolean k;
    public static Class l;
    public static boolean m;
    public static Field n;
    public static boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Field f31p;
    public static boolean q;

    static {
        pl10 pl10Var = new pl10("auth_api_credentials_begin_sign_in", 4L);
        pl10 pl10Var2 = new pl10("auth_api_credentials_sign_out", 2L);
        pl10 pl10Var3 = new pl10("auth_api_credentials_authorize", 1L);
        pl10 pl10Var4 = new pl10("auth_api_credentials_revoke_access", 1L);
        pl10 pl10Var5 = new pl10("auth_api_credentials_save_password", 3L);
        pl10 pl10Var6 = new pl10("auth_api_credentials_get_sign_in_intent", 4L);
        pl10 pl10Var7 = new pl10("auth_api_credentials_save_account_linking_token", 2L);
        g = pl10Var7;
        h = new pl10[]{pl10Var, pl10Var2, pl10Var3, pl10Var4, pl10Var5, pl10Var6, pl10Var7};
    }

    public static boolean A(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            if ((i3 > i4 || rect.left >= i4) && rect.left > rect2.left) {
                return true;
            }
        } else if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if ((i5 > i6 || rect.top >= i6) && rect.top > rect2.top) {
                return true;
            }
        } else if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i2 != 130) {
                hhg1.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    public static boolean B() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    public static final boolean C(xm41 xm41Var) {
        if (xm41Var instanceof jrb1) {
            return ((jrb1) xm41Var).b() != null;
        }
        eg.m("Unknown scope implementation");
        return false;
    }

    public static boolean D(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean E(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    public static boolean F() {
        boolean zB = B();
        String str = Build.TAGS;
        if ((zB || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zB && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static boolean G(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static boolean H(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static final float I(float f2, float f3, float f4) {
        return (f3 * f4) + ((1.0f - f4) * f2);
    }

    public static int J(int i2) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i2 <= 0) {
            hhg1.n(gvg.e(i2, "x (", ") must be > 0"));
            return 0;
        }
        switch (nr80.a[roundingMode.ordinal()]) {
            case 1:
                hm5.n((i2 > 0) & (((i2 + (-1)) & i2) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i2 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i2))) >>> 31);
            default:
                hhg1.c();
                return 0;
        }
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    public static int K(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                hhg1.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    public static int L(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        hhg1.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final hhc M(String str) {
        byte[] bArrA = raa.b.a(str.toUpperCase(Locale.US));
        return phc.e(0, bArrA, bArrA.length);
    }

    public static final void N(View view, View view2, View view3, ConstraintLayout constraintLayout) {
        int iP = p(constraintLayout.getContext(), 2131166879);
        int iP2 = p(constraintLayout.getContext(), 2131165905);
        int i2 = (iP2 * 2) + iP;
        List listI0 = f46.i0(new View[]{view3, view2, view});
        int i3 = 0;
        for (Object obj : listI0) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            View view4 = (View) obj;
            WeakHashMap weakHashMap = b8k1.a;
            view4.setId(View.generateViewId());
            qhl qhlVar = new qhl(i3 == p7h.L(listI0) ? -2 : i2, i2);
            view4.setPadding(view4.getPaddingLeft() + iP2, view4.getPaddingTop() + iP2, view4.getPaddingRight() + iP2, view4.getPaddingBottom() + iP2);
            constraintLayout.addView(view4, qhlVar);
            i3 = i4;
        }
        op71.H(constraintLayout, new fu(listI0, view, iP, constraintLayout, (byte) 10));
    }

    public static final void O(ConstraintLayout constraintLayout, List list, View view, List list2) {
        int iP = p(constraintLayout.getContext(), 2131167119);
        int iP2 = p(constraintLayout.getContext(), 2131165904);
        List<View> list3 = list;
        for (View view2 : list3) {
            WeakHashMap weakHashMap = b8k1.a;
            view2.setId(View.generateViewId());
        }
        WeakHashMap weakHashMap2 = b8k1.a;
        view.setId(View.generateViewId());
        List list4 = list2;
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setId(View.generateViewId());
        }
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), iP2 / 3, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        int i2 = 0;
        for (Object obj : list3) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            op71.l(constraintLayout, (View) obj, iP, iP, new jlb0(i2, iP2));
            i2 = i3;
        }
        constraintLayout.addView(view, 0, -2);
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            op71.l(constraintLayout, (View) it2.next(), iP, iP, new po60(iP2, (byte) 3));
        }
        op71.H(constraintLayout, new qf8(list, view, list2, constraintLayout, iP2));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            ((View) it3.next()).setClickable(true);
        }
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            ((View) it4.next()).setClickable(true);
        }
    }

    public static final void P(ConstraintLayout constraintLayout, AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return;
        }
        int iP = p(constraintLayout.getContext(), 2131165906);
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            WeakHashMap weakHashMap = b8k1.a;
            view.setId(View.generateViewId());
            constraintLayout.addView(view, -2, -2);
        }
        Flow flow = new Flow(constraintLayout.getContext());
        WeakHashMap weakHashMap2 = b8k1.a;
        flow.setId(View.generateViewId());
        flow.setOrientation(0);
        flow.setHorizontalStyle(2);
        flow.setHorizontalGap(iP);
        flow.setHorizontalBias(0.0f);
        ArrayList arrayList = new ArrayList(q7h.U(abstractList, 10));
        Iterator it2 = abstractList.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((View) it2.next()).getId()));
        }
        flow.setReferencedIds(o7h.k1(arrayList));
        constraintLayout.addView((View) flow, -2, -2);
        op71.H(constraintLayout, new vq80(flow, constraintLayout, (byte) 15));
    }

    public static final void Q(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4, View view5) {
        List<View> listM = p7h.M(new View[]{view, view2, view3, view4, view5});
        int iP = p(constraintLayout.getContext(), 2131166871);
        int iP2 = p(constraintLayout.getContext(), 2131166956);
        int iP3 = p(constraintLayout.getContext(), 2131167119);
        for (View view6 : listM) {
            if (view6.getId() == -1) {
                WeakHashMap weakHashMap = b8k1.a;
                view6.setId(View.generateViewId());
            }
        }
        constraintLayout.addView(view, iP3, iP3);
        constraintLayout.addView(view2, iP2, iP2);
        constraintLayout.addView(view3, iP, iP);
        constraintLayout.addView(view4, iP2, iP2);
        constraintLayout.addView(view5, iP3, iP3);
        op71.H(constraintLayout, new z1(listM, view, constraintLayout, view2, view3, view4, view5, (byte) 9));
    }

    public static final void R(ConstraintLayout constraintLayout, View view, View view2, View view3, LinearLayout linearLayout, View view4, View view5) {
        int iP = p(constraintLayout.getContext(), 2131166956);
        int iP2 = p(constraintLayout.getContext(), 2131165905);
        WeakHashMap weakHashMap = b8k1.a;
        view.setId(View.generateViewId());
        view2.setId(View.generateViewId());
        if (view4 != null) {
            view4.setId(View.generateViewId());
        }
        if (view5 != null) {
            view5.setId(View.generateViewId());
        }
        if (view3 != null) {
            view3.setId(View.generateViewId());
        }
        Barrier barrier = new Barrier(constraintLayout.getContext());
        barrier.setId(View.generateViewId());
        barrier.setType(5);
        barrier.setReferencedIds(o7h.k1(f46.i0(new Integer[]{Integer.valueOf(linearLayout.getId()), view3 != null ? Integer.valueOf(view3.getId()) : null})));
        op71.l(constraintLayout, view, iP, iP, new po60(iP2, (byte) 7));
        op71.l(constraintLayout, view2, 0, -2, new po60(iP2, (byte) 8));
        if (view3 != null) {
            constraintLayout.addView(view3, -2, -2);
        }
        constraintLayout.addView(barrier);
        if (view5 != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iP, iP);
            layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, iP2, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
            linearLayout.addView(view5, layoutParams);
        }
        if (view4 != null) {
            linearLayout.addView(view4, new LinearLayout.LayoutParams(iP, iP));
        }
        op71.H(constraintLayout, new j96(view, view2, constraintLayout, barrier, linearLayout, view3, (byte) 16));
    }

    public static String S(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return y(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            ws10.Z.d();
            return "";
        }
    }

    public static String T(FileInputStream fileInputStream) {
        Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }

    public static String U(char c2, Locale locale) {
        String upperCase = String.valueOf(c2).toUpperCase(locale);
        if (upperCase.length() > 1) {
            if (c2 != 329) {
                return upperCase.charAt(0) + upperCase.substring(1).toLowerCase(Locale.ROOT);
            }
        } else if (upperCase.equals(String.valueOf(c2).toUpperCase(Locale.ROOT))) {
            return String.valueOf(Character.toTitleCase(c2));
        }
        return upperCase;
    }

    public static final ezc V(xm41 xm41Var) {
        return h4p1.f(new k53(xm41Var, null, (byte) 26));
    }

    public static String W(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (G(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (G(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static final Observable X(xm41 xm41Var) {
        return Observable.create(new utw0(xm41Var));
    }

    public static final tny0 Y(aqj0 aqj0Var) {
        return new tny0(aqj0Var.h(), aqj0Var.f().b(), aqj0Var.f().a().a(), aqj0Var.f().c().a(), aqj0Var.j(), aqj0Var.a(), (ArrayList) null, aqj0Var.l(), aqj0Var.k(), aqj0Var.m(), v8i0.a(aqj0Var.e()), aqj0Var.b(), aqj0Var.i(), aqj0Var.g(), aqj0Var.d());
    }

    public static String Z(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0064  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:62:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void a(Object obj, qim0 qim0Var, ni20 ni20Var, String str, j2i j2iVar, b0k b0kVar, int i2, int i3) {
        int i4;
        ni20 ni20Var2;
        int i5;
        String str2;
        int i6;
        boolean z;
        qim0 qim0Var2;
        String str3;
        h311 h311VarV;
        ni20 ni20VarO0;
        String str4;
        int i7;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-513216493);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? x340Var.g(obj) : x340Var.i(obj) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 == 0) {
            if ((i2 & 384) == 0) {
                ni20Var2 = ni20Var;
                i4 |= x340Var.i(ni20Var2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    str2 = str;
                    if (x340Var.g(str2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                if ((i2 & 24576) == 0) {
                    if (x340Var.i(j2iVar)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i4 |= i7;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i4 & 1, z)) {
                    if (i8 != 0) {
                        qim0Var = nim0.a;
                    }
                    qim0 qim0Var3 = qim0Var;
                    if (i9 != 0) {
                        ni20VarO0 = irn1.o0(0, 0, (dlv) null, 7);
                    } else {
                        ni20VarO0 = ni20Var2;
                    }
                    if (i5 != 0) {
                        str4 = "Crossfade";
                    } else {
                        str4 = str2;
                    }
                    ni20 ni20Var3 = ni20VarO0;
                    b(bno1.y(obj, str4, x340Var, (i4 & 14) | ((i4 >> 6) & 112), 0), qim0Var3, ni20Var3, null, j2iVar, x340Var, i4 & 58352);
                    str3 = str4;
                    qim0Var2 = qim0Var3;
                    ni20Var2 = ni20Var3;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    str3 = str2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new j90(obj, qim0Var2, ni20Var2, str3, j2iVar, i2, i3, (byte) 2);
                }
            }
            i4 |= 3072;
            str2 = str;
            if ((i2 & 24576) == 0) {
                if (x340Var.i(j2iVar)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i8 != 0) {
                    qim0Var = nim0.a;
                }
                qim0 qim0Var4 = qim0Var;
                if (i9 != 0) {
                    ni20VarO0 = irn1.o0(0, 0, (dlv) null, 7);
                } else {
                    ni20VarO0 = ni20Var2;
                }
                if (i5 != 0) {
                    str4 = "Crossfade";
                } else {
                    str4 = str2;
                }
                ni20 ni20Var4 = ni20VarO0;
                b(bno1.y(obj, str4, x340Var, (i4 & 14) | ((i4 >> 6) & 112), 0), qim0Var4, ni20Var4, null, j2iVar, x340Var, i4 & 58352);
                str3 = str4;
                qim0Var2 = qim0Var4;
                ni20Var2 = ni20Var4;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                str3 = str2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new j90(obj, qim0Var2, ni20Var2, str3, j2iVar, i2, i3, (byte) 2);
            }
        }
        i4 |= 384;
        ni20Var2 = ni20Var;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                str2 = str;
                if (x340Var.g(str2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((i2 & 24576) == 0) {
                if (x340Var.i(j2iVar)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i8 != 0) {
                    qim0Var = nim0.a;
                }
                qim0 qim0Var5 = qim0Var;
                if (i9 != 0) {
                    ni20VarO0 = irn1.o0(0, 0, (dlv) null, 7);
                } else {
                    ni20VarO0 = ni20Var2;
                }
                if (i5 != 0) {
                    str4 = "Crossfade";
                } else {
                    str4 = str2;
                }
                ni20 ni20Var5 = ni20VarO0;
                b(bno1.y(obj, str4, x340Var, (i4 & 14) | ((i4 >> 6) & 112), 0), qim0Var5, ni20Var5, null, j2iVar, x340Var, i4 & 58352);
                str3 = str4;
                qim0Var2 = qim0Var5;
                ni20Var2 = ni20Var5;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                str3 = str2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new j90(obj, qim0Var2, ni20Var2, str3, j2iVar, i2, i3, (byte) 2);
            }
        }
        i4 |= 3072;
        str2 = str;
        if ((i2 & 24576) == 0) {
            if (x340Var.i(j2iVar)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i4 |= i7;
        }
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            if (i8 != 0) {
                qim0Var = nim0.a;
            }
            qim0 qim0Var6 = qim0Var;
            if (i9 != 0) {
                ni20VarO0 = irn1.o0(0, 0, (dlv) null, 7);
            } else {
                ni20VarO0 = ni20Var2;
            }
            if (i5 != 0) {
                str4 = "Crossfade";
            } else {
                str4 = str2;
            }
            ni20 ni20Var6 = ni20VarO0;
            b(bno1.y(obj, str4, x340Var, (i4 & 14) | ((i4 >> 6) & 112), 0), qim0Var6, ni20Var6, null, j2iVar, x340Var, i4 & 58352);
            str3 = str4;
            qim0Var2 = qim0Var6;
            ni20Var2 = ni20Var6;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            str3 = str2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j90(obj, qim0Var2, ni20Var2, str3, j2iVar, i2, i3, (byte) 2);
        }
    }

    public static u7h1 a0(vu30 vu30Var, xu30 xu30Var, int i2) {
        if ((i2 & 1) != 0) {
            vu30Var = z691.g;
        }
        if ((i2 & 2) != 0) {
            xu30Var = rre1.X;
        }
        return new u7h1(vu30Var, xu30Var);
    }

    public static final void b(bjg1 bjg1Var, qim0 qim0Var, ni20 ni20Var, iu30 iu30Var, j2i j2iVar, b0k b0kVar, int i2) {
        j2i j2iVar2;
        iu30 iu30Var2;
        bjg1 bjg1Var2 = bjg1Var;
        k9 k9Var = bjg1Var2.a;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1877370462);
        int i3 = (i2 & 6) == 0 ? (x340Var.g(bjg1Var2) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(ni20Var) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            j2iVar2 = j2iVar;
            i4 |= x340Var.i(j2iVar2) ? 16384 : 8192;
        } else {
            j2iVar2 = j2iVar;
        }
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = a9o.b;
                x340Var.s0(objT);
            }
            iu30Var2 = (iu30) objT;
            Object objT2 = x340Var.T();
            Object obj = objT2;
            if (objT2 == m4cVar) {
                bw91 bw91VarP = xto.p();
                bw91VarP.add(k9Var.P0());
                x340Var.s0(bw91VarP);
                obj = bw91VarP;
            }
            bw91 bw91Var = (bw91) obj;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                long[] jArr = hj41.a;
                objT3 = new nen0();
                x340Var.s0(objT3);
            }
            nen0 nen0Var = (nen0) objT3;
            hrr0 hrr0Var = bjg1Var2.d;
            if (u890.j(k9Var.P0(), hrr0Var.getValue())) {
                x340Var.i0(321145192);
                if (bw91Var.size() == 1 && u890.j(bw91Var.get(0), hrr0Var.getValue())) {
                    x340Var.i0(321469824);
                    x340Var.r(false);
                } else {
                    x340Var.i0(321279546);
                    boolean z = (i4 & 14) == 4;
                    Object objT4 = x340Var.T();
                    if (z || objT4 == m4cVar) {
                        objT4 = new fnn(bjg1Var2, (byte) 15);
                        x340Var.s0(objT4);
                    }
                    r7h.a0(bw91Var, (iu30) objT4);
                    nen0Var.a();
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                x340Var.i0(321475776);
                x340Var.r(false);
            }
            if (nen0Var.b(hrr0Var.getValue())) {
                x340Var.i0(322279296);
                x340Var.r(false);
            } else {
                x340Var.i0(321536443);
                ek60 ek60VarListIterator = bw91Var.listIterator();
                int i5 = 0;
                while (true) {
                    ek60 ek60Var = ek60VarListIterator;
                    if (!ek60Var.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (u890.j(iu30Var2.invoke(ek60Var.next()), iu30Var2.invoke(hrr0Var.getValue()))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 == -1) {
                    bw91Var.add(hrr0Var.getValue());
                } else {
                    bw91Var.set(i5, hrr0Var.getValue());
                }
                nen0Var.a();
                int size = bw91Var.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj2 = bw91Var.get(i6);
                    nen0Var.m(obj2, apo.r(-934471669, new c9o(bjg1Var2, ni20Var, obj2, j2iVar2, (byte) 0), x340Var));
                    i6++;
                    bjg1Var2 = bjg1Var;
                    j2iVar2 = j2iVar;
                }
                x340Var.r(false);
            }
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.B(x340Var, Integer.valueOf(iHashCode));
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(-1312707512);
            int size2 = bw91Var.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Object obj3 = bw91Var.get(i7);
                x340Var.f0(1171574969, iu30Var2.invoke(obj3));
                vu30 vu30Var = (vu30) nen0Var.g(obj3);
                if (vu30Var == null) {
                    x340Var.i0(1959122128);
                } else {
                    c13.o(x340Var, 1171576145, 0, vu30Var, x340Var);
                }
                x340Var.r(false);
                x340Var.r(false);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
            iu30Var2 = iu30Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0((byte) 27, i2, bjg1Var, ni20Var, j2iVar, iu30Var2, qim0Var);
        }
    }

    public static final k291 c(int i2, int i3) {
        w4u.a(i2);
        w4u w4uVar = new w4u(i2);
        w4u.a(i3);
        return new k291(w4uVar, new w4u(i3));
    }

    public static boolean c0(mln1 mln1Var) {
        Cursor cursorQuery;
        mln1Var.getClass();
        try {
            cursorQuery = mln1Var.a.query(mln1.b, null, null, null, null);
        } catch (RuntimeException e2) {
            mln1.c.a("RuntimeException occurred", e2);
            cursorQuery = null;
        }
        boolean z = cursorQuery == null;
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return !z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(n9d1 n9d1Var, x70 x70Var, float f2, boolean z, float f3, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-214456321);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(h2c.a) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(n9d1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.e(x70Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.d(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.d(f3) ? 131072 : 65536;
        }
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            int iC = l1d.C(n9d1Var.a());
            if (iC != 0) {
                if (iC == 1) {
                    i4 = 1;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return;
                    }
                    i4 = 9;
                }
            }
            gfx.g(i4, apo.r(-652362958, new o9d1(n9d1Var, f3, x70Var, f2, z, (byte) 1), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p9d1(n9d1Var, x70Var, f2, z, f3, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    public static boolean e(int i2, Rect rect, Rect rect2, Rect rect3) {
        int iK;
        int i3;
        int i4;
        boolean zF = f(i2, rect, rect2);
        if (!f(i2, rect, rect3) && zF) {
            if (i2 != 17) {
                if (i2 != 33) {
                    if (i2 != 66) {
                        if (i2 != 130) {
                            hhg1.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        if (rect.bottom <= rect3.top) {
                            if (i2 != 17 && i2 != 66) {
                                iK = K(i2, rect, rect2);
                                if (i2 != 17) {
                                    i3 = rect.left;
                                    i4 = rect3.left;
                                } else if (i2 != 33) {
                                    i3 = rect.top;
                                    i4 = rect3.top;
                                } else if (i2 != 66) {
                                    i3 = rect3.right;
                                    i4 = rect.right;
                                } else {
                                    if (i2 == 130) {
                                        hhg1.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                        return false;
                                    }
                                    i3 = rect3.bottom;
                                    i4 = rect.bottom;
                                }
                                if (iK < Math.max(1, i3 - i4)) {
                                }
                            }
                        }
                    } else if (rect.right <= rect3.left) {
                        if (i2 != 17) {
                            iK = K(i2, rect, rect2);
                            if (i2 != 17) {
                                i3 = rect.left;
                                i4 = rect3.left;
                            } else if (i2 != 33) {
                                i3 = rect.top;
                                i4 = rect3.top;
                            } else if (i2 != 66) {
                                i3 = rect3.right;
                                i4 = rect.right;
                            } else {
                                if (i2 == 130) {
                                    hhg1.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    return false;
                                }
                                i3 = rect3.bottom;
                                i4 = rect.bottom;
                            }
                            if (iK < Math.max(1, i3 - i4)) {
                            }
                        }
                    }
                } else if (rect.top >= rect3.bottom) {
                    if (i2 != 17) {
                        iK = K(i2, rect, rect2);
                        if (i2 != 17) {
                            i3 = rect.left;
                            i4 = rect3.left;
                        } else if (i2 != 33) {
                            i3 = rect.top;
                            i4 = rect3.top;
                        } else if (i2 != 66) {
                            i3 = rect3.right;
                            i4 = rect.right;
                        } else {
                            if (i2 == 130) {
                                hhg1.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                return false;
                            }
                            i3 = rect3.bottom;
                            i4 = rect.bottom;
                        }
                        if (iK < Math.max(1, i3 - i4)) {
                        }
                    }
                }
            } else if (rect.left >= rect3.right) {
                if (i2 != 17) {
                    iK = K(i2, rect, rect2);
                    if (i2 != 17) {
                        i3 = rect.left;
                        i4 = rect3.left;
                    } else if (i2 != 33) {
                        i3 = rect.top;
                        i4 = rect3.top;
                    } else if (i2 != 66) {
                        i3 = rect3.right;
                        i4 = rect.right;
                    } else {
                        if (i2 == 130) {
                            hhg1.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        i3 = rect3.bottom;
                        i4 = rect.bottom;
                    }
                    if (iK < Math.max(1, i3 - i4)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0025  */
    public static boolean f(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        hhg1.n("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                } else if (rect2.bottom < rect.top) {
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
        } else if (rect2.bottom < rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static synchronized long g(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static void h(int i2) {
        if (2 > i2 || i2 >= 37) {
            q58.i(new tr80(2, 36, 1), cy30.r(i2, "radix ", " was not in valid range "));
        }
    }

    public static int i(int i2, int i3) {
        long j2 = ((long) i2) + ((long) i3);
        int i4 = (int) j2;
        if (j2 == ((long) i4)) {
            return i4;
        }
        throw new ArithmeticException(l1d.j(i2, i3, "overflow: checkedAdd(", ", ", ")"));
    }

    public static final float j(float f2, float f3, float f4) {
        return Math.min(f4, Math.max(f3, f2));
    }

    public static void k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                ws10.Z.d();
            }
        }
    }

    public static void l(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static final int m(char c2, int i2) {
        return Character.digit((int) c2, i2);
    }

    public static int n(char c2) {
        int iDigit = Character.digit((int) c2, 10);
        if (iDigit >= 0) {
            return iDigit;
        }
        hhg1.n(cy30.l("Char ", c2, " is not a decimal digit"));
        return 0;
    }

    public static int o(int i2, int i3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i4 = i2 / i3;
        int i5 = i2 - (i3 * i4);
        if (i5 == 0) {
            return i4;
        }
        int i6 = ((i2 ^ i3) >> 31) | 1;
        switch (nr80.a[roundingMode.ordinal()]) {
            case 1:
                hm5.n(i5 == 0);
                return i4;
            case 2:
                return i4;
            case 3:
                if (i6 >= 0) {
                    return i4;
                }
                break;
            case 4:
                break;
            case 5:
                if (i6 <= 0) {
                    return i4;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i5);
                int iAbs2 = iAbs - (Math.abs(i3) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i4;
                }
                if (iAbs2 <= 0) {
                    return i4;
                }
                break;
            default:
                hhg1.c();
                return 0;
        }
        return i4 + i6;
    }

    public static final int p(Context context, int i2) {
        return context.getResources().getDimensionPixelSize(i2);
    }

    public static final boolean q(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static boolean r(String str, String str2) {
        char c2;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                char cCharAt2 = str2.charAt(i2);
                if (cCharAt == cCharAt2 || ((c2 = (char) ((cCharAt | ' ') - 97)) < 26 && c2 == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.drm.MediaDrmCallbackException */
    public static hmh0 s(o2r o2rVar, String str, byte[] bArr, Map map) throws Throwable {
        n3r n3rVar;
        Map map2;
        List list;
        rsb1 rsb1Var = new rsb1(o2rVar);
        m3r m3rVar = new m3r();
        m3rVar.f(str);
        m3rVar.e(map);
        m3rVar.d();
        m3rVar.c(bArr);
        m3rVar.b();
        n3r n3rVarA = m3rVar.a();
        int i2 = 0;
        int i3 = 0;
        n3r n3rVarA2 = n3rVarA;
        while (true) {
            try {
                g3r g3rVar = new g3r(rsb1Var, n3rVarA2);
                try {
                    byte[] bArrB = vgc.b(g3rVar);
                    n3rVar = n3rVarA;
                    try {
                        c2e0 c2e0Var = new c2e0(-1L, n3rVar, SystemClock.elapsedRealtime());
                        c2e0Var.d(rsb1Var.i());
                        c2e0Var.c(rsb1Var.l());
                        c2e0Var.b(bArrB.length);
                        d2e0 d2e0VarA = c2e0Var.a();
                        fad0 fad0Var = new fad0(bArrB);
                        fad0Var.l(d2e0VarA);
                        hmh0 hmh0VarA = fad0Var.a();
                        zoi1.h(g3rVar);
                        return hmh0VarA;
                    } catch (HttpDataSource$InvalidResponseCodeException e2) {
                        e = e2;
                        try {
                            int i4 = e.d;
                            String str2 = null;
                            if ((i4 == 307 || i4 == 308) && i3 < 5 && (map2 = e.f) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                                str2 = (String) list.get(i2);
                            }
                            if (str2 == null) {
                                throw e;
                            }
                            i3++;
                            m3r m3rVarA = n3rVarA2.a();
                            m3rVarA.f(str2);
                            n3rVarA2 = m3rVarA.a();
                            try {
                                zoi1.h(g3rVar);
                                n3rVarA = n3rVar;
                            } catch (Exception e3) {
                                e = e3;
                                throw new MediaDrmCallbackException(n3rVar, rsb1Var.i(), rsb1Var.e(), rsb1Var.c(), e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            zoi1.h(g3rVar);
                            throw th2;
                        }
                    }
                } catch (HttpDataSource$InvalidResponseCodeException e4) {
                    e = e4;
                    n3rVar = n3rVarA;
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    zoi1.h(g3rVar);
                    throw th4;
                }
                n3rVarA = n3rVar;
            } catch (Exception e5) {
                e = e5;
                n3rVar = n3rVarA;
            }
        }
    }

    public static final bge t(xm41 xm41Var, mr20 mr20Var, iu30 iu30Var) {
        return h4p1.g(new elu0(xm41Var, iu30Var, mr20Var, (lnm) null, (byte) 29));
    }

    public static ms50 u(SSLSession sSLSession) throws IOException {
        List listK;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            eg.m("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            k220.i("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        acg acgVarB = acg.b.b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            eg.m("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            k220.i("tlsVersion == NONE");
            return null;
        }
        tye1 tye1VarY = yoi1.y(protocol);
        try {
            listK = z4n1.k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            listK = z6x.a;
        }
        return new ms50(tye1VarY, acgVarB, z4n1.k(sSLSession.getLocalCertificates()), new g24(listK, (byte) 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int v() {
        boolean zB = B();
        ?? r0 = zB;
        if (F()) {
            r0 = (zB ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r0 | 4 : r0;
    }

    public static final khk1 w(View view) {
        khk1 khk1Var;
        Object tag = view.getTag(2131428114);
        khk1 khk1Var2 = tag instanceof khk1 ? (khk1) tag : null;
        if (khk1Var2 != null) {
            return khk1Var2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(2131428114);
                khk1Var = tag2 instanceof khk1 ? (khk1) tag2 : null;
                if (khk1Var == null) {
                    khk1Var = new khk1(view);
                    view.addOnAttachStateChangeListener(khk1Var);
                    view.setTag(2131428114, khk1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return khk1Var;
    }

    public static int x(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i2);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static String y(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = i2 * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[(b2 & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static final Object z(xm41 xm41Var, iu30 iu30Var) {
        if (!(xm41Var instanceof jrb1)) {
            eg.m("Unknown scope implementation");
            return null;
        }
        n601 n601Var = new n601(iu30Var, (byte) 16);
        xbm xbmVarB = ((jrb1) xm41Var).b();
        if (xbmVarB != null) {
            return n601Var.invoke(xbmVarB);
        }
        return null;
    }

    public abstract void b0(int i2, byte[] bArr, int i3);
}
