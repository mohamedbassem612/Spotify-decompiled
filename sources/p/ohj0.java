package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ohj0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ohj0(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iD = 0;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return phj0.a;
            case 1:
                parcel.readInt();
                return qhj0.a;
            case 2:
                parcel.readInt();
                return rhj0.a;
            case 3:
                MessageResponseToken parcelable = parcel.readParcelable(uhj0.class.getClassLoader());
                iwq iwqVar = (iwq) (parcel.readInt() == 0 ? null : iwq.CREATOR.createFromParcel(parcel));
                boolean z = false;
                String string = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                yhj0 parcelable2 = parcel.readParcelable(r2.getClassLoader());
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new uhj0(parcelable, iwqVar, string, z2, z, parcelable2, z, parcel.readParcelable(r2.getClassLoader()), parcel.readBundle(uhj0.class.getClassLoader()));
            case 4:
                return new vhj0(parcel.readString());
            case 5:
                parcel.readInt();
                return whj0.a;
            case 6:
                parcel.readInt();
                return xhj0.a;
            case 7:
                return new erj0(brj0.valueOf(parcel.readString()));
            case 8:
                return new grj0(parcel.readInt() != 0);
            case 9:
                parcel.readInt();
                return ysj0.a;
            case 10:
                parcel.readInt();
                return new vxj0();
            case 11:
                return new lyj0(parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 12:
                return new c0k0(parcel.readString(), parcel.readString(), (bt31) parcel.readParcelable(c0k0.class.getClassLoader()), (bt31) parcel.readParcelable(c0k0.class.getClassLoader()), parcel.readString(), parcel.readString(), (dbk0) dbk0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 13:
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iD != i) {
                    iD = dsl0.d(fy00.CREATOR, parcel, arrayList, iD, 1);
                }
                return new s5k0(arrayList, parcel.readString(), (gub1) parcel.readParcelable(s5k0.class.getClassLoader()));
            case 14:
                return new x5k0(parcel.readString(), parcel.readString());
            case 15:
                parcel.readInt();
                return x8k0.a;
            case 16:
                parcel.readInt();
                return y8k0.a;
            case 17:
                parcel.readInt();
                return z8k0.a;
            case 18:
                parcel.readInt();
                return b9k0.a;
            case 19:
                return new c9k0(parcel.readString());
            case 20:
                return new l9k0(parcel.readString(), (a9k0) parcel.readParcelable(l9k0.class.getClassLoader()));
            case 21:
                parcel.readInt();
                return m9k0.a;
            case 22:
                parcel.readInt();
                return n9k0.a;
            case 23:
                parcel.readInt();
                return p9k0.a;
            case 24:
                parcel.readInt();
                return q9k0.a;
            case 25:
                parcel.readInt();
                return r9k0.a;
            case 26:
                parcel.readInt();
                return s9k0.a;
            case 27:
                parcel.readInt();
                return t9k0.a;
            case 28:
                parcel.readInt();
                return u9k0.a;
            default:
                parcel.readInt();
                return v9k0.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new phj0[i];
            case 1:
                return new qhj0[i];
            case 2:
                return new rhj0[i];
            case 3:
                return new uhj0[i];
            case 4:
                return new vhj0[i];
            case 5:
                return new whj0[i];
            case 6:
                return new xhj0[i];
            case 7:
                return new erj0[i];
            case 8:
                return new grj0[i];
            case 9:
                return new ysj0[i];
            case 10:
                return new vxj0[i];
            case 11:
                return new lyj0[i];
            case 12:
                return new c0k0[i];
            case 13:
                return new s5k0[i];
            case 14:
                return new x5k0[i];
            case 15:
                return new x8k0[i];
            case 16:
                return new y8k0[i];
            case 17:
                return new z8k0[i];
            case 18:
                return new b9k0[i];
            case 19:
                return new c9k0[i];
            case 20:
                return new l9k0[i];
            case 21:
                return new m9k0[i];
            case 22:
                return new n9k0[i];
            case 23:
                return new p9k0[i];
            case 24:
                return new q9k0[i];
            case 25:
                return new r9k0[i];
            case 26:
                return new s9k0[i];
            case 27:
                return new t9k0[i];
            case 28:
                return new u9k0[i];
            default:
                return new v9k0[i];
        }
    }
}
