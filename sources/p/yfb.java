package p;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yfb implements zj, u1o0, hgb {
    public final a84 a;
    public final o4o0 b;
    public final Observable c;
    public final q8n d;
    public final bpb1 e;
    public final bpb1 f;
    public c9n g;

    public yfb(a84 a84Var, o4o0 o4o0Var, Observable observable, q8n q8nVar) {
        this.a = a84Var;
        this.b = o4o0Var;
        this.c = observable;
        this.d = q8nVar;
        bpb1 bpb1VarB = gio1.b(z6x.a);
        this.e = bpb1VarB;
        this.f = bpb1VarB;
        this.g = cy30.t(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static qi f(BluetoothDevice bluetoothDevice) {
        String name;
        String strValueOf;
        List listX;
        String name2 = bluetoothDevice.getName();
        if (Build.VERSION.SDK_INT >= 30) {
            name = bluetoothDevice.getAlias();
            if (TextUtils.isEmpty(name)) {
                name = bluetoothDevice.getName();
            }
        } else {
            name = bluetoothDevice.getName();
        }
        String str = name;
        cn70 cn70Var = cn70.b;
        cn70 cn70VarD = cua.d(ak.c, bluetoothDevice.getAddress());
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        if (bluetoothClass == null || (strValueOf = String.valueOf(bluetoothClass.getDeviceClass())) == null) {
            strValueOf = "1024";
        }
        String str2 = strValueOf;
        ParcelUuid[] uuids = bluetoothDevice.getUuids();
        if (uuids != null) {
            for (ParcelUuid parcelUuid : uuids) {
                UUID uuid = parcelUuid.getUuid();
                hi.a.getClass();
                if (u890.j(uuid, bi.b)) {
                    listX = k4p1.x("spotify-tap");
                }
            }
            listX = z6x.a;
        } else {
            listX = z6x.a;
        }
        return new qi(name2, str, str2, 3, listX, null, null, cn70VarD, 96);
    }

    @Override // p.zj
    public final void a() {
        smo1.q(this.g);
    }

    @Override // p.zj
    public final void b() {
        c9n c9nVarV = qmo1.v(this.g, new q30(this, (byte) 24));
        this.g = c9nVarV;
        c921.y(c9nVarV, (o8n) null, 0, new zx0(this, null, (byte) 2), 3);
    }

    @Override // p.hgb
    public final void c(Context context, BluetoothDevice bluetoothDevice) {
        c921.y(this.g, (o8n) null, 0, new vfb(this, bluetoothDevice, (lnm) null, (byte) 0), 3);
    }

    @Override // p.zj
    public final mr20 d() {
        return this.f;
    }

    @Override // p.hgb
    public final void e(BluetoothDevice bluetoothDevice) {
        c921.y(this.g, (o8n) null, 0, new vfb(this, bluetoothDevice, (lnm) null, (byte) 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object g(onm onmVar) {
        ufb ufbVar;
        bpb1 bpb1Var = this.e;
        if (onmVar instanceof ufb) {
            ufbVar = (ufb) onmVar;
            int i = ufbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ufbVar.c = i - Integer.MIN_VALUE;
            } else {
                ufbVar = new ufb(this, onmVar);
            }
        } else {
            ufbVar = new ufb(this, onmVar);
        }
        Object objA = ufbVar.a;
        int i2 = ufbVar.c;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                a84 a84Var = this.a;
                BluetoothAdapter bluetoothAdapter = a84Var.a;
                o4o0 o4o0Var = this.b;
                if (bluetoothAdapter == null || !o4o0Var.a()) {
                    o4o0Var.a();
                    return rih1Var;
                }
                ufbVar.c = 1;
                objA = a84Var.a(ufbVar);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            Iterable iterable = (Iterable) objA;
            ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(f(((zfb) it.next()).a()));
            }
            arrayList.toString();
            Objects.toString((List) bpb1Var.getValue());
            Objects.toString(arrayList);
            bpb1Var.m((Object) null, arrayList);
            return rih1Var;
        } catch (Exception e) {
            Logger.e(e, "Error fetching bluetooth devices", new Object[0]);
            return rih1Var;
        }
    }

    public final void h(g4o0 g4o0Var) {
        g4o0Var.toString();
        if (g4o0Var != g4o0.c) {
            c9n c9nVarV = qmo1.v(this.g, new vv8(this, (byte) 22));
            this.g = c9nVarV;
            c921.y(c9nVarV, (o8n) null, 0, new wfb(this, (lnm) null, (byte) 0), 3);
        }
    }
}
