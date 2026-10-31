package p;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.WindowInsetsAnimation;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class frl1 implements l381, Function, vy11, gon1, i2q0, ebn1 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public frl1(byte b) {
        this.a = b;
        switch (b) {
            case 13:
                this.c = new frl1((byte) 22);
                break;
            case 22:
                this.c = b380.m();
                break;
            case 23:
                frl1 frl1Var = fcp1.b;
                this.b = new fqn1((fqn1) frl1Var.b);
                this.c = Arrays.copyOf((long[]) frl1Var.c, 10);
                break;
            case 24:
                break;
            default:
                this.b = Collections.synchronizedMap(new WeakHashMap());
                this.c = Collections.synchronizedMap(new WeakHashMap());
                break;
        }
    }

    public static frl1 f(WindowInsetsAnimation.Bounds bounds) {
        return new frl1(bounds);
    }

    public h190 a() {
        return new h190(o4p1.r(new m441(new ukl1(this, (lnm) null, (byte) 2)), (q8n) this.c), (byte) 1);
    }

    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 12:
                IBinder l9n1Var = new l9n1((o9n1) this.b, (bsd1) obj2);
                y8n1 y8n1VarN = ((x9n1) obj).n();
                fi5 fi5Var = (fi5) this.c;
                Parcel parcelS = y8n1VarN.s();
                int i = p8n1.a;
                parcelS.writeStrongBinder(l9n1Var);
                p8n1.b(parcelS, fi5Var);
                parcelS.writeStrongBinder(null);
                y8n1VarN.B0(2, parcelS);
                break;
            case 15:
                sjn1 sjn1Var = new sjn1((non1) this.b, (bsd1) obj2, (byte) 0);
                ngn1 ngn1VarN = ((cfn1) obj).n();
                cjn1 cjn1Var = (cjn1) this.c;
                Parcel parcelA1 = ngn1VarN.a1();
                osn1.c(parcelA1, sjn1Var);
                osn1.c(parcelA1, cjn1Var);
                ngn1VarN.c1(1, parcelA1);
                break;
            default:
                kho1 kho1Var = new kho1((xjn1) this.b, (bsd1) obj2);
                xdo1 xdo1VarN = ((dqo1) obj).n();
                eno1 eno1Var = new eno1(kho1Var, (byte) 2);
                String str = (String) this.c;
                Parcel parcelA2 = xdo1VarN.a1();
                zsn1.c(parcelA2, eno1Var);
                parcelA2.writeString(str);
                xdo1VarN.Z0(63, parcelA2);
                break;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 6:
                List list = (List) obj;
                if (list.isEmpty()) {
                    return b7x.a;
                }
                hmm0 hmm0Var = (hmm0) this.b;
                String str = hmm0Var.e.a;
                r87 r87Var = hmm0Var.d;
                int i = r87Var.e;
                ivd ivdVar = new ivd(list, true, (el51) null, w7x.a, r87Var);
                ivd ivdVarN = ivdVar.n((List) this.c);
                if ((2 & 1) == 0) {
                    ivdVar = ivdVarN;
                }
                if ((2 & 2) == 0) {
                    i = 0;
                }
                return Collections.singletonMap(str, new ejr0(ivdVar, i));
            case 7:
                d1t d1tVar = (d1t) ((cik1) this.b).c;
                p7c0 p7c0Var = (p7c0) this.c;
                int i2 = p7c0Var.a;
                return (svc0) d1tVar.invoke((YourLibraryResponse) obj, new ivm1(new of20(p7c0Var.k, p7c0Var.l), Integer.valueOf(i2), p7c0Var.j));
            default:
                return new z310(((yut0) this.b).c((YourLibraryResponse) obj, (r9c) this.c), (f410) null, (m510) null, (String) null);
        }
    }

    public o3r b() {
        switch (this.a) {
            case 1:
                break;
        }
        return (o3r) this.b;
    }

    public frl1 c(nk80 nk80Var) {
        nk80 nk80Var2 = (nk80) this.b;
        int i = nk80Var.a;
        int i2 = nk80Var.b;
        int i3 = nk80Var.c;
        int i4 = nk80Var.d;
        return new frl1((Object) hsl1.e(nk80Var2, i, i2, i3, i4), (Object) hsl1.e((nk80) this.c, i, i2, i3, i4), (byte) 0);
    }

    public void d(Bitmap bitmap) {
        zxl1 zxl1Var = (zxl1) this.b;
        zxl1Var.c = bitmap;
        evo1 evo1Var = (evo1) this.c;
        evo1Var.l = zxl1Var;
        evo1Var.a();
    }

    public WindowInsetsAnimation.Bounds e() {
        k34.g();
        return k34.d(((nk80) this.b).e(), ((nk80) this.c).e());
    }

    public void g(long j, long j2, long j3, String str) {
        gon1 gon1Var = (gon1) this.b;
        if (gon1Var != null) {
            gon1Var.g(j, j2, j3, str);
        }
    }

    public void h(String str, long j, int i, Object obj, long j2, long j3) {
        ((knn1) this.c).g = null;
        gon1 gon1Var = (gon1) this.b;
        if (gon1Var != null) {
            gon1Var.h(str, j, i, obj, j2, j3);
        }
    }

    public void i(BasePendingResult basePendingResult, boolean z) {
        ((Map) this.b).put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.b(new w9n1(this, basePendingResult));
    }

    public void j(bsd1 bsd1Var, boolean z) {
        ((Map) this.c).put(bsd1Var, Boolean.valueOf(z));
        bsd1Var.a.b(new zxl1(this, bsd1Var));
    }

    public boolean k() {
        return (((Map) this.b).isEmpty() && ((Map) this.c).isEmpty()) ? false : true;
    }

    public void l() {
        n(false, pz40.P0);
    }

    public void m(int i, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        n(true, new Status(20, sb.toString(), (PendingIntent) null, (lal) null));
    }

    public void n(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.b;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.c;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).e(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((bsd1) entry2.getKey()).c(new ApiException(status));
            }
        }
    }

    public void o(dwh0 dwh0Var, krn1 krn1Var) {
        owh0 owh0VarD = (owh0) this.c;
        if (owh0VarD == null) {
            owh0VarD = owh0.d((Context) this.b);
            this.c = owh0VarD;
        }
        owh0VarD.a(dwh0Var, krn1Var, 4);
    }

    public void onComplete(Task task) {
        rzo1 rzo1Var = (rzo1) this.b;
        bsd1 bsd1Var = (bsd1) this.c;
        synchronized (rzo1Var.f) {
            rzo1Var.e.remove(bsd1Var);
        }
    }

    public void p(fwh0 fwh0Var) {
        owh0 owh0VarD = (owh0) this.c;
        if (owh0VarD == null) {
            owh0VarD = owh0.d((Context) this.b);
            this.c = owh0VarD;
        }
        owh0VarD.e(fwh0Var);
    }

    public boolean t(Object obj) {
        switch (this.a) {
            case 1:
                qpj1 qpj1Var = ((mzl1) this.c).c;
                return ((xyl1) qpj1Var.c).a(((qxc0) obj).X);
            default:
                qpj1 qpj1Var2 = ((k5m1) this.c).b;
                return ((xyl1) qpj1Var2.c).a(((i5m1) obj).a.X);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Bounds{lower=" + ((nk80) this.b) + " upper=" + ((nk80) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ frl1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public frl1(iua iuaVar, ArrayList arrayList) {
        this.a = (byte) 17;
        this.b = arrayList;
        this.c = iuaVar;
    }

    public /* synthetic */ frl1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public frl1(IBinder iBinder) throws RemoteException {
        this.a = (byte) 21;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.c = new uxn1(iBinder);
            this.b = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            if (strValueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(strValueOf);
            }
            throw new RemoteException();
        }
    }

    public frl1(knn1 knn1Var, gon1 gon1Var) {
        this.a = (byte) 14;
        this.b = gon1Var;
        Objects.requireNonNull(knn1Var);
        this.c = knn1Var;
    }

    public frl1(evo1 evo1Var, zxl1 zxl1Var) {
        this.a = (byte) 20;
        this.b = zxl1Var;
        Objects.requireNonNull(evo1Var);
        this.c = evo1Var;
    }

    public frl1(rok0 rok0Var, r2n1 r2n1Var, q8n q8nVar) {
        this.a = (byte) 10;
        this.b = rok0Var;
        this.c = q8nVar;
    }

    public frl1(mzl1 mzl1Var) {
        this.a = (byte) 1;
        this.c = mzl1Var;
        this.b = mzl1Var.f;
    }

    public frl1(k5m1 k5m1Var) {
        this.a = (byte) 2;
        this.c = k5m1Var;
        this.b = k5m1Var.e;
    }

    public frl1(WindowInsetsAnimation.Bounds bounds) {
        this.a = (byte) 0;
        this.b = krl1.g(bounds);
        this.c = krl1.f(bounds);
    }
}
