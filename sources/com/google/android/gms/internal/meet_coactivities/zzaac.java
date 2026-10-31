package com.google.android.gms.internal.meet_coactivities;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p.cwl1;
import p.dm5;
import p.l1d;
import p.rl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzaac {
    private final zzaaa zza;
    private final String zzb;
    private final String zzc;
    private final zzzz zzd;
    private final zzzz zze;
    private final boolean zzf;

    public zzaac(zzaaa zzaaaVar, String str, zzzz zzzzVar, zzzz zzzzVar2, Object obj, boolean z, boolean z2, boolean z3, zzaab zzaabVar) {
        new AtomicReferenceArray(2);
        dm5.s(zzaaaVar, "type");
        this.zza = zzaaaVar;
        dm5.s(str, "fullMethodName");
        this.zzb = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.zzc = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        dm5.s(zzzzVar, "requestMarshaller");
        this.zzd = zzzzVar;
        dm5.s(zzzzVar2, "responseMarshaller");
        this.zze = zzzzVar2;
        this.zzf = z3;
    }

    public static zzzy zza(zzzz zzzzVar, zzzz zzzzVar2) {
        zzzy zzzyVar = new zzzy(null);
        zzzyVar.zzb(null);
        zzzyVar.zzc(null);
        return zzzyVar;
    }

    public static String zze(String str, String str2) {
        dm5.s(str, "fullServiceName");
        dm5.s(str2, "methodName");
        return l1d.n("/", str2, new StringBuilder(str));
    }

    public final String toString() {
        rl1 rl1VarR0 = cwl1.r0(this);
        rl1VarR0.m(this.zzb, "fullMethodName");
        rl1VarR0.m(this.zza, "type");
        rl1VarR0.l("idempotent", false);
        rl1VarR0.l("safe", false);
        rl1VarR0.l("sampledToLocalTracing", this.zzf);
        rl1VarR0.m(this.zzd, "requestMarshaller");
        rl1VarR0.m(this.zze, "responseMarshaller");
        rl1VarR0.m((Object) null, "schemaDescriptor");
        rl1VarR0.b = true;
        return rl1VarR0.toString();
    }

    public final zzaaa zzb() {
        return this.zza;
    }

    public final InputStream zzc(Object obj) {
        return this.zzd.zza(obj);
    }

    public final Object zzd(InputStream inputStream) {
        return this.zze.zzb(inputStream);
    }

    public final String zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zzc;
    }
}
