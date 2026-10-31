package p;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ro00 implements su30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ ro00(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:38:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x010b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0114  */
    /* JADX WARN: Code duplicated, block: B:45:0x0119  */
    /* JADX WARN: Code duplicated, block: B:48:0x0126  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    public final Object apply(Object obj) {
        ev0 ev0Var;
        bv0[] bv0VarArr;
        int i;
        yoh0[] yoh0VarArr;
        yoh0[] yoh0VarArr2;
        long[] jArr;
        String[] strArr;
        cv0[] cv0VarArr;
        int i2;
        cv0[] cv0VarArr2;
        Bundle bundle;
        cv0 cv0Var;
        byte b = this.a;
        int i3 = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(i3);
            case 1:
                Bundle bundle2 = (Bundle) obj;
                Bundle bundle3 = bundle2.getBundle(oqe1.s);
                yoh0 yoh0VarB = bundle3 != null ? yoh0.b(i3, bundle3) : yoh0.g;
                long j = bundle2.getLong(oqe1.t, -9223372036854775807L);
                long j2 = bundle2.getLong(oqe1.u, -9223372036854775807L);
                long j3 = bundle2.getLong(oqe1.v, -9223372036854775807L);
                boolean z = bundle2.getBoolean(oqe1.w, false);
                boolean z2 = bundle2.getBoolean(oqe1.x, false);
                Bundle bundle4 = bundle2.getBundle(oqe1.y);
                roh0 roh0VarB = bundle4 != null ? roh0.b(bundle4) : null;
                boolean z3 = bundle2.getBoolean(oqe1.z, false);
                long j4 = bundle2.getLong(oqe1.A, 0L);
                long j5 = bundle2.getLong(oqe1.B, -9223372036854775807L);
                int i4 = bundle2.getInt(oqe1.C, 0);
                int i5 = bundle2.getInt(oqe1.D, 0);
                long j6 = bundle2.getLong(oqe1.E, 0L);
                Object string = bundle2.getString(oqe1.F);
                if (string == null) {
                    string = oqe1.q;
                }
                oqe1 oqe1Var = new oqe1();
                oqe1Var.d(string, yoh0VarB, null, j, j2, j3, z, z2, roh0VarB, j4, j5, i4, i5, j6);
                oqe1Var.k = z3;
                return oqe1Var;
            default:
                Bundle bundle5 = (Bundle) obj;
                int i6 = bundle5.getInt(dqe1.h, 0);
                long j7 = bundle5.getLong(dqe1.i, -9223372036854775807L);
                long j8 = bundle5.getLong(dqe1.j, 0L);
                boolean z4 = bundle5.getBoolean(dqe1.k, false);
                Bundle bundle6 = bundle5.getBundle(dqe1.l);
                if (bundle6 != null) {
                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList(ev0.h);
                    if (parcelableArrayList == null) {
                        bv0VarArr = new bv0[0];
                    } else {
                        bv0[] bv0VarArr2 = new bv0[parcelableArrayList.size()];
                        for (int i7 = 0; i7 < parcelableArrayList.size(); i7++) {
                            Bundle bundle7 = (Bundle) parcelableArrayList.get(i7);
                            long j9 = bundle7.getLong(bv0.m);
                            int i8 = bundle7.getInt(bv0.n);
                            int i9 = bundle7.getInt(bv0.t);
                            ArrayList parcelableArrayList2 = bundle7.getParcelableArrayList(bv0.o);
                            ArrayList parcelableArrayList3 = bundle7.getParcelableArrayList(bv0.u);
                            int[] intArray = bundle7.getIntArray(bv0.f19p);
                            long[] longArray = bundle7.getLongArray(bv0.q);
                            long j10 = bundle7.getLong(bv0.r);
                            boolean z5 = bundle7.getBoolean(bv0.s);
                            ArrayList<String> stringArrayList = bundle7.getStringArrayList(bv0.v);
                            ArrayList parcelableArrayList4 = bundle7.getParcelableArrayList(bv0.x);
                            boolean z6 = bundle7.getBoolean(bv0.w);
                            int[] iArr = intArray == null ? new int[0] : intArray;
                            if (parcelableArrayList3 != null) {
                                yoh0VarArr2 = new yoh0[parcelableArrayList3.size()];
                                for (int i10 = 0; i10 < parcelableArrayList3.size(); i10++) {
                                    Bundle bundle8 = (Bundle) parcelableArrayList3.get(i10);
                                    yoh0VarArr2[i10] = bundle8 == null ? null : yoh0.b(i3, bundle8);
                                }
                            } else {
                                if (parcelableArrayList2 != null) {
                                    yoh0VarArr2 = new yoh0[parcelableArrayList2.size()];
                                    for (int i11 = 0; i11 < parcelableArrayList2.size(); i11++) {
                                        Uri uri = (Uri) parcelableArrayList2.get(i11);
                                        yoh0VarArr2[i11] = uri == null ? null : yoh0.c(uri);
                                    }
                                } else {
                                    i = 0;
                                    yoh0VarArr = new yoh0[0];
                                }
                                if (longArray == null) {
                                    jArr = new long[i];
                                } else {
                                    jArr = longArray;
                                }
                                strArr = new String[i];
                                if (stringArrayList != null) {
                                    strArr = (String[]) stringArrayList.toArray(strArr);
                                }
                                String[] strArr2 = strArr;
                                if (parcelableArrayList4 == null) {
                                    cv0VarArr2 = new cv0[i];
                                } else {
                                    cv0VarArr = new cv0[parcelableArrayList4.size()];
                                    for (i2 = 0; i2 < parcelableArrayList4.size(); i2++) {
                                        bundle = (Bundle) parcelableArrayList4.get(i2);
                                        if (bundle == null) {
                                            cv0Var = null;
                                        } else {
                                            cv0Var = new cv0(bundle.getLong(cv0.d), bundle.getLong(cv0.e), bundle.getString(cv0.f));
                                        }
                                        cv0VarArr[i2] = cv0Var;
                                    }
                                    cv0VarArr2 = cv0VarArr;
                                }
                                bv0VarArr2[i7] = new bv0(j9, i8, i9, iArr, yoh0VarArr, jArr, j10, z5, strArr2, cv0VarArr2, z6);
                            }
                            yoh0VarArr = yoh0VarArr2;
                            i = 0;
                            if (longArray == null) {
                                jArr = new long[i];
                            } else {
                                jArr = longArray;
                            }
                            strArr = new String[i];
                            if (stringArrayList != null) {
                                strArr = (String[]) stringArrayList.toArray(strArr);
                            }
                            String[] strArr3 = strArr;
                            if (parcelableArrayList4 == null) {
                                cv0VarArr2 = new cv0[i];
                            } else {
                                cv0VarArr = new cv0[parcelableArrayList4.size()];
                                while (i2 < parcelableArrayList4.size()) {
                                    bundle = (Bundle) parcelableArrayList4.get(i2);
                                    if (bundle == null) {
                                        cv0Var = null;
                                    } else {
                                        cv0Var = new cv0(bundle.getLong(cv0.d), bundle.getLong(cv0.e), bundle.getString(cv0.f));
                                    }
                                    cv0VarArr[i2] = cv0Var;
                                }
                                cv0VarArr2 = cv0VarArr;
                            }
                            bv0VarArr2[i7] = new bv0(j9, i8, i9, iArr, yoh0VarArr, jArr, j10, z5, strArr3, cv0VarArr2, z6);
                        }
                        bv0VarArr = bv0VarArr2;
                    }
                    ev0Var = new ev0(bv0VarArr, bundle6.getLong(ev0.i, 0L), bundle6.getLong(ev0.j, -9223372036854775807L), bundle6.getInt(ev0.k, 0));
                } else {
                    ev0Var = ev0.f;
                }
                ev0 ev0Var2 = ev0Var;
                String string2 = bundle5.getString(dqe1.m);
                String string3 = bundle5.getString(dqe1.n);
                dqe1 dqe1Var = new dqe1();
                dqe1Var.i(string2, string3, i6, j7, j8, ev0Var2, z4);
                return dqe1Var;
        }
    }
}
