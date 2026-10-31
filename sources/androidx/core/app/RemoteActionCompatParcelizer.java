package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p.f5j1;
import p.g5j1;
import p.h5j1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(f5j1 f5j1Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        h5j1 h5j1VarH = remoteActionCompat.a;
        boolean z = true;
        if (f5j1Var.e(1)) {
            h5j1VarH = f5j1Var.h();
        }
        remoteActionCompat.a = (IconCompat) h5j1VarH;
        CharSequence charSequence = remoteActionCompat.b;
        if (f5j1Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((g5j1) f5j1Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (f5j1Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((g5j1) f5j1Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) f5j1Var.g(4, remoteActionCompat.d);
        boolean z2 = remoteActionCompat.e;
        if (f5j1Var.e(5)) {
            z2 = ((g5j1) f5j1Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!f5j1Var.e(6)) {
            z = z3;
        } else if (((g5j1) f5j1Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, f5j1 f5j1Var) {
        f5j1Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        f5j1Var.i(1);
        f5j1Var.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        f5j1Var.i(2);
        Parcel parcel = ((g5j1) f5j1Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        f5j1Var.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        f5j1Var.k(4, remoteActionCompat.d);
        boolean z = remoteActionCompat.e;
        f5j1Var.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        f5j1Var.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
