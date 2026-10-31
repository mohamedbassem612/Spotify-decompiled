package p;

import android.os.Parcel;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class mgn1 extends mh70 {
    public mgn1() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", (byte) 3);
    }

    public final boolean Y0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                int i2 = parcel.readInt();
                osn1.d(parcel);
                b1(i2);
                return true;
            case 2:
                yz5 yz5Var = (yz5) osn1.a(parcel, yz5.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                osn1.d(parcel);
                e1(yz5Var, string, string2, z);
                return true;
            case 3:
                int i3 = parcel.readInt();
                osn1.d(parcel);
                f1(i3);
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                int i4 = osn1.a;
                parcel.readInt();
                osn1.d(parcel);
                j1();
                return true;
            case 5:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                osn1.d(parcel);
                m1(string3, string4);
                return true;
            case 6:
                String string5 = parcel.readString();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                osn1.d(parcel);
                n1(string5, bArrCreateByteArray);
                return true;
            case 7:
                int i5 = parcel.readInt();
                osn1.d(parcel);
                h1(i5);
                return true;
            case 8:
                int i6 = parcel.readInt();
                osn1.d(parcel);
                g1(i6);
                return true;
            case 9:
                int i7 = parcel.readInt();
                osn1.d(parcel);
                i1(i7);
                return true;
            case 10:
                parcel.readString();
                long j = parcel.readLong();
                int i8 = parcel.readInt();
                osn1.d(parcel);
                o1(i8, j);
                return true;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                parcel.readString();
                long j2 = parcel.readLong();
                osn1.d(parcel);
                p1(j2);
                return true;
            case grn1.d /* 12 */:
                fbn1 fbn1Var = (fbn1) osn1.a(parcel, fbn1.CREATOR);
                osn1.d(parcel);
                l1(fbn1Var);
                return true;
            case 13:
                jdn1 jdn1Var = (jdn1) osn1.a(parcel, jdn1.CREATOR);
                osn1.d(parcel);
                k1(jdn1Var);
                return true;
            case 14:
                int i9 = parcel.readInt();
                osn1.d(parcel);
                c1(i9);
                return true;
            case 15:
                int i10 = parcel.readInt();
                osn1.d(parcel);
                d1(i10);
                return true;
            default:
                return false;
        }
    }

    public abstract void b1(int i);

    public abstract void e1(yz5 yz5Var, String str, String str2, boolean z);

    public abstract void f1(int i);

    public abstract void g1(int i);

    public abstract void h1(int i);

    public abstract void i1(int i);

    public void j1() {
        arn1.H.a("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    public abstract void k1(jdn1 jdn1Var);

    public abstract void l1(fbn1 fbn1Var);

    public abstract void m1(String str, String str2);

    public void n1(String str, byte[] bArr) {
        pue0 pue0Var = arn1.H;
        arn1.H.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[]{str, Integer.valueOf(bArr.length)});
    }

    public abstract void o1(int i, long j);

    public abstract void p1(long j);

    public void c1(int i) {
    }

    public void d1(int i) {
    }
}
