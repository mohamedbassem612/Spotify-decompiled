package p;

import android.app.Notification;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rno0 {
    public final String a;
    public final int b;
    public final Notification c;

    public rno0(String str, int i, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = notification;
    }

    public final void a(sh70 sh70Var) {
        String str = this.a;
        int i = this.b;
        Notification notification = this.c;
        qh70 qh70Var = (qh70) sh70Var;
        qh70Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(sh70.h);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(null);
            parcelObtain.writeTypedObject(notification, 0);
            if (!qh70Var.a.transact(1, parcelObtain, null, 1)) {
                throw new RemoteException("Method notify is unimplemented.");
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        return gvg.j(sb, this.b, ", tag:null]");
    }
}
