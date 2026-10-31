package com.google.android.gms.internal.meet_coactivities;

import j$.time.Duration;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import p.bid0;
import p.fc11;
import p.gug;
import p.ia;
import p.ifp1;
import p.l5u;
import p.n8d0;
import p.nwg1;
import p.qvg;
import p.su30;
import p.svg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzhs {
    private static final zzkz zza = zzkz.zzj("com/google/android/meet/addons/internal/CoXClientFactory");
    private final zzin zzb;
    private final zzcf zzc;
    private final String zzd;
    private final zzgg zze;
    private final zzpr zzf;
    private final zzip zzg;
    private final long zzh;

    public zzhs(zzcf zzcfVar, String str, zzgg zzggVar, zzpr zzprVar, zzin zzinVar, zzip zzipVar, long j) {
        this.zzc = zzcfVar;
        this.zzd = str;
        this.zze = zzggVar;
        this.zzf = zzprVar;
        this.zzb = zzinVar;
        this.zzg = zzipVar;
        this.zzh = j;
    }

    public static /* synthetic */ void zzf(zzib zzibVar, zzkm zzkmVar, Object obj) {
        try {
            zzibVar.zzb(zzkmVar.zza(obj));
        } catch (AssertionError e) {
            zza.zzd().zzg(e).zzh("com/google/android/meet/addons/internal/CoXClientFactory", "lambda$createAndActivateCoActivity$5", 175, "CoXClientFactory.java").zzo("Invalid update proto.");
        } catch (RuntimeException e2) {
            zza.zzd().zzg(e2).zzh("com/google/android/meet/addons/internal/CoXClientFactory", "lambda$createAndActivateCoActivity$5", 177, "CoXClientFactory.java").zzo("Unexpected error while applying an update.");
        }
    }

    private final zzhe zzh(Function function, zzjr zzjrVar, final zzib zzibVar, final zzkm zzkmVar, zzhr zzhrVar, final Supplier supplier) {
        Consumer consumer = new Consumer() { // from class: com.google.android.gms.internal.meet_coactivities.zzhk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                zzhs.zzf(zzibVar, zzkmVar, obj);
            }
        };
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.meet_coactivities.zzhl
            @Override // java.lang.Runnable
            public final void run() {
                fc11.h((n8d0) supplier.get(), new zzhq(this.zza), l5u.a);
            }
        };
        zzfw zzfwVar = new zzfw();
        zzfwVar.zzd(this.zzc);
        zzfwVar.zze(zzjrVar);
        zzfwVar.zzc(zzid.zza(this.zze, runnable, this.zzb.zzf()));
        final zzcf zzcfVar = this.zzc;
        Objects.requireNonNull(zzcfVar);
        zzfwVar.zzf(zzhrVar.zza(zzjrVar, consumer, new Consumer() { // from class: com.google.android.gms.internal.meet_coactivities.zzhm
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                zzcfVar.zzg((zzpy) obj);
            }
        }));
        zzfwVar.zza(this.zze);
        zzfwVar.zzb(zzibVar);
        return (zzhe) function.apply(zzfwVar.zzg());
    }

    public final zzif zzb(final qvg qvgVar) {
        zzhr zzhrVar = new zzhr() { // from class: com.google.android.gms.internal.meet_coactivities.zzhg
            @Override // com.google.android.gms.internal.meet_coactivities.zzhr
            public final zzjv zza(zzjr zzjrVar, Consumer consumer, Consumer consumer2) {
                return this.zza.zzd((zzjq) zzjrVar, consumer, consumer2);
            }
        };
        final zzjq zzjqVarZza = zzjq.zza(this.zzd, this.zzh, this.zzf, this.zze);
        return (zzif) zzh(new Function() { // from class: com.google.android.gms.internal.meet_coactivities.zzhj
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new zzhb((zzhw) obj);
            }
        }, zzjqVarZza, zzhd.zza(qvgVar, this.zzb.zzb()), zzki.zzc(), zzhrVar, new Supplier(qvgVar, zzjqVarZza) { // from class: com.google.android.gms.internal.meet_coactivities.zzhi
            public final /* synthetic */ qvg zzb;
            public final /* synthetic */ zzjq zzc;

            {
                this.zzc = zzjqVarZza;
            }

            @Override // java.util.function.Supplier
            public final Object get() {
                return this.zza.zze(null, this.zzc);
            }
        });
    }

    public final /* synthetic */ zzjv zzc(zzjo zzjoVar, Consumer consumer, Consumer consumer2) {
        return new zzjk(zzjoVar, consumer, this.zze, this.zzg);
    }

    public final /* synthetic */ zzjv zzd(zzjq zzjqVar, Consumer consumer, Consumer consumer2) {
        return new zzjm(zzjqVar, consumer, this.zze, this.zzg);
    }

    public final n8d0 zze(final qvg qvgVar, final zzjq zzjqVar) {
        Objects.requireNonNull(qvgVar);
        Callable callable = new Callable(qvgVar) { // from class: com.google.android.gms.internal.meet_coactivities.zzho
            public final /* synthetic */ qvg zza;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                throw null;
            }
        };
        bid0 bid0VarZzb = this.zzb.zzb();
        nwg1 nwg1Var = new nwg1(callable);
        bid0VarZzb.execute(nwg1Var);
        return ia.y(nwg1Var, new su30() { // from class: com.google.android.gms.internal.meet_coactivities.zzhp
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                return zzjqVar.zzc(optional.isPresent() ? ((ifp1) ((svg) optional.get())).b : Duration.ZERO);
            }
        }, l5u.a);
    }

    public final zzgm zzg(gug gugVar) {
        zzhr zzhrVar = new zzhr() { // from class: com.google.android.gms.internal.meet_coactivities.zzhn
            @Override // com.google.android.gms.internal.meet_coactivities.zzhr
            public final zzjv zza(zzjr zzjrVar, Consumer consumer, Consumer consumer2) {
                return this.zza.zzc((zzjo) zzjrVar, consumer, consumer2);
            }
        };
        final zzjo zzjoVar = new zzjo(this.zzd, this.zzh);
        return (zzgm) zzh(new Function() { // from class: com.google.android.gms.internal.meet_coactivities.zzhh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new zzgm((zzhw) obj);
            }
        }, zzjoVar, zzgo.zza(gugVar, this.zzb.zza()), zzjz.zzb(), zzhrVar, new Supplier() { // from class: com.google.android.gms.internal.meet_coactivities.zzhf
            @Override // java.util.function.Supplier
            public final Object get() {
                return fc11.J(zzjoVar.zzb());
            }
        });
    }
}
