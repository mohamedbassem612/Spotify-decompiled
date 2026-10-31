package com.google.android.gms.internal.meet_coactivities;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p.bhn0;
import p.cy30;
import p.eg;
import p.ywx0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzse extends zzrd implements RandomAccess, zztg {
    private double[] zza;
    private int zzb;

    static {
        new zzse(new double[0], 0, false);
    }

    public zzse() {
        this(new double[10], 0, true);
    }

    private final String zzg(int i) {
        return cy30.i(i, "Index:", this.zzb, ", Size:");
    }

    private final void zzh(int i) {
        if (i < 0 || i >= this.zzb) {
            eg.g(zzg(i));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrd, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i < 0 || i > (i2 = this.zzb)) {
            eg.g(zzg(i));
            return;
        }
        int i3 = i + 1;
        double[] dArr = this.zza;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[ywx0.j(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.zza, i, dArr2, i3, this.zzb - i);
            this.zza = dArr2;
        }
        this.zza[i] = dDoubleValue;
        this.zzb++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzth.zzb;
        collection.getClass();
        if (!(collection instanceof zzse)) {
            return super.addAll(collection);
        }
        zzse zzseVar = (zzse) collection;
        int i = zzseVar.zzb;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzb;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArrCopyOf = this.zza;
        if (i3 > dArrCopyOf.length) {
            dArrCopyOf = Arrays.copyOf(dArrCopyOf, i3);
            this.zza = dArrCopyOf;
        }
        System.arraycopy(zzseVar.zza, 0, dArrCopyOf, this.zzb, zzseVar.zzb);
        this.zzb = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrd, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzse)) {
            return super.equals(obj);
        }
        zzse zzseVar = (zzse) obj;
        if (this.zzb != zzseVar.zzb) {
            return false;
        }
        double[] dArr = zzseVar.zza;
        for (int i = 0; i < this.zzb; i++) {
            if (Double.doubleToLongBits(this.zza[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzh(i);
        return Double.valueOf(this.zza[i]);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrd, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zza[i2]);
            byte[] bArr = zzth.zzb;
            i = (i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.zzb;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zza[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrd, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzh(i);
        double[] dArr = this.zza;
        double d = dArr[i];
        int i2 = this.zzb;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            eg.g("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.zza;
        System.arraycopy(dArr, i2, dArr, i, this.zzb - i2);
        this.zzb -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrd, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        zzh(i);
        double[] dArr = this.zza;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zztg
    public final /* bridge */ /* synthetic */ zztg zzd(int i) {
        if (i >= this.zzb) {
            return new zzse(Arrays.copyOf(this.zza, i), this.zzb, true);
        }
        bhn0.q();
        return null;
    }

    public final double zze(int i) {
        zzh(i);
        return this.zza[i];
    }

    public final void zzf(double d) {
        zza();
        int i = this.zzb;
        double[] dArr = this.zza;
        if (i == dArr.length) {
            double[] dArr2 = new double[ywx0.j(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.zza = dArr2;
            dArr = dArr2;
        }
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        dArr[i2] = d;
    }

    private zzse(double[] dArr, int i, boolean z) {
        super(z);
        this.zza = dArr;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrd, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Double) obj).doubleValue());
        return true;
    }
}
