package p;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import app.p000rive.semantics.SemanticState;
import com.airbnb.lottie.LottieAnimationView;
import com.comscore.streaming.WindowState;
import com.spotify.scannables.scannables.ScannablesException;
import com.spotify.scannables.scannables.tagreader.SPTTagReader;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class p2r implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p2r(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.scannables.scannables.ScannablesException */
    /* JADX WARN: Code duplicated, block: B:8:0x0035  */
    /* JADX WARN: Type inference failed for: r0v24, types: [android.view.View, com.airbnb.lottie.LottieAnimationView] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws ScannablesException {
        ServiceInfo serviceInfo;
        String str;
        String str2;
        int i;
        int i2 = -1;
        int i3 = 1;
        z = true;
        z = true;
        z = true;
        boolean z = true;
        int i4 = 0;
        z = false;
        boolean z2 = false;
        String str3 = null;
        switch (this.a) {
            case 0:
                q2r q2rVar = (q2r) this.b;
                byte[] bArr = (byte[]) this.c;
                return mb4.h(bArr, bArr.length, q2rVar.c, q2rVar.d);
            case 1:
                q2r q2rVar2 = (q2r) this.b;
                Uri uri = (Uri) this.c;
                o2r o2rVarJ = q2rVar2.b.j();
                BitmapFactory.Options options = q2rVar2.c;
                int i5 = q2rVar2.d;
                try {
                    n3r n3rVar = new n3r(uri);
                    etr etrVar = (etr) o2rVarJ;
                    etrVar.t(n3rVar);
                    byte[] bArrCopyOf = new byte[SemanticState.ReadOnly];
                    int i6 = 0;
                    while (i4 != -1) {
                        if (i6 == bArrCopyOf.length) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                        }
                        i4 = etrVar.read(bArrCopyOf, i6, bArrCopyOf.length - i6);
                        if (i4 != -1) {
                            i6 += i4;
                        }
                    }
                    byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i6);
                    return mb4.h(bArrCopyOf2, bArrCopyOf2.length, options, i5);
                } finally {
                    ((etr) o2rVarJ).close();
                }
            case 2:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                u961 u961VarW = u961.w();
                Log.isLoggable("FirebaseMessaging", 3);
                ((ArrayDeque) u961VarW.d).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (u961VarW) {
                    try {
                        String str4 = (String) u961VarW.a;
                        if (str4 != null) {
                            str3 = str4;
                        } else {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null && context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                if (str.startsWith(".")) {
                                    str2 = context.getPackageName() + serviceInfo.name;
                                    u961VarW.a = str2;
                                } else {
                                    str2 = serviceInfo.name;
                                    u961VarW.a = str2;
                                }
                                str3 = str2;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str3 != null) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    intent2.setClassName(context.getPackageName(), str3);
                }
                try {
                    if ((u961VarW.z(context) ? ioo1.M(context, intent2) : context.startService(intent2)) == null) {
                        i2 = 404;
                    }
                } catch (IllegalStateException e) {
                    e.toString();
                    i = WindowState.MINIMIZED;
                    i2 = i;
                } catch (SecurityException unused) {
                    i = WindowState.FULL_SCREEN;
                    i2 = i;
                }
                return Integer.valueOf(i2);
            case 3:
                efe0 efe0Var = (efe0) this.b;
                xj80 xj80VarU = si1.u(new File((String) this.c));
                nac nacVar = new nac();
                try {
                    nfa0 nfa0Var = efe0Var.c;
                    se70 se70Var = se70.a;
                    nacVar.B(xj80VarU);
                    re70 re70Var = (re70) nfa0Var.a(nacVar.I(), se70Var);
                    xj80VarU.close();
                    nacVar.a();
                    return re70Var;
                } catch (Throwable th2) {
                    try {
                        xj80VarU.close();
                        nacVar.a();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            case 4:
                j2e0 j2e0Var = (j2e0) this.b;
                tf10 tf10Var = (tf10) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) j2e0Var.c;
                try {
                    j2e0Var.b = tf10Var.call();
                    return null;
                } finally {
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
            case 5:
                ?? r0 = (LottieAnimationView) this.b;
                String str5 = (String) this.c;
                ubf0 ubf0Var = LottieAnimationView.T0;
                if (!r0.P0) {
                    return kcf0.b(r0.getContext(), str5, (String) null);
                }
                Context context2 = r0.getContext();
                HashMap map = kcf0.a;
                return kcf0.b(context2, str5, "asset_" + str5);
            case 6:
                ContentResolver contentResolver = (ContentResolver) this.b;
                Uri uri2 = (Uri) this.c;
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(contentResolver.openInputStream(uri2), null, options2);
                int i7 = options2.outHeight;
                int i8 = options2.outWidth;
                if (i7 > 1024 || i8 > 1024) {
                    int iMin = Math.min(Math.round(i7 / 1024.0f), Math.round(i8 / 1024.0f));
                    while ((i8 * i7) / (iMin * iMin) > 2097152.0f) {
                        iMin++;
                    }
                    i3 = iMin;
                }
                options2.inSampleSize = i3;
                options2.inJustDecodeBounds = false;
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(contentResolver.openInputStream(uri2), null, options2);
                int width = bitmapDecodeStream.getWidth();
                int height = bitmapDecodeStream.getHeight();
                int i9 = width * height;
                int[] iArr = new int[i9];
                bitmapDecodeStream.getPixels(iArr, 0, width, 0, 0, width, height);
                byte[] bArr2 = new byte[i9 * 3];
                dem1.w(bArr2, iArr, width, height);
                bitmapDecodeStream.recycle();
                int width2 = bitmapDecodeStream.getWidth();
                String[] strArrDecodeWaveformTag = SPTTagReader.decodeWaveformTag(bArr2, 0, width2, bitmapDecodeStream.getHeight(), width2);
                if (strArrDecodeWaveformTag == null || strArrDecodeWaveformTag.length <= 0) {
                    throw new ScannablesException();
                }
                return strArrDecodeWaveformTag[0];
            default:
                oxl1 oxl1Var = (qxl1) this.b;
                sxl1 sxl1Var = (sxl1) this.c;
                String str6 = sxl1Var.c;
                dxl1 dxl1Var = sxl1Var.h;
                vwl1 vwl1Var = sxl1Var.a;
                wvl1 wvl1Var = wvl1.a;
                if (oxl1Var instanceof oxl1) {
                    x8d0 x8d0Var = oxl1Var.a;
                    wvl1 wvl1VarC = dxl1Var.c(str6);
                    en31 en31Var = dxl1Var.a;
                    sxl1Var.g.z().a(str6);
                    if (wvl1VarC == null) {
                        z = false;
                    } else if (wvl1VarC == wvl1.b) {
                        if (x8d0Var instanceof x8d0) {
                            int i10 = txl1.a;
                            qs10.a().getClass();
                            if (vwl1Var.c()) {
                                sxl1Var.b();
                            } else {
                                dxl1Var.g(wvl1.c, str6);
                                qyo1.x(en31Var, false, true, new vae1(x8d0Var.a, str6, (byte) 15));
                                final long jCurrentTimeMillis = System.currentTimeMillis();
                                yct yctVar = sxl1Var.i;
                                for (final String str7 : yctVar.a(str6)) {
                                    if (dxl1Var.c(str7) == wvl1.e && ((Boolean) qyo1.x(yctVar.a, true, false, new jfa(str7, (byte) 5))).booleanValue()) {
                                        int i11 = txl1.a;
                                        qs10.a().getClass();
                                        dxl1Var.g(wvl1Var, str7);
                                        final byte b = i3 == true ? (byte) 1 : (byte) 0;
                                        qyo1.x(en31Var, false, true, new iu30() { // from class: p.zwl1
                                            public final Object invoke(Object obj) throws Exception {
                                                byte b2 = b;
                                                String str8 = str7;
                                                long j = jCurrentTimeMillis;
                                                switch (b2) {
                                                    case 0:
                                                        y341 y341Var = (y341) obj;
                                                        d441 d441VarG1 = y341Var.g1("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                                                        try {
                                                            d441VarG1.r(1, j);
                                                            d441VarG1.K(2, str8);
                                                            d441VarG1.f1();
                                                            return Integer.valueOf(jhc1.x(y341Var));
                                                        } finally {
                                                            d441VarG1.close();
                                                        }
                                                    default:
                                                        d441 d441VarG2 = ((y341) obj).g1("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                                                        try {
                                                            d441VarG2.r(1, j);
                                                            d441VarG2.K(2, str8);
                                                            d441VarG2.f1();
                                                            return rih1.a;
                                                        } finally {
                                                            d441VarG2.close();
                                                        }
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        } else if (x8d0Var instanceof w8d0) {
                            int i12 = txl1.a;
                            qs10.a().getClass();
                            sxl1Var.a(-256);
                        } else {
                            int i13 = txl1.a;
                            qs10.a().getClass();
                            if (vwl1Var.c()) {
                                sxl1Var.b();
                            } else {
                                sxl1Var.d(x8d0Var);
                            }
                        }
                        z = false;
                    } else if (wvl1VarC.a()) {
                        z = false;
                    } else {
                        sxl1Var.a(-512);
                    }
                    z2 = z;
                } else if (oxl1Var instanceof nxl1) {
                    y8d0 y8d0Var = ((nxl1) oxl1Var).a;
                    int i14 = txl1.a;
                    qs10.a().getClass();
                    if (vwl1Var.c()) {
                        sxl1Var.b();
                    } else {
                        sxl1Var.d(y8d0Var);
                    }
                } else {
                    if (!(oxl1Var instanceof pxl1)) {
                        eg.o();
                        return null;
                    }
                    int i15 = ((pxl1) oxl1Var).a;
                    if (u890.j(vwl1Var.y, Boolean.TRUE)) {
                        int i16 = txl1.a;
                        qs10.a().getClass();
                        sxl1Var.a(i15);
                    } else {
                        wvl1 wvl1VarC2 = dxl1Var.c(str6);
                        if (wvl1VarC2 == null || wvl1VarC2.a()) {
                            int i17 = txl1.a;
                            qs10 qs10VarA = qs10.a();
                            Objects.toString(wvl1VarC2);
                            qs10VarA.getClass();
                            z = false;
                        } else {
                            int i18 = txl1.a;
                            qs10 qs10VarA2 = qs10.a();
                            wvl1VarC2.toString();
                            qs10VarA2.getClass();
                            dxl1Var.g(wvl1Var, str6);
                            dxl1Var.h(i15, str6);
                            dxl1Var.f(-1L, str6);
                        }
                    }
                    z2 = z;
                }
                return Boolean.valueOf(z2);
        }
    }
}
