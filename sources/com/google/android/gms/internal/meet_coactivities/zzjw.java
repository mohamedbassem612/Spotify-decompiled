package com.google.android.gms.internal.meet_coactivities;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import p.hhg1;
import p.ikj1;
import p.n02;
import p.o02;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzjw implements zzkm {
    public static final o02 zzb(zzl zzlVar) {
        n02 n02Var;
        ikj1 ikj1Var = new ikj1();
        ikj1Var.d(zzlVar.zzf());
        ikj1Var.f(zzlVar.zzg());
        switch (zzlVar.zzd().ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                n02Var = n02.a;
                break;
            case 2:
                n02Var = n02.b;
                break;
            case 3:
            case 4:
                n02Var = n02.c;
                break;
            default:
                hhg1.c();
                return null;
        }
        ikj1Var.c = n02Var;
        ikj1Var.g(zzkn.zzb(zzlVar.zze()));
        return ikj1Var.a();
    }

    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        throw null;
    }
}
