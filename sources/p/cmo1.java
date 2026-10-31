package p;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class cmo1 extends mh70 implements IInterface {
    public final int l;

    public cmo1(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", (byte) 4);
        zod.k(bArr.length == 25);
        this.l = Arrays.hashCode(bArr);
    }

    public static byte[] c1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            eg.f(e);
            return null;
        }
    }

    public final boolean Y0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            qfp0 qfp0Var = new qfp0(b1());
            parcel2.writeNoException();
            psn1.b(parcel2, qfp0Var);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.l);
        return true;
    }

    public abstract byte[] b1();

    public final boolean equals(Object obj) {
        if (!(obj instanceof cmo1)) {
            return false;
        }
        try {
            cmo1 cmo1Var = (cmo1) obj;
            if (cmo1Var.l != this.l) {
                return false;
            }
            return Arrays.equals(b1(), (byte[]) qfp0.c1(new qfp0(cmo1Var.b1())));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.l;
    }
}
