package androidx.car.app.hardware.common;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.HostException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.hardware.ICarHardwareResult;
import androidx.car.app.utils.f;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p.a2q0;
import p.frd;
import p.ny2;
import p.rrd;
import p.tcc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class CarResultStub<T> extends ICarHardwareResult.Stub {
    private final tcc mBundle;
    private final frd mHostDispatcher;
    private final boolean mIsSingleShot;
    private final Map<a2q0, Executor> mListeners = new HashMap();
    private final int mResultType;
    private final T mUnsupportedValue;

    public CarResultStub(int i, tcc tccVar, boolean z, T t, frd frdVar) {
        Objects.requireNonNull(frdVar);
        this.mHostDispatcher = frdVar;
        this.mResultType = i;
        this.mBundle = tccVar;
        this.mIsSingleShot = z;
        Objects.requireNonNull(t);
        this.mUnsupportedValue = t;
    }

    private T convertAndRecast(tcc tccVar) {
        return (T) tccVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyResults$1(Map.Entry entry, Object obj) {
        entry.getKey().getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onCarHardwareResult$0(boolean z, tcc tccVar) {
        notifyResults(z, tccVar);
        return null;
    }

    private void notifyResults(boolean z, tcc tccVar) {
        T tConvertAndRecast = z ? convertAndRecast(tccVar) : this.mUnsupportedValue;
        for (Map.Entry<a2q0, Executor> entry : this.mListeners.entrySet()) {
            entry.getValue().execute(new ny2((Object) entry, (Object) tConvertAndRecast, (byte) 27));
        }
        if (this.mIsSingleShot) {
            this.mListeners.clear();
        }
    }

    public void addListener(Executor executor, a2q0 a2q0Var) {
        this.mListeners.isEmpty();
        Objects.requireNonNull(a2q0Var);
        throw new ClassCastException();
    }

    @Override // androidx.car.app.hardware.ICarHardwareResult
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.hardware.ICarHardwareResult
    public void onCarHardwareResult(int i, boolean z, tcc tccVar, IBinder iBinder) {
        f.b(IOnDoneCallback.Stub.asInterface(iBinder), "onCarHardwareResult", new rrd(this, z, tccVar));
    }

    public boolean removeListener(a2q0 a2q0Var) {
        Map<a2q0, Executor> map = this.mListeners;
        Objects.requireNonNull(a2q0Var);
        map.remove(a2q0Var);
        if (!this.mListeners.isEmpty()) {
            return false;
        }
        if (this.mIsSingleShot) {
            return true;
        }
        frd frdVar = this.mHostDispatcher;
        int i = this.mResultType;
        tcc tccVar = this.mBundle;
        frdVar.getClass();
        try {
            try {
                Log.isLoggable("CarApp", 3);
                frdVar.a().unsubscribeCarHardwareResult(i, tccVar);
                return true;
            } catch (SecurityException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw new HostException("Remote unsubscribeCarHardwareResult call failed", e2);
            }
        } catch (RemoteException unused) {
            return true;
        }
    }
}
