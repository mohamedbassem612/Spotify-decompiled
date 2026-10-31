package p;

import android.os.Parcel;
import android.os.RemoteException;
import app.p000rive.semantics.SemanticState;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class flx0 implements AutoCloseable {
    public static final ykb0 d = new ykb0();
    public final g2z a;
    public final vj70 b;
    public final Map c = Collections.synchronizedMap(new LinkedHashMap());

    public flx0(g2z g2zVar, vj70 vj70Var) {
        this.a = g2zVar;
        this.b = vj70Var;
    }

    public final void a() {
        tj70 tj70Var = this.b;
        tj70Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(vj70.j);
            parcelObtain.writeInt(SemanticState.Focused);
            if (!tj70Var.a.transact(3, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method addWindowFlags is unimplemented.");
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.z();
    }
}
