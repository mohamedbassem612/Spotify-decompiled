package com.google.android.gms.internal.meet_coactivities;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import p.cy30;
import p.dm5;
import p.eg;
import p.f4i1;
import p.hhg1;
import p.v0d1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzakv extends zzzl {
    private static final Method zzr;
    zzalf zzd;
    final zzalf zze;
    zzaar zzf;
    final List zzg;
    final String zzh;
    final String zzi;
    final zzxm zzj;
    final zzwx zzk;
    long zzl;
    final zzya zzm;
    private final List zzs;
    private final zzacd zzt;
    private static final Logger zzn = Logger.getLogger(zzakv.class.getName());
    static final long zza = 1800000;
    static final long zzb = 1000;
    private static final zzalf zzo = zzaor.zzc(zzahx.zzi);
    private static final zzxm zzp = zzxm.zza();
    private static final zzwx zzq = zzwx.zza();
    static final Pattern zzc = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    static {
        Method declaredMethod = null;
        try {
            Class cls = Boolean.TYPE;
            declaredMethod = zzads.class.getDeclaredMethod("getClientInterceptor", cls, cls, cls, cls);
        } catch (ClassNotFoundException e) {
            zzn.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e);
        } catch (NoSuchMethodException e2) {
            zzn.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e2);
        }
        zzr = declaredMethod;
    }

    public zzakv(SocketAddress socketAddress, String str, zzwg zzwgVar, zzwa zzwaVar, zzacd zzacdVar, zzakq zzakqVar) {
        zzalf zzalfVar = zzo;
        this.zzd = zzalfVar;
        this.zze = zzalfVar;
        this.zzs = new ArrayList();
        this.zzf = zzaar.zzb();
        this.zzg = new ArrayList();
        this.zzi = "pick_first";
        this.zzj = zzp;
        this.zzk = zzq;
        this.zzl = zza;
        this.zzm = zzya.zza();
        new ArrayList();
        this.zzh = zzf(socketAddress);
        dm5.s(zzacdVar, "clientTransportFactoryBuilder");
        this.zzt = zzacdVar;
        zzaar zzaarVar = new zzaar();
        zzaarVar.zze(new zzaks(socketAddress, str));
        this.zzf = zzaarVar;
        zzyg.zza(this);
    }

    public static zzaku zzb(String str, zzaar zzaarVar, Collection collection) {
        URI uri;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        zzaao zzaaoVarZza = uri != null ? zzaarVar.zza(uri.getScheme()) : null;
        if (zzaaoVarZza == null && !zzc.matcher(str).matches()) {
            try {
                uri = new URI(zzaarVar.zzc(), "", "/" + str, null);
                zzaaoVarZza = zzaarVar.zza(uri.getScheme());
            } catch (URISyntaxException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        if (zzaaoVarZza == null) {
            throw new IllegalArgumentException(f4i1.f("Could not find a NameResolverProvider for ", str, sb.length() > 0 ? f4i1.f(" (", sb.toString(), ")") : ""));
        }
        if (collection == null || collection.containsAll(zzaaoVarZza.zzd())) {
            return new zzaku(uri, zzaaoVarZza);
        }
        hhg1.n(cy30.p("Address types of NameResolver '", uri.getScheme(), "' for '", str, "' not supported by transport"));
        return null;
    }

    public static String zzf(SocketAddress socketAddress) {
        try {
            return new URI("directaddress", "", "/" + socketAddress.toString(), null).toString();
        } catch (URISyntaxException e) {
            eg.j(e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzl
    public final zzzj zza() {
        zzwk zzwkVar;
        String str = this.zzh;
        zzaez zzaezVarZzf = this.zzt.zzf();
        zzaku zzakuVarZzb = zzb(str, this.zzf, Collections.singleton(zzabo.class));
        URI uri = zzakuVarZzb.zza;
        zzaao zzaaoVar = zzakuVarZzb.zzb;
        zzahf zzahfVar = new zzahf();
        zzaor zzaorVarZzc = zzaor.zzc(zzahx.zzi);
        URI uri2 = zzakuVarZzb.zza;
        v0d1 v0d1Var = zzahx.zzk;
        uri2.toString();
        ArrayList arrayList = new ArrayList(this.zzs);
        int i = 0;
        while (true) {
            zzwk zzwkVar2 = null;
            if (i >= arrayList.size()) {
                zzyg.zzb();
                Method method = zzr;
                if (method != null) {
                    try {
                        Boolean bool = Boolean.TRUE;
                        zzwkVar = (zzwk) method.invoke(null, bool, bool, Boolean.FALSE, bool);
                    } catch (IllegalAccessException e) {
                        zzn.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e);
                        zzwkVar = null;
                    } catch (InvocationTargetException e2) {
                        zzn.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e2);
                        zzwkVar = null;
                    }
                } else {
                    zzwkVar = null;
                }
                if (zzwkVar != null) {
                    arrayList.add(0, zzwkVar);
                }
                try {
                    zzwkVar2 = (zzwk) zzadt.class.getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
                } catch (ClassNotFoundException e3) {
                    zzn.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e3);
                } catch (IllegalAccessException e4) {
                    zzn.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e4);
                } catch (NoSuchMethodException e5) {
                    zzn.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e5);
                } catch (InvocationTargetException e6) {
                    zzn.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e6);
                }
                if (zzwkVar2 != null) {
                    arrayList.add(0, zzwkVar2);
                }
                return new zzakx(new zzakp(this, zzaezVarZzf, uri, zzaaoVar, zzahfVar, zzaorVarZzc, v0d1Var, arrayList, zzaox.zza));
            }
            if (arrayList.get(i) instanceof zzakt) {
                zzzk zzzkVar = ((zzakt) arrayList.get(i)).zza;
                throw null;
            }
            i++;
        }
    }

    public final zzakv zzc(Executor executor) {
        if (executor != null) {
            this.zzd = new zzahj(executor);
            return this;
        }
        this.zzd = zzo;
        return this;
    }

    public final zzakv zzd(long j, TimeUnit timeUnit) {
        dm5.j(j, "idle timeout is %s, but must be positive", j > 0);
        if (timeUnit.toDays(j) >= 30) {
            this.zzl = -1L;
            return this;
        }
        this.zzl = Math.max(timeUnit.toMillis(j), zzb);
        return this;
    }

    public final zzalf zze() {
        return this.zze;
    }

    public zzakv(String str, zzwg zzwgVar, zzwa zzwaVar, zzacd zzacdVar, zzakq zzakqVar) {
        zzalf zzalfVar = zzo;
        this.zzd = zzalfVar;
        this.zze = zzalfVar;
        this.zzs = new ArrayList();
        this.zzf = zzaar.zzb();
        this.zzg = new ArrayList();
        this.zzi = "pick_first";
        this.zzj = zzp;
        this.zzk = zzq;
        this.zzl = zza;
        this.zzm = zzya.zza();
        new ArrayList();
        dm5.s((Object) null, "target");
        this.zzh = null;
        dm5.s(zzacdVar, "clientTransportFactoryBuilder");
        this.zzt = zzacdVar;
        zzyg.zza(this);
    }
}
