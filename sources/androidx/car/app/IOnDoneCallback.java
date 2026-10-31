package androidx.car.app;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p.tcc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface IOnDoneCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$IOnDoneCallback".replace('$', '.');
    public static final int VERSION = 1;

    public static abstract class Stub extends Binder implements IOnDoneCallback {
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_onFailure = 3;
        static final int TRANSACTION_onSuccess = 2;

        public static final class Proxy implements IOnDoneCallback {
            private int mCachedVersion = -1;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public final String getInterfaceDescriptor() {
                return IOnDoneCallback.DESCRIPTOR;
            }

            @Override // androidx.car.app.IOnDoneCallback
            public int getInterfaceVersion() {
                if (this.mCachedVersion == -1) {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(IOnDoneCallback.DESCRIPTOR);
                        this.mRemote.transact(Stub.TRANSACTION_getInterfaceVersion, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        this.mCachedVersion = parcelObtain2.readInt();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }
                return this.mCachedVersion;
            }

            @Override // androidx.car.app.IOnDoneCallback
            public void onFailure(tcc tccVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOnDoneCallback.DESCRIPTOR);
                    parcelObtain.writeTypedObject(tccVar, 0);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method onFailure is unimplemented.");
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

            @Override // androidx.car.app.IOnDoneCallback
            public void onSuccess(tcc tccVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IOnDoneCallback.DESCRIPTOR);
                    parcelObtain.writeTypedObject(tccVar, 0);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0)) {
                        throw new RemoteException("Method onSuccess is unimplemented.");
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
        }

        public Stub() {
            attachInterface(this, IOnDoneCallback.DESCRIPTOR);
        }

        public static IOnDoneCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IOnDoneCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IOnDoneCallback)) ? new Proxy(iBinder) : (IOnDoneCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= TRANSACTION_getInterfaceVersion) {
                parcel.enforceInterface(IOnDoneCallback.DESCRIPTOR);
            }
            if (i == TRANSACTION_getInterfaceVersion) {
                parcel2.writeNoException();
                parcel2.writeInt(getInterfaceVersion());
                return true;
            }
            if (i == 2) {
                onSuccess((tcc) parcel.readTypedObject(tcc.CREATOR));
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onFailure((tcc) parcel.readTypedObject(tcc.CREATOR));
                parcel2.writeNoException();
            }
            return true;
        }
    }

    int getInterfaceVersion();

    void onFailure(tcc tccVar);

    void onSuccess(tcc tccVar);

    public static class Default implements IOnDoneCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.IOnDoneCallback
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.IOnDoneCallback
        public void onFailure(tcc tccVar) {
        }

        @Override // androidx.car.app.IOnDoneCallback
        public void onSuccess(tcc tccVar) {
        }
    }
}
