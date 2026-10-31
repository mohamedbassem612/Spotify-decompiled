package p;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.util.ArrayMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u7y extends Binder implements sg70 {
    public final /* synthetic */ mv2 a;

    public u7y(mv2 mv2Var) {
        this.a = mv2Var;
        attachInterface(this, sg70.d);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = sg70.d;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = parcel.readInt() | 2;
        mv2 mv2Var = this.a;
        synchronized (mv2Var.a) {
            Integer num = (Integer) mv2Var.f;
            if (num != null && num.intValue() == i3) {
                return true;
            }
            mv2Var.f = Integer.valueOf(i3);
            for (Map.Entry entry : new ArrayMap((ArrayMap) mv2Var.e).entrySet()) {
                ((Executor) entry.getValue()).execute(new xu7((Consumer) entry.getKey(), i3, (byte) 4));
            }
            return true;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
