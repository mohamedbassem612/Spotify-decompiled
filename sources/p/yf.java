package p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcel;
import android.view.MenuItem;
import com.google.protobuf.h;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class yf {
    public Object a;
    public Object b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yf(byte b) {
        this("unknown", (Object) null);
        switch (b) {
            case 4:
                break;
            default:
                this.b = new int[2];
                break;
        }
    }

    public static void p(yf yfVar, shl shlVar, float f, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        yfVar.o(shlVar, f, (i & 4) == 0 ? 12.0f : 0.0f);
    }

    public void c() {
        jlb jlbVar = (jlb) this.a;
        if (jlbVar != null) {
            try {
                ((yj5) this.b).X.unregisterReceiver(jlbVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public h d(Parcel parcel) {
        if (parcel.readInt() == 0) {
            return null;
        }
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        return (h) ((iu30) this.a).invoke(bArr);
    }

    public abstract IntentFilter e();

    public abstract int[] f(int i);

    public msg g() {
        return (msg) this.b;
    }

    public Intent getIntent() {
        return (Intent) this.b;
    }

    public Bundle h() {
        return (Bundle) this.b;
    }

    public abstract List i();

    public MenuItem j(MenuItem menuItem) {
        if (!(menuItem instanceof e1d1)) {
            return menuItem;
        }
        e1d1 e1d1Var = (e1d1) menuItem;
        jv81 jv81Var = (jv81) this.b;
        if (jv81Var == null) {
            jv81Var = new jv81(0);
            this.b = jv81Var;
        }
        MenuItem menuItem2 = (MenuItem) jv81Var.get(e1d1Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        dti0 dti0Var = new dti0((Context) this.a, e1d1Var);
        ((jv81) this.b).put(e1d1Var, dti0Var);
        return dti0Var;
    }

    public String k() {
        return (String) this.a;
    }

    public int[] l(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String m() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        u890.C("text");
        throw null;
    }

    public String n() {
        return (String) this.a;
    }

    public void o(shl shlVar, float f, float f2) {
        boolean z = shlVar.b;
        String str = "top";
        if (z && z) {
            str = "bottom";
        }
        yhc yhcVar = new yhc(new char[0]);
        yhcVar.n(gic.n(shlVar.a.toString()));
        yhcVar.n(gic.n(str));
        yhcVar.n(new cic(f));
        yhcVar.n(new cic(f2));
        ((eic) this.b).I((String) this.a, yhcVar);
    }

    public abstract void q();

    public abstract int[] r(int i);

    public void s() {
        c();
        IntentFilter intentFilterE = e();
        if (intentFilterE.countActions() == 0) {
            return;
        }
        jlb jlbVar = (jlb) this.a;
        if (jlbVar == null) {
            jlbVar = new jlb(this, (byte) 2);
            this.a = jlbVar;
        }
        ((yj5) this.b).X.registerReceiver(jlbVar, intentFilterE);
    }

    public String t() {
        return "Unknown";
    }

    public void u(h hVar, Parcel parcel) {
        if (hVar == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        byte[] bArr = (byte[]) ((iu30) this.b).invoke(hVar);
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
    }

    public /* synthetic */ yf(kgx kgxVar, hw61 hw61Var) {
        this((Object) kgxVar, (Object) hw61Var);
    }

    public yf(String str) {
        hya hyaVar = w571.a;
        this.a = str;
        this.b = hyaVar;
    }

    public yf(Context context) {
        this.a = context;
    }

    public /* synthetic */ yf(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public yf(int i, eic eicVar) {
        this.b = eicVar;
        String str = "top";
        if (i != 0 && i == 1) {
            str = "bottom";
        }
        this.a = str;
    }

    public yf(yj5 yj5Var) {
        this.b = yj5Var;
    }
}
