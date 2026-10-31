package p;

import android.R;
import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteAction;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.icu.text.BreakIterator;
import android.icu.text.DecimalFormatSymbols;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.text.Layout;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStructure;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.unit.TextUnit;
import com.comscore.streaming.WindowState;
import com.google.android.gms.internal.common.zzy;
import com.spotify.base.java.logging.Logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ph5 {
    public static String a;
    public static int b;
    public static Boolean c;

    public static Signature[] A(PackageInfo packageInfo) {
        SigningInfo signingInfo = packageInfo.signingInfo;
        if (signingInfo == null) {
            return null;
        }
        return signingInfo.getSigningCertificateHistory();
    }

    public static PrecomputedText.Params B(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }

    public static int C(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri D(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static final long E(Context context, List list) {
        Long lValueOf;
        PackageInfo packageInfo;
        Iterator it = list.iterator();
        do {
            lValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                packageInfo = context.getPackageManager().getPackageInfo((String) it.next(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                lValueOf = Long.valueOf(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
            }
        } while (lValueOf == null);
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    public static ClassLoader F() {
        return WebView.getWebViewClassLoader();
    }

    public static boolean G(NetworkRequest networkRequest, int i) {
        return networkRequest.hasCapability(i);
    }

    public static boolean H(NetworkRequest networkRequest, int i) {
        return networkRequest.hasTransport(i);
    }

    public static final boolean I(Context context) {
        List<String> listQ0 = ihc1.Q0("C4:C1:A2:94:92:B9:A4:38:53:8C:8C:A5:76:B1:FC:D2:9B:24:6F:3B:82:89:15:13:1C:6C:35:5B:6D:15:FB:C4", new String[]{":"}, 0, 6);
        ArrayList arrayList = new ArrayList(q7h.U(listQ0, 10));
        for (String str : listQ0) {
            eth.h(16);
            arrayList.add(Byte.valueOf((byte) Integer.parseInt(str, 16)));
        }
        byte[] bArrG1 = o7h.g1(arrayList);
        if (Build.VERSION.SDK_INT >= 28) {
            return context.getPackageManager().hasSigningCertificate(context.getPackageName(), bArrG1, 1);
        }
        Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
        signatureArr.getClass();
        for (Signature signature : signatureArr) {
            int i = hu50.a;
            cyi0 cyi0Var = gu50.a;
            byte[] byteArray = signature.toByteArray();
            cyi0Var.getClass();
            int length = byteArray.length;
            dm5.v(0, length, byteArray.length);
            dm5.l("expectedInputSize must be >= 0 but was %s", length, length >= 0);
            bmq0 bmq0VarM = cyi0Var.M();
            bmq0VarM.U(byteArray, length);
            if (Arrays.equals(bmq0VarM.C().a(), bArrG1)) {
                return true;
            }
        }
        return false;
    }

    public static final float J(float f, int i, Context context, String str, kee1 kee1Var) {
        int iCeil = (int) Math.ceil(z1a1.b(context).a * f);
        if (iCeil < 1) {
            iCeil = 1;
        }
        return z1a1.b(context).M0(W(context, str, iCeil, kee1Var).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(iCeil).setMaxLines(i).build().getHeight());
    }

    public static boolean K(Handler handler, c5d c5dVar, long j) {
        return handler.postDelayed(c5dVar, "retry_token", j);
    }

    public static byte L(ehe0 ehe0Var) {
        return Character.getDirectionality(Character.codePointAt(DecimalFormatSymbols.getInstance(ehe0Var.a).getDigitStrings()[0], 0));
    }

    public static final fsw0 M(Context context) {
        String processName;
        String packageName = context.getPackageName();
        packageName.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
        } else {
            try {
                Object objInvoke = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null).invoke(null, null);
                processName = objInvoke instanceof String ? (String) objInvoke : null;
            } catch (ReflectiveOperationException e) {
                Logger.l(e, "Failed to retrieve process name using reflection", new Object[0]);
            }
        }
        if (processName == null) {
            processName = packageName;
        }
        if (ihc1.h0(processName, ".gdbprocess", false)) {
            return fsw0.b;
        }
        boolean zEquals = processName.equals(packageName);
        fsw0 fsw0Var = fsw0.a;
        if (zEquals || ihc1.h0(processName, "com.spotify.music", false)) {
            return fsw0Var;
        }
        if (ihc1.h0(processName, "robolectric.ui", false) || izd1.a) {
            return fsw0.c;
        }
        eg.f(f4i1.f("The process name ", processName, " is not allowed to start"));
        return null;
    }

    public static int N(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int O(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int P(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int Q(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static void R(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void S(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }

    public static final void T(JobInfo.Builder builder, NetworkRequest networkRequest) {
        builder.setRequiredNetwork(networkRequest);
    }

    public static void U(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static final void V(StaticLayout.Builder builder) {
        builder.setUseLineSpacingFromFallbacks(true);
    }

    public static final StaticLayout.Builder W(Context context, CharSequence charSequence, int i, kee1 kee1Var) {
        StaticLayout.Builder lineSpacing = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), X(context, kee1Var), i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setTextDirection(TextDirectionHeuristics.LOCALE).setIncludePad(true).setLineSpacing(0.0f, 1.0f);
        if (Build.VERSION.SDK_INT >= 28) {
            lineSpacing.setUseLineSpacingFromFallbacks(true);
        }
        return lineSpacing;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    public static final TextPaint X(Context context, kee1 kee1Var) {
        int i;
        Typeface typefaceCreate;
        TextUnit textUnit = kee1Var.b;
        float fC = textUnit != null ? TextUnit.c(textUnit.a) : 16.0f;
        String str = kee1Var.e != null ? "sans-serif-medium" : "sans-serif";
        ka30 ka30Var = kee1Var.c;
        if (ka30Var != null && ka30Var.a == 700) {
            i = 700;
        } else if (ka30Var == null) {
            i = WindowState.NORMAL;
        } else {
            i = 500;
            if (ka30Var.a != 500) {
                i = WindowState.NORMAL;
            }
        }
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 28) {
            typefaceCreate = Typeface.create(Typeface.create(str, 0), i, false);
        } else {
            if (ka30Var != null && ka30Var.a == 700) {
                i2 = 1;
            }
            typefaceCreate = Typeface.create(str, i2);
        }
        TextPaint textPaint = new TextPaint(129);
        textPaint.setTextSize(TypedValue.applyDimension(2, fC, context.getResources().getDisplayMetrics()));
        textPaint.setTypeface(typefaceCreate);
        textPaint.setTextLocales(context.getResources().getConfiguration().getLocales());
        return textPaint;
    }

    public static boolean Y() {
        Boolean boolValueOf = c;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (objInvoke == null) {
                        throw new zzy(bpo1.F("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static void a(Menu menu, int i, Context context, TextClassification textClassification, int i2, Drawable drawable) {
        byte b2 = 1;
        if (i2 < 0) {
            MenuItem menuItemAdd = menu.add(R.id.textAssist, R.id.textAssist, i, textClassification.getLabel());
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setIcon(drawable);
            menuItemAdd.setOnMenuItemClickListener(new z35(context, textClassification, b2));
            return;
        }
        b2 = i2 != 0 ? (byte) 0 : (byte) 1;
        final RemoteAction remoteAction = textClassification.getActions().get(i2);
        MenuItem menuItemAdd2 = menu.add(R.id.textAssist, b2 != 0 ? 16908353 : 0, i, remoteAction.getTitle());
        menuItemAdd2.setShowAsAction(b2 == 0 ? 0 : 2);
        if (drawable != null) {
            menuItemAdd2.setIcon(drawable);
        }
        menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: p.qee1
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                ph5.b(remoteAction);
                return true;
            }
        });
    }

    public static final void b(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            sf.H(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    public static void c(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static final void d(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    public static Typeface e(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static Handler f(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler g(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler h(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static e8o0 i(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException unused) {
                qs10 qs10VarA = qs10.a();
                int i2 = e8o0.b;
                int i3 = e8o0.b;
                qs10VarA.getClass();
            }
        }
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = qqn1.a[i4];
            if (!f46.L(iArr, i5)) {
                try {
                    builder.removeCapability(i5);
                } catch (IllegalArgumentException unused2) {
                    qs10 qs10VarA2 = qs10.a();
                    int i6 = e8o0.b;
                    int i7 = e8o0.b;
                    qs10VarA2.getClass();
                }
            }
        }
        for (int i8 : iArr2) {
            builder.addTransportType(i8);
        }
        return new e8o0(builder.build());
    }

    public static TextClassifier j(Context context, fw51 fw51Var) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int iOrdinal = fw51Var.ordinal();
        if (iOrdinal == 0) {
            str = "edittext";
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public static TypefaceSpan k(Typeface typeface) {
        return new TypefaceSpan(typeface);
    }

    public static void l(View view) {
        if (Build.VERSION.SDK_INT >= 28) {
            view.setAccessibilityHeading(true);
        }
        b8k1.p(view, new zdc((byte) 10));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ad A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static final boolean m(Context context, String str, long j, kee1 kee1Var, int i, boolean z) {
        Collection collectionQ;
        lr80 it;
        int lineEnd;
        int iB = (int) (z1a1.b(context).a * s3v.b(j));
        float fA = z1a1.b(context).a * s3v.a(j);
        if (iB > 0 && fA > 0.0f && i > 0) {
            StaticLayout staticLayoutBuild = W(context, str, iB, kee1Var).build();
            if (staticLayoutBuild.getLineCount() <= i && staticLayoutBuild.getHeight() <= fA) {
                Collection collectionQ2 = yoi1.Q(0, staticLayoutBuild.getLineCount());
                if ((collectionQ2 instanceof Collection) && collectionQ2.isEmpty()) {
                    if (!z) {
                        BreakIterator lineInstance = BreakIterator.getLineInstance(context.getResources().getConfiguration().getLocales().get(0));
                        lineInstance.setText(str.toString());
                        collectionQ = yoi1.Q(0, staticLayoutBuild.getLineCount() - 1);
                        if (collectionQ instanceof Collection) {
                            it = collectionQ.iterator();
                            while (((sr80) it).c) {
                                lineEnd = staticLayoutBuild.getLineEnd(it.nextInt());
                                if (1 <= lineEnd) {
                                }
                            }
                        } else {
                            it = collectionQ.iterator();
                            while (((sr80) it).c) {
                                lineEnd = staticLayoutBuild.getLineEnd(it.nextInt());
                                if (1 <= lineEnd) {
                                }
                            }
                        }
                    }
                    return true;
                }
                lr80 it2 = collectionQ2.iterator();
                while (((sr80) it2).c) {
                    int iNextInt = it2.nextInt();
                    if (staticLayoutBuild.getLineLeft(iNextInt) < 0.0f || staticLayoutBuild.getLineRight(iNextInt) > iB) {
                    }
                }
                if (!z) {
                    BreakIterator lineInstance2 = BreakIterator.getLineInstance(context.getResources().getConfiguration().getLocales().get(0));
                    lineInstance2.setText(str.toString());
                    collectionQ = yoi1.Q(0, staticLayoutBuild.getLineCount() - 1);
                    if ((collectionQ instanceof Collection) || !collectionQ.isEmpty()) {
                        it = collectionQ.iterator();
                        while (((sr80) it).c) {
                            lineEnd = staticLayoutBuild.getLineEnd(it.nextInt());
                            if (1 <= lineEnd || lineEnd >= str.length() || lineInstance2.isBoundary(lineEnd)) {
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static long n(Context context) {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
    }

    public static List o(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String[] p(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long q(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static Executor r(Context context) {
        return context.getMainExecutor();
    }

    public static String s() throws Throwable {
        BufferedReader bufferedReader;
        String str = a;
        if (str != null) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            a = processName;
            return processName;
        }
        int iMyPid = b;
        if (iMyPid == 0) {
            iMyPid = Process.myPid();
            b = iMyPid;
        }
        String strTrim = null;
        strTrim = null;
        strTrim = null;
        BufferedReader bufferedReader2 = null;
        strTrim = null;
        try {
            if (iMyPid > 0) {
                try {
                    StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                    sb.append("/proc/");
                    sb.append(iMyPid);
                    sb.append("/cmdline");
                    String string = sb.toString();
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(string));
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        try {
                            String line = bufferedReader.readLine();
                            zod.s(line);
                            strTrim = line.trim();
                            bufferedReader.close();
                        } catch (IOException unused) {
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            a = strTrim;
                            return strTrim;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th2;
                    }
                } catch (IOException unused3) {
                    bufferedReader = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (IOException unused4) {
        }
        a = strTrim;
        return strTrim;
    }

    public static void t(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    public static int u(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String v(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int w(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int x(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int y(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int z(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
