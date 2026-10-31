package com.google.android.gms.internal.meet_coactivities;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import p.bhn0;
import p.cy30;
import p.eg;
import p.ywx0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzuo extends zzrd implements RandomAccess {
    private static final zzuo zza = new zzuo(new Object[0], 0, false);
    private Object[] zzb;
    private int zzc;

    public zzuo() {
        this(new Object[10], 0, true);
    }

    public static zzuo zze() {
        return zza;
    }

    private final String zzf(int i) {
        return cy30.i(i, "Index:", this.zzc, ", Size:");
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.zzc) {
            eg.g(zzf(i));
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrd, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            eg.g(zzf(i));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.zzb;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[ywx0.j(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.zzb, i, objArr2, i3, this.zzc - i);
            this.zzb = objArr2;
        }
        this.zzb[i] = obj;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzg(i);
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrd, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        zzg(i);
        Object[] objArr = this.zzb;
        Object obj = objArr[i];
        int i2 = this.zzc;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrd, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zza();
        zzg(i);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zztg
    public final /* bridge */ /* synthetic */ zztg zzd(int i) {
        if (i >= this.zzc) {
            return new zzuo(Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        bhn0.q();
        return null;
    }

    private zzuo(Object[] objArr, int i, boolean z) {
        super(z);
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrd, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i = this.zzc;
        Object[] objArrCopyOf = this.zzb;
        if (i == objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, ((i * 3) / 2) + 1);
            this.zzb = objArrCopyOf;
        }
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        objArrCopyOf[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
