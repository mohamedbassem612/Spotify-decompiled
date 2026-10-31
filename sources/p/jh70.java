package p;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Surface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class jh70 extends Binder implements kh70 {
    public static final /* synthetic */ int a = 0;

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        byte b = 1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSession");
            return true;
        }
        boolean z = false;
        switch (i) {
            case 3002:
                ((h2i0) this).d(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3003:
                ((h2i0) this).n(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3004:
                ((h2i0) this).D(xlh0.s(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3005:
                ((h2i0) this).K0(xlh0.s(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3006:
                ((h2i0) this).e0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3007:
                ((h2i0) this).v(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), (Bundle) tyo1.q(parcel, Bundle.CREATOR), true);
                return true;
            case 3008:
                ((h2i0) this).g(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), (Bundle) tyo1.q(parcel, Bundle.CREATOR), parcel.readLong());
                return true;
            case 3009:
                ((h2i0) this).v(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), (Bundle) tyo1.q(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3010:
                ((h2i0) this).H0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), true);
                return true;
            case 3011:
                ((h2i0) this).H0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                return true;
            case 3012:
                ((h2i0) this).M0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                return true;
            case 3013:
                ((h2i0) this).U(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3014:
                ((h2i0) this).U0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), (Bundle) tyo1.q(parcel, Bundle.CREATOR));
                return true;
            case 3015:
                ((h2i0) this).c0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), (Bundle) tyo1.q(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                eh70 eh70VarS = xlh0.s(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                ((h2i0) this).R0(eh70VarS, i3, (Bundle) tyo1.q(parcel, creator), (Bundle) tyo1.q(parcel, creator), false);
                return true;
            case 3017:
                ((h2i0) this).d0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3018:
                ((h2i0) this).J0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3019:
                ((h2i0) this).F0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3020:
                ((h2i0) this).G0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3021:
                ((h2i0) this).h(xlh0.s(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3022:
                ((h2i0) this).q(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3023:
                ((h2i0) this).b0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3024:
                ((h2i0) this).E0(xlh0.s(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3025:
                ((h2i0) this).p(xlh0.s(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3026:
                ((h2i0) this).L0(xlh0.s(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3027:
                ((h2i0) this).M(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), (Bundle) tyo1.q(parcel, Bundle.CREATOR));
                return true;
            case 3028:
                ((h2i0) this).S0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                return true;
            case 3029:
                eh70 eh70VarS2 = xlh0.s(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                Bundle bundle = (Bundle) tyo1.q(parcel, Bundle.CREATOR);
                h2i0 h2i0Var = (h2i0) this;
                if (eh70VarS2 != null && bundle != null) {
                    h2i0Var.X0(eh70VarS2, i4, 20, new w1i0(new x8a0(new vlh0(bundle, (byte) 4), new czh0((byte) 15), (byte) 20), b));
                }
                return true;
            case 3030:
                ((h2i0) this).C0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) tyo1.q(parcel, Bundle.CREATOR));
                return true;
            case 3031:
                ((h2i0) this).P0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3032:
                ((h2i0) this).E(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3033:
                ((h2i0) this).I(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), (Bundle) tyo1.q(parcel, Bundle.CREATOR));
                return true;
            case 3034:
                ((h2i0) this).u0(xlh0.s(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3035:
                ((h2i0) this).i(xlh0.s(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3036:
                ((h2i0) this).k(xlh0.s(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3037:
                ((h2i0) this).X(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3038:
                ((h2i0) this).V0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                return true;
            case 3039:
                ((h2i0) this).P(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                return true;
            case 3040:
                ((h2i0) this).F(xlh0.s(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3041:
                ((h2i0) this).C(xlh0.s(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3042:
                ((h2i0) this).m(xlh0.s(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3043:
                ((h2i0) this).N(xlh0.s(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3044:
                ((h2i0) this).w0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), (Surface) tyo1.q(parcel, Surface.CREATOR));
                return true;
            case 3045:
                ((h2i0) this).r(xlh0.s(parcel.readStrongBinder()));
                return true;
            case 3046:
                ((h2i0) this).J(xlh0.s(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3047:
                ((h2i0) this).y(xlh0.s(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3048:
                ((h2i0) this).K(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), (Bundle) tyo1.q(parcel, Bundle.CREATOR));
                return true;
            case 3049:
                eh70 eh70VarS3 = xlh0.s(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                String string = parcel.readString();
                Bundle bundle2 = (Bundle) tyo1.q(parcel, Bundle.CREATOR);
                h2i0 h2i0Var2 = (h2i0) this;
                if (eh70VarS3 != null && string != null && bundle2 != null) {
                    if (TextUtils.isEmpty(string)) {
                        oon1.H("setRatingWithMediaId(): Ignoring empty mediaId");
                    } else {
                        try {
                            h2i0Var2.Z0(eh70VarS3, i5, null, 40010, new w1i0(new j1i0(string, esz0.a(bundle2)), b));
                        } catch (RuntimeException e) {
                            oon1.I("Ignoring malformed Bundle for Rating", e);
                        }
                    }
                }
                return true;
            case 3050:
                eh70 eh70VarS4 = xlh0.s(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                Bundle bundle3 = (Bundle) tyo1.q(parcel, Bundle.CREATOR);
                h2i0 h2i0Var3 = (h2i0) this;
                if (eh70VarS4 != null && bundle3 != null) {
                    try {
                        h2i0Var3.Z0(eh70VarS4, i6, null, 40010, new w1i0(new j1i0(esz0.a(bundle3)), b));
                    } catch (RuntimeException e2) {
                        oon1.I("Ignoring malformed Bundle for Rating", e2);
                    }
                }
                return true;
            case 3051:
                ((h2i0) this).n0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 3052:
                ((h2i0) this).j0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3053:
                ((h2i0) this).g0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                return true;
            case 3054:
                ((h2i0) this).j(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
                return true;
            case 3055:
                ((h2i0) this).l(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) tyo1.q(parcel, Bundle.CREATOR));
                return true;
            case 3056:
                ((h2i0) this).a0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                return true;
            case 3057:
                ((h2i0) this).f(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), (Bundle) tyo1.q(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                return true;
            case 3058:
                ((h2i0) this).w(xlh0.s(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3059:
                ((h2i0) this).O(xlh0.s(parcel.readStrongBinder()), parcel.readInt());
                return true;
            case 3060:
                eh70 eh70VarS5 = xlh0.s(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                ((h2i0) this).R0(eh70VarS5, i7, (Bundle) tyo1.q(parcel, creator2), (Bundle) tyo1.q(parcel, creator2), parcel.readInt() != 0);
                return true;
            case 3061:
                ((h2i0) this).B(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), (Surface) tyo1.q(parcel, Surface.CREATOR), parcel.readInt(), parcel.readInt());
                return true;
            case 3062:
                ((h2i0) this).y0(xlh0.s(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            default:
                iph0 iph0VarA = null;
                switch (i) {
                    case 4001:
                        eh70 eh70VarS6 = xlh0.s(parcel.readStrongBinder());
                        int i8 = parcel.readInt();
                        Bundle bundle4 = (Bundle) tyo1.q(parcel, Bundle.CREATOR);
                        h2i0 h2i0Var4 = (h2i0) this;
                        if (eh70VarS6 != null) {
                            if (bundle4 != null) {
                                try {
                                    iph0VarA = iph0.a(bundle4);
                                } catch (RuntimeException e3) {
                                    oon1.I("Ignoring malformed Bundle for LibraryParams", e3);
                                }
                            }
                            h2i0Var4.Z0(eh70VarS6, i8, null, 50000, new w1i0(new c8d0(iph0VarA, (byte) 23), z ? (byte) 1 : (byte) 0));
                            break;
                        }
                        return true;
                    case 4002:
                        eh70 eh70VarS7 = xlh0.s(parcel.readStrongBinder());
                        int i9 = parcel.readInt();
                        String string2 = parcel.readString();
                        h2i0 h2i0Var5 = (h2i0) this;
                        if (eh70VarS7 != null) {
                            if (TextUtils.isEmpty(string2)) {
                                oon1.H("getItem(): Ignoring empty mediaId");
                                return true;
                            }
                            h2i0Var5.Z0(eh70VarS7, i9, null, 50004, new w1i0(new czh0(string2, (byte) 11), z ? (byte) 1 : (byte) 0));
                            return true;
                        }
                        return true;
                    case 4003:
                        eh70 eh70VarS8 = xlh0.s(parcel.readStrongBinder());
                        int i10 = parcel.readInt();
                        final String string3 = parcel.readString();
                        final int i11 = parcel.readInt();
                        final int i12 = parcel.readInt();
                        Bundle bundle5 = (Bundle) tyo1.q(parcel, Bundle.CREATOR);
                        h2i0 h2i0Var6 = (h2i0) this;
                        if (eh70VarS8 != null) {
                            if (TextUtils.isEmpty(string3)) {
                                oon1.H("getChildren(): Ignoring empty parentId");
                            } else if (i11 < 0) {
                                oon1.H("getChildren(): Ignoring negative page");
                            } else if (i12 < 1) {
                                oon1.H("getChildren(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle5 != null) {
                                    try {
                                        iph0VarA = iph0.a(bundle5);
                                    } catch (RuntimeException e4) {
                                        oon1.I("Ignoring malformed Bundle for LibraryParams", e4);
                                    }
                                }
                                final iph0 iph0Var = iph0VarA;
                                final byte b2 = 0;
                                h2i0Var6.Z0(eh70VarS8, i10, null, 50003, new w1i0(new e2i0() { // from class: p.k1i0
                                    public final Object i(fzh0 fzh0Var, ixh0 ixh0Var, int i13) {
                                        switch (b2) {
                                            case 0:
                                                return ((iqh0) fzh0Var).F(ixh0Var, string3, i11, i12, iph0Var);
                                            default:
                                                return ((iqh0) fzh0Var).I(ixh0Var, string3, i11, i12, iph0Var);
                                        }
                                    }
                                }, z ? (byte) 1 : (byte) 0));
                            }
                            break;
                        }
                        return true;
                    case 4004:
                        eh70 eh70VarS9 = xlh0.s(parcel.readStrongBinder());
                        int i13 = parcel.readInt();
                        String string4 = parcel.readString();
                        Bundle bundle6 = (Bundle) tyo1.q(parcel, Bundle.CREATOR);
                        h2i0 h2i0Var7 = (h2i0) this;
                        if (eh70VarS9 != null) {
                            if (TextUtils.isEmpty(string4)) {
                                oon1.H("search(): Ignoring empty query");
                            } else {
                                if (bundle6 != null) {
                                    try {
                                        iph0VarA = iph0.a(bundle6);
                                    } catch (RuntimeException e5) {
                                        oon1.I("Ignoring malformed Bundle for LibraryParams", e5);
                                    }
                                }
                                h2i0Var7.Z0(eh70VarS9, i13, null, 50005, new w1i0(new eqh0(string4, iph0VarA, (byte) 2), z ? (byte) 1 : (byte) 0));
                            }
                            break;
                        }
                        return true;
                    case 4005:
                        eh70 eh70VarS10 = xlh0.s(parcel.readStrongBinder());
                        int i14 = parcel.readInt();
                        final String string5 = parcel.readString();
                        final int i15 = parcel.readInt();
                        final int i16 = parcel.readInt();
                        Bundle bundle7 = (Bundle) tyo1.q(parcel, Bundle.CREATOR);
                        h2i0 h2i0Var8 = (h2i0) this;
                        if (eh70VarS10 != null) {
                            if (TextUtils.isEmpty(string5)) {
                                oon1.H("getSearchResult(): Ignoring empty query");
                            } else if (i15 < 0) {
                                oon1.H("getSearchResult(): Ignoring negative page");
                            } else if (i16 < 1) {
                                oon1.H("getSearchResult(): Ignoring pageSize less than 1");
                            } else {
                                if (bundle7 != null) {
                                    try {
                                        iph0VarA = iph0.a(bundle7);
                                    } catch (RuntimeException e6) {
                                        oon1.I("Ignoring malformed Bundle for LibraryParams", e6);
                                    }
                                }
                                final iph0 iph0Var2 = iph0VarA;
                                final byte b3 = 1;
                                h2i0Var8.Z0(eh70VarS10, i14, null, 50006, new w1i0(new e2i0() { // from class: p.k1i0
                                    public final Object i(fzh0 fzh0Var, ixh0 ixh0Var, int i17) {
                                        switch (b3) {
                                            case 0:
                                                return ((iqh0) fzh0Var).F(ixh0Var, string5, i15, i16, iph0Var2);
                                            default:
                                                return ((iqh0) fzh0Var).I(ixh0Var, string5, i15, i16, iph0Var2);
                                        }
                                    }
                                }, z ? (byte) 1 : (byte) 0));
                            }
                            break;
                        }
                        return true;
                    case 4006:
                        eh70 eh70VarS11 = xlh0.s(parcel.readStrongBinder());
                        int i17 = parcel.readInt();
                        String string6 = parcel.readString();
                        Bundle bundle8 = (Bundle) tyo1.q(parcel, Bundle.CREATOR);
                        h2i0 h2i0Var9 = (h2i0) this;
                        if (eh70VarS11 != null) {
                            if (TextUtils.isEmpty(string6)) {
                                oon1.H("subscribe(): Ignoring empty parentId");
                            } else {
                                if (bundle8 != null) {
                                    try {
                                        iph0VarA = iph0.a(bundle8);
                                    } catch (RuntimeException e7) {
                                        oon1.I("Ignoring malformed Bundle for LibraryParams", e7);
                                    }
                                }
                                h2i0Var9.Z0(eh70VarS11, i17, null, 50001, new w1i0(new eqh0(string6, iph0VarA, b), z ? (byte) 1 : (byte) 0));
                            }
                            break;
                        }
                        return true;
                    case 4007:
                        eh70 eh70VarS12 = xlh0.s(parcel.readStrongBinder());
                        int i18 = parcel.readInt();
                        String string7 = parcel.readString();
                        h2i0 h2i0Var10 = (h2i0) this;
                        if (eh70VarS12 != null) {
                            if (TextUtils.isEmpty(string7)) {
                                oon1.H("unsubscribe(): Ignoring empty parentId");
                                return true;
                            }
                            h2i0Var10.Z0(eh70VarS12, i18, null, 50002, new w1i0(new hfr(string7, (byte) 14), z ? (byte) 1 : (byte) 0));
                            return true;
                        }
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
