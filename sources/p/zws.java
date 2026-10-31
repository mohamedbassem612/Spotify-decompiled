package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.comscore.streaming.ContentMediaFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zws extends k0g1 {
    public static final zws F0 = new zws(new yws());
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final String L0;
    public static final String M0;
    public static final String N0;
    public static final String O0;
    public static final String P0;
    public static final String Q0;
    public static final String R0;
    public static final String S0;
    public static final String T0;
    public static final String U0;
    public static final String V0;
    public static final String W0;
    public static final String X0;
    public static final String Y0;
    public final boolean A0;
    public final boolean B0;
    public final boolean C0;
    public final SparseArray D0;
    public final SparseBooleanArray E0;
    public final boolean w0;
    public final boolean x0;
    public final boolean y0;
    public final boolean z0;

    static {
        String str = zoi1.a;
        G0 = Integer.toString(1000, 36);
        H0 = Integer.toString(ContentMediaFormat.FULL_CONTENT_GENERIC, 36);
        I0 = Integer.toString(ContentMediaFormat.FULL_CONTENT_EPISODE, 36);
        J0 = Integer.toString(ContentMediaFormat.FULL_CONTENT_MOVIE, 36);
        K0 = Integer.toString(ContentMediaFormat.PARTIAL_CONTENT_GENERIC, 36);
        L0 = Integer.toString(ContentMediaFormat.PARTIAL_CONTENT_EPISODE, 36);
        M0 = Integer.toString(ContentMediaFormat.PARTIAL_CONTENT_MOVIE, 36);
        N0 = Integer.toString(ContentMediaFormat.PREVIEW_GENERIC, 36);
        O0 = Integer.toString(ContentMediaFormat.PREVIEW_EPISODE, 36);
        P0 = Integer.toString(ContentMediaFormat.PREVIEW_MOVIE, 36);
        Q0 = Integer.toString(ContentMediaFormat.EXTRA_GENERIC, 36);
        R0 = Integer.toString(1011, 36);
        S0 = Integer.toString(ContentMediaFormat.EXTRA_EPISODE, 36);
        T0 = Integer.toString(ContentMediaFormat.EXTRA_MOVIE, 36);
        U0 = Integer.toString(ContentMediaFormat.FULL_CONTENT_PODCAST, 36);
        V0 = Integer.toString(ContentMediaFormat.PARTIAL_CONTENT_PODCAST, 36);
        W0 = Integer.toString(1016, 36);
        X0 = Integer.toString(1017, 36);
        Y0 = Integer.toString(1018, 36);
    }

    public zws(yws ywsVar) {
        super(ywsVar);
        this.w0 = ywsVar.J;
        this.x0 = ywsVar.K;
        this.y0 = ywsVar.L;
        this.z0 = ywsVar.M;
        this.A0 = ywsVar.N;
        this.B0 = ywsVar.O;
        this.C0 = ywsVar.P;
        this.D0 = ywsVar.Q;
        this.E0 = ywsVar.R;
    }

    @Override // p.k0g1
    public final j0g1 a() {
        return new yws(this);
    }

    @Override // p.k0g1
    public final Bundle c() {
        Bundle bundleC = super.c();
        bundleC.putBoolean(G0, this.w0);
        bundleC.putBoolean(H0, false);
        bundleC.putBoolean(I0, this.x0);
        bundleC.putBoolean(U0, false);
        bundleC.putBoolean(J0, this.y0);
        bundleC.putBoolean(K0, false);
        bundleC.putBoolean(L0, false);
        bundleC.putBoolean(M0, false);
        bundleC.putBoolean(V0, false);
        bundleC.putBoolean(Y0, this.z0);
        bundleC.putBoolean(W0, this.A0);
        bundleC.putBoolean(N0, this.B0);
        bundleC.putBoolean(O0, false);
        bundleC.putBoolean(P0, this.C0);
        bundleC.putBoolean(X0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = this.D0;
            if (i >= sparseArray2.size()) {
                SparseBooleanArray sparseBooleanArray = this.E0;
                int[] iArr = new int[sparseBooleanArray.size()];
                for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                    iArr[i2] = sparseBooleanArray.keyAt(i2);
                }
                bundleC.putIntArray(T0, iArr);
                return bundleC;
            }
            int iKeyAt = sparseArray2.keyAt(i);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i)).entrySet()) {
                if (entry.getValue() != null) {
                    bhn0.d();
                    return null;
                }
                arrayList2.add((qnf1) entry.getKey());
                arrayList.add(Integer.valueOf(iKeyAt));
            }
            bundleC.putIntArray(Q0, bmq0.b0(arrayList));
            bundleC.putParcelableArrayList(R0, lcc.E(arrayList2, new cwa((byte) 4)));
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
            if (sparseArray.size() > 0) {
                sparseArray.keyAt(0);
                pze0.m(sparseArray.valueAt(0));
                throw null;
            }
            bundleC.putSparseParcelableArray(S0, sparseArray3);
            i++;
        }
    }

    @Override // p.k0g1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zws.class == obj.getClass()) {
            zws zwsVar = (zws) obj;
            if (super.equals(zwsVar) && this.w0 == zwsVar.w0 && this.x0 == zwsVar.x0 && this.y0 == zwsVar.y0 && this.z0 == zwsVar.z0 && this.A0 == zwsVar.A0 && this.B0 == zwsVar.B0 && this.C0 == zwsVar.C0) {
                SparseBooleanArray sparseBooleanArray = zwsVar.E0;
                SparseBooleanArray sparseBooleanArray2 = this.E0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = zwsVar.D0;
                    SparseArray sparseArray2 = this.D0;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i2);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        qnf1 qnf1Var = (qnf1) entry.getKey();
                                        if (!map2.containsKey(qnf1Var) || !Objects.equals(entry.getValue(), map2.get(qnf1Var))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p.k0g1
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.w0 ? 1 : 0)) * 961) + (this.x0 ? 1 : 0)) * 961) + (this.y0 ? 1 : 0)) * 28629151) + (this.z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 961) + (this.C0 ? 1 : 0)) * 31;
    }
}
