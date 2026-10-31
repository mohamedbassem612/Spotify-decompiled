package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aw91 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ byte a;

    public static bw91 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = aw91.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new bw91();
        }
        ers0 ers0VarF = gg91.b.f();
        for (int i2 = 0; i2 < i; i2++) {
            ers0VarF.add(parcel.readValue(classLoader));
        }
        return new bw91(ers0VarF.d());
    }

    public static hw91 b(Parcel parcel, ClassLoader classLoader) {
        hw91 hw91Var = new hw91();
        if (classLoader == null) {
            classLoader = hw91.class.getClassLoader();
        }
        int i = parcel.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            hw91Var.add(parcel.readValue(classLoader));
        }
        return hw91Var;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new saa(parcel, null);
            case 2:
                return new pvb(parcel, (ClassLoader) null);
            case 3:
                return new gvf(parcel, (ClassLoader) null);
            case 4:
                return new i3n(parcel, null);
            case 5:
                return new fes(parcel, ges.class.getClassLoader());
            case 6:
                return new k8v(parcel, null);
            case 7:
                return new zcx(parcel, null);
            case 8:
                return new odx(parcel, (ClassLoader) null);
            case 9:
                return new ivx(parcel, (ClassLoader) null);
            case 10:
                return new nwx(parcel, (ClassLoader) null);
            case 11:
                return new yf30(parcel, null);
            case 12:
                return new sbh0(parcel, null);
            case 13:
                return new p611(parcel, null);
            case 14:
                return new nc51(parcel, null);
            case 15:
                return new al51(parcel, (ClassLoader) null);
            case 16:
                return b(parcel, null);
            case 17:
                return new y8e1(parcel, (ClassLoader) null);
            case 18:
                return new z1f1(parcel, null);
            case 19:
                return new qdk1(parcel, null);
            default:
                xdk1 xdk1Var = new xdk1(parcel, null);
                xdk1Var.a = parcel.readInt();
                xdk1Var.b = parcel.readInt();
                xdk1Var.c = parcel.readParcelable(null);
                return xdk1Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new bw91[i];
            case 1:
                return new saa[i];
            case 2:
                return new pvb[i];
            case 3:
                return new gvf[i];
            case 4:
                return new i3n[i];
            case 5:
                return new fes[i];
            case 6:
                return new k8v[i];
            case 7:
                return new zcx[i];
            case 8:
                return new odx[i];
            case 9:
                return new ivx[i];
            case 10:
                return new nwx[i];
            case 11:
                return new yf30[i];
            case 12:
                return new sbh0[i];
            case 13:
                return new p611[i];
            case 14:
                return new nc51[i];
            case 15:
                return new al51[i];
            case 16:
                return new hw91[i];
            case 17:
                return new y8e1[i];
            case 18:
                return new z1f1[i];
            case 19:
                return new qdk1[i];
            default:
                return new xdk1[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new saa(parcel, classLoader);
            case 2:
                return new pvb(parcel, classLoader);
            case 3:
                return new gvf(parcel, classLoader);
            case 4:
                return new i3n(parcel, classLoader);
            case 5:
                return new fes(parcel, classLoader);
            case 6:
                return new k8v(parcel, classLoader);
            case 7:
                return new zcx(parcel, classLoader);
            case 8:
                return new odx(parcel, classLoader);
            case 9:
                return new ivx(parcel, classLoader);
            case 10:
                return new nwx(parcel, classLoader);
            case 11:
                return new yf30(parcel, classLoader);
            case 12:
                return new sbh0(parcel, classLoader);
            case 13:
                return new p611(parcel, classLoader);
            case 14:
                return new nc51(parcel, classLoader);
            case 15:
                return new al51(parcel, classLoader);
            case 16:
                return b(parcel, classLoader);
            case 17:
                return new y8e1(parcel, classLoader);
            case 18:
                return new z1f1(parcel, classLoader);
            case 19:
                return new qdk1(parcel, classLoader);
            default:
                xdk1 xdk1Var = new xdk1(parcel, classLoader);
                xdk1Var.a = parcel.readInt();
                xdk1Var.b = parcel.readInt();
                xdk1Var.c = parcel.readParcelable(classLoader);
                return xdk1Var;
        }
    }
}
