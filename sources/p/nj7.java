package p;

import android.content.Intent;
import android.media.MediaCodec;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.session.legacy.MediaBrowserProtocol;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nj7 extends Handler {
    public final /* synthetic */ byte a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj7(o8n o8nVar) {
        super(Looper.getMainLooper());
        this.a = (byte) 10;
        this.b = o8nVar;
    }

    private final void a(Message message) {
        twa twaVar;
        Set set;
        Set set2;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 1) {
            awr awrVar = (awr) this.b;
            zfr zfrVar = awrVar.c;
            if (obj == awrVar.A) {
                if (awrVar.q == 2 || awrVar.k()) {
                    awrVar.A = null;
                    if (obj2 instanceof Exception) {
                        zfrVar.s((Exception) obj2, false);
                        return;
                    }
                    try {
                        awrVar.b.f(((hmh0) obj2).a);
                        zfrVar.c = null;
                        HashSet hashSet = (HashSet) zfrVar.b;
                        b380 b380VarP = b380.p(hashSet);
                        hashSet.clear();
                        w280 w280VarR = b380VarP.r(0);
                        while (w280VarR.hasNext()) {
                            awr awrVar2 = (awr) w280VarR.next();
                            if (awrVar2.n()) {
                                awrVar2.j(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        zfrVar.s(e, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        awr awrVar3 = (awr) this.b;
        if (obj == awrVar3.y && awrVar3.k()) {
            awrVar3.y = null;
            synchronized (awrVar3.f14p) {
                dg90 dg90Var = awrVar3.z;
                dg90Var.getClass();
                twaVar = new twa();
                ((v280) dg90Var.b).g();
                awrVar3.z = null;
            }
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                awrVar3.m((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = ((hmh0) obj2).a;
                byte b = awrVar3.e;
                ao00 ao00Var = awrVar3.b;
                if (b == 3) {
                    byte[] bArr2 = awrVar3.x;
                    String str = zoi1.a;
                    ao00Var.o(bArr2, bArr);
                    k4n k4nVar = awrVar3.i;
                    synchronized (k4nVar.a) {
                        set2 = k4nVar.c;
                    }
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        ((b9v) it.next()).b();
                    }
                    return;
                }
                byte[] bArrO = ao00Var.o(awrVar3.w, bArr);
                byte b2 = awrVar3.e;
                if ((b2 == 2 || (b2 == 0 && awrVar3.x != null)) && bArrO != null && bArrO.length != 0) {
                    awrVar3.x = bArrO;
                }
                awrVar3.q = (byte) 4;
                k4n k4nVar2 = awrVar3.i;
                synchronized (k4nVar2.a) {
                    set = k4nVar2.c;
                }
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    ((b9v) it2.next()).a(twaVar);
                }
            } catch (Exception e2) {
                e = e2;
                awrVar3.m(e, true);
            } catch (NoSuchMethodError e3) {
                e = e3;
                awrVar3.m(e, true);
            }
        }
    }

    private final void b(Message message) {
        yxh0 yxh0Var;
        xxh0 xxh0Var;
        nj7 nj7Var;
        xxh0 xxh0Var2;
        if (message.what == 1) {
            synchronized (((xxh0) this.b).a) {
                yxh0Var = (yxh0) ((xxh0) this.b).d.get();
                xxh0Var = (xxh0) this.b;
                nj7Var = xxh0Var.e;
            }
            if (yxh0Var != null) {
                synchronized (yxh0Var.d) {
                    xxh0Var2 = yxh0Var.m;
                }
                if (xxh0Var != xxh0Var2 || nj7Var == null) {
                    return;
                }
                yxh0Var.d((f0i0) message.obj);
                ((xxh0) this.b).a(yxh0Var, nj7Var);
                yxh0Var.d((f0i0) null);
            }
        }
    }

    public void c(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    public void d() {
        this.b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        j2e0[] j2e0VarArr;
        mv2 mv2Var;
        int iK;
        String string;
        oj7 oj7Var = null;
        oj7Var = null;
        oj7Var = null;
        oj7Var = null;
        oj7Var = null;
        oj7Var = null;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                pj7 pj7Var = (pj7) this.b;
                int i = message.what;
                if (i == 1) {
                    oj7 oj7Var2 = (oj7) message.obj;
                    try {
                        pj7Var.a.queueInputBuffer(oj7Var2.a, 0, oj7Var2.b, oj7Var2.d, oj7Var2.e);
                        break;
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = pj7Var.d;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    oj7Var = oj7Var2;
                } else if (i == 2) {
                    oj7 oj7Var3 = (oj7) message.obj;
                    int i2 = oj7Var3.a;
                    MediaCodec.CryptoInfo cryptoInfo = oj7Var3.c;
                    long j = oj7Var3.d;
                    int i3 = oj7Var3.e;
                    try {
                        if (Build.VERSION.SDK_INT < 31) {
                            synchronized (pj7.h) {
                                pj7Var.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                            }
                        } else {
                            pj7Var.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                        }
                        break;
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference2 = pj7Var.d;
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                    oj7Var = oj7Var3;
                } else if (i == 3) {
                    pj7Var.e.f();
                } else if (i != 4) {
                    AtomicReference atomicReference3 = pj7Var.d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        pj7Var.a.setParameters((Bundle) message.obj);
                        break;
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = pj7Var.d;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (oj7Var != null) {
                    ArrayDeque arrayDeque = pj7.g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(oj7Var);
                        break;
                    }
                    return;
                }
                return;
            case 1:
                a(message);
                return;
            case 2:
                byte[] bArr = (byte[]) message.obj;
                if (bArr == null) {
                    return;
                }
                for (awr awrVar : ((cwr) this.b).m) {
                    awrVar.q();
                    if (Arrays.equals(awrVar.w, bArr)) {
                        if (message.what == 2 && awrVar.e == 0 && awrVar.q == 4) {
                            String str = zoi1.a;
                            awrVar.j(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 3:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                zce0 zce0Var = (zce0) this.b;
                while (true) {
                    synchronized (zce0Var.b) {
                        try {
                            size = zce0Var.d.size();
                            if (size <= 0) {
                                return;
                            }
                            j2e0VarArr = new j2e0[size];
                            zce0Var.d.toArray(j2e0VarArr);
                            zce0Var.d.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i4 = 0; i4 < size; i4++) {
                        j2e0 j2e0Var = j2e0VarArr[i4];
                        int size2 = ((ArrayList) j2e0Var.c).size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            yce0 yce0Var = (yce0) ((ArrayList) j2e0Var.c).get(i5);
                            if (!yce0Var.d) {
                                yce0Var.b.onReceive(zce0Var.a, (Intent) j2e0Var.b);
                            }
                        }
                    }
                }
                break;
            case 4:
                jih0 jih0Var = (jih0) this.b;
                if (jih0Var == null) {
                    removeCallbacksAndMessages(null);
                    return;
                }
                hod0 hod0Var = jih0Var.b;
                Bundle data = message.getData();
                switch (message.what) {
                    case 1:
                        Bundle bundle = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                        eyh0.b(bundle);
                        String string2 = data.getString(MediaBrowserProtocol.DATA_PACKAGE_NAME);
                        int i6 = data.getInt(MediaBrowserProtocol.DATA_CALLING_PID);
                        int i7 = data.getInt(MediaBrowserProtocol.DATA_CALLING_UID);
                        d4e0 d4e0Var = new d4e0(message.replyTo, (byte) 10);
                        jih0 jih0Var2 = (jih0) hod0Var.b;
                        if (string2 != null) {
                            for (String str2 : jih0Var2.getPackageManager().getPackagesForUid(i7)) {
                                if (str2.equals(string2)) {
                                    jih0Var2.e.c(new hih0(i6, i7, bundle, string2, hod0Var, d4e0Var));
                                    return;
                                }
                            }
                        }
                        hhg1.n(ab80.n("Package/uid mismatch: uid=", " package=", i7, string2));
                        return;
                    case 2:
                        ((jih0) hod0Var.b).e.c(new aih0(hod0Var, new d4e0(message.replyTo, (byte) 10), (byte) 1));
                        return;
                    case 3:
                        Bundle bundle2 = data.getBundle(MediaBrowserProtocol.DATA_OPTIONS);
                        eyh0.b(bundle2);
                        ((jih0) hod0Var.b).e.c(new n9m(hod0Var, new d4e0(message.replyTo, (byte) 10), data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getBinder(MediaBrowserProtocol.DATA_CALLBACK_TOKEN), bundle2, (byte) 3));
                        return;
                    case 4:
                        ((jih0) hod0Var.b).e.c(new hw9(hod0Var, new d4e0(message.replyTo, (byte) 10), data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getBinder(MediaBrowserProtocol.DATA_CALLBACK_TOKEN), (byte) 10));
                        return;
                    case 5:
                        String string3 = data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID);
                        ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER);
                        d4e0 d4e0Var2 = new d4e0(message.replyTo, (byte) 10);
                        hod0Var.getClass();
                        if (TextUtils.isEmpty(string3) || resultReceiver == null) {
                            return;
                        }
                        ((jih0) hod0Var.b).e.c(new hw9(hod0Var, d4e0Var2, string3, resultReceiver, (byte) 11));
                        return;
                    case 6:
                        Bundle bundle3 = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                        eyh0.b(bundle3);
                        ((jih0) hod0Var.b).e.c(new iih0(data.getInt(MediaBrowserProtocol.DATA_CALLING_UID), data.getInt(MediaBrowserProtocol.DATA_CALLING_PID), bundle3, data.getString(MediaBrowserProtocol.DATA_PACKAGE_NAME), hod0Var, new d4e0(message.replyTo, (byte) 10)));
                        return;
                    case 7:
                        ((jih0) hod0Var.b).e.c(new xwn1(hod0Var, new d4e0(message.replyTo, (byte) 10), objArr == true ? 1 : 0, (byte) 28));
                        return;
                    case 8:
                        Bundle bundle4 = data.getBundle(MediaBrowserProtocol.DATA_SEARCH_EXTRAS);
                        eyh0.b(bundle4);
                        String string4 = data.getString(MediaBrowserProtocol.DATA_SEARCH_QUERY);
                        ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER);
                        d4e0 d4e0Var3 = new d4e0(message.replyTo, (byte) 10);
                        hod0Var.getClass();
                        if (TextUtils.isEmpty(string4) || resultReceiver2 == null) {
                            return;
                        }
                        ((jih0) hod0Var.b).e.c(new n9m(hod0Var, d4e0Var3, string4, bundle4, resultReceiver2, (byte) 4));
                        return;
                    case 9:
                        Bundle bundle5 = data.getBundle(MediaBrowserProtocol.DATA_CUSTOM_ACTION_EXTRAS);
                        eyh0.b(bundle5);
                        String string5 = data.getString(MediaBrowserProtocol.DATA_CUSTOM_ACTION);
                        ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER);
                        d4e0 d4e0Var4 = new d4e0(message.replyTo, (byte) 10);
                        hod0Var.getClass();
                        if (TextUtils.isEmpty(string5) || resultReceiver3 == null) {
                            return;
                        }
                        ((jih0) hod0Var.b).e.c(new hw9(hod0Var, d4e0Var4, string5, bundle5, resultReceiver3));
                        return;
                    default:
                        message.toString();
                        return;
                }
            case 5:
                int i8 = message.what;
                int i9 = message.arg1;
                Object obj = message.obj;
                Bundle bundlePeekData = message.peekData();
                SparseArray sparseArray = ((xuh0) this.b).j;
                hwh0 hwh0Var = (hwh0) sparseArray.get(i9);
                if (hwh0Var == null) {
                    return;
                }
                sparseArray.remove(i9);
                if (i8 == 3) {
                    hwh0Var.b((Bundle) obj);
                    return;
                } else {
                    if (i8 != 4) {
                        return;
                    }
                    hwh0Var.a(bundlePeekData != null ? bundlePeekData.getString("error") : null, (Bundle) obj);
                    return;
                }
            case 6:
                rvh0 rvh0Var = (rvh0) this.b;
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return;
                    }
                    rvh0Var.f = false;
                    rvh0Var.f(rvh0Var.e);
                    return;
                }
                rvh0Var.h = false;
                jmo1 jmo1Var = rvh0Var.d;
                if (jmo1Var != null) {
                    jmo1Var.q(rvh0Var, rvh0Var.g);
                    return;
                }
                return;
            case 7:
                if (message.what == 1 && (iK = (mv2Var = ((zvh0) this.b).e).k((Messenger) message.obj)) >= 0) {
                    xvh0 xvh0Var = (xvh0) ((ArrayList) mv2Var.d).remove(iK);
                    mv2Var.t();
                    int i11 = zvh0.f;
                    xvh0Var.c();
                    return;
                }
                return;
            case 8:
                b(message);
                return;
            case 9:
                if (dhn.a.contains(this)) {
                    return;
                }
                try {
                    qq40 qq40Var = (qq40) this.b;
                    if (message.what == qq40Var.g) {
                        Bundle data2 = message.getData();
                        if (data2.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                            qq40Var.a(null);
                        } else {
                            qq40Var.a(data2);
                        }
                        try {
                            qq40Var.a.unbindService(qq40Var);
                            return;
                        } catch (IllegalArgumentException unused) {
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    dhn.a(this, th2);
                    return;
                }
            default:
                if (message.what != 3) {
                    message.toString();
                    super.handleMessage(message);
                    return;
                }
                Bundle data3 = message.getData();
                if (data3 == null || (string = data3.getString("SessionUpdateExtra")) == null) {
                    string = "";
                }
                fn31.T(smo1.e((o8n) this.b), null, 0, new b751(string, (lnm) null, (byte) 9), 3);
                return;
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        switch (this.a) {
            case 4:
                Bundle data = message.getData();
                data.setClassLoader(ohh0.class.getClassLoader());
                data.putInt(MediaBrowserProtocol.DATA_CALLING_UID, Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt(MediaBrowserProtocol.DATA_CALLING_PID, callingPid);
                } else if (!data.containsKey(MediaBrowserProtocol.DATA_CALLING_PID)) {
                    data.putInt(MediaBrowserProtocol.DATA_CALLING_PID, -1);
                }
                break;
        }
        return super.sendMessageAtTime(message, j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nj7(Object obj, Looper looper, byte b) {
        super(looper);
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ nj7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public nj7(jih0 jih0Var) {
        this.a = (byte) 4;
        this.b = jih0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj7(xuh0 xuh0Var) {
        super(Looper.getMainLooper());
        this.a = (byte) 5;
        this.b = xuh0Var;
    }
}
