package p;

import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gqn1 extends mh70 {
    public final eg61 l;
    public final Class m;

    public gqn1(eg61 eg61Var) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", (byte) 3);
        this.l = eg61Var;
        this.m = b4e.class;
    }

    public final boolean Y0(int i, Parcel parcel, Parcel parcel2) {
        Class cls = this.m;
        eg61 eg61Var = this.l;
        switch (i) {
            case 1:
                qfp0 qfp0Var = new qfp0(eg61Var);
                parcel2.writeNoException();
                osn1.c(parcel2, qfp0Var);
                return true;
            case 2:
                vh70 vh70VarB1 = qfp0.b1(parcel.readStrongBinder());
                osn1.d(parcel);
                ca61 ca61Var = (ca61) qfp0.c1(vh70VarB1);
                if (cls.isInstance(ca61Var) && eg61Var != null) {
                    eg61Var.b((ca61) cls.cast(ca61Var));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                vh70 vh70VarB2 = qfp0.b1(parcel.readStrongBinder());
                String string = parcel.readString();
                osn1.d(parcel);
                ca61 ca61Var2 = (ca61) qfp0.c1(vh70VarB2);
                if (cls.isInstance(ca61Var2) && eg61Var != null) {
                    eg61Var.h((ca61) cls.cast(ca61Var2), string);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                vh70 vh70VarB3 = qfp0.b1(parcel.readStrongBinder());
                int i2 = parcel.readInt();
                osn1.d(parcel);
                ca61 ca61Var3 = (ca61) qfp0.c1(vh70VarB3);
                if (cls.isInstance(ca61Var3) && eg61Var != null) {
                    eg61Var.c((ca61) cls.cast(ca61Var3), i2);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                vh70 vh70VarB4 = qfp0.b1(parcel.readStrongBinder());
                osn1.d(parcel);
                ca61 ca61Var4 = (ca61) qfp0.c1(vh70VarB4);
                if (cls.isInstance(ca61Var4) && eg61Var != null) {
                    eg61Var.d((ca61) cls.cast(ca61Var4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                vh70 vh70VarB5 = qfp0.b1(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                osn1.d(parcel);
                ca61 ca61Var5 = (ca61) qfp0.c1(vh70VarB5);
                if (cls.isInstance(ca61Var5) && eg61Var != null) {
                    eg61Var.a((ca61) cls.cast(ca61Var5), i3);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                vh70 vh70VarB6 = qfp0.b1(parcel.readStrongBinder());
                String string2 = parcel.readString();
                osn1.d(parcel);
                ca61 ca61Var6 = (ca61) qfp0.c1(vh70VarB6);
                if (cls.isInstance(ca61Var6) && eg61Var != null) {
                    eg61Var.e((ca61) cls.cast(ca61Var6), string2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                vh70 vh70VarB7 = qfp0.b1(parcel.readStrongBinder());
                int i4 = osn1.a;
                boolean z = parcel.readInt() != 0;
                osn1.d(parcel);
                ca61 ca61Var7 = (ca61) qfp0.c1(vh70VarB7);
                if (cls.isInstance(ca61Var7) && eg61Var != null) {
                    eg61Var.f((ca61) cls.cast(ca61Var7), z);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                vh70 vh70VarB8 = qfp0.b1(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                osn1.d(parcel);
                ca61 ca61Var8 = (ca61) qfp0.c1(vh70VarB8);
                if (cls.isInstance(ca61Var8) && eg61Var != null) {
                    eg61Var.g((ca61) cls.cast(ca61Var8), i5);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                vh70 vh70VarB9 = qfp0.b1(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                osn1.d(parcel);
                ca61 ca61Var9 = (ca61) qfp0.c1(vh70VarB9);
                if (cls.isInstance(ca61Var9) && eg61Var != null) {
                    eg61Var.i((ca61) cls.cast(ca61Var9), i6);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            default:
                return false;
        }
    }
}
