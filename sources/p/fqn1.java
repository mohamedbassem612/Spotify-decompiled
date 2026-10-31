package p;

import android.app.PendingIntent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.recaptcha.internal.zzsg;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeoutException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fqn1 implements vy11, jpo1, tso1, i2q0 {
    public static Timer e;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public fqn1(fqn1 fqn1Var) {
        this.a = (byte) 12;
        this.b = Arrays.copyOf((long[]) fqn1Var.b, 10);
        this.c = Arrays.copyOf((long[]) fqn1Var.c, 10);
        this.d = Arrays.copyOf((long[]) fqn1Var.d, 10);
    }

    public static void f(frl1 frl1Var, fqn1 fqn1Var) {
        fqn1 fqn1Var2 = (fqn1) frl1Var.b;
        long[] jArr = (long[]) fqn1Var.b;
        long[] jArr2 = (long[]) fqn1Var2.b;
        long[] jArr3 = (long[]) frl1Var.c;
        zqo1.z(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) fqn1Var.c;
        long[] jArr5 = (long[]) fqn1Var2.c;
        long[] jArr6 = (long[]) fqn1Var2.d;
        zqo1.z(jArr4, jArr5, jArr6);
        zqo1.z((long[]) fqn1Var.d, jArr6, jArr3);
    }

    public static final /* synthetic */ f2g1 i(fqn1 fqn1Var) {
        return (f2g1) fqn1Var.b;
    }

    public void a(ZipFile zipFile, HashSet hashSet) {
        HashSet hashSet2 = (HashSet) this.b;
        mxo1 mxo1Var = (mxo1) this.d;
        lpn1 lpn1Var = (lpn1) this.c;
        HashSet hashSet3 = new HashSet();
        mxo1Var.c(lpn1Var, hashSet, new fqn1(hashSet3, lpn1Var, zipFile, false, (byte) 7));
        hashSet2.addAll(hashSet3);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, p.dqo1, p.xaa] */
    public void accept(Object obj, Object obj2) {
        ?? r6 = (dqo1) obj;
        kho1 kho1Var = new kho1((bsd1) obj2, (byte) 2);
        hyl1 hyl1Var = (hyl1) this.b;
        dbm dbmVar = (dbm) this.c;
        IntentFilter[] intentFilterArr = (IntentFilter[]) this.d;
        r6.getClass();
        gro1 gro1Var = new gro1(intentFilterArr);
        gro1Var.l = dbmVar;
        f2g1 f2g1Var = r6.G;
        HashMap map = (HashMap) f2g1Var.b;
        synchronized (map) {
            try {
                if (map.get(hyl1Var) != null) {
                    if (Log.isLoggable("WearableClient", 2)) {
                        new StringBuilder(String.valueOf(hyl1Var).length() + 20);
                    }
                    kho1Var.a(new Status(4001, (String) null, (PendingIntent) null, (lal) null));
                    return;
                }
                if (Log.isLoggable("WearableClient", 2)) {
                    new StringBuilder(String.valueOf(hyl1Var).length() + 14);
                }
                map.put(hyl1Var, gro1Var);
                try {
                    xdo1 xdo1Var = (xdo1) r6.n();
                    deo1 deo1Var = new deo1(map, hyl1Var, kho1Var);
                    c7o1 c7o1Var = new c7o1(gro1Var);
                    Parcel parcelA1 = xdo1Var.a1();
                    zsn1.c(parcelA1, deo1Var);
                    zsn1.b(parcelA1, c7o1Var);
                    xdo1Var.Z0(16, parcelA1);
                } catch (RemoteException e2) {
                    if (Log.isLoggable("WearableClient", 3)) {
                        new StringBuilder(String.valueOf(hyl1Var).length() + 39);
                    }
                    ((HashMap) f2g1Var.b).remove(hyl1Var);
                    throw e2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void b(cvo1 cvo1Var, File file, boolean z) throws IllegalAccessException, IOException, InvocationTargetException {
        ((HashSet) this.b).add(file);
        if (z) {
            return;
        }
        lpn1 lpn1Var = (lpn1) this.c;
        String str = lpn1Var.b;
        ZipEntry zipEntry = cvo1Var.b;
        lpn1Var.a.getAbsolutePath();
        zipEntry.getName();
        file.getAbsolutePath();
        ZipFile zipFile = (ZipFile) this.d;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                file.setWritable(false, true);
                file.setWritable(false, false);
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    public cjp1 c() {
        boolean z;
        boolean z2;
        String str = (String) this.b;
        Uri uri = (Uri) this.c;
        Uri uri2 = (Uri) this.d;
        cjp1 cjp1Var = new cjp1(str, uri, uri2);
        dm5.l("The additional data exceeds the maximum allowed length %s.", 4096, str == null || str.length() <= 4096);
        if (uri == null || uri.getPath() == null) {
            z = true;
        } else {
            String path = uri.getPath();
            path.getClass();
            if (path.length() <= 512) {
                z = true;
            } else {
                z = false;
            }
        }
        dm5.l("The main stage URL path exceeds the maximum allowed length %s.", 512, z);
        if (uri2 != null && uri2.getPath() != null) {
            String path2 = uri2.getPath();
            path2.getClass();
            z2 = path2.length() <= 512;
        }
        dm5.l("The side panel URL path exceeds the maximum allowed length %s.", 512, z2);
        return cjp1Var;
    }

    public yyo1 d() {
        return (yyo1) this.b;
    }

    public void e(Throwable th) {
        boolean z = th instanceof TimeoutException;
        axn1 axn1Var = (axn1) this.d;
        if (z) {
            axn1Var.d0(102, 28, iyn1.C);
            vsn1.i("BillingClientTesting");
        } else {
            axn1Var.d0(95, 28, iyn1.C);
            vsn1.i("BillingClientTesting");
        }
        ((sl21) this.c).run();
    }

    public uyo1 g() {
        return (uyo1) this.c;
    }

    public byte[] h() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = (long[]) this.d;
        zqo1.A(jArr4, jArr14);
        zqo1.A(jArr13, jArr4);
        zqo1.A(jArr12, jArr13);
        zqo1.z(jArr5, jArr12, jArr14);
        zqo1.z(jArr6, jArr5, jArr4);
        zqo1.A(jArr12, jArr6);
        zqo1.z(jArr7, jArr12, jArr5);
        zqo1.A(jArr12, jArr7);
        zqo1.A(jArr13, jArr12);
        zqo1.A(jArr12, jArr13);
        zqo1.A(jArr13, jArr12);
        zqo1.A(jArr12, jArr13);
        zqo1.z(jArr8, jArr12, jArr7);
        zqo1.A(jArr12, jArr8);
        zqo1.A(jArr13, jArr12);
        for (int i = 2; i < 10; i += 2) {
            zqo1.A(jArr12, jArr13);
            zqo1.A(jArr13, jArr12);
        }
        zqo1.z(jArr9, jArr13, jArr8);
        zqo1.A(jArr12, jArr9);
        zqo1.A(jArr13, jArr12);
        for (int i2 = 2; i2 < 20; i2 += 2) {
            zqo1.A(jArr12, jArr13);
            zqo1.A(jArr13, jArr12);
        }
        zqo1.z(jArr12, jArr13, jArr9);
        zqo1.A(jArr13, jArr12);
        zqo1.A(jArr12, jArr13);
        for (int i3 = 2; i3 < 10; i3 += 2) {
            zqo1.A(jArr13, jArr12);
            zqo1.A(jArr12, jArr13);
        }
        zqo1.z(jArr10, jArr12, jArr8);
        zqo1.A(jArr12, jArr10);
        zqo1.A(jArr13, jArr12);
        for (int i4 = 2; i4 < 50; i4 += 2) {
            zqo1.A(jArr12, jArr13);
            zqo1.A(jArr13, jArr12);
        }
        zqo1.z(jArr11, jArr13, jArr10);
        zqo1.A(jArr13, jArr11);
        zqo1.A(jArr12, jArr13);
        for (int i5 = 2; i5 < 100; i5 += 2) {
            zqo1.A(jArr13, jArr12);
            zqo1.A(jArr12, jArr13);
        }
        zqo1.z(jArr13, jArr12, jArr11);
        zqo1.A(jArr12, jArr13);
        zqo1.A(jArr13, jArr12);
        for (int i6 = 2; i6 < 50; i6 += 2) {
            zqo1.A(jArr12, jArr13);
            zqo1.A(jArr13, jArr12);
        }
        zqo1.z(jArr12, jArr13, jArr10);
        zqo1.A(jArr13, jArr12);
        zqo1.A(jArr12, jArr13);
        zqo1.A(jArr13, jArr12);
        zqo1.A(jArr12, jArr13);
        zqo1.A(jArr13, jArr12);
        zqo1.z(jArr, jArr13, jArr6);
        zqo1.z(jArr2, (long[]) this.b, jArr);
        zqo1.z(jArr3, (long[]) this.c, jArr);
        byte[] bArrC = zqo1.C(jArr3);
        bArrC[31] = (byte) (bArrC[31] ^ ((zqo1.C(jArr2)[0] & 1) << 7));
        return bArrC;
    }

    public bzo1 j() {
        return (bzo1) this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(List list, onm onmVar) {
        yvo1 yvo1Var;
        Iterator it;
        if (onmVar instanceof yvo1) {
            yvo1Var = (yvo1) onmVar;
            int i = yvo1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yvo1Var.d = i - Integer.MIN_VALUE;
            } else {
                yvo1Var = new yvo1(this, onmVar);
            }
        } else {
            yvo1Var = new yvo1(this, onmVar);
        }
        Object obj = yvo1Var.b;
        int i2 = yvo1Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            it = o7h.s1(list, 20, 20).iterator();
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = yvo1Var.a;
            hm5.M(obj);
        }
        while (it.hasNext()) {
            List list2 = (List) it.next();
            yvo1Var.a = it;
            yvo1Var.d = 1;
            Object objN = n(list2, yvo1Var);
            Object obj2 = d9n.a;
            if (objN == obj2) {
                return obj2;
            }
        }
        return rih1.a;
    }

    public qwo1 m() {
        return new qwo1(new p5o(this, (lnm) null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object n(List list, onm onmVar) {
        awo1 awo1Var;
        ArrayList arrayList;
        f2g1 f2g1Var = (f2g1) this.b;
        if (onmVar instanceof awo1) {
            awo1Var = (awo1) onmVar;
            int i = awo1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                awo1Var.d = i - Integer.MIN_VALUE;
            } else {
                awo1Var = new awo1(this, onmVar);
            }
        } else {
            awo1Var = new awo1(this, onmVar);
        }
        Object objP = awo1Var.b;
        int i2 = awo1Var.d;
        if (i2 == 0) {
            hm5.M(objP);
            bln1 bln1VarZ = cln1.z();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qvo1 qvo1Var = (qvo1) it.next();
                try {
                    String str = qvo1Var.a;
                    l8p1 l8p1Var = q8p1.c;
                    l8p1Var.getClass();
                    try {
                        CharSequence charSequenceC = l8p1Var.c(str);
                        int length = (int) (((((long) l8p1Var.a.d) * ((long) charSequenceC.length())) + 7) / 8);
                        byte[] bArr = new byte[length];
                        int iE = l8p1Var.e(bArr, charSequenceC);
                        if (iE != length) {
                            byte[] bArr2 = new byte[iE];
                            System.arraycopy(bArr, 0, bArr2, 0, iE);
                            bArr = bArr2;
                        }
                        bon1 bon1VarZ = bon1.z(bArr);
                        int iC = bon1VarZ.C();
                        int i3 = iC - 1;
                        if (iC == 0) {
                            throw null;
                        }
                        if (i3 == 0) {
                            aln1 aln1VarX = bon1VarZ.x();
                            bln1VarZ.d();
                            ((cln1) bln1VarZ.b).A(aln1VarX);
                        } else if (i3 == 1) {
                            hln1 hln1VarY = bon1VarZ.y();
                            bln1VarZ.d();
                            ((cln1) bln1VarZ.b).B(hln1VarY);
                        } else if (i3 != 2) {
                            eg.o();
                            return null;
                        }
                        arrayList2.add(qvo1Var);
                    } catch (zzsg e2) {
                        throw new IllegalArgumentException(e2);
                    }
                } catch (Exception unused) {
                    continue;
                }
            }
            if (((cln1) bln1VarZ.b).y() + ((cln1) bln1VarZ.b).x() != 0) {
                try {
                    y1t0 y1t0Var = (y1t0) this.c;
                    cln1 cln1Var = (cln1) bln1VarZ.e();
                    awo1Var.a = arrayList2;
                    awo1Var.d = 1;
                    objP = y1t0Var.p(cln1Var, awo1Var);
                    d9n d9nVar = d9n.a;
                    if (objP == d9nVar) {
                        return d9nVar;
                    }
                    arrayList = arrayList2;
                } catch (Exception unused2) {
                    arrayList = arrayList2;
                    f2g1Var.h(arrayList);
                }
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        arrayList = awo1Var.a;
        try {
            hm5.M(objP);
        } catch (Exception unused3) {
            f2g1Var.h(arrayList);
        }
        if (((Boolean) objP).booleanValue()) {
            f2g1Var.j(arrayList);
        }
        return rih1.a;
    }

    public void onComplete(Task task) {
        ny31 ny31Var = (ny31) this.c;
        String str = (String) this.b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (ny31Var.a) {
            ny31Var.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public String toString() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                zxl1 zxl1Var = (zxl1) ((zxl1) this.c).c;
                String str = "";
                while (zxl1Var != null) {
                    Object obj = zxl1Var.b;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    zxl1Var = (zxl1) zxl1Var.c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ fqn1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj2;
        this.c = obj3;
        this.d = obj;
    }

    public /* synthetic */ fqn1(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ fqn1(ny31 ny31Var, String str, ScheduledFuture scheduledFuture) {
        this.a = (byte) 13;
        this.c = ny31Var;
        this.b = str;
        this.d = scheduledFuture;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fqn1() {
        this(new long[10], new long[10], new long[10], false, (byte) 12);
        this.a = (byte) 12;
    }

    public fqn1(y1t0 y1t0Var, qeh1 qeh1Var, f2g1 f2g1Var) {
        this.a = (byte) 9;
        this.c = y1t0Var;
        this.d = qeh1Var;
        this.b = f2g1Var;
        if (e == null) {
            Timer timer = new Timer();
            e = timer;
            timer.schedule((TimerTask) new kbk1(this, (byte) 2), 30000L, 30000L);
        }
    }

    public fqn1(String str) {
        this.a = (byte) 0;
        zxl1 zxl1Var = new zxl1((byte) 16);
        this.c = zxl1Var;
        this.d = zxl1Var;
        this.b = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fqn1(frl1 frl1Var) {
        this();
        this.a = (byte) 12;
        f(frl1Var, this);
    }

    public /* synthetic */ fqn1(byte b) {
        this.a = b;
    }
}
