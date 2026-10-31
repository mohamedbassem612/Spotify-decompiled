package p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class y9n1 implements IInterface {
    public final /* synthetic */ byte a;
    public final IBinder l;
    public final String m;

    public /* synthetic */ y9n1(IBinder iBinder, String str, byte b) {
        this.a = b;
        this.l = iBinder;
        this.m = str;
    }

    public void B0(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.l.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel X0(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.l.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public Parcel Y0(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.l.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public void Z0(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.l.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel a1() {
        byte b = this.a;
        String str = this.m;
        switch (b) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(str);
                return parcelObtain;
            case 2:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(str);
                return parcelObtain2;
            case 3:
                Parcel parcelObtain3 = Parcel.obtain();
                parcelObtain3.writeInterfaceToken(str);
                return parcelObtain3;
            case 4:
                Parcel parcelObtain4 = Parcel.obtain();
                parcelObtain4.writeInterfaceToken(str);
                return parcelObtain4;
            default:
                Parcel parcelObtain5 = Parcel.obtain();
                parcelObtain5.writeInterfaceToken(str);
                return parcelObtain5;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        byte b = this.a;
        return this.l;
    }

    public Parcel b1(int i, Parcel parcel) {
        byte b = this.a;
        IBinder iBinder = this.l;
        switch (b) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, parcelObtain, 0);
                        parcelObtain.readException();
                        parcel.recycle();
                        return parcelObtain;
                    } catch (RuntimeException e) {
                        parcelObtain.recycle();
                        throw e;
                    }
                } catch (Throwable th) {
                    parcel.recycle();
                    throw th;
                }
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    try {
                        iBinder.transact(i, parcel, parcelObtain2, 0);
                        parcelObtain2.readException();
                        parcel.recycle();
                        return parcelObtain2;
                    } catch (RuntimeException e2) {
                        parcelObtain2.recycle();
                        throw e2;
                    }
                } catch (Throwable th2) {
                    parcel.recycle();
                    throw th2;
                }
        }
    }

    public void c1(int i, Parcel parcel) {
        byte b = this.a;
        IBinder iBinder = this.l;
        switch (b) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain.recycle();
                }
            case 2:
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain2.recycle();
                }
            case 3:
                Parcel parcelObtain3 = Parcel.obtain();
                try {
                    iBinder.transact(i, parcel, parcelObtain3, 0);
                    parcelObtain3.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain3.recycle();
                }
        }
    }

    public void d1(int i, Parcel parcel) {
        try {
            this.l.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel e1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.m);
        return parcelObtain;
    }

    public Parcel f1(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.l.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public Parcel s() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.m);
        return parcelObtain;
    }
}
