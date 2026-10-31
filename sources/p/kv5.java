package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import com.spotify.base.java.logging.Logger;
import com.spotify.interapp.service.service.AppProtocolRemoteService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kv5 extends Handler {
    public final /* synthetic */ byte a = 0;
    public final WeakReference b;

    public kv5(aij0 aij0Var) {
        this.b = new WeakReference(aij0Var);
    }

    public void a() {
        this.b.clear();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:144:0x027a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0107  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        xvh0 xvh0VarM;
        nvh0 nvh0VarD;
        nvh0 nvh0VarD2;
        xvh0 xvh0VarM2;
        nvh0 nvh0VarD3;
        xvh0 xvh0VarM3;
        nvh0 nvh0VarD4;
        nvh0 nvh0VarD5;
        Bundle bundle;
        mvh0 mvh0VarA;
        xvh0 xvh0VarM4;
        xvh0 xvh0VarM5;
        xvh0 xvh0VarM6;
        String[] packagesForUid;
        kvh0 kvh0Var;
        jf11 jf11Var;
        nvh0 nvh0Var;
        kv40 kv40Var;
        byte b = this.a;
        ef11 string = null;
        WeakReference weakReference = this.b;
        switch (b) {
            case 0:
                AppProtocolRemoteService appProtocolRemoteService = (AppProtocolRemoteService) weakReference.get();
                if (appProtocolRemoteService != null) {
                    int i2 = AppProtocolRemoteService.f1;
                    if (message.replyTo == null) {
                        appProtocolRemoteService.stopSelf();
                        Logger.d("No remote Messenger to reply to", new Object[0]);
                    } else if (appProtocolRemoteService.a1 != null) {
                        appProtocolRemoteService.a(message);
                    } else {
                        appProtocolRemoteService.Z0.add(Message.obtain(message));
                    }
                }
                break;
            case 1:
                Messenger messenger = message.replyTo;
                if (mmo1.I(messenger)) {
                    int i3 = message.what;
                    int i4 = message.arg1;
                    int i5 = message.arg2;
                    Object obj = message.obj;
                    Bundle bundlePeekData = message.peekData();
                    String str = (i3 != 1 || (packagesForUid = ((zvh0) weakReference.get()).getPackageManager().getPackagesForUid(message.sendingUid)) == null || packagesForUid.length <= 0) ? null : packagesForUid[0];
                    zvh0 zvh0Var = (zvh0) weakReference.get();
                    if (zvh0Var != null) {
                        mv2 mv2Var = zvh0Var.e;
                        switch (i3) {
                            case 1:
                                i = i4;
                                if (i5 < 1) {
                                    mv2Var.getClass();
                                } else if (mv2Var.k(messenger) < 0) {
                                    xvh0 xvh0VarI = mv2Var.i(messenger, i5, str);
                                    try {
                                        xvh0VarI.a.getBinder().linkToDeath(xvh0VarI, 0);
                                        ((ArrayList) mv2Var.d).add(xvh0VarI);
                                        mv2Var.t();
                                        int i6 = zvh0.f;
                                        if (i != 0) {
                                            zvh0.d(messenger, 2, i, 3, zvh0.a(mv2Var.j(((rvh0) ((zvh0) mv2Var.c).d).g, xvh0VarI.c), xvh0VarI.b), (Bundle) null);
                                        }
                                    } catch (RemoteException unused) {
                                        xvh0VarI.binderDied();
                                    }
                                }
                                break;
                            case 2:
                                i = i4;
                                int iK = mv2Var.k(messenger);
                                if (iK >= 0) {
                                    xvh0 xvh0Var = (xvh0) ((ArrayList) mv2Var.d).remove(iK);
                                    mv2Var.t();
                                    int i7 = zvh0.f;
                                    xvh0Var.c();
                                    zvh0.c(messenger, i);
                                }
                                break;
                            case 3:
                                i = i4;
                                String string2 = bundlePeekData.getString("routeId");
                                String string3 = bundlePeekData.getString("routeGroupId");
                                Bundle bundle2 = (Bundle) bundlePeekData.getParcelable("routeControllerOptions");
                                ovh0 ovh0Var = bundle2 != null ? new ovh0(bundle2) : ovh0.b;
                                if (string2 != null && (xvh0VarM = mv2Var.m(messenger)) != null) {
                                    d4e0 d4e0Var = new d4e0(ovh0Var);
                                    d4e0Var.p(xvh0VarM.c);
                                    if (xvh0VarM.b(string2, string3, d4e0Var.d(), i5)) {
                                        zvh0.c(messenger, i);
                                    }
                                }
                                break;
                            case 4:
                                i = i4;
                                xvh0 xvh0VarM7 = mv2Var.m(messenger);
                                if (xvh0VarM7 != null && xvh0VarM7.e(i5)) {
                                    zvh0.c(messenger, i);
                                }
                                break;
                            case 5:
                                i = i4;
                                xvh0 xvh0VarM8 = mv2Var.m(messenger);
                                if (xvh0VarM8 != null && (nvh0VarD = xvh0VarM8.d(i5)) != null) {
                                    nvh0VarD.f();
                                    zvh0.c(messenger, i);
                                }
                                break;
                            case 6:
                                i = i4;
                                i = bundlePeekData != null ? bundlePeekData.getInt("unselectReason", 0) : 0;
                                xvh0 xvh0VarM9 = mv2Var.m(messenger);
                                if (xvh0VarM9 != null && (nvh0VarD2 = xvh0VarM9.d(i5)) != null) {
                                    nvh0VarD2.i(i);
                                    zvh0.c(messenger, i);
                                }
                                break;
                            case 7:
                                i = i4;
                                int i8 = bundlePeekData.getInt("volume", -1);
                                if (i8 >= 0 && (xvh0VarM2 = mv2Var.m(messenger)) != null && (nvh0VarD3 = xvh0VarM2.d(i5)) != null) {
                                    nvh0VarD3.g(i8);
                                    zvh0.c(messenger, i);
                                }
                                break;
                            case 8:
                                i = i4;
                                int i9 = bundlePeekData.getInt("volume", 0);
                                if (i9 != 0 && (xvh0VarM3 = mv2Var.m(messenger)) != null && (nvh0VarD4 = xvh0VarM3.d(i5)) != null) {
                                    nvh0VarD4.j(i9);
                                    zvh0.c(messenger, i);
                                }
                                break;
                            case 9:
                                i = i4;
                                if (obj instanceof Intent) {
                                    Intent intent = (Intent) obj;
                                    xvh0 xvh0VarM10 = mv2Var.m(messenger);
                                    if (xvh0VarM10 != null && (nvh0VarD5 = xvh0VarM10.d(i5)) != null) {
                                        if (nvh0VarD5.d(intent, i != 0 ? new wvh0(mv2Var, messenger, i) : null)) {
                                            int i10 = zvh0.f;
                                        }
                                    }
                                }
                                break;
                            case 10:
                                i = i4;
                                if (obj == null || (obj instanceof Bundle)) {
                                    Bundle bundle3 = (Bundle) obj;
                                    ef11 hvh0Var = bundle3 != null ? new hvh0(bundle3) : null;
                                    if (hvh0Var != null && hvh0Var.c()) {
                                        string = hvh0Var;
                                    }
                                    xvh0 xvh0VarM11 = mv2Var.m(messenger);
                                    if (xvh0VarM11 != null) {
                                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                                        if (!Objects.equals(xvh0VarM11.d, string)) {
                                            xvh0VarM11.d = string;
                                            xvh0VarM11.e = jElapsedRealtime;
                                            xvh0VarM11.h.A();
                                        }
                                        zvh0.c(messenger, i);
                                    }
                                }
                                break;
                            case 11:
                                String string4 = bundlePeekData.getString("memberRouteId");
                                Bundle bundle4 = (Bundle) bundlePeekData.getParcelable("routeControllerOptions");
                                ovh0 ovh0Var2 = bundle4 != null ? new ovh0(bundle4) : ovh0.b;
                                if (string4 != null) {
                                    xvh0 xvh0VarM12 = mv2Var.m(messenger);
                                    if (xvh0VarM12 != null) {
                                        d4e0 d4e0Var2 = new d4e0(ovh0Var2);
                                        d4e0Var2.p(xvh0VarM12.c);
                                        d4e0Var2.d();
                                        zvh0 zvh0Var2 = (zvh0) xvh0VarM12.h.c;
                                        SparseArray sparseArray = xvh0VarM12.f;
                                        if (sparseArray.indexOfKey(i5) >= 0 || (mvh0VarA = zvh0Var2.d.a(string4)) == null) {
                                            bundle = null;
                                        } else {
                                            mvh0VarA.o(x74.N(zvh0Var2.getApplicationContext()), xvh0VarM12.g);
                                            sparseArray.put(i5, mvh0VarA);
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putString("groupableTitle", null);
                                            bundle5.putString("transferableTitle", null);
                                            bundle = bundle5;
                                        }
                                        if (bundle != null) {
                                            zvh0.d(messenger, 6, i4, 3, bundle, (Bundle) null);
                                        }
                                    }
                                    i = i4;
                                } else {
                                    i = i4;
                                }
                                break;
                            case 12:
                                String string5 = bundlePeekData.getString("memberRouteId");
                                if (string5 != null && (xvh0VarM4 = mv2Var.m(messenger)) != null) {
                                    mvh0 mvh0VarD = xvh0VarM4.d(i5);
                                    if (mvh0VarD instanceof mvh0) {
                                        mvh0VarD.l(string5);
                                        zvh0.c(messenger, i4);
                                    }
                                }
                                i = i4;
                                break;
                            case 13:
                                String string6 = bundlePeekData.getString("memberRouteId");
                                if (string6 != null && (xvh0VarM5 = mv2Var.m(messenger)) != null) {
                                    mvh0 mvh0VarD2 = xvh0VarM5.d(i5);
                                    if (mvh0VarD2 instanceof mvh0) {
                                        mvh0VarD2.m(string6);
                                        zvh0.c(messenger, i4);
                                    }
                                }
                                i = i4;
                                break;
                            case 14:
                                ArrayList<String> stringArrayList = bundlePeekData.getStringArrayList("memberRouteIds");
                                if (stringArrayList != null && (xvh0VarM6 = mv2Var.m(messenger)) != null) {
                                    mvh0 mvh0VarD3 = xvh0VarM6.d(i5);
                                    if (mvh0VarD3 instanceof mvh0) {
                                        mvh0VarD3.n(stringArrayList);
                                        zvh0.c(messenger, i4);
                                    }
                                }
                                i = i4;
                                break;
                            default:
                                i = i4;
                                break;
                        }
                    } else {
                        i = i4;
                    }
                    int i11 = zvh0.f;
                    if (i != 0) {
                        zvh0.d(messenger, 0, i, 0, (Bundle) null, (Bundle) null);
                    }
                } else {
                    int i12 = zvh0.f;
                }
                break;
            case 2:
                aij0 aij0Var = (aij0) weakReference.get();
                if (aij0Var != null) {
                    byte[] byteArray = message.getData().getByteArray("MESSAGE_BODY");
                    s24 s24Var = aij0Var.c;
                    if (s24Var != null) {
                        int length = byteArray.length;
                        ((ExecutorService) s24Var.d).execute(new qub1(s24Var, byteArray, (byte) 18));
                    }
                }
                break;
            default:
                df11 df11Var = (df11) weakReference.get();
                if (df11Var != null) {
                    SparseArray sparseArray2 = df11Var.h;
                    if11 if11Var = df11Var.i;
                    ArrayList<ef11> arrayList = if11Var.X;
                    int i13 = message.what;
                    int i14 = message.arg1;
                    int i15 = message.arg2;
                    Object obj2 = message.obj;
                    Bundle bundlePeekData2 = message.peekData();
                    switch (i13) {
                        case 0:
                            if (i14 == df11Var.g) {
                                df11Var.g = 0;
                                if (if11Var.N0 == df11Var) {
                                    if11Var.l();
                                }
                            }
                            hwh0 hwh0Var = (hwh0) sparseArray2.get(i14);
                            if (hwh0Var != null) {
                                sparseArray2.remove(i14);
                                hwh0Var.a((String) null, (Bundle) null);
                            }
                            break;
                        case 2:
                            if (obj2 == null || (obj2 instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj2;
                                if (df11Var.f == 0 && i14 == df11Var.g && i15 >= 1) {
                                    df11Var.g = 0;
                                    df11Var.f = i15;
                                    jqd0 jqd0VarP = jqd0.p(bundle6);
                                    if (if11Var.N0 == df11Var) {
                                        if11Var.g(jqd0VarP);
                                    }
                                    if (if11Var.N0 == df11Var) {
                                        if11Var.O0 = true;
                                        int size = arrayList.size();
                                        for (int i16 = 0; i16 < size; i16++) {
                                            ((ef11) arrayList.get(i16)).c(if11Var.N0);
                                        }
                                        hvh0 hvh0Var2 = ((rvh0) if11Var).e;
                                        if (hvh0Var2 != null) {
                                            df11 df11Var2 = if11Var.N0;
                                            int i17 = df11Var2.d;
                                            df11Var2.d = i17 + 1;
                                            df11Var2.b(10, i17, 0, hvh0Var2.a, (Bundle) null);
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            if (obj2 == null || (obj2 instanceof Bundle)) {
                                Bundle bundle7 = (Bundle) obj2;
                                hwh0 hwh0Var2 = (hwh0) sparseArray2.get(i14);
                                if (hwh0Var2 != null) {
                                    sparseArray2.remove(i14);
                                    hwh0Var2.b(bundle7);
                                }
                            }
                            break;
                        case 4:
                            if (obj2 == null || (obj2 instanceof Bundle)) {
                                string = bundlePeekData2 != null ? bundlePeekData2.getString("error") : null;
                                Bundle bundle8 = (Bundle) obj2;
                                hwh0 hwh0Var3 = (hwh0) sparseArray2.get(i14);
                                if (hwh0Var3 != null) {
                                    sparseArray2.remove(i14);
                                    hwh0Var3.a(string, bundle8);
                                }
                            }
                            break;
                        case 5:
                            if (obj2 == null || (obj2 instanceof Bundle)) {
                                Bundle bundle9 = (Bundle) obj2;
                                if (df11Var.f != 0) {
                                    jqd0 jqd0VarP2 = jqd0.p(bundle9);
                                    if (if11Var.N0 == df11Var) {
                                        if11Var.g(jqd0VarP2);
                                    }
                                }
                            }
                            break;
                        case 6:
                            if (obj2 instanceof Bundle) {
                                Bundle bundle10 = (Bundle) obj2;
                                hwh0 hwh0Var4 = (hwh0) sparseArray2.get(i14);
                                if (bundle10.containsKey("routeId")) {
                                    sparseArray2.remove(i14);
                                    hwh0Var4.b(bundle10);
                                } else {
                                    hwh0Var4.a("DynamicGroupRouteController is created without valid route id.", bundle10);
                                }
                            }
                            break;
                        case 7:
                            if (obj2 == null || (obj2 instanceof Bundle)) {
                                Bundle bundle11 = (Bundle) obj2;
                                if (df11Var.f != 0) {
                                    Bundle bundle12 = (Bundle) bundle11.getParcelable("groupRoute");
                                    gvh0 gvh0Var = bundle12 != null ? new gvh0((String) null, bundle12, Collections.EMPTY_LIST) : null;
                                    ArrayList<Bundle> parcelableArrayList = bundle11.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Bundle bundle13 : parcelableArrayList) {
                                        if (bundle13 == null) {
                                            kvh0Var = null;
                                        } else {
                                            Bundle bundle14 = bundle13.getBundle("mrDescriptor");
                                            kvh0Var = new kvh0(bundle14 != null ? new gvh0((String) null, bundle14, Collections.EMPTY_LIST) : null, bundle13.getInt("selectionState", 1), bundle13.getBoolean("isUnselectable", false), bundle13.getBoolean("isGroupable", false), bundle13.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(kvh0Var);
                                    }
                                    if (if11Var.N0 == df11Var) {
                                        for (ef11 ef11Var : arrayList) {
                                            if (ef11Var.a() == i15) {
                                                string = ef11Var;
                                                if (string instanceof gf11) {
                                                    ((gf11) string).k(gvh0Var, arrayList2);
                                                }
                                                break;
                                            }
                                        }
                                        if (string instanceof gf11) {
                                            ((gf11) string).k(gvh0Var, arrayList2);
                                        }
                                    }
                                }
                            }
                            break;
                        case 8:
                            if (if11Var.N0 == df11Var) {
                                for (ef11 ef11Var2 : arrayList) {
                                    if (ef11Var2.a() == i15) {
                                        string = ef11Var2;
                                        jf11Var = if11Var.P0;
                                        if (jf11Var != null && (string instanceof nvh0)) {
                                            nvh0Var = (nvh0) string;
                                            kv40Var = (kv40) ((h9d0) jf11Var.b).d;
                                            if (kv40Var.e == nvh0Var) {
                                                kv40Var.k(kv40Var.c(), 2, 3, true);
                                            }
                                        }
                                        if (string != null) {
                                            arrayList.remove(string);
                                            string.b();
                                            if11Var.m();
                                        }
                                        break;
                                    }
                                }
                                jf11Var = if11Var.P0;
                                if (jf11Var != null) {
                                    nvh0Var = (nvh0) string;
                                    kv40Var = (kv40) ((h9d0) jf11Var.b).d;
                                    if (kv40Var.e == nvh0Var) {
                                        kv40Var.k(kv40Var.c(), 2, 3, true);
                                    }
                                }
                                if (string != null) {
                                    arrayList.remove(string);
                                    string.b();
                                    if11Var.m();
                                }
                            }
                            break;
                    }
                    int i18 = if11.Q0;
                }
                break;
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        switch (this.a) {
            case 0:
                message.arg1 = message.sendingUid;
                break;
        }
        return super.sendMessageAtTime(message, j);
    }

    public kv5(AppProtocolRemoteService appProtocolRemoteService) {
        this.b = new WeakReference(appProtocolRemoteService);
    }

    public kv5(zvh0 zvh0Var) {
        this.b = new WeakReference(zvh0Var);
    }

    public kv5(df11 df11Var) {
        this.b = new WeakReference(df11Var);
    }
}
